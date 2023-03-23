package screens;

import utils.ReusableMethods;

public class Screens extends ReusableMethods {
    public Screens(){

    }

    private HomeScrens homeScreens;

    public HomeScrens homeScrens() {
        if (homeScreens == null) {
            homeScreens = new HomeScrens();
        }
        return homeScreens;
    }
}

