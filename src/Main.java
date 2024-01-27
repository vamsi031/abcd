import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        Stack<Character> st = new Stack<>();

        Stack<Character> st2 = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("chose the option");
        System.out.println("press 1 for undo");
        System.out.println("press 0 for redo");
        System.out.println("press character to add");
        System.out.println("press * for exit");

        String option;
        do{
            option = sc.next();
            if(Character.isDigit(option.charAt(0))){
                int val=option.charAt(0)-'0';
                if (val == 1) {
                    if (st.size() > 0) {
                        st2.add(st.pop());
                    }
                } else if (val == 0) {
                    if (st2.size() > 0) {
                        st.add(st2.pop());
                    }
                }

            }
            else if(option.charAt(0)!='*'){
                st.add(option.charAt(0));
                st2.clear();
            }

            StringBuilder sb = new StringBuilder(st.toString());


            System.out.println(sb.toString());
        }while(option.equals("*")==false);




    }

}
