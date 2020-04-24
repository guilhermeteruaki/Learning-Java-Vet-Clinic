package pers;

import java.util.ArrayList;
import java.util.List;

import Animal.Animals;

public class Vet extends Staff{
    String medicalSpeciality;
    ArrayList<Long> patientList;


    public Vet(String staffFirstName,String staffLastName, double staffSalary, String medicalSpeciality){
        this.staffFirstName = staffFirstName;
        this.staffLastName = staffLastName;
        this.staffSalary = staffSalary;
        this.medicalSpeciality = medicalSpeciality;
    }


   //Criar lista de Animais para cada médico
    //achei essa parte no Stackoverflow mas nao sei se entendi direito
   //Create and recover Patient list

    public void setpatientList(){
        this.patientList = new ArrayList<Long>();
    }
    public boolean addAnimal(Long animalID){
    
        if (patientList.contains(animalID)) {
            return false;
                }
            else{ 
                return patientList.add(animalID);
              }
        }      

    public String getMedicalSpeciality(){
        return medicalSpeciality;
    }
        
    
    public ArrayList<Long> getPatientList(){
        return patientList;
    }


    // public void printPatientList(){

    //     for (int i=0; i<= patientList.size(); i++){          ;
        
    //     System.out.println("Animal ID: " + patientList.get(i).getAnimalID() + ",  Animal Name: " + patientList.get(i).getAnimalName() + ", Animal Medical Cond.: " + patientList.get(i).getMedicalCond() + ".");
    //     }
    // }
}

