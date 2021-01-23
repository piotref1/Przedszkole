package Classes;

import java.util.*;

public class Principal extends User {

    public List<Kid> kidSystemList = new ArrayList<Kid>();
    public List<Employee> employeeSystemList = new ArrayList<Employee>();
    public List<Toys> toysSystemList = new ArrayList<Toys>();

    public void addEmployeeToSystem(Employee employee) {
        employeeSystemList.add(employee);
    }

    public void addBabysitterToGroup(Babysitter babysitter, Group group) {
        for(Group grou : babysitter.groupList) {
            if(grou==group) {
                grou.babysitterListGroup.add(babysitter);
            }
        }
    }

    public void addChildToSystem(Kid kid) {
        kidSystemList.add(kid);
    }

    public void deleteChildFromSystem(Kid kid) {
        kidSystemList.remove(kid);
    }

    public void deleteEmployeeFromTheSystem(Employee employee) {
        employeeSystemList.remove(employee);
    }

    public void deleteBabysitterFromTheGroup(Babysitter babysitter, Group group) {
        for(Group grou : babysitter.groupList) {
            if(grou==group) {
                for(Babysitter babysitterr : grou.babysitterListGroup) {
                    if(babysitterr==babysitter) {
                        grou.babysitterListGroup.remove(babysitter);
                    }
                }
            }
        }
    }

    public void buyToys(Toys toy) {
        toysSystemList.add(toy);
    }

    public void modifyInformationAboutTimetable(String oldDay, String oldBabysitter, String oldGroup, String oldHour, PartOfTimetable newPartOfTimetable) {

        Timetable instance = Timetable.getInstance();

        if (!instance.getTimetable().isEmpty()) {
            instance.getTimetable().removeIf(data -> data.group.equals(oldGroup) && data.babysitter.equals(oldBabysitter) && data.day.equals(oldDay) && data.hour.equals(oldHour));
        } else {
            System.out.println("Pusty plan");
        }

        instance.getTimetable().add(newPartOfTimetable);
    }

    public void checkListOfEmployeesInSystem() {
        System.out.println("Pracownicy w systemie: ");
        for(Employee employee : employeeSystemList) {
            System.out.println(employee.getName() + " " + employee.getSurname());
        }
    }

    public void checkListOfKidsInSystem() {
        System.out.println("Dzieci w systemie: ");
        for(Kid kid : kidSystemList) {
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
