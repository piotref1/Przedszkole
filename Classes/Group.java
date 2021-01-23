package Classes;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public int groupIndex;
    public List<Kid> kidListGroup = new ArrayList<Kid>();
    public List<Babysitter> babysitterListGroup = new ArrayList<Babysitter>();
    public Group(int groupIndex) {
        this.groupIndex = groupIndex;
    }

    public void checkInformationAboutGroup() {
        System.out.println("Index Grupy: " + groupIndex);
        System.out.println("Dzieci: ");
        for(Kid kid : kidListGroup) {
            System.out.println(kid.getName() + " " + kid.getSurname());
        }
        System.out.println("Opiekunki: ");
        for(Babysitter babysitter : babysitterListGroup) {
            System.out.println(babysitter.getName()+ " " +babysitter.getSurname() + " " + babysitter.getSpecialization());
        }
    }

}
