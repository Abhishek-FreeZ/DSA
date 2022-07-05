package tree.basicTree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChildren(TreeNode node){
        this.children.add(node);
    }

    public String print(int level){
        String ret="";
        for(int i=0;i<level;i++){
            ret+="  ";
        }
        ret+=data+"\n";
        for(TreeNode node:this.children){
            ret+= node.print(level+1);
        }
        return ret;
    }
}
