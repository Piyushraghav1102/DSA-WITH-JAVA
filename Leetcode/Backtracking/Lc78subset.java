
import java.util.ArrayList;
import java.util.List;

public class Lc78subset {
    
    public static void helper(int nums[],int ind,List<Integer> curr,List<List<Integer>>  res){

        
        if (ind == nums.length) {
            //print the nums  
            res.add(new ArrayList<Integer>(curr));
            return;
            
            
        }
      
        // include part
        curr.add(nums[ind]);
        helper(nums, ind + 1, curr,res);

        //pop fot the backtracking
        curr.remove(curr.size()-1);

        //Exclude
        helper(nums, ind + 1,curr, res);
   

    }

    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> curr = new ArrayList<>();
        List <List<Integer>> res = new ArrayList<>();
        
        helper(nums, 0, curr, res);

        return res;

    
    }
}
