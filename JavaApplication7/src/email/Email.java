/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;

import java.util.Scanner;

/**
 *
 * @author dumps
 */
public class Email {
    
    private String Fname;
    private String Lname;
    private String Password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "bcdCompany.com";
    
    
    
    public Email(String Fname,String Lname){
     this.Fname = Fname;
     this.Lname = Lname;
     
     
     System.out.println("Email Created : " + " " + this.Fname + " " + this.Lname);
     
     
     this.department = setDepartment();
     System.out.println("Department : " + this.department);
     
     
     this.Password = randomPassword(defaultPasswordLength);
     System.out.println("your password is : " + this.Password);
     
     
     email = Fname.toLowerCase()+ "." + Lname.toLowerCase()+"@"+ department + "." + companySuffix;
     System.out.println("Your email is :"+ email);
     
    }
    
   private String setDepartment(){
   
    
   System.out.println("Code Department\n1 for Frontend\n2 for Backend\n3 for Functions\n0 for none " );
   System.out.println("Enter Code Department : ");
   Scanner sc = new Scanner(System.in);
   int depChoice = sc.nextInt();
   if(depChoice ==1){
   
       return "Frontend";
   }
   else if(depChoice == 2){
   
   return "Backend";
   }
   else if(depChoice == 3){
   
   return "Functions";
   }
   else{
    return "";
   }
   }
    
  private String randomPassword(int length){
  
  String passwordSet = "ABSCBNSBA$!ABCSBSN12345#@QWEBASD123450";
  char[] password = new char[length];
  
  
  for (int i =0; i<length; i++ ){
  
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
  }
  return new String (password);
  
  }
  
  public void setMailboxCapacity(int capacity){
  
  this.mailBoxCapacity = capacity;

  }
  
  public void setAlternateEmail(String altEmail){
      this.alternateEmail = altEmail;
  }
  
  public void changePassword(String Password){
  
      this.Password =  Password;
  
  }
  
  public int getMailboxCapacity(){
      return mailBoxCapacity;
  }
  public String getAlternateEmail(){
  
   return alternateEmail;
  }
  
  public String getPassword(){
      return Password;
  }
  
  public String showInfo(){
      return "DISPLAY NAME : " +Fname + " " + Lname + 
              "COMPANY EMAIL " + email + 
              "MAILBOXCAPACITY " +mailBoxCapacity + "mb";
              
  }
  
  
  
  
  
  
    
}
