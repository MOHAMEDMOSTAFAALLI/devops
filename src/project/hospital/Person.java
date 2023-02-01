
package project.hospital;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Person{
    Scanner sc= new Scanner(System.in);
   
   private String name;
   private String NationalID;
   private int dd,mm,yyyy;
   private int age;
   private String phoneNum;
   private String gender;
   private String Address;
   
    Person(String type)
    {
        System.out.println("Thanks for using OOP-Hospital! \nYou will now be asked to enter basic data for a "+type);
    GetName();
    GetNationalID();
    GetDOB();
    GetAge();
    GetPhone();
    GetAddress();
    ChooseGender();
    }
    public void ShowData(String type){System.out.println("Name of "+type +": "+name);
    System.out.println("National ID of "+type +": "+NationalID);
    System.out.println("Date of birth: "+dd+"-"+mm+"-"+yyyy);
    System.out.println("Age of "+type +": "+age);
    System.out.println("Phone number: "+phoneNum);
    System.out.println("Gender: "+gender);
    System.out.println("Address: "+Address);
    }
    
    private void ChooseGender(){
        System.out.println("Press F for Female and M for Male");        
        char c= sc.next().charAt(0);
        if (c=='f'||c=='F') gender="Female";
        else if(c=='m'||c=='M') gender ="Male";
        else {System.out.println("Invalid input");
        ChooseGender();  }       
    }
   private void GetPhone(){
        System.out.println("Enter an Egyptian phone number");
        phoneNum=sc.nextLine();
        if (phoneNum.length()!=11) {System.out.println("Invalid phone number");
        GetPhone();
        }
    }
   private void GetDOB(){try{
    System.out.println("Now entering Date of birth");
    System.out.println("Enter day");
    dd=sc.nextInt();
    while(dd>31){
        System.out.println("Day can't be bigger than 31");
        System.out.println("Enter day");
        dd=sc.nextInt();
    }
    System.out.println("Enter month");
    mm=sc.nextInt();
    while(mm>12){
        System.out.println("Monethes can't be bigger than 12");
        System.out.println("Enter month");
        dd=sc.nextInt();
    }
    System.out.println("Enter year");
    yyyy=sc.nextInt();
    
    while(yyyy<1920||yyyy>2020){
        if (yyyy<1920)
        System.out.println("That means You are the oldest person on the planet!");
        if (yyyy>2020)
        System.out.println("That means You were born in the future!");
        System.out.println("Please enter a valid year");
        yyyy=sc.nextInt();
    }} catch (InputMismatchException e){System.out.println("User Input did not match what the program expected, Please enter a valid Inout!");
        
          sc.next();
       GetDOB();}
   }
    private void GetNationalID(){System.out.println("Enter a valid Egyptian ID (14 numbers)");
        NationalID=sc.nextLine();
    if (NationalID.length()!=14){System.out.println("Invalid Egyptian ID");GetNationalID();}}
    private void GetName(){System.out.println("Enter your name");
    name=sc.nextLine();
    }
    private void GetAge(){try{System.out.println("Enter your age");
    age=sc.nextInt();}
    catch(InputMismatchException e){
        System.out.println("User Input did not match what the program expected, Please enter a valid Inout!");
        sc.next();
        GetAge();
    }
    }
    private void GetAddress(){System.out.println("Enter your address");
        Address=sc.nextLine();
    }
}
