import java.lang.Math;

public class BinaryNumbers {
    
    public int[] convertToBinary(int n){
	int num[]  = new int[32];
    int count = 31;
    while(n != 0){
        num[count] = n % 2;
        n = n/2;
        count--;
    }
    	return num;
	}
    
    	public int[] Reverse(int[] binary){
		int num[]  = new int[32];
		int c = 0;
		for(int i = 31; i >= 0 ; i--){
			num[i] =  binary[c];
			c++;
		}
		return num;
	}
    
    public int Final(int[] binary){
        int count = 31;
		int sum = 0;
		for(int i = 0; i < 32; i++ ){
			 
			sum = sum + (int) (Math.pow(2, count) * binary[i]);;
			count --;
		}
		return sum;
    }
    
    public void display(int[] nums){
    	for(int i = 0; i < nums.length; i++){
        	System.out.print(nums[i]);
    	}
    	System.out.println("");
    	
    }
    
}
