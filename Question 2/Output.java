import java.util.*;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TeacherDetails t = new TeacherDetails();
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();

        //Inputing the details of the Teacher
        System.out.println("Enter the name of the teacher");
        String tname=sc.next();
        System.out.println("Enter the subject that the teacher teaches");
        String tsubject=sc.next();
        System.out.println("Enter years of experience of the teacher");
        String tyrsOfExp=sc.next();
        
        t.setTname(tname);
        t.setSubject(tsubject);
        t.setYrsOfExp(tyrsOfExp);

        //Inputing the details of the First Student
        System.out.println("Enter the name of the first student");
        String sname=sc.next();
        System.out.println("Enter degree that the student has taken");
        String sdegree=sc.next();
        System.out.println("Enter the name of student college");
        String scollege=sc.next();
        
        s1.setSname(sname);
        s1.setDegree(sdegree);
        s1.setCollege(scollege);

        //Inputing the details of the Second Student
        System.out.println("Enter the name of the second student");
        String sname1=sc.next();
        System.out.println("Enter degree that the first student has taken");
        String sdegree1=sc.next();
        System.out.println("Enter the name of first student college");
        String scollege1=sc.next();
        
        s2.setSname(sname1);
        s2.setDegree(sdegree1);
        s2.setCollege(scollege1);

        // Priting the first output
        System.out.println(s1.getSname()+" takes "+t.getSubject()+" class under "+t.getTname()+" sir");

        // Priting the second output
        System.out.println(t.getTname()+" sir teaches "+t.getSubject()+" to "+s2.getSname()+" who reads as "+s2.getDegree()+" student in "+s2.getCollege()+" college");
    }
}
