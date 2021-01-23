package Classes;

public class Toys {
    public String typeOfToy;
    public int serialNumber;
    public double price;

    public String getTypeOfToy() {
        return typeOfToy;
    }

    public void setTypeOfToy(String typeOfToy) {
        this.typeOfToy = typeOfToy;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void checkInformationAboutToy() {
        System.out.println("Type: " + typeOfToy + " serialnumber: " + serialNumber + " price: " + price);
    }
}
