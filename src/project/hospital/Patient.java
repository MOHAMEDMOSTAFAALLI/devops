/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.hospital;

import java.util.InputMismatchException;

/**
 *
 * @author janyo
 */
public class Patient extends Person implements PaymentHandeling{
    private int roomid, daysInHospital;
    private String docName, disease;

    public Patient() {
        super("Patient");
        System.out.println("Enter specific Patient data");
        setDaysInHospital();
        setRoomid();
        setDocName();
        setDisease();
    }
   private void setDaysInHospital(){try{
       System.out.print("Enter Number of Days Stayed in Hospital: ");
       this.daysInHospital=sc.nextInt();}
   catch(InputMismatchException e){
        System.out.println("User Input did not match what the program expected, Please enter a valid Inout!");
        sc.next();
        setDaysInHospital();
   }
   }
    private void setRoomid() {try{
      System.out.print("Enter Your Room ID : ");
         this.roomid =sc.nextInt();} 
    catch(InputMismatchException e){
        System.out.println("User Input did not match what the program expected, Please enter a valid Inout!");
        sc.next();
        setRoomid();
   }
    }
    private void setDocName() {
        System.out.print("Enter Your Doctor's name : ");
        this.docName=sc.nextLine() ; 
        this.docName=sc.nextLine() ; 
    }

    private void setDisease() {
        System.out.print("Enter The Name of Your Disease : ");
        this.disease=sc.nextLine() ; 
    }
    
    public void ShowData() {
        System.out.println("Displaying Basic Data: ");
        super.ShowData("Patient");
        System.out.println("\n\n"+"Displaying Specific Data for Patient: "+"_______________________________"
                );
        System.out.println("Patient's Room: "+roomid);
        System.out.println("Patient's Doctor: "+docName);
        System.out.println("Patient's Disease: "+disease);
    }
    @Override
    public double Payment(){
        return daysInHospital*500;} 

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

