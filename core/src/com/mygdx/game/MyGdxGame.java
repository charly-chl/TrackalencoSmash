package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.controllers.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;


public class MyGdxGame implements ApplicationListener {
	SpriteBatch batch;
	Texture img;
	Player player;
	Player player2;
	GestureExample controller;

	public class GestureExample implements GestureDetector.GestureListener {

		@Override
		public boolean touchDown(float x, float y, int pointer, int button) {
			player.MoveRight();
			return false;
		}

		@Override
		public boolean tap(float x, float y, int count, int button) {

			return false;
		}

		@Override
		public boolean longPress(float x, float y) {

			return false;
		}

		@Override
		public boolean fling(float velocityX, float velocityY, int button) {

			return false;
		}

		@Override
		public boolean pan(float x, float y, float deltaX, float deltaY) {
			player.MoveRight();
			return false;
		}

		@Override
		public boolean panStop(float x, float y, int pointer, int button) {

			return false;
		}

		@Override
		public boolean zoom (float originalDistance, float currentDistance){

			return false;
		}

		@Override
		public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
			return false;
		}


		public void update () {
//        if (flinging) {
//            velX *= 0.98f;
//            velY *= 0.98f;
//            camera.position.add(-velX * Gdx.graphics.getDeltaTime(), velY * Gdx.graphics.getDeltaTime(), 0);
//            if (Math.abs(velX) < 0.01f) velX = 0;
//            if (Math.abs(velY) < 0.01f) velY = 0;
//        }
		}

	}





	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new Player(0,10);
		player2 = new Player(0,20);
		//controller = new GestureExample();
		//Controllers.addListener((ControllerListener) this);
		Gdx.input.setInputProcessor(new GestureDetector(new GestureExample()));
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render () {
		player.Move();
		Gdx.gl.glClearColor(0, 20, 20, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(player.img, (int) player.x, (int) player.y);
		batch.draw(player2.img, (int)player2.x, (int)player2.y);
		batch.end();

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}




}
