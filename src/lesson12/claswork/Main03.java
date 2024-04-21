package lesson12.claswork;

public class Main03 {
    /*
    de tiparit toate cifrele de la 1 la 50, care nu se impart la 7
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 7 != 0){
                System.out.print(i + " ");
            }
        }
    }
}


