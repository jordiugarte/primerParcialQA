package p4Test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import parcial1.filaB.p4.Login;
import parcial1.filaB.p4.Util;
import parcial1.filaB.p4.Util2;

public class LoginTest {

    Util util = Mockito.mock(Util.class);
    Util2 util2 = Mockito.mock(Util2.class);

    @Test
    public void verify_user_login() {
        String user = "jordiuarte";
        String password = "2020%abcD";
        String permission = "CRUD";
        String result = "PERMISSION ROLE CRUD";

        Mockito.when(util.getPermision(user, password)).thenReturn(permission);
        Mockito.when(util2.isUserValid(user, password)).thenReturn(true);

        Login login = new Login(util2, util);
        String actualResult = login.roleUser(user, password);

        Assert.assertEquals("ERROR! ", result, actualResult);
        Mockito.verify(util).getPermision(user, password);
        Mockito.verify(util2).isUserValid(user, password);
    }
}
