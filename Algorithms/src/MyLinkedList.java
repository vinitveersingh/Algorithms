
class MyLinkedList {
	private Node<Integer> headNode;

	MyLinkedList(Node<Integer>[] allNodes, String insertAt){
		switch(insertAt){
			case "head":{
				for(int n = 0; n < allNodes.length ; n++ ){
					addToHead(allNodes[n]);
				}			
			}
	}
}
	
	private void addToHead(Node<Integer> newNode) {
		if(headNode == null){
			headNode = newNode;
		}
		else{
			Node<Integer> previousNode = headNode.next;
			newNode.next = previousNode;
			headNode.next = newNode;
		}
	}
	
	public void printLinkedList(){
		Node<Integer> headNodeReference = headNode;
		while(headNodeReference != null){
			System.out.print(String.valueOf(headNodeReference.val));
			System.out.print("-->");
			headNodeReference = headNodeReference.next;
		}
		if(headNodeReference == null){
			System.out.print("null");
		}
		System.out.println("");
	}
	
}

