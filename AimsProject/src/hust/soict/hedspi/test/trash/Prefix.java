package hust.soict.hedspi.test.trash;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prefix {
    public static void main(String[] args) {
        String text = "abracadabra";
        String prefixString = "habrahabr";
        String suffixString = "bracket";
//        String text = "ab";
//        String prefixString = "a";
//        String suffixString = "b";
//        String text = "nothing";
//        String prefixString = "bruno";
//        String suffixString = "ingenious";
//        String text = "aafdasdfasdaasfdasdffdasdfasdaafdasdfasd";
//        String prefixString = "afasdfatrhertghsfsdhsdfaassaafdasdfasddfasdfasdf";
//        String suffixString = "aasdfasdfaafdasdasfasdfasfdasfdyrefasdaafdasdfasda";
        int lengthOfPrefix = prefixString.length();
        int i = 0;
        boolean checkPre = false;
        String subStringPrefix = "";
        while (lengthOfPrefix >= 1) {
            subStringPrefix = prefixString.substring(i++);
            if (text.contains(subStringPrefix)) {
                checkPre = true;
                break;
            }
            lengthOfPrefix--;
        }
        ArrayList<Integer> arrayIndexPre = new ArrayList<>();
        if (checkPre) {
            Matcher pre = Pattern.compile("(?=(" + subStringPrefix + "))").matcher(text);
            while (pre.find()) {
                arrayIndexPre.add(pre.start());
            }
        }

        System.out.println(subStringPrefix);
        System.out.println(arrayIndexPre);

        String subStringSuffix = "";
        i = suffixString.length();
        boolean checkSuf = false;
        while (i > 0) {
            subStringSuffix = suffixString.substring(0, i--);
            if (text.contains(subStringSuffix)) {
                checkSuf = true;
                break;
            }
        }
        ArrayList<Integer> arrayIndexSuf = new ArrayList<>();
        if (checkSuf) {
            Matcher suf = Pattern.compile("(?=(" + subStringSuffix + "))").matcher(text);
            while (suf.find()) {
                arrayIndexSuf.add(suf.start());
            }
        }
        System.out.println(subStringSuffix);
        System.out.println(arrayIndexSuf);

        if (arrayIndexPre.size() != 0 && arrayIndexSuf.size() != 0) {
            for (int j = 0; j < arrayIndexPre.size(); j++) {
                boolean check = false;
                for (int k = 0; k < arrayIndexSuf.size(); k++) {
                    if (arrayIndexPre.get(j) + subStringPrefix.length() <= arrayIndexSuf.get(k)) {
                        check = true;
                        System.out.println(text.substring(arrayIndexPre.get(j),
                                arrayIndexSuf.get(k) + subStringSuffix.length()));
                        break;
                    } else if ((arrayIndexSuf.get(k) - arrayIndexPre.get(j)) < subStringPrefix.length()) {
                        check = true;
                        System.out.println(text.substring(arrayIndexPre.get(j),
                                arrayIndexSuf.get(k) + subStringSuffix.length()));
                        break;
                    } else if (arrayIndexSuf.get(k) > arrayIndexPre.get(j)) {
                        check = true;
                        if (subStringPrefix.charAt(0) > subStringSuffix.charAt(0)) {
                            System.out.println(subStringSuffix);
                        } else {
                            System.out.println(subStringPrefix);
                        }
                        break;
                    }
                }
                if (check) {
                    break;
                }
            }
        }
    }
}
