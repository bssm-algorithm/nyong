import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int zero = 0;
        int one = 0;
        int cnt;

        String s = br.readLine();
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i ++){
            arr.add(s.charAt(i));
        }

        for (int i = 0; i < arr.size() - 1; i ++){
            if (arr.get(i) != arr.get(i + 1) && arr.get(i) == '0'){
                zero ++;
            } else if (arr.get(i) != arr.get(i + 1) && arr.get(i) == '1') {
                one++;
            }
        }

        if (arr.get(arr.size() - 1) != arr.get(arr.size() - 2) && arr.get(arr.size() - 1) == '0'){
            zero ++;
        } else if (arr.get(arr.size() - 1) != arr.get(arr.size() - 2) && arr.get(arr.size() - 1) == '1'){
            one ++;
        } else if (arr.get(arr.size() - 1) == '0'){
            zero ++;
        } else if (arr.get(arr.size() - 1) == '1'){
            one ++;
        }

        if (zero < one){
            System.out.println(zero);
        }else {
            System.out.println(one);
        }
    }
}
