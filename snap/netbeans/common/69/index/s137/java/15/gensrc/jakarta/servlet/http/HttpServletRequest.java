package jakarta.servlet.http;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;

public interface HttpServletRequest extends ServletRequest {

    public static final String BASIC_AUTH = "BASIC";
    public static final String FORM_AUTH = "FORM";
    public static final String CLIENT_CERT_AUTH = "CLIENT_CERT";
    public static final String DIGEST_AUTH = "DIGEST";

    public String getAuthType();

    public Cookie[] getCookies();

    public long getDateHeader(String string);

    public String getHeader(String string);

    public Enumeration<String> getHeaders(String string);

    public Enumeration<String> getHeaderNames();

    public int getIntHeader(String string);

    public default HttpServletMapping getHttpServletMapping() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #1                  // class jakarta/servlet/http/HttpServletRequest$1
         * 3: dup
         * 4: aload_0
         * 5: invokespecial #2                  // Method jakarta/servlet/http/HttpServletRequest$1."<init>":(Ljakarta/servlet/http/HttpServletRequest;)V
         * 8: areturn
         *  */
        // </editor-fold>
    }

    public String getMethod();

    public String getPathInfo();

    public String getPathTranslated();

    public default PushBuilder newPushBuilder() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aconst_null
         * 1: areturn
         *  */
        // </editor-fold>
    }

    public String getContextPath();

    public String getQueryString();

    public String getRemoteUser();

    public boolean isUserInRole(String string);

    public Principal getUserPrincipal();

    public String getRequestedSessionId();

    public String getRequestURI();

    public StringBuffer getRequestURL();

    public String getServletPath();

    public HttpSession getSession(boolean bln);

    public HttpSession getSession();

    public String changeSessionId();

    public boolean isRequestedSessionIdValid();

    public boolean isRequestedSessionIdFromCookie();

    public boolean isRequestedSessionIdFromURL();

    @Deprecated
    public boolean isRequestedSessionIdFromUrl();

    public boolean authenticate(HttpServletResponse hsr) throws IOException, ServletException;

    public void login(String string, String string1) throws ServletException;

    public void logout() throws ServletException;

    public Collection<Part> getParts() throws IOException, ServletException;

    public Part getPart(String string) throws IOException, ServletException;

    public <T extends HttpUpgradeHandler> T upgrade(Class<T> type) throws IOException, ServletException;

    public default Map<String, String> getTrailerFields() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #3                  // Method java/util/Collections.emptyMap:()Ljava/util/Map;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public default boolean isTrailerFieldsReady() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: ireturn
         *  */
        // </editor-fold>
    }
}
