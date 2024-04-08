package miniproject;

import javax.swing.*;

public class Splash extends JFrame implements Runnable{

    Splash(){
        super();
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("k__map.jpg"));
        JLabel image=new JLabel(i1);
        add(image);
        setLocation(600,160);
        setSize(357,529);
        Thread t=new Thread(this);
        t.start();
        setVisible(true);

    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}