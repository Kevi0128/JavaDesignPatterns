package cn.kevi.study.design.structure.Composite;

import sun.reflect.generics.tree.Tree;

public class CompositeTest {

    public static void main(String[] args){
        TreeNode tree = new TreeNode("root");
        TreeNode l_child = new TreeNode("L");
        TreeNode l_child_l = new TreeNode("L_l");
        TreeNode l_child_r = new TreeNode("L_r");
        TreeNode r_child = new TreeNode("R");
        TreeNode r_child_l = new TreeNode("R_l");
        TreeNode r_child_r = new TreeNode("R_r");
        l_child.add(l_child_l);
        l_child.add(l_child_r);
        r_child.add(r_child_l);
        r_child.add(r_child_r);
        tree.add(l_child);
        tree.add(r_child);
    }

}
