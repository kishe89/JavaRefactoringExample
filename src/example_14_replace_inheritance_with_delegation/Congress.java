package example_14_replace_inheritance_with_delegation;

import java.util.Random;

public class Congress {
	private boolean consent;
	private final int bound = 10;
	private boolean isConsent() {
		return consent;
	}

	private void setConsent() {
		Random random = new Random();
		if(random.nextInt(bound)<6) {
			consent = true;
			return;
		}
		consent = false;
	}
	public boolean requestConsent() {
		setConsent();
		return isConsent();
	}
}
