package com.alpha.pgm2;

public class Sim 
{
	private long SimNum;
	private String S_P_N;
	public Sim(long simNum, String s_P_N)
	{
		SimNum = simNum;
		S_P_N = s_P_N;
	}
	public long getSimNum() 
	{
		return SimNum;
	}
	public void setSimNum(long simNum) 
	{
		SimNum = simNum;
	}
	public String getS_P_N() {
		return S_P_N;
	}
	public void setS_P_N(String s_P_N) 
	{
		S_P_N = s_P_N;
	}
	
}
