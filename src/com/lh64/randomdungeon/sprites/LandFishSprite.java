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
package com.lh64.randomdungeon.sprites;

import com.lh64.noosa.TextureFilm;
import com.lh64.randomdungeon.Assets;

public class LandFishSprite extends MobSprite {
	
	public LandFishSprite() {
		super();
		TextureFilm frames = new TextureFilm( texture, 16, 16 );
		

		texture( Assets.LANDFISH );
		idle = new Animation( 2, true );
		idle.frames( frames, 0, 0, 0, 0, 1);
		run = new Animation( 12, true );
		run.frames( frames, 2, 3);
		attack = new Animation( 12, false );
		attack.frames( frames, 2, 3, 4, 5, 6);
		die = new Animation( 12, false );
		die.frames( frames, 7, 8, 9);
		play( idle );
		
		
	}
}
