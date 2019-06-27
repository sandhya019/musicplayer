package com.cg.service;

import com.cg.entity.Artist;

public interface IArtist {

	 public Artist createArtist(Artist artist);

	public Artist getArtist(int artistId);

	public Artist Add(Artist artist);
}
