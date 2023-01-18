import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.Math;

class AdminClientTest {

    @Test
    void shouldIncreaseDebt_whenAdmitAppliesPenalty() {
        AdminClient admin = new AdminClientBuilder().createAdminClient();
        Client client = new ClientBuilder().createClient();
        admin.indebt(client, 10.00);
        assertEquals(10.00, client.countDebt());
    }

    @Test
    void shouldRoundToZero_whenAdminDebtBelowThreshold() {
        AdminClient admin = new AdminClientBuilder().createAdminClient();
        admin.incurDebt(9.5);
        assertEquals(0, admin.countDebt());
    }

    @Test
    void shouldDisplayDept_whenAdminDebtOverThreshold() {
        AdminClient admin = new AdminClientBuilder().createAdminClient();
        admin.incurDebt(5);
        admin.incurDebt(7.3);
        assertEquals(2.3, admin.countDebt(), 0.01);
    }

    @Test
    void shouldAdjustDebt_whenCalledOnItself() {
        AdminClient admin = new AdminClientBuilder().createAdminClient();
        admin.indebt(admin, 17.32);
        assertEquals(7.32, admin.countDebt(), 0.01);
    }

    @Test
    void shouldReturnTrue_whenPermissionsChecked() {
        AdminClient admin = new AdminClientBuilder().createAdminClient();
        assertTrue(admin.isAdmin);
    }

    @Test
    void shouldReturnUnmodifiedDebt_whenGetTotalDebtCalled() {
        AdminClient admin = new AdminClientBuilder().createAdminClient();
        admin.incurDebt(23.87);
        assertEquals(10.00, Math.abs(admin.getTotalDebt() - admin.countDebt()), 0.01);
    }
}