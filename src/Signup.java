package Bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup  extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textname ,textFname,textEmail,textAdd,textcity,textpin,textState;
    JDateChooser dateChooser;
    Random random=new Random();
    long first4=(random.nextLong() % 9000L) + 1000L;
    String first= " " + Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        JLabel label1=new JLabel("APPLICATION FORM NO" + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1" );
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(290,100,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);
        JLabel labelName=new JLabel("Name");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,160,100,100);
        add(labelName);

        textname=new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        JLabel labelFname=new JLabel("Father's Name");
        labelFname.setFont(new Font("Raleway",Font.BOLD,20));
        labelFname.setBounds(100,240,200,30);
        add(labelFname);

        textFname=new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB=new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,335,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,335,400,30);
        add(dateChooser);
        JLabel labelG=new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail=new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs=new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1=new JRadioButton("Maried");
        m1.setBounds(300,440,100,30);
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2=new JRadioButton("UnMaried");
        m2.setBounds(450,440,100,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        add(m2);

        m3=new JRadioButton("Other");
        m3.setBounds(635,440,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);





        JLabel labelAdd=new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textcity=new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin=new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin=new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelState=new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState=new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(650,690,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,780);
        setLocation(360,30);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo=first;
        String name=textname.getText();
        String Fname=textFname.getText();
        String DOB=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";

        }
        String Email=textEmail.getText();
        String MaritalStatus=null;
        if(m1.isSelected()){
            MaritalStatus="Married";
        } else if (m2.isSelected()) {
            MaritalStatus="UnMarried";

        } else if (m3.isSelected()) {
            MaritalStatus="other";

        }
        String Address=textAdd.getText();
        String City=textcity.getText();
        String PinCode=textpin.getText();
        String State=textState.getText();

        try{
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fields");
            }
            else{
                Con con1=new Con();
                String q="insert into SignUp values('"+formNo+"', '"+name+"','"+Fname+"','"+DOB+"','"+gender+"','"+Email+"','"+MaritalStatus+"','"+Address+"','"+City+"','"+PinCode+"','"+ State+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);

            }
        }
        catch (Exception E){

            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();

    }
}
