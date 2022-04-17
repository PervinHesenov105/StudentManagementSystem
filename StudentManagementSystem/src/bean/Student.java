
package bean;


public class Student extends Person{
    private String schoolName;
    private int scholarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Name=" + getName() + ", Surname=" + getSurname()+", schoolName=" + schoolName + ", scholarship=" + scholarship;
    }
    
}
