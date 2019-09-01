package smbms.entity;

import java.util.Date;

/**
 * �Ñ���ַ��Ϣ���w�
 * @author 86185
 *
 */
public class Address {
	private int r_id;
	private String contact;
	private String addressDesc;
	private String postCode;
	private String tel;
	private String createdBy;
	private Date creationDate;
	private String modifyBy;
	private String modifyDate;
	private int userId;
	public int getId() {
		return r_id;
	}
	public void setId(int id) {
		this.r_id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddressDesc() {
		return addressDesc;
	}
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
