import java.util.Random;

public class  compareTheTriplets {

    public static int compareArray(int a, int b) {
        if(a > b) return 1;
        if(a < b) return 0;
        return -1;
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

        int Alice = 0;
        int Bob = 0;
        
        for (int ax = 0; ax < 10; ax++){
            for (int bx = 0; bx < 10; bx++){
                int result = compareArray(anArray[ax], anArray2[bx]);
                if (result==1) Alice++;
                if (result==0) Bob++;
            }
        }
        System.out.print(Alice); 
        System.out.print(" ");
        System.out.println(Bob);
    }
}