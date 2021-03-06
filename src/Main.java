import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import Animal.*;
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

       public static long animalIDCounter = 100001;

       public static long CreateAnimalID() {
              return (animalIDCounter++);
       }

       public static long animalIDCounter() {
              return animalIDCounter;
       }

       // Generates Staffs and animals Lists
       public static HashMap<Long, Object> veterinarianList = new HashMap<Long, Object>();
       public static HashMap<Long, Object> AnimalList = new HashMap<Long, Object>();
       public static HashMap<Long, Object> AdminList = new HashMap<Long,Object>();
       
       public static Factory factory = new Factory();
       public static ListBy LB = new ListBy();


     
       public static void main(String[] args) {
              
              boolean exitProgram = false;
              do {
                     try{
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("\nPlease choose from:\n" 
                                                 + "1 - Generate New Veterinarian.\n"
                                                 + "2 - Generate New Animal.\n" 
                                                 + "3 - Create new Staff.\n" 
                                                 + "4 - List Animals.\n"
                                                 + "5 - List All Vets.\n"
                                                 + "6 - List All Staff.\n"
                                                 + "7 - Print patient list for specific veterinarian.\n"
                                                 + "8 - Search by veterinarian name.\n"
                                                 + "9 - Search by Staff name\n"
                                                 + "10 - Search animal by name.\n"
                                                 + "11 - Choose a Vet to treat a patient.\n"
                                                 + "12 - List veterinarians by speciality.\n"
                                                 + "13 - List Staff by job being performed\n"
                                                 + "14 - List Animal by Type.\n"
                                                 + "999 - To exit the program.");
                            int menuChoice = sc1.nextInt();
                            

                            switch (menuChoice) {
                                   //create new vet
                                   case 1:
                                          System.out.println("\n");
                                          factory.createNewVet();
                                          System.out.println("\n");
                                          break;
                            
                                    //create new animal      
                                   case 2:
                                          System.out.println("\n");
                                          factory.createNewPet();

                                          
                                          break;
                                      
                                    //list all vets  
                                   case 5:
                                          System.out.println("\n");
                                          veterinarianList.entrySet().forEach(entry -> {
                                                 System.out.println("Vet ID: " + entry.getKey() +
                                                 ", Vet Name: " + ((Vet) entry.getValue()).getStaffName()
                                                 + ", Vet speciality: " + ((Vet) entry.getValue()).getMedicalSpeciality());
                                          });
                                          System.out.println("\n");
                                          break;
                                   //list all animals       
                                   case 4:
                                          System.out.println("\n");
                                          AnimalList.entrySet().forEach(entry -> {
                                                 System.out.println("Animal ID: " + entry.getKey() 
                                                                      +", Animal Name: " + ((Animals) entry.getValue()).getAnimalName() 
                                                                      + ", Animal type: " + ((Animals) entry.getValue()).getAnimalType());
                                          });
                                          System.out.println("\n");
                                          break;
                                  
                                  // Create new admin
                                   case 3:
                                          System.out.println("\n");
                                          factory.createNewAdmin();
                                          System.out.println("\n");
                                          break;
                                   
                                          //List all Staffs
                                   case 6:
                                          System.out.println("\n");
                                          AdminList.entrySet().forEach(entry -> {
                                                 System.out.println("Staff ID: " + entry.getKey() 
                                                                      +", Staff Name: " + ((Admin) entry.getValue()).getStaffName() 
                                                                      + ", Staff Sector: " + ((Admin) entry.getValue()).getAdminSector()
                                                                      + ", The Staff is currently "+ ((Admin) entry.getValue()).getAdminJob());
                                          });
                                          System.out.println("\n");
                                          break;
                                   
                                   // Print patient List
                                   case 7:
                                   System.out.println("For which Vet?\n Use Vet ID.");
                                          long vetChoice = sc1.nextLong();
                                         AtomicInteger number = new AtomicInteger(1);
                                          
                                         ((Vet) (veterinarianList.get(vetChoice))).getPatientList()
                                                       .forEach(entry ->{                                                                                                      
                                                  System.out.println( number.getAndAdd(1) + " "
                                                                    + ((Animals) AnimalList.get(entry)).getAnimalName() );
                                                 });
                                          break;
                                          

                                   //Search vet by name 
                                   case 8:
                                          {
                                                 SearchAndPrint sNP = new SearchAndPrint();

                                                 sNP.searchVetByName();
                                          }
                                          break;

                                          //search admin by name
                                   case 9:{
                                          SearchAndPrint sNP = new SearchAndPrint();

                                          sNP.searchAdminByName();
                                   }

                                          break;

                                   // Search animal by name
                                   case 10:{
                                          SearchAndPrint sNP = new SearchAndPrint();

                                          sNP.searchAnimalByName();
                                   }
                                          break;       

                                    //treat a patient for specific vet
                                    case 11:

                                          System.out.println("For which veterinarian?\n Use vets ID.");
                                          long treatment = sc1.nextLong();
                                          
                                          long x = ((Vet) veterinarianList.get(treatment)).treatPatient();
                                          System.out.println("Treating " + ((Animals) AnimalList.get(x)).getAnimalName() 
                                                             + ", Animal ID: " + x +"\n");
                                          System.out.println("Animal has been treated, horay!");
                                          break;

                                   //List vet by type
                                   case 12:{
                                          LB.listVetBySpeciality();
                                   }
                                          break;   

                                   //list staff by type
                                   case 13:{
                                          LB.listStaffByJob();
                                   }
                                          break;    

                                   //list animal by type
                                   case 14:{
                                          LB.listAnimalByType();
                                   }
                                          break; 


                                   case 999:
                                          exitProgram = true;
                                          break;

                                   default:
                                   System.out.println("That's not a valid option!");
                                   System.out.println("\n");
                                          break;
                            }
                     /*For some reason if I close the scanner the menu breaks, 
                     even if the scanner inside Factory.java is closed, it also breaks */                           
                     //sc.close();
                     }             
                      catch (InputMismatchException e) {
                            System.out.println("That's not a valid Number.");
                            System.out.println("\n");
                     }
                           

               
              }
              while (exitProgram == false);
              System.out.println("See you next time!"); 
       }


}
