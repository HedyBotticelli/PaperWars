package com.ambigramoftwins.paperwars;
import org.apache.http.impl.*;

public class PrepareTiles
{
	int tileX=0, tileY=0, tileLAYER=0;
	void setTiles(int xx, int yy, int tileRES){
		switch (yy){
			case 0 : 
				switch (xx){
					case 0  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 1  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 2  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 3  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 4  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 5  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 6  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 7  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					default :tileX = 0*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
				} break;
			case 1 : 
				switch (xx){
					case 0  :tileX = 4*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 1  :tileX = 4*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 2  :tileX = 4*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 3  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 4  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 5  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 6  :tileX = 4*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					case 7  :tileX = 3*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
					default :tileX = 0*tileRES ; tileY =0*tileRES; tileLAYER=1; break;
				} break;
			
			
			
		
		}
		
	}
	
}
