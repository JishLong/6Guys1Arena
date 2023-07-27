package com.jish.arenagame.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.jish.arenagame.character.ICharacter;

public class AbstractPlayer implements IPlayer {
    protected ICharacter character;
    protected Vector2 position;
    protected final float movementSpeed = 0.5f;

    protected AbstractPlayer(ICharacter character) {
        this.character = character;
        position = Vector2.Zero;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void update() {
        if (Gdx.input.isKeyPressed(Input.Keys.W))
            position.y += character.getInfo().baseSpeed;
        if (Gdx.input.isKeyPressed(Input.Keys.S))
            position.y -= character.getInfo().baseSpeed;
        if (Gdx.input.isKeyPressed(Input.Keys.A))
            position.x -= character.getInfo().baseSpeed;
        if (Gdx.input.isKeyPressed(Input.Keys.D))
            position.x += character.getInfo().baseSpeed;
    }

    public void render(SpriteBatch sb, Texture t) {
        sb.draw(t, position.x, position.y);
    }
}
