import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BsearchTree {
    public static class Node {
        int val;
        int key;

        Node left;
        Node right;
    }

    private Node root = null;
//纯key模型 Set
//key-value Map
    public int getOrDefalt(int key, int defaultvalue) {
        Node cur = root;
        while (cur != null) {
            if (key == cur.key) {
                return cur.val;
            } else {
                if (key > cur.key) {
                    cur = cur.right;
                } else {
                    cur = cur.left;
                }
            }
        }
        return defaultvalue;
    }
    public int put(int key,int value){
        if(root==null){
            root=new Node();
            root.key=key;
            root.val=value;
            return -1;
        }
        Node parent=null;
        Node cur=root;
        while(cur!=null){
            if(key==cur.key){
                int oldValue=cur.val;
                cur.val=value;
                return oldValue;
            }else if(key<cur.key){
                parent=cur;
                cur=cur.left;
            }else{
                parent=cur;
                cur=cur.right;
            }
        }
        Node node=new Node();
        node.key=key;
        node.val=value;

        if(key<node.key){
            parent.left=node;
        }else{
            parent.right=node;
        }
        return -1;
    }
    public Set<Integer>keyset(){
        Set<Integer>result=new HashSet<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node front=queue.poll();
            result.add(front.key);
            if(root.left!=null){
                queue.add(front.left);
            }
            if(root.right!=null){
                queue.add(front.right);
            }
        }
        return result;

    }
    public boolean containsKey(Object key){
        if()
    }

}

