package com.chroma.appsCommon;

import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Sample of instantiating an instance

    public static SamplePage samplePage;
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public void initializeAllPages() {

        samplePage = new SamplePage();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();

    }

}
