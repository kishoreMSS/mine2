package jakarta.servlet.http;

import jakarta.servlet.AsyncEvent;
import jakarta.servlet.AsyncListener;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.WriteListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

public abstract class HttpServlet extends GenericServlet {

    private static class NoBodyAsyncContextListener implements AsyncListener {

        private final NoBodyResponse noBodyResponse;

        public NoBodyAsyncContextListener(NoBodyResponse noBodyResponse) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      #2                  // Field noBodyResponse:Ljakarta/servlet/http/HttpServlet$NoBodyResponse;
             * 9: return
             *  */
            // </editor-fold>
        }

        public void onComplete(AsyncEvent event) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #2                  // Field noBodyResponse:Ljakarta/servlet/http/HttpServlet$NoBodyResponse;
             * 4: invokestatic  #3                  // Method jakarta/servlet/http/HttpServlet$NoBodyResponse.access$100:(Ljakarta/servlet/http/HttpServlet$NoBodyResponse;)V
             * 7: return
             *  */
            // </editor-fold>
        }

        public void onTimeout(AsyncEvent event) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: return
             *  */
            // </editor-fold>
        }

        public void onError(AsyncEvent event) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: return
             *  */
            // </editor-fold>
        }

        public void onStartAsync(AsyncEvent event) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: return
             *  */
            // </editor-fold>
        }
    }

    private static class NoBodyPrintWriter extends PrintWriter {

        private final NoBodyOutputStream out;
        private final String encoding;
        private PrintWriter pw;

        public NoBodyPrintWriter(NoBodyOutputStream out, String encoding) throws UnsupportedEncodingException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokespecial #2                  // Method java/io/PrintWriter."<init>":(Ljava/io/OutputStream;)V
             * 5: aload_0
             * 6: aload_1
             * 7: putfield      #3                  // Field out:Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;
             * 10: aload_0
             * 11: aload_2
             * 12: putfield      #4                  // Field encoding:Ljava/lang/String;
             * 15: new           #5                  // class java/io/OutputStreamWriter
             * 18: dup
             * 19: aload_1
             * 20: aload_2
             * 21: invokespecial #6                  // Method java/io/OutputStreamWriter."<init>":(Ljava/io/OutputStream;Ljava/lang/String;)V
             * 24: astore_3
             * 25: aload_0
             * 26: new           #7                  // class java/io/PrintWriter
             * 29: dup
             * 30: aload_3
             * 31: invokespecial #8                  // Method java/io/PrintWriter."<init>":(Ljava/io/Writer;)V
             * 34: putfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 37: return
             *  */
            // </editor-fold>
        }

        private void resetBuffer() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #3                  // Field out:Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;
             * 4: invokestatic  #10                 // Method jakarta/servlet/http/HttpServlet$NoBodyOutputStream.access$400:(Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;)V
             * 7: aconst_null
             * 8: astore_1
             * 9: new           #5                  // class java/io/OutputStreamWriter
             * 12: dup
             * 13: aload_0
             * 14: getfield      #3                  // Field out:Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;
             * 17: aload_0
             * 18: getfield      #4                  // Field encoding:Ljava/lang/String;
             * 21: invokespecial #6                  // Method java/io/OutputStreamWriter."<init>":(Ljava/io/OutputStream;Ljava/lang/String;)V
             * 24: astore_1
             * 25: goto          29
             * 28: astore_2
             * 29: aload_0
             * 30: new           #7                  // class java/io/PrintWriter
             * 33: dup
             * 34: aload_1
             * 35: invokespecial #8                  // Method java/io/PrintWriter."<init>":(Ljava/io/Writer;)V
             * 38: putfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 41: return
             * Exception table:
             * from    to  target type
             * 9    25    28   Class java/io/UnsupportedEncodingException
             *  */
            // </editor-fold>
        }

        public void flush() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: invokevirtual #12                 // Method java/io/PrintWriter.flush:()V
             * 7: return
             *  */
            // </editor-fold>
        }

        public void close() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: invokevirtual #13                 // Method java/io/PrintWriter.close:()V
             * 7: return
             *  */
            // </editor-fold>
        }

        public boolean checkError() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: invokevirtual #14                 // Method java/io/PrintWriter.checkError:()Z
             * 7: ireturn
             *  */
            // </editor-fold>
        }

        public void write(int c) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: iload_1
             * 5: invokevirtual #15                 // Method java/io/PrintWriter.write:(I)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void write(char[] buf, int off, int len) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: iload_2
             * 6: iload_3
             * 7: invokevirtual #16                 // Method java/io/PrintWriter.write:([CII)V
             * 10: return
             *  */
            // </editor-fold>
        }

        public void write(char[] buf) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: invokevirtual #17                 // Method java/io/PrintWriter.write:([C)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void write(String s, int off, int len) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: iload_2
             * 6: iload_3
             * 7: invokevirtual #18                 // Method java/io/PrintWriter.write:(Ljava/lang/String;II)V
             * 10: return
             *  */
            // </editor-fold>
        }

        public void write(String s) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: invokevirtual #19                 // Method java/io/PrintWriter.write:(Ljava/lang/String;)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(boolean b) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: iload_1
             * 5: invokevirtual #20                 // Method java/io/PrintWriter.print:(Z)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(char c) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: iload_1
             * 5: invokevirtual #21                 // Method java/io/PrintWriter.print:(C)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(int i) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: iload_1
             * 5: invokevirtual #22                 // Method java/io/PrintWriter.print:(I)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(long l) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: lload_1
             * 5: invokevirtual #23                 // Method java/io/PrintWriter.print:(J)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(float f) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: fload_1
             * 5: invokevirtual #24                 // Method java/io/PrintWriter.print:(F)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(double d) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: dload_1
             * 5: invokevirtual #25                 // Method java/io/PrintWriter.print:(D)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(char[] s) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: invokevirtual #26                 // Method java/io/PrintWriter.print:([C)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(String s) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: invokevirtual #27                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void print(Object obj) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: invokevirtual #28                 // Method java/io/PrintWriter.print:(Ljava/lang/Object;)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: invokevirtual #29                 // Method java/io/PrintWriter.println:()V
             * 7: return
             *  */
            // </editor-fold>
        }

        public void println(boolean x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: iload_1
             * 5: invokevirtual #30                 // Method java/io/PrintWriter.println:(Z)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println(char x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: iload_1
             * 5: invokevirtual #31                 // Method java/io/PrintWriter.println:(C)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println(int x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: iload_1
             * 5: invokevirtual #32                 // Method java/io/PrintWriter.println:(I)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println(long x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: lload_1
             * 5: invokevirtual #33                 // Method java/io/PrintWriter.println:(J)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println(float x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: fload_1
             * 5: invokevirtual #34                 // Method java/io/PrintWriter.println:(F)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println(double x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: dload_1
             * 5: invokevirtual #35                 // Method java/io/PrintWriter.println:(D)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println(char[] x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: invokevirtual #36                 // Method java/io/PrintWriter.println:([C)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println(String x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: invokevirtual #37                 // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public void println(Object x) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field pw:Ljava/io/PrintWriter;
             * 4: aload_1
             * 5: invokevirtual #38                 // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
             * 8: return
             *  */
            // </editor-fold>
        }
    }

    private static class NoBodyOutputStream extends ServletOutputStream {

        private static final String LSTRING_FILE = "jakarta.servlet.http.LocalStrings";
        private static final ResourceBundle lStrings;
        private final NoBodyResponse response;
        private boolean flushed;
        private long writtenByteCount;

        private NoBodyOutputStream(NoBodyResponse response) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #4                  // Method jakarta/servlet/ServletOutputStream."<init>":()V
             * 4: aload_0
             * 5: iconst_0
             * 6: putfield      #5                  // Field flushed:Z
             * 9: aload_0
             * 10: lconst_0
             * 11: putfield      #6                  // Field writtenByteCount:J
             * 14: aload_0
             * 15: aload_1
             * 16: putfield      #7                  // Field response:Ljakarta/servlet/http/HttpServlet$NoBodyResponse;
             * 19: return
             *  */
            // </editor-fold>
        }

        private long getWrittenByteCount() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #6                  // Field writtenByteCount:J
             * 4: lreturn
             *  */
            // </editor-fold>
        }

        public void write(int b) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: dup
             * 2: getfield      #6                  // Field writtenByteCount:J
             * 5: lconst_1
             * 6: ladd
             * 7: putfield      #6                  // Field writtenByteCount:J
             * 10: aload_0
             * 11: invokespecial #8                  // Method checkCommit:()V
             * 14: return
             *  */
            // </editor-fold>
        }

        public void write(byte[] buf, int offset, int len) throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     20
             * 4: new           #9                  // class java/lang/NullPointerException
             * 7: dup
             * 8: getstatic     #10                 // Field lStrings:Ljava/util/ResourceBundle;
             * 11: ldc           #11                 // String err.io.nullArray
             * 13: invokevirtual #12                 // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
             * 16: invokespecial #13                 // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
             * 19: athrow
             * 20: iload_2
             * 21: iflt          36
             * 24: iload_3
             * 25: iflt          36
             * 28: iload_2
             * 29: iload_3
             * 30: iadd
             * 31: aload_1
             * 32: arraylength
             * 33: if_icmple     96
             * 36: getstatic     #10                 // Field lStrings:Ljava/util/ResourceBundle;
             * 39: ldc           #14                 // String err.io.indexOutOfBounds
             * 41: invokevirtual #12                 // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
             * 44: astore        4
             * 46: iconst_3
             * 47: anewarray     #15                 // class java/lang/Object
             * 50: astore        5
             * 52: aload         5
             * 54: iconst_0
             * 55: iload_2
             * 56: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
             * 59: aastore
             * 60: aload         5
             * 62: iconst_1
             * 63: iload_3
             * 64: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
             * 67: aastore
             * 68: aload         5
             * 70: iconst_2
             * 71: aload_1
             * 72: arraylength
             * 73: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
             * 76: aastore
             * 77: aload         4
             * 79: aload         5
             * 81: invokestatic  #17                 // Method java/text/MessageFormat.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
             * 84: astore        4
             * 86: new           #18                 // class java/lang/IndexOutOfBoundsException
             * 89: dup
             * 90: aload         4
             * 92: invokespecial #19                 // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
             * 95: athrow
             * 96: aload_0
             * 97: dup
             * 98: getfield      #6                  // Field writtenByteCount:J
             * 101: iload_3
             * 102: i2l
             * 103: ladd
             * 104: putfield      #6                  // Field writtenByteCount:J
             * 107: aload_0
             * 108: invokespecial #8                  // Method checkCommit:()V
             * 111: return
             *  */
            // </editor-fold>
        }

        public boolean isReady() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_1
             * 1: ireturn
             *  */
            // </editor-fold>
        }

        public void setWriteListener(WriteListener listener) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #7                  // Field response:Ljakarta/servlet/http/HttpServlet$NoBodyResponse;
             * 4: invokestatic  #20                 // Method jakarta/servlet/http/HttpServlet$NoBodyResponse.access$600:(Ljakarta/servlet/http/HttpServlet$NoBodyResponse;)Ljakarta/servlet/ServletOutputStream;
             * 7: aload_1
             * 8: invokevirtual #21                 // Method jakarta/servlet/ServletOutputStream.setWriteListener:(Ljakarta/servlet/WriteListener;)V
             * 11: return
             *  */
            // </editor-fold>
        }

        private void checkCommit() throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #5                  // Field flushed:Z
             * 4: ifne          35
             * 7: aload_0
             * 8: getfield      #6                  // Field writtenByteCount:J
             * 11: aload_0
             * 12: getfield      #7                  // Field response:Ljakarta/servlet/http/HttpServlet$NoBodyResponse;
             * 15: invokevirtual #22                 // Method jakarta/servlet/http/HttpServlet$NoBodyResponse.getBufferSize:()I
             * 18: i2l
             * 19: lcmp
             * 20: ifle          35
             * 23: aload_0
             * 24: getfield      #7                  // Field response:Ljakarta/servlet/http/HttpServlet$NoBodyResponse;
             * 27: invokevirtual #23                 // Method jakarta/servlet/http/HttpServlet$NoBodyResponse.flushBuffer:()V
             * 30: aload_0
             * 31: iconst_1
             * 32: putfield      #5                  // Field flushed:Z
             * 35: return
             *  */
            // </editor-fold>
        }

        private void resetBuffer() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #5                  // Field flushed:Z
             * 4: ifeq          23
             * 7: new           #24                 // class java/lang/IllegalStateException
             * 10: dup
             * 11: getstatic     #10                 // Field lStrings:Ljava/util/ResourceBundle;
             * 14: ldc           #25                 // String err.state.commit
             * 16: invokevirtual #12                 // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
             * 19: invokespecial #26                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
             * 22: athrow
             * 23: aload_0
             * 24: lconst_0
             * 25: putfield      #6                  // Field writtenByteCount:J
             * 28: return
             *  */
            // </editor-fold>
        }
    }

    private static class NoBodyResponse extends HttpServletResponseWrapper {

        private final NoBodyOutputStream noBodyOutputStream;
        private ServletOutputStream originalOutputStream;
        private NoBodyPrintWriter noBodyWriter;
        private boolean didSetContentLength;

        private NoBodyResponse(HttpServletResponse r) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokespecial #4                  // Method jakarta/servlet/http/HttpServletResponseWrapper."<init>":(Ljakarta/servlet/http/HttpServletResponse;)V
             * 5: aload_0
             * 6: new           #5                  // class jakarta/servlet/http/HttpServlet$NoBodyOutputStream
             * 9: dup
             * 10: aload_0
             * 11: aconst_null
             * 12: invokespecial #6                  // Method jakarta/servlet/http/HttpServlet$NoBodyOutputStream."<init>":(Ljakarta/servlet/http/HttpServlet$NoBodyResponse;Ljakarta/servlet/http/HttpServlet$1;)V
             * 15: putfield      #7                  // Field noBodyOutputStream:Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;
             * 18: return
             *  */
            // </editor-fold>
        }

        private void setContentLength() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #8                  // Field didSetContentLength:Z
             * 4: ifne          32
             * 7: aload_0
             * 8: getfield      #9                  // Field noBodyWriter:Ljakarta/servlet/http/HttpServlet$NoBodyPrintWriter;
             * 11: ifnull        21
             * 14: aload_0
             * 15: getfield      #9                  // Field noBodyWriter:Ljakarta/servlet/http/HttpServlet$NoBodyPrintWriter;
             * 18: invokevirtual #10                 // Method jakarta/servlet/http/HttpServlet$NoBodyPrintWriter.flush:()V
             * 21: aload_0
             * 22: aload_0
             * 23: getfield      #7                  // Field noBodyOutputStream:Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;
             * 26: invokestatic  #11                 // Method jakarta/servlet/http/HttpServlet$NoBodyOutputStream.access$300:(Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;)J
             * 29: invokespecial #12                 // Method jakarta/servlet/http/HttpServletResponseWrapper.setContentLengthLong:(J)V
             * 32: return
             *  */
            // </editor-fold>
        }

        public void setContentLength(int len) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: iload_1
             * 2: invokespecial #13                 // Method jakarta/servlet/http/HttpServletResponseWrapper.setContentLength:(I)V
             * 5: aload_0
             * 6: iconst_1
             * 7: putfield      #8                  // Field didSetContentLength:Z
             * 10: return
             *  */
            // </editor-fold>
        }

        public void setContentLengthLong(long len) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: lload_1
             * 2: invokespecial #12                 // Method jakarta/servlet/http/HttpServletResponseWrapper.setContentLengthLong:(J)V
             * 5: aload_0
             * 6: iconst_1
             * 7: putfield      #8                  // Field didSetContentLength:Z
             * 10: return
             *  */
            // </editor-fold>
        }

        public void setHeader(String name, String value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: aload_2
             * 3: invokespecial #14                 // Method jakarta/servlet/http/HttpServletResponseWrapper.setHeader:(Ljava/lang/String;Ljava/lang/String;)V
             * 6: aload_0
             * 7: aload_1
             * 8: invokespecial #15                 // Method checkHeader:(Ljava/lang/String;)V
             * 11: return
             *  */
            // </editor-fold>
        }

        public void addHeader(String name, String value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: aload_2
             * 3: invokespecial #16                 // Method jakarta/servlet/http/HttpServletResponseWrapper.addHeader:(Ljava/lang/String;Ljava/lang/String;)V
             * 6: aload_0
             * 7: aload_1
             * 8: invokespecial #15                 // Method checkHeader:(Ljava/lang/String;)V
             * 11: return
             *  */
            // </editor-fold>
        }

        public void setIntHeader(String name, int value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: iload_2
             * 3: invokespecial #17                 // Method jakarta/servlet/http/HttpServletResponseWrapper.setIntHeader:(Ljava/lang/String;I)V
             * 6: aload_0
             * 7: aload_1
             * 8: invokespecial #15                 // Method checkHeader:(Ljava/lang/String;)V
             * 11: return
             *  */
            // </editor-fold>
        }

        public void addIntHeader(String name, int value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: iload_2
             * 3: invokespecial #18                 // Method jakarta/servlet/http/HttpServletResponseWrapper.addIntHeader:(Ljava/lang/String;I)V
             * 6: aload_0
             * 7: aload_1
             * 8: invokespecial #15                 // Method checkHeader:(Ljava/lang/String;)V
             * 11: return
             *  */
            // </editor-fold>
        }

        private void checkHeader(String name) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: ldc           #19                 // String content-length
             * 2: aload_1
             * 3: invokevirtual #20                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
             * 6: ifeq          14
             * 9: aload_0
             * 10: iconst_1
             * 11: putfield      #8                  // Field didSetContentLength:Z
             * 14: return
             *  */
            // </editor-fold>
        }

        public ServletOutputStream getOutputStream() throws IOException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_0
             * 2: invokevirtual #21                 // Method getResponse:()Ljakarta/servlet/ServletResponse;
             * 5: invokeinterface #22,  1           // InterfaceMethod jakarta/servlet/ServletResponse.getOutputStream:()Ljakarta/servlet/ServletOutputStream;
             * 10: putfield      #1                  // Field originalOutputStream:Ljakarta/servlet/ServletOutputStream;
             * 13: aload_0
             * 14: getfield      #7                  // Field noBodyOutputStream:Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;
             * 17: areturn
             *  */
            // </editor-fold>
        }

        public PrintWriter getWriter() throws UnsupportedEncodingException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #9                  // Field noBodyWriter:Ljakarta/servlet/http/HttpServlet$NoBodyPrintWriter;
             * 4: ifnonnull     26
             * 7: aload_0
             * 8: new           #23                 // class jakarta/servlet/http/HttpServlet$NoBodyPrintWriter
             * 11: dup
             * 12: aload_0
             * 13: getfield      #7                  // Field noBodyOutputStream:Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;
             * 16: aload_0
             * 17: invokevirtual #24                 // Method getCharacterEncoding:()Ljava/lang/String;
             * 20: invokespecial #25                 // Method jakarta/servlet/http/HttpServlet$NoBodyPrintWriter."<init>":(Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;Ljava/lang/String;)V
             * 23: putfield      #9                  // Field noBodyWriter:Ljakarta/servlet/http/HttpServlet$NoBodyPrintWriter;
             * 26: aload_0
             * 27: getfield      #9                  // Field noBodyWriter:Ljakarta/servlet/http/HttpServlet$NoBodyPrintWriter;
             * 30: areturn
             *  */
            // </editor-fold>
        }

        public void reset() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #26                 // Method jakarta/servlet/http/HttpServletResponseWrapper.reset:()V
             * 4: aload_0
             * 5: invokevirtual #27                 // Method resetBuffer:()V
             * 8: aload_0
             * 9: aconst_null
             * 10: putfield      #1                  // Field originalOutputStream:Ljakarta/servlet/ServletOutputStream;
             * 13: return
             *  */
            // </editor-fold>
        }

        public void resetBuffer() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #7                  // Field noBodyOutputStream:Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;
             * 4: invokestatic  #28                 // Method jakarta/servlet/http/HttpServlet$NoBodyOutputStream.access$400:(Ljakarta/servlet/http/HttpServlet$NoBodyOutputStream;)V
             * 7: aload_0
             * 8: getfield      #9                  // Field noBodyWriter:Ljakarta/servlet/http/HttpServlet$NoBodyPrintWriter;
             * 11: ifnull        21
             * 14: aload_0
             * 15: getfield      #9                  // Field noBodyWriter:Ljakarta/servlet/http/HttpServlet$NoBodyPrintWriter;
             * 18: invokestatic  #29                 // Method jakarta/servlet/http/HttpServlet$NoBodyPrintWriter.access$500:(Ljakarta/servlet/http/HttpServlet$NoBodyPrintWriter;)V
             * 21: return
             *  */
            // </editor-fold>
        }
    }

    private static class TomcatHack {

        private static final Class<?> REQUEST_FACADE_CLAZZ;
        private static final Method GET_ALLOW_TRACE;

        private TomcatHack() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }

        public static boolean getAllowTrace(HttpServletRequest req) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: getstatic     #2                  // Field REQUEST_FACADE_CLAZZ:Ljava/lang/Class;
             * 3: ifnull        44
             * 6: getstatic     #3                  // Field GET_ALLOW_TRACE:Ljava/lang/reflect/Method;
             * 9: ifnull        44
             * 12: getstatic     #2                  // Field REQUEST_FACADE_CLAZZ:Ljava/lang/Class;
             * 15: aload_0
             * 16: invokevirtual #4                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
             * 19: invokevirtual #5                  // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
             * 22: ifeq          44
             * 25: getstatic     #3                  // Field GET_ALLOW_TRACE:Ljava/lang/reflect/Method;
             * 28: aload_0
             * 29: aconst_null
             * 30: checkcast     #6                  // class "[Ljava/lang/Object;"
             * 33: invokevirtual #7                  // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
             * 36: checkcast     #8                  // class java/lang/Boolean
             * 39: invokevirtual #9                  // Method java/lang/Boolean.booleanValue:()Z
             * 42: ireturn
             * 43: astore_1
             * 44: iconst_1
             * 45: ireturn
             * Exception table:
             * from    to  target type
             * 25    42    43   Class java/lang/IllegalAccessException
             * 25    42    43   Class java/lang/IllegalArgumentException
             * 25    42    43   Class java/lang/reflect/InvocationTargetException
             *  */
            // </editor-fold>
        }
    }
    private static final long serialVersionUID = 1L;
    private static final String METHOD_DELETE = "DELETE";
    private static final String METHOD_HEAD = "HEAD";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_OPTIONS = "OPTIONS";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_PUT = "PUT";
    private static final String METHOD_TRACE = "TRACE";
    private static final String HEADER_IFMODSINCE = "If-Modified-Since";
    private static final String HEADER_LASTMOD = "Last-Modified";
    private static final String LSTRING_FILE = "jakarta.servlet.http.LocalStrings";
    private static final ResourceBundle lStrings;
    private final transient Object cachedAllowHeaderValueLock;
    private volatile String cachedAllowHeaderValue;

    public HttpServlet() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method jakarta/servlet/GenericServlet."<init>":()V
         * 4: aload_0
         * 5: new           #2                  // class java/lang/Object
         * 8: dup
         * 9: invokespecial #3                  // Method java/lang/Object."<init>":()V
         * 12: putfield      #4                  // Field cachedAllowHeaderValueLock:Ljava/lang/Object;
         * 15: aload_0
         * 16: aconst_null
         * 17: putfield      #5                  // Field cachedAllowHeaderValue:Ljava/lang/String;
         * 20: return
         *  */
        // </editor-fold>
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #6                  // Field lStrings:Ljava/util/ResourceBundle;
         * 3: ldc           #7                  // String http.method_get_not_supported
         * 5: invokevirtual #8                  // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 8: astore_3
         * 9: aload_0
         * 10: aload_1
         * 11: aload_2
         * 12: aload_3
         * 13: invokespecial #9                  // Method sendMethodNotAllowed:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljava/lang/String;)V
         * 16: return
         *  */
        // </editor-fold>
    }

    protected long getLastModified(HttpServletRequest req) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc2_w        #10                 // long -1l
         * 3: lreturn
         *  */
        // </editor-fold>
    }

    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #12                 // Field jakarta/servlet/DispatcherType.INCLUDE:Ljakarta/servlet/DispatcherType;
         * 3: aload_1
         * 4: invokeinterface #13,  1           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getDispatcherType:()Ljakarta/servlet/DispatcherType;
         * 9: invokevirtual #14                 // Method jakarta/servlet/DispatcherType.equals:(Ljava/lang/Object;)Z
         * 12: ifeq          24
         * 15: aload_0
         * 16: aload_1
         * 17: aload_2
         * 18: invokevirtual #15                 // Method doGet:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 21: goto          75
         * 24: new           #16                 // class jakarta/servlet/http/HttpServlet$NoBodyResponse
         * 27: dup
         * 28: aload_2
         * 29: aconst_null
         * 30: invokespecial #17                 // Method jakarta/servlet/http/HttpServlet$NoBodyResponse."<init>":(Ljakarta/servlet/http/HttpServletResponse;Ljakarta/servlet/http/HttpServlet$1;)V
         * 33: astore_3
         * 34: aload_0
         * 35: aload_1
         * 36: aload_3
         * 37: invokevirtual #15                 // Method doGet:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 40: aload_1
         * 41: invokeinterface #18,  1           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.isAsyncStarted:()Z
         * 46: ifeq          71
         * 49: aload_1
         * 50: invokeinterface #19,  1           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getAsyncContext:()Ljakarta/servlet/AsyncContext;
         * 55: new           #20                 // class jakarta/servlet/http/HttpServlet$NoBodyAsyncContextListener
         * 58: dup
         * 59: aload_3
         * 60: invokespecial #21                 // Method jakarta/servlet/http/HttpServlet$NoBodyAsyncContextListener."<init>":(Ljakarta/servlet/http/HttpServlet$NoBodyResponse;)V
         * 63: invokeinterface #22,  2           // InterfaceMethod jakarta/servlet/AsyncContext.addListener:(Ljakarta/servlet/AsyncListener;)V
         * 68: goto          75
         * 71: aload_3
         * 72: invokestatic  #23                 // Method jakarta/servlet/http/HttpServlet$NoBodyResponse.access$100:(Ljakarta/servlet/http/HttpServlet$NoBodyResponse;)V
         * 75: return
         *  */
        // </editor-fold>
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #6                  // Field lStrings:Ljava/util/ResourceBundle;
         * 3: ldc           #24                 // String http.method_post_not_supported
         * 5: invokevirtual #8                  // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 8: astore_3
         * 9: aload_0
         * 10: aload_1
         * 11: aload_2
         * 12: aload_3
         * 13: invokespecial #9                  // Method sendMethodNotAllowed:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljava/lang/String;)V
         * 16: return
         *  */
        // </editor-fold>
    }

    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #6                  // Field lStrings:Ljava/util/ResourceBundle;
         * 3: ldc           #25                 // String http.method_put_not_supported
         * 5: invokevirtual #8                  // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 8: astore_3
         * 9: aload_0
         * 10: aload_1
         * 11: aload_2
         * 12: aload_3
         * 13: invokespecial #9                  // Method sendMethodNotAllowed:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljava/lang/String;)V
         * 16: return
         *  */
        // </editor-fold>
    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #6                  // Field lStrings:Ljava/util/ResourceBundle;
         * 3: ldc           #26                 // String http.method_delete_not_supported
         * 5: invokevirtual #8                  // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 8: astore_3
         * 9: aload_0
         * 10: aload_1
         * 11: aload_2
         * 12: aload_3
         * 13: invokespecial #9                  // Method sendMethodNotAllowed:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljava/lang/String;)V
         * 16: return
         *  */
        // </editor-fold>
    }

    private void sendMethodNotAllowed(HttpServletRequest req, HttpServletResponse resp, String msg) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokeinterface #27,  1           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getProtocol:()Ljava/lang/String;
         * 6: astore        4
         * 8: aload         4
         * 10: invokevirtual #28                 // Method java/lang/String.length:()I
         * 13: ifeq          36
         * 16: aload         4
         * 18: ldc           #29                 // String 0.9
         * 20: invokevirtual #30                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
         * 23: ifne          36
         * 26: aload         4
         * 28: ldc           #31                 // String 1.0
         * 30: invokevirtual #30                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
         * 33: ifeq          49
         * 36: aload_2
         * 37: sipush        400
         * 40: aload_3
         * 41: invokeinterface #33,  3           // InterfaceMethod jakarta/servlet/http/HttpServletResponse.sendError:(ILjava/lang/String;)V
         * 46: goto          59
         * 49: aload_2
         * 50: sipush        405
         * 53: aload_3
         * 54: invokeinterface #33,  3           // InterfaceMethod jakarta/servlet/http/HttpServletResponse.sendError:(ILjava/lang/String;)V
         * 59: return
         *  */
        // </editor-fold>
    }

    private String getCachedAllowHeaderValue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #5                  // Field cachedAllowHeaderValue:Ljava/lang/String;
         * 4: ifnonnull     390
         * 7: aload_0
         * 8: getfield      #4                  // Field cachedAllowHeaderValueLock:Ljava/lang/Object;
         * 11: dup
         * 12: astore_1
         * 13: monitorenter
         * 14: aload_0
         * 15: getfield      #5                  // Field cachedAllowHeaderValue:Ljava/lang/String;
         * 18: ifnonnull     378
         * 21: aload_0
         * 22: invokevirtual #34                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         * 25: invokestatic  #35                 // Method getAllDeclaredMethods:(Ljava/lang/Class;)[Ljava/lang/reflect/Method;
         * 28: astore_2
         * 29: iconst_0
         * 30: istore_3
         * 31: iconst_0
         * 32: istore        4
         * 34: iconst_0
         * 35: istore        5
         * 37: iconst_0
         * 38: istore        6
         * 40: iconst_0
         * 41: istore        7
         * 43: aload_2
         * 44: astore        8
         * 46: aload         8
         * 48: arraylength
         * 49: istore        9
         * 51: iconst_0
         * 52: istore        10
         * 54: iload         10
         * 56: iload         9
         * 58: if_icmpge     248
         * 61: aload         8
         * 63: iload         10
         * 65: aaload
         * 66: astore        11
         * 68: aload         11
         * 70: invokevirtual #36                 // Method java/lang/reflect/Method.getName:()Ljava/lang/String;
         * 73: astore        12
         * 75: iconst_m1
         * 76: istore        13
         * 78: aload         12
         * 80: invokevirtual #37                 // Method java/lang/String.hashCode:()I
         * 83: lookupswitch  { // 4
         * -1327047733: 140
         * -40588778: 172
         * 95730379: 124
         * 95739524: 156
         * default: 185
         * }
         * 124: aload         12
         * 126: ldc           #38                 // String doGet
         * 128: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 131: ifeq          185
         * 134: iconst_0
         * 135: istore        13
         * 137: goto          185
         * 140: aload         12
         * 142: ldc           #40                 // String doPost
         * 144: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 147: ifeq          185
         * 150: iconst_1
         * 151: istore        13
         * 153: goto          185
         * 156: aload         12
         * 158: ldc           #41                 // String doPut
         * 160: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 163: ifeq          185
         * 166: iconst_2
         * 167: istore        13
         * 169: goto          185
         * 172: aload         12
         * 174: ldc           #42                 // String doDelete
         * 176: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 179: ifeq          185
         * 182: iconst_3
         * 183: istore        13
         * 185: iload         13
         * 187: tableswitch   { // 0 to 3
         * 0: 216
         * 1: 224
         * 2: 230
         * 3: 236
         * default: 242
         * }
         * 216: iconst_1
         * 217: istore_3
         * 218: iconst_1
         * 219: istore        4
         * 221: goto          242
         * 224: iconst_1
         * 225: istore        5
         * 227: goto          242
         * 230: iconst_1
         * 231: istore        6
         * 233: goto          242
         * 236: iconst_1
         * 237: istore        7
         * 239: goto          242
         * 242: iinc          10, 1
         * 245: goto          54
         * 248: new           #43                 // class java/lang/StringBuilder
         * 251: dup
         * 252: invokespecial #44                 // Method java/lang/StringBuilder."<init>":()V
         * 255: astore        8
         * 257: iload_3
         * 258: ifeq          277
         * 261: aload         8
         * 263: ldc           #46                 // String GET
         * 265: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 268: pop
         * 269: aload         8
         * 271: ldc           #48                 // String ,
         * 273: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 276: pop
         * 277: iload         4
         * 279: ifeq          298
         * 282: aload         8
         * 284: ldc           #49                 // String HEAD
         * 286: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 289: pop
         * 290: aload         8
         * 292: ldc           #48                 // String ,
         * 294: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 297: pop
         * 298: iload         5
         * 300: ifeq          319
         * 303: aload         8
         * 305: ldc           #50                 // String POST
         * 307: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 310: pop
         * 311: aload         8
         * 313: ldc           #48                 // String ,
         * 315: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 318: pop
         * 319: iload         6
         * 321: ifeq          340
         * 324: aload         8
         * 326: ldc           #51                 // String PUT
         * 328: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 331: pop
         * 332: aload         8
         * 334: ldc           #48                 // String ,
         * 336: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 339: pop
         * 340: iload         7
         * 342: ifeq          361
         * 345: aload         8
         * 347: ldc           #52                 // String DELETE
         * 349: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 352: pop
         * 353: aload         8
         * 355: ldc           #48                 // String ,
         * 357: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 360: pop
         * 361: aload         8
         * 363: ldc           #53                 // String OPTIONS
         * 365: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 368: pop
         * 369: aload_0
         * 370: aload         8
         * 372: invokevirtual #54                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 375: putfield      #5                  // Field cachedAllowHeaderValue:Ljava/lang/String;
         * 378: aload_1
         * 379: monitorexit
         * 380: goto          390
         * 383: astore        14
         * 385: aload_1
         * 386: monitorexit
         * 387: aload         14
         * 389: athrow
         * 390: aload_0
         * 391: getfield      #5                  // Field cachedAllowHeaderValue:Ljava/lang/String;
         * 394: areturn
         * Exception table:
         * from    to  target type
         * 14   380   383   any
         * 383   387   383   any
         *  */
        // </editor-fold>
    }

    private static Method[] getAllDeclaredMethods(Class<?> c) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ldc           #45                 // class jakarta/servlet/http/HttpServlet
         * 3: invokevirtual #55                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 6: ifeq          11
         * 9: aconst_null
         * 10: areturn
         * 11: aload_0
         * 12: invokevirtual #56                 // Method java/lang/Class.getSuperclass:()Ljava/lang/Class;
         * 15: invokestatic  #35                 // Method getAllDeclaredMethods:(Ljava/lang/Class;)[Ljava/lang/reflect/Method;
         * 18: astore_1
         * 19: aload_0
         * 20: invokevirtual #57                 // Method java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
         * 23: astore_2
         * 24: aload_1
         * 25: ifnull        63
         * 28: aload_1
         * 29: arraylength
         * 30: ifle          63
         * 33: aload_1
         * 34: arraylength
         * 35: aload_2
         * 36: arraylength
         * 37: iadd
         * 38: anewarray     #58                 // class java/lang/reflect/Method
         * 41: astore_3
         * 42: aload_1
         * 43: iconst_0
         * 44: aload_3
         * 45: iconst_0
         * 46: aload_1
         * 47: arraylength
         * 48: invokestatic  #59                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 51: aload_2
         * 52: iconst_0
         * 53: aload_3
         * 54: aload_1
         * 55: arraylength
         * 56: aload_2
         * 57: arraylength
         * 58: invokestatic  #59                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 61: aload_3
         * 62: astore_2
         * 63: aload_2
         * 64: areturn
         *  */
        // </editor-fold>
    }

    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #60                 // Method getCachedAllowHeaderValue:()Ljava/lang/String;
         * 4: astore_3
         * 5: aload_1
         * 6: invokestatic  #61                 // Method jakarta/servlet/http/HttpServlet$TomcatHack.getAllowTrace:(Ljakarta/servlet/http/HttpServletRequest;)Z
         * 9: ifeq          50
         * 12: aload_3
         * 13: invokevirtual #28                 // Method java/lang/String.length:()I
         * 16: ifne          25
         * 19: ldc           #62                 // String TRACE
         * 21: astore_3
         * 22: goto          50
         * 25: new           #43                 // class java/lang/StringBuilder
         * 28: dup
         * 29: invokespecial #44                 // Method java/lang/StringBuilder."<init>":()V
         * 32: aload_3
         * 33: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 36: ldc           #48                 // String ,
         * 38: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 41: ldc           #62                 // String TRACE
         * 43: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 46: invokevirtual #54                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 49: astore_3
         * 50: aload_2
         * 51: ldc           #63                 // String Allow
         * 53: aload_3
         * 54: invokeinterface #64,  3           // InterfaceMethod jakarta/servlet/http/HttpServletResponse.setHeader:(Ljava/lang/String;Ljava/lang/String;)V
         * 59: return
         *  */
        // </editor-fold>
    }

    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           #65                 // String \r\n
         * 2: astore        4
         * 4: new           #43                 // class java/lang/StringBuilder
         * 7: dup
         * 8: ldc           #66                 // String TRACE
         * 10: invokespecial #67                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
         * 13: aload_1
         * 14: invokeinterface #68,  1           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getRequestURI:()Ljava/lang/String;
         * 19: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 22: ldc           #69                 // String
         * 24: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 27: aload_1
         * 28: invokeinterface #27,  1           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getProtocol:()Ljava/lang/String;
         * 33: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 36: astore        5
         * 38: aload_1
         * 39: invokeinterface #70,  1           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getHeaderNames:()Ljava/util/Enumeration;
         * 44: astore        6
         * 46: aload         6
         * 48: invokeinterface #71,  1           // InterfaceMethod java/util/Enumeration.hasMoreElements:()Z
         * 53: ifeq          100
         * 56: aload         6
         * 58: invokeinterface #72,  1           // InterfaceMethod java/util/Enumeration.nextElement:()Ljava/lang/Object;
         * 63: checkcast     #73                 // class java/lang/String
         * 66: astore        7
         * 68: aload         5
         * 70: aload         4
         * 72: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 75: aload         7
         * 77: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 80: ldc           #74                 // String :
         * 82: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 85: aload_1
         * 86: aload         7
         * 88: invokeinterface #75,  2           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getHeader:(Ljava/lang/String;)Ljava/lang/String;
         * 93: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 96: pop
         * 97: goto          46
         * 100: aload         5
         * 102: aload         4
         * 104: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 107: pop
         * 108: aload         5
         * 110: invokevirtual #76                 // Method java/lang/StringBuilder.length:()I
         * 113: istore_3
         * 114: aload_2
         * 115: ldc           #77                 // String message/http
         * 117: invokeinterface #78,  2           // InterfaceMethod jakarta/servlet/http/HttpServletResponse.setContentType:(Ljava/lang/String;)V
         * 122: aload_2
         * 123: iload_3
         * 124: invokeinterface #79,  2           // InterfaceMethod jakarta/servlet/http/HttpServletResponse.setContentLength:(I)V
         * 129: aload_2
         * 130: invokeinterface #80,  1           // InterfaceMethod jakarta/servlet/http/HttpServletResponse.getOutputStream:()Ljakarta/servlet/ServletOutputStream;
         * 135: astore        7
         * 137: aload         7
         * 139: aload         5
         * 141: invokevirtual #54                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 144: invokevirtual #81                 // Method jakarta/servlet/ServletOutputStream.print:(Ljava/lang/String;)V
         * 147: aload         7
         * 149: invokevirtual #82                 // Method jakarta/servlet/ServletOutputStream.close:()V
         * 152: return
         *  */
        // </editor-fold>
    }

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokeinterface #83,  1           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getMethod:()Ljava/lang/String;
         * 6: astore_3
         * 7: aload_3
         * 8: ldc           #46                 // String GET
         * 10: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 13: ifeq          105
         * 16: aload_0
         * 17: aload_1
         * 18: invokevirtual #84                 // Method getLastModified:(Ljakarta/servlet/http/HttpServletRequest;)J
         * 21: lstore        4
         * 23: lload         4
         * 25: ldc2_w        #10                 // long -1l
         * 28: lcmp
         * 29: ifne          41
         * 32: aload_0
         * 33: aload_1
         * 34: aload_2
         * 35: invokevirtual #15                 // Method doGet:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 38: goto          102
         * 41: aload_1
         * 42: ldc           #85                 // String If-Modified-Since
         * 44: invokeinterface #86,  2           // InterfaceMethod jakarta/servlet/http/HttpServletRequest.getDateHeader:(Ljava/lang/String;)J
         * 49: lstore        6
         * 51: goto          61
         * 54: astore        8
         * 56: ldc2_w        #10                 // long -1l
         * 59: lstore        6
         * 61: lload         6
         * 63: lload         4
         * 65: ldc2_w        #88                 // long 1000l
         * 68: ldiv
         * 69: ldc2_w        #88                 // long 1000l
         * 72: lmul
         * 73: lcmp
         * 74: ifge          93
         * 77: aload_0
         * 78: aload_2
         * 79: lload         4
         * 81: invokespecial #90                 // Method maybeSetLastModified:(Ljakarta/servlet/http/HttpServletResponse;J)V
         * 84: aload_0
         * 85: aload_1
         * 86: aload_2
         * 87: invokevirtual #15                 // Method doGet:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 90: goto          102
         * 93: aload_2
         * 94: sipush        304
         * 97: invokeinterface #91,  2           // InterfaceMethod jakarta/servlet/http/HttpServletResponse.setStatus:(I)V
         * 102: goto          268
         * 105: aload_3
         * 106: ldc           #49                 // String HEAD
         * 108: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 111: ifeq          137
         * 114: aload_0
         * 115: aload_1
         * 116: invokevirtual #84                 // Method getLastModified:(Ljakarta/servlet/http/HttpServletRequest;)J
         * 119: lstore        4
         * 121: aload_0
         * 122: aload_2
         * 123: lload         4
         * 125: invokespecial #90                 // Method maybeSetLastModified:(Ljakarta/servlet/http/HttpServletResponse;J)V
         * 128: aload_0
         * 129: aload_1
         * 130: aload_2
         * 131: invokevirtual #92                 // Method doHead:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 134: goto          268
         * 137: aload_3
         * 138: ldc           #50                 // String POST
         * 140: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 143: ifeq          155
         * 146: aload_0
         * 147: aload_1
         * 148: aload_2
         * 149: invokevirtual #93                 // Method doPost:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 152: goto          268
         * 155: aload_3
         * 156: ldc           #51                 // String PUT
         * 158: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 161: ifeq          173
         * 164: aload_0
         * 165: aload_1
         * 166: aload_2
         * 167: invokevirtual #94                 // Method doPut:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 170: goto          268
         * 173: aload_3
         * 174: ldc           #52                 // String DELETE
         * 176: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 179: ifeq          191
         * 182: aload_0
         * 183: aload_1
         * 184: aload_2
         * 185: invokevirtual #95                 // Method doDelete:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 188: goto          268
         * 191: aload_3
         * 192: ldc           #53                 // String OPTIONS
         * 194: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 197: ifeq          209
         * 200: aload_0
         * 201: aload_1
         * 202: aload_2
         * 203: invokevirtual #96                 // Method doOptions:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 206: goto          268
         * 209: aload_3
         * 210: ldc           #62                 // String TRACE
         * 212: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 215: ifeq          227
         * 218: aload_0
         * 219: aload_1
         * 220: aload_2
         * 221: invokevirtual #97                 // Method doTrace:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 224: goto          268
         * 227: getstatic     #6                  // Field lStrings:Ljava/util/ResourceBundle;
         * 230: ldc           #98                 // String http.method_not_implemented
         * 232: invokevirtual #8                  // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 235: astore        4
         * 237: iconst_1
         * 238: anewarray     #2                  // class java/lang/Object
         * 241: astore        5
         * 243: aload         5
         * 245: iconst_0
         * 246: aload_3
         * 247: aastore
         * 248: aload         4
         * 250: aload         5
         * 252: invokestatic  #99                 // Method java/text/MessageFormat.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 255: astore        4
         * 257: aload_2
         * 258: sipush        501
         * 261: aload         4
         * 263: invokeinterface #33,  3           // InterfaceMethod jakarta/servlet/http/HttpServletResponse.sendError:(ILjava/lang/String;)V
         * 268: return
         * Exception table:
         * from    to  target type
         * 41    51    54   Class java/lang/IllegalArgumentException
         *  */
        // </editor-fold>
    }

    private void maybeSetLastModified(HttpServletResponse resp, long lastModified) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ldc           #100                // String Last-Modified
         * 3: invokeinterface #101,  2          // InterfaceMethod jakarta/servlet/http/HttpServletResponse.containsHeader:(Ljava/lang/String;)Z
         * 8: ifeq          12
         * 11: return
         * 12: lload_2
         * 13: lconst_0
         * 14: lcmp
         * 15: iflt          27
         * 18: aload_1
         * 19: ldc           #100                // String Last-Modified
         * 21: lload_2
         * 22: invokeinterface #102,  4          // InterfaceMethod jakarta/servlet/http/HttpServletResponse.setDateHeader:(Ljava/lang/String;J)V
         * 27: return
         *  */
        // </editor-fold>
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: checkcast     #103                // class jakarta/servlet/http/HttpServletRequest
         * 4: astore_3
         * 5: aload_2
         * 6: checkcast     #32                 // class jakarta/servlet/http/HttpServletResponse
         * 9: astore        4
         * 11: goto          32
         * 14: astore        5
         * 16: new           #105                // class jakarta/servlet/ServletException
         * 19: dup
         * 20: getstatic     #6                  // Field lStrings:Ljava/util/ResourceBundle;
         * 23: ldc           #106                // String http.non_http
         * 25: invokevirtual #8                  // Method java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 28: invokespecial #107                // Method jakarta/servlet/ServletException."<init>":(Ljava/lang/String;)V
         * 31: athrow
         * 32: aload_0
         * 33: aload_3
         * 34: aload         4
         * 36: invokevirtual #108                // Method service:(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V
         * 39: return
         * Exception table:
         * from    to  target type
         * 0    11    14   Class java/lang/ClassCastException
         *  */
        // </editor-fold>
    }
}
