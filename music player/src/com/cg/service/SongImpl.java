package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.Song;
import com.cg.repository.ISongRepository;

public abstract class SongImpl implements ISong{

	@Autowired
	ISongRepository isongRepository;

	@Override
	public Song createSong(Song song) {
	return isongRepository.saveAndFlush(song);
	
	}
	
}
