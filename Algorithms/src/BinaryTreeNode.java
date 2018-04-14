import Util.RandomNumberGenerator;
import Util.SerialNumberGenerator;

class BinaryTreeNode<T>
{
	BinaryTreeNode<Integer> left;
	BinaryTreeNode<Integer> right;
	T val;
	
	BinaryTreeNode(T val){
		this.val= val;
	}
	
	static BinaryTreeNode<Integer> makeNode() {
		return new BinaryTreeNode<Integer>(RandomNumberGenerator.generateRandomNumber().getRandomNumber());		
		//return new BinaryTreeNode<Integer>(SerialNumberGenerator.getRandomNumber());		

	}

}