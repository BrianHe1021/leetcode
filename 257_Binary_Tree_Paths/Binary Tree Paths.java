/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Method 1: Recursion
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resultList = new LinkedList<String>();
        if(root == null){return resultList;}
        if(root.left == null && root.right == null){
            resultList.add(Integer.toString(root.val));
            return resultList;
        }
        for(String s: binaryTreePaths(root.left)){
             resultList.add(Integer.toString(root.val)+"->"+s);
        }
        for(String s: binaryTreePaths(root.right)){
             resultList.add(Integer.toString(root.val)+"->"+s);
        }
        return resultList;
    }
}
//Method 2: BFS - Queue
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<String>();
        Queue<TreeNode> qNode=new LinkedList<TreeNode>();
        Queue<String> qStr=new LinkedList<String>();
        
        if (root==null) return list;
        qNode.add(root);
        qStr.add("");
        while(!qNode.isEmpty()) {
            TreeNode curNode=qNode.remove();
            String curStr=qStr.remove();
            
            if (curNode.left==null && curNode.right==null) list.add(curStr+curNode.val);
            if (curNode.left!=null) {
                qNode.add(curNode.left);
                qStr.add(curStr+curNode.val+"->");
            }
            if (curNode.right!=null) {
                qNode.add(curNode.right);
                qStr.add(curStr+curNode.val+"->");
            }
        }
        return list;
}

//Method 3: DFS - Stack
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<String>();
        Stack<TreeNode> sNode=new Stack<TreeNode>();
        Stack<String> sStr=new Stack<String>();
        
        if(root==null) return list;
        sNode.push(root);
        sStr.push("");
        while(!sNode.isEmpty()) {
            TreeNode curNode=sNode.pop();
            String curStr=sStr.pop();
            
            if(curNode.left==null && curNode.right==null) list.add(curStr+curNode.val);
            if(curNode.left!=null) {
                sNode.push(curNode.left);
                sStr.push(curStr+curNode.val+"->");
            }
            if(curNode.right!=null) {
                sNode.push(curNode.right);
                sStr.push(curStr+curNode.val+"->");
            }
        }
        return list;
}