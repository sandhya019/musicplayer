package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.ArtistSong;

public interface IArtistSongRepository extends JpaRepository<ArtistSong, Integer>
{

}
