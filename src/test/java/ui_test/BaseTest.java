package ui_test;

import com.codeborne.selenide.Configuration;
import java.io.IOException;

public class BaseTest {
    protected BrowserType browserType;
    private static final String CHROME = "chrome";
    private static final String FOX = "firefox";
    protected static void initBrowser(BrowserType type) throws IOException {
        if (type.equals(BrowserType.GOOGLE_CHROME)) {
            Configuration.browser = CHROME;

        } else if (type.equals(BrowserType.FOX_BROWSER)) {
            Configuration.browser = FOX;
        }
    }
}
