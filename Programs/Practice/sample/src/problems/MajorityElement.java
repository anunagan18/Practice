package problems;

public class MajorityElement {
	public int findMajorityElement (int[] nums){
		int majElem = nums[0];
		int count =1;
		for(int i=1;i<nums.length;i++){
			if(count == 0){
				majElem = nums[i];
				count = 1;
			}else if(nums[i] == majElem){
				count ++;
			}else{
				count --;
			}
		}
		
		
		return majElem;
		
	}
	
	public static void main(String[] args){
		MajorityElement m = new MajorityElement();
		int[] nums = {1,2,1,3};
		int result = m.findMajorityElement(nums);
		System.out.print("RESULT =" +result);
	}
}	
