package com.validus.musicCollection.entity;
// Generated 26-Dec-2017 4:13:49 PM by Hibernate Tools 5.2.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Artist generated by hbm2java
 */
@Entity
@Table(name = "artist", catalog = "music_repo", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Artist implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Date created;
	private String name;
	private Date lastModified;
	private Set<Song> songs = new HashSet<Song>(0);
	private Set<Album> albums = new HashSet<Album>(0);

	public Artist() {
	}

	public Artist(Date created, String name, Date lastModified) {
		this.created = created;
		this.name = name;
		this.lastModified = lastModified;
	}

	public Artist(Date created, String name, Date lastModified, Set<Song> songs, Set<Album> albums) {
		this.created = created;
		this.name = name;
		this.lastModified = lastModified;
		this.songs = songs;
		this.albums = albums;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "name", unique = true, nullable = false, length = 128)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified", nullable = false, length = 19)
	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	/*@Type(type = "json")*/
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "artist", cascade = CascadeType.REMOVE)
	public Set<Song> getSongs() {
		return this.songs;
	}

	public void setSongs(Set<Song> songs) {
		this.songs = songs;
	}

	/*@Type(type = "json")*/
	//@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "artist", cascade = CascadeType.REMOVE)
	public Set<Album> getAlbums() {
		return this.albums;
	}

	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}

}
