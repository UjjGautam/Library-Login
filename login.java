import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class login implements ActionListener
{
  JFrame frm;
  JLabel title,lblLogin, lblPassword,labelAfterLogin1,labelAfterLogin2,lblWrongPass,lblNoUserName;
  JTextField tfLogin,tfPassword;
  JPasswordField pfPassword;
  JButton btnLogin;
  
  char[] pass; String user; String passw="";
  
  public login(){
        frm=new JFrame("Student Login");
        frm.setLayout(null);
        frm.setSize(1000,650);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        
        title=new JLabel("ISLINGTON  LIBRARY" );
        title.setBounds(280,15,500,50);
        frm.add(title);
        title.setFont(new Font("Serif",Font.PLAIN,35));
        title.setForeground(Color.blue);
        
        lblLogin=new JLabel("LOGIN ID:");
        lblLogin.setBounds(20,80,90,30);
        frm.add(lblLogin);
        
        tfLogin=new JTextField();
        tfLogin.setBounds(100,80,200,30);
        frm.add(tfLogin);
        
        lblPassword=new JLabel("PASSWORD:");
        lblPassword.setBounds(20,140,90,30);
        frm.add(lblPassword);
        
        pfPassword=new JPasswordField();
        pfPassword.setBounds(100,140,200,30);
        frm.add(pfPassword);
        
        btnLogin=new JButton("LOGIN");
        btnLogin.setBounds(100,200,100,30);
        frm.add(btnLogin);
        btnLogin.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
     {
     if(e.getSource()==btnLogin){
      pass=pfPassword.getPassword();
      passw=String.valueOf(pass);
      user=tfLogin.getText();
      try{
        if(!user.equals("")){
      
             if(passw.equals("ujjwal123")){
              title.setVisible(false);
              lblLogin.setVisible(false);
              tfLogin.setVisible(false);
              lblPassword.setVisible(false);
              pfPassword.setVisible(false);
              btnLogin.setVisible(false);
              lblNoUserName.setVisible(false);
              lblWrongPass.setVisible(false);
              
              
              labelAfterLogin1=new JLabel("Welcome, "+user);
              labelAfterLogin1.setBounds(20,80,500,30);
              frm.add(labelAfterLogin1);
              
              
              labelAfterLogin2=new JLabel("Your book to return before Aug 25,2020 is: 1.DIVE INTO PYTHON ");
              labelAfterLogin2.setBounds(20,140,600,30);
              frm.add(labelAfterLogin2);
              labelAfterLogin2.setForeground(Color.blue);
          
           }else{
              lblWrongPass=new JLabel("INCORRECT PASSWORD");
              lblWrongPass.setBounds(320,140,200,30);
              frm.add(lblWrongPass);
              lblWrongPass.setForeground(Color.red);
           }
        }else{
            lblNoUserName=new JLabel("Cannot be empty");
            lblNoUserName.setBounds(320,80,500,30);
            frm.add(lblNoUserName);
            lblNoUserName.setForeground(Color.red);
        }
     }
     catch(Exception ex){
        }
    }
  }
}
   