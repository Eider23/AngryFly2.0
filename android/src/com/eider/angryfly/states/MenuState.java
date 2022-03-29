package com.eider.angryfly.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuState extends State{

    private Texture background;
    private Texture playButton;

    public MenuState(GameStateManager gameStateManager) {
        super(gameStateManager);
        background = new Texture("fondo.png");
        playButton = new Texture("botonplay.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.begin();

        spriteBatch.draw(background, 0,0, AngryFly.WIDTH, AngryFly.HEIGHT );

        spriteBatch.draw(playButton, (AngryFly.WIDTH / 2 ) - (playButton.getWidth() / 2), (AngryFly.HEIGHT / 2) - (playButton.getHeight() / 2));

        spriteBatch.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playButton.dispose();
    }
}
