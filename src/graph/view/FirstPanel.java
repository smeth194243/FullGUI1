package graph.view;

import javax.swing.*;
import java.awt.Color;
import graph.controller.GraphController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel
{
	private GraphController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;

	public FirstPanel(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.colorButton = new JButton("colors!");

		colorButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		this.randomButton = new JButton("random colors!!");

		randomButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(colorButton);
		this.add(randomButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, -166, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, -21, SpringLayout.NORTH, randomButton);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 150, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, -108, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, -106, SpringLayout.EAST, this);
	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.MAGENTA);
			}
		});
		
		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackgroundColor();
			}
		});
	}

	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}

}
