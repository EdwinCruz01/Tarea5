package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pelotita extends Image{
	
	public Pelotita(int x,int y,Texture t) {
		super(t);
		this.addListener(new MiInput(this));
		this.setX(x);
		this.setY(y);
	}
 public void act
 
	 (float deta){
	 setX(getX()+1);
	 if (getX()>500)
	 {
		 setX(0);
	}
 }
}

