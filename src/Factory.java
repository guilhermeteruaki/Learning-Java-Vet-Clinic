import pers.Vet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


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
            BufferedReader BR = new BufferedReader(new FileReader("C:/Users/guilh/Documents/learning Programing/Java/Vet/src/NamesList.txt"));
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
            BufferedReader BR = new BufferedReader(new FileReader("C:/Users/guilh/Documents/learning Programing/Java/Vet/src/MiddleNames.txt"));
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
            System.out.println("How many Vets ?\n");
            Scanner sc = new Scanner(System.in);
            int numVets = sc.nextInt();
                            
            for (int i = 0; i < numVets; i++) {
                
                Random random = new Random();
                // get a random arguments for the new Vet
                Vet vet = new Vet(listOfFirstNames.get(random.nextInt(listOfFirstNames.size())),
                                  listOfMiddleNames.get(random.nextInt(listOfMiddleNames.size())),
                                  random.nextDouble()*10, 
                                  listOfSpecialities.get(random.nextInt(listOfSpecialities.size())));

                Main.veterinarianList.put(Main.CreateStaffID(), vet);
                vet.setStaffID(Main.staffIDCounter());
                sc.close();
                
            } 
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a valid Number.");
        }
    }

    

    


}