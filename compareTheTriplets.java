import java.util.Random;

public class  compareTheTriplets {

    public static void compareArray(int[] a, int[] b) {
        int ax = a.length;
        int bx = b.length;
        int counta = 0;
        int countb = 0;

        if (a.length != b.length) return;  // out of here

        for (int ia = 0; ia < ax; ia++) {
            for (int ib = 0; ib < bx; bx++) {
                if(a[ia] > b[ib]) counta++;
                if(a[ia] < b[ib])  countb++;                
            }
        }
        System.out.println("Results:");
        System.out.println("counta: " + counta + " ");
        System.out.println("countb: " + countb + " ");
    } 

    public static void main(String[] args) {
        int[] anArray = new int[10];
        int[] anArray2 = new int[10];     

       Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            anArray[i] = rand.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            anArray2[i] = rand.nextInt();
        }

        for (int i = 0; i <10; i++) {
            System.out.println("a1["+i+"]: " + anArray[i]);
            System.out.println("a2["+i+"]: " + anArray2[i]);
        }

        compareArray(anArray, anArray2);

    }
}