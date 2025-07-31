package utils;

public class CalculatorHelper {

    public CalculatorHelper(){

    }

    public static int calculateAgeDiff(int ageOne, int ageTwo){
        int ageDiff = Math.abs(ageOne - ageTwo);
        return ageDiff;
    }

    public static void showTableOf(double tableNumber){
        for (int i = 0; i < 10; i++) {
            System.out.println(tableNumber+" x "+i+" = "+ tableNumber*i);
        }
    }
}
