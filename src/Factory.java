import pers.Vet;
import java.util.InputMismatchException;
import java.util.Scanner;
import pers.Staff;

public class Factory{

    

  

    public void createNewVet(){

        try {  
            System.out.println("How many Vets ?\n");
            Scanner sc = new Scanner(System.in);
            int numVets = sc.nextInt();
                            
            for (int i = 0; i <= numVets; i++) {
                Vet vet = new Vet(staffFunction, staffFirstName, staffLastName, staffSalary, medicalSpeciality);
                Main.veterinarianList.put(Main.CreateStaffID(), vet);
                vet.setStaffID(Main.staffIDCounter());
            } 
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a valid Number.");
        }
    }
}