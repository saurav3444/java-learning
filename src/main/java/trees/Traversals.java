package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Traversals {

    //Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node node)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();

        Queue<Node> q = new LinkedList<>();

        q.add(node);

        while(q.peek()!=null){

            Node curr = q.poll();

            if(curr!=null);
            res.add(curr.data);

            if(curr.left!=null)
                q.add(curr.left);

            if(curr.right!=null)
                q.add(curr.right);

        }

        return res;

    }

    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();

        getPostOrder(root, res);

        return res;
    }

    void getPostOrder(Node root, ArrayList<Integer> res){

        if(root==null)
            return;

        getPostOrder(root.left, res);
        getPostOrder(root.right, res);
        res.add(root.data);
    }
}
