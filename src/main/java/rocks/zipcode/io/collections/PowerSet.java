package rocks.zipcode.io.collections;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {

    protected final Set<TypeOfSet> originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = new HashSet<>(Arrays.asList(originalSet));
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> powerSet = new HashSet<>();
        List<TypeOfSet> setAsList = new ArrayList<>(originalSet);
        for (int i = setAsList.size(); i >= 0; i--) {
            Set<TypeOfSet> innerSet = new HashSet<>();
            for (int j = 0; j < i; j++) {
                innerSet.add(setAsList.get(j));
            }
            powerSet.add(innerSet);
        }
        return powerSet;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return originalSet;
    }
}
