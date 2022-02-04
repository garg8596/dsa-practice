package com.company;

import java.util.*;

public class TextQueries {
    public static List<List<Integer>> textQueries(List<String> sentences, List<String> queries) {
        // Write your code here
        List<List<Integer>> ans = new ArrayList<>();
        int n = sentences.size();
        int len = queries.size();
        //int j = 0;
        //List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < len; i++)
        {
            HashSet<String> set1 = new HashSet<>();
            List<Integer> temp = new ArrayList<>();

            String[] query = queries.get(i).split(" ");
            for (String val : query) set1.add(val);
            for(int j=0; j<n; j++)
            {
                HashSet<String> set2 = new HashSet<>();
                String[] sent = sentences.get(j).split(" ");
                for (String val : sent) set2.add(val);
                //System.out.println(set1);
                //System.out.println(set2);
                if(set2.containsAll(set1))
                {
                    temp.add(j);
                }
            }
            if(temp.size()==0)temp.add(-1);
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>(Arrays.asList("jim likes mary", "kate likes tom", "tom does not like jim"));
        List<String> queries = new ArrayList<>(Arrays.asList("jim tom",
                "likes"));

        System.out.println(new TextQueries().textQueries(sentences, queries));

    }
}
