public class doublicatedValue {
    public static boolean doublicated(int[] tab1){
        int[] tab2=tab1;
        for(int i=0;i<tab1.length;i++){
            for(int j=i;j<tab2.length;j++){
                if (tab1[i]==tab2[j] && i!=j) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String[] args){
        int[] tableau={1,3,5,1,7};
        System.out.println("ce tableau contient des éléments dupliquées ?"+doublicated(tableau));
    }
}
