package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        demoArrays();
    }

    private static void demoArrays() {
        int[] x =  {10,5,1};
        int[] y = {10,5,1};
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("x.hashcode()= "+x.hashCode());
        System.out.format("x.hashcode()= %x%n",x.hashCode());
        System.out.format("Arrays.hashcode(x)= %x%n",Arrays.hashCode(x));
        System.out.println("y.hashcode()= "+y.hashCode());
        System.out.println("Arrays.hashcode(y)= "+Arrays.hashCode(y));
        System.out.println("Arrays.toString(x) = "+ Arrays.toString(x));
        System.out.println("Arrays.toString(y) = "+ Arrays.toString(y));
        System.out.println("x==y? : "+ (x==y)); // compare with address
        System.out.println("x.equal(y)? : "+ (x.equals(y))); // compare with address
        System.out.println("Arrays.equal(x,y)? : "+ (Arrays.equals(x,y))); // compare with content in array

        // sort
        Arrays.sort(x);
        System.out.println("Arrays.sort(x)"+Arrays.toString(x));
        //fill
        Arrays.fill(x,(int)(10*Math.random()));
        System.out.println("fill x with (int)(10*Math.random()) : "+Arrays.toString(x));

        Simple[] s = { new Simple(10,"Sss"), new Simple(51,"ppp"),new Simple(34,"Sas")};
        System.out.println("Simple array : "+Arrays.toString(s));
    }
}