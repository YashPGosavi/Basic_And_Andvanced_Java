/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
ArrayList :-
      The difference between a built-in array and an ArrayList in Java,
      is that the size of an array cannot be modified
      (if you want to add or remove elements to/from an array, you have to create a new one).
      While elements can be added and removed from an ArrayList whenever you want.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Constructors of ArrayList :-
1)ArrayList():-	                             It is used to build an empty array list.

2)ArrayList(Collection<? extends E> c):-     It is used to build an array list that is
                                             initialized with the elements of the collection c.

3)ArrayList(int capacity):-                  It is used to build an array list that has the specified initial capacity.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Methods of ArrayList :-
1)void add(int index, E element):-	                              	It is used to insert the specified element at the
                                                                    specified position in a list.

2)boolean add(E e):-		                                        It is used to append the specified element at the end of a list.

3)boolean addAll(Collection<? extends E> c):-		                It is used to append all of the elements in the
                                                                    specified collection to the end of this list,
                                                                    in the order that they are returned by the specified collection's iterator.

4)boolean addAll(int index, Collection<? extends E> c):-	        It is used to append all the elements in the specified collection,
                                                                    starting at the specified position of the list.

5)void clear():-		                                            It is used to remove all of the elements from this list.

6)void ensureCapacity(int requiredCapacity):-		                It is used to enhance the capacity of an ArrayList instance.

7)E get(int index):-		                                        It is used to fetch the element from the particular position of the list.

8)boolean isEmpty():-		                                        It returns true if the list is empty, otherwise false.

9)Iterator()
10)listIterator()

11)int lastIndexOf(Object o):-		                                It is used to return the index in this list of the last occurrence
                                                                    of the specified element, or -1 if the list does not contain this element.

12)Object[] toArray():-		                                        It is used to return an array containing all of the elements in this list
                                                                    in the correct order.

13)<T> T[] toArray(T[] a):-	                                    	It is used to return an array containing all of the elements in this list
                                                                    in the correct order.

14)Object clone():-	                                                It is used to return a shallow copy of an ArrayList.

15)boolean contains(Object o):-	                                    It returns true if the list contains the specified element.

16)int indexOf(Object o):-                                        	It is used to return the index in this list of the first occurrence
                                                                    of the specified element, or -1 if the List does not contain this element.

17)E remove(int index):-	                                        It is used to remove the element present at the specified position
                                                                    in the list.

18)boolean remove(Object o):-	                                    It is used to remove the first occurrence of the specified element.

19)boolean removeAll(Collection<?> c):-                         	It is used to remove all the elements from the list.

20)boolean removeIf(Predicate<? super E> filter):-	                It is used to remove all the elements from the list that satisfies
                                                                    the given predicate.

21)protected void removeRange(int fromIndex, int toIndex):-	        It is used to remove all the elements lies within the given range.

22)void replaceAll(UnaryOperator<E> operator):-	                 	It is used to replace all the elements from the list with the specified
                                                                    element.

23)void retainAll(Collection<?> c):-		                        It is used to retain all the elements in the list that are present in
                                                                    the specified collection.

24)E set(int index, E element):-		                            It is used to replace the specified element in the list, present at the
                                                                    specified position.

25)void sort(Comparator<? super E> c):-                             It is used to sort the elements of the list on the basis of the
                                                                    specified comparator.

26)Spliterator<E> spliterator():-                                   It is used to create a spliterator over the elements in a list.

27)List<E> subList(int fromIndex, int toIndex):-		            It is used to fetch all the elements that lies within the given range.

28)int size():-		                                                It is used to return the number of elements present in the list.

29)void trimToSize():-		                                        It is used to trim the capacity of this ArrayList instance to be the
                                                                    list's current size.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

 */

package Sammu_2_Advanced_Java.Sammu_Collection_FrameWork;
import java.util.*;
public class _2_ArrayList {
    public static  void main(String[] args){
        ArrayList<Integer> A1 = new ArrayList<Integer>();

        ArrayList <Integer>A2 = new ArrayList<Integer>(5);
        A1.add(3); //To add element in arrayList
        A1.add(0,2);

        A2.add(21);
        A2.add(0,22);

        A1.addAll(A2); //Add arraylist with each other

        System.out.println(A1.contains(2)); //checking the availability of element


        A1.add(1);
        for(int i = 0 ; i<A1.size();i++){
            System.out.print(A1.get(i) + " ");
        }

        System.out.println("\n************************************************************ ");
        A1.set(0,5); //It is used to replace the specified element in the list, present at the specified position.
        for(int i = 0 ; i<A1.size();i++){
            System.out.print(A1.get(i) + " ");
        }
        System.out.println("\n************************************************************ ");
        A1.add(1);
        for(int i = 0 ; i<A1.size();i++){
            System.out.print(A1.get(i) + " ");
        }
        System.out.println("\n************************************************************ ");
        System.out.println("indexOf 1 :- " + A1.indexOf(1)); // Shows th index of element
        System.out.println("lastIndexOf :- "+A1.lastIndexOf(1));

        System.out.println("\n************************************************************ ");

        A1.remove(2); //remove element
        for(int i = 0 ; i<A1.size();i++){
            System.out.print(A1.get(i) + " ");
        }
        System.out.println("");
        System.out.println(A1.indexOf(22));
    }
}
