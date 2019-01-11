import java.util.*;

public class compareTheTriplets {

    // Complete the compareTriplets function below.
    public static List<Integer> compareArray(List<Integer> a, List<Integer> b) {

        List<Integer> Res = new ArrayList<Integer>();
        
        if (a.size() != b.size()) return Res;

        int Alice = 0;
        int Bob = 0;
        int ix = a.size();

        for (int i = 0; i < ix; i++){
            if (a.get(i) > b.get(i)) Alice++;
            if (b.get(i) > a.get(i)) Bob++;
        }
        Res.add(Alice);
        Res.add(Bob);

        return Res;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList();
        List<Integer> b = new ArrayList();
        List<Integer> Res = new ArrayList();

        a.add(5);
        a.add(6);
        a.add(7);
        b.add(3);
        b.add(6);
        b.add(10);

        Res = compareArray(a, b);
        System.out.println("Res: " + Res);


    }
}