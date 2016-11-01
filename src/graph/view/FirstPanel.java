package graph.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SpringLayout;
import graph.controller.GraphController;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

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
		this.colorButton= new JButton ("colors!");
		colorButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 0, SpringLayout.WEST, this);
		colorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		this.randomButton = new JButton("random colors!!");
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 89, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 158, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, -119, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, -98, SpringLayout.EAST, this);
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
		
	}
	
	private void setupListeners()
	{
		
	}
}
