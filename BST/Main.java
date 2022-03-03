package BST;

public class Main {
    public static void main(String args[]) throws Exception{ 
         
        BSTNode root = new BSTNode(7);
        BST t = new BST(root,10);
        t.insert(3);
        t.insert(1);
        t.insert(6);
        t.insert(5);
        t.insert(4);
        t.insert(2);
        t.insert(8);
        t.insert(9);
        t.printAllData();
        BST gt = t.greaterThan(2);
        gt.printAllData();
       
       
		

       
      
    
    }
}
