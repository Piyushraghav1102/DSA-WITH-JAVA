
class Mammals {
    String Dolphins;
    int speed;

    void eats() {
        System.out.print("Dolphins eats small fishes");
    }
}

// multilevel inheritance
class ability extends Mammals {
    String Deathly;
    int speed;

    void arcade() {
        System.out.println("Dolphins can kill sharks");
    }
}

// Starts the Heirarchial level inheritance
class AKTU {
    int CAE1;
    int CAE2;
    int PUTs;

    int Examcalculation(int nums[]) {

        int n = nums.length;
        int totalaverage = 0;
        for (int i = 0; i < n; i++) {
            totalaverage += nums[i];
        }

        int Average = totalaverage / n;

        System.out.print("Average CGPA of University:- " + Average);
        return Average;
    }
}

class tier1 extends AKTU {

    void Internals() {
        System.out.println("These are done on the basis of internals ");
    }

}

class tier2 extends AKTU {

    void Internals() {
        System.out.println("These are done on the basis of internals in tier 2 ");
    }

}

// Starts the Heirarchial level inheritance

public class Inheritence {

    public static void main(String args[]) {

        // ability dolphins1 = new ability();
        // dolphins1.arcade();

        int arr[] = { 98, 76, 87, 56, 89 };
        tier2 stu1 = new tier2();

        stu1.Examcalculation(arr);

    }
}
