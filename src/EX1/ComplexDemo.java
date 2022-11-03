package EX1;

import java.util.Scanner;

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        create
        Complex cpl=new Complex();

        Complex cpl1 = new Complex(sc.nextDouble(),sc.nextDouble());
//        addComplex
        System.out.println("add Complex: "+cpl.addComplex(cpl1));
//        subtractComplex
        System.out.println("subtract Complex: "+cpl.subtractComplex(cpl1));
//        multiplyComplex
        System.out.println("multiply Complex: "+cpl.multiplyComplex(cpl1));
//        divideComplex
        System.out.println("divide Complex: "+cpl.divideComplex(cpl1));
//        cpl1.setRP(6);cpl1.setIMP(4);
        System.out.println(cpl1.toString());


    }
}
