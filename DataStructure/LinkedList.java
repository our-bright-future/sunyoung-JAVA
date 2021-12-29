package list.linkedlist.implementation;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	//LinkedList의 innerclass 정의
	private class Node{  
		
		//하나의 노드는 데이터와 링크를 포함해야함
		private Object data;
		private Node next;
		
		//객체 생성시 초기화
		public Node(Object input) { 
			this.data = input;
			this.next = null; 
		}
		public String toString() {
			return String.valueOf(this.data); 
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next == null) {  //헤드의 next가 존재하지않는다면 tail은 head
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) {
			addFirst(input);  //사이즈가 0이면 데이터를 앞쪽에 넣건 뒤쪽에 넣던 상관x
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	//add에 이용하기 위함
	Node node(int index) {
		Node x = head;
		for(int i=0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	
	public void add(int k, Object input) {
		if(k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	//출력할때 데이터를 출력하기 위해 구현
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str+"]";
	}
	
	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	public Object remove(int k) {
		if(k == 0) {
			return removeFirst();
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		
		if(todoDeleted == tail) {
			tail = temp;
		}
		
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	public Object removeLast() {
		return remove(size-1);
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}
}
