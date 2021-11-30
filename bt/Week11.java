import java.util.List;

public class Week11<T extends Comparable<? super T>> extends Person {

    /**
     * checek.
     * @param <T> isisad sd 
     * @param arr asdasddas
     * @return asdsaddsa
     */
    public static <T extends Comparable<? super T>> List<T> sortGeneric(List<T> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    T temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }     
}
