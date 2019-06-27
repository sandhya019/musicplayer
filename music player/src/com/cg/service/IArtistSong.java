package com.cg.service;

import com.cg.entity.ArtistSong;

public interface IArtistSong {
	
	public ArtistSong createArtistSong(ArtistSong artistsong);

	public ArtistSong getArtistSong(int artistId);

	public ArtistSong Add(ArtistSong artistsong);

}