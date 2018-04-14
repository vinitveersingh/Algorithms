import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree implements Tree{
	BinaryTreeNode<Integer> bRoot;
	BinaryTree(){
		
	}
	
	public void TreeFromNodeArray(BinaryTreeNode<Integer>[] allNodes){
		BinaryTreeNode<Integer> bRootTemp = new BinaryTreeNode<Integer>(null);
		if(bRoot == null){
			bRoot = allNodes[0];
		}
		
		for(int nodePos = 0; nodePos < (allNodes.length)/2 ; nodePos++){

			int leftChildPos  = (2 * nodePos) + 1;
			int rightChildPos = (2 * nodePos) + 2;				
			System.out.println("Position" + (nodePos));
			System.out.println("Left" + leftChildPos);
			System.out.println("Right" + rightChildPos);
			if(leftChildPos <= allNodes.length){
				allNodes[nodePos].left = allNodes[leftChildPos];
			}
			if(rightChildPos <= allNodes.length){
				allNodes[nodePos].right = allNodes[rightChildPos];
			}
		}
		System.out.println("Done");
	}
	
	

    
	
	void printInorder(BinaryTreeNode<Integer> bRootNode)
    {
		
		if(bRootNode == null)
			return;
        /* first recur on left child */
        printInorder(bRootNode.left);
 
        /* then print the data of node */
        System.out.print(bRootNode.val + " ");

        /* now recur on right child */
        printInorder(bRootNode.right);
    }
	
	
	public void breadthFirstSearch(BinaryTreeNode<Integer> bRootNode){
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(bRootNode);
		while(queue.size() != 0){
			System.out.println(queue.peek().val);
			if(queue.peek().left != null){
				queue.add(queue.peek().left);							
			}
			if(queue.peek().right != null){
				queue.add(queue.peek().right);				
			}
			queue.remove();
		}
	}
	
	
	public BinaryTreeNode<Integer> getRootNode(){
		return bRoot;
	}
	
}
	
