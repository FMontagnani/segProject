package utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GetRenderMax {
    
	public static int getHeigth() {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension d = tk.getScreenSize();
		
	    return  d.height;
	}
	public static int getWidth() {
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension d = tk.getScreenSize();
	    
	    return d.width;
	}
}
