package project5;

import CS2114.Button;
import java.awt.Color;
import CS2114.Window;
import CS2114.WindowSide;
import rollercoaster.CoasterTrain;

/**
 * This class creates the screen that the client interacts with. The screen 
 * contains 10 buttons which the user can click to change how the 
 * songs are sorted as well as to change how the demographics are 
 * represented on the screen. Only nine song glyphs can be displayed on 
 * the screen at a time, but the next and previous buttons can be used to 
 * display more of the songs in the array.
 * 
 * @author 
 * @version 
 *
 */
public class GUISongWindow {
    private DataManager data;
    private Button previousButton; 
    private Button nextButton;
    private Button quitButton;
    private Button sortByArtistButton;
    private Button sortByTitleButton;
    private Button sortByYearButton;
    private Button sortByGenreButton;
    private Button representHobbyButton;
    private Button representMajorButton;
    private Button representRegionButton;
    private Color pink; 
    private Color blue; 
    private Color yellow;
    private Color green;
    private String currentRepresentBy;
    private String currentSortBy;
    private Window window;
    
    /**
     * The constructor instantiates all nine buttons as well as adds the nine 
     * black columns and the legend. 
     */
    public GUISongWindow() {
        
        window = new Window();
        window.setTitle("Project 5");
        
        previousButton = new Button("<-- Prev");
        sortByArtistButton = new Button("Sort by Artist Name");
        sortByTitleButton = new Button("Sort by Song Title");
        sortByYearButton = new Button("Sort by Release Year"); 
        sortByGenreButton = new Button("Sort by Genre");
        nextButton = new Button("Next -->");
        
        window.addButton(previousButton, WindowSide.NORTH);
        window.addButton(sortByArtistButton, WindowSide.NORTH);
        window.addButton(sortByTitleButton, WindowSide.NORTH);
        window.addButton(sortByYearButton, WindowSide.NORTH);
        window.addButton(sortByGenreButton, WindowSide.NORTH);
        window.addButton(nextButton, WindowSide.NORTH);
        
        representHobbyButton = new Button("Represent Hobby");
        representMajorButton = new Button("Represent Major");
        representRegionButton = new Button("Represent Region");
        quitButton = new Button("Quit");
        
        
        
        seatParty = new Button("Seat Party");
        sendTrain = new Button("Send Train");
        window.addButton(seatParty, WindowSide.SOUTH);
        window.addButton(sendTrain, WindowSide.SOUTH);
        seatParty.onClick(this, "clickedSeatParty");
        sendTrain.onClick(this, "clickedSendTrain");
        
    }
    
    /**
     * Removes the current song glyphs on the screen and 
     * adds the previous nine glyphs in the song array with the same 
     * sort by and represented by categories.
     * 
     * @param previous is the next button
     */
    public void clickedPrevious(Button previous) {
        
    }
    
    /**
     * Removes the current song gylphs on the screen and 
     * adds the next nine glyphs in the song array with the same 
     * sort by and represented by categories.
     * 
     * @param next is the next button
     */
    public void clickedNext(Button next) {
        
    }
    
    /**
     * Ends the program. 
     * 
     * @param quit is the quit button.
     */
    public void clickedQuit(Button quit) {
        
    }
    
    /**
     * Re-adjusts the screen to display the songs sorted by 
     * artist. Will not change the way the songs are represented, 
     * but the glyphs will have to be redrawn.
     * 
     * @param genre the Sort by Artist Name button.
     */
    public void clickedSortByArtist(Button artist) {
        
    }
    
    /**
     * Re-adjusts the screen to display the songs sorted by 
     * title. Will not change the way the songs are represented, 
     * but the glyphs will have to be redrawn.
     * 
     * @param genre the Sort by Song Title button.
     */
    public void clickedSortByTitle(Button title) {
        
    }
    
    /**
     * Re-adjusts the screen to display the songs sorted by 
     * Year. Will not change the way the songs are represented, 
     * but the glyphs will have to be redrawn.
     * 
     * @param genre the Sort by Release Year button.
     */
    public void clickedSortByYear(Button title) {
        
    }
    
    /**
     * Re-adjusts the screen to display the songs sorted by 
     * genre. Will not change the way the songs are represented, 
     * but the glyphs will have to be redrawn.
     * 
     * @param genre the Sort by Genre button.
     */
    public void clickedSortByGenre(Button genre) {
        
    }
    
    /**
     * Re-adjusts the screen to display the songs with respect to 
     * students' hobbies. This will not change the way the songs are 
     * sorted on the screen, but the glyphs will have to be redrawn 
     * and the legend changed.
     * 
     * @param region is the RepresentHobby button.
     */
    public void clickedRepresentHobby(Button hobby) {
        
    }
    
    /**
     * Re-adjusts the screen to display the songs with respect to 
     * students' majors. This will not change the way the songs are 
     * sorted on the screen, but the glyphs will have to be redrawn
     * and the legend changed.
     * 
     * @param region is the RepresentMajors button.
     */
    public void clickedRepresentMajor(Button major) {
        
    }
    
    /**
     * Re-adjusts the screen to display the songs with respect to 
     * students' regions. This will not change the way the songs are 
     * sorted on the screen, but the glyphs will have to be redrawn and 
     * the legend changed.
     * 
     * @param region is the RepresentRegion button.
     */
    public void clickedRepresentRegion(Button region) {
        
    }
    
    /**
     * Adds nine new glyphs to the screen starting with the song
     * in the sorted array at the provided integer and then
     * continuing through the following eight.
     * 
     * @param startIndexNode starting index of songs from song array
     * to be displayed.
     */
    private void drawGlyphs(int startIndexNode) {
        
    }
    
    /**
     * Changes the legend to be the values in the given demographic, 
     * i.e. region, major, or hobby.
     * 
     * @param demographic the demographic that is being 
     * represented on the screen.
     */
    private void changeLegend(String demographic) {
        
    }

}
