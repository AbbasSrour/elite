package hacker;

import java.util.ArrayList;
import java.util.List;


class TreeConverter {

    /*
     * Write the code of the function "convertToList" with the following specifications:
     * Parameters: "head" is of type TreeNode and references the head of the Binary Search Tree we want to convert 
     * Functionality: Build a list containing all the values from BST such that: 
     *      1. The list is sorted in descending order 
     *      2. The list has no NULL values
     * Return Value: the list you built
     */
    public static List<Integer> convertToList(CompleteTreeNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        if (head == null) {
            return list;
        }

        list.addAll(convertToList(head.right));
        list.add(head.value);
        list.addAll(convertToList(head.left));

        return list;
    }
}
