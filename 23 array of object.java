class student
{
    int rollno;
    String name;
    int marks;
}
class arrayofobjects
{
    public static void main(String[] args) 
    {
        student s1=new student();
        s1.rollno=1;
        s1.name="Adil";
        s1.marks=75;
        student s2=new student();
        s2.rollno=2;
        s2.name="shaik";
        s2.marks=74;
        student s3=new student();
        s3.rollno=3;
        s3.name="bot";
        s3.marks=73;
        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollno+" - "+students[i].name+" - "+students[i].marks);
        }
    }
}