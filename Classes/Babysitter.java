package Classes;

public class Babysitter extends Employee{
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void checkInformationAboutBabysitter(){
        System.out.println(specialization);
    }
}
