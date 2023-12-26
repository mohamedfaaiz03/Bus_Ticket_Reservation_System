package busresv;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	Bus(int no,boolean ac,int cp)
	{ 
		this.busno=no;
		this.ac=ac;
		this.capacity=cp;
	}
	public int getbusno()
	{
		return busno;
	}
	public boolean isac()
	{
		return ac;
	}
	public void setac(boolean val)
	{
		ac=val;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void setcapacity(int cap)
	{
		capacity=cap;
	}
}
