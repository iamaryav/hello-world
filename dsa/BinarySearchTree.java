import java.util.*;

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

    public void rDelete(int value){
        rDelete(root, value);
    }

    public Node rDelete(Node currentNode, int value){
        if(currentNode == null) return null;

        if(value < currentNode.value){
            currentNode.left = rDelete(currentNode.left, value);
        }else if(value > currentNode.value){
            currentNode.right = rDelete(currentNode.right, value);
        }else{
            if(currentNode.left == null && currentNode.right == null){
                return null;
            }else if(currentNode.left == null){
                currentNode = currentNode.right;
            }else if(currentNode.right == null){
                currentNode = currentNode.left;
            }else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = rDelete(currentNode.right, subTreeMin);
            }

        }
        return currentNode;
    }

    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void rInsert(int value){
        if(root == null) root = new Node(value);
        rInsert(root, value);
    }

    public Node rInsert(Node currentNode, int value){
        if(currentNode == null){
           return new Node(value);
        }
        if(value < currentNode.value){
            currentNode.left =  rInsert(currentNode.left, value);
        }else if(value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;

    }

    public boolean rContains(int value){
        return rContains(root, value);
    }

    public boolean rContains(Node currentNode, int value){
        if(currentNode == null){
            return false;
        }

        if(currentNode.value == value){
            return true;
        }

        if(value < currentNode.value){
            return rContains(currentNode.left, value);
        }else{
            return rContains(currentNode.right, value);
        }

    }

    public List<Integer> BFS(){
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        List<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while(queue.size() > 0){
            currentNode = queue.remove();
            results.add(currentNode.value);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    // Depth first search
    // preorder
    public ArrayList<Integer> DFSPreOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        
        class Traverse{
            Traverse(Node currentNode){
                results.add(currentNode.value);
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

    // post order
    public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        
        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traverse(root);
        return results;
    }   
    // inorder traversal
    public ArrayList<Integer> DFSInOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        
        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        // bst.rInsert(5);
        // bst.rInsert(6);
        // bst.rInsert(3);
        // bst.rInsert(9);
        // bst.rInsert(4);
        // bst.rInsert(10);
        // bst.rInsert(41);
        // System.out.println(bst.root.right.value);
        // System.out.println(bst.contains(9));
        // System.out.println(bst.rContains(9));
        // bst.rDelete(9);
        // System.out.println(bst.rContains(9));

        // System.out.println("Min value: " + bst.minValue(bst.root));

        bst.rInsert(47);
        bst.rInsert(21);
        bst.rInsert(76);
        bst.rInsert(18);
        bst.rInsert(27);
        bst.rInsert(52);
        bst.rInsert(82);
        System.out.println(bst.BFS());
        System.out.println(bst.DFSPreOrder());
        System.out.println(bst.DFSPostOrder());
        System.out.println(bst.DFSInOrder());

    }
}