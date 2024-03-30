package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton deposit,back;
    JLabel text,l2,l3;
    String pin;
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l3 = new JLabel(i3);
        l3.setBounds(0, 0, 700,600);
        add(l3);
        
        text = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 14));
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 16));
        
        deposit = new JButton("DEPOSIT");
        back = new JButton("BACK");
        
        setLayout(null);
        
        text.setBounds(125, 200, 350, 30);
        l3.add(text);

        amount.setBounds(140, 240, 240, 20);
        l3.add(amount);

        deposit.setBounds(310,325,90,17);
        l3.add(deposit);

        back.setBounds(310,345,90,17);
        l3.add(back);
        
        deposit.addActionListener(this);
        back.addActionListener(this);
        
        setSize(700,600);
        setUndecorated(true);
        setLocation(300,50);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        try{        
            String num = amount.getText();
            Date date = new Date();
            if(ae.getSource()==deposit){
                if(num.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+num+"')");
                    JOptionPane.showMessageDialog(null, "₹ "+num+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==back){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
    public static void main(String[] args){
        new Deposit("").setVisible(true);
    }
}