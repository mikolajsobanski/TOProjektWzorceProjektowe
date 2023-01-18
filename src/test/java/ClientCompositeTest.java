import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientCompositeTest {

    @Test
    void shouldReturnTotalDebt_whenCountDebtInvoked() {
        Client client1 = new ClientBuilder().createClient();
        client1.incurDebt(4.5);
        AdminClient admin = new AdminClientBuilder().createAdminClient();
        admin.incurDebt(17.4);
        Client client2 = new ClientBuilder().createClient();
        admin.indebt(client2, 1.9);
        ClientComposite innerClients = new ClientComposite(client1, client2, admin);
        assertEquals( (4.5+7.4+1.9), innerClients.countDebt(), 0.01);

        Client client4 = new ClientBuilder().createClient();
        client4.incurDebt(5.2);
        ClientComposite outerClients = new ClientComposite(client4, innerClients);
        assertEquals((5.2+4.5+7.4+1.9), outerClients.countDebt(), 0.01);
    }
}