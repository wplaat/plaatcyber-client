/**
 *  @file
 *  @brief 
 *  @author wplaat
 *
 *  Copyright (C) 2008-2016 PlaatSoft
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, version 3.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package nl.plaatsoft.cyber.ui;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import nl.plaatsoft.cyber.tools.Constants;
import nl.plaatsoft.cyber.tools.MyButton;
import nl.plaatsoft.cyber.tools.MyLabel;
import nl.plaatsoft.cyber.tools.MyPanel;

public class Credits extends MyPanel {

	@Override
	public void draw() {
		
		Image image1 = new Image("images/background2.png");
	    BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
	    BackgroundImage backgroundImage = new BackgroundImage(image1, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
	    Background background = new Background(backgroundImage);
	    	
	    setBackground(background);
	    
	    int y=20;
	    getChildren().add( new MyLabel(0, y, "Credits", 60, "white", "-fx-font-weight: bold;"));
	    y+=120;
	    getChildren().add( new MyLabel(0, y, "GAME LOGIC", 24, "white"));
	    y+=30;
	    getChildren().add( new MyLabel(0, y, "wplaat", 18, "white"));
	    y+=60;
	    getChildren().add( new MyLabel(0, y, "GAME GRAPHICS", 24, "white"));
	    y+=30;    	 
	    getChildren().add( new MyLabel(0, y, "wplaat", 18, "white"));
	    y+=60;
	    getChildren().add( new MyLabel(0, y, "MUSIC & SOUND EFFECTS", 24, "white"));
	    y+=30;
	    getChildren().add( new MyLabel(0, y, "wplaat", 18, "white"));
	    y+=30;
	    getChildren().add( new MyLabel(0, y, "splaat", 18, "white"));
	    y+=60;
	    getChildren().add( new MyLabel(0, y, "TESTERS", 24, "white"));
	    y+=30;
	    getChildren().add( new MyLabel(0, y, "wplaat, lplaat, splaat, bplaat,", 18, "white"));
	    	     
	    getChildren().add( new MyButton(0, Constants.HEIGHT-60, "Close", 18, Navigator.HOME));		
	}
}
