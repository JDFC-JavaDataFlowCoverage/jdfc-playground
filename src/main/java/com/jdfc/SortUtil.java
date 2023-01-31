package com.jdfc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUtil {
    public List<List<Integer>> applyFastNonDominatedSort(List<Vector> vectorList) {
        List<List<Integer>> idFronts = new ArrayList<>();
        idFronts.add(new ArrayList<>());
        List<List<Integer>> dominatees = new ArrayList<>(Collections.nCopies(vectorList.size(), new ArrayList<>()));
        List<Integer> dominationCounter = new ArrayList<>(Collections.nCopies(vectorList.size(), 0));

        for(int i = 0; i < vectorList.size(); i++) {
            dominatees.set(i, new ArrayList<>());
            dominationCounter.set(i, 0);

            for(int j = 0; j < vectorList.size(); j++) {
                if (dominates(vectorList.get(i), vectorList.get(j))) {
                    dominatees.get(i).add(j);
                } else if (dominates(vectorList.get(j), vectorList.get(i))) {
                    dominationCounter.set(i, dominationCounter.get(i)+1);
                }
            }

            if(dominationCounter.get(i) == 0) {
                idFronts.get(0).add(i);
                vectorList.get(i).setRank(0);
            }
        }

        int i = 0;
        while(!idFronts.get(i).isEmpty()) {
            List<Integer> nextFront = new ArrayList<>();
            for(Integer cId : idFronts.get(i)) {
                for(Integer dominatee : dominatees.get(cId)) {
                    dominationCounter.set(dominatee, dominationCounter.get(dominatee)-1);
                    if (dominationCounter.get(dominatee) == 0) {
                        nextFront.add(dominatee);
                        vectorList.get(dominatee).setRank(i+1);
                    }
                }
            }
            i++;
            idFronts.add(nextFront);
        }
        idFronts.remove(idFronts.size()-1);
        return idFronts;
    }

    private boolean dominates(Vector a, Vector b) {
        assert(a.getValues().length == b.getValues().length);
        int length =  a.getValues().length;
        for (int i = 0; i < length; i++) {
            if (a.getValues()[i] < b.getValues()[i]) {
                return false;
            }

            if (a.getValues()[i] > b.getValues()[i]) {
                return true;
            }
        }

        return false;
    }
}
