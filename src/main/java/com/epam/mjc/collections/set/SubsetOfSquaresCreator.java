package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> treeSet = new TreeSet<>();

        for(int item: sourceList){
            treeSet.add(item*item);
        }


        return treeSet.subSet(lowerBound,true, upperBound, true);
    }
}
