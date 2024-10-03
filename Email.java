package emailapp;
import java.util.Scanner;

public class Email{
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mail_box_capacity=500;
    private String alternate_email;
    private int default_length=8;
    private String company_suffix="infosys.com";
    private String email;
    

// constructor to get fname and lname
    public Email(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("Email created: "+this.firstname+this.lastname);
// Call a method inside the constructor to know about the department
this.department=set_department();
System.out.println("Department:"+this.department);
// Call a method to set random password
this.password=randomPassword(default_length);
System.out.println("Your password is:"+this.password);
// Creating email from fname,lname,company suffix
this.email=firstname.toLowerCase()+lastname.toLowerCase()+"@"+department+"."+company_suffix;
System.out.println("Your email is:"+this.email);
    }



// Generate the random password:
private String randomPassword(int length){
    String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
    char[] password=new char[length];
    for(int i=0;i<length;i++){
        
        int rand=(int)(Math.random()*passwordset.length());
        password[i]=passwordset.charAt(rand);
    }
    // convert from char to String type before returning
return new String(password);
}
// Set method to set the mailbox capacity
public void set_capacity(int capacity){
    this.mail_box_capacity=capacity;
}
// Set alternative email
public void change_email(String email){
    this.alternate_email=email;
}
// get mailbox capacity
public int get_mailbox_capacity(){
    return mail_box_capacity;
}
// get alternate email
public String get_alternate_email(){
    return alternate_email;
}
// Get the password
public String get_password(){
    return password;
}


// Call a method to ask for the department and return the department:
private String set_department(){
    System.out.println("Enter the department:\n1.Sales\n2.Development\n3.Accounting\n4.None");
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    
    if(choice==1)return "Sales";
    else if(choice==2)return "Development";
    else if(choice==3)return "Accounting";
    else return "...";
}

// To display the information
public String ShowInfo(){
    return "Name:"+firstname+lastname+
    "\nCompany Email:"+email+
    "\nMail_Box Capacity:"+mail_box_capacity+"mb";
}

}