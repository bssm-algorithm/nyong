import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i ++){
            arr.add(br.readLine());
        }

        for (int i = 0; i < arr.size(); i ++){
            if (arr.get(i).length() > max){
                max = arr.get(i).length();
            }
        }

        Collections.sort(arr);

        for (int i = 1; i <= max; i ++){
            for (int j = 0; j < arr.size(); j ++){
                if (arr.get(j).length() == i){
                    list.add(arr.get(j));
                }
            }
        }


        for (int i = 0; i < list.size() - 1; i ++){
            for (int j = i + 1; j < list.size(); j ++){
                if (list.get(i).contains(list.get(j))){
                    list.remove(list.get(j));
                }
            }
        }

        for (String s : list){
            System.out.println(s);
        }
    }
}
