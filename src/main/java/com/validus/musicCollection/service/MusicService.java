/*
 * 
 */
package com.validus.musicCollection.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.validus.musicCollection.entity.Album;
import com.validus.musicCollection.entity.Artist;
import com.validus.musicCollection.entity.Song;
import com.validus.musicCollection.repo.AlbumRepository;
import com.validus.musicCollection.repo.ArtistRepository;
import com.validus.musicCollection.repo.SongRepository;

@Service
public class MusicService {
	/**
	 * 
	 */
	@Autowired
	private SongRepository songRepo;
	
	/**
	 * 
	 */
	@Autowired
	private ArtistRepository artistRepo;
	
	/**
	 * 
	 */
	@Autowired
	private AlbumRepository albumRepo;


	/**
	 * Adds the album.
	 *
	 * @param srtist_id the srtist id
	 * @param album the album
	 * @return the album
	 */
	public Album addAlbum(Integer srtist_id, Album album) {
		Artist singer = artistRepo.findOne(srtist_id);
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return albumRepo.save(new Album(singer, album.getName(), album.getYearReleased(), ts));
	}

	/**
	 * @param srtist_id
	 * @param album_id
	 * @param song
	 * @return
	 */
	public Song addSong(Integer srtist_id, Integer album_id, Song song) {
		Artist singer = artistRepo.findOne(srtist_id);
		Album record = albumRepo.findOne(album_id);
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		song.setArtist(singer);
		song.setAlbum(record);
		song.setLastModified(ts);
		return songRepo.save(song);
	}
	
	/**
	 * @param id
	 * @param album
	 * @return
	 */
	public Album updateAlbum(Integer id, Album album) {
		Album existing = albumRepo.findOne(id);
		album.setId(id);
		album.setArtist(existing.getArtist());
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		album.setLastModified(ts);
		return albumRepo.save(album);
	}

	/**
	 * @param id
	 * @param song
	 * @return
	 */
	public Song updateSong(Integer id, Song song) {
		Song existing = songRepo.findOne(id);
		Artist singer = existing.getArtist();
		Album record = existing.getAlbum();
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		song.setId(id);
		song.setArtist(singer);
		song.setAlbum(record);
		song.setLastModified(ts);
		return songRepo.save(song);
	}
	
	/**
	 * @param id
	 */
	public void deleteAlbum(final Integer id) {
		albumRepo.delete(id);
	}

	
}
