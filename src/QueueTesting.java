import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTesting {

	@Test
	public void testQSize() {
		
		Queue que=new Queue(1);
		assertEquals(0,que.size);
		
	}
	
	@Test
	public void testenqueue1() {
		
		Queue que=new Queue(1);
		que.enqueue(1);
		assertEquals(1,que.size);
		
	}
	
	@Test
	public void testenqueue2() {
		
		Queue que=new Queue(3);
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		assertEquals(3,que.size);
		
	}

	@Test
	public void testenqueue3() {
		
		int n=50;
		Queue que=new Queue(n);
		
		for(int i=0;i<50;i++) {
			que.enqueue(i);
		}
		
		assertEquals(n,que.size);
		
	}
	
	@Test
	public void testenqueue4() {
		
		int n=50;
		Queue que=new Queue(n);
		
		for(int i=0;i<50;i++) {
			que.enqueue(i);
		}
		
		que.enqueue(51);
		assertEquals(n,que.size);
		
	}
	
	@Test
	public void testenqueue5() {
		
		int n=155;
		Queue que=new Queue(n);
		
		for(int i=0;i<150;i++) {
			que.enqueue(i);
		}
		
		que.enqueue(151);
		que.enqueue(152);
		que.enqueue(153);
		que.enqueue(154);
		assertEquals(n-1,que.size);
		
	}
	
	@Test
	public void testenqueue6() {
		
		Queue que= new Queue(100);
		for(int i=0;i<100;i++)
		{
			que.enqueue(i);
		}
		
		assertEquals(100,que.size);
	}
	
	@Test
	public void testenqueue7() {
		
		Queue que= new Queue(1000);
		for(int i=0;i<1000;i++)
		{
			que.enqueue(i);
		}
		
		assertEquals(1000,que.size);
	}
	
	@Test
	public void testdequeue1() {
		
		Queue dque=new Queue(1);
		dque.enqueue(1);
		dque.dequeue();
		assertEquals(0,dque.size);
		
	}
	
	@Test
	public void testdequeue2() {
		
		int n=3;
		Queue dque=new Queue(n);
		dque.enqueue(1);
		dque.enqueue(2);
		dque.enqueue(3);
		dque.dequeue();
		dque.dequeue();
		assertEquals(n-2,dque.size);
		
	}
	
	@Test
	public void testdequeue3() {
		
		int n=50;
		Queue dque=new Queue(n);
		for(int i=0;i<50;i++) {
			dque.enqueue(i);
		}
		
		dque.dequeue();
		dque.dequeue();
		assertEquals(n-2,dque.size);
		
	}
	
	@Test
	public void testdequeue4() {
		
		int n=50;
		Queue dque=new Queue(n);
		for(int i=0;i<50;i++) {
			dque.enqueue(i);
		}
		
		for(int i=0;i<50;i++) {
			dque.dequeue();
		}
		
		assertEquals(0,dque.size);
		
	}
	
	@Test
	public void testdequeue5() {
		
		int n=50;
		Queue dque=new Queue(n);
		for(int i=0;i<50;i++) {
			dque.enqueue(i);
		}
		
		for(int i=0;i<25;i++) {
			dque.dequeue();
		}
		
		assertEquals(n-25,dque.size);
		
	}
	
	@Test
	public void testdequeue6() {
		
		int n=150;
		Queue dque=new Queue(n);
		for(int i=0;i<150;i++) {
			dque.enqueue(i);
		}
		
		for(int i=0;i<25;i++) {
			dque.dequeue();
		}
		
		assertEquals(n-25,dque.size);
		
	}
	
	@Test
	public void testdequeue7() {
		
		Queue dque=new Queue(5);
		dque.enqueue(1);
		dque.dequeue();
		dque.enqueue(2);
		dque.dequeue();
		dque.enqueue(3);
		dque.dequeue();
		dque.enqueue(4);
		dque.dequeue();
	
		assertEquals(0,dque.size);
	}
	
	@Test
	public void testdequeue8() {
		
		Queue dque=new Queue(5);
		for(int i=0;i<50;i++) {
			dque.enqueue(1);
			dque.dequeue();
		}
		
		assertEquals(0,dque.size);
	}
}

