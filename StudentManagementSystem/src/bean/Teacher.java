
package bean;


public class Teacher extends Person{
    private String schoolName;
    private double salary;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name=" + getName() + ", Surname=" + getSurname()+", schoolName=" + schoolName + ", salary=" + salary;
    }
   
    
    
    
    
}
