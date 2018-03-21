package cn.music.utils.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ��ҳ������
 * @author Administrator zl
 * totalNum:�ܼ�¼��
 * perCount:ÿҳ��ʾ�ļ�¼��
 * currentPage:��ǰҳ
 * totalPage:��ҳ��
 * start:��ǰҳ��һ����¼������ 1-0/3 2-3/3 3-6/3  
 * @param <T>
 */
public class Page implements Serializable{
	private int totalNum;
	private int perCount;
	private int currentPage;
	private int totalPage;
	private int start;
	List list=new ArrayList();
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	public int getPerCount() {
		return perCount;
	}
	public void setPerCount(int perCount) {
		this.perCount = perCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
			totalPage=totalNum/perCount;
			totalPage=totalNum%perCount==0?totalPage:totalPage+1;
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStart() {
		start=(currentPage-1)*perCount;
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	
	
	/*
	public static void main(String[] args) {
		Page page=new Page();
		page.setTotalNum(5);
		page.setPerCount(3);
		page.setCurrentPage(2);
		System.out.println(page.getTotalPage()+":"+page.getStart());
	}*/
}
