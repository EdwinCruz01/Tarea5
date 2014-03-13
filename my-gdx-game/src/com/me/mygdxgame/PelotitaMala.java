package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

public class PelotitaMala extends Pelotita
{
	public PelotitaMala(int x,int y)
	{
		super(x,y,new Texture("data/pelotitaMala.png"));
		this.addListener(new MiInputMala(this));
		this.setX(x);
		this.setY(y);
	}
}

