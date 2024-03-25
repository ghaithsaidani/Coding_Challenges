import models.TreeNode;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null)
            return true;
        if(p == null || q == null){
            return false;
        }
        if(p != null && q != null){
            return (p.getVal() == q.getVal()) && isSameTree(p.getLeft(),q.getLeft()) && isSameTree(p.getRight(),q.getRight());
        }
        return false;
    }



    public static void main(String[] args) {
        TreeNode p = new TreeNode(6, new TreeNode(4, new TreeNode(3), new TreeNode(5)), new TreeNode(7));
        TreeNode q = new TreeNode(6, new TreeNode(3, new TreeNode(2), new TreeNode(5)), new TreeNode(7));
        System.out.println(isSameTree(p,q));
    }
}
