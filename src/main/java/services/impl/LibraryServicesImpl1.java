package services.impl;

import models.Library;
import models.SchoolPersonnel;
import services.LibraryServices;
import utilities.PersonStatusComparator;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class LibraryServicesImpl1 implements LibraryServices {

    public PriorityQueue<SchoolPersonnel> personQ = new PriorityQueue<>();
    ArrayList<Library> allMybooks = new ArrayList<Library>();

    public LibraryServicesImpl1(/*String bookName, int bookQty*/) {
        //super(bookName, bookQty);

        //Without lambda
        this.personQ = new PriorityQueue<>(new PersonStatusComparator());

    }

    @Override
    public void addPersonToQueue(SchoolPersonnel schPerson) {
        personQ.add(schPerson);
    }

    @Override
    public void addBooksToList(Library library) {
        allMybooks.add(library);
    }

    public ArrayList<Library> getAllMybooks() {
        return allMybooks;
    }

    @Override
    public String borrowBook() {
        if(personQ.isEmpty()){
            return "Borrower's Queue is empty";
        }

        SchoolPersonnel schoolPersonnelhere = personQ.poll();

        for (Library book : allMybooks) {
            if (book.getBookName2().equals(schoolPersonnelhere.getBookToBorrow())) {
                if (book.getBookQty2() > 0) {
                    book.bookQty2 -= 1;
                    return schoolPersonnelhere.getName() + " has borrowed " + book.getBookName2();
                } else {
                    return "This book is all lent out";
                }
            }
        }
        return "Requested book is not available in the library";
    }

//        try {
//            assert schoolPersonnelhere != null;
//            if (allMybooks.contains(schoolPersonnelhere.getBookToBorrow())){ // && (Integer.parseInt(String.valueOf(allMybooks.contains(schoolPersonnelhere.getBookToBorrow())))) < 1) {
//                return "This book is all lent out";
//            } else {
//
//                schoolPersonnelhere = personQ.poll();
//
//                return schoolPersonnelhere.getName() + " has borrowed " + getAllMybooks().toString();
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

}
