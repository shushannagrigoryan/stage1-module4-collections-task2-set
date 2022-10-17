package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> newSet =  new HashSet<>();
        for(int item:sourceList){
            if(item%2 == 0){
                int x = item;
                newSet.add(x);
                while(x%2 ==0){
                    newSet.add(x/2);
                    x/=2;
                }
            }
            else{
                newSet.add(item);
                newSet.add(2* item);
            }
        }

        return newSet;
    }
}
