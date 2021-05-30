package hust.soict.hedspi.test.trash;


import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.*;

public class Test {


        public static void main(String[] args) {
            String[] arr = {"bin", "can", "bin", "bin"};
            Arrays.sort(arr);
            int countDistinct = 0;
            for (int i = 0; i < arr.length; i++) {
                int j = 0;
                for (j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
                if (i == j) {
                    countDistinct++;
                }
            }
            List<String> distinctList = Arrays.asList(arr);
            Set<String> dis = new HashSet<String>(distinctList);
            ArrayList<String> distinctList2 = new ArrayList<>(dis);
            Collections.sort(distinctList2);
            for (int i = 0; i < distinctList2.size(); i++) {
                int count = 0;
                for (String s : arr) {
                    if (distinctList2.get(i).equals(s)) {
                        count++;
                    }
                }
                distinctList2.set(i, distinctList2.get(i) + " " + count);
            }
            for (String s : distinctList2) {
                System.out.println(s);
            }
        }



//    String text = "nothing";
//    String prefixText = "bruno";
//    String suffixText = "ingenious";
//    int lengthOfPrefix = prefixText.length();
//    int i = 0;
//    boolean check = false;
//        while (lengthOfPrefix >= 1) {
//
//        if (text.startsWith(prefixText.substring(i++))) {
//            check = true;
//            break;
//        }
//        lengthOfPrefix--;
//    }
//    int lengthOfSuffix = suffixText.length();
//    int j = 0;
//    boolean check2 = false;
//        if (check) {
//        while (lengthOfSuffix >= 0) {
//            if (text.endsWith(suffixText.substring(0, lengthOfSuffix - 1))) {
//                check2 = true;
//                j = lengthOfSuffix - 1;
//                break;
//            }
//            lengthOfSuffix--;
//        }
//    }
//        if (check2) {
//        int a = text.indexOf(suffixText.substring(0, j));
//        System.out.println(text.substring(0, a+suffixText.substring(0, j).length()));
//    }



//    int[] arr = {1, 3, 6, 6};
//    int min = 0;
//        Arrays.sort(arr);
//    int j = 0;
//        for (int i = 0; i < arr.length; i+=2) {
//        min += Math.abs(arr[i] - arr[i+1]);
//    }
//        System.out.println(min);
}



//    String[] lines = getStdin();
//    String[] sizeArr = lines[0].split(" ");
//    int row = Integer.parseInt(sizeArr[0]);
//    int col = Integer.parseInt(sizeArr[1]);
//    int[][] mainArr = new int[row][col];
//            for (int i = 0; i < row; i++) {
//        String[] singleLine = lines[i+1].split("");
//        for (int j = 0; j < col; j++) {
//        mainArr[i][j] = Integer.parseInt(singleLine[j]);
//        }
//        }
//        int result = 0;
//        for (int i = 1; i < row - 1; i++) {
//
//        for (int j = 1; j < col - 1; j++) {
//        ArrayList<Integer> around = new ArrayList<>();
//        int max = 0;
//        for (int left = j - 1; left >= 0; left--) {
//        if(mainArr[i][left] > max) {
//        max = mainArr[i][left];
//        }
//        }
//        around.add(max);
//        max = 0;
//        for (int right = j + 1; right < col; right++) {
//        if(mainArr[i][right] > max) {
//        max = mainArr[i][right];
//        }
//        }
//        around.add(max);
//        max = 0;
//        for (int up = i - 1; up >= 0; up--) {
//        if(mainArr[up][j] > max) {
//        max = mainArr[up][j];
//        }
//        }
//        around.add(max);
//        max = 0;
//        for (int down = i + 1; down < row; down++) {
//        if(mainArr[down][j] > max) {
//        max = mainArr[down][j];
//        }
//        }
//        around.add(max);
//        Collections.sort(around);
//        int min = around.get(0);
//        if (mainArr[i][j] > min) {
//        continue;
//        }
//        result += min - mainArr[i][j];
//        }
//        }
//        System.out.println(result);

