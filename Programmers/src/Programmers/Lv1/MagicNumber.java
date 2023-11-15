package Programmers.Lv1;

public class MagicNumber {
    public static void main(String[] args){
        int[] nums = {1,2,7,6,4};
        
        int result = 0;
        
        int a = 0;
        for(int i =0; i<nums.length-2; i++){
            a = nums[i];    
            int b = 0;
            
            for(int j=i+1; j<nums.length-1; j++){
                b = nums[j];
                int c = 0;
                
                for(int k=j+1; k<nums.length; k++){
                    c = nums[k];
                    
                    boolean flag = true;
                    for(int d = 2; d<=Math.sqrt(a+b+c); d++){
                        if((a+b+c)%d==0) {
                           flag = false;
                           break;
                            } 
                        }

                    if(flag) result++;
                        
                    }
                    
                }
            }
            System.out.println(result);
        }
        
    }

