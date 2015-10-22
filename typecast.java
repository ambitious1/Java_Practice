public class typecast {
    
    public static void main(String[] args) {
        byte b = 10;
        int i;
        //Type promotion - Example the byte value gets promtoted to an int value 
        i = b;
        System.out.println(i);
        
        double d;
        d = b;

        System.out.println(d);

        //Explicit casting
        double foo = 125.89;

        int ans = (int) foo;
        System.out.println(ans);

        float f = 345.67f;
        ans = (int) f;
        System.out.println(ans);

        
    }
}
