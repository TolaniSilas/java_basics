import java.util.Arrays;

public class TicTacToe {
    public static void main(String... args) {
        char[][] arrs = {{'x', 'o', 'x'}, {'x', 'x', 'o'}, {'o', 'x', 'x'}};
        System.out.println(Arrays.deepToString(arrs));

        for (int i = 0; i < arrs.length;) {
   
            for (int j = 0; j < arrs.length;) {
                if (arrs[i][j] == 'x') {
                    arrs[i][j] = '1';
                } 
                
                else if (arrs[i][j] == 'o') {
                    arrs[i][j] = '0';
                }
                j++;
            }
            i++;
        }
        System.out.println(Arrays.deepToString(arrs));
    }
}
