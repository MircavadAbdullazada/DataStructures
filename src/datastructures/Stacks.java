package datastructures;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        // stack = LIFO data structure. Last-In First-Out
        //               stores objects into a sort of "vertical tower"
        //               push() to add objects to the top
        //               pop() to remove objects from the top

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack=new Stack<>();

        //check stack empty or not
        System.out.println(stack.empty());

        //push-adding a element to stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        //pop-remove top element of stack and return obj
        System.out.println(stack.pop());

        //peek-only return top element of stack
        System.out.println(stack.peek());


        //search method searches the specified object and returns the position of the object.
        System.out.println(stack.search("Doom"));

        //iterator
        System.out.println("Return stack elements with iterator");
        Iterator iterator= stack.iterator();


        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("-----------");

        Collections.sort(stack);
        System.out.println(stack);

        //System.out.println(stack);
    }
}