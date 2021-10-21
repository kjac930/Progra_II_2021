package Entities;

public class person extends Entity {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private char gender;
    private int age;
    private Type type;
    public person(){}
    public person(final Type type){
        this.type = type;
    }
    public void setFirstName(final String value){this.firstName = value;}
    public String getFirstName(){return this.firstName;}
    public void setLastName(final String value){this.lastName = value;}
    public String getLastName(){return this.lastName;}

}
