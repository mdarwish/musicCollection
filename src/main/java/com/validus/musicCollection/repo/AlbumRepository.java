package com.validus.musicCollection.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.validus.musicCollection.entity.Album;

@Repository
@Transactional
public interface AlbumRepository extends JpaRepository<Album, Integer> {
	public List<Album> findById(Integer id);
	public List<Album> findByName(String name);
}
