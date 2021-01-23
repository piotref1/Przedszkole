package Classes;

public class ForKidsThreePlus extends Toys{

    private String nameOfToy;

    public String getNameOfToy() {
        return nameOfToy;
    }

    public void setNameOfToy(String nameOfToy) {
        this.nameOfToy = nameOfToy;
    }

    public void checkInformationAboutToy() {
        System.out.println("Type: " + typeOfToy + " serialnumber: " + serialNumber + " price: " + price + " Name: "
        + nameOfToy);
    }
}
