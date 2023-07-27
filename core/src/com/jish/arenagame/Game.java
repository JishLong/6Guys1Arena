package com.jish.arenagame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.jish.arenagame.asset.Asset;
import com.jish.arenagame.asset.AssetHelper;
import com.jish.arenagame.player.Player;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	Player p;

	@Override
	public void create () {
		Logger.init();
		AssetHelper.init();
		AssetHelper.loadInitialAssets();
		AssetHelper.loadAssets();
		while (!AssetHelper.isLoadingAssets()) {

		}
		batch = new SpriteBatch();
		img = AssetHelper.get(Asset.TEST);
		p = new Player();
	}

	@Override
	public void resize (int width, int height) {
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		p.update();
		p.render(batch, img);
		batch.end();
	}

	@Override
	public void pause () {
	}

	@Override
	public void resume () {
	}

	@Override
	public void dispose () {
		batch.dispose();
		AssetHelper.dispose();
	}
}
