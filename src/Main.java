import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

//import Animal.*;
import pers.*;


public class Main {

       // Global ID for Staffs and Animals
       public static long staffIDCounter = 000001;

       public static long CreateStaffID() {
              return (staffIDCounter++);
       }

       public static long staffIDCounter() {
              return staffIDCounter;
       }

       public static long animalIDCounter = 100000;

       public static long CreateAnimalID() {
              return (animalIDCounter++);
       }

       public static long animalIDCounter() {
              return animalIDCounter;
       }

       // Generates Staffs and animals Lists
       public static HashMap<Long, Object> veterinarianList = new HashMap<Long, Object>();
       public static HashMap<Long, Object> AnimalList = new HashMap<Long, Object>();

       public static void main(String[] args) {
              boolean exitProgram = false;
              do {
                     try{
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Please choose from:\n" 
                                                 + "1 - Generate New Veterinarian.\n"
                                                 + "2 - Generate New Animal.\n" 
                                                 + "3 - List All Vets.\n" 
                                                 + "4 - \n"
                                                 + "999 - To exit the program.");
                            int menuChoice = sc.nextInt();
                            

                            switch (menuChoice) {
                                   case 1:
                                   System.out.println("\n");
                                          Factory factory = new Factory();
                                          factory.createNewVet();
                                          System.out.println("\n");
                                          break;
                            
                                          
                                   case 2:
                                          System.out.println("\n");
                                          System.out.println("test 2");
                                          System.out.println("\n");
                                          break;
                                   case 3:
                                          System.out.println("\n");
                                          veterinarianList.entrySet().forEach(entry -> {
                                                 System.out.println("Vet ID: " + entry.getKey() +
                                                 " Vet Name: " + ((Vet) entry.getValue()).getStaffName());
                                          });
                                          System.out.println("\n");
                                          break;
                                          
                                   case 4:
                                          System.out.println("\n");
                                          System.out.println("test 4");
                                          System.out.println("\n");
                                          break;

                                   case 999:
                                          exitProgram = true;
                                          break;

                                   default:
                                   System.out.println("That's not a valid option!");
                                   System.out.println("\n");
                                          break;
                            }
                            
                     }             
                      catch (InputMismatchException e) {
                            System.out.println("That's not a valid Number.");
                            System.out.println("\n");
                     }
                           

               
              }
              while (exitProgram == false);
              
       }


}
