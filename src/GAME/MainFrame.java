 package GAME;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


@SuppressWarnings("unused")
public class MainFrame {
	private int buttonMark1=0;
	private int buttonMark2=0;
	private int buttonMark3=0;
    JFrame gameFrame;
    
    JPanel operatePanel;//Operate
    JPanel viewPanel;//View
    
    /*TODO:
     * GameLogic
     * 
     * */

    JButton changeButton;
    JButton reStartButton;
    JButton startButton;
    
    /***********************************
     * Launch the application.
     *************************************/
    /*
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //Create frame
                    new MainFrame();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /**************************************/

    //Main Window Initial Function
    public MainFrame() {
        //title
        gameFrame=new JFrame("Cell Life Game - Powered by Junjie Xiao & Wenwei Zheng");
        gameFrame.getContentPane().setBackground(SystemColor.menu);
        gameFrame.setResizable(false);
        Dimension screnSize=Toolkit.getDefaultToolkit().getScreenSize();
        int width=1200;
        int height=800;
        gameFrame.setBounds((screnSize.width-width)/2, (screnSize.height-height)/2, width, height);
        gameFrame.getContentPane().setLayout(null);
        gameFrame.setVisible(true);
        
        GamePanel panel = new GamePanel();
        gameFrame.getContentPane().add(panel);

        
        
        
        JButton button_1 = new JButton("Random Map");
        button_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
        button_1.setBounds(828, 272, 300, 77);
        button_1.setFocusPainted(false);
        button_1.setForeground(Color.WHITE);
        button_1.setBackground(Color.BLACK);
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	panel.initRandom();
                Time time = new Time(panel);
                int count=0;
                
            }
        });
        gameFrame.getContentPane().add(button_1);
        
        JLabel label = new JLabel("细胞生命游戏");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.DARK_GRAY);
        label.setBackground(Color.DARK_GRAY);
        label.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 50));
        label.setBounds(804, 56, 347, 77);
        gameFrame.getContentPane().add(label);
        
        JLabel lblCellLifeGame = new JLabel("Cell Life Game");
        lblCellLifeGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblCellLifeGame.setForeground(Color.DARK_GRAY);
        lblCellLifeGame.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
        lblCellLifeGame.setBackground(Color.DARK_GRAY);
        lblCellLifeGame.setBounds(828, 132, 300, 34);
        gameFrame.getContentPane().add(lblCellLifeGame);
        
        JLabel lblgui = new JLabel("肖俊杰：主要核心算法、主要逻辑结构");
        lblgui.setHorizontalAlignment(SwingConstants.CENTER);
        lblgui.setForeground(Color.DARK_GRAY);
        lblgui.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 12));
        lblgui.setBackground(Color.DARK_GRAY);
        lblgui.setBounds(822, 656, 304, 34);
        gameFrame.getContentPane().add(lblgui);
        
        JLabel label_2 = new JLabel("郑文伟：前端设计开发、部分结构逻辑");
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setForeground(Color.DARK_GRAY);
        label_2.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 12));
        label_2.setBackground(Color.DARK_GRAY);
        label_2.setBounds(822, 620, 304, 34);
        gameFrame.getContentPane().add(label_2);
        
        JLabel lblAllRights = new JLabel("©2019 All rights reserved.");
        lblAllRights.setHorizontalAlignment(SwingConstants.CENTER);
        lblAllRights.setForeground(Color.LIGHT_GRAY);
        lblAllRights.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 12));
        lblAllRights.setBackground(Color.LIGHT_GRAY);
        lblAllRights.setBounds(822, 686, 304, 34);
        gameFrame.getContentPane().add(lblAllRights);
        
        JButton button_2 = new JButton("Square");
        button_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panel.initSquare();
                Time time = new Time(panel);

        	}
        });
        button_2.setForeground(Color.WHITE);
        button_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
        button_2.setFocusPainted(false);
        button_2.setBackground(Color.BLACK);
        button_2.setBounds(828, 443, 138, 50);
        gameFrame.getContentPane().add(button_2);
        
        JButton button_3 = new JButton("Triangle");
        button_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panel.initTriangle();
                Time time = new Time(panel);
        	}
        });
        button_3.setForeground(Color.WHITE);
        button_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
        button_3.setFocusPainted(false);
        button_3.setBackground(Color.BLACK);
        button_3.setBounds(990, 443, 138, 50);
        gameFrame.getContentPane().add(button_3);
        
        JLabel lblNewLabel = new JLabel("Preset Map ");
        lblNewLabel.setBackground(new Color(240, 240, 240));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        lblNewLabel.setBounds(890, 408, 177, 22);
        gameFrame.getContentPane().add(lblNewLabel);
        
        JLabel label_1 = new JLabel("Control");
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        label_1.setBackground(SystemColor.menu);
        label_1.setBounds(884, 237, 177, 22);
        gameFrame.getContentPane().add(label_1);
    }
    
}
