package java.lang;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class String implements Serializable, Comparable<String>, CharSequence {

    public static final Comparator<String> CASE_INSENSITIVE_ORDER;

    public String() {
        // compiled code
    }

    public String(char[] chars) {
        // compiled code
    }

    public String(char[] chars, int i, int i1) {
        // compiled code
    }

    public String(int[] ints, int i, int i1) {
        // compiled code
    }

    public String(byte[] bytes, int i, int i1, String string) throws UnsupportedEncodingException {
        // compiled code
    }

    public String(byte[] bytes, int i, int i1, Charset chrst) {
        // compiled code
    }

    public String(byte[] bytes, String string) throws UnsupportedEncodingException {
        // compiled code
    }

    public String(byte[] bytes, Charset chrst) {
        // compiled code
    }

    public String(byte[] bytes, int i, int i1) {
        // compiled code
    }

    public String(byte[] bytes) {
        // compiled code
    }

    public String(StringBuffer sb) {
        // compiled code
    }

    public String(StringBuilder sb) {
        // compiled code
    }

    public int length() {
        // compiled code
    }

    public boolean isEmpty() {
        // compiled code
    }

    public char charAt(int i) {
        // compiled code
    }

    public int codePointAt(int i) {
        // compiled code
    }

    public int codePointBefore(int i) {
        // compiled code
    }

    public int codePointCount(int i, int i1) {
        // compiled code
    }

    public int offsetByCodePoints(int i, int i1) {
        // compiled code
    }

    public void getChars(int i, int i1, char[] chars, int i2) {
        // compiled code
    }

    public byte[] getBytes(String string) throws UnsupportedEncodingException {
        // compiled code
    }

    public byte[] getBytes(Charset chrst) {
        // compiled code
    }

    public byte[] getBytes() {
        // compiled code
    }

    public boolean equals(Object o) {
        // compiled code
    }

    public boolean contentEquals(StringBuffer sb) {
        // compiled code
    }

    public boolean contentEquals(CharSequence cs) {
        // compiled code
    }

    public boolean equalsIgnoreCase(String string) {
        // compiled code
    }

    public int compareTo(String string) {
        // compiled code
    }

    public int compareToIgnoreCase(String string) {
        // compiled code
    }

    public boolean regionMatches(int i, String string, int i1, int i2) {
        // compiled code
    }

    public boolean regionMatches(boolean bln, int i, String string, int i1, int i2) {
        // compiled code
    }

    public boolean startsWith(String string, int i) {
        // compiled code
    }

    public boolean startsWith(String string) {
        // compiled code
    }

    public boolean endsWith(String string) {
        // compiled code
    }

    public int hashCode() {
        // compiled code
    }

    public int indexOf(int i) {
        // compiled code
    }

    public int indexOf(int i, int i1) {
        // compiled code
    }

    public int lastIndexOf(int i) {
        // compiled code
    }

    public int lastIndexOf(int i, int i1) {
        // compiled code
    }

    public int indexOf(String string) {
        // compiled code
    }

    public int indexOf(String string, int i) {
        // compiled code
    }

    public int lastIndexOf(String string) {
        // compiled code
    }

    public int lastIndexOf(String string, int i) {
        // compiled code
    }

    public String substring(int i) {
        // compiled code
    }

    public String substring(int i, int i1) {
        // compiled code
    }

    public CharSequence subSequence(int i, int i1) {
        // compiled code
    }

    public String concat(String string) {
        // compiled code
    }

    public String replace(char c, char c1) {
        // compiled code
    }

    public boolean matches(String string) {
        // compiled code
    }

    public boolean contains(CharSequence cs) {
        // compiled code
    }

    public String replaceFirst(String string, String string1) {
        // compiled code
    }

    public String replaceAll(String string, String string1) {
        // compiled code
    }

    public String replace(CharSequence cs, CharSequence cs1) {
        // compiled code
    }

    public String[] split(String string, int i) {
        // compiled code
    }

    public String[] split(String string) {
        // compiled code
    }

    public static String join(CharSequence cs, CharSequence[] css) {
        // compiled code
    }

    public static String join(CharSequence cs, Iterable<? extends CharSequence> itrbl) {
        // compiled code
    }

    public String toLowerCase(Locale locale) {
        // compiled code
    }

    public String toLowerCase() {
        // compiled code
    }

    public String toUpperCase(Locale locale) {
        // compiled code
    }

    public String toUpperCase() {
        // compiled code
    }

    public String trim() {
        // compiled code
    }

    public String toString() {
        // compiled code
    }

    public char[] toCharArray() {
        // compiled code
    }

    public static String format(String string, Object[] os) {
        // compiled code
    }

    public static String format(Locale locale, String string, Object[] os) {
        // compiled code
    }

    public static String valueOf(Object o) {
        // compiled code
    }

    public static String valueOf(char[] chars) {
        // compiled code
    }

    public static String valueOf(char[] chars, int i, int i1) {
        // compiled code
    }

    public static String copyValueOf(char[] chars, int i, int i1) {
        // compiled code
    }

    public static String copyValueOf(char[] chars) {
        // compiled code
    }

    public static String valueOf(boolean bln) {
        // compiled code
    }

    public static String valueOf(char c) {
        // compiled code
    }

    public static String valueOf(int i) {
        // compiled code
    }

    public static String valueOf(long l) {
        // compiled code
    }

    public static String valueOf(float f) {
        // compiled code
    }

    public static String valueOf(double d) {
        // compiled code
    }

    public native String intern();

    public String(String string) {
        // compiled code
    }

    @Deprecated(since = "1.1")
    public String(byte[] bytes, int i, int i1, int i2) {
        // compiled code
    }

    @Deprecated(since = "1.1")
    public String(byte[] bytes, int i) {
        // compiled code
    }

    @Deprecated(since = "1.1")
    public void getBytes(int i, int i1, byte[] bytes, int i2) {
        // compiled code
    }

    public IntStream chars() {
        // compiled code
    }

    public IntStream codePoints() {
        // compiled code
    }

    public String strip() {
        // compiled code
    }

    public String stripLeading() {
        // compiled code
    }

    public String stripTrailing() {
        // compiled code
    }

    public boolean isBlank() {
        // compiled code
    }

    public Stream<String> lines() {
        // compiled code
    }

    public String repeat(int i) {
        // compiled code
    }
}
