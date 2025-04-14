package Exejavabasics.hashset2;

import java.util.HashSet;

public class HashsetFruit {
    private HashSet<String> stringHashSet;

    public HashsetFruit() {
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
}
