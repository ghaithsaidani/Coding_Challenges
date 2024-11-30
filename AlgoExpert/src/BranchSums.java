import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public BinaryTree insert(BinaryTree tree,int val){
            if(tree==null)
                return new BinaryTree(val);
            else {
                if(tree.left==null)
                    tree.left=insert(null,val);
                else tree.right=insert(tree.right,val);
            }
            return tree;
        }

        public void afficher(BinaryTree root) {
            BinaryTree arbre=root;
            if(arbre!=null){

                afficher(arbre.left);

                afficher(arbre.right);
                System.out.println(arbre.value);

            }

        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        return new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        BinaryTree arbre=new BinaryTree(1);
        arbre.insert(arbre,2);
        arbre.insert(arbre,3);
        arbre.insert(arbre,4);
        arbre.insert(arbre,5);
        arbre.insert(arbre,6);
        arbre.insert(arbre,7);
        arbre.insert(arbre,8);
        arbre.insert(arbre,9);
        arbre.insert(arbre,10);
        arbre.afficher(arbre);
    }
}
