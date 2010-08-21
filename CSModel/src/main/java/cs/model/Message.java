package cs.model;

import java.util.Date;

public class Message
{
	private Integer id; 
	private String title;
	private String content;
	private Integer idCustomerAccount;
	private Integer isRead;
	private Date dateTimeWrited;
	private Integer idCustomerTransmitter;
	
	public Integer getIdCustomerTransmitter() {
		return idCustomerTransmitter;
	}
	public void setIdCustomerTransmitter(Integer idCustomerTransmitter) {
		this.idCustomerTransmitter = idCustomerTransmitter;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getIdCustomerAccount() {
		return idCustomerAccount;
	}
	public void setIdCustomerAccount(Integer idCustomerAccount) {
		this.idCustomerAccount = idCustomerAccount;
	}
	
	public String toString()
	{
		return getId() + '/' + getTitle() + '/' + getContent() + '/' + getIdCustomerAccount() + ' ' + getIdCustomerTransmitter() +' ' + getDateTimeWrited() + ' ' +getIsRead();
	}
	public Integer getIsRead() {
		return isRead;
	}
	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}
	public Date getDateTimeWrited() {
		return dateTimeWrited;
	}
	public void setDateTimeWrited(Date dateTimeWrited) {
		this.dateTimeWrited = dateTimeWrited;
	}
}
