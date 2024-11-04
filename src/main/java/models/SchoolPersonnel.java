package models;

public class SchoolPersonnel {
    String name;
    int level;
    String bookToBorrow;

    public SchoolPersonnel(String name, int level, String bookToBorrow) {
        this.name = name;
        this.level = level;
        this.bookToBorrow = bookToBorrow;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getBookToBorrow() {
        return bookToBorrow;
    }

    @Override
    public String toString() {
        return "SchoolPersonnel{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", bookToBorrow='" + bookToBorrow + '\'' +
                '}';
    }
}
