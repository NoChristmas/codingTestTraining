package Solving;

import java.util.HashSet;

public class PhoneKetMon {

	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		int max = nums.length/2;
		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<nums.length; i++){
			
			set.add(nums[i]);

		}
		
		if(set.size()<(nums.length/2)){
			max = set.size();		 
		}
		
		System.out.println(max);
	}
	
}

/*//Max값은 배열길이 /2임
int max = nums.length / 2;
//Ex)1,2,3,4	2개를 뽑는데 어차피 2가지 경우의 수가 가장 높은 경우이기 때문 (겹치지만 않으면 됨)

// 중복제거하기   //Set을 사용하여 숫자 제거
HashSet<Integer> numsSet = new HashSet<>();

for (int num : nums) numsSet.add(num); 


// 중복을 제거한 셋의 크기가 max보다 크면 max를, 작으면 numsSet의 size를 리턴
if (numsSet.size() > max) System.out.println(max);


else System.out.println(numsSet.size());*/