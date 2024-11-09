public class sousMatrice {
    public static int maxMatrice(int [][] matrice){
        int som=0; int max=matrice[0][0];
        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice.length;j++){
                for(int n=i;n<matrice[i].length;n++){
                    for(int m=j;m<matrice[j].length;m++){
                        som=0;
                        for(int k1=i;k1<=n;k1++){
                            for(int k2=j;k2<=m;k2++){
                                som+=matrice[k1][k2];
                            }
                        }
                        if(som>max){
                            max=som;
                        }
                    }
                }
            }
        }
        return max;
    }
public static void main(String [] args){
    int[][] mat={{1,-3,4},{3,0,0},{7,5,3}};
    System.out.println(maxMatrice(mat));
}
}