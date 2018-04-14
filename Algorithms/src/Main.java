import java.util.*;

import Util.RandomNumberGenerator;

public class Main
{
	private static int numNodes;
	
	public static void main(String args[])
	{
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("How many Nodes?");
		numNodes = sc.nextInt();
		*/
		
		/*		 
		Node[] allNodes =  new Node[numNodes];
		
		//Dependency Injections Can be Used for Testing Here
		
		for(int n = 0; n < numNodes ; n++ ){
			Node<Integer> node = Node.makeNode();
			allNodes[n] = node;
		}

		MyLinkedList linkedListObject = new MyLinkedList(allNodes,"head");
		linkedListObject.printLinkedList();
		*/
		//BinaryTreeNode[] allNodes =  new BinaryTreeNode[numNodes];
		int[] vals = { 91 , 96 , 73 ,38 , 98 , 31 ,39 , 60	, 48 , 43};
		BinaryTreeNode[] allNodes =  new BinaryTreeNode[vals.length];
		for(int n = 0; n < vals.length ; n++ ){
			//BinaryTreeNode<Integer> node = BinaryTreeNode.makeNode();

			allNodes[n] = new BinaryTreeNode<Integer>(vals[n]);;
		}
		
		BinaryTreeNode root = BST.makeTree(allNodes);
		
		//BST.reverseInOrderTraversal(root);
		boolean res = BST._checkBST( root , new ArrayList<Integer>());
		System.out.println("Result" + res);
		
		//BinaryTree bTree = new BinaryTree();
		//bTree.printInorder(root);
				
		/*
		BinaryTree bTree = new BinaryTree();
		bTree.TreeFromNodeArray(allNodes);
		bTree.printInorder(bTree.getRootNode());
		bTree.breadthFirstSearch(bTree.getRootNode());
		sc.close();*/
		
		/*BinaryNumbers bn = new BinaryNumbers();
		int[] binary = bn.convertToBinary(1);
		bn.display(binary);
		int[] finals = bn.Reverse(binary);
		bn.display(finals);
		int sum = bn.Final(finals);
		System.out.println(sum);
		
		*/

	}



}

