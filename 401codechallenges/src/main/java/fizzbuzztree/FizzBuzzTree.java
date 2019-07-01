package fizzbuzztree;

import tree.BinaryTree;
import tree.Node;


public class FizzBuzzTree {

    public FizzBuzzTree(){ }

    public BinaryTree fizzBuzz(BinaryTree binaryTree){

        fizzBuzz( binaryTree.getRoot());

        return binaryTree;
    }

    private void fizzBuzz( Node node) {
        if (node != null) {

            fizzBuzz(node.left);

            if((int)node.data % 3 == 0){
                node.data = "Fizz";
            } else if ((int)node.data % 5 == 0){
                node.data = "buzz";
            } else if ((int)node.data % 3 == 0 && (int)node.data % 5 == 0){
                node.data = "FizzBuzz";
            }

            fizzBuzz(node.right);
        }
    }
}
