package pages;

public class Pages {
    public Pages(){

    }

    private HomePage homePage;

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
}
