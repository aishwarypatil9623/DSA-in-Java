import java.util.*;

public class Arrayinjava {
    public static int trappedRainwater(int height[]) {
        int n =height.length;
        //calculate left max boundary - array                 //auxilary arrays i.e. Helper arrays
        int leftMax[]= new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //calculate left max boundary - array                 //auxilary arrays i.e. Helper arrays
        int RightMax[]= new int[height.length];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i], RightMax[i+1]);
        }
        
        int trappedwater = 0;
        //loop 
        for(int i =0;i<height.length;i++){
            int waterlevel = Math.min(leftMax[i],RightMax[i]);
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;
        //waterlevel = min(leftmax boundary,rightmax boundary)
        //trapped watter = waterlevel - height[i]
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    } 
}   
