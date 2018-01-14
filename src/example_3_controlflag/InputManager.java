package example_3_controlflag;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputManager implements KeyListener{
	
	public InputManager() {
		super();
	}
	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("key :"+event.getKeyCode());
	}
	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("key :"+event.getKeyCode());
	}
	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		 int keycode = event.getKeyCode();
		 System.out.println("key :"+keycode);
	}
}
