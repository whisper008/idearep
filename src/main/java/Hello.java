import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/8/5 0005.
 */
public class Hello extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("xixi");

        OutputStream os=resp.getOutputStream();
        PrintWriter pw=new PrintWriter(os);
        pw.println("hello hah");
        pw.close();
    }

}
