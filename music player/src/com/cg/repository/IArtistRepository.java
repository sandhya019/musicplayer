package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Artist;

public interface IArtistRepository extends JpaRepository<Artist, Integer> {

}
