public class carreMagic {
    public static boolean isMagic(int[][] A){
        int somD1=0;int somD2=0;int somC=0;int somL=0;
        for (int i=0 , k=A.length-1;i<A.length;i++){
            somD1 += A[i][i];
            somD2 += A[i][k];
            k--;
          
        }
        if(somD1!=somD2){
            return false;
        }
                
        int[] tabC=new int[A.length];
        for (int i=0 ;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                somC+=A[i][j];
            }
            tabC[i]=somC;
            somC=0;
        }
        for(int i=0;i<tabC.length-1;i++){
            if(tabC[i]!=tabC[i+1])
            return false;
        }
        int[] tabL=new int[A.length];

        for (int i=0 ;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                somL+=A[j][i];
            }
            tabL[i]=somL;
            somL=0;
        }
        for(int i=0;i<tabL.length-1;i++){
            if(tabL[i]!=tabL[i+1])
            return false;
        } 
        return true;
    }
    public static void main(String args[]){
        int[][] A={{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(isMagic(A));
    }
}
