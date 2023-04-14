package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDataProvider implements SuspectAggregate {

    private final Collection<Student> students = new ArrayList<Student>();

    public StudentDataProvider() {
        students.add(new Student("Jan", "Student", "12345678", 17));
        students.add(new Student("Janusz", "Studencki", "32765478",23));
        students.add(new Student("Tomek", "Akdademicki", "67800999",19));
    }

    public Collection<Student> getAllStudentsCitizens() {
        return students;
    }

    public Iterator<Suspect> iterator() {
        return new Iterator<Suspect>() {

            private Iterator<Student> studentIterator = students.iterator();
            public boolean hasNext() {
                return studentIterator.hasNext();
            }

            public Suspect next() {
                return studentIterator.next();
            }

            public void remove() {
                studentIterator.remove();
            }
        };
    }
}
