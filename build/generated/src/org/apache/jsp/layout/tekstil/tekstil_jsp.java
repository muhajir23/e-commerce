package org.apache.jsp.layout.tekstil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.oreilly.servlet.MultipartRequest;

public final class tekstil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../bootstrap/navbarsubmenu.css\"/>\n");
      out.write("        <script src=\"../../bootstrap/jquery.js\"></script>\n");
      out.write("        <script src=\"../../bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script language='javascript'>\n");
      out.write("            function validAngka(a)\n");
      out.write("            {\n");
      out.write("                if (!/^[0-9.]+$/.test(a.value))\n");
      out.write("                {\n");
      out.write("                    a.value = a.value.substring(0, a.value.length - 1000);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"padding-left: 100px;padding-right: 100px;padding-top: 50px;\">\n");
      out.write("            \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../parts-web/umum/navbar.html", out, false);
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-2\" style=\"background-color: red\"></div>\n");
      out.write("                <div class=\"col-lg-10\">\n");
      out.write("                    ");

                        String status = (String) request.getAttribute("status");
                        if (status == null) {
                            out.print("hajir");
                    
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../parts-web/tekstil/midUpdate.jsp", out, false);
      out.write(' ');

            } else if (status.equalsIgnoreCase("error")) {
                    
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../parts-web/tekstil/midAddNewError.jsp", out, false);
      out.write(' ');

                    }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
