import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Stack {
	
	public static int[] stack;
	public static int size = 0;
	
	//push X: 정수 X를 스택에 넣는 연산이다.
	public static void push(int X) {
		stack[size] = X;
		size++;
	}
	
	//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int pop = stack[size-1];
			stack[size-1] = 0;
			size--;
			return pop;
		}	
	}
	
	//size: 스택에 들어있는 정수의 개수를 출력한다.
	public static int size() {
		return size;
	}
	
	//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	public static int empty() {  
		
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size-1];
		}
	}
	

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		stack = new int[N];
		
		for(int i=0;i<N;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			
				case "push":
					push(Integer.parseInt(st.nextToken()));
					break;
					
				case "pop":
					sb.append(pop()).append('\n');
					break;
					
				case "size":
					sb.append(size()).append('\n');
					break;
					
				case "empty":
					sb.append(empty()).append('\n');
					break;
					
				case "top":
					sb.append(top()).append('\n');
					break;
			}
 
		}
		System.out.println(sb);
	}

}
