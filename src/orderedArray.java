public class orderedArray {
    private int[] arr;

    public orderedArray(int[] tab) { // constructeur
        if (tab.length == 0) {
            System.out.println("the table is empty !!");
            return;
        }
        boolean res = true;
        
        // Tester si le tableau est trié ou non 
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                res = false;
                break;
            }
        }

        if (res) {
            arr = tab;
        } else {
            int[] new_tab = new int[tab.length];
            int[] temp = tab;
            int max=tab[0];
            for(int i=0;i<tab.length;i++){
                if(tab[i]>max){
                    max=tab[i];
                }
            }
            
            for (int k = 0; k < tab.length; k++) {
                int min = temp[0];
                int pos = 0;
                
                // Trouver le minimum dans le tableau temporaire
                for (int i = 0; i < temp.length; i++) {
                    if (temp[i] < min) {
                        min = temp[i];
                        pos = i;
                    }
                }
                
                new_tab[k] = min;
                
                // Remplacer le minimum trouvé par une valeur très élevée
                temp[pos] = max; 
            }
            arr = new_tab;
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }

    public boolean checkArray(int[] tab) {
        if (tab.length == 0) {
            System.out.println("the table is empty !!");
            return false;
        }
        boolean res = true;
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                res = false;
                break;
            }
        }
        return res;
    }


    public void addElement(int el) {
        int[] new_tab = new int[arr.length + 1];
        int pos = 0;

        // Trouver la position d'insertion
        while (pos < arr.length && arr[pos] < el) {
            pos++;
        }

        // Copier les éléments avant la position d'insertion
        for (int i = 0; i < pos; i++) {
            new_tab[i] = arr[i];
        }

        // Insérer l'élément
        new_tab[pos] = el;

        // Copier les éléments après la position d'insertion
        for (int i = pos; i < arr.length; i++) {
            new_tab[i + 1] = arr[i];
        }

        arr = new_tab;
    }

    public static void main(String[] args) {
        int[] tab = {-4, 3, 6, 0,-1};
        orderedArray ordered = new orderedArray(tab);
        System.out.println(ordered.toString());
        ordered.addElement(1);
        System.out.println(ordered.toString());
    }
}
