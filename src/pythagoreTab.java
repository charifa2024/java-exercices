public class pythagoreTab {
public static void pythagore(int[] T) {
    int prod=0;
    for(int i=0;i<T.length;i++){
        for(int j=0;j<T.length;j++){
            if(i!=j){
                prod=(T[i]*T[i])+(T[j]*T[j]);
                for(int k=0;k<T.length;k++){
                    if(prod==T[k]*T[k]){
                        System.out.println(T[i]+" "+T[j]+" "+T[k]);
                    }
                }
            }
            prod=0;
        }
    }  
}
public static void main(String[] args) {
    int[] T = {1,2,3,4,5};
    pythagore(T);
}
}