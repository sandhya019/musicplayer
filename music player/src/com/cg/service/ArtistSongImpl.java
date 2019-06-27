package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.ArtistSong;
import com.cg.repository.IArtistSongRepository;

public abstract class ArtistSongImpl implements IArtistSong {
	
	@Autowired
	IArtistSongRepository iartistsongrepository;
	
	@Override
	public ArtistSong createArtistSong(ArtistSong artistsong) {
	return iartistsongrepository.saveAndFlush(artistsong);
	}
}
 	