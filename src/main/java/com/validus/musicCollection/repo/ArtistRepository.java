package com.validus.musicCollection.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.validus.musicCollection.entity.Artist;

@Repository
@Transactional
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}
