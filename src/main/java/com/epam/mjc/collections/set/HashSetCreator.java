package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : sourceList) {
            if (num % 2 == 0) {
                hashSet.add(num);
                int divisor = num;
                while (divisor % 2 == 0 && divisor % 2 != 1) {
                    divisor /= 2;
                    hashSet.add(divisor);
                }
            } else {
                hashSet.add(num);
                hashSet.add(2 * num);
            }
        }

        return hashSet;
    }
}
