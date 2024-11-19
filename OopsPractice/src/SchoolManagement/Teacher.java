package SchoolManagement;

public class Teacher extends Person{

    double salary;
    String subject;

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public void displayDetails()
    {
        System.out.println("ID "+getId()+" Name "+getName()+"AGE: "+getAge()+"Subject" +getSubject()+"salary"+getSalary());
    }

}
