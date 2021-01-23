package Classes;

public class Menu {
    private String typeOfMeal;
    private String composition;

    public String getTypeOfMeal() {
        return typeOfMeal;
    }

    public void setTypeOfMeal(String typeOfMeal) {
        this.typeOfMeal = typeOfMeal;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public void checkInformationAboutMenu() {
        System.out.println(this.typeOfMeal + " " + this.composition);
    }

    public void setInformationAboutMenu(String typeOfMeal, String composition) {
        this.typeOfMeal = typeOfMeal;
        this.composition = composition;
    }
}
