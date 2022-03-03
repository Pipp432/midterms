package LinkedList;

public class Main {
    public static void main(String args[] ) throws Exception{
        CDLinkedList list = new CDLinkedList();
        Iterator p = new DListIterator(list.header);
        p.next();
        list.insert(10, p);
        p.next();
        list.insert(11, p);
        p.next();
        list.insert(2, p);
        p.next();
        list.insert(0, p);
        p.next();
        list.insert(9, p);
        //list.printList();
        
        CDLinkedList list2 = new CDLinkedList();
        Iterator p2 = new DListIterator(list2.header);
        p2.next();
        list2.insert(10, p2);
        p2.next();
        list2.insert(1, p2);
        p2.next();
        list2.insert(7, p2);
        p2.next();
        list2.insert(9, p2);
        //list2.printList();
        list2.changeToIntersect(list);
        list2.printList();
    }
    
}
