import java.util.*;
class Compute {

    public String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Long> ans = new ArrayList<>();
        
        for(Long i : a1){
            ans.add(i);
        }
      for(int i = 0; i < a2.length; i++){
        if(ans.contains(a2[i])){
            ans.remove(a2[i]);
        }
        else {
            return "No";
        }
      }
      return "yes";
    }
}