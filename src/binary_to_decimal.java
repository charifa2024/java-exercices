public class binary_to_decimal {
    public static int convertion (int n){
        int decimal=0;double k=0;
        while (n>0) {
            int rest=n%10;
            decimal=(int) (decimal+rest*Math.pow(2,k));
            n=n/10;
            k++;
        }
        return decimal;
    }
    public static void main (String[] args){
        System.out.println(convertion(1010));
    }
}
