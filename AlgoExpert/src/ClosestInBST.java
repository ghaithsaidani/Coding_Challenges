public class ClosestInBST {
    public static int findClosestValueInBst(BST tree, int target) {
        if(tree!=null) {
            BST arbre;
            if(target<tree.value && tree.left!=null)
                arbre=tree.left;
            else if(target>tree.value && tree.right!=null)
                arbre=tree.right;
            else arbre=tree;
            while (arbre.right!=null || arbre.left!=null){
                if (target>arbre.value && arbre.right!=null){
                    if(Math.abs(arbre.value - target) > Math.abs(arbre.right.value - target))
                        arbre=arbre.right;
                    else break;
                }

                else if (target<arbre.value && arbre.left!=null) {
                    if (Math.abs(arbre.value - target) > Math.abs(arbre.left.value - target))
                        arbre = arbre.left;
                    else break;
                }
                else break;
            }

            if(Math.abs(arbre.value-target)<Math.abs(tree.value-target)) {
                if (target>tree.value && tree.right!=null)
                    return findClosestValueInBst(tree.right, target);
                else if (target< tree.value && tree.left!=null) {
                    return findClosestValueInBst(tree.left,target);
                }
                else return tree.value;
            }
            else return tree.value;
        }
        return 0;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(BST arbre,int val){
            if(arbre==null)
                return new BST(val);
            else if (val>arbre.value)
                arbre.right=insert(arbre.right,val);
            else if(val< arbre.value)
                arbre.left=insert(arbre.left,val);
            else return arbre;
            return arbre;
        }
        public void affichercroissant(BST arbre){
            if(arbre!=null) {
                affichercroissant(arbre.left);
                System.out.println(arbre.value);
                affichercroissant(arbre.right);

            }
        }
    }

    public static void main(String[] args) {
        BST arbre=new BST(100);
        //arbre=arbre.insert(arbre,10);
        /*arbre=arbre.insert(arbre,15);
        arbre=arbre.insert(arbre,22);
        arbre=arbre.insert(arbre,13);
        arbre=arbre.insert(arbre,14);
        arbre=arbre.insert(arbre,5);
        arbre=arbre.insert(arbre,5);
        arbre=arbre.insert(arbre,2);
        arbre=arbre.insert(arbre,1);*/
        arbre=arbre.insert(arbre,502);
        arbre=arbre.insert(arbre,55000);
        arbre=arbre.insert(arbre,1001);
        arbre=arbre.insert(arbre,4500);
        arbre=arbre.insert(arbre,204);
        arbre=arbre.insert(arbre,205);
        arbre=arbre.insert(arbre,207);
        arbre=arbre.insert(arbre,208);
        arbre=arbre.insert(arbre,206);
        arbre=arbre.insert(arbre,203);
        arbre=arbre.insert(arbre,5);
        arbre=arbre.insert(arbre,15);
        arbre=arbre.insert(arbre,22);
        arbre=arbre.insert(arbre,57);
        arbre=arbre.insert(arbre,60);
        arbre=arbre.insert(arbre,2);
        arbre=arbre.insert(arbre,3);
        arbre=arbre.insert(arbre,1);
        arbre=arbre.insert(arbre,-51);
        arbre=arbre.insert(arbre,-403);
        /*arbre=arbre.insert(arbre,5);
        arbre=arbre.insert(arbre,2);
        arbre=arbre.insert(arbre,1);
        arbre=arbre.insert(arbre,-51);
        arbre=arbre.insert(arbre,-403);*/
        System.out.println(findClosestValueInBst(arbre,30000));
    }
}
