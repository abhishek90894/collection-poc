import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");


        /**
         * array list program
         */
                List<String> list=new ArrayList<String>();//Creating arraylist
                list.add("abhi");//Adding object in arraylist
                list.add("ankur");
                list.add("ankit");
                list.add("ravi");
//Traversing list through Iterator
                Iterator itr=list.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }
            }
        }


