/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map=new TreeMap<>();
    public void dfs(TreeNode root,int row,int col){
        if(root==null) return;
        if(!map.containsKey(col)){
            map.put(col,new TreeMap<>());
        }
        if(!map.get(col).containsKey(row)){
            map.get(col).put(row,new ArrayList<>());
        }
        map.get(col).get(row).add(root.val);
        dfs(root.left, row + 1, col - 1);
        dfs(root.right, row + 1, col + 1);


    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
      
        dfs(root,0,0);
        for(Map.Entry<Integer,TreeMap<Integer,ArrayList<Integer>>> entry:map.entrySet()){
            TreeMap<Integer,ArrayList<Integer>> levelMap=entry.getValue();
            ArrayList<Integer> list=new ArrayList<>();
            for(Map.Entry<Integer,ArrayList<Integer>> subEntry:levelMap.entrySet()){
                ArrayList<Integer> subList=subEntry.getValue();
                Collections.sort(subList);
                list.addAll(subList);
            }
            ans.add(list);
        }
        return ans;
        
    }
}