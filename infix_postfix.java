import java.util.*;
public class infix_postfix {
    char stack[];
    int sp;
    infix_postfix() {
        stack = null;
        sp = -1;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String s = sc.next();
        System.out.println("Converted Expression: " + new infix_postfix().convert(s));
    }
    void push(char x) {
        sp++;
        stack[sp] = x;
    }
    void pop() {
        sp--;
    }
    char peek() {
        return stack[sp];
    }
    int precedence(char x) {
        switch(x) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    String convert(String exp) {
        String s = "";
        stack = new char[exp.length()];
        for(int i=0; i<exp.length(); i++) {
            char ch = exp.charAt(i);
            if(Character.isLetter(ch))
                s += ch;
            else if(ch == '(')
                push(ch);
            else if(ch == ')') {
                while(sp != -1 && peek() != '(') {
                    s += peek();
                    pop();
                }
                pop();
            }
            else {
                while(sp != -1 && precedence(ch) <= precedence(peek())) {
                    s += peek();
                    pop();
                }
                push(ch);
            }
        }
        while(sp != -1) {
            s += peek();
            pop();
        }
        return s;
    }
}
// Sample Input and Output:
// Infix: (A/B+C)/(D*(E-F))
// Postfix: AB/C+DEF-*/