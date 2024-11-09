public class produitMatrice {
    public static int[][] produit(int[][] A,int[][] B){
        int [][] C=new int[2][2];
        C[0][0]=A[0][0]*B[0][0]+A[0][1]*B[1][0];
        C[0][1]=A[0][0]*B[0][1]+A[0][1]*B[1][1];
        C[1][0]=A[1][0]*B[0][0]+A[1][1]*B[1][0];
        C[1][1]=A[1][0]*B[0][1]+A[1][1]*B[1][1];
        return C;
    }
    public static void main (String [] args){
        int[][] mat1={{1,3},{6,2}};
        int[][] mat2={{0,5},{1,2}};
        int[][] mat=produit(mat1, mat2);
        System.out.println("le produit :");
        for(int i=0 ; i<mat1.length;i++){
            for(int j=0; j<mat1.length;j++){
                System.out.println("C["+i+"]["+j+"]="+ mat[i][j]);
            }
        }
    }
}

