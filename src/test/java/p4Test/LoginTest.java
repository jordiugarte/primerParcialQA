package p4Test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import parcial1.filaB.p4.Login;
import parcial1.filaB.p4.Util;
import parcial1.filaB.p4.Util2;

import static org.powermock.api.easymock.PowerMock.verify;


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

        Mockito.verify(util);
        Mockito.verify(util2);

        Login login = new Login();
        String actualResult = login.roleUser(user, password);

        Assert.assertEquals("ERROR! ", result, actualResult);
    }
}
