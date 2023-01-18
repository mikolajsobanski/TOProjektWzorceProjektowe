import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientBuilderTest {

    @Test
    void shouldSetName_whenSetNameCalled() {
        Client client = new ClientBuilder().setName("Test").createClient();
        assertSame("Test", client.getName());
    }
    @Test
    void shouldSetCity_whenSetCityCalled() {
        Client client = new ClientBuilder().setCity("TestCity").createClient();
        assertSame("TestCity", client.getCity());
    }
    @Test
    void shouldSetPhoneNumber_whenSetPhoneNumberCalled() {
        Client client = new ClientBuilder().setPhoneNumber("555-124-740").createClient();
        assertSame("555-124-740", client.getPhoneNumber());
    }
    @Test
    void shouldSetEmail_whenSetEmailCalled() {
        Client client = new ClientBuilder().setEmail("testmail@protonmail.com").createClient();
        assertSame("testmail@protonmail.com", client.getEmail());
    }

    @Test
    void shouldCreateParametrizedClient_whenParametrizedConstructorInvoked() {
        Client client = new ClientBuilder().setName("Test").setCity("testCity").setPhoneNumber("124-555-810").setEmail("othermail@test.com").createClient();
        assertAll(
                () -> assertSame("Test", client.getName()),
                () -> assertSame("testCity", client.getCity()),
                () -> assertSame("124-555-810", client.getPhoneNumber()),
                () -> assertSame("othermail@test.com", client.getEmail())
        );
    }
}