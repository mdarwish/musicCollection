/*
 * 
 */
package com.validus.musicCollection.api;

import java.io.Console;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.validus.musicCollection.entity.*;
import com.validus.musicCollection.repo.*;
import com.validus.musicCollection.service.MusicService;

@RestController
@RequestMapping("/")
public class musicController {
	
	/** The song repo. */
	@Autowired
	SongRepository songRepo;
	
	/**
	 * 
	 */
	@Autowired
	ArtistRepository artistRepo;
	
	/**
	 * 
	 */
	@Autowired
	AlbumRepository albumRepo;
	
	/**
	 * 
	 */
	@Autowired
	MusicService musicService;

	//Create Operations
	/**
	 * An end point to add a new song to certain artist album 
	 * @param artist_id the artist id
	 * @param album_id the artist id
	 * @param song the song payload
	 * @return the inserted song record or error in case of exceptions
	 */
	@PostMapping("/artist/{artist_id}/album/{album_id}/song/new")
	public Song createSong(@PathVariable final Integer artist_id, @PathVariable final Integer album_id, @Valid @RequestBody Song song) {
	    return musicService.addSong(artist_id, album_id, song);
	}
	
	/**
	 * Endpoint to add new Artist
	 * @param artist the JSON object containing artist data
	 * @return the new Artist record or error in case of exceptions
	 */
	@PostMapping("/artist/new")
	public Artist createAtrist(@Valid @RequestBody Artist artist) {
	    return artistRepo.save(artist);
	}

	/**
	 * Endpoint to add a new album to certain artist
	 * @param album the album data payload
	 * @param artist_id the artist id
	 * @return the newly inserted album
	 */
	@PostMapping("/artist/{artist_id}/album/new")
	public Album createAlbum(@Valid @RequestBody Album album, @PathVariable final Integer artist_id) {
		return musicService.addAlbum(artist_id, album);
	}

	//Retrieve Operations
	/**
	 * @return
	 */
	@GetMapping("songs")
	public Iterable<Song> getAllSongs() {
		Iterable<Song> ret = songRepo.findAll();
		return ret;
	}
	
	/**
	 * @return
	 */
	@GetMapping("artists")
	public Iterable<Artist> getAllArtists() {
		Iterable<Artist> ret = artistRepo.findAll();
		return ret;
	}

	/**
	 * @return
	 */
	@GetMapping("albums")
	public Iterable<Album> getAllAlbums() {
		Iterable<Album> ret = albumRepo.findAll();
		return ret;
	}
	
	//Update Operations
	/**
	 * @param id
	 * @param artist
	 * @return
	 */
	@PutMapping("/artist/{id}")
	public Artist updateArtist(@PathVariable("id") final Integer id, @RequestBody Artist artist) {
		artist.setId(id);
		return artistRepo.save(artist);
	}

	/**
	 * @param id
	 * @param album
	 * @return
	 */
	@PutMapping("/album/{id}")
	public Album updateAlbum(@PathVariable("id") final Integer id, @RequestBody Album album) {
		return musicService.updateAlbum(id, album);		
	}

	/**
	 * @param id
	 * @param song
	 * @return
	 */
	@PutMapping("/song/{id}")
	public Song updateSong(@PathVariable("id") final Integer id, @RequestBody Song song) {
		return musicService.updateSong(id, song);	
	}

	//Delete Operations
	/**
	 * @param id
	 */
	@DeleteMapping("/artist/{id}")
	public void deleteArtist(@PathVariable("id") final Integer id) {
		artistRepo.delete(id);
	}


	/**
	 * @param id
	 */
	@DeleteMapping("/album/{id}")
	public void deleteAlbum(@PathVariable("id") final Integer id) {
		musicService.deleteAlbum(id);
	}

	/**
	 * @param id
	 */
	@DeleteMapping("/song/{id}")
	public void deleteSong(@PathVariable("id") final Integer id) {
		songRepo.delete(id);	
	}
}
