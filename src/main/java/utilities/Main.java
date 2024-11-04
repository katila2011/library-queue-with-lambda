package utilities;

import models.Library;
import models.SchoolPersonnel;
import services.impl.LibraryServicesImpl1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Library> schbooks = new HashMap<>();

        LibraryServicesImpl1 libraryServicesImpl1 = new LibraryServicesImpl1();

        Library book1 = new Library("Simplified Physics",3);
        Library book2 = new Library("Maths for All",1);
        Library book3 = new Library("Nigeria History",6);
        Library book4 = new Library("Biology",2);
        Library book5 = new Library("Geography",10);

        schbooks.put(1, book1);
        schbooks.put(2, book2);
        schbooks.put(3, book3);
        schbooks.put(4, book4);
        schbooks.put(5, book5);

        //Without Lambda Expression
        /*libraryServicesImpl1.addBooksToList(schbooks.put(1,book1));
        libraryServicesImpl1.addBooksToList(schbooks.put(2,book2));
        libraryServicesImpl1.addBooksToList(schbooks.put(3,book3));
        libraryServicesImpl1.addBooksToList(schbooks.put(4,book4));
        libraryServicesImpl1.addBooksToList(schbooks.put(5,book5));*/

        //With Lambda Expression
        schbooks.forEach((key, book) -> libraryServicesImpl1.addBooksToList(book));

        //Level 1 - 6 represents JSS1 - SSS3, while level 7 represents a teacher
        SchoolPersonnel schPerson1 = new SchoolPersonnel("Chike Obi",7,"Maths for All2");
        SchoolPersonnel schPerson2 = new SchoolPersonnel("Majid",1,"Nigeria History");
        SchoolPersonnel schPerson3 = new SchoolPersonnel("Blessing",3,"Biology");
        SchoolPersonnel schPerson4 = new SchoolPersonnel("Nohim",2,"Biology");
        SchoolPersonnel schPerson5 = new SchoolPersonnel("Tomilola",6,"Simplified Physics");
        SchoolPersonnel schPerson6 = new SchoolPersonnel("Ikedinobi",5,"Simplified Physics");
        SchoolPersonnel schPerson7 = new SchoolPersonnel("Muminat",7,"Biology");
        SchoolPersonnel schPerson8 = new SchoolPersonnel("Caleb",4,"Geography");

        libraryServicesImpl1.addPersonToQueue(schPerson1);
        libraryServicesImpl1.addPersonToQueue(schPerson2);
        libraryServicesImpl1.addPersonToQueue(schPerson3);
        libraryServicesImpl1.addPersonToQueue(schPerson4);
        libraryServicesImpl1.addPersonToQueue(schPerson5);
        libraryServicesImpl1.addPersonToQueue(schPerson6);
        libraryServicesImpl1.addPersonToQueue(schPerson7);
        libraryServicesImpl1.addPersonToQueue(schPerson8);

        System.out.println("Below is the Implementation");
        boolean valid1 = false;
        while (!valid1) {
            if (!libraryServicesImpl1.personQ.isEmpty()){
                System.out.println(libraryServicesImpl1.borrowBook());
            }else {
                System.out.println("Borrower's Queue empty now");
                valid1 = true;
            }
        }
    }
}
