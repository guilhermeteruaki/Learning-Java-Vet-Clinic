import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import Animal.*;
import pers.*;

public class Factory{

    public void createNewVet(){
         //get list of first names to random generator
        //Random names from https://github.com/dominictarr/random-name
        ArrayList<String> listOfFirstNames = new ArrayList<>();
        ArrayList<String> listOfMiddleNames = new ArrayList<>();
        ArrayList<String> listOfSpecialities = new ArrayList<>();
        listOfSpecialities.add("Dog Specialist");
        listOfSpecialities.add("Cat Specialist");
        listOfSpecialities.add("Exotic Animals Specialist");
            
        try {
            BufferedReader BR = new BufferedReader(new FileReader("src/NamesList.txt"));
            String line = BR.readLine();

            while (line != null){
            listOfFirstNames.add(line);
            line = BR.readLine();
            }
            BR.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File NamesList.txt not found!");
        }
        catch (IOException e){
            System.out.println("IOException First name");
        }     

        //Get list of middle names
        try {
            BufferedReader BR = new BufferedReader(new FileReader("src/MiddleNames.txt"));
            String line = BR.readLine();
            
        while (line != null){
            listOfMiddleNames.add(line);
            line = BR.readLine();
            }
            BR.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File MiddleNames.txt Not Found!");
        }
        catch (IOException e){
            System.out.println("IOException Last Name");
        }   
       

        //Create Vets
        try {  
            System.out.println("How many Vets ?");
            Scanner sc = new Scanner(System.in);
            int numVets = sc.nextInt();
                            
            for (int i = 0; i < numVets; i++) {
                
                Random random = new Random();
                // get a random arguments for the new Vet
                Vet vet = new Vet(listOfFirstNames.get(random.nextInt(listOfFirstNames.size())),
                                  listOfMiddleNames.get(random.nextInt(listOfMiddleNames.size())),
                                  random.nextDouble()*1000, 
                                  listOfSpecialities.get(random.nextInt(listOfSpecialities.size())));

                Main.veterinarianList.put(Main.CreateStaffID(), vet);
                vet.setStaffID(Main.staffIDCounter());
                vet.setpatientList();
                
                
            } 
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a valid Number.");
        }

        
    }

    public void createNewAdmin(){
        //get list of first names to random generator
       //Random names from https://github.com/dominictarr/random-name
       ArrayList<String> listOfFirstNames = new ArrayList<>();
       ArrayList<String> listOfMiddleNames = new ArrayList<>();
       ArrayList<String> listOfAdminSector = new ArrayList<>();
       listOfAdminSector.add("Human Resources");
       listOfAdminSector.add("Secretary");
       listOfAdminSector.add("Janitor");
       listOfAdminSector.add("Security");
       
       try {
           BufferedReader BR = new BufferedReader(new FileReader("src/NamesList.txt"));
           String line = BR.readLine();

           while (line != null){
           listOfFirstNames.add(line);
           line = BR.readLine();
           }
           BR.close();
       }
       catch (FileNotFoundException e){
           System.out.println("File NamesList.txt not found!");
       }
       catch (IOException e){
           System.out.println("IOException First name");
       }     

       //Get list of middle names
       try {
           BufferedReader BR = new BufferedReader(new FileReader("src/MiddleNames.txt"));
           String line = BR.readLine();
           
       while (line != null){
           listOfMiddleNames.add(line);
           line = BR.readLine();
           }
           BR.close();
       }
       catch (FileNotFoundException e){
           System.out.println("File MiddleNames.txt Not Found!");
       }
       catch (IOException e){
           System.out.println("IOException Last Name");
       }   
      

       //Create admin
       try {  
           System.out.println("How many Admins ?");
           Scanner sc = new Scanner(System.in);
           int numAdmins = sc.nextInt();
                           
           for (int i = 0; i < numAdmins; i++) {
               
               Random random = new Random();
               // get a random arguments for the new Vet
               Admin admin = new Admin(listOfFirstNames.get(random.nextInt(listOfFirstNames.size())),
                                 listOfMiddleNames.get(random.nextInt(listOfMiddleNames.size())),
                                 random.nextDouble()*500, 
                                 listOfAdminSector.get(random.nextInt(listOfAdminSector.size())));

               Main.AdminList.put(Main.CreateStaffID(), admin);
               admin.setStaffID(Main.staffIDCounter());
               
                if (admin.getAdminSector() == "Human Resources"){
                   admin.setAdminJob("Doing Payslip");
                }
                if (admin.getAdminSector() == "Secretary"){
                admin.setAdminJob("Talking to client!");
                }
                if (admin.getAdminSector() == "Janitor"){
                    admin.setAdminJob("Sweeping the floor.");
                }
                if (admin.getAdminSector() == "Security"){
                    admin.setAdminJob("Holding a Rabid animal. BEWARE!!!");
                }
            }    
       }
       catch (InputMismatchException e) {
           System.out.println("That's not a valid Number.");
       }

       
   }
   
