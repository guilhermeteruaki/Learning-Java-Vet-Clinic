import java.util.HashMap;
import Animal.*;
import pers.*;

public class Main {

       // Global ID for Staffs and Animals
       public static long staffIDCounter = 000000;

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

       }
}