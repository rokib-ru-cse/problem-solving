import java.util.Stack;

public class StackLinkedList {

    int length;
    ListNode top;

    public StackLinkedList() {
        top = null;
        length = 0;
    }

    private static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        if (top == null) {
            newNode.next = top;
            top = newNode;
            length++;
            return;
        }
        newNode.next = top;
        top = newNode;
        length++;
    }

    public void printStack() {
        ListNode temp = top;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void nextGreaterElement(int[] arr1) {
        int[] res = new int[arr1.length];
        Stack<Integer> value = new Stack<>();
        value.push(arr1[arr1.length - 1]);
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (!value.isEmpty()) {
                while (!value.isEmpty() && value.peek() <= arr1[i]) {
                    value.pop();
                }
            }
            if (value.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = value.peek();
            }
            value.push(arr1[i]);

        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

    public boolean validParentheses(String str){
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        for(char c:charArray){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else{
                if(stack.peek()=='('&&c==')'){
                    stack.pop();
                }
                else if(stack.peek()=='{'&&c=='}'){
                    stack.pop();
                }
                else if(stack.peek()=='['&&c==']'){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();

    } 

    public static void main(String[] args) {
        StackLinkedList obj = new StackLinkedList();
        obj.push(2);
        obj.push(5);
        obj.push(6);
        obj.push(9);
        obj.printStack();
        // reverse string using stack
        String str = "rokib";
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            stack.push(c);
        }
        System.out.println("reverser of string \"rokib\" is ");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
        // ! reverse string using stack
        int[] arr1 = { 4, 7, 3, 4, 8, 1 };
        obj.nextGreaterElement(arr1);
        if(obj.validParentheses("()()")){
            System.out.println("()() is valid parentheses");
        }else{
            System.out.println("()() is invalid parentheses");
        }
        if(obj.validParentheses("()()(")){
            System.out.println("()()( is valid parentheses");
        }else{
            System.out.println("()()( is invalid parentheses");
        }
    }
}
