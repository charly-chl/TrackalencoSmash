package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Player player;


	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new Player(0,10);
		player = new Player(0,20);


	}

	@Override
	public void render () {
		player.Move();
		Gdx.gl.glClearColor(0, 20, 20, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(player.img, (int)player.x, (int)player.y);
		batch.end();
	}
}
