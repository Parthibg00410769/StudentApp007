package ie.atu;

public class Studentdetails {
    private String name;
    private String email;
    private String course;

    public Studentdetails() {
        this.name = name;
        this.email = email;
        this.course = course;
    }
    public Studentdetails(String Student2name) {
        this.name = Student2name;

    }

    public Studentdetails(String Student3name, String Student3email, String Student3course) {
        this.name = Student3name;
        this.email = Student3email;
        this.course = Student3course;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
