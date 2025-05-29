package OopsConcepts.multi_threading.producer_consumer;

class Producer extends Thread
{

	Company c;
	Producer(Company c)
	{
		this.c=c;
	}
	public void run()
	{ 
		int i=1;
		while(true)
		{
			try {
				this.c.produce_item(i);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try{Thread.sleep(1000);}catch(Exception e){}
			i++;
		}
	}
}