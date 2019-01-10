import java.util.*;

public class  compareTheTriplets {

    public static int compareArray(int a, int b) {
        if(a > b) return 1;
        if(a < b) return 0;
        return -1;
    } 

    public static void main(String[] args) {
        List<Integer> anArray = new ArrayList<Integer>();
        List<Integer> anArray2 = new ArrayList<Integer>();
        
        int max = 100;
        int min = 1; 

       Random rand = new Random(max - min + 1);

        for (int i = 0; i < 10; i++) {
            anArray.add(rand.nextInt(max - min + 1));
        }

        for (int i = 0; i < 10; i++) {
            anArray2.add(rand.nextInt(max - min + 1));
        }

        for (int i = 0; i <10; i++) {
            System.out.println("a1["+i+"]: " + anArray.get(i));
            System.out.println("a2["+i+"]: " + anArray2.get(i));
        }

        int Alice = 0;
        int Bob = 0;
        
        for (int ax = 0; ax < 10; ax++){
            for (int bx = 0; bx < 10; bx++){
                int result = compareArray(anArray.get(ax), anArray2.get(bx));
                if (result==1) Alice++;
                if (result==0) Bob++;
            }
        }
        System.out.print(Alice); 
        System.out.print(" ");
        System.out.println(Bob);
    }
}