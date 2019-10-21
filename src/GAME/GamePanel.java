package GAME;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	private int width=20;
	private int height=20;
	public PubData data = new PubData();
	private int rows = data.rows;
	private int cols = data.cols;
	private Logic logic = new Logic();
	private Map m = new Map();
	private int mark=0;
	private int paintMark=0;
	public GamePanel() {
		 this.setBackground(Color.LIGHT_GRAY);
         this.setBounds(20, 20, 700, 700);
         this.setLayout(null);
         this.mark=1;
	}
	  public void paintComponent(Graphics g) {  
	        super.paintComponent(g);
	        for (int i = 0; i < rows; i++) {  
	            for (int j = 0; j < cols; j++) {  
	                if (m.get(i, j) == 1) {  
	                	g.setColor(Color.blue);
	                    g.fillRect( j * width, i * height, width, height);  
	                    
	                   
	                } else {  
	                	g.setColor(Color.black);
	                	g.drawRect( j * width, i * height, width, height); 
	                	
	                }  
	            }  
	        }  
	        this.paintMark=1;
	        
	    }  
	  public void initRandom() {
		  m.initMapRandom();
		  this.mark=3;
	  }
	  public void initSquare() {
		  m.initMapSquare();
		  this.mark=4;
	  }
	  public void initTriangle() {
		  m.initMapTriangle();
		  this.mark=5;
	  }

	public void cycle() {
    	repaint();  
    	logic.gameCycle(m);
    	this.mark=6;
	}
	
	public int getMark() {
		return mark;
	}
}