public class MatriceDeterminant {
    public static int[][] sousMat(int [][] matrice,int row){
        int taille=matrice.length-1;
        int [][] new_mat=new int[taille][taille];
        int k=0;
        for(int i=0;i<taille;i++){//(taille)*(taille) fois new_mat[i][j]=matrice[][j+1];
            for(int j=0;j<taille;j++){
                if(k==row){k++;}
                if(k!=row){new_mat[j][i]=matrice[k][j+1];}
            }
            k++;
        }
        return new_mat;
    }
    public static int Determinant(int[][] A){
        int det=0; int[][] mat={};
        if (A.length==2) {
            det=A[0][0]*A[1][1]-A[1][0]*A[0][1];
        }
        else{
            int k=1;
            for(int i=0;i<A.length;i++){
                mat=sousMat(A,i);
                det+=k*A[i][0]*Determinant(mat);
                k= -k;
            }
        }
        return det;
    }
public static void main(String []args){
    /** 
    int A[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    int B[][]=sousMat(A,2);
    for(int i=0;i<4;i++)
    for(int j=0;j<4;j++)
    System.out.println("B["+i+"]["+j+"]="+B[i][j]);*/
    int [][] A={{0,1,4,-2},{1,2,0,0},{6,1,3,1},{2,-3,6,0}};
    System.out.println("A: "+Determinant(A));
    int [][] B={{1,2,3},{4,5,6},{7,8,9}};
    System.out.println("B: "+Determinant(B));
    int [][] C={{3,5},{7,2}};
    System.out.println("C: "+Determinant(C));
    int [][] D={{2,3,1,5,4},{1,0,2,3,5},{4,1,3,2,0},{5,2,0,1,3},{3,4,5,0,2}};
    System.out.println("D: "+Determinant(D));

}
}