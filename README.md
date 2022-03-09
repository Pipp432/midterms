# Midterms
Hello ICE friends! This is a java project I created for the midterm questions that the prof. gave out <br>
*Note: That not some methods might not be 100% as exams wants this is because the code is sometimes modified to allow for printing to the console*
| Done      | Time Complexity      | Source | Where to Find |
| ------------- |:-------------:| -----:|-----:|
| insertFromBottom()     | Θ(n)| 2018 | UtilityStack.java|
| removeAt()     | Θ(n)    |   2018 | CDLinkedList.java|
| TestQueue | Θ(n)      |    2018 | TestQueue.java|
| ChangeToIntersect()| O(n) | 2017 | CDLinkedList.java|
| OddNumber()| O(n) | 2016 | TestStack.java|
| CrossOver()| O(n) | 2016 | TestQueue2.java|
| GreaterThan() | O(n)| 2017 | BST.java|
| swap()| O(n) | 2017 | TestStack2.java|
| swap()| O(n) | 2016 | CDLinkedList.java|
|hasGreaterValueThan()|O(n)|HW2022|BST.java|
|difference()|O(n^2)|HW2022|BST.java|
|QueueStack Implementation|-|-|QueueStack.java|
|StackQueue Implementation|-|-|StackQueue.java|
|Duplicate BST Problem|-|2018|BST file|


# Read Before Exam
## General
* Interfaces constructors cannot be called directly but classes can have them as parameters.
[(Example in QueueStack.java line 7)](https://github.com/Pipp432/midterms/blob/master/Queues/QueueStack.java)
* Interfaces can use methods that are defined in them but beware the child class implementation.
## Stacks
Iterating through Stacks uses both top() and pop() (value and removing)
### Stack Array 
The StackArray Implementation of Stacks have inverse ordering, that is the top of the stack is the last value in the array.
This can be fix by reversing the stack.
=================== Array Index ======================

index: 0 value: 1 <br>
index: 1 value: 2 <br>
index: 2 value: 3 <br> 
index: 3 value: 4 <br>
index: 4 value: 5 <br>
index: 5 value: 0 <br>
index: 6 value: 0 <br>
index: 7 value: 0 <br>
index: 8 value: 0 <br>
index: 9 value: 0 <br>

=================== Stack Index ======================

index: 0 value: 5 <br>
index: 1 value: 4 <br>
index: 2 value: 3 <br>
index: 3 value: 2 <br>
index: 4 value: 1 <br>

### Stack Linked List 
The Linked List version however doesn't suffer the same problem. 
The current version of StackLinkedList used CDLinkedList but can also be done with singly linked list.

## BST
### next() and hasNext() 
These 2 methods are not as striaghtforward as you might think both do not iterate to the left or right node when called but will find the next largest data. 
__Tip: To get a better understanding I recommend pluging and follow the algorithm.__
__Note: The same applies for hasPrevious() and previous() but find lesser.__

## Queues
I technique I have seen used often is <br>
```java
 queue.insertLast(queue.removeFirst())
 ```
 <br>
To put the first data back at the back of the queue.