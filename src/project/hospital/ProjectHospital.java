
package project.hospital;
import java.util.Scanner;
public class ProjectHospital {
    
    
    public static void main(String[] args) {
    char option='i';
    Scanner sc= new Scanner(System.in);
    System.out.println("Welcome to OOP-Hospital!");
    System.out.println("You can make a Patient, Doctor or room");
        double Balance=1000000;

   
    
    while (option!='x'&&option!='X'){
         System.out.println("Type (p|P) for patient, (d|D) for doctor, (r|R) for room, or you can exit by typing (x|X) ");
        
    option=sc.nextLine().charAt(0);
    
    switch(option){
        
        case 'p':
        case 'P':
        {Patient patient1=new Patient();
            System.out.println("Here is the data you entered for this Patient: "+"_______________________________\n");
            
            
            patient1.ShowData();
            System.out.println("Does the patient need to pay yet?: (Y|n)");
            char c=sc.nextLine().charAt(0);
            if (c=='Y'||c=='y')
                System.out.println("Hospital Balance before payment:"+Balance);
            Balance+=patient1.Payment();
            System.out.println("Hospital Balance after payment:"+Balance);
        break;}
        
        case 'd':
        case 'D':
        {Doctors doctor1=new Doctors();
            System.out.println("Here is the data you entered for this Doctor: "+"_______________________________\n");    
            doctor1.ShowData();
            System.out.println("Does the doctor need to be payed yet?: (Y|n)");
            char c=sc.nextLine().charAt(0);
            if (c=='Y'||c=='y')
                System.out.println("Hospital Balance before payment:"+Balance);
            Balance+=doctor1.Payment();
            System.out.println("Hospital Balance after payment:"+Balance);
        break;}
        
         case 'r':
        case 'R':
        {Room Room1= new Room();
        System.out.println("Here is the data you entered for this Doctor: "+"_______________________________\n");    
            Room1.ShowData();
         break;}
        
        case 'x':
        case 'X':
        {break;}
        default:{
            System.out.println("Invalid option");
            break;
    }
    }   
       
    }
  
   
    }

}
