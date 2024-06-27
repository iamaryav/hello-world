public class BinarySearchTree{

    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node newNode = new Node(value);

        if(root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;

        while(true){
            if(temp.value == newNode.value) return false;

            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value){
        Node temp = root;

        while(temp != null){
            if(value == temp.value){
                return true;
            }else if(value < temp.value){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(6);
        bst.insert(3);
        bst.insert(9);
        bst.insert(4);
        System.out.println(bst.root.right.value);
        System.out.println(bst.contains(9));
        System.out.println(bst.contains(12));

    }
}