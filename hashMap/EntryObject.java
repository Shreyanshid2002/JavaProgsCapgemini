package hashMap;

public class EntryObject {
	Object key;
	Object value;
	EntryObject next;
	
	public EntryObject(Object key,Object value) {
		this.key=key;
		this.value=value;
		this.next=null;
	}
}
