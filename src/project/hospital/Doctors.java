/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.hospital;

import java.util.InputMismatchException;




public class Doctors extends Person implements PaymentHandeling{
private String Doctor_Major;
private int Number_of_Cases , Daily_Hours;

    public Doctors() {
        super("Doctor");
        System.out.println("Enter specific Doctor data");
        SetData();
    }
    
   
   private void SetData(){try{
        System.out.print("Enter Your Speciality : ");
        this.Doctor_Major =sc.nextLine() ;  
        this.Doctor_Major =sc.nextLine() ; 
       
        System.out.print("How Many patients do you have ? : ");
        this.Number_of_Cases =sc.nextInt();
        while (Number_of_Cases>20){
                System.out.println("Impossible number of patients!\nPlease Enter a number lower than 20");
                System.out.print("How Many patients do you have ? : ");
                this.Number_of_Cases =sc.nextInt();
        }
        System.out.print("How Many Hours do you Work per day ? : ");
        this.Daily_Hours =sc.nextInt(); 
        while (Daily_Hours>18){
                System.out.println("Impossible number of Hours worked!\nPlease Enter a number lower than 18");
                System.out.print("How Many Hours do you Work per day ? : ");
                this.Daily_Hours =sc.nextInt();}}
        catch(InputMismatchException e){
        System.out.println("User Input did not match what the program expected, Please enter a valid Inout!");
        sc.next();
        SetData();
        };
    }

   public void ShowData(){
       super.ShowData("Doctor");
       System.out.println("\n\n"+"Displaying Specific Data for Doctor:\n "+"_______________________________");
       System.out.println("Doctor's speciality: "+Doctor_Major);
       System.out.println("Number of hours worked: "+Daily_Hours);
       System.out.println("Number of Patients currently being treated: "+Number_of_Cases);
   }
     @Override
     public double Payment(){return 10*-Daily_Hours * Number_of_Cases ;}          //returns negative value because hospital pays doctors

    
    
}
