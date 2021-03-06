import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

import pers.*;
import Animal.*;

public class SearchAndPrint {
    Scanner sc = new Scanner(System.in);
/*Search problem: in case of more than one result ie. two animals with the same name, 
only the later one will be displayed. simple problem to fix. too much trouble to do so */
    public void searchVetByName(){
        
        System.out.println("The name of the veterinarian?\n Use first name or Last name");
        String nameToSearch = sc.nextLine();
      
        Main.veterinarianList.entrySet().forEach(entry ->{
            if ( ((Vet) entry.getValue()).getStaffFirstName().toLowerCase().equals(nameToSearch.toLowerCase()) || 
                                ((Vet) entry.getValue()).getStaffLastName().toLowerCase().equals(nameToSearch.toLowerCase())){
                                  System.out.println("Vet ID: " + entry.getKey() +
                                                    ", Vet Name: " + ((Vet) entry.getValue()).getStaffName()
                                                    + ", Vet speciality: " + ((Vet) entry.getValue()).getMedicalSpeciality()
                                                    + ", Vet salary: " +(((Vet) entry.getValue()).getSalary())+"\n");}
                    

        });
  
        //sc.close();
    }

    public void searchAdminByName(){
        
        System.out.println("The name of the Staff\n Use first name or Last name");
        String nameToSearch = sc.nextLine();
        

        Main.AdminList.entrySet().forEach(entry ->{
            if ( ((Admin) entry.getValue()).getStaffFirstName().toLowerCase().equals(nameToSearch.toLowerCase()) || 
                                ((Admin) entry.getValue()).getStaffLastName().toLowerCase().equals(nameToSearch.toLowerCase())){
                    System.out.println("Staff ID: " + entry.getKey() 
                                 +", Staff Name: " + ((Admin) entry.getValue()).getStaffName() 
                                 + ", Staff Sector: " + ((Admin) entry.getValue()).getAdminSector()
                                 + ", The Staff is currently "+ ((Admin) entry.getValue()).getAdminJob());}
     });
        
        // sc.close();
    }

    public void searchAnimalByName(){
        
        System.out.println("The name of the  animal\n");
        String nameToSearch = sc.nextLine();
       
        Main.AnimalList.entrySet().forEach(entry -> {
            if ( ((Animals) entry.getValue()).getAnimalName().toLowerCase().equals(nameToSearch.toLowerCase())){
                    System.out.println("Animal ID: " + entry.getKey() 
                    +", Animal Name: " + ((Animals) entry.getValue()).getAnimalName() 
                    + ", Animal type: " + ((Animals) entry.getValue()).getAnimalType()
                    +", Animal Age: " + ((Animals) entry.getValue()).getAnimalAge()
                    + ", Medical Condition: " + ((Animals) entry.getValue()).getMedicalCond());}
     });
        
        // sc.close();
    }
}








