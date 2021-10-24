package service;

import com.example.rest.model.Employee;
import com.example.rest.repository.EmployeeRepository;
import com.example.rest.service.EmployeeService;
import org.apache.el.stream.Optional;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class EmplyeeServiceTest {

    private final EmployeeService employeeService;

    @MockBean
    private EmployeeRepository repository;

    public EmplyeeServiceTest(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//    public void testFindById() {
//        BDDMockito.given(employeeService.read(Mockito.anyString()))
//                .willReturn(Optional.of(new Employee()));
//
//        Optional<Travel> response = service.findByOrderNumber("123456");
//        assertTrue(!response.isEmpty());
//    }

}
