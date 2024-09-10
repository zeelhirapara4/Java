import java.util.Scanner;

/**
 * InnerPR7
 */
class Stack {

    int Stk[], top, max;

    public Stack() {
        max = 5;
        top = -1;
        Stk = new int[max];

    }

    public Stack(int size) {
        max = size;
        top = -1;
        Stk = new int[max];
    }

    public void push(int value) {
        if (top >= max - 1) {
            System.out.println("Stack overflow...");
        } else {
            top++;
            Stk[top] = value;
            System.err.println(value + "Inserted at index " + top);
        }
    }

    public int pop() {
        int rele = 0;
        if (top < 0) {
            System.out.println("Stack is empty...");
        } else {
            rele = Stk[top];
            Stk[top] = 0;
            top--;
        }
        return rele;
    }

    public void traverse() {
        if (top < 0) {
            System.out.println("Stack is empty..");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(Stk[i] + " ");
            }
        }
    }
}

public class PR7 {
    public static void main(String[] args) {
        int choice, rele;
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack();
        System.out.println("Stack Size : " + s1.max);

        while (true) {
            System.out.println("1 for push.");
            System.out.println("2 for pop. ");
            System.out.println("3 for Display.");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element : ");
                    s1.push(sc.nextInt());
                    break;
                case 2:
                    rele = s1.pop();
                    if (rele != 0) {
                        System.out.println("Removed element : " + rele);
                    }
                    break;
                case 3:
                    s1.traverse();
                    break;
                default:
                    System.out.println("Enter valid choice ");
                    break;
            }
        }

    }
}
