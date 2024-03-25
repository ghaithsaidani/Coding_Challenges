import models.TreeNode;

import java.util.List;

public class InorderTraversal {
    public static void inorderTraversal(TreeNode root) {
        if(root!=null) {
            inorderTraversal(root.getLeft());
            System.out.println(root.getVal());
            inorderTraversal(root.getRight());
        }
    }

    public static void main(String[] args) {
        TreeNode q = new TreeNode(6, new TreeNode(3, new TreeNode(2,null,null), new TreeNode(5,null,null)), new TreeNode(7,null,null));
        inorderTraversal(q);
    }
}
