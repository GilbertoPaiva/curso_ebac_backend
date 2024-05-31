package br.com.gpaiva;
import org.junit.runner.RunWith;
import orddjunit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        br.com.gpaiva.VendaDAOTest.class})
public class AllTests {

}
