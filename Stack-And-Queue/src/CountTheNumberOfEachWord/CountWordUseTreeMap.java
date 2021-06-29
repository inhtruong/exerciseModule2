package CountTheNumberOfEachWord;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWordUseTreeMap {
    public static String countWord(String str)
    {
        String[] arr = str.split("");
        TreeMap<String, Integer> countWord = new TreeMap<String,Integer>();
        int value = 1;
        for(int i = 0; i < str.length(); i++){
            String key = arr[i];
            if(countWord.containsKey(key)){
                countWord.remove(key);
                countWord.put(key,value + 1);
            }else {
                countWord.put(key,value);
            }
        }

        return String.valueOf(countWord);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập chuỗi:");
        String str = input.nextLine();
        System.out.println(countWord(str));
    }
}
