package com.eider.angryfly;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.eider.angryfly.states.AngryFly;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		/*config.width = AngryFly.WIDTH;
		config.height = AngryFly.HEIGHT;
		config.title = AngryFly.TITLE;*/
		initialize(new AngryFly(), config);
	}
}
