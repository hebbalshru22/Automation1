package SchoolManagement;

public class Student extends Person {


    String course;
    int marks;
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }
    public void calculateGrade()
    {
if(marks>70)
{
    System.out.println("A");
}
else if(marks>=50)
{
    System.out.println("B");
}
else {
    System.out.println("C");
}
    }
    @Override
    public void displayDetails()
    {
        System.out.println("ID "+getId()+" Name "+getName()+"AGE: "+getAge()+
               "course:" +getCourse()+ "Marks"+getMarks());
    }
}
