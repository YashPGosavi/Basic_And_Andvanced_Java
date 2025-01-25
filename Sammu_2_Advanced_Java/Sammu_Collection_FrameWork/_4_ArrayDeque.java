/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
ArrayDeque Vs. LinkedList Class
Both ArrayDeque and Java LinkedList implements the Deque interface. However, there exist some differences between them.

LinkedList supports null elements, whereas ArrayDeque doesn't.
Each node in a linked list includes links to other nodes. That's why LinkedList requires more storage than ArrayDeque.
If you are implementing the queue or the deque data structure, an ArrayDeque is likely faster than a LinkedList.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
1. Add elements using add(), addFirst() and addLast()

add() - inserts the specified element at the end of the array deque
addFirst() - inserts the specified element at the beginning of the array deque
addLast() - inserts the specified at the end of the array deque (equivalent to add())

2. Insert elements using offer(), offerFirst() and offerLast()

offer() - inserts the specified element at the end of the array deque
offerFirst() - inserts the specified element at the beginning of the array deque
offerLast() - inserts the specified element at the end of the array deque

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

1. Access elements using getFirst() and getLast()

getFirst() - returns the first element of the array deque
getLast() - returns the last element of the array deque

2. Access elements using peek(), peekFirst() and peekLast() method

peek() - returns the first element of the array deque
peekFirst() - returns the first element of the array deque (equivalent to peek())
peekLast() - returns the last element of the array deque

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

1. Remove elements using the remove(), removeFirst(), removeLast() method

remove() - returns and removes an element from the first element of the array deque
remove(element) - returns and removes the specified element from the head of the array deque
removeFirst() - returns and removes the first element from the array deque (equivalent to remove())
removeLast() - returns and removes the last element from the array deque

2. Remove elements using the poll(), pollFirst() and pollLast() method

poll() - returns and removes the first element of the array deque
pollFirst() - returns and removes the first element of the array deque (equivalent to poll())
pollLast() - returns and removes the last element of the array deque

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Iterating the ArrayDeque
iterator() - returns an iterator that can be used to iterate over the array deque
descendingIterator() - returns an iterator that can be used to iterate over the array deque in reverse order

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

element()	Returns an element from the head of the array deque.
contains(element)	Searches the array deque for the specified element.

				If the element is found, it returns true, if not it returns false.
size()	Returns the length of the array deque.
toArray()	Converts array deque to array and returns it.
clone() 	Creates a copy of the array deque and returns it.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

package Sammu_2_Advanced_Java.Sammu_Collection_FrameWork;

import java.util.ArrayDeque;

public class _4_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque A1 = new ArrayDeque();
        A1.add(3); //To add element in arrayList
        A1.add(2);

        A1.addFirst(5);
        A1.addLast(22);

        System.out.println("First Element Is : " + A1.getFirst());
        System.out.println("Last Element Is : " + A1.getLast());
        System.out.println("**********************************************************************************************");

        A1.remove(5);
        System.out.println(A1.contains(3));
        System.out.println("The Size Of A1 is : "+A1.size());
        System.out.println(A1.clone());
    }
}