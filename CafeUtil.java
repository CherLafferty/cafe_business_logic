import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        int i = 0;
        while(i<11){
            sum = sum + i;
            i++;
        }
        return sum;
    }

    // public double getOrderTotal(double[]prices){
    //     // double[] prices = new prices[4];
    //     double orderTotal = 0;
    //     // double i;
    //     for(double i = 0; i < prices.length; i++){
    //         orderTotal += prices[i];
    //     }
    //     return orderTotal;
    // }

    public void displayMenu(ArrayList<String>menuitems) {
        for(int i = 0; i < menuitems.size(); i++){
            System.out.println(i + " " + menuitems.get(i));
        }
        // int i = 0;
        // for(String item : menuitems){
        //     System.out.println(item);
        // }
    }

    // public void addCutomer(ArrayList<String>customer){

    // }

}