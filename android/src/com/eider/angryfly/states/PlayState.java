package com.eider.angryfly.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.eider.angryfly.sprites.Bird;
import com.eider.angryfly.sprites.Tower;

public class PlayState extends State{

    private Bird bird;
    private Texture bg;
    private Tower tower;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Bird(320,50);
        camera.setToOrtho(false, (float) (Gdx.graphics.getWidth() /2.4), (float) (Gdx.graphics.getHeight()/2.7));
        bg = new Texture("fondo.png");
        tower = new Tower(200);
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            bird.jump();
        }

    }

    @Override
    public void update(float dt) {
        handleInput();
        bird.update(dt);

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();
        spriteBatch.draw(bg, camera.position.x - (camera.viewportWidth / 2),camera.position.y - (camera.viewportHeight / 2));
        spriteBatch.draw(bird.getBird(), bird.getPosition().x,bird.getPosition().y);
        spriteBatch.draw(tower.getTopTower(), tower.getPosTopTower().x, tower.getPosTopTower().y );
        spriteBatch.draw(tower.getBottomTower(),  tower.getPosBotTower().x, tower.getPosBotTower().y );
        spriteBatch.end();

    }

    @Override
    public void dispose() {

    }
}
