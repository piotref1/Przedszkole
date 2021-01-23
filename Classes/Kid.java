package Classes;

public class Kid {
    private String name;
    private String surname;
    private String birthDate;
    private String allergens;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public void checkInformationAboutKid() {
        System.out.println(name + " " + surname + " " + birthDate + " " + allergens);
    }
}
