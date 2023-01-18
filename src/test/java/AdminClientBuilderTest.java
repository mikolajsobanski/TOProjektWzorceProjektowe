import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminClientBuilderTest {

    @Test
    void shouldSetName_whenSetNameCalled() {
        AdminClient admin = new AdminClientBuilder().setName("Test").createAdminClient();
        assertSame("Test", admin.getName());
    }
    @Test
    void shouldSetCity_whenSetCityCalled() {
        AdminClient admin = new AdminClientBuilder().setCity("TestCity").createAdminClient();
        assertSame("TestCity", admin.getCity());
    }
    @Test
    void shouldSetPhoneNumber_whenSetPhoneNumberCalled() {
        AdminClient admin = new AdminClientBuilder().setPhoneNumber("555-124-740").createAdminClient();
        assertSame("555-124-740", admin.getPhoneNumber());
    }
    @Test
    void shouldSetEmail_whenSetEmailCalled() {
        AdminClient admin = new AdminClientBuilder().setEmail("testmail@protonmail.com").createAdminClient();
        assertSame("testmail@protonmail.com", admin.getEmail());
    }

    @Test
    void shouldCreateParametrizedClient_whenParametrizedConstructorInvoked() {
        AdminClient admin = new AdminClientBuilder().setName("Test").setCity("testCity").setPhoneNumber("124-555-810").setEmail("othermail@test.com").createAdminClient();
        assertAll(
                () -> assertSame("Test", admin.getName()),
                () -> assertSame("testCity", admin.getCity()),
                () -> assertSame("124-555-810", admin.getPhoneNumber()),
                () -> assertSame("othermail@test.com", admin.getEmail())
        );
    }
}