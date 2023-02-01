
package project.hospital;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Room {
   private int RoomID;
    private String RoomType, RoomStatus;
    
    Scanner S = new Scanner(System.in);
   
    public Room(){
        SetID();
        SetType();
        StatusChange();
    }
  
   public void ShowData(){
       System.out.println("Room ID: "+RoomID);
       System.out.println("Room Type"+RoomType);
       System.out.println("Room Status: "+RoomStatus);
   }
    private void SetID(){
        try{
        System.out.print("Please enter the room's ID: ");
        RoomID = S.nextInt();
        }
        catch ( InputMismatchException e){System.out.println("User Input did not match what the program expected, Please enter a valid Inout! ");
        
           S.next();
        SetID();
        }
    }
    private void SetType(){
        System.out.println("Please enter the room's Type: (Normal | Clinic | Special | Intensive care) ");
        RoomType = S.nextLine();  
        RoomType = S.nextLine();
        
    }
    
    private void StatusChange(){
        System.out.print("Please enter the room's Status (E/F) (E=Empty | F=Full): ");
        RoomStatus = S.nextLine();
              
        switch (RoomStatus) {
  case "e":
  case "E":
    RoomStatus = "Empty";
    break;
  case "f":
  case "F":
    RoomStatus = "Full";
    break;
  default:
      System.out.println("Please enter a valid input!");
      StatusChange();
      
}
      }
   
        }

