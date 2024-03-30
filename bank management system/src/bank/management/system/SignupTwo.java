
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l12,l13;
    JButton b;
    JRadioButton syes,sno,r3,r4;
    JTextField t1,t2;
    JComboBox c1,c2,c3,c4,c5;
    String formno;
    
    SignupTwo(String formno){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        l1 = new JLabel("Page 2: Additonal Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 14));
        
//        l11 = new JLabel("Qualification:");
//        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l7 = new JLabel("PAN Number:");
        l7.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l8 = new JLabel("Aadhar Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 10));
        
        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 10));
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 12));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 12));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 12));
        
        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway", Font.BOLD, 12));
        syes.setBackground(Color.WHITE);
        
        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD, 12));
        sno.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 12));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 12));
        r4.setBackground(Color.WHITE);
        
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 12));
        
        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 12));
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 12));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 12));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 12));
       
        
        setLayout(null);
        
        
        l12.setBounds(600, 10, 60, 20);
        add(l12);
        
        l13.setBounds(760, 10, 60, 20);
        add(l13);
        
        l1.setBounds(280, 30, 300, 20);
        add(l1);
        
        l2.setBounds(100, 70, 100, 20);
        add(l2);
        
        c1.setBounds(250, 70, 320, 20);
        add(c1);
        
        l3.setBounds(100, 100, 100, 20);
        add(l3);
        
        c2.setBounds(250, 100, 320, 20);
        add(c2);
        
        l4.setBounds(100, 130, 100, 20);
        add(l4);
        
        c3.setBounds(250, 130, 320, 20);
        add(c3);
        
        l5.setBounds(100, 160, 200, 20);
        add(l5);
        
        c4.setBounds(250, 160, 320, 20);
        add(c4);
        
//        l11.setBounds(100, 190, 200, 20);
//        add(l11);
        
        l6.setBounds(100, 220, 150, 20);
        add(l6);
        
        c5.setBounds(250, 220, 320, 20);
        add(c5);
        
        l7.setBounds(100, 250, 150, 20);
        add(l7);
        
        t1.setBounds(250, 250, 320, 20);
        add(t1);
        
        l8.setBounds(100, 280, 180, 20);
        add(l8);
        
        t2.setBounds(250, 280, 320, 20);
        add(t2);
        
        l9.setBounds(100, 310, 150, 20);
        add(l9);
        
        syes.setBounds(250, 310, 60, 20);
        add(syes);
        
        sno.setBounds(320, 310, 60, 20);
        add(sno);
        
        l10.setBounds(100, 340, 180, 20);
        add(l10);
        
        r3.setBounds(250, 340, 60, 20);
        add(r3);
        
        r4.setBounds(320, 340, 60, 20);
        add(r4);
        
        b.setBounds(570, 400, 100, 30); // Adjusted bounds for "Next" button
        add(b);
        
        b.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(750,500);
        setLocation(280,65);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String religion = (String)c1.getSelectedItem(); 
        String category = (String)c2.getSelectedItem();
        String income = (String)c3.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String pan = t1.getText();
        String aadhar = t2.getText();
        
        String scitizen = "";
        if(syes.isSelected()){ 
            scitizen = "Yes";
        }
        else if(sno.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(r3.isSelected()){ 
            eaccount = "Yes";
        }else if(r4.isSelected()){ 
            eaccount = "No";
        }
        
        try{
            if(t2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c = new Conn();
                String q1 = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c.s.executeUpdate(q1);
                
                new SignupThree(formno).setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
    
               
    }
    
    
    public static void main(String[] args){
        new SignupTwo("").setVisible(true);
    }
}
