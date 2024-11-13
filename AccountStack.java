//Zaven Ranum
//CS2050

import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AccountStack<T> {
    private ArrayList<T> stack;

    public AccountStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        } else {
            return null; 
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void writeToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (T item : stack) {
                writer.println(item.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
