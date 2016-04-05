public class ArrayClass {
   // String name = "";

    String[] names = new String[10];

    public void insert() {
        names[0] = "Timothy";
        names[1] = "Allen";
        names[2] = "Ronnie";

    }

    public void displayArray() {
        for (String name : names) { //this is the loop for arrays similar to the foreach structure in PHP
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ArrayClass ac = new ArrayClass();
        ac.insert();
        ac.displayArray();
    }
}
