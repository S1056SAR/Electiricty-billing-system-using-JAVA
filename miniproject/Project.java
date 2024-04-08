package miniproject;
import javax.swing.*;
import java.awt.*;

public class Project extends JFrame {
    Project() {
        super("Logged In");
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("grid.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);

        JMenu master = new JMenu("MASTER");
        master.setForeground(Color.RED);
        mb.add(master);

        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setBackground(Color.WHITE);
        master.add(newcustomer);

        JMenuItem customerdetails = new JMenuItem("View Customer");
        customerdetails.setBackground(Color.WHITE);
        master.add(customerdetails);



        JMenu Bill = new JMenu("BILL");
        Bill.setForeground(Color.BLUE);
        mb.add(Bill);

        JMenuItem calculatebill = new JMenuItem("Bill Calculation");
        calculatebill.setBackground(Color.WHITE);
        Bill.add(calculatebill);

        JMenuItem generatebill = new JMenuItem("Bill Generation");
        calculatebill.setBackground(Color.WHITE);
        Bill.add(generatebill);

        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Project();
    }
}
