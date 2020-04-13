package pers;



public class Vet extends Staff{
    String medicalSpeciality;


    public Vet(String staffFunction, String staffFirstName,String staffLastName, double staffSalary, String medicalSpeciality){
        this.staffFunction = staffFunction;
        this.staffFirstName = staffFirstName;
        this.staffLastName = staffLastName;
        this.staffSalary = staffSalary;
        this.medicalSpeciality = medicalSpeciality;
    }

   //Criar lista de Animais para cada médico
    //achei essa parte no Stackoverflow mas nao sei se entendi direito
    public void SetpatientList(){
        this.patientList = new ArrayList<Animals>();
    }
    public boolean addAnimal(Animals animalID){
    
        if (animalID==null || patientList.contains(animalID)) {
            return false;
        }
        patientList.add(animalID);
        return true;
    }
    public void printPatientList(){
        for (Animals d : patientList);
        System.out.println(d.getAnimalID + d.getAnimalName +""+ d.getMedicalCond);

    };
}

