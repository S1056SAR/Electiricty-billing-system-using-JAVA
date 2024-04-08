package miniproject;
import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame{
    Signup(){
        super("Sign up/ಸೈನ್ ಅಪ್");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        JLabel lbldisp=new JLabel("Create Account");
        lbldisp.setBounds(400,50,200,20);
        lbldisp.setForeground(Color.DARK_GRAY);
        lbldisp.setFont(new Font("Tahoma",Font.BOLD,17));
        add(lbldisp);
        setSize(640,400);
        setLocation(400,200);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Signup();
    }
}