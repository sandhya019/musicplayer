package com.cg.entity;

import java.util.List;

import javax.persistence.OneToMany;


public class Composer {

	
	private int composerId;
	private String cName;
	private String cBornDate;
	private String cDiedDate;
	private String cCaeipiNumber;
	private int composermusicsocietyid;
	private int createdBy;
	private String createdOn;
	private int updatedBy;
	private String updatedOn;
	private boolean cDeletedFlag;
	
	@OneToMany(mappedBy = "composer")
	private List<Song> Song;
	
	public int composerId() {
		return composerId;
	}
	public void setcomposerId(int composerId) {
		this.composerId = composerId;
	}
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcBornDate() {
		return cBornDate;
	}
	public void setcBornDate(String cBornDate) {
		this.cBornDate = cBornDate;
	}
	public String getcDiedDate() {
		return cDiedDate;
	}
	public void setcDiedDate(String cDiedDate) {
		this.cDiedDate = cDiedDate;
	}
	public String getcCaeipiNumber() {
		return cCaeipiNumber;
	}
	public void setcCaeipiNumber(String cCaeipiNumber) {
		this.cCaeipiNumber = cCaeipiNumber;
	}
	public int getcomposermusicsocietyid() {
		return composermusicsocietyid;
	}
	public void setcomposermusicsocietyid(int composermusicsocietyid) {
		this.composermusicsocietyid = composermusicsocietyid;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	public boolean iscDeletedFlag() {
		return cDeletedFlag;
	}
	public void setcDeletedFlag(boolean cDeletedFlag) {
		this.cDeletedFlag = cDeletedFlag;
	}
	
	
}
