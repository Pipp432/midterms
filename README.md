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
The StackArray Implementation of Stacks
=================== Array Index ======================
index: 0 value: 1
index: 1 value: 2
index: 2 value: 3
index: 3 value: 4
index: 4 value: 5
index: 5 value: 0
index: 6 value: 0
index: 7 value: 0
index: 8 value: 0
index: 9 value: 0
=================== Stack Index ======================
index: 0 value: 5
index: 1 value: 4
index: 2 value: 3
index: 3 value: 2
index: 4 value: 1