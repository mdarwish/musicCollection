package com.validus.musicCollection.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validus.musicCollection.entity.Song;

@Repository
@Transactional
public interface SongRepository extends JpaRepository<Song, Integer> {

}
