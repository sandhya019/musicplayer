package com.cg.service;

import com.cg.entity.ComposerSong;

public interface IComposerSong {

	public ComposerSong createComposerSong(ComposerSong composersong);

	public ComposerSong getComposerSong(int composerId);

	public ComposerSong Add(ComposerSong composersong);
}
