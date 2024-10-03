package emailapp;

public class app {
    public static void main(String[] args) {
        Email eml=new Email("Madhu","Shetty");
        eml.change_email("maddy@gmail.com\n");
        System.out.println(eml.get_alternate_email()
        );
        System.out.println(eml.ShowInfo());
    }
    
}
