package com.cg.service;

import com.cg.entity.Song;

public interface ISong {

	public Song createSong(Song song);

	public Song getSong(int songId);

	public Song Add(Song song);

}
