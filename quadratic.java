import java.util.*;

class Outer {
    static int a, b, c;
    static double discriminant;

    void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scan.nextInt();
        System.out.print("Enter b: ");
        b = scan.nextInt();
        System.out.print("Enter c: ");
        c = scan.nextInt();
    }

    int check() {
        if (a == 0) {
            System.out.println("IT IS NOT A QUADRATIC EQUATION");
            return 0;
        } else {
            discriminant = (b * b) - (4 * a * c);
            return 1;
        }
    }

    static class Inner {
        void cal() {
            System.out.println("THE EQUATION IS: " + a + "(x^2) + " + b + "(x) + " + c);

            if (discriminant > 0) {
                double r1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double r2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.println("ROOTS ARE REAL AND DISTINCT: " + r1 + " and " + r2);
            } else if (discriminant == 0) {
                double r = -b / (2.0 * a);
                System.out.println("ROOTS ARE REAL AND EQUAL: " + r + " and " + r);
            } else {
                double realPart = -b / (2.0 * a);
                double imagPart = Math.sqrt(-discriminant) / (2.0 * a);
                System.out.println("ROOTS ARE COMPLEX: " + realPart + " + " + imagPart + "i and " + realPart + " - " + imagPart + "i");
            }
        }
    }
}

class quadratic {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.getData();
        int result = o.check();

        if (result == 1) {
            Outer.Inner in = new Outer.Inner();
            in.cal();
        }
    }
}
