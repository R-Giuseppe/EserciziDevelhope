package Exejavabasics.hashset3;

import java.util.HashSet;

public class HashsetSport {
    private HashSet<String> stringHashSet;

    public HashsetSport() {
        this.stringHashSet = new HashSet<>();
    }

    public HashSet<String> getStringHashSet() {
        return stringHashSet;
    }

    public void setStringHashSet(HashSet<String> stringHashSet) {
        this.stringHashSet = stringHashSet;
    }

    public void add(String element){
        this.stringHashSet.add(element);
    }

    public void remove(String element){
        this.stringHashSet.remove(element);
    }
}
