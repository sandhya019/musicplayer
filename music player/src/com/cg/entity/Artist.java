package com.cg.entity;

import java.util.List;

import javax.persistence.OneToMany;



public class Artist {

	private int artistId;
	private String artistName;
	private String artistType;
	private String artistBornDate;
	 private String artistDiedDate;
	 private int createdBy;
	 private String createdOn;
	 private int updatedBy;
	 private String updatedOn;
	 private boolean artistDeletedFlag;
	 
	 
	 @OneToMany(mappedBy = "artist")
		private List<Song>Song;
	 
	 
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getArtistType() {
		return artistType;
	}
	public void setArtistType(String artistType) {
		this.artistType = artistType;
	}
	public String getArtistBornDate() {
		return artistBornDate;
	}
	public void setArtistBornDate(String artistBornDate) {
		this.artistBornDate = artistBornDate;
	}
	public String getArtistDiedDate() {
		return artistDiedDate;
	}
	public void setArtistDiedDate(String artistDiedDate) {
		this.artistDiedDate = artistDiedDate;
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
	public boolean isArtistDeletedFlag() {
		return artistDeletedFlag;
	}
	public void setArtistDeletedFlag(boolean artistDeletedFlag) {
		this.artistDeletedFlag = artistDeletedFlag;
	}
	
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	 
	 
}




