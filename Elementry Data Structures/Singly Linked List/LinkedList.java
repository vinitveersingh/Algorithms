import java.util.Scanner;

class Node
{
	String data;
	Node next;
}

public class LinkedList
{
	Node head;
	int count = 0;
	
	LinkedList()
	{
		head = new Node(); //removes the need for null check
		head.data = "head";
		head.next = null;
	}
	
    public void insertathead(String element)
	{
	    Node node = new Node();
		node.data = element ; 
		node.next = head.next; // this pattern is hard to see unless an example is solved by hand
		head.next = node ;
		count++ ;
	}
	
	public void deleteathead()
	{
		if(count > 0)
		{
		    head.next = head.next.next;	
		    count--;
		}
		else
		{
			System.out.println("Cannot Delete from Empty List");
		}
	}
	
	public void member(String value)
	{
		
		Node current = head.next;
		boolean check = false;
		for ( int index = 0; index < count ; index++ )
		{			
			if( value.equals(current.data))
			{
				System.out.println("Member at position " + (index + 1));
				check = true;
			}
			current =  current.next;
		}
		if(check == false)
		{
		    System.out.println( "Not a Member." );
		}	
	}
	
	public void show()
	{
		Node current = head;
		for (int index = 0; index < (count + 1); index++ ) //count + 1 because head is at 0 and elements following it are at 1
		{
			
		    System.out.print( current.data + " -->");
			current = current.next;
		}
		System.out.println( " null ");
	}
	
	public static void main(String[] args)
	{
        LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
		    System.out.println("Operations: \t 1.Insert \t 2.Delete \t 3.Print\t 4.Member \t 5.Exit");
		    System.out.print("Please enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.print("Please enter element to the head of the Linked List: ");
					String element = (String)sc.next();
		            ll.insertathead(element);
					//System.out.print("Current Linked List: ");
					//ll.show();
					break;

				}
				case 2:
			    {
					ll.deleteathead();
					System.out.println("Element removed from the head of to Linked List ");
					//System.out.print("Current Linked List: ");
				    //ll.show();
					break;
					
				}
				case 3:
				{
					System.out.println("Current Linked List: ");
					System.out.println("Total Element in the list: " + ll.count);
					ll.show();					
					break;
				}
				case 4:
				{
					System.out.print("Please enter element you want to find in the Linked List: ");
					String element = (String)sc.next();
					ll.member(element);
					break;
				}
				default:
				{
					if(choice!=5)
					{
					    System.out.println("Invalid Option");
				    }
				}
			}
		}while(choice!=5);
	}
}