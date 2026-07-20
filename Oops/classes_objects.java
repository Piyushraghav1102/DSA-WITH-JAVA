
class Car {
    String Colorcar;
    String Name;

    void Setcolorcar(String Colorcar) {
        this.Colorcar = Colorcar;
    }

    void Setname(String Name) {
        this.Name = Name;
    }

}

class GalgotiasStudents {
    String Name;
    String Class;
    double Rollno;

    GalgotiasStudents() {
        System.out.println("Piyush raghav");
    }

    void Setname(String Name) {
        this.Name = Name;
    }

    void SetClass(String Class) {
        this.Class = Class;
    }

    void SetRollno(double Rollno) {
        this.Rollno = Rollno;
    }

    // for the copy constructor
    GalgotiasStudents(GalgotiasStudents stu1) {// same class name When we make a constructer with same object name which
                                               // your want to copy from
        this.Class = stu1.Class;
        this.Name = stu1.Name;
        this.Rollno = stu1.Rollno;
    }
}

public class classes_objects {
    public static void main(String args[]) {

        GalgotiasStudents stu1 = new GalgotiasStudents();

        stu1.Setname("Piyush Raghav");
        stu1.SetClass("CS-AI SEC A");
        stu1.SetRollno(24006);
        System.out.println(stu1.Name + " " + stu1.Class + " " + stu1.Rollno);

        // Now we do the copy constructers
        GalgotiasStudents stu2 = new GalgotiasStudents(stu1);
        System.out.println(stu2.Name + " " + stu2.Class + " " + stu2.Rollno);

        Car c1 = new Car();
        c1.Setname("Xuv 700");
        c1.Setcolorcar("lexus Red");
        System.out.println(c1.Name + " " + c1.Colorcar);

    }
}
