// --== CS400 File Header Information ==--
// Name: Young Yang
// Email: xyang532@wisc.edu
// Team: IC
// TA: Mu Cai
// Lecturer: Gary Dahl
// Notes to Grader:

import java.util.Hashtable;

/**
 * A class that implements the interface SetADT.
 * @param <T> the type parameter for the elements of the set
 * @author Young Yang
 */
public class MyHashSet<T> implements SetADT<T> {
    
    Hashtable<T, T> set = new Hashtable<>();

    /**
     * A default constructor.
     */
    public MyHashSet() {
        
    }

    /**
     * Add a new element to the set.
     * @param el the new element to add to the set
     * @return true if the element has been added to the set, false if it was already in the set
     * @throws IllegalArgumentException if the new element passed to the method is null
     */
    @Override
    public boolean add(T el) throws IllegalArgumentException{
        if (contains(el)) return false;
        set.put(el, el);
        return true;
    }

    /**
     * Return true if the element is in the set, false otherwise.
     * @param el the element to check for
     * @return true if the element is in the set, false if it is not
     */
    @Override
    public boolean contains(T el) {
        if (set.get(el) != null) return true;
        return false;
    }

    /**
     * Remove element from the set.
     * @param el the element to remove from the set
     * @return true if the element has been removed, false otherwise (if it was not in the set)
     */
    @Override
    public boolean remove(T el) {
        if (!contains(el)) return false;
        set.remove(el, el);
        return true;
    }

    /**
     * A small demo for add method, contains method, and remove method of MyHashSet.
     * @param args
     */
    public static void main(String[] args) {
        MyHashSet<Integer> set = new MyHashSet<>();
        set.add(5);
        set.add(6);
        System.out.println(set.contains(5));
        System.out.println(set.contains(6));

        set.remove(5);
        set.remove(6);
        System.out.println(set.contains(5));
        System.out.println(set.contains(6));
    }

}
