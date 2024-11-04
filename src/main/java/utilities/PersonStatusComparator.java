package utilities;

import models.SchoolPersonnel;

import java.util.Comparator;

public class PersonStatusComparator implements Comparator<SchoolPersonnel> {

    @Override
    public int compare(SchoolPersonnel p1, SchoolPersonnel p2) {

        return Integer.compare(p2.getLevel(),p1.getLevel());
    }
}