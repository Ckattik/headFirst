package headFirstPatternDeputyVirtualPartTwo;

import java.awt.Component;
import java.awt.Graphics;

public interface Icon {

	public int getIconWidth();
	public int getIconHeight();
	
	void paintIcon(Component c, Graphics g, int x, int y);
}
