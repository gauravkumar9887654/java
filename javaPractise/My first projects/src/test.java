import java.util.ArrayList;
import java.util.Iterator;

class practise {
    int a, b;

    practise(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }
}

class Student {
    String Name;
    int id, RollNo;

    Student(String name, int id, int RollNo) {
        this.id = id;
        this.Name = name;
        this.RollNo = RollNo;
    }

}

class child {
    public void print() {
        System.out.println("i am child");
    }
}

class parent extends child {
    public void print() {
        System.out.println("i am inheritrd child");
    }

    public void printParnt() {
        System.out.println("i am parent");
    }
}

public class test {
    public static void main(String[] args) {
        practise p = new practise(6, 7);
        int res = p.add();

        System.out.println("Hello World");
        System.out.println(2 + "5");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int a = 8;
        int b = 9;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + ": " + b);

        if (a > b || a <= 8) {
            System.out.println("true");
        }
        String str = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                str += '*';
            }
            str += "\n";

        }
        System.out.println(str);

        String str2 = "";
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                str2 += j;

            }
            str2 += "\n";
        }
        System.out.println(str2);
        String str3 = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 9 - i; j >= 1; j--) {
                str3 += j;
            }
            str3 += "\n";
        }
        System.out.println(str3);
        System.out.println(" result a " + res);

        int[] Nums = new int[] { 4, 5, 6, 7, 8 };
        int sum = 0;

        int i1 = 0;
        while (i1 < Nums.length) {
            sum += Nums[i1];
            i1++;
        }
        System.out.println("sum of arr " + sum);

        Student s1 = new Student("Gaurav Kumar", 8, 12);
        Student s2 = new Student("Vikram", 7, 46);

        System.out.println("name :" + s1.Name + " id :" + s1.id + " RollNo :" + s1.RollNo);
        System.out.println("name :" + s2.Name + " id :" + s2.id + " RollNo :" + s2.RollNo);

        child c1 = new child();
        parent p1 = new parent();
        c1.print();
        p1.print();
        p1.printParnt();
        System.out.println("jhgfdsa");
        int[] arr6 = new int[6];
        int n = 0;
        for (int i = 0; i < 6; i++) {
            while (n < arr6.length) {
                arr6[n] = i;
                n++;
            }
        }
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i]);
        }
        String myName = "Gaurav";
        String nam = "gau";

        ArrayList<String> li = new ArrayList<String>();
        li.add("Gaurav");
        li.add("Vikram");
        li.add("Virat");
        li.add("Rohit Sharma");
        Iterator<String> itr = li.iterator();

        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

    }
}
