package com.hrb1658.topdownsurvival.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.hrb1658.topdownsurvival.screen.AbstractScreen;
import com.hrb1658.topdownsurvival.screen.MenuScreen;
import com.hrb1658.topdownsurvival.screen.PlayScreen;

public class SurvivalGame extends Game {

	public static SurvivalGame instance = new SurvivalGame();

	public SpriteBatch batch;

	public AbstractScreen menuScreen;
	public AbstractScreen playScreen;

	@Override
	public void create() {
		batch = new SpriteBatch();

		playScreen = new PlayScreen();
		menuScreen = new MenuScreen();

		setScreen(menuScreen);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}
}
