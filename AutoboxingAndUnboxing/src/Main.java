import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
       /* for (int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());
        }
*/
        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl = 0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " -> " + value);

        }
    }
}
