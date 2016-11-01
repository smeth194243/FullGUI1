package graph.view;

import javax.swing.JFrame;
import graph.controller.GraphController;

public class FirstFrame extends JFrame
{
	private GraphController baseController;
	
	public FirstFrame(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		
	}
}
