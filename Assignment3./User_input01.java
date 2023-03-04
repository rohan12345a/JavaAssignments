package JAVA_LAB_ASSIGNMENTS;
import java.util.*;
public class User_input01 {
    Scanner sc= new Scanner(System.in);
    String name, dob;
    int prn;
    Object[] array= new Object[3];

    public Object[] inputStudent(){
        System.out.println("Enter the name");
        name= sc.next();

        System.out.println("Enter prn of student");
        prn= sc.nextInt();

        System.out.println("Enter dob of student");
        dob= sc.next();

        array[0]= name;
        array[1]= prn;
        array[2]= dob;
        return array;
    }


    public Student01 create_student(){
        Object[] details= this.inputStudent();
        Student01 st= new Student01();
        st.setName((String)details[0]);
        st.setPrn((Integer)details[1]);
        st.setDob((String)details[2]);
        return st;
    }

    public ArrayList <Student01> createStudentlist(){
        Object[] details= new Object[3];
        System.out.println("ENter no of records u want");
        int n= Integer.parseInt(sc.next());

        ArrayList<Student01> students =new ArrayList<Student01>();// creating obj type student

        for(int i=0;i<n;i++){
            System.out.println("Enter details \n");
            details= this.inputStudent();
            students.add(new Student01());
            students.get(i).setName((String)details[0] );
            students.get(i).setPrn((Integer)details[1]);
            students.get(i).setDob((String)details[2]);

        }
        return students;
    }

    public void display(ArrayList<Student01> std){
        System.out.println("The list is \n");
        for(Student01 s: std){
            System.out.println("The name is"+s.getName()+ "Prn is"+ s.getPrn()+ "Its dob is"+ s.getDob());
        }
    }


    public Student01 searchStudent(ArrayList<Student01> std){
        System.out.println("ENter prn of student");
        int Prn= Integer.parseInt(sc.next());
        for(Student01 s: std){
            int prns= s.getPrn();
            if(Prn==prns){
                System.out.println("The index of student is"+std.indexOf(s));
                System.out.println("The name is"+ s.getName() +"Prn is"+ s.getPrn()+" DOb is "+ s.getDob());
                return s;
            }
        }

        return null;
    }

    public void updateStudent(ArrayList<Student01> std){
        System.out.println("Enter index of stud u wanaa update \n");
        int x= Integer.parseInt(sc.next());
        System.out.println("Enter new prn");
        std.get(x).setName(sc.next());
        System.out.println("Enter new prn");
        std.get(x).setPrn(Integer.parseInt(sc.next()));

        System.out.println("Enter new dob");
        std.get(x).setDob(sc.next());

        System.out.println(x + "The new name os stu is"+ std.get(x).getName()+"\n The new prn is"+ std.get(x).getPrn()+ "\n The new dob is"+ std.get(x).getDob());
    }
}


