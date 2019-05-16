import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MojServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized");
        ServletContext servletContext = sce.getServletContext();
        String rasaPsa = servletContext.getInitParameter("rasa");
        System.out.println(rasaPsa);
        Pies p = new Pies(rasaPsa);
        servletContext.setAttribute("pies", p);
    }
}
