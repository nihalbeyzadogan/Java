package SonGün;

public class Polonaise {
	private Roboter start;
	
	public Polonaise() {
		this.start = null;
	}
	
	public void setStart(Roboter start) {
		this.start=start;
	}
	
	public void anhaengen(Roboter m) {
		
		if(start == null) {
			start = m;
		}else if(start.getHöhe() > m.getHöhe()  ) {
			m.setNext(start);
			start = m;
		}else {
			Roboter temp = start;
			while(temp.next != null && temp.next.getHöhe() < m.getHöhe()) {
			temp = temp.next;
			
		}
			m.next = temp.next;
			temp.next = m;
			
			}
		}
	public void vorstellen() {
		Roboter temp = start;
		while(temp.next != null) {
			System.out.println(temp);
			temp =temp.next;
		}
	}
}
