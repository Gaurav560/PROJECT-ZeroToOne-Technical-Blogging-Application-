/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-04-29 20:32:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.blog.helper.ConnectionProvider;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/indexNavbar.jsp", Long.valueOf(1682763586988L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.blog.helper.ConnectionProvider");
    _jspx_imports_classes.add("java.sql.Connection");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Index page</title>\r\n");
      out.write("<!--  Bootstrap css-->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("	\r\n");
      out.write("<!--css  -->\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- font-awesome -->\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/d52455da93.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!-- style tag -->\r\n");
      out.write("<style>\r\n");
      out.write(".bg-dar {\r\n");
      out.write("	padding: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jumbo {\r\n");
      out.write("	padding: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner-background {\r\n");
      out.write("	clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 77% 88%, 36% 94%, 0 90%, 0 0);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("<nav class=\"navbar navbar-expand-lg  bg-primary dar \"   data-bs-theme=\"dark\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		\r\n");
      out.write("         <a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"fa-brands fa-blogger-b\"></i> Zero-To-One</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"#\">Home</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\"><i class=\"fa-solid fa-address-book\"></i> Contact</a></li>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle active\" href=\"#\" role=\"button\"\r\n");
      out.write("					data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Cateogries </a>\r\n");
      out.write("					<ul class=\"dropdown-menu\">\r\n");
      out.write("						<li><a class=\"dropdown-item \" href=\"#\">Action</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("						<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("				\r\n");
      out.write("			</ul>\r\n");
      out.write("			<form class=\"d-flex\" role=\"search\">\r\n");
      out.write("				<input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\"\r\n");
      out.write("					aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-outline-warning\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- jumbotron starts here -->\r\n");
      out.write("	<div class=\"container-fluid m-0 p-0 \">\r\n");
      out.write("		<div class=\"jumbo bg-primary text-white banner-background\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("				<h3 class=\"display-3 pb-3 text-dark\">Zero-To-One</h3>\r\n");
      out.write("				<p class=\"fs-5 text-white\">Welcome to Zero-To-One Tech Blogging\r\n");
      out.write("					Application. Write your technical blogs at zero-to-one and share\r\n");
      out.write("					your knowledge to the world.with our easy to use dev tools and ai\r\n");
      out.write("					assistant ,now you can only focus on content and left the design\r\n");
      out.write("					part on us .</p>\r\n");
      out.write("				<p class=\"fs-5 text-white pb-2\">Get Ready to be part of this\r\n");
      out.write("					awesome journey of Technical Blogging</p>\r\n");
      out.write("				<p></p>\r\n");
      out.write("				<a href=\"register_page.jsp\" class=\"btn  btn-outline-light\">\r\n");
      out.write("					<i class=\"fa-solid fa-user-plus\"></i> Start! its free\r\n");
      out.write("				</a>\r\n");
      out.write("				<a href=\"login_page.jsp\" class=\"btn   btn-outline-light\">\r\n");
      out.write("					<i class=\"fa-solid fa-right-to-bracket\"></i> Login\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- jumbotron ends here -->\r\n");
      out.write("<br>\r\n");
      out.write("<!--cards starts here  -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--1st row starts here  -->\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-4 mb-2\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"card text-center\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-4 mb-2\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"card text-center\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div><div class=\"col-md-4 mb-2\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"card text-center\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--1st row ends here  -->\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<!--2nd row ends here  -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-4 mb-2 \">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"card text-center\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-4 mb-2\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"card text-center\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div><div class=\"col-md-4 mb-2\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"card text-center\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">Card title</h5>\r\n");
      out.write("    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--2nd row ends here  -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- cards end here -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- jquery cdn -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.4.min.js\"\r\n");
      out.write("		integrity=\"sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=\"\r\n");
      out.write("		crossorigin=\"anonymous\">\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("	<!-- js  -->\r\n");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"js/myjs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}