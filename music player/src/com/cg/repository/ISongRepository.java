package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Song;

public interface ISongRepository extends JpaRepository<Song,Integer>{

}
