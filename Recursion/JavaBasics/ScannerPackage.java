import java.util.Scanner;
public class ScannerPackage{

    static void remove_pattern(String input,String replace){

        String Replace_string=input.replaceAll(replace,"");
        //String Replace_string=input.replace(replace,"");
        
        System.out.println(Replace_string);

    }
    public static void main(String[] args) {
        
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter Your Name ");

        String name=myobj.nextLine();

        System.out.println("Enter Your Age");
        int age=myobj.nextInt();
        myobj.nextLine();
        System.out.println("Enter Your Last name");
        String lastname=myobj.nextLine();

        System.out.println("Enter your sallary");

        double sallary=myobj.nextDouble();


        System.out.println("Your Name :"+name);
        System.out.println("Your Age :"+age);
        System.out.println("Your Sallary :"+sallary);
        System.out.println("Your lastname :"+lastname);

        //Change anything in your name
        remove_pattern(name,"56");

        
    }



}