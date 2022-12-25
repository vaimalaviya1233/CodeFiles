import static java.lang.System.out;
import java.util.*;
//import java.io.*;
//import java.lang.*;
import java.lang.Math;

class Mathew {
    private double u1, u2, u3, v1, v2, v3, z1, z2, z3;// instance variables for both calculations

    Mathew() {
    }

    Mathew(double a1, double a2, double a3) {// For magnitude
        this.u1 = a1;
        this.u2 = a2;
        this.u3 = a3;
    }

    Mathew(double a1, double a2, double a3, double b1, double b2, double b3) {// for dotproduct
        this.u1 = a1;
        this.u2 = a2;
        this.u3 = a3;
        this.v1 = b1;
        this.v2 = b2;
        this.v3 = b3;
    }

    public static void main(String[] args) {
        double u1, u2, u3, v1, v2, v3;// needed variables
        String ent = "Enter ";

        Scanner scr = new Scanner(System.in);

        out.println("1 : dotproduct");
        out.println("2 : Magnitude(length)");
        out.print("Enter choice : ");
        int resulte = scr.nextInt();

        if (resulte == 1) {
            out.print(ent + "u1 : ");
            u1 = scr.nextDouble();
            out.print(ent + "u2 : ");
            u2 = scr.nextDouble();
            out.print(ent + "u3 : ");
            u3 = scr.nextDouble();
            out.print(ent + "v1 : ");
            v1 = scr.nextDouble();
            out.print(ent + "v2 : ");
            v2 = scr.nextDouble();
            out.print(ent + "v3 : ");
            v3 = scr.nextDouble();
            Mathew calculus = new Mathew(u1, u2, u3, v1, v2, v3);
            out.print(calculus.dotproduct());
        } else if (resulte == 2) {
            out.print(ent + "u1 : ");
            u1 = scr.nextDouble();
            out.print(ent + "u2 : ");
            u2 = scr.nextDouble();
            out.print(ent + "u3 : ");
            u3 = scr.nextDouble();
            Mathew magnitute = new Mathew(u1, u2, u3);
            out.print(magnitute.magnitute());
        }
        scr.close();
    }

    public String magnitute() {// magnitute calculations
        String result = "";
        Double squplus = (squares(this.u1) + squares(this.u2) + squares(this.u3));
        result += (("Magnitute of give value is :--> " + Math.round(Math.sqrt(squplus))));
        return result;
    }

    public String dotproduct() {// dot product calculations
        String result = "";
        this.z1 = getu1() * getv1();
        this.z2 = getu2() * getv2();
        this.z3 = getu3() * getv3();
        result += ("Dot product is : " + (getz1() + getz2() + getz3()));
        return result;
    }

    private double squares(double val) {// gets square of given value
        return val * val;
    }

    public double getu1() {
        return this.u1;
    } // object get methods

    public double getu2() {
        return this.u2;
    } // object get methods

    public double getu3() {
        return this.u3;
    }// object get methods

    public double getv1() {
        return this.v1;
    }// object get methods

    public double getv2() {
        return this.v2;
    }// object get methods

    public double getv3() {
        return this.v3;
    }// object get methods

    public double getz1() {
        return this.z1;
    }// object get methods

    public double getz2() {
        return this.z2;
    }// object get methods

    public double getz3() {
        return this.z3;
    }// object get methods
}