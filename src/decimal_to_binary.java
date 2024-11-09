public class decimal_to_binary {
    public static String convertion(int n){
        if(n==0)
        return "0";
        String binary="";
        while (n>0) {
            int rest=n%2;
            binary=String.valueOf(rest)+binary;
            n=n/2;
        }
        return binary;
    }
    public static void main (String [] args){
        System.out.println(convertion(10));
    }
}
