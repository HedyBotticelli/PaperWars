package com.ambigramoftwins.paperwars;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public class MyGdxGame implements ApplicationListener
{
	Texture texture;
	SpriteBatch batch;
	int tileX, tileY;
	PrepareTiles splicx = new PrepareTiles();
	//String kurapF = "no";
	//String kurapI = "no";
	//float myTileX;
	//float myTileY;

	@Override
	public void create()
	{
		texture = new Texture(Gdx.files.internal("Tile.png"));
		batch = new SpriteBatch();
	}

	@Override
	public void render()
	{        
		Gdx.gl.glClearColor(1, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		/*batch.draw(texture, 0, 0, 
		 Gdx.graphics.getWidth() / 2, Gdx.graphics.getWidth() / 2);
		*/
		
		for(int yy=0; yy<15; yy++){
			for(int xx=0; xx<8; xx++){ 
				splicx.setTiles(xx,yy,16);
				//processing input
				if (Gdx.input.isTouched()){
					splicx.tileX = 0;
					//splicx.tileY = 0;
					//kurapF = "yes";
				}/*else{
				 tileX = 0;
				 tileY = 0;
				 //kurapF = "no";
				 }*/
					batch.draw(texture, xx*90, yy*90, 90, 90,
						   	splicx.tileX, splicx.tileY, 16, 16, false, false); 
			}
		}
		batch.end();
	}

	@Override
	public void dispose()
	{
		texture.dispose();
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
