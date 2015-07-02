package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Charly on 07/06/2015.
 */
public class Player {

    public final float speed = 40.0f;
    public float x;
    public float y;
    public String SpriteRoute;
    public Texture img;
    public int actualMove;

    public Player(float initialX, float intialY){
        x = initialX;
        y = intialY;
        actualMove = 0;
        SpriteRoute = "Mario1.png";
        Print();
    }

    public void Move(){
        float lastX = x;
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT))
            x -= Gdx.graphics.getDeltaTime() * speed;
        if(Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT))
            x += Gdx.graphics.getDeltaTime() * speed;
        if(x > lastX) {
            if(actualMove <= 5) {
                SpriteRoute = "Mario2.png";
            }
            if(actualMove > 5 && actualMove <= 10) {
                SpriteRoute = "Mario3.png";
            }
            if(actualMove > 10 && actualMove <= 15) {
                SpriteRoute = "Mario4.png";
            }
            if(actualMove > 15 && actualMove <= 20) {
                SpriteRoute = "Mario5.png";
            }
            if(actualMove > 20 && actualMove <= 25) {
                SpriteRoute = "Mario6.png";
            }
            if(actualMove > 25 && actualMove <= 30) {
                SpriteRoute = "Mario7.png";
            }
            if(actualMove > 30 && actualMove <= 35) {
                SpriteRoute = "Mario8.png";
            }
            if(actualMove > 35) {
                actualMove = 0;
                SpriteRoute = "Mario1.png";
            }
            actualMove++;
        }
        else {
            actualMove = 0;
            SpriteRoute = "Mario1.png";
        }
        Print();
    }

    private void Print(){
        img = new Texture(SpriteRoute);
    }


}
