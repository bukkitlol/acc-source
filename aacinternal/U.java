/*    */ package aacinternal;
/*    */ 
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.util.Locale;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ public class u extends RuntimeException implements aC {
/*    */   private static final long serialVersionUID = 20160217L;
/*    */   private static final String d;
/*    */   private final H a;
/*    */   private final Object[] b;
/*    */   
/* 13 */   public u(H paramH, Object[] paramArrayOfObject, long paramLong) { this.a = paramH;
/*    */ 
/*    */     
/* 16 */     this.b = (paramArrayOfObject == null) ? new Object[0] : (Object[])paramArrayOfObject.clone(); } private static int c; private static final long g; private static final String[] h; private static final String[] i; private static final Map j; public u(Throwable paramThrowable, H paramH, long paramLong, Object[] paramArrayOfObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/u.g : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: ldc2_w 2892845753340517231
/*    */     //   9: lload_3
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: aload_0
/*    */     //   16: aload_1
/*    */     //   17: invokespecial <init> : (Ljava/lang/Throwable;)V
/*    */     //   20: aload_0
/*    */     //   21: aload_2
/*    */     //   22: putfield a : Laacinternal/H;
/*    */     //   25: istore #6
/*    */     //   27: aload_0
/*    */     //   28: aload #5
/*    */     //   30: iload #6
/*    */     //   32: ifne -> 76
/*    */     //   35: ifnonnull -> 71
/*    */     //   38: lload_3
/*    */     //   39: lconst_0
/*    */     //   40: lcmp
/*    */     //   41: ifge -> 54
/*    */     //   44: ldc2_w 2902724939763954307
/*    */     //   47: lload_3
/*    */     //   48: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   53: athrow
/*    */     //   54: iconst_0
/*    */     //   55: anewarray java/lang/Object
/*    */     //   58: goto -> 79
/*    */     //   61: ldc2_w 2902724939763954307
/*    */     //   64: lload_3
/*    */     //   65: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   70: athrow
/*    */     //   71: aload #5
/*    */     //   73: invokevirtual clone : ()Ljava/lang/Object;
/*    */     //   76: checkcast [Ljava/lang/Object;
/*    */     //   79: putfield b : [Ljava/lang/Object;
/*    */     //   82: lload_3
/*    */     //   83: lconst_0
/*    */     //   84: lcmp
/*    */     //   85: iflt -> 114
/*    */     //   88: ldc2_w 2897619082287934613
/*    */     //   91: lload_3
/*    */     //   92: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   97: ifnull -> 127
/*    */     //   100: iinc #6, 1
/*    */     //   103: iload #6
/*    */     //   105: ldc2_w 2998798476644970889
/*    */     //   108: lload_3
/*    */     //   109: <illegal opcode> w : (IJJ)V
/*    */     //   114: goto -> 127
/*    */     //   117: ldc2_w 2902724939763954307
/*    */     //   120: lload_3
/*    */     //   121: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   126: athrow
/*    */     //   127: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 15
/*    */     //   #19	-> 20
/*    */     //   #12	-> 27
/*    */     //   #2	-> 82
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	38	44	aacinternal/u
/*    */     //   35	61	61	aacinternal/u
/*    */     //   79	114	117	aacinternal/u
/*    */   } private String b(long paramLong, Locale paramLocale) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/u.g : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 64707844273452
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: aload_0
/*    */     //   16: getfield a : Laacinternal/H;
/*    */     //   19: ifnonnull -> 35
/*    */     //   22: ldc ''
/*    */     //   24: areturn
/*    */     //   25: ldc2_w 965392806302783406
/*    */     //   28: lload_1
/*    */     //   29: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   34: athrow
/*    */     //   35: new java/text/MessageFormat
/*    */     //   38: dup
/*    */     //   39: aload_0
/*    */     //   40: getfield a : Laacinternal/H;
/*    */     //   43: aload_3
/*    */     //   44: lload #4
/*    */     //   46: invokeinterface a : (Ljava/util/Locale;J)Ljava/lang/String;
/*    */     //   51: aload_3
/*    */     //   52: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
/*    */     //   55: aload_0
/*    */     //   56: getfield b : [Ljava/lang/Object;
/*    */     //   59: invokevirtual format : (Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   62: areturn
/*    */     //   63: astore #6
/*    */     //   65: aload_0
/*    */     //   66: aload #6
/*    */     //   68: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
/*    */     //   71: aload_0
/*    */     //   72: getfield a : Laacinternal/H;
/*    */     //   75: invokeinterface a : ()Ljava/lang/String;
/*    */     //   80: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 15
/*    */     //   #4	-> 22
/*    */     //   #20	-> 35
/*    */     //   #9	-> 63
/*    */     //   #17	-> 65
/*    */     //   #3	-> 71
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	25	25	java/lang/Exception
/*    */     //   35	62	63	java/lang/Exception
/*    */   } public Object[] a() {
/* 21 */     return (Object[])this.b.clone();
/*    */   }
/*    */   
/*    */   public static u a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/u.g : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: lload_0
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 105442759908687
/*    */     //   11: lxor
/*    */     //   12: lstore_2
/*    */     //   13: pop2
/*    */     //   14: new aacinternal/u
/*    */     //   17: dup
/*    */     //   18: getstatic aacinternal/P.INTERNAL_ERROR : Laacinternal/P;
/*    */     //   21: iconst_1
/*    */     //   22: anewarray java/lang/Object
/*    */     //   25: dup
/*    */     //   26: iconst_0
/*    */     //   27: sipush #3337
/*    */     //   30: ldc2_w 3138466579324288431
/*    */     //   33: lload_0
/*    */     //   34: lxor
/*    */     //   35: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   40: aastore
/*    */     //   41: lload_2
/*    */     //   42: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   45: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 14
/*    */   }
/*    */   
/*    */   public String getMessage() {
/*    */     long l1 = g ^ 0x2625C788DA5DL, l2 = l1 ^ 0x4EF3D5373FF9L;
/*    */     return a(Locale.US, l2);
/*    */   }
/*    */   
/*    */   public static u a(long paramLong, Throwable paramThrowable) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/u.g : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: lload_0
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 15977052747759
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: pop2
/*    */     //   14: new aacinternal/u
/*    */     //   17: dup
/*    */     //   18: aload_2
/*    */     //   19: getstatic aacinternal/P.INTERNAL_ERROR : Laacinternal/P;
/*    */     //   22: iconst_1
/*    */     //   23: anewarray java/lang/Object
/*    */     //   26: dup
/*    */     //   27: iconst_0
/*    */     //   28: sipush #11521
/*    */     //   31: ldc2_w 445405933567269384
/*    */     //   34: lload_0
/*    */     //   35: lxor
/*    */     //   36: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   41: aastore
/*    */     //   42: lload_3
/*    */     //   43: dup2_x1
/*    */     //   44: pop2
/*    */     //   45: invokespecial <init> : (Ljava/lang/Throwable;Laacinternal/H;J[Ljava/lang/Object;)V
/*    */     //   48: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 14
/*    */   }
/*    */   
/*    */   public String getLocalizedMessage() {
/*    */     long l1 = g ^ 0x6FAD98B2E02L, l2 = l1 ^ 0x6E2CCB34CBA6L;
/*    */     return a(Locale.getDefault(), l2);
/*    */   }
/*    */   
/*    */   public H a() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public String a(Locale paramLocale, long paramLong) {
/*    */     long l = paramLong ^ 0x182054F3E9D4L;
/*    */     return b(l, paramLocale);
/*    */   }
/*    */   
/*    */   public static void b(int paramInt) {
/*    */     c = paramInt;
/*    */   }
/*    */   
/*    */   public static int b() {
/*    */     return c;
/*    */   }
/*    */   
/*    */   public static int c() {
/*    */     int i = b();
/*    */     try {
/*    */       if (i == 0)
/*    */         return 115; 
/*    */     } catch (u u1) {
/*    */       throw a(null);
/*    */     } 
/*    */     return 0;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -5488208455090919972
/*    */     //   3: ldc2_w -7156857582598114914
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 29533095840913
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic aacinternal/u.g : J
/*    */     //   26: getstatic aacinternal/u.g : J
/*    */     //   29: ldc2_w 47268361147287
/*    */     //   32: lxor
/*    */     //   33: lstore #9
/*    */     //   35: bipush #84
/*    */     //   37: new java/util/HashMap
/*    */     //   40: dup
/*    */     //   41: bipush #13
/*    */     //   43: invokespecial <init> : (I)V
/*    */     //   46: putstatic aacinternal/u.j : Ljava/util/Map;
/*    */     //   49: ldc2_w -8033689599492077418
/*    */     //   52: lload #9
/*    */     //   54: <illegal opcode> w : (IJJ)V
/*    */     //   59: ldc '하᭏⫈퓡㒲ﴔ㔭ቆ벰ꃃ蘯⪊?䡎⡟䌍菞ꔽ嫅畭扉'
/*    */     //   61: invokevirtual toCharArray : ()[C
/*    */     //   64: dup
/*    */     //   65: dup
/*    */     //   66: bipush #10
/*    */     //   68: dup_x1
/*    */     //   69: caload
/*    */     //   70: sipush #24854
/*    */     //   73: ixor
/*    */     //   74: i2c
/*    */     //   75: castore
/*    */     //   76: sipush #21896
/*    */     //   79: iconst_0
/*    */     //   80: iconst_3
/*    */     //   81: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   84: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*    */     //   87: dup
/*    */     //   88: astore_0
/*    */     //   89: iconst_2
/*    */     //   90: ldc '圀졈㮄'
/*    */     //   92: invokevirtual toCharArray : ()[C
/*    */     //   95: dup
/*    */     //   96: dup
/*    */     //   97: iconst_0
/*    */     //   98: dup_x1
/*    */     //   99: caload
/*    */     //   100: sipush #23128
/*    */     //   103: ixor
/*    */     //   104: i2c
/*    */     //   105: castore
/*    */     //   106: sipush #13568
/*    */     //   109: iconst_0
/*    */     //   110: iconst_5
/*    */     //   111: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   114: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*    */     //   117: bipush #8
/*    */     //   119: newarray byte
/*    */     //   121: dup
/*    */     //   122: iconst_0
/*    */     //   123: lload #9
/*    */     //   125: bipush #56
/*    */     //   127: lushr
/*    */     //   128: l2i
/*    */     //   129: i2b
/*    */     //   130: bastore
/*    */     //   131: iconst_1
/*    */     //   132: istore_1
/*    */     //   133: iload_1
/*    */     //   134: bipush #8
/*    */     //   136: if_icmpge -> 160
/*    */     //   139: dup
/*    */     //   140: iload_1
/*    */     //   141: lload #9
/*    */     //   143: iload_1
/*    */     //   144: bipush #8
/*    */     //   146: imul
/*    */     //   147: lshl
/*    */     //   148: bipush #56
/*    */     //   150: lushr
/*    */     //   151: l2i
/*    */     //   152: i2b
/*    */     //   153: bastore
/*    */     //   154: iinc #1, 1
/*    */     //   157: goto -> 133
/*    */     //   160: new javax/crypto/spec/DESKeySpec
/*    */     //   163: dup_x1
/*    */     //   164: swap
/*    */     //   165: invokespecial <init> : ([B)V
/*    */     //   168: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*    */     //   171: new javax/crypto/spec/IvParameterSpec
/*    */     //   174: dup
/*    */     //   175: bipush #8
/*    */     //   177: newarray byte
/*    */     //   179: invokespecial <init> : ([B)V
/*    */     //   182: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*    */     //   185: iconst_3
/*    */     //   186: anewarray java/lang/String
/*    */     //   189: astore #7
/*    */     //   191: iconst_0
/*    */     //   192: istore #5
/*    */     //   194: ldc 'ꟴ饞靥댺愄ꠋ탤엁ᮢ晩Ҋ㌽‽⽫竉쾊譤冨崻﬷쳌瞐␖鬵厣ꮟꢘ⪆諸妝館꜊講⃸誷⺼ﯕ⡫鍢၄锿粌糟씤Ⅴ炩屶?韷옭ᨉ而൰쁜媩㣒腚誱҉켾뼯쥉፿?掦邈猐뮟徛쒛⍜ㄊ⏇㭴趐噗ﹹӑ妑燿豽ɯ돲ቘ熯뀺?볘㕛贅鸈쇑Ṝ䆙쀏쥫뽄閪폍흂姦蘦뵵ꣂ倂眆⨓ᒢ瀪奱ɭ遐䤲嚷ᜫ甑䳟룫幪饸㭹귀쪙목➎⺝恊腓㞾款⿛ꋍ㹅셀잾摜ԕঽđ魧?ϯ?❠®赑Ὴꢒ篼覩ທⳭ㘧갸宧啚汯௔럙怺덪抨࣭䇈熽ꬿ뽭늦ῴ⨩㹥㘍灺ઇﱸ春買蘆?勹浏燁餙?褙萇썙祥팈迕옇䵐ग밥罤ꐰ★큺該腽䶾ℋ䲗㊩⳸禲ḙᦅ絠躷難諞閠铂늇㘻ﯔ氭絶풄煋窲??ࢦ廨ᑔ麍ᰘ?煡鞠ፈ?蜐ꪋ⊤ዬ禳焟??뛘澪Ꭶ집ⶤ둓Ⴖ'
/*    */     //   196: invokevirtual toCharArray : ()[C
/*    */     //   199: dup
/*    */     //   200: dup
/*    */     //   201: bipush #87
/*    */     //   203: dup_x1
/*    */     //   204: caload
/*    */     //   205: sipush #3491
/*    */     //   208: ixor
/*    */     //   209: i2c
/*    */     //   210: castore
/*    */     //   211: sipush #9842
/*    */     //   214: iconst_5
/*    */     //   215: iconst_3
/*    */     //   216: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   219: dup
/*    */     //   220: astore #4
/*    */     //   222: invokevirtual length : ()I
/*    */     //   225: istore #6
/*    */     //   227: bipush #96
/*    */     //   229: istore_3
/*    */     //   230: iconst_m1
/*    */     //   231: istore_2
/*    */     //   232: iinc #2, 1
/*    */     //   235: aload #4
/*    */     //   237: iload_2
/*    */     //   238: dup
/*    */     //   239: iload_3
/*    */     //   240: iadd
/*    */     //   241: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   244: iconst_m1
/*    */     //   245: goto -> 310
/*    */     //   248: aload #7
/*    */     //   250: swap
/*    */     //   251: iload #5
/*    */     //   253: iinc #5, 1
/*    */     //   256: swap
/*    */     //   257: aastore
/*    */     //   258: iload_2
/*    */     //   259: iload_3
/*    */     //   260: iadd
/*    */     //   261: dup
/*    */     //   262: istore_2
/*    */     //   263: iload #6
/*    */     //   265: if_icmpge -> 278
/*    */     //   268: aload #4
/*    */     //   270: iload_2
/*    */     //   271: invokevirtual charAt : (I)C
/*    */     //   274: istore_3
/*    */     //   275: goto -> 232
/*    */     //   278: aload #7
/*    */     //   280: putstatic aacinternal/u.h : [Ljava/lang/String;
/*    */     //   283: iconst_3
/*    */     //   284: anewarray java/lang/String
/*    */     //   287: putstatic aacinternal/u.i : [Ljava/lang/String;
/*    */     //   290: sipush #13402
/*    */     //   293: ldc2_w 8873465387721150071
/*    */     //   296: lload #9
/*    */     //   298: lxor
/*    */     //   299: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   304: putstatic aacinternal/u.d : Ljava/lang/String;
/*    */     //   307: goto -> 360
/*    */     //   310: swap
/*    */     //   311: ldc_w '灄拠㽴ൃ矷?䬰ⶃ뺧灜'
/*    */     //   314: invokevirtual toCharArray : ()[C
/*    */     //   317: dup
/*    */     //   318: dup
/*    */     //   319: bipush #8
/*    */     //   321: dup_x1
/*    */     //   322: caload
/*    */     //   323: sipush #14825
/*    */     //   326: ixor
/*    */     //   327: i2c
/*    */     //   328: castore
/*    */     //   329: sipush #8954
/*    */     //   332: iconst_0
/*    */     //   333: iconst_1
/*    */     //   334: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   337: invokevirtual getBytes : (Ljava/lang/String;)[B
/*    */     //   340: aload_0
/*    */     //   341: swap
/*    */     //   342: invokevirtual doFinal : ([B)[B
/*    */     //   345: astore #8
/*    */     //   347: aload #8
/*    */     //   349: invokestatic a : ([B)Ljava/lang/String;
/*    */     //   352: invokevirtual intern : ()Ljava/lang/String;
/*    */     //   355: swap
/*    */     //   356: pop
/*    */     //   357: goto -> 248
/*    */     //   360: return
/*    */   }
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
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
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6A6E;
/*    */     if (i[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])j.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "ﭥ뢐谨ඹ竹?橬촒闥葯ꄌྂ戓寗粮窒鶓홙യ".toCharArray()[11] = (char)("ﭥ뢐谨ඹ竹?橬촒闥葯ꄌྂ戓寗粮窒鶓홙യ".toCharArray()[11] ^ 0x32DB);
/*    */           arrayOfObject[0] = Cipher.getInstance(aB$aG.q("ﭥ뢐谨ඹ竹?橬촒闥葯ꄌྂ戓寗粮窒鶓홙യ".toCharArray(), (short)23842, (byte)1, (byte)0));
/*    */           "왛?㗸㧵".toCharArray()[0] = (char)("왛?㗸㧵".toCharArray()[0] ^ 0x3D61);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(aB$aG.q("왛?㗸㧵".toCharArray(), (short)10760, (byte)3, (byte)4));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           j.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "麕邆ﭽ?慶꺻깕ᬬ싍?䠟㡔⪺៹".toCharArray()[7] = (char)("麕邆ﭽ?慶꺻깕ᬬ싍?䠟㡔⪺៹".toCharArray()[7] ^ 0x7858);
/*    */         throw new RuntimeException(aB$aG.q("麕邆ﭽ?慶꺻깕ᬬ싍?䠟㡔⪺៹".toCharArray(), (short)1763, (byte)3, (byte)4), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "◯㾊엃ᒳﭲ﫶齈닟⑯".toCharArray()[0] = (char)("◯㾊엃ᒳﭲ﫶齈닟⑯".toCharArray()[0] ^ 0x3618);
/*    */       byte[] arrayOfByte2 = h[i].getBytes(aB$aG.q("◯㾊엃ᒳﭲ﫶齈닟⑯".toCharArray(), (short)1536, (byte)3, (byte)1));
/*    */       i[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return i[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc [Ljava/lang/Object;
/*    */     //   15: aload_2
/*    */     //   16: invokevirtual parameterCount : ()I
/*    */     //   19: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   22: iconst_0
/*    */     //   23: iconst_3
/*    */     //   24: anewarray java/lang/Object
/*    */     //   27: dup
/*    */     //   28: iconst_0
/*    */     //   29: aload_0
/*    */     //   30: aastore
/*    */     //   31: dup
/*    */     //   32: iconst_1
/*    */     //   33: aload_3
/*    */     //   34: aastore
/*    */     //   35: dup
/*    */     //   36: iconst_2
/*    */     //   37: aload_1
/*    */     //   38: aastore
/*    */     //   39: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   42: aload_2
/*    */     //   43: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   46: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   49: goto -> 169
/*    */     //   52: astore #4
/*    */     //   54: new java/lang/RuntimeException
/*    */     //   57: dup
/*    */     //   58: new java/lang/StringBuilder
/*    */     //   61: dup
/*    */     //   62: invokespecial <init> : ()V
/*    */     //   65: ldc_w '떰៼Π龡䔐⊺ᄁ뿾ྜ২뤃樣獒'
/*    */     //   68: invokevirtual toCharArray : ()[C
/*    */     //   71: dup
/*    */     //   72: dup
/*    */     //   73: iconst_0
/*    */     //   74: dup_x1
/*    */     //   75: caload
/*    */     //   76: sipush #18154
/*    */     //   79: ixor
/*    */     //   80: i2c
/*    */     //   81: castore
/*    */     //   82: sipush #10167
/*    */     //   85: iconst_0
/*    */     //   86: iconst_1
/*    */     //   87: invokestatic L : (Ljava/lang/Object;SBZ)Ljava/lang/String;
/*    */     //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   93: ldc_w 'ᐛ帺᣶'
/*    */     //   96: invokevirtual toCharArray : ()[C
/*    */     //   99: dup
/*    */     //   100: dup
/*    */     //   101: iconst_0
/*    */     //   102: dup_x1
/*    */     //   103: caload
/*    */     //   104: sipush #18529
/*    */     //   107: ixor
/*    */     //   108: i2c
/*    */     //   109: castore
/*    */     //   110: sipush #21500
/*    */     //   113: iconst_2
/*    */     //   114: iconst_1
/*    */     //   115: invokestatic L : (Ljava/lang/Object;SBZ)Ljava/lang/String;
/*    */     //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   121: aload_1
/*    */     //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   125: ldc_w '棇涛왱呁'
/*    */     //   128: invokevirtual toCharArray : ()[C
/*    */     //   131: dup
/*    */     //   132: dup
/*    */     //   133: iconst_0
/*    */     //   134: dup_x1
/*    */     //   135: caload
/*    */     //   136: sipush #17777
/*    */     //   139: ixor
/*    */     //   140: i2c
/*    */     //   141: castore
/*    */     //   142: sipush #12476
/*    */     //   145: iconst_4
/*    */     //   146: iconst_1
/*    */     //   147: invokestatic L : (Ljava/lang/Object;SBZ)Ljava/lang/String;
/*    */     //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   153: aload_2
/*    */     //   154: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   160: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   163: aload #4
/*    */     //   165: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   168: athrow
/*    */     //   169: aload_3
/*    */     //   170: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	49	52	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinterna\\u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */