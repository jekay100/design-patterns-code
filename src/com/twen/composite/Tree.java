package com.twen.composite;

import java.util.Enumeration;

/**
 * Created by congye on 6/16/2015.
 */
public class Tree {

    public TreeNode root = null;

    public Tree(String name){
        root = new TreeNode(name);
    }

    public void printTreeNodeName(TreeNode treeNode){
        Enumeration<TreeNode> eTreeNode = treeNode.getChildren();
        if (eTreeNode.hasMoreElements()){
            TreeNode nextTreeNode = eTreeNode.nextElement();
            System.out.println("nextTreeNode Name:"+nextTreeNode.getName());
            printTreeNodeName(nextTreeNode);
        }
    }

}
