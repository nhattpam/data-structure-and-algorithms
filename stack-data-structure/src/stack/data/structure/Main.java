package stack.data.structure;

import java.util.Stack;


public class Main {
   
    public static void main(String[] args) {
        // stack = LIFO data structure. Last-In First-Out
        //          stores objects into a sort of "vertical tower"
        //          push() to add to the top
        //          pop() to remove from the top
        
        Stack<String> stack = new Stack<String>();
        
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        
        //luon luon pop object dau tien (duoc them vo sau cung)
        //String myFavGame = stack.pop();
        
        //peek lay object them vo sau cung (dung dau tien)
        System.out.println(stack.peek());
        
        //tim kiem trong stack
        System.out.println(stack.search("Skyrim"));
        
        //in ra array objects
        System.out.println(stack);
        
    }
    
}
