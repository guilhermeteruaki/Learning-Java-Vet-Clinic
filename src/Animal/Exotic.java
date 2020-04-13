package Animal;

public class Exotic extends Animals{
    String exoticType;

    public Exotic (String animalName, String animalType, double animalAge, String medicalCond, String exoticType) {

        
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalAge = animalAge;
        this.medicalCond = medicalCond;
        this.exoticType = exoticType;
    }
    public String getAnimalExoticType(){
        return this.exoticType;
    }

    
}