class linkedlist {
	static node head;
	static class node {
		node next;
		int data;
		node(int d) {
			data=d;
			next=null;
		}
	}
	public static void main(String ar[]) {
		node n1=new node(1);
		node n2=new node(2);
		node n3=new node(3);
		node n6=new node(6);
		node n5=new node(5);
		
		head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n5;
		n5.next=n6;
		
		linkedlist l=new linkedlist();
		l.insertfront(0);
		l.insertmid(4,3);
		l.insertlast(7);
		l.delete(4);
		l.printp(head);
		
		
	}
	void delete(int data) {
		node c=head;
		node temp=null;
		while(c.data!=data) {
			temp=c;
			c=c.next;
		}
		temp.next=c.next;
		}
	void insertlast(int data) {
		node c=head;
		node n7=new node(data);
		while(c.next!=null) {
			c=c.next;
		}
		c.next=n7;
		
	}
	void insertfront(int data) {
		node n0=new node(data);
		n0.next=head;
		head=n0;
	}
	void insertmid(int data,int d) {
		node c=head;
		node n4=new node(data);
		while(c.data!=d) {
			c=c.next;
		}
		n4.next=c.next;
		c.next=n4;
	}
	void printp(node head) {
		node c=head;
		while(c!=null) {
			System.out.println(c.data);
			c=c.next;
		}
	}
}