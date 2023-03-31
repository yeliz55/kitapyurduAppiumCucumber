package screens;

import utils.ReusableMethods;

public class Screen extends ReusableMethods {
  private HomeScreen homeScreen;
  private LoginScreen loginScreen;
  private RegisterScreen registerScreen;

  private OrderScreen orderScreen;

  public HomeScreen homeScreen() {
    if (homeScreen == null) {
      homeScreen = new HomeScreen();
    }
    return homeScreen;
  }

  public LoginScreen loginScreen() {
    if (loginScreen == null) {
      loginScreen = new LoginScreen();
    }
    return loginScreen;
  }

  public RegisterScreen registerScreen() {
    if (registerScreen == null) {
      registerScreen = new RegisterScreen();
    }
    return registerScreen;

  }
  public OrderScreen orderScreen() {
    if (homeScreen == null) {
      orderScreen = new OrderScreen();
    }
    return orderScreen;
  }
}
