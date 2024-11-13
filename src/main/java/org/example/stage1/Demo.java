package org.example.stage1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo  {


    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        Demo demo = new Demo();
        RedBlackTree<Integer> tree = new RedBlackTree<>();
        Scanner scanner = new Scanner(System.in);
        String cmd = "";
        while (!"exit".equals(cmd)){
            System.out.print("> ");
            cmd = scanner.nextLine();
            String[] cmds = cmd.split(" ");
            if(cmds.length == 1){
                if(cmds[0].equals("inorder")){
                    System.out.println(tree.leftCurRight());
                }
                if(cmds[0].equals("clear")){
                    tree.clear();
                }

            }
            if(cmds.length == 2){
                if(cmds[0].equals("+")){
                    tree.add(Integer.valueOf(cmds[1]));
                }
                if(cmds[0].equals("-")){
                    tree.remove(Integer.valueOf(cmds[1]));
                }
                if(cmds[0].equals("?")){
                    System.out.println(tree.contains(Integer.valueOf(cmds[1])));
                }

                if(cmds[0].equals("inc")){
                    String[] range = cmds[1].split(":");
                    Integer minValues = Integer.valueOf(range[0]);
                    Integer maxValues = Integer.valueOf(range[1]);
                    for (int i = minValues; i < maxValues; i++) {
                        tree.add(i);
                    }
                }
                if(cmds[0].equals("dec")){
                    String[] range = cmds[1].split(":");
                    Integer minValues = Integer.valueOf(range[0]);
                    Integer maxValues = Integer.valueOf(range[1]);
                    for (int i = maxValues; i > minValues; i--) {
                        tree.add(i);
                    }
                }
            }

            tree.print();
            System.out.println(tree.leftCurRight());
        }
    }

}
