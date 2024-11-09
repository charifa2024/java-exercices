public class somElemTab {
        public static int som(int n) {
            int s = 0;
            while (n != 0) {
                s += n % 10;
                n /= 10;         
            }
            return s;
        }
        public static int[] somTab(int[] T) {
            int[] r = new int[T.length];
            for (int i = 0; i < T.length; i++) {
                r[i] = som(T[i]);
            }
            return r;
        }
        
        public static void main(String[] args) {
            int[] tableau = {123, 45, 67};
            int[] r = somTab(tableau);
            for (int i = 0; i < r.length; i++) {
                System.out.println(r[i]);
            }
        }
    
}
