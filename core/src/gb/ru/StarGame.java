package gb.ru;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TextureRegion region;
	int x, y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		region = new TextureRegion(img, 20, 25, 100, 100);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0.5f, 0.23f, 0.74f, 1);
		batch.begin();
		batch.setColor(1, 1, 1, 0.5f);
		batch.draw(img, x, y, 200, 200);
		batch.setColor(1f, 0.3f, 0.7f, 1f);
		batch.draw(region, 300, 300);
		batch.setColor(1, 1, 1, 0.5f);
		batch.draw(region, 200, 200);
		batch.end();
		x++;
		y++;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
