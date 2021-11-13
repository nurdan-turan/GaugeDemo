package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;

public class HomeTest {
    HomeModel homeModel = new HomeModel();

    @Step("Kullanıcı <key> sayfasını ziyaret eder")
    public void userVisitSite(String key){
        homeModel.useVisitSite(key);
    }

    @Step("Kullanıcı <email> ve <password> ile login olur")
    public void doLogin(String email, String password) throws InterruptedException {
      homeModel.doLogin(email, password);
    }


}
