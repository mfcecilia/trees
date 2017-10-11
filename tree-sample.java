package vtProgTeam;
import java.util.*;

public class TreeSample {

    public class Tree
    {
        int val; //value
        Tree left, right; //pointer to left and right child
        Tree parent; //this isn't particularly necessary. proper recursion handles this (self balancing trees need this though)

    }
    
  //this entire example method checks if the sub trees are the same shape

    public boolean equal(Tree a, Tree b)
    {
        //base cases
        //if there's nothing there (2 things that are null are equal)
        if (a == null && b==null)
        {
            return true;
        }
        //what if one is null and the other isn't?
        else if (a==null || b==null)
        {
            return false;
        }
        //check if the same value is at the root node
        if (a.val != b.val)
        {
            return false;
        }
        //recursion
        return equal(a.left, b.left) && equal(a.right, b.right);

    }

    //this method example checks if this is a BST in the first place

    public boolean isBST(Tree a)
    {
        //null base case
        if (a==null)
        {
            return true;
        }
        //left child should be less than parent base case
        if (a.left != null && a.left.val > a.val)
        {
            return false;
        }
        //right child base case
        if (a.right != null && a.right.val < a.val)
        {
            return false;
        }
        //recursion
        return isBST(a.left) && is.BST(a.right);
    }
}
