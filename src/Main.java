//esercizio 1
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Il prodotto di " + a + " e " + b + " è: " + Metodi.moltiplica(a, b));

        String s = "Ciao";
        int i = 10;
        System.out.println("La concatenazione di " + s + " e " + i + " è: " + Metodi.concatena(s, i));

        String[] array = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
        String s2 = "Sei";
        String[] nuovoArray = Metodi.inserisciInArray(array, s2);
        for (String stringa : nuovoArray) {
            System.out.println(stringa);
        }
        }
}

