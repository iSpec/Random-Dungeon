/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.lh64.randomdungeon.items.food;


import com.lh64.randomdungeon.Dungeon;
import com.lh64.randomdungeon.actors.blobs.Blob;
import com.lh64.randomdungeon.actors.blobs.ToxicGas;
import com.lh64.randomdungeon.actors.buffs.Buff;
import com.lh64.randomdungeon.actors.buffs.GasesImmunity;
import com.lh64.randomdungeon.actors.buffs.Hunger;
import com.lh64.randomdungeon.actors.hero.Hero;
import com.lh64.randomdungeon.scenes.GameScene;
import com.lh64.randomdungeon.sprites.ItemSpriteSheet;
import com.lh64.randomdungeon.utils.GLog;


public class Cheese extends Food {

	{
		name = "Cheese";
		image = ItemSpriteSheet.CHEZ;
		energy = Hunger.STARVING;
		message = "That was some pretty good cheeze!.";
	}
	
	@Override
	public String info() {
		return "This is a nasty smelling food that is the heart of the rat kingdom.";
	}
	
	@Override
	public void execute( Hero hero, String action ) {
		
		super.execute( hero, action );
		
		if (action.equals( AC_EAT )) {
			GLog.p("You begin to smell a bit nasty...");
			Buff.prolong( hero, GasesImmunity.class, 3f );
			GameScene.add( Blob.seed( Dungeon.hero.pos, 200, ToxicGas.class ) );
		}
	}
	
	@Override
	public int price() {
		return 30 * quantity;
	}
}
