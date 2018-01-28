package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.SaveSelectedCriteria;
import com.model.Languages;

public final class RegistrationView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                SaveSelectedCriteria defaultLanguage = new SaveSelectedCriteria();

                String englishAsDefaultLang;
                String spanishAsDefaultLang;
                String portugueseAsDefaultLang;

            
 Languages lang = new Languages();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Add new contact</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("        <!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->\n");
      out.write("        <!--[if lte IE 9]><link rel=\"stylesheet\" href=\"assets/css/ie9.css\" /><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                if (request.getParameter("lang") == null) {
                    defaultLanguage.setLanguage(defaultLanguage.getLanguage());
                } else if (request.getParameter("lang").equals("English")) {
                    defaultLanguage.setLanguage("English");
                } else if (request.getParameter("lang").equals("Spanish")) {
                    defaultLanguage.setLanguage("Spanish");
                } else {
                    defaultLanguage.setLanguage("Portuguese");
                }

                session.setAttribute("lang", defaultLanguage);
                SaveSelectedCriteria language = (SaveSelectedCriteria) session.getAttribute("lang");

                if (language.getLanguage().equals("English")) {
                    englishAsDefaultLang = "selected";
                    spanishAsDefaultLang = "";
                    portugueseAsDefaultLang = "";
                } else if (language.getLanguage().equals("Spanish")) {
                    englishAsDefaultLang = "";
                    spanishAsDefaultLang = "selected";
                    portugueseAsDefaultLang = "";
                } else if (language.getLanguage().equals("Portuguese")) {
                    englishAsDefaultLang = "";
                    spanishAsDefaultLang = "";
                    portugueseAsDefaultLang = "selected";
                }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                if (language.getLanguage().equals("English")) {

                    lang.setChoiceYourMethodText_En();
                    lang.setName_En();
                    lang.setEmail_En();
                    lang.setState_En();
                    lang.setCity_En();
                    lang.setJob_En();
                    lang.setAge_En();
                    lang.setSearchButton_En();
                    lang.setRegistrationButton_En();
                    lang.setAddNewContactlinedText_En();
                    lang.setRegistrationTitle_En();
                    lang.setAccessYourContact_En();
                    lang.setContactListTitle_En();
                    lang.setMenuText_En();

                } else if (language.getLanguage().equals("Spanish")) {

                    lang.setChoiceYourMethodText_Span();
                    lang.setName_Span();
                    lang.setEmail_Span();
                    lang.setState_Span();
                    lang.setCity_Span();
                    lang.setJob_Span();
                    lang.setAge_Span();
                    lang.setSearchButton_Span();
                    lang.setRegistrationButton_Span();
                    lang.setAddNewContactlinedText_Span();
                    lang.setRegistrationTitle_Span();
                    lang.setAccessYourContact_Span();
                    lang.setContactListTitle_Span();
                    lang.setMenuText_Span();

                } else {

                    lang.setChoiceYourMethodText_Port();
                    lang.setName_Port();
                    lang.setEmail_Port();
                    lang.setState_Port();
                    lang.setCity_Port();
                    lang.setJob_Port();
                    lang.setAge_Port();
                    lang.setSearchButton_Port();
                    lang.setRegistrationButton_Port();
                    lang.setAddNewContactlinedText_Port();
                    lang.setRegistrationTitle_Port();
                    lang.setAccessYourContact_Port();
                    lang.setContactListTitle_Port();
                    lang.setMenuText_Port();
                }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Main -->\n");
      out.write("            <article id=\"main\">\n");
      out.write("                <header>\n");
      out.write("                    <h2>");
      out.print( lang.getRegistrationTitle());
      out.write("</h2>\n");
      out.write("                </header>\n");
      out.write("                <section class=\"wrapper style5\">\n");
      out.write("                    <div class=\"inner\">\n");
      out.write("\n");
      out.write("                        <!-- Header -->\n");
      out.write("                        <header id=\"header\">\n");
      out.write("                            <h1><form action=\"RegistrationView.jsp\" method=\"POST\">\n");
      out.write("                                    <select name=\"lang\" onchange=\"this.form.submit()\">\n");
      out.write("                                        <option value=\"English\" ");
      out.print( englishAsDefaultLang);
      out.write(">English</option>\n");
      out.write("                                        <option value=\"Spanish\" ");
      out.print( spanishAsDefaultLang);
      out.write(">Spanish</option>\n");
      out.write("                                        <option value=\"Portuguese\" ");
      out.print( portugueseAsDefaultLang);
      out.write(">Portuguese</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </form></h1>\n");
      out.write("                            <nav id=\"nav\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"special\">\n");
      out.write("                                        <a href=\"#menu\" class=\"menuToggle\"><span>");
      out.print( lang.getMenuText());
      out.write("</span></a>\n");
      out.write("                                        <div id=\"menu\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li><a href=\"ContactManager\">");
      out.print( lang.getAccessYourContact());
      out.write("</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form action=\"Registration\" method=\"POST\">\n");
      out.write("                            ");
      out.print( lang.getName());
      out.write("<input type=\"text\" name=\"name\">\n");
      out.write("                            ");
      out.print( lang.getEmail());
      out.write("<input type=\"text\" name=\"email\"><BR>\n");
      out.write("                            ");
      out.print( lang.getAge());
      out.write("<input type=\"text\" name=\"age\">\n");
      out.write("                            ");
      out.print( lang.getState());
      out.write("<input type=\"text\" name=\"state\"><BR>\n");
      out.write("                            ");
      out.print( lang.getCity());
      out.write("<input type=\"text\" name=\"city\">\n");
      out.write("                            ");
      out.print( lang.getJob());
      out.write("<input type=\"text\" name=\"job\"><BR>\n");
      out.write("                            <button type=\"submit\"> ");
      out.print( lang.getRegistrationButton());
      out.write(" </button>\n");
      out.write("                        </form><BR>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </article>\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer id=\"footer\">\n");
      out.write("\n");
      out.write("                <ul class=\"copyright\">\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Scripts -->\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.scrollex.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.scrolly.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/skel.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/util.js\"></script>\n");
      out.write("        <!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
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
