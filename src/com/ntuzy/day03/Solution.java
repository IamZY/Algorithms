package com.ntuzy.day03;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author IamZY
 *
 */
class Solution {
	public boolean isPalindrome(int x) {
        int temp = x;
		if(x==0){
            return true;
        }
    	if(x<0) {
    		return false;
    	}
    	return fun(x)==temp?true:false;
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
    	System.out.println(solution.isPalindrome(5));
    }
    
    
}
