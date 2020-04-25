import pers.*;
import Animal.*;

import java.util.Scanner;

public class ListBy {

public void listVetBySpeciality(){
    System.out.println("What speciality:\n Dog, Cat or Exotic?");
    Scanner sc = new Scanner(System.in);
    String imput= sc.nextLine();

    Main.veterinarianList.entrySet().forEach(entry -> {
        if (((Vet) entry.getValue()).getMedicalSpeciality().toLowerCase().contains(imput.toLowerCase().trim())){
            System.out.println("Staff ID: "+((Vet) entry.getValue()).getStaffID() 
                              +", Staff Name:" + ((Vet) entry.getValue()).getStaffName());

        }
    });
}
public void listStaffByJob(){
    System.out.println("What job?\n Doing Payslip, Attending Client, Sweeping Floor or holding animal?");
    Scanner sc = new Scanner(System.in);
    String imput= sc.nextLine();

    Main.AdminList.entrySet().forEach(entry -> {
        if (((Admin) entry.getValue()).getAdminJob().toLowerCase().contains(imput.toLowerCase().trim())){
            System.out.println("Staff ID: "+((Admin) entry.getValue()).getStaffID() 
                              +", Staff Name:" + ((Admin) entry.getValue()).getStaffName());

        }

    });
}

public void listAnimalByType(){
    System.out.println("What type of animal?\n Dog, Cat or exotic?");
    Scanner sc = new Scanner(System.in);
    String imput= sc.nextLine();

    Main.AnimalList.entrySet().forEach(entry -> {
        if (((Animals) entry.getValue()).getAnimalType().toLowerCase().contains(imput.toLowerCase().trim())){
            System.out.println("Animal ID: "+((Animals) entry.getValue()).getAnimalID()
                              +", Animal Name:" + ((Animals) entry.getValue()).getAnimalName());

        }

    });
}



}