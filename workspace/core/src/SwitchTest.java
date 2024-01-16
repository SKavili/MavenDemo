

import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.function.DoubleToIntFunction;

public class SwitchTest {
        static Object get(Collection c) {

            return switch (c) {
                case Stack s -> s.pop();
                case LinkedList l -> l.getFirst();
                case Vector v -> v.lastElement();
                default -> c;
            };
        }


        static int get1(int c) {

            return switch (c) {

                case 1 -> 1;
                case 2 -> 2;
                case 3 -> 3;
                default ->4 ;
            };
        }

      static  int get2(int i){

          int value = 5;
          switch (value) {
              case 1:
                  System.out.println("One");
                  break;
              case 5:
                  System.out.println("five");
                  break;
              default:
                  System.out.println("Unknown");
          }



            switch (value) {
                case 1:
                    System.out.println("One");
                    return 1;

                case 5:
                    System.out.println("five");
                    return 2;

                default:

                    System.out.println("Unknown");
                    return 3;
            }


        }
        public static void main(String[] argv) {

            var stack = new Stack<String>();
            stack.push("1");
            stack.push("2");
            stack.push("3");

            var linkedList = new LinkedList<String>();

            linkedList.add("11");
            linkedList.add("21");
            linkedList.add("31");

            var vector = new Vector<String>();

            vector.add("111");
            vector.add("211");
            vector.add("311");

            System.out.println(get(stack));
            System.out.println(get(linkedList));
            System.out.println(get(vector));

            System.out.println(get1(0));
            System.out.println(get1(1));
            System.out.println(get1(2));

            System.out.println(get2(0));
            System.out.println(get2(1));
            System.out.println(get2(2));
        }
    }

