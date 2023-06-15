/*
HashSet
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Default capacity and load factor
the capacity of the hash set will be 16
the load factor will be 0.75

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
1)	add(E e) :-	            It is used to add the specified element to this set if it is not already present.
             add() - inserts the specified element to the set
             addAll() - inserts all the elements of the specified collection to the set
2)	clear() :-	            It is used to remove all of the elements from the set.

3)	clone() :-	            It is used to return a shallow copy of this HashSet instance:
                            the elements themselves are not cloned.

4)	contains(Object o) :-	It is used to return true if this set contains the specified element.

5)	isEmpty() :-           	It is used to return true if this set contains no elements.

6)	iterator() :-	        It is used to return an iterator over the elements in this set.

7)	remove(Object o) :- 	It is used to remove the specified element from this set if it is present.
             remove() - removes the specified element from the set
             removeAll() - removes all the elements from the set

8)	size() :-           	It is used to return the number of elements in the set.

9)	spliterator() :-	    It is used to create a late-binding and fail-fast Spliterator over the elements in the set.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

 */
package Sammu_2_Advanced_Java.Sammu_Collection_FrameWork;
import java.util.HashSet;
public class _5_HashSet {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>();
        h1.add("Yash");
        h1.add("Samiksha");

        HashSet<String> h2 = new HashSet<>();
        h2.add("Gosavi");
        h2.add("Jagtap");

        h1.addAll(h2);

        System.out.println(h1.size());

        System.out.println(h1);
    }
}
