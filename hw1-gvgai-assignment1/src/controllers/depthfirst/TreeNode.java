package controllers.depthfirst;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class TreeNode {
    String val;
    int id;
    String direction;
    ArrayList<TreeNode> leaf;

    public TreeNode(String initVal,int initId) {
        val = initVal;
        id = initId;
    }

    public void add(TreeNode temp) {
        this.leaf.add(temp);
    }

    public void setId(int temp) {
        this.id = temp;
    }
}
