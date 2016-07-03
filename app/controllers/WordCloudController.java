package controllers;

import play.mvc.Controller;
import models.WordCloud;

/**
 * Word cloud powered by Play 1.x.
 *
 * @author Toast kid
 */
public class WordCloudController extends Controller {

    /** width of word-cloud. */
    private static final int WIDTH  = 900;

    /** height of word-cloud. */
    private static final int HEIGHT = 600;

    /** Title. */
    private static final String TITLE = "Word Cloud";

    /**
     * /wc
     * @param sentence
     */
    public static void index(final String sentence) {
        renderArgs.put("title",         TITLE);
        if (sentence != null) {
            renderArgs.put("wcData",        new WordCloud().count(sentence));
            renderArgs.put("paramSentence", sentence);
            renderArgs.put("width",         WIDTH);
            renderArgs.put("height",        HEIGHT);
        }
        render();
    }
}
