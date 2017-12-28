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
	
	@Autowired
	SongRepository songRepo;
	
	@Autowired
	ArtistRepository artistRepo;
	
	@Autowired
	AlbumRepository albumRepo;
	
	@Autowired
	MusicService musicService;

	//Create Operations
	@PostMapping("/artist/{artist_id}/album/{album_id}/song/new")
	public Song createSong(@PathVariable final Integer artist_id, @PathVariable final Integer album_id, @Valid @RequestBody Song song) {
	    return musicService.addSong(artist_id, album_id, song);
	}
	
	@PostMapping("/artist/new")
	public Artist createAtrist(@Valid @RequestBody Artist artist) {
	    return artistRepo.save(artist);
	}

	@PostMapping("/artist/{artist_id}/album/new")
	public Album createAlbum(@Valid @RequestBody Album album, @PathVariable final Integer artist_id) {
		return musicService.addAlbum(artist_id, album);
	}

	//Retrieve Operations
	@GetMapping("songs")
	public Iterable<Song> getAllSongs() {
		Iterable<Song> ret = songRepo.findAll();
		return ret;
	}
	
	@GetMapping("artists")
	public Iterable<Artist> getAllArtists() {
		Iterable<Artist> ret = artistRepo.findAll();
		return ret;
	}

	@GetMapping("albums")
	public Iterable<Album> getAllAlbums() {
		Iterable<Album> ret = albumRepo.findAll();
		return ret;
	}
	
	//Update Operations
	@PutMapping("/artist/{id}")
	public Artist updateArtist(@PathVariable("id") final Integer id, @RequestBody Artist artist) {
		artist.setId(id);
		return artistRepo.save(artist);
	}

	@PutMapping("/album/{id}")
	public Album updateAlbum(@PathVariable("id") final Integer id, @RequestBody Album album) {
		return musicService.updateAlbum(id, album);		
	}

	@PutMapping("/song/{id}")
	public Song updateSong(@PathVariable("id") final Integer id, @RequestBody Song song) {
		return musicService.updateSong(id, song);	
	}

	//Delete Operations
	@DeleteMapping("/artist/{id}")
	public void deleteArtist(@PathVariable("id") final Integer id) {
		Artist existing = artistRepo.findOne(id);
		for (Album album : existing.getAlbums()) {
			musicService.deleteAlbum(album.getId());
		}
		artistRepo.delete(id);
	}


	@DeleteMapping("/album/{id}")
	public void deleteAlbum(@PathVariable("id") final Integer id) {
		musicService.deleteAlbum(id);
	}

	@DeleteMapping("/song/{id}")
	public void deleteSong(@PathVariable("id") final Integer id) {
		songRepo.delete(id);	
	}
}
