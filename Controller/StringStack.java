package Controller;

import java.util.Vector;

public class StringStack {
  private Vector<String> words;
  private int top;

  public StringStack() {
    this.words = new Vector<>();
    this.top = -1;
  }

  public boolean isEmpty() {
    return this.top == -1;
  }

  public boolean isFull() {
    return this.top == 9;
  }

  public void push(String word) {
    // if (isFull()) {
    // System.out.println("Error: full stack!");
    // } else {
    // this.top += 1;
    // this.words.addLast(word);
    // }

    this.top += 1;
    this.words.addLast(word);
  }

  public String pop() {
    if (isEmpty()) {
      System.out.println("Error: empty stack!");
      return "";
    } else {
      this.top -= 1;
      return this.words.remove(this.top + 1);
    }
  }

  public String peek() {
    return this.words.getLast();
  }

  public int search(String word) {
    for (int i = top; -1 < i; i--) {
      if (this.words.get(i).equals(word)) {
        return i;
      }
    }

    return -1;
  }

  public Vector<String> getWords() {
    return this.words;
  }

  public int getTop() {
    return this.top;
  }
}
