package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.cg.entity.Composer;
import com.cg.repository.IMusicRepository;

public class MusicServiceImpl implements IMusicService {
	
	@Autowired
	IMusicRepository imusicRepository;

	@Override
	public Composer createComposer(Composer composer) {
	return imusicRepository.saveAndFlush(composer);
	
	}

	@Override
	public Composer getComposer(int composerId) {
		return imusicRepository.findOne(composerId);
	
	}

	public Composer Add(Composer composer) {
		
		return imusicRepository.save(composer);
	}
	
	
}
