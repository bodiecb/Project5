package project5;

import java.awt.Shape;

/**
 * Used by the window to create arrays of bar shapes, or Glyphs to be added 
 * to the window based on the data associated with the provided 
 * song and demographic.
 */
public class GUIGlyph {
    private Song song; 
    private String demographic;
    
    /**
     * Instantiates the fields song and demographic to be 
     * equal to the provided parameters.
     * 
     * @param song the provided song
     * @param demographic the demographic identifies what 
     * information to use to make the bars.
     */
    public GUIGlyph(Song song, String demographic) {
        
    }
    
    /**
     * Creates an array of Shapes that represent the bars in the 
     * glyphs. This method is used by the GUISongWindow to 
     * add the bars of a new glyph to the window.
     * 
     * @return an array of Shapes that the windowClass will
     * be able to use to add to the screen.
     */
    public Shape[] getBars() {
        Shape[] bars = new Shape[4];
        for (int i = 0; i < 4; i++) {
            bars[i] = makeBar();
        }
    }
    
    private Shape makeBar() {
        
    }
}
