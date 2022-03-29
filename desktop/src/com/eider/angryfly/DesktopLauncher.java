package com.eider.angryfly;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

//import com.eider.angryfly.AngryFly;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		/*config.width = AngryFly.WIDTH;
		config.height = AngryFly.HEIGHT;
		config.title = AngryFly.TITLE;
		new Lwjgl3Application(new AngryFly(), config);*/
	}
}
