package com.gameconcoillote.ijdkwtd;

import com.badlogic.gdx.graphics.Texture;

public class TakeItem extends Item
{

	private Player player;
	private boolean canTake = true;
	private boolean canActivate = false;
	
	public TakeItem(Texture t,Player p) {
		super(t);
		this.player = p;
	}
	
	public TakeItem(Texture t,Player p,int x,int y) {
		super(t,x,y);
		this.player = p;
	}

	@Override
	public void activate() {
		//System.out.println("TESSST");
		
		take();
			
		
		if(this.canActivate)
		{
			use();
			
			this.canActivate = false;
		}
		
		
	}
	
	public void use()
	{
		System.out.println("SALUT");
	}
	
	public void take()
	{
		this.player.takeItem(this);
		//this.visible = false;
		this.canTake = false;
		this.canActivate = true;
	}

	public boolean canTake()
	{
		return this.canTake;
	}
}
