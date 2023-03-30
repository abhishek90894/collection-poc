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
    }
}

