package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener {
    
    JLabel formno,personDetails,name,fname,dob,gender,email,marital,l9,l10,l11,l12,l13,l14,l15;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,pinTextField,stateTextField;
    JRadioButton male,female,married,unmarried,other;
    JButton b;
    JDateChooser dateChooser;
    
    
    Random ran = new Random();
    long firsaddressTextField = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(firsaddressTextField);
    
    SignupOne(){
        
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l11 = new JLabel(i3);
        l11.setBounds(10, 0, 75, 75);
        add(l11);
        
        formno = new JLabel("APPLICATION FORM NO. "+first);
        formno.setFont(new Font("Raleway", Font.BOLD, 22));
        
        personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 18));
        
        name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 16));
        
        fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 16));
        
        dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 16));
        
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        
        email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        
        marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway", Font.BOLD, 12));
        
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        
       
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 12));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 12));
        male.setBackground(Color.WHITE);
        
        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 12));
        female.setBackground(Color.WHITE);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(male);
        groupgender.add(female);
        
        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 12));
        married.setBackground(Color.WHITE);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway", Font.BOLD, 12));
        unmarried.setBackground(Color.WHITE);
        
        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway", Font.BOLD, 12));
        other.setBackground(Color.WHITE);
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(married);
        groupstatus.add(unmarried);
        groupstatus.add(other);
        
        dateChooser = new JDateChooser();
	//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(200, 170, 150, 22);
	add(dateChooser);
        
        setLayout(null);
        formno.setBounds(100,10,500,30);
        add(formno);
        
        personDetails.setBounds(200,50,300,25);
        add(personDetails);
        
        name.setBounds(50,100,100,25);
        add(name);
        
        nameTextField.setBounds(200,100,200,25);
        add(nameTextField);
        
        fname.setBounds(50,135,150,25);
        add(fname);
        
        fnameTextField.setBounds(200,135,200,25);
        add(fnameTextField);
        
        dob.setBounds(50,170,150,25);
        add(dob);
        
        gender.setBounds(50,225,100,25);
        add(gender);
        
        male.setBounds(150,225,60,25);
        add(male);
        
        female.setBounds(220,225,80,25);
        add(female);
        
        email.setBounds(50,260,150,25);
        add(email);
        
        emailTextField.setBounds(200,260,200,25);
        add(emailTextField);
        
        marital.setBounds(50,295,150,25);
        add(marital);
        
        married.setBounds(200,295,80,25);
        add(married);
        
        unmarried.setBounds(290,295,100,25);
        add(unmarried);
        
        other.setBounds(400,295,80,25);
        add(other);
        
        l9.setBounds(50,330,150,25);
        add(l9);
        
        addressTextField.setBounds(200,330,200,25);
        add(addressTextField);
        
        l10.setBounds(50,365,150,25);
        add(l10);
        
        cityTextField.setBounds(200,365,200,25);
        add(cityTextField);
        
        l11.setBounds(50,400,150,25);
        add(l11);
        
        pinTextField.setBounds(200,400,200,25);
        add(pinTextField);
        
        l12.setBounds(50,435,150,25);
        add(l12);
        
        stateTextField.setBounds(200,435,200,25);
        add(stateTextField);
        
        b.setBounds(350,480,80,25);
        add(b);
        
        b.addActionListener(this); 
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(550,600);
        setLocation(400,65);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        String formno = first;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }
            
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){ 
            marital = "Married";
        }else if(unmarried.isSelected()){ 
            marital = "Unmarried";
        }else if(other.isSelected()){ 
            marital = "Other";
        }
           
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String pincode = pinTextField.getText();
        String state = stateTextField.getText();
        

        try{
           
            if(pinTextField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.s.executeUpdate(q1);
                
                setVisible(false);
                new SignupTwo(first).setVisible(true);
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }
        
    }
    
    public static void main(String []args){
        new SignupOne().setVisible(true);
    }
}
