import java.util.*;

public class BalancedParams {
	static void checkIsBalanced(String ss) {
		Stack<Character> stack = new Stack<Character>();
		char c;
		for(int i=0; i<ss.length() ; i++)
			{	c= ss.charAt(i);
				stack.push(c);
			}
		if(stack.size()==1 || (stack.size())%2==1)
			System.out.println("not a balanced one");
		else {
			int closedCount=0;
			char stackChar;
			if(stack.pop()==')') {
				
				closedCount++;
				
				while(!stack.isEmpty()) {
					stackChar= stack.pop();
					if(stackChar=='(')
						closedCount--;
					else if (stackChar==')' )
						closedCount++;
				}
				if(closedCount==0)
					System.out.println("balanced one!!");
				else
					System.out.println("unbalanced One!!");
				
			}
			else
				System.out.println("not a balanced one");
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		String ss=new String("()())");
		checkIsBalanced(ss);

	}

}
