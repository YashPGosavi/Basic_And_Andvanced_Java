/*

*).Synchronization :-
When two or more threads need to access shared memory (Same Memory), then there is
some way to ensure that the access to the resource will be by only one thread at a
time. The process of ensuring one access at a time by one thread is called
synchronization.

1. The synchronization is the concept which is based on monitor. Monitor is used as
mutually exclusive lock or mutex. When a thread owns this monitor at a time then
the other threads can not access the resources. Other threads have to be there in
waiting state.

2. In Java every object  has implicit monitor associated with it. For entering in object's
monitor, the method is associated with a keyword synchronized. When a particular
method is in synchronized state then all other threads have to be there in waiting
state.

3. There are two ways to achieve the synchronization :-
                        1. Using Synchronized Methods. ( Method Level Synchronization )
                        2. Using Synchronized Blocks (Statements). ( Block Level Synchronization )

 */

package Sammu_1_Core_Java.Sammu_7_Multithreading;
public class _6_Multithreding_Synchronization {
}
