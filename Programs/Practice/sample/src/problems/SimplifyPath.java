package problems;

import java.util.Stack;

public class SimplifyPath {

	
	public String simplifyPath (String s){
		String[] str = s.split("/");
		Stack<String> stk = new Stack<>();
		
		for(int i=0;i<str.length;i++){
			
			if(str[i].equals(".")) {continue;}
			
			else if(str[i].equals("..")){
				if(!stk.isEmpty()) stk.pop();
				
			}
			else if(!str[i].equals(""))stk.push(str[i]);
		}
		if(stk.isEmpty()) return "/";
		String result = "";
		while(!stk.isEmpty()){
			result = "/"+stk.pop()+result;
		}
		return result;
	}
	
	public static void main(String[] args){
		SimplifyPath s = new SimplifyPath();
		//String res = s.simplifyPath("/home/");
		String res = s.simplifyPath("/a/./b/../../c/");
		System.out.print("res = " +res);
	}
}
