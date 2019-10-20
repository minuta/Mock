import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;



@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {

    @InjectMocks
    Service service;

    @Mock
    public FileReaderUtil fileReaderUtil;

//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//    }


    @Test
    public void serviceTest(){
        when(fileReaderUtil.readFile()).thenReturn("bla");
        String expected = "bla";
        String mockedAnswer = service.serveList();
        assertThat(expected, is(mockedAnswer));
    }

    @Test
    public void serviceTest2(){
        when(fileReaderUtil.readFile()).thenReturn("bla");
        String expected = "bla";
        String mockedAnswer = new Service(fileReaderUtil).serveList();
        assertThat(expected, is(mockedAnswer));
    }
}