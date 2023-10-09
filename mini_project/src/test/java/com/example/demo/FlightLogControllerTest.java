package com.example.demo;

//---------------------------------TestCase--------------------------------------------------------
//@MockBean is another annotation provided by the Spring Framework and is commonly used with 
//Spring Boot applications for integration testing. 
//It's used to create mock instances of beans and replace the actual beans in the Spring application context during testing
//MockMvc is a class provided by Spring that allows you to write tests for your Spring
//Spring Boot application context for testing. It automatically configures and injects a MockMvc instance
//into your test class, making it available for use in your tests.
//import static org.mockito.Mockito.*;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class FlightLogControllerTest {
//
//  @Autowired
//  private MockMvc mockMvc;
//
//  @MockBean
//  private FlightLogRepository flightLogRepository;
//
//  @Test .
//  public void testAddFlightLog() throws Exception {
//      // Create a sample Flight_log object
//      Flight_log flightLog = new Flight_log();
//      flightLog.setId(1L); // Set the ID if needed
//      flightLog.setFlightName("Sample Flight");
//      // Add other necessary fields
//
//      // Convert the Flight_log object to JSON
//      ObjectMapper objectMapper = new ObjectMapper();
//      String flightLogJson = objectMapper.writeValueAsString(flightLog);
//
//      // Mock the behavior of flightLogRepository.save()
//      when(flightLogRepository.save(any(Flight_log.class))).thenReturn(flightLog);
//

//
//      // Verify the HTTP response code (200 OK for success)
//      int status = result.getResponse().getStatus();
//      assertEquals(200, status);
//
//      // Verify that flightLogRepository.save() was called
//      verify(flightLogRepository, times(1)).save(any(Flight_log.class));
//
//      // Add more assertions as needed based on your application's behavior
//  }
//}
//
