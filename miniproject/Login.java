package miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton Cancel,login;
    JTextField username,passwd;
    Login(){
        super("Login Page/ಲಾಗಿನ್");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        JLabel lbldisp=new JLabel("Admin Login");
        lbldisp.setBounds(400,50,200,20);
        add(lbldisp);
        lbldisp.setForeground(Color.DARK_GRAY);
        lbldisp.setFont(new Font("Tahoma",Font.BOLD,17));
        JLabel lblusername=new JLabel("Username : ");
        lblusername.setBounds(340,90,100,20);
        add(lblusername);
        username=new JTextField();
        username.setBounds(450,90,150,20);
        add(username);
        JLabel lblpasswd=new JLabel("Password : ");
        lblpasswd.setBounds(340,130,100,20);
        add(lblpasswd);
        passwd=new JTextField();
        passwd.setBounds(450,130,150,20);
        add(passwd);
        login=new JButton("Login");
        login.setBounds(380,180,100,20);
        login.addActionListener(this);
        add(login);
        Cancel=new JButton("Cancel");
        Cancel.setBounds(380,220,100,20);
        Cancel.addActionListener(this);
        add(Cancel);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("besco.jpg"));
        Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,250,250);
        add(image);
        setSize(640,300);
        setLocation(400,200);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            String susername=username.getText();
            String spasswd=passwd.getText();
            try{
                conn c=new conn();
                String query="select * from login where username='"+susername+"' and password = '"+spasswd+"'";
                ResultSet rs=c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Project();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                }
            }catch(Exception e){
                e.printStackTrace();
            }


        }else if(ae.getSource()==Cancel){
            setVisible(false);

        }

    }
    public static void main(String[] args) {
        new Login();
    }
}
