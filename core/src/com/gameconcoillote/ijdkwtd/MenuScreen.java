package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuScreen implements Screen{
	private Background start;
	private SpriteBatch batch = new SpriteBatch();
	public boolean menuLang = true;
	private ijdkwtd game;
	public MenuScreen(ijdkwtd game){
		//background
		start = new Background(game,new Texture(Gdx.files.internal("Menu_start.png")));
		this.game = game;
	}
	@Override
    public void render(float delta){
		delta *= 1000;
		Gdx.graphics.getGL20().glClearColor( 1, 0, 0, 1 );
		Gdx.graphics.getGL20().glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
        start.update((int)delta);
        start.draw(this.batch);
    }
	public void gotoMenuLangue(){
		start = new Background(game,new Texture(Gdx.files.internal("Menu_langue.png")));
		menuLang = false;
	}
    @Override
    public void resize(int width, int height){
        // TODO Auto-generated method stub    
    }
    @Override
    public void show(){
		// TODO Auto-generated method stub
    }
	@Override
	public void pause(){

	}
	@Override
	public void resume(){
		// TODO Auto-generated method stub		
	}
	@Override
	public void hide(){
		// TODO Auto-generated method stub	
	}
	@Override
	public void dispose(){

	}
}
