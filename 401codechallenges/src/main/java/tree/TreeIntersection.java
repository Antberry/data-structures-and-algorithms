package tree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

    public ArrayList<Object> TreeIntersection(BinaryTree binaryTree1, BinaryTree binaryTree2){

        List<Object> list1 = binaryTree1.preOrder(binaryTree1.getRoot());
        List<Object> list2 = binaryTree2.preOrder(binaryTree2.getRoot());
        ArrayList<Object> numbers = new ArrayList<Object>();

        for(int i = 0; i < list1.size(); i++) {
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i).equals(list2.get(j))){
                    numbers.add(i);
                }
            }
        }
        return numbers;
    }



}
