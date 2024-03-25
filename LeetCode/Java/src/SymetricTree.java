import models.TreeNode;

public class SymetricTree {
    public static boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;
        if(root.getLeft()==null || root.getRight()==null)
            return false;
        if(root!=null){
            return (root.getLeft().getVal()==root.getRight().getVal()) && isSymmetric(root.getLeft()) && isSymmetric(root.getRight());
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(3), new TreeNode(4)));
        System.out.println(isSymmetric(p));
    }
}
