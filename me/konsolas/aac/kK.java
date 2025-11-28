/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import java.lang.invoke.CallSite;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MethodType;
/*     */ import java.lang.invoke.MutableCallSite;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.SecretKeyFactory;
/*     */ import javax.crypto.spec.DESKeySpec;
/*     */ import javax.crypto.spec.IvParameterSpec;
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
/*     */ public class kk
/*     */ {
/*     */   private final Pattern a;
/*     */   private final String c;
/*     */   private final String d;
/*     */   private static final long e;
/*     */   private static final String[] f;
/*     */   private static final String[] g;
/*     */   private static final Map h;
/*     */   
/*     */   private RuntimeException a(String paramString, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kk.e : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: new java/lang/RuntimeException
/*     */     //   9: dup
/*     */     //   10: aload_1
/*     */     //   11: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   14: astore #4
/*     */     //   16: aload #4
/*     */     //   18: iconst_0
/*     */     //   19: anewarray java/lang/StackTraceElement
/*     */     //   22: ldc2_w 5849868350925742887
/*     */     //   25: lload_2
/*     */     //   26: <illegal opcode> b : (Ljava/lang/RuntimeException;[Ljava/lang/StackTraceElement;JJ)V
/*     */     //   31: aload #4
/*     */     //   33: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #17	-> 6
/*     */     //   #33	-> 16
/*     */     //   #118	-> 31
/*     */   }
/*     */   
/*     */   public String a() {
/*  41 */     return this.d;
/*     */   }
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
/*     */   public static String a(AAC paramAAC, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kk.e : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w -3071184128636682533
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   15: astore_3
/*     */     //   16: new java/util/zip/ZipInputStream
/*     */     //   19: dup
/*     */     //   20: new java/io/FileInputStream
/*     */     //   23: dup
/*     */     //   24: ldc me/konsolas/aac/AAC
/*     */     //   26: ldc2_w -3071665554201366400
/*     */     //   29: lload_1
/*     */     //   30: <illegal opcode> b : (Ljava/lang/Class;JJ)Ljava/security/ProtectionDomain;
/*     */     //   35: ldc2_w -3029267120529642441
/*     */     //   38: lload_1
/*     */     //   39: <illegal opcode> b : (Ljava/security/ProtectionDomain;JJ)Ljava/security/CodeSource;
/*     */     //   44: ldc2_w -3078913177960888894
/*     */     //   47: lload_1
/*     */     //   48: <illegal opcode> b : (Ljava/security/CodeSource;JJ)Ljava/net/URL;
/*     */     //   53: ldc2_w -3126590530400198024
/*     */     //   56: lload_1
/*     */     //   57: <illegal opcode> b : (Ljava/net/URL;JJ)Ljava/net/URI;
/*     */     //   62: ldc2_w -3119716243207495373
/*     */     //   65: lload_1
/*     */     //   66: <illegal opcode> b : (Ljava/net/URI;JJ)Ljava/lang/String;
/*     */     //   71: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   74: invokespecial <init> : (Ljava/io/InputStream;)V
/*     */     //   77: astore #4
/*     */     //   79: aload #4
/*     */     //   81: ldc2_w -3027639339361136280
/*     */     //   84: lload_1
/*     */     //   85: <illegal opcode> b : (Ljava/util/zip/ZipInputStream;JJ)Ljava/util/zip/ZipEntry;
/*     */     //   90: ldc2_w -3029633217402863134
/*     */     //   93: lload_1
/*     */     //   94: <illegal opcode> b : (Ljava/util/zip/ZipEntry;JJ)Ljava/lang/String;
/*     */     //   99: sipush #28941
/*     */     //   102: ldc2_w 1024554295041122919
/*     */     //   105: lload_1
/*     */     //   106: lxor
/*     */     //   107: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   112: ldc2_w -3069684129614509757
/*     */     //   115: lload_1
/*     */     //   116: <illegal opcode> b : (Ljava/lang/String;Ljava/lang/String;JJ)Z
/*     */     //   121: ifne -> 137
/*     */     //   124: goto -> 79
/*     */     //   127: ldc2_w -3028621577107678637
/*     */     //   130: lload_1
/*     */     //   131: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   136: athrow
/*     */     //   137: new java/io/ByteArrayOutputStream
/*     */     //   140: dup
/*     */     //   141: invokespecial <init> : ()V
/*     */     //   144: astore #5
/*     */     //   146: sipush #128
/*     */     //   149: newarray byte
/*     */     //   151: astore #7
/*     */     //   153: aload #4
/*     */     //   155: aload #7
/*     */     //   157: ldc2_w -3066422655449480755
/*     */     //   160: lload_1
/*     */     //   161: <illegal opcode> b : (Ljava/util/zip/ZipInputStream;[BJJ)I
/*     */     //   166: dup
/*     */     //   167: istore #6
/*     */     //   169: iconst_m1
/*     */     //   170: if_icmpeq -> 222
/*     */     //   173: lload_1
/*     */     //   174: lconst_0
/*     */     //   175: lcmp
/*     */     //   176: ifle -> 199
/*     */     //   179: aload #5
/*     */     //   181: aload_3
/*     */     //   182: ifnull -> 224
/*     */     //   185: aload #7
/*     */     //   187: iconst_0
/*     */     //   188: iload #6
/*     */     //   190: ldc2_w -3064755609261155170
/*     */     //   193: lload_1
/*     */     //   194: <illegal opcode> b : (Ljava/io/ByteArrayOutputStream;[BIIJJ)V
/*     */     //   199: aload_3
/*     */     //   200: ifnonnull -> 153
/*     */     //   203: lload_1
/*     */     //   204: lconst_0
/*     */     //   205: lcmp
/*     */     //   206: iflt -> 173
/*     */     //   209: goto -> 222
/*     */     //   212: ldc2_w -3028621577107678637
/*     */     //   215: lload_1
/*     */     //   216: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   221: athrow
/*     */     //   222: aload #5
/*     */     //   224: ldc2_w -3043982125427250205
/*     */     //   227: lload_1
/*     */     //   228: <illegal opcode> b : (Ljava/io/ByteArrayOutputStream;JJ)[B
/*     */     //   233: astore #8
/*     */     //   235: sipush #32154
/*     */     //   238: ldc2_w 3243628366579003133
/*     */     //   241: lload_1
/*     */     //   242: lxor
/*     */     //   243: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   248: ldc2_w -3065438169957731656
/*     */     //   251: lload_1
/*     */     //   252: <illegal opcode> w : (Ljava/lang/String;JJ)Ljava/security/MessageDigest;
/*     */     //   257: astore #9
/*     */     //   259: aload #9
/*     */     //   261: aload #8
/*     */     //   263: aload #8
/*     */     //   265: arraylength
/*     */     //   266: sipush #128
/*     */     //   269: isub
/*     */     //   270: sipush #128
/*     */     //   273: ldc2_w -3107150504610578437
/*     */     //   276: lload_1
/*     */     //   277: <illegal opcode> b : (Ljava/security/MessageDigest;[BIIJJ)V
/*     */     //   282: aload #9
/*     */     //   284: ldc2_w -3088263182607554380
/*     */     //   287: lload_1
/*     */     //   288: <illegal opcode> b : (Ljava/security/MessageDigest;JJ)[B
/*     */     //   293: astore #10
/*     */     //   295: new java/lang/StringBuilder
/*     */     //   298: dup
/*     */     //   299: invokespecial <init> : ()V
/*     */     //   302: astore #11
/*     */     //   304: aload #10
/*     */     //   306: astore #12
/*     */     //   308: aload #12
/*     */     //   310: arraylength
/*     */     //   311: istore #13
/*     */     //   313: iconst_0
/*     */     //   314: istore #14
/*     */     //   316: iload #14
/*     */     //   318: iload #13
/*     */     //   320: if_icmpge -> 409
/*     */     //   323: aload #12
/*     */     //   325: iload #14
/*     */     //   327: baload
/*     */     //   328: istore #15
/*     */     //   330: lload_1
/*     */     //   331: lconst_0
/*     */     //   332: lcmp
/*     */     //   333: iflt -> 386
/*     */     //   336: aload #11
/*     */     //   338: iload #15
/*     */     //   340: sipush #255
/*     */     //   343: iand
/*     */     //   344: sipush #256
/*     */     //   347: iadd
/*     */     //   348: bipush #16
/*     */     //   350: ldc2_w -3081182095206158035
/*     */     //   353: lload_1
/*     */     //   354: <illegal opcode> w : (IIJJ)Ljava/lang/String;
/*     */     //   359: iconst_1
/*     */     //   360: ldc2_w -3040292526575084669
/*     */     //   363: lload_1
/*     */     //   364: <illegal opcode> b : (Ljava/lang/String;IJJ)Ljava/lang/String;
/*     */     //   369: ldc2_w -3082815984436926729
/*     */     //   372: lload_1
/*     */     //   373: <illegal opcode> b : (Ljava/lang/StringBuilder;Ljava/lang/String;JJ)Ljava/lang/StringBuilder;
/*     */     //   378: aload_3
/*     */     //   379: ifnull -> 411
/*     */     //   382: pop
/*     */     //   383: iinc #14, 1
/*     */     //   386: aload_3
/*     */     //   387: ifnonnull -> 316
/*     */     //   390: lload_1
/*     */     //   391: lconst_0
/*     */     //   392: lcmp
/*     */     //   393: ifle -> 330
/*     */     //   396: goto -> 409
/*     */     //   399: ldc2_w -3028621577107678637
/*     */     //   402: lload_1
/*     */     //   403: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   408: athrow
/*     */     //   409: aload #11
/*     */     //   411: ldc2_w -3103692029116110799
/*     */     //   414: lload_1
/*     */     //   415: <illegal opcode> b : (Ljava/lang/StringBuilder;JJ)Ljava/lang/String;
/*     */     //   420: astore #12
/*     */     //   422: aload #4
/*     */     //   424: ldc2_w -3067689685866847263
/*     */     //   427: lload_1
/*     */     //   428: <illegal opcode> b : (Ljava/util/zip/ZipInputStream;JJ)V
/*     */     //   433: aload #12
/*     */     //   435: ldc2_w -3080606840774159972
/*     */     //   438: lload_1
/*     */     //   439: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   444: ifnull -> 460
/*     */     //   447: iconst_5
/*     */     //   448: anewarray java/lang/String
/*     */     //   451: ldc2_w -3083153707003074830
/*     */     //   454: lload_1
/*     */     //   455: <illegal opcode> w : ([Ljava/lang/String;JJ)V
/*     */     //   460: areturn
/*     */     //   461: astore #5
/*     */     //   463: aload #4
/*     */     //   465: ldc2_w -3067689685866847263
/*     */     //   468: lload_1
/*     */     //   469: <illegal opcode> b : (Ljava/util/zip/ZipInputStream;JJ)V
/*     */     //   474: goto -> 492
/*     */     //   477: astore #6
/*     */     //   479: aload #5
/*     */     //   481: aload #6
/*     */     //   483: ldc2_w -3064632233430198793
/*     */     //   486: lload_1
/*     */     //   487: <illegal opcode> b : (Ljava/lang/Throwable;Ljava/lang/Throwable;JJ)V
/*     */     //   492: aload #5
/*     */     //   494: athrow
/*     */     //   495: astore #4
/*     */     //   497: ldc2_w -3077559533626707704
/*     */     //   500: lload_1
/*     */     //   501: <illegal opcode> w : (JJ)Lorg/bukkit/plugin/PluginManager;
/*     */     //   506: aload_0
/*     */     //   507: ldc2_w -3070110367943110921
/*     */     //   510: lload_1
/*     */     //   511: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/plugin/Plugin;JJ)V
/*     */     //   516: new java/lang/RuntimeException
/*     */     //   519: dup
/*     */     //   520: sipush #3169
/*     */     //   523: ldc2_w 2698321910522060561
/*     */     //   526: lload_1
/*     */     //   527: lxor
/*     */     //   528: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   533: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   536: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 16
/*     */     //   #57	-> 79
/*     */     //   #93	-> 137
/*     */     //   #40	-> 146
/*     */     //   #98	-> 153
/*     */     //   #4	-> 173
/*     */     //   #1	-> 222
/*     */     //   #8	-> 243
/*     */     //   #54	-> 259
/*     */     //   #68	-> 282
/*     */     //   #92	-> 295
/*     */     //   #44	-> 304
/*     */     //   #46	-> 330
/*     */     //   #2	-> 383
/*     */     //   #65	-> 409
/*     */     //   #80	-> 422
/*     */     //   #13	-> 433
/*     */     //   #142	-> 461
/*     */     //   #82	-> 495
/*     */     //   #122	-> 497
/*     */     //   #66	-> 516
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   16	433	495	java/lang/Throwable
/*     */     //   79	127	127	java/lang/Throwable
/*     */     //   79	422	461	java/lang/Throwable
/*     */     //   173	203	212	java/lang/Throwable
/*     */     //   330	390	399	java/lang/Throwable
/*     */     //   461	495	495	java/lang/Throwable
/*     */     //   463	474	477	java/lang/Throwable
/*     */   }
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
/*     */   public kk(long paramLong, AAC paramAAC) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kk.e : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 122210883948449
/*     */     //   11: lxor
/*     */     //   12: dup2
/*     */     //   13: bipush #8
/*     */     //   15: lushr
/*     */     //   16: lstore #4
/*     */     //   18: dup2
/*     */     //   19: bipush #56
/*     */     //   21: lshl
/*     */     //   22: bipush #56
/*     */     //   24: lushr
/*     */     //   25: l2i
/*     */     //   26: istore #6
/*     */     //   28: pop2
/*     */     //   29: dup2
/*     */     //   30: ldc2_w 93964255767788
/*     */     //   33: lxor
/*     */     //   34: lstore #7
/*     */     //   36: dup2
/*     */     //   37: ldc2_w 128979783462531
/*     */     //   40: lxor
/*     */     //   41: lstore #9
/*     */     //   43: dup2
/*     */     //   44: ldc2_w 108101684028295
/*     */     //   47: lxor
/*     */     //   48: lstore #11
/*     */     //   50: dup2
/*     */     //   51: ldc2_w 25845909996783
/*     */     //   54: lxor
/*     */     //   55: lstore #13
/*     */     //   57: dup2
/*     */     //   58: ldc2_w 3076939291392
/*     */     //   61: lxor
/*     */     //   62: lstore #15
/*     */     //   64: dup2
/*     */     //   65: ldc2_w 128106167189217
/*     */     //   68: lxor
/*     */     //   69: lstore #17
/*     */     //   71: dup2
/*     */     //   72: ldc2_w 138967834319527
/*     */     //   75: lxor
/*     */     //   76: lstore #19
/*     */     //   78: dup2
/*     */     //   79: ldc2_w 8128207628490
/*     */     //   82: lxor
/*     */     //   83: lstore #21
/*     */     //   85: dup2
/*     */     //   86: ldc2_w 88754846198655
/*     */     //   89: lxor
/*     */     //   90: lstore #23
/*     */     //   92: dup2
/*     */     //   93: ldc2_w 68254783507487
/*     */     //   96: lxor
/*     */     //   97: dup2
/*     */     //   98: bipush #32
/*     */     //   100: lushr
/*     */     //   101: l2i
/*     */     //   102: istore #25
/*     */     //   104: dup2
/*     */     //   105: bipush #32
/*     */     //   107: lshl
/*     */     //   108: bipush #32
/*     */     //   110: lushr
/*     */     //   111: lstore #26
/*     */     //   113: pop2
/*     */     //   114: dup2
/*     */     //   115: ldc2_w 16432618842994
/*     */     //   118: lxor
/*     */     //   119: lstore #28
/*     */     //   121: dup2
/*     */     //   122: ldc2_w 112079258501257
/*     */     //   125: lxor
/*     */     //   126: lstore #30
/*     */     //   128: dup2
/*     */     //   129: ldc2_w 132680591445531
/*     */     //   132: lxor
/*     */     //   133: lstore #32
/*     */     //   135: dup2
/*     */     //   136: ldc2_w 47249940198449
/*     */     //   139: lxor
/*     */     //   140: lstore #34
/*     */     //   142: dup2
/*     */     //   143: ldc2_w 120762178546084
/*     */     //   146: lxor
/*     */     //   147: lstore #36
/*     */     //   149: pop2
/*     */     //   150: ldc2_w -3064150415021834558
/*     */     //   153: lload_1
/*     */     //   154: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   159: aload_0
/*     */     //   160: invokespecial <init> : ()V
/*     */     //   163: aload_0
/*     */     //   164: sipush #13527
/*     */     //   167: ldc2_w 4654313194463930273
/*     */     //   170: lload_1
/*     */     //   171: lxor
/*     */     //   172: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   177: ldc2_w -3086463914803263492
/*     */     //   180: lload_1
/*     */     //   181: <illegal opcode> w : (Ljava/lang/String;JJ)Ljava/util/regex/Pattern;
/*     */     //   186: putfield a : Ljava/util/regex/Pattern;
/*     */     //   189: astore #38
/*     */     //   191: aconst_null
/*     */     //   192: ldc2_w -3079392502144679632
/*     */     //   195: lload_1
/*     */     //   196: <illegal opcode> w : (Ljava/lang/SecurityManager;JJ)V
/*     */     //   201: goto -> 664
/*     */     //   204: astore #39
/*     */     //   206: ldc_w sun/misc/Unsafe
/*     */     //   209: sipush #28936
/*     */     //   212: ldc2_w 3091444367426675325
/*     */     //   215: lload_1
/*     */     //   216: lxor
/*     */     //   217: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   222: ldc2_w -3095001551265448808
/*     */     //   225: lload_1
/*     */     //   226: <illegal opcode> b : (Ljava/lang/Class;Ljava/lang/String;JJ)Ljava/lang/reflect/Field;
/*     */     //   231: astore #40
/*     */     //   233: aload #40
/*     */     //   235: iconst_1
/*     */     //   236: ldc2_w -3070210220651778900
/*     */     //   239: lload_1
/*     */     //   240: <illegal opcode> b : (Ljava/lang/reflect/Field;ZJJ)V
/*     */     //   245: aload #40
/*     */     //   247: aconst_null
/*     */     //   248: ldc2_w -3075522272717948393
/*     */     //   251: lload_1
/*     */     //   252: <illegal opcode> b : (Ljava/lang/reflect/Field;Ljava/lang/Object;JJ)Ljava/lang/Object;
/*     */     //   257: checkcast sun/misc/Unsafe
/*     */     //   260: astore #41
/*     */     //   262: ldc_w sun/misc/Unsafe
/*     */     //   265: sipush #27694
/*     */     //   268: ldc2_w 2596219306656857926
/*     */     //   271: lload_1
/*     */     //   272: lxor
/*     */     //   273: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   278: iconst_1
/*     */     //   279: anewarray java/lang/Class
/*     */     //   282: dup
/*     */     //   283: iconst_0
/*     */     //   284: ldc_w java/lang/Class
/*     */     //   287: aastore
/*     */     //   288: ldc2_w -3091430520588418052
/*     */     //   291: lload_1
/*     */     //   292: <illegal opcode> b : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;JJ)Ljava/lang/reflect/Method;
/*     */     //   297: astore #42
/*     */     //   299: aload #42
/*     */     //   301: aload #41
/*     */     //   303: iconst_1
/*     */     //   304: anewarray java/lang/Object
/*     */     //   307: dup
/*     */     //   308: iconst_0
/*     */     //   309: ldc_w java/lang/System
/*     */     //   312: aastore
/*     */     //   313: ldc2_w -3087972200175718041
/*     */     //   316: lload_1
/*     */     //   317: <illegal opcode> b : (Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;JJ)Ljava/lang/Object;
/*     */     //   322: astore #43
/*     */     //   324: ldc_w sun/misc/Unsafe
/*     */     //   327: sipush #3837
/*     */     //   330: ldc2_w 5293759600320552332
/*     */     //   333: lload_1
/*     */     //   334: lxor
/*     */     //   335: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   340: iconst_2
/*     */     //   341: anewarray java/lang/Class
/*     */     //   344: dup
/*     */     //   345: iconst_0
/*     */     //   346: ldc java/lang/Object
/*     */     //   348: aastore
/*     */     //   349: dup
/*     */     //   350: iconst_1
/*     */     //   351: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
/*     */     //   354: aastore
/*     */     //   355: ldc2_w -3091430520588418052
/*     */     //   358: lload_1
/*     */     //   359: <illegal opcode> b : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;JJ)Ljava/lang/reflect/Method;
/*     */     //   364: astore #44
/*     */     //   366: ldc_w sun/misc/Unsafe
/*     */     //   369: sipush #14157
/*     */     //   372: ldc2_w 499990309140145185
/*     */     //   375: lload_1
/*     */     //   376: lxor
/*     */     //   377: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   382: iconst_3
/*     */     //   383: anewarray java/lang/Class
/*     */     //   386: dup
/*     */     //   387: iconst_0
/*     */     //   388: ldc java/lang/Object
/*     */     //   390: aastore
/*     */     //   391: dup
/*     */     //   392: iconst_1
/*     */     //   393: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
/*     */     //   396: aastore
/*     */     //   397: dup
/*     */     //   398: iconst_2
/*     */     //   399: ldc java/lang/Object
/*     */     //   401: aastore
/*     */     //   402: ldc2_w -3091430520588418052
/*     */     //   405: lload_1
/*     */     //   406: <illegal opcode> b : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;JJ)Ljava/lang/reflect/Method;
/*     */     //   411: astore #45
/*     */     //   413: iconst_0
/*     */     //   414: istore #46
/*     */     //   416: aload #44
/*     */     //   418: aload #41
/*     */     //   420: iconst_2
/*     */     //   421: anewarray java/lang/Object
/*     */     //   424: dup
/*     */     //   425: iconst_0
/*     */     //   426: aload #43
/*     */     //   428: aastore
/*     */     //   429: dup
/*     */     //   430: iconst_1
/*     */     //   431: iload #46
/*     */     //   433: ldc2_w -3030480410081318387
/*     */     //   436: lload_1
/*     */     //   437: <illegal opcode> w : (IJJ)Ljava/lang/Integer;
/*     */     //   442: aastore
/*     */     //   443: ldc2_w -3087972200175718041
/*     */     //   446: lload_1
/*     */     //   447: <illegal opcode> b : (Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;JJ)Ljava/lang/Object;
/*     */     //   452: ldc2_w -3133610556941687970
/*     */     //   455: lload_1
/*     */     //   456: <illegal opcode> w : (JJ)Ljava/lang/SecurityManager;
/*     */     //   461: if_acmpne -> 534
/*     */     //   464: aload #45
/*     */     //   466: aload #41
/*     */     //   468: iconst_3
/*     */     //   469: anewarray java/lang/Object
/*     */     //   472: dup
/*     */     //   473: iconst_0
/*     */     //   474: aload #43
/*     */     //   476: aastore
/*     */     //   477: dup
/*     */     //   478: iconst_1
/*     */     //   479: iload #46
/*     */     //   481: ldc2_w -3030480410081318387
/*     */     //   484: lload_1
/*     */     //   485: <illegal opcode> w : (IJJ)Ljava/lang/Integer;
/*     */     //   490: aastore
/*     */     //   491: dup
/*     */     //   492: iconst_2
/*     */     //   493: aconst_null
/*     */     //   494: aastore
/*     */     //   495: ldc2_w -3087972200175718041
/*     */     //   498: lload_1
/*     */     //   499: <illegal opcode> b : (Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;JJ)Ljava/lang/Object;
/*     */     //   504: pop
/*     */     //   505: aload #38
/*     */     //   507: lload_1
/*     */     //   508: lconst_0
/*     */     //   509: lcmp
/*     */     //   510: ifle -> 552
/*     */     //   513: ifnull -> 550
/*     */     //   516: aload #38
/*     */     //   518: ifnonnull -> 555
/*     */     //   521: goto -> 534
/*     */     //   524: ldc2_w -3035098937772811702
/*     */     //   527: lload_1
/*     */     //   528: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   533: athrow
/*     */     //   534: iinc #46, 4
/*     */     //   537: goto -> 550
/*     */     //   540: ldc2_w -3035098937772811702
/*     */     //   543: lload_1
/*     */     //   544: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   549: athrow
/*     */     //   550: aload #38
/*     */     //   552: ifnonnull -> 416
/*     */     //   555: lload_1
/*     */     //   556: lconst_0
/*     */     //   557: lcmp
/*     */     //   558: iflt -> 505
/*     */     //   561: goto -> 664
/*     */     //   564: astore #40
/*     */     //   566: aload_3
/*     */     //   567: ldc2_w -3032067241959864612
/*     */     //   570: lload_1
/*     */     //   571: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   576: sipush #26410
/*     */     //   579: ldc2_w 7864251180583908430
/*     */     //   582: lload_1
/*     */     //   583: lxor
/*     */     //   584: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   589: ldc2_w -3126861810621716445
/*     */     //   592: lload_1
/*     */     //   593: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   598: ldc2_w -3132357839829540858
/*     */     //   601: lload_1
/*     */     //   602: <illegal opcode> w : (JJ)Lorg/bukkit/Server;
/*     */     //   607: ldc2_w -3029845096634460900
/*     */     //   610: lload_1
/*     */     //   611: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/PluginManager;
/*     */     //   616: aload_3
/*     */     //   617: ldc2_w -3063076929741861138
/*     */     //   620: lload_1
/*     */     //   621: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/plugin/Plugin;JJ)V
/*     */     //   626: aload_0
/*     */     //   627: ldc_w '鴴Ф'
/*     */     //   630: invokevirtual toCharArray : ()[C
/*     */     //   633: dup
/*     */     //   634: dup
/*     */     //   635: iconst_0
/*     */     //   636: dup_x1
/*     */     //   637: caload
/*     */     //   638: sipush #19733
/*     */     //   641: ixor
/*     */     //   642: i2c
/*     */     //   643: castore
/*     */     //   644: sipush #18730
/*     */     //   647: iconst_0
/*     */     //   648: iconst_5
/*     */     //   649: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   652: lload #21
/*     */     //   654: ldc2_w -3028068095435353570
/*     */     //   657: lload_1
/*     */     //   658: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   663: athrow
/*     */     //   664: new me/konsolas/aac/gI
/*     */     //   667: dup
/*     */     //   668: lload #13
/*     */     //   670: invokespecial <init> : (J)V
/*     */     //   673: getstatic java/net/Proxy.NO_PROXY : Ljava/net/Proxy;
/*     */     //   676: ldc2_w -3029976918792010939
/*     */     //   679: lload_1
/*     */     //   680: <illegal opcode> b : (Lme/konsolas/aac/gI;Ljava/net/Proxy;JJ)Lme/konsolas/aac/gI;
/*     */     //   685: lload #9
/*     */     //   687: ldc2_w -3030244137385182648
/*     */     //   690: lload_1
/*     */     //   691: <illegal opcode> b : (Lme/konsolas/aac/gI;JJJ)Lme/konsolas/aac/gf;
/*     */     //   696: astore #39
/*     */     //   698: aload #38
/*     */     //   700: ifnull -> 2082
/*     */     //   703: getstatic me/konsolas/aac/MetricsLite.userID : Ljava/lang/String;
/*     */     //   706: sipush #3405
/*     */     //   709: ldc2_w 1721830886592552502
/*     */     //   712: lload_1
/*     */     //   713: lxor
/*     */     //   714: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   719: ldc2_w -3089324602363685594
/*     */     //   722: lload_1
/*     */     //   723: <illegal opcode> b : (Ljava/lang/String;Ljava/lang/Object;JJ)Z
/*     */     //   728: ifeq -> 2064
/*     */     //   731: goto -> 744
/*     */     //   734: ldc2_w -3035098937772811702
/*     */     //   737: lload_1
/*     */     //   738: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   743: athrow
/*     */     //   744: getstatic me/konsolas/aac/MetricsLite.nonceID : Ljava/lang/String;
/*     */     //   747: sipush #391
/*     */     //   750: ldc2_w 3390526087424152293
/*     */     //   753: lload_1
/*     */     //   754: lxor
/*     */     //   755: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   760: ldc2_w -3089324602363685594
/*     */     //   763: lload_1
/*     */     //   764: <illegal opcode> b : (Ljava/lang/String;Ljava/lang/Object;JJ)Z
/*     */     //   769: ifeq -> 2064
/*     */     //   772: goto -> 785
/*     */     //   775: ldc2_w -3035098937772811702
/*     */     //   778: lload_1
/*     */     //   779: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   784: athrow
/*     */     //   785: new java/io/File
/*     */     //   788: dup
/*     */     //   789: aload_3
/*     */     //   790: ldc2_w -3097581020063880527
/*     */     //   793: lload_1
/*     */     //   794: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/io/File;
/*     */     //   799: sipush #11731
/*     */     //   802: ldc2_w 9038182994778832572
/*     */     //   805: lload_1
/*     */     //   806: lxor
/*     */     //   807: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   812: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
/*     */     //   815: astore #40
/*     */     //   817: lload_1
/*     */     //   818: lconst_0
/*     */     //   819: lcmp
/*     */     //   820: ifle -> 867
/*     */     //   823: aload #40
/*     */     //   825: ldc2_w -3070700036490121903
/*     */     //   828: lload_1
/*     */     //   829: <illegal opcode> b : (Ljava/io/File;JJ)Z
/*     */     //   834: aload #38
/*     */     //   836: ifnull -> 866
/*     */     //   839: ifne -> 969
/*     */     //   842: goto -> 855
/*     */     //   845: ldc2_w -3035098937772811702
/*     */     //   848: lload_1
/*     */     //   849: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   854: athrow
/*     */     //   855: aload #40
/*     */     //   857: ldc2_w -3089816609408891091
/*     */     //   860: lload_1
/*     */     //   861: <illegal opcode> b : (Ljava/io/File;JJ)Z
/*     */     //   866: pop
/*     */     //   867: goto -> 883
/*     */     //   870: astore #41
/*     */     //   872: aload #41
/*     */     //   874: ldc2_w -3036495205967365054
/*     */     //   877: lload_1
/*     */     //   878: <illegal opcode> b : (Ljava/io/IOException;JJ)V
/*     */     //   883: aload_3
/*     */     //   884: ldc2_w -3032067241959864612
/*     */     //   887: lload_1
/*     */     //   888: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   893: sipush #22947
/*     */     //   896: ldc2_w 1543484586248325830
/*     */     //   899: lload_1
/*     */     //   900: lxor
/*     */     //   901: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   906: ldc2_w -3126861810621716445
/*     */     //   909: lload_1
/*     */     //   910: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   915: ldc2_w -3132357839829540858
/*     */     //   918: lload_1
/*     */     //   919: <illegal opcode> w : (JJ)Lorg/bukkit/Server;
/*     */     //   924: ldc2_w -3029845096634460900
/*     */     //   927: lload_1
/*     */     //   928: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/PluginManager;
/*     */     //   933: aload_3
/*     */     //   934: ldc2_w -3063076929741861138
/*     */     //   937: lload_1
/*     */     //   938: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/plugin/Plugin;JJ)V
/*     */     //   943: aload_0
/*     */     //   944: sipush #1302
/*     */     //   947: ldc2_w 2467360861204584048
/*     */     //   950: lload_1
/*     */     //   951: lxor
/*     */     //   952: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   957: lload #21
/*     */     //   959: ldc2_w -3028068095435353570
/*     */     //   962: lload_1
/*     */     //   963: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   968: athrow
/*     */     //   969: new java/io/BufferedReader
/*     */     //   972: dup
/*     */     //   973: new java/io/FileReader
/*     */     //   976: dup
/*     */     //   977: aload #40
/*     */     //   979: invokespecial <init> : (Ljava/io/File;)V
/*     */     //   982: invokespecial <init> : (Ljava/io/Reader;)V
/*     */     //   985: astore #41
/*     */     //   987: aload_0
/*     */     //   988: aload #41
/*     */     //   990: ldc2_w -3033896201843617115
/*     */     //   993: lload_1
/*     */     //   994: <illegal opcode> b : (Ljava/io/BufferedReader;JJ)Ljava/lang/String;
/*     */     //   999: putfield c : Ljava/lang/String;
/*     */     //   1002: aload #41
/*     */     //   1004: ldc2_w -3040045714850653205
/*     */     //   1007: lload_1
/*     */     //   1008: <illegal opcode> b : (Ljava/io/BufferedReader;JJ)V
/*     */     //   1013: goto -> 1050
/*     */     //   1016: astore #42
/*     */     //   1018: aload #41
/*     */     //   1020: ldc2_w -3040045714850653205
/*     */     //   1023: lload_1
/*     */     //   1024: <illegal opcode> b : (Ljava/io/BufferedReader;JJ)V
/*     */     //   1029: goto -> 1047
/*     */     //   1032: astore #43
/*     */     //   1034: aload #42
/*     */     //   1036: aload #43
/*     */     //   1038: ldc2_w -3071111792648956434
/*     */     //   1041: lload_1
/*     */     //   1042: <illegal opcode> b : (Ljava/lang/Throwable;Ljava/lang/Throwable;JJ)V
/*     */     //   1047: aload #42
/*     */     //   1049: athrow
/*     */     //   1050: goto -> 1153
/*     */     //   1053: astore #41
/*     */     //   1055: aload_3
/*     */     //   1056: ldc2_w -3032067241959864612
/*     */     //   1059: lload_1
/*     */     //   1060: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   1065: sipush #10286
/*     */     //   1068: ldc2_w 5369162820501224281
/*     */     //   1071: lload_1
/*     */     //   1072: lxor
/*     */     //   1073: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1078: ldc2_w -3126861810621716445
/*     */     //   1081: lload_1
/*     */     //   1082: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   1087: ldc2_w -3132357839829540858
/*     */     //   1090: lload_1
/*     */     //   1091: <illegal opcode> w : (JJ)Lorg/bukkit/Server;
/*     */     //   1096: ldc2_w -3029845096634460900
/*     */     //   1099: lload_1
/*     */     //   1100: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/PluginManager;
/*     */     //   1105: aload_3
/*     */     //   1106: ldc2_w -3063076929741861138
/*     */     //   1109: lload_1
/*     */     //   1110: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/plugin/Plugin;JJ)V
/*     */     //   1115: aload_0
/*     */     //   1116: ldc_w '閨文'
/*     */     //   1119: invokevirtual toCharArray : ()[C
/*     */     //   1122: dup
/*     */     //   1123: dup
/*     */     //   1124: iconst_0
/*     */     //   1125: dup_x1
/*     */     //   1126: caload
/*     */     //   1127: sipush #19067
/*     */     //   1130: ixor
/*     */     //   1131: i2c
/*     */     //   1132: castore
/*     */     //   1133: sipush #15759
/*     */     //   1136: iconst_2
/*     */     //   1137: iconst_3
/*     */     //   1138: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   1141: lload #21
/*     */     //   1143: ldc2_w -3028068095435353570
/*     */     //   1146: lload_1
/*     */     //   1147: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   1152: athrow
/*     */     //   1153: new me/konsolas/aac/k_
/*     */     //   1156: dup
/*     */     //   1157: lload #32
/*     */     //   1159: invokespecial <init> : (J)V
/*     */     //   1162: new java/lang/StringBuilder
/*     */     //   1165: dup
/*     */     //   1166: invokespecial <init> : ()V
/*     */     //   1169: sipush #10238
/*     */     //   1172: ldc2_w 1052947732248147112
/*     */     //   1175: lload_1
/*     */     //   1176: lxor
/*     */     //   1177: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1182: ldc2_w -3085346098442230034
/*     */     //   1185: lload_1
/*     */     //   1186: <illegal opcode> b : (Ljava/lang/StringBuilder;Ljava/lang/String;JJ)Ljava/lang/StringBuilder;
/*     */     //   1191: aload_0
/*     */     //   1192: getfield c : Ljava/lang/String;
/*     */     //   1195: ldc2_w -3085346098442230034
/*     */     //   1198: lload_1
/*     */     //   1199: <illegal opcode> b : (Ljava/lang/StringBuilder;Ljava/lang/String;JJ)Ljava/lang/StringBuilder;
/*     */     //   1204: sipush #8847
/*     */     //   1207: ldc2_w 4759126778024669656
/*     */     //   1210: lload_1
/*     */     //   1211: lxor
/*     */     //   1212: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1217: ldc2_w -3085346098442230034
/*     */     //   1220: lload_1
/*     */     //   1221: <illegal opcode> b : (Ljava/lang/StringBuilder;Ljava/lang/String;JJ)Ljava/lang/StringBuilder;
/*     */     //   1226: ldc me/konsolas/aac/AAC
/*     */     //   1228: ldc2_w -3077258182631327806
/*     */     //   1231: lload_1
/*     */     //   1232: <illegal opcode> b : (Ljava/lang/Class;JJ)Ljava/lang/Package;
/*     */     //   1237: ldc2_w -3040074079821997586
/*     */     //   1240: lload_1
/*     */     //   1241: <illegal opcode> b : (Ljava/lang/Package;JJ)Ljava/lang/String;
/*     */     //   1246: ldc2_w -3085346098442230034
/*     */     //   1249: lload_1
/*     */     //   1250: <illegal opcode> b : (Ljava/lang/StringBuilder;Ljava/lang/String;JJ)Ljava/lang/StringBuilder;
/*     */     //   1255: ldc2_w -3101716068971206616
/*     */     //   1258: lload_1
/*     */     //   1259: <illegal opcode> b : (Ljava/lang/StringBuilder;JJ)Ljava/lang/String;
/*     */     //   1264: lload #34
/*     */     //   1266: dup2_x1
/*     */     //   1267: pop2
/*     */     //   1268: ldc2_w -3131187195178793718
/*     */     //   1271: lload_1
/*     */     //   1272: <illegal opcode> b : (Lme/konsolas/aac/k_;JLjava/lang/String;JJ)Lme/konsolas/aac/k_;
/*     */     //   1277: sipush #16304
/*     */     //   1280: ldc2_w 1065244406833130701
/*     */     //   1283: lload_1
/*     */     //   1284: lxor
/*     */     //   1285: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1290: lload #4
/*     */     //   1292: iload #6
/*     */     //   1294: i2b
/*     */     //   1295: sipush #7381
/*     */     //   1298: ldc2_w 3757916180330647476
/*     */     //   1301: lload_1
/*     */     //   1302: lxor
/*     */     //   1303: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1308: ldc2_w -3029564651128838484
/*     */     //   1311: lload_1
/*     */     //   1312: <illegal opcode> b : (Lme/konsolas/aac/k_;Ljava/lang/String;JBLjava/lang/String;JJ)Lme/konsolas/aac/k_;
/*     */     //   1317: lload #23
/*     */     //   1319: ldc2_w -3101369518112852609
/*     */     //   1322: lload_1
/*     */     //   1323: <illegal opcode> b : (Lme/konsolas/aac/k_;JJJ)Lme/konsolas/aac/s;
/*     */     //   1328: astore #41
/*     */     //   1330: aload #38
/*     */     //   1332: ifnull -> 1433
/*     */     //   1335: ldc2_w -3133610556941687970
/*     */     //   1338: lload_1
/*     */     //   1339: <illegal opcode> w : (JJ)Ljava/lang/SecurityManager;
/*     */     //   1344: ifnull -> 1471
/*     */     //   1347: goto -> 1360
/*     */     //   1350: ldc2_w -3035098937772811702
/*     */     //   1353: lload_1
/*     */     //   1354: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1359: athrow
/*     */     //   1360: aload_3
/*     */     //   1361: ldc2_w -3032067241959864612
/*     */     //   1364: lload_1
/*     */     //   1365: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   1370: sipush #266
/*     */     //   1373: ldc2_w 8103876544338825845
/*     */     //   1376: lload_1
/*     */     //   1377: lxor
/*     */     //   1378: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1383: ldc2_w -3126861810621716445
/*     */     //   1386: lload_1
/*     */     //   1387: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   1392: ldc2_w -3132357839829540858
/*     */     //   1395: lload_1
/*     */     //   1396: <illegal opcode> w : (JJ)Lorg/bukkit/Server;
/*     */     //   1401: ldc2_w -3029845096634460900
/*     */     //   1404: lload_1
/*     */     //   1405: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/PluginManager;
/*     */     //   1410: aload_3
/*     */     //   1411: ldc2_w -3063076929741861138
/*     */     //   1414: lload_1
/*     */     //   1415: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/plugin/Plugin;JJ)V
/*     */     //   1420: goto -> 1433
/*     */     //   1423: ldc2_w -3035098937772811702
/*     */     //   1426: lload_1
/*     */     //   1427: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1432: athrow
/*     */     //   1433: aload_0
/*     */     //   1434: ldc_w '縿䫐'
/*     */     //   1437: invokevirtual toCharArray : ()[C
/*     */     //   1440: dup
/*     */     //   1441: dup
/*     */     //   1442: iconst_0
/*     */     //   1443: dup_x1
/*     */     //   1444: caload
/*     */     //   1445: sipush #20066
/*     */     //   1448: ixor
/*     */     //   1449: i2c
/*     */     //   1450: castore
/*     */     //   1451: sipush #29047
/*     */     //   1454: iconst_3
/*     */     //   1455: iconst_4
/*     */     //   1456: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   1459: lload #21
/*     */     //   1461: ldc2_w -3028068095435353570
/*     */     //   1464: lload_1
/*     */     //   1465: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   1470: athrow
/*     */     //   1471: iconst_m1
/*     */     //   1472: istore #42
/*     */     //   1474: aload #39
/*     */     //   1476: lload #19
/*     */     //   1478: aload #41
/*     */     //   1480: ldc2_w -3083121402226884567
/*     */     //   1483: lload_1
/*     */     //   1484: <illegal opcode> b : (Lme/konsolas/aac/gf;JLme/konsolas/aac/s;JJ)Lme/konsolas/aac/gC;
/*     */     //   1489: lload #15
/*     */     //   1491: ldc2_w -3100973372529491055
/*     */     //   1494: lload_1
/*     */     //   1495: <illegal opcode> b : (Lme/konsolas/aac/gC;JJJ)Lme/konsolas/aac/H;
/*     */     //   1500: astore #44
/*     */     //   1502: lload_1
/*     */     //   1503: lconst_0
/*     */     //   1504: lcmp
/*     */     //   1505: iflt -> 1532
/*     */     //   1508: aload #44
/*     */     //   1510: aload #38
/*     */     //   1512: ifnull -> 1639
/*     */     //   1515: ldc2_w -3078057688814044635
/*     */     //   1518: lload_1
/*     */     //   1519: lload_1
/*     */     //   1520: lconst_0
/*     */     //   1521: lcmp
/*     */     //   1522: iflt -> 1612
/*     */     //   1525: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)I
/*     */     //   1530: istore #42
/*     */     //   1532: iload #42
/*     */     //   1534: sipush #200
/*     */     //   1537: if_icmpeq -> 1606
/*     */     //   1540: iload #42
/*     */     //   1542: sipush #403
/*     */     //   1545: lload_1
/*     */     //   1546: lconst_0
/*     */     //   1547: lcmp
/*     */     //   1548: ifle -> 1603
/*     */     //   1551: aload #38
/*     */     //   1553: ifnull -> 1603
/*     */     //   1556: goto -> 1569
/*     */     //   1559: ldc2_w -3035098937772811702
/*     */     //   1562: lload_1
/*     */     //   1563: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1568: athrow
/*     */     //   1569: if_icmpeq -> 1606
/*     */     //   1572: goto -> 1585
/*     */     //   1575: ldc2_w -3035098937772811702
/*     */     //   1578: lload_1
/*     */     //   1579: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1584: athrow
/*     */     //   1585: iload #42
/*     */     //   1587: sipush #404
/*     */     //   1590: goto -> 1603
/*     */     //   1593: ldc2_w -3035098937772811702
/*     */     //   1596: lload_1
/*     */     //   1597: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1602: athrow
/*     */     //   1603: if_icmpne -> 1666
/*     */     //   1606: aload #44
/*     */     //   1608: ldc2_w -3124308220498024630
/*     */     //   1611: lload_1
/*     */     //   1612: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)Lme/konsolas/aac/d2;
/*     */     //   1617: ldc2_w -3063210071626871103
/*     */     //   1620: lload_1
/*     */     //   1621: <illegal opcode> w : (Ljava/lang/Object;JJ)Ljava/lang/Object;
/*     */     //   1626: goto -> 1639
/*     */     //   1629: ldc2_w -3035098937772811702
/*     */     //   1632: lload_1
/*     */     //   1633: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1638: athrow
/*     */     //   1639: checkcast me/konsolas/aac/d2
/*     */     //   1642: lload #17
/*     */     //   1644: ldc2_w -3098948193114721346
/*     */     //   1647: lload_1
/*     */     //   1648: <illegal opcode> b : (Lme/konsolas/aac/d2;JJJ)Ljava/lang/String;
/*     */     //   1653: astore #43
/*     */     //   1655: lload_1
/*     */     //   1656: lconst_0
/*     */     //   1657: lcmp
/*     */     //   1658: iflt -> 1681
/*     */     //   1661: aload #38
/*     */     //   1663: ifnonnull -> 1681
/*     */     //   1666: sipush #16743
/*     */     //   1669: ldc2_w 3183817173233259031
/*     */     //   1672: lload_1
/*     */     //   1673: lxor
/*     */     //   1674: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1679: astore #43
/*     */     //   1681: lload_1
/*     */     //   1682: lconst_0
/*     */     //   1683: lcmp
/*     */     //   1684: iflt -> 1721
/*     */     //   1687: aload #44
/*     */     //   1689: aload #38
/*     */     //   1691: ifnull -> 1712
/*     */     //   1694: ifnull -> 1787
/*     */     //   1697: goto -> 1710
/*     */     //   1700: ldc2_w -3035098937772811702
/*     */     //   1703: lload_1
/*     */     //   1704: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1709: athrow
/*     */     //   1710: aload #44
/*     */     //   1712: ldc2_w -3122082902473943906
/*     */     //   1715: lload_1
/*     */     //   1716: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)V
/*     */     //   1721: goto -> 1787
/*     */     //   1724: astore #45
/*     */     //   1726: lload_1
/*     */     //   1727: lconst_0
/*     */     //   1728: lcmp
/*     */     //   1729: iflt -> 1766
/*     */     //   1732: aload #44
/*     */     //   1734: aload #38
/*     */     //   1736: ifnull -> 1757
/*     */     //   1739: ifnull -> 1784
/*     */     //   1742: goto -> 1755
/*     */     //   1745: ldc2_w -3035098937772811702
/*     */     //   1748: lload_1
/*     */     //   1749: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1754: athrow
/*     */     //   1755: aload #44
/*     */     //   1757: ldc2_w -3122082902473943906
/*     */     //   1760: lload_1
/*     */     //   1761: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)V
/*     */     //   1766: goto -> 1784
/*     */     //   1769: astore #46
/*     */     //   1771: aload #45
/*     */     //   1773: aload #46
/*     */     //   1775: ldc2_w -3071111792648956434
/*     */     //   1778: lload_1
/*     */     //   1779: <illegal opcode> b : (Ljava/lang/Throwable;Ljava/lang/Throwable;JJ)V
/*     */     //   1784: aload #45
/*     */     //   1786: athrow
/*     */     //   1787: goto -> 1807
/*     */     //   1790: astore #44
/*     */     //   1792: sipush #2852
/*     */     //   1795: ldc2_w 788996527932610654
/*     */     //   1798: lload_1
/*     */     //   1799: lxor
/*     */     //   1800: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1805: astore #43
/*     */     //   1807: aload_0
/*     */     //   1808: aload #43
/*     */     //   1810: putfield d : Ljava/lang/String;
/*     */     //   1813: aload_0
/*     */     //   1814: getfield d : Ljava/lang/String;
/*     */     //   1817: ldc2_w -3094915849987435815
/*     */     //   1820: lload_1
/*     */     //   1821: <illegal opcode> w : (Ljava/lang/String;JJ)Z
/*     */     //   1826: lload_1
/*     */     //   1827: lconst_0
/*     */     //   1828: lcmp
/*     */     //   1829: ifle -> 1954
/*     */     //   1832: aload #38
/*     */     //   1834: ifnull -> 1954
/*     */     //   1837: ifne -> 1952
/*     */     //   1840: goto -> 1853
/*     */     //   1843: ldc2_w -3035098937772811702
/*     */     //   1846: lload_1
/*     */     //   1847: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1852: athrow
/*     */     //   1853: aload_3
/*     */     //   1854: ldc2_w -3032067241959864612
/*     */     //   1857: lload_1
/*     */     //   1858: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   1863: aload_0
/*     */     //   1864: getfield d : Ljava/lang/String;
/*     */     //   1867: ldc2_w -3126861810621716445
/*     */     //   1870: lload_1
/*     */     //   1871: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   1876: ldc2_w -3132357839829540858
/*     */     //   1879: lload_1
/*     */     //   1880: <illegal opcode> w : (JJ)Lorg/bukkit/Server;
/*     */     //   1885: ldc2_w -3029845096634460900
/*     */     //   1888: lload_1
/*     */     //   1889: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/PluginManager;
/*     */     //   1894: aload_3
/*     */     //   1895: ldc2_w -3063076929741861138
/*     */     //   1898: lload_1
/*     */     //   1899: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/plugin/Plugin;JJ)V
/*     */     //   1904: aload_0
/*     */     //   1905: ldc_w '췥✿'
/*     */     //   1908: invokevirtual toCharArray : ()[C
/*     */     //   1911: dup
/*     */     //   1912: dup
/*     */     //   1913: iconst_0
/*     */     //   1914: dup_x1
/*     */     //   1915: caload
/*     */     //   1916: sipush #7090
/*     */     //   1919: ixor
/*     */     //   1920: i2c
/*     */     //   1921: castore
/*     */     //   1922: sipush #16451
/*     */     //   1925: iconst_0
/*     */     //   1926: iconst_0
/*     */     //   1927: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   1930: lload #21
/*     */     //   1932: ldc2_w -3028068095435353570
/*     */     //   1935: lload_1
/*     */     //   1936: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   1941: athrow
/*     */     //   1942: ldc2_w -3035098937772811702
/*     */     //   1945: lload_1
/*     */     //   1946: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   1951: athrow
/*     */     //   1952: iload #42
/*     */     //   1954: ifgt -> 2053
/*     */     //   1957: ldc2_w -3124524297489833258
/*     */     //   1960: lload_1
/*     */     //   1961: <illegal opcode> w : (JJ)Ljava/util/logging/Logger;
/*     */     //   1966: sipush #18488
/*     */     //   1969: ldc2_w 5094871872315972437
/*     */     //   1972: lload_1
/*     */     //   1973: lxor
/*     */     //   1974: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   1979: ldc2_w -3032513052347755982
/*     */     //   1982: lload_1
/*     */     //   1983: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   1988: ldc2_w 1001
/*     */     //   1991: ldc2_w -3043574759458926315
/*     */     //   1994: lload_1
/*     */     //   1995: <illegal opcode> w : (JJJ)V
/*     */     //   2000: goto -> 2053
/*     */     //   2003: ldc2_w -3035098937772811702
/*     */     //   2006: lload_1
/*     */     //   2007: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2012: athrow
/*     */     //   2013: astore #44
/*     */     //   2015: aload_0
/*     */     //   2016: ldc_w '㵤'
/*     */     //   2019: invokevirtual toCharArray : ()[C
/*     */     //   2022: dup
/*     */     //   2023: dup
/*     */     //   2024: iconst_0
/*     */     //   2025: dup_x1
/*     */     //   2026: caload
/*     */     //   2027: sipush #26082
/*     */     //   2030: ixor
/*     */     //   2031: i2c
/*     */     //   2032: castore
/*     */     //   2033: sipush #29272
/*     */     //   2036: iconst_2
/*     */     //   2037: iconst_1
/*     */     //   2038: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   2041: lload #21
/*     */     //   2043: ldc2_w -3028068095435353570
/*     */     //   2046: lload_1
/*     */     //   2047: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   2052: athrow
/*     */     //   2053: lload_1
/*     */     //   2054: lconst_0
/*     */     //   2055: lcmp
/*     */     //   2056: iflt -> 2069
/*     */     //   2059: aload #38
/*     */     //   2061: ifnonnull -> 3318
/*     */     //   2064: aload_0
/*     */     //   2065: aconst_null
/*     */     //   2066: putfield c : Ljava/lang/String;
/*     */     //   2069: goto -> 2082
/*     */     //   2072: ldc2_w -3035098937772811702
/*     */     //   2075: lload_1
/*     */     //   2076: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2081: athrow
/*     */     //   2082: new me/konsolas/aac/eQ
/*     */     //   2085: dup
/*     */     //   2086: lload #30
/*     */     //   2088: invokespecial <init> : (J)V
/*     */     //   2091: lload #11
/*     */     //   2093: getstatic me/konsolas/aac/jc.d : Lme/konsolas/aac/mm;
/*     */     //   2096: ldc2_w -3077842339820171970
/*     */     //   2099: lload_1
/*     */     //   2100: <illegal opcode> b : (Lme/konsolas/aac/eQ;JLme/konsolas/aac/mm;JJ)Lme/konsolas/aac/eQ;
/*     */     //   2105: iload #25
/*     */     //   2107: lload #26
/*     */     //   2109: sipush #18217
/*     */     //   2112: ldc2_w 3658783505031517265
/*     */     //   2115: lload_1
/*     */     //   2116: lxor
/*     */     //   2117: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2122: ldc me/konsolas/aac/AAC
/*     */     //   2124: ldc2_w -3077258182631327806
/*     */     //   2127: lload_1
/*     */     //   2128: <illegal opcode> b : (Ljava/lang/Class;JJ)Ljava/lang/Package;
/*     */     //   2133: ldc2_w -3040074079821997586
/*     */     //   2136: lload_1
/*     */     //   2137: <illegal opcode> b : (Ljava/lang/Package;JJ)Ljava/lang/String;
/*     */     //   2142: ldc2_w -3066789315829312085
/*     */     //   2145: lload_1
/*     */     //   2146: <illegal opcode> b : (Lme/konsolas/aac/eQ;IJLjava/lang/String;Ljava/lang/String;JJ)Lme/konsolas/aac/eQ;
/*     */     //   2151: iload #25
/*     */     //   2153: lload #26
/*     */     //   2155: sipush #11338
/*     */     //   2158: ldc2_w 5217211013277990689
/*     */     //   2161: lload_1
/*     */     //   2162: lxor
/*     */     //   2163: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2168: getstatic me/konsolas/aac/MetricsLite.userID : Ljava/lang/String;
/*     */     //   2171: ldc2_w -3066789315829312085
/*     */     //   2174: lload_1
/*     */     //   2175: <illegal opcode> b : (Lme/konsolas/aac/eQ;IJLjava/lang/String;Ljava/lang/String;JJ)Lme/konsolas/aac/eQ;
/*     */     //   2180: iload #25
/*     */     //   2182: lload #26
/*     */     //   2184: sipush #10724
/*     */     //   2187: ldc2_w 4866430901951642243
/*     */     //   2190: lload_1
/*     */     //   2191: lxor
/*     */     //   2192: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2197: aload_3
/*     */     //   2198: lload #7
/*     */     //   2200: ldc2_w -3034221458441672769
/*     */     //   2203: lload_1
/*     */     //   2204: <illegal opcode> w : (Lme/konsolas/aac/AAC;JJJ)Ljava/lang/String;
/*     */     //   2209: ldc2_w -3066789315829312085
/*     */     //   2212: lload_1
/*     */     //   2213: <illegal opcode> b : (Lme/konsolas/aac/eQ;IJLjava/lang/String;Ljava/lang/String;JJ)Lme/konsolas/aac/eQ;
/*     */     //   2218: iload #25
/*     */     //   2220: lload #26
/*     */     //   2222: sipush #8094
/*     */     //   2225: ldc2_w 8304643981639453932
/*     */     //   2228: lload_1
/*     */     //   2229: lxor
/*     */     //   2230: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2235: getstatic me/konsolas/aac/MetricsLite.nonceID : Ljava/lang/String;
/*     */     //   2238: ldc2_w -3066789315829312085
/*     */     //   2241: lload_1
/*     */     //   2242: <illegal opcode> b : (Lme/konsolas/aac/eQ;IJLjava/lang/String;Ljava/lang/String;JJ)Lme/konsolas/aac/eQ;
/*     */     //   2247: lload #36
/*     */     //   2249: ldc2_w -3070305333339495387
/*     */     //   2252: lload_1
/*     */     //   2253: <illegal opcode> b : (Lme/konsolas/aac/eQ;JJJ)Lme/konsolas/aac/jc;
/*     */     //   2258: astore #40
/*     */     //   2260: new me/konsolas/aac/k_
/*     */     //   2263: dup
/*     */     //   2264: lload #32
/*     */     //   2266: invokespecial <init> : (J)V
/*     */     //   2269: lload #34
/*     */     //   2271: sipush #21160
/*     */     //   2274: ldc2_w 9075116203758174684
/*     */     //   2277: lload_1
/*     */     //   2278: lxor
/*     */     //   2279: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2284: ldc2_w -3131187195178793718
/*     */     //   2287: lload_1
/*     */     //   2288: <illegal opcode> b : (Lme/konsolas/aac/k_;JLjava/lang/String;JJ)Lme/konsolas/aac/k_;
/*     */     //   2293: lload #28
/*     */     //   2295: aload #40
/*     */     //   2297: ldc2_w -3127096918623347840
/*     */     //   2300: lload_1
/*     */     //   2301: <illegal opcode> b : (Lme/konsolas/aac/k_;JLme/konsolas/aac/jR;JJ)Lme/konsolas/aac/k_;
/*     */     //   2306: lload #23
/*     */     //   2308: ldc2_w -3101369518112852609
/*     */     //   2311: lload_1
/*     */     //   2312: <illegal opcode> b : (Lme/konsolas/aac/k_;JJJ)Lme/konsolas/aac/s;
/*     */     //   2317: astore #41
/*     */     //   2319: aload #38
/*     */     //   2321: ifnull -> 2422
/*     */     //   2324: ldc2_w -3133610556941687970
/*     */     //   2327: lload_1
/*     */     //   2328: <illegal opcode> w : (JJ)Ljava/lang/SecurityManager;
/*     */     //   2333: ifnull -> 2460
/*     */     //   2336: goto -> 2349
/*     */     //   2339: ldc2_w -3035098937772811702
/*     */     //   2342: lload_1
/*     */     //   2343: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2348: athrow
/*     */     //   2349: aload_3
/*     */     //   2350: ldc2_w -3032067241959864612
/*     */     //   2353: lload_1
/*     */     //   2354: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   2359: sipush #20481
/*     */     //   2362: ldc2_w 3947760496698049405
/*     */     //   2365: lload_1
/*     */     //   2366: lxor
/*     */     //   2367: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2372: ldc2_w -3126861810621716445
/*     */     //   2375: lload_1
/*     */     //   2376: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   2381: ldc2_w -3132357839829540858
/*     */     //   2384: lload_1
/*     */     //   2385: <illegal opcode> w : (JJ)Lorg/bukkit/Server;
/*     */     //   2390: ldc2_w -3029845096634460900
/*     */     //   2393: lload_1
/*     */     //   2394: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/PluginManager;
/*     */     //   2399: aload_3
/*     */     //   2400: ldc2_w -3063076929741861138
/*     */     //   2403: lload_1
/*     */     //   2404: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/plugin/Plugin;JJ)V
/*     */     //   2409: goto -> 2422
/*     */     //   2412: ldc2_w -3035098937772811702
/*     */     //   2415: lload_1
/*     */     //   2416: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2421: athrow
/*     */     //   2422: aload_0
/*     */     //   2423: ldc_w '䍾䂒'
/*     */     //   2426: invokevirtual toCharArray : ()[C
/*     */     //   2429: dup
/*     */     //   2430: dup
/*     */     //   2431: iconst_0
/*     */     //   2432: dup_x1
/*     */     //   2433: caload
/*     */     //   2434: sipush #11615
/*     */     //   2437: ixor
/*     */     //   2438: i2c
/*     */     //   2439: castore
/*     */     //   2440: sipush #16911
/*     */     //   2443: iconst_1
/*     */     //   2444: iconst_3
/*     */     //   2445: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   2448: lload #21
/*     */     //   2450: ldc2_w -3028068095435353570
/*     */     //   2453: lload_1
/*     */     //   2454: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   2459: athrow
/*     */     //   2460: iconst_m1
/*     */     //   2461: istore #42
/*     */     //   2463: aload #39
/*     */     //   2465: lload #19
/*     */     //   2467: aload #41
/*     */     //   2469: ldc2_w -3083121402226884567
/*     */     //   2472: lload_1
/*     */     //   2473: <illegal opcode> b : (Lme/konsolas/aac/gf;JLme/konsolas/aac/s;JJ)Lme/konsolas/aac/gC;
/*     */     //   2478: lload #15
/*     */     //   2480: ldc2_w -3100973372529491055
/*     */     //   2483: lload_1
/*     */     //   2484: <illegal opcode> b : (Lme/konsolas/aac/gC;JJJ)Lme/konsolas/aac/H;
/*     */     //   2489: astore #45
/*     */     //   2491: aload #45
/*     */     //   2493: ldc2_w -3078057688814044635
/*     */     //   2496: lload_1
/*     */     //   2497: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)I
/*     */     //   2502: istore #42
/*     */     //   2504: iload #42
/*     */     //   2506: sipush #200
/*     */     //   2509: aload #38
/*     */     //   2511: ifnull -> 2711
/*     */     //   2514: if_icmpne -> 2693
/*     */     //   2517: goto -> 2530
/*     */     //   2520: ldc2_w -3035098937772811702
/*     */     //   2523: lload_1
/*     */     //   2524: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2529: athrow
/*     */     //   2530: getstatic me/konsolas/aac/kk.b : Z
/*     */     //   2533: ifne -> 2612
/*     */     //   2536: goto -> 2549
/*     */     //   2539: ldc2_w -3035098937772811702
/*     */     //   2542: lload_1
/*     */     //   2543: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2548: athrow
/*     */     //   2549: aload #45
/*     */     //   2551: ldc2_w -3124308220498024630
/*     */     //   2554: lload_1
/*     */     //   2555: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)Lme/konsolas/aac/d2;
/*     */     //   2560: aload #38
/*     */     //   2562: ifnull -> 2623
/*     */     //   2565: goto -> 2578
/*     */     //   2568: ldc2_w -3035098937772811702
/*     */     //   2571: lload_1
/*     */     //   2572: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2577: athrow
/*     */     //   2578: ifnonnull -> 2612
/*     */     //   2581: goto -> 2594
/*     */     //   2584: ldc2_w -3035098937772811702
/*     */     //   2587: lload_1
/*     */     //   2588: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2593: athrow
/*     */     //   2594: new java/lang/AssertionError
/*     */     //   2597: dup
/*     */     //   2598: invokespecial <init> : ()V
/*     */     //   2601: athrow
/*     */     //   2602: ldc2_w -3035098937772811702
/*     */     //   2605: lload_1
/*     */     //   2606: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2611: athrow
/*     */     //   2612: aload #45
/*     */     //   2614: ldc2_w -3124308220498024630
/*     */     //   2617: lload_1
/*     */     //   2618: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)Lme/konsolas/aac/d2;
/*     */     //   2623: lload #17
/*     */     //   2625: ldc2_w -3098948193114721346
/*     */     //   2628: lload_1
/*     */     //   2629: <illegal opcode> b : (Lme/konsolas/aac/d2;JJJ)Ljava/lang/String;
/*     */     //   2634: ldc_w '⌼'
/*     */     //   2637: invokevirtual toCharArray : ()[C
/*     */     //   2640: dup
/*     */     //   2641: dup
/*     */     //   2642: iconst_0
/*     */     //   2643: dup_x1
/*     */     //   2644: caload
/*     */     //   2645: sipush #16428
/*     */     //   2648: ixor
/*     */     //   2649: i2c
/*     */     //   2650: castore
/*     */     //   2651: sipush #7367
/*     */     //   2654: iconst_0
/*     */     //   2655: iconst_0
/*     */     //   2656: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   2659: ldc2_w -3064520444436563546
/*     */     //   2662: lload_1
/*     */     //   2663: <illegal opcode> b : (Ljava/lang/String;Ljava/lang/String;JJ)[Ljava/lang/String;
/*     */     //   2668: astore #46
/*     */     //   2670: aload #46
/*     */     //   2672: iconst_0
/*     */     //   2673: aaload
/*     */     //   2674: astore #43
/*     */     //   2676: aload #46
/*     */     //   2678: iconst_1
/*     */     //   2679: aaload
/*     */     //   2680: astore #44
/*     */     //   2682: lload_1
/*     */     //   2683: lconst_0
/*     */     //   2684: lcmp
/*     */     //   2685: ifle -> 2785
/*     */     //   2688: aload #38
/*     */     //   2690: ifnonnull -> 2785
/*     */     //   2693: iload #42
/*     */     //   2695: sipush #404
/*     */     //   2698: goto -> 2711
/*     */     //   2701: ldc2_w -3035098937772811702
/*     */     //   2704: lload_1
/*     */     //   2705: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2710: athrow
/*     */     //   2711: if_icmpne -> 2755
/*     */     //   2714: sipush #9470
/*     */     //   2717: ldc2_w 8299922784280131472
/*     */     //   2720: lload_1
/*     */     //   2721: lxor
/*     */     //   2722: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2727: astore #43
/*     */     //   2729: sipush #3528
/*     */     //   2732: ldc2_w 3634959577139781297
/*     */     //   2735: lload_1
/*     */     //   2736: lxor
/*     */     //   2737: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2742: astore #44
/*     */     //   2744: lload_1
/*     */     //   2745: lconst_0
/*     */     //   2746: lcmp
/*     */     //   2747: ifle -> 2785
/*     */     //   2750: aload #38
/*     */     //   2752: ifnonnull -> 2785
/*     */     //   2755: sipush #2852
/*     */     //   2758: ldc2_w 788996527932610654
/*     */     //   2761: lload_1
/*     */     //   2762: lxor
/*     */     //   2763: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2768: astore #43
/*     */     //   2770: sipush #2186
/*     */     //   2773: ldc2_w 7950350339564903402
/*     */     //   2776: lload_1
/*     */     //   2777: lxor
/*     */     //   2778: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2783: astore #44
/*     */     //   2785: lload_1
/*     */     //   2786: lconst_0
/*     */     //   2787: lcmp
/*     */     //   2788: iflt -> 2825
/*     */     //   2791: aload #45
/*     */     //   2793: aload #38
/*     */     //   2795: ifnull -> 2816
/*     */     //   2798: ifnull -> 2891
/*     */     //   2801: goto -> 2814
/*     */     //   2804: ldc2_w -3035098937772811702
/*     */     //   2807: lload_1
/*     */     //   2808: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2813: athrow
/*     */     //   2814: aload #45
/*     */     //   2816: ldc2_w -3122082902473943906
/*     */     //   2819: lload_1
/*     */     //   2820: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)V
/*     */     //   2825: goto -> 2891
/*     */     //   2828: astore #46
/*     */     //   2830: lload_1
/*     */     //   2831: lconst_0
/*     */     //   2832: lcmp
/*     */     //   2833: ifle -> 2870
/*     */     //   2836: aload #45
/*     */     //   2838: aload #38
/*     */     //   2840: ifnull -> 2861
/*     */     //   2843: ifnull -> 2888
/*     */     //   2846: goto -> 2859
/*     */     //   2849: ldc2_w -3035098937772811702
/*     */     //   2852: lload_1
/*     */     //   2853: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   2858: athrow
/*     */     //   2859: aload #45
/*     */     //   2861: ldc2_w -3122082902473943906
/*     */     //   2864: lload_1
/*     */     //   2865: <illegal opcode> b : (Lme/konsolas/aac/H;JJ)V
/*     */     //   2870: goto -> 2888
/*     */     //   2873: astore #47
/*     */     //   2875: aload #46
/*     */     //   2877: aload #47
/*     */     //   2879: ldc2_w -3071111792648956434
/*     */     //   2882: lload_1
/*     */     //   2883: <illegal opcode> b : (Ljava/lang/Throwable;Ljava/lang/Throwable;JJ)V
/*     */     //   2888: aload #46
/*     */     //   2890: athrow
/*     */     //   2891: goto -> 2974
/*     */     //   2894: astore #45
/*     */     //   2896: sipush #2852
/*     */     //   2899: ldc2_w 788996527932610654
/*     */     //   2902: lload_1
/*     */     //   2903: lxor
/*     */     //   2904: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2909: astore #43
/*     */     //   2911: new java/lang/StringBuilder
/*     */     //   2914: dup
/*     */     //   2915: invokespecial <init> : ()V
/*     */     //   2918: sipush #11593
/*     */     //   2921: ldc2_w 2678323063278386730
/*     */     //   2924: lload_1
/*     */     //   2925: lxor
/*     */     //   2926: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   2931: ldc2_w -3085346098442230034
/*     */     //   2934: lload_1
/*     */     //   2935: <illegal opcode> b : (Ljava/lang/StringBuilder;Ljava/lang/String;JJ)Ljava/lang/StringBuilder;
/*     */     //   2940: aload #45
/*     */     //   2942: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   2945: ldc2_w -3101693126886154955
/*     */     //   2948: lload_1
/*     */     //   2949: <illegal opcode> b : (Ljava/lang/Class;JJ)Ljava/lang/String;
/*     */     //   2954: ldc2_w -3085346098442230034
/*     */     //   2957: lload_1
/*     */     //   2958: <illegal opcode> b : (Ljava/lang/StringBuilder;Ljava/lang/String;JJ)Ljava/lang/StringBuilder;
/*     */     //   2963: ldc2_w -3101716068971206616
/*     */     //   2966: lload_1
/*     */     //   2967: <illegal opcode> b : (Ljava/lang/StringBuilder;JJ)Ljava/lang/String;
/*     */     //   2972: astore #44
/*     */     //   2974: aload #43
/*     */     //   2976: ldc2_w -3094915849987435815
/*     */     //   2979: lload_1
/*     */     //   2980: <illegal opcode> w : (Ljava/lang/String;JJ)Z
/*     */     //   2985: lload_1
/*     */     //   2986: lconst_0
/*     */     //   2987: lcmp
/*     */     //   2988: iflt -> 3135
/*     */     //   2991: aload #38
/*     */     //   2993: ifnull -> 3135
/*     */     //   2996: ifne -> 3109
/*     */     //   2999: goto -> 3012
/*     */     //   3002: ldc2_w -3035098937772811702
/*     */     //   3005: lload_1
/*     */     //   3006: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   3011: athrow
/*     */     //   3012: aload_3
/*     */     //   3013: ldc2_w -3032067241959864612
/*     */     //   3016: lload_1
/*     */     //   3017: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   3022: aload #44
/*     */     //   3024: ldc2_w -3126861810621716445
/*     */     //   3027: lload_1
/*     */     //   3028: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   3033: ldc2_w -3132357839829540858
/*     */     //   3036: lload_1
/*     */     //   3037: <illegal opcode> w : (JJ)Lorg/bukkit/Server;
/*     */     //   3042: ldc2_w -3029845096634460900
/*     */     //   3045: lload_1
/*     */     //   3046: <illegal opcode> b : (Lorg/bukkit/Server;JJ)Lorg/bukkit/plugin/PluginManager;
/*     */     //   3051: aload_3
/*     */     //   3052: ldc2_w -3063076929741861138
/*     */     //   3055: lload_1
/*     */     //   3056: <illegal opcode> b : (Lorg/bukkit/plugin/PluginManager;Lorg/bukkit/plugin/Plugin;JJ)V
/*     */     //   3061: aload_0
/*     */     //   3062: ldc_w '蔦䀊'
/*     */     //   3065: invokevirtual toCharArray : ()[C
/*     */     //   3068: dup
/*     */     //   3069: dup
/*     */     //   3070: iconst_0
/*     */     //   3071: dup_x1
/*     */     //   3072: caload
/*     */     //   3073: sipush #7655
/*     */     //   3076: ixor
/*     */     //   3077: i2c
/*     */     //   3078: castore
/*     */     //   3079: sipush #1770
/*     */     //   3082: iconst_4
/*     */     //   3083: iconst_0
/*     */     //   3084: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   3087: lload #21
/*     */     //   3089: ldc2_w -3028068095435353570
/*     */     //   3092: lload_1
/*     */     //   3093: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   3098: athrow
/*     */     //   3099: ldc2_w -3035098937772811702
/*     */     //   3102: lload_1
/*     */     //   3103: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   3108: athrow
/*     */     //   3109: aload_0
/*     */     //   3110: aload #43
/*     */     //   3112: putfield d : Ljava/lang/String;
/*     */     //   3115: aload #38
/*     */     //   3117: ifnull -> 3275
/*     */     //   3120: iload #42
/*     */     //   3122: goto -> 3135
/*     */     //   3125: ldc2_w -3035098937772811702
/*     */     //   3128: lload_1
/*     */     //   3129: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   3134: athrow
/*     */     //   3135: lload_1
/*     */     //   3136: lconst_0
/*     */     //   3137: lcmp
/*     */     //   3138: iflt -> 3155
/*     */     //   3141: ifle -> 3210
/*     */     //   3144: aload #43
/*     */     //   3146: ldc2_w -3094915849987435815
/*     */     //   3149: lload_1
/*     */     //   3150: <illegal opcode> w : (Ljava/lang/String;JJ)Z
/*     */     //   3155: ifeq -> 3210
/*     */     //   3158: goto -> 3171
/*     */     //   3161: ldc2_w -3035098937772811702
/*     */     //   3164: lload_1
/*     */     //   3165: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   3170: athrow
/*     */     //   3171: aload_3
/*     */     //   3172: ldc2_w -3032067241959864612
/*     */     //   3175: lload_1
/*     */     //   3176: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   3181: aload #44
/*     */     //   3183: ldc2_w -3080173819251955935
/*     */     //   3186: lload_1
/*     */     //   3187: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   3192: aload #38
/*     */     //   3194: ifnonnull -> 3318
/*     */     //   3197: goto -> 3210
/*     */     //   3200: ldc2_w -3035098937772811702
/*     */     //   3203: lload_1
/*     */     //   3204: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   3209: athrow
/*     */     //   3210: aload_3
/*     */     //   3211: ldc2_w -3032067241959864612
/*     */     //   3214: lload_1
/*     */     //   3215: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   3220: aload #44
/*     */     //   3222: ldc2_w -3032513052347755982
/*     */     //   3225: lload_1
/*     */     //   3226: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   3231: aload_3
/*     */     //   3232: ldc2_w -3032067241959864612
/*     */     //   3235: lload_1
/*     */     //   3236: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Ljava/util/logging/Logger;
/*     */     //   3241: sipush #27844
/*     */     //   3244: ldc2_w 3883546048882507694
/*     */     //   3247: lload_1
/*     */     //   3248: lxor
/*     */     //   3249: <illegal opcode> v : (IJ)Ljava/lang/String;
/*     */     //   3254: ldc2_w -3032513052347755982
/*     */     //   3257: lload_1
/*     */     //   3258: <illegal opcode> b : (Ljava/util/logging/Logger;Ljava/lang/String;JJ)V
/*     */     //   3263: ldc2_w 20117
/*     */     //   3266: ldc2_w -3043574759458926315
/*     */     //   3269: lload_1
/*     */     //   3270: <illegal opcode> w : (JJJ)V
/*     */     //   3275: goto -> 3318
/*     */     //   3278: astore #45
/*     */     //   3280: aload_0
/*     */     //   3281: ldc_w '⃩䄨'
/*     */     //   3284: invokevirtual toCharArray : ()[C
/*     */     //   3287: dup
/*     */     //   3288: dup
/*     */     //   3289: iconst_0
/*     */     //   3290: dup_x1
/*     */     //   3291: caload
/*     */     //   3292: sipush #6245
/*     */     //   3295: ixor
/*     */     //   3296: i2c
/*     */     //   3297: castore
/*     */     //   3298: sipush #19636
/*     */     //   3301: iconst_3
/*     */     //   3302: iconst_0
/*     */     //   3303: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   3306: lload #21
/*     */     //   3308: ldc2_w -3028068095435353570
/*     */     //   3311: lload_1
/*     */     //   3312: <illegal opcode> Ö : (Lme/konsolas/aac/kk;Ljava/lang/String;JJJ)Ljava/lang/RuntimeException;
/*     */     //   3317: athrow
/*     */     //   3318: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #140	-> 159
/*     */     //   #123	-> 163
/*     */     //   #21	-> 191
/*     */     //   #42	-> 201
/*     */     //   #23	-> 204
/*     */     //   #86	-> 206
/*     */     //   #22	-> 233
/*     */     //   #117	-> 245
/*     */     //   #97	-> 262
/*     */     //   #99	-> 299
/*     */     //   #115	-> 324
/*     */     //   #125	-> 366
/*     */     //   #18	-> 413
/*     */     //   #111	-> 416
/*     */     //   #78	-> 464
/*     */     //   #74	-> 505
/*     */     //   #28	-> 534
/*     */     //   #38	-> 555
/*     */     //   #79	-> 564
/*     */     //   #106	-> 566
/*     */     //   #19	-> 598
/*     */     //   #112	-> 626
/*     */     //   #72	-> 664
/*     */     //   #55	-> 676
/*     */     //   #49	-> 685
/*     */     //   #149	-> 698
/*     */     //   #107	-> 785
/*     */     //   #121	-> 817
/*     */     //   #32	-> 855
/*     */     //   #52	-> 867
/*     */     //   #81	-> 870
/*     */     //   #96	-> 872
/*     */     //   #70	-> 883
/*     */     //   #11	-> 915
/*     */     //   #56	-> 943
/*     */     //   #60	-> 969
/*     */     //   #12	-> 987
/*     */     //   #130	-> 1002
/*     */     //   #110	-> 1016
/*     */     //   #84	-> 1050
/*     */     //   #3	-> 1053
/*     */     //   #6	-> 1055
/*     */     //   #73	-> 1087
/*     */     //   #53	-> 1115
/*     */     //   #139	-> 1153
/*     */     //   #89	-> 1228
/*     */     //   #61	-> 1268
/*     */     //   #83	-> 1308
/*     */     //   #108	-> 1317
/*     */     //   #36	-> 1330
/*     */     //   #64	-> 1360
/*     */     //   #14	-> 1392
/*     */     //   #94	-> 1433
/*     */     //   #62	-> 1471
/*     */     //   #127	-> 1474
/*     */     //   #132	-> 1502
/*     */     //   #69	-> 1532
/*     */     //   #59	-> 1606
/*     */     //   #148	-> 1666
/*     */     //   #10	-> 1681
/*     */     //   #101	-> 1724
/*     */     //   #75	-> 1787
/*     */     //   #90	-> 1790
/*     */     //   #39	-> 1800
/*     */     //   #144	-> 1807
/*     */     //   #77	-> 1813
/*     */     //   #76	-> 1853
/*     */     //   #119	-> 1876
/*     */     //   #63	-> 1904
/*     */     //   #104	-> 1952
/*     */     //   #102	-> 1957
/*     */     //   #109	-> 1988
/*     */     //   #43	-> 2000
/*     */     //   #133	-> 2013
/*     */     //   #137	-> 2015
/*     */     //   #5	-> 2053
/*     */     //   #7	-> 2064
/*     */     //   #150	-> 2082
/*     */     //   #16	-> 2096
/*     */     //   #47	-> 2124
/*     */     //   #91	-> 2171
/*     */     //   #58	-> 2198
/*     */     //   #146	-> 2238
/*     */     //   #85	-> 2247
/*     */     //   #131	-> 2260
/*     */     //   #134	-> 2284
/*     */     //   #31	-> 2297
/*     */     //   #138	-> 2306
/*     */     //   #100	-> 2319
/*     */     //   #105	-> 2349
/*     */     //   #136	-> 2381
/*     */     //   #48	-> 2422
/*     */     //   #25	-> 2460
/*     */     //   #145	-> 2463
/*     */     //   #95	-> 2491
/*     */     //   #71	-> 2504
/*     */     //   #116	-> 2530
/*     */     //   #141	-> 2612
/*     */     //   #143	-> 2670
/*     */     //   #9	-> 2676
/*     */     //   #88	-> 2682
/*     */     //   #30	-> 2714
/*     */     //   #152	-> 2737
/*     */     //   #50	-> 2755
/*     */     //   #37	-> 2778
/*     */     //   #87	-> 2785
/*     */     //   #135	-> 2828
/*     */     //   #29	-> 2891
/*     */     //   #15	-> 2894
/*     */     //   #114	-> 2904
/*     */     //   #124	-> 2911
/*     */     //   #35	-> 2974
/*     */     //   #120	-> 3012
/*     */     //   #26	-> 3033
/*     */     //   #103	-> 3061
/*     */     //   #27	-> 3109
/*     */     //   #129	-> 3115
/*     */     //   #34	-> 3171
/*     */     //   #45	-> 3210
/*     */     //   #20	-> 3231
/*     */     //   #151	-> 3263
/*     */     //   #126	-> 3275
/*     */     //   #113	-> 3278
/*     */     //   #128	-> 3280
/*     */     //   #24	-> 3318
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   191	201	204	java/lang/Throwable
/*     */     //   206	555	564	java/lang/Throwable
/*     */     //   464	521	524	java/lang/Throwable
/*     */     //   516	537	540	java/lang/Throwable
/*     */     //   698	731	734	java/lang/Throwable
/*     */     //   703	772	775	java/lang/Throwable
/*     */     //   817	842	845	java/lang/Throwable
/*     */     //   855	867	870	java/io/IOException
/*     */     //   969	1050	1053	java/io/IOException
/*     */     //   987	1002	1016	java/lang/Throwable
/*     */     //   1018	1029	1032	java/lang/Throwable
/*     */     //   1330	1347	1350	java/lang/Throwable
/*     */     //   1335	1420	1423	java/lang/Throwable
/*     */     //   1474	1787	1790	java/io/IOException
/*     */     //   1502	1681	1724	java/lang/Throwable
/*     */     //   1532	1556	1559	java/lang/Throwable
/*     */     //   1540	1572	1575	java/lang/Throwable
/*     */     //   1569	1590	1593	java/lang/Throwable
/*     */     //   1603	1626	1629	java/lang/Throwable
/*     */     //   1681	1697	1700	java/lang/Throwable
/*     */     //   1726	1742	1745	java/lang/Throwable
/*     */     //   1755	1766	1769	java/lang/Throwable
/*     */     //   1807	1840	1843	java/lang/Throwable
/*     */     //   1837	1942	1942	java/lang/Throwable
/*     */     //   1954	2003	2003	java/io/IOException
/*     */     //   1988	2000	2013	java/lang/InterruptedException
/*     */     //   2053	2069	2072	java/lang/Throwable
/*     */     //   2319	2336	2339	java/lang/Throwable
/*     */     //   2324	2409	2412	java/lang/Throwable
/*     */     //   2463	2891	2894	java/io/IOException
/*     */     //   2491	2785	2828	java/lang/Throwable
/*     */     //   2504	2517	2520	java/lang/Throwable
/*     */     //   2514	2536	2539	java/lang/Throwable
/*     */     //   2530	2565	2568	java/lang/Throwable
/*     */     //   2549	2581	2584	java/lang/Throwable
/*     */     //   2578	2602	2602	java/lang/Throwable
/*     */     //   2682	2698	2701	java/lang/Throwable
/*     */     //   2785	2801	2804	java/lang/Throwable
/*     */     //   2830	2846	2849	java/lang/Throwable
/*     */     //   2859	2870	2873	java/lang/Throwable
/*     */     //   2974	2999	3002	java/lang/Throwable
/*     */     //   2996	3099	3099	java/lang/Throwable
/*     */     //   3109	3122	3125	java/lang/Throwable
/*     */     //   3135	3158	3161	java/lang/Throwable
/*     */     //   3144	3197	3200	java/lang/Throwable
/*     */     //   3263	3275	3278	java/lang/InterruptedException
/*     */   }
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
/*     */   public String b() {
/* 147 */     return this.c;
/*     */   }
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: ldc2_w 4956025978148260038
/*     */     //   3: ldc2_w 1063979064640567536
/*     */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*     */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*     */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*     */     //   15: ldc2_w 52515215623650
/*     */     //   18: invokeinterface a : (J)J
/*     */     //   23: putstatic me/konsolas/aac/kk.e : J
/*     */     //   26: getstatic me/konsolas/aac/kk.e : J
/*     */     //   29: ldc2_w 106407606270331
/*     */     //   32: lxor
/*     */     //   33: lstore #9
/*     */     //   35: new java/util/HashMap
/*     */     //   38: dup
/*     */     //   39: bipush #13
/*     */     //   41: invokespecial <init> : (I)V
/*     */     //   44: putstatic me/konsolas/aac/kk.h : Ljava/util/Map;
/*     */     //   47: ldc_w '䝁锎롬堭췭Ⴆᆪ㓖펈泶?໱됻퀍㿠슃蛳톼汮'
/*     */     //   50: invokevirtual toCharArray : ()[C
/*     */     //   53: dup
/*     */     //   54: dup
/*     */     //   55: bipush #7
/*     */     //   57: dup_x1
/*     */     //   58: caload
/*     */     //   59: sipush #8420
/*     */     //   62: ixor
/*     */     //   63: i2c
/*     */     //   64: castore
/*     */     //   65: sipush #2476
/*     */     //   68: iconst_1
/*     */     //   69: iconst_1
/*     */     //   70: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   73: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*     */     //   76: dup
/*     */     //   77: astore_0
/*     */     //   78: iconst_2
/*     */     //   79: ldc_w '蝹䊧ᝦȍ'
/*     */     //   82: invokevirtual toCharArray : ()[C
/*     */     //   85: dup
/*     */     //   86: dup
/*     */     //   87: iconst_0
/*     */     //   88: dup_x1
/*     */     //   89: caload
/*     */     //   90: sipush #2441
/*     */     //   93: ixor
/*     */     //   94: i2c
/*     */     //   95: castore
/*     */     //   96: sipush #29732
/*     */     //   99: iconst_5
/*     */     //   100: iconst_1
/*     */     //   101: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   104: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*     */     //   107: bipush #8
/*     */     //   109: newarray byte
/*     */     //   111: dup
/*     */     //   112: iconst_0
/*     */     //   113: lload #9
/*     */     //   115: bipush #56
/*     */     //   117: lushr
/*     */     //   118: l2i
/*     */     //   119: i2b
/*     */     //   120: bastore
/*     */     //   121: iconst_1
/*     */     //   122: istore_1
/*     */     //   123: iload_1
/*     */     //   124: bipush #8
/*     */     //   126: if_icmpge -> 150
/*     */     //   129: dup
/*     */     //   130: iload_1
/*     */     //   131: lload #9
/*     */     //   133: iload_1
/*     */     //   134: bipush #8
/*     */     //   136: imul
/*     */     //   137: lshl
/*     */     //   138: bipush #56
/*     */     //   140: lushr
/*     */     //   141: l2i
/*     */     //   142: i2b
/*     */     //   143: bastore
/*     */     //   144: iinc #1, 1
/*     */     //   147: goto -> 123
/*     */     //   150: new javax/crypto/spec/DESKeySpec
/*     */     //   153: dup_x1
/*     */     //   154: swap
/*     */     //   155: invokespecial <init> : ([B)V
/*     */     //   158: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*     */     //   161: new javax/crypto/spec/IvParameterSpec
/*     */     //   164: dup
/*     */     //   165: bipush #8
/*     */     //   167: newarray byte
/*     */     //   169: invokespecial <init> : ([B)V
/*     */     //   172: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*     */     //   175: bipush #34
/*     */     //   177: anewarray java/lang/String
/*     */     //   180: astore #7
/*     */     //   182: iconst_0
/*     */     //   183: istore #5
/*     */     //   185: ldc_w 'る⧥껡ꡚ㵵昇칣巖殭䗼뿅뢽ﻲ퓦誫聜㿢侂紤툚껺√븘ꎛ?鰫䧳៤䴶䊓搘얖鼥氓籬랲裸ꡥ屚❗諴컃똨诵쀋끑싾䎔언쑸륽䋮㜌铝貤쯖喤ℾ㽅硅㇌﷩㉷乔㙥瘵쵤죻㤸忨ࢱ⧺휵ኍ꫊섕燱쮹⢙摳퇊΍襜ⴞ䋙≧觳?ᜟ蔬훹ᯧܺ枸ڼ㮹碧징㰑鞚忪?㽾⼢붼ᦧዠ烶섾桾ᘏ胩ᖸ謁ꝋ䈙㻈΄륿撈鎻ხ龝믌腨侐焸㸝촫號ﲈ߈똳晥涕衭ூ컊뷍糼?៌響?ࠓ⤬鵂뜚女⫔㢔ᱦ亯蠭鲂퓝Ħ㬞䙥㸕ꌂ逅꣭䑞逍脏E襚쩒쵻껺䁊钞㧐➏Ꞑ餝ꁭ胜펰㞬ﱀ瘝瘔?䏀⋣漱ɗ퍭ꃑ蹆晏麤쿩蜳縚⁊噆홡泑迢↘࿍?侖ᣪ궭㮧㡵브尌撇戫溅?杚ኅᠵ䘳낄婙Ⱳ୐럹⪎┞႞걍ᆽ쭃ᡜ଺餬아乮ㅐ䍬ꄃ莃?漞㒑鍧䭇蕘뮷㚡쬇൐堃㹾迩몐䵮퉑݃៚漭Ȳ鋥࡮쎙?୬⵫㕯㏠ꇶ쓵獚⁝㙢忝?Ủ块ﹳ?桏䳋掆⚵䓱胧㣺챽⴦ᜎ쒁닣̗糿䘟ﵑ䫯蔥뫾ყⅱ?ꁓఔᎈな冞獬ꙝ됛ﭾ䢠砌搁嘇⨥壉ﵕ琰⳱梓벪衇⮊䫔ꢴ洫߂뱚꒦ᵰ?孜棫ꂽ㈄ሒ孁栫橭ꏱ裆ʒ捸梅壑蹠涺⻡瘒䞪せꈍ濸쌙ニ笪⬤㭲⏟Έ釔制ථ↣?봏??칵鬽埱췈㜎?奞赠䌗ڱ笻욫ꅻ뉵嘦羨?劅䈭ₔ禋ﶈ訰謁ୃ짂漉₭䶯궥尒鶌䙥?ꐑ諯穉実Ẻꑸﻢ䧍퇫׶ꙋꭺ闸?غਇ씞ꋛ쿾戄唈ﲶ岄셯ⷼᗳ䎴彋펽徱″蠪蟱㠉?㺻๫穏蠶ꐛ딀㪯ᯌ褑藣䮒筤퀃復뾾雟巒⏟偛꿔됧잟リ丏ﲎ갛箥잴謫沒魰枆Ἔś憭?孉妁Ψ㥤ᝌ液㺌䦣‱䴚돮고珧㤮?괋첂髥䆫ᓰ映㰙쇄햷᧜憗㈊隂븩킰㷸娼?ᆂ뺕齣뼈骽鞒蜝왲땭䑌燒긒죗Ά頁㖢⇋뎖遾䣄㫦ﾏ꟣욥ꄼ줾㕚᷆?馇獶﮽ᓉ鉼燄᠑㺻佼灾቙຅巻ꚇ穯㡷瘒٪랦쉴샽樷쀯ퟍ玂ᨪ跹讝㼺␤槙เ荛뎾膔䑫ళ̔ꎿ⴨䆯ᖏ겱뭪槜Ụ틥╷稸頎〽ⳓ奘䰨ⴙ挰맙代锅ޤ㫈ڙ甗趧መ㍅䡉뾓ࢳਏ씞䂗㼴浝憊愁␗滷ഛἜ礊䩖晴ಓࡌ馬묁燹ꩅ뽰⍸뎊엻耳罄撽䫔仪뮥圽㸍僫懍韋分饶䄫萛㇄ꠠ㿒蹄䈥䮂ᒒ쾎瘧䆦䈖ਫ穎꼤횓꼪굧粲칊ᆶ探觍媘㔜ཨ퉼볤믠囕쮐㵨벞⇊鸔졒?로ᶍꂛఁ蝝츶똆⯓ꁖ滤ઘ쵫賛য়滴홆ℶ旁﹬ȅ誫?ﲇ᱐吡渮ଦ鲧㱓壉鰊髊ٜ煓?务摦ⶖ赡㑳嫋刎螣䲸굗퓭ﲮ퍙鏊ꡦᖳ摎태⇡컧瞛뷞볠憅㺼䇎튙騢覶纤ᎈ䦓㽬↜㕒䵞ၮꢍ놈䠁쩖톕噇꛵旳蹅㲘串瘹緲?靈՞є獖칓퓷뾎◓?謝衎뮶庙ᾙ悵许᤯ﳐ蝺?ൟ百ꎟ䪘༣텬ࡒ䏣雒䴜臠煦쀯⭷뿂琅塃᳙ᓘע컼ᕷ⃄ਜ਼㱏뎷픴裕칰㈾떐탳亭匩笸ᆻ喤쒈롏륍釡戨杧勺撵㚻軋㯳膬셫岰⚪谕饴ີ큼ᦄ㱐亂ⱆ馴濔嘟핞؁鈙꾾?㺑豋藹税ྴ鴹暤汦킮婙?ﰖ哷?꼚嗱叐혉䬪匨쑢?ⵞ挎羙ｙ媵投蜋욵⊘姠蕦⿹脝᫕軁?ꦪ㳿㫓뒡鲟?뀸ⴴ婣ᝆ⊬େꂿ聙鴅踔቙錁⁝쟯讬?꿀晶ᥨ㒐ퟜ?呻ꋨ㵌Ҏ踭汾벺奴ą䑬舵댾б萆鷖樽㓥₸쯲?豛艝噂峺枹낉﯂䙍ޣ槼疳?ؽ婰瓺거蚭绑ꏺ䘊Ċ涥෦핲罿ꋕ쭜ꍉ﨔梡᫂鱝⫬䅱䪶ⱌ샧乧雿횊笖䛥햞橊忞爟鯄䚥㏻锢㬚ꀛ೽痌㗎鯣딚붘ㆴ삞훪﹟㨐㤸䶰?괾਌䥜뛡?感⺏ᥕꉨ⩯礞蓋觓蠏控隥錬᭥න浘Ⰳ鯖썀ᆣ谒缿턣滀ꈼ௟濬㗍坥浠瀵銳䪋便摕뜬虊?ਫ਼?⭝╘퀵Ó崠⽵횥圵鍜?䇔謄ଲᤷх쟬섨傳⼊퀧䆳ꇋ긠䷣앥଩윳⓿쉎蕗踦僧ѿ⬹蔫몞軩骏䫳꫙㊤䇸夑ꆪ⺈阩㾚᢫ꄓ뱎怕ს葷枷兓턺⮪딻㷫とᨚ金阕澴韻蓚惐俪Ⅰ埝▾䇻္ḕ淠克傶覤ժ窡᡼뤄ꫣ陧졻᲎䲿襁⬝෴⣥ﴟ䐧ፋᅂ'
/*     */     //   188: invokevirtual toCharArray : ()[C
/*     */     //   191: dup
/*     */     //   192: dup
/*     */     //   193: sipush #708
/*     */     //   196: dup_x1
/*     */     //   197: caload
/*     */     //   198: sipush #13520
/*     */     //   201: ixor
/*     */     //   202: i2c
/*     */     //   203: castore
/*     */     //   204: sipush #12450
/*     */     //   207: iconst_4
/*     */     //   208: iconst_0
/*     */     //   209: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   212: dup
/*     */     //   213: astore #4
/*     */     //   215: invokevirtual length : ()I
/*     */     //   218: istore #6
/*     */     //   220: bipush #48
/*     */     //   222: istore_3
/*     */     //   223: iconst_m1
/*     */     //   224: istore_2
/*     */     //   225: iinc #2, 1
/*     */     //   228: aload #4
/*     */     //   230: iload_2
/*     */     //   231: dup
/*     */     //   232: iload_3
/*     */     //   233: iadd
/*     */     //   234: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   237: iconst_m1
/*     */     //   238: goto -> 372
/*     */     //   241: aload #7
/*     */     //   243: swap
/*     */     //   244: iload #5
/*     */     //   246: iinc #5, 1
/*     */     //   249: swap
/*     */     //   250: aastore
/*     */     //   251: iload_2
/*     */     //   252: iload_3
/*     */     //   253: iadd
/*     */     //   254: dup
/*     */     //   255: istore_2
/*     */     //   256: iload #6
/*     */     //   258: if_icmpge -> 271
/*     */     //   261: aload #4
/*     */     //   263: iload_2
/*     */     //   264: invokevirtual charAt : (I)C
/*     */     //   267: istore_3
/*     */     //   268: goto -> 225
/*     */     //   271: ldc_w '꒟ﵢ鴓ꌺ鑶⼹飙⤢饻逵㕍䇻蹉딚锸邝뉾ဖµ薗폅뱮놷ഗⶤ鞉恭坰襖䋅깧糒ᙐ盖ぴ飗㚹훒画㤒ᯏ汐ﯮ鶽Ჯ㑭䔯?ﲓ顃ࣣ윕昂叓텖쑦鋢᳘䌒졋劧ُ湋൧氷獰箰蚁ꐸ遀靼Хꀈ梥蝏氡둁銅⹯㸥抐꺛︾詠ယ㣡ȅ頯⩹'
/*     */     //   274: invokevirtual toCharArray : ()[C
/*     */     //   277: dup
/*     */     //   278: dup
/*     */     //   279: bipush #8
/*     */     //   281: dup_x1
/*     */     //   282: caload
/*     */     //   283: sipush #32094
/*     */     //   286: ixor
/*     */     //   287: i2c
/*     */     //   288: castore
/*     */     //   289: sipush #5840
/*     */     //   292: iconst_3
/*     */     //   293: iconst_3
/*     */     //   294: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   297: dup
/*     */     //   298: astore #4
/*     */     //   300: invokevirtual length : ()I
/*     */     //   303: istore #6
/*     */     //   305: bipush #16
/*     */     //   307: istore_3
/*     */     //   308: iconst_m1
/*     */     //   309: istore_2
/*     */     //   310: iinc #2, 1
/*     */     //   313: aload #4
/*     */     //   315: iload_2
/*     */     //   316: dup
/*     */     //   317: iload_3
/*     */     //   318: iadd
/*     */     //   319: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   322: iconst_0
/*     */     //   323: goto -> 372
/*     */     //   326: aload #7
/*     */     //   328: swap
/*     */     //   329: iload #5
/*     */     //   331: iinc #5, 1
/*     */     //   334: swap
/*     */     //   335: aastore
/*     */     //   336: iload_2
/*     */     //   337: iload_3
/*     */     //   338: iadd
/*     */     //   339: dup
/*     */     //   340: istore_2
/*     */     //   341: iload #6
/*     */     //   343: if_icmpge -> 356
/*     */     //   346: aload #4
/*     */     //   348: iload_2
/*     */     //   349: invokevirtual charAt : (I)C
/*     */     //   352: istore_3
/*     */     //   353: goto -> 310
/*     */     //   356: aload #7
/*     */     //   358: putstatic me/konsolas/aac/kk.f : [Ljava/lang/String;
/*     */     //   361: bipush #34
/*     */     //   363: anewarray java/lang/String
/*     */     //   366: putstatic me/konsolas/aac/kk.g : [Ljava/lang/String;
/*     */     //   369: goto -> 436
/*     */     //   372: swap
/*     */     //   373: ldc_w '튼퀳⓳ꊆ鑸὿㥖ಿ'
/*     */     //   376: invokevirtual toCharArray : ()[C
/*     */     //   379: dup
/*     */     //   380: dup
/*     */     //   381: iconst_3
/*     */     //   382: dup_x1
/*     */     //   383: caload
/*     */     //   384: sipush #7433
/*     */     //   387: ixor
/*     */     //   388: i2c
/*     */     //   389: castore
/*     */     //   390: sipush #15414
/*     */     //   393: iconst_4
/*     */     //   394: iconst_5
/*     */     //   395: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   398: invokevirtual getBytes : (Ljava/lang/String;)[B
/*     */     //   401: aload_0
/*     */     //   402: swap
/*     */     //   403: invokevirtual doFinal : ([B)[B
/*     */     //   406: astore #8
/*     */     //   408: aload #8
/*     */     //   410: invokestatic a : ([B)Ljava/lang/String;
/*     */     //   413: invokevirtual intern : ()Ljava/lang/String;
/*     */     //   416: swap
/*     */     //   417: tableswitch default -> 241, 0 -> 326
/*     */     //   436: ldc me/konsolas/aac/kk
/*     */     //   438: ldc2_w -7780864061852507666
/*     */     //   441: lload #9
/*     */     //   443: <illegal opcode> b : (Ljava/lang/Class;JJ)Z
/*     */     //   448: ifne -> 466
/*     */     //   451: iconst_1
/*     */     //   452: goto -> 467
/*     */     //   455: ldc2_w -7772589704302716023
/*     */     //   458: lload #9
/*     */     //   460: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   465: athrow
/*     */     //   466: iconst_0
/*     */     //   467: putstatic me/konsolas/aac/kk.b : Z
/*     */     //   470: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 436
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   436	455	455	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private static Throwable a(Throwable paramThrowable) {
/*     */     return paramThrowable;
/*     */   }
/*     */   
/*     */   private static String a(byte[] paramArrayOfbyte) {
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
/*     */   private static String a(int paramInt, long paramLong) {
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x473A;
/*     */     if (g[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])h.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           "䙅귛迶嫛ņ壩魞✒椄♨㔉㸞僝巵횉Ꝋﭟ锸孙".toCharArray()[7] = (char)("䙅귛迶嫛ņ壩魞✒椄♨㔉㸞僝巵횉Ꝋﭟ锸孙".toCharArray()[7] ^ 0x572B);
/*     */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("䙅귛迶嫛ņ壩魞✒椄♨㔉㸞僝巵횉Ꝋﭟ锸孙".toCharArray(), (short)7906, true, true));
/*     */           "萸㕸⼣ㄚ".toCharArray()[1] = (char)("萸㕸⼣ㄚ".toCharArray()[1] ^ 0x5957);
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("萸㕸⼣ㄚ".toCharArray(), (short)20023, false, true));
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           h.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         "ิ膳簮갔攝䰕覆㹨뎢␺ꯟ⬱ć㕢얠黚촭〻傪".toCharArray()[5] = (char)("ิ膳簮갔攝䰕覆㹨뎢␺ꯟ⬱ć㕢얠黚촭〻傪".toCharArray()[5] ^ 0x358C);
/*     */         throw new RuntimeException(dP$dt.X("ิ膳簮갔攝䰕覆㹨뎢␺ꯟ⬱ć㕢얠黚촭〻傪".toCharArray(), (short)23294, true, true), exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       "獏ᔰ눨쿹ᤵ♍휀ⲥ施传".toCharArray()[3] = (char)("獏ᔰ눨쿹ᤵ♍휀ⲥ施传".toCharArray()[3] ^ 0x74DC);
/*     */       byte[] arrayOfByte2 = f[i].getBytes(dP$dt.X("獏ᔰ눨쿹ᤵ♍휀ⲥ施传".toCharArray(), (short)21589, true, true));
/*     */       g[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return g[i];
/*     */   }
/*     */   
/*     */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*     */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*     */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*     */     String str = a(i, l);
/*     */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*     */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*     */     return str;
/*     */   }
/*     */   
/*     */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
/*     */     //   66: ldc_w 'ღﻭᒠ登歈溤哊ᴞ箽⸴?ፁ즾ᴥ'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: bipush #13
/*     */     //   76: dup_x1
/*     */     //   77: caload
/*     */     //   78: sipush #24888
/*     */     //   81: ixor
/*     */     //   82: i2c
/*     */     //   83: castore
/*     */     //   84: sipush #10971
/*     */     //   87: iconst_5
/*     */     //   88: iconst_2
/*     */     //   89: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w '䑪??န'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_1
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #24618
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #5089
/*     */     //   115: iconst_0
/*     */     //   116: iconst_5
/*     */     //   117: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: aload_1
/*     */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   127: ldc_w '켯妌⛏'
/*     */     //   130: invokevirtual toCharArray : ()[C
/*     */     //   133: dup
/*     */     //   134: dup
/*     */     //   135: iconst_0
/*     */     //   136: dup_x1
/*     */     //   137: caload
/*     */     //   138: sipush #7026
/*     */     //   141: ixor
/*     */     //   142: i2c
/*     */     //   143: castore
/*     */     //   144: sipush #26957
/*     */     //   147: iconst_1
/*     */     //   148: iconst_5
/*     */     //   149: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */