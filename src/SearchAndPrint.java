import java.util.Scanner;

import pers.Staff;
import pers.Vet;

public class SearchAndPrint {

    public void searchVetByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("The name of the veterinarian?");
        String nameToSearch = sc.nextLine();
        
        Main.veterinarianList.entrySet().forEach(entry ->{
            if ( ((Vet) entry.getValue()).getStaffFirstName().equals(nameToSearch) || 
                                ((Vet) entry.getValue()).getStaffLastName().equals(nameToSearch)){
                                    System.out.printf("Vet ID: " + entry.getKey() +
                                                    ", Vet Name: " + ((Vet) entry.getValue()).getStaffName()
                                                    + ", Vet speciality: " + ((Vet) entry.getValue()).getMedicalSpeciality()
                                                    + ", Vet salary: %.2f K",(((Vet) entry.getValue()).getSalary())+"\n");
                                          
                                
            }
            else {
                System.out.println("Name not Found");
            }

        });
        sc.close();
    }
}








