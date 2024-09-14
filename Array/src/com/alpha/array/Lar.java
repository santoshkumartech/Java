package com.alpha.array;
import java.util.Comparator;
public class Lar implements Comparator
{
	String sname;
	int sid;
	private Lar o2;
	public Lar(String sname, int sid)
	{
		this.sname = sname;
		this.sid = sid;
	}
	@Override
	public String toString()
	{
		return "Sname=" + sname + ", sid=" + sid ;
	}
   public int compare(Object o1,Object o2)
    {
    	Lar i1 = (Lar)o1;
    	Lar i2 = (Lar)o2;
    	if(i1.sname==i2.sname)
    		return 0;
    	else if(i1.sid > i2.sid)
    		return 1;
    	else 
    		return -1;
    }
    	
}




