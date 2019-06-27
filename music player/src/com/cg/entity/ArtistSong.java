package com.cg.entity;

public class ArtistSong {
	
	private int artsistId;
	private int songId;
	private int createdBy;
	private String createdOn;
	private int updatedBy;
	private String updatedOn;
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
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
	
	public int getArtsistId() {
		return artsistId;
	}
	public void setArtsistId(int artsistId) {
		this.artsistId = artsistId;
	}
	

}

