package Classes;

public class Events {
    private String typeOfEvent;
    private String prizes;
    private int placeOfEvent;

    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public void setPrizes(String prizes) {
        this.prizes = prizes;
    }

    public void setPlaceOfEvent(int placeOfEvent) {
        this.placeOfEvent = placeOfEvent;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public String getPrizes() {
        return prizes;
    }

    public int getPlaceOfEvent() {
        return placeOfEvent;
    }

    public void checkInformationAboutEvent() {
        System.out.println(typeOfEvent + " " + prizes + " " + placeOfEvent);
    }
}
