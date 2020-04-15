package pers;

import java.util.ArrayList;

import Animal.Animals;

public class Vet extends Staff{
    String medicalSpeciality;
    ArrayList<Animals> patientList;


    public Vet(String staffFirstName,String staffLastName, double staffSalary, String medicalSpeciality){
        this.staffFirstName = staffFirstName;
        this.staffLastName = staffLastName;
        this.staffSalary = staffSalary;
        this.medicalSpeciality = medicalSpeciality;
    }


   //Criar lista de Animais para cada médico
    //achei essa parte no Stackoverflow mas nao sei se entendi direito
   //Create and recover Patient list

    public void SetpatientList(){
        this.patientList = new ArrayList<Animals>();
    }
    public boolean addAnimal(Animals animalID){
    
        if (patientList.contains(animalID)) {
            return false;
                }
            else{ 
                return patientList.add(animalID);
              }
        
    
    }
    public void getPatientList(){

        for (int i=0; i<= patientList.size(); i++){          ;
        
        System.out.println("Animal ID: " + patientList.get(i).getAnimalID() + ",  Animal Name: " + patientList.get(i).getAnimalName() + ", Animal Medical Cond.: " + patientList.get(i).getMedicalCond() + ".");
        }
    }
}

