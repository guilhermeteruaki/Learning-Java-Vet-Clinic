package pers;


import java.util.LinkedList;


public class Vet extends Staff{
    String medicalSpeciality;
    LinkedList<Long> patientList;


    public Vet(String staffFirstName,String staffLastName, double staffSalary, String medicalSpeciality){
        this.staffFirstName = staffFirstName;
        this.staffLastName = staffLastName;
        this.staffSalary = staffSalary;
        this.medicalSpeciality = medicalSpeciality;
    }


   
   //Create and recover Patient list

    public void setpatientList(){
        this.patientList = new LinkedList<Long>();
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
    
    
    public LinkedList<Long> getPatientList(){
        return patientList;
    }

    public void treatPatient(){
        System.out.println("treating " + patientList.getFirst());
        patientList.poll();

        System.out.println("The animal has been treated");
    }


    
}