   public void createNewPet(){
        //get list of pet names
        ArrayList<String> listOfPetNames = new ArrayList<>();
        ArrayList<String> listOfExoticTypes = new ArrayList<>();
            listOfExoticTypes.add("Lizard");
            listOfExoticTypes.add("Rabit");
            listOfExoticTypes.add("Snake");
            listOfExoticTypes.add("Spider");
        ArrayList<String> listOfConditions = new ArrayList<>();
            listOfConditions.add("Broken bone");
            listOfConditions.add("Large Cut");
            listOfConditions.add("Infection");
            listOfConditions.add("Shortness of Breath");
            listOfConditions.add("Vitamin Deficiency");
            listOfConditions.add("Flees");
            
        try {
            BufferedReader BR = new BufferedReader(new FileReader("src/PetNames.txt"));
            String line = BR.readLine();

            while (line != null){
            listOfPetNames.add(line);
            line = BR.readLine();
            }
            BR.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File PetNames.txt not found!");
        }
        catch (IOException e){
            System.out.println("IOException Pet name");
        } 

        //generate new pets
        try {  
            System.out.println("How many Pets ?");
            Scanner sc = new Scanner(System.in);
            int numPets = sc.nextInt();
            Random random = new Random();   
            // get a random arguments for the new Pet]
            //creates iqual number of cats, dogs and exotic animals  
            
            for (int i = 0; i < (numPets/3); i++) {               
                               
                Cats cat = new Cats(listOfPetNames.get(random.nextInt(listOfPetNames.size())),
                                      "Cat",
                                      random.nextInt(15), 
                                      listOfConditions.get(random.nextInt(listOfConditions.size())));

                Main.AnimalList.put(Main.CreateAnimalID(), cat);
                cat.setAnimalID(Main.animalIDCounter());

             //foreach https://stackoverflow.com/questions/4234985/how-to-for-each-the-hashmap
             LinkedList<LinkedList<Long>> listOfCatVets = new LinkedList<LinkedList<Long>>();
                
                //for each Vet in the vet list
                Main.veterinarianList.entrySet().forEach(entry -> {
                    
                    //get the cat specialist and put his patient list the listOfCatVets
                    if( ((Vet) entry.getValue()).getMedicalSpeciality() == "Cat Specialist"){
                        listOfCatVets.add((LinkedList<Long>) ((Vet) entry.getValue()).getPatientList());
                    }
                });
                
                //Look at listOfCatVets and get the list with the smallest size
                int count = 0;
                int minSize =10;
                LinkedList<Long> minSizedList = new LinkedList<Long>();
    
                while (listOfCatVets.size() > count) {
                    
                    if( listOfCatVets.get(count).size() <= minSize){
                        minSize = listOfCatVets.get(count).size();
                        minSizedList = listOfCatVets.get(count);
                        
                    }
                count++;
                }  
               //add the animal ID to the list

               minSizedList.add(Main.animalIDCounter());
            } 

            for (int i= (numPets/3); i< (2*(numPets/3)); i++){

                Dogs dog = new Dogs(listOfPetNames.get(random.nextInt(listOfPetNames.size())),
                                    "Dog",
                                    random.nextInt(20),
                                    listOfConditions.get(random.nextInt(listOfConditions.size())));
                Main.AnimalList.put(Main.CreateAnimalID(), dog);
                dog.setAnimalID(Main.animalIDCounter());
            }

            for (int i= (2*(numPets/3)); i<numPets; i++){

                Exotic exotic = new Exotic(listOfPetNames.get(random.nextInt(listOfPetNames.size())),
                                            "Exotic",
                                            random.nextInt(10),
                                            listOfConditions.get(random.nextInt(listOfConditions.size())),
                                            listOfExoticTypes.get(random.nextInt(listOfExoticTypes.size())));
                Main.AnimalList.put(Main.CreateAnimalID(), exotic);
                exotic.setAnimalID(Main.animalIDCounter());
           }
           // sc.close();
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a valid Number.");
        }

    
    }

}