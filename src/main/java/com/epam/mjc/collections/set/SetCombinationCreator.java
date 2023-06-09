package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();

        // Elements that belong to the first and second Sets at once and not belong to the third Set
        for (String element : firstSet) {
            if (secondSet.contains(element) && !thirdSet.contains(element)) {
                resultSet.add(element);
            }
        }

        // Elements that belong only to the third Set
        for (String element : thirdSet) {
            if (!firstSet.contains(element) && !secondSet.contains(element)) {
                resultSet.add(element);
            }
        }

        return resultSet;
    }
}
