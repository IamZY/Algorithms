package com.ntuzy.day02;

/**
 * 给定一个 32位有符号整数，将整数中的数字进行反转。
 * 给定一个 32位有符号整数，将整数中的数字进行反转。
 * @author IamZY
 *
 */
class Solution {
	public int reverse(int x) {
        if(x==0){
            return 0;
        }
    	if(x<0) {
    		x = -x;
    		return -fun(x);
    	}
    	return fun(x);
    }
    
    public int fun(int x) {
    	try {
    		StringBuilder sb = new StringBuilder();
        	while(x!=0) {
        		int temp = x;
        		x = x%10;
        		sb.append(x);
        		x = temp/10;
        	}
        	return Integer.parseInt(sb.toString());
		} catch (Exception e) {
			return 0;
		}
    	
    }
    
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	System.out.println(solution.fun(1234567899));
    }
    
    
}
