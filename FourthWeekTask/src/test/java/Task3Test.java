import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class Task3Test
{
    private static final Map<Integer, String>  idandemail = new HashMap<Integer, String>();
    private String testemail = "wrr@mail.ru", testurl = "https://mail.ru/";
    private Task3 test3 = mock(Task3.class);

    @Before
    public void setUpIdUsers ()
    {
        idandemail.put(3, "wrr@mail.ru");
        ////idandemail.put(4, "qwerty@mail.ru");                    //// uncomment for a negative test in testGetUserEmail()
    }

    @Test
    public void testGetUserEmail()
    {
        for (Map.Entry<Integer, String> element : idandemail.entrySet())
        {
            final Integer id = element.getKey();
            final String email = element.getValue();
            when(test3.getUserEmail(id)).thenReturn(email);
            assertEquals(testemail, test3.getUserEmail(id));
        }
    }

    @Test
    public void testGetCurrentUrl()
    {
        when(test3.getCurrentUrl()).thenReturn(testurl);
        assertEquals("https://mail.ru/", test3.getCurrentUrl());
        verify(test3, atLeastOnce()).getCurrentUrl();
    }

    @Test
    public void testNoCurrentUrl()
    {
        when(test3.getCurrentUrl()).thenReturn("");
        assertEquals("No current URL", testurl, test3.getCurrentUrl());
    }

    @Test
    public void testIsRegisteredUser()
    {
        when(test3.isRegisteredUser(testemail)).thenReturn(true);
        assertTrue("There is no registered user", test3.isRegisteredUser(testemail));
    }

    @Test
    public void testIsntRegisteredUser()
    {
        when(test3.isRegisteredUser("")).thenReturn(true);
        assertTrue("There is no registered user", test3.isRegisteredUser(testemail));
    }
}