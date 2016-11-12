package com.ambigramoftwins.paperwars;

import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, doodle;
	int[][] groundX, groundY;
	int map_max_x = 15, map_max_y = 25;
	int map_res = 64, src_res = 16;
	Random rnd = new Random();
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("Tile.png");
		doodle = new Texture("Tile.png");
		
		groundX = new int [map_max_x][map_max_y];
		groundY = new int [map_max_x][map_max_y];
		int max = 4, min = 0;
		
		for (int yy=0;yy< map_max_y; yy++){
			for (int xx=0;xx< map_max_x; xx++){
				int rand = rnd.nextInt(max - min) + min;
				groundX [xx][yy] = src_res * rand;
				groundY [xx][yy] = src_res * 0;
			}
		}	
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		if (Gdx.input.isTouched()){
			map_res = map_res + 1;
		}
		
			for (int y = 0;y<map_max_y;y++){
				for (int x = 0;x<map_max_x;x++){
					batch.draw(img, x*map_res,y*map_res,map_res,map_res,
							groundX [x][y],groundY [x][y],src_res,src_res,false,false);
				}	
			}
			batch.draw(doodle, 4*map_res,6*map_res,map_res,map_res,
					5*src_res,1*src_res,src_res,src_res,false,false);
			batch.draw(doodle, 5*map_res,6*map_res,map_res,map_res,
					5*src_res,1*src_res,src_res,src_res,false,false);
			batch.draw(doodle, 4*map_res,5*map_res,map_res,map_res,
					5*src_res,1*src_res,src_res,src_res,false,false);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		doodle.dispose();
	}
}
