package cn.music.utils;

import java.util.HashMap;
import java.util.Map;

import cn.music.po.Singer;

public class CountThread implements Runnable{
	Map<Object,Integer> visitMap=new HashMap<Object,Integer>();
	/*Singer singer=new Singer();*/
	Object obj;
	public CountThread(){}
	public CountThread(Object obj) {
		this.obj=obj;
	}
	@Override
	public synchronized void run() {
		if(visitMap.get(obj)==null){
			visitMap.put(obj, 0);
		}
		func(obj);
		notify();
		try {
			wait(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void func(Object obj){
		int  count = visitMap.get(obj);
		count++;
		visitMap.put(obj, count);
		/*System.out.println(obj+":"+Thread.currentThread().getId()+":"+count);*/
	}
	public Map<Object, Integer> getVisitMap() {
		return visitMap;
	}
	public void setVisitMap(Map<Object, Integer> visitMap) {
		this.visitMap = visitMap;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public static void main(String[] args) {
		Singer sig=new Singer();
		Singer sig2=new Singer();
		CountThread countThread = new CountThread(sig);
		CountThread countThread1 = new CountThread(sig2);
	/*for(int i=0;i<1000;i++){
		Thread threadi;
		if(i%2==0){
		 threadi=new Thread(countThread);
		}else{
		 threadi=new Thread(countThread1);
		}
		threadi.start();
	}	
*/	}
}
