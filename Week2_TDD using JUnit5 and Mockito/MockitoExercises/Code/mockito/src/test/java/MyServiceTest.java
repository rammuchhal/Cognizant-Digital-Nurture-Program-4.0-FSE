import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.ExternalApi;
import org.example.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    // Exercise 1: Mocking and Stubbing
    @Test
    public void testExternalApi() {
        // Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call method and assert
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }

    // Exercise 2: Verifying Interactions
    @Test
    public void testVerifyInteraction() {
        // Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Inject mock
        MyService service = new MyService(mockApi);

        // Call method
        service.fetchData();

        // Verify that getData was called
        verify(mockApi).getData();
    }
}
