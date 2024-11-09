public class sousArray {
    public static double subArray(double[] tab){
        double max = tab[0];
        double somme=0.0;
        for(int i=0;i<tab.length;i++){
            for(int j=i; j<tab.length; j++){
                somme=0.0;
                for(int k=i; k<=j ;k++){
                    somme=somme+tab[k];
                }
                if(somme>max){
                    max=somme;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        double[] array = {1,-2,4,6,8,7,3};
        System.out.println(subArray(array));
    }
    
}
