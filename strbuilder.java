public class strbuilder {
    
    public static void main(String[] args) {
        //Inefficient        
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder";
        
        //This concatenates several strings together, and set it to a variable called info.

        System.out.println(info);

        //More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Travis.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        //Another way
        StringBuilder s = new StringBuilder();

        s.append("My name is Roger. ")
            .append(" ")
            .append("I am a skydiver");
    
        System.out.println(s.toString());
    }
}
