package p1.p2;

//Class c1 has to be a regular class it can't be a public class because it would be expected to named public class c1
class c1 {
    public void m1(){
        System.out.println("m1 of c1");
    }
    
    public static void main(String[] args) {
        c1 obj = new c1();
        obj.m1();
    }
}

/*
 * javac -d . packages.java
 * Forces the compiler to create a package called p1, within the current working directory
 * And it puts the compiled java file within the p1 folder
 *
 * javac -d .. packages.java 
 * creates the package in the parent directory
 * 
 * package p1.p2;
 * creates a sub-package, it is the same as the examples above but the compiled file is now placed within the p2 folder
 *
 * */
