import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        /**
         * array list program
         */
        List<String> list = new ArrayList<String>();//Creating arraylist
        list.add("abhi");//Adding object in arraylist
        list.add("ankur");
        list.add("ankit");
        list.add("ravi");
//Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


/**
 * linklist
 */


        List<String> al = new LinkedList<String>();
        al.add("abhishek");
        al.add("srivastava");
        al.add("Ravi");
        al.add("sharma");

        Iterator<String> itr1 = al.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());


        }

        /**
         * vector
         */
        Vector<String> v=new Vector<String>();
        v.add("srivastava");
        v.add("Amit");
        v.add("sharma");
        v.add("Garima mishra");
        Iterator<String> itr2=v.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        /**
         * stack
         */
        System.out.println("********************************************************************");
        Stack<String> stack = new Stack<String>();
        stack.push("ankit");
        stack.push("tanuja");
        stack.push("ravi");
        stack.push("Ashish");
        stack.push("manish");
        stack.push("shukla");
        stack.pop(); // remove last object of the stack
      String st = stack.peek(); // put last element of the stack into top
        System.out.println(st);

        Iterator<String> itr4=stack.iterator();
        while(itr4.hasNext()){
            System.out.println(itr4.next());
        }

        /**
         * The PriorityQueue class implements the Queue interface.
         * It holds the elements or objects which are to be processed by their priorities.
         * PriorityQueue doesn't allow null values to be stored in the queue.
         */

        System.out.println(" PRIORITY   QUEUE ***************************");
        Queue<String> queue= new PriorityQueue<String>();
        queue.add("ankita");
        queue.add("Sharma");
        queue.add("ankur");
        queue.add("srivastava");
        queue.add("sonal");
        System.out.println("head:"+queue.element());
       System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr5=queue.iterator();
        while(itr5.hasNext()){
            System.out.println(itr5.next());
        }
       queue.remove(); //remove the head of this queue and through the exception if queue is empty
        System.out.println(queue);
       queue.poll(); //remove the head of the queue and return null if the queue is empty
       System.out.println("after removing two elements:");
       Iterator<String> itr6=queue.iterator();
       while(itr6.hasNext()){
          System.out.println(itr6.next());
       }
        /**
         * HashSet class implements Set Interface.
         * It represents the collection that uses a hash table for storage.
         * Hashing is used to store the elements in the HashSet.
         * It contains unique items.
         * It stores in unordered way
         *
         */
        System.out.println("********* HashSet*********************************");
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        set.add(null);
      //Traversing elements
        Iterator<String> itr7=set.iterator();
        while(itr7.hasNext()){
            System.out.println(itr7.next());
        }

    }
}

