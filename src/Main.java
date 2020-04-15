import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

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
       
       public static Factory factory = new Factory();
       //public static SearchAndPrint SnP = new SearchAndPrint();
       public static void main(String[] args) {
              boolean exitProgram = false;
              do {
                     try{
                            Scanner sc = new Scanner(System.in);
                            System.out.println("\nPlease choose from:\n" 
                                                 + "1 - Generate New Veterinarian.\n"
                                                 + "2 - Generate New Animal.\n" 
                                                 + "3 - List All Vets.\n" 
                                                 + "4 - List Animals\n"
                                                 + "999 - To exit the program.");
                            int menuChoice = sc.nextInt();
                            

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
                                   //list all doctors       
                                   case 3:
                                          System.out.println("\n");
                                          veterinarianList.entrySet().forEach(entry -> {
                                                 System.out.println("Vet ID: " + entry.getKey() +
                                                 " Vet Name: " + ((Vet) entry.getValue()).getStaffName());
                                          });
                                          System.out.println("\n");
                                          break;
                                   //list all animals       
                                   case 4:
                                          System.out.println("\n");
                                          AnimalList.entrySet().forEach(entry -> {
                                                 System.out.println("Animal ID: " + entry.getKey() 
                                                                      +" Animal Name: " + ((Animals) entry.getValue()).getAnimalName() 
                                                                      + "Animal type: " + ((Animals) entry.getValue()).getAnimalType());
                                          });
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
              
       }


}
