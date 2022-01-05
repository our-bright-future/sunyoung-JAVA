import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue {
	
	public static int[] queue;
	public static int size = 0;
	
	//push X: 정수 X를 큐에 넣는 연산이다.
	public static void push(int X) {
		queue[size] = X;
		size++;
	}

	//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int pop = queue[0];
			
			for(int i=0;i<size-1;i++) {
				queue[i] = queue[i+1];
			}
			
			size--;
			return pop;
		}	
	}
	
	//size: 큐에 들어있는 정수의 개수를 출력한다.
	public static int size() {
		return size;
	}
	
	//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
	public static int empty() {  
		
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	

	//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int front() {
		
		if(size == 0) {
			return -1;
		}
		else {
			return queue[0];
		}
	}
	
	
	//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int back() {
		
		if(size == 0) {
			return -1;
		}
		else {
			return queue[size-1];
		}
		
	}
	

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		queue = new int[N];
		
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
					
				case "front":
					sb.append(front()).append('\n');
					break;
					
				case "back":
					sb.append(back()).append('\n');
					break;
					
			}
 
		}
		System.out.println(sb);
	}

}
