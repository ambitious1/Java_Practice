class Frog {
    
    public int id;
    private String name;
    
    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String toString() {
        /*Original but inefficient since there is a lot of string objects flying around and integer being converted to a string
         *return id + ": " + name;
         * */
        
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
        
        //Same as printf();
        /*return String.format("%-4d: %s", id, name);*/
    }
}



public class tostr {
    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Roger");


        System.out.println(frog1);
        System.out.println(frog2);
    }
}
