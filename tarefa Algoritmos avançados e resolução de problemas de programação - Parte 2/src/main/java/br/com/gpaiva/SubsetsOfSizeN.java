package br.com.gpaiva;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfSizeN {
    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;
        List<List<Integer>> subsets = findSubsets(S, n);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        List<List<Integer>> subsets2 = findSubsets(S2, n2);
        for (List<Integer> subset : subsets2) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> findSubsets(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(S, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int[] S, int n, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < S.length; i++) {
            current.add(S[i]);
            generateSubsets(S, n, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
