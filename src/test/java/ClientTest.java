import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ClientTest {

    @Test
    void shouldIncreaseDebt_whenCalledByAdmin() {
        Client client = new ClientBuilder().createClient();
        AdminClient admin = mock(AdminClient.class);
        admin.indebt(client, 6.10);
        assertTrue(client.countDebt() - 6.10 < 0.01);
    }

    @Test
    void shouldReturnSameAmount_whenDebtMethodsCalled() {
        Client client = new ClientBuilder().createClient();
        client.incurDebt(5.78);
        client.incurDebt(-3.73);
        client.incurDebt(1.92);
        assertEquals(client.countDebt(), client.getTotalDebt(), 0.01);
    }

    @Test
    void shouldReturnFalse_whenAdminAccessChecked() {
        Client client = new ClientBuilder().createClient();
        assertFalse(client.isAdmin);
    }

    @Test
    void shouldIncrementId_whenCreated() {
        Client.setIdCount(0);
        Client client1 = new ClientBuilder().createClient();
        Client client2 = new ClientBuilder().createClient();
        Client client3 = new ClientBuilder().createClient();
        assertAll(
                () -> assertEquals(0, client1.getId()),
                () -> assertEquals(1, client2.getId()),
                () -> assertEquals(2, client3.getId())
        );
    }

    @Test
    void shouldReturnNegativeNumber_whenDebtBelowZero() {
        Client client = new ClientBuilder().createClient();
        client.incurDebt(3.2);
        client.reduceDebt(5.1);
        assertEquals(Math.abs(client.countDebt()), 1.9, 0.01);
    }

    @Test
    void shouldReturnNull_whenFieldsUninitialized() {
        Client client = new ClientBuilder().setName("TestName").createClient();
        assertAll(
                () -> assertEquals("TestName", client.getName()),
                () -> assertNull(client.getCity()),
                () -> assertNull(client.getEmail()),
                () -> assertNull(client.getPhoneNumber())
        );
    }
}