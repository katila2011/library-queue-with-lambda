package services;

import models.Library;
import models.SchoolPersonnel;

@FunctionalInterface
public interface LibraryServices {

    void addPersonToQueue(SchoolPersonnel schPerson);

    default void addBooksToList(Library library){}

    default String borrowBook(){
        return "";
    };

}
