import java.util.Arrays;
public class PrintPattern {
    static String[] printPattern(int n) {
        int temp = 10;
        String[] res = new String[5];
        Arrays.fill(res, "");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    res[i] += "**";
                    continue;
                }
                res[i] += temp;
                temp += 10;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                if (j == n - i - 1) {
                    res[i] += temp / 10;
                    temp += 10;
                    continue;
                }
                res[i] += temp;
                temp += 10;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printPattern(5)));   
    }
}
