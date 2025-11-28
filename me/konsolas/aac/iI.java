/*    */ package me.konsolas.aac;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.security.Provider;
/*    */ import javax.annotation.Nullable;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ import javax.net.ssl.SSLSocket;
/*    */ import javax.net.ssl.SSLSocketFactory;
/*    */ 
/*    */ public class ii extends io {
/*    */   private Provider a() {
/* 17 */     return Conscrypt.newProviderBuilder().provideTrustManager().build();
/*    */   }
/*    */   
/*    */   private static final long e = nc.a(8571177321085657676L, 5296314365848090048L, MethodHandles.lookup().lookupClass()).a(256822402496498L);
/*    */   private static final String[] f;
/*    */   private static final String[] g;
/*    */   private static final Map h = new HashMap<>(13);
/*    */   
/*    */   public void a(long paramLong, SSLSocketFactory paramSSLSocketFactory) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w 7067353205058977910
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)I
/*    */     //   9: istore #4
/*    */     //   11: aload_3
/*    */     //   12: iload #4
/*    */     //   14: lload_1
/*    */     //   15: lconst_0
/*    */     //   16: lcmp
/*    */     //   17: ifle -> 57
/*    */     //   20: ifne -> 56
/*    */     //   23: invokestatic isConscrypt : (Ljavax/net/ssl/SSLSocketFactory;)Z
/*    */     //   26: ifeq -> 60
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w 7079006440189080575
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   41: athrow
/*    */     //   42: aload_3
/*    */     //   43: goto -> 56
/*    */     //   46: ldc2_w 7079006440189080575
/*    */     //   49: lload_1
/*    */     //   50: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   55: athrow
/*    */     //   56: iconst_1
/*    */     //   57: invokestatic setUseEngineSocket : (Ljavax/net/ssl/SSLSocketFactory;Z)V
/*    */     //   60: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 11
/*    */     //   #19	-> 42
/*    */     //   #18	-> 60
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   11	29	32	java/lang/UnsupportedOperationException
/*    */     //   23	43	46	java/lang/UnsupportedOperationException
/*    */   }
/*    */   
/*    */   public static ii a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ii.e : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: ldc '뉊䂹囲煸煰裖킜鱻㸅镹ᕤ낙ﱹ惭ܥ箳暽猎촭꜋䵥'
/*    */     //   8: invokevirtual toCharArray : ()[C
/*    */     //   11: dup
/*    */     //   12: dup
/*    */     //   13: bipush #20
/*    */     //   15: dup_x1
/*    */     //   16: caload
/*    */     //   17: sipush #14590
/*    */     //   20: ixor
/*    */     //   21: i2c
/*    */     //   22: castore
/*    */     //   23: sipush #17039
/*    */     //   26: iconst_1
/*    */     //   27: iconst_0
/*    */     //   28: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   31: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   34: pop
/*    */     //   35: invokestatic isAvailable : ()Z
/*    */     //   38: ifne -> 53
/*    */     //   41: aconst_null
/*    */     //   42: areturn
/*    */     //   43: ldc2_w -1957989085724756719
/*    */     //   46: lload_0
/*    */     //   47: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   52: athrow
/*    */     //   53: new me/konsolas/aac/ii
/*    */     //   56: dup
/*    */     //   57: invokespecial <init> : ()V
/*    */     //   60: areturn
/*    */     //   61: astore_2
/*    */     //   62: aconst_null
/*    */     //   63: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 6
/*    */     //   #6	-> 35
/*    */     //   #14	-> 41
/*    */     //   #27	-> 53
/*    */     //   #15	-> 61
/*    */     //   #30	-> 62
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   6	42	61	java/lang/ClassNotFoundException
/*    */     //   6	43	43	java/lang/UnsupportedOperationException
/*    */     //   53	60	61	java/lang/ClassNotFoundException
/*    */   }
/*    */   
/*    */   public void a(long paramLong, SSLSocket paramSSLSocket, String paramString, List paramList) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 113047703779584
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 3358563507627899063
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #10
/*    */     //   27: aload_3
/*    */     //   28: invokestatic isConscrypt : (Ljavax/net/ssl/SSLSocket;)Z
/*    */     //   31: ifeq -> 114
/*    */     //   34: aload #4
/*    */     //   36: ifnull -> 76
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w 3420469063553744565
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   51: athrow
/*    */     //   52: aload_3
/*    */     //   53: iconst_1
/*    */     //   54: invokestatic setUseSessionTickets : (Ljavax/net/ssl/SSLSocket;Z)V
/*    */     //   57: aload_3
/*    */     //   58: aload #4
/*    */     //   60: invokestatic setHostname : (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;)V
/*    */     //   63: goto -> 76
/*    */     //   66: ldc2_w 3420469063553744565
/*    */     //   69: lload_1
/*    */     //   70: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   75: athrow
/*    */     //   76: aload #5
/*    */     //   78: lload #8
/*    */     //   80: invokestatic a : (Ljava/util/List;J)Ljava/util/List;
/*    */     //   83: astore #11
/*    */     //   85: aload_3
/*    */     //   86: aload #11
/*    */     //   88: iconst_0
/*    */     //   89: anewarray java/lang/String
/*    */     //   92: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*    */     //   97: checkcast [Ljava/lang/String;
/*    */     //   100: invokestatic setApplicationProtocols : (Ljavax/net/ssl/SSLSocket;[Ljava/lang/String;)V
/*    */     //   103: lload_1
/*    */     //   104: lconst_0
/*    */     //   105: lcmp
/*    */     //   106: iflt -> 125
/*    */     //   109: iload #10
/*    */     //   111: ifne -> 138
/*    */     //   114: aload_0
/*    */     //   115: lload #6
/*    */     //   117: aload_3
/*    */     //   118: aload #4
/*    */     //   120: aload #5
/*    */     //   122: invokespecial a : (JLjavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
/*    */     //   125: goto -> 138
/*    */     //   128: ldc2_w 3420469063553744565
/*    */     //   131: lload_1
/*    */     //   132: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   137: athrow
/*    */     //   138: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 27
/*    */     //   #12	-> 34
/*    */     //   #32	-> 52
/*    */     //   #5	-> 57
/*    */     //   #26	-> 76
/*    */     //   #4	-> 85
/*    */     //   #25	-> 103
/*    */     //   #31	-> 114
/*    */     //   #20	-> 138
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   34	63	66	java/io/IOException
/*    */     //   85	125	128	java/io/IOException
/*    */   }
/*    */   
/*    */   public SSLContext a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: sipush #18346
/*    */     //   3: ldc2_w 954377133011312735
/*    */     //   6: lload_1
/*    */     //   7: lxor
/*    */     //   8: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   13: aload_0
/*    */     //   14: invokespecial a : ()Ljava/security/Provider;
/*    */     //   17: invokestatic getInstance : (Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;
/*    */     //   20: areturn
/*    */     //   21: astore_3
/*    */     //   22: sipush #20130
/*    */     //   25: ldc2_w 246592190906083668
/*    */     //   28: lload_1
/*    */     //   29: lxor
/*    */     //   30: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   35: aload_0
/*    */     //   36: invokespecial a : ()Ljava/security/Provider;
/*    */     //   39: invokestatic getInstance : (Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;
/*    */     //   42: areturn
/*    */     //   43: astore #4
/*    */     //   45: new java/lang/IllegalStateException
/*    */     //   48: dup
/*    */     //   49: sipush #10840
/*    */     //   52: ldc2_w 386318196653772201
/*    */     //   55: lload_1
/*    */     //   56: lxor
/*    */     //   57: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   62: aload_3
/*    */     //   63: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   66: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 0
/*    */     //   #21	-> 21
/*    */     //   #22	-> 22
/*    */     //   #11	-> 43
/*    */     //   #36	-> 45
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	20	21	java/security/NoSuchAlgorithmException
/*    */     //   22	42	43	java/security/NoSuchAlgorithmException
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public String a(long paramLong, SSLSocket paramSSLSocket) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: pop2
/*    */     //   9: ldc2_w -8161329373987754785
/*    */     //   12: lload_1
/*    */     //   13: <illegal opcode> w : (JJ)I
/*    */     //   18: istore #6
/*    */     //   20: aload_3
/*    */     //   21: iload #6
/*    */     //   23: ifne -> 59
/*    */     //   26: invokestatic isConscrypt : (Ljavax/net/ssl/SSLSocket;)Z
/*    */     //   29: ifeq -> 63
/*    */     //   32: goto -> 45
/*    */     //   35: ldc2_w -8172691101173293226
/*    */     //   38: lload_1
/*    */     //   39: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   44: athrow
/*    */     //   45: aload_3
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w -8172691101173293226
/*    */     //   52: lload_1
/*    */     //   53: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   58: athrow
/*    */     //   59: invokestatic getApplicationProtocol : (Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
/*    */     //   62: areturn
/*    */     //   63: aload_0
/*    */     //   64: lload #4
/*    */     //   66: aload_3
/*    */     //   67: invokespecial a : (JLjavax/net/ssl/SSLSocket;)Ljava/lang/String;
/*    */     //   70: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 20
/*    */     //   #16	-> 45
/*    */     //   #29	-> 63
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	32	35	java/lang/UnsupportedOperationException
/*    */     //   26	46	49	java/lang/UnsupportedOperationException
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public X509TrustManager a(SSLSocketFactory paramSSLSocketFactory, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 133981168253026
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 2692040239546697534
/*    */     //   19: lload_2
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_1
/*    */     //   28: iload #8
/*    */     //   30: ifne -> 91
/*    */     //   33: invokestatic isConscrypt : (Ljavax/net/ssl/SSLSocketFactory;)Z
/*    */     //   36: ifne -> 70
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w 2699321696272479415
/*    */     //   45: lload_2
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   51: athrow
/*    */     //   52: aload_0
/*    */     //   53: aload_1
/*    */     //   54: lload #4
/*    */     //   56: invokespecial a : (Ljavax/net/ssl/SSLSocketFactory;J)Ljavax/net/ssl/X509TrustManager;
/*    */     //   59: areturn
/*    */     //   60: ldc2_w 2699321696272479415
/*    */     //   63: lload_2
/*    */     //   64: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   69: athrow
/*    */     //   70: lload #6
/*    */     //   72: aload_1
/*    */     //   73: ldc java/lang/Object
/*    */     //   75: sipush #31865
/*    */     //   78: ldc2_w 5464028332625924300
/*    */     //   81: lload_2
/*    */     //   82: lxor
/*    */     //   83: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   88: invokestatic a : (JLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   91: astore #9
/*    */     //   93: aload #9
/*    */     //   95: iload #8
/*    */     //   97: ifne -> 151
/*    */     //   100: ifnull -> 155
/*    */     //   103: goto -> 116
/*    */     //   106: ldc2_w 2699321696272479415
/*    */     //   109: lload_2
/*    */     //   110: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   115: athrow
/*    */     //   116: lload #6
/*    */     //   118: aload #9
/*    */     //   120: ldc javax/net/ssl/X509TrustManager
/*    */     //   122: sipush #28883
/*    */     //   125: ldc2_w 4390889811148643429
/*    */     //   128: lload_2
/*    */     //   129: lxor
/*    */     //   130: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   135: invokestatic a : (JLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   138: goto -> 151
/*    */     //   141: ldc2_w 2699321696272479415
/*    */     //   144: lload_2
/*    */     //   145: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   150: athrow
/*    */     //   151: checkcast javax/net/ssl/X509TrustManager
/*    */     //   154: areturn
/*    */     //   155: aconst_null
/*    */     //   156: areturn
/*    */     //   157: astore #9
/*    */     //   159: new java/lang/UnsupportedOperationException
/*    */     //   162: dup
/*    */     //   163: sipush #21633
/*    */     //   166: ldc2_w 5886221456147298355
/*    */     //   169: lload_2
/*    */     //   170: lxor
/*    */     //   171: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   176: aload #9
/*    */     //   178: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   181: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 27
/*    */     //   #2	-> 52
/*    */     //   #23	-> 70
/*    */     //   #10	-> 88
/*    */     //   #9	-> 93
/*    */     //   #13	-> 116
/*    */     //   #3	-> 155
/*    */     //   #24	-> 157
/*    */     //   #1	-> 159
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/lang/Exception
/*    */     //   33	60	60	java/lang/Exception
/*    */     //   70	154	157	java/lang/Exception
/*    */     //   93	103	106	java/lang/Exception
/*    */     //   100	138	141	java/lang/Exception
/*    */     //   155	156	157	java/lang/Exception
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = e ^ 0x12DB9AE05D8FL;
/*    */     "ಀᴣ뚳෤ﱓ靭衈䨭蹅?熩筠ꮥᎌ鲜寄罗".toCharArray()[12] = (char)("ಀᴣ뚳෤ﱓ靭衈䨭蹅?熩筠ꮥᎌ鲜寄罗".toCharArray()[12] ^ 0x6A62);
/*    */     "ꩣ褭潩".toCharArray()[1] = (char)("ꩣ褭潩".toCharArray()[1] ^ 0x1E2D);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(da$gx.U("ಀᴣ뚳෤ﱓ靭衈䨭蹅?熩筠ꮥᎌ鲜寄罗".toCharArray(), (short)22065, true, true))).init(2, SecretKeyFactory.getInstance(da$gx.U("ꩣ褭潩".toCharArray(), (short)29383, true, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[6];
/*    */     boolean bool = false;
/*    */     "ﱪ댉᠄঴䝟㲸༻擲蝥䥺℗嬤吋?뎜铰ꖏ鋃༝ԋ䧐㭅ᄎ뱁䵶ⲭ휃ソථ쮆筪냎㍻?멫掜蕽铁됽⍧䨞倸榙恃ꄘ蟇㫀矻攒ﺢ?군㺇糹兞뱺虝꫌?హ扊闩ᘍ駓悿靥訖ꐃ﹨᭾禊ﻎꚭ助荴焝㜆?㆐졠꘍乻횕鈖撦ⴰ値糅".toCharArray()[56] = (char)("ﱪ댉᠄঴䝟㲸༻擲蝥䥺℗嬤吋?뎜铰ꖏ鋃༝ԋ䧐㭅ᄎ뱁䵶ⲭ휃ソථ쮆筪냎㍻?멫掜蕽铁됽⍧䨞倸榙恃ꄘ蟇㫀矻攒ﺢ?군㺇糹兞뱺虝꫌?హ扊闩ᘍ駓悿靥訖ꐃ﹨᭾禊ﻎꚭ助荴焝㜆?㆐졠꘍乻횕鈖撦ⴰ値糅".toCharArray()[56] ^ 0x7E79);
/*    */     String str;
/*    */     int i = (str = da$gx.U("ﱪ댉᠄঴䝟㲸༻擲蝥䥺℗嬤吋?뎜铰ꖏ鋃༝ԋ䧐㭅ᄎ뱁䵶ⲭ휃ソථ쮆筪냎㍻?멫掜蕽铁됽⍧䨞倸榙恃ꄘ蟇㫀矻攒ﺢ?군㺇糹兞뱺虝꫌?హ扊闩ᘍ駓悿靥訖ꐃ﹨᭾禊ﻎꚭ助荴焝㜆?㆐졠꘍乻횕鈖撦ⴰ値糅".toCharArray(), (short)25552, false, false)).length();
/*    */     byte b2 = 40;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */   
/*    */   private static String b(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   }
/*    */   
/*    */   private static String b(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x48F2;
/*    */     if (g[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])h.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "琚訓谝ꊜ뎬줡％눾?ﴽ숔歾䣀揍噧⮀菓?ᴒ".toCharArray()[13] = (char)("琚訓谝ꊜ뎬줡％눾?ﴽ숔歾䣀揍噧⮀菓?ᴒ".toCharArray()[13] ^ 0x1BFB);
/*    */           arrayOfObject[0] = Cipher.getInstance(a0$cc.G("琚訓谝ꊜ뎬줡％눾?ﴽ숔歾䣀揍噧⮀菓?ᴒ".toCharArray(), (short)28297, false, (byte)3));
/*    */           "䞪﫥뾏吳".toCharArray()[0] = (char)("䞪﫥뾏吳".toCharArray()[0] ^ 0x5583);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(a0$cc.G("䞪﫥뾏吳".toCharArray(), (short)1274, true, (byte)4));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           h.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "亮鼁랞䷧䮯῾쉧䖟䑌稢ܑ䎥頜獄꺋퉂팃埕".toCharArray()[7] = (char)("亮鼁랞䷧䮯῾쉧䖟䑌稢ܑ䎥頜獄꺋퉂팃埕".toCharArray()[7] ^ 0x34C0);
/*    */         throw new RuntimeException(a0$cc.G("亮鼁랞䷧䮯῾쉧䖟䑌稢ܑ䎥頜獄꺋퉂팃埕".toCharArray(), (short)3807, true, (byte)0), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "움颉陆¤䊈ᴍꎯ擯绽匎".toCharArray()[6] = (char)("움颉陆¤䊈ᴍꎯ擯绽匎".toCharArray()[6] ^ 0x4507);
/*    */       byte[] arrayOfByte2 = f[i].getBytes(a0$cc.G("움颉陆¤䊈ᴍꎯ擯绽匎".toCharArray(), (short)17949, false, (byte)3));
/*    */       g[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return g[i];
/*    */   }
/*    */   
/*    */   private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = b(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '郉⇿璪?껀잚ĝ個彮倁蝾⌌ய?圏診ỳ'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #15
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #16114
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #27719
/*    */     //   87: iconst_0
/*    */     //   88: iconst_0
/*    */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '愁渫梼㬜'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_0
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #9406
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #21741
/*    */     //   115: iconst_1
/*    */     //   116: iconst_4
/*    */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '氪㙒篷'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_2
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #23190
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #7724
/*    */     //   147: iconst_1
/*    */     //   148: iconst_4
/*    */     //   149: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: aload #4
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   170: athrow
/*    */     //   171: aload_3
/*    */     //   172: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */