class Account {
    //instance variables
    int a;
    int b;

    public void setData(int a, int b){
        /*Previous Version*/
        /* ~~~~~~~~~~~~~
         * a = a;
         * b = b;
         * */


        this.a = a; //this is the instance variable of Account = the local variable of setData function
        this.b = b; //same case
    }

    public void showData(){
        System.out.println("value of A = " + a);
        System.out.println("value of B = " + b);
    }

    public static void main(String[] args) {
        Account obj = new Account();
        obj.setData(2,3);
        obj.showData();
    
        Account obj2 = new Account();
        obj2.setData(4,5);
        obj2.showData();
    }
}
