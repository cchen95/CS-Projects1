
public class RunLength {

	public Run head;
	protected long size;
	
	public RunLength() {
		    head = new Run();
		    head.next = head;
		    head.prev = head;
		    size = 0;
	}
	
	public void insertFront(Run inserted){
		if (size == 0){
			head.next = inserted;
			head.prev = inserted;
			inserted.next = head;
			inserted.prev = head;
		}
		else{
			head.next.next.prev = inserted;
			inserted.prev = head;
			inserted.next = head.next.next;
			head.next = inserted;
		}
		size++;
	}
	
	public void insertEnd(Run inserted){
		if(inserted.length > 0){
			if (size == 0){
				head.next = inserted;
				head.prev = inserted;
				inserted.next = head;
				inserted.prev = head;
			}
			else{
				head.prev.next = inserted;
				inserted.prev = head.prev;
				inserted.next = head;
				head.prev = inserted;
			}
			size++;
		}
	}
}
