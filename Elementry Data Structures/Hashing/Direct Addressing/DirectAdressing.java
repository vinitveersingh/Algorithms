import java.util.Scanner;

class DirectAddressing
{
	String[] array;

	public void insert( int key, String value )
	{
		if(array[key] == "null" && key < array.length )
		{
		   array[key] = value;
		}
		else
		{
				System.out.println("Invalid");
		}
	}

	public void member(int key )
	{
		System.out.println("Member is " + array[key] + " at key " + key);
	}

	public void delete(int key)
	{
		array[key] = "null";
	}

	public void print()
	{
		for( int index = 0 ; index < array.length; index++)
		{
			System.out.println(array[index]); 
		}
	}	

	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	    System.out.print(" Enter number of keys: ");
	    int numkey = sc.nextInt();
		DirectAddressing d = new DirectAddressing();
		d.array = new String[numkey];		
		int choice;
		do
		{
			
		    System.out.println("Select Operation: \t1. Insert \t2.Member \t3.Delete \t4.Print \t5.Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			     case 1:
				 {
					 System.out.print("Key: "); 
					 int key = sc.nextInt();
					 System.out.print("Value: ");
					 String value = sc.next(); 
					 d.insert(key,value);
					 break;
				 }
				 case 2:
				 {
					 System.out.print("Key: "); 
					 int key = sc.nextInt(); 
					 d.member(key);
					 break;
				 }
		         case 3:
				 {
					 System.out.print("Key: "); 
					 int key = sc.nextInt();
					 d.delete(key);
					 break;
				 }
		         case 4:
				 {
					 d.print();
					 break;
				 }
		         default:
				 {
					if (choice != 5)
					{
					System.out.println("Invalid Choice. "); 
				    }
				 }				 
				 
		    }
	    }while( choice != 5 );
    }
}