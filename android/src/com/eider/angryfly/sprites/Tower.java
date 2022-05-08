package com.eider.angryfly.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Tower {

    private static final int FLUCTUATION = 130;
    private static final int TOWER_GAP = 100;
    private static final int LOWEST_OPENING = 120;

    private Texture topTower;
    private Texture bottomTower;

    private Vector2 posTopTower;
    private Vector2 posBotTower;

    private Random rand;

    public  Tower(float y){
        topTower = new Texture("obstaculosuperior.png");
        bottomTower = new Texture("obstaculoinferior.png");

        rand = new Random();

        posTopTower = new Vector2(rand.nextInt(FLUCTUATION) + TOWER_GAP + LOWEST_OPENING,y );
        posBotTower = new Vector2(posTopTower.x - TOWER_GAP - bottomTower.getHeight() , y);
    }

    public Texture getTopTower() {
        return topTower;
    }

    public void setTopTower(Texture topTower) {
        this.topTower = topTower;
    }

    public Texture getBottomTower() {
        return bottomTower;
    }

    public void setBottomTower(Texture bottomTower) {
        this.bottomTower = bottomTower;
    }

    public Vector2 getPosTopTower() {
        return posTopTower;
    }

    public void setPosTopTower(Vector2 posTopTower) {
        this.posTopTower = posTopTower;
    }

    public Vector2 getPosBotTower() {
        return posBotTower;
    }

    public void setPosBotTower(Vector2 posBotTower) {
        this.posBotTower = posBotTower;
    }

}
