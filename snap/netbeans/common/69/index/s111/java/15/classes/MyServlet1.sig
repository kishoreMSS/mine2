����   3 Z
      javax/servlet/http/HttpServlet <init> ()V  	 
   &javax/servlet/http/HttpServletResponse 	getWriter ()Ljava/io/PrintWriter;      %javax/servlet/http/HttpServletRequest getParameterNames ()Ljava/util/Enumeration;      java/util/Enumeration hasMoreElements ()Z     nextElement ()Ljava/lang/Object;  java/lang/String   java/lang/StringBuilder
  
  # $ % append -(Ljava/lang/String;)Ljava/lang/StringBuilder; ' =
  ) * + toString ()Ljava/lang/String;
 - . / 0 1 java/io/PrintWriter print (Ljava/lang/String;)V  3 4 5 getParameter &(Ljava/lang/String;)Ljava/lang/String;
 - 7 8 1 println :  
 - < =  close ? 
MyServlet1 Code LineNumberTable LocalVariableTable this LMyServlet1; doGet R(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V name_received Ljava/lang/String; value_received req 'Ljavax/servlet/http/HttpServletRequest; res (Ljavax/servlet/http/HttpServletResponse; out Ljava/io/PrintWriter; en Ljava/util/Enumeration; StackMapTable 
Exceptions U javax/servlet/ServletException W java/io/IOException 
SourceFile MyServlet1.java ! >           @   /     *� �    A        B        C D    E F  @   �     [,�  N+�  :�  � @�  � :-� Y� !� "&� "� (� ,+� 2 :-� 6-9� 6���-� ;�    A   .           %  =  G  M  S  V  Z  B   H  % . G H  G  I H    [ C D     [ J K    [ L M   T N O   L P Q  R    �  - � F S     T V  X    Y