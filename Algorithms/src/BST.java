import java.util.List;

public class BST {
	
	static int k = 0;

	public static BinaryTreeNode makeTree(BinaryTreeNode[] bnodes){
		BinaryTreeNode root = null;
		for(int i = 0 ; i < bnodes.length; i++){
			if(root == null){
				root = bnodes[i];
			}else{
				_makeTree(root, bnodes[i]);
			}
		}
		return root; 
	}
	
	public static void _makeTree(BinaryTreeNode root, BinaryTreeNode newNode){
		if((int)newNode.val < (int)root.val){
			if(root.left != null){
				_makeTree(root.left, newNode);
			}else{
				root.left = newNode;
			}
		}
		
		if((int)newNode.val > (int)root.val){
			if(root.right != null){
				_makeTree(root.right, newNode);
			}
			else{
				root.right = newNode;				
			}
		}
	}
	
	//10,19,20,28,23, 25, 22,21
	public static void reverseInOrderTraversal(BinaryTreeNode root){

		if(root.right!= null){
			//System.out.println("Right" + root.val);
			reverseInOrderTraversal(root.right);
		}
		/*k++;
		//System.out.print(" k "+ k + " ");
		if(k > 3){
			return;
		}*/
		System.out.print(root.val + " ");

		if(root.left != null){
			//System.out.println("Left" + root.val);
			reverseInOrderTraversal(root.left);
		}

	}
	
    public static boolean _checkBST( BinaryTreeNode root  , List<Integer> isBST ){
        
        if( root.left != null ){
            boolean val  = _checkBST( root.left , isBST );   
            if(val == false){
                return false;
            }
        }
        if(isBST.size() <= 1){
            isBST.add((int) root.val);    
        	System.out.println("val " + (int)root.val);
        }
        else if((int)root.val > isBST.get(isBST.size() - 2) ){
            isBST.add((int) root.val);
        	System.out.println("val " + (int)root.val);
        }
        else{
            return false;
        }

        if(root.right != null){
            boolean val = _checkBST( root.right, isBST);  
            if(val == false){
                return false;
            }
        }
        return true;
    }
    
}
