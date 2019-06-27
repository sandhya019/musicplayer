package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.entity.MusicSociety;
import com.cg.repository.IMusicSocietyRepository;

public class MusicSocietyimpl implements IMusicSociety {
	
	@Autowired
	IMusicSocietyRepository imusicsocietyRepository;
	
	@Override
	
	public MusicSociety createMusicSociety(MusicSociety musicsociety) {
		return imusicsocietyRepository.saveAndFlush(musicsociety);
	}


}
