package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainC {


    public static void main(String[] args) {
        numberCountList();
    }

    public static void numberCountList() {
        int count = 1;
        HashMap<String, Integer> wordCount = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] rt = input.split(" ");

        for(String i : rt) {
            if(wordCount.get(i) != null) {
                int help = wordCount.get(i) + 1;
                wordCount.remove(i);
                wordCount.put(i, help);
            }else {
                wordCount.put(i, count);
            }
        }
        String s = sc.nextLine();
        System.out.println(wordCount.get(s));
  }
}