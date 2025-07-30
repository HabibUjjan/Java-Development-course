package model;

public class StudentClass {
    private String className;

    public StudentClass(String className) {
        this.className = className;
    }

    public String getName() {
        return className;
    }

    @Override
    public String toString() {
        return className;
    }
}
