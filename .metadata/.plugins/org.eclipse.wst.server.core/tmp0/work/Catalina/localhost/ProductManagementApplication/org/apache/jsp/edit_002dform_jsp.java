/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-03-23 15:29:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Edit and Save Form</title>\r\n");
      out.write("<!-- BootStrap CDN link to Get the Support of Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.0/dist/css/bootstrap.min.css\">\r\n");
      out.write("<!--  This is Java Script validation code location -->\r\n");
      out.write("<script src=\"formvalidation.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container mt-5 text-center\">\r\n");
      out.write("<h2 class=\"text-center font-italic mb-2\">Edit & Save Product Data</h2>\r\n");
      out.write("<form method=\"post\" action=\"./UpdateProductServlet\" enctype=\"multipart/form-data\" onsubmit=\"return validateForm()\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proId\">Product ID: </label>\r\n");
      out.write("<input type=\"text\" class=\"form-control-sm\" id=\"proId\" name=\"proId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingProduct.proId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proName\">Product Name: </label>\r\n");
      out.write("<input type=\"text\" class=\"form-control-sm\" id=\"proName\" name=\"proName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingProduct.proName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proPrice\">Product Price: </label>\r\n");
      out.write("<input type=\"number\" class=\"form-control-sm\" id=\"proPrice\" name=\"proPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingProduct.proPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proBrand\">Product Brand: </label>\r\n");
      out.write("<input type=\"text\" class=\"form-control-sm\" id=\"proBrand\" name=\"proBrand\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingProduct.proBrand}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proMadeIn\">Product MadeIn: </label>\r\n");
      out.write("<input type=\"text\" class=\"form-control-sm\" id=\"proMadeIn\" name=\"proMadeIn\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingProduct.proMadeIn}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proMfgDate\">Product Manufactured Date: </label>\r\n");
      out.write("<input type=\"date\" class=\"form-control-sm\" id=\"proMfgDate\" name=\"proMfgDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingProduct.proMfgDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proExpDate\">Product Expire Date: </label>\r\n");
      out.write("<input type=\"date\" class=\"form-control-sm\" id=\"proExpDate\" name=\"proExpDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingProduct.proExpDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Display the current product image -->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proImage\">Current Product Image: </label>\r\n");
      out.write("<img src=\"data:image/jpeg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Base64.getEncoder().encodeToString(existingProduct.proImage)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"current product Image\" style=\"max-width:100px; max-height:100px;\">\r\n");
      out.write("<input type=\"hidden\" id=\"existingImage\" name=\"existingImage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Base64.getEncoder().encodeToString(existingProduct.proImage)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"newProImage\">New Product Image: </label>\r\n");
      out.write("<input type=\"file\" class=\"form-control-file-sm\" id=\"newProImage\" name=\"newProImage\" accept=\"image/*\"/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proAudio\">Current Product Audio: </label>\r\n");
      out.write("<audio controls style=\"width: 200px;\"><source src=\"data:audio/mpeg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Base64.getEncoder().encodeToString(existingProduct.proAudio)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></audio>\r\n");
      out.write("<input type=\"hidden\" id=\"existingAudio\" name=\"existingAudio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Base64.getEncoder().encodeToString(existingProduct.proAudio)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"proVideo\">Current Product Video: </label>\r\n");
      out.write("<video width=\"160\" height=\"120\" controls><source src=\"data:video/mp4;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Base64.getEncoder().encodeToString(existingProduct.proVideo)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></video>\r\n");
      out.write("<input type=\"hidden\" id=\"existingVideo\" name=\"existingVideo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Base64.getEncoder().encodeToString(existingProduct.proVideo)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("</div>\r\n");
      out.write(" <div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"newProAudio\">New Product Audio: </label>\r\n");
      out.write("<input type=\"file\" class=\"form-control-file-sm\" id=\"newProAudio\" name=\"newProAudio\" accept=\"audio/*\"/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label class=\"font-italic font-weight-bold\" for=\"newProVideo\">New Product Video: </label>\r\n");
      out.write("<input type=\"file\" class=\"form-control-file-sm\" id=\"newProVideo\" name=\"newProVideo\" accept=\"video/*\"/>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<div>\r\n");
      out.write("<input type=\"submit\" class=\"btn btn-success\" value=\"Update Product\"/>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
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
