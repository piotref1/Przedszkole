package Classes;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Parent extends User{
    private int kidIndex;
    private String address;
    private String phoneNumber;

    public int getKidIndex() {
        return kidIndex;
    }

    public void setKidIndex(int kidIndex) {
        this.kidIndex = kidIndex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void checkInformationAboutParent() {
        System.out.println(kidIndex + " " + address + " " + phoneNumber + " ");
    }

    public void checkInformationAboutTimetable(){

        Timetable instance = Timetable.getInstance();
        Collections.sort(instance.getTimetable(), Comparator.comparingInt(partOfTimetable -> partOfTimetable.numberOfTheDay));
        if(!instance.getTimetable().isEmpty()){
            Iterator<PartOfTimetable> iterator=instance.getTimetable().iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }else{
            System.out.println("Pusty plan");
        }
    }

}
