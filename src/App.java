
public class App {
    public static void main(String[] args) {
          public class linkedlist<T> {
              Node root;
              private static class Node {
                  data;
              Node next;
              public Node (T data, Node next) {
              this.data = data;
              this.next = next;

              }
              }
              public void add (T t) {
              if (root == null){
                  root = new Node(t);

              } else {
                  Node cur = root;
                  while (cur.next! = null)
                  cur = cur.next
              }
              cur.next = new Node (t);

              }}
              public boolean delate(T t) {
                  if(root == null) return false;
        if(t.equals(root.data)){
            root = null;
            return true;

        }
        Node prev = root;
        Node cur  = prev.next;
        while (cur ! = null){

        }
    }
          }