package program.DeustoCrash;
import java.lang.Math;

/**
 * testing
 */
public class testing {

    public static void main(String[] args){
        CarameloUD[][] grid = new CarameloUD[6][15];
        System.out.println(grid[1].length);
        System.out.println((int)(Math.random()*4));
        TableroCaramelos bruh = new TableroCaramelos();
        bruh.grid[1][3] = null;
        System.out.println(bruh);

    }


}