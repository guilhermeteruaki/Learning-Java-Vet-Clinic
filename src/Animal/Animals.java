package Animal;

public abstract class Animals {
    public static long animalIDCounter = 100000;
    public static long CreateAnimalID(){
        return (animalIDCounter++);
        }
    long animalID = CreateAnimalID();
    String animalName;
    String animalType;
    double animalAge;
    String medicalCond;   

        
    public long getAnimalID(){
        return this.animalID;           
    }
    public String getAnimalName(){
        return this.animalName;
    }
    public String getAnimalType(){
        return this.animalType;
    }
    public double getAnimalAge(){
        return this.animalAge;
    }
    public String getMedicalCond(){
        return this.medicalCond;
    }
        


    
}


