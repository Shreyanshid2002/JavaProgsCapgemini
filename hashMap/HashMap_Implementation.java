package hashMap;

public class HashMap_Implementation {
	final int size =16;
	Entry[] buckets = new Entry[size];
	 
	private int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;	
	}
	
	public void put(int key, int value) {
		Entry Node = new Entry(key,value);
		int index = getBucketIndex(key);
		System.out.println("The entry is added at index: "+index);
		Entry current = buckets[index];
			
		while(current!=null) {
			if(current.key==key) {  //Checking if the new entry key is already present
				current.value=value; //Updating value
				return;
			}
			current=current.next;
		}
		Node.next=buckets[index]; //Making the new node as head
		buckets[index]=Node;	//Storing head in the array
	}
	public void getValue(int key) {
		int i = getBucketIndex(key);
			Entry current = buckets[i];
				while(current!=null) {
					if(current.key==key) {
						System.out.println(current.value);
					}
					current=current.next;
			}
		System.out.println("Not found");
	}
	public void display() {  // Time Complexity O(n^2) ======= First loop to display over the array , Second loop to iterate over the loop
		for(int i=0;i<buckets.length;i++) {
			Entry current= buckets[i];
			while(current!=null) {
				System.out.println("At index "+i+" ,"+" Key = "+current.key+" Value = "+current.value);
				current = current.next;
			}
			continue;
		}
	}
	public void delete(int key) {
	    int index = getBucketIndex(key);  
	    Entry current = buckets[index];
	    Entry prev = null;

	    while (current != null) {
	        if (current.key == key) {
	            if (prev == null) {
	                // If the node to be deleted is the head of the linked list
	                buckets[index] = current.next;
	                prev.next=null;
	            } else {
	                // If the node to be deleted is in the middle or end
	                prev.next = current.next;
	                current.next=null;
	            }
	            System.out.println("Key " + key + " deleted successfully.");
	            return;
	        }
	        prev = current;
	        current = current.next;
	    }

	    System.out.println("Key " + key + " not found.");
	}

	
	public static void main(String[] args) {
		HashMap_Implementation map = new HashMap_Implementation();
		map.put(42, 37);
		map.put(10, 2);
		map.put(3,9);
		map.put(26, 10);
		map.put(7, 1);
		map.display();
		map.getValue(30);
		map.display();
		map.delete(42);
		map.display();
		map.delete(11);
		map.display();
	}
}

