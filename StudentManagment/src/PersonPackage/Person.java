package PersonPackage;

public abstract class Person {
    private String firtname;
    private String lastname;
    private int age;
    private int svn;

    private Address address;

    public Person(String firtname, String lastname, int age, int svn, Address address) {
        this.address = address;
        this.firtname = firtname;
        this.lastname = lastname;
        this.age = age;
        this.svn = svn;
    }

    public Person() {

    }

    public String getFirstname() {
        return firtname;
    }

    public void setFirstname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSvn() {
        return svn;
    }

    public void setSvn(int svn) {
        this.svn = svn;
    }
    public boolean isAdult(){
        return age >= 18;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
