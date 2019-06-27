package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.Artist;
import com.cg.repository.IArtistRepository;

public abstract class ArtistImpl implements IArtist {
	@Autowired
	IArtistRepository IArtistRepository;

	@Override
	public Artist createArtist(Artist artist) {
	return IArtistRepository.saveAndFlush(artist);
	
	}

}
