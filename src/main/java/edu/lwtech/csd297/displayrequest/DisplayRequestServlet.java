package edu.lwtech.csd297.displayrequest;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import org.apache.logging.log4j.*;

// Display Request Servlet -
//      http://<server>:8080/displayrequest/servlet
//
// Chip Anderson
// LWTech CSD297

@WebServlet(name = "displayrequest", urlPatterns = {"/servlet"}, displayName = "DisplayRequest servlet", loadOnStartup = 0)
public class DisplayRequestServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(DisplayRequestServlet.class);

    @Override
    public void init(ServletConfig config) {
        logger.warn("=======  DisplayRequest SERVLET INIT ========");
    }

    @Override
    public void destroy() {
        logger.warn("------  DisplayRequest SERVLET DESTROY ------");
        logger.warn("");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        long startTime = System.currentTimeMillis();
        logger.debug("IN - {} {} {}", request.getRemoteAddr(), request.getMethod(), request.getRequestURI());

        // Use the request object to get the request's IP address, user-agent string,
        //   complete query string, and - if they exist - the "cmd" and "page" parameter values.
        // Store each of those items in a string...

        try (ServletOutputStream out = response.getOutputStream()) {
            //...and send them out as part of an HTML page here...
            out.println("<html><body>");

            out.println("<h4>REPLACE THIS WITH THE CORRECT PRINTLN() STATEMENTS!</h4>");    // Replace this line with your own code!

            out.println("</body></html>");
        } catch (IOException e) {
            logger.error("Unexpected IO Error sending response.", e);
        }

        long time = System.currentTimeMillis() - startTime;
        logger.info("OUT- {} {} {} {}ms", request.getRemoteAddr(), request.getMethod(), request.getRequestURI(), time);
    }

}