package consltation.cons4;

public class Eample01 {
    public static void main(String[] args) {
        int[] array = {7,95,12,3,8};

        for (int i= 0; i < args.length; i++){
            System.out.print(array[i] + " ");
        }
        for (int i= 0; i < args.length; i++) {
            array[i] *= array[i] < 0 ? 3 : 5;
        }
        System.out.println();
        for (int i= 0; i < args.length; i++){
            System.out.print(array[i] + " ");
        }
        for (int i= 0; i < args.length; i++) {
            array[i] *= -1;
            System.out.print(array[i] + " ");
        }
    }
}
