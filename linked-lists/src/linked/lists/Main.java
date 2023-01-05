package linked.lists;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        //them vo linkedList
        /*
            linkedList.push("A");
            linkedList.push("B");
            linkedList.push("C");
            linkedList.push("D");
            linkedList.push("E");
            linkedList.push("F");
         */
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        //xoa khoi linkedList
//        linkedList.poll();
//        linkedList.pop();

        // them vo vi tri bat ki
        linkedList.add(4, "E");
        
        //remove
        linkedList.remove("E");
        
        //xac dinh object dau tien va cuoi
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        
        //them vo dau tien
        linkedList.addFirst("0");
        
        //them vo cuoi
        linkedList.addLast("9");

        System.out.println(linkedList);
    }

}
