import java.util.HashMap;
import Animal.*;
import pers.*;




public class Main {

       public static void main(String[] args) {

       //Global ID for Staffs and Animals
              public static long staffIDCounter = 000000;
              public static long CreateStaffID(){
                     return (staffIDCounter++);
              }
              public static long staffIDCounter(){
                     return staffIDCounter;
              }
              public static long animalIDCounter = 100000;
              public static long CreateAnimalID(){
                     return (animalIDCounter++);
              }
              public static long animalIDCounter(){
                     return animalIDCounter;
              }
              //Generates Staffs and animals Lists
              public static HashMap< Long, Object> veterinarianList = new HashMap<Long,Object>();
              public static HashMap< Long, Object> AnimalList = new HashMap<Long,Object>();
              
     
       //               Dogs dog1 = new Dogs("dogo1", "Dog", 11, "BB");
       //               Dogs dog2 = new Dogs("dogo2", "dog", 11, "BB");
       //               Dogs dog3 = new Dogs("dogo3", "dog", 11, "BB");
       //               Cats cat1 = new Cats("cat1", "cat", 11, "bb");
       //               Cats cat2 = new Cats("cat2", "cat", 11, "bb");
       //               Cats cat3 = new Cats("cat3", "cat", 11, "bb");

       // System.out.println(dog1.getAnimalID()+ " " + dog1.getAnimalName() + " " + dog1.getAnimalType() + " " + dog1.getMedicalCond());
       // System.out.println(dog2.getAnimalID()+ " " + dog2.getAnimalName() + " " + dog2.getAnimalType() + " " + dog2.getMedicalCond());
       // System.out.println(dog3.getAnimalID()+ " " + dog3.getAnimalName() + " " + dog3.getAnimalType() + " " + dog3.getMedicalCond());
       // System.out.println(cat1.getAnimalID()+ " " + cat1.getAnimalName() + " " + cat1.getAnimalType() + " " + cat1.getMedicalCond());
       // System.out.println(cat2.getAnimalID()+ " " + cat2.getAnimalName() + " " + cat2.getAnimalType() + " " + cat2.getMedicalCond());
       // System.out.println(cat3.getAnimalID()+ " " + cat3.getAnimalName() + " " + cat3.getAnimalType() + " " + cat3.getMedicalCond());


       







}