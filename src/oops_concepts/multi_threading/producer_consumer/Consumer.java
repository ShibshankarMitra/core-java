package oops_concepts.multi_threading.producer_consumer;

class Consumer extends Thread{
	Company c;
	Consumer(Company c)
	{
		this.c=c;
	}

	public void run()
	{
		while(true)
		{
			try {
				this.c.consume_item();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try{Thread.sleep(2000);}catch(Exception e){}
		}
	}
}