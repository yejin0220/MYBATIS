package com.kh.mybatis.board.model.vo;

import java.sql.Date;

public class Reply {
	
	private int replyNo;
	private String replyContent;
	private int replyBno;
	private String replyWriter;
	private Date createDate;
	private String status;
	
	public Reply() {
		super();
	}
	
	public Reply(int replyNo, String replyContent, int replyBno, String replyWriter, Date createDate, String status) {
		super();
		this.replyNo = replyNo;
		this.replyContent = replyContent;
		this.replyBno = replyBno;
		this.replyWriter = replyWriter;
		this.createDate = createDate;
		this.status = status;
	}
	
	public int getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public int getReplyBno() {
		return replyBno;
	}
	public void setReplyBno(int replyBno) {
		this.replyBno = replyBno;
	}
	public String getReplyWriter() {
		return replyWriter;
	}
	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
