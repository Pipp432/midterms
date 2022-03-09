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
* All class implementing interfaces must have all the methods defined in the interface 
[(Example in StackQueue.java)](https://github.com/Pipp432/midterms/blob/master/Stack/StackQueue.java)
* Constructors can be called by using the _this_ keyword 

```java
// Example
public class Rectangle {
    private int x, y;
    private int width, height;
        
    public Rectangle() {
        // These are basiclly defualt values if non are given;
        this(0, 0, 1, 1) 
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
   
}
```
* Beware of shallow copies. When an object (Reference Type) is created a label is created to refer to it.
Any new object assigned as it will just be a label pointing to it (A shallow copy)
copying requires more in depth operations.

``` java
public class Example{
    QueueArray q1 = new QueueArray();
    QueueArray q2 = new QueueArray();  
    QueueArray q3 = new QueueArray();
    q1.insertLast(1);
    q1.insertLast(3); 
    q1.insertLast(5); 
    q1.insertLast(7); 
    q1.insertLast(9);
    
    int originalSize = q1.size();
    
    // Shallow copy
    q2 = q1;

    // Deep copy
    while(originalSize!=q3.size()){
        q3.insertLast(q1.front());
        q1.insertLast(q1.removeFirst());
    }

    int k = 0;
    // Driver code
    System.out.println("=================== Queue1 Index ======================");
    while(!q1.isEmpty()){
        System.out.println("Index: "+k +" value: "+q1.removeFirst());
    k++;
    }
    k=0;
    System.out.println("=================== Queue2 Index ======================");
    while(!q2.isEmpty()){
        System.out.println("Index: "+k +" value: "+q2.removeFirst());
        k++;
    }
    System.out.println("=================== Queue3 Index ======================");
    while(!q3.isEmpty()){
        System.out.println("Index: "+k +" value: "+q3.removeFirst());
        k++;
    }
    k=0;

}
// Outputs
//=================== Queue1 Index ======================
//Index: 0 value: 1
//Index: 1 value: 3
//Index: 2 value: 5
//Index: 3 value: 7
//Index: 4 value: 9
//=================== Queue2 Index ======================
//=================== Queue3 Index ======================
//Index: 0 value: 1
//Index: 1 value: 3
//Index: 2 value: 5
//Index: 3 value: 7
//Index: 4 value: 9
```



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
This helps a lot when memory is limited and sorting with only one queue 

[(This the basis for piority queue)](https://github.com/Pipp432/midterms/blob/master/Queues/PriorityQueue.java)