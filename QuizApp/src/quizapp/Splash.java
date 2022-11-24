/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sathe
 */
public class Splash {
    
    public static void main(String[] args){
        SplashFrame f1 = new SplashFrame();
        f1.setVisible(true);
        f1.setResizable(false);
        int i;

          for(i=2; i<=600; i+=2){
            f1.setLocation(683 - ((i)), 384 - (i/2));
            f1.setSize(i*2,i);
            try{
                Thread.sleep(5);
            }catch(Exception e){}
        }


//        System.out.println(i+x+"quizapp.Splash.main()"+  " "+ i);
//            1023 602
//        f1.setSize(1023, 602);
    }
}

class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("images/splash.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1190, 590,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l1 = new JLabel(i2);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
//            this.setVisible(false);
//            
//            Login l = new Login();
//            l.setVisible(true);
                dispose();
                new Login().setVisible(true);
              
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
