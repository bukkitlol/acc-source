/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import android.os.Build;
/*     */ import java.lang.invoke.CallSite;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MethodType;
/*     */ import java.lang.invoke.MutableCallSite;
/*     */ import java.lang.reflect.Method;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.Socket;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.SecretKeyFactory;
/*     */ import javax.crypto.spec.DESKeySpec;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ import javax.net.ssl.SSLContext;
/*     */ import javax.net.ssl.SSLSocket;
/*     */ import javax.net.ssl.SSLSocketFactory;
/*     */ import javax.net.ssl.X509TrustManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class i_
/*     */   extends io
/*     */ {
/*     */   private static final int i = 4000;
/*     */   private final Class l;
/*     */   private final Class e;
/*     */   private final Method f;
/*     */   private final Method h;
/*     */   private final Method k;
/*     */   private final Method j;
/*     */   private final dy g;
/*     */   private static final long n = nc.a(5483480965420926552L, 5702916091344315902L, MethodHandles.lookup().lookupClass()).a(141876652888772L);
/*     */   
/*     */   @Nullable
/*     */   public Object a(long paramLong, String paramString) {
/*  57 */     long l = paramLong ^ 0x3EC6F67F9972L; return this.g.a(l, paramString);
/*     */   } private static final String[] s; private static final String[] t; private static final Map u = new HashMap<>(13); public SSLContext a(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: ldc2_w 3323116484231826556
/*     */     //   3: lload_1
/*     */     //   4: <illegal opcode> w : (JJ)I
/*     */     //   9: istore_3
/*     */     //   10: getstatic android/os/Build$VERSION.SDK_INT : I
/*     */     //   13: bipush #16
/*     */     //   15: iload_3
/*     */     //   16: ifne -> 70
/*     */     //   19: if_icmplt -> 77
/*     */     //   22: goto -> 35
/*     */     //   25: ldc2_w 3323648352550385695
/*     */     //   28: lload_1
/*     */     //   29: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   34: athrow
/*     */     //   35: getstatic android/os/Build$VERSION.SDK_INT : I
/*     */     //   38: iload_3
/*     */     //   39: ifne -> 74
/*     */     //   42: goto -> 55
/*     */     //   45: ldc2_w 3323648352550385695
/*     */     //   48: lload_1
/*     */     //   49: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   54: athrow
/*     */     //   55: bipush #22
/*     */     //   57: goto -> 70
/*     */     //   60: ldc2_w 3323648352550385695
/*     */     //   63: lload_1
/*     */     //   64: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   69: athrow
/*     */     //   70: if_icmpge -> 77
/*     */     //   73: iconst_1
/*     */     //   74: goto -> 78
/*     */     //   77: iconst_0
/*     */     //   78: istore #4
/*     */     //   80: goto -> 88
/*     */     //   83: astore #5
/*     */     //   85: iconst_1
/*     */     //   86: istore #4
/*     */     //   88: iload #4
/*     */     //   90: lload_1
/*     */     //   91: lconst_0
/*     */     //   92: lcmp
/*     */     //   93: ifle -> 131
/*     */     //   96: ifeq -> 128
/*     */     //   99: sipush #16644
/*     */     //   102: ldc2_w 5258953026214632047
/*     */     //   105: lload_1
/*     */     //   106: lxor
/*     */     //   107: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   112: invokestatic getInstance : (Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
/*     */     //   115: areturn
/*     */     //   116: ldc2_w 3323648352550385695
/*     */     //   119: lload_1
/*     */     //   120: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   125: athrow
/*     */     //   126: astore #5
/*     */     //   128: sipush #3757
/*     */     //   131: ldc2_w 1886125963700917710
/*     */     //   134: lload_1
/*     */     //   135: lxor
/*     */     //   136: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   141: invokestatic getInstance : (Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
/*     */     //   144: areturn
/*     */     //   145: astore #5
/*     */     //   147: new java/lang/IllegalStateException
/*     */     //   150: dup
/*     */     //   151: sipush #32763
/*     */     //   154: ldc2_w 1970301453835314310
/*     */     //   157: lload_1
/*     */     //   158: lxor
/*     */     //   159: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   164: aload #5
/*     */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   169: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #1	-> 10
/*     */     //   #96	-> 80
/*     */     //   #84	-> 83
/*     */     //   #17	-> 85
/*     */     //   #8	-> 88
/*     */     //   #9	-> 99
/*     */     //   #67	-> 126
/*     */     //   #115	-> 128
/*     */     //   #59	-> 145
/*     */     //   #81	-> 147
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	22	25	java/lang/NoClassDefFoundError
/*     */     //   10	80	83	java/lang/NoClassDefFoundError
/*     */     //   19	42	45	java/lang/NoClassDefFoundError
/*     */     //   35	57	60	java/lang/NoClassDefFoundError
/*     */     //   88	116	116	java/lang/NoClassDefFoundError
/*     */     //   99	115	126	java/security/NoSuchAlgorithmException
/*     */     //   128	144	145	java/security/NoSuchAlgorithmException
/*     */   }
/*     */   public void a(Socket paramSocket, InetSocketAddress paramInetSocketAddress, long paramLong, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 63168549007192
/*     */     //   5: lxor
/*     */     //   6: dup2
/*     */     //   7: bipush #32
/*     */     //   9: lushr
/*     */     //   10: l2i
/*     */     //   11: istore #6
/*     */     //   13: dup2
/*     */     //   14: bipush #32
/*     */     //   16: lshl
/*     */     //   17: bipush #48
/*     */     //   19: lushr
/*     */     //   20: l2i
/*     */     //   21: istore #7
/*     */     //   23: dup2
/*     */     //   24: bipush #48
/*     */     //   26: lshl
/*     */     //   27: bipush #48
/*     */     //   29: lushr
/*     */     //   30: l2i
/*     */     //   31: istore #8
/*     */     //   33: pop2
/*     */     //   34: pop2
/*     */     //   35: ldc2_w 794975584283863402
/*     */     //   38: lload_3
/*     */     //   39: <illegal opcode> w : (JJ)I
/*     */     //   44: istore #9
/*     */     //   46: aload_1
/*     */     //   47: aload_2
/*     */     //   48: iload #5
/*     */     //   50: invokevirtual connect : (Ljava/net/SocketAddress;I)V
/*     */     //   53: goto -> 166
/*     */     //   56: astore #10
/*     */     //   58: aload #10
/*     */     //   60: iload #9
/*     */     //   62: lload_3
/*     */     //   63: lconst_0
/*     */     //   64: lcmp
/*     */     //   65: ifle -> 73
/*     */     //   68: ifne -> 119
/*     */     //   71: iload #6
/*     */     //   73: iload #7
/*     */     //   75: i2c
/*     */     //   76: iload #8
/*     */     //   78: invokestatic a : (Ljava/lang/AssertionError;ICI)Z
/*     */     //   81: ifeq -> 117
/*     */     //   84: goto -> 97
/*     */     //   87: ldc2_w 795376061015186697
/*     */     //   90: lload_3
/*     */     //   91: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   96: athrow
/*     */     //   97: new java/io/IOException
/*     */     //   100: dup
/*     */     //   101: aload #10
/*     */     //   103: invokespecial <init> : (Ljava/lang/Throwable;)V
/*     */     //   106: athrow
/*     */     //   107: ldc2_w 795376061015186697
/*     */     //   110: lload_3
/*     */     //   111: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   116: athrow
/*     */     //   117: aload #10
/*     */     //   119: athrow
/*     */     //   120: astore #10
/*     */     //   122: getstatic android/os/Build$VERSION.SDK_INT : I
/*     */     //   125: bipush #26
/*     */     //   127: if_icmpne -> 163
/*     */     //   130: new java/io/IOException
/*     */     //   133: dup
/*     */     //   134: sipush #989
/*     */     //   137: ldc2_w 8148621210262076842
/*     */     //   140: lload_3
/*     */     //   141: lxor
/*     */     //   142: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   147: aload #10
/*     */     //   149: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   152: athrow
/*     */     //   153: ldc2_w 795376061015186697
/*     */     //   156: lload_3
/*     */     //   157: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   162: athrow
/*     */     //   163: aload #10
/*     */     //   165: athrow
/*     */     //   166: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #24	-> 46
/*     */     //   #95	-> 53
/*     */     //   #120	-> 56
/*     */     //   #20	-> 58
/*     */     //   #47	-> 117
/*     */     //   #52	-> 120
/*     */     //   #97	-> 122
/*     */     //   #105	-> 130
/*     */     //   #31	-> 163
/*     */     //   #34	-> 166
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   46	53	56	java/lang/AssertionError
/*     */     //   46	53	120	java/lang/ClassCastException
/*     */     //   58	84	87	java/lang/AssertionError
/*     */     //   71	107	107	java/lang/AssertionError
/*     */     //   122	153	153	java/lang/AssertionError
/*     */   }
/*     */   private boolean a(String paramString, Class paramClass, long paramLong, Object paramObject) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/i_.n : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 123193690234328
/*     */     //   11: lxor
/*     */     //   12: lstore #6
/*     */     //   14: pop2
/*     */     //   15: aload_2
/*     */     //   16: sipush #29898
/*     */     //   19: ldc2_w 2654894864372813086
/*     */     //   22: lload_3
/*     */     //   23: lxor
/*     */     //   24: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   29: iconst_0
/*     */     //   30: anewarray java/lang/Class
/*     */     //   33: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   36: astore #8
/*     */     //   38: aload #8
/*     */     //   40: aload #5
/*     */     //   42: iconst_0
/*     */     //   43: anewarray java/lang/Object
/*     */     //   46: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   49: checkcast java/lang/Boolean
/*     */     //   52: invokevirtual booleanValue : ()Z
/*     */     //   55: ireturn
/*     */     //   56: astore #8
/*     */     //   58: aload_0
/*     */     //   59: lload #6
/*     */     //   61: aload_1
/*     */     //   62: invokespecial a : (JLjava/lang/String;)Z
/*     */     //   65: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #33	-> 15
/*     */     //   #104	-> 33
/*     */     //   #53	-> 38
/*     */     //   #107	-> 56
/*     */     //   #76	-> 58
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   15	55	56	java/lang/NoSuchMethodException
/*     */   }
/*     */   public void a(long paramLong, SSLSocket paramSSLSocket, String paramString, List paramList) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 22532416682007
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: pop2
/*     */     //   9: ldc2_w 3413188588177395004
/*     */     //   12: lload_1
/*     */     //   13: <illegal opcode> w : (JJ)I
/*     */     //   18: istore #8
/*     */     //   20: aload_0
/*     */     //   21: getfield e : Ljava/lang/Class;
/*     */     //   24: aload_3
/*     */     //   25: invokevirtual isInstance : (Ljava/lang/Object;)Z
/*     */     //   28: ifne -> 42
/*     */     //   31: return
/*     */     //   32: ldc2_w 3413720456502114655
/*     */     //   35: lload_1
/*     */     //   36: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   41: athrow
/*     */     //   42: lload_1
/*     */     //   43: lconst_0
/*     */     //   44: lcmp
/*     */     //   45: ifle -> 145
/*     */     //   48: aload #4
/*     */     //   50: iload #8
/*     */     //   52: ifne -> 144
/*     */     //   55: ifnull -> 122
/*     */     //   58: goto -> 71
/*     */     //   61: ldc2_w 3413720456502114655
/*     */     //   64: lload_1
/*     */     //   65: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   70: athrow
/*     */     //   71: aload_0
/*     */     //   72: getfield f : Ljava/lang/reflect/Method;
/*     */     //   75: aload_3
/*     */     //   76: iconst_1
/*     */     //   77: anewarray java/lang/Object
/*     */     //   80: dup
/*     */     //   81: iconst_0
/*     */     //   82: iconst_1
/*     */     //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   86: aastore
/*     */     //   87: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   90: pop
/*     */     //   91: aload_0
/*     */     //   92: getfield h : Ljava/lang/reflect/Method;
/*     */     //   95: aload_3
/*     */     //   96: iconst_1
/*     */     //   97: anewarray java/lang/Object
/*     */     //   100: dup
/*     */     //   101: iconst_0
/*     */     //   102: aload #4
/*     */     //   104: aastore
/*     */     //   105: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   108: pop
/*     */     //   109: goto -> 122
/*     */     //   112: ldc2_w 3413720456502114655
/*     */     //   115: lload_1
/*     */     //   116: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   121: athrow
/*     */     //   122: aload_0
/*     */     //   123: getfield j : Ljava/lang/reflect/Method;
/*     */     //   126: aload_3
/*     */     //   127: iconst_1
/*     */     //   128: anewarray java/lang/Object
/*     */     //   131: dup
/*     */     //   132: iconst_0
/*     */     //   133: aload #5
/*     */     //   135: lload #6
/*     */     //   137: invokestatic a : (Ljava/util/List;J)[B
/*     */     //   140: aastore
/*     */     //   141: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   144: pop
/*     */     //   145: goto -> 160
/*     */     //   148: astore #9
/*     */     //   150: new java/lang/AssertionError
/*     */     //   153: dup
/*     */     //   154: aload #9
/*     */     //   156: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   159: athrow
/*     */     //   160: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 20
/*     */     //   #112	-> 31
/*     */     //   #58	-> 42
/*     */     //   #35	-> 71
/*     */     //   #12	-> 91
/*     */     //   #40	-> 122
/*     */     //   #5	-> 145
/*     */     //   #82	-> 148
/*     */     //   #93	-> 150
/*     */     //   #4	-> 160
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	32	32	java/lang/IllegalAccessException
/*     */     //   42	58	61	java/lang/IllegalAccessException
/*     */     //   42	145	148	java/lang/IllegalAccessException
/*     */     //   42	145	148	java/lang/reflect/InvocationTargetException
/*     */     //   55	109	112	java/lang/IllegalAccessException
/*     */   }
/*     */   public gK a(long paramLong, X509TrustManager paramX509TrustManager) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 0
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: pop2
/*     */     //   9: sipush #19683
/*     */     //   12: ldc2_w 5135997812094463003
/*     */     //   15: lload_1
/*     */     //   16: lxor
/*     */     //   17: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   22: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   25: astore #6
/*     */     //   27: aload #6
/*     */     //   29: iconst_1
/*     */     //   30: anewarray java/lang/Class
/*     */     //   33: dup
/*     */     //   34: iconst_0
/*     */     //   35: ldc javax/net/ssl/X509TrustManager
/*     */     //   37: aastore
/*     */     //   38: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/*     */     //   41: astore #7
/*     */     //   43: aload #7
/*     */     //   45: iconst_1
/*     */     //   46: anewarray java/lang/Object
/*     */     //   49: dup
/*     */     //   50: iconst_0
/*     */     //   51: aload_3
/*     */     //   52: aastore
/*     */     //   53: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   56: astore #8
/*     */     //   58: aload #6
/*     */     //   60: sipush #21599
/*     */     //   63: ldc2_w 6820362203384378545
/*     */     //   66: lload_1
/*     */     //   67: lxor
/*     */     //   68: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   73: iconst_3
/*     */     //   74: anewarray java/lang/Class
/*     */     //   77: dup
/*     */     //   78: iconst_0
/*     */     //   79: ldc_w [Ljava/security/cert/X509Certificate;
/*     */     //   82: aastore
/*     */     //   83: dup
/*     */     //   84: iconst_1
/*     */     //   85: ldc java/lang/String
/*     */     //   87: aastore
/*     */     //   88: dup
/*     */     //   89: iconst_2
/*     */     //   90: ldc java/lang/String
/*     */     //   92: aastore
/*     */     //   93: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   96: astore #9
/*     */     //   98: new me/konsolas/aac/gw
/*     */     //   101: dup
/*     */     //   102: aload #8
/*     */     //   104: aload #9
/*     */     //   106: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/reflect/Method;)V
/*     */     //   109: areturn
/*     */     //   110: astore #6
/*     */     //   112: aload_0
/*     */     //   113: lload #4
/*     */     //   115: aload_3
/*     */     //   116: invokespecial a : (JLjavax/net/ssl/X509TrustManager;)Lme/konsolas/aac/gK;
/*     */     //   119: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 9
/*     */     //   #7	-> 27
/*     */     //   #55	-> 43
/*     */     //   #72	-> 58
/*     */     //   #2	-> 98
/*     */     //   #87	-> 110
/*     */     //   #86	-> 112
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	109	110	java/lang/Exception
/*     */   }
/*     */   public void a(int paramInt1, int paramInt2, char paramChar, String paramString, short paramShort, @Nullable Throwable paramThrowable) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #5
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: lstore #7
/*     */     //   26: ldc2_w 751949288910625860
/*     */     //   29: lload #7
/*     */     //   31: <illegal opcode> w : (JJ)I
/*     */     //   36: istore #9
/*     */     //   38: iload_1
/*     */     //   39: iload #9
/*     */     //   41: ifeq -> 77
/*     */     //   44: iconst_5
/*     */     //   45: if_icmpne -> 80
/*     */     //   48: goto -> 62
/*     */     //   51: ldc2_w 841204430260592044
/*     */     //   54: lload #7
/*     */     //   56: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   61: athrow
/*     */     //   62: iconst_5
/*     */     //   63: goto -> 77
/*     */     //   66: ldc2_w 841204430260592044
/*     */     //   69: lload #7
/*     */     //   71: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   76: athrow
/*     */     //   77: goto -> 81
/*     */     //   80: iconst_3
/*     */     //   81: istore #10
/*     */     //   83: aload #6
/*     */     //   85: ifnull -> 118
/*     */     //   88: new java/lang/StringBuilder
/*     */     //   91: dup
/*     */     //   92: invokespecial <init> : ()V
/*     */     //   95: aload #4
/*     */     //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   100: bipush #10
/*     */     //   102: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   105: aload #6
/*     */     //   107: invokestatic getStackTraceString : (Ljava/lang/Throwable;)Ljava/lang/String;
/*     */     //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   113: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   116: astore #4
/*     */     //   118: iconst_0
/*     */     //   119: istore #11
/*     */     //   121: aload #4
/*     */     //   123: invokevirtual length : ()I
/*     */     //   126: istore #12
/*     */     //   128: iload #11
/*     */     //   130: iload #12
/*     */     //   132: if_icmpge -> 272
/*     */     //   135: aload #4
/*     */     //   137: bipush #10
/*     */     //   139: iload #11
/*     */     //   141: invokevirtual indexOf : (II)I
/*     */     //   144: istore #13
/*     */     //   146: iload #13
/*     */     //   148: iload #9
/*     */     //   150: iload_3
/*     */     //   151: iflt -> 158
/*     */     //   154: ifeq -> 191
/*     */     //   157: iconst_m1
/*     */     //   158: if_icmpeq -> 194
/*     */     //   161: goto -> 175
/*     */     //   164: ldc2_w 841204430260592044
/*     */     //   167: lload #7
/*     */     //   169: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   174: athrow
/*     */     //   175: iload #13
/*     */     //   177: goto -> 191
/*     */     //   180: ldc2_w 841204430260592044
/*     */     //   183: lload #7
/*     */     //   185: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   190: athrow
/*     */     //   191: goto -> 196
/*     */     //   194: iload #12
/*     */     //   196: istore #13
/*     */     //   198: iload #13
/*     */     //   200: iload #11
/*     */     //   202: sipush #4000
/*     */     //   205: iadd
/*     */     //   206: invokestatic min : (II)I
/*     */     //   209: istore #14
/*     */     //   211: iload #10
/*     */     //   213: sipush #6003
/*     */     //   216: ldc2_w 6104447559422208422
/*     */     //   219: lload #7
/*     */     //   221: lxor
/*     */     //   222: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   227: aload #4
/*     */     //   229: iload #11
/*     */     //   231: iload #14
/*     */     //   233: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   236: invokestatic println : (ILjava/lang/String;Ljava/lang/String;)I
/*     */     //   239: pop
/*     */     //   240: iload #14
/*     */     //   242: istore #11
/*     */     //   244: iload #11
/*     */     //   246: iload #13
/*     */     //   248: if_icmplt -> 198
/*     */     //   251: iinc #11, 1
/*     */     //   254: iload #9
/*     */     //   256: iload_3
/*     */     //   257: ifle -> 246
/*     */     //   260: ifeq -> 244
/*     */     //   263: iload #9
/*     */     //   265: iload_3
/*     */     //   266: ifle -> 260
/*     */     //   269: ifne -> 128
/*     */     //   272: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 38
/*     */     //   #39	-> 83
/*     */     //   #3	-> 118
/*     */     //   #49	-> 135
/*     */     //   #74	-> 146
/*     */     //   #11	-> 198
/*     */     //   #116	-> 211
/*     */     //   #10	-> 240
/*     */     //   #15	-> 244
/*     */     //   #41	-> 251
/*     */     //   #22	-> 272
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   38	48	51	java/lang/ClassCastException
/*     */     //   44	63	66	java/lang/ClassCastException
/*     */     //   146	161	164	java/lang/ClassCastException
/*     */     //   157	177	180	java/lang/ClassCastException
/*     */   }
/*     */   public mV a(X509TrustManager paramX509TrustManager, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_2
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 0
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: pop2
/*     */     //   9: aload_1
/*     */     //   10: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   13: sipush #1212
/*     */     //   16: ldc2_w 362642531900936679
/*     */     //   19: lload_2
/*     */     //   20: lxor
/*     */     //   21: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   26: iconst_1
/*     */     //   27: anewarray java/lang/Class
/*     */     //   30: dup
/*     */     //   31: iconst_0
/*     */     //   32: ldc_w java/security/cert/X509Certificate
/*     */     //   35: aastore
/*     */     //   36: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   39: astore #6
/*     */     //   41: aload #6
/*     */     //   43: iconst_1
/*     */     //   44: invokevirtual setAccessible : (Z)V
/*     */     //   47: new me/konsolas/aac/jE
/*     */     //   50: dup
/*     */     //   51: aload_1
/*     */     //   52: aload #6
/*     */     //   54: invokespecial <init> : (Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V
/*     */     //   57: areturn
/*     */     //   58: astore #6
/*     */     //   60: aload_0
/*     */     //   61: aload_1
/*     */     //   62: lload #4
/*     */     //   64: invokespecial a : (Ljavax/net/ssl/X509TrustManager;J)Lme/konsolas/aac/mV;
/*     */     //   67: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #75	-> 9
/*     */     //   #98	-> 41
/*     */     //   #14	-> 47
/*     */     //   #78	-> 58
/*     */     //   #68	-> 60
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	57	58	java/lang/NoSuchMethodException
/*     */   }
/*     */   @Nullable
/*     */   protected X509TrustManager a(SSLSocketFactory paramSSLSocketFactory, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_2
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 0
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 133981168253026
/*     */     //   12: lxor
/*     */     //   13: lstore #6
/*     */     //   15: pop2
/*     */     //   16: ldc2_w 2692040239546697534
/*     */     //   19: lload_2
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: lload #6
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: getfield l : Ljava/lang/Class;
/*     */     //   32: sipush #1624
/*     */     //   35: ldc2_w 4564045773256644214
/*     */     //   38: lload_2
/*     */     //   39: lxor
/*     */     //   40: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   45: invokestatic a : (JLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   48: astore #9
/*     */     //   50: istore #8
/*     */     //   52: aload #9
/*     */     //   54: iload #8
/*     */     //   56: ifne -> 159
/*     */     //   59: ifnonnull -> 137
/*     */     //   62: goto -> 75
/*     */     //   65: ldc2_w 2692554517849633629
/*     */     //   68: lload_2
/*     */     //   69: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   74: athrow
/*     */     //   75: sipush #5575
/*     */     //   78: ldc2_w 2558305141364475367
/*     */     //   81: lload_2
/*     */     //   82: lxor
/*     */     //   83: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   88: iconst_0
/*     */     //   89: aload_1
/*     */     //   90: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   93: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */     //   96: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
/*     */     //   99: astore #10
/*     */     //   101: lload #6
/*     */     //   103: aload_1
/*     */     //   104: aload #10
/*     */     //   106: sipush #27901
/*     */     //   109: ldc2_w 319297014105750743
/*     */     //   112: lload_2
/*     */     //   113: lxor
/*     */     //   114: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   119: invokestatic a : (JLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   122: astore #9
/*     */     //   124: goto -> 137
/*     */     //   127: astore #10
/*     */     //   129: aload_0
/*     */     //   130: aload_1
/*     */     //   131: lload #4
/*     */     //   133: invokespecial a : (Ljavax/net/ssl/SSLSocketFactory;J)Ljavax/net/ssl/X509TrustManager;
/*     */     //   136: areturn
/*     */     //   137: lload #6
/*     */     //   139: aload #9
/*     */     //   141: ldc javax/net/ssl/X509TrustManager
/*     */     //   143: sipush #1727
/*     */     //   146: ldc2_w 7514354563820639888
/*     */     //   149: lload_2
/*     */     //   150: lxor
/*     */     //   151: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   156: invokestatic a : (JLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   159: checkcast javax/net/ssl/X509TrustManager
/*     */     //   162: astore #10
/*     */     //   164: aload #10
/*     */     //   166: iload #8
/*     */     //   168: ifne -> 225
/*     */     //   171: ifnull -> 200
/*     */     //   174: goto -> 187
/*     */     //   177: ldc2_w 2692554517849633629
/*     */     //   180: lload_2
/*     */     //   181: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   186: athrow
/*     */     //   187: aload #10
/*     */     //   189: areturn
/*     */     //   190: ldc2_w 2692554517849633629
/*     */     //   193: lload_2
/*     */     //   194: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   199: athrow
/*     */     //   200: lload #6
/*     */     //   202: aload #9
/*     */     //   204: ldc javax/net/ssl/X509TrustManager
/*     */     //   206: sipush #7379
/*     */     //   209: ldc2_w 5046523452887485688
/*     */     //   212: lload_2
/*     */     //   213: lxor
/*     */     //   214: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   219: invokestatic a : (JLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   222: checkcast javax/net/ssl/X509TrustManager
/*     */     //   225: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #83	-> 25
/*     */     //   #29	-> 52
/*     */     //   #21	-> 75
/*     */     //   #118	-> 90
/*     */     //   #77	-> 96
/*     */     //   #44	-> 101
/*     */     //   #114	-> 124
/*     */     //   #108	-> 127
/*     */     //   #110	-> 129
/*     */     //   #42	-> 137
/*     */     //   #102	-> 164
/*     */     //   #6	-> 200
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   52	62	65	java/lang/ClassNotFoundException
/*     */     //   75	124	127	java/lang/ClassNotFoundException
/*     */     //   164	174	177	java/lang/ClassNotFoundException
/*     */     //   171	190	190	java/lang/ClassNotFoundException
/*     */   }
/*     */   static int a() {
/*     */     try {
/*  85 */       return Build.VERSION.SDK_INT;
/*     */     } catch (NoClassDefFoundError noClassDefFoundError) {
/*     */       return 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String paramString, long paramLong, Object paramObject) {
/*     */     // Byte code:
/*     */     //   0: lload_2
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 123844225552030
/*     */     //   5: lxor
/*     */     //   6: dup2
/*     */     //   7: bipush #32
/*     */     //   9: lushr
/*     */     //   10: l2i
/*     */     //   11: istore #5
/*     */     //   13: dup2
/*     */     //   14: bipush #32
/*     */     //   16: lshl
/*     */     //   17: bipush #48
/*     */     //   19: lushr
/*     */     //   20: l2i
/*     */     //   21: istore #6
/*     */     //   23: dup2
/*     */     //   24: bipush #48
/*     */     //   26: lshl
/*     */     //   27: bipush #48
/*     */     //   29: lushr
/*     */     //   30: l2i
/*     */     //   31: istore #7
/*     */     //   33: pop2
/*     */     //   34: dup2
/*     */     //   35: ldc2_w 37138121080555
/*     */     //   38: lxor
/*     */     //   39: lstore #8
/*     */     //   41: pop2
/*     */     //   42: aload_0
/*     */     //   43: getfield g : Lme/konsolas/aac/dy;
/*     */     //   46: lload #8
/*     */     //   48: aload #4
/*     */     //   50: invokevirtual a : (JLjava/lang/Object;)Z
/*     */     //   53: istore #10
/*     */     //   55: iload #10
/*     */     //   57: ifne -> 88
/*     */     //   60: aload_0
/*     */     //   61: iconst_5
/*     */     //   62: iload #5
/*     */     //   64: iload #6
/*     */     //   66: i2c
/*     */     //   67: aload_1
/*     */     //   68: iload #7
/*     */     //   70: i2s
/*     */     //   71: aconst_null
/*     */     //   72: invokevirtual a : (IICLjava/lang/String;SLjava/lang/Throwable;)V
/*     */     //   75: goto -> 88
/*     */     //   78: ldc2_w 4986327401198293810
/*     */     //   81: lload_2
/*     */     //   82: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   87: athrow
/*     */     //   88: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #92	-> 42
/*     */     //   #65	-> 55
/*     */     //   #25	-> 60
/*     */     //   #13	-> 88
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   55	75	78	java/lang/ClassCastException
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public String a(long paramLong, SSLSocket paramSSLSocket) {
/*     */     // Byte code:
/*     */     //   0: ldc2_w -8106702031541724844
/*     */     //   3: lload_1
/*     */     //   4: <illegal opcode> w : (JJ)I
/*     */     //   9: istore #4
/*     */     //   11: aload_0
/*     */     //   12: getfield e : Ljava/lang/Class;
/*     */     //   15: iload #4
/*     */     //   17: ifeq -> 64
/*     */     //   20: aload_3
/*     */     //   21: invokevirtual isInstance : (Ljava/lang/Object;)Z
/*     */     //   24: ifne -> 52
/*     */     //   27: goto -> 40
/*     */     //   30: ldc2_w -8161421478469936964
/*     */     //   33: lload_1
/*     */     //   34: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   39: athrow
/*     */     //   40: aconst_null
/*     */     //   41: areturn
/*     */     //   42: ldc2_w -8161421478469936964
/*     */     //   45: lload_1
/*     */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   51: athrow
/*     */     //   52: aload_0
/*     */     //   53: getfield k : Ljava/lang/reflect/Method;
/*     */     //   56: aload_3
/*     */     //   57: iconst_0
/*     */     //   58: anewarray java/lang/Object
/*     */     //   61: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   64: checkcast [B
/*     */     //   67: astore #5
/*     */     //   69: aload #5
/*     */     //   71: ifnull -> 99
/*     */     //   74: new java/lang/String
/*     */     //   77: dup
/*     */     //   78: aload #5
/*     */     //   80: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   83: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */     //   86: goto -> 100
/*     */     //   89: ldc2_w -8161421478469936964
/*     */     //   92: lload_1
/*     */     //   93: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   98: athrow
/*     */     //   99: aconst_null
/*     */     //   100: areturn
/*     */     //   101: astore #5
/*     */     //   103: new java/lang/AssertionError
/*     */     //   106: dup
/*     */     //   107: aload #5
/*     */     //   109: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   112: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #99	-> 11
/*     */     //   #30	-> 40
/*     */     //   #63	-> 52
/*     */     //   #18	-> 69
/*     */     //   #109	-> 101
/*     */     //   #36	-> 103
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   11	27	30	java/lang/IllegalAccessException
/*     */     //   20	42	42	java/lang/IllegalAccessException
/*     */     //   52	100	101	java/lang/IllegalAccessException
/*     */     //   52	100	101	java/lang/reflect/InvocationTargetException
/*     */     //   69	89	89	java/lang/IllegalAccessException
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(long paramLong, String paramString) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 97443283917568
/*     */     //   5: lxor
/*     */     //   6: dup2
/*     */     //   7: bipush #32
/*     */     //   9: lushr
/*     */     //   10: l2i
/*     */     //   11: istore #4
/*     */     //   13: dup2
/*     */     //   14: bipush #32
/*     */     //   16: lshl
/*     */     //   17: bipush #48
/*     */     //   19: lushr
/*     */     //   20: l2i
/*     */     //   21: istore #5
/*     */     //   23: dup2
/*     */     //   24: bipush #48
/*     */     //   26: lshl
/*     */     //   27: bipush #48
/*     */     //   29: lushr
/*     */     //   30: l2i
/*     */     //   31: istore #6
/*     */     //   33: pop2
/*     */     //   34: dup2
/*     */     //   35: ldc2_w 0
/*     */     //   38: lxor
/*     */     //   39: lstore #7
/*     */     //   41: pop2
/*     */     //   42: sipush #17369
/*     */     //   45: ldc2_w 2466104328872617937
/*     */     //   48: lload_1
/*     */     //   49: lxor
/*     */     //   50: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   55: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   58: astore #9
/*     */     //   60: aload #9
/*     */     //   62: sipush #21312
/*     */     //   65: ldc2_w 390140755946993475
/*     */     //   68: lload_1
/*     */     //   69: lxor
/*     */     //   70: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   75: iconst_0
/*     */     //   76: anewarray java/lang/Class
/*     */     //   79: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   82: astore #10
/*     */     //   84: aload #10
/*     */     //   86: aconst_null
/*     */     //   87: iconst_0
/*     */     //   88: anewarray java/lang/Object
/*     */     //   91: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   94: astore #11
/*     */     //   96: aload_0
/*     */     //   97: iload #4
/*     */     //   99: aload_3
/*     */     //   100: iload #5
/*     */     //   102: aload #9
/*     */     //   104: aload #11
/*     */     //   106: iload #6
/*     */     //   108: invokespecial b : (ILjava/lang/String;ILjava/lang/Class;Ljava/lang/Object;I)Z
/*     */     //   111: ireturn
/*     */     //   112: astore #9
/*     */     //   114: aload_0
/*     */     //   115: lload #7
/*     */     //   117: aload_3
/*     */     //   118: invokespecial a : (JLjava/lang/String;)Z
/*     */     //   121: ireturn
/*     */     //   122: astore #9
/*     */     //   124: new java/lang/AssertionError
/*     */     //   127: dup
/*     */     //   128: sipush #15468
/*     */     //   131: ldc2_w 8868543294769600613
/*     */     //   134: lload_1
/*     */     //   135: lxor
/*     */     //   136: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   141: aload #9
/*     */     //   143: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   146: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #100	-> 42
/*     */     //   #79	-> 60
/*     */     //   #88	-> 84
/*     */     //   #94	-> 96
/*     */     //   #90	-> 112
/*     */     //   #16	-> 114
/*     */     //   #117	-> 122
/*     */     //   #66	-> 124
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   42	111	112	java/lang/ClassNotFoundException
/*     */     //   42	111	112	java/lang/NoSuchMethodException
/*     */     //   42	111	122	java/lang/IllegalAccessException
/*     */     //   42	111	122	java/lang/IllegalArgumentException
/*     */     //   42	111	122	java/lang/reflect/InvocationTargetException
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   i_(Class paramClass1, Class paramClass2, int paramInt1, Method paramMethod1, Method paramMethod2, Method paramMethod3, Method paramMethod4, char paramChar, int paramInt2) {
/* 121 */     this.g = dy.a(l2);
/*     */     this.l = paramClass1;
/*     */     this.e = paramClass2;
/*     */     this.f = paramMethod1;
/*     */     this.h = paramMethod2;
/*     */     this.k = paramMethod3;
/*     */     this.j = paramMethod4;
/*     */   }
/*     */   
/*     */   private boolean b(int paramInt1, String paramString, int paramInt2, Class paramClass, Object paramObject, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #6
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic me/konsolas/aac/i_.n : J
/*     */     //   27: lxor
/*     */     //   28: lstore #7
/*     */     //   30: lload #7
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 44618476930776
/*     */     //   36: lxor
/*     */     //   37: lstore #9
/*     */     //   39: pop2
/*     */     //   40: aload #4
/*     */     //   42: sipush #30027
/*     */     //   45: ldc2_w 2350536661495106559
/*     */     //   48: lload #7
/*     */     //   50: lxor
/*     */     //   51: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   56: iconst_1
/*     */     //   57: anewarray java/lang/Class
/*     */     //   60: dup
/*     */     //   61: iconst_0
/*     */     //   62: ldc java/lang/String
/*     */     //   64: aastore
/*     */     //   65: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   68: astore #11
/*     */     //   70: aload #11
/*     */     //   72: aload #5
/*     */     //   74: iconst_1
/*     */     //   75: anewarray java/lang/Object
/*     */     //   78: dup
/*     */     //   79: iconst_0
/*     */     //   80: aload_2
/*     */     //   81: aastore
/*     */     //   82: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   85: checkcast java/lang/Boolean
/*     */     //   88: invokevirtual booleanValue : ()Z
/*     */     //   91: ireturn
/*     */     //   92: astore #11
/*     */     //   94: aload_0
/*     */     //   95: aload_2
/*     */     //   96: aload #4
/*     */     //   98: lload #9
/*     */     //   100: aload #5
/*     */     //   102: invokespecial a : (Ljava/lang/String;Ljava/lang/Class;JLjava/lang/Object;)Z
/*     */     //   105: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 40
/*     */     //   #62	-> 65
/*     */     //   #69	-> 70
/*     */     //   #56	-> 92
/*     */     //   #91	-> 94
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   40	91	92	java/lang/NoSuchMethodException
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static io e(int paramInt1, char paramChar, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_2
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/i_.n : J
/*     */     //   26: lxor
/*     */     //   27: lstore_3
/*     */     //   28: lload_3
/*     */     //   29: dup2
/*     */     //   30: ldc2_w 60356694887471
/*     */     //   33: lxor
/*     */     //   34: dup2
/*     */     //   35: bipush #32
/*     */     //   37: lushr
/*     */     //   38: l2i
/*     */     //   39: istore #5
/*     */     //   41: dup2
/*     */     //   42: bipush #32
/*     */     //   44: lshl
/*     */     //   45: bipush #48
/*     */     //   47: lushr
/*     */     //   48: l2i
/*     */     //   49: istore #6
/*     */     //   51: dup2
/*     */     //   52: bipush #48
/*     */     //   54: lshl
/*     */     //   55: bipush #48
/*     */     //   57: lushr
/*     */     //   58: l2i
/*     */     //   59: istore #7
/*     */     //   61: pop2
/*     */     //   62: dup2
/*     */     //   63: ldc2_w 15268395674950
/*     */     //   66: lxor
/*     */     //   67: lstore #8
/*     */     //   69: pop2
/*     */     //   70: lload #8
/*     */     //   72: invokestatic a : (J)Z
/*     */     //   75: ifne -> 90
/*     */     //   78: aconst_null
/*     */     //   79: areturn
/*     */     //   80: ldc2_w -5626201864171264021
/*     */     //   83: lload_3
/*     */     //   84: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   89: athrow
/*     */     //   90: ldc_w '㐯䮃␎湵淹鑜該暧䪻⦥ڳ巵퍫ٷⰸ흜ᔃ繁뜌ꅒⶃ度鉔䖅뽩ꚍཱྀ≟剴誩왮쭽?磼ສ뾝䢶؊ᾓ甍'
/*     */     //   93: invokevirtual toCharArray : ()[C
/*     */     //   96: dup
/*     */     //   97: dup
/*     */     //   98: bipush #34
/*     */     //   100: dup_x1
/*     */     //   101: caload
/*     */     //   102: sipush #22685
/*     */     //   105: ixor
/*     */     //   106: i2c
/*     */     //   107: castore
/*     */     //   108: sipush #10446
/*     */     //   111: iconst_0
/*     */     //   112: iconst_0
/*     */     //   113: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   116: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   119: astore #10
/*     */     //   121: ldc_w 'ꎧ攡鲩罿횉饮ヘꄶ搑Ḏ끹飹축팹茓砻ꕁদ鏅?㫰땮扵홉ீፖ釂솦冘眲鮭ᨒ㟹膍ᦤꪏᓾ竫寵'
/*     */     //   124: invokevirtual toCharArray : ()[C
/*     */     //   127: dup
/*     */     //   128: dup
/*     */     //   129: bipush #16
/*     */     //   131: dup_x1
/*     */     //   132: caload
/*     */     //   133: sipush #2781
/*     */     //   136: ixor
/*     */     //   137: i2c
/*     */     //   138: castore
/*     */     //   139: sipush #1073
/*     */     //   142: iconst_1
/*     */     //   143: iconst_0
/*     */     //   144: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   147: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   150: astore #11
/*     */     //   152: goto -> 159
/*     */     //   155: astore #12
/*     */     //   157: aconst_null
/*     */     //   158: areturn
/*     */     //   159: getstatic android/os/Build$VERSION.SDK_INT : I
/*     */     //   162: bipush #21
/*     */     //   164: if_icmplt -> 359
/*     */     //   167: aload #11
/*     */     //   169: ldc_w '殙薬㥝欔遷쏞ᰚީ廑歲ⵕ웴⺊︝侟ජ않㈧栎'
/*     */     //   172: invokevirtual toCharArray : ()[C
/*     */     //   175: dup
/*     */     //   176: dup
/*     */     //   177: bipush #9
/*     */     //   179: dup_x1
/*     */     //   180: caload
/*     */     //   181: sipush #22816
/*     */     //   184: ixor
/*     */     //   185: i2c
/*     */     //   186: castore
/*     */     //   187: sipush #12887
/*     */     //   190: iconst_1
/*     */     //   191: iconst_0
/*     */     //   192: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   195: iconst_1
/*     */     //   196: anewarray java/lang/Class
/*     */     //   199: dup
/*     */     //   200: iconst_0
/*     */     //   201: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
/*     */     //   204: aastore
/*     */     //   205: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   208: astore #12
/*     */     //   210: aload #11
/*     */     //   212: ldc_w '䝞嬥櫋◴䪀褒?㼜烳ꃣ꽫䝲'
/*     */     //   215: invokevirtual toCharArray : ()[C
/*     */     //   218: dup
/*     */     //   219: dup
/*     */     //   220: bipush #7
/*     */     //   222: dup_x1
/*     */     //   223: caload
/*     */     //   224: sipush #24420
/*     */     //   227: ixor
/*     */     //   228: i2c
/*     */     //   229: castore
/*     */     //   230: sipush #23275
/*     */     //   233: iconst_1
/*     */     //   234: iconst_2
/*     */     //   235: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   238: iconst_1
/*     */     //   239: anewarray java/lang/Class
/*     */     //   242: dup
/*     */     //   243: iconst_0
/*     */     //   244: ldc java/lang/String
/*     */     //   246: aastore
/*     */     //   247: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   250: astore #13
/*     */     //   252: aload #11
/*     */     //   254: ldc_w '䔎㸎逌鯟馜䐾唇ࡧ뉑ワ续湹ퟠ≫岥ꆅ몇軞쟁谖ྶז类'
/*     */     //   257: invokevirtual toCharArray : ()[C
/*     */     //   260: dup
/*     */     //   261: dup
/*     */     //   262: iconst_1
/*     */     //   263: dup_x1
/*     */     //   264: caload
/*     */     //   265: sipush #12801
/*     */     //   268: ixor
/*     */     //   269: i2c
/*     */     //   270: castore
/*     */     //   271: sipush #22000
/*     */     //   274: iconst_1
/*     */     //   275: iconst_1
/*     */     //   276: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   279: iconst_0
/*     */     //   280: anewarray java/lang/Class
/*     */     //   283: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   286: astore #14
/*     */     //   288: aload #11
/*     */     //   290: ldc_w '矣뉻㮯淿ৠ뽹栻༤㤄緙髼駥얧瑇鿱ŉ'
/*     */     //   293: invokevirtual toCharArray : ()[C
/*     */     //   296: dup
/*     */     //   297: dup
/*     */     //   298: bipush #7
/*     */     //   300: dup_x1
/*     */     //   301: caload
/*     */     //   302: sipush #18713
/*     */     //   305: ixor
/*     */     //   306: i2c
/*     */     //   307: castore
/*     */     //   308: sipush #20632
/*     */     //   311: iconst_1
/*     */     //   312: iconst_5
/*     */     //   313: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   316: iconst_1
/*     */     //   317: anewarray java/lang/Class
/*     */     //   320: dup
/*     */     //   321: iconst_0
/*     */     //   322: ldc [B
/*     */     //   324: aastore
/*     */     //   325: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   328: astore #15
/*     */     //   330: new me/konsolas/aac/i_
/*     */     //   333: dup
/*     */     //   334: aload #10
/*     */     //   336: aload #11
/*     */     //   338: iload #5
/*     */     //   340: aload #12
/*     */     //   342: aload #13
/*     */     //   344: aload #14
/*     */     //   346: aload #15
/*     */     //   348: iload #6
/*     */     //   350: i2c
/*     */     //   351: iload #7
/*     */     //   353: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;CI)V
/*     */     //   356: areturn
/*     */     //   357: astore #12
/*     */     //   359: new java/lang/IllegalStateException
/*     */     //   362: dup
/*     */     //   363: new java/lang/StringBuilder
/*     */     //   366: dup
/*     */     //   367: invokespecial <init> : ()V
/*     */     //   370: ldc_w 'ཱ⳹༈䌛?ꯊ减䁬雾ｱ萕䛨펩脂眣?됀娎暨㌉ꉒ弍酃慒쵸ㄫ䍂㟾똝雁蛕鉽䂩쒿깮䕁ༀ'
/*     */     //   373: invokevirtual toCharArray : ()[C
/*     */     //   376: dup
/*     */     //   377: dup
/*     */     //   378: bipush #19
/*     */     //   380: dup_x1
/*     */     //   381: caload
/*     */     //   382: sipush #3171
/*     */     //   385: ixor
/*     */     //   386: i2c
/*     */     //   387: castore
/*     */     //   388: sipush #3023
/*     */     //   391: iconst_0
/*     */     //   392: iconst_0
/*     */     //   393: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   399: getstatic android/os/Build$VERSION.SDK_INT : I
/*     */     //   402: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   405: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   408: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   411: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #119	-> 70
/*     */     //   #60	-> 78
/*     */     //   #89	-> 90
/*     */     //   #71	-> 121
/*     */     //   #27	-> 152
/*     */     //   #73	-> 155
/*     */     //   #113	-> 157
/*     */     //   #48	-> 159
/*     */     //   #80	-> 167
/*     */     //   #101	-> 210
/*     */     //   #111	-> 252
/*     */     //   #54	-> 288
/*     */     //   #23	-> 330
/*     */     //   #43	-> 357
/*     */     //   #28	-> 359
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   70	80	80	java/lang/ClassNotFoundException
/*     */     //   90	152	155	java/lang/ClassNotFoundException
/*     */     //   167	356	357	java/lang/NoSuchMethodException
/*     */   }
/*     */   
/*     */   static {
/*     */     long l = n ^ 0x5EA181B4F57FL;
/*     */     "຺좘꾘帍崳벷㝳ྱ頻ꅥ᭦䂳鳀뙤鋾뒉팹廹⚴䑁".toCharArray()[10] = (char)("຺좘꾘帍崳벷㝳ྱ頻ꅥ᭦䂳鳀뙤鋾뒉팹廹⚴䑁".toCharArray()[10] ^ 0x72DB);
/*     */     "ⷵ筺㠆暧".toCharArray()[1] = (char)("ⷵ筺㠆暧".toCharArray()[1] ^ 0x2DC7);
/*     */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*     */     for (byte b1 = 1; b1 < 8; b1++)
/*     */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*     */     Cipher cipher;
/*     */     (cipher = Cipher.getInstance(fW$gy.A("຺좘꾘帍崳벷㝳ྱ頻ꅥ᭦䂳鳀뙤鋾뒉팹廹⚴䑁".toCharArray(), (short)14783, true, 0))).init(2, SecretKeyFactory.getInstance(fW$gy.A("ⷵ筺㠆暧".toCharArray(), (short)22134, true, 1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*     */     String[] arrayOfString = new String[18];
/*     */     boolean bool = false;
/*     */     "슎벟㍌ ὞顑ꈌឣ죻႒濐ᚅ望셊峃멭訨奬訑䡹䂎뭄믽䜕쐿巘↱刁靪焸ﲞ㠨縎欘퉕䪢ず鈬賚瀨츧ൟ⧫竻筍䤼⟲Ⱘ栒鳅턒덨ഞ쉐ṗ䖛䃎슫쳛릫⃜끒퐨逐疊溜꺓鯁꒾椪뜱Ꟗ娺盪牻貀ಥ䪅腀썕廋ꤒ屒䂶ꥧ蓏㚥ڟ綁ﮦ㷪ⶤ䇮ⵈ䜶᧢獨쉊罷୞溽?呁䟶₷꘩?ߖ༄Sꟕ旐⚱碇ᾼ䝦Ꙋ絒銼瀖칱稲猇?ঙ䇝ꌑⳟ厛䚪葈䈃䳻꜉〵࿅飻⧇릕ꪫ窙顶嗺샎?Σ볂쵟祦ꡈᆲ滪觔ꐱ宬䤽Ꞓ髦ﶡ夸蔂᥵鱆燄嘾觇Պ恸늌း⪮鍧?垩隉㐌㨰걾㉺̬蕭L凥㹂᷿䄬⠵ŵ䔰沫㐏㣚㍱佄?㱊升ᤓ鶇槩骮ሌꅢ쮑곣➯㿋퇏鴉ꯗ㾟仫ᒝ㌭褦Ⓨꭩ祈퐮펽峅঍⍶舼嗢谭貋椁䌘㤀蕈刹챌ꬕ㭿鱮鄰⾋㳕⢶Ꙍ吾䕰໱粧䲌褓ꊲ㝩焘뇘嬹㊳烤叧厢財廠ඡ伃豗疳雮?৻Ⳅ쓍駪︄颤㗖ᄄ圠鳀銧碶ᦴᱬ큣⣻꠽Ὶ꽆跐ꂝ逽妒䘗귕ꦍ擰鋀胠霟聯才袌异်숺梩䑁୻ܚ囻㍞춤檪癔謭锳˕ࡪ핻٠푪É?覟ﻆ컈⒙촲䀏䍲䳖锼ߊꕸ۝薏䎶彲␵ゎ爹說邋㴏᭺ᓣ㒊ﵮ벪蘠飣㶴춇ॠ帀吙⿐ຢ㒛캐䚮굍쮡짣椩桤❾㐢⤬瀌꤬芄츍逹鈳費븼ꨖ揙址ᄞ?龡媥ꬮ셭詢祋⫩ʜ뻒ﺾᩏ꧅怍?♓迪縐㻉ﻝ뜬粎Ⅲ幣㒾₇뢤軇堖ꡯ왮ẳ䋽ⰵ҂휔绒ঈ輜鉊໇뻃녉᧳ᆷ?䅡띾屪藸网輽袚焠｛䢽扪왥Ẏ૙䉰?⚫᠊䖛뫤झ⯸₹눵Ⓚ륷둳怅Ⓟ牼뢢ᇣ峼㓱⪹쨯줝嫙⣧卿떶䝩ꁀꊲ⮛⧘몛ึ¹ꟊႫ瘪빩ﾕ೫䎝帑䝱潘㳒趸ᆕ얔䜝Ჸ鐸긻ḏ߯鄠⸪⃀켙ꎗ㍷™漭⾪惉ፌ簂㔙蔃⮛巺腞벨폱돼჉ꥏݯ鴈億ೃ뗆붎࿨ꢗⷙ㳠于ଵ疡拾⡘ⷦ䧝࣮⧱쇙캊ំ뾈ঠ䑂ꋪ與ᩍ짭䁰ᘳ雩൯⚐훵?䃮晎ጲ뙚䗤쮥녽뛴⽚唚Ⴡ騥귔ꏦઝ类ᛱ둫嚤۬ึசퟶ鷝䴅鲸涄욪呪螄瀛鵄俑몘ٙ?ᢷ睿ⱴ곮抧?⇉Ἐ褊뮾쪘ྉ鱓ೊ꺢왆㰳捔ㇸݷ阐ᬮ?蓌풗㱉⮇劳덞࡚፥෇鶒啲쮦쌳⏷枎秣鯺Ⰴ襄嵏挺䅲".toCharArray()[449] = (char)("슎벟㍌ ὞顑ꈌឣ죻႒濐ᚅ望셊峃멭訨奬訑䡹䂎뭄믽䜕쐿巘↱刁靪焸ﲞ㠨縎欘퉕䪢ず鈬賚瀨츧ൟ⧫竻筍䤼⟲Ⱘ栒鳅턒덨ഞ쉐ṗ䖛䃎슫쳛릫⃜끒퐨逐疊溜꺓鯁꒾椪뜱Ꟗ娺盪牻貀ಥ䪅腀썕廋ꤒ屒䂶ꥧ蓏㚥ڟ綁ﮦ㷪ⶤ䇮ⵈ䜶᧢獨쉊罷୞溽?呁䟶₷꘩?ߖ༄Sꟕ旐⚱碇ᾼ䝦Ꙋ絒銼瀖칱稲猇?ঙ䇝ꌑⳟ厛䚪葈䈃䳻꜉〵࿅飻⧇릕ꪫ窙顶嗺샎?Σ볂쵟祦ꡈᆲ滪觔ꐱ宬䤽Ꞓ髦ﶡ夸蔂᥵鱆燄嘾觇Պ恸늌း⪮鍧?垩隉㐌㨰걾㉺̬蕭L凥㹂᷿䄬⠵ŵ䔰沫㐏㣚㍱佄?㱊升ᤓ鶇槩骮ሌꅢ쮑곣➯㿋퇏鴉ꯗ㾟仫ᒝ㌭褦Ⓨꭩ祈퐮펽峅঍⍶舼嗢谭貋椁䌘㤀蕈刹챌ꬕ㭿鱮鄰⾋㳕⢶Ꙍ吾䕰໱粧䲌褓ꊲ㝩焘뇘嬹㊳烤叧厢財廠ඡ伃豗疳雮?৻Ⳅ쓍駪︄颤㗖ᄄ圠鳀銧碶ᦴᱬ큣⣻꠽Ὶ꽆跐ꂝ逽妒䘗귕ꦍ擰鋀胠霟聯才袌异်숺梩䑁୻ܚ囻㍞춤檪癔謭锳˕ࡪ핻٠푪É?覟ﻆ컈⒙촲䀏䍲䳖锼ߊꕸ۝薏䎶彲␵ゎ爹說邋㴏᭺ᓣ㒊ﵮ벪蘠飣㶴춇ॠ帀吙⿐ຢ㒛캐䚮굍쮡짣椩桤❾㐢⤬瀌꤬芄츍逹鈳費븼ꨖ揙址ᄞ?龡媥ꬮ셭詢祋⫩ʜ뻒ﺾᩏ꧅怍?♓迪縐㻉ﻝ뜬粎Ⅲ幣㒾₇뢤軇堖ꡯ왮ẳ䋽ⰵ҂휔绒ঈ輜鉊໇뻃녉᧳ᆷ?䅡띾屪藸网輽袚焠｛䢽扪왥Ẏ૙䉰?⚫᠊䖛뫤झ⯸₹눵Ⓚ륷둳怅Ⓟ牼뢢ᇣ峼㓱⪹쨯줝嫙⣧卿떶䝩ꁀꊲ⮛⧘몛ึ¹ꟊႫ瘪빩ﾕ೫䎝帑䝱潘㳒趸ᆕ얔䜝Ჸ鐸긻ḏ߯鄠⸪⃀켙ꎗ㍷™漭⾪惉ፌ簂㔙蔃⮛巺腞벨폱돼჉ꥏݯ鴈億ೃ뗆붎࿨ꢗⷙ㳠于ଵ疡拾⡘ⷦ䧝࣮⧱쇙캊ំ뾈ঠ䑂ꋪ與ᩍ짭䁰ᘳ雩൯⚐훵?䃮晎ጲ뙚䗤쮥녽뛴⽚唚Ⴡ騥귔ꏦઝ类ᛱ둫嚤۬ึசퟶ鷝䴅鲸涄욪呪螄瀛鵄俑몘ٙ?ᢷ睿ⱴ곮抧?⇉Ἐ褊뮾쪘ྉ鱓ೊ꺢왆㰳捔ㇸݷ阐ᬮ?蓌풗㱉⮇劳덞࡚፥෇鶒啲쮦쌳⏷枎秣鯺Ⰴ襄嵏挺䅲".toCharArray()[449] ^ 0x2AAA);
/*     */     String str;
/*     */     int i = (str = fW$gy.A("슎벟㍌ ὞顑ꈌឣ죻႒濐ᚅ望셊峃멭訨奬訑䡹䂎뭄믽䜕쐿巘↱刁靪焸ﲞ㠨縎欘퉕䪢ず鈬賚瀨츧ൟ⧫竻筍䤼⟲Ⱘ栒鳅턒덨ഞ쉐ṗ䖛䃎슫쳛릫⃜끒퐨逐疊溜꺓鯁꒾椪뜱Ꟗ娺盪牻貀ಥ䪅腀썕廋ꤒ屒䂶ꥧ蓏㚥ڟ綁ﮦ㷪ⶤ䇮ⵈ䜶᧢獨쉊罷୞溽?呁䟶₷꘩?ߖ༄Sꟕ旐⚱碇ᾼ䝦Ꙋ絒銼瀖칱稲猇?ঙ䇝ꌑⳟ厛䚪葈䈃䳻꜉〵࿅飻⧇릕ꪫ窙顶嗺샎?Σ볂쵟祦ꡈᆲ滪觔ꐱ宬䤽Ꞓ髦ﶡ夸蔂᥵鱆燄嘾觇Պ恸늌း⪮鍧?垩隉㐌㨰걾㉺̬蕭L凥㹂᷿䄬⠵ŵ䔰沫㐏㣚㍱佄?㱊升ᤓ鶇槩骮ሌꅢ쮑곣➯㿋퇏鴉ꯗ㾟仫ᒝ㌭褦Ⓨꭩ祈퐮펽峅঍⍶舼嗢谭貋椁䌘㤀蕈刹챌ꬕ㭿鱮鄰⾋㳕⢶Ꙍ吾䕰໱粧䲌褓ꊲ㝩焘뇘嬹㊳烤叧厢財廠ඡ伃豗疳雮?৻Ⳅ쓍駪︄颤㗖ᄄ圠鳀銧碶ᦴᱬ큣⣻꠽Ὶ꽆跐ꂝ逽妒䘗귕ꦍ擰鋀胠霟聯才袌异်숺梩䑁୻ܚ囻㍞춤檪癔謭锳˕ࡪ핻٠푪É?覟ﻆ컈⒙촲䀏䍲䳖锼ߊꕸ۝薏䎶彲␵ゎ爹說邋㴏᭺ᓣ㒊ﵮ벪蘠飣㶴춇ॠ帀吙⿐ຢ㒛캐䚮굍쮡짣椩桤❾㐢⤬瀌꤬芄츍逹鈳費븼ꨖ揙址ᄞ?龡媥ꬮ셭詢祋⫩ʜ뻒ﺾᩏ꧅怍?♓迪縐㻉ﻝ뜬粎Ⅲ幣㒾₇뢤軇堖ꡯ왮ẳ䋽ⰵ҂휔绒ঈ輜鉊໇뻃녉᧳ᆷ?䅡띾屪藸网輽袚焠｛䢽扪왥Ẏ૙䉰?⚫᠊䖛뫤झ⯸₹눵Ⓚ륷둳怅Ⓟ牼뢢ᇣ峼㓱⪹쨯줝嫙⣧卿떶䝩ꁀꊲ⮛⧘몛ึ¹ꟊႫ瘪빩ﾕ೫䎝帑䝱潘㳒趸ᆕ얔䜝Ჸ鐸긻ḏ߯鄠⸪⃀켙ꎗ㍷™漭⾪惉ፌ簂㔙蔃⮛巺腞벨폱돼჉ꥏݯ鴈億ೃ뗆붎࿨ꢗⷙ㳠于ଵ疡拾⡘ⷦ䧝࣮⧱쇙캊ំ뾈ঠ䑂ꋪ與ᩍ짭䁰ᘳ雩൯⚐훵?䃮晎ጲ뙚䗤쮥녽뛴⽚唚Ⴡ騥귔ꏦઝ类ᛱ둫嚤۬ึசퟶ鷝䴅鲸涄욪呪螄瀛鵄俑몘ٙ?ᢷ睿ⱴ곮抧?⇉Ἐ褊뮾쪘ྉ鱓ೊ꺢왆㰳捔ㇸݷ阐ᬮ?蓌풗㱉⮇劳덞࡚፥෇鶒啲쮦쌳⏷枎秣鯺Ⰴ襄嵏挺䅲".toCharArray(), (short)31238, false, 2)).length();
/*     */     byte b2 = 24;
/*     */     byte b = -1;
/*     */     while (true);
/*     */   }
/*     */   
/*     */   private static Throwable a(Throwable paramThrowable) {
/*     */     return paramThrowable;
/*     */   }
/*     */   
/*     */   private static String b(byte[] paramArrayOfbyte) {
/*     */     byte b1 = 0;
/*     */     int i;
/*     */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*     */     for (byte b2 = 0; b2 < i; b2++) {
/*     */       int j;
/*     */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*     */         arrayOfChar[b1++] = (char)j;
/*     */       } else if (j < 224) {
/*     */         char c = (char)((char)(j & 0x1F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } else if (b2 < i - 2) {
/*     */         char c = (char)((char)(j & 0xF) << 12);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } 
/*     */     } 
/*     */     return new String(arrayOfChar, 0, b1);
/*     */   }
/*     */   
/*     */   private static String b(int paramInt, long paramLong) {
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x746A;
/*     */     if (t[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])u.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           "湫퐩騁䍜㺞᷏鹠채앁?ꛞ㊁煛铿펣茨ಔ镻ൟ".toCharArray()[16] = (char)("湫퐩騁䍜㺞᷏鹠채앁?ꛞ㊁煛铿펣茨ಔ镻ൟ".toCharArray()[16] ^ 0x519E);
/*     */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("湫퐩騁䍜㺞᷏鹠채앁?ꛞ㊁煛铿펣茨ಔ镻ൟ".toCharArray(), (short)19922, false, true));
/*     */           "몽裢別".toCharArray()[2] = (char)("몽裢別".toCharArray()[2] ^ 0xEFD);
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("몽裢別".toCharArray(), (short)31774, false, false));
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           u.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         "ꄗ﶑컻㣟酼ോ닝뱭텪脙킬ॹ뭗㵞൰醷쑎穀".toCharArray()[4] = (char)("ꄗ﶑컻㣟酼ോ닝뱭텪脙킬ॹ뭗㵞൰醷쑎穀".toCharArray()[4] ^ 0x42D2);
/*     */         throw new RuntimeException(dP$dt.X("ꄗ﶑컻㣟酼ോ닝뱭텪脙킬ॹ뭗㵞൰醷쑎穀".toCharArray(), (short)25951, true, false), exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       "翌鳪ք⪢億켥딤ވㅱ凍".toCharArray()[0] = (char)("翌鳪ք⪢億켥딤ވㅱ凍".toCharArray()[0] ^ 0x4BE2);
/*     */       byte[] arrayOfByte2 = s[i].getBytes(dP$dt.X("翌鳪ք⪢億켥딤ވㅱ凍".toCharArray(), (short)1359, true, false));
/*     */       t[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return t[i];
/*     */   }
/*     */   
/*     */   private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*     */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*     */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*     */     String str = b(i, l);
/*     */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*     */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*     */     return str;
/*     */   }
/*     */   
/*     */   private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*     */     // Byte code:
/*     */     //   0: new java/lang/invoke/MutableCallSite
/*     */     //   3: dup
/*     */     //   4: aload_2
/*     */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*     */     //   8: astore_3
/*     */     //   9: aload_3
/*     */     //   10: ldc_w
/*     */     //   13: ldc_w [Ljava/lang/Object;
/*     */     //   16: aload_2
/*     */     //   17: invokevirtual parameterCount : ()I
/*     */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*     */     //   23: iconst_0
/*     */     //   24: iconst_3
/*     */     //   25: anewarray java/lang/Object
/*     */     //   28: dup
/*     */     //   29: iconst_0
/*     */     //   30: aload_0
/*     */     //   31: aastore
/*     */     //   32: dup
/*     */     //   33: iconst_1
/*     */     //   34: aload_3
/*     */     //   35: aastore
/*     */     //   36: dup
/*     */     //   37: iconst_2
/*     */     //   38: aload_1
/*     */     //   39: aastore
/*     */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*     */     //   43: aload_2
/*     */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*     */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*     */     //   50: goto -> 171
/*     */     //   53: astore #4
/*     */     //   55: new java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: new java/lang/StringBuilder
/*     */     //   62: dup
/*     */     //   63: invokespecial <init> : ()V
/*     */     //   66: ldc_w 'ྡ묐鈕鉄眘㟖왛泼⑭Ƒᡕꭇ?柘桦䄚ᯁ'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: bipush #6
/*     */     //   76: dup_x1
/*     */     //   77: caload
/*     */     //   78: sipush #17463
/*     */     //   81: ixor
/*     */     //   82: i2c
/*     */     //   83: castore
/*     */     //   84: sipush #16471
/*     */     //   87: iconst_1
/*     */     //   88: iconst_4
/*     */     //   89: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w '䠓闦˃保'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_1
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #6605
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #27691
/*     */     //   115: iconst_0
/*     */     //   116: iconst_4
/*     */     //   117: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: aload_1
/*     */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   127: ldc_w '?䥡'
/*     */     //   130: invokevirtual toCharArray : ()[C
/*     */     //   133: dup
/*     */     //   134: dup
/*     */     //   135: iconst_2
/*     */     //   136: dup_x1
/*     */     //   137: caload
/*     */     //   138: sipush #7189
/*     */     //   141: ixor
/*     */     //   142: i2c
/*     */     //   143: castore
/*     */     //   144: sipush #506
/*     */     //   147: iconst_0
/*     */     //   148: iconst_4
/*     */     //   149: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   155: aload_2
/*     */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   165: aload #4
/*     */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   170: athrow
/*     */     //   171: aload_3
/*     */     //   172: areturn
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	50	53	java/lang/Exception
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */