package model;

public class Department {
    private String name;
    private String code;

    public Department(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public void displayInfo() {
        System.out.println("Dept Name: " + name);
        System.out.println("Dept Code: " + code);
    }
}

