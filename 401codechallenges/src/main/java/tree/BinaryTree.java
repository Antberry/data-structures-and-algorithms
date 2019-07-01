package tree;

import java.util.ArrayList;


    public class BinaryTree {
        public Node root;

        public BinaryTree(){
            root = null;
        }

        public Node getRoot() {
            return root;
        }

        public BinaryTree(Node node){
            this.root = node;
        }

        public ArrayList<Object> preOrder(Node node){
            ArrayList<Object> list = new ArrayList<>();

            preOrder(list, node);

            return list;
        }

        public ArrayList<Object> inOrder(Node node){
            ArrayList<Object> list = new ArrayList<>();

            inOrder(list, node);

            return list;
        }


        public ArrayList<Object> postOrder(Node node){
            ArrayList<Object> list = new ArrayList<>();

            postOrder(list, node);

            return list;
        }

        private ArrayList<Object> inOrder(ArrayList<Object> list, Node node) {
            if (node != null) {
                inOrder(list, node.left);

                list.add(node.data);

                inOrder(list, node.right);

            }
            return list;
        }

        private ArrayList<Object> preOrder(ArrayList<Object> list, Node node){
            if(node != null){

                list.add(node.data);

                preOrder(list, node.left);


                preOrder(list, node.right);

            }
            return list;
        }

        private ArrayList<Object> postOrder(ArrayList<Object> list, Node node){
            if(node != null){

                postOrder(list, node.left);

                postOrder(list, node.right);

                list.add(node.data);

            }
            return list;
        }
    }
