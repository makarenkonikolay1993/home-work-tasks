package com.hillel.lecture_14;

import java.util.*;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {

        Collections.sort(list, new ReverseString());
        return list;
    }

    public String getLongestString(List<String> list) {

        Collections.sort(list, new LongestString());
        String result = list.get(list.size()-1);

        return result;
    }

    public List<String> changeIndex(List<String> list) {

        String temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);

        return list;
    }

    public List<String> removeDuplicates(List<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public List<String> sortList(List<String> list) {
        Collections.sort(list, new LongestString());
        return list;
    }

    static class LongestString implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length()>o2.length()){
                return 1;
            } else if (o1.length()<o2.length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    static class ReverseString implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return -1;
        }
    }
}
