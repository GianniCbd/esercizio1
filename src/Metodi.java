public class Metodi {
    public static int moltiplica(int a, int b){
        return a*b;
    }
    public static String concatena(String s, int i){
        return s+i;
    }

    public static String[] inserisciInArray(String[] array, String s) {
        String[] nuovoArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++){
            nuovoArray[i] = array[i];
        }
        nuovoArray[2] = s;
        nuovoArray[3] = array[3];
        nuovoArray[4] = array[4];
        return nuovoArray;
    }

}