package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.ComposerSong;
import com.cg.repository.IComposerSongRepository;

public abstract class ComposerSongImpl implements IComposerSong{
  
	@Autowired
	 IComposerSongRepository icomposersongrepository;
	 
	@Override
	public ComposerSong createComposerSong(ComposerSong composersong) {
				return icomposersongrepository.saveAndFlush(composersong);

	}
}
