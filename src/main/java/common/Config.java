package common;

public class Config {

    public static final String BROWSER = "chrome";

    /**
     * Clear browser cookies after each test
     * if true - clear cookies
     */
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;

    /**
     * Close browser after each test
     * if true - close browser
     */
    public static final Boolean CLOSE_BROWSER = true;

    /**
     * Maximize browser window before each test
     * if true - maximize window
     */
    public static final Boolean MAXIMIZE_WINDOW = true;
}
