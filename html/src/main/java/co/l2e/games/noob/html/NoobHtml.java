package co.l2e.games.noob.html;

import co.l2e.games.noob.core.Noob;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class NoobHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new Noob();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
