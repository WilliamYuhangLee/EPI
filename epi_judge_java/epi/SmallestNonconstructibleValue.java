package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.Collections;
import java.util.List;

public class SmallestNonconstructibleValue {
    @EpiTest(testDataFile = "smallest_nonconstructible_value.tsv")

    public static int smallestNonconstructibleValue(List<Integer> A) {
        // TODO - you fill in here.
        Collections.sort(A);
        int SNV = 1;
        for (Integer integer : A) {
            if (integer > SNV) {
                return SNV;
            } else {
                SNV += integer;
            }
        }
        return SNV;
    }

    public static void main(String[] args) {
        System.exit(
        GenericTest
        .runFromAnnotations(args, "SmallestNonconstructibleValue.java",
                            new Object() {
                            }.getClass().getEnclosingClass())
        .ordinal());
    }
}
