import Util.RandomNumberGenerator;

class Node<T>
{
	Node<T> next;
	T val;
	
	Node(T val){
		this.val= val;
	}
	
	static Node<Integer> makeNode() {
		Util.RandomNumberGenerator.generateRandomNumber();
		return new Node<Integer>(new Integer(RandomNumberGenerator.getRandomNumber()));		
	}

}
