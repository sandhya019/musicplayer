package com.cg.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entity.Artist;
import com.cg.entity.ArtistSong;
import com.cg.entity.Composer;
import com.cg.entity.ComposerSong;
import com.cg.entity.Song;
import com.cg.service.IArtist;
import com.cg.service.IArtistSong;
import com.cg.service.IComposerSong;
import com.cg.service.IMusicService;
import com.cg.service.ISong;

public class MainController {

	
	IMusicService imusicservice;
	
	
	@RequestMapping("/index")
	public ModelAndView hello() {
		ModelAndView startpage = new ModelAndView();
		startpage.setViewName("StartFile");
		return startpage;
	}
	//POST method
	@RequestMapping(value="/composer", method =RequestMethod.POST)
	public Composer createComposer(@RequestBody Composer composer) {
		
		
		return imusicservice.createComposer(composer);
	}

	//get method
	
	@RequestMapping(value="/composer/composerId")
	public Composer getComposer(@PathVariable int composerId)
	{ 
		return imusicservice.getComposer(composerId);
		}
	
	//PUT method
	
	@RequestMapping(value="/composer", method=RequestMethod.PUT)
	public Composer Add(@RequestBody Composer composer)
	{
		return imusicservice.Add(composer);
	}

	IArtist iartist;
  //post
   @RequestMapping(value="/Artist", method=RequestMethod.POST)
   public Artist createArtist(@RequestBody Artist artist) {
	
	
	return iartist.createArtist(artist);
}

  //get method
   @RequestMapping(value="/artist/artistId")
   public Artist getArtist(@PathVariable int artistId)
   {
	   return iartist.getArtist(artistId);
   }
  
  //PUT method
   @RequestMapping(value="/artist",method=RequestMethod.PUT)
   public Artist Add(@RequestBody Artist artist)
   {
	   return iartist.Add(artist);
   }
  
   //song 
   //post
   ISong isong;
   @RequestMapping(value="/Song", method=RequestMethod.POST)
   public Song createSong(@RequestBody Song song) {
	
	   return isong.createSong(song);
   }
 
   //get
   
   @RequestMapping(value="/Song/songId")
	public Song getSong(@PathVariable int songId)
	{ 
		return isong.getSong(songId);
		}
	
 //PUT method
	
 	@RequestMapping(value="/Song", method=RequestMethod.PUT)
 	public Song Add(@RequestBody Song song)
 	{
 		return isong.Add(song);
 	}
   //artistsong
   //post
   IArtistSong iartistsong;
   @RequestMapping(value="/ArtistSong", method=RequestMethod.POST)
   public ArtistSong createArtistSong(@RequestBody ArtistSong artistsong) {
	
	   return iartistsong.createArtistSong(artistsong);
   }
   
   //get
   @RequestMapping(value="/ArtistSong/artistId")
	public ArtistSong getArtistSong(@PathVariable int artistId)
	{ 
		return iartistsong.getArtistSong(artistId);
		}
   
   //PUT method
	
	@RequestMapping(value="/ArtistSong", method=RequestMethod.PUT)
	public ArtistSong Add(@RequestBody ArtistSong artistsong)
	{
		return iartistsong.Add(artistsong);
	}
   
   //composersong
   
   IComposerSong icomposersong;
   
   @RequestMapping(value="/ComposerSong", method=RequestMethod.POST)
   public ComposerSong createComposerSong(@RequestBody ComposerSong composersong) {
	
	   return icomposersong.createComposerSong(composersong);
   }
   //get
   
   @RequestMapping(value="/ComposerSong/composerId")
	public ComposerSong getComposerSong(@PathVariable int composerId)
	{ 
		return icomposersong.getComposerSong(composerId);
		}
   
 //PUT method
	
 	@RequestMapping(value="/ComposerSong", method=RequestMethod.PUT)
 	public ComposerSong Add(@RequestBody ComposerSong composersong)
 	{
 		return icomposersong.Add(composersong);
 	}
    
}

