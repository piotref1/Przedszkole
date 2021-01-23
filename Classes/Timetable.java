package Classes;

import java.util.*;

public class Timetable {

    private static final Timetable INSTANCE = new Timetable();
    private static final List <PartOfTimetable> timetable = new LinkedList<PartOfTimetable>();


    private Timetable(){

    }

    public static Timetable getInstance(){
        return INSTANCE;
    }

    public void checkInformationAboutTimetable(){
        Collections.sort(timetable, Comparator.comparingInt(partOfTimetable -> partOfTimetable.numberOfTheDay));
        if(!timetable.isEmpty()){
            Iterator<PartOfTimetable> iterator=timetable.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }else{
            System.out.println("Pusty plan");
        }
    }

    public List <PartOfTimetable> getTimetable(){
        return timetable;
    }

}
