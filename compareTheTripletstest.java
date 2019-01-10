public class compareTheTripletstest {

    // Complete the compareTriplets function below.
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int ax = a.size();
        int bx = b.size();

        List<Integer> Res = new ArrayList<Integer>();
        
        int Alice = 0;
        int Bob = 0;

        for (int ai = 0; ai < ax; ai++){
            for (int bi = 0; bi < bx; bi++) {
                if (a.get(ai) > b.get(bi)) Alice++;
                if (b.get(bi) > a.get(ai)) Bob++;
            }
            Res.add(Alice);
            Res.add(Bob);

           
        }
        return Res;
    }

    public static void main(Strng[] args) {
        List<Integer> a = new arrayList();
        List<Integer> b = new arrayList();
        List<Integer> Res = new arrayList();

        a.add(5);
        a.add(6);
        a.add(7);
        b.add(3);
        b.add(6);
        b.add(10);

        Res = compareTriplets(a, b);
        System.out.pringln(Res);


    }
}