package jakarta.servlet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;

public abstract class GenericServlet implements Servlet, ServletConfig, Serializable {

    private static final long serialVersionUID = 1L;
    private transient ServletConfig config;

    public GenericServlet() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public void destroy() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    public String getInitParameter(String name) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #2                  // Method getServletConfig:()Ljakarta/servlet/ServletConfig;
         * 4: aload_1
         * 5: invokeinterface #3,  2            // InterfaceMethod jakarta/servlet/ServletConfig.getInitParameter:(Ljava/lang/String;)Ljava/lang/String;
         * 10: areturn
         *  */
        // </editor-fold>
    }

    public Enumeration<String> getInitParameterNames() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #2                  // Method getServletConfig:()Ljakarta/servlet/ServletConfig;
         * 4: invokeinterface #4,  1            // InterfaceMethod jakarta/servlet/ServletConfig.getInitParameterNames:()Ljava/util/Enumeration;
         * 9: areturn
         *  */
        // </editor-fold>
    }

    public ServletConfig getServletConfig() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #5                  // Field config:Ljakarta/servlet/ServletConfig;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public ServletContext getServletContext() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #2                  // Method getServletConfig:()Ljakarta/servlet/ServletConfig;
         * 4: invokeinterface #6,  1            // InterfaceMethod jakarta/servlet/ServletConfig.getServletContext:()Ljakarta/servlet/ServletContext;
         * 9: areturn
         *  */
        // </editor-fold>
    }

    public String getServletInfo() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           #7                  // String
         * 2: areturn
         *  */
        // </editor-fold>
    }

    public void init(ServletConfig config) throws ServletException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: putfield      #5                  // Field config:Ljakarta/servlet/ServletConfig;
         * 5: aload_0
         * 6: invokevirtual #8                  // Method init:()V
         * 9: return
         *  */
        // </editor-fold>
    }

    public void init() throws ServletException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    public void log(String message) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #9                  // Method getServletContext:()Ljakarta/servlet/ServletContext;
         * 4: new           #10                 // class java/lang/StringBuilder
         * 7: dup
         * 8: invokespecial #11                 // Method java/lang/StringBuilder."<init>":()V
         * 11: aload_0
         * 12: invokevirtual #12                 // Method getServletName:()Ljava/lang/String;
         * 15: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 18: ldc           #14                 // String :
         * 20: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 23: aload_1
         * 24: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 27: invokevirtual #15                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 30: invokeinterface #16,  2           // InterfaceMethod jakarta/servlet/ServletContext.log:(Ljava/lang/String;)V
         * 35: return
         *  */
        // </editor-fold>
    }

    public void log(String message, Throwable t) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #9                  // Method getServletContext:()Ljakarta/servlet/ServletContext;
         * 4: new           #10                 // class java/lang/StringBuilder
         * 7: dup
         * 8: invokespecial #11                 // Method java/lang/StringBuilder."<init>":()V
         * 11: aload_0
         * 12: invokevirtual #12                 // Method getServletName:()Ljava/lang/String;
         * 15: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 18: ldc           #14                 // String :
         * 20: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 23: aload_1
         * 24: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 27: invokevirtual #15                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 30: aload_2
         * 31: invokeinterface #17,  3           // InterfaceMethod jakarta/servlet/ServletContext.log:(Ljava/lang/String;Ljava/lang/Throwable;)V
         * 36: return
         *  */
        // </editor-fold>
    }

    public abstract void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException;

    public String getServletName() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #5                  // Field config:Ljakarta/servlet/ServletConfig;
         * 4: invokeinterface #18,  1           // InterfaceMethod jakarta/servlet/ServletConfig.getServletName:()Ljava/lang/String;
         * 9: areturn
         *  */
        // </editor-fold>
    }
}
