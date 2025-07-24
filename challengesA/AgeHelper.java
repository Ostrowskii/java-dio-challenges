package challengesA;

public class AgeHelper {

    public AgeHelper(){

    }

    public static int calculateAgeDiff(int ageOne, int ageTwo){
        int ageDiff = Math.abs(ageOne - ageTwo);
        return ageDiff;
    }
}
