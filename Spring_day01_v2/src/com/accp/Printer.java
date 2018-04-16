package com.accp;

import com.accp.inbox.Inbox;
import com.accp.paper.Paper;

public class Printer {
  //依赖2个属性
	private Inbox inbox;
	private Paper paper;
	public void setInbox(Inbox inbox) {
		this.inbox = inbox;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print(String content){
		System.out.println("打印内容"+content+",格式是:"+inbox.getColor()
				+",纸张:每行"+paper.getCount()+"个字符，每页"+paper.getRows()+"行");
	}
}
