package hashMap;

public class HashMapObjectImplementation {
	final int size =16;
	EntryObject[] buckets = new EntryObject[size];
	 
	private int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;	
	}
	
	public void put(int key, int value) {
		EntryObject Node = new EntryObject(key,value);
		int index = getBucketIndex(key);
		System.out.println("The entry is added at index: "+index);
		EntryObject current = buckets[index];
			
		while(current!=null) {
			if(current.key.equals(key)) {  //Checking if the new entry key is already present
				current.value=value; //Updating value
				return;
			}
			current=current.next;
		}
		Node.next=buckets[index]; //Making the new node as head
		buckets[index]=Node;	//Storing head in the array
	}
	public void getValue(int key) {
		int i =getBucketIndex(key);
			EntryObject current = buckets[i];
				while(current!=null) {
					if(current.key.equals(key)) {
						System.out.println(current.value); 
					}
					current=current.next;
			}
		
		System.out.println("Not found");
	}
	public void display() {
		for(int i=0;i<buckets.length;i++) {
			EntryObject current= buckets[i];
			while(current!=null) {
				System.out.println("At index "+i+" ,"+" Key = "+current.key+" Value = "+current.value);
				current = current.next;
			}
			continue;
		}
	}
	public void delete(int key) {
	    int index = getBucketIndex(key);  // Get the index using the key
	    EntryObject current = buckets[index];
	    EntryObject prev = null;

	    while (current != null) {
	        if (current.key.equals(key)) {
	            if (prev.equals(null)) {
	                // If the node to be deleted is the head of the linked list
	                buckets[index] = current.next;
	            } else {
	                // If the node to be deleted is in the middle or end
	                prev.next = current.next;
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
		map.put(10, 1);
		map.put(20,9);
		map.put(26, 10);
		map.put(50, 5);
		map.display();
		map.delete(11);
		map.display();
		map.delete(10);
		map.display();
	}
}
