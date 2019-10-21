package GAME;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
import javax.swing.JPanel;  
import javax.swing.Timer;  
  

@SuppressWarnings("serial")
public class Time extends JPanel  {
	 private Timer timer;  
	 private final int DELAY_TIME = 500; 

	public Time(GamePanel g) {
		timer = new Timer(DELAY_TIME, new ActionListener() {  
			  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                g.cycle(); 
            }  
	    });
		timer.start();
	}
	
		
}


