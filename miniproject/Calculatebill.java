package miniproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculatebill extends JFrame  implements ActionListener{
    JTextField tfname, tfmeter, tfaddress, tfpin, tfphone;
    JComboBox<String> tfplan;
    JButton addd,cancel;
    Choice meternumber;

    Calculatebill() {
        super("New Customer");
        setSize(800, 600);
        setLocation(400, 100);

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(146, 143, 143));
        add(p);

        JLabel heading = new JLabel("Calculate Electricity Bill");
        heading.setBounds(290, 30, 200, 25);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        p.add(heading);

        JLabel lblname = new JLabel("Meter Number");
        lblname.setBounds(200, 95, 200, 25);
        p.add(lblname);

        meternumber=new Choice();
        meternumber.setBounds(350, 95, 200, 25);
        p.add(meternumber);


        JLabel lblmeter = new JLabel("Name");
        lblmeter.setBounds(200, 145, 200, 25);
        p.add(lblmeter);

        tfmeter = new JTextField();
        tfmeter.setBounds(350, 145, 200, 25);
        p.add(tfmeter);

        JLabel lbladdress = new JLabel("Units consumed");
        lbladdress.setBounds(200, 195, 200, 25);
        p.add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(350, 195, 200, 25);
        p.add(tfaddress);

        JLabel lblcode = new JLabel("Customer Pincode");
        lblcode.setBounds(200, 245, 200, 25);
        p.add(lblcode);

        tfpin = new JTextField();
        tfpin.setBounds(350, 245, 200, 25);
        p.add(tfpin);

        JLabel lblphone = new JLabel("Customer Phone no");
        lblphone.setBounds(200, 295, 200, 25);
        p.add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(350, 295, 200, 25);
        p.add(tfphone);

        JLabel lblplan = new JLabel("Gruha Jyothi");
        lblplan.setBounds(200, 345, 200, 25);
        p.add(lblplan);

        // Add options to the dropdown
        String[] options = {"Yes", "No"};
        tfplan = new JComboBox<>(options);
        tfplan.setBounds(350, 345, 200, 25);
        p.add(tfplan);

        addd = new JButton("Add");
        addd.setBounds(300, 400, 100, 25);
        addd.addActionListener(this);
        p.add(addd);
        setLayout(new BorderLayout());
        add(p, "Center");


        cancel = new JButton("Cancel");
        cancel.setBounds(440, 400, 100, 25);
        cancel.addActionListener(this);
        p.add(cancel);
        setLayout(new BorderLayout());
        add(p, "Center");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("new.png"));
        Image i2 = i1.getImage().getScaledInstance(180, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image, "West");

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addd){
            String name=tfname.getText();
            String meter=tfmeter.getText();
            String address=tfaddress.getText();
            String pin=tfpin.getText();
            String phone=tfphone.getText();
            String plan=(String)tfplan.getSelectedItem();
            String query1 = "INSERT INTO customer VALUES ('" + name + "','" + meter + "','" + address + "','" + pin + "','" + phone + "','" + plan + "')";
            try{
                conn c=new conn();
                c.s.executeUpdate(query1);
                JOptionPane.showMessageDialog(null,"Customer Details Added successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new NewCustomer();
    }
}
