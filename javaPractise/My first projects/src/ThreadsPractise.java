import java.util.Scanner;

class TestJoinMethod1 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {

            try {
                sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();
        TestJoinMethod1 t3 = new TestJoinMethod1();
        TestJoinMethod1 t4 = new TestJoinMethod1();
        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println();
        }

        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            System.out.println();
        }

        t3.start();
        try {
            t3.join();
        } catch (Exception e) {
            System.out.println();
        }
        t4.start();
    }
}

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

class TestPolymorphism {
    public static void main(String args[]) {
        Bank b;
        SBI s = new SBI();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}

class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello ");
        sb.append("World");
        System.out.println(sb);
        String s1 = "Hello";

        System.out.println(s1);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String button = sc.next("");
        switch (button) {
            case "+":
                System.out.println("sum" + a + b);
                break;
            case "-":
                System.out.println("sum" + (a - b));
                break;
        }
    }
}