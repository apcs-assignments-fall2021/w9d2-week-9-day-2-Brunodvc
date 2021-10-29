public class Person {
    //instance variables
private String firstname;
private String lastname;
//constructor
    public Person(String a, String b){
        this.firstname = a;
        this.lastname = b;
    }
    public void dosomething(){
        System.out.println("I am watching netflix");
    }
    public String toString(){
        return (firstname + " " + lastname);
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirstname(String newname){
        this.firstname = newname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
