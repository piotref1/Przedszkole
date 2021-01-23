package Classes;

import java.util.*;

public class Employee extends User{

    public List<Group> groupList = new ArrayList<Group>();

    public void CreateChildGroup(int groupIndex) {
        Group group = new Group(groupIndex);
        groupList.add(group);
    }

    public void addTheChildToGroup(Group group, Kid kid) {
        for(Group grou : groupList) {
            if(grou==group) {
                grou.kidListGroup.add(kid);
            }
        }
    }

    public void removeTheChildFromGroup(Group group, Kid kid) {
        for(Group grou : groupList) {
            if(grou==group) {
                for(Kid kidd : grou.kidListGroup) {
                    if(kidd==kid) {
                        grou.kidListGroup.remove(kid);
                    }
                }
            }
        }
    }

    public void checkListOfChildrenInSystem(Principal principal) {
        for(Kid kid : principal.kidSystemList) {
            System.out.println(kid.getName() + " " + kid.getSurname());
        }
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
