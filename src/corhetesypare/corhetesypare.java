/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corhetesypare;

/**
 *
 * @author WILY
 */
import java.util.*;

public class corhetesypare {

    public void coinciden(String c) {
        boolean flag = true;

        int l = c.length();
        flag = true;
        Stack<String> st = new Stack<String>();
        for (int i = 0; i < l; i++) {
            //substrating estra del arrgelo de Stirng de una posicion y lo incrementa 
            String ch = c.substring(i, i + 1);
            if (ch.equals("(")) {
                st.push(ch);
            } else if (ch.equals("{")) {
                st.push(ch);
            } else if (ch.equals("[")) {
                st.push(ch);
            } else if (ch.equals(")")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("(")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            } else if (ch.equals("}")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("{")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            } else if (ch.equals("]")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("[")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag && st.empty()) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        corhetesypare kl = new corhetesypare();
        kl.coinciden("{[()]}");
        kl.coinciden("{[(])}");
        kl.coinciden("{{[[(())]]}}");
        kl.coinciden("([][][[[[[]]]]]]]])");
    }

}
   

