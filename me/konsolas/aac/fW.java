/*     */ package me.konsolas.aac;
/*     */ import java.io.EOFException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MutableCallSite;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.charset.Charset;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.spec.DESKeySpec;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ 
/*     */ public final class fw implements bX, gi, Cloneable, ByteChannel {
/*     */   private static final byte[] d;
/*     */   static final int c = 65533;
/*     */   @Nullable
/*     */   eV b;
/*     */   long a;
/*     */   private static int e;
/*     */   
/*     */   public gZ a(long paramLong1, long paramLong2) {
/*  24 */     long l = paramLong2 ^ 0x3C9F397FA986L; return new gZ(a(paramLong1, l));
/*     */   }
/*     */ 
/*     */   
/*     */   private static final long f;
/*     */   
/*     */   private static final String[] g;
/*     */   private static final String[] h;
/*     */   private static final Map i;
/*     */   
/*     */   public fw d(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w -5751279498755995545
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: new me/konsolas/aac/fw
/*     */     //   18: dup
/*     */     //   19: invokespecial <init> : ()V
/*     */     //   22: astore #4
/*     */     //   24: istore_3
/*     */     //   25: aload_0
/*     */     //   26: iload_3
/*     */     //   27: ifeq -> 99
/*     */     //   30: getfield a : J
/*     */     //   33: lconst_0
/*     */     //   34: lcmp
/*     */     //   35: ifne -> 64
/*     */     //   38: goto -> 51
/*     */     //   41: ldc2_w -5751187323604639399
/*     */     //   44: lload_1
/*     */     //   45: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   50: athrow
/*     */     //   51: aload #4
/*     */     //   53: areturn
/*     */     //   54: ldc2_w -5751187323604639399
/*     */     //   57: lload_1
/*     */     //   58: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   63: athrow
/*     */     //   64: aload #4
/*     */     //   66: aload_0
/*     */     //   67: getfield b : Lme/konsolas/aac/eV;
/*     */     //   70: invokevirtual a : ()Lme/konsolas/aac/eV;
/*     */     //   73: putfield b : Lme/konsolas/aac/eV;
/*     */     //   76: aload #4
/*     */     //   78: getfield b : Lme/konsolas/aac/eV;
/*     */     //   81: aload #4
/*     */     //   83: getfield b : Lme/konsolas/aac/eV;
/*     */     //   86: aload #4
/*     */     //   88: getfield b : Lme/konsolas/aac/eV;
/*     */     //   91: dup_x1
/*     */     //   92: putfield e : Lme/konsolas/aac/eV;
/*     */     //   95: putfield b : Lme/konsolas/aac/eV;
/*     */     //   98: aload_0
/*     */     //   99: getfield b : Lme/konsolas/aac/eV;
/*     */     //   102: getfield b : Lme/konsolas/aac/eV;
/*     */     //   105: astore #5
/*     */     //   107: aload #5
/*     */     //   109: aload_0
/*     */     //   110: getfield b : Lme/konsolas/aac/eV;
/*     */     //   113: if_acmpeq -> 173
/*     */     //   116: aload #4
/*     */     //   118: lload_1
/*     */     //   119: lconst_0
/*     */     //   120: lcmp
/*     */     //   121: ifle -> 184
/*     */     //   124: getfield b : Lme/konsolas/aac/eV;
/*     */     //   127: getfield e : Lme/konsolas/aac/eV;
/*     */     //   130: aload #5
/*     */     //   132: invokevirtual a : ()Lme/konsolas/aac/eV;
/*     */     //   135: invokevirtual a : (Lme/konsolas/aac/eV;)Lme/konsolas/aac/eV;
/*     */     //   138: pop
/*     */     //   139: aload #5
/*     */     //   141: getfield b : Lme/konsolas/aac/eV;
/*     */     //   144: astore #5
/*     */     //   146: iload_3
/*     */     //   147: ifeq -> 182
/*     */     //   150: iload_3
/*     */     //   151: ifne -> 107
/*     */     //   154: lload_1
/*     */     //   155: lconst_0
/*     */     //   156: lcmp
/*     */     //   157: ifle -> 146
/*     */     //   160: goto -> 173
/*     */     //   163: ldc2_w -5751187323604639399
/*     */     //   166: lload_1
/*     */     //   167: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   172: athrow
/*     */     //   173: aload #4
/*     */     //   175: aload_0
/*     */     //   176: getfield a : J
/*     */     //   179: putfield a : J
/*     */     //   182: aload #4
/*     */     //   184: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #3	-> 15
/*     */     //   #346	-> 25
/*     */     //   #474	-> 64
/*     */     //   #750	-> 76
/*     */     //   #267	-> 98
/*     */     //   #296	-> 116
/*     */     //   #9	-> 139
/*     */     //   #923	-> 173
/*     */     //   #748	-> 182
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   25	38	41	java/lang/IllegalArgumentException
/*     */     //   30	54	54	java/lang/IllegalArgumentException
/*     */     //   146	154	163	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public fw a(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, int paramInt5, Charset paramCharset) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/fw.f : J
/*     */     //   26: lxor
/*     */     //   27: lstore #8
/*     */     //   29: lload #8
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 69635092410053
/*     */     //   35: lxor
/*     */     //   36: lstore #10
/*     */     //   38: dup2
/*     */     //   39: ldc2_w 93900822657682
/*     */     //   42: lxor
/*     */     //   43: lstore #12
/*     */     //   45: pop2
/*     */     //   46: ldc2_w -8702022038166454412
/*     */     //   49: lload #8
/*     */     //   51: <illegal opcode> w : (JJ)I
/*     */     //   56: istore #14
/*     */     //   58: aload #4
/*     */     //   60: ifnonnull -> 96
/*     */     //   63: new java/lang/IllegalArgumentException
/*     */     //   66: dup
/*     */     //   67: sipush #25485
/*     */     //   70: ldc2_w 7301320793079677592
/*     */     //   73: lload #8
/*     */     //   75: lxor
/*     */     //   76: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   81: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   84: athrow
/*     */     //   85: ldc2_w -8701867821785754038
/*     */     //   88: lload #8
/*     */     //   90: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   95: athrow
/*     */     //   96: iload #5
/*     */     //   98: iload #14
/*     */     //   100: iload_2
/*     */     //   101: ifle -> 179
/*     */     //   104: ifeq -> 177
/*     */     //   107: ifge -> 175
/*     */     //   110: goto -> 124
/*     */     //   113: ldc2_w -8701867821785754038
/*     */     //   116: lload #8
/*     */     //   118: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   123: athrow
/*     */     //   124: new java/lang/IllegalAccessError
/*     */     //   127: dup
/*     */     //   128: new java/lang/StringBuilder
/*     */     //   131: dup
/*     */     //   132: invokespecial <init> : ()V
/*     */     //   135: sipush #24032
/*     */     //   138: ldc2_w 4809751077217811675
/*     */     //   141: lload #8
/*     */     //   143: lxor
/*     */     //   144: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   152: iload #5
/*     */     //   154: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   157: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   160: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   163: athrow
/*     */     //   164: ldc2_w -8701867821785754038
/*     */     //   167: lload #8
/*     */     //   169: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   174: athrow
/*     */     //   175: iload #6
/*     */     //   177: iload #5
/*     */     //   179: iload_3
/*     */     //   180: ifle -> 285
/*     */     //   183: iload #14
/*     */     //   185: ifeq -> 285
/*     */     //   188: if_icmpge -> 278
/*     */     //   191: goto -> 205
/*     */     //   194: ldc2_w -8701867821785754038
/*     */     //   197: lload #8
/*     */     //   199: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   204: athrow
/*     */     //   205: new java/lang/IllegalArgumentException
/*     */     //   208: dup
/*     */     //   209: new java/lang/StringBuilder
/*     */     //   212: dup
/*     */     //   213: invokespecial <init> : ()V
/*     */     //   216: sipush #24062
/*     */     //   219: ldc2_w 7328821972982349032
/*     */     //   222: lload #8
/*     */     //   224: lxor
/*     */     //   225: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   233: iload #6
/*     */     //   235: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   238: sipush #27419
/*     */     //   241: ldc2_w 351117108550732293
/*     */     //   244: lload #8
/*     */     //   246: lxor
/*     */     //   247: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   255: iload #5
/*     */     //   257: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   260: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   263: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   266: athrow
/*     */     //   267: ldc2_w -8701867821785754038
/*     */     //   270: lload #8
/*     */     //   272: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   277: athrow
/*     */     //   278: iload #6
/*     */     //   280: aload #4
/*     */     //   282: invokevirtual length : ()I
/*     */     //   285: if_icmple -> 364
/*     */     //   288: new java/lang/IllegalArgumentException
/*     */     //   291: dup
/*     */     //   292: new java/lang/StringBuilder
/*     */     //   295: dup
/*     */     //   296: invokespecial <init> : ()V
/*     */     //   299: sipush #32052
/*     */     //   302: ldc2_w 9145709784240495628
/*     */     //   305: lload #8
/*     */     //   307: lxor
/*     */     //   308: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   316: iload #6
/*     */     //   318: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   321: sipush #10880
/*     */     //   324: ldc2_w 8297401419789421469
/*     */     //   327: lload #8
/*     */     //   329: lxor
/*     */     //   330: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   338: aload #4
/*     */     //   340: invokevirtual length : ()I
/*     */     //   343: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   346: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   349: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   352: athrow
/*     */     //   353: ldc2_w -8701867821785754038
/*     */     //   356: lload #8
/*     */     //   358: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   363: athrow
/*     */     //   364: aload #7
/*     */     //   366: iload_2
/*     */     //   367: iflt -> 427
/*     */     //   370: iload #14
/*     */     //   372: ifeq -> 427
/*     */     //   375: ifnonnull -> 425
/*     */     //   378: goto -> 392
/*     */     //   381: ldc2_w -8701867821785754038
/*     */     //   384: lload #8
/*     */     //   386: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   391: athrow
/*     */     //   392: new java/lang/IllegalArgumentException
/*     */     //   395: dup
/*     */     //   396: sipush #26777
/*     */     //   399: ldc2_w 3892359737548868011
/*     */     //   402: lload #8
/*     */     //   404: lxor
/*     */     //   405: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   410: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   413: athrow
/*     */     //   414: ldc2_w -8701867821785754038
/*     */     //   417: lload #8
/*     */     //   419: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   424: athrow
/*     */     //   425: aload #7
/*     */     //   427: getstatic me/konsolas/aac/cc.a : Ljava/nio/charset/Charset;
/*     */     //   430: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   433: ifeq -> 460
/*     */     //   436: aload_0
/*     */     //   437: aload #4
/*     */     //   439: iload #5
/*     */     //   441: lload #12
/*     */     //   443: iload #6
/*     */     //   445: invokevirtual a : (Ljava/lang/String;IJI)Lme/konsolas/aac/fw;
/*     */     //   448: areturn
/*     */     //   449: ldc2_w -8701867821785754038
/*     */     //   452: lload #8
/*     */     //   454: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   459: athrow
/*     */     //   460: aload #4
/*     */     //   462: iload #5
/*     */     //   464: iload #6
/*     */     //   466: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   469: aload #7
/*     */     //   471: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
/*     */     //   474: astore #15
/*     */     //   476: aload_0
/*     */     //   477: aload #15
/*     */     //   479: lload #10
/*     */     //   481: iconst_0
/*     */     //   482: aload #15
/*     */     //   484: arraylength
/*     */     //   485: invokevirtual a : ([BJII)Lme/konsolas/aac/fw;
/*     */     //   488: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #4	-> 58
/*     */     //   #56	-> 96
/*     */     //   #527	-> 175
/*     */     //   #113	-> 205
/*     */     //   #416	-> 278
/*     */     //   #33	-> 288
/*     */     //   #450	-> 340
/*     */     //   #865	-> 364
/*     */     //   #393	-> 425
/*     */     //   #564	-> 460
/*     */     //   #227	-> 476
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   58	85	85	java/lang/IllegalArgumentException
/*     */     //   96	110	113	java/lang/IllegalArgumentException
/*     */     //   107	164	164	java/lang/IllegalArgumentException
/*     */     //   177	191	194	java/lang/IllegalArgumentException
/*     */     //   188	267	267	java/lang/IllegalArgumentException
/*     */     //   285	353	353	java/lang/IllegalArgumentException
/*     */     //   364	378	381	java/lang/IllegalArgumentException
/*     */     //   375	414	414	java/lang/IllegalArgumentException
/*     */     //   427	449	449	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public String a(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 76089796238307
/*     */     //   5: lxor
/*     */     //   6: lstore #5
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 69681995621465
/*     */     //   12: lxor
/*     */     //   13: lstore #7
/*     */     //   15: dup2
/*     */     //   16: ldc2_w 118581739165018
/*     */     //   19: lxor
/*     */     //   20: dup2
/*     */     //   21: bipush #16
/*     */     //   23: lushr
/*     */     //   24: lstore #9
/*     */     //   26: dup2
/*     */     //   27: bipush #48
/*     */     //   29: lshl
/*     */     //   30: bipush #48
/*     */     //   32: lushr
/*     */     //   33: l2i
/*     */     //   34: istore #11
/*     */     //   36: pop2
/*     */     //   37: dup2
/*     */     //   38: ldc2_w 9487604013681
/*     */     //   41: lxor
/*     */     //   42: lstore #12
/*     */     //   44: dup2
/*     */     //   45: ldc2_w 61365127752447
/*     */     //   48: lxor
/*     */     //   49: lstore #14
/*     */     //   51: dup2
/*     */     //   52: ldc2_w 1778011895243
/*     */     //   55: lxor
/*     */     //   56: lstore #16
/*     */     //   58: pop2
/*     */     //   59: ldc2_w -6538654908979962614
/*     */     //   62: lload_3
/*     */     //   63: <illegal opcode> w : (JJ)I
/*     */     //   68: istore #18
/*     */     //   70: lload_1
/*     */     //   71: lconst_0
/*     */     //   72: lcmp
/*     */     //   73: iload #18
/*     */     //   75: ifeq -> 165
/*     */     //   78: ifge -> 142
/*     */     //   81: goto -> 94
/*     */     //   84: ldc2_w -6538386231651470284
/*     */     //   87: lload_3
/*     */     //   88: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   93: athrow
/*     */     //   94: new java/lang/IllegalArgumentException
/*     */     //   97: dup
/*     */     //   98: new java/lang/StringBuilder
/*     */     //   101: dup
/*     */     //   102: invokespecial <init> : ()V
/*     */     //   105: sipush #7834
/*     */     //   108: ldc2_w 3651904618336312797
/*     */     //   111: lload_3
/*     */     //   112: lxor
/*     */     //   113: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   121: lload_1
/*     */     //   122: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   125: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   128: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   131: athrow
/*     */     //   132: ldc2_w -6538386231651470284
/*     */     //   135: lload_3
/*     */     //   136: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   141: athrow
/*     */     //   142: lload_1
/*     */     //   143: ldc2_w 9223372036854775807
/*     */     //   146: iload #18
/*     */     //   148: ifeq -> 186
/*     */     //   151: lcmp
/*     */     //   152: goto -> 165
/*     */     //   155: ldc2_w -6538386231651470284
/*     */     //   158: lload_3
/*     */     //   159: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   164: athrow
/*     */     //   165: ifne -> 184
/*     */     //   168: ldc2_w 9223372036854775807
/*     */     //   171: goto -> 187
/*     */     //   174: ldc2_w -6538386231651470284
/*     */     //   177: lload_3
/*     */     //   178: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   183: athrow
/*     */     //   184: lload_1
/*     */     //   185: lconst_1
/*     */     //   186: ladd
/*     */     //   187: lstore #19
/*     */     //   189: aload_0
/*     */     //   190: bipush #10
/*     */     //   192: lconst_0
/*     */     //   193: lload #19
/*     */     //   195: lload #16
/*     */     //   197: invokevirtual a : (BJJJ)J
/*     */     //   200: lstore #21
/*     */     //   202: lload #21
/*     */     //   204: ldc2_w -1
/*     */     //   207: lcmp
/*     */     //   208: iload #18
/*     */     //   210: lload_3
/*     */     //   211: lconst_0
/*     */     //   212: lcmp
/*     */     //   213: iflt -> 263
/*     */     //   216: ifeq -> 261
/*     */     //   219: ifeq -> 254
/*     */     //   222: goto -> 235
/*     */     //   225: ldc2_w -6538386231651470284
/*     */     //   228: lload_3
/*     */     //   229: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   234: athrow
/*     */     //   235: aload_0
/*     */     //   236: lload #21
/*     */     //   238: lload #5
/*     */     //   240: invokevirtual c : (JJ)Ljava/lang/String;
/*     */     //   243: areturn
/*     */     //   244: ldc2_w -6538386231651470284
/*     */     //   247: lload_3
/*     */     //   248: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   253: athrow
/*     */     //   254: lload #19
/*     */     //   256: aload_0
/*     */     //   257: invokevirtual f : ()J
/*     */     //   260: lcmp
/*     */     //   261: iload #18
/*     */     //   263: lload_3
/*     */     //   264: lconst_0
/*     */     //   265: lcmp
/*     */     //   266: iflt -> 331
/*     */     //   269: ifeq -> 329
/*     */     //   272: ifge -> 397
/*     */     //   275: goto -> 288
/*     */     //   278: ldc2_w -6538386231651470284
/*     */     //   281: lload_3
/*     */     //   282: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   287: athrow
/*     */     //   288: aload_0
/*     */     //   289: iload #18
/*     */     //   291: ifeq -> 404
/*     */     //   294: goto -> 307
/*     */     //   297: ldc2_w -6538386231651470284
/*     */     //   300: lload_3
/*     */     //   301: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   306: athrow
/*     */     //   307: lload #19
/*     */     //   309: lconst_1
/*     */     //   310: lsub
/*     */     //   311: lload #12
/*     */     //   313: invokevirtual a : (JJ)B
/*     */     //   316: goto -> 329
/*     */     //   319: ldc2_w -6538386231651470284
/*     */     //   322: lload_3
/*     */     //   323: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   328: athrow
/*     */     //   329: bipush #13
/*     */     //   331: if_icmpne -> 397
/*     */     //   334: aload_0
/*     */     //   335: iload #18
/*     */     //   337: ifeq -> 404
/*     */     //   340: goto -> 353
/*     */     //   343: ldc2_w -6538386231651470284
/*     */     //   346: lload_3
/*     */     //   347: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   352: athrow
/*     */     //   353: lload #19
/*     */     //   355: lload #12
/*     */     //   357: invokevirtual a : (JJ)B
/*     */     //   360: bipush #10
/*     */     //   362: if_icmpne -> 397
/*     */     //   365: goto -> 378
/*     */     //   368: ldc2_w -6538386231651470284
/*     */     //   371: lload_3
/*     */     //   372: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   377: athrow
/*     */     //   378: aload_0
/*     */     //   379: lload #19
/*     */     //   381: lload #5
/*     */     //   383: invokevirtual c : (JJ)Ljava/lang/String;
/*     */     //   386: areturn
/*     */     //   387: ldc2_w -6538386231651470284
/*     */     //   390: lload_3
/*     */     //   391: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   396: athrow
/*     */     //   397: new me/konsolas/aac/fw
/*     */     //   400: dup
/*     */     //   401: invokespecial <init> : ()V
/*     */     //   404: astore #23
/*     */     //   406: aload_0
/*     */     //   407: aload #23
/*     */     //   409: lconst_0
/*     */     //   410: ldc2_w 32
/*     */     //   413: aload_0
/*     */     //   414: invokevirtual f : ()J
/*     */     //   417: invokestatic min : (JJ)J
/*     */     //   420: lload #9
/*     */     //   422: dup2_x2
/*     */     //   423: pop2
/*     */     //   424: iload #11
/*     */     //   426: i2s
/*     */     //   427: dup_x2
/*     */     //   428: pop
/*     */     //   429: invokevirtual a : (Lme/konsolas/aac/fw;JJSJ)Lme/konsolas/aac/fw;
/*     */     //   432: pop
/*     */     //   433: new java/io/EOFException
/*     */     //   436: dup
/*     */     //   437: new java/lang/StringBuilder
/*     */     //   440: dup
/*     */     //   441: invokespecial <init> : ()V
/*     */     //   444: sipush #23839
/*     */     //   447: ldc2_w 9126279167714106973
/*     */     //   450: lload_3
/*     */     //   451: lxor
/*     */     //   452: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   457: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   460: aload_0
/*     */     //   461: invokevirtual f : ()J
/*     */     //   464: lload_1
/*     */     //   465: invokestatic min : (JJ)J
/*     */     //   468: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   471: sipush #21265
/*     */     //   474: ldc2_w 3475211520932745331
/*     */     //   477: lload_3
/*     */     //   478: lxor
/*     */     //   479: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   484: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   487: aload #23
/*     */     //   489: lload #7
/*     */     //   491: invokevirtual a : (J)Lme/konsolas/aac/gZ;
/*     */     //   494: lload #14
/*     */     //   496: invokevirtual d : (J)Ljava/lang/String;
/*     */     //   499: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   502: sipush #8230
/*     */     //   505: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   508: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   511: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   514: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #34	-> 70
/*     */     //   #760	-> 142
/*     */     //   #678	-> 189
/*     */     //   #162	-> 202
/*     */     //   #236	-> 254
/*     */     //   #207	-> 311
/*     */     //   #150	-> 378
/*     */     //   #154	-> 397
/*     */     //   #929	-> 406
/*     */     //   #135	-> 433
/*     */     //   #479	-> 489
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   70	81	84	java/io/EOFException
/*     */     //   78	132	132	java/io/EOFException
/*     */     //   142	152	155	java/io/EOFException
/*     */     //   165	174	174	java/io/EOFException
/*     */     //   202	222	225	java/io/EOFException
/*     */     //   219	244	244	java/io/EOFException
/*     */     //   261	275	278	java/io/EOFException
/*     */     //   272	294	297	java/io/EOFException
/*     */     //   288	316	319	java/io/EOFException
/*     */     //   329	340	343	java/io/EOFException
/*     */     //   334	365	368	java/io/EOFException
/*     */     //   353	387	387	java/io/EOFException
/*     */   }
/*     */   
/*     */   public gi a(short paramShort1, int paramInt, long paramLong, short paramShort2) {
/*  47 */     long l = paramShort1 << 48L | paramInt << 32L >>> 16L | paramShort2 << 48L >>> 48L; int i = (int)((l ^ 0x132CCFAAF28CL) >>> 48L), j = (int)((l ^ 0x132CCFAAF28CL) << 16L >>> 32L), k = (int)((l ^ 0x132CCFAAF28CL) << 48L >>> 48L); l ^ 0x132CCFAAF28CL; return c(paramLong, (short)i, j, k);
/*     */   }
/*     */   public int write(ByteBuffer paramByteBuffer) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: ldc2_w 26954943206223
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: lload_2
/*     */     //   9: dup2
/*     */     //   10: ldc2_w 54310588761545
/*     */     //   13: lxor
/*     */     //   14: lstore #4
/*     */     //   16: pop2
/*     */     //   17: ldc2_w -2591927357331371457
/*     */     //   20: lload_2
/*     */     //   21: <illegal opcode> w : (JJ)I
/*     */     //   26: istore #6
/*     */     //   28: aload_1
/*     */     //   29: iload #6
/*     */     //   31: ifne -> 82
/*     */     //   34: ifnonnull -> 81
/*     */     //   37: goto -> 50
/*     */     //   40: ldc2_w -2556107887899341328
/*     */     //   43: lload_2
/*     */     //   44: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   49: athrow
/*     */     //   50: new java/lang/IllegalArgumentException
/*     */     //   53: dup
/*     */     //   54: sipush #22079
/*     */     //   57: ldc2_w 2068362048467627177
/*     */     //   60: lload_2
/*     */     //   61: lxor
/*     */     //   62: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   67: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   70: athrow
/*     */     //   71: ldc2_w -2556107887899341328
/*     */     //   74: lload_2
/*     */     //   75: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   80: athrow
/*     */     //   81: aload_1
/*     */     //   82: invokevirtual remaining : ()I
/*     */     //   85: istore #7
/*     */     //   87: iload #7
/*     */     //   89: istore #8
/*     */     //   91: iload #8
/*     */     //   93: ifle -> 180
/*     */     //   96: aload_0
/*     */     //   97: lload #4
/*     */     //   99: iconst_1
/*     */     //   100: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*     */     //   103: astore #9
/*     */     //   105: iload #8
/*     */     //   107: sipush #8192
/*     */     //   110: aload #9
/*     */     //   112: getfield c : I
/*     */     //   115: isub
/*     */     //   116: invokestatic min : (II)I
/*     */     //   119: istore #10
/*     */     //   121: aload_1
/*     */     //   122: aload #9
/*     */     //   124: getfield h : [B
/*     */     //   127: aload #9
/*     */     //   129: getfield c : I
/*     */     //   132: iload #10
/*     */     //   134: invokevirtual get : ([BII)Ljava/nio/ByteBuffer;
/*     */     //   137: pop
/*     */     //   138: iload #8
/*     */     //   140: iload #10
/*     */     //   142: isub
/*     */     //   143: istore #8
/*     */     //   145: aload #9
/*     */     //   147: dup
/*     */     //   148: getfield c : I
/*     */     //   151: iload #10
/*     */     //   153: iadd
/*     */     //   154: putfield c : I
/*     */     //   157: iload #6
/*     */     //   159: ifne -> 192
/*     */     //   162: iload #6
/*     */     //   164: ifeq -> 91
/*     */     //   167: goto -> 180
/*     */     //   170: ldc2_w -2556107887899341328
/*     */     //   173: lload_2
/*     */     //   174: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   179: athrow
/*     */     //   180: aload_0
/*     */     //   181: dup
/*     */     //   182: getfield a : J
/*     */     //   185: iload #7
/*     */     //   187: i2l
/*     */     //   188: ladd
/*     */     //   189: putfield a : J
/*     */     //   192: iload #7
/*     */     //   194: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 28
/*     */     //   #256	-> 81
/*     */     //   #832	-> 87
/*     */     //   #725	-> 91
/*     */     //   #439	-> 96
/*     */     //   #221	-> 105
/*     */     //   #198	-> 121
/*     */     //   #63	-> 138
/*     */     //   #456	-> 145
/*     */     //   #77	-> 157
/*     */     //   #37	-> 180
/*     */     //   #691	-> 192
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   28	37	40	java/io/IOException
/*     */     //   34	71	71	java/io/IOException
/*     */     //   145	167	170	java/io/IOException
/*     */   }
/*     */   
/*     */   public final fw b(long paramLong, OutputStream paramOutputStream) {
/*  54 */     paramLong = f ^ paramLong; long l = paramLong ^ 0x5ED1513BFCBBL; return a(l, paramOutputStream, this.a);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public fw a(int paramInt, char paramChar1, char paramChar2, byte[] paramArrayOfbyte) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/fw.f : J
/*     */     //   26: lxor
/*     */     //   27: lstore #5
/*     */     //   29: lload #5
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 72286172037228
/*     */     //   35: lxor
/*     */     //   36: lstore #7
/*     */     //   38: pop2
/*     */     //   39: aload #4
/*     */     //   41: ifnonnull -> 77
/*     */     //   44: new java/lang/IllegalArgumentException
/*     */     //   47: dup
/*     */     //   48: sipush #28959
/*     */     //   51: ldc2_w 5611533812320845489
/*     */     //   54: lload #5
/*     */     //   56: lxor
/*     */     //   57: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   62: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   65: athrow
/*     */     //   66: ldc2_w -6226860107114219293
/*     */     //   69: lload #5
/*     */     //   71: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   76: athrow
/*     */     //   77: aload_0
/*     */     //   78: aload #4
/*     */     //   80: lload #7
/*     */     //   82: iconst_0
/*     */     //   83: aload #4
/*     */     //   85: arraylength
/*     */     //   86: invokevirtual a : ([BJII)Lme/konsolas/aac/fw;
/*     */     //   89: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #57	-> 39
/*     */     //   #326	-> 77
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   39	66	66	java/lang/IllegalArgumentException
/*     */   }
/*     */ 
/*     */   
/*     */   public fw a(byte[] paramArrayOfbyte, long paramLong, int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 12705669889661
/*     */     //   11: lxor
/*     */     //   12: lstore #6
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 37707365588946
/*     */     //   18: lxor
/*     */     //   19: lstore #8
/*     */     //   21: pop2
/*     */     //   22: aload_1
/*     */     //   23: ifnonnull -> 57
/*     */     //   26: new java/lang/IllegalArgumentException
/*     */     //   29: dup
/*     */     //   30: sipush #28959
/*     */     //   33: ldc2_w 5611564834737565718
/*     */     //   36: lload_2
/*     */     //   37: lxor
/*     */     //   38: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   43: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   46: athrow
/*     */     //   47: ldc2_w -6398810776235739580
/*     */     //   50: lload_2
/*     */     //   51: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   56: athrow
/*     */     //   57: aload_1
/*     */     //   58: arraylength
/*     */     //   59: i2l
/*     */     //   60: iload #4
/*     */     //   62: i2l
/*     */     //   63: iload #5
/*     */     //   65: i2l
/*     */     //   66: lload #8
/*     */     //   68: invokestatic a : (JJJJ)V
/*     */     //   71: iload #4
/*     */     //   73: iload #5
/*     */     //   75: iadd
/*     */     //   76: istore #10
/*     */     //   78: iload #4
/*     */     //   80: iload #10
/*     */     //   82: if_icmpge -> 162
/*     */     //   85: aload_0
/*     */     //   86: lload #6
/*     */     //   88: iconst_1
/*     */     //   89: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*     */     //   92: astore #11
/*     */     //   94: iload #10
/*     */     //   96: iload #4
/*     */     //   98: isub
/*     */     //   99: sipush #8192
/*     */     //   102: aload #11
/*     */     //   104: getfield c : I
/*     */     //   107: isub
/*     */     //   108: invokestatic min : (II)I
/*     */     //   111: istore #12
/*     */     //   113: aload_1
/*     */     //   114: iload #4
/*     */     //   116: aload #11
/*     */     //   118: getfield h : [B
/*     */     //   121: aload #11
/*     */     //   123: getfield c : I
/*     */     //   126: iload #12
/*     */     //   128: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   131: iload #4
/*     */     //   133: iload #12
/*     */     //   135: iadd
/*     */     //   136: istore #4
/*     */     //   138: aload #11
/*     */     //   140: dup
/*     */     //   141: getfield c : I
/*     */     //   144: iload #12
/*     */     //   146: iadd
/*     */     //   147: putfield c : I
/*     */     //   150: lload_2
/*     */     //   151: lconst_0
/*     */     //   152: lcmp
/*     */     //   153: ifle -> 174
/*     */     //   156: lload_2
/*     */     //   157: lconst_0
/*     */     //   158: lcmp
/*     */     //   159: ifgt -> 78
/*     */     //   162: aload_0
/*     */     //   163: dup
/*     */     //   164: getfield a : J
/*     */     //   167: iload #5
/*     */     //   169: i2l
/*     */     //   170: ladd
/*     */     //   171: putfield a : J
/*     */     //   174: aload_0
/*     */     //   175: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 22
/*     */     //   #847	-> 57
/*     */     //   #938	-> 71
/*     */     //   #424	-> 78
/*     */     //   #48	-> 85
/*     */     //   #373	-> 94
/*     */     //   #470	-> 113
/*     */     //   #115	-> 131
/*     */     //   #742	-> 138
/*     */     //   #646	-> 150
/*     */     //   #272	-> 162
/*     */     //   #175	-> 174
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   22	47	47	java/lang/IllegalArgumentException
/*     */   }
/*     */ 
/*     */   
/*     */   public final fw a(OutputStream paramOutputStream, long paramLong) {
/*  70 */     paramLong = f ^ paramLong; long l = paramLong ^ 0x7C1ED181C0B0L; return a(paramOutputStream, 0L, this.a, l);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final byte a(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 44738183072024
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -5622703287227872848
/*     */     //   18: lload_3
/*     */     //   19: <illegal opcode> w : (JJ)I
/*     */     //   24: aload_0
/*     */     //   25: getfield a : J
/*     */     //   28: lload_1
/*     */     //   29: lconst_1
/*     */     //   30: lload #5
/*     */     //   32: invokestatic a : (JJJJ)V
/*     */     //   35: istore #7
/*     */     //   37: aload_0
/*     */     //   38: getfield a : J
/*     */     //   41: lload_1
/*     */     //   42: lsub
/*     */     //   43: lload_1
/*     */     //   44: iload #7
/*     */     //   46: ifeq -> 146
/*     */     //   49: lcmp
/*     */     //   50: ifle -> 141
/*     */     //   53: goto -> 66
/*     */     //   56: ldc2_w -5622513807014895474
/*     */     //   59: lload_3
/*     */     //   60: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   65: athrow
/*     */     //   66: aload_0
/*     */     //   67: getfield b : Lme/konsolas/aac/eV;
/*     */     //   70: astore #8
/*     */     //   72: aload #8
/*     */     //   74: getfield c : I
/*     */     //   77: aload #8
/*     */     //   79: getfield d : I
/*     */     //   82: isub
/*     */     //   83: istore #9
/*     */     //   85: lload_1
/*     */     //   86: iload #9
/*     */     //   88: i2l
/*     */     //   89: lcmp
/*     */     //   90: ifge -> 123
/*     */     //   93: aload #8
/*     */     //   95: iload #7
/*     */     //   97: ifeq -> 134
/*     */     //   100: getfield h : [B
/*     */     //   103: aload #8
/*     */     //   105: getfield d : I
/*     */     //   108: lload_1
/*     */     //   109: l2i
/*     */     //   110: iadd
/*     */     //   111: baload
/*     */     //   112: ireturn
/*     */     //   113: ldc2_w -5622513807014895474
/*     */     //   116: lload_3
/*     */     //   117: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   122: athrow
/*     */     //   123: lload_1
/*     */     //   124: iload #9
/*     */     //   126: i2l
/*     */     //   127: lsub
/*     */     //   128: lstore_1
/*     */     //   129: aload #8
/*     */     //   131: getfield b : Lme/konsolas/aac/eV;
/*     */     //   134: astore #8
/*     */     //   136: iload #7
/*     */     //   138: ifne -> 72
/*     */     //   141: lload_1
/*     */     //   142: aload_0
/*     */     //   143: getfield a : J
/*     */     //   146: lsub
/*     */     //   147: lstore_1
/*     */     //   148: aload_0
/*     */     //   149: getfield b : Lme/konsolas/aac/eV;
/*     */     //   152: getfield e : Lme/konsolas/aac/eV;
/*     */     //   155: astore #8
/*     */     //   157: lload_1
/*     */     //   158: aload #8
/*     */     //   160: getfield c : I
/*     */     //   163: aload #8
/*     */     //   165: getfield d : I
/*     */     //   168: isub
/*     */     //   169: i2l
/*     */     //   170: ladd
/*     */     //   171: lstore_1
/*     */     //   172: lload_1
/*     */     //   173: lconst_0
/*     */     //   174: lcmp
/*     */     //   175: iflt -> 227
/*     */     //   178: aload #8
/*     */     //   180: lload_3
/*     */     //   181: lconst_0
/*     */     //   182: lcmp
/*     */     //   183: ifle -> 229
/*     */     //   186: iload #7
/*     */     //   188: ifeq -> 232
/*     */     //   191: goto -> 204
/*     */     //   194: ldc2_w -5622513807014895474
/*     */     //   197: lload_3
/*     */     //   198: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   203: athrow
/*     */     //   204: getfield h : [B
/*     */     //   207: aload #8
/*     */     //   209: getfield d : I
/*     */     //   212: lload_1
/*     */     //   213: l2i
/*     */     //   214: iadd
/*     */     //   215: baload
/*     */     //   216: ireturn
/*     */     //   217: ldc2_w -5622513807014895474
/*     */     //   220: lload_3
/*     */     //   221: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   226: athrow
/*     */     //   227: aload #8
/*     */     //   229: getfield e : Lme/konsolas/aac/eV;
/*     */     //   232: astore #8
/*     */     //   234: goto -> 157
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #78	-> 24
/*     */     //   #918	-> 37
/*     */     //   #871	-> 66
/*     */     //   #554	-> 72
/*     */     //   #601	-> 85
/*     */     //   #633	-> 123
/*     */     //   #457	-> 129
/*     */     //   #276	-> 141
/*     */     //   #914	-> 148
/*     */     //   #516	-> 157
/*     */     //   #553	-> 172
/*     */     //   #28	-> 227
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   37	53	56	java/lang/IllegalArgumentException
/*     */     //   93	113	113	java/lang/IllegalArgumentException
/*     */     //   172	191	194	java/lang/IllegalArgumentException
/*     */     //   178	217	217	java/lang/IllegalArgumentException
/*     */   }
/*     */ 
/*     */   
/*     */   private gZ a(String paramString, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 64655035036808
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: ldc2_w 6839664378584917667
/*     */     //   18: lload_2
/*     */     //   19: <illegal opcode> w : (JJ)I
/*     */     //   24: istore #6
/*     */     //   26: aload_1
/*     */     //   27: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
/*     */     //   30: astore #7
/*     */     //   32: aload_0
/*     */     //   33: getfield b : Lme/konsolas/aac/eV;
/*     */     //   36: iload #6
/*     */     //   38: ifeq -> 111
/*     */     //   41: ifnull -> 165
/*     */     //   44: goto -> 57
/*     */     //   47: ldc2_w 6839748331548905373
/*     */     //   50: lload_2
/*     */     //   51: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   56: athrow
/*     */     //   57: aload #7
/*     */     //   59: aload_0
/*     */     //   60: getfield b : Lme/konsolas/aac/eV;
/*     */     //   63: getfield h : [B
/*     */     //   66: aload_0
/*     */     //   67: getfield b : Lme/konsolas/aac/eV;
/*     */     //   70: getfield d : I
/*     */     //   73: aload_0
/*     */     //   74: getfield b : Lme/konsolas/aac/eV;
/*     */     //   77: getfield c : I
/*     */     //   80: aload_0
/*     */     //   81: getfield b : Lme/konsolas/aac/eV;
/*     */     //   84: getfield d : I
/*     */     //   87: isub
/*     */     //   88: invokevirtual update : ([BII)V
/*     */     //   91: aload_0
/*     */     //   92: getfield b : Lme/konsolas/aac/eV;
/*     */     //   95: getfield b : Lme/konsolas/aac/eV;
/*     */     //   98: goto -> 111
/*     */     //   101: ldc2_w 6839748331548905373
/*     */     //   104: lload_2
/*     */     //   105: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   110: athrow
/*     */     //   111: astore #8
/*     */     //   113: aload #8
/*     */     //   115: aload_0
/*     */     //   116: getfield b : Lme/konsolas/aac/eV;
/*     */     //   119: if_acmpeq -> 165
/*     */     //   122: aload #7
/*     */     //   124: iload #6
/*     */     //   126: ifeq -> 167
/*     */     //   129: aload #8
/*     */     //   131: getfield h : [B
/*     */     //   134: aload #8
/*     */     //   136: getfield d : I
/*     */     //   139: aload #8
/*     */     //   141: getfield c : I
/*     */     //   144: aload #8
/*     */     //   146: getfield d : I
/*     */     //   149: isub
/*     */     //   150: invokevirtual update : ([BII)V
/*     */     //   153: aload #8
/*     */     //   155: getfield b : Lme/konsolas/aac/eV;
/*     */     //   158: astore #8
/*     */     //   160: iload #6
/*     */     //   162: ifne -> 113
/*     */     //   165: aload #7
/*     */     //   167: invokevirtual digest : ()[B
/*     */     //   170: lload #4
/*     */     //   172: invokestatic a : ([BJ)Lme/konsolas/aac/gZ;
/*     */     //   175: areturn
/*     */     //   176: astore #7
/*     */     //   178: new java/lang/AssertionError
/*     */     //   181: dup
/*     */     //   182: invokespecial <init> : ()V
/*     */     //   185: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #83	-> 26
/*     */     //   #334	-> 32
/*     */     //   #395	-> 57
/*     */     //   #177	-> 91
/*     */     //   #583	-> 122
/*     */     //   #561	-> 153
/*     */     //   #885	-> 165
/*     */     //   #421	-> 176
/*     */     //   #671	-> 178
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	175	176	java/security/NoSuchAlgorithmException
/*     */     //   32	44	47	java/security/NoSuchAlgorithmException
/*     */     //   41	98	101	java/security/NoSuchAlgorithmException
/*     */   }
/*     */ 
/*     */   
/*     */   public gi e(long paramLong, int paramInt) {
/*  86 */     long l = paramLong ^ 0x750679948581L; return e(l, paramInt);
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
/*     */   public gi b(long paramLong1, long paramLong2) {
/* 100 */     long l = paramLong2 ^ 0x4DD40D6E2426L; return d(paramLong1, l);
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
/*     */   public Object clone() {
/* 131 */     long l1 = f ^ 0x10DBA358B8C9L, l2 = l1 ^ 0x612DB60D09E4L; return d(l2);
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
/*     */   public fw b() {
/* 143 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int read(ByteBuffer paramByteBuffer) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: ldc2_w 113416438715582
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: lload_2
/*     */     //   9: dup2
/*     */     //   10: ldc2_w 55417834645818
/*     */     //   13: lxor
/*     */     //   14: lstore #4
/*     */     //   16: dup2
/*     */     //   17: ldc2_w 105745991058990
/*     */     //   20: lxor
/*     */     //   21: lstore #6
/*     */     //   23: pop2
/*     */     //   24: ldc2_w -2632518273957305537
/*     */     //   27: lload_2
/*     */     //   28: <illegal opcode> w : (JJ)I
/*     */     //   33: aload_0
/*     */     //   34: getfield b : Lme/konsolas/aac/eV;
/*     */     //   37: astore #9
/*     */     //   39: istore #8
/*     */     //   41: aload #9
/*     */     //   43: ifnonnull -> 58
/*     */     //   46: iconst_m1
/*     */     //   47: ireturn
/*     */     //   48: ldc2_w -2632460849382061567
/*     */     //   51: lload_2
/*     */     //   52: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   57: athrow
/*     */     //   58: aload_1
/*     */     //   59: invokevirtual remaining : ()I
/*     */     //   62: aload #9
/*     */     //   64: getfield c : I
/*     */     //   67: aload #9
/*     */     //   69: getfield d : I
/*     */     //   72: isub
/*     */     //   73: invokestatic min : (II)I
/*     */     //   76: istore #10
/*     */     //   78: aload_1
/*     */     //   79: aload #9
/*     */     //   81: getfield h : [B
/*     */     //   84: aload #9
/*     */     //   86: getfield d : I
/*     */     //   89: iload #10
/*     */     //   91: invokevirtual put : ([BII)Ljava/nio/ByteBuffer;
/*     */     //   94: pop
/*     */     //   95: aload #9
/*     */     //   97: dup
/*     */     //   98: getfield d : I
/*     */     //   101: iload #10
/*     */     //   103: iadd
/*     */     //   104: putfield d : I
/*     */     //   107: aload_0
/*     */     //   108: dup
/*     */     //   109: getfield a : J
/*     */     //   112: iload #10
/*     */     //   114: i2l
/*     */     //   115: lsub
/*     */     //   116: putfield a : J
/*     */     //   119: aload #9
/*     */     //   121: getfield d : I
/*     */     //   124: iload #8
/*     */     //   126: ifeq -> 183
/*     */     //   129: aload #9
/*     */     //   131: getfield c : I
/*     */     //   134: if_icmpne -> 181
/*     */     //   137: goto -> 150
/*     */     //   140: ldc2_w -2632460849382061567
/*     */     //   143: lload_2
/*     */     //   144: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   149: athrow
/*     */     //   150: aload_0
/*     */     //   151: aload #9
/*     */     //   153: lload #6
/*     */     //   155: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   158: putfield b : Lme/konsolas/aac/eV;
/*     */     //   161: aload #9
/*     */     //   163: lload #4
/*     */     //   165: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   168: goto -> 181
/*     */     //   171: ldc2_w -2632460849382061567
/*     */     //   174: lload_2
/*     */     //   175: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   180: athrow
/*     */     //   181: iload #10
/*     */     //   183: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #152	-> 33
/*     */     //   #243	-> 41
/*     */     //   #503	-> 58
/*     */     //   #756	-> 78
/*     */     //   #631	-> 95
/*     */     //   #213	-> 107
/*     */     //   #589	-> 119
/*     */     //   #843	-> 150
/*     */     //   #774	-> 161
/*     */     //   #773	-> 181
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   41	48	48	java/io/IOException
/*     */     //   78	137	140	java/io/IOException
/*     */     //   129	168	171	java/io/IOException
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void flush() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public final long f() {
/* 160 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(long paramLong, byte[] paramArrayOfbyte) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 76846293931754
/*     */     //   5: lxor
/*     */     //   6: dup2
/*     */     //   7: bipush #32
/*     */     //   9: lushr
/*     */     //   10: l2i
/*     */     //   11: istore #4
/*     */     //   13: dup2
/*     */     //   14: bipush #32
/*     */     //   16: lshl
/*     */     //   17: bipush #32
/*     */     //   19: lushr
/*     */     //   20: l2i
/*     */     //   21: istore #5
/*     */     //   23: pop2
/*     */     //   24: pop2
/*     */     //   25: ldc2_w 7717937352140340515
/*     */     //   28: lload_1
/*     */     //   29: <illegal opcode> w : (JJ)I
/*     */     //   34: iconst_0
/*     */     //   35: istore #7
/*     */     //   37: istore #6
/*     */     //   39: iload #7
/*     */     //   41: aload_3
/*     */     //   42: arraylength
/*     */     //   43: if_icmpge -> 124
/*     */     //   46: aload_0
/*     */     //   47: iload #4
/*     */     //   49: aload_3
/*     */     //   50: iload #7
/*     */     //   52: aload_3
/*     */     //   53: arraylength
/*     */     //   54: iload #7
/*     */     //   56: isub
/*     */     //   57: iload #5
/*     */     //   59: invokevirtual a : (I[BIII)I
/*     */     //   62: istore #8
/*     */     //   64: iload #8
/*     */     //   66: lload_1
/*     */     //   67: lconst_0
/*     */     //   68: lcmp
/*     */     //   69: ifle -> 121
/*     */     //   72: iconst_m1
/*     */     //   73: iload #6
/*     */     //   75: ifne -> 116
/*     */     //   78: if_icmpne -> 112
/*     */     //   81: goto -> 94
/*     */     //   84: ldc2_w 7753757679507553004
/*     */     //   87: lload_1
/*     */     //   88: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   93: athrow
/*     */     //   94: new java/io/EOFException
/*     */     //   97: dup
/*     */     //   98: invokespecial <init> : ()V
/*     */     //   101: athrow
/*     */     //   102: ldc2_w 7753757679507553004
/*     */     //   105: lload_1
/*     */     //   106: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   111: athrow
/*     */     //   112: iload #7
/*     */     //   114: iload #8
/*     */     //   116: iadd
/*     */     //   117: istore #7
/*     */     //   119: iload #6
/*     */     //   121: ifeq -> 39
/*     */     //   124: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #163	-> 34
/*     */     //   #232	-> 39
/*     */     //   #415	-> 46
/*     */     //   #350	-> 64
/*     */     //   #106	-> 112
/*     */     //   #771	-> 119
/*     */     //   #741	-> 124
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   64	81	84	java/io/EOFException
/*     */     //   78	102	102	java/io/EOFException
/*     */   }
/*     */ 
/*     */   
/*     */   public fw a(gZ paramgZ, int paramInt, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: lload_3
/*     */     //   6: bipush #32
/*     */     //   8: lshl
/*     */     //   9: bipush #32
/*     */     //   11: lushr
/*     */     //   12: lor
/*     */     //   13: getstatic me/konsolas/aac/fw.f : J
/*     */     //   16: lxor
/*     */     //   17: lstore #5
/*     */     //   19: lload #5
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 46189327453059
/*     */     //   25: lxor
/*     */     //   26: lstore #7
/*     */     //   28: pop2
/*     */     //   29: ldc2_w 9166191564696987916
/*     */     //   32: lload #5
/*     */     //   34: <illegal opcode> w : (JJ)I
/*     */     //   39: istore #9
/*     */     //   41: aload_1
/*     */     //   42: iload #9
/*     */     //   44: ifne -> 98
/*     */     //   47: ifnonnull -> 97
/*     */     //   50: goto -> 64
/*     */     //   53: ldc2_w 9202441802168676035
/*     */     //   56: lload #5
/*     */     //   58: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   63: athrow
/*     */     //   64: new java/lang/IllegalArgumentException
/*     */     //   67: dup
/*     */     //   68: sipush #8163
/*     */     //   71: ldc2_w 6944931148122490479
/*     */     //   74: lload #5
/*     */     //   76: lxor
/*     */     //   77: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   82: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   85: athrow
/*     */     //   86: ldc2_w 9202441802168676035
/*     */     //   89: lload #5
/*     */     //   91: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   96: athrow
/*     */     //   97: aload_1
/*     */     //   98: aload_0
/*     */     //   99: lload #7
/*     */     //   101: invokevirtual a : (Lme/konsolas/aac/fw;J)V
/*     */     //   104: aload_0
/*     */     //   105: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #168	-> 41
/*     */     //   #848	-> 97
/*     */     //   #798	-> 104
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   41	50	53	java/lang/IllegalArgumentException
/*     */     //   47	86	86	java/lang/IllegalArgumentException
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 133637116427215
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 48106867037403
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: pop2
/*     */     //   15: aload_0
/*     */     //   16: getfield a : J
/*     */     //   19: lconst_0
/*     */     //   20: lcmp
/*     */     //   21: ifne -> 55
/*     */     //   24: new java/lang/IllegalStateException
/*     */     //   27: dup
/*     */     //   28: sipush #6862
/*     */     //   31: ldc2_w 7832849223506031961
/*     */     //   34: lload_1
/*     */     //   35: lxor
/*     */     //   36: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   41: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   44: athrow
/*     */     //   45: ldc2_w -8538027600932054796
/*     */     //   48: lload_1
/*     */     //   49: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: aload_0
/*     */     //   56: getfield b : Lme/konsolas/aac/eV;
/*     */     //   59: astore #7
/*     */     //   61: aload #7
/*     */     //   63: getfield d : I
/*     */     //   66: istore #8
/*     */     //   68: aload #7
/*     */     //   70: getfield c : I
/*     */     //   73: istore #9
/*     */     //   75: aload #7
/*     */     //   77: getfield h : [B
/*     */     //   80: astore #10
/*     */     //   82: aload #10
/*     */     //   84: iload #8
/*     */     //   86: iinc #8, 1
/*     */     //   89: baload
/*     */     //   90: istore #11
/*     */     //   92: aload_0
/*     */     //   93: dup
/*     */     //   94: getfield a : J
/*     */     //   97: lconst_1
/*     */     //   98: lsub
/*     */     //   99: putfield a : J
/*     */     //   102: lload_1
/*     */     //   103: lconst_0
/*     */     //   104: lcmp
/*     */     //   105: ifle -> 132
/*     */     //   108: iload #8
/*     */     //   110: iload #9
/*     */     //   112: if_icmpne -> 145
/*     */     //   115: aload_0
/*     */     //   116: aload #7
/*     */     //   118: lload #5
/*     */     //   120: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   123: putfield b : Lme/konsolas/aac/eV;
/*     */     //   126: aload #7
/*     */     //   128: lload_3
/*     */     //   129: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   132: goto -> 152
/*     */     //   135: ldc2_w -8538027600932054796
/*     */     //   138: lload_1
/*     */     //   139: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   144: athrow
/*     */     //   145: aload #7
/*     */     //   147: iload #8
/*     */     //   149: putfield d : I
/*     */     //   152: iload #11
/*     */     //   154: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #179	-> 15
/*     */     //   #883	-> 55
/*     */     //   #690	-> 61
/*     */     //   #437	-> 68
/*     */     //   #38	-> 75
/*     */     //   #32	-> 82
/*     */     //   #431	-> 92
/*     */     //   #167	-> 102
/*     */     //   #413	-> 115
/*     */     //   #603	-> 126
/*     */     //   #249	-> 145
/*     */     //   #935	-> 152
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   15	45	45	java/lang/IllegalArgumentException
/*     */     //   92	135	135	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public fw b(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 81293174894981
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: pop2
/*     */     //   15: aload_0
/*     */     //   16: lload #5
/*     */     //   18: bipush #8
/*     */     //   20: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*     */     //   23: astore #8
/*     */     //   25: aload #8
/*     */     //   27: getfield h : [B
/*     */     //   30: astore #9
/*     */     //   32: aload #8
/*     */     //   34: getfield c : I
/*     */     //   37: istore #10
/*     */     //   39: aload #9
/*     */     //   41: iload #10
/*     */     //   43: iinc #10, 1
/*     */     //   46: lload_1
/*     */     //   47: bipush #56
/*     */     //   49: lushr
/*     */     //   50: ldc2_w 255
/*     */     //   53: land
/*     */     //   54: l2i
/*     */     //   55: i2b
/*     */     //   56: bastore
/*     */     //   57: aload #9
/*     */     //   59: iload #10
/*     */     //   61: iinc #10, 1
/*     */     //   64: lload_1
/*     */     //   65: bipush #48
/*     */     //   67: lushr
/*     */     //   68: ldc2_w 255
/*     */     //   71: land
/*     */     //   72: l2i
/*     */     //   73: i2b
/*     */     //   74: bastore
/*     */     //   75: aload #9
/*     */     //   77: iload #10
/*     */     //   79: iinc #10, 1
/*     */     //   82: lload_1
/*     */     //   83: bipush #40
/*     */     //   85: lushr
/*     */     //   86: ldc2_w 255
/*     */     //   89: land
/*     */     //   90: l2i
/*     */     //   91: i2b
/*     */     //   92: bastore
/*     */     //   93: aload #9
/*     */     //   95: iload #10
/*     */     //   97: iinc #10, 1
/*     */     //   100: lload_1
/*     */     //   101: bipush #32
/*     */     //   103: lushr
/*     */     //   104: ldc2_w 255
/*     */     //   107: land
/*     */     //   108: l2i
/*     */     //   109: i2b
/*     */     //   110: bastore
/*     */     //   111: ldc2_w -1708017338454655373
/*     */     //   114: lload_3
/*     */     //   115: <illegal opcode> w : (JJ)I
/*     */     //   120: aload #9
/*     */     //   122: iload #10
/*     */     //   124: iinc #10, 1
/*     */     //   127: lload_1
/*     */     //   128: bipush #24
/*     */     //   130: lushr
/*     */     //   131: ldc2_w 255
/*     */     //   134: land
/*     */     //   135: l2i
/*     */     //   136: i2b
/*     */     //   137: bastore
/*     */     //   138: aload #9
/*     */     //   140: iload #10
/*     */     //   142: iinc #10, 1
/*     */     //   145: lload_1
/*     */     //   146: bipush #16
/*     */     //   148: lushr
/*     */     //   149: ldc2_w 255
/*     */     //   152: land
/*     */     //   153: l2i
/*     */     //   154: i2b
/*     */     //   155: bastore
/*     */     //   156: aload #9
/*     */     //   158: iload #10
/*     */     //   160: iinc #10, 1
/*     */     //   163: lload_1
/*     */     //   164: bipush #8
/*     */     //   166: lushr
/*     */     //   167: ldc2_w 255
/*     */     //   170: land
/*     */     //   171: l2i
/*     */     //   172: i2b
/*     */     //   173: bastore
/*     */     //   174: aload #9
/*     */     //   176: iload #10
/*     */     //   178: iinc #10, 1
/*     */     //   181: lload_1
/*     */     //   182: ldc2_w 255
/*     */     //   185: land
/*     */     //   186: l2i
/*     */     //   187: i2b
/*     */     //   188: bastore
/*     */     //   189: aload #8
/*     */     //   191: iload #10
/*     */     //   193: putfield c : I
/*     */     //   196: istore #7
/*     */     //   198: aload_0
/*     */     //   199: dup
/*     */     //   200: getfield a : J
/*     */     //   203: ldc2_w 8
/*     */     //   206: ladd
/*     */     //   207: putfield a : J
/*     */     //   210: aload_0
/*     */     //   211: iload #7
/*     */     //   213: ifeq -> 242
/*     */     //   216: iconst_2
/*     */     //   217: anewarray me/konsolas/aac/aN
/*     */     //   220: ldc2_w -1684690839470984885
/*     */     //   223: lload_3
/*     */     //   224: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*     */     //   229: goto -> 242
/*     */     //   232: ldc2_w -1672355117422495300
/*     */     //   235: lload_3
/*     */     //   236: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   241: athrow
/*     */     //   242: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #183	-> 15
/*     */     //   #468	-> 25
/*     */     //   #117	-> 32
/*     */     //   #634	-> 39
/*     */     //   #372	-> 57
/*     */     //   #15	-> 75
/*     */     //   #253	-> 93
/*     */     //   #74	-> 120
/*     */     //   #240	-> 138
/*     */     //   #308	-> 156
/*     */     //   #7	-> 174
/*     */     //   #389	-> 189
/*     */     //   #575	-> 198
/*     */     //   #355	-> 210
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   198	229	232	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public final gZ f(short paramShort, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: lload_2
/*     */     //   6: bipush #16
/*     */     //   8: lshl
/*     */     //   9: bipush #16
/*     */     //   11: lushr
/*     */     //   12: lor
/*     */     //   13: getstatic me/konsolas/aac/fw.f : J
/*     */     //   16: lxor
/*     */     //   17: lstore #4
/*     */     //   19: lload #4
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 24986271929607
/*     */     //   25: lxor
/*     */     //   26: lstore #6
/*     */     //   28: pop2
/*     */     //   29: aload_0
/*     */     //   30: sipush #6805
/*     */     //   33: ldc2_w 6748728206421703088
/*     */     //   36: lload #4
/*     */     //   38: lxor
/*     */     //   39: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   44: lload #6
/*     */     //   46: invokespecial a : (Ljava/lang/String;J)Lme/konsolas/aac/gZ;
/*     */     //   49: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #186	-> 29
/*     */   }
/*     */   
/*     */   public gi c(long paramLong1, long paramLong2) {
/* 187 */     long l = paramLong2 ^ 0x3A5190859E29L; return a(paramLong1, l);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long b(long paramLong, gZ paramgZ) {
/* 195 */     long l = paramLong ^ 0x21A868CB3E2L; return b(l, paramgZ, 0L);
/*     */   }
/*     */   public final gG a(long paramLong, gG paramgG) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 1209056740306135183
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore #4
/*     */     //   17: aload_3
/*     */     //   18: iload #4
/*     */     //   20: ifeq -> 84
/*     */     //   23: getfield e : Lme/konsolas/aac/fw;
/*     */     //   26: ifnull -> 73
/*     */     //   29: goto -> 42
/*     */     //   32: ldc2_w 1209105375660622257
/*     */     //   35: lload_1
/*     */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   41: athrow
/*     */     //   42: new java/lang/IllegalStateException
/*     */     //   45: dup
/*     */     //   46: sipush #20572
/*     */     //   49: ldc2_w 1457669720605828784
/*     */     //   52: lload_1
/*     */     //   53: lxor
/*     */     //   54: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   59: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   62: athrow
/*     */     //   63: ldc2_w 1209105375660622257
/*     */     //   66: lload_1
/*     */     //   67: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   72: athrow
/*     */     //   73: aload_3
/*     */     //   74: aload_0
/*     */     //   75: putfield e : Lme/konsolas/aac/fw;
/*     */     //   78: aload_3
/*     */     //   79: iconst_1
/*     */     //   80: putfield d : Z
/*     */     //   83: aload_3
/*     */     //   84: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #203	-> 17
/*     */     //   #449	-> 42
/*     */     //   #348	-> 73
/*     */     //   #710	-> 78
/*     */     //   #127	-> 83
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	29	32	java/lang/IllegalArgumentException
/*     */     //   23	63	63	java/lang/IllegalArgumentException
/*     */   }
/*     */   public int b(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 67931078008571
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 42543705397061
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: pop2
/*     */     //   15: ldc2_w 7563704226147679951
/*     */     //   18: lload_1
/*     */     //   19: <illegal opcode> w : (JJ)I
/*     */     //   24: istore #7
/*     */     //   26: aload_0
/*     */     //   27: getfield a : J
/*     */     //   30: lconst_0
/*     */     //   31: lcmp
/*     */     //   32: iload #7
/*     */     //   34: ifne -> 78
/*     */     //   37: ifne -> 71
/*     */     //   40: goto -> 53
/*     */     //   43: ldc2_w 7527435056444160256
/*     */     //   46: lload_1
/*     */     //   47: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   52: athrow
/*     */     //   53: new java/io/EOFException
/*     */     //   56: dup
/*     */     //   57: invokespecial <init> : ()V
/*     */     //   60: athrow
/*     */     //   61: ldc2_w 7527435056444160256
/*     */     //   64: lload_1
/*     */     //   65: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   70: athrow
/*     */     //   71: aload_0
/*     */     //   72: lconst_0
/*     */     //   73: lload #5
/*     */     //   75: invokevirtual a : (JJ)B
/*     */     //   78: istore #8
/*     */     //   80: iload #8
/*     */     //   82: sipush #128
/*     */     //   85: iand
/*     */     //   86: iload #7
/*     */     //   88: lload_1
/*     */     //   89: lconst_0
/*     */     //   90: lcmp
/*     */     //   91: ifle -> 159
/*     */     //   94: ifne -> 156
/*     */     //   97: ifne -> 137
/*     */     //   100: goto -> 113
/*     */     //   103: ldc2_w 7527435056444160256
/*     */     //   106: lload_1
/*     */     //   107: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   112: athrow
/*     */     //   113: iload #8
/*     */     //   115: bipush #127
/*     */     //   117: iand
/*     */     //   118: istore #9
/*     */     //   120: iconst_1
/*     */     //   121: istore #10
/*     */     //   123: iconst_0
/*     */     //   124: istore #11
/*     */     //   126: iload #7
/*     */     //   128: lload_1
/*     */     //   129: lconst_0
/*     */     //   130: lcmp
/*     */     //   131: ifle -> 380
/*     */     //   134: ifeq -> 372
/*     */     //   137: iload #8
/*     */     //   139: sipush #224
/*     */     //   142: iand
/*     */     //   143: goto -> 156
/*     */     //   146: ldc2_w 7527435056444160256
/*     */     //   149: lload_1
/*     */     //   150: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   155: athrow
/*     */     //   156: sipush #192
/*     */     //   159: iload #7
/*     */     //   161: lload_1
/*     */     //   162: lconst_0
/*     */     //   163: lcmp
/*     */     //   164: ifle -> 236
/*     */     //   167: ifne -> 234
/*     */     //   170: if_icmpne -> 212
/*     */     //   173: goto -> 186
/*     */     //   176: ldc2_w 7527435056444160256
/*     */     //   179: lload_1
/*     */     //   180: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   185: athrow
/*     */     //   186: iload #8
/*     */     //   188: bipush #31
/*     */     //   190: iand
/*     */     //   191: istore #9
/*     */     //   193: iconst_2
/*     */     //   194: istore #10
/*     */     //   196: sipush #128
/*     */     //   199: istore #11
/*     */     //   201: iload #7
/*     */     //   203: lload_1
/*     */     //   204: lconst_0
/*     */     //   205: lcmp
/*     */     //   206: ifle -> 380
/*     */     //   209: ifeq -> 372
/*     */     //   212: iload #8
/*     */     //   214: sipush #240
/*     */     //   217: iand
/*     */     //   218: sipush #224
/*     */     //   221: goto -> 234
/*     */     //   224: ldc2_w 7527435056444160256
/*     */     //   227: lload_1
/*     */     //   228: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   233: athrow
/*     */     //   234: iload #7
/*     */     //   236: ifne -> 321
/*     */     //   239: if_icmpne -> 281
/*     */     //   242: goto -> 255
/*     */     //   245: ldc2_w 7527435056444160256
/*     */     //   248: lload_1
/*     */     //   249: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   254: athrow
/*     */     //   255: iload #8
/*     */     //   257: bipush #15
/*     */     //   259: iand
/*     */     //   260: istore #9
/*     */     //   262: iconst_3
/*     */     //   263: istore #10
/*     */     //   265: sipush #2048
/*     */     //   268: istore #11
/*     */     //   270: iload #7
/*     */     //   272: lload_1
/*     */     //   273: lconst_0
/*     */     //   274: lcmp
/*     */     //   275: iflt -> 380
/*     */     //   278: ifeq -> 372
/*     */     //   281: iload #8
/*     */     //   283: sipush #248
/*     */     //   286: iand
/*     */     //   287: iload #7
/*     */     //   289: ifne -> 371
/*     */     //   292: goto -> 305
/*     */     //   295: ldc2_w 7527435056444160256
/*     */     //   298: lload_1
/*     */     //   299: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   304: athrow
/*     */     //   305: sipush #240
/*     */     //   308: goto -> 321
/*     */     //   311: ldc2_w 7527435056444160256
/*     */     //   314: lload_1
/*     */     //   315: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   320: athrow
/*     */     //   321: if_icmpne -> 350
/*     */     //   324: iload #8
/*     */     //   326: bipush #7
/*     */     //   328: iand
/*     */     //   329: istore #9
/*     */     //   331: iconst_4
/*     */     //   332: istore #10
/*     */     //   334: ldc_w 65536
/*     */     //   337: istore #11
/*     */     //   339: iload #7
/*     */     //   341: lload_1
/*     */     //   342: lconst_0
/*     */     //   343: lcmp
/*     */     //   344: iflt -> 380
/*     */     //   347: ifeq -> 372
/*     */     //   350: aload_0
/*     */     //   351: lconst_1
/*     */     //   352: lload_3
/*     */     //   353: invokevirtual a : (JJ)V
/*     */     //   356: ldc 65533
/*     */     //   358: goto -> 371
/*     */     //   361: ldc2_w 7527435056444160256
/*     */     //   364: lload_1
/*     */     //   365: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   370: athrow
/*     */     //   371: ireturn
/*     */     //   372: aload_0
/*     */     //   373: getfield a : J
/*     */     //   376: iload #10
/*     */     //   378: i2l
/*     */     //   379: lcmp
/*     */     //   380: iload #7
/*     */     //   382: ifne -> 526
/*     */     //   385: ifge -> 525
/*     */     //   388: goto -> 401
/*     */     //   391: ldc2_w 7527435056444160256
/*     */     //   394: lload_1
/*     */     //   395: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   400: athrow
/*     */     //   401: new java/io/EOFException
/*     */     //   404: dup
/*     */     //   405: new java/lang/StringBuilder
/*     */     //   408: dup
/*     */     //   409: invokespecial <init> : ()V
/*     */     //   412: sipush #15751
/*     */     //   415: ldc2_w 9028899578099708912
/*     */     //   418: lload_1
/*     */     //   419: lxor
/*     */     //   420: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   428: iload #10
/*     */     //   430: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   433: sipush #4892
/*     */     //   436: ldc2_w 8098841238730218878
/*     */     //   439: lload_1
/*     */     //   440: lxor
/*     */     //   441: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   449: aload_0
/*     */     //   450: getfield a : J
/*     */     //   453: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   456: sipush #9001
/*     */     //   459: ldc2_w 1686522630911077752
/*     */     //   462: lload_1
/*     */     //   463: lxor
/*     */     //   464: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   469: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   472: iload #8
/*     */     //   474: invokestatic toHexString : (I)Ljava/lang/String;
/*     */     //   477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   480: ldc_w '⨻瘣'
/*     */     //   483: invokevirtual toCharArray : ()[C
/*     */     //   486: dup
/*     */     //   487: dup
/*     */     //   488: iconst_0
/*     */     //   489: dup_x1
/*     */     //   490: caload
/*     */     //   491: sipush #30070
/*     */     //   494: ixor
/*     */     //   495: i2c
/*     */     //   496: castore
/*     */     //   497: sipush #11422
/*     */     //   500: iconst_2
/*     */     //   501: iconst_5
/*     */     //   502: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   508: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   511: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   514: athrow
/*     */     //   515: ldc2_w 7527435056444160256
/*     */     //   518: lload_1
/*     */     //   519: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   524: athrow
/*     */     //   525: iconst_1
/*     */     //   526: istore #12
/*     */     //   528: iload #12
/*     */     //   530: iload #10
/*     */     //   532: if_icmpge -> 666
/*     */     //   535: aload_0
/*     */     //   536: iload #12
/*     */     //   538: i2l
/*     */     //   539: lload #5
/*     */     //   541: invokevirtual a : (JJ)B
/*     */     //   544: istore #13
/*     */     //   546: iload #13
/*     */     //   548: sipush #192
/*     */     //   551: iand
/*     */     //   552: iload #7
/*     */     //   554: lload_1
/*     */     //   555: lconst_0
/*     */     //   556: lcmp
/*     */     //   557: ifle -> 566
/*     */     //   560: ifne -> 657
/*     */     //   563: sipush #128
/*     */     //   566: iload #7
/*     */     //   568: lload_1
/*     */     //   569: lconst_0
/*     */     //   570: lcmp
/*     */     //   571: iflt -> 687
/*     */     //   574: ifne -> 685
/*     */     //   577: goto -> 590
/*     */     //   580: ldc2_w 7527435056444160256
/*     */     //   583: lload_1
/*     */     //   584: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   589: athrow
/*     */     //   590: if_icmpne -> 634
/*     */     //   593: goto -> 606
/*     */     //   596: ldc2_w 7527435056444160256
/*     */     //   599: lload_1
/*     */     //   600: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   605: athrow
/*     */     //   606: iload #9
/*     */     //   608: bipush #6
/*     */     //   610: ishl
/*     */     //   611: istore #9
/*     */     //   613: iload #9
/*     */     //   615: iload #13
/*     */     //   617: bipush #63
/*     */     //   619: iand
/*     */     //   620: ior
/*     */     //   621: istore #9
/*     */     //   623: iload #7
/*     */     //   625: lload_1
/*     */     //   626: lconst_0
/*     */     //   627: lcmp
/*     */     //   628: iflt -> 663
/*     */     //   631: ifeq -> 658
/*     */     //   634: aload_0
/*     */     //   635: iload #12
/*     */     //   637: i2l
/*     */     //   638: lload_3
/*     */     //   639: invokevirtual a : (JJ)V
/*     */     //   642: ldc 65533
/*     */     //   644: goto -> 657
/*     */     //   647: ldc2_w 7527435056444160256
/*     */     //   650: lload_1
/*     */     //   651: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   656: athrow
/*     */     //   657: ireturn
/*     */     //   658: iinc #12, 1
/*     */     //   661: iload #7
/*     */     //   663: ifeq -> 528
/*     */     //   666: aload_0
/*     */     //   667: iload #10
/*     */     //   669: i2l
/*     */     //   670: lload_3
/*     */     //   671: invokevirtual a : (JJ)V
/*     */     //   674: iload #9
/*     */     //   676: lload_1
/*     */     //   677: lconst_0
/*     */     //   678: lcmp
/*     */     //   679: iflt -> 544
/*     */     //   682: ldc_w 1114111
/*     */     //   685: iload #7
/*     */     //   687: lload_1
/*     */     //   688: lconst_0
/*     */     //   689: lcmp
/*     */     //   690: ifle -> 732
/*     */     //   693: ifne -> 730
/*     */     //   696: if_icmple -> 725
/*     */     //   699: goto -> 712
/*     */     //   702: ldc2_w 7527435056444160256
/*     */     //   705: lload_1
/*     */     //   706: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   711: athrow
/*     */     //   712: ldc 65533
/*     */     //   714: ireturn
/*     */     //   715: ldc2_w 7527435056444160256
/*     */     //   718: lload_1
/*     */     //   719: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   724: athrow
/*     */     //   725: iload #9
/*     */     //   727: ldc_w 55296
/*     */     //   730: iload #7
/*     */     //   732: ifne -> 843
/*     */     //   735: if_icmplt -> 815
/*     */     //   738: goto -> 751
/*     */     //   741: ldc2_w 7527435056444160256
/*     */     //   744: lload_1
/*     */     //   745: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   750: athrow
/*     */     //   751: iload #9
/*     */     //   753: ldc_w 57343
/*     */     //   756: lload_1
/*     */     //   757: lconst_0
/*     */     //   758: lcmp
/*     */     //   759: iflt -> 843
/*     */     //   762: iload #7
/*     */     //   764: ifne -> 843
/*     */     //   767: goto -> 780
/*     */     //   770: ldc2_w 7527435056444160256
/*     */     //   773: lload_1
/*     */     //   774: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   779: athrow
/*     */     //   780: lload_1
/*     */     //   781: lconst_0
/*     */     //   782: lcmp
/*     */     //   783: ifle -> 819
/*     */     //   786: if_icmpgt -> 815
/*     */     //   789: goto -> 802
/*     */     //   792: ldc2_w 7527435056444160256
/*     */     //   795: lload_1
/*     */     //   796: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   801: athrow
/*     */     //   802: ldc 65533
/*     */     //   804: ireturn
/*     */     //   805: ldc2_w 7527435056444160256
/*     */     //   808: lload_1
/*     */     //   809: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   814: athrow
/*     */     //   815: iload #9
/*     */     //   817: iload #7
/*     */     //   819: lload_1
/*     */     //   820: lconst_0
/*     */     //   821: lcmp
/*     */     //   822: iflt -> 830
/*     */     //   825: ifne -> 861
/*     */     //   828: iload #11
/*     */     //   830: goto -> 843
/*     */     //   833: ldc2_w 7527435056444160256
/*     */     //   836: lload_1
/*     */     //   837: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   842: athrow
/*     */     //   843: if_icmpge -> 859
/*     */     //   846: ldc 65533
/*     */     //   848: ireturn
/*     */     //   849: ldc2_w 7527435056444160256
/*     */     //   852: lload_1
/*     */     //   853: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   858: athrow
/*     */     //   859: iload #9
/*     */     //   861: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #204	-> 26
/*     */     //   #125	-> 71
/*     */     //   #864	-> 80
/*     */     //   #102	-> 113
/*     */     //   #652	-> 120
/*     */     //   #614	-> 123
/*     */     //   #510	-> 137
/*     */     //   #892	-> 186
/*     */     //   #164	-> 193
/*     */     //   #426	-> 196
/*     */     //   #89	-> 212
/*     */     //   #619	-> 255
/*     */     //   #369	-> 262
/*     */     //   #219	-> 265
/*     */     //   #193	-> 281
/*     */     //   #463	-> 324
/*     */     //   #294	-> 331
/*     */     //   #382	-> 334
/*     */     //   #45	-> 350
/*     */     //   #859	-> 356
/*     */     //   #723	-> 372
/*     */     //   #97	-> 401
/*     */     //   #636	-> 474
/*     */     //   #356	-> 525
/*     */     //   #126	-> 535
/*     */     //   #309	-> 546
/*     */     //   #110	-> 606
/*     */     //   #475	-> 613
/*     */     //   #708	-> 634
/*     */     //   #445	-> 642
/*     */     //   #720	-> 658
/*     */     //   #571	-> 666
/*     */     //   #189	-> 674
/*     */     //   #370	-> 712
/*     */     //   #908	-> 725
/*     */     //   #939	-> 802
/*     */     //   #487	-> 815
/*     */     //   #212	-> 846
/*     */     //   #21	-> 859
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	40	43	java/io/EOFException
/*     */     //   37	61	61	java/io/EOFException
/*     */     //   80	100	103	java/io/EOFException
/*     */     //   126	143	146	java/io/EOFException
/*     */     //   156	173	176	java/io/EOFException
/*     */     //   201	221	224	java/io/EOFException
/*     */     //   234	242	245	java/io/EOFException
/*     */     //   270	292	295	java/io/EOFException
/*     */     //   281	308	311	java/io/EOFException
/*     */     //   339	358	361	java/io/EOFException
/*     */     //   372	388	391	java/io/EOFException
/*     */     //   385	515	515	java/io/EOFException
/*     */     //   546	577	580	java/io/EOFException
/*     */     //   563	593	596	java/io/EOFException
/*     */     //   623	644	647	java/io/EOFException
/*     */     //   685	699	702	java/io/EOFException
/*     */     //   696	715	715	java/io/EOFException
/*     */     //   730	738	741	java/io/EOFException
/*     */     //   735	767	770	java/io/EOFException
/*     */     //   751	789	792	java/io/EOFException
/*     */     //   780	805	805	java/io/EOFException
/*     */     //   815	830	833	java/io/EOFException
/*     */     //   843	849	849	java/io/EOFException
/*     */   }
/*     */   
/*     */   public long d(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 83141264504666
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 64105956105458
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 36616364009568
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 126475935958900
/*     */     //   25: lxor
/*     */     //   26: lstore #9
/*     */     //   28: dup2
/*     */     //   29: ldc2_w 67874391916527
/*     */     //   32: lxor
/*     */     //   33: lstore #11
/*     */     //   35: pop2
/*     */     //   36: ldc2_w 6533864631632923796
/*     */     //   39: lload_1
/*     */     //   40: <illegal opcode> w : (JJ)I
/*     */     //   45: istore #13
/*     */     //   47: aload_0
/*     */     //   48: getfield a : J
/*     */     //   51: iload #13
/*     */     //   53: ifne -> 106
/*     */     //   56: lconst_0
/*     */     //   57: lcmp
/*     */     //   58: ifne -> 105
/*     */     //   61: goto -> 74
/*     */     //   64: ldc2_w 6498005854643686235
/*     */     //   67: lload_1
/*     */     //   68: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   73: athrow
/*     */     //   74: new java/lang/IllegalStateException
/*     */     //   77: dup
/*     */     //   78: sipush #16993
/*     */     //   81: ldc2_w 5357973571467837046
/*     */     //   84: lload_1
/*     */     //   85: lxor
/*     */     //   86: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   91: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   94: athrow
/*     */     //   95: ldc2_w 6498005854643686235
/*     */     //   98: lload_1
/*     */     //   99: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   104: athrow
/*     */     //   105: lconst_0
/*     */     //   106: lstore #14
/*     */     //   108: iconst_0
/*     */     //   109: istore #16
/*     */     //   111: iconst_0
/*     */     //   112: istore #17
/*     */     //   114: aload_0
/*     */     //   115: getfield b : Lme/konsolas/aac/eV;
/*     */     //   118: astore #18
/*     */     //   120: aload #18
/*     */     //   122: getfield h : [B
/*     */     //   125: astore #19
/*     */     //   127: aload #18
/*     */     //   129: getfield d : I
/*     */     //   132: istore #20
/*     */     //   134: aload #18
/*     */     //   136: getfield c : I
/*     */     //   139: istore #21
/*     */     //   141: iload #20
/*     */     //   143: iload #21
/*     */     //   145: if_icmpge -> 704
/*     */     //   148: aload #19
/*     */     //   150: iload #20
/*     */     //   152: baload
/*     */     //   153: istore #23
/*     */     //   155: iload #23
/*     */     //   157: bipush #48
/*     */     //   159: lload_1
/*     */     //   160: lconst_0
/*     */     //   161: lcmp
/*     */     //   162: iflt -> 708
/*     */     //   165: iload #13
/*     */     //   167: ifne -> 708
/*     */     //   170: iload #13
/*     */     //   172: ifne -> 289
/*     */     //   175: goto -> 188
/*     */     //   178: ldc2_w 6498005854643686235
/*     */     //   181: lload_1
/*     */     //   182: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   187: athrow
/*     */     //   188: lload_1
/*     */     //   189: lconst_0
/*     */     //   190: lcmp
/*     */     //   191: ifle -> 276
/*     */     //   194: if_icmplt -> 272
/*     */     //   197: goto -> 210
/*     */     //   200: ldc2_w 6498005854643686235
/*     */     //   203: lload_1
/*     */     //   204: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   209: athrow
/*     */     //   210: iload #23
/*     */     //   212: bipush #57
/*     */     //   214: iload #13
/*     */     //   216: lload_1
/*     */     //   217: lconst_0
/*     */     //   218: lcmp
/*     */     //   219: ifle -> 291
/*     */     //   222: ifne -> 289
/*     */     //   225: goto -> 238
/*     */     //   228: ldc2_w 6498005854643686235
/*     */     //   231: lload_1
/*     */     //   232: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   237: athrow
/*     */     //   238: if_icmpgt -> 272
/*     */     //   241: goto -> 254
/*     */     //   244: ldc2_w 6498005854643686235
/*     */     //   247: lload_1
/*     */     //   248: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   253: athrow
/*     */     //   254: iload #23
/*     */     //   256: bipush #48
/*     */     //   258: isub
/*     */     //   259: istore #22
/*     */     //   261: lload_1
/*     */     //   262: lconst_0
/*     */     //   263: lcmp
/*     */     //   264: ifle -> 578
/*     */     //   267: iload #13
/*     */     //   269: ifeq -> 578
/*     */     //   272: iload #23
/*     */     //   274: bipush #97
/*     */     //   276: goto -> 289
/*     */     //   279: ldc2_w 6498005854643686235
/*     */     //   282: lload_1
/*     */     //   283: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   288: athrow
/*     */     //   289: iload #13
/*     */     //   291: ifne -> 410
/*     */     //   294: if_icmplt -> 375
/*     */     //   297: goto -> 310
/*     */     //   300: ldc2_w 6498005854643686235
/*     */     //   303: lload_1
/*     */     //   304: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   309: athrow
/*     */     //   310: iload #23
/*     */     //   312: bipush #102
/*     */     //   314: lload_1
/*     */     //   315: lconst_0
/*     */     //   316: lcmp
/*     */     //   317: ifle -> 410
/*     */     //   320: iload #13
/*     */     //   322: ifne -> 410
/*     */     //   325: goto -> 338
/*     */     //   328: ldc2_w 6498005854643686235
/*     */     //   331: lload_1
/*     */     //   332: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   337: athrow
/*     */     //   338: if_icmpgt -> 375
/*     */     //   341: goto -> 354
/*     */     //   344: ldc2_w 6498005854643686235
/*     */     //   347: lload_1
/*     */     //   348: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   353: athrow
/*     */     //   354: iload #23
/*     */     //   356: bipush #97
/*     */     //   358: isub
/*     */     //   359: bipush #10
/*     */     //   361: iadd
/*     */     //   362: istore #22
/*     */     //   364: lload_1
/*     */     //   365: lconst_0
/*     */     //   366: lcmp
/*     */     //   367: ifle -> 578
/*     */     //   370: iload #13
/*     */     //   372: ifeq -> 578
/*     */     //   375: iload #23
/*     */     //   377: iload #13
/*     */     //   379: ifne -> 499
/*     */     //   382: goto -> 395
/*     */     //   385: ldc2_w 6498005854643686235
/*     */     //   388: lload_1
/*     */     //   389: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   394: athrow
/*     */     //   395: bipush #65
/*     */     //   397: goto -> 410
/*     */     //   400: ldc2_w 6498005854643686235
/*     */     //   403: lload_1
/*     */     //   404: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   409: athrow
/*     */     //   410: lload_1
/*     */     //   411: lconst_0
/*     */     //   412: lcmp
/*     */     //   413: ifle -> 423
/*     */     //   416: if_icmplt -> 484
/*     */     //   419: iload #23
/*     */     //   421: iload #13
/*     */     //   423: lload_1
/*     */     //   424: lconst_0
/*     */     //   425: lcmp
/*     */     //   426: iflt -> 501
/*     */     //   429: ifne -> 499
/*     */     //   432: goto -> 445
/*     */     //   435: ldc2_w 6498005854643686235
/*     */     //   438: lload_1
/*     */     //   439: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   444: athrow
/*     */     //   445: bipush #70
/*     */     //   447: if_icmpgt -> 484
/*     */     //   450: goto -> 463
/*     */     //   453: ldc2_w 6498005854643686235
/*     */     //   456: lload_1
/*     */     //   457: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   462: athrow
/*     */     //   463: iload #23
/*     */     //   465: bipush #65
/*     */     //   467: isub
/*     */     //   468: bipush #10
/*     */     //   470: iadd
/*     */     //   471: istore #22
/*     */     //   473: lload_1
/*     */     //   474: lconst_0
/*     */     //   475: lcmp
/*     */     //   476: iflt -> 578
/*     */     //   479: iload #13
/*     */     //   481: ifeq -> 578
/*     */     //   484: iload #16
/*     */     //   486: goto -> 499
/*     */     //   489: ldc2_w 6498005854643686235
/*     */     //   492: lload_1
/*     */     //   493: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   498: athrow
/*     */     //   499: iload #13
/*     */     //   501: ifne -> 573
/*     */     //   504: ifne -> 572
/*     */     //   507: goto -> 520
/*     */     //   510: ldc2_w 6498005854643686235
/*     */     //   513: lload_1
/*     */     //   514: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   519: athrow
/*     */     //   520: new java/lang/NumberFormatException
/*     */     //   523: dup
/*     */     //   524: new java/lang/StringBuilder
/*     */     //   527: dup
/*     */     //   528: invokespecial <init> : ()V
/*     */     //   531: sipush #15422
/*     */     //   534: ldc2_w 3446890070799187968
/*     */     //   537: lload_1
/*     */     //   538: lxor
/*     */     //   539: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   544: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   547: iload #23
/*     */     //   549: invokestatic toHexString : (I)Ljava/lang/String;
/*     */     //   552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   555: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   558: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   561: athrow
/*     */     //   562: ldc2_w 6498005854643686235
/*     */     //   565: lload_1
/*     */     //   566: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   571: athrow
/*     */     //   572: iconst_1
/*     */     //   573: istore #17
/*     */     //   575: goto -> 704
/*     */     //   578: lload #14
/*     */     //   580: ldc2_w -1152921504606846976
/*     */     //   583: land
/*     */     //   584: lload_1
/*     */     //   585: lconst_0
/*     */     //   586: lcmp
/*     */     //   587: ifle -> 691
/*     */     //   590: lconst_0
/*     */     //   591: iload #13
/*     */     //   593: ifne -> 690
/*     */     //   596: lcmp
/*     */     //   597: ifeq -> 679
/*     */     //   600: goto -> 613
/*     */     //   603: ldc2_w 6498005854643686235
/*     */     //   606: lload_1
/*     */     //   607: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   612: athrow
/*     */     //   613: new me/konsolas/aac/fw
/*     */     //   616: dup
/*     */     //   617: invokespecial <init> : ()V
/*     */     //   620: lload #14
/*     */     //   622: lload_3
/*     */     //   623: invokevirtual a : (JJ)Lme/konsolas/aac/fw;
/*     */     //   626: iload #23
/*     */     //   628: lload #5
/*     */     //   630: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   633: astore #24
/*     */     //   635: new java/lang/NumberFormatException
/*     */     //   638: dup
/*     */     //   639: new java/lang/StringBuilder
/*     */     //   642: dup
/*     */     //   643: invokespecial <init> : ()V
/*     */     //   646: sipush #20864
/*     */     //   649: ldc2_w 5135809713706265985
/*     */     //   652: lload_1
/*     */     //   653: lxor
/*     */     //   654: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   659: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   662: aload #24
/*     */     //   664: lload #11
/*     */     //   666: invokevirtual c : (J)Ljava/lang/String;
/*     */     //   669: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   672: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   675: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   678: athrow
/*     */     //   679: lload #14
/*     */     //   681: iconst_4
/*     */     //   682: lshl
/*     */     //   683: lstore #14
/*     */     //   685: lload #14
/*     */     //   687: iload #22
/*     */     //   689: i2l
/*     */     //   690: lor
/*     */     //   691: lstore #14
/*     */     //   693: iinc #20, 1
/*     */     //   696: iinc #16, 1
/*     */     //   699: iload #13
/*     */     //   701: ifeq -> 141
/*     */     //   704: iload #20
/*     */     //   706: iload #21
/*     */     //   708: if_icmpne -> 753
/*     */     //   711: aload_0
/*     */     //   712: aload #18
/*     */     //   714: lload #9
/*     */     //   716: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   719: putfield b : Lme/konsolas/aac/eV;
/*     */     //   722: aload #18
/*     */     //   724: lload #7
/*     */     //   726: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   729: iload #13
/*     */     //   731: lload_1
/*     */     //   732: lconst_0
/*     */     //   733: lcmp
/*     */     //   734: iflt -> 775
/*     */     //   737: ifeq -> 773
/*     */     //   740: goto -> 753
/*     */     //   743: ldc2_w 6498005854643686235
/*     */     //   746: lload_1
/*     */     //   747: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   752: athrow
/*     */     //   753: aload #18
/*     */     //   755: iload #20
/*     */     //   757: putfield d : I
/*     */     //   760: goto -> 773
/*     */     //   763: ldc2_w 6498005854643686235
/*     */     //   766: lload_1
/*     */     //   767: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   772: athrow
/*     */     //   773: iload #17
/*     */     //   775: lload_1
/*     */     //   776: lconst_0
/*     */     //   777: lcmp
/*     */     //   778: iflt -> 824
/*     */     //   781: ifne -> 810
/*     */     //   784: aload_0
/*     */     //   785: getfield b : Lme/konsolas/aac/eV;
/*     */     //   788: ifnonnull -> 114
/*     */     //   791: lload_1
/*     */     //   792: lconst_0
/*     */     //   793: lcmp
/*     */     //   794: iflt -> 704
/*     */     //   797: goto -> 810
/*     */     //   800: ldc2_w 6498005854643686235
/*     */     //   803: lload_1
/*     */     //   804: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   809: athrow
/*     */     //   810: aload_0
/*     */     //   811: dup
/*     */     //   812: getfield a : J
/*     */     //   815: iload #16
/*     */     //   817: i2l
/*     */     //   818: lsub
/*     */     //   819: putfield a : J
/*     */     //   822: iload #13
/*     */     //   824: ifne -> 704
/*     */     //   827: lload #14
/*     */     //   829: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #206	-> 47
/*     */     //   #668	-> 105
/*     */     //   #746	-> 108
/*     */     //   #779	-> 111
/*     */     //   #666	-> 114
/*     */     //   #324	-> 120
/*     */     //   #519	-> 127
/*     */     //   #845	-> 134
/*     */     //   #104	-> 141
/*     */     //   #233	-> 148
/*     */     //   #596	-> 155
/*     */     //   #587	-> 254
/*     */     //   #737	-> 272
/*     */     //   #6	-> 354
/*     */     //   #312	-> 375
/*     */     //   #291	-> 463
/*     */     //   #30	-> 484
/*     */     //   #462	-> 520
/*     */     //   #525	-> 549
/*     */     //   #381	-> 572
/*     */     //   #718	-> 575
/*     */     //   #640	-> 578
/*     */     //   #285	-> 613
/*     */     //   #379	-> 635
/*     */     //   #495	-> 679
/*     */     //   #901	-> 685
/*     */     //   #902	-> 693
/*     */     //   #835	-> 704
/*     */     //   #451	-> 711
/*     */     //   #900	-> 722
/*     */     //   #765	-> 753
/*     */     //   #749	-> 773
/*     */     //   #822	-> 810
/*     */     //   #36	-> 822
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   47	61	64	java/lang/IllegalArgumentException
/*     */     //   56	95	95	java/lang/IllegalArgumentException
/*     */     //   155	175	178	java/lang/IllegalArgumentException
/*     */     //   170	197	200	java/lang/IllegalArgumentException
/*     */     //   188	225	228	java/lang/IllegalArgumentException
/*     */     //   210	241	244	java/lang/IllegalArgumentException
/*     */     //   261	276	279	java/lang/IllegalArgumentException
/*     */     //   289	297	300	java/lang/IllegalArgumentException
/*     */     //   294	325	328	java/lang/IllegalArgumentException
/*     */     //   310	341	344	java/lang/IllegalArgumentException
/*     */     //   364	382	385	java/lang/IllegalArgumentException
/*     */     //   375	397	400	java/lang/IllegalArgumentException
/*     */     //   410	432	435	java/lang/IllegalArgumentException
/*     */     //   419	450	453	java/lang/IllegalArgumentException
/*     */     //   473	486	489	java/lang/IllegalArgumentException
/*     */     //   499	507	510	java/lang/IllegalArgumentException
/*     */     //   504	562	562	java/lang/IllegalArgumentException
/*     */     //   578	600	603	java/lang/IllegalArgumentException
/*     */     //   708	740	743	java/lang/IllegalArgumentException
/*     */     //   711	760	763	java/lang/IllegalArgumentException
/*     */     //   773	791	800	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public String b(short paramShort1, short paramShort2, int paramInt) {
/* 209 */     long l1 = paramShort1 << 48L | paramShort2 << 48L >>> 16L | paramInt << 32L >>> 32L, l2 = l1 ^ 0x7F68DFF671F5L; return a(Long.MAX_VALUE, l2);
/*     */   }
/*     */   public long b(long paramLong1, gZ paramgZ, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 78846952286183
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 2284401232109
/*     */     //   12: lxor
/*     */     //   13: lstore #8
/*     */     //   15: pop2
/*     */     //   16: ldc2_w -1794337060179878063
/*     */     //   19: lload_1
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: istore #10
/*     */     //   27: lload #4
/*     */     //   29: lconst_0
/*     */     //   30: lcmp
/*     */     //   31: ifge -> 65
/*     */     //   34: new java/lang/IllegalArgumentException
/*     */     //   37: dup
/*     */     //   38: sipush #7014
/*     */     //   41: ldc2_w 310356198432348776
/*     */     //   44: lload_1
/*     */     //   45: lxor
/*     */     //   46: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   51: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   54: athrow
/*     */     //   55: ldc2_w -1794174627953396113
/*     */     //   58: lload_1
/*     */     //   59: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   64: athrow
/*     */     //   65: aload_0
/*     */     //   66: getfield b : Lme/konsolas/aac/eV;
/*     */     //   69: astore #11
/*     */     //   71: lload_1
/*     */     //   72: lconst_0
/*     */     //   73: lcmp
/*     */     //   74: iflt -> 96
/*     */     //   77: aload #11
/*     */     //   79: ifnonnull -> 96
/*     */     //   82: ldc2_w -1
/*     */     //   85: lreturn
/*     */     //   86: ldc2_w -1794174627953396113
/*     */     //   89: lload_1
/*     */     //   90: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   95: athrow
/*     */     //   96: aload_0
/*     */     //   97: getfield a : J
/*     */     //   100: lload #4
/*     */     //   102: lload_1
/*     */     //   103: lconst_0
/*     */     //   104: lcmp
/*     */     //   105: ifle -> 116
/*     */     //   108: lsub
/*     */     //   109: iload #10
/*     */     //   111: ifeq -> 207
/*     */     //   114: lload #4
/*     */     //   116: lcmp
/*     */     //   117: ifge -> 206
/*     */     //   120: goto -> 133
/*     */     //   123: ldc2_w -1794174627953396113
/*     */     //   126: lload_1
/*     */     //   127: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   132: athrow
/*     */     //   133: aload_0
/*     */     //   134: getfield a : J
/*     */     //   137: lstore #12
/*     */     //   139: lload #12
/*     */     //   141: lload #4
/*     */     //   143: lcmp
/*     */     //   144: ifle -> 279
/*     */     //   147: aload #11
/*     */     //   149: getfield e : Lme/konsolas/aac/eV;
/*     */     //   152: astore #11
/*     */     //   154: lload #12
/*     */     //   156: aload #11
/*     */     //   158: getfield c : I
/*     */     //   161: aload #11
/*     */     //   163: getfield d : I
/*     */     //   166: isub
/*     */     //   167: i2l
/*     */     //   168: lsub
/*     */     //   169: lstore #12
/*     */     //   171: iload #10
/*     */     //   173: lload_1
/*     */     //   174: lconst_0
/*     */     //   175: lcmp
/*     */     //   176: ifle -> 184
/*     */     //   179: ifeq -> 551
/*     */     //   182: iload #10
/*     */     //   184: ifne -> 139
/*     */     //   187: lload_1
/*     */     //   188: lconst_0
/*     */     //   189: lcmp
/*     */     //   190: ifle -> 171
/*     */     //   193: goto -> 206
/*     */     //   196: ldc2_w -1794174627953396113
/*     */     //   199: lload_1
/*     */     //   200: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   205: athrow
/*     */     //   206: lconst_0
/*     */     //   207: lstore #12
/*     */     //   209: lload #12
/*     */     //   211: aload #11
/*     */     //   213: getfield c : I
/*     */     //   216: aload #11
/*     */     //   218: getfield d : I
/*     */     //   221: isub
/*     */     //   222: i2l
/*     */     //   223: ladd
/*     */     //   224: dup2
/*     */     //   225: lstore #14
/*     */     //   227: lload #4
/*     */     //   229: lcmp
/*     */     //   230: ifge -> 279
/*     */     //   233: aload #11
/*     */     //   235: getfield b : Lme/konsolas/aac/eV;
/*     */     //   238: astore #11
/*     */     //   240: lload #14
/*     */     //   242: lstore #12
/*     */     //   244: iload #10
/*     */     //   246: lload_1
/*     */     //   247: lconst_0
/*     */     //   248: lcmp
/*     */     //   249: ifle -> 257
/*     */     //   252: ifeq -> 551
/*     */     //   255: iload #10
/*     */     //   257: ifne -> 209
/*     */     //   260: lload_1
/*     */     //   261: lconst_0
/*     */     //   262: lcmp
/*     */     //   263: iflt -> 244
/*     */     //   266: goto -> 279
/*     */     //   269: ldc2_w -1794174627953396113
/*     */     //   272: lload_1
/*     */     //   273: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   278: athrow
/*     */     //   279: aload_3
/*     */     //   280: iload #10
/*     */     //   282: ifeq -> 552
/*     */     //   285: invokevirtual a : ()I
/*     */     //   288: iconst_2
/*     */     //   289: if_icmpne -> 551
/*     */     //   292: goto -> 305
/*     */     //   295: ldc2_w -1794174627953396113
/*     */     //   298: lload_1
/*     */     //   299: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   304: athrow
/*     */     //   305: aload_3
/*     */     //   306: iconst_0
/*     */     //   307: lload #6
/*     */     //   309: invokevirtual a : (IJ)B
/*     */     //   312: istore #14
/*     */     //   314: aload_3
/*     */     //   315: iconst_1
/*     */     //   316: lload #6
/*     */     //   318: invokevirtual a : (IJ)B
/*     */     //   321: istore #15
/*     */     //   323: lload #12
/*     */     //   325: aload_0
/*     */     //   326: getfield a : J
/*     */     //   329: lcmp
/*     */     //   330: ifge -> 540
/*     */     //   333: aload #11
/*     */     //   335: getfield h : [B
/*     */     //   338: astore #16
/*     */     //   340: aload #11
/*     */     //   342: getfield d : I
/*     */     //   345: i2l
/*     */     //   346: lload #4
/*     */     //   348: ladd
/*     */     //   349: lload #12
/*     */     //   351: lsub
/*     */     //   352: l2i
/*     */     //   353: istore #17
/*     */     //   355: iload #10
/*     */     //   357: lload_1
/*     */     //   358: lconst_0
/*     */     //   359: lcmp
/*     */     //   360: iflt -> 371
/*     */     //   363: ifeq -> 786
/*     */     //   366: aload #11
/*     */     //   368: getfield c : I
/*     */     //   371: istore #18
/*     */     //   373: iload #17
/*     */     //   375: iload #18
/*     */     //   377: if_icmpge -> 501
/*     */     //   380: aload #16
/*     */     //   382: iload #17
/*     */     //   384: baload
/*     */     //   385: istore #19
/*     */     //   387: iload #19
/*     */     //   389: iload #14
/*     */     //   391: iload #10
/*     */     //   393: ifeq -> 377
/*     */     //   396: iload #10
/*     */     //   398: lload_1
/*     */     //   399: lconst_0
/*     */     //   400: lcmp
/*     */     //   401: iflt -> 393
/*     */     //   404: ifeq -> 487
/*     */     //   407: if_icmpeq -> 467
/*     */     //   410: goto -> 423
/*     */     //   413: ldc2_w -1794174627953396113
/*     */     //   416: lload_1
/*     */     //   417: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   422: athrow
/*     */     //   423: iload #19
/*     */     //   425: lload_1
/*     */     //   426: lconst_0
/*     */     //   427: lcmp
/*     */     //   428: iflt -> 488
/*     */     //   431: iload #15
/*     */     //   433: iload #10
/*     */     //   435: ifeq -> 487
/*     */     //   438: goto -> 451
/*     */     //   441: ldc2_w -1794174627953396113
/*     */     //   444: lload_1
/*     */     //   445: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   450: athrow
/*     */     //   451: if_icmpne -> 493
/*     */     //   454: goto -> 467
/*     */     //   457: ldc2_w -1794174627953396113
/*     */     //   460: lload_1
/*     */     //   461: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   466: athrow
/*     */     //   467: iload #17
/*     */     //   469: aload #11
/*     */     //   471: getfield d : I
/*     */     //   474: goto -> 487
/*     */     //   477: ldc2_w -1794174627953396113
/*     */     //   480: lload_1
/*     */     //   481: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   486: athrow
/*     */     //   487: isub
/*     */     //   488: i2l
/*     */     //   489: lload #12
/*     */     //   491: ladd
/*     */     //   492: lreturn
/*     */     //   493: iinc #17, 1
/*     */     //   496: iload #10
/*     */     //   498: ifne -> 373
/*     */     //   501: lload #12
/*     */     //   503: aload #11
/*     */     //   505: getfield c : I
/*     */     //   508: aload #11
/*     */     //   510: getfield d : I
/*     */     //   513: isub
/*     */     //   514: i2l
/*     */     //   515: ladd
/*     */     //   516: lstore #12
/*     */     //   518: lload #12
/*     */     //   520: lstore #4
/*     */     //   522: aload #11
/*     */     //   524: getfield b : Lme/konsolas/aac/eV;
/*     */     //   527: astore #11
/*     */     //   529: iload #10
/*     */     //   531: lload_1
/*     */     //   532: lconst_0
/*     */     //   533: lcmp
/*     */     //   534: ifle -> 385
/*     */     //   537: ifne -> 323
/*     */     //   540: lload_1
/*     */     //   541: lconst_0
/*     */     //   542: lcmp
/*     */     //   543: iflt -> 786
/*     */     //   546: iload #10
/*     */     //   548: ifne -> 786
/*     */     //   551: aload_3
/*     */     //   552: lload #8
/*     */     //   554: invokevirtual a : (J)[B
/*     */     //   557: astore #14
/*     */     //   559: lload #12
/*     */     //   561: aload_0
/*     */     //   562: getfield a : J
/*     */     //   565: lcmp
/*     */     //   566: ifge -> 786
/*     */     //   569: aload #11
/*     */     //   571: getfield h : [B
/*     */     //   574: astore #15
/*     */     //   576: aload #11
/*     */     //   578: getfield d : I
/*     */     //   581: lload_1
/*     */     //   582: lconst_0
/*     */     //   583: lcmp
/*     */     //   584: iflt -> 600
/*     */     //   587: i2l
/*     */     //   588: lload #4
/*     */     //   590: ladd
/*     */     //   591: lload #12
/*     */     //   593: lsub
/*     */     //   594: iload #10
/*     */     //   596: ifeq -> 789
/*     */     //   599: l2i
/*     */     //   600: istore #16
/*     */     //   602: aload #11
/*     */     //   604: getfield c : I
/*     */     //   607: istore #17
/*     */     //   609: iload #16
/*     */     //   611: iload #17
/*     */     //   613: if_icmpge -> 747
/*     */     //   616: aload #15
/*     */     //   618: iload #16
/*     */     //   620: baload
/*     */     //   621: istore #18
/*     */     //   623: aload #14
/*     */     //   625: astore #19
/*     */     //   627: aload #19
/*     */     //   629: arraylength
/*     */     //   630: istore #20
/*     */     //   632: iconst_0
/*     */     //   633: iload #10
/*     */     //   635: ifeq -> 566
/*     */     //   638: istore #21
/*     */     //   640: iload #21
/*     */     //   642: iload #20
/*     */     //   644: if_icmpge -> 733
/*     */     //   647: aload #19
/*     */     //   649: iload #21
/*     */     //   651: baload
/*     */     //   652: istore #22
/*     */     //   654: iload #10
/*     */     //   656: lload_1
/*     */     //   657: lconst_0
/*     */     //   658: lcmp
/*     */     //   659: ifle -> 730
/*     */     //   662: ifeq -> 728
/*     */     //   665: iload #18
/*     */     //   667: iload #22
/*     */     //   669: iload #10
/*     */     //   671: ifeq -> 613
/*     */     //   674: lload_1
/*     */     //   675: lconst_0
/*     */     //   676: lcmp
/*     */     //   677: iflt -> 635
/*     */     //   680: goto -> 693
/*     */     //   683: ldc2_w -1794174627953396113
/*     */     //   686: lload_1
/*     */     //   687: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   692: athrow
/*     */     //   693: lload_1
/*     */     //   694: lconst_0
/*     */     //   695: lcmp
/*     */     //   696: ifle -> 709
/*     */     //   699: if_icmpne -> 725
/*     */     //   702: iload #16
/*     */     //   704: aload #11
/*     */     //   706: getfield d : I
/*     */     //   709: isub
/*     */     //   710: i2l
/*     */     //   711: lload #12
/*     */     //   713: ladd
/*     */     //   714: lreturn
/*     */     //   715: ldc2_w -1794174627953396113
/*     */     //   718: lload_1
/*     */     //   719: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   724: athrow
/*     */     //   725: iinc #21, 1
/*     */     //   728: iload #10
/*     */     //   730: ifne -> 640
/*     */     //   733: iinc #16, 1
/*     */     //   736: iload #10
/*     */     //   738: lload_1
/*     */     //   739: lconst_0
/*     */     //   740: lcmp
/*     */     //   741: ifle -> 652
/*     */     //   744: ifne -> 609
/*     */     //   747: lload #12
/*     */     //   749: aload #11
/*     */     //   751: getfield c : I
/*     */     //   754: aload #11
/*     */     //   756: getfield d : I
/*     */     //   759: isub
/*     */     //   760: i2l
/*     */     //   761: ladd
/*     */     //   762: lstore #12
/*     */     //   764: lload #12
/*     */     //   766: lstore #4
/*     */     //   768: aload #11
/*     */     //   770: getfield b : Lme/konsolas/aac/eV;
/*     */     //   773: astore #11
/*     */     //   775: iload #10
/*     */     //   777: lload_1
/*     */     //   778: lconst_0
/*     */     //   779: lcmp
/*     */     //   780: ifle -> 621
/*     */     //   783: ifne -> 559
/*     */     //   786: ldc2_w -1
/*     */     //   789: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #214	-> 27
/*     */     //   #605	-> 65
/*     */     //   #27	-> 71
/*     */     //   #420	-> 82
/*     */     //   #25	-> 96
/*     */     //   #380	-> 133
/*     */     //   #658	-> 139
/*     */     //   #112	-> 147
/*     */     //   #11	-> 154
/*     */     //   #122	-> 206
/*     */     //   #314	-> 209
/*     */     //   #850	-> 233
/*     */     //   #251	-> 240
/*     */     //   #806	-> 279
/*     */     //   #559	-> 305
/*     */     //   #501	-> 314
/*     */     //   #584	-> 323
/*     */     //   #761	-> 333
/*     */     //   #793	-> 340
/*     */     //   #823	-> 380
/*     */     //   #769	-> 387
/*     */     //   #75	-> 467
/*     */     //   #360	-> 493
/*     */     //   #825	-> 501
/*     */     //   #884	-> 518
/*     */     //   #132	-> 522
/*     */     //   #780	-> 529
/*     */     //   #73	-> 540
/*     */     //   #105	-> 551
/*     */     //   #387	-> 559
/*     */     //   #517	-> 569
/*     */     //   #147	-> 576
/*     */     //   #549	-> 616
/*     */     //   #878	-> 623
/*     */     //   #791	-> 654
/*     */     //   #757	-> 725
/*     */     //   #447	-> 733
/*     */     //   #697	-> 747
/*     */     //   #148	-> 764
/*     */     //   #842	-> 768
/*     */     //   #753	-> 775
/*     */     //   #478	-> 786
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   27	55	55	java/lang/IllegalArgumentException
/*     */     //   71	86	86	java/lang/IllegalArgumentException
/*     */     //   96	120	123	java/lang/IllegalArgumentException
/*     */     //   171	187	196	java/lang/IllegalArgumentException
/*     */     //   244	260	269	java/lang/IllegalArgumentException
/*     */     //   279	292	295	java/lang/IllegalArgumentException
/*     */     //   396	410	413	java/lang/IllegalArgumentException
/*     */     //   407	438	441	java/lang/IllegalArgumentException
/*     */     //   423	454	457	java/lang/IllegalArgumentException
/*     */     //   451	474	477	java/lang/IllegalArgumentException
/*     */     //   654	674	683	java/lang/IllegalArgumentException
/*     */     //   693	715	715	java/lang/IllegalArgumentException
/*     */   }
/*     */   public String a(long paramLong1, long paramLong2, Charset paramCharset) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 89077252642029
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 4811144273472
/*     */     //   12: lxor
/*     */     //   13: lstore #8
/*     */     //   15: dup2
/*     */     //   16: ldc2_w 94739444101460
/*     */     //   19: lxor
/*     */     //   20: lstore #10
/*     */     //   22: dup2
/*     */     //   23: ldc2_w 46357492617141
/*     */     //   26: lxor
/*     */     //   27: lstore #12
/*     */     //   29: pop2
/*     */     //   30: ldc2_w 7821862425018055348
/*     */     //   33: lload_3
/*     */     //   34: <illegal opcode> w : (JJ)I
/*     */     //   39: istore #14
/*     */     //   41: aload_0
/*     */     //   42: getfield a : J
/*     */     //   45: lconst_0
/*     */     //   46: iload #14
/*     */     //   48: ifne -> 110
/*     */     //   51: lload_1
/*     */     //   52: lload #6
/*     */     //   54: invokestatic a : (JJJJ)V
/*     */     //   57: aload #5
/*     */     //   59: ifnonnull -> 106
/*     */     //   62: goto -> 75
/*     */     //   65: ldc2_w 7786064911459106171
/*     */     //   68: lload_3
/*     */     //   69: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   74: athrow
/*     */     //   75: new java/lang/IllegalArgumentException
/*     */     //   78: dup
/*     */     //   79: sipush #19582
/*     */     //   82: ldc2_w 7113442184390755952
/*     */     //   85: lload_3
/*     */     //   86: lxor
/*     */     //   87: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   92: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   95: athrow
/*     */     //   96: ldc2_w 7786064911459106171
/*     */     //   99: lload_3
/*     */     //   100: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   105: athrow
/*     */     //   106: lload_1
/*     */     //   107: ldc2_w 2147483647
/*     */     //   110: lcmp
/*     */     //   111: lload_3
/*     */     //   112: lconst_0
/*     */     //   113: lcmp
/*     */     //   114: ifle -> 189
/*     */     //   117: iload #14
/*     */     //   119: ifne -> 189
/*     */     //   122: ifle -> 186
/*     */     //   125: goto -> 138
/*     */     //   128: ldc2_w 7786064911459106171
/*     */     //   131: lload_3
/*     */     //   132: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   137: athrow
/*     */     //   138: new java/lang/IllegalArgumentException
/*     */     //   141: dup
/*     */     //   142: new java/lang/StringBuilder
/*     */     //   145: dup
/*     */     //   146: invokespecial <init> : ()V
/*     */     //   149: sipush #24569
/*     */     //   152: ldc2_w 8871998991611123181
/*     */     //   155: lload_3
/*     */     //   156: lxor
/*     */     //   157: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   165: lload_1
/*     */     //   166: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   169: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   172: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   175: athrow
/*     */     //   176: ldc2_w 7786064911459106171
/*     */     //   179: lload_3
/*     */     //   180: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   185: athrow
/*     */     //   186: lload_1
/*     */     //   187: lconst_0
/*     */     //   188: lcmp
/*     */     //   189: ifne -> 206
/*     */     //   192: ldc_w ''
/*     */     //   195: areturn
/*     */     //   196: ldc2_w 7786064911459106171
/*     */     //   199: lload_3
/*     */     //   200: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   205: athrow
/*     */     //   206: aload_0
/*     */     //   207: getfield b : Lme/konsolas/aac/eV;
/*     */     //   210: astore #15
/*     */     //   212: aload #15
/*     */     //   214: getfield d : I
/*     */     //   217: i2l
/*     */     //   218: lload_1
/*     */     //   219: ladd
/*     */     //   220: aload #15
/*     */     //   222: getfield c : I
/*     */     //   225: i2l
/*     */     //   226: lcmp
/*     */     //   227: ifle -> 257
/*     */     //   230: new java/lang/String
/*     */     //   233: dup
/*     */     //   234: aload_0
/*     */     //   235: lload_1
/*     */     //   236: lload #12
/*     */     //   238: invokevirtual a : (JJ)[B
/*     */     //   241: aload #5
/*     */     //   243: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */     //   246: areturn
/*     */     //   247: ldc2_w 7786064911459106171
/*     */     //   250: lload_3
/*     */     //   251: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   256: athrow
/*     */     //   257: new java/lang/String
/*     */     //   260: dup
/*     */     //   261: aload #15
/*     */     //   263: getfield h : [B
/*     */     //   266: aload #15
/*     */     //   268: getfield d : I
/*     */     //   271: lload_1
/*     */     //   272: l2i
/*     */     //   273: aload #5
/*     */     //   275: invokespecial <init> : ([BIILjava/nio/charset/Charset;)V
/*     */     //   278: astore #16
/*     */     //   280: aload #15
/*     */     //   282: dup
/*     */     //   283: getfield d : I
/*     */     //   286: i2l
/*     */     //   287: lload_1
/*     */     //   288: ladd
/*     */     //   289: lload_3
/*     */     //   290: lconst_0
/*     */     //   291: lcmp
/*     */     //   292: iflt -> 368
/*     */     //   295: l2i
/*     */     //   296: putfield d : I
/*     */     //   299: aload_0
/*     */     //   300: dup
/*     */     //   301: getfield a : J
/*     */     //   304: lload_1
/*     */     //   305: lsub
/*     */     //   306: putfield a : J
/*     */     //   309: aload #15
/*     */     //   311: iload #14
/*     */     //   313: ifne -> 366
/*     */     //   316: getfield d : I
/*     */     //   319: aload #15
/*     */     //   321: getfield c : I
/*     */     //   324: if_icmpne -> 371
/*     */     //   327: goto -> 340
/*     */     //   330: ldc2_w 7786064911459106171
/*     */     //   333: lload_3
/*     */     //   334: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   339: athrow
/*     */     //   340: aload_0
/*     */     //   341: aload #15
/*     */     //   343: lload #10
/*     */     //   345: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   348: putfield b : Lme/konsolas/aac/eV;
/*     */     //   351: aload #15
/*     */     //   353: goto -> 366
/*     */     //   356: ldc2_w 7786064911459106171
/*     */     //   359: lload_3
/*     */     //   360: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   365: athrow
/*     */     //   366: lload #8
/*     */     //   368: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   371: aload #16
/*     */     //   373: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #215	-> 41
/*     */     //   #368	-> 57
/*     */     //   #536	-> 106
/*     */     //   #488	-> 138
/*     */     //   #567	-> 186
/*     */     //   #931	-> 206
/*     */     //   #508	-> 212
/*     */     //   #408	-> 230
/*     */     //   #706	-> 257
/*     */     //   #358	-> 280
/*     */     //   #365	-> 299
/*     */     //   #185	-> 309
/*     */     //   #677	-> 340
/*     */     //   #469	-> 351
/*     */     //   #244	-> 371
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   41	62	65	java/io/EOFException
/*     */     //   51	96	96	java/io/EOFException
/*     */     //   110	125	128	java/io/EOFException
/*     */     //   122	176	176	java/io/EOFException
/*     */     //   189	196	196	java/io/EOFException
/*     */     //   212	247	247	java/io/EOFException
/*     */     //   280	327	330	java/io/EOFException
/*     */     //   316	353	356	java/io/EOFException
/*     */   }
/*     */   public void a(long paramLong1, fw paramfw, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 123041548298808
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: pop2
/*     */     //   9: ldc2_w 8066207938579741128
/*     */     //   12: lload_1
/*     */     //   13: <illegal opcode> w : (JJ)I
/*     */     //   18: istore #8
/*     */     //   20: aload_0
/*     */     //   21: iload #8
/*     */     //   23: ifne -> 78
/*     */     //   26: getfield a : J
/*     */     //   29: lload #4
/*     */     //   31: lcmp
/*     */     //   32: ifge -> 77
/*     */     //   35: goto -> 48
/*     */     //   38: ldc2_w 8030362080868646407
/*     */     //   41: lload_1
/*     */     //   42: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   47: athrow
/*     */     //   48: aload_3
/*     */     //   49: lload #6
/*     */     //   51: aload_0
/*     */     //   52: aload_0
/*     */     //   53: getfield a : J
/*     */     //   56: invokevirtual b : (JLme/konsolas/aac/fw;J)V
/*     */     //   59: new java/io/EOFException
/*     */     //   62: dup
/*     */     //   63: invokespecial <init> : ()V
/*     */     //   66: athrow
/*     */     //   67: ldc2_w 8030362080868646407
/*     */     //   70: lload_1
/*     */     //   71: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   76: athrow
/*     */     //   77: aload_3
/*     */     //   78: lload #6
/*     */     //   80: aload_0
/*     */     //   81: lload #4
/*     */     //   83: invokevirtual b : (JLme/konsolas/aac/fw;J)V
/*     */     //   86: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #216	-> 20
/*     */     //   #886	-> 48
/*     */     //   #844	-> 59
/*     */     //   #890	-> 77
/*     */     //   #145	-> 86
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	35	38	java/io/EOFException
/*     */     //   26	67	67	java/io/EOFException
/*     */   }
/*     */   public final gZ e(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 51006162093321
/*     */     //   11: lxor
/*     */     //   12: lstore_3
/*     */     //   13: pop2
/*     */     //   14: ldc2_w -867361572240906802
/*     */     //   17: lload_1
/*     */     //   18: <illegal opcode> w : (JJ)I
/*     */     //   23: istore #5
/*     */     //   25: aload_0
/*     */     //   26: iload #5
/*     */     //   28: ifne -> 106
/*     */     //   31: getfield a : J
/*     */     //   34: ldc2_w 2147483647
/*     */     //   37: lcmp
/*     */     //   38: ifle -> 105
/*     */     //   41: goto -> 54
/*     */     //   44: ldc2_w -902974366788378111
/*     */     //   47: lload_1
/*     */     //   48: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   53: athrow
/*     */     //   54: new java/lang/IllegalArgumentException
/*     */     //   57: dup
/*     */     //   58: new java/lang/StringBuilder
/*     */     //   61: dup
/*     */     //   62: invokespecial <init> : ()V
/*     */     //   65: sipush #6563
/*     */     //   68: ldc2_w 7574022250599615691
/*     */     //   71: lload_1
/*     */     //   72: lxor
/*     */     //   73: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   81: aload_0
/*     */     //   82: getfield a : J
/*     */     //   85: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   88: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   91: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   94: athrow
/*     */     //   95: ldc2_w -902974366788378111
/*     */     //   98: lload_1
/*     */     //   99: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   104: athrow
/*     */     //   105: aload_0
/*     */     //   106: aload_0
/*     */     //   107: getfield a : J
/*     */     //   110: l2i
/*     */     //   111: lload_3
/*     */     //   112: invokevirtual a : (IJ)Lme/konsolas/aac/gZ;
/*     */     //   115: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #220	-> 25
/*     */     //   #80	-> 54
/*     */     //   #657	-> 105
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   25	41	44	java/lang/IllegalArgumentException
/*     */     //   31	95	95	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public gi a(long paramLong, char paramChar) {
/* 225 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] a(long paramLong) {
/* 230 */     long l = paramLong ^ 0x93C5E4F4B1L; try { return a(this.a, l);
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
/*     */        }
/*     */     
/* 494 */     catch (EOFException eOFException)
/*     */     { throw new AssertionError(eOFException); }
/*     */   
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
/*     */   public long a(long paramLong, hp paramhp) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 96341163355347
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: pop2
/*     */     //   9: ldc2_w 2709196542542050208
/*     */     //   12: lload_1
/*     */     //   13: <illegal opcode> w : (JJ)I
/*     */     //   18: istore #6
/*     */     //   20: aload_3
/*     */     //   21: ifnonnull -> 55
/*     */     //   24: new java/lang/IllegalArgumentException
/*     */     //   27: dup
/*     */     //   28: sipush #28959
/*     */     //   31: ldc2_w 5611505737881137725
/*     */     //   34: lload_1
/*     */     //   35: lxor
/*     */     //   36: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   41: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   44: athrow
/*     */     //   45: ldc2_w 2673309969597953135
/*     */     //   48: lload_1
/*     */     //   49: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: lconst_0
/*     */     //   56: lstore #7
/*     */     //   58: aload_3
/*     */     //   59: lload #4
/*     */     //   61: aload_0
/*     */     //   62: ldc2_w 8192
/*     */     //   65: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   70: dup2
/*     */     //   71: lstore #9
/*     */     //   73: ldc2_w -1
/*     */     //   76: lcmp
/*     */     //   77: ifeq -> 97
/*     */     //   80: lload #7
/*     */     //   82: lload #9
/*     */     //   84: ladd
/*     */     //   85: iload #6
/*     */     //   87: ifne -> 105
/*     */     //   90: lstore #7
/*     */     //   92: iload #6
/*     */     //   94: ifeq -> 58
/*     */     //   97: lload_1
/*     */     //   98: lconst_0
/*     */     //   99: lcmp
/*     */     //   100: iflt -> 92
/*     */     //   103: lload #7
/*     */     //   105: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #242	-> 20
/*     */     //   #562	-> 55
/*     */     //   #839	-> 58
/*     */     //   #705	-> 80
/*     */     //   #751	-> 97
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	45	45	java/io/IOException
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
/*     */   public String toString() {
/*     */     long l1 = f ^ 0x12BE5C3EE2FL, l2 = l1 ^ 0x20DCA10D1C5AL;
/*     */     return e(l2).toString();
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
/*     */   public final fw a(fw paramfw, long paramLong1, long paramLong2, short paramShort, long paramLong3) {
/*     */     // Byte code:
/*     */     //   0: lload #4
/*     */     //   2: bipush #16
/*     */     //   4: lshl
/*     */     //   5: iload #6
/*     */     //   7: i2l
/*     */     //   8: bipush #48
/*     */     //   10: lshl
/*     */     //   11: bipush #48
/*     */     //   13: lushr
/*     */     //   14: lor
/*     */     //   15: getstatic me/konsolas/aac/fw.f : J
/*     */     //   18: lxor
/*     */     //   19: lstore #9
/*     */     //   21: lload #9
/*     */     //   23: dup2
/*     */     //   24: ldc2_w 83322847249971
/*     */     //   27: lxor
/*     */     //   28: lstore #11
/*     */     //   30: pop2
/*     */     //   31: ldc2_w 9102562806105581674
/*     */     //   34: lload #9
/*     */     //   36: <illegal opcode> w : (JJ)I
/*     */     //   41: istore #13
/*     */     //   43: aload_1
/*     */     //   44: iload #13
/*     */     //   46: ifne -> 100
/*     */     //   49: ifnonnull -> 99
/*     */     //   52: goto -> 66
/*     */     //   55: ldc2_w 9138843795542060965
/*     */     //   58: lload #9
/*     */     //   60: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   65: athrow
/*     */     //   66: new java/lang/IllegalArgumentException
/*     */     //   69: dup
/*     */     //   70: sipush #6374
/*     */     //   73: ldc2_w 646657633896955911
/*     */     //   76: lload #9
/*     */     //   78: lxor
/*     */     //   79: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   84: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   87: athrow
/*     */     //   88: ldc2_w 9138843795542060965
/*     */     //   91: lload #9
/*     */     //   93: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   98: athrow
/*     */     //   99: aload_0
/*     */     //   100: iload #6
/*     */     //   102: iflt -> 167
/*     */     //   105: getfield a : J
/*     */     //   108: lload_2
/*     */     //   109: lload #7
/*     */     //   111: lload #11
/*     */     //   113: invokestatic a : (JJJJ)V
/*     */     //   116: iload #13
/*     */     //   118: ifne -> 166
/*     */     //   121: lload #7
/*     */     //   123: lconst_0
/*     */     //   124: lcmp
/*     */     //   125: ifne -> 155
/*     */     //   128: goto -> 142
/*     */     //   131: ldc2_w 9138843795542060965
/*     */     //   134: lload #9
/*     */     //   136: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   141: athrow
/*     */     //   142: aload_0
/*     */     //   143: areturn
/*     */     //   144: ldc2_w 9138843795542060965
/*     */     //   147: lload #9
/*     */     //   149: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   154: athrow
/*     */     //   155: aload_1
/*     */     //   156: dup
/*     */     //   157: getfield a : J
/*     */     //   160: lload #7
/*     */     //   162: ladd
/*     */     //   163: putfield a : J
/*     */     //   166: aload_0
/*     */     //   167: getfield b : Lme/konsolas/aac/eV;
/*     */     //   170: astore #14
/*     */     //   172: lload_2
/*     */     //   173: aload #14
/*     */     //   175: getfield c : I
/*     */     //   178: aload #14
/*     */     //   180: getfield d : I
/*     */     //   183: isub
/*     */     //   184: i2l
/*     */     //   185: lcmp
/*     */     //   186: iflt -> 247
/*     */     //   189: lload_2
/*     */     //   190: aload #14
/*     */     //   192: getfield c : I
/*     */     //   195: aload #14
/*     */     //   197: getfield d : I
/*     */     //   200: isub
/*     */     //   201: i2l
/*     */     //   202: lsub
/*     */     //   203: lstore_2
/*     */     //   204: aload #14
/*     */     //   206: getfield b : Lme/konsolas/aac/eV;
/*     */     //   209: astore #14
/*     */     //   211: iload #13
/*     */     //   213: iload #6
/*     */     //   215: ifle -> 223
/*     */     //   218: ifne -> 455
/*     */     //   221: iload #13
/*     */     //   223: ifeq -> 172
/*     */     //   226: lload #4
/*     */     //   228: lconst_0
/*     */     //   229: lcmp
/*     */     //   230: iflt -> 211
/*     */     //   233: goto -> 247
/*     */     //   236: ldc2_w 9138843795542060965
/*     */     //   239: lload #9
/*     */     //   241: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   246: athrow
/*     */     //   247: lload #7
/*     */     //   249: lconst_0
/*     */     //   250: lcmp
/*     */     //   251: ifle -> 455
/*     */     //   254: aload #14
/*     */     //   256: invokevirtual a : ()Lme/konsolas/aac/eV;
/*     */     //   259: astore #15
/*     */     //   261: aload #15
/*     */     //   263: dup
/*     */     //   264: getfield d : I
/*     */     //   267: i2l
/*     */     //   268: lload_2
/*     */     //   269: ladd
/*     */     //   270: l2i
/*     */     //   271: putfield d : I
/*     */     //   274: aload #15
/*     */     //   276: aload #15
/*     */     //   278: getfield d : I
/*     */     //   281: lload #7
/*     */     //   283: l2i
/*     */     //   284: iadd
/*     */     //   285: aload #15
/*     */     //   287: getfield c : I
/*     */     //   290: invokestatic min : (II)I
/*     */     //   293: iload #6
/*     */     //   295: ifle -> 312
/*     */     //   298: putfield c : I
/*     */     //   301: aload_1
/*     */     //   302: iload #13
/*     */     //   304: ifne -> 456
/*     */     //   307: getfield b : Lme/konsolas/aac/eV;
/*     */     //   310: iload #13
/*     */     //   312: ifne -> 423
/*     */     //   315: goto -> 329
/*     */     //   318: ldc2_w 9138843795542060965
/*     */     //   321: lload #9
/*     */     //   323: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   328: athrow
/*     */     //   329: lload #4
/*     */     //   331: lconst_0
/*     */     //   332: lcmp
/*     */     //   333: ifle -> 409
/*     */     //   336: ifnonnull -> 397
/*     */     //   339: goto -> 353
/*     */     //   342: ldc2_w 9138843795542060965
/*     */     //   345: lload #9
/*     */     //   347: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   352: athrow
/*     */     //   353: aload_1
/*     */     //   354: aload #15
/*     */     //   356: aload #15
/*     */     //   358: aload #15
/*     */     //   360: dup_x1
/*     */     //   361: putfield e : Lme/konsolas/aac/eV;
/*     */     //   364: dup_x1
/*     */     //   365: putfield b : Lme/konsolas/aac/eV;
/*     */     //   368: putfield b : Lme/konsolas/aac/eV;
/*     */     //   371: iload #13
/*     */     //   373: lload #4
/*     */     //   375: lconst_0
/*     */     //   376: lcmp
/*     */     //   377: iflt -> 452
/*     */     //   380: ifeq -> 424
/*     */     //   383: goto -> 397
/*     */     //   386: ldc2_w 9138843795542060965
/*     */     //   389: lload #9
/*     */     //   391: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   396: athrow
/*     */     //   397: aload_1
/*     */     //   398: getfield b : Lme/konsolas/aac/eV;
/*     */     //   401: getfield e : Lme/konsolas/aac/eV;
/*     */     //   404: aload #15
/*     */     //   406: invokevirtual a : (Lme/konsolas/aac/eV;)Lme/konsolas/aac/eV;
/*     */     //   409: goto -> 423
/*     */     //   412: ldc2_w 9138843795542060965
/*     */     //   415: lload #9
/*     */     //   417: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   422: athrow
/*     */     //   423: pop
/*     */     //   424: lload #7
/*     */     //   426: aload #15
/*     */     //   428: getfield c : I
/*     */     //   431: aload #15
/*     */     //   433: getfield d : I
/*     */     //   436: isub
/*     */     //   437: i2l
/*     */     //   438: lsub
/*     */     //   439: lstore #7
/*     */     //   441: lconst_0
/*     */     //   442: lstore_2
/*     */     //   443: aload #14
/*     */     //   445: getfield b : Lme/konsolas/aac/eV;
/*     */     //   448: astore #14
/*     */     //   450: iload #13
/*     */     //   452: ifeq -> 247
/*     */     //   455: aload_0
/*     */     //   456: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #270	-> 43
/*     */     //   #60	-> 99
/*     */     //   #661	-> 116
/*     */     //   #226	-> 155
/*     */     //   #695	-> 166
/*     */     //   #800	-> 172
/*     */     //   #40	-> 189
/*     */     //   #622	-> 204
/*     */     //   #17	-> 247
/*     */     //   #121	-> 254
/*     */     //   #838	-> 261
/*     */     //   #529	-> 274
/*     */     //   #563	-> 301
/*     */     //   #383	-> 353
/*     */     //   #94	-> 397
/*     */     //   #895	-> 424
/*     */     //   #173	-> 441
/*     */     //   #727	-> 443
/*     */     //   #120	-> 455
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   43	52	55	java/lang/IllegalArgumentException
/*     */     //   49	88	88	java/lang/IllegalArgumentException
/*     */     //   100	128	131	java/lang/IllegalArgumentException
/*     */     //   121	144	144	java/lang/IllegalArgumentException
/*     */     //   211	226	236	java/lang/IllegalArgumentException
/*     */     //   261	315	318	java/lang/IllegalArgumentException
/*     */     //   307	339	342	java/lang/IllegalArgumentException
/*     */     //   329	383	386	java/lang/IllegalArgumentException
/*     */     //   353	409	412	java/lang/IllegalArgumentException
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
/*     */   public String a(Charset paramCharset, long paramLong) {
/*     */     long l = paramLong ^ 0x71820E48EBD9L;
/*     */     try {
/*     */       return a(this.a, l, paramCharset);
/* 573 */     } catch (EOFException eOFException) {
/*     */       throw new AssertionError(eOFException);
/*     */     } 
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
/*     */   public gi a(gZ paramgZ, long paramLong) {
/*     */     int i = (int)((paramLong ^ 0x22F89D7AAFCBL) >>> 32L);
/*     */     long l = (paramLong ^ 0x22F89D7AAFCBL) << 32L >>> 32L;
/*     */     paramLong ^ 0x22F89D7AAFCBL;
/*     */     return a(paramgZ, i, l);
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
/*     */   public final gZ d(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 37741267562646
/*     */     //   11: lxor
/*     */     //   12: lstore_3
/*     */     //   13: pop2
/*     */     //   14: aload_0
/*     */     //   15: sipush #20434
/*     */     //   18: ldc2_w 4414576267695884652
/*     */     //   21: lload_1
/*     */     //   22: lxor
/*     */     //   23: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   28: lload_3
/*     */     //   29: invokespecial a : (Ljava/lang/String;J)Lme/konsolas/aac/gZ;
/*     */     //   32: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #325	-> 14
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
/*     */   public long a(int paramInt1, short paramShort, gp paramgp, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #4
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: lstore #5
/*     */     //   26: lload #5
/*     */     //   28: dup2
/*     */     //   29: ldc2_w 9254943869291
/*     */     //   32: lxor
/*     */     //   33: lstore #7
/*     */     //   35: pop2
/*     */     //   36: ldc2_w 5485947385730004074
/*     */     //   39: lload #5
/*     */     //   41: <illegal opcode> w : (JJ)I
/*     */     //   46: aload_0
/*     */     //   47: getfield a : J
/*     */     //   50: lstore #10
/*     */     //   52: istore #9
/*     */     //   54: lload #10
/*     */     //   56: iload #9
/*     */     //   58: ifeq -> 107
/*     */     //   61: lconst_0
/*     */     //   62: lcmp
/*     */     //   63: ifle -> 105
/*     */     //   66: goto -> 80
/*     */     //   69: ldc2_w 5486215890688154964
/*     */     //   72: lload #5
/*     */     //   74: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   79: athrow
/*     */     //   80: aload_3
/*     */     //   81: lload #7
/*     */     //   83: aload_0
/*     */     //   84: lload #10
/*     */     //   86: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*     */     //   91: goto -> 105
/*     */     //   94: ldc2_w 5486215890688154964
/*     */     //   97: lload #5
/*     */     //   99: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   104: athrow
/*     */     //   105: lload #10
/*     */     //   107: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #337	-> 46
/*     */     //   #513	-> 54
/*     */     //   #318	-> 80
/*     */     //   #103	-> 105
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   54	66	69	java/io/IOException
/*     */     //   61	91	94	java/io/IOException
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
/*     */   public int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, int paramInt4) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload #5
/*     */     //   7: i2l
/*     */     //   8: bipush #32
/*     */     //   10: lshl
/*     */     //   11: bipush #32
/*     */     //   13: lushr
/*     */     //   14: lor
/*     */     //   15: lstore #6
/*     */     //   17: lload #6
/*     */     //   19: dup2
/*     */     //   20: ldc2_w 102977648657808
/*     */     //   23: lxor
/*     */     //   24: lstore #8
/*     */     //   26: dup2
/*     */     //   27: ldc2_w 9670632722237
/*     */     //   30: lxor
/*     */     //   31: lstore #10
/*     */     //   33: dup2
/*     */     //   34: ldc2_w 99512492367913
/*     */     //   37: lxor
/*     */     //   38: lstore #12
/*     */     //   40: pop2
/*     */     //   41: ldc2_w 4463589246636551113
/*     */     //   44: lload #6
/*     */     //   46: <illegal opcode> w : (JJ)I
/*     */     //   51: aload_2
/*     */     //   52: arraylength
/*     */     //   53: i2l
/*     */     //   54: iload_3
/*     */     //   55: i2l
/*     */     //   56: iload #4
/*     */     //   58: i2l
/*     */     //   59: lload #8
/*     */     //   61: invokestatic a : (JJJJ)V
/*     */     //   64: istore #14
/*     */     //   66: aload_0
/*     */     //   67: getfield b : Lme/konsolas/aac/eV;
/*     */     //   70: astore #15
/*     */     //   72: aload #15
/*     */     //   74: ifnonnull -> 90
/*     */     //   77: iconst_m1
/*     */     //   78: ireturn
/*     */     //   79: ldc2_w 4427219180651834374
/*     */     //   82: lload #6
/*     */     //   84: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   89: athrow
/*     */     //   90: iload #4
/*     */     //   92: aload #15
/*     */     //   94: getfield c : I
/*     */     //   97: aload #15
/*     */     //   99: getfield d : I
/*     */     //   102: isub
/*     */     //   103: invokestatic min : (II)I
/*     */     //   106: istore #16
/*     */     //   108: aload #15
/*     */     //   110: getfield h : [B
/*     */     //   113: aload #15
/*     */     //   115: getfield d : I
/*     */     //   118: aload_2
/*     */     //   119: iload_3
/*     */     //   120: iload #16
/*     */     //   122: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   125: aload #15
/*     */     //   127: dup
/*     */     //   128: getfield d : I
/*     */     //   131: iload #16
/*     */     //   133: iadd
/*     */     //   134: putfield d : I
/*     */     //   137: aload_0
/*     */     //   138: dup
/*     */     //   139: getfield a : J
/*     */     //   142: iload #16
/*     */     //   144: i2l
/*     */     //   145: lsub
/*     */     //   146: putfield a : J
/*     */     //   149: aload #15
/*     */     //   151: getfield d : I
/*     */     //   154: iload #14
/*     */     //   156: iload #5
/*     */     //   158: ifge -> 169
/*     */     //   161: ifne -> 220
/*     */     //   164: aload #15
/*     */     //   166: getfield c : I
/*     */     //   169: if_icmpne -> 218
/*     */     //   172: goto -> 186
/*     */     //   175: ldc2_w 4427219180651834374
/*     */     //   178: lload #6
/*     */     //   180: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   185: athrow
/*     */     //   186: aload_0
/*     */     //   187: aload #15
/*     */     //   189: lload #12
/*     */     //   191: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   194: putfield b : Lme/konsolas/aac/eV;
/*     */     //   197: aload #15
/*     */     //   199: lload #10
/*     */     //   201: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   204: goto -> 218
/*     */     //   207: ldc2_w 4427219180651834374
/*     */     //   210: lload #6
/*     */     //   212: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   217: athrow
/*     */     //   218: iload #16
/*     */     //   220: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #357	-> 51
/*     */     //   #2	-> 66
/*     */     //   #375	-> 72
/*     */     //   #802	-> 90
/*     */     //   #194	-> 108
/*     */     //   #862	-> 125
/*     */     //   #55	-> 137
/*     */     //   #301	-> 149
/*     */     //   #906	-> 186
/*     */     //   #29	-> 197
/*     */     //   #921	-> 218
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   72	79	79	java/lang/IllegalArgumentException
/*     */     //   108	172	175	java/lang/IllegalArgumentException
/*     */     //   164	204	207	java/lang/IllegalArgumentException
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
/*     */   public boolean a(long paramLong, short paramShort, int paramInt1, gZ paramgZ, int paramInt2, int paramInt3, int paramInt4) {
/*     */     // Byte code:
/*     */     //   0: iload_3
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload #4
/*     */     //   7: i2l
/*     */     //   8: bipush #32
/*     */     //   10: lshl
/*     */     //   11: bipush #16
/*     */     //   13: lushr
/*     */     //   14: lor
/*     */     //   15: iload #8
/*     */     //   17: i2l
/*     */     //   18: bipush #48
/*     */     //   20: lshl
/*     */     //   21: bipush #48
/*     */     //   23: lushr
/*     */     //   24: lor
/*     */     //   25: lstore #9
/*     */     //   27: lload #9
/*     */     //   29: dup2
/*     */     //   30: ldc2_w 102621870207548
/*     */     //   33: lxor
/*     */     //   34: lstore #11
/*     */     //   36: dup2
/*     */     //   37: ldc2_w 37051743702513
/*     */     //   40: lxor
/*     */     //   41: lstore #13
/*     */     //   43: pop2
/*     */     //   44: ldc2_w 8233613560237794427
/*     */     //   47: lload #9
/*     */     //   49: <illegal opcode> w : (JJ)I
/*     */     //   54: istore #15
/*     */     //   56: lload_1
/*     */     //   57: lconst_0
/*     */     //   58: lcmp
/*     */     //   59: iload #15
/*     */     //   61: ifne -> 278
/*     */     //   64: iflt -> 263
/*     */     //   67: goto -> 81
/*     */     //   70: ldc2_w 8269406400872588212
/*     */     //   73: lload #9
/*     */     //   75: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   80: athrow
/*     */     //   81: iload #6
/*     */     //   83: iload #15
/*     */     //   85: ifne -> 278
/*     */     //   88: goto -> 102
/*     */     //   91: ldc2_w 8269406400872588212
/*     */     //   94: lload #9
/*     */     //   96: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   101: athrow
/*     */     //   102: iload #8
/*     */     //   104: ifle -> 264
/*     */     //   107: iflt -> 263
/*     */     //   110: goto -> 124
/*     */     //   113: ldc2_w 8269406400872588212
/*     */     //   116: lload #9
/*     */     //   118: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   123: athrow
/*     */     //   124: iload #7
/*     */     //   126: iload #15
/*     */     //   128: ifne -> 278
/*     */     //   131: goto -> 145
/*     */     //   134: ldc2_w 8269406400872588212
/*     */     //   137: lload #9
/*     */     //   139: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   144: athrow
/*     */     //   145: iload #4
/*     */     //   147: ifle -> 264
/*     */     //   150: iflt -> 263
/*     */     //   153: goto -> 167
/*     */     //   156: ldc2_w 8269406400872588212
/*     */     //   159: lload #9
/*     */     //   161: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   166: athrow
/*     */     //   167: aload_0
/*     */     //   168: getfield a : J
/*     */     //   171: lload_1
/*     */     //   172: lsub
/*     */     //   173: iload #7
/*     */     //   175: i2l
/*     */     //   176: lcmp
/*     */     //   177: iload #15
/*     */     //   179: ifne -> 278
/*     */     //   182: goto -> 196
/*     */     //   185: ldc2_w 8269406400872588212
/*     */     //   188: lload #9
/*     */     //   190: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   195: athrow
/*     */     //   196: iload_3
/*     */     //   197: iflt -> 264
/*     */     //   200: iflt -> 263
/*     */     //   203: goto -> 217
/*     */     //   206: ldc2_w 8269406400872588212
/*     */     //   209: lload #9
/*     */     //   211: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   216: athrow
/*     */     //   217: aload #5
/*     */     //   219: invokevirtual a : ()I
/*     */     //   222: iload #6
/*     */     //   224: isub
/*     */     //   225: iload #15
/*     */     //   227: ifne -> 280
/*     */     //   230: goto -> 244
/*     */     //   233: ldc2_w 8269406400872588212
/*     */     //   236: lload #9
/*     */     //   238: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   243: athrow
/*     */     //   244: iload #7
/*     */     //   246: if_icmpge -> 279
/*     */     //   249: goto -> 263
/*     */     //   252: ldc2_w 8269406400872588212
/*     */     //   255: lload #9
/*     */     //   257: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   262: athrow
/*     */     //   263: iconst_0
/*     */     //   264: goto -> 278
/*     */     //   267: ldc2_w 8269406400872588212
/*     */     //   270: lload #9
/*     */     //   272: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   277: athrow
/*     */     //   278: ireturn
/*     */     //   279: iconst_0
/*     */     //   280: istore #16
/*     */     //   282: iload #16
/*     */     //   284: iload #7
/*     */     //   286: if_icmpge -> 387
/*     */     //   289: aload_0
/*     */     //   290: lload_1
/*     */     //   291: iload #16
/*     */     //   293: i2l
/*     */     //   294: ladd
/*     */     //   295: lload #13
/*     */     //   297: invokevirtual a : (JJ)B
/*     */     //   300: iload #15
/*     */     //   302: iload #4
/*     */     //   304: ifle -> 312
/*     */     //   307: ifne -> 393
/*     */     //   310: iload #15
/*     */     //   312: ifne -> 378
/*     */     //   315: goto -> 329
/*     */     //   318: ldc2_w 8269406400872588212
/*     */     //   321: lload #9
/*     */     //   323: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   328: athrow
/*     */     //   329: iload #8
/*     */     //   331: iflt -> 384
/*     */     //   334: aload #5
/*     */     //   336: iload #6
/*     */     //   338: iload #16
/*     */     //   340: iadd
/*     */     //   341: lload #11
/*     */     //   343: invokevirtual a : (IJ)B
/*     */     //   346: if_icmpeq -> 379
/*     */     //   349: goto -> 363
/*     */     //   352: ldc2_w 8269406400872588212
/*     */     //   355: lload #9
/*     */     //   357: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   362: athrow
/*     */     //   363: iconst_0
/*     */     //   364: goto -> 378
/*     */     //   367: ldc2_w 8269406400872588212
/*     */     //   370: lload #9
/*     */     //   372: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   377: athrow
/*     */     //   378: ireturn
/*     */     //   379: iinc #16, 1
/*     */     //   382: iload #15
/*     */     //   384: ifeq -> 282
/*     */     //   387: iload #4
/*     */     //   389: ifle -> 289
/*     */     //   392: iconst_1
/*     */     //   393: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #367	-> 56
/*     */     //   #180	-> 219
/*     */     //   #171	-> 263
/*     */     //   #813	-> 279
/*     */     //   #224	-> 289
/*     */     //   #87	-> 363
/*     */     //   #129	-> 379
/*     */     //   #184	-> 387
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   56	67	70	java/lang/IllegalArgumentException
/*     */     //   64	88	91	java/lang/IllegalArgumentException
/*     */     //   81	110	113	java/lang/IllegalArgumentException
/*     */     //   102	131	134	java/lang/IllegalArgumentException
/*     */     //   124	153	156	java/lang/IllegalArgumentException
/*     */     //   145	182	185	java/lang/IllegalArgumentException
/*     */     //   167	203	206	java/lang/IllegalArgumentException
/*     */     //   196	230	233	java/lang/IllegalArgumentException
/*     */     //   217	249	252	java/lang/IllegalArgumentException
/*     */     //   244	264	267	java/lang/IllegalArgumentException
/*     */     //   289	315	318	java/lang/IllegalArgumentException
/*     */     //   310	349	352	java/lang/IllegalArgumentException
/*     */     //   329	364	367	java/lang/IllegalArgumentException
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
/*     */   public gi a(byte[] paramArrayOfbyte, long paramLong, int paramInt1, int paramInt2) {
/*     */     long l = paramLong ^ 0x1DB4669A4BCBL;
/*     */     return a(paramArrayOfbyte, l, paramInt1, paramInt2);
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
/*     */   public fw f(int paramInt, long paramLong) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x2CC70B1DFFB6L;
/*     */     return e(l, cc.a((short)paramInt));
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
/*     */   public int c(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 83445024800302
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 55449635636705
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 28237789745466
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: aload_0
/*     */     //   23: getfield a : J
/*     */     //   26: ldc2_w 4
/*     */     //   29: lcmp
/*     */     //   30: ifge -> 84
/*     */     //   33: new java/lang/IllegalStateException
/*     */     //   36: dup
/*     */     //   37: new java/lang/StringBuilder
/*     */     //   40: dup
/*     */     //   41: invokespecial <init> : ()V
/*     */     //   44: sipush #2345
/*     */     //   47: ldc2_w 5792189108935238491
/*     */     //   50: lload_1
/*     */     //   51: lxor
/*     */     //   52: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   60: aload_0
/*     */     //   61: getfield a : J
/*     */     //   64: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   67: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   70: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   73: athrow
/*     */     //   74: ldc2_w 5504497485263084821
/*     */     //   77: lload_1
/*     */     //   78: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   83: athrow
/*     */     //   84: aload_0
/*     */     //   85: getfield b : Lme/konsolas/aac/eV;
/*     */     //   88: astore #9
/*     */     //   90: aload #9
/*     */     //   92: getfield d : I
/*     */     //   95: istore #10
/*     */     //   97: aload #9
/*     */     //   99: getfield c : I
/*     */     //   102: istore #11
/*     */     //   104: iload #11
/*     */     //   106: iload #10
/*     */     //   108: isub
/*     */     //   109: iconst_4
/*     */     //   110: lload_1
/*     */     //   111: lconst_0
/*     */     //   112: lcmp
/*     */     //   113: ifle -> 170
/*     */     //   116: if_icmpge -> 182
/*     */     //   119: aload_0
/*     */     //   120: lload #5
/*     */     //   122: invokevirtual a : (J)B
/*     */     //   125: sipush #255
/*     */     //   128: iand
/*     */     //   129: bipush #24
/*     */     //   131: ishl
/*     */     //   132: aload_0
/*     */     //   133: lload #5
/*     */     //   135: invokevirtual a : (J)B
/*     */     //   138: sipush #255
/*     */     //   141: iand
/*     */     //   142: bipush #16
/*     */     //   144: ishl
/*     */     //   145: ior
/*     */     //   146: aload_0
/*     */     //   147: lload #5
/*     */     //   149: invokevirtual a : (J)B
/*     */     //   152: sipush #255
/*     */     //   155: iand
/*     */     //   156: bipush #8
/*     */     //   158: ishl
/*     */     //   159: ior
/*     */     //   160: aload_0
/*     */     //   161: lload #5
/*     */     //   163: invokevirtual a : (J)B
/*     */     //   166: sipush #255
/*     */     //   169: iand
/*     */     //   170: ior
/*     */     //   171: ireturn
/*     */     //   172: ldc2_w 5504497485263084821
/*     */     //   175: lload_1
/*     */     //   176: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   181: athrow
/*     */     //   182: aload #9
/*     */     //   184: getfield h : [B
/*     */     //   187: astore #12
/*     */     //   189: aload #12
/*     */     //   191: iload #10
/*     */     //   193: iinc #10, 1
/*     */     //   196: baload
/*     */     //   197: sipush #255
/*     */     //   200: iand
/*     */     //   201: bipush #24
/*     */     //   203: ishl
/*     */     //   204: aload #12
/*     */     //   206: iload #10
/*     */     //   208: iinc #10, 1
/*     */     //   211: baload
/*     */     //   212: sipush #255
/*     */     //   215: iand
/*     */     //   216: bipush #16
/*     */     //   218: ishl
/*     */     //   219: ior
/*     */     //   220: aload #12
/*     */     //   222: iload #10
/*     */     //   224: iinc #10, 1
/*     */     //   227: baload
/*     */     //   228: sipush #255
/*     */     //   231: iand
/*     */     //   232: bipush #8
/*     */     //   234: ishl
/*     */     //   235: ior
/*     */     //   236: aload #12
/*     */     //   238: iload #10
/*     */     //   240: iinc #10, 1
/*     */     //   243: baload
/*     */     //   244: sipush #255
/*     */     //   247: iand
/*     */     //   248: ior
/*     */     //   249: istore #13
/*     */     //   251: aload_0
/*     */     //   252: dup
/*     */     //   253: getfield a : J
/*     */     //   256: ldc2_w 4
/*     */     //   259: lsub
/*     */     //   260: putfield a : J
/*     */     //   263: lload_1
/*     */     //   264: lconst_0
/*     */     //   265: lcmp
/*     */     //   266: ifle -> 293
/*     */     //   269: iload #10
/*     */     //   271: iload #11
/*     */     //   273: if_icmpne -> 306
/*     */     //   276: aload_0
/*     */     //   277: aload #9
/*     */     //   279: lload #7
/*     */     //   281: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   284: putfield b : Lme/konsolas/aac/eV;
/*     */     //   287: aload #9
/*     */     //   289: lload_3
/*     */     //   290: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   293: goto -> 313
/*     */     //   296: ldc2_w 5504497485263084821
/*     */     //   299: lload_1
/*     */     //   300: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   305: athrow
/*     */     //   306: aload #9
/*     */     //   308: iload #10
/*     */     //   310: putfield d : I
/*     */     //   313: iload #13
/*     */     //   315: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #398	-> 22
/*     */     //   #351	-> 84
/*     */     //   #235	-> 90
/*     */     //   #282	-> 97
/*     */     //   #190	-> 104
/*     */     //   #158	-> 119
/*     */     //   #156	-> 133
/*     */     //   #406	-> 147
/*     */     //   #259	-> 161
/*     */     //   #174	-> 171
/*     */     //   #555	-> 182
/*     */     //   #266	-> 189
/*     */     //   #280	-> 251
/*     */     //   #887	-> 263
/*     */     //   #735	-> 276
/*     */     //   #506	-> 287
/*     */     //   #528	-> 306
/*     */     //   #891	-> 313
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   22	74	74	java/lang/IllegalArgumentException
/*     */     //   104	172	172	java/lang/IllegalArgumentException
/*     */     //   251	296	296	java/lang/IllegalArgumentException
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
/*     */   public final gZ c(gZ paramgZ, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 94929890078147
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: aload_0
/*     */     //   16: sipush #28292
/*     */     //   19: ldc2_w 5001262061756676185
/*     */     //   22: lload_2
/*     */     //   23: lxor
/*     */     //   24: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   29: lload #4
/*     */     //   31: aload_1
/*     */     //   32: invokespecial a : (Ljava/lang/String;JLme/konsolas/aac/gZ;)Lme/konsolas/aac/gZ;
/*     */     //   35: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #409	-> 15
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
/*     */   public OutputStream a() {
/*     */     return new eg(this);
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
/*     */   public fw a(int paramInt, long paramLong) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x422134C3D15BL;
/*     */     eV eV1 = a(l, 1);
/*     */     eV1.h[eV1.c++] = (byte)paramInt;
/* 777 */     this.a++;
/*     */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] a(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 135422934063960
/*     */     //   5: lxor
/*     */     //   6: lstore #5
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 109293727074338
/*     */     //   12: lxor
/*     */     //   13: lstore #7
/*     */     //   15: pop2
/*     */     //   16: ldc2_w 2538337249235072257
/*     */     //   19: lload_3
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: aload_0
/*     */     //   26: getfield a : J
/*     */     //   29: lconst_0
/*     */     //   30: lload_1
/*     */     //   31: lload #5
/*     */     //   33: invokestatic a : (JJJJ)V
/*     */     //   36: istore #9
/*     */     //   38: lload_1
/*     */     //   39: ldc2_w 2147483647
/*     */     //   42: lcmp
/*     */     //   43: iload #9
/*     */     //   45: ifne -> 114
/*     */     //   48: ifle -> 112
/*     */     //   51: goto -> 64
/*     */     //   54: ldc2_w 2573951092811789006
/*     */     //   57: lload_3
/*     */     //   58: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   63: athrow
/*     */     //   64: new java/lang/IllegalArgumentException
/*     */     //   67: dup
/*     */     //   68: new java/lang/StringBuilder
/*     */     //   71: dup
/*     */     //   72: invokespecial <init> : ()V
/*     */     //   75: sipush #4920
/*     */     //   78: ldc2_w 4402729888505124536
/*     */     //   81: lload_3
/*     */     //   82: lxor
/*     */     //   83: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   88: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   91: lload_1
/*     */     //   92: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   95: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   98: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   101: athrow
/*     */     //   102: ldc2_w 2573951092811789006
/*     */     //   105: lload_3
/*     */     //   106: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   111: athrow
/*     */     //   112: lload_1
/*     */     //   113: l2i
/*     */     //   114: newarray byte
/*     */     //   116: astore #10
/*     */     //   118: aload_0
/*     */     //   119: lload #7
/*     */     //   121: aload #10
/*     */     //   123: invokevirtual a : (J[B)V
/*     */     //   126: aload #10
/*     */     //   128: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #419	-> 25
/*     */     //   #363	-> 38
/*     */     //   #591	-> 64
/*     */     //   #598	-> 112
/*     */     //   #889	-> 118
/*     */     //   #111	-> 126
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   38	51	54	java/io/EOFException
/*     */     //   48	102	102	java/io/EOFException
/*     */   }
/*     */ 
/*     */   
/*     */   public fw a(int paramInt, String paramString, short paramShort, char paramChar, Charset paramCharset) {
/*     */     long l = (paramInt << 32L | paramShort << 48L >>> 32L | paramChar << 48L >>> 48L) ^ f;
/*     */     int i = (int)((l ^ 0x5F7F31CEE4BAL) >>> 32L), j = (int)((l ^ 0x5F7F31CEE4BAL) << 32L >>> 48L), k = (int)((l ^ 0x5F7F31CEE4BAL) << 48L >>> 48L);
/*     */     l ^ 0x5F7F31CEE4BAL;
/*     */     return a(i, j, k, paramString, 0, paramString.length(), paramCharset);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ag paramag, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_2
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 51066954293383
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 62690484777480
/*     */     //   12: lxor
/*     */     //   13: lstore #6
/*     */     //   15: pop2
/*     */     //   16: ldc2_w -3023545199621444030
/*     */     //   19: lload_2
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: aload_0
/*     */     //   26: aload_1
/*     */     //   27: lload #6
/*     */     //   29: iconst_0
/*     */     //   30: invokevirtual a : (Lme/konsolas/aac/ag;JZ)I
/*     */     //   33: istore #9
/*     */     //   35: istore #8
/*     */     //   37: iload #9
/*     */     //   39: iload #8
/*     */     //   41: ifeq -> 83
/*     */     //   44: iconst_m1
/*     */     //   45: if_icmpne -> 73
/*     */     //   48: goto -> 61
/*     */     //   51: ldc2_w -3023390942397692036
/*     */     //   54: lload_2
/*     */     //   55: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   60: athrow
/*     */     //   61: iconst_m1
/*     */     //   62: ireturn
/*     */     //   63: ldc2_w -3023390942397692036
/*     */     //   66: lload_2
/*     */     //   67: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   72: athrow
/*     */     //   73: aload_1
/*     */     //   74: getfield a : [Lme/konsolas/aac/gZ;
/*     */     //   77: iload #9
/*     */     //   79: aaload
/*     */     //   80: invokevirtual a : ()I
/*     */     //   83: istore #10
/*     */     //   85: aload_0
/*     */     //   86: iload #10
/*     */     //   88: i2l
/*     */     //   89: lload #4
/*     */     //   91: invokevirtual a : (JJ)V
/*     */     //   94: goto -> 107
/*     */     //   97: astore #11
/*     */     //   99: new java/lang/AssertionError
/*     */     //   102: dup
/*     */     //   103: invokespecial <init> : ()V
/*     */     //   106: athrow
/*     */     //   107: iload #9
/*     */     //   109: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #423	-> 25
/*     */     //   #629	-> 37
/*     */     //   #188	-> 73
/*     */     //   #284	-> 85
/*     */     //   #617	-> 94
/*     */     //   #35	-> 97
/*     */     //   #815	-> 99
/*     */     //   #493	-> 107
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   37	48	51	java/io/EOFException
/*     */     //   44	63	63	java/io/EOFException
/*     */     //   85	94	97	java/io/EOFException
/*     */   }
/*     */ 
/*     */   
/*     */   public gi a(String paramString, long paramLong) {
/*     */     long l = paramLong ^ 0x3CC2A6A815DCL;
/*     */     return a(l, paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public long c(char paramChar, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: lload_2
/*     */     //   6: bipush #16
/*     */     //   8: lshl
/*     */     //   9: bipush #16
/*     */     //   11: lushr
/*     */     //   12: lor
/*     */     //   13: lstore #4
/*     */     //   15: lload #4
/*     */     //   17: dup2
/*     */     //   18: ldc2_w 34349383647725
/*     */     //   21: lxor
/*     */     //   22: lstore #6
/*     */     //   24: dup2
/*     */     //   25: ldc2_w 4660763882879
/*     */     //   28: lxor
/*     */     //   29: lstore #8
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 138229159726768
/*     */     //   35: lxor
/*     */     //   36: lstore #10
/*     */     //   38: dup2
/*     */     //   39: ldc2_w 95070096071275
/*     */     //   42: lxor
/*     */     //   43: lstore #12
/*     */     //   45: dup2
/*     */     //   46: ldc2_w 27262295909104
/*     */     //   49: lxor
/*     */     //   50: lstore #14
/*     */     //   52: dup2
/*     */     //   53: ldc2_w 88358760133851
/*     */     //   56: lxor
/*     */     //   57: dup2
/*     */     //   58: bipush #48
/*     */     //   60: lushr
/*     */     //   61: l2i
/*     */     //   62: istore #16
/*     */     //   64: dup2
/*     */     //   65: bipush #16
/*     */     //   67: lshl
/*     */     //   68: bipush #32
/*     */     //   70: lushr
/*     */     //   71: l2i
/*     */     //   72: istore #17
/*     */     //   74: dup2
/*     */     //   75: bipush #48
/*     */     //   77: lshl
/*     */     //   78: bipush #48
/*     */     //   80: lushr
/*     */     //   81: l2i
/*     */     //   82: istore #18
/*     */     //   84: pop2
/*     */     //   85: pop2
/*     */     //   86: ldc2_w 518578921356738426
/*     */     //   89: lload #4
/*     */     //   91: <illegal opcode> w : (JJ)I
/*     */     //   96: istore #19
/*     */     //   98: aload_0
/*     */     //   99: getfield a : J
/*     */     //   102: iload #19
/*     */     //   104: ifeq -> 160
/*     */     //   107: lconst_0
/*     */     //   108: lcmp
/*     */     //   109: ifne -> 159
/*     */     //   112: goto -> 126
/*     */     //   115: ldc2_w 518662268628522564
/*     */     //   118: lload #4
/*     */     //   120: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   125: athrow
/*     */     //   126: new java/lang/IllegalStateException
/*     */     //   129: dup
/*     */     //   130: sipush #16993
/*     */     //   133: ldc2_w 5358014595887211369
/*     */     //   136: lload #4
/*     */     //   138: lxor
/*     */     //   139: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   144: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   147: athrow
/*     */     //   148: ldc2_w 518662268628522564
/*     */     //   151: lload #4
/*     */     //   153: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   158: athrow
/*     */     //   159: lconst_0
/*     */     //   160: lstore #20
/*     */     //   162: iconst_0
/*     */     //   163: istore #22
/*     */     //   165: iconst_0
/*     */     //   166: istore #23
/*     */     //   168: iconst_0
/*     */     //   169: istore #24
/*     */     //   171: ldc2_w -922337203685477580
/*     */     //   174: lstore #25
/*     */     //   176: ldc2_w -7
/*     */     //   179: lstore #27
/*     */     //   181: aload_0
/*     */     //   182: getfield b : Lme/konsolas/aac/eV;
/*     */     //   185: astore #29
/*     */     //   187: aload #29
/*     */     //   189: getfield h : [B
/*     */     //   192: astore #30
/*     */     //   194: aload #29
/*     */     //   196: getfield d : I
/*     */     //   199: istore #31
/*     */     //   201: aload #29
/*     */     //   203: getfield c : I
/*     */     //   206: istore #32
/*     */     //   208: iload #31
/*     */     //   210: iload #32
/*     */     //   212: if_icmpge -> 841
/*     */     //   215: aload #30
/*     */     //   217: iload #31
/*     */     //   219: baload
/*     */     //   220: istore #33
/*     */     //   222: iload #33
/*     */     //   224: bipush #48
/*     */     //   226: lload_2
/*     */     //   227: lconst_0
/*     */     //   228: lcmp
/*     */     //   229: iflt -> 845
/*     */     //   232: iload #19
/*     */     //   234: ifeq -> 845
/*     */     //   237: iload #19
/*     */     //   239: ifeq -> 633
/*     */     //   242: goto -> 256
/*     */     //   245: ldc2_w 518662268628522564
/*     */     //   248: lload #4
/*     */     //   250: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   255: athrow
/*     */     //   256: iload_1
/*     */     //   257: iflt -> 600
/*     */     //   260: if_icmplt -> 596
/*     */     //   263: goto -> 277
/*     */     //   266: ldc2_w 518662268628522564
/*     */     //   269: lload #4
/*     */     //   271: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   276: athrow
/*     */     //   277: iload #33
/*     */     //   279: bipush #57
/*     */     //   281: iload_1
/*     */     //   282: iflt -> 633
/*     */     //   285: iload #19
/*     */     //   287: ifeq -> 633
/*     */     //   290: goto -> 304
/*     */     //   293: ldc2_w 518662268628522564
/*     */     //   296: lload #4
/*     */     //   298: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   303: athrow
/*     */     //   304: if_icmpgt -> 596
/*     */     //   307: goto -> 321
/*     */     //   310: ldc2_w 518662268628522564
/*     */     //   313: lload #4
/*     */     //   315: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   320: athrow
/*     */     //   321: bipush #48
/*     */     //   323: iload #33
/*     */     //   325: isub
/*     */     //   326: istore #34
/*     */     //   328: lload #20
/*     */     //   330: lload #25
/*     */     //   332: lcmp
/*     */     //   333: iload_1
/*     */     //   334: iflt -> 397
/*     */     //   337: iload #19
/*     */     //   339: ifeq -> 397
/*     */     //   342: iflt -> 452
/*     */     //   345: goto -> 359
/*     */     //   348: ldc2_w 518662268628522564
/*     */     //   351: lload #4
/*     */     //   353: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   358: athrow
/*     */     //   359: lload #20
/*     */     //   361: lload #25
/*     */     //   363: iload #19
/*     */     //   365: ifeq -> 584
/*     */     //   368: goto -> 382
/*     */     //   371: ldc2_w 518662268628522564
/*     */     //   374: lload #4
/*     */     //   376: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   381: athrow
/*     */     //   382: lcmp
/*     */     //   383: goto -> 397
/*     */     //   386: ldc2_w 518662268628522564
/*     */     //   389: lload #4
/*     */     //   391: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   396: athrow
/*     */     //   397: iload_1
/*     */     //   398: iflt -> 406
/*     */     //   401: ifne -> 571
/*     */     //   404: iload #34
/*     */     //   406: i2l
/*     */     //   407: lload_2
/*     */     //   408: lconst_0
/*     */     //   409: lcmp
/*     */     //   410: ifle -> 585
/*     */     //   413: lload #27
/*     */     //   415: iload #19
/*     */     //   417: ifeq -> 584
/*     */     //   420: goto -> 434
/*     */     //   423: ldc2_w 518662268628522564
/*     */     //   426: lload #4
/*     */     //   428: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   433: athrow
/*     */     //   434: lcmp
/*     */     //   435: ifge -> 571
/*     */     //   438: goto -> 452
/*     */     //   441: ldc2_w 518662268628522564
/*     */     //   444: lload #4
/*     */     //   446: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   451: athrow
/*     */     //   452: new me/konsolas/aac/fw
/*     */     //   455: dup
/*     */     //   456: invokespecial <init> : ()V
/*     */     //   459: lload #20
/*     */     //   461: iload #16
/*     */     //   463: i2s
/*     */     //   464: iload #17
/*     */     //   466: iload #18
/*     */     //   468: invokevirtual c : (JSII)Lme/konsolas/aac/fw;
/*     */     //   471: iload #33
/*     */     //   473: lload #6
/*     */     //   475: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   478: astore #35
/*     */     //   480: iload #23
/*     */     //   482: iload #19
/*     */     //   484: ifeq -> 525
/*     */     //   487: ifne -> 526
/*     */     //   490: goto -> 504
/*     */     //   493: ldc2_w 518662268628522564
/*     */     //   496: lload #4
/*     */     //   498: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   503: athrow
/*     */     //   504: aload #35
/*     */     //   506: lload #10
/*     */     //   508: invokevirtual a : (J)B
/*     */     //   511: goto -> 525
/*     */     //   514: ldc2_w 518662268628522564
/*     */     //   517: lload #4
/*     */     //   519: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   524: athrow
/*     */     //   525: pop
/*     */     //   526: new java/lang/NumberFormatException
/*     */     //   529: dup
/*     */     //   530: new java/lang/StringBuilder
/*     */     //   533: dup
/*     */     //   534: invokespecial <init> : ()V
/*     */     //   537: sipush #21766
/*     */     //   540: ldc2_w 5973379964056384535
/*     */     //   543: lload #4
/*     */     //   545: lxor
/*     */     //   546: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   554: aload #35
/*     */     //   556: lload #14
/*     */     //   558: invokevirtual c : (J)Ljava/lang/String;
/*     */     //   561: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   564: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   567: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   570: athrow
/*     */     //   571: lload #20
/*     */     //   573: ldc2_w 10
/*     */     //   576: lmul
/*     */     //   577: lstore #20
/*     */     //   579: lload #20
/*     */     //   581: iload #34
/*     */     //   583: i2l
/*     */     //   584: ladd
/*     */     //   585: lstore #20
/*     */     //   587: iload #19
/*     */     //   589: iload_1
/*     */     //   590: iflt -> 820
/*     */     //   593: ifne -> 812
/*     */     //   596: iload #33
/*     */     //   598: iload #19
/*     */     //   600: ifeq -> 718
/*     */     //   603: goto -> 617
/*     */     //   606: ldc2_w 518662268628522564
/*     */     //   609: lload #4
/*     */     //   611: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   616: athrow
/*     */     //   617: bipush #45
/*     */     //   619: goto -> 633
/*     */     //   622: ldc2_w 518662268628522564
/*     */     //   625: lload #4
/*     */     //   627: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   632: athrow
/*     */     //   633: iload_1
/*     */     //   634: iflt -> 644
/*     */     //   637: if_icmpne -> 702
/*     */     //   640: iload #22
/*     */     //   642: iload #19
/*     */     //   644: lload_2
/*     */     //   645: lconst_0
/*     */     //   646: lcmp
/*     */     //   647: ifle -> 726
/*     */     //   650: ifeq -> 718
/*     */     //   653: goto -> 667
/*     */     //   656: ldc2_w 518662268628522564
/*     */     //   659: lload #4
/*     */     //   661: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   666: athrow
/*     */     //   667: ifne -> 702
/*     */     //   670: goto -> 684
/*     */     //   673: ldc2_w 518662268628522564
/*     */     //   676: lload #4
/*     */     //   678: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   683: athrow
/*     */     //   684: iconst_1
/*     */     //   685: istore #23
/*     */     //   687: lload #27
/*     */     //   689: lconst_1
/*     */     //   690: lsub
/*     */     //   691: lstore #27
/*     */     //   693: iload #19
/*     */     //   695: iload_1
/*     */     //   696: iflt -> 820
/*     */     //   699: ifne -> 812
/*     */     //   702: iload #22
/*     */     //   704: goto -> 718
/*     */     //   707: ldc2_w 518662268628522564
/*     */     //   710: lload #4
/*     */     //   712: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   717: athrow
/*     */     //   718: lload_2
/*     */     //   719: lconst_0
/*     */     //   720: lcmp
/*     */     //   721: iflt -> 805
/*     */     //   724: iload #19
/*     */     //   726: ifeq -> 801
/*     */     //   729: ifne -> 800
/*     */     //   732: goto -> 746
/*     */     //   735: ldc2_w 518662268628522564
/*     */     //   738: lload #4
/*     */     //   740: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   745: athrow
/*     */     //   746: new java/lang/NumberFormatException
/*     */     //   749: dup
/*     */     //   750: new java/lang/StringBuilder
/*     */     //   753: dup
/*     */     //   754: invokespecial <init> : ()V
/*     */     //   757: sipush #20563
/*     */     //   760: ldc2_w 6937950265174143341
/*     */     //   763: lload #4
/*     */     //   765: lxor
/*     */     //   766: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   771: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   774: iload #33
/*     */     //   776: invokestatic toHexString : (I)Ljava/lang/String;
/*     */     //   779: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   782: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   785: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   788: athrow
/*     */     //   789: ldc2_w 518662268628522564
/*     */     //   792: lload #4
/*     */     //   794: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   799: athrow
/*     */     //   800: iconst_1
/*     */     //   801: istore #24
/*     */     //   803: iload #19
/*     */     //   805: iload_1
/*     */     //   806: iflt -> 843
/*     */     //   809: ifne -> 841
/*     */     //   812: iinc #31, 1
/*     */     //   815: iinc #22, 1
/*     */     //   818: iload #19
/*     */     //   820: ifne -> 208
/*     */     //   823: iload_1
/*     */     //   824: iflt -> 841
/*     */     //   827: goto -> 841
/*     */     //   830: ldc2_w 518662268628522564
/*     */     //   833: lload #4
/*     */     //   835: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   840: athrow
/*     */     //   841: iload #31
/*     */     //   843: iload #32
/*     */     //   845: if_icmpne -> 889
/*     */     //   848: aload_0
/*     */     //   849: aload #29
/*     */     //   851: lload #12
/*     */     //   853: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   856: putfield b : Lme/konsolas/aac/eV;
/*     */     //   859: aload #29
/*     */     //   861: lload #8
/*     */     //   863: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   866: iload #19
/*     */     //   868: iload_1
/*     */     //   869: iflt -> 912
/*     */     //   872: ifne -> 910
/*     */     //   875: goto -> 889
/*     */     //   878: ldc2_w 518662268628522564
/*     */     //   881: lload #4
/*     */     //   883: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   888: athrow
/*     */     //   889: aload #29
/*     */     //   891: iload #31
/*     */     //   893: putfield d : I
/*     */     //   896: goto -> 910
/*     */     //   899: ldc2_w 518662268628522564
/*     */     //   902: lload #4
/*     */     //   904: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   909: athrow
/*     */     //   910: iload #24
/*     */     //   912: lload_2
/*     */     //   913: lconst_0
/*     */     //   914: lcmp
/*     */     //   915: ifle -> 992
/*     */     //   918: iload #19
/*     */     //   920: ifeq -> 986
/*     */     //   923: ifne -> 967
/*     */     //   926: goto -> 940
/*     */     //   929: ldc2_w 518662268628522564
/*     */     //   932: lload #4
/*     */     //   934: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   939: athrow
/*     */     //   940: aload_0
/*     */     //   941: getfield b : Lme/konsolas/aac/eV;
/*     */     //   944: ifnonnull -> 181
/*     */     //   947: lload_2
/*     */     //   948: lconst_0
/*     */     //   949: lcmp
/*     */     //   950: ifle -> 841
/*     */     //   953: goto -> 967
/*     */     //   956: ldc2_w 518662268628522564
/*     */     //   959: lload #4
/*     */     //   961: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   966: athrow
/*     */     //   967: aload_0
/*     */     //   968: dup
/*     */     //   969: getfield a : J
/*     */     //   972: iload #22
/*     */     //   974: i2l
/*     */     //   975: lsub
/*     */     //   976: putfield a : J
/*     */     //   979: iload #23
/*     */     //   981: iload #19
/*     */     //   983: ifeq -> 210
/*     */     //   986: lload_2
/*     */     //   987: lconst_0
/*     */     //   988: lcmp
/*     */     //   989: ifle -> 220
/*     */     //   992: ifeq -> 1011
/*     */     //   995: lload #20
/*     */     //   997: goto -> 1014
/*     */     //   1000: ldc2_w 518662268628522564
/*     */     //   1003: lload #4
/*     */     //   1005: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1010: athrow
/*     */     //   1011: lload #20
/*     */     //   1013: lneg
/*     */     //   1014: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #436	-> 98
/*     */     //   #643	-> 159
/*     */     //   #237	-> 162
/*     */     //   #500	-> 165
/*     */     //   #535	-> 168
/*     */     //   #805	-> 171
/*     */     //   #43	-> 176
/*     */     //   #191	-> 181
/*     */     //   #1	-> 187
/*     */     //   #275	-> 194
/*     */     //   #722	-> 201
/*     */     //   #118	-> 208
/*     */     //   #134	-> 215
/*     */     //   #743	-> 222
/*     */     //   #682	-> 321
/*     */     //   #467	-> 328
/*     */     //   #199	-> 452
/*     */     //   #841	-> 480
/*     */     //   #836	-> 526
/*     */     //   #434	-> 571
/*     */     //   #248	-> 579
/*     */     //   #570	-> 587
/*     */     //   #794	-> 684
/*     */     //   #412	-> 687
/*     */     //   #340	-> 702
/*     */     //   #49	-> 746
/*     */     //   #483	-> 776
/*     */     //   #68	-> 800
/*     */     //   #250	-> 803
/*     */     //   #937	-> 812
/*     */     //   #425	-> 841
/*     */     //   #654	-> 848
/*     */     //   #565	-> 859
/*     */     //   #928	-> 889
/*     */     //   #660	-> 910
/*     */     //   #99	-> 967
/*     */     //   #306	-> 979
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   98	112	115	java/lang/IllegalArgumentException
/*     */     //   107	148	148	java/lang/IllegalArgumentException
/*     */     //   222	242	245	java/lang/IllegalArgumentException
/*     */     //   237	263	266	java/lang/IllegalArgumentException
/*     */     //   256	290	293	java/lang/IllegalArgumentException
/*     */     //   277	307	310	java/lang/IllegalArgumentException
/*     */     //   328	345	348	java/lang/IllegalArgumentException
/*     */     //   342	368	371	java/lang/IllegalArgumentException
/*     */     //   359	383	386	java/lang/IllegalArgumentException
/*     */     //   397	420	423	java/lang/IllegalArgumentException
/*     */     //   404	438	441	java/lang/IllegalArgumentException
/*     */     //   480	490	493	java/lang/IllegalArgumentException
/*     */     //   487	511	514	java/lang/IllegalArgumentException
/*     */     //   587	603	606	java/lang/IllegalArgumentException
/*     */     //   596	619	622	java/lang/IllegalArgumentException
/*     */     //   633	653	656	java/lang/IllegalArgumentException
/*     */     //   640	670	673	java/lang/IllegalArgumentException
/*     */     //   693	704	707	java/lang/IllegalArgumentException
/*     */     //   718	732	735	java/lang/IllegalArgumentException
/*     */     //   729	789	789	java/lang/IllegalArgumentException
/*     */     //   803	823	830	java/lang/IllegalArgumentException
/*     */     //   845	875	878	java/lang/IllegalArgumentException
/*     */     //   848	896	899	java/lang/IllegalArgumentException
/*     */     //   910	926	929	java/lang/IllegalArgumentException
/*     */     //   923	947	956	java/lang/IllegalArgumentException
/*     */     //   986	1000	1000	java/lang/IllegalArgumentException
/*     */   }
/*     */ 
/*     */   
/*     */   public fw d(long paramLong1, long paramLong2) {
/*     */     paramLong2 = f ^ paramLong2;
/*     */     long l = paramLong2 ^ 0x56BEAE04CAA8L;
/*     */     return b(cc.a(paramLong1), l);
/*     */   }
/*     */ 
/*     */   
/*     */   public final gG a(long paramLong) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x689C36554112L;
/*     */     return a(l, new gG());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void a(char paramChar, int paramInt1, int paramInt2) {
/*     */     long l1 = (paramChar << 48L | paramInt1 << 32L >>> 16L | paramInt2 << 48L >>> 48L) ^ f, l2 = l1 ^ 0x8866764D197L;
/*     */     try {
/*     */       a(this.a, l2);
/*     */     } catch (EOFException eOFException) {
/*     */       throw new AssertionError(eOFException);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public gi b(long paramLong, int paramInt) {
/*     */     long l = paramLong ^ 0x7150C903BD32L;
/*     */     return f(paramInt, l);
/*     */   }
/*     */ 
/*     */   
/*     */   public bX a(long paramLong) {
/*     */     long l = paramLong ^ 0x17BF6225D069L;
/*     */     int i = (int)((paramLong ^ 0x11E8ED32A713L) >>> 48L), j = (int)((paramLong ^ 0x11E8ED32A713L) << 16L >>> 48L), k = (int)((paramLong ^ 0x11E8ED32A713L) << 32L >>> 32L);
/*     */     paramLong ^ 0x11E8ED32A713L;
/*     */     mB mB = new mB(this, l);
/*     */     return ds.a((short)i, mB, (char)j, k);
/*     */   }
/*     */ 
/*     */   
/*     */   public long a(byte paramByte, long paramLong1, long paramLong2) {
/*     */     long l = paramLong2 ^ 0x705FAF3D478EL;
/*     */     return a(paramByte, paramLong1, Long.MAX_VALUE, l);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean a(eV parameV, int paramInt1, gZ paramgZ, int paramInt2, int paramInt3, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload #6
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: lload #6
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 127778167989528
/*     */     //   14: lxor
/*     */     //   15: lstore #8
/*     */     //   17: pop2
/*     */     //   18: aload_1
/*     */     //   19: getfield c : I
/*     */     //   22: istore #11
/*     */     //   24: ldc2_w -1916419578689309857
/*     */     //   27: lload #6
/*     */     //   29: <illegal opcode> w : (JJ)I
/*     */     //   34: aload_1
/*     */     //   35: getfield h : [B
/*     */     //   38: astore #12
/*     */     //   40: iload #4
/*     */     //   42: istore #13
/*     */     //   44: istore #10
/*     */     //   46: iload #13
/*     */     //   48: iload #5
/*     */     //   50: if_icmpge -> 180
/*     */     //   53: iload_2
/*     */     //   54: iload #10
/*     */     //   56: lload #6
/*     */     //   58: lconst_0
/*     */     //   59: lcmp
/*     */     //   60: ifle -> 68
/*     */     //   63: ifne -> 188
/*     */     //   66: iload #11
/*     */     //   68: iload #10
/*     */     //   70: ifne -> 164
/*     */     //   73: goto -> 87
/*     */     //   76: ldc2_w -1880538520501308272
/*     */     //   79: lload #6
/*     */     //   81: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   86: athrow
/*     */     //   87: if_icmpne -> 126
/*     */     //   90: goto -> 104
/*     */     //   93: ldc2_w -1880538520501308272
/*     */     //   96: lload #6
/*     */     //   98: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   103: athrow
/*     */     //   104: aload_1
/*     */     //   105: getfield b : Lme/konsolas/aac/eV;
/*     */     //   108: astore_1
/*     */     //   109: aload_1
/*     */     //   110: getfield h : [B
/*     */     //   113: astore #12
/*     */     //   115: aload_1
/*     */     //   116: getfield d : I
/*     */     //   119: istore_2
/*     */     //   120: aload_1
/*     */     //   121: getfield c : I
/*     */     //   124: istore #11
/*     */     //   126: aload #12
/*     */     //   128: iload_2
/*     */     //   129: baload
/*     */     //   130: iload #10
/*     */     //   132: lload #6
/*     */     //   134: lconst_0
/*     */     //   135: lcmp
/*     */     //   136: iflt -> 150
/*     */     //   139: ifne -> 168
/*     */     //   142: aload_3
/*     */     //   143: iload #13
/*     */     //   145: lload #8
/*     */     //   147: invokevirtual a : (IJ)B
/*     */     //   150: goto -> 164
/*     */     //   153: ldc2_w -1880538520501308272
/*     */     //   156: lload #6
/*     */     //   158: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   163: athrow
/*     */     //   164: if_icmpeq -> 169
/*     */     //   167: iconst_0
/*     */     //   168: ireturn
/*     */     //   169: iinc #2, 1
/*     */     //   172: iinc #13, 1
/*     */     //   175: iload #10
/*     */     //   177: ifeq -> 46
/*     */     //   180: lload #6
/*     */     //   182: lconst_0
/*     */     //   183: lcmp
/*     */     //   184: iflt -> 53
/*     */     //   187: iconst_1
/*     */     //   188: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #460	-> 18
/*     */     //   #719	-> 34
/*     */     //   #524	-> 40
/*     */     //   #824	-> 53
/*     */     //   #155	-> 104
/*     */     //   #846	-> 109
/*     */     //   #897	-> 115
/*     */     //   #754	-> 120
/*     */     //   #64	-> 126
/*     */     //   #178	-> 167
/*     */     //   #22	-> 169
/*     */     //   #396	-> 172
/*     */     //   #376	-> 180
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   53	73	76	java/lang/IllegalArgumentException
/*     */     //   66	90	93	java/lang/IllegalArgumentException
/*     */     //   126	150	153	java/lang/IllegalArgumentException
/*     */   }
/*     */ 
/*     */   
/*     */   String c(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 126905458886375
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 36118736571742
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 114428388872025
/*     */     //   25: lxor
/*     */     //   26: lstore #9
/*     */     //   28: pop2
/*     */     //   29: ldc2_w 8100402000058796066
/*     */     //   32: lload_3
/*     */     //   33: <illegal opcode> w : (JJ)I
/*     */     //   38: istore #11
/*     */     //   40: lload_1
/*     */     //   41: lconst_0
/*     */     //   42: lcmp
/*     */     //   43: iload #11
/*     */     //   45: ifeq -> 110
/*     */     //   48: ifle -> 138
/*     */     //   51: goto -> 64
/*     */     //   54: ldc2_w 8100459427207258396
/*     */     //   57: lload_3
/*     */     //   58: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   63: athrow
/*     */     //   64: aload_0
/*     */     //   65: lload_1
/*     */     //   66: lconst_1
/*     */     //   67: lload_3
/*     */     //   68: lconst_0
/*     */     //   69: lcmp
/*     */     //   70: ifle -> 142
/*     */     //   73: lsub
/*     */     //   74: iload #11
/*     */     //   76: ifeq -> 140
/*     */     //   79: goto -> 92
/*     */     //   82: ldc2_w 8100459427207258396
/*     */     //   85: lload_3
/*     */     //   86: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   91: athrow
/*     */     //   92: lload #9
/*     */     //   94: invokevirtual a : (JJ)B
/*     */     //   97: goto -> 110
/*     */     //   100: ldc2_w 8100459427207258396
/*     */     //   103: lload_3
/*     */     //   104: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   109: athrow
/*     */     //   110: bipush #13
/*     */     //   112: if_icmpne -> 138
/*     */     //   115: aload_0
/*     */     //   116: lload_1
/*     */     //   117: lconst_1
/*     */     //   118: lsub
/*     */     //   119: lload #7
/*     */     //   121: invokevirtual b : (JJ)Ljava/lang/String;
/*     */     //   124: astore #12
/*     */     //   126: aload_0
/*     */     //   127: ldc2_w 2
/*     */     //   130: lload #5
/*     */     //   132: invokevirtual a : (JJ)V
/*     */     //   135: aload #12
/*     */     //   137: areturn
/*     */     //   138: aload_0
/*     */     //   139: lload_1
/*     */     //   140: lload #7
/*     */     //   142: invokevirtual b : (JJ)Ljava/lang/String;
/*     */     //   145: astore #12
/*     */     //   147: aload_0
/*     */     //   148: lconst_1
/*     */     //   149: lload #5
/*     */     //   151: invokevirtual a : (JJ)V
/*     */     //   154: aload #12
/*     */     //   156: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #464	-> 40
/*     */     //   #297	-> 115
/*     */     //   #142	-> 126
/*     */     //   #867	-> 135
/*     */     //   #744	-> 138
/*     */     //   #429	-> 147
/*     */     //   #81	-> 154
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   40	51	54	java/io/EOFException
/*     */     //   48	79	82	java/io/EOFException
/*     */     //   64	97	100	java/io/EOFException
/*     */   }
/*     */ 
/*     */   
/*     */   public final fw a(long paramLong, InputStream paramInputStream) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x41534A7B660FL;
/*     */     a(l, paramInputStream, Long.MAX_VALUE, true);
/*     */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public short a(long paramLong) {
/*     */     long l = paramLong ^ 0x2F53DA029BECL;
/*     */     return cc.a(b(l));
/*     */   }
/*     */ 
/*     */   
/*     */   public gi a(String paramString, Charset paramCharset, long paramLong) {
/*     */     int i = (int)((paramLong ^ 0xCC3F7130C7L) >>> 32L), j = (int)((paramLong ^ 0xCC3F7130C7L) << 32L >>> 48L), k = (int)((paramLong ^ 0xCC3F7130C7L) << 48L >>> 48L);
/*     */     paramLong ^ 0xCC3F7130C7L;
/*     */     return a(i, paramString, (short)j, (char)k, paramCharset);
/*     */   }
/*     */ 
/*     */   
/*     */   public fw a(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 92734355334499
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 57111085546227
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 7151044789046818053
/*     */     //   25: lload_3
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: istore #9
/*     */     //   33: lload_1
/*     */     //   34: lconst_0
/*     */     //   35: lcmp
/*     */     //   36: iload #9
/*     */     //   38: ifne -> 87
/*     */     //   41: ifne -> 76
/*     */     //   44: goto -> 57
/*     */     //   47: ldc2_w 7186869790412190410
/*     */     //   50: lload_3
/*     */     //   51: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   56: athrow
/*     */     //   57: aload_0
/*     */     //   58: bipush #48
/*     */     //   60: lload #5
/*     */     //   62: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   65: areturn
/*     */     //   66: ldc2_w 7186869790412190410
/*     */     //   69: lload_3
/*     */     //   70: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   75: athrow
/*     */     //   76: lload_1
/*     */     //   77: invokestatic highestOneBit : (J)J
/*     */     //   80: invokestatic numberOfTrailingZeros : (J)I
/*     */     //   83: iconst_4
/*     */     //   84: idiv
/*     */     //   85: iconst_1
/*     */     //   86: iadd
/*     */     //   87: istore #10
/*     */     //   89: aload_0
/*     */     //   90: lload #7
/*     */     //   92: iload #10
/*     */     //   94: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*     */     //   97: astore #11
/*     */     //   99: aload #11
/*     */     //   101: getfield h : [B
/*     */     //   104: astore #12
/*     */     //   106: aload #11
/*     */     //   108: getfield c : I
/*     */     //   111: iload #10
/*     */     //   113: iadd
/*     */     //   114: iconst_1
/*     */     //   115: isub
/*     */     //   116: istore #13
/*     */     //   118: aload #11
/*     */     //   120: getfield c : I
/*     */     //   123: istore #14
/*     */     //   125: iload #13
/*     */     //   127: iload #14
/*     */     //   129: if_icmplt -> 189
/*     */     //   132: aload #12
/*     */     //   134: iload #13
/*     */     //   136: getstatic me/konsolas/aac/fw.d : [B
/*     */     //   139: lload_1
/*     */     //   140: ldc2_w 15
/*     */     //   143: land
/*     */     //   144: l2i
/*     */     //   145: baload
/*     */     //   146: bastore
/*     */     //   147: lload_1
/*     */     //   148: iconst_4
/*     */     //   149: lushr
/*     */     //   150: lstore_1
/*     */     //   151: iinc #13, -1
/*     */     //   154: iload #9
/*     */     //   156: lload_3
/*     */     //   157: lconst_0
/*     */     //   158: lcmp
/*     */     //   159: iflt -> 167
/*     */     //   162: ifne -> 213
/*     */     //   165: iload #9
/*     */     //   167: ifeq -> 125
/*     */     //   170: lload_3
/*     */     //   171: lconst_0
/*     */     //   172: lcmp
/*     */     //   173: iflt -> 154
/*     */     //   176: goto -> 189
/*     */     //   179: ldc2_w 7186869790412190410
/*     */     //   182: lload_3
/*     */     //   183: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   188: athrow
/*     */     //   189: aload #11
/*     */     //   191: dup
/*     */     //   192: getfield c : I
/*     */     //   195: iload #10
/*     */     //   197: iadd
/*     */     //   198: putfield c : I
/*     */     //   201: aload_0
/*     */     //   202: dup
/*     */     //   203: getfield a : J
/*     */     //   206: iload #10
/*     */     //   208: i2l
/*     */     //   209: ladd
/*     */     //   210: putfield a : J
/*     */     //   213: aload_0
/*     */     //   214: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #486	-> 33
/*     */     //   #391	-> 57
/*     */     //   #303	-> 76
/*     */     //   #586	-> 89
/*     */     //   #92	-> 99
/*     */     //   #877	-> 106
/*     */     //   #269	-> 132
/*     */     //   #165	-> 147
/*     */     //   #141	-> 151
/*     */     //   #733	-> 189
/*     */     //   #335	-> 201
/*     */     //   #446	-> 213
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   33	44	47	java/lang/IllegalArgumentException
/*     */     //   41	66	66	java/lang/IllegalArgumentException
/*     */     //   151	170	179	java/lang/IllegalArgumentException
/*     */   }
/*     */ 
/*     */   
/*     */   public final gG b(long paramLong) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x58F136520E9EL;
/*     */     return b(l, new gG());
/*     */   }
/*     */ 
/*     */   
/*     */   public final long e(int paramInt, char paramChar, short paramShort) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/fw.f : J
/*     */     //   26: lxor
/*     */     //   27: lstore #4
/*     */     //   29: ldc2_w -8498752610187169210
/*     */     //   32: lload #4
/*     */     //   34: <illegal opcode> w : (JJ)I
/*     */     //   39: aload_0
/*     */     //   40: getfield a : J
/*     */     //   43: lstore #7
/*     */     //   45: istore #6
/*     */     //   47: lload #7
/*     */     //   49: iload #6
/*     */     //   51: ifeq -> 88
/*     */     //   54: lconst_0
/*     */     //   55: lcmp
/*     */     //   56: ifne -> 89
/*     */     //   59: goto -> 73
/*     */     //   62: ldc2_w -8498668691680404616
/*     */     //   65: lload #4
/*     */     //   67: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   72: athrow
/*     */     //   73: lconst_0
/*     */     //   74: goto -> 88
/*     */     //   77: ldc2_w -8498668691680404616
/*     */     //   80: lload #4
/*     */     //   82: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   87: athrow
/*     */     //   88: lreturn
/*     */     //   89: aload_0
/*     */     //   90: getfield b : Lme/konsolas/aac/eV;
/*     */     //   93: getfield e : Lme/konsolas/aac/eV;
/*     */     //   96: astore #9
/*     */     //   98: aload #9
/*     */     //   100: getfield c : I
/*     */     //   103: iload #6
/*     */     //   105: iload_2
/*     */     //   106: ifle -> 115
/*     */     //   109: ifeq -> 151
/*     */     //   112: sipush #8192
/*     */     //   115: if_icmpge -> 171
/*     */     //   118: goto -> 132
/*     */     //   121: ldc2_w -8498668691680404616
/*     */     //   124: lload #4
/*     */     //   126: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   131: athrow
/*     */     //   132: aload #9
/*     */     //   134: getfield i : Z
/*     */     //   137: goto -> 151
/*     */     //   140: ldc2_w -8498668691680404616
/*     */     //   143: lload #4
/*     */     //   145: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   150: athrow
/*     */     //   151: ifeq -> 171
/*     */     //   154: lload #7
/*     */     //   156: aload #9
/*     */     //   158: getfield c : I
/*     */     //   161: aload #9
/*     */     //   163: getfield d : I
/*     */     //   166: isub
/*     */     //   167: i2l
/*     */     //   168: lsub
/*     */     //   169: lstore #7
/*     */     //   171: lload #7
/*     */     //   173: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #491	-> 39
/*     */     //   #789	-> 47
/*     */     //   #687	-> 89
/*     */     //   #247	-> 98
/*     */     //   #595	-> 154
/*     */     //   #305	-> 171
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   47	59	62	java/lang/IllegalArgumentException
/*     */     //   54	74	77	java/lang/IllegalArgumentException
/*     */     //   98	118	121	java/lang/IllegalArgumentException
/*     */     //   112	137	140	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   private void a(long paramLong1, InputStream paramInputStream, long paramLong2, boolean paramBoolean) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 25917823805451
/*     */     //   11: lxor
/*     */     //   12: lstore #7
/*     */     //   14: pop2
/*     */     //   15: ldc2_w 8198162356720773117
/*     */     //   18: lload_1
/*     */     //   19: <illegal opcode> w : (JJ)I
/*     */     //   24: istore #9
/*     */     //   26: aload_3
/*     */     //   27: ifnonnull -> 61
/*     */     //   30: new java/lang/IllegalArgumentException
/*     */     //   33: dup
/*     */     //   34: sipush #22878
/*     */     //   37: ldc2_w 3351729046958001681
/*     */     //   40: lload_1
/*     */     //   41: lxor
/*     */     //   42: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   47: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   50: athrow
/*     */     //   51: ldc2_w 8161867899340333106
/*     */     //   54: lload_1
/*     */     //   55: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   60: athrow
/*     */     //   61: lload #4
/*     */     //   63: lconst_0
/*     */     //   64: lcmp
/*     */     //   65: ifgt -> 73
/*     */     //   68: iload #6
/*     */     //   70: ifeq -> 222
/*     */     //   73: aload_0
/*     */     //   74: lload #7
/*     */     //   76: iconst_1
/*     */     //   77: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*     */     //   80: astore #10
/*     */     //   82: lload #4
/*     */     //   84: sipush #8192
/*     */     //   87: aload #10
/*     */     //   89: getfield c : I
/*     */     //   92: isub
/*     */     //   93: i2l
/*     */     //   94: invokestatic min : (JJ)J
/*     */     //   97: l2i
/*     */     //   98: istore #11
/*     */     //   100: aload_3
/*     */     //   101: aload #10
/*     */     //   103: getfield h : [B
/*     */     //   106: aload #10
/*     */     //   108: getfield c : I
/*     */     //   111: iload #11
/*     */     //   113: invokevirtual read : ([BII)I
/*     */     //   116: istore #12
/*     */     //   118: iload #9
/*     */     //   120: lload_1
/*     */     //   121: lconst_0
/*     */     //   122: lcmp
/*     */     //   123: iflt -> 219
/*     */     //   126: ifne -> 217
/*     */     //   129: iload #12
/*     */     //   131: iconst_m1
/*     */     //   132: if_icmpne -> 185
/*     */     //   135: goto -> 148
/*     */     //   138: ldc2_w 8161867899340333106
/*     */     //   141: lload_1
/*     */     //   142: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   147: athrow
/*     */     //   148: iload #6
/*     */     //   150: ifeq -> 177
/*     */     //   153: goto -> 166
/*     */     //   156: ldc2_w 8161867899340333106
/*     */     //   159: lload_1
/*     */     //   160: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   165: athrow
/*     */     //   166: return
/*     */     //   167: ldc2_w 8161867899340333106
/*     */     //   170: lload_1
/*     */     //   171: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   176: athrow
/*     */     //   177: new java/io/EOFException
/*     */     //   180: dup
/*     */     //   181: invokespecial <init> : ()V
/*     */     //   184: athrow
/*     */     //   185: aload #10
/*     */     //   187: dup
/*     */     //   188: getfield c : I
/*     */     //   191: iload #12
/*     */     //   193: iadd
/*     */     //   194: putfield c : I
/*     */     //   197: aload_0
/*     */     //   198: dup
/*     */     //   199: getfield a : J
/*     */     //   202: iload #12
/*     */     //   204: i2l
/*     */     //   205: ladd
/*     */     //   206: putfield a : J
/*     */     //   209: lload #4
/*     */     //   211: iload #12
/*     */     //   213: i2l
/*     */     //   214: lsub
/*     */     //   215: lstore #4
/*     */     //   217: iload #9
/*     */     //   219: ifeq -> 61
/*     */     //   222: lload_1
/*     */     //   223: lconst_0
/*     */     //   224: lcmp
/*     */     //   225: iflt -> 73
/*     */     //   228: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #499	-> 26
/*     */     //   #98	-> 61
/*     */     //   #14	-> 73
/*     */     //   #592	-> 82
/*     */     //   #281	-> 100
/*     */     //   #401	-> 118
/*     */     //   #138	-> 148
/*     */     //   #731	-> 177
/*     */     //   #290	-> 185
/*     */     //   #307	-> 197
/*     */     //   #72	-> 209
/*     */     //   #855	-> 217
/*     */     //   #201	-> 222
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	51	51	java/io/IOException
/*     */     //   118	135	138	java/io/IOException
/*     */     //   129	153	156	java/io/IOException
/*     */     //   148	167	167	java/io/IOException
/*     */   }
/*     */   
/*     */   public final fw a(long paramLong1, OutputStream paramOutputStream, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 139197166189867
/*     */     //   11: lxor
/*     */     //   12: lstore #6
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 48355311826822
/*     */     //   18: lxor
/*     */     //   19: lstore #8
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 133799124785298
/*     */     //   25: lxor
/*     */     //   26: lstore #10
/*     */     //   28: pop2
/*     */     //   29: ldc2_w -4194132116591936125
/*     */     //   32: lload_1
/*     */     //   33: <illegal opcode> w : (JJ)I
/*     */     //   38: istore #12
/*     */     //   40: iload #12
/*     */     //   42: ifeq -> 105
/*     */     //   45: aload_3
/*     */     //   46: ifnonnull -> 93
/*     */     //   49: goto -> 62
/*     */     //   52: ldc2_w -4194109839929797443
/*     */     //   55: lload_1
/*     */     //   56: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   61: athrow
/*     */     //   62: new java/lang/IllegalArgumentException
/*     */     //   65: dup
/*     */     //   66: sipush #20236
/*     */     //   69: ldc2_w 1908818200986479848
/*     */     //   72: lload_1
/*     */     //   73: lxor
/*     */     //   74: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   79: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   82: athrow
/*     */     //   83: ldc2_w -4194109839929797443
/*     */     //   86: lload_1
/*     */     //   87: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   92: athrow
/*     */     //   93: aload_0
/*     */     //   94: getfield a : J
/*     */     //   97: lconst_0
/*     */     //   98: lload #4
/*     */     //   100: lload #6
/*     */     //   102: invokestatic a : (JJJJ)V
/*     */     //   105: aload_0
/*     */     //   106: getfield b : Lme/konsolas/aac/eV;
/*     */     //   109: astore #13
/*     */     //   111: lload #4
/*     */     //   113: lconst_0
/*     */     //   114: lcmp
/*     */     //   115: ifle -> 277
/*     */     //   118: lload #4
/*     */     //   120: aload #13
/*     */     //   122: getfield c : I
/*     */     //   125: aload #13
/*     */     //   127: getfield d : I
/*     */     //   130: isub
/*     */     //   131: i2l
/*     */     //   132: invokestatic min : (JJ)J
/*     */     //   135: l2i
/*     */     //   136: istore #14
/*     */     //   138: aload_3
/*     */     //   139: aload #13
/*     */     //   141: getfield h : [B
/*     */     //   144: aload #13
/*     */     //   146: getfield d : I
/*     */     //   149: iload #14
/*     */     //   151: invokevirtual write : ([BII)V
/*     */     //   154: aload #13
/*     */     //   156: dup
/*     */     //   157: getfield d : I
/*     */     //   160: iload #14
/*     */     //   162: iadd
/*     */     //   163: putfield d : I
/*     */     //   166: lload_1
/*     */     //   167: lconst_0
/*     */     //   168: lcmp
/*     */     //   169: iflt -> 197
/*     */     //   172: aload_0
/*     */     //   173: iload #12
/*     */     //   175: ifeq -> 278
/*     */     //   178: dup
/*     */     //   179: getfield a : J
/*     */     //   182: iload #14
/*     */     //   184: i2l
/*     */     //   185: lsub
/*     */     //   186: putfield a : J
/*     */     //   189: lload #4
/*     */     //   191: iload #14
/*     */     //   193: i2l
/*     */     //   194: lsub
/*     */     //   195: lstore #4
/*     */     //   197: aload #13
/*     */     //   199: iload #12
/*     */     //   201: ifeq -> 249
/*     */     //   204: getfield d : I
/*     */     //   207: lload_1
/*     */     //   208: lconst_0
/*     */     //   209: lcmp
/*     */     //   210: iflt -> 274
/*     */     //   213: aload #13
/*     */     //   215: getfield c : I
/*     */     //   218: if_icmpne -> 272
/*     */     //   221: goto -> 234
/*     */     //   224: ldc2_w -4194109839929797443
/*     */     //   227: lload_1
/*     */     //   228: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   233: athrow
/*     */     //   234: aload #13
/*     */     //   236: goto -> 249
/*     */     //   239: ldc2_w -4194109839929797443
/*     */     //   242: lload_1
/*     */     //   243: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   248: athrow
/*     */     //   249: astore #15
/*     */     //   251: aload_0
/*     */     //   252: aload #15
/*     */     //   254: lload #10
/*     */     //   256: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   259: dup
/*     */     //   260: astore #13
/*     */     //   262: putfield b : Lme/konsolas/aac/eV;
/*     */     //   265: aload #15
/*     */     //   267: lload #8
/*     */     //   269: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   272: iload #12
/*     */     //   274: ifne -> 111
/*     */     //   277: aload_0
/*     */     //   278: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #507	-> 40
/*     */     //   #452	-> 93
/*     */     //   #778	-> 105
/*     */     //   #359	-> 111
/*     */     //   #327	-> 118
/*     */     //   #852	-> 138
/*     */     //   #644	-> 154
/*     */     //   #858	-> 166
/*     */     //   #345	-> 189
/*     */     //   #374	-> 197
/*     */     //   #53	-> 234
/*     */     //   #329	-> 251
/*     */     //   #384	-> 265
/*     */     //   #515	-> 272
/*     */     //   #764	-> 277
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   40	49	52	java/io/IOException
/*     */     //   45	83	83	java/io/IOException
/*     */     //   197	221	224	java/io/IOException
/*     */     //   204	236	239	java/io/IOException
/*     */   }
/*     */   
/*     */   public fw b(long paramLong, int paramInt) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x71B5659FE72DL;
/*     */     eV eV1 = a(l, 4);
/* 915 */     byte[] arrayOfByte = eV1.h; int i = eV1.c; arrayOfByte[i++] = (byte)(paramInt >>> 24 & 0xFF); arrayOfByte[i++] = (byte)(paramInt >>> 16 & 0xFF); arrayOfByte[i++] = (byte)(paramInt >>> 8 & 0xFF); arrayOfByte[i++] = (byte)(paramInt & 0xFF); eV1.c = i; this.a += 4L;
/* 916 */     return this; } public gi f(long paramLong, int paramInt) { long l = paramLong ^ 0x44BF8C807250L; return d(l, paramInt); }
/*     */ 
/*     */   
/*     */   public int a(long paramLong, byte[] paramArrayOfbyte) {
/*     */     int i = (int)((paramLong ^ 0x52480F09A05BL) >>> 32L), j = (int)((paramLong ^ 0x52480F09A05BL) << 32L >>> 32L);
/*     */     paramLong ^ 0x52480F09A05BL;
/*     */     return a(i, paramArrayOfbyte, 0, paramArrayOfbyte.length, j);
/*     */   }
/*     */   
/*     */   public gi a(char paramChar1, int paramInt, byte[] paramArrayOfbyte, char paramChar2) {
/*     */     long l = paramChar1 << 48L | paramInt << 32L >>> 16L | paramChar2 << 48L >>> 48L;
/*     */     int i = (int)((l ^ 0x66B280AA0628L) >>> 32L), j = (int)((l ^ 0x66B280AA0628L) << 32L >>> 48L), k = (int)((l ^ 0x66B280AA0628L) << 48L >>> 48L);
/*     */     l ^ 0x66B280AA0628L;
/*     */     return a(i, (char)j, (char)k, paramArrayOfbyte);
/*     */   }
/*     */   
/*     */   public String c(long paramLong) {
/*     */     long l = paramLong ^ 0x18967AD1C9CFL;
/*     */     try {
/*     */       return a(this.a, l, cc.a);
/*     */     } catch (EOFException eOFException) {
/*     */       throw new AssertionError(eOFException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public fw d(long paramLong, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 79674451126168
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -2177911014016763906
/*     */     //   18: lload_1
/*     */     //   19: <illegal opcode> w : (JJ)I
/*     */     //   24: istore #6
/*     */     //   26: iload_3
/*     */     //   27: sipush #128
/*     */     //   30: iload #6
/*     */     //   32: ifne -> 100
/*     */     //   35: if_icmpge -> 83
/*     */     //   38: goto -> 51
/*     */     //   41: ldc2_w -2213519358962651087
/*     */     //   44: lload_1
/*     */     //   45: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   50: athrow
/*     */     //   51: aload_0
/*     */     //   52: iload_3
/*     */     //   53: lload #4
/*     */     //   55: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   58: lload_1
/*     */     //   59: lconst_0
/*     */     //   60: lcmp
/*     */     //   61: iflt -> 556
/*     */     //   64: pop
/*     */     //   65: iload #6
/*     */     //   67: ifeq -> 555
/*     */     //   70: goto -> 83
/*     */     //   73: ldc2_w -2213519358962651087
/*     */     //   76: lload_1
/*     */     //   77: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   82: athrow
/*     */     //   83: iload_3
/*     */     //   84: sipush #2048
/*     */     //   87: goto -> 100
/*     */     //   90: ldc2_w -2213519358962651087
/*     */     //   93: lload_1
/*     */     //   94: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   99: athrow
/*     */     //   100: iload #6
/*     */     //   102: lload_1
/*     */     //   103: lconst_0
/*     */     //   104: lcmp
/*     */     //   105: ifle -> 206
/*     */     //   108: ifne -> 198
/*     */     //   111: if_icmpge -> 181
/*     */     //   114: goto -> 127
/*     */     //   117: ldc2_w -2213519358962651087
/*     */     //   120: lload_1
/*     */     //   121: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   126: athrow
/*     */     //   127: aload_0
/*     */     //   128: iload_3
/*     */     //   129: bipush #6
/*     */     //   131: ishr
/*     */     //   132: sipush #192
/*     */     //   135: ior
/*     */     //   136: lload #4
/*     */     //   138: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   141: pop
/*     */     //   142: aload_0
/*     */     //   143: iload_3
/*     */     //   144: bipush #63
/*     */     //   146: iand
/*     */     //   147: sipush #128
/*     */     //   150: ior
/*     */     //   151: lload #4
/*     */     //   153: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   156: lload_1
/*     */     //   157: lconst_0
/*     */     //   158: lcmp
/*     */     //   159: iflt -> 556
/*     */     //   162: pop
/*     */     //   163: iload #6
/*     */     //   165: ifeq -> 555
/*     */     //   168: goto -> 181
/*     */     //   171: ldc2_w -2213519358962651087
/*     */     //   174: lload_1
/*     */     //   175: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   180: athrow
/*     */     //   181: iload_3
/*     */     //   182: ldc_w 65536
/*     */     //   185: goto -> 198
/*     */     //   188: ldc2_w -2213519358962651087
/*     */     //   191: lload_1
/*     */     //   192: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   197: athrow
/*     */     //   198: lload_1
/*     */     //   199: lconst_0
/*     */     //   200: lcmp
/*     */     //   201: iflt -> 411
/*     */     //   204: iload #6
/*     */     //   206: ifne -> 411
/*     */     //   209: if_icmpge -> 394
/*     */     //   212: goto -> 225
/*     */     //   215: ldc2_w -2213519358962651087
/*     */     //   218: lload_1
/*     */     //   219: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   224: athrow
/*     */     //   225: iload_3
/*     */     //   226: ldc_w 55296
/*     */     //   229: lload_1
/*     */     //   230: lconst_0
/*     */     //   231: lcmp
/*     */     //   232: iflt -> 286
/*     */     //   235: iload #6
/*     */     //   237: ifne -> 286
/*     */     //   240: goto -> 253
/*     */     //   243: ldc2_w -2213519358962651087
/*     */     //   246: lload_1
/*     */     //   247: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   252: athrow
/*     */     //   253: if_icmplt -> 322
/*     */     //   256: goto -> 269
/*     */     //   259: ldc2_w -2213519358962651087
/*     */     //   262: lload_1
/*     */     //   263: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   268: athrow
/*     */     //   269: iload_3
/*     */     //   270: ldc_w 57343
/*     */     //   273: goto -> 286
/*     */     //   276: ldc2_w -2213519358962651087
/*     */     //   279: lload_1
/*     */     //   280: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   285: athrow
/*     */     //   286: if_icmpgt -> 322
/*     */     //   289: aload_0
/*     */     //   290: bipush #63
/*     */     //   292: lload #4
/*     */     //   294: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   297: lload_1
/*     */     //   298: lconst_0
/*     */     //   299: lcmp
/*     */     //   300: iflt -> 556
/*     */     //   303: pop
/*     */     //   304: iload #6
/*     */     //   306: ifeq -> 555
/*     */     //   309: goto -> 322
/*     */     //   312: ldc2_w -2213519358962651087
/*     */     //   315: lload_1
/*     */     //   316: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   321: athrow
/*     */     //   322: aload_0
/*     */     //   323: iload_3
/*     */     //   324: bipush #12
/*     */     //   326: ishr
/*     */     //   327: sipush #224
/*     */     //   330: ior
/*     */     //   331: lload #4
/*     */     //   333: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   336: pop
/*     */     //   337: aload_0
/*     */     //   338: iload_3
/*     */     //   339: bipush #6
/*     */     //   341: ishr
/*     */     //   342: bipush #63
/*     */     //   344: iand
/*     */     //   345: sipush #128
/*     */     //   348: ior
/*     */     //   349: lload #4
/*     */     //   351: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   354: pop
/*     */     //   355: aload_0
/*     */     //   356: iload_3
/*     */     //   357: bipush #63
/*     */     //   359: iand
/*     */     //   360: sipush #128
/*     */     //   363: ior
/*     */     //   364: lload #4
/*     */     //   366: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   369: lload_1
/*     */     //   370: lconst_0
/*     */     //   371: lcmp
/*     */     //   372: iflt -> 556
/*     */     //   375: pop
/*     */     //   376: iload #6
/*     */     //   378: ifeq -> 555
/*     */     //   381: goto -> 394
/*     */     //   384: ldc2_w -2213519358962651087
/*     */     //   387: lload_1
/*     */     //   388: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   393: athrow
/*     */     //   394: iload_3
/*     */     //   395: ldc_w 1114111
/*     */     //   398: goto -> 411
/*     */     //   401: ldc2_w -2213519358962651087
/*     */     //   404: lload_1
/*     */     //   405: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   410: athrow
/*     */     //   411: if_icmpgt -> 504
/*     */     //   414: aload_0
/*     */     //   415: iload_3
/*     */     //   416: bipush #18
/*     */     //   418: ishr
/*     */     //   419: sipush #240
/*     */     //   422: ior
/*     */     //   423: lload #4
/*     */     //   425: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   428: pop
/*     */     //   429: aload_0
/*     */     //   430: iload_3
/*     */     //   431: bipush #12
/*     */     //   433: ishr
/*     */     //   434: bipush #63
/*     */     //   436: iand
/*     */     //   437: sipush #128
/*     */     //   440: ior
/*     */     //   441: lload #4
/*     */     //   443: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   446: pop
/*     */     //   447: aload_0
/*     */     //   448: iload_3
/*     */     //   449: bipush #6
/*     */     //   451: ishr
/*     */     //   452: bipush #63
/*     */     //   454: iand
/*     */     //   455: sipush #128
/*     */     //   458: ior
/*     */     //   459: lload #4
/*     */     //   461: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   464: pop
/*     */     //   465: aload_0
/*     */     //   466: iload_3
/*     */     //   467: bipush #63
/*     */     //   469: iand
/*     */     //   470: sipush #128
/*     */     //   473: ior
/*     */     //   474: lload #4
/*     */     //   476: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   479: lload_1
/*     */     //   480: lconst_0
/*     */     //   481: lcmp
/*     */     //   482: ifle -> 556
/*     */     //   485: pop
/*     */     //   486: iload #6
/*     */     //   488: ifeq -> 555
/*     */     //   491: goto -> 504
/*     */     //   494: ldc2_w -2213519358962651087
/*     */     //   497: lload_1
/*     */     //   498: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   503: athrow
/*     */     //   504: new java/lang/IllegalArgumentException
/*     */     //   507: dup
/*     */     //   508: new java/lang/StringBuilder
/*     */     //   511: dup
/*     */     //   512: invokespecial <init> : ()V
/*     */     //   515: sipush #15066
/*     */     //   518: ldc2_w 7848735061454568852
/*     */     //   521: lload_1
/*     */     //   522: lxor
/*     */     //   523: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   528: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   531: iload_3
/*     */     //   532: invokestatic toHexString : (I)Ljava/lang/String;
/*     */     //   535: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   538: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   541: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   544: athrow
/*     */     //   545: ldc2_w -2213519358962651087
/*     */     //   548: lload_1
/*     */     //   549: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   554: athrow
/*     */     //   555: aload_0
/*     */     //   556: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #547	-> 26
/*     */     //   #597	-> 51
/*     */     //   #315	-> 83
/*     */     //   #321	-> 127
/*     */     //   #430	-> 142
/*     */     //   #79	-> 181
/*     */     //   #377	-> 225
/*     */     //   #241	-> 289
/*     */     //   #202	-> 322
/*     */     //   #558	-> 337
/*     */     //   #304	-> 355
/*     */     //   #128	-> 394
/*     */     //   #588	-> 414
/*     */     //   #378	-> 429
/*     */     //   #542	-> 447
/*     */     //   #338	-> 465
/*     */     //   #435	-> 504
/*     */     //   #76	-> 532
/*     */     //   #84	-> 555
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	38	41	java/lang/IllegalArgumentException
/*     */     //   35	70	73	java/lang/IllegalArgumentException
/*     */     //   51	87	90	java/lang/IllegalArgumentException
/*     */     //   100	114	117	java/lang/IllegalArgumentException
/*     */     //   111	168	171	java/lang/IllegalArgumentException
/*     */     //   127	185	188	java/lang/IllegalArgumentException
/*     */     //   198	212	215	java/lang/IllegalArgumentException
/*     */     //   209	240	243	java/lang/IllegalArgumentException
/*     */     //   225	256	259	java/lang/IllegalArgumentException
/*     */     //   253	273	276	java/lang/IllegalArgumentException
/*     */     //   286	309	312	java/lang/IllegalArgumentException
/*     */     //   289	381	384	java/lang/IllegalArgumentException
/*     */     //   322	398	401	java/lang/IllegalArgumentException
/*     */     //   411	491	494	java/lang/IllegalArgumentException
/*     */     //   414	545	545	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public fw c(int paramInt, long paramLong) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x48197016BD93L;
/*     */     return b(l, cc.a(paramInt));
/*     */   }
/*     */   
/*     */   public final gZ c(char paramChar1, char paramChar2, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #32
/*     */     //   18: lshl
/*     */     //   19: bipush #32
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/fw.f : J
/*     */     //   26: lxor
/*     */     //   27: lstore #4
/*     */     //   29: lload #4
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 138328826244638
/*     */     //   35: lxor
/*     */     //   36: lstore #6
/*     */     //   38: pop2
/*     */     //   39: aload_0
/*     */     //   40: sipush #25438
/*     */     //   43: ldc2_w 2403426912873904974
/*     */     //   46: lload #4
/*     */     //   48: lxor
/*     */     //   49: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   54: lload #6
/*     */     //   56: invokespecial a : (Ljava/lang/String;J)Lme/konsolas/aac/gZ;
/*     */     //   59: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #569	-> 39
/*     */   }
/*     */   
/*     */   public String b(long paramLong1, long paramLong2) {
/*     */     long l = paramLong2 ^ 0x14FF05F69139L;
/*     */     return a(paramLong1, l, cc.a);
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, char paramChar, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: lstore #4
/*     */     //   25: aload_0
/*     */     //   26: getfield a : J
/*     */     //   29: lconst_0
/*     */     //   30: lcmp
/*     */     //   31: ifne -> 49
/*     */     //   34: iconst_1
/*     */     //   35: goto -> 50
/*     */     //   38: ldc2_w 599171524085504294
/*     */     //   41: lload #4
/*     */     //   43: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   48: athrow
/*     */     //   49: iconst_0
/*     */     //   50: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #581	-> 25
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   25	38	38	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public long a(long paramLong, gZ paramgZ) {
/*     */     long l = paramLong ^ 0x1825ADC869CFL;
/*     */     return a(paramgZ, 0L, l);
/*     */   }
/*     */   
/*     */   public final gG b(long paramLong, gG paramgG) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 733881404810277479
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore #4
/*     */     //   17: aload_3
/*     */     //   18: iload #4
/*     */     //   20: ifeq -> 84
/*     */     //   23: getfield e : Lme/konsolas/aac/fw;
/*     */     //   26: ifnull -> 73
/*     */     //   29: goto -> 42
/*     */     //   32: ldc2_w 734000298942683993
/*     */     //   35: lload_1
/*     */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   41: athrow
/*     */     //   42: new java/lang/IllegalStateException
/*     */     //   45: dup
/*     */     //   46: sipush #23543
/*     */     //   49: ldc2_w 6561251688260712445
/*     */     //   52: lload_1
/*     */     //   53: lxor
/*     */     //   54: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   59: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   62: athrow
/*     */     //   63: ldc2_w 734000298942683993
/*     */     //   66: lload_1
/*     */     //   67: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   72: athrow
/*     */     //   73: aload_3
/*     */     //   74: aload_0
/*     */     //   75: putfield e : Lme/konsolas/aac/fw;
/*     */     //   78: aload_3
/*     */     //   79: iconst_0
/*     */     //   80: putfield d : Z
/*     */     //   83: aload_3
/*     */     //   84: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #600	-> 17
/*     */     //   #123	-> 42
/*     */     //   #182	-> 73
/*     */     //   #711	-> 78
/*     */     //   #82	-> 83
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	29	32	java/lang/IllegalArgumentException
/*     */     //   23	63	63	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public long a(byte paramByte, long paramLong1, long paramLong2, long paramLong3) {
/*     */     // Byte code:
/*     */     //   0: ldc2_w -3420191871817291583
/*     */     //   3: lload #6
/*     */     //   5: <illegal opcode> w : (JJ)I
/*     */     //   10: istore #8
/*     */     //   12: lload_2
/*     */     //   13: lconst_0
/*     */     //   14: lcmp
/*     */     //   15: iload #8
/*     */     //   17: lload #6
/*     */     //   19: lconst_0
/*     */     //   20: lcmp
/*     */     //   21: ifle -> 64
/*     */     //   24: ifeq -> 62
/*     */     //   27: iflt -> 91
/*     */     //   30: goto -> 44
/*     */     //   33: ldc2_w -3419923437649427969
/*     */     //   36: lload #6
/*     */     //   38: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   43: athrow
/*     */     //   44: lload #4
/*     */     //   46: lload_2
/*     */     //   47: lcmp
/*     */     //   48: goto -> 62
/*     */     //   51: ldc2_w -3419923437649427969
/*     */     //   54: lload #6
/*     */     //   56: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   61: athrow
/*     */     //   62: iload #8
/*     */     //   64: lload #6
/*     */     //   66: lconst_0
/*     */     //   67: lcmp
/*     */     //   68: ifle -> 165
/*     */     //   71: ifeq -> 163
/*     */     //   74: ifge -> 156
/*     */     //   77: goto -> 91
/*     */     //   80: ldc2_w -3419923437649427969
/*     */     //   83: lload #6
/*     */     //   85: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   90: athrow
/*     */     //   91: new java/lang/IllegalArgumentException
/*     */     //   94: dup
/*     */     //   95: sipush #21298
/*     */     //   98: ldc2_w 1627874188341536133
/*     */     //   101: lload #6
/*     */     //   103: lxor
/*     */     //   104: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   109: iconst_3
/*     */     //   110: anewarray java/lang/Object
/*     */     //   113: dup
/*     */     //   114: iconst_0
/*     */     //   115: aload_0
/*     */     //   116: getfield a : J
/*     */     //   119: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   122: aastore
/*     */     //   123: dup
/*     */     //   124: iconst_1
/*     */     //   125: lload_2
/*     */     //   126: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   129: aastore
/*     */     //   130: dup
/*     */     //   131: iconst_2
/*     */     //   132: lload #4
/*     */     //   134: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   137: aastore
/*     */     //   138: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   141: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   144: athrow
/*     */     //   145: ldc2_w -3419923437649427969
/*     */     //   148: lload #6
/*     */     //   150: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   155: athrow
/*     */     //   156: lload #4
/*     */     //   158: aload_0
/*     */     //   159: getfield a : J
/*     */     //   162: lcmp
/*     */     //   163: iload #8
/*     */     //   165: ifeq -> 214
/*     */     //   168: ifle -> 191
/*     */     //   171: goto -> 185
/*     */     //   174: ldc2_w -3419923437649427969
/*     */     //   177: lload #6
/*     */     //   179: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   184: athrow
/*     */     //   185: aload_0
/*     */     //   186: getfield a : J
/*     */     //   189: lstore #4
/*     */     //   191: lload_2
/*     */     //   192: iload #8
/*     */     //   194: ifeq -> 220
/*     */     //   197: lload #4
/*     */     //   199: lcmp
/*     */     //   200: goto -> 214
/*     */     //   203: ldc2_w -3419923437649427969
/*     */     //   206: lload #6
/*     */     //   208: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   213: athrow
/*     */     //   214: ifne -> 221
/*     */     //   217: ldc2_w -1
/*     */     //   220: lreturn
/*     */     //   221: aload_0
/*     */     //   222: getfield b : Lme/konsolas/aac/eV;
/*     */     //   225: astore #9
/*     */     //   227: lload #6
/*     */     //   229: lconst_0
/*     */     //   230: lcmp
/*     */     //   231: ifle -> 254
/*     */     //   234: aload #9
/*     */     //   236: ifnonnull -> 254
/*     */     //   239: ldc2_w -1
/*     */     //   242: lreturn
/*     */     //   243: ldc2_w -3419923437649427969
/*     */     //   246: lload #6
/*     */     //   248: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   253: athrow
/*     */     //   254: aload_0
/*     */     //   255: getfield a : J
/*     */     //   258: lload_2
/*     */     //   259: lload #6
/*     */     //   261: lconst_0
/*     */     //   262: lcmp
/*     */     //   263: ifle -> 273
/*     */     //   266: lsub
/*     */     //   267: iload #8
/*     */     //   269: ifeq -> 367
/*     */     //   272: lload_2
/*     */     //   273: lcmp
/*     */     //   274: ifge -> 366
/*     */     //   277: goto -> 291
/*     */     //   280: ldc2_w -3419923437649427969
/*     */     //   283: lload #6
/*     */     //   285: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   290: athrow
/*     */     //   291: aload_0
/*     */     //   292: getfield a : J
/*     */     //   295: lstore #10
/*     */     //   297: lload #10
/*     */     //   299: lload_2
/*     */     //   300: lcmp
/*     */     //   301: ifle -> 441
/*     */     //   304: aload #9
/*     */     //   306: getfield e : Lme/konsolas/aac/eV;
/*     */     //   309: astore #9
/*     */     //   311: lload #10
/*     */     //   313: aload #9
/*     */     //   315: getfield c : I
/*     */     //   318: aload #9
/*     */     //   320: getfield d : I
/*     */     //   323: isub
/*     */     //   324: i2l
/*     */     //   325: lsub
/*     */     //   326: lstore #10
/*     */     //   328: iload #8
/*     */     //   330: lload #6
/*     */     //   332: lconst_0
/*     */     //   333: lcmp
/*     */     //   334: iflt -> 342
/*     */     //   337: ifeq -> 627
/*     */     //   340: iload #8
/*     */     //   342: ifne -> 297
/*     */     //   345: lload #6
/*     */     //   347: lconst_0
/*     */     //   348: lcmp
/*     */     //   349: ifle -> 328
/*     */     //   352: goto -> 366
/*     */     //   355: ldc2_w -3419923437649427969
/*     */     //   358: lload #6
/*     */     //   360: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   365: athrow
/*     */     //   366: lconst_0
/*     */     //   367: lstore #10
/*     */     //   369: lload #10
/*     */     //   371: aload #9
/*     */     //   373: getfield c : I
/*     */     //   376: aload #9
/*     */     //   378: getfield d : I
/*     */     //   381: isub
/*     */     //   382: i2l
/*     */     //   383: ladd
/*     */     //   384: dup2
/*     */     //   385: lstore #12
/*     */     //   387: lload_2
/*     */     //   388: lcmp
/*     */     //   389: ifge -> 441
/*     */     //   392: aload #9
/*     */     //   394: getfield b : Lme/konsolas/aac/eV;
/*     */     //   397: astore #9
/*     */     //   399: lload #12
/*     */     //   401: lstore #10
/*     */     //   403: iload #8
/*     */     //   405: lload #6
/*     */     //   407: lconst_0
/*     */     //   408: lcmp
/*     */     //   409: ifle -> 417
/*     */     //   412: ifeq -> 627
/*     */     //   415: iload #8
/*     */     //   417: ifne -> 369
/*     */     //   420: lload #6
/*     */     //   422: lconst_0
/*     */     //   423: lcmp
/*     */     //   424: ifle -> 403
/*     */     //   427: goto -> 441
/*     */     //   430: ldc2_w -3419923437649427969
/*     */     //   433: lload #6
/*     */     //   435: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   440: athrow
/*     */     //   441: lload #10
/*     */     //   443: lload #4
/*     */     //   445: lcmp
/*     */     //   446: ifge -> 627
/*     */     //   449: aload #9
/*     */     //   451: getfield h : [B
/*     */     //   454: astore #12
/*     */     //   456: aload #9
/*     */     //   458: getfield c : I
/*     */     //   461: i2l
/*     */     //   462: aload #9
/*     */     //   464: getfield d : I
/*     */     //   467: i2l
/*     */     //   468: lload #4
/*     */     //   470: ladd
/*     */     //   471: lload #10
/*     */     //   473: lsub
/*     */     //   474: invokestatic min : (JJ)J
/*     */     //   477: l2i
/*     */     //   478: istore #13
/*     */     //   480: aload #9
/*     */     //   482: getfield d : I
/*     */     //   485: lload #6
/*     */     //   487: lconst_0
/*     */     //   488: lcmp
/*     */     //   489: ifle -> 504
/*     */     //   492: i2l
/*     */     //   493: lload_2
/*     */     //   494: ladd
/*     */     //   495: lload #10
/*     */     //   497: lsub
/*     */     //   498: iload #8
/*     */     //   500: ifeq -> 630
/*     */     //   503: l2i
/*     */     //   504: istore #14
/*     */     //   506: iload #14
/*     */     //   508: iload #13
/*     */     //   510: if_icmpge -> 588
/*     */     //   513: aload #12
/*     */     //   515: iload #14
/*     */     //   517: baload
/*     */     //   518: iload_1
/*     */     //   519: iload #8
/*     */     //   521: ifeq -> 510
/*     */     //   524: iload #8
/*     */     //   526: lload #6
/*     */     //   528: lconst_0
/*     */     //   529: lcmp
/*     */     //   530: ifle -> 521
/*     */     //   533: ifeq -> 574
/*     */     //   536: if_icmpne -> 580
/*     */     //   539: goto -> 553
/*     */     //   542: ldc2_w -3419923437649427969
/*     */     //   545: lload #6
/*     */     //   547: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   552: athrow
/*     */     //   553: iload #14
/*     */     //   555: aload #9
/*     */     //   557: getfield d : I
/*     */     //   560: goto -> 574
/*     */     //   563: ldc2_w -3419923437649427969
/*     */     //   566: lload #6
/*     */     //   568: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   573: athrow
/*     */     //   574: isub
/*     */     //   575: i2l
/*     */     //   576: lload #10
/*     */     //   578: ladd
/*     */     //   579: lreturn
/*     */     //   580: iinc #14, 1
/*     */     //   583: iload #8
/*     */     //   585: ifne -> 506
/*     */     //   588: lload #10
/*     */     //   590: aload #9
/*     */     //   592: getfield c : I
/*     */     //   595: aload #9
/*     */     //   597: getfield d : I
/*     */     //   600: isub
/*     */     //   601: i2l
/*     */     //   602: ladd
/*     */     //   603: lstore #10
/*     */     //   605: lload #10
/*     */     //   607: lstore_2
/*     */     //   608: aload #9
/*     */     //   610: getfield b : Lme/konsolas/aac/eV;
/*     */     //   613: astore #9
/*     */     //   615: iload #8
/*     */     //   617: lload #6
/*     */     //   619: lconst_0
/*     */     //   620: lcmp
/*     */     //   621: ifle -> 518
/*     */     //   624: ifne -> 441
/*     */     //   627: ldc2_w -1
/*     */     //   630: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #618	-> 12
/*     */     //   #258	-> 91
/*     */     //   #140	-> 119
/*     */     //   #518	-> 156
/*     */     //   #539	-> 191
/*     */     //   #641	-> 221
/*     */     //   #849	-> 227
/*     */     //   #385	-> 239
/*     */     //   #400	-> 254
/*     */     //   #837	-> 291
/*     */     //   #352	-> 297
/*     */     //   #577	-> 304
/*     */     //   #676	-> 311
/*     */     //   #388	-> 366
/*     */     //   #353	-> 369
/*     */     //   #752	-> 392
/*     */     //   #322	-> 399
/*     */     //   #556	-> 441
/*     */     //   #817	-> 449
/*     */     //   #133	-> 456
/*     */     //   #803	-> 480
/*     */     //   #851	-> 506
/*     */     //   #615	-> 513
/*     */     //   #69	-> 553
/*     */     //   #124	-> 580
/*     */     //   #922	-> 588
/*     */     //   #739	-> 605
/*     */     //   #302	-> 608
/*     */     //   #66	-> 615
/*     */     //   #736	-> 627
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	30	33	java/lang/IllegalArgumentException
/*     */     //   27	48	51	java/lang/IllegalArgumentException
/*     */     //   62	77	80	java/lang/IllegalArgumentException
/*     */     //   74	145	145	java/lang/IllegalArgumentException
/*     */     //   163	171	174	java/lang/IllegalArgumentException
/*     */     //   191	200	203	java/lang/IllegalArgumentException
/*     */     //   227	243	243	java/lang/IllegalArgumentException
/*     */     //   254	277	280	java/lang/IllegalArgumentException
/*     */     //   328	345	355	java/lang/IllegalArgumentException
/*     */     //   403	420	430	java/lang/IllegalArgumentException
/*     */     //   524	539	542	java/lang/IllegalArgumentException
/*     */     //   536	560	563	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   int a(ag paramag, long paramLong, boolean paramBoolean) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: ldc2_w -1528645337389935999
/*     */     //   9: lload_2
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: aload_0
/*     */     //   16: getfield b : Lme/konsolas/aac/eV;
/*     */     //   19: astore #6
/*     */     //   21: istore #5
/*     */     //   23: aload #6
/*     */     //   25: iload #5
/*     */     //   27: ifeq -> 105
/*     */     //   30: ifnonnull -> 103
/*     */     //   33: goto -> 46
/*     */     //   36: ldc2_w -1528447091080578113
/*     */     //   39: lload_2
/*     */     //   40: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   45: athrow
/*     */     //   46: iload #4
/*     */     //   48: iload #5
/*     */     //   50: ifeq -> 102
/*     */     //   53: goto -> 66
/*     */     //   56: ldc2_w -1528447091080578113
/*     */     //   59: lload_2
/*     */     //   60: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   65: athrow
/*     */     //   66: ifeq -> 95
/*     */     //   69: goto -> 82
/*     */     //   72: ldc2_w -1528447091080578113
/*     */     //   75: lload_2
/*     */     //   76: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   81: athrow
/*     */     //   82: bipush #-2
/*     */     //   84: ireturn
/*     */     //   85: ldc2_w -1528447091080578113
/*     */     //   88: lload_2
/*     */     //   89: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   94: athrow
/*     */     //   95: aload_1
/*     */     //   96: getstatic me/konsolas/aac/gZ.a : Lme/konsolas/aac/gZ;
/*     */     //   99: invokevirtual indexOf : (Ljava/lang/Object;)I
/*     */     //   102: ireturn
/*     */     //   103: aload #6
/*     */     //   105: astore #7
/*     */     //   107: aload #6
/*     */     //   109: getfield h : [B
/*     */     //   112: astore #8
/*     */     //   114: aload #6
/*     */     //   116: getfield d : I
/*     */     //   119: istore #9
/*     */     //   121: aload #6
/*     */     //   123: getfield c : I
/*     */     //   126: istore #10
/*     */     //   128: aload_1
/*     */     //   129: getfield b : [I
/*     */     //   132: astore #11
/*     */     //   134: iconst_0
/*     */     //   135: istore #12
/*     */     //   137: iconst_m1
/*     */     //   138: istore #13
/*     */     //   140: aload #11
/*     */     //   142: iload #12
/*     */     //   144: iinc #12, 1
/*     */     //   147: iaload
/*     */     //   148: istore #14
/*     */     //   150: aload #11
/*     */     //   152: iload #12
/*     */     //   154: iinc #12, 1
/*     */     //   157: iaload
/*     */     //   158: istore #15
/*     */     //   160: iload #15
/*     */     //   162: iconst_m1
/*     */     //   163: if_icmpeq -> 181
/*     */     //   166: iload #15
/*     */     //   168: iload #5
/*     */     //   170: lload_2
/*     */     //   171: lconst_0
/*     */     //   172: lcmp
/*     */     //   173: ifle -> 233
/*     */     //   176: ifeq -> 231
/*     */     //   179: istore #13
/*     */     //   181: lload_2
/*     */     //   182: lconst_0
/*     */     //   183: lcmp
/*     */     //   184: iflt -> 192
/*     */     //   187: aload #7
/*     */     //   189: ifnonnull -> 216
/*     */     //   192: iload #5
/*     */     //   194: lload_2
/*     */     //   195: lconst_0
/*     */     //   196: lcmp
/*     */     //   197: ifle -> 887
/*     */     //   200: ifne -> 885
/*     */     //   203: goto -> 216
/*     */     //   206: ldc2_w -1528447091080578113
/*     */     //   209: lload_2
/*     */     //   210: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   215: athrow
/*     */     //   216: iload #14
/*     */     //   218: goto -> 231
/*     */     //   221: ldc2_w -1528447091080578113
/*     */     //   224: lload_2
/*     */     //   225: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   230: athrow
/*     */     //   231: iload #5
/*     */     //   233: ifeq -> 596
/*     */     //   236: ifge -> 581
/*     */     //   239: goto -> 252
/*     */     //   242: ldc2_w -1528447091080578113
/*     */     //   245: lload_2
/*     */     //   246: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   251: athrow
/*     */     //   252: iconst_m1
/*     */     //   253: iload #14
/*     */     //   255: imul
/*     */     //   256: istore #17
/*     */     //   258: iload #12
/*     */     //   260: iload #17
/*     */     //   262: iadd
/*     */     //   263: istore #18
/*     */     //   265: aload #8
/*     */     //   267: iload #9
/*     */     //   269: iinc #9, 1
/*     */     //   272: baload
/*     */     //   273: sipush #255
/*     */     //   276: iand
/*     */     //   277: istore #19
/*     */     //   279: iload #19
/*     */     //   281: aload #11
/*     */     //   283: iload #12
/*     */     //   285: iinc #12, 1
/*     */     //   288: iaload
/*     */     //   289: if_icmpeq -> 335
/*     */     //   292: iload #13
/*     */     //   294: iload #5
/*     */     //   296: lload_2
/*     */     //   297: lconst_0
/*     */     //   298: lcmp
/*     */     //   299: ifle -> 339
/*     */     //   302: lload_2
/*     */     //   303: lconst_0
/*     */     //   304: lcmp
/*     */     //   305: iflt -> 339
/*     */     //   308: ifeq -> 337
/*     */     //   311: goto -> 324
/*     */     //   314: ldc2_w -1528447091080578113
/*     */     //   317: lload_2
/*     */     //   318: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   323: athrow
/*     */     //   324: ireturn
/*     */     //   325: ldc2_w -1528447091080578113
/*     */     //   328: lload_2
/*     */     //   329: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   334: athrow
/*     */     //   335: iload #12
/*     */     //   337: iload #5
/*     */     //   339: lload_2
/*     */     //   340: lconst_0
/*     */     //   341: lcmp
/*     */     //   342: ifle -> 350
/*     */     //   345: ifeq -> 380
/*     */     //   348: iload #18
/*     */     //   350: if_icmpne -> 383
/*     */     //   353: goto -> 366
/*     */     //   356: ldc2_w -1528447091080578113
/*     */     //   359: lload_2
/*     */     //   360: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   365: athrow
/*     */     //   366: iconst_1
/*     */     //   367: goto -> 380
/*     */     //   370: ldc2_w -1528447091080578113
/*     */     //   373: lload_2
/*     */     //   374: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   379: athrow
/*     */     //   380: goto -> 384
/*     */     //   383: iconst_0
/*     */     //   384: istore #20
/*     */     //   386: iload #9
/*     */     //   388: iload #5
/*     */     //   390: lload_2
/*     */     //   391: lconst_0
/*     */     //   392: lcmp
/*     */     //   393: ifle -> 401
/*     */     //   396: ifeq -> 505
/*     */     //   399: iload #10
/*     */     //   401: if_icmpne -> 503
/*     */     //   404: goto -> 417
/*     */     //   407: ldc2_w -1528447091080578113
/*     */     //   410: lload_2
/*     */     //   411: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   416: athrow
/*     */     //   417: aload #7
/*     */     //   419: getfield b : Lme/konsolas/aac/eV;
/*     */     //   422: astore #7
/*     */     //   424: aload #7
/*     */     //   426: getfield d : I
/*     */     //   429: istore #9
/*     */     //   431: aload #7
/*     */     //   433: getfield h : [B
/*     */     //   436: astore #8
/*     */     //   438: aload #7
/*     */     //   440: getfield c : I
/*     */     //   443: iload #5
/*     */     //   445: lload_2
/*     */     //   446: lconst_0
/*     */     //   447: lcmp
/*     */     //   448: ifle -> 507
/*     */     //   451: ifeq -> 505
/*     */     //   454: istore #10
/*     */     //   456: lload_2
/*     */     //   457: lconst_0
/*     */     //   458: lcmp
/*     */     //   459: iflt -> 469
/*     */     //   462: aload #7
/*     */     //   464: aload #6
/*     */     //   466: if_acmpne -> 503
/*     */     //   469: iload #20
/*     */     //   471: ifne -> 500
/*     */     //   474: goto -> 487
/*     */     //   477: ldc2_w -1528447091080578113
/*     */     //   480: lload_2
/*     */     //   481: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   486: athrow
/*     */     //   487: goto -> 885
/*     */     //   490: ldc2_w -1528447091080578113
/*     */     //   493: lload_2
/*     */     //   494: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   499: athrow
/*     */     //   500: aconst_null
/*     */     //   501: astore #7
/*     */     //   503: iload #20
/*     */     //   505: iload #5
/*     */     //   507: ifeq -> 544
/*     */     //   510: ifeq -> 557
/*     */     //   513: goto -> 526
/*     */     //   516: ldc2_w -1528447091080578113
/*     */     //   519: lload_2
/*     */     //   520: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   525: athrow
/*     */     //   526: aload #11
/*     */     //   528: iload #12
/*     */     //   530: iaload
/*     */     //   531: goto -> 544
/*     */     //   534: ldc2_w -1528447091080578113
/*     */     //   537: lload_2
/*     */     //   538: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   543: athrow
/*     */     //   544: istore #16
/*     */     //   546: iload #5
/*     */     //   548: lload_2
/*     */     //   549: lconst_0
/*     */     //   550: lcmp
/*     */     //   551: iflt -> 572
/*     */     //   554: ifne -> 570
/*     */     //   557: goto -> 265
/*     */     //   560: ldc2_w -1528447091080578113
/*     */     //   563: lload_2
/*     */     //   564: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   569: athrow
/*     */     //   570: iload #5
/*     */     //   572: lload_2
/*     */     //   573: lconst_0
/*     */     //   574: lcmp
/*     */     //   575: ifle -> 583
/*     */     //   578: ifne -> 833
/*     */     //   581: iload #14
/*     */     //   583: goto -> 596
/*     */     //   586: ldc2_w -1528447091080578113
/*     */     //   589: lload_2
/*     */     //   590: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   595: athrow
/*     */     //   596: istore #17
/*     */     //   598: aload #8
/*     */     //   600: iload #9
/*     */     //   602: iinc #9, 1
/*     */     //   605: baload
/*     */     //   606: sipush #255
/*     */     //   609: iand
/*     */     //   610: istore #18
/*     */     //   612: iload #12
/*     */     //   614: iload #17
/*     */     //   616: iadd
/*     */     //   617: istore #19
/*     */     //   619: iload #12
/*     */     //   621: iload #19
/*     */     //   623: if_icmpne -> 669
/*     */     //   626: iload #13
/*     */     //   628: iload #5
/*     */     //   630: lload_2
/*     */     //   631: lconst_0
/*     */     //   632: lcmp
/*     */     //   633: ifle -> 673
/*     */     //   636: lload_2
/*     */     //   637: lconst_0
/*     */     //   638: lcmp
/*     */     //   639: ifle -> 673
/*     */     //   642: ifeq -> 671
/*     */     //   645: goto -> 658
/*     */     //   648: ldc2_w -1528447091080578113
/*     */     //   651: lload_2
/*     */     //   652: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   657: athrow
/*     */     //   658: ireturn
/*     */     //   659: ldc2_w -1528447091080578113
/*     */     //   662: lload_2
/*     */     //   663: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   668: athrow
/*     */     //   669: iload #18
/*     */     //   671: iload #5
/*     */     //   673: lload_2
/*     */     //   674: lconst_0
/*     */     //   675: lcmp
/*     */     //   676: ifle -> 687
/*     */     //   679: ifeq -> 724
/*     */     //   682: aload #11
/*     */     //   684: iload #12
/*     */     //   686: iaload
/*     */     //   687: if_icmpne -> 737
/*     */     //   690: goto -> 703
/*     */     //   693: ldc2_w -1528447091080578113
/*     */     //   696: lload_2
/*     */     //   697: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   702: athrow
/*     */     //   703: aload #11
/*     */     //   705: iload #12
/*     */     //   707: iload #17
/*     */     //   709: iadd
/*     */     //   710: iaload
/*     */     //   711: goto -> 724
/*     */     //   714: ldc2_w -1528447091080578113
/*     */     //   717: lload_2
/*     */     //   718: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   723: athrow
/*     */     //   724: istore #16
/*     */     //   726: iload #5
/*     */     //   728: lload_2
/*     */     //   729: lconst_0
/*     */     //   730: lcmp
/*     */     //   731: iflt -> 755
/*     */     //   734: ifne -> 753
/*     */     //   737: iinc #12, 1
/*     */     //   740: goto -> 619
/*     */     //   743: ldc2_w -1528447091080578113
/*     */     //   746: lload_2
/*     */     //   747: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   752: athrow
/*     */     //   753: iload #9
/*     */     //   755: iload #5
/*     */     //   757: lload_2
/*     */     //   758: lconst_0
/*     */     //   759: lcmp
/*     */     //   760: iflt -> 768
/*     */     //   763: ifeq -> 835
/*     */     //   766: iload #10
/*     */     //   768: if_icmpne -> 833
/*     */     //   771: goto -> 784
/*     */     //   774: ldc2_w -1528447091080578113
/*     */     //   777: lload_2
/*     */     //   778: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   783: athrow
/*     */     //   784: aload #7
/*     */     //   786: getfield b : Lme/konsolas/aac/eV;
/*     */     //   789: astore #7
/*     */     //   791: aload #7
/*     */     //   793: getfield d : I
/*     */     //   796: istore #9
/*     */     //   798: aload #7
/*     */     //   800: getfield h : [B
/*     */     //   803: astore #8
/*     */     //   805: aload #7
/*     */     //   807: getfield c : I
/*     */     //   810: iload #5
/*     */     //   812: lload_2
/*     */     //   813: lconst_0
/*     */     //   814: lcmp
/*     */     //   815: iflt -> 843
/*     */     //   818: ifeq -> 835
/*     */     //   821: istore #10
/*     */     //   823: aload #7
/*     */     //   825: aload #6
/*     */     //   827: if_acmpne -> 833
/*     */     //   830: aconst_null
/*     */     //   831: astore #7
/*     */     //   833: iload #16
/*     */     //   835: lload_2
/*     */     //   836: lconst_0
/*     */     //   837: lcmp
/*     */     //   838: ifle -> 882
/*     */     //   841: iload #5
/*     */     //   843: ifeq -> 878
/*     */     //   846: iflt -> 875
/*     */     //   849: goto -> 862
/*     */     //   852: ldc2_w -1528447091080578113
/*     */     //   855: lload_2
/*     */     //   856: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   861: athrow
/*     */     //   862: iload #16
/*     */     //   864: ireturn
/*     */     //   865: ldc2_w -1528447091080578113
/*     */     //   868: lload_2
/*     */     //   869: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   874: athrow
/*     */     //   875: iload #16
/*     */     //   877: ineg
/*     */     //   878: istore #12
/*     */     //   880: iload #5
/*     */     //   882: ifne -> 140
/*     */     //   885: iload #4
/*     */     //   887: iload #5
/*     */     //   889: lload_2
/*     */     //   890: lconst_0
/*     */     //   891: lcmp
/*     */     //   892: iflt -> 170
/*     */     //   895: ifeq -> 929
/*     */     //   898: ifeq -> 927
/*     */     //   901: goto -> 914
/*     */     //   904: ldc2_w -1528447091080578113
/*     */     //   907: lload_2
/*     */     //   908: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   913: athrow
/*     */     //   914: bipush #-2
/*     */     //   916: ireturn
/*     */     //   917: ldc2_w -1528447091080578113
/*     */     //   920: lload_2
/*     */     //   921: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   926: athrow
/*     */     //   927: iload #13
/*     */     //   929: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #626	-> 15
/*     */     //   #534	-> 23
/*     */     //   #537	-> 46
/*     */     //   #23	-> 95
/*     */     //   #93	-> 103
/*     */     //   #394	-> 107
/*     */     //   #679	-> 114
/*     */     //   #574	-> 121
/*     */     //   #90	-> 128
/*     */     //   #868	-> 134
/*     */     //   #274	-> 137
/*     */     //   #826	-> 140
/*     */     //   #917	-> 150
/*     */     //   #930	-> 160
/*     */     //   #246	-> 166
/*     */     //   #13	-> 181
/*     */     //   #861	-> 192
/*     */     //   #578	-> 216
/*     */     //   #5	-> 252
/*     */     //   #551	-> 258
/*     */     //   #234	-> 265
/*     */     //   #497	-> 279
/*     */     //   #818	-> 335
/*     */     //   #418	-> 386
/*     */     //   #913	-> 417
/*     */     //   #44	-> 424
/*     */     //   #521	-> 431
/*     */     //   #67	-> 438
/*     */     //   #828	-> 456
/*     */     //   #153	-> 469
/*     */     //   #904	-> 500
/*     */     //   #107	-> 503
/*     */     //   #933	-> 526
/*     */     //   #317	-> 546
/*     */     //   #649	-> 557
/*     */     //   #585	-> 570
/*     */     //   #807	-> 581
/*     */     //   #541	-> 598
/*     */     //   #172	-> 612
/*     */     //   #548	-> 619
/*     */     //   #12	-> 669
/*     */     //   #520	-> 703
/*     */     //   #223	-> 726
/*     */     //   #659	-> 737
/*     */     //   #831	-> 753
/*     */     //   #602	-> 784
/*     */     //   #557	-> 791
/*     */     //   #875	-> 798
/*     */     //   #702	-> 805
/*     */     //   #137	-> 823
/*     */     //   #362	-> 830
/*     */     //   #673	-> 833
/*     */     //   #41	-> 875
/*     */     //   #10	-> 880
/*     */     //   #91	-> 885
/*     */     //   #229	-> 927
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   23	33	36	java/lang/IllegalArgumentException
/*     */     //   30	53	56	java/lang/IllegalArgumentException
/*     */     //   46	69	72	java/lang/IllegalArgumentException
/*     */     //   66	85	85	java/lang/IllegalArgumentException
/*     */     //   181	203	206	java/lang/IllegalArgumentException
/*     */     //   192	218	221	java/lang/IllegalArgumentException
/*     */     //   231	239	242	java/lang/IllegalArgumentException
/*     */     //   279	311	314	java/lang/IllegalArgumentException
/*     */     //   292	325	325	java/lang/IllegalArgumentException
/*     */     //   337	353	356	java/lang/IllegalArgumentException
/*     */     //   348	367	370	java/lang/IllegalArgumentException
/*     */     //   386	404	407	java/lang/IllegalArgumentException
/*     */     //   456	474	477	java/lang/IllegalArgumentException
/*     */     //   469	490	490	java/lang/IllegalArgumentException
/*     */     //   505	513	516	java/lang/IllegalArgumentException
/*     */     //   510	531	534	java/lang/IllegalArgumentException
/*     */     //   546	560	560	java/lang/IllegalArgumentException
/*     */     //   570	583	586	java/lang/IllegalArgumentException
/*     */     //   619	645	648	java/lang/IllegalArgumentException
/*     */     //   626	659	659	java/lang/IllegalArgumentException
/*     */     //   671	690	693	java/lang/IllegalArgumentException
/*     */     //   682	711	714	java/lang/IllegalArgumentException
/*     */     //   726	743	743	java/lang/IllegalArgumentException
/*     */     //   753	771	774	java/lang/IllegalArgumentException
/*     */     //   835	849	852	java/lang/IllegalArgumentException
/*     */     //   846	865	865	java/lang/IllegalArgumentException
/*     */     //   885	901	904	java/lang/IllegalArgumentException
/*     */     //   898	917	917	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public long a(long paramLong, byte paramByte) {
/*     */     long l = paramLong ^ 0x533670B17DF6L;
/*     */     return a(paramByte, 0L, Long.MAX_VALUE, l);
/*     */   }
/*     */   
/*     */   public gi c(long paramLong, int paramInt) {
/*     */     long l = paramLong ^ 0x67492BA000E8L;
/*     */     return b(l, paramInt);
/*     */   }
/*     */   
/*     */   public final gZ a(int paramInt, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 23282586783509
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: iload_1
/*     */     //   16: ifne -> 33
/*     */     //   19: getstatic me/konsolas/aac/gZ.a : Lme/konsolas/aac/gZ;
/*     */     //   22: areturn
/*     */     //   23: ldc2_w -525242767721518653
/*     */     //   26: lload_2
/*     */     //   27: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   32: athrow
/*     */     //   33: new me/konsolas/aac/gA
/*     */     //   36: dup
/*     */     //   37: lload #4
/*     */     //   39: aload_0
/*     */     //   40: iload_1
/*     */     //   41: invokespecial <init> : (JLme/konsolas/aac/fw;I)V
/*     */     //   44: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #638	-> 15
/*     */     //   #874	-> 33
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   15	23	23	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public void b(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield a : J
/*     */     //   4: lload_1
/*     */     //   5: lcmp
/*     */     //   6: ifge -> 27
/*     */     //   9: new java/io/EOFException
/*     */     //   12: dup
/*     */     //   13: invokespecial <init> : ()V
/*     */     //   16: athrow
/*     */     //   17: ldc2_w 5311669354244085952
/*     */     //   20: lload_3
/*     */     //   21: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   26: athrow
/*     */     //   27: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #645	-> 0
/*     */     //   #759	-> 27
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	17	17	java/io/EOFException
/*     */   }
/*     */   
/*     */   public InputStream a() {
/*     */     return new fC(this);
/*     */   }
/*     */   
/*     */   public long a(long paramLong) {
/*     */     long l = paramLong ^ 0x7148D99BD296L;
/*     */     return cc.a(b(l));
/*     */   }
/*     */   
/*     */   eV a(long paramLong, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 135306931893190
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: iload_3
/*     */     //   16: iconst_1
/*     */     //   17: if_icmplt -> 40
/*     */     //   20: iload_3
/*     */     //   21: sipush #8192
/*     */     //   24: if_icmple -> 58
/*     */     //   27: goto -> 40
/*     */     //   30: ldc2_w 6306435349032470258
/*     */     //   33: lload_1
/*     */     //   34: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   39: athrow
/*     */     //   40: new java/lang/IllegalArgumentException
/*     */     //   43: dup
/*     */     //   44: invokespecial <init> : ()V
/*     */     //   47: athrow
/*     */     //   48: ldc2_w 6306435349032470258
/*     */     //   51: lload_1
/*     */     //   52: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   57: athrow
/*     */     //   58: aload_0
/*     */     //   59: getfield b : Lme/konsolas/aac/eV;
/*     */     //   62: lload_1
/*     */     //   63: lconst_0
/*     */     //   64: lcmp
/*     */     //   65: iflt -> 118
/*     */     //   68: ifnonnull -> 111
/*     */     //   71: aload_0
/*     */     //   72: lload #4
/*     */     //   74: invokestatic a : (J)Lme/konsolas/aac/eV;
/*     */     //   77: putfield b : Lme/konsolas/aac/eV;
/*     */     //   80: aload_0
/*     */     //   81: getfield b : Lme/konsolas/aac/eV;
/*     */     //   84: aload_0
/*     */     //   85: getfield b : Lme/konsolas/aac/eV;
/*     */     //   88: aload_0
/*     */     //   89: getfield b : Lme/konsolas/aac/eV;
/*     */     //   92: dup_x1
/*     */     //   93: putfield e : Lme/konsolas/aac/eV;
/*     */     //   96: dup_x1
/*     */     //   97: putfield b : Lme/konsolas/aac/eV;
/*     */     //   100: areturn
/*     */     //   101: ldc2_w 6306435349032470258
/*     */     //   104: lload_1
/*     */     //   105: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   110: athrow
/*     */     //   111: aload_0
/*     */     //   112: getfield b : Lme/konsolas/aac/eV;
/*     */     //   115: getfield e : Lme/konsolas/aac/eV;
/*     */     //   118: astore #6
/*     */     //   120: aload #6
/*     */     //   122: lload_1
/*     */     //   123: lconst_0
/*     */     //   124: lcmp
/*     */     //   125: ifle -> 176
/*     */     //   128: getfield c : I
/*     */     //   131: iload_3
/*     */     //   132: iadd
/*     */     //   133: sipush #8192
/*     */     //   136: if_icmpgt -> 166
/*     */     //   139: aload #6
/*     */     //   141: lload_1
/*     */     //   142: lconst_0
/*     */     //   143: lcmp
/*     */     //   144: ifle -> 180
/*     */     //   147: getfield i : Z
/*     */     //   150: ifne -> 178
/*     */     //   153: goto -> 166
/*     */     //   156: ldc2_w 6306435349032470258
/*     */     //   159: lload_1
/*     */     //   160: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   165: athrow
/*     */     //   166: aload #6
/*     */     //   168: lload #4
/*     */     //   170: invokestatic a : (J)Lme/konsolas/aac/eV;
/*     */     //   173: invokevirtual a : (Lme/konsolas/aac/eV;)Lme/konsolas/aac/eV;
/*     */     //   176: astore #6
/*     */     //   178: aload #6
/*     */     //   180: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #669	-> 15
/*     */     //   #781	-> 58
/*     */     //   #466	-> 71
/*     */     //   #920	-> 80
/*     */     //   #458	-> 111
/*     */     //   #694	-> 120
/*     */     //   #261	-> 166
/*     */     //   #672	-> 178
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   15	27	30	java/lang/IllegalArgumentException
/*     */     //   20	48	48	java/lang/IllegalArgumentException
/*     */     //   58	101	101	java/lang/IllegalArgumentException
/*     */     //   120	153	156	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   private gZ a(String paramString, long paramLong, gZ paramgZ) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 12794937027180
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 108427466865054
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 6052000978447788981
/*     */     //   25: lload_2
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: istore #9
/*     */     //   33: aload_1
/*     */     //   34: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Mac;
/*     */     //   37: astore #10
/*     */     //   39: aload #10
/*     */     //   41: iload #9
/*     */     //   43: ifeq -> 181
/*     */     //   46: new javax/crypto/spec/SecretKeySpec
/*     */     //   49: dup
/*     */     //   50: aload #4
/*     */     //   52: lload #5
/*     */     //   54: invokevirtual b : (J)[B
/*     */     //   57: aload_1
/*     */     //   58: invokespecial <init> : ([BLjava/lang/String;)V
/*     */     //   61: invokevirtual init : (Ljava/security/Key;)V
/*     */     //   64: aload_0
/*     */     //   65: getfield b : Lme/konsolas/aac/eV;
/*     */     //   68: ifnull -> 179
/*     */     //   71: goto -> 84
/*     */     //   74: ldc2_w 6052260169843933835
/*     */     //   77: lload_2
/*     */     //   78: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   83: athrow
/*     */     //   84: aload #10
/*     */     //   86: aload_0
/*     */     //   87: getfield b : Lme/konsolas/aac/eV;
/*     */     //   90: getfield h : [B
/*     */     //   93: aload_0
/*     */     //   94: getfield b : Lme/konsolas/aac/eV;
/*     */     //   97: getfield d : I
/*     */     //   100: aload_0
/*     */     //   101: getfield b : Lme/konsolas/aac/eV;
/*     */     //   104: getfield c : I
/*     */     //   107: aload_0
/*     */     //   108: getfield b : Lme/konsolas/aac/eV;
/*     */     //   111: getfield d : I
/*     */     //   114: isub
/*     */     //   115: invokevirtual update : ([BII)V
/*     */     //   118: aload_0
/*     */     //   119: getfield b : Lme/konsolas/aac/eV;
/*     */     //   122: getfield b : Lme/konsolas/aac/eV;
/*     */     //   125: astore #11
/*     */     //   127: aload #11
/*     */     //   129: aload_0
/*     */     //   130: getfield b : Lme/konsolas/aac/eV;
/*     */     //   133: if_acmpeq -> 179
/*     */     //   136: aload #10
/*     */     //   138: iload #9
/*     */     //   140: ifeq -> 181
/*     */     //   143: aload #11
/*     */     //   145: getfield h : [B
/*     */     //   148: aload #11
/*     */     //   150: getfield d : I
/*     */     //   153: aload #11
/*     */     //   155: getfield c : I
/*     */     //   158: aload #11
/*     */     //   160: getfield d : I
/*     */     //   163: isub
/*     */     //   164: invokevirtual update : ([BII)V
/*     */     //   167: aload #11
/*     */     //   169: getfield b : Lme/konsolas/aac/eV;
/*     */     //   172: astore #11
/*     */     //   174: iload #9
/*     */     //   176: ifne -> 127
/*     */     //   179: aload #10
/*     */     //   181: invokevirtual doFinal : ()[B
/*     */     //   184: lload #7
/*     */     //   186: invokestatic a : ([BJ)Lme/konsolas/aac/gZ;
/*     */     //   189: areturn
/*     */     //   190: astore #10
/*     */     //   192: new java/lang/AssertionError
/*     */     //   195: dup
/*     */     //   196: invokespecial <init> : ()V
/*     */     //   199: athrow
/*     */     //   200: astore #10
/*     */     //   202: new java/lang/IllegalArgumentException
/*     */     //   205: dup
/*     */     //   206: aload #10
/*     */     //   208: invokespecial <init> : (Ljava/lang/Throwable;)V
/*     */     //   211: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #675	-> 33
/*     */     //   #477	-> 39
/*     */     //   #624	-> 64
/*     */     //   #684	-> 84
/*     */     //   #311	-> 118
/*     */     //   #703	-> 136
/*     */     //   #747	-> 167
/*     */     //   #809	-> 179
/*     */     //   #151	-> 190
/*     */     //   #146	-> 192
/*     */     //   #169	-> 200
/*     */     //   #604	-> 202
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   33	189	190	java/security/NoSuchAlgorithmException
/*     */     //   33	189	200	java/security/InvalidKeyException
/*     */     //   39	71	74	java/security/NoSuchAlgorithmException
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String a(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 76869304684310
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 90666888207560
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 71156544916611
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w -5677207178045364466
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: aload_0
/*     */     //   32: lload #5
/*     */     //   34: bipush #10
/*     */     //   36: invokevirtual a : (JB)J
/*     */     //   39: lstore #10
/*     */     //   41: istore #9
/*     */     //   43: lload #10
/*     */     //   45: ldc2_w -1
/*     */     //   48: lcmp
/*     */     //   49: iload #9
/*     */     //   51: ifne -> 107
/*     */     //   54: ifne -> 125
/*     */     //   57: goto -> 70
/*     */     //   60: ldc2_w -5640762378539441983
/*     */     //   63: lload_1
/*     */     //   64: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   69: athrow
/*     */     //   70: aload_0
/*     */     //   71: iload #9
/*     */     //   73: ifne -> 111
/*     */     //   76: goto -> 89
/*     */     //   79: ldc2_w -5640762378539441983
/*     */     //   82: lload_1
/*     */     //   83: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   88: athrow
/*     */     //   89: getfield a : J
/*     */     //   92: lconst_0
/*     */     //   93: lcmp
/*     */     //   94: goto -> 107
/*     */     //   97: ldc2_w -5640762378539441983
/*     */     //   100: lload_1
/*     */     //   101: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   106: athrow
/*     */     //   107: ifeq -> 123
/*     */     //   110: aload_0
/*     */     //   111: aload_0
/*     */     //   112: getfield a : J
/*     */     //   115: lload #7
/*     */     //   117: invokevirtual b : (JJ)Ljava/lang/String;
/*     */     //   120: goto -> 124
/*     */     //   123: aconst_null
/*     */     //   124: areturn
/*     */     //   125: aload_0
/*     */     //   126: lload #10
/*     */     //   128: lload_3
/*     */     //   129: invokevirtual c : (JJ)Ljava/lang/String;
/*     */     //   132: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #683	-> 31
/*     */     //   #795	-> 43
/*     */     //   #39	-> 70
/*     */     //   #509	-> 125
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   43	57	60	java/io/EOFException
/*     */     //   54	76	79	java/io/EOFException
/*     */     //   70	94	97	java/io/EOFException
/*     */   }
/*     */   
/*     */   public gi d(int paramInt, long paramLong) {
/*     */     long l = paramLong ^ 0x167A990C0EFDL;
/*     */     return a(paramInt, l);
/*     */   }
/*     */   
/*     */   public fw e(long paramLong, int paramInt) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x33B6DFB24E95L;
/*     */     eV eV1 = a(l, 2);
/*     */     byte[] arrayOfByte = eV1.h;
/*     */     int i = eV1.c;
/*     */     arrayOfByte[i++] = (byte)(paramInt >>> 8 & 0xFF);
/*     */     arrayOfByte[i++] = (byte)(paramInt & 0xFF);
/*     */     eV1.c = i;
/*     */     this.a += 2L;
/*     */     return this;
/*     */   }
/*     */   
/*     */   public long b(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 3183770841074
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 88714024141030
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 80272008155612
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 6719037404304444166
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: istore #9
/*     */     //   33: aload_0
/*     */     //   34: iload #9
/*     */     //   36: ifne -> 114
/*     */     //   39: getfield a : J
/*     */     //   42: ldc2_w 8
/*     */     //   45: lcmp
/*     */     //   46: ifge -> 113
/*     */     //   49: goto -> 62
/*     */     //   52: ldc2_w 6755309614845856969
/*     */     //   55: lload_1
/*     */     //   56: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   61: athrow
/*     */     //   62: new java/lang/IllegalStateException
/*     */     //   65: dup
/*     */     //   66: new java/lang/StringBuilder
/*     */     //   69: dup
/*     */     //   70: invokespecial <init> : ()V
/*     */     //   73: sipush #23292
/*     */     //   76: ldc2_w 2355392873019760997
/*     */     //   79: lload_1
/*     */     //   80: lxor
/*     */     //   81: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   89: aload_0
/*     */     //   90: getfield a : J
/*     */     //   93: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   96: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   99: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   102: athrow
/*     */     //   103: ldc2_w 6755309614845856969
/*     */     //   106: lload_1
/*     */     //   107: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   112: athrow
/*     */     //   113: aload_0
/*     */     //   114: getfield b : Lme/konsolas/aac/eV;
/*     */     //   117: astore #10
/*     */     //   119: aload #10
/*     */     //   121: getfield d : I
/*     */     //   124: istore #11
/*     */     //   126: aload #10
/*     */     //   128: getfield c : I
/*     */     //   131: istore #12
/*     */     //   133: iload #12
/*     */     //   135: iload #11
/*     */     //   137: isub
/*     */     //   138: iload #9
/*     */     //   140: lload_1
/*     */     //   141: lconst_0
/*     */     //   142: lcmp
/*     */     //   143: iflt -> 151
/*     */     //   146: ifne -> 186
/*     */     //   149: bipush #8
/*     */     //   151: if_icmpge -> 207
/*     */     //   154: goto -> 167
/*     */     //   157: ldc2_w 6755309614845856969
/*     */     //   160: lload_1
/*     */     //   161: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   166: athrow
/*     */     //   167: aload_0
/*     */     //   168: lload #7
/*     */     //   170: invokevirtual c : (J)I
/*     */     //   173: goto -> 186
/*     */     //   176: ldc2_w 6755309614845856969
/*     */     //   179: lload_1
/*     */     //   180: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   185: athrow
/*     */     //   186: i2l
/*     */     //   187: ldc2_w 4294967295
/*     */     //   190: land
/*     */     //   191: bipush #32
/*     */     //   193: lshl
/*     */     //   194: aload_0
/*     */     //   195: lload #7
/*     */     //   197: invokevirtual c : (J)I
/*     */     //   200: i2l
/*     */     //   201: ldc2_w 4294967295
/*     */     //   204: land
/*     */     //   205: lor
/*     */     //   206: lreturn
/*     */     //   207: aload #10
/*     */     //   209: getfield h : [B
/*     */     //   212: astore #13
/*     */     //   214: aload #13
/*     */     //   216: iload #11
/*     */     //   218: iinc #11, 1
/*     */     //   221: baload
/*     */     //   222: i2l
/*     */     //   223: ldc2_w 255
/*     */     //   226: land
/*     */     //   227: bipush #56
/*     */     //   229: lshl
/*     */     //   230: aload #13
/*     */     //   232: iload #11
/*     */     //   234: iinc #11, 1
/*     */     //   237: baload
/*     */     //   238: i2l
/*     */     //   239: ldc2_w 255
/*     */     //   242: land
/*     */     //   243: bipush #48
/*     */     //   245: lshl
/*     */     //   246: lor
/*     */     //   247: aload #13
/*     */     //   249: iload #11
/*     */     //   251: iinc #11, 1
/*     */     //   254: baload
/*     */     //   255: i2l
/*     */     //   256: ldc2_w 255
/*     */     //   259: land
/*     */     //   260: bipush #40
/*     */     //   262: lshl
/*     */     //   263: lor
/*     */     //   264: aload #13
/*     */     //   266: iload #11
/*     */     //   268: iinc #11, 1
/*     */     //   271: baload
/*     */     //   272: i2l
/*     */     //   273: ldc2_w 255
/*     */     //   276: land
/*     */     //   277: bipush #32
/*     */     //   279: lshl
/*     */     //   280: lor
/*     */     //   281: aload #13
/*     */     //   283: iload #11
/*     */     //   285: iinc #11, 1
/*     */     //   288: baload
/*     */     //   289: i2l
/*     */     //   290: ldc2_w 255
/*     */     //   293: land
/*     */     //   294: bipush #24
/*     */     //   296: lshl
/*     */     //   297: lor
/*     */     //   298: aload #13
/*     */     //   300: iload #11
/*     */     //   302: iinc #11, 1
/*     */     //   305: baload
/*     */     //   306: i2l
/*     */     //   307: ldc2_w 255
/*     */     //   310: land
/*     */     //   311: bipush #16
/*     */     //   313: lshl
/*     */     //   314: lor
/*     */     //   315: aload #13
/*     */     //   317: iload #11
/*     */     //   319: iinc #11, 1
/*     */     //   322: baload
/*     */     //   323: i2l
/*     */     //   324: ldc2_w 255
/*     */     //   327: land
/*     */     //   328: bipush #8
/*     */     //   330: lshl
/*     */     //   331: lor
/*     */     //   332: aload #13
/*     */     //   334: iload #11
/*     */     //   336: iinc #11, 1
/*     */     //   339: baload
/*     */     //   340: i2l
/*     */     //   341: ldc2_w 255
/*     */     //   344: land
/*     */     //   345: lor
/*     */     //   346: lstore #14
/*     */     //   348: aload_0
/*     */     //   349: dup
/*     */     //   350: getfield a : J
/*     */     //   353: ldc2_w 8
/*     */     //   356: lsub
/*     */     //   357: putfield a : J
/*     */     //   360: iload #9
/*     */     //   362: lload_1
/*     */     //   363: lconst_0
/*     */     //   364: lcmp
/*     */     //   365: iflt -> 429
/*     */     //   368: ifne -> 421
/*     */     //   371: iload #11
/*     */     //   373: iload #12
/*     */     //   375: if_icmpne -> 432
/*     */     //   378: goto -> 391
/*     */     //   381: ldc2_w 6755309614845856969
/*     */     //   384: lload_1
/*     */     //   385: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   390: athrow
/*     */     //   391: aload_0
/*     */     //   392: aload #10
/*     */     //   394: lload #5
/*     */     //   396: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   399: putfield b : Lme/konsolas/aac/eV;
/*     */     //   402: aload #10
/*     */     //   404: lload_3
/*     */     //   405: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   408: goto -> 421
/*     */     //   411: ldc2_w 6755309614845856969
/*     */     //   414: lload_1
/*     */     //   415: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   420: athrow
/*     */     //   421: lload_1
/*     */     //   422: lconst_0
/*     */     //   423: lcmp
/*     */     //   424: iflt -> 439
/*     */     //   427: iload #9
/*     */     //   429: ifeq -> 452
/*     */     //   432: aload #10
/*     */     //   434: iload #11
/*     */     //   436: putfield d : I
/*     */     //   439: goto -> 452
/*     */     //   442: ldc2_w 6755309614845856969
/*     */     //   445: lload_1
/*     */     //   446: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   451: athrow
/*     */     //   452: lload #14
/*     */     //   454: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #698	-> 33
/*     */     //   #238	-> 113
/*     */     //   #459	-> 119
/*     */     //   #812	-> 126
/*     */     //   #924	-> 133
/*     */     //   #257	-> 167
/*     */     //   #663	-> 195
/*     */     //   #717	-> 206
/*     */     //   #61	-> 207
/*     */     //   #149	-> 214
/*     */     //   #713	-> 348
/*     */     //   #543	-> 360
/*     */     //   #827	-> 391
/*     */     //   #893	-> 402
/*     */     //   #514	-> 432
/*     */     //   #926	-> 452
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   33	49	52	java/lang/IllegalArgumentException
/*     */     //   39	103	103	java/lang/IllegalArgumentException
/*     */     //   133	154	157	java/lang/IllegalArgumentException
/*     */     //   149	173	176	java/lang/IllegalArgumentException
/*     */     //   348	378	381	java/lang/IllegalArgumentException
/*     */     //   371	408	411	java/lang/IllegalArgumentException
/*     */     //   421	439	442	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public gi a(long paramLong, String paramString, int paramInt1, int paramInt2) {
/*     */     long l = paramLong ^ 0x39F0C80CB770L;
/*     */     return a(paramString, paramInt1, l, paramInt2);
/*     */   }
/*     */   
/*     */   public final gZ b(gZ paramgZ, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 68242666316343
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: aload_0
/*     */     //   16: sipush #5808
/*     */     //   19: ldc2_w 3818170137020895132
/*     */     //   22: lload_2
/*     */     //   23: lxor
/*     */     //   24: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   29: lload #4
/*     */     //   31: aload_1
/*     */     //   32: invokespecial a : (Ljava/lang/String;JLme/konsolas/aac/gZ;)Lme/konsolas/aac/gZ;
/*     */     //   35: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #707	-> 15
/*     */   }
/*     */   
/*     */   public fw a() {
/*     */     return this;
/*     */   }
/*     */   
/*     */   public gi b(long paramLong) {
/*     */     return c();
/*     */   }
/*     */   
/*     */   public void a(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 73864273429696
/*     */     //   5: lxor
/*     */     //   6: lstore #5
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 19137529474004
/*     */     //   12: lxor
/*     */     //   13: lstore #7
/*     */     //   15: pop2
/*     */     //   16: ldc2_w 8506333375947153460
/*     */     //   19: lload_3
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: istore #9
/*     */     //   27: lload_1
/*     */     //   28: lconst_0
/*     */     //   29: lcmp
/*     */     //   30: ifle -> 196
/*     */     //   33: aload_0
/*     */     //   34: getfield b : Lme/konsolas/aac/eV;
/*     */     //   37: ifnonnull -> 58
/*     */     //   40: new java/io/EOFException
/*     */     //   43: dup
/*     */     //   44: invokespecial <init> : ()V
/*     */     //   47: athrow
/*     */     //   48: ldc2_w 8542747423488550907
/*     */     //   51: lload_3
/*     */     //   52: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   57: athrow
/*     */     //   58: lload_1
/*     */     //   59: aload_0
/*     */     //   60: getfield b : Lme/konsolas/aac/eV;
/*     */     //   63: getfield c : I
/*     */     //   66: aload_0
/*     */     //   67: getfield b : Lme/konsolas/aac/eV;
/*     */     //   70: getfield d : I
/*     */     //   73: isub
/*     */     //   74: i2l
/*     */     //   75: invokestatic min : (JJ)J
/*     */     //   78: l2i
/*     */     //   79: istore #10
/*     */     //   81: aload_0
/*     */     //   82: dup
/*     */     //   83: getfield a : J
/*     */     //   86: iload #10
/*     */     //   88: i2l
/*     */     //   89: lsub
/*     */     //   90: putfield a : J
/*     */     //   93: lload_1
/*     */     //   94: iload #10
/*     */     //   96: i2l
/*     */     //   97: lsub
/*     */     //   98: lstore_1
/*     */     //   99: aload_0
/*     */     //   100: getfield b : Lme/konsolas/aac/eV;
/*     */     //   103: dup
/*     */     //   104: getfield d : I
/*     */     //   107: iload #10
/*     */     //   109: iadd
/*     */     //   110: putfield d : I
/*     */     //   113: aload_0
/*     */     //   114: getfield b : Lme/konsolas/aac/eV;
/*     */     //   117: iload #9
/*     */     //   119: ifne -> 171
/*     */     //   122: getfield d : I
/*     */     //   125: lload_3
/*     */     //   126: lconst_0
/*     */     //   127: lcmp
/*     */     //   128: iflt -> 193
/*     */     //   131: aload_0
/*     */     //   132: getfield b : Lme/konsolas/aac/eV;
/*     */     //   135: getfield c : I
/*     */     //   138: if_icmpne -> 191
/*     */     //   141: goto -> 154
/*     */     //   144: ldc2_w 8542747423488550907
/*     */     //   147: lload_3
/*     */     //   148: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   153: athrow
/*     */     //   154: aload_0
/*     */     //   155: getfield b : Lme/konsolas/aac/eV;
/*     */     //   158: goto -> 171
/*     */     //   161: ldc2_w 8542747423488550907
/*     */     //   164: lload_3
/*     */     //   165: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   170: athrow
/*     */     //   171: astore #11
/*     */     //   173: aload_0
/*     */     //   174: aload #11
/*     */     //   176: lload #7
/*     */     //   178: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   181: putfield b : Lme/konsolas/aac/eV;
/*     */     //   184: aload #11
/*     */     //   186: lload #5
/*     */     //   188: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   191: iload #9
/*     */     //   193: ifeq -> 27
/*     */     //   196: lload_3
/*     */     //   197: lconst_0
/*     */     //   198: lcmp
/*     */     //   199: iflt -> 33
/*     */     //   202: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #734	-> 27
/*     */     //   #323	-> 33
/*     */     //   #222	-> 58
/*     */     //   #310	-> 81
/*     */     //   #857	-> 93
/*     */     //   #667	-> 99
/*     */     //   #361	-> 113
/*     */     //   #218	-> 154
/*     */     //   #481	-> 173
/*     */     //   #650	-> 184
/*     */     //   #96	-> 191
/*     */     //   #402	-> 196
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   33	48	48	java/io/EOFException
/*     */     //   99	141	144	java/io/EOFException
/*     */     //   122	158	161	java/io/EOFException
/*     */   }
/*     */   
/*     */   public boolean isOpen() {
/*     */     return true;
/*     */   }
/*     */   
/*     */   public int a(long paramLong) {
/*     */     long l = paramLong ^ 0x6163537A2F77L;
/*     */     return cc.a(c(l));
/*     */   }
/*     */   
/*     */   public gi d(long paramLong1, long paramLong2) {
/*     */     long l = paramLong2 ^ 0x7DB9920754F4L;
/*     */     return b(paramLong1, l);
/*     */   }
/*     */   
/*     */   public gi a(hp paramhp, int paramInt1, int paramInt2, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: lstore #6
/*     */     //   16: lload #6
/*     */     //   18: dup2
/*     */     //   19: ldc2_w 44864574111137
/*     */     //   22: lxor
/*     */     //   23: lstore #8
/*     */     //   25: pop2
/*     */     //   26: ldc2_w 3813001546132513490
/*     */     //   29: lload #6
/*     */     //   31: <illegal opcode> w : (JJ)I
/*     */     //   36: istore #10
/*     */     //   38: lload #4
/*     */     //   40: lconst_0
/*     */     //   41: lcmp
/*     */     //   42: ifle -> 121
/*     */     //   45: aload_1
/*     */     //   46: lload #8
/*     */     //   48: aload_0
/*     */     //   49: lload #4
/*     */     //   51: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   56: lstore #11
/*     */     //   58: lload #11
/*     */     //   60: iload_2
/*     */     //   61: iflt -> 114
/*     */     //   64: ldc2_w -1
/*     */     //   67: iload #10
/*     */     //   69: ifne -> 113
/*     */     //   72: lcmp
/*     */     //   73: ifne -> 109
/*     */     //   76: goto -> 90
/*     */     //   79: ldc2_w 3777392066241520925
/*     */     //   82: lload #6
/*     */     //   84: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   89: athrow
/*     */     //   90: new java/io/EOFException
/*     */     //   93: dup
/*     */     //   94: invokespecial <init> : ()V
/*     */     //   97: athrow
/*     */     //   98: ldc2_w 3777392066241520925
/*     */     //   101: lload #6
/*     */     //   103: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   108: athrow
/*     */     //   109: lload #4
/*     */     //   111: lload #11
/*     */     //   113: lsub
/*     */     //   114: lstore #4
/*     */     //   116: iload #10
/*     */     //   118: ifeq -> 38
/*     */     //   121: aload_0
/*     */     //   122: iload_2
/*     */     //   123: ifle -> 46
/*     */     //   126: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #772	-> 38
/*     */     //   #512	-> 45
/*     */     //   #625	-> 58
/*     */     //   #919	-> 109
/*     */     //   #264	-> 116
/*     */     //   #670	-> 121
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   58	76	79	java/io/IOException
/*     */     //   72	98	98	java/io/IOException
/*     */   }
/*     */   
/*     */   public li a() {
/*     */     return li.a;
/*     */   }
/*     */   
/*     */   public final fw a(short paramShort, int paramInt1, InputStream paramInputStream, int paramInt2, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #4
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic me/konsolas/aac/fw.f : J
/*     */     //   27: lxor
/*     */     //   28: lstore #7
/*     */     //   30: lload #7
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 85159879256742
/*     */     //   36: lxor
/*     */     //   37: lstore #9
/*     */     //   39: pop2
/*     */     //   40: ldc2_w 1560727957745582992
/*     */     //   43: lload #7
/*     */     //   45: <illegal opcode> w : (JJ)I
/*     */     //   50: istore #11
/*     */     //   52: iload #11
/*     */     //   54: ifne -> 139
/*     */     //   57: lload #5
/*     */     //   59: lconst_0
/*     */     //   60: lcmp
/*     */     //   61: ifge -> 129
/*     */     //   64: goto -> 78
/*     */     //   67: ldc2_w 1524942813693232223
/*     */     //   70: lload #7
/*     */     //   72: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   77: athrow
/*     */     //   78: new java/lang/IllegalArgumentException
/*     */     //   81: dup
/*     */     //   82: new java/lang/StringBuilder
/*     */     //   85: dup
/*     */     //   86: invokespecial <init> : ()V
/*     */     //   89: sipush #14428
/*     */     //   92: ldc2_w 133264091870153583
/*     */     //   95: lload #7
/*     */     //   97: lxor
/*     */     //   98: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   106: lload #5
/*     */     //   108: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   111: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   114: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   117: athrow
/*     */     //   118: ldc2_w 1524942813693232223
/*     */     //   121: lload #7
/*     */     //   123: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   128: athrow
/*     */     //   129: aload_0
/*     */     //   130: lload #9
/*     */     //   132: aload_3
/*     */     //   133: lload #5
/*     */     //   135: iconst_0
/*     */     //   136: invokespecial a : (JLjava/io/InputStream;JZ)V
/*     */     //   139: aload_0
/*     */     //   140: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #788	-> 52
/*     */     //   #681	-> 129
/*     */     //   #320	-> 139
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   52	64	67	java/io/IOException
/*     */     //   57	118	118	java/io/IOException
/*     */   }
/*     */   
/*     */   public fw a(String paramString, int paramInt1, long paramLong, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 6716332111290
/*     */     //   11: lxor
/*     */     //   12: lstore #6
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 107466913180202
/*     */     //   18: lxor
/*     */     //   19: lstore #8
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 8315129177009310509
/*     */     //   25: lload_3
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: istore #10
/*     */     //   33: aload_1
/*     */     //   34: ifnonnull -> 68
/*     */     //   37: new java/lang/IllegalArgumentException
/*     */     //   40: dup
/*     */     //   41: sipush #1812
/*     */     //   44: ldc2_w 2990042560085561959
/*     */     //   47: lload_3
/*     */     //   48: lxor
/*     */     //   49: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   54: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   57: athrow
/*     */     //   58: ldc2_w 8315247671687848467
/*     */     //   61: lload_3
/*     */     //   62: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   67: athrow
/*     */     //   68: iload_2
/*     */     //   69: iload #10
/*     */     //   71: lload_3
/*     */     //   72: lconst_0
/*     */     //   73: lcmp
/*     */     //   74: ifle -> 147
/*     */     //   77: ifeq -> 146
/*     */     //   80: ifge -> 144
/*     */     //   83: goto -> 96
/*     */     //   86: ldc2_w 8315247671687848467
/*     */     //   89: lload_3
/*     */     //   90: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   95: athrow
/*     */     //   96: new java/lang/IllegalArgumentException
/*     */     //   99: dup
/*     */     //   100: new java/lang/StringBuilder
/*     */     //   103: dup
/*     */     //   104: invokespecial <init> : ()V
/*     */     //   107: sipush #28953
/*     */     //   110: ldc2_w 389433147507467364
/*     */     //   113: lload_3
/*     */     //   114: lxor
/*     */     //   115: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: iload_2
/*     */     //   124: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   127: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   130: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   133: athrow
/*     */     //   134: ldc2_w 8315247671687848467
/*     */     //   137: lload_3
/*     */     //   138: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   143: athrow
/*     */     //   144: iload #5
/*     */     //   146: iload_2
/*     */     //   147: lload_3
/*     */     //   148: lconst_0
/*     */     //   149: lcmp
/*     */     //   150: ifle -> 273
/*     */     //   153: iload #10
/*     */     //   155: ifeq -> 273
/*     */     //   158: if_icmpge -> 243
/*     */     //   161: goto -> 174
/*     */     //   164: ldc2_w 8315247671687848467
/*     */     //   167: lload_3
/*     */     //   168: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   173: athrow
/*     */     //   174: new java/lang/IllegalArgumentException
/*     */     //   177: dup
/*     */     //   178: new java/lang/StringBuilder
/*     */     //   181: dup
/*     */     //   182: invokespecial <init> : ()V
/*     */     //   185: sipush #7373
/*     */     //   188: ldc2_w 1510035570938415511
/*     */     //   191: lload_3
/*     */     //   192: lxor
/*     */     //   193: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   201: iload #5
/*     */     //   203: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   206: sipush #30136
/*     */     //   209: ldc2_w 7177823674054205655
/*     */     //   212: lload_3
/*     */     //   213: lxor
/*     */     //   214: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   222: iload_2
/*     */     //   223: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   226: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   229: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   232: athrow
/*     */     //   233: ldc2_w 8315247671687848467
/*     */     //   236: lload_3
/*     */     //   237: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   242: athrow
/*     */     //   243: iload #5
/*     */     //   245: iload #10
/*     */     //   247: lload_3
/*     */     //   248: lconst_0
/*     */     //   249: lcmp
/*     */     //   250: iflt -> 260
/*     */     //   253: ifeq -> 349
/*     */     //   256: aload_1
/*     */     //   257: invokevirtual length : ()I
/*     */     //   260: goto -> 273
/*     */     //   263: ldc2_w 8315247671687848467
/*     */     //   266: lload_3
/*     */     //   267: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   272: athrow
/*     */     //   273: if_icmple -> 348
/*     */     //   276: new java/lang/IllegalArgumentException
/*     */     //   279: dup
/*     */     //   280: new java/lang/StringBuilder
/*     */     //   283: dup
/*     */     //   284: invokespecial <init> : ()V
/*     */     //   287: sipush #10659
/*     */     //   290: ldc2_w 2116825552552836299
/*     */     //   293: lload_3
/*     */     //   294: lxor
/*     */     //   295: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   303: iload #5
/*     */     //   305: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   308: sipush #20946
/*     */     //   311: ldc2_w 2300184805163975818
/*     */     //   314: lload_3
/*     */     //   315: lxor
/*     */     //   316: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   324: aload_1
/*     */     //   325: invokevirtual length : ()I
/*     */     //   328: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   331: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   334: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   337: athrow
/*     */     //   338: ldc2_w 8315247671687848467
/*     */     //   341: lload_3
/*     */     //   342: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   347: athrow
/*     */     //   348: iload_2
/*     */     //   349: istore #11
/*     */     //   351: iload #11
/*     */     //   353: iload #5
/*     */     //   355: if_icmpge -> 1192
/*     */     //   358: aload_1
/*     */     //   359: iload #11
/*     */     //   361: invokevirtual charAt : (I)C
/*     */     //   364: istore #12
/*     */     //   366: iload #12
/*     */     //   368: sipush #128
/*     */     //   371: iload #10
/*     */     //   373: lload_3
/*     */     //   374: lconst_0
/*     */     //   375: lcmp
/*     */     //   376: iflt -> 621
/*     */     //   379: ifeq -> 619
/*     */     //   382: if_icmpge -> 601
/*     */     //   385: goto -> 398
/*     */     //   388: ldc2_w 8315247671687848467
/*     */     //   391: lload_3
/*     */     //   392: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   397: athrow
/*     */     //   398: aload_0
/*     */     //   399: lload #8
/*     */     //   401: iconst_1
/*     */     //   402: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*     */     //   405: astore #13
/*     */     //   407: aload #13
/*     */     //   409: getfield h : [B
/*     */     //   412: astore #14
/*     */     //   414: aload #13
/*     */     //   416: getfield c : I
/*     */     //   419: iload #11
/*     */     //   421: isub
/*     */     //   422: istore #15
/*     */     //   424: iload #5
/*     */     //   426: sipush #8192
/*     */     //   429: iload #15
/*     */     //   431: isub
/*     */     //   432: invokestatic min : (II)I
/*     */     //   435: istore #16
/*     */     //   437: aload #14
/*     */     //   439: iload #15
/*     */     //   441: iload #11
/*     */     //   443: iinc #11, 1
/*     */     //   446: iadd
/*     */     //   447: iload #12
/*     */     //   449: i2b
/*     */     //   450: bastore
/*     */     //   451: iload #11
/*     */     //   453: iload #16
/*     */     //   455: if_icmpge -> 547
/*     */     //   458: aload_1
/*     */     //   459: iload #11
/*     */     //   461: invokevirtual charAt : (I)C
/*     */     //   464: istore #12
/*     */     //   466: iload #10
/*     */     //   468: lload_3
/*     */     //   469: lconst_0
/*     */     //   470: lcmp
/*     */     //   471: iflt -> 544
/*     */     //   474: ifeq -> 542
/*     */     //   477: iload #12
/*     */     //   479: lload_3
/*     */     //   480: lconst_0
/*     */     //   481: lcmp
/*     */     //   482: ifle -> 564
/*     */     //   485: sipush #128
/*     */     //   488: iload #10
/*     */     //   490: ifeq -> 563
/*     */     //   493: goto -> 506
/*     */     //   496: ldc2_w 8315247671687848467
/*     */     //   499: lload_3
/*     */     //   500: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   505: athrow
/*     */     //   506: if_icmplt -> 528
/*     */     //   509: goto -> 522
/*     */     //   512: ldc2_w 8315247671687848467
/*     */     //   515: lload_3
/*     */     //   516: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   521: athrow
/*     */     //   522: lload_3
/*     */     //   523: lconst_0
/*     */     //   524: lcmp
/*     */     //   525: ifgt -> 547
/*     */     //   528: aload #14
/*     */     //   530: iload #15
/*     */     //   532: iload #11
/*     */     //   534: iinc #11, 1
/*     */     //   537: iadd
/*     */     //   538: iload #12
/*     */     //   540: i2b
/*     */     //   541: bastore
/*     */     //   542: iload #10
/*     */     //   544: ifne -> 451
/*     */     //   547: iload #11
/*     */     //   549: iload #15
/*     */     //   551: iadd
/*     */     //   552: lload_3
/*     */     //   553: lconst_0
/*     */     //   554: lcmp
/*     */     //   555: ifle -> 468
/*     */     //   558: aload #13
/*     */     //   560: getfield c : I
/*     */     //   563: isub
/*     */     //   564: istore #17
/*     */     //   566: aload #13
/*     */     //   568: dup
/*     */     //   569: getfield c : I
/*     */     //   572: iload #17
/*     */     //   574: iadd
/*     */     //   575: putfield c : I
/*     */     //   578: aload_0
/*     */     //   579: dup
/*     */     //   580: getfield a : J
/*     */     //   583: iload #17
/*     */     //   585: i2l
/*     */     //   586: ladd
/*     */     //   587: putfield a : J
/*     */     //   590: iload #10
/*     */     //   592: lload_3
/*     */     //   593: lconst_0
/*     */     //   594: lcmp
/*     */     //   595: ifle -> 1189
/*     */     //   598: ifne -> 1187
/*     */     //   601: iload #12
/*     */     //   603: sipush #2048
/*     */     //   606: goto -> 619
/*     */     //   609: ldc2_w 8315247671687848467
/*     */     //   612: lload_3
/*     */     //   613: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   618: athrow
/*     */     //   619: iload #10
/*     */     //   621: lload_3
/*     */     //   622: lconst_0
/*     */     //   623: lcmp
/*     */     //   624: iflt -> 725
/*     */     //   627: ifeq -> 723
/*     */     //   630: if_icmpge -> 705
/*     */     //   633: goto -> 646
/*     */     //   636: ldc2_w 8315247671687848467
/*     */     //   639: lload_3
/*     */     //   640: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   645: athrow
/*     */     //   646: aload_0
/*     */     //   647: iload #12
/*     */     //   649: bipush #6
/*     */     //   651: ishr
/*     */     //   652: sipush #192
/*     */     //   655: ior
/*     */     //   656: lload #6
/*     */     //   658: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   661: pop
/*     */     //   662: aload_0
/*     */     //   663: iload #12
/*     */     //   665: bipush #63
/*     */     //   667: iand
/*     */     //   668: sipush #128
/*     */     //   671: ior
/*     */     //   672: lload #6
/*     */     //   674: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   677: pop
/*     */     //   678: iinc #11, 1
/*     */     //   681: iload #10
/*     */     //   683: lload_3
/*     */     //   684: lconst_0
/*     */     //   685: lcmp
/*     */     //   686: ifle -> 1189
/*     */     //   689: ifne -> 1187
/*     */     //   692: goto -> 705
/*     */     //   695: ldc2_w 8315247671687848467
/*     */     //   698: lload_3
/*     */     //   699: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   704: athrow
/*     */     //   705: iload #12
/*     */     //   707: ldc_w 55296
/*     */     //   710: goto -> 723
/*     */     //   713: ldc2_w 8315247671687848467
/*     */     //   716: lload_3
/*     */     //   717: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   722: athrow
/*     */     //   723: iload #10
/*     */     //   725: lload_3
/*     */     //   726: lconst_0
/*     */     //   727: lcmp
/*     */     //   728: iflt -> 776
/*     */     //   731: ifeq -> 768
/*     */     //   734: if_icmplt -> 795
/*     */     //   737: goto -> 750
/*     */     //   740: ldc2_w 8315247671687848467
/*     */     //   743: lload_3
/*     */     //   744: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   749: athrow
/*     */     //   750: iload #12
/*     */     //   752: ldc_w 57343
/*     */     //   755: goto -> 768
/*     */     //   758: ldc2_w 8315247671687848467
/*     */     //   761: lload_3
/*     */     //   762: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   767: athrow
/*     */     //   768: lload_3
/*     */     //   769: lconst_0
/*     */     //   770: lcmp
/*     */     //   771: iflt -> 910
/*     */     //   774: iload #10
/*     */     //   776: ifeq -> 910
/*     */     //   779: if_icmple -> 873
/*     */     //   782: goto -> 795
/*     */     //   785: ldc2_w 8315247671687848467
/*     */     //   788: lload_3
/*     */     //   789: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   794: athrow
/*     */     //   795: aload_0
/*     */     //   796: iload #12
/*     */     //   798: bipush #12
/*     */     //   800: ishr
/*     */     //   801: sipush #224
/*     */     //   804: ior
/*     */     //   805: lload #6
/*     */     //   807: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   810: pop
/*     */     //   811: aload_0
/*     */     //   812: iload #12
/*     */     //   814: bipush #6
/*     */     //   816: ishr
/*     */     //   817: bipush #63
/*     */     //   819: iand
/*     */     //   820: sipush #128
/*     */     //   823: ior
/*     */     //   824: lload #6
/*     */     //   826: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   829: pop
/*     */     //   830: aload_0
/*     */     //   831: iload #12
/*     */     //   833: bipush #63
/*     */     //   835: iand
/*     */     //   836: sipush #128
/*     */     //   839: ior
/*     */     //   840: lload #6
/*     */     //   842: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   845: pop
/*     */     //   846: iinc #11, 1
/*     */     //   849: iload #10
/*     */     //   851: lload_3
/*     */     //   852: lconst_0
/*     */     //   853: lcmp
/*     */     //   854: iflt -> 1189
/*     */     //   857: ifne -> 1187
/*     */     //   860: goto -> 873
/*     */     //   863: ldc2_w 8315247671687848467
/*     */     //   866: lload_3
/*     */     //   867: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   872: athrow
/*     */     //   873: iload #11
/*     */     //   875: iconst_1
/*     */     //   876: iadd
/*     */     //   877: iload #10
/*     */     //   879: ifeq -> 934
/*     */     //   882: goto -> 895
/*     */     //   885: ldc2_w 8315247671687848467
/*     */     //   888: lload_3
/*     */     //   889: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   894: athrow
/*     */     //   895: iload #5
/*     */     //   897: goto -> 910
/*     */     //   900: ldc2_w 8315247671687848467
/*     */     //   903: lload_3
/*     */     //   904: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   909: athrow
/*     */     //   910: if_icmpge -> 937
/*     */     //   913: aload_1
/*     */     //   914: iload #11
/*     */     //   916: iconst_1
/*     */     //   917: iadd
/*     */     //   918: invokevirtual charAt : (I)C
/*     */     //   921: goto -> 934
/*     */     //   924: ldc2_w 8315247671687848467
/*     */     //   927: lload_3
/*     */     //   928: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   933: athrow
/*     */     //   934: goto -> 938
/*     */     //   937: iconst_0
/*     */     //   938: istore #13
/*     */     //   940: iload #10
/*     */     //   942: lload_3
/*     */     //   943: lconst_0
/*     */     //   944: lcmp
/*     */     //   945: iflt -> 1083
/*     */     //   948: ifeq -> 1081
/*     */     //   951: iload #12
/*     */     //   953: ldc_w 56319
/*     */     //   956: if_icmpgt -> 1056
/*     */     //   959: goto -> 972
/*     */     //   962: ldc2_w 8315247671687848467
/*     */     //   965: lload_3
/*     */     //   966: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   971: athrow
/*     */     //   972: iload #13
/*     */     //   974: ldc_w 56320
/*     */     //   977: iload #10
/*     */     //   979: lload_3
/*     */     //   980: lconst_0
/*     */     //   981: lcmp
/*     */     //   982: iflt -> 1037
/*     */     //   985: ifeq -> 1035
/*     */     //   988: goto -> 1001
/*     */     //   991: ldc2_w 8315247671687848467
/*     */     //   994: lload_3
/*     */     //   995: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1000: athrow
/*     */     //   1001: if_icmplt -> 1056
/*     */     //   1004: goto -> 1017
/*     */     //   1007: ldc2_w 8315247671687848467
/*     */     //   1010: lload_3
/*     */     //   1011: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1016: athrow
/*     */     //   1017: iload #13
/*     */     //   1019: ldc_w 57343
/*     */     //   1022: goto -> 1035
/*     */     //   1025: ldc2_w 8315247671687848467
/*     */     //   1028: lload_3
/*     */     //   1029: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1034: athrow
/*     */     //   1035: iload #10
/*     */     //   1037: ifeq -> 1111
/*     */     //   1040: if_icmple -> 1092
/*     */     //   1043: goto -> 1056
/*     */     //   1046: ldc2_w 8315247671687848467
/*     */     //   1049: lload_3
/*     */     //   1050: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1055: athrow
/*     */     //   1056: aload_0
/*     */     //   1057: bipush #63
/*     */     //   1059: lload #6
/*     */     //   1061: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   1064: pop
/*     */     //   1065: iinc #11, 1
/*     */     //   1068: goto -> 1081
/*     */     //   1071: ldc2_w 8315247671687848467
/*     */     //   1074: lload_3
/*     */     //   1075: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1080: athrow
/*     */     //   1081: iload #10
/*     */     //   1083: lload_3
/*     */     //   1084: lconst_0
/*     */     //   1085: lcmp
/*     */     //   1086: iflt -> 1095
/*     */     //   1089: ifne -> 351
/*     */     //   1092: ldc_w 65536
/*     */     //   1095: iload #12
/*     */     //   1097: ldc_w -55297
/*     */     //   1100: iand
/*     */     //   1101: bipush #10
/*     */     //   1103: ishl
/*     */     //   1104: iload #13
/*     */     //   1106: ldc_w -56321
/*     */     //   1109: iand
/*     */     //   1110: ior
/*     */     //   1111: iadd
/*     */     //   1112: istore #14
/*     */     //   1114: aload_0
/*     */     //   1115: iload #14
/*     */     //   1117: bipush #18
/*     */     //   1119: ishr
/*     */     //   1120: sipush #240
/*     */     //   1123: ior
/*     */     //   1124: lload #6
/*     */     //   1126: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   1129: pop
/*     */     //   1130: aload_0
/*     */     //   1131: iload #14
/*     */     //   1133: bipush #12
/*     */     //   1135: ishr
/*     */     //   1136: bipush #63
/*     */     //   1138: iand
/*     */     //   1139: sipush #128
/*     */     //   1142: ior
/*     */     //   1143: lload #6
/*     */     //   1145: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   1148: pop
/*     */     //   1149: aload_0
/*     */     //   1150: iload #14
/*     */     //   1152: bipush #6
/*     */     //   1154: ishr
/*     */     //   1155: bipush #63
/*     */     //   1157: iand
/*     */     //   1158: sipush #128
/*     */     //   1161: ior
/*     */     //   1162: lload #6
/*     */     //   1164: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   1167: pop
/*     */     //   1168: aload_0
/*     */     //   1169: iload #14
/*     */     //   1171: bipush #63
/*     */     //   1173: iand
/*     */     //   1174: sipush #128
/*     */     //   1177: ior
/*     */     //   1178: lload #6
/*     */     //   1180: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   1183: pop
/*     */     //   1184: iinc #11, 2
/*     */     //   1187: iload #10
/*     */     //   1189: ifne -> 351
/*     */     //   1192: lload_3
/*     */     //   1193: lconst_0
/*     */     //   1194: lcmp
/*     */     //   1195: ifle -> 351
/*     */     //   1198: aload_0
/*     */     //   1199: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #790	-> 33
/*     */     //   #721	-> 68
/*     */     //   #688	-> 144
/*     */     //   #440	-> 174
/*     */     //   #630	-> 243
/*     */     //   #728	-> 276
/*     */     //   #339	-> 325
/*     */     //   #853	-> 348
/*     */     //   #522	-> 358
/*     */     //   #782	-> 366
/*     */     //   #441	-> 398
/*     */     //   #130	-> 407
/*     */     //   #606	-> 414
/*     */     //   #732	-> 424
/*     */     //   #343	-> 437
/*     */     //   #533	-> 451
/*     */     //   #26	-> 458
/*     */     //   #704	-> 466
/*     */     //   #344	-> 528
/*     */     //   #245	-> 547
/*     */     //   #50	-> 566
/*     */     //   #504	-> 578
/*     */     //   #176	-> 590
/*     */     //   #692	-> 646
/*     */     //   #18	-> 662
/*     */     //   #114	-> 678
/*     */     //   #566	-> 705
/*     */     //   #265	-> 795
/*     */     //   #530	-> 811
/*     */     //   #166	-> 830
/*     */     //   #896	-> 846
/*     */     //   #804	-> 873
/*     */     //   #609	-> 940
/*     */     //   #271	-> 1056
/*     */     //   #20	-> 1065
/*     */     //   #354	-> 1081
/*     */     //   #785	-> 1092
/*     */     //   #208	-> 1114
/*     */     //   #211	-> 1130
/*     */     //   #59	-> 1149
/*     */     //   #873	-> 1168
/*     */     //   #642	-> 1184
/*     */     //   #273	-> 1187
/*     */     //   #492	-> 1192
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   33	58	58	java/lang/IllegalArgumentException
/*     */     //   68	83	86	java/lang/IllegalArgumentException
/*     */     //   80	134	134	java/lang/IllegalArgumentException
/*     */     //   146	161	164	java/lang/IllegalArgumentException
/*     */     //   158	233	233	java/lang/IllegalArgumentException
/*     */     //   243	260	263	java/lang/IllegalArgumentException
/*     */     //   273	338	338	java/lang/IllegalArgumentException
/*     */     //   366	385	388	java/lang/IllegalArgumentException
/*     */     //   466	493	496	java/lang/IllegalArgumentException
/*     */     //   477	509	512	java/lang/IllegalArgumentException
/*     */     //   566	606	609	java/lang/IllegalArgumentException
/*     */     //   619	633	636	java/lang/IllegalArgumentException
/*     */     //   630	692	695	java/lang/IllegalArgumentException
/*     */     //   646	710	713	java/lang/IllegalArgumentException
/*     */     //   723	737	740	java/lang/IllegalArgumentException
/*     */     //   734	755	758	java/lang/IllegalArgumentException
/*     */     //   768	782	785	java/lang/IllegalArgumentException
/*     */     //   779	860	863	java/lang/IllegalArgumentException
/*     */     //   795	882	885	java/lang/IllegalArgumentException
/*     */     //   873	897	900	java/lang/IllegalArgumentException
/*     */     //   910	921	924	java/lang/IllegalArgumentException
/*     */     //   940	959	962	java/lang/IllegalArgumentException
/*     */     //   951	988	991	java/lang/IllegalArgumentException
/*     */     //   972	1004	1007	java/lang/IllegalArgumentException
/*     */     //   1001	1022	1025	java/lang/IllegalArgumentException
/*     */     //   1035	1043	1046	java/lang/IllegalArgumentException
/*     */     //   1040	1068	1071	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public fw c() {
/*     */     return this;
/*     */   }
/*     */   
/*     */   public boolean a(long paramLong1, gZ paramgZ, long paramLong2) {
/*     */     int i = (int)((paramLong2 ^ 0x54128F4AFFB4L) >>> 48L), j = (int)((paramLong2 ^ 0x54128F4AFFB4L) << 16L >>> 32L), k = (int)((paramLong2 ^ 0x54128F4AFFB4L) << 48L >>> 48L);
/*     */     paramLong2 ^ 0x54128F4AFFB4L;
/*     */     return a(paramLong1, (short)i, j, paramgZ, 0, paramgZ.a(), k);
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: ldc2_w 67674417724111
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: ldc2_w -5366115087178931265
/*     */     //   11: lload_2
/*     */     //   12: <illegal opcode> w : (JJ)I
/*     */     //   17: istore #4
/*     */     //   19: aload_0
/*     */     //   20: iload #4
/*     */     //   22: ifne -> 55
/*     */     //   25: aload_1
/*     */     //   26: if_acmpne -> 54
/*     */     //   29: goto -> 42
/*     */     //   32: ldc2_w -5402414767256116112
/*     */     //   35: lload_2
/*     */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   41: athrow
/*     */     //   42: iconst_1
/*     */     //   43: ireturn
/*     */     //   44: ldc2_w -5402414767256116112
/*     */     //   47: lload_2
/*     */     //   48: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   53: athrow
/*     */     //   54: aload_1
/*     */     //   55: iload #4
/*     */     //   57: ifne -> 92
/*     */     //   60: instanceof me/konsolas/aac/fw
/*     */     //   63: ifne -> 91
/*     */     //   66: goto -> 79
/*     */     //   69: ldc2_w -5402414767256116112
/*     */     //   72: lload_2
/*     */     //   73: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   78: athrow
/*     */     //   79: iconst_0
/*     */     //   80: ireturn
/*     */     //   81: ldc2_w -5402414767256116112
/*     */     //   84: lload_2
/*     */     //   85: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   90: athrow
/*     */     //   91: aload_1
/*     */     //   92: checkcast me/konsolas/aac/fw
/*     */     //   95: astore #5
/*     */     //   97: aload_0
/*     */     //   98: getfield a : J
/*     */     //   101: aload #5
/*     */     //   103: getfield a : J
/*     */     //   106: lcmp
/*     */     //   107: iload #4
/*     */     //   109: ifne -> 164
/*     */     //   112: ifeq -> 140
/*     */     //   115: goto -> 128
/*     */     //   118: ldc2_w -5402414767256116112
/*     */     //   121: lload_2
/*     */     //   122: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   127: athrow
/*     */     //   128: iconst_0
/*     */     //   129: ireturn
/*     */     //   130: ldc2_w -5402414767256116112
/*     */     //   133: lload_2
/*     */     //   134: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   139: athrow
/*     */     //   140: aload_0
/*     */     //   141: iload #4
/*     */     //   143: ifne -> 180
/*     */     //   146: getfield a : J
/*     */     //   149: lconst_0
/*     */     //   150: lcmp
/*     */     //   151: goto -> 164
/*     */     //   154: ldc2_w -5402414767256116112
/*     */     //   157: lload_2
/*     */     //   158: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   163: athrow
/*     */     //   164: ifne -> 179
/*     */     //   167: iconst_1
/*     */     //   168: ireturn
/*     */     //   169: ldc2_w -5402414767256116112
/*     */     //   172: lload_2
/*     */     //   173: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   178: athrow
/*     */     //   179: aload_0
/*     */     //   180: getfield b : Lme/konsolas/aac/eV;
/*     */     //   183: astore #6
/*     */     //   185: aload #5
/*     */     //   187: getfield b : Lme/konsolas/aac/eV;
/*     */     //   190: astore #7
/*     */     //   192: aload #6
/*     */     //   194: getfield d : I
/*     */     //   197: istore #8
/*     */     //   199: aload #7
/*     */     //   201: getfield d : I
/*     */     //   204: istore #9
/*     */     //   206: lconst_0
/*     */     //   207: lstore #10
/*     */     //   209: lload #10
/*     */     //   211: aload_0
/*     */     //   212: getfield a : J
/*     */     //   215: lcmp
/*     */     //   216: ifge -> 425
/*     */     //   219: aload #6
/*     */     //   221: getfield c : I
/*     */     //   224: iload #8
/*     */     //   226: isub
/*     */     //   227: aload #7
/*     */     //   229: getfield c : I
/*     */     //   232: iload #9
/*     */     //   234: isub
/*     */     //   235: invokestatic min : (II)I
/*     */     //   238: i2l
/*     */     //   239: lstore #12
/*     */     //   241: iconst_0
/*     */     //   242: iload #4
/*     */     //   244: ifne -> 426
/*     */     //   247: istore #14
/*     */     //   249: iload #14
/*     */     //   251: i2l
/*     */     //   252: lload #12
/*     */     //   254: lcmp
/*     */     //   255: ifge -> 329
/*     */     //   258: aload #6
/*     */     //   260: getfield h : [B
/*     */     //   263: iload #8
/*     */     //   265: iinc #8, 1
/*     */     //   268: baload
/*     */     //   269: iload #4
/*     */     //   271: ifne -> 320
/*     */     //   274: aload #7
/*     */     //   276: getfield h : [B
/*     */     //   279: iload #9
/*     */     //   281: iinc #9, 1
/*     */     //   284: baload
/*     */     //   285: iload #4
/*     */     //   287: ifne -> 336
/*     */     //   290: goto -> 303
/*     */     //   293: ldc2_w -5402414767256116112
/*     */     //   296: lload_2
/*     */     //   297: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   302: athrow
/*     */     //   303: if_icmpeq -> 321
/*     */     //   306: goto -> 319
/*     */     //   309: ldc2_w -5402414767256116112
/*     */     //   312: lload_2
/*     */     //   313: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   318: athrow
/*     */     //   319: iconst_0
/*     */     //   320: ireturn
/*     */     //   321: iinc #14, 1
/*     */     //   324: iload #4
/*     */     //   326: ifeq -> 249
/*     */     //   329: iload #8
/*     */     //   331: aload #6
/*     */     //   333: getfield c : I
/*     */     //   336: iload #4
/*     */     //   338: ifne -> 396
/*     */     //   341: if_icmpne -> 371
/*     */     //   344: goto -> 357
/*     */     //   347: ldc2_w -5402414767256116112
/*     */     //   350: lload_2
/*     */     //   351: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   356: athrow
/*     */     //   357: aload #6
/*     */     //   359: getfield b : Lme/konsolas/aac/eV;
/*     */     //   362: astore #6
/*     */     //   364: aload #6
/*     */     //   366: getfield d : I
/*     */     //   369: istore #8
/*     */     //   371: iload #9
/*     */     //   373: iload #4
/*     */     //   375: ifne -> 411
/*     */     //   378: aload #7
/*     */     //   380: getfield c : I
/*     */     //   383: goto -> 396
/*     */     //   386: ldc2_w -5402414767256116112
/*     */     //   389: lload_2
/*     */     //   390: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   395: athrow
/*     */     //   396: if_icmpne -> 413
/*     */     //   399: aload #7
/*     */     //   401: getfield b : Lme/konsolas/aac/eV;
/*     */     //   404: astore #7
/*     */     //   406: aload #7
/*     */     //   408: getfield d : I
/*     */     //   411: istore #9
/*     */     //   413: lload #10
/*     */     //   415: lload #12
/*     */     //   417: ladd
/*     */     //   418: lstore #10
/*     */     //   420: iload #4
/*     */     //   422: ifeq -> 209
/*     */     //   425: iconst_1
/*     */     //   426: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #811	-> 19
/*     */     //   #776	-> 54
/*     */     //   #899	-> 91
/*     */     //   #712	-> 97
/*     */     //   #762	-> 140
/*     */     //   #532	-> 179
/*     */     //   #181	-> 185
/*     */     //   #552	-> 192
/*     */     //   #729	-> 199
/*     */     //   #454	-> 206
/*     */     //   #648	-> 219
/*     */     //   #328	-> 241
/*     */     //   #580	-> 258
/*     */     //   #693	-> 321
/*     */     //   #582	-> 329
/*     */     //   #797	-> 357
/*     */     //   #699	-> 364
/*     */     //   #342	-> 371
/*     */     //   #200	-> 399
/*     */     //   #161	-> 406
/*     */     //   #593	-> 413
/*     */     //   #623	-> 425
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   19	29	32	java/lang/IllegalArgumentException
/*     */     //   25	44	44	java/lang/IllegalArgumentException
/*     */     //   55	66	69	java/lang/IllegalArgumentException
/*     */     //   60	81	81	java/lang/IllegalArgumentException
/*     */     //   97	115	118	java/lang/IllegalArgumentException
/*     */     //   112	130	130	java/lang/IllegalArgumentException
/*     */     //   140	151	154	java/lang/IllegalArgumentException
/*     */     //   164	169	169	java/lang/IllegalArgumentException
/*     */     //   258	290	293	java/lang/IllegalArgumentException
/*     */     //   274	306	309	java/lang/IllegalArgumentException
/*     */     //   336	344	347	java/lang/IllegalArgumentException
/*     */     //   371	383	386	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public final fw a(OutputStream paramOutputStream, long paramLong1, long paramLong2, long paramLong3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload #6
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: lload #6
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 69866131435677
/*     */     //   14: lxor
/*     */     //   15: lstore #8
/*     */     //   17: pop2
/*     */     //   18: ldc2_w 611700220722163765
/*     */     //   21: lload #6
/*     */     //   23: <illegal opcode> w : (JJ)I
/*     */     //   28: istore #10
/*     */     //   30: iload #10
/*     */     //   32: ifeq -> 124
/*     */     //   35: aload_1
/*     */     //   36: ifnonnull -> 86
/*     */     //   39: goto -> 53
/*     */     //   42: ldc2_w 611863110329129227
/*     */     //   45: lload #6
/*     */     //   47: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   52: athrow
/*     */     //   53: new java/lang/IllegalArgumentException
/*     */     //   56: dup
/*     */     //   57: sipush #6374
/*     */     //   60: ldc2_w 646574358159783593
/*     */     //   63: lload #6
/*     */     //   65: lxor
/*     */     //   66: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   71: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   74: athrow
/*     */     //   75: ldc2_w 611863110329129227
/*     */     //   78: lload #6
/*     */     //   80: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   85: athrow
/*     */     //   86: lload #6
/*     */     //   88: lconst_0
/*     */     //   89: lcmp
/*     */     //   90: ifle -> 110
/*     */     //   93: aload_0
/*     */     //   94: iload #10
/*     */     //   96: ifeq -> 145
/*     */     //   99: getfield a : J
/*     */     //   102: lload_2
/*     */     //   103: lload #4
/*     */     //   105: lload #8
/*     */     //   107: invokestatic a : (JJJJ)V
/*     */     //   110: goto -> 124
/*     */     //   113: ldc2_w 611863110329129227
/*     */     //   116: lload #6
/*     */     //   118: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   123: athrow
/*     */     //   124: lload #4
/*     */     //   126: lconst_0
/*     */     //   127: lcmp
/*     */     //   128: ifne -> 144
/*     */     //   131: aload_0
/*     */     //   132: areturn
/*     */     //   133: ldc2_w 611863110329129227
/*     */     //   136: lload #6
/*     */     //   138: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   143: athrow
/*     */     //   144: aload_0
/*     */     //   145: getfield b : Lme/konsolas/aac/eV;
/*     */     //   148: astore #11
/*     */     //   150: lload_2
/*     */     //   151: aload #11
/*     */     //   153: getfield c : I
/*     */     //   156: aload #11
/*     */     //   158: getfield d : I
/*     */     //   161: isub
/*     */     //   162: i2l
/*     */     //   163: lcmp
/*     */     //   164: iflt -> 227
/*     */     //   167: lload_2
/*     */     //   168: aload #11
/*     */     //   170: getfield c : I
/*     */     //   173: aload #11
/*     */     //   175: getfield d : I
/*     */     //   178: isub
/*     */     //   179: i2l
/*     */     //   180: lsub
/*     */     //   181: lstore_2
/*     */     //   182: aload #11
/*     */     //   184: getfield b : Lme/konsolas/aac/eV;
/*     */     //   187: astore #11
/*     */     //   189: iload #10
/*     */     //   191: lload #6
/*     */     //   193: lconst_0
/*     */     //   194: lcmp
/*     */     //   195: ifle -> 203
/*     */     //   198: ifeq -> 297
/*     */     //   201: iload #10
/*     */     //   203: ifne -> 150
/*     */     //   206: lload #6
/*     */     //   208: lconst_0
/*     */     //   209: lcmp
/*     */     //   210: ifle -> 189
/*     */     //   213: goto -> 227
/*     */     //   216: ldc2_w 611863110329129227
/*     */     //   219: lload #6
/*     */     //   221: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   226: athrow
/*     */     //   227: lload #4
/*     */     //   229: lconst_0
/*     */     //   230: lcmp
/*     */     //   231: ifle -> 297
/*     */     //   234: aload #11
/*     */     //   236: getfield d : I
/*     */     //   239: i2l
/*     */     //   240: lload_2
/*     */     //   241: ladd
/*     */     //   242: l2i
/*     */     //   243: istore #12
/*     */     //   245: aload #11
/*     */     //   247: getfield c : I
/*     */     //   250: iload #12
/*     */     //   252: isub
/*     */     //   253: i2l
/*     */     //   254: lload #4
/*     */     //   256: invokestatic min : (JJ)J
/*     */     //   259: l2i
/*     */     //   260: istore #13
/*     */     //   262: aload_1
/*     */     //   263: aload #11
/*     */     //   265: getfield h : [B
/*     */     //   268: iload #12
/*     */     //   270: iload #13
/*     */     //   272: invokevirtual write : ([BII)V
/*     */     //   275: lload #4
/*     */     //   277: iload #13
/*     */     //   279: i2l
/*     */     //   280: lsub
/*     */     //   281: lstore #4
/*     */     //   283: lconst_0
/*     */     //   284: lstore_2
/*     */     //   285: aload #11
/*     */     //   287: getfield b : Lme/konsolas/aac/eV;
/*     */     //   290: astore #11
/*     */     //   292: iload #10
/*     */     //   294: ifne -> 227
/*     */     //   297: aload_0
/*     */     //   298: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #819	-> 30
/*     */     //   #730	-> 86
/*     */     //   #119	-> 124
/*     */     //   #58	-> 144
/*     */     //   #364	-> 150
/*     */     //   #136	-> 167
/*     */     //   #330	-> 182
/*     */     //   #484	-> 227
/*     */     //   #927	-> 234
/*     */     //   #863	-> 245
/*     */     //   #336	-> 262
/*     */     //   #607	-> 275
/*     */     //   #399	-> 283
/*     */     //   #404	-> 285
/*     */     //   #139	-> 297
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   30	39	42	java/io/IOException
/*     */     //   35	75	75	java/io/IOException
/*     */     //   86	110	113	java/io/IOException
/*     */     //   124	133	133	java/io/IOException
/*     */     //   189	206	216	java/io/IOException
/*     */   }
/*     */   
/*     */   public gi a(int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4, int paramInt5, Charset paramCharset) {
/*     */     long l = paramInt1 << 32L | paramInt2 << 48L >>> 32L | paramInt5 << 48L >>> 48L;
/*     */     int i = (int)((l ^ 0x9A40BFE28AFL) >>> 32L), j = (int)((l ^ 0x9A40BFE28AFL) << 32L >>> 48L), k = (int)((l ^ 0x9A40BFE28AFL) << 48L >>> 48L);
/*     */     l ^ 0x9A40BFE28AFL;
/*     */     return a(i, j, k, paramString, paramInt3, paramInt4, paramCharset);
/*     */   }
/*     */   
/*     */   public gZ a(long paramLong) {
/*     */     long l = paramLong ^ 0x414F4921D612L;
/*     */     return new gZ(a(l));
/*     */   }
/*     */   
/*     */   List a(int paramInt, short paramShort, char paramChar) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/fw.f : J
/*     */     //   26: lxor
/*     */     //   27: lstore #4
/*     */     //   29: ldc2_w 3453665830589331925
/*     */     //   32: lload #4
/*     */     //   34: <illegal opcode> w : (JJ)I
/*     */     //   39: istore #6
/*     */     //   41: aload_0
/*     */     //   42: getfield b : Lme/konsolas/aac/eV;
/*     */     //   45: ifnonnull -> 63
/*     */     //   48: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   51: areturn
/*     */     //   52: ldc2_w 3417278155237654042
/*     */     //   55: lload #4
/*     */     //   57: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   62: athrow
/*     */     //   63: new java/util/ArrayList
/*     */     //   66: dup
/*     */     //   67: invokespecial <init> : ()V
/*     */     //   70: astore #7
/*     */     //   72: aload #7
/*     */     //   74: aload_0
/*     */     //   75: getfield b : Lme/konsolas/aac/eV;
/*     */     //   78: getfield c : I
/*     */     //   81: aload_0
/*     */     //   82: getfield b : Lme/konsolas/aac/eV;
/*     */     //   85: getfield d : I
/*     */     //   88: isub
/*     */     //   89: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   92: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   97: pop
/*     */     //   98: aload_0
/*     */     //   99: getfield b : Lme/konsolas/aac/eV;
/*     */     //   102: getfield b : Lme/konsolas/aac/eV;
/*     */     //   105: astore #8
/*     */     //   107: aload #8
/*     */     //   109: aload_0
/*     */     //   110: getfield b : Lme/konsolas/aac/eV;
/*     */     //   113: if_acmpeq -> 159
/*     */     //   116: aload #7
/*     */     //   118: iload #6
/*     */     //   120: iload_1
/*     */     //   121: ifle -> 138
/*     */     //   124: ifne -> 165
/*     */     //   127: aload #8
/*     */     //   129: getfield c : I
/*     */     //   132: aload #8
/*     */     //   134: getfield d : I
/*     */     //   137: isub
/*     */     //   138: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   141: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   146: pop
/*     */     //   147: aload #8
/*     */     //   149: getfield b : Lme/konsolas/aac/eV;
/*     */     //   152: astore #8
/*     */     //   154: iload #6
/*     */     //   156: ifeq -> 107
/*     */     //   159: iload_3
/*     */     //   160: iflt -> 154
/*     */     //   163: aload #7
/*     */     //   165: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #856	-> 41
/*     */     //   #197	-> 63
/*     */     //   #427	-> 72
/*     */     //   #498	-> 98
/*     */     //   #286	-> 116
/*     */     //   #295	-> 147
/*     */     //   #568	-> 159
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   41	52	52	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public gi a(int paramInt, long paramLong) {
/*     */     long l = paramLong ^ 0x7D488C6629E6L;
/*     */     return c(paramInt, l);
/*     */   }
/*     */   
/*     */   public short b(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 69799577546333
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 78003784390034
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 120059022573897
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w -7201141943050197928
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: istore #9
/*     */     //   33: aload_0
/*     */     //   34: iload #9
/*     */     //   36: ifeq -> 114
/*     */     //   39: getfield a : J
/*     */     //   42: ldc2_w 2
/*     */     //   45: lcmp
/*     */     //   46: ifge -> 113
/*     */     //   49: goto -> 62
/*     */     //   52: ldc2_w -7201093267433534106
/*     */     //   55: lload_1
/*     */     //   56: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   61: athrow
/*     */     //   62: new java/lang/IllegalStateException
/*     */     //   65: dup
/*     */     //   66: new java/lang/StringBuilder
/*     */     //   69: dup
/*     */     //   70: invokespecial <init> : ()V
/*     */     //   73: sipush #10059
/*     */     //   76: ldc2_w 938692985836723526
/*     */     //   79: lload_1
/*     */     //   80: lxor
/*     */     //   81: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   89: aload_0
/*     */     //   90: getfield a : J
/*     */     //   93: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   96: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   99: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   102: athrow
/*     */     //   103: ldc2_w -7201093267433534106
/*     */     //   106: lload_1
/*     */     //   107: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   112: athrow
/*     */     //   113: aload_0
/*     */     //   114: getfield b : Lme/konsolas/aac/eV;
/*     */     //   117: astore #10
/*     */     //   119: aload #10
/*     */     //   121: getfield d : I
/*     */     //   124: istore #11
/*     */     //   126: aload #10
/*     */     //   128: getfield c : I
/*     */     //   131: istore #12
/*     */     //   133: iload #12
/*     */     //   135: iload #11
/*     */     //   137: isub
/*     */     //   138: lload_1
/*     */     //   139: lconst_0
/*     */     //   140: lcmp
/*     */     //   141: ifle -> 203
/*     */     //   144: iconst_2
/*     */     //   145: iload #9
/*     */     //   147: ifeq -> 202
/*     */     //   150: if_icmpge -> 209
/*     */     //   153: goto -> 166
/*     */     //   156: ldc2_w -7201093267433534106
/*     */     //   159: lload_1
/*     */     //   160: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   165: athrow
/*     */     //   166: aload_0
/*     */     //   167: lload #5
/*     */     //   169: invokevirtual a : (J)B
/*     */     //   172: sipush #255
/*     */     //   175: iand
/*     */     //   176: bipush #8
/*     */     //   178: ishl
/*     */     //   179: aload_0
/*     */     //   180: lload #5
/*     */     //   182: invokevirtual a : (J)B
/*     */     //   185: sipush #255
/*     */     //   188: iand
/*     */     //   189: goto -> 202
/*     */     //   192: ldc2_w -7201093267433534106
/*     */     //   195: lload_1
/*     */     //   196: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   201: athrow
/*     */     //   202: ior
/*     */     //   203: istore #13
/*     */     //   205: iload #13
/*     */     //   207: i2s
/*     */     //   208: ireturn
/*     */     //   209: aload #10
/*     */     //   211: getfield h : [B
/*     */     //   214: astore #13
/*     */     //   216: aload #13
/*     */     //   218: iload #11
/*     */     //   220: iinc #11, 1
/*     */     //   223: baload
/*     */     //   224: sipush #255
/*     */     //   227: iand
/*     */     //   228: bipush #8
/*     */     //   230: ishl
/*     */     //   231: aload #13
/*     */     //   233: iload #11
/*     */     //   235: iinc #11, 1
/*     */     //   238: baload
/*     */     //   239: sipush #255
/*     */     //   242: iand
/*     */     //   243: ior
/*     */     //   244: istore #14
/*     */     //   246: aload_0
/*     */     //   247: dup
/*     */     //   248: getfield a : J
/*     */     //   251: ldc2_w 2
/*     */     //   254: lsub
/*     */     //   255: putfield a : J
/*     */     //   258: iload #9
/*     */     //   260: lload_1
/*     */     //   261: lconst_0
/*     */     //   262: lcmp
/*     */     //   263: ifle -> 321
/*     */     //   266: ifeq -> 319
/*     */     //   269: iload #11
/*     */     //   271: iload #12
/*     */     //   273: if_icmpne -> 330
/*     */     //   276: goto -> 289
/*     */     //   279: ldc2_w -7201093267433534106
/*     */     //   282: lload_1
/*     */     //   283: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   288: athrow
/*     */     //   289: aload_0
/*     */     //   290: aload #10
/*     */     //   292: lload #7
/*     */     //   294: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   297: putfield b : Lme/konsolas/aac/eV;
/*     */     //   300: aload #10
/*     */     //   302: lload_3
/*     */     //   303: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*     */     //   306: goto -> 319
/*     */     //   309: ldc2_w -7201093267433534106
/*     */     //   312: lload_1
/*     */     //   313: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   318: athrow
/*     */     //   319: iload #9
/*     */     //   321: lload_1
/*     */     //   322: lconst_0
/*     */     //   323: lcmp
/*     */     //   324: iflt -> 353
/*     */     //   327: ifne -> 350
/*     */     //   330: aload #10
/*     */     //   332: iload #11
/*     */     //   334: putfield d : I
/*     */     //   337: goto -> 350
/*     */     //   340: ldc2_w -7201093267433534106
/*     */     //   343: lload_1
/*     */     //   344: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   349: athrow
/*     */     //   350: iload #14
/*     */     //   352: i2s
/*     */     //   353: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #872	-> 33
/*     */     //   #283	-> 113
/*     */     //   #544	-> 119
/*     */     //   #254	-> 126
/*     */     //   #783	-> 133
/*     */     //   #461	-> 166
/*     */     //   #531	-> 180
/*     */     //   #594	-> 205
/*     */     //   #292	-> 209
/*     */     //   #341	-> 216
/*     */     //   #319	-> 246
/*     */     //   #403	-> 258
/*     */     //   #912	-> 289
/*     */     //   #814	-> 300
/*     */     //   #109	-> 330
/*     */     //   #651	-> 350
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   33	49	52	java/lang/IllegalArgumentException
/*     */     //   39	103	103	java/lang/IllegalArgumentException
/*     */     //   133	153	156	java/lang/IllegalArgumentException
/*     */     //   150	189	192	java/lang/IllegalArgumentException
/*     */     //   246	276	279	java/lang/IllegalArgumentException
/*     */     //   269	306	309	java/lang/IllegalArgumentException
/*     */     //   319	337	340	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public boolean a(long paramLong1, byte paramByte, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: iload_3
/*     */     //   1: i2l
/*     */     //   2: bipush #56
/*     */     //   4: lshl
/*     */     //   5: lload #4
/*     */     //   7: bipush #8
/*     */     //   9: lshl
/*     */     //   10: bipush #8
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: lstore #6
/*     */     //   16: ldc2_w -8416739930129113847
/*     */     //   19: lload #6
/*     */     //   21: <illegal opcode> w : (JJ)I
/*     */     //   26: istore #8
/*     */     //   28: aload_0
/*     */     //   29: getfield a : J
/*     */     //   32: lload_1
/*     */     //   33: lcmp
/*     */     //   34: iload #8
/*     */     //   36: ifne -> 57
/*     */     //   39: iflt -> 60
/*     */     //   42: goto -> 56
/*     */     //   45: ldc2_w -8380982273867719994
/*     */     //   48: lload #6
/*     */     //   50: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   55: athrow
/*     */     //   56: iconst_1
/*     */     //   57: goto -> 61
/*     */     //   60: iconst_0
/*     */     //   61: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #879	-> 28
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   28	42	45	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public long a(gZ paramgZ, long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload #4
/*     */     //   2: dup2
/*     */     //   3: ldc2_w 140136897129034
/*     */     //   6: lxor
/*     */     //   7: lstore #6
/*     */     //   9: dup2
/*     */     //   10: ldc2_w 51427448930713
/*     */     //   13: lxor
/*     */     //   14: lstore #8
/*     */     //   16: pop2
/*     */     //   17: ldc2_w -9122231796431406801
/*     */     //   20: lload #4
/*     */     //   22: <illegal opcode> w : (JJ)I
/*     */     //   27: istore #10
/*     */     //   29: aload_1
/*     */     //   30: invokevirtual a : ()I
/*     */     //   33: iload #10
/*     */     //   35: ifeq -> 91
/*     */     //   38: ifne -> 88
/*     */     //   41: goto -> 55
/*     */     //   44: ldc2_w -9122139045292945391
/*     */     //   47: lload #4
/*     */     //   49: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: new java/lang/IllegalArgumentException
/*     */     //   58: dup
/*     */     //   59: sipush #23308
/*     */     //   62: ldc2_w 8167386585680297072
/*     */     //   65: lload #4
/*     */     //   67: lxor
/*     */     //   68: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   73: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   76: athrow
/*     */     //   77: ldc2_w -9122139045292945391
/*     */     //   80: lload #4
/*     */     //   82: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   87: athrow
/*     */     //   88: lload_2
/*     */     //   89: lconst_0
/*     */     //   90: lcmp
/*     */     //   91: ifge -> 127
/*     */     //   94: new java/lang/IllegalArgumentException
/*     */     //   97: dup
/*     */     //   98: sipush #17766
/*     */     //   101: ldc2_w 4507355854644060686
/*     */     //   104: lload #4
/*     */     //   106: lxor
/*     */     //   107: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   112: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   115: athrow
/*     */     //   116: ldc2_w -9122139045292945391
/*     */     //   119: lload #4
/*     */     //   121: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   126: athrow
/*     */     //   127: aload_0
/*     */     //   128: getfield b : Lme/konsolas/aac/eV;
/*     */     //   131: astore #11
/*     */     //   133: lload #4
/*     */     //   135: lconst_0
/*     */     //   136: lcmp
/*     */     //   137: iflt -> 160
/*     */     //   140: aload #11
/*     */     //   142: ifnonnull -> 160
/*     */     //   145: ldc2_w -1
/*     */     //   148: lreturn
/*     */     //   149: ldc2_w -9122139045292945391
/*     */     //   152: lload #4
/*     */     //   154: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   159: athrow
/*     */     //   160: aload_0
/*     */     //   161: getfield a : J
/*     */     //   164: lload_2
/*     */     //   165: lload #4
/*     */     //   167: lconst_0
/*     */     //   168: lcmp
/*     */     //   169: iflt -> 179
/*     */     //   172: lsub
/*     */     //   173: iload #10
/*     */     //   175: ifeq -> 240
/*     */     //   178: lload_2
/*     */     //   179: lcmp
/*     */     //   180: ifge -> 239
/*     */     //   183: goto -> 197
/*     */     //   186: ldc2_w -9122139045292945391
/*     */     //   189: lload #4
/*     */     //   191: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   196: athrow
/*     */     //   197: aload_0
/*     */     //   198: getfield a : J
/*     */     //   201: lstore #12
/*     */     //   203: lload #12
/*     */     //   205: lload_2
/*     */     //   206: lcmp
/*     */     //   207: ifle -> 281
/*     */     //   210: aload #11
/*     */     //   212: getfield e : Lme/konsolas/aac/eV;
/*     */     //   215: astore #11
/*     */     //   217: lload #12
/*     */     //   219: aload #11
/*     */     //   221: getfield c : I
/*     */     //   224: aload #11
/*     */     //   226: getfield d : I
/*     */     //   229: isub
/*     */     //   230: i2l
/*     */     //   231: lsub
/*     */     //   232: lstore #12
/*     */     //   234: iload #10
/*     */     //   236: ifne -> 203
/*     */     //   239: lconst_0
/*     */     //   240: lstore #12
/*     */     //   242: lload #12
/*     */     //   244: aload #11
/*     */     //   246: getfield c : I
/*     */     //   249: aload #11
/*     */     //   251: getfield d : I
/*     */     //   254: isub
/*     */     //   255: i2l
/*     */     //   256: ladd
/*     */     //   257: dup2
/*     */     //   258: lstore #14
/*     */     //   260: lload_2
/*     */     //   261: lcmp
/*     */     //   262: ifge -> 281
/*     */     //   265: aload #11
/*     */     //   267: getfield b : Lme/konsolas/aac/eV;
/*     */     //   270: astore #11
/*     */     //   272: lload #14
/*     */     //   274: lstore #12
/*     */     //   276: iload #10
/*     */     //   278: ifne -> 242
/*     */     //   281: aload_1
/*     */     //   282: iconst_0
/*     */     //   283: lload #8
/*     */     //   285: invokevirtual a : (IJ)B
/*     */     //   288: istore #14
/*     */     //   290: aload_1
/*     */     //   291: invokevirtual a : ()I
/*     */     //   294: istore #15
/*     */     //   296: aload_0
/*     */     //   297: getfield a : J
/*     */     //   300: iload #15
/*     */     //   302: i2l
/*     */     //   303: lsub
/*     */     //   304: lconst_1
/*     */     //   305: ladd
/*     */     //   306: lstore #16
/*     */     //   308: lload #12
/*     */     //   310: lload #16
/*     */     //   312: lcmp
/*     */     //   313: ifge -> 554
/*     */     //   316: aload #11
/*     */     //   318: getfield h : [B
/*     */     //   321: astore #18
/*     */     //   323: aload #11
/*     */     //   325: getfield c : I
/*     */     //   328: i2l
/*     */     //   329: aload #11
/*     */     //   331: getfield d : I
/*     */     //   334: i2l
/*     */     //   335: lload #16
/*     */     //   337: ladd
/*     */     //   338: lload #12
/*     */     //   340: lsub
/*     */     //   341: invokestatic min : (JJ)J
/*     */     //   344: l2i
/*     */     //   345: istore #19
/*     */     //   347: aload #11
/*     */     //   349: getfield d : I
/*     */     //   352: lload #4
/*     */     //   354: lconst_0
/*     */     //   355: lcmp
/*     */     //   356: ifle -> 371
/*     */     //   359: i2l
/*     */     //   360: lload_2
/*     */     //   361: ladd
/*     */     //   362: lload #12
/*     */     //   364: lsub
/*     */     //   365: iload #10
/*     */     //   367: ifeq -> 557
/*     */     //   370: l2i
/*     */     //   371: istore #20
/*     */     //   373: iload #20
/*     */     //   375: iload #19
/*     */     //   377: if_icmpge -> 515
/*     */     //   380: aload #18
/*     */     //   382: iload #20
/*     */     //   384: baload
/*     */     //   385: iload #10
/*     */     //   387: lload #4
/*     */     //   389: lconst_0
/*     */     //   390: lcmp
/*     */     //   391: iflt -> 460
/*     */     //   394: ifeq -> 458
/*     */     //   397: iload #14
/*     */     //   399: iload #10
/*     */     //   401: ifeq -> 377
/*     */     //   404: lload #4
/*     */     //   406: lconst_0
/*     */     //   407: lcmp
/*     */     //   408: ifle -> 387
/*     */     //   411: goto -> 425
/*     */     //   414: ldc2_w -9122139045292945391
/*     */     //   417: lload #4
/*     */     //   419: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   424: athrow
/*     */     //   425: if_icmpne -> 507
/*     */     //   428: aload_0
/*     */     //   429: aload #11
/*     */     //   431: iload #20
/*     */     //   433: iconst_1
/*     */     //   434: iadd
/*     */     //   435: aload_1
/*     */     //   436: iconst_1
/*     */     //   437: iload #15
/*     */     //   439: lload #6
/*     */     //   441: invokespecial a : (Lme/konsolas/aac/eV;ILme/konsolas/aac/gZ;IIJ)Z
/*     */     //   444: goto -> 458
/*     */     //   447: ldc2_w -9122139045292945391
/*     */     //   450: lload #4
/*     */     //   452: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   457: athrow
/*     */     //   458: iload #10
/*     */     //   460: ifeq -> 502
/*     */     //   463: ifeq -> 507
/*     */     //   466: goto -> 480
/*     */     //   469: ldc2_w -9122139045292945391
/*     */     //   472: lload #4
/*     */     //   474: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   479: athrow
/*     */     //   480: iload #20
/*     */     //   482: aload #11
/*     */     //   484: getfield d : I
/*     */     //   487: isub
/*     */     //   488: goto -> 502
/*     */     //   491: ldc2_w -9122139045292945391
/*     */     //   494: lload #4
/*     */     //   496: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   501: athrow
/*     */     //   502: i2l
/*     */     //   503: lload #12
/*     */     //   505: ladd
/*     */     //   506: lreturn
/*     */     //   507: iinc #20, 1
/*     */     //   510: iload #10
/*     */     //   512: ifne -> 373
/*     */     //   515: lload #12
/*     */     //   517: aload #11
/*     */     //   519: getfield c : I
/*     */     //   522: aload #11
/*     */     //   524: getfield d : I
/*     */     //   527: isub
/*     */     //   528: i2l
/*     */     //   529: ladd
/*     */     //   530: lstore #12
/*     */     //   532: lload #12
/*     */     //   534: lstore_2
/*     */     //   535: aload #11
/*     */     //   537: getfield b : Lme/konsolas/aac/eV;
/*     */     //   540: astore #11
/*     */     //   542: iload #10
/*     */     //   544: lload #4
/*     */     //   546: lconst_0
/*     */     //   547: lcmp
/*     */     //   548: iflt -> 385
/*     */     //   551: ifne -> 308
/*     */     //   554: ldc2_w -1
/*     */     //   557: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #881	-> 29
/*     */     //   #496	-> 88
/*     */     //   #405	-> 127
/*     */     //   #821	-> 133
/*     */     //   #390	-> 145
/*     */     //   #560	-> 160
/*     */     //   #101	-> 197
/*     */     //   #775	-> 203
/*     */     //   #647	-> 210
/*     */     //   #786	-> 217
/*     */     //   #768	-> 239
/*     */     //   #546	-> 242
/*     */     //   #42	-> 265
/*     */     //   #611	-> 272
/*     */     //   #268	-> 281
/*     */     //   #689	-> 290
/*     */     //   #288	-> 296
/*     */     //   #716	-> 308
/*     */     //   #366	-> 316
/*     */     //   #840	-> 323
/*     */     //   #407	-> 347
/*     */     //   #442	-> 380
/*     */     //   #397	-> 480
/*     */     //   #51	-> 507
/*     */     //   #830	-> 515
/*     */     //   #612	-> 532
/*     */     //   #572	-> 535
/*     */     //   #726	-> 542
/*     */     //   #210	-> 554
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   29	41	44	java/io/IOException
/*     */     //   38	77	77	java/io/IOException
/*     */     //   91	116	116	java/io/IOException
/*     */     //   133	149	149	java/io/IOException
/*     */     //   160	183	186	java/io/IOException
/*     */     //   380	404	414	java/io/IOException
/*     */     //   425	444	447	java/io/IOException
/*     */     //   458	466	469	java/io/IOException
/*     */     //   463	488	491	java/io/IOException
/*     */   }
/*     */   
/*     */   public final gZ b(int paramInt1, int paramInt2, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/fw.f : J
/*     */     //   26: lxor
/*     */     //   27: lstore #4
/*     */     //   29: lload #4
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 7970579717125
/*     */     //   35: lxor
/*     */     //   36: lstore #6
/*     */     //   38: pop2
/*     */     //   39: aload_0
/*     */     //   40: sipush #378
/*     */     //   43: ldc2_w 6695898512485247843
/*     */     //   46: lload #4
/*     */     //   48: lxor
/*     */     //   49: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   54: lload #6
/*     */     //   56: invokespecial a : (Ljava/lang/String;J)Lme/konsolas/aac/gZ;
/*     */     //   59: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #888	-> 39
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: ldc2_w 16458272611004
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: ldc2_w 6157831651661999421
/*     */     //   11: lload_1
/*     */     //   12: <illegal opcode> w : (JJ)I
/*     */     //   17: aload_0
/*     */     //   18: getfield b : Lme/konsolas/aac/eV;
/*     */     //   21: astore #4
/*     */     //   23: istore_3
/*     */     //   24: aload #4
/*     */     //   26: ifnonnull -> 41
/*     */     //   29: iconst_0
/*     */     //   30: ireturn
/*     */     //   31: ldc2_w 6158099778627503107
/*     */     //   34: lload_1
/*     */     //   35: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   40: athrow
/*     */     //   41: iconst_1
/*     */     //   42: istore #5
/*     */     //   44: aload #4
/*     */     //   46: getfield d : I
/*     */     //   49: istore #6
/*     */     //   51: aload #4
/*     */     //   53: getfield c : I
/*     */     //   56: istore #7
/*     */     //   58: iload #6
/*     */     //   60: iload #7
/*     */     //   62: if_icmpge -> 105
/*     */     //   65: bipush #31
/*     */     //   67: iload #5
/*     */     //   69: imul
/*     */     //   70: aload #4
/*     */     //   72: getfield h : [B
/*     */     //   75: iload #6
/*     */     //   77: baload
/*     */     //   78: iadd
/*     */     //   79: istore #5
/*     */     //   81: iinc #6, 1
/*     */     //   84: iload_3
/*     */     //   85: ifeq -> 112
/*     */     //   88: iload_3
/*     */     //   89: ifne -> 58
/*     */     //   92: goto -> 105
/*     */     //   95: ldc2_w 6158099778627503107
/*     */     //   98: lload_1
/*     */     //   99: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   104: athrow
/*     */     //   105: aload #4
/*     */     //   107: getfield b : Lme/konsolas/aac/eV;
/*     */     //   110: astore #4
/*     */     //   112: aload #4
/*     */     //   114: aload_0
/*     */     //   115: getfield b : Lme/konsolas/aac/eV;
/*     */     //   118: if_acmpne -> 44
/*     */     //   121: iload #5
/*     */     //   123: iload_3
/*     */     //   124: ifeq -> 60
/*     */     //   127: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #894	-> 17
/*     */     //   #876	-> 24
/*     */     //   #632	-> 41
/*     */     //   #925	-> 44
/*     */     //   #758	-> 65
/*     */     //   #277	-> 81
/*     */     //   #472	-> 105
/*     */     //   #465	-> 112
/*     */     //   #816	-> 121
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   24	31	31	java/lang/IllegalArgumentException
/*     */     //   81	92	95	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public fw a(long paramLong, String paramString) {
/*     */     paramLong = f ^ paramLong;
/*     */     long l = paramLong ^ 0x1D4BFBDA4592L;
/*     */     return a(paramString, 0, l, paramString.length());
/*     */   }
/*     */   
/*     */   public long a(long paramLong1, fw paramfw, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 47262298442883
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: pop2
/*     */     //   9: ldc2_w -8553557825786290317
/*     */     //   12: lload_1
/*     */     //   13: <illegal opcode> w : (JJ)I
/*     */     //   18: istore #8
/*     */     //   20: aload_3
/*     */     //   21: ifnonnull -> 55
/*     */     //   24: new java/lang/IllegalArgumentException
/*     */     //   27: dup
/*     */     //   28: sipush #15051
/*     */     //   31: ldc2_w 1769389245099136263
/*     */     //   34: lload_1
/*     */     //   35: lxor
/*     */     //   36: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   41: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   44: athrow
/*     */     //   45: ldc2_w -8517759488651634500
/*     */     //   48: lload_1
/*     */     //   49: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: lload #4
/*     */     //   57: lconst_0
/*     */     //   58: lcmp
/*     */     //   59: iload #8
/*     */     //   61: lload_1
/*     */     //   62: lconst_0
/*     */     //   63: lcmp
/*     */     //   64: iflt -> 142
/*     */     //   67: ifne -> 140
/*     */     //   70: ifge -> 134
/*     */     //   73: goto -> 86
/*     */     //   76: ldc2_w -8517759488651634500
/*     */     //   79: lload_1
/*     */     //   80: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   85: athrow
/*     */     //   86: new java/lang/IllegalArgumentException
/*     */     //   89: dup
/*     */     //   90: new java/lang/StringBuilder
/*     */     //   93: dup
/*     */     //   94: invokespecial <init> : ()V
/*     */     //   97: bipush #29
/*     */     //   99: ldc2_w 4228295096053034995
/*     */     //   102: lload_1
/*     */     //   103: lxor
/*     */     //   104: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   112: lload #4
/*     */     //   114: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   117: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   120: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   123: athrow
/*     */     //   124: ldc2_w -8517759488651634500
/*     */     //   127: lload_1
/*     */     //   128: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   133: athrow
/*     */     //   134: aload_0
/*     */     //   135: getfield a : J
/*     */     //   138: lconst_0
/*     */     //   139: lcmp
/*     */     //   140: iload #8
/*     */     //   142: ifne -> 200
/*     */     //   145: ifne -> 175
/*     */     //   148: goto -> 161
/*     */     //   151: ldc2_w -8517759488651634500
/*     */     //   154: lload_1
/*     */     //   155: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   160: athrow
/*     */     //   161: ldc2_w -1
/*     */     //   164: lreturn
/*     */     //   165: ldc2_w -8517759488651634500
/*     */     //   168: lload_1
/*     */     //   169: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   174: athrow
/*     */     //   175: lload #4
/*     */     //   177: iload #8
/*     */     //   179: ifne -> 220
/*     */     //   182: aload_0
/*     */     //   183: getfield a : J
/*     */     //   186: lcmp
/*     */     //   187: goto -> 200
/*     */     //   190: ldc2_w -8517759488651634500
/*     */     //   193: lload_1
/*     */     //   194: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   199: athrow
/*     */     //   200: ifle -> 209
/*     */     //   203: aload_0
/*     */     //   204: getfield a : J
/*     */     //   207: lstore #4
/*     */     //   209: aload_3
/*     */     //   210: lload #6
/*     */     //   212: aload_0
/*     */     //   213: lload #4
/*     */     //   215: invokevirtual b : (JLme/konsolas/aac/fw;J)V
/*     */     //   218: lload #4
/*     */     //   220: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #909	-> 20
/*     */     //   #144	-> 55
/*     */     //   #433	-> 134
/*     */     //   #231	-> 175
/*     */     //   #300	-> 209
/*     */     //   #834	-> 218
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	45	45	java/lang/IllegalArgumentException
/*     */     //   55	73	76	java/lang/IllegalArgumentException
/*     */     //   70	124	124	java/lang/IllegalArgumentException
/*     */     //   140	148	151	java/lang/IllegalArgumentException
/*     */     //   145	165	165	java/lang/IllegalArgumentException
/*     */     //   175	187	190	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public void b(long paramLong1, fw paramfw, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 6498009824681
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 79938312659647
/*     */     //   12: lxor
/*     */     //   13: lstore #8
/*     */     //   15: dup2
/*     */     //   16: ldc2_w 125641998175426
/*     */     //   19: lxor
/*     */     //   20: lstore #10
/*     */     //   22: dup2
/*     */     //   23: ldc2_w 116284500905003
/*     */     //   26: lxor
/*     */     //   27: dup2
/*     */     //   28: bipush #48
/*     */     //   30: lushr
/*     */     //   31: l2i
/*     */     //   32: istore #12
/*     */     //   34: dup2
/*     */     //   35: bipush #16
/*     */     //   37: lshl
/*     */     //   38: bipush #48
/*     */     //   40: lushr
/*     */     //   41: l2i
/*     */     //   42: istore #13
/*     */     //   44: dup2
/*     */     //   45: bipush #32
/*     */     //   47: lshl
/*     */     //   48: bipush #32
/*     */     //   50: lushr
/*     */     //   51: l2i
/*     */     //   52: istore #14
/*     */     //   54: pop2
/*     */     //   55: dup2
/*     */     //   56: ldc2_w 3028949669904
/*     */     //   59: lxor
/*     */     //   60: lstore #15
/*     */     //   62: pop2
/*     */     //   63: aload_3
/*     */     //   64: ifnonnull -> 98
/*     */     //   67: new java/lang/IllegalArgumentException
/*     */     //   70: dup
/*     */     //   71: sipush #28959
/*     */     //   74: ldc2_w 5611608143049757293
/*     */     //   77: lload_1
/*     */     //   78: lxor
/*     */     //   79: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   84: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   87: athrow
/*     */     //   88: ldc2_w 381112874371011647
/*     */     //   91: lload_1
/*     */     //   92: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   97: athrow
/*     */     //   98: aload_3
/*     */     //   99: lload_1
/*     */     //   100: lconst_0
/*     */     //   101: lcmp
/*     */     //   102: ifle -> 141
/*     */     //   105: aload_0
/*     */     //   106: if_acmpne -> 140
/*     */     //   109: new java/lang/IllegalArgumentException
/*     */     //   112: dup
/*     */     //   113: sipush #18269
/*     */     //   116: ldc2_w 7004936257158620166
/*     */     //   119: lload_1
/*     */     //   120: lxor
/*     */     //   121: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   126: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   129: athrow
/*     */     //   130: ldc2_w 381112874371011647
/*     */     //   133: lload_1
/*     */     //   134: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   139: athrow
/*     */     //   140: aload_3
/*     */     //   141: getfield a : J
/*     */     //   144: lconst_0
/*     */     //   145: lload #4
/*     */     //   147: lload #6
/*     */     //   149: invokestatic a : (JJJJ)V
/*     */     //   152: lload #4
/*     */     //   154: lconst_0
/*     */     //   155: lcmp
/*     */     //   156: ifle -> 548
/*     */     //   159: lload #4
/*     */     //   161: aload_3
/*     */     //   162: getfield b : Lme/konsolas/aac/eV;
/*     */     //   165: getfield c : I
/*     */     //   168: aload_3
/*     */     //   169: getfield b : Lme/konsolas/aac/eV;
/*     */     //   172: getfield d : I
/*     */     //   175: isub
/*     */     //   176: i2l
/*     */     //   177: lcmp
/*     */     //   178: ifge -> 400
/*     */     //   181: goto -> 194
/*     */     //   184: ldc2_w 381112874371011647
/*     */     //   187: lload_1
/*     */     //   188: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   193: athrow
/*     */     //   194: aload_0
/*     */     //   195: getfield b : Lme/konsolas/aac/eV;
/*     */     //   198: ifnull -> 234
/*     */     //   201: goto -> 214
/*     */     //   204: ldc2_w 381112874371011647
/*     */     //   207: lload_1
/*     */     //   208: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   213: athrow
/*     */     //   214: aload_0
/*     */     //   215: getfield b : Lme/konsolas/aac/eV;
/*     */     //   218: getfield e : Lme/konsolas/aac/eV;
/*     */     //   221: goto -> 235
/*     */     //   224: ldc2_w 381112874371011647
/*     */     //   227: lload_1
/*     */     //   228: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   233: athrow
/*     */     //   234: aconst_null
/*     */     //   235: astore #17
/*     */     //   237: aload #17
/*     */     //   239: lload_1
/*     */     //   240: lconst_0
/*     */     //   241: lcmp
/*     */     //   242: ifle -> 250
/*     */     //   245: ifnull -> 382
/*     */     //   248: aload #17
/*     */     //   250: getfield i : Z
/*     */     //   253: ifeq -> 382
/*     */     //   256: goto -> 269
/*     */     //   259: ldc2_w 381112874371011647
/*     */     //   262: lload_1
/*     */     //   263: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   268: athrow
/*     */     //   269: lload #4
/*     */     //   271: aload #17
/*     */     //   273: getfield c : I
/*     */     //   276: i2l
/*     */     //   277: ladd
/*     */     //   278: aload #17
/*     */     //   280: lload_1
/*     */     //   281: lconst_0
/*     */     //   282: lcmp
/*     */     //   283: iflt -> 321
/*     */     //   286: getfield g : Z
/*     */     //   289: ifeq -> 319
/*     */     //   292: goto -> 305
/*     */     //   295: ldc2_w 381112874371011647
/*     */     //   298: lload_1
/*     */     //   299: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   304: athrow
/*     */     //   305: iconst_0
/*     */     //   306: goto -> 324
/*     */     //   309: ldc2_w 381112874371011647
/*     */     //   312: lload_1
/*     */     //   313: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   318: athrow
/*     */     //   319: aload #17
/*     */     //   321: getfield d : I
/*     */     //   324: i2l
/*     */     //   325: lsub
/*     */     //   326: ldc2_w 8192
/*     */     //   329: lcmp
/*     */     //   330: ifgt -> 382
/*     */     //   333: aload_3
/*     */     //   334: getfield b : Lme/konsolas/aac/eV;
/*     */     //   337: aload #17
/*     */     //   339: lload #4
/*     */     //   341: l2i
/*     */     //   342: lload #8
/*     */     //   344: dup2_x1
/*     */     //   345: pop2
/*     */     //   346: invokevirtual a : (Lme/konsolas/aac/eV;JI)V
/*     */     //   349: aload_3
/*     */     //   350: dup
/*     */     //   351: getfield a : J
/*     */     //   354: lload #4
/*     */     //   356: lsub
/*     */     //   357: putfield a : J
/*     */     //   360: aload_0
/*     */     //   361: dup
/*     */     //   362: getfield a : J
/*     */     //   365: lload #4
/*     */     //   367: ladd
/*     */     //   368: putfield a : J
/*     */     //   371: return
/*     */     //   372: ldc2_w 381112874371011647
/*     */     //   375: lload_1
/*     */     //   376: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   381: athrow
/*     */     //   382: aload_3
/*     */     //   383: aload_3
/*     */     //   384: getfield b : Lme/konsolas/aac/eV;
/*     */     //   387: lload #4
/*     */     //   389: l2i
/*     */     //   390: lload #10
/*     */     //   392: dup2_x1
/*     */     //   393: pop2
/*     */     //   394: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*     */     //   397: putfield b : Lme/konsolas/aac/eV;
/*     */     //   400: aload_3
/*     */     //   401: getfield b : Lme/konsolas/aac/eV;
/*     */     //   404: astore #17
/*     */     //   406: aload #17
/*     */     //   408: getfield c : I
/*     */     //   411: aload #17
/*     */     //   413: getfield d : I
/*     */     //   416: isub
/*     */     //   417: i2l
/*     */     //   418: lstore #18
/*     */     //   420: aload_3
/*     */     //   421: aload #17
/*     */     //   423: lload #15
/*     */     //   425: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*     */     //   428: putfield b : Lme/konsolas/aac/eV;
/*     */     //   431: aload_0
/*     */     //   432: getfield b : Lme/konsolas/aac/eV;
/*     */     //   435: lload_1
/*     */     //   436: lconst_0
/*     */     //   437: lcmp
/*     */     //   438: iflt -> 489
/*     */     //   441: ifnonnull -> 482
/*     */     //   444: aload_0
/*     */     //   445: aload #17
/*     */     //   447: putfield b : Lme/konsolas/aac/eV;
/*     */     //   450: aload_0
/*     */     //   451: getfield b : Lme/konsolas/aac/eV;
/*     */     //   454: aload_0
/*     */     //   455: getfield b : Lme/konsolas/aac/eV;
/*     */     //   458: aload_0
/*     */     //   459: getfield b : Lme/konsolas/aac/eV;
/*     */     //   462: dup_x1
/*     */     //   463: putfield e : Lme/konsolas/aac/eV;
/*     */     //   466: putfield b : Lme/konsolas/aac/eV;
/*     */     //   469: goto -> 513
/*     */     //   472: ldc2_w 381112874371011647
/*     */     //   475: lload_1
/*     */     //   476: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   481: athrow
/*     */     //   482: aload_0
/*     */     //   483: getfield b : Lme/konsolas/aac/eV;
/*     */     //   486: getfield e : Lme/konsolas/aac/eV;
/*     */     //   489: astore #20
/*     */     //   491: aload #20
/*     */     //   493: aload #17
/*     */     //   495: invokevirtual a : (Lme/konsolas/aac/eV;)Lme/konsolas/aac/eV;
/*     */     //   498: astore #20
/*     */     //   500: aload #20
/*     */     //   502: iload #12
/*     */     //   504: i2s
/*     */     //   505: iload #13
/*     */     //   507: i2s
/*     */     //   508: iload #14
/*     */     //   510: invokevirtual a : (SSI)V
/*     */     //   513: aload_3
/*     */     //   514: dup
/*     */     //   515: getfield a : J
/*     */     //   518: lload #18
/*     */     //   520: lsub
/*     */     //   521: putfield a : J
/*     */     //   524: aload_0
/*     */     //   525: dup
/*     */     //   526: getfield a : J
/*     */     //   529: lload #18
/*     */     //   531: ladd
/*     */     //   532: putfield a : J
/*     */     //   535: lload #4
/*     */     //   537: lload #18
/*     */     //   539: lsub
/*     */     //   540: lstore #4
/*     */     //   542: lload_1
/*     */     //   543: lconst_0
/*     */     //   544: lcmp
/*     */     //   545: ifgt -> 152
/*     */     //   548: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #910	-> 63
/*     */     //   #820	-> 98
/*     */     //   #523	-> 140
/*     */     //   #799	-> 152
/*     */     //   #313	-> 159
/*     */     //   #898	-> 194
/*     */     //   #192	-> 237
/*     */     //   #331	-> 305
/*     */     //   #88	-> 333
/*     */     //   #228	-> 349
/*     */     //   #714	-> 360
/*     */     //   #590	-> 371
/*     */     //   #882	-> 382
/*     */     //   #829	-> 400
/*     */     //   #16	-> 406
/*     */     //   #505	-> 420
/*     */     //   #792	-> 431
/*     */     //   #293	-> 444
/*     */     //   #371	-> 450
/*     */     //   #411	-> 482
/*     */     //   #880	-> 491
/*     */     //   #255	-> 500
/*     */     //   #217	-> 513
/*     */     //   #755	-> 524
/*     */     //   #680	-> 535
/*     */     //   #347	-> 542
/*     */     //   #907	-> 548
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   63	88	88	java/lang/IllegalArgumentException
/*     */     //   98	130	130	java/lang/IllegalArgumentException
/*     */     //   152	181	184	java/lang/IllegalArgumentException
/*     */     //   159	201	204	java/lang/IllegalArgumentException
/*     */     //   194	224	224	java/lang/IllegalArgumentException
/*     */     //   237	256	259	java/lang/IllegalArgumentException
/*     */     //   248	292	295	java/lang/IllegalArgumentException
/*     */     //   269	309	309	java/lang/IllegalArgumentException
/*     */     //   324	372	372	java/lang/IllegalArgumentException
/*     */     //   420	472	472	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public final gZ a(long paramLong, gZ paramgZ) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/fw.f : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 62135464282025
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: aload_0
/*     */     //   16: sipush #27404
/*     */     //   19: ldc2_w 8172824943116507023
/*     */     //   22: lload_1
/*     */     //   23: lxor
/*     */     //   24: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   29: lload #4
/*     */     //   31: aload_3
/*     */     //   32: invokespecial a : (Ljava/lang/String;JLme/konsolas/aac/gZ;)Lme/konsolas/aac/gZ;
/*     */     //   35: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #911	-> 15
/*     */   }
/*     */   
/*     */   public fw c(long paramLong, short paramShort, int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_3
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload #4
/*     */     //   7: i2l
/*     */     //   8: bipush #32
/*     */     //   10: lshl
/*     */     //   11: bipush #16
/*     */     //   13: lushr
/*     */     //   14: lor
/*     */     //   15: iload #5
/*     */     //   17: i2l
/*     */     //   18: bipush #48
/*     */     //   20: lshl
/*     */     //   21: bipush #48
/*     */     //   23: lushr
/*     */     //   24: lor
/*     */     //   25: getstatic me/konsolas/aac/fw.f : J
/*     */     //   28: lxor
/*     */     //   29: lstore #6
/*     */     //   31: lload #6
/*     */     //   33: dup2
/*     */     //   34: ldc2_w 117537437613053
/*     */     //   37: lxor
/*     */     //   38: lstore #8
/*     */     //   40: dup2
/*     */     //   41: ldc2_w 14568571987053
/*     */     //   44: lxor
/*     */     //   45: lstore #10
/*     */     //   47: dup2
/*     */     //   48: ldc2_w 125028351593429
/*     */     //   51: lxor
/*     */     //   52: lstore #12
/*     */     //   54: pop2
/*     */     //   55: ldc2_w -206557467893447318
/*     */     //   58: lload #6
/*     */     //   60: <illegal opcode> w : (JJ)I
/*     */     //   65: istore #14
/*     */     //   67: lload_1
/*     */     //   68: lconst_0
/*     */     //   69: lcmp
/*     */     //   70: iload #14
/*     */     //   72: ifeq -> 113
/*     */     //   75: ifne -> 112
/*     */     //   78: goto -> 92
/*     */     //   81: ldc2_w -206359305292043180
/*     */     //   84: lload #6
/*     */     //   86: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   91: athrow
/*     */     //   92: aload_0
/*     */     //   93: bipush #48
/*     */     //   95: lload #8
/*     */     //   97: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   100: areturn
/*     */     //   101: ldc2_w -206359305292043180
/*     */     //   104: lload #6
/*     */     //   106: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   111: athrow
/*     */     //   112: iconst_0
/*     */     //   113: istore #15
/*     */     //   115: lload_1
/*     */     //   116: lconst_0
/*     */     //   117: lcmp
/*     */     //   118: iload #14
/*     */     //   120: iload_3
/*     */     //   121: iflt -> 214
/*     */     //   124: ifeq -> 212
/*     */     //   127: ifge -> 207
/*     */     //   130: goto -> 144
/*     */     //   133: ldc2_w -206359305292043180
/*     */     //   136: lload #6
/*     */     //   138: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   143: athrow
/*     */     //   144: lload_1
/*     */     //   145: lneg
/*     */     //   146: lstore_1
/*     */     //   147: lload_1
/*     */     //   148: lconst_0
/*     */     //   149: lcmp
/*     */     //   150: iload #14
/*     */     //   152: ifeq -> 205
/*     */     //   155: ifge -> 204
/*     */     //   158: goto -> 172
/*     */     //   161: ldc2_w -206359305292043180
/*     */     //   164: lload #6
/*     */     //   166: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   171: athrow
/*     */     //   172: aload_0
/*     */     //   173: lload #12
/*     */     //   175: sipush #14576
/*     */     //   178: ldc2_w 3693282698560349132
/*     */     //   181: lload #6
/*     */     //   183: lxor
/*     */     //   184: <illegal opcode> p : (IJ)Ljava/lang/String;
/*     */     //   189: invokevirtual a : (JLjava/lang/String;)Lme/konsolas/aac/fw;
/*     */     //   192: areturn
/*     */     //   193: ldc2_w -206359305292043180
/*     */     //   196: lload #6
/*     */     //   198: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   203: athrow
/*     */     //   204: iconst_1
/*     */     //   205: istore #15
/*     */     //   207: lload_1
/*     */     //   208: ldc2_w 100000000
/*     */     //   211: lcmp
/*     */     //   212: iload #14
/*     */     //   214: iload #4
/*     */     //   216: ifle -> 583
/*     */     //   219: ifeq -> 581
/*     */     //   222: ifge -> 576
/*     */     //   225: goto -> 239
/*     */     //   228: ldc2_w -206359305292043180
/*     */     //   231: lload #6
/*     */     //   233: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   238: athrow
/*     */     //   239: lload_1
/*     */     //   240: ldc2_w 10000
/*     */     //   243: lcmp
/*     */     //   244: iload #14
/*     */     //   246: iload #5
/*     */     //   248: iflt -> 443
/*     */     //   251: ifeq -> 441
/*     */     //   254: goto -> 268
/*     */     //   257: ldc2_w -206359305292043180
/*     */     //   260: lload #6
/*     */     //   262: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   267: athrow
/*     */     //   268: ifge -> 436
/*     */     //   271: goto -> 285
/*     */     //   274: ldc2_w -206359305292043180
/*     */     //   277: lload #6
/*     */     //   279: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   284: athrow
/*     */     //   285: lload_1
/*     */     //   286: ldc2_w 100
/*     */     //   289: lcmp
/*     */     //   290: iload #14
/*     */     //   292: iload_3
/*     */     //   293: iflt -> 397
/*     */     //   296: ifeq -> 395
/*     */     //   299: goto -> 313
/*     */     //   302: ldc2_w -206359305292043180
/*     */     //   305: lload #6
/*     */     //   307: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   312: athrow
/*     */     //   313: ifge -> 390
/*     */     //   316: goto -> 330
/*     */     //   319: ldc2_w -206359305292043180
/*     */     //   322: lload #6
/*     */     //   324: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   329: athrow
/*     */     //   330: lload_1
/*     */     //   331: ldc2_w 10
/*     */     //   334: lcmp
/*     */     //   335: iload #14
/*     */     //   337: ifeq -> 387
/*     */     //   340: goto -> 354
/*     */     //   343: ldc2_w -206359305292043180
/*     */     //   346: lload #6
/*     */     //   348: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   353: athrow
/*     */     //   354: ifge -> 386
/*     */     //   357: goto -> 371
/*     */     //   360: ldc2_w -206359305292043180
/*     */     //   363: lload #6
/*     */     //   365: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   370: athrow
/*     */     //   371: iconst_1
/*     */     //   372: goto -> 1032
/*     */     //   375: ldc2_w -206359305292043180
/*     */     //   378: lload #6
/*     */     //   380: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   385: athrow
/*     */     //   386: iconst_2
/*     */     //   387: goto -> 1032
/*     */     //   390: lload_1
/*     */     //   391: ldc2_w 1000
/*     */     //   394: lcmp
/*     */     //   395: iload #14
/*     */     //   397: ifeq -> 433
/*     */     //   400: ifge -> 432
/*     */     //   403: goto -> 417
/*     */     //   406: ldc2_w -206359305292043180
/*     */     //   409: lload #6
/*     */     //   411: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   416: athrow
/*     */     //   417: iconst_3
/*     */     //   418: goto -> 1032
/*     */     //   421: ldc2_w -206359305292043180
/*     */     //   424: lload #6
/*     */     //   426: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   431: athrow
/*     */     //   432: iconst_4
/*     */     //   433: goto -> 1032
/*     */     //   436: lload_1
/*     */     //   437: ldc2_w 1000000
/*     */     //   440: lcmp
/*     */     //   441: iload #14
/*     */     //   443: iload_3
/*     */     //   444: iflt -> 535
/*     */     //   447: ifeq -> 533
/*     */     //   450: ifge -> 528
/*     */     //   453: goto -> 467
/*     */     //   456: ldc2_w -206359305292043180
/*     */     //   459: lload #6
/*     */     //   461: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   466: athrow
/*     */     //   467: lload_1
/*     */     //   468: ldc2_w 100000
/*     */     //   471: lcmp
/*     */     //   472: iload #14
/*     */     //   474: ifeq -> 525
/*     */     //   477: goto -> 491
/*     */     //   480: ldc2_w -206359305292043180
/*     */     //   483: lload #6
/*     */     //   485: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   490: athrow
/*     */     //   491: ifge -> 523
/*     */     //   494: goto -> 508
/*     */     //   497: ldc2_w -206359305292043180
/*     */     //   500: lload #6
/*     */     //   502: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   507: athrow
/*     */     //   508: iconst_5
/*     */     //   509: goto -> 1032
/*     */     //   512: ldc2_w -206359305292043180
/*     */     //   515: lload #6
/*     */     //   517: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   522: athrow
/*     */     //   523: bipush #6
/*     */     //   525: goto -> 1032
/*     */     //   528: lload_1
/*     */     //   529: ldc2_w 10000000
/*     */     //   532: lcmp
/*     */     //   533: iload #14
/*     */     //   535: ifeq -> 573
/*     */     //   538: ifge -> 571
/*     */     //   541: goto -> 555
/*     */     //   544: ldc2_w -206359305292043180
/*     */     //   547: lload #6
/*     */     //   549: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   554: athrow
/*     */     //   555: bipush #7
/*     */     //   557: goto -> 1032
/*     */     //   560: ldc2_w -206359305292043180
/*     */     //   563: lload #6
/*     */     //   565: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   570: athrow
/*     */     //   571: bipush #8
/*     */     //   573: goto -> 1032
/*     */     //   576: lload_1
/*     */     //   577: ldc2_w 1000000000000
/*     */     //   580: lcmp
/*     */     //   581: iload #14
/*     */     //   583: iload #4
/*     */     //   585: ifle -> 771
/*     */     //   588: ifeq -> 769
/*     */     //   591: ifge -> 764
/*     */     //   594: goto -> 608
/*     */     //   597: ldc2_w -206359305292043180
/*     */     //   600: lload #6
/*     */     //   602: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   607: athrow
/*     */     //   608: lload_1
/*     */     //   609: ldc2_w 10000000000
/*     */     //   612: lcmp
/*     */     //   613: iload #14
/*     */     //   615: iload #4
/*     */     //   617: ifle -> 723
/*     */     //   620: ifeq -> 721
/*     */     //   623: goto -> 637
/*     */     //   626: ldc2_w -206359305292043180
/*     */     //   629: lload #6
/*     */     //   631: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   636: athrow
/*     */     //   637: ifge -> 716
/*     */     //   640: goto -> 654
/*     */     //   643: ldc2_w -206359305292043180
/*     */     //   646: lload #6
/*     */     //   648: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   653: athrow
/*     */     //   654: lload_1
/*     */     //   655: ldc2_w 1000000000
/*     */     //   658: lcmp
/*     */     //   659: iload #14
/*     */     //   661: ifeq -> 713
/*     */     //   664: goto -> 678
/*     */     //   667: ldc2_w -206359305292043180
/*     */     //   670: lload #6
/*     */     //   672: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   677: athrow
/*     */     //   678: ifge -> 711
/*     */     //   681: goto -> 695
/*     */     //   684: ldc2_w -206359305292043180
/*     */     //   687: lload #6
/*     */     //   689: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   694: athrow
/*     */     //   695: bipush #9
/*     */     //   697: goto -> 1032
/*     */     //   700: ldc2_w -206359305292043180
/*     */     //   703: lload #6
/*     */     //   705: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   710: athrow
/*     */     //   711: bipush #10
/*     */     //   713: goto -> 1032
/*     */     //   716: lload_1
/*     */     //   717: ldc2_w 100000000000
/*     */     //   720: lcmp
/*     */     //   721: iload #14
/*     */     //   723: ifeq -> 761
/*     */     //   726: ifge -> 759
/*     */     //   729: goto -> 743
/*     */     //   732: ldc2_w -206359305292043180
/*     */     //   735: lload #6
/*     */     //   737: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   742: athrow
/*     */     //   743: bipush #11
/*     */     //   745: goto -> 1032
/*     */     //   748: ldc2_w -206359305292043180
/*     */     //   751: lload #6
/*     */     //   753: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   758: athrow
/*     */     //   759: bipush #12
/*     */     //   761: goto -> 1032
/*     */     //   764: lload_1
/*     */     //   765: ldc2_w 1000000000000000
/*     */     //   768: lcmp
/*     */     //   769: iload #14
/*     */     //   771: iload #4
/*     */     //   773: ifle -> 912
/*     */     //   776: ifeq -> 910
/*     */     //   779: ifge -> 905
/*     */     //   782: goto -> 796
/*     */     //   785: ldc2_w -206359305292043180
/*     */     //   788: lload #6
/*     */     //   790: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   795: athrow
/*     */     //   796: lload_1
/*     */     //   797: ldc2_w 10000000000000
/*     */     //   800: lcmp
/*     */     //   801: iload #14
/*     */     //   803: iload_3
/*     */     //   804: iflt -> 864
/*     */     //   807: ifeq -> 862
/*     */     //   810: goto -> 824
/*     */     //   813: ldc2_w -206359305292043180
/*     */     //   816: lload #6
/*     */     //   818: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   823: athrow
/*     */     //   824: ifge -> 857
/*     */     //   827: goto -> 841
/*     */     //   830: ldc2_w -206359305292043180
/*     */     //   833: lload #6
/*     */     //   835: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   840: athrow
/*     */     //   841: bipush #13
/*     */     //   843: goto -> 1032
/*     */     //   846: ldc2_w -206359305292043180
/*     */     //   849: lload #6
/*     */     //   851: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   856: athrow
/*     */     //   857: lload_1
/*     */     //   858: ldc2_w 100000000000000
/*     */     //   861: lcmp
/*     */     //   862: iload #14
/*     */     //   864: ifeq -> 902
/*     */     //   867: ifge -> 900
/*     */     //   870: goto -> 884
/*     */     //   873: ldc2_w -206359305292043180
/*     */     //   876: lload #6
/*     */     //   878: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   883: athrow
/*     */     //   884: bipush #14
/*     */     //   886: goto -> 1032
/*     */     //   889: ldc2_w -206359305292043180
/*     */     //   892: lload #6
/*     */     //   894: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   899: athrow
/*     */     //   900: bipush #15
/*     */     //   902: goto -> 1032
/*     */     //   905: lload_1
/*     */     //   906: ldc2_w 100000000000000000
/*     */     //   909: lcmp
/*     */     //   910: iload #14
/*     */     //   912: iload_3
/*     */     //   913: iflt -> 1005
/*     */     //   916: ifeq -> 1003
/*     */     //   919: ifge -> 998
/*     */     //   922: goto -> 936
/*     */     //   925: ldc2_w -206359305292043180
/*     */     //   928: lload #6
/*     */     //   930: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   935: athrow
/*     */     //   936: lload_1
/*     */     //   937: ldc2_w 10000000000000000
/*     */     //   940: lcmp
/*     */     //   941: iload #14
/*     */     //   943: ifeq -> 995
/*     */     //   946: goto -> 960
/*     */     //   949: ldc2_w -206359305292043180
/*     */     //   952: lload #6
/*     */     //   954: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   959: athrow
/*     */     //   960: ifge -> 993
/*     */     //   963: goto -> 977
/*     */     //   966: ldc2_w -206359305292043180
/*     */     //   969: lload #6
/*     */     //   971: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   976: athrow
/*     */     //   977: bipush #16
/*     */     //   979: goto -> 1032
/*     */     //   982: ldc2_w -206359305292043180
/*     */     //   985: lload #6
/*     */     //   987: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   992: athrow
/*     */     //   993: bipush #17
/*     */     //   995: goto -> 1032
/*     */     //   998: lload_1
/*     */     //   999: ldc2_w 1000000000000000000
/*     */     //   1002: lcmp
/*     */     //   1003: iload #14
/*     */     //   1005: ifeq -> 1027
/*     */     //   1008: ifge -> 1030
/*     */     //   1011: goto -> 1025
/*     */     //   1014: ldc2_w -206359305292043180
/*     */     //   1017: lload #6
/*     */     //   1019: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1024: athrow
/*     */     //   1025: bipush #18
/*     */     //   1027: goto -> 1032
/*     */     //   1030: bipush #19
/*     */     //   1032: istore #16
/*     */     //   1034: iload_3
/*     */     //   1035: iflt -> 1046
/*     */     //   1038: iload #15
/*     */     //   1040: ifeq -> 1060
/*     */     //   1043: iinc #16, 1
/*     */     //   1046: goto -> 1060
/*     */     //   1049: ldc2_w -206359305292043180
/*     */     //   1052: lload #6
/*     */     //   1054: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1059: athrow
/*     */     //   1060: aload_0
/*     */     //   1061: lload #10
/*     */     //   1063: iload #16
/*     */     //   1065: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*     */     //   1068: astore #17
/*     */     //   1070: aload #17
/*     */     //   1072: getfield h : [B
/*     */     //   1075: astore #18
/*     */     //   1077: aload #17
/*     */     //   1079: getfield c : I
/*     */     //   1082: iload #16
/*     */     //   1084: iadd
/*     */     //   1085: istore #19
/*     */     //   1087: lload_1
/*     */     //   1088: lconst_0
/*     */     //   1089: lcmp
/*     */     //   1090: ifeq -> 1154
/*     */     //   1093: lload_1
/*     */     //   1094: ldc2_w 10
/*     */     //   1097: lrem
/*     */     //   1098: l2i
/*     */     //   1099: istore #20
/*     */     //   1101: aload #18
/*     */     //   1103: iinc #19, -1
/*     */     //   1106: iload #19
/*     */     //   1108: getstatic me/konsolas/aac/fw.d : [B
/*     */     //   1111: iload #20
/*     */     //   1113: baload
/*     */     //   1114: bastore
/*     */     //   1115: lload_1
/*     */     //   1116: ldc2_w 10
/*     */     //   1119: ldiv
/*     */     //   1120: lstore_1
/*     */     //   1121: iload #14
/*     */     //   1123: iload_3
/*     */     //   1124: iflt -> 1132
/*     */     //   1127: ifeq -> 1211
/*     */     //   1130: iload #14
/*     */     //   1132: ifne -> 1087
/*     */     //   1135: iload #5
/*     */     //   1137: ifle -> 1121
/*     */     //   1140: goto -> 1154
/*     */     //   1143: ldc2_w -206359305292043180
/*     */     //   1146: lload #6
/*     */     //   1148: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1153: athrow
/*     */     //   1154: iload_3
/*     */     //   1155: iflt -> 1211
/*     */     //   1158: iload #15
/*     */     //   1160: ifeq -> 1187
/*     */     //   1163: aload #18
/*     */     //   1165: iinc #19, -1
/*     */     //   1168: iload #19
/*     */     //   1170: bipush #45
/*     */     //   1172: bastore
/*     */     //   1173: goto -> 1187
/*     */     //   1176: ldc2_w -206359305292043180
/*     */     //   1179: lload #6
/*     */     //   1181: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1186: athrow
/*     */     //   1187: aload #17
/*     */     //   1189: dup
/*     */     //   1190: getfield c : I
/*     */     //   1193: iload #16
/*     */     //   1195: iadd
/*     */     //   1196: putfield c : I
/*     */     //   1199: aload_0
/*     */     //   1200: dup
/*     */     //   1201: getfield a : J
/*     */     //   1204: iload #16
/*     */     //   1206: i2l
/*     */     //   1207: ladd
/*     */     //   1208: putfield a : J
/*     */     //   1211: aload_0
/*     */     //   1212: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #934	-> 67
/*     */     //   #116	-> 92
/*     */     //   #932	-> 112
/*     */     //   #170	-> 115
/*     */     //   #801	-> 144
/*     */     //   #608	-> 147
/*     */     //   #709	-> 172
/*     */     //   #860	-> 204
/*     */     //   #685	-> 207
/*     */     //   #482	-> 239
/*     */     //   #540	-> 285
/*     */     //   #85	-> 390
/*     */     //   #490	-> 436
/*     */     //   #738	-> 528
/*     */     //   #31	-> 576
/*     */     //   #278	-> 608
/*     */     //   #653	-> 716
/*     */     //   #260	-> 764
/*     */     //   #349	-> 857
/*     */     //   #628	-> 905
/*     */     //   #763	-> 998
/*     */     //   #635	-> 1034
/*     */     //   #808	-> 1043
/*     */     //   #252	-> 1060
/*     */     //   #610	-> 1070
/*     */     //   #700	-> 1077
/*     */     //   #239	-> 1087
/*     */     //   #19	-> 1093
/*     */     //   #740	-> 1101
/*     */     //   #196	-> 1115
/*     */     //   #428	-> 1121
/*     */     //   #485	-> 1154
/*     */     //   #866	-> 1163
/*     */     //   #159	-> 1187
/*     */     //   #621	-> 1199
/*     */     //   #473	-> 1211
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   67	78	81	java/lang/IllegalArgumentException
/*     */     //   75	101	101	java/lang/IllegalArgumentException
/*     */     //   115	130	133	java/lang/IllegalArgumentException
/*     */     //   147	158	161	java/lang/IllegalArgumentException
/*     */     //   155	193	193	java/lang/IllegalArgumentException
/*     */     //   212	225	228	java/lang/IllegalArgumentException
/*     */     //   222	254	257	java/lang/IllegalArgumentException
/*     */     //   239	271	274	java/lang/IllegalArgumentException
/*     */     //   268	299	302	java/lang/IllegalArgumentException
/*     */     //   285	316	319	java/lang/IllegalArgumentException
/*     */     //   313	340	343	java/lang/IllegalArgumentException
/*     */     //   330	357	360	java/lang/IllegalArgumentException
/*     */     //   354	375	375	java/lang/IllegalArgumentException
/*     */     //   395	403	406	java/lang/IllegalArgumentException
/*     */     //   400	421	421	java/lang/IllegalArgumentException
/*     */     //   441	453	456	java/lang/IllegalArgumentException
/*     */     //   450	477	480	java/lang/IllegalArgumentException
/*     */     //   467	494	497	java/lang/IllegalArgumentException
/*     */     //   491	512	512	java/lang/IllegalArgumentException
/*     */     //   533	541	544	java/lang/IllegalArgumentException
/*     */     //   538	560	560	java/lang/IllegalArgumentException
/*     */     //   581	594	597	java/lang/IllegalArgumentException
/*     */     //   591	623	626	java/lang/IllegalArgumentException
/*     */     //   608	640	643	java/lang/IllegalArgumentException
/*     */     //   637	664	667	java/lang/IllegalArgumentException
/*     */     //   654	681	684	java/lang/IllegalArgumentException
/*     */     //   678	700	700	java/lang/IllegalArgumentException
/*     */     //   721	729	732	java/lang/IllegalArgumentException
/*     */     //   726	748	748	java/lang/IllegalArgumentException
/*     */     //   769	782	785	java/lang/IllegalArgumentException
/*     */     //   779	810	813	java/lang/IllegalArgumentException
/*     */     //   796	827	830	java/lang/IllegalArgumentException
/*     */     //   824	846	846	java/lang/IllegalArgumentException
/*     */     //   862	870	873	java/lang/IllegalArgumentException
/*     */     //   867	889	889	java/lang/IllegalArgumentException
/*     */     //   910	922	925	java/lang/IllegalArgumentException
/*     */     //   919	946	949	java/lang/IllegalArgumentException
/*     */     //   936	963	966	java/lang/IllegalArgumentException
/*     */     //   960	982	982	java/lang/IllegalArgumentException
/*     */     //   1003	1011	1014	java/lang/IllegalArgumentException
/*     */     //   1034	1046	1049	java/lang/IllegalArgumentException
/*     */     //   1121	1135	1143	java/lang/IllegalArgumentException
/*     */     //   1154	1173	1176	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public void close() {}
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: ldc2_w -8011179311575699604
/*     */     //   3: ldc2_w -2126309967526156674
/*     */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*     */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*     */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*     */     //   15: ldc2_w 231757430367906
/*     */     //   18: invokeinterface a : (J)J
/*     */     //   23: putstatic me/konsolas/aac/fw.f : J
/*     */     //   26: getstatic me/konsolas/aac/fw.f : J
/*     */     //   29: ldc2_w 116185098345264
/*     */     //   32: lxor
/*     */     //   33: lstore #9
/*     */     //   35: iconst_0
/*     */     //   36: new java/util/HashMap
/*     */     //   39: dup
/*     */     //   40: bipush #13
/*     */     //   42: invokespecial <init> : (I)V
/*     */     //   45: putstatic me/konsolas/aac/fw.i : Ljava/util/Map;
/*     */     //   48: ldc2_w -7708083023690975456
/*     */     //   51: lload #9
/*     */     //   53: <illegal opcode> w : (IJJ)V
/*     */     //   58: ldc_w '穗䳡ﾉ?嫻㨢郊妟뺴霊䇐᳎ጩ쮂㓴㵞˨⌢犬'
/*     */     //   61: invokevirtual toCharArray : ()[C
/*     */     //   64: dup
/*     */     //   65: dup
/*     */     //   66: iconst_1
/*     */     //   67: dup_x1
/*     */     //   68: caload
/*     */     //   69: sipush #28753
/*     */     //   72: ixor
/*     */     //   73: i2c
/*     */     //   74: castore
/*     */     //   75: sipush #18057
/*     */     //   78: iconst_0
/*     */     //   79: iconst_5
/*     */     //   80: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   83: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*     */     //   86: dup
/*     */     //   87: astore_0
/*     */     //   88: iconst_2
/*     */     //   89: ldc_w '덿䓒팮䰊'
/*     */     //   92: invokevirtual toCharArray : ()[C
/*     */     //   95: dup
/*     */     //   96: dup
/*     */     //   97: iconst_1
/*     */     //   98: dup_x1
/*     */     //   99: caload
/*     */     //   100: sipush #2238
/*     */     //   103: ixor
/*     */     //   104: i2c
/*     */     //   105: castore
/*     */     //   106: sipush #3468
/*     */     //   109: iconst_0
/*     */     //   110: iconst_0
/*     */     //   111: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   114: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*     */     //   117: bipush #8
/*     */     //   119: newarray byte
/*     */     //   121: dup
/*     */     //   122: iconst_0
/*     */     //   123: lload #9
/*     */     //   125: bipush #56
/*     */     //   127: lushr
/*     */     //   128: l2i
/*     */     //   129: i2b
/*     */     //   130: bastore
/*     */     //   131: iconst_1
/*     */     //   132: istore_1
/*     */     //   133: iload_1
/*     */     //   134: bipush #8
/*     */     //   136: if_icmpge -> 160
/*     */     //   139: dup
/*     */     //   140: iload_1
/*     */     //   141: lload #9
/*     */     //   143: iload_1
/*     */     //   144: bipush #8
/*     */     //   146: imul
/*     */     //   147: lshl
/*     */     //   148: bipush #56
/*     */     //   150: lushr
/*     */     //   151: l2i
/*     */     //   152: i2b
/*     */     //   153: bastore
/*     */     //   154: iinc #1, 1
/*     */     //   157: goto -> 133
/*     */     //   160: new javax/crypto/spec/DESKeySpec
/*     */     //   163: dup_x1
/*     */     //   164: swap
/*     */     //   165: invokespecial <init> : ([B)V
/*     */     //   168: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*     */     //   171: new javax/crypto/spec/IvParameterSpec
/*     */     //   174: dup
/*     */     //   175: bipush #8
/*     */     //   177: newarray byte
/*     */     //   179: invokespecial <init> : ([B)V
/*     */     //   182: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*     */     //   185: bipush #57
/*     */     //   187: anewarray java/lang/String
/*     */     //   190: astore #7
/*     */     //   192: iconst_0
/*     */     //   193: istore #5
/*     */     //   195: ldc_w '뒂ꮳ趦䇖蹙뎕좹䠭㓨⨲邎Ć㰊哬ǩ厨ョ੄꣏Ѝ崛ᨨ엕橢ユ륧伩榴਎࿯ꃷ?俇閒ࢉ㉝Ấ潡榾憎䖪ﴀ℥꒐Ɵ氒뛜ꟲ䨘㩵搄?箵᝙䋃Ｘ؏媡穪ㅳѯŒ⺵Β᝛錁잪莏융?큩貰℄㢒㰒䞳袞뵐댠目䮕㵡誥㳾α扦䋑蔿诘ڭ矯郬䕎礬賿淒衙뜽䅿﫬ᒔȂ调䝊湏䳘揎嫜?룣ᰆې굃冪ꉸ䢓䪐濆晥뾵减⬛Ӆ抮䊲ᾬ훚ޠ텏愒꾒誺ⵍ訊ｋ项쁫㽚ꂣ䀠죤꜠䆈뗲肼鼚ﻭ풖宩莜檒⾝䤡?福䱒飫⁜쁜場湮枲寶䎟᫜궒儏໥⌠㾾ڇ?灤?㍝䷩媮匌謓純ࡅ䖛ꯏ뚖鼿ꤿ큍嶾肖錬ꕜગ遤촡㓋촊컜ﾝ鼹䄿钻㎴抿谑줴ﮨጇ嚆褢驚㫐蠆拥晞훢䟥槨萮ﾲ諏ꂵ鶌币Ⳓ᡹왆誓뒅룓瞣૮頢ꍨꑾ谀⬌哲藎᫴섭鑕ສ䦉远﹠寤ò┢良᧟လ䕤럣疄࿲﹇穳씇䛰ٙ㤵⧃㡙嵳炐ྛ唛ሽퟣᒾƫ렀벥ŏè㘢盋걙룐┗読띸⿟耱︃曅㢘搥繯鯇䄾똟웒悉㧔ⷫ⑙7拝遴鱩㎪?捎᫯䕉᰸왛竗곔ㄋ랂籝凍퐗峽鷮ﱊ瘝ۖⶔ몳꼙縼?ゴ쳢먹鑹똍쑍셽綣얘↴徭ꚴ筍,ﶩ袝橿?뮋䆬韬놕ꡗ韂큤࿜ሪᖻ畣袞榫翫?⠨ꚤ碢虉༽㘔㘹굯췡懝楷鷥ꨱ?额蚓ᩘভ⡞쨫㼅甐韤ᡕ호딈㨲馑ﬅ靊∑Η뢺䂝ᵆᧄ䛬ƛ鍭싰䪆倘㿜춂ײַ囉靖ﷁ햭訿ꛤ爵泿ぽᅤ྾쑎짇槪惍ꇪᴐ狖ﯼŬ銡벋摻㹙羶ѳꆇ祋㬣뽕㘥喜蝊찉⒧䀎?蚌걟嚳矇⫷甆䟑춧鳙蘘孏啘䤊蹮ᓏ롻彖ﱃ蠄洢䝦镡ឧ杲閈ၤ쿻퟊Ṳ꧹컪巊?꺩姩⪀蘿ﶂ㻅苢該툃뫇箦䯘۷ﻞ?喝ݬ퍕ᖣꎙ̥ᤛꈝᝡｏ貪✀鿵氹匓긪䠚팛ꯥἻ䞏ퟓㄴ⤁ꮶ㘉䪙㕳꧋텪踃ဃ䣈賖ꏮˑဳ곃죂挢㷪㡉ҽ䟖낪囌뫅๽觤쉡麅䊜콩᧩㪇铂॒斑哓?Ȫ툐ࡍ趪袍䲞呣甓?䬯틟슱쇒籗혴븭釽凂伉펫?歁抸⪮璎ࢨꥥ麓?㧵壸ⲛ嬠뙌ᝩޕ违杈ޡ⺉弻㡉ꋯ宑왫?ऩꊽ꣪ꗷ襰휺迍혿烗퀙籈㨕?㨺⦵찤߹䈪☭熟髰㮅ሣ愵椮鲣ؚ類⓺㍂≣淣㸶皤?銤꼇殺徐ዻ쌣ᗅ胭ೕ咍ᤎ飽耮찓಼煟❐찄ਸ਼瓐᱈헔␘?䂍叆ஐ緐?沛Ϩ?ᵡ镙粬䧂릆㒊뜡?桂甼㔢갞矨淐㇌恉ᕜ뒯ऊ聎蕎즓븕駰僟찐囂✒쀙푵䕳噏䄁섄呢⑺?픋孮ॊ頱?正᧪쥜?⯗誋ꧠ䷠⠴༛ẚꃾᇃ庩?䶐콙栵剻ᄟჰ浒뵵?꣩カ览刀뽬社앀죪枡༞ﾾ퓁⣫?ሶ?宖꺓?鍵羐㽯䜅ꘕꗶ඾靐閗С쳧㓚⡯Ϭ娃㜽೧俐꾭ᗻ䟾ꁑ胭?갌䫋둕ꉇᨂ뮏ಔ綩ᷓ垣捝䭜᠟砸钿삁㥛併ఀ촐ꛦﰞ隠˩䅤ᔭꜰ牀㰴ఐ㋷ᶃዊ쁋⟶䈥腷⧆䬣밎䓩澜梕ණ렡빅斺鎁ựᙸ젆뜩螊ꘊ되꽉ᮍ檬᭣ႋ깷⯦쿿壇듲นꔯ쒅褂⓭핕靄皰⨢ʎ换㰶䟱鵣닾؊ቲ䊊ꥒ䷼ꮞ귳瀫ᗆ蠯ꛐ䥭黺洝঴酪騌粝餠傛쐱ා㼯孮柜硃㳷炖⍐䜾寰䰋아ˬ쒁뽢苇䵐〞葪⋔⤅?䠴魡劋㿣뉫㮋ᚮ.偍乍깯鲅?懈ꬪ骏㚡鏘ს푞⾜毵쩥콚ឲ쩙넂냳셿Ὣ䭍粈㒶굁鑯劘ꚑ⦅숈ദ籝ᄀ껃峒ᎢᲜ쥳붱듿塥ꋪ✓텞䛱?汘ሦ杛ૻ奩脦ꊛ?첪깿謴ꅯ㓱鵭?镉眧퇿὏ᦛﱻ㙖莂늝㝤䄵㣁Ꞹ쬅㒛不⿐䒇✧偋읕櫷䙫ꊭ荢潉䆧⚏ᝦﴝᕸ빙柔冻?滵鵌Ἐ㽴鲧㡢舅⃢齀佶⣪䵻饸騂ａ鼾괈聇쥧ඦ柊㬼?嵁ᙆ﬏鼉䟬緓ഁ䀥믲࣒ႀᢗ蚈쏯華仪㛋ڿ花寞鋸ﺢƞ앗㫬䌞ࢍ呺㌯憥䲤㌕Ⳁ箆ꑴ⺾琱箼?꿓块ｾ䈦൚Ⲏဌ廽蕇绉㓉໚鏡鲶蕰嫣湤㉾ꆹ㽿緧㡜㋰뛄뎭罠嘒㋗웮怂☇糊몹뵍僺깣㗕?ꭒ轆༬濂焍䡾⢕ⶂᣇ騆௭冺䉏풬㭵촕虼ꤟ嶶䮛☳骙⻬蠽놺숟∴曗䚺㠝ꃔ嗥ሩㄓ仁闆뎒Ϳᱶﮌ荤滕ĤἙ?运䄷됃全죿鼟숵鴤홾㴧熬뇘쾹ꪉ澺﫺ⲭఃᮮ?ᦚ脹䲛눖蕫䢞₹뉟㟡꽗ᩙ咃?뎋㽏໌ੋ㗒ꀷ㾟⸾製濾뒆삫␭ᄁ쟌룊鈆∮⮕⍖ꮊ솛뎱㻲཭Ⰼﱨᇏ૾ﳔ᷋弆棢芏嬪뭥焉鯹お装⾒ﶢ␞툫疳櫷☸䈍쫾?⽍ㄷ呜ʣ䂇勗몲භ沯ꪑ艝Ṫ排췶࿪ǂ絊嘚ꇥꕔꜩ䜷ヾ?藧끧귦実綤䋸蓮ꃃ킨⼭鶝࡫?즬㋇포핹䓳巉՜鿰౑?칩⌝Ȳ걶槄앆⮡䄼䬋u쭚羌璸髟ꔴ컆煓秶胫ᐝ쭔뉰煉簌侀﹘঍ڰ?离쩈됌쐯엠埕ὅ┻ᅊ뮢캯襅玵鈆播䮛ේ攁ꆚ줌蘶뜫䳻遥高൪孏芠宂岊硦჏ᚆڒ㉵컅䮓驪晵턱೚㭦ʄᝉ电튟僣ညゾ㥅㰶턅뎍省쑩﹵ꭧ㎸?鈈ﮁ폆윉㲩ᒈ䩦ᴧ괳ⵑ쀠Ἇ囱ምꪫ⪶?쇄䪋稄ଶೇꊜꦷ硙룷傁궢싻倃嫳ᇄ縙ﳇ䨪ἑ阐飐툛혰뼽ᯚ篢횒ﰳ氢?ڐᜢ礂㱸笣ﮥ鐝?쭧耿愮斵跥鏏⊑번䘰蹩穴죖荭涌ѡ憮㼞ⶖ颓䠉罿㫁倻剒滻Ϩ?孶켒矑ꋏ✺?黬楤ര?怒ᔞ?敖좏뵾㑵잞┭ௌ鿨닁㔑䎀ᇜ菝穬늅Ȩ딦㯵秗쿫ỽ⻧ᜁ塜䫞㷋栗䟌嫚ﷵ鴑味阿Ỽ࣠ꕆ䡮很᭔鋗붻ꮩ쓸অ秸빮鄐嗮猚ﮏ䷪䒐탇瑩墡횼〢ꦟ揢൬ᒞቔ歎௡㘻㌾禵؇⫕닅顉脜悾⎋欌ℓ囫뮢鵞褠썞嵋뗥埘陟限黉荢䂆﮲ฝ昘匸鉢ꅝ▒⨁ꧧɸᆤ鯯㻛㳤叹ሬ搎ণ渽⣲⇰ܓ䋤㩥Ⲕ斱Ţ辥₪럾뉣輶ᔀ崢琔틘땖⏡㉂㣪藺?툱♞姯ᤸ⌈햃겎执쟏䂫ʇͷ᭚痊迯㩒?ୟ쓷ឫ䫑꣊郤⸖枱霷쫖包ው볍祲浅㷕Ⓗ덍⏿㳣鼠⋑붟꧖ᇈᒡಫꁊ五⟦闕嶈쉳铢쾊䋎➊??㙏緻쮉峯项?ꗌ똚碘룑涮렽?쵾䧱뗦ꈶ嬔쀐䦈ᡙ飗콤ࠑ港䲵ꠍ랋싍૯؁뛂譔龄Ꮵ偋䱱纺覦膎狓꫅ᩌ鋺䝺ꛋ좇ᗔ쳙̽㖎ဦ䡨媏ꗉ呟籢뺗쏜ꝕཛྷ攵⋬ᜰ․ᔲ혇硬曏➑쑄䂳⨝㷇㧅侈쨪襤뽦泛ꮩ쫚㢩὿饳躼䫭쓴햩⪲鑓㥼ꐸ鵎罵ྑꋬ䎥쟩趣枌憕痵㠤ꢥ㜖骊쮥䬇㖶秽䎰禎␄?獷┺ݬ혨䬼혃ꋯ䑓旅柜碑座ᐩ팾떀⳱'
/*     */     //   198: invokevirtual toCharArray : ()[C
/*     */     //   201: dup
/*     */     //   202: dup
/*     */     //   203: sipush #373
/*     */     //   206: dup_x1
/*     */     //   207: caload
/*     */     //   208: sipush #17423
/*     */     //   211: ixor
/*     */     //   212: i2c
/*     */     //   213: castore
/*     */     //   214: sipush #16165
/*     */     //   217: iconst_0
/*     */     //   218: iconst_0
/*     */     //   219: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   222: dup
/*     */     //   223: astore #4
/*     */     //   225: invokevirtual length : ()I
/*     */     //   228: istore #6
/*     */     //   230: bipush #16
/*     */     //   232: istore_3
/*     */     //   233: iconst_m1
/*     */     //   234: istore_2
/*     */     //   235: iinc #2, 1
/*     */     //   238: aload #4
/*     */     //   240: iload_2
/*     */     //   241: dup
/*     */     //   242: iload_3
/*     */     //   243: iadd
/*     */     //   244: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   247: iconst_m1
/*     */     //   248: goto -> 382
/*     */     //   251: aload #7
/*     */     //   253: swap
/*     */     //   254: iload #5
/*     */     //   256: iinc #5, 1
/*     */     //   259: swap
/*     */     //   260: aastore
/*     */     //   261: iload_2
/*     */     //   262: iload_3
/*     */     //   263: iadd
/*     */     //   264: dup
/*     */     //   265: istore_2
/*     */     //   266: iload #6
/*     */     //   268: if_icmpge -> 281
/*     */     //   271: aload #4
/*     */     //   273: iload_2
/*     */     //   274: invokevirtual charAt : (I)C
/*     */     //   277: istore_3
/*     */     //   278: goto -> 235
/*     */     //   281: ldc_w '걢叐ⶶ胠柢謫┡仍䘻喁⚂施醴졑矸灋䳲賱⿇꯻⏊ゑ魻掐﷐퉜嬶뼤萓羖찧뀐奚Ｎ?柼'
/*     */     //   284: invokevirtual toCharArray : ()[C
/*     */     //   287: dup
/*     */     //   288: dup
/*     */     //   289: bipush #10
/*     */     //   291: dup_x1
/*     */     //   292: caload
/*     */     //   293: sipush #27609
/*     */     //   296: ixor
/*     */     //   297: i2c
/*     */     //   298: castore
/*     */     //   299: sipush #1879
/*     */     //   302: iconst_1
/*     */     //   303: iconst_0
/*     */     //   304: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   307: dup
/*     */     //   308: astore #4
/*     */     //   310: invokevirtual length : ()I
/*     */     //   313: istore #6
/*     */     //   315: bipush #16
/*     */     //   317: istore_3
/*     */     //   318: iconst_m1
/*     */     //   319: istore_2
/*     */     //   320: iinc #2, 1
/*     */     //   323: aload #4
/*     */     //   325: iload_2
/*     */     //   326: dup
/*     */     //   327: iload_3
/*     */     //   328: iadd
/*     */     //   329: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   332: iconst_0
/*     */     //   333: goto -> 382
/*     */     //   336: aload #7
/*     */     //   338: swap
/*     */     //   339: iload #5
/*     */     //   341: iinc #5, 1
/*     */     //   344: swap
/*     */     //   345: aastore
/*     */     //   346: iload_2
/*     */     //   347: iload_3
/*     */     //   348: iadd
/*     */     //   349: dup
/*     */     //   350: istore_2
/*     */     //   351: iload #6
/*     */     //   353: if_icmpge -> 366
/*     */     //   356: aload #4
/*     */     //   358: iload_2
/*     */     //   359: invokevirtual charAt : (I)C
/*     */     //   362: istore_3
/*     */     //   363: goto -> 320
/*     */     //   366: aload #7
/*     */     //   368: putstatic me/konsolas/aac/fw.g : [Ljava/lang/String;
/*     */     //   371: bipush #57
/*     */     //   373: anewarray java/lang/String
/*     */     //   376: putstatic me/konsolas/aac/fw.h : [Ljava/lang/String;
/*     */     //   379: goto -> 444
/*     */     //   382: swap
/*     */     //   383: ldc_w '믟訍뗨?癤⚃ʰច⻂僋'
/*     */     //   386: invokevirtual toCharArray : ()[C
/*     */     //   389: dup
/*     */     //   390: dup
/*     */     //   391: iconst_0
/*     */     //   392: dup_x1
/*     */     //   393: caload
/*     */     //   394: sipush #204
/*     */     //   397: ixor
/*     */     //   398: i2c
/*     */     //   399: castore
/*     */     //   400: sipush #15739
/*     */     //   403: iconst_0
/*     */     //   404: iconst_2
/*     */     //   405: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   408: invokevirtual getBytes : (Ljava/lang/String;)[B
/*     */     //   411: aload_0
/*     */     //   412: swap
/*     */     //   413: invokevirtual doFinal : ([B)[B
/*     */     //   416: astore #8
/*     */     //   418: aload #8
/*     */     //   420: invokestatic a : ([B)Ljava/lang/String;
/*     */     //   423: invokevirtual intern : ()Ljava/lang/String;
/*     */     //   426: swap
/*     */     //   427: tableswitch default -> 251, 0 -> 336
/*     */     //   444: bipush #16
/*     */     //   446: newarray byte
/*     */     //   448: dup
/*     */     //   449: iconst_0
/*     */     //   450: bipush #48
/*     */     //   452: bastore
/*     */     //   453: dup
/*     */     //   454: iconst_1
/*     */     //   455: bipush #49
/*     */     //   457: bastore
/*     */     //   458: dup
/*     */     //   459: iconst_2
/*     */     //   460: bipush #50
/*     */     //   462: bastore
/*     */     //   463: dup
/*     */     //   464: iconst_3
/*     */     //   465: bipush #51
/*     */     //   467: bastore
/*     */     //   468: dup
/*     */     //   469: iconst_4
/*     */     //   470: bipush #52
/*     */     //   472: bastore
/*     */     //   473: dup
/*     */     //   474: iconst_5
/*     */     //   475: bipush #53
/*     */     //   477: bastore
/*     */     //   478: dup
/*     */     //   479: bipush #6
/*     */     //   481: bipush #54
/*     */     //   483: bastore
/*     */     //   484: dup
/*     */     //   485: bipush #7
/*     */     //   487: bipush #55
/*     */     //   489: bastore
/*     */     //   490: dup
/*     */     //   491: bipush #8
/*     */     //   493: bipush #56
/*     */     //   495: bastore
/*     */     //   496: dup
/*     */     //   497: bipush #9
/*     */     //   499: bipush #57
/*     */     //   501: bastore
/*     */     //   502: dup
/*     */     //   503: bipush #10
/*     */     //   505: bipush #97
/*     */     //   507: bastore
/*     */     //   508: dup
/*     */     //   509: bipush #11
/*     */     //   511: bipush #98
/*     */     //   513: bastore
/*     */     //   514: dup
/*     */     //   515: bipush #12
/*     */     //   517: bipush #99
/*     */     //   519: bastore
/*     */     //   520: dup
/*     */     //   521: bipush #13
/*     */     //   523: bipush #100
/*     */     //   525: bastore
/*     */     //   526: dup
/*     */     //   527: bipush #14
/*     */     //   529: bipush #101
/*     */     //   531: bastore
/*     */     //   532: dup
/*     */     //   533: bipush #15
/*     */     //   535: bipush #102
/*     */     //   537: bastore
/*     */     //   538: putstatic me/konsolas/aac/fw.d : [B
/*     */     //   541: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #579	-> 444
/*     */   }
/*     */   
/*     */   public static void b(int paramInt) {
/*     */     e = paramInt;
/*     */   }
/*     */   
/*     */   public static int e() {
/*     */     return e;
/*     */   }
/*     */   
/*     */   public static int d() {
/*     */     int i = e();
/*     */     try {
/*     */       if (i == 0)
/*     */         return 5; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return 0;
/*     */   }
/*     */   
/*     */   private static Exception a(Exception paramException) {
/*     */     return paramException;
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
/*     */   private static String b(int paramInt, long paramLong) {
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6708;
/*     */     if (h[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])i.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           "냛ऌ볳櫵ʿ?♭曉㓌헐઩?鏞ꀠᐵᶗ里బ".toCharArray()[9] = (char)("냛ऌ볳櫵ʿ?♭曉㓌헐઩?鏞ꀠᐵᶗ里బ".toCharArray()[9] ^ 0x7D9B);
/*     */           arrayOfObject[0] = Cipher.getInstance(da$gx.U("냛ऌ볳櫵ʿ?♭曉㓌헐઩?鏞ꀠᐵᶗ里బ".toCharArray(), (short)4241, true, false));
/*     */           "?豴ﯽ礦".toCharArray()[1] = (char)("?豴ﯽ礦".toCharArray()[1] ^ 0x4723);
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("?豴ﯽ礦".toCharArray(), (short)21737, true, true));
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           i.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         "豝ދ欺制黝풋燐齴ᨎĜꋦ陛꟝㉵ꕛ曣㷊ெ".toCharArray()[6] = (char)("豝ދ欺制黝풋燐齴ᨎĜꋦ陛꟝㉵ꕛ曣㷊ெ".toCharArray()[6] ^ 0x3B5D);
/*     */         throw new RuntimeException(da$gx.U("豝ދ欺制黝풋燐齴ᨎĜꋦ陛꟝㉵ꕛ曣㷊ெ".toCharArray(), (short)13449, false, true), exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       "홝퇉濏榅십锕綐ા댱䤤".toCharArray()[6] = (char)("홝퇉濏榅십锕綐ા댱䤤".toCharArray()[6] ^ 0x6DC5);
/*     */       byte[] arrayOfByte2 = g[i].getBytes(da$gx.U("홝퇉濏榅십锕綐ા댱䤤".toCharArray(), (short)18212, false, false));
/*     */       h[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return h[i];
/*     */   }
/*     */   
/*     */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*     */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*     */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*     */     String str = b(i, l);
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
/*     */     //   66: ldc_w 'ꐉ颛씵ꀡక菬?ﭾૄ贲ո慛?康ⸯ韈홍㢃'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: bipush #11
/*     */     //   76: dup_x1
/*     */     //   77: caload
/*     */     //   78: sipush #12631
/*     */     //   81: ixor
/*     */     //   82: i2c
/*     */     //   83: castore
/*     */     //   84: sipush #7166
/*     */     //   87: iconst_1
/*     */     //   88: iconst_1
/*     */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w '튝讝Ѓ୸'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_0
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #17512
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #18597
/*     */     //   115: iconst_1
/*     */     //   116: iconst_3
/*     */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: aload_1
/*     */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   127: ldc_w '즨醶鋗捱'
/*     */     //   130: invokevirtual toCharArray : ()[C
/*     */     //   133: dup
/*     */     //   134: dup
/*     */     //   135: iconst_2
/*     */     //   136: dup_x1
/*     */     //   137: caload
/*     */     //   138: sipush #30389
/*     */     //   141: ixor
/*     */     //   142: i2c
/*     */     //   143: castore
/*     */     //   144: sipush #26911
/*     */     //   147: iconst_0
/*     */     //   148: iconst_2
/*     */     //   149: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fw.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */