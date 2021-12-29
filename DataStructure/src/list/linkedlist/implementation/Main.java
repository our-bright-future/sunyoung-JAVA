package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		
		LinkedList numbers = new LinkedList(); //LinkedList 클래스를 인스턴스화
		
		//addFirst
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		System.out.println(numbers);
		
		//addLast
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		System.out.println(numbers);
		
		//add
		numbers.add(1,15);
		System.out.println(numbers);
		
		//removeFirst
		numbers.removeFirst();
		System.out.println(numbers);
		
		//remove
		numbers.remove(2);
		System.out.println(numbers);
		
		//removeLast
		numbers.removeLast();
		System.out.println(numbers);
		
		//size
		System.out.println(numbers.size());
		
		//get
		System.out.println(numbers.get(2));
		
		//indexOf
		System.out.println(numbers.indexOf(20));
	}

}


