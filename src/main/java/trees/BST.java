package trees;

public class BST {

        Node insert(Node root, int Key)
        {
            helpInsert(root, Key);

            return root;
        }

        void helpInsert(Node root, int key) {

            if(root==null)
                return;

            if(key==root.data)
                return;

            if(key<root.data){

                if(root.left==null)
                    root.left = new Node(key);
                else
                    helpInsert(root.left, key);

            }
            else{

                if(root.right==null)
                    root.right = new Node(key);
                else
                    helpInsert(root.right, key);

            }


        }

}
