Linked List.
Why even use them ?
Because arrays must be initialized with a fixed size. 
Eg: int[] array = new int[size];
Why so? 'Coz MEMORY bitches!
When an array is initialized it is allocate a contigous block of memory. This is the reason why time to find member of an array is O(1). 
Consider the following example:
I want to access element 5. I begin the search at index 0, if it's not equal to 5, I go to index 1 and so on. This will be O(n) -- where n is the length of the array.
NO,because
If beginning of the array is located at memory address "A" and if you want to access any element you have to compute its address like this:
"A" + item_size[if int(32 bits)]*index so this is a constant time operation O(1).
If we insert something in an array that is already full we MIGHT not get a new block of memory just ADJACENT to the previously allocated contigous memory block for that array.
One way to get around this problem is to copy this array to another contigous block of memeory of size * 2 at a different memory location.
OR we use Singly Linked Lists data structure which works as follows:

{head} --> { node1 [data] } --> { node2 [data] } --> null

OR

[ head       ,  head.next = node1  ]
[ node1.data ,  node1.next = node2 ]
[ node2.data ,  node2.next = null  ]

Insertion and deletion occurs at the head. Thus this is a constant time operation O(1).

Member operation in linked list takes time O(N) time because search begins linearly starting from the the head and the nodes are stored at different memory addresses.

Disadvantages of linked list:
Extra memory is required by each node to store the address of the next node.