/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.lang.invoke.CallSite;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.zip.CRC32;
/*    */ import java.util.zip.Inflater;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ public final class js
/*    */   implements hp {
/*    */   private static final byte m = 1;
/*    */   private static final byte g = 2;
/*    */   
/*    */   public li a() {
/* 24 */     return this.i.a();
/*    */   }
/*    */ 
/*    */   
/*    */   private static final byte a = 3;
/*    */   
/*    */   private static final byte k = 4;
/*    */   
/*    */   private static final byte d = 0;
/*    */   
/*    */   private static final byte f = 1;
/*    */   
/*    */   private static final byte c = 2;
/*    */   
/*    */   private static final byte h = 3;
/*    */   
/*    */   private int l;
/*    */   
/*    */   private final bX i;
/*    */   private final Inflater e;
/*    */   private final h7 j;
/*    */   private final CRC32 b;
/*    */   private static final long n = nc.a(4127037113372897858L, -8014212423957364584L, MethodHandles.lookup().lookupClass()).a(279556690328376L);
/*    */   private static final String[] o;
/*    */   private static final String[] p;
/*    */   private static final Map q = new HashMap<>(13);
/*    */   
/*    */   private void a(long paramLong1, fw paramfw, long paramLong2, long paramLong3) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/js.n : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w -805461287343240038
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: aload_3
/*    */     //   16: getfield b : Lme/konsolas/aac/eV;
/*    */     //   19: astore #9
/*    */     //   21: istore #8
/*    */     //   23: lload #4
/*    */     //   25: aload #9
/*    */     //   27: getfield c : I
/*    */     //   30: aload #9
/*    */     //   32: getfield d : I
/*    */     //   35: isub
/*    */     //   36: i2l
/*    */     //   37: lcmp
/*    */     //   38: iflt -> 100
/*    */     //   41: lload #4
/*    */     //   43: aload #9
/*    */     //   45: getfield c : I
/*    */     //   48: aload #9
/*    */     //   50: getfield d : I
/*    */     //   53: isub
/*    */     //   54: i2l
/*    */     //   55: lsub
/*    */     //   56: lstore #4
/*    */     //   58: aload #9
/*    */     //   60: getfield b : Lme/konsolas/aac/eV;
/*    */     //   63: astore #9
/*    */     //   65: iload #8
/*    */     //   67: lload_1
/*    */     //   68: lconst_0
/*    */     //   69: lcmp
/*    */     //   70: ifle -> 78
/*    */     //   73: ifeq -> 175
/*    */     //   76: iload #8
/*    */     //   78: ifne -> 23
/*    */     //   81: lload_1
/*    */     //   82: lconst_0
/*    */     //   83: lcmp
/*    */     //   84: ifle -> 65
/*    */     //   87: goto -> 100
/*    */     //   90: ldc2_w -814411319532685081
/*    */     //   93: lload_1
/*    */     //   94: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   99: athrow
/*    */     //   100: lload #6
/*    */     //   102: lconst_0
/*    */     //   103: lcmp
/*    */     //   104: ifle -> 175
/*    */     //   107: aload #9
/*    */     //   109: getfield d : I
/*    */     //   112: i2l
/*    */     //   113: lload #4
/*    */     //   115: ladd
/*    */     //   116: l2i
/*    */     //   117: istore #10
/*    */     //   119: aload #9
/*    */     //   121: getfield c : I
/*    */     //   124: iload #10
/*    */     //   126: isub
/*    */     //   127: i2l
/*    */     //   128: lload #6
/*    */     //   130: invokestatic min : (JJ)J
/*    */     //   133: l2i
/*    */     //   134: istore #11
/*    */     //   136: aload_0
/*    */     //   137: getfield b : Ljava/util/zip/CRC32;
/*    */     //   140: aload #9
/*    */     //   142: getfield h : [B
/*    */     //   145: iload #10
/*    */     //   147: iload #11
/*    */     //   149: invokevirtual update : ([BII)V
/*    */     //   152: lload #6
/*    */     //   154: iload #11
/*    */     //   156: i2l
/*    */     //   157: lsub
/*    */     //   158: lstore #6
/*    */     //   160: lconst_0
/*    */     //   161: lstore #4
/*    */     //   163: aload #9
/*    */     //   165: getfield b : Lme/konsolas/aac/eV;
/*    */     //   168: astore #9
/*    */     //   170: iload #8
/*    */     //   172: ifne -> 100
/*    */     //   175: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 15
/*    */     //   #66	-> 23
/*    */     //   #64	-> 41
/*    */     //   #31	-> 58
/*    */     //   #65	-> 100
/*    */     //   #7	-> 107
/*    */     //   #11	-> 119
/*    */     //   #34	-> 136
/*    */     //   #22	-> 152
/*    */     //   #74	-> 160
/*    */     //   #69	-> 163
/*    */     //   #44	-> 175
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   65	81	90	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private void a(short paramShort, char paramChar, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #32
/*    */     //   18: lshl
/*    */     //   19: bipush #32
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/js.n : J
/*    */     //   26: lxor
/*    */     //   27: lstore #4
/*    */     //   29: lload #4
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 62739103222117
/*    */     //   35: lxor
/*    */     //   36: lstore #6
/*    */     //   38: dup2
/*    */     //   39: ldc2_w 73542174029992
/*    */     //   42: lxor
/*    */     //   43: lstore #8
/*    */     //   45: pop2
/*    */     //   46: aload_0
/*    */     //   47: lload #8
/*    */     //   49: sipush #10307
/*    */     //   52: ldc2_w 6447452521240429664
/*    */     //   55: lload #4
/*    */     //   57: lxor
/*    */     //   58: <illegal opcode> e : (IJ)Ljava/lang/String;
/*    */     //   63: aload_0
/*    */     //   64: getfield i : Lme/konsolas/aac/bX;
/*    */     //   67: lload #6
/*    */     //   69: invokeinterface a : (J)I
/*    */     //   74: aload_0
/*    */     //   75: getfield b : Ljava/util/zip/CRC32;
/*    */     //   78: invokevirtual getValue : ()J
/*    */     //   81: l2i
/*    */     //   82: invokespecial a : (JLjava/lang/String;II)V
/*    */     //   85: aload_0
/*    */     //   86: lload #8
/*    */     //   88: sipush #5462
/*    */     //   91: ldc2_w 6117993848224004470
/*    */     //   94: lload #4
/*    */     //   96: lxor
/*    */     //   97: <illegal opcode> e : (IJ)Ljava/lang/String;
/*    */     //   102: aload_0
/*    */     //   103: getfield i : Lme/konsolas/aac/bX;
/*    */     //   106: lload #6
/*    */     //   108: invokeinterface a : (J)I
/*    */     //   113: aload_0
/*    */     //   114: getfield e : Ljava/util/zip/Inflater;
/*    */     //   117: invokevirtual getBytesWritten : ()J
/*    */     //   120: l2i
/*    */     //   121: invokespecial a : (JLjava/lang/String;II)V
/*    */     //   124: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 46
/*    */     //   #43	-> 85
/*    */     //   #41	-> 124
/*    */   }
/*    */   
/*    */   public long a(long paramLong1, fw paramfw, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 133643679924634
/*    */     //   5: lxor
/*    */     //   6: dup2
/*    */     //   7: bipush #32
/*    */     //   9: lushr
/*    */     //   10: l2i
/*    */     //   11: istore #6
/*    */     //   13: dup2
/*    */     //   14: bipush #32
/*    */     //   16: lshl
/*    */     //   17: bipush #48
/*    */     //   19: lushr
/*    */     //   20: l2i
/*    */     //   21: istore #7
/*    */     //   23: dup2
/*    */     //   24: bipush #48
/*    */     //   26: lshl
/*    */     //   27: bipush #48
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #8
/*    */     //   33: pop2
/*    */     //   34: dup2
/*    */     //   35: ldc2_w 90951769333698
/*    */     //   38: lxor
/*    */     //   39: dup2
/*    */     //   40: bipush #48
/*    */     //   42: lushr
/*    */     //   43: l2i
/*    */     //   44: istore #9
/*    */     //   46: dup2
/*    */     //   47: bipush #16
/*    */     //   49: lshl
/*    */     //   50: bipush #48
/*    */     //   52: lushr
/*    */     //   53: l2i
/*    */     //   54: istore #10
/*    */     //   56: dup2
/*    */     //   57: bipush #32
/*    */     //   59: lshl
/*    */     //   60: bipush #32
/*    */     //   62: lushr
/*    */     //   63: l2i
/*    */     //   64: istore #11
/*    */     //   66: pop2
/*    */     //   67: dup2
/*    */     //   68: ldc2_w 128639465324897
/*    */     //   71: lxor
/*    */     //   72: lstore #12
/*    */     //   74: dup2
/*    */     //   75: ldc2_w 0
/*    */     //   78: lxor
/*    */     //   79: lstore #14
/*    */     //   81: dup2
/*    */     //   82: ldc2_w 60871428565940
/*    */     //   85: lxor
/*    */     //   86: lstore #16
/*    */     //   88: pop2
/*    */     //   89: ldc2_w -8553557825786290317
/*    */     //   92: lload_1
/*    */     //   93: <illegal opcode> w : (JJ)I
/*    */     //   98: istore #18
/*    */     //   100: lload #4
/*    */     //   102: lconst_0
/*    */     //   103: lcmp
/*    */     //   104: iload #18
/*    */     //   106: ifne -> 178
/*    */     //   109: ifge -> 174
/*    */     //   112: goto -> 125
/*    */     //   115: ldc2_w -8526740709499468289
/*    */     //   118: lload_1
/*    */     //   119: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   124: athrow
/*    */     //   125: new java/lang/IllegalArgumentException
/*    */     //   128: dup
/*    */     //   129: new java/lang/StringBuilder
/*    */     //   132: dup
/*    */     //   133: invokespecial <init> : ()V
/*    */     //   136: sipush #1260
/*    */     //   139: ldc2_w 1874291471939160947
/*    */     //   142: lload_1
/*    */     //   143: lxor
/*    */     //   144: <illegal opcode> e : (IJ)Ljava/lang/String;
/*    */     //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   152: lload #4
/*    */     //   154: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   157: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   160: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   163: athrow
/*    */     //   164: ldc2_w -8526740709499468289
/*    */     //   167: lload_1
/*    */     //   168: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   173: athrow
/*    */     //   174: lload #4
/*    */     //   176: lconst_0
/*    */     //   177: lcmp
/*    */     //   178: iload #18
/*    */     //   180: lload_1
/*    */     //   181: lconst_0
/*    */     //   182: lcmp
/*    */     //   183: iflt -> 223
/*    */     //   186: ifne -> 221
/*    */     //   189: ifne -> 217
/*    */     //   192: goto -> 205
/*    */     //   195: ldc2_w -8526740709499468289
/*    */     //   198: lload_1
/*    */     //   199: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   204: athrow
/*    */     //   205: lconst_0
/*    */     //   206: lreturn
/*    */     //   207: ldc2_w -8526740709499468289
/*    */     //   210: lload_1
/*    */     //   211: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   216: athrow
/*    */     //   217: aload_0
/*    */     //   218: getfield l : I
/*    */     //   221: iload #18
/*    */     //   223: lload_1
/*    */     //   224: lconst_0
/*    */     //   225: lcmp
/*    */     //   226: iflt -> 277
/*    */     //   229: ifne -> 276
/*    */     //   232: ifne -> 272
/*    */     //   235: goto -> 248
/*    */     //   238: ldc2_w -8526740709499468289
/*    */     //   241: lload_1
/*    */     //   242: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   247: athrow
/*    */     //   248: aload_0
/*    */     //   249: lload #16
/*    */     //   251: invokespecial b : (J)V
/*    */     //   254: aload_0
/*    */     //   255: iconst_1
/*    */     //   256: putfield l : I
/*    */     //   259: goto -> 272
/*    */     //   262: ldc2_w -8526740709499468289
/*    */     //   265: lload_1
/*    */     //   266: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   271: athrow
/*    */     //   272: aload_0
/*    */     //   273: getfield l : I
/*    */     //   276: iconst_1
/*    */     //   277: lload_1
/*    */     //   278: lconst_0
/*    */     //   279: lcmp
/*    */     //   280: ifle -> 412
/*    */     //   283: iload #18
/*    */     //   285: ifne -> 412
/*    */     //   288: if_icmpne -> 383
/*    */     //   291: goto -> 304
/*    */     //   294: ldc2_w -8526740709499468289
/*    */     //   297: lload_1
/*    */     //   298: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   303: athrow
/*    */     //   304: aload_3
/*    */     //   305: getfield a : J
/*    */     //   308: lstore #19
/*    */     //   310: aload_0
/*    */     //   311: getfield j : Lme/konsolas/aac/h7;
/*    */     //   314: lload #14
/*    */     //   316: aload_3
/*    */     //   317: lload #4
/*    */     //   319: invokevirtual a : (JLme/konsolas/aac/fw;J)J
/*    */     //   322: lstore #21
/*    */     //   324: lload #21
/*    */     //   326: iload #18
/*    */     //   328: ifne -> 377
/*    */     //   331: ldc2_w -1
/*    */     //   334: lcmp
/*    */     //   335: ifeq -> 378
/*    */     //   338: goto -> 351
/*    */     //   341: ldc2_w -8526740709499468289
/*    */     //   344: lload_1
/*    */     //   345: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   350: athrow
/*    */     //   351: aload_0
/*    */     //   352: lload #12
/*    */     //   354: aload_3
/*    */     //   355: lload #19
/*    */     //   357: lload #21
/*    */     //   359: invokespecial a : (JLme/konsolas/aac/fw;JJ)V
/*    */     //   362: lload #21
/*    */     //   364: goto -> 377
/*    */     //   367: ldc2_w -8526740709499468289
/*    */     //   370: lload_1
/*    */     //   371: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   376: athrow
/*    */     //   377: lreturn
/*    */     //   378: aload_0
/*    */     //   379: iconst_2
/*    */     //   380: putfield l : I
/*    */     //   383: aload_0
/*    */     //   384: getfield l : I
/*    */     //   387: lload_1
/*    */     //   388: lconst_0
/*    */     //   389: lcmp
/*    */     //   390: iflt -> 461
/*    */     //   393: iload #18
/*    */     //   395: ifne -> 461
/*    */     //   398: iconst_2
/*    */     //   399: goto -> 412
/*    */     //   402: ldc2_w -8526740709499468289
/*    */     //   405: lload_1
/*    */     //   406: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   411: athrow
/*    */     //   412: if_icmpne -> 495
/*    */     //   415: aload_0
/*    */     //   416: iload #9
/*    */     //   418: i2s
/*    */     //   419: iload #10
/*    */     //   421: i2c
/*    */     //   422: iload #11
/*    */     //   424: invokespecial a : (SCI)V
/*    */     //   427: aload_0
/*    */     //   428: iconst_3
/*    */     //   429: putfield l : I
/*    */     //   432: aload_0
/*    */     //   433: getfield i : Lme/konsolas/aac/bX;
/*    */     //   436: iload #6
/*    */     //   438: iload #7
/*    */     //   440: i2c
/*    */     //   441: iload #8
/*    */     //   443: invokeinterface a : (ICI)Z
/*    */     //   448: goto -> 461
/*    */     //   451: ldc2_w -8526740709499468289
/*    */     //   454: lload_1
/*    */     //   455: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   460: athrow
/*    */     //   461: ifne -> 495
/*    */     //   464: new java/io/IOException
/*    */     //   467: dup
/*    */     //   468: sipush #1144
/*    */     //   471: ldc2_w 6328193457585441766
/*    */     //   474: lload_1
/*    */     //   475: lxor
/*    */     //   476: <illegal opcode> e : (IJ)Ljava/lang/String;
/*    */     //   481: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   484: athrow
/*    */     //   485: ldc2_w -8526740709499468289
/*    */     //   488: lload_1
/*    */     //   489: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   494: athrow
/*    */     //   495: ldc2_w -1
/*    */     //   498: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 100
/*    */     //   #58	-> 174
/*    */     //   #9	-> 217
/*    */     //   #16	-> 248
/*    */     //   #10	-> 254
/*    */     //   #60	-> 272
/*    */     //   #77	-> 304
/*    */     //   #4	-> 310
/*    */     //   #36	-> 324
/*    */     //   #27	-> 351
/*    */     //   #40	-> 362
/*    */     //   #42	-> 378
/*    */     //   #45	-> 383
/*    */     //   #30	-> 415
/*    */     //   #15	-> 427
/*    */     //   #73	-> 432
/*    */     //   #37	-> 464
/*    */     //   #14	-> 495
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   100	112	115	java/io/IOException
/*    */     //   109	164	164	java/io/IOException
/*    */     //   178	192	195	java/io/IOException
/*    */     //   189	207	207	java/io/IOException
/*    */     //   221	235	238	java/io/IOException
/*    */     //   232	259	262	java/io/IOException
/*    */     //   276	291	294	java/io/IOException
/*    */     //   324	338	341	java/io/IOException
/*    */     //   331	364	367	java/io/IOException
/*    */     //   383	399	402	java/io/IOException
/*    */     //   412	448	451	java/io/IOException
/*    */     //   461	485	485	java/io/IOException
/*    */   }
/*    */   
/*    */   private void b(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/js.n : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 112442386422267
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 80366664843799
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: dup2
/*    */     //   21: ldc2_w 127762019300216
/*    */     //   24: lxor
/*    */     //   25: lstore #7
/*    */     //   27: dup2
/*    */     //   28: ldc2_w 15285698713521
/*    */     //   31: lxor
/*    */     //   32: lstore #9
/*    */     //   34: dup2
/*    */     //   35: ldc2_w 132923529238188
/*    */     //   38: lxor
/*    */     //   39: lstore #11
/*    */     //   41: dup2
/*    */     //   42: ldc2_w 58555239721098
/*    */     //   45: lxor
/*    */     //   46: lstore #13
/*    */     //   48: dup2
/*    */     //   49: ldc2_w 50819696681268
/*    */     //   52: lxor
/*    */     //   53: lstore #15
/*    */     //   55: dup2
/*    */     //   56: ldc2_w 42907783384286
/*    */     //   59: lxor
/*    */     //   60: lstore #17
/*    */     //   62: dup2
/*    */     //   63: ldc2_w 112442386422267
/*    */     //   66: lxor
/*    */     //   67: lstore #19
/*    */     //   69: pop2
/*    */     //   70: ldc2_w 2199626210879883454
/*    */     //   73: lload_1
/*    */     //   74: <illegal opcode> w : (JJ)I
/*    */     //   79: aload_0
/*    */     //   80: getfield i : Lme/konsolas/aac/bX;
/*    */     //   83: ldc2_w 10
/*    */     //   86: lload #9
/*    */     //   88: invokeinterface b : (JJ)V
/*    */     //   93: aload_0
/*    */     //   94: getfield i : Lme/konsolas/aac/bX;
/*    */     //   97: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   102: ldc2_w 3
/*    */     //   105: lload #15
/*    */     //   107: invokevirtual a : (JJ)B
/*    */     //   110: istore #22
/*    */     //   112: istore #21
/*    */     //   114: iload #22
/*    */     //   116: iconst_1
/*    */     //   117: ishr
/*    */     //   118: iconst_1
/*    */     //   119: iand
/*    */     //   120: iload #21
/*    */     //   122: ifne -> 156
/*    */     //   125: iconst_1
/*    */     //   126: if_icmpne -> 159
/*    */     //   129: goto -> 142
/*    */     //   132: ldc2_w 2190968902449664562
/*    */     //   135: lload_1
/*    */     //   136: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   141: athrow
/*    */     //   142: iconst_1
/*    */     //   143: goto -> 156
/*    */     //   146: ldc2_w 2190968902449664562
/*    */     //   149: lload_1
/*    */     //   150: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   155: athrow
/*    */     //   156: goto -> 160
/*    */     //   159: iconst_0
/*    */     //   160: istore #23
/*    */     //   162: iload #23
/*    */     //   164: iload #21
/*    */     //   166: ifne -> 230
/*    */     //   169: ifeq -> 219
/*    */     //   172: goto -> 185
/*    */     //   175: ldc2_w 2190968902449664562
/*    */     //   178: lload_1
/*    */     //   179: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   184: athrow
/*    */     //   185: aload_0
/*    */     //   186: aload_0
/*    */     //   187: getfield i : Lme/konsolas/aac/bX;
/*    */     //   190: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   195: lload #11
/*    */     //   197: dup2_x1
/*    */     //   198: pop2
/*    */     //   199: lconst_0
/*    */     //   200: ldc2_w 10
/*    */     //   203: invokespecial a : (JLme/konsolas/aac/fw;JJ)V
/*    */     //   206: goto -> 219
/*    */     //   209: ldc2_w 2190968902449664562
/*    */     //   212: lload_1
/*    */     //   213: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   218: athrow
/*    */     //   219: aload_0
/*    */     //   220: getfield i : Lme/konsolas/aac/bX;
/*    */     //   223: lload #5
/*    */     //   225: invokeinterface b : (J)S
/*    */     //   230: istore #24
/*    */     //   232: aload_0
/*    */     //   233: lload #17
/*    */     //   235: sipush #23134
/*    */     //   238: ldc2_w 2121330005684322830
/*    */     //   241: lload_1
/*    */     //   242: lxor
/*    */     //   243: <illegal opcode> e : (IJ)Ljava/lang/String;
/*    */     //   248: sipush #8075
/*    */     //   251: iload #24
/*    */     //   253: invokespecial a : (JLjava/lang/String;II)V
/*    */     //   256: aload_0
/*    */     //   257: getfield i : Lme/konsolas/aac/bX;
/*    */     //   260: ldc2_w 8
/*    */     //   263: lload #13
/*    */     //   265: invokeinterface a : (JJ)V
/*    */     //   270: iload #22
/*    */     //   272: iconst_2
/*    */     //   273: ishr
/*    */     //   274: iconst_1
/*    */     //   275: iand
/*    */     //   276: iconst_1
/*    */     //   277: iload #21
/*    */     //   279: lload_1
/*    */     //   280: lconst_0
/*    */     //   281: lcmp
/*    */     //   282: ifle -> 504
/*    */     //   285: ifne -> 502
/*    */     //   288: if_icmpne -> 495
/*    */     //   291: goto -> 304
/*    */     //   294: ldc2_w 2190968902449664562
/*    */     //   297: lload_1
/*    */     //   298: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   303: athrow
/*    */     //   304: aload_0
/*    */     //   305: getfield i : Lme/konsolas/aac/bX;
/*    */     //   308: ldc2_w 2
/*    */     //   311: lload #9
/*    */     //   313: invokeinterface b : (JJ)V
/*    */     //   318: iload #23
/*    */     //   320: iload #21
/*    */     //   322: ifne -> 402
/*    */     //   325: goto -> 338
/*    */     //   328: ldc2_w 2190968902449664562
/*    */     //   331: lload_1
/*    */     //   332: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   337: athrow
/*    */     //   338: ifeq -> 388
/*    */     //   341: goto -> 354
/*    */     //   344: ldc2_w 2190968902449664562
/*    */     //   347: lload_1
/*    */     //   348: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   353: athrow
/*    */     //   354: aload_0
/*    */     //   355: aload_0
/*    */     //   356: getfield i : Lme/konsolas/aac/bX;
/*    */     //   359: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   364: lload #11
/*    */     //   366: dup2_x1
/*    */     //   367: pop2
/*    */     //   368: lconst_0
/*    */     //   369: ldc2_w 2
/*    */     //   372: invokespecial a : (JLme/konsolas/aac/fw;JJ)V
/*    */     //   375: goto -> 388
/*    */     //   378: ldc2_w 2190968902449664562
/*    */     //   381: lload_1
/*    */     //   382: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   387: athrow
/*    */     //   388: aload_0
/*    */     //   389: getfield i : Lme/konsolas/aac/bX;
/*    */     //   392: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   397: lload #19
/*    */     //   399: invokevirtual a : (J)S
/*    */     //   402: istore #25
/*    */     //   404: lload_1
/*    */     //   405: lconst_0
/*    */     //   406: lcmp
/*    */     //   407: iflt -> 429
/*    */     //   410: aload_0
/*    */     //   411: getfield i : Lme/konsolas/aac/bX;
/*    */     //   414: iload #25
/*    */     //   416: i2l
/*    */     //   417: iload #21
/*    */     //   419: ifne -> 488
/*    */     //   422: lload #9
/*    */     //   424: invokeinterface b : (JJ)V
/*    */     //   429: iload #23
/*    */     //   431: ifeq -> 481
/*    */     //   434: goto -> 447
/*    */     //   437: ldc2_w 2190968902449664562
/*    */     //   440: lload_1
/*    */     //   441: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   446: athrow
/*    */     //   447: aload_0
/*    */     //   448: aload_0
/*    */     //   449: getfield i : Lme/konsolas/aac/bX;
/*    */     //   452: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   457: lload #11
/*    */     //   459: dup2_x1
/*    */     //   460: pop2
/*    */     //   461: lconst_0
/*    */     //   462: iload #25
/*    */     //   464: i2l
/*    */     //   465: invokespecial a : (JLme/konsolas/aac/fw;JJ)V
/*    */     //   468: goto -> 481
/*    */     //   471: ldc2_w 2190968902449664562
/*    */     //   474: lload_1
/*    */     //   475: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   480: athrow
/*    */     //   481: aload_0
/*    */     //   482: getfield i : Lme/konsolas/aac/bX;
/*    */     //   485: iload #25
/*    */     //   487: i2l
/*    */     //   488: lload #13
/*    */     //   490: invokeinterface a : (JJ)V
/*    */     //   495: iload #22
/*    */     //   497: iconst_3
/*    */     //   498: ishr
/*    */     //   499: iconst_1
/*    */     //   500: iand
/*    */     //   501: iconst_1
/*    */     //   502: iload #21
/*    */     //   504: ifne -> 674
/*    */     //   507: if_icmpne -> 643
/*    */     //   510: goto -> 523
/*    */     //   513: ldc2_w 2190968902449664562
/*    */     //   516: lload_1
/*    */     //   517: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   522: athrow
/*    */     //   523: aload_0
/*    */     //   524: getfield i : Lme/konsolas/aac/bX;
/*    */     //   527: lload #7
/*    */     //   529: iconst_0
/*    */     //   530: invokeinterface a : (JB)J
/*    */     //   535: lstore #25
/*    */     //   537: lload #25
/*    */     //   539: ldc2_w -1
/*    */     //   542: lcmp
/*    */     //   543: lload_1
/*    */     //   544: lconst_0
/*    */     //   545: lcmp
/*    */     //   546: ifle -> 590
/*    */     //   549: iload #21
/*    */     //   551: ifne -> 590
/*    */     //   554: ifne -> 588
/*    */     //   557: goto -> 570
/*    */     //   560: ldc2_w 2190968902449664562
/*    */     //   563: lload_1
/*    */     //   564: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   569: athrow
/*    */     //   570: new java/io/EOFException
/*    */     //   573: dup
/*    */     //   574: invokespecial <init> : ()V
/*    */     //   577: athrow
/*    */     //   578: ldc2_w 2190968902449664562
/*    */     //   581: lload_1
/*    */     //   582: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   587: athrow
/*    */     //   588: iload #23
/*    */     //   590: ifeq -> 628
/*    */     //   593: aload_0
/*    */     //   594: aload_0
/*    */     //   595: getfield i : Lme/konsolas/aac/bX;
/*    */     //   598: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   603: lload #11
/*    */     //   605: dup2_x1
/*    */     //   606: pop2
/*    */     //   607: lconst_0
/*    */     //   608: lload #25
/*    */     //   610: lconst_1
/*    */     //   611: ladd
/*    */     //   612: invokespecial a : (JLme/konsolas/aac/fw;JJ)V
/*    */     //   615: goto -> 628
/*    */     //   618: ldc2_w 2190968902449664562
/*    */     //   621: lload_1
/*    */     //   622: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   627: athrow
/*    */     //   628: aload_0
/*    */     //   629: getfield i : Lme/konsolas/aac/bX;
/*    */     //   632: lload #25
/*    */     //   634: lconst_1
/*    */     //   635: ladd
/*    */     //   636: lload #13
/*    */     //   638: invokeinterface a : (JJ)V
/*    */     //   643: iload #22
/*    */     //   645: iconst_4
/*    */     //   646: ishr
/*    */     //   647: iconst_1
/*    */     //   648: iand
/*    */     //   649: lload_1
/*    */     //   650: lconst_0
/*    */     //   651: lcmp
/*    */     //   652: ifle -> 799
/*    */     //   655: iload #21
/*    */     //   657: ifne -> 799
/*    */     //   660: iconst_1
/*    */     //   661: goto -> 674
/*    */     //   664: ldc2_w 2190968902449664562
/*    */     //   667: lload_1
/*    */     //   668: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   673: athrow
/*    */     //   674: if_icmpne -> 797
/*    */     //   677: aload_0
/*    */     //   678: getfield i : Lme/konsolas/aac/bX;
/*    */     //   681: lload #7
/*    */     //   683: iconst_0
/*    */     //   684: invokeinterface a : (JB)J
/*    */     //   689: lstore #25
/*    */     //   691: lload #25
/*    */     //   693: ldc2_w -1
/*    */     //   696: lcmp
/*    */     //   697: lload_1
/*    */     //   698: lconst_0
/*    */     //   699: lcmp
/*    */     //   700: ifle -> 744
/*    */     //   703: iload #21
/*    */     //   705: ifne -> 744
/*    */     //   708: ifne -> 742
/*    */     //   711: goto -> 724
/*    */     //   714: ldc2_w 2190968902449664562
/*    */     //   717: lload_1
/*    */     //   718: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   723: athrow
/*    */     //   724: new java/io/EOFException
/*    */     //   727: dup
/*    */     //   728: invokespecial <init> : ()V
/*    */     //   731: athrow
/*    */     //   732: ldc2_w 2190968902449664562
/*    */     //   735: lload_1
/*    */     //   736: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   741: athrow
/*    */     //   742: iload #23
/*    */     //   744: ifeq -> 782
/*    */     //   747: aload_0
/*    */     //   748: aload_0
/*    */     //   749: getfield i : Lme/konsolas/aac/bX;
/*    */     //   752: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   757: lload #11
/*    */     //   759: dup2_x1
/*    */     //   760: pop2
/*    */     //   761: lconst_0
/*    */     //   762: lload #25
/*    */     //   764: lconst_1
/*    */     //   765: ladd
/*    */     //   766: invokespecial a : (JLme/konsolas/aac/fw;JJ)V
/*    */     //   769: goto -> 782
/*    */     //   772: ldc2_w 2190968902449664562
/*    */     //   775: lload_1
/*    */     //   776: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   781: athrow
/*    */     //   782: aload_0
/*    */     //   783: getfield i : Lme/konsolas/aac/bX;
/*    */     //   786: lload #25
/*    */     //   788: lconst_1
/*    */     //   789: ladd
/*    */     //   790: lload #13
/*    */     //   792: invokeinterface a : (JJ)V
/*    */     //   797: iload #23
/*    */     //   799: ifeq -> 860
/*    */     //   802: aload_0
/*    */     //   803: lload #17
/*    */     //   805: sipush #1284
/*    */     //   808: ldc2_w 5267543590262234451
/*    */     //   811: lload_1
/*    */     //   812: lxor
/*    */     //   813: <illegal opcode> e : (IJ)Ljava/lang/String;
/*    */     //   818: aload_0
/*    */     //   819: getfield i : Lme/konsolas/aac/bX;
/*    */     //   822: lload_3
/*    */     //   823: invokeinterface a : (J)S
/*    */     //   828: aload_0
/*    */     //   829: getfield b : Ljava/util/zip/CRC32;
/*    */     //   832: invokevirtual getValue : ()J
/*    */     //   835: l2i
/*    */     //   836: i2s
/*    */     //   837: invokespecial a : (JLjava/lang/String;II)V
/*    */     //   840: aload_0
/*    */     //   841: getfield b : Ljava/util/zip/CRC32;
/*    */     //   844: invokevirtual reset : ()V
/*    */     //   847: goto -> 860
/*    */     //   850: ldc2_w 2190968902449664562
/*    */     //   853: lload_1
/*    */     //   854: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   859: athrow
/*    */     //   860: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #54	-> 79
/*    */     //   #21	-> 93
/*    */     //   #13	-> 114
/*    */     //   #61	-> 162
/*    */     //   #63	-> 219
/*    */     //   #20	-> 232
/*    */     //   #2	-> 256
/*    */     //   #6	-> 270
/*    */     //   #3	-> 304
/*    */     //   #39	-> 318
/*    */     //   #1	-> 388
/*    */     //   #35	-> 404
/*    */     //   #12	-> 429
/*    */     //   #53	-> 481
/*    */     //   #5	-> 495
/*    */     //   #67	-> 523
/*    */     //   #8	-> 537
/*    */     //   #70	-> 588
/*    */     //   #62	-> 628
/*    */     //   #52	-> 643
/*    */     //   #46	-> 677
/*    */     //   #33	-> 691
/*    */     //   #23	-> 742
/*    */     //   #38	-> 782
/*    */     //   #68	-> 797
/*    */     //   #29	-> 802
/*    */     //   #28	-> 840
/*    */     //   #55	-> 860
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   114	129	132	java/io/IOException
/*    */     //   125	143	146	java/io/IOException
/*    */     //   162	172	175	java/io/IOException
/*    */     //   169	206	209	java/io/IOException
/*    */     //   232	291	294	java/io/IOException
/*    */     //   288	325	328	java/io/IOException
/*    */     //   304	341	344	java/io/IOException
/*    */     //   338	375	378	java/io/IOException
/*    */     //   404	434	437	java/io/IOException
/*    */     //   422	468	471	java/io/IOException
/*    */     //   502	510	513	java/io/IOException
/*    */     //   537	557	560	java/io/IOException
/*    */     //   554	578	578	java/io/IOException
/*    */     //   590	615	618	java/io/IOException
/*    */     //   643	661	664	java/io/IOException
/*    */     //   691	711	714	java/io/IOException
/*    */     //   708	732	732	java/io/IOException
/*    */     //   744	769	772	java/io/IOException
/*    */     //   799	847	850	java/io/IOException
/*    */   }
/*    */   
/*    */   private void a(long paramLong, String paramString, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/js.n : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: iload #5
/*    */     //   8: iload #4
/*    */     //   10: if_icmpeq -> 71
/*    */     //   13: new java/io/IOException
/*    */     //   16: dup
/*    */     //   17: sipush #4332
/*    */     //   20: ldc2_w 155004190402803743
/*    */     //   23: lload_1
/*    */     //   24: lxor
/*    */     //   25: <illegal opcode> e : (IJ)Ljava/lang/String;
/*    */     //   30: iconst_3
/*    */     //   31: anewarray java/lang/Object
/*    */     //   34: dup
/*    */     //   35: iconst_0
/*    */     //   36: aload_3
/*    */     //   37: aastore
/*    */     //   38: dup
/*    */     //   39: iconst_1
/*    */     //   40: iload #5
/*    */     //   42: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   45: aastore
/*    */     //   46: dup
/*    */     //   47: iconst_2
/*    */     //   48: iload #4
/*    */     //   50: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   53: aastore
/*    */     //   54: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   57: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   60: athrow
/*    */     //   61: ldc2_w 3368972737063395989
/*    */     //   64: lload_1
/*    */     //   65: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   70: athrow
/*    */     //   71: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 6
/*    */     //   #25	-> 13
/*    */     //   #59	-> 42
/*    */     //   #57	-> 54
/*    */     //   #71	-> 71
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   6	61	61	java/io/IOException
/*    */   }
/*    */   
/*    */   public void close() {
/* 72 */     this.j.close();
/*    */   }
/*    */   
/*    */   public js(hp paramhp, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/js.n : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 77992422770155
/*    */     //   11: lxor
/*    */     //   12: dup2
/*    */     //   13: bipush #48
/*    */     //   15: lushr
/*    */     //   16: l2i
/*    */     //   17: istore #4
/*    */     //   19: dup2
/*    */     //   20: bipush #16
/*    */     //   22: lshl
/*    */     //   23: bipush #48
/*    */     //   25: lushr
/*    */     //   26: l2i
/*    */     //   27: istore #5
/*    */     //   29: dup2
/*    */     //   30: bipush #32
/*    */     //   32: lshl
/*    */     //   33: bipush #32
/*    */     //   35: lushr
/*    */     //   36: l2i
/*    */     //   37: istore #6
/*    */     //   39: pop2
/*    */     //   40: dup2
/*    */     //   41: ldc2_w 14666967309320
/*    */     //   44: lxor
/*    */     //   45: dup2
/*    */     //   46: bipush #32
/*    */     //   48: lushr
/*    */     //   49: l2i
/*    */     //   50: istore #7
/*    */     //   52: dup2
/*    */     //   53: bipush #32
/*    */     //   55: lshl
/*    */     //   56: bipush #48
/*    */     //   58: lushr
/*    */     //   59: l2i
/*    */     //   60: istore #8
/*    */     //   62: dup2
/*    */     //   63: bipush #48
/*    */     //   65: lshl
/*    */     //   66: bipush #48
/*    */     //   68: lushr
/*    */     //   69: l2i
/*    */     //   70: istore #9
/*    */     //   72: pop2
/*    */     //   73: pop2
/*    */     //   74: aload_0
/*    */     //   75: invokespecial <init> : ()V
/*    */     //   78: ldc2_w -8624092321484787687
/*    */     //   81: lload_2
/*    */     //   82: <illegal opcode> w : (JJ)I
/*    */     //   87: aload_0
/*    */     //   88: iconst_0
/*    */     //   89: putfield l : I
/*    */     //   92: aload_0
/*    */     //   93: new java/util/zip/CRC32
/*    */     //   96: dup
/*    */     //   97: invokespecial <init> : ()V
/*    */     //   100: putfield b : Ljava/util/zip/CRC32;
/*    */     //   103: istore #10
/*    */     //   105: iload #10
/*    */     //   107: ifeq -> 215
/*    */     //   110: aload_1
/*    */     //   111: ifnonnull -> 158
/*    */     //   114: goto -> 127
/*    */     //   117: ldc2_w -8632875212878642076
/*    */     //   120: lload_2
/*    */     //   121: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   126: athrow
/*    */     //   127: new java/lang/IllegalArgumentException
/*    */     //   130: dup
/*    */     //   131: sipush #26187
/*    */     //   134: ldc2_w 8081349248062695500
/*    */     //   137: lload_2
/*    */     //   138: lxor
/*    */     //   139: <illegal opcode> e : (IJ)Ljava/lang/String;
/*    */     //   144: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   147: athrow
/*    */     //   148: ldc2_w -8632875212878642076
/*    */     //   151: lload_2
/*    */     //   152: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   157: athrow
/*    */     //   158: aload_0
/*    */     //   159: new java/util/zip/Inflater
/*    */     //   162: dup
/*    */     //   163: iconst_1
/*    */     //   164: invokespecial <init> : (Z)V
/*    */     //   167: putfield e : Ljava/util/zip/Inflater;
/*    */     //   170: aload_0
/*    */     //   171: iload #4
/*    */     //   173: i2s
/*    */     //   174: aload_1
/*    */     //   175: iload #5
/*    */     //   177: i2c
/*    */     //   178: iload #6
/*    */     //   180: invokestatic a : (SLme/konsolas/aac/hp;CI)Lme/konsolas/aac/bX;
/*    */     //   183: putfield i : Lme/konsolas/aac/bX;
/*    */     //   186: aload_0
/*    */     //   187: new me/konsolas/aac/h7
/*    */     //   190: dup
/*    */     //   191: aload_0
/*    */     //   192: getfield i : Lme/konsolas/aac/bX;
/*    */     //   195: iload #7
/*    */     //   197: swap
/*    */     //   198: iload #8
/*    */     //   200: swap
/*    */     //   201: iload #9
/*    */     //   203: i2c
/*    */     //   204: swap
/*    */     //   205: aload_0
/*    */     //   206: getfield e : Ljava/util/zip/Inflater;
/*    */     //   209: invokespecial <init> : (IICLme/konsolas/aac/bX;Ljava/util/zip/Inflater;)V
/*    */     //   212: putfield j : Lme/konsolas/aac/h7;
/*    */     //   215: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #76	-> 74
/*    */     //   #75	-> 87
/*    */     //   #49	-> 92
/*    */     //   #17	-> 105
/*    */     //   #19	-> 158
/*    */     //   #47	-> 170
/*    */     //   #51	-> 186
/*    */     //   #32	-> 215
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   105	114	117	java/lang/IllegalArgumentException
/*    */     //   110	148	148	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = n ^ 0x7AD09EA2A021L;
/*    */     "玲⫉ᚠ慂㚞淉๿诌鳈뱄졑踣婢蚏킃缽歝惿䓴".toCharArray()[7] = (char)("玲⫉ᚠ慂㚞淉๿诌鳈뱄졑踣婢蚏킃缽歝惿䓴".toCharArray()[7] ^ 0x177C);
/*    */     "瀴䮌藳斝".toCharArray()[0] = (char)("瀴䮌藳斝".toCharArray()[0] ^ 0x6AAD);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(da$gx.U("玲⫉ᚠ慂㚞淉๿诌鳈뱄졑踣婢蚏킃缽歝惿䓴".toCharArray(), (short)15717, false, false))).init(2, SecretKeyFactory.getInstance(da$gx.U("瀴䮌藳斝".toCharArray(), (short)20126, true, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[8];
/*    */     boolean bool = false;
/*    */     "᧤旡瓋了꤃Ꭶ켁??蔺죍柠栚ඊ楱愍ӥ藙嚛봠嶹㠟킢⸪ᓤ억穪ზ๠嵲㕙밎㱴?邃㕎﯃?뷶뽆≀쵄犜笅붂⩂㗍⊧夕蝶幷二떚όᯰ䥿貏פּ?疚嶛詍̂ే쿁ﰿᆓ᱔蔎鼻ᖝꮧ?ꠝ蛭?ꈄ㻘낔仔⽫끸튋䯎뱧뎭즩隣䀆ﻊ㌇ꊳ?评ꃂ崢퉎目ﺌ씩鎋Ȍ눬뭃䧮댇歷롋툲ف㢴ႜ䶸汤巔猒諛⅖涖㱆?莽腪炆찐䘊钭˲ㇳ惠ྖ謍漬욫?罓ᆾ㠗ﳼ붦獈궤笇ꬆ퍊ಬ킔똟ﯯ羭䮈靫娇⤗訸䤦㫂レ".toCharArray()[104] = (char)("᧤旡瓋了꤃Ꭶ켁??蔺죍柠栚ඊ楱愍ӥ藙嚛봠嶹㠟킢⸪ᓤ억穪ზ๠嵲㕙밎㱴?邃㕎﯃?뷶뽆≀쵄犜笅붂⩂㗍⊧夕蝶幷二떚όᯰ䥿貏פּ?疚嶛詍̂ే쿁ﰿᆓ᱔蔎鼻ᖝꮧ?ꠝ蛭?ꈄ㻘낔仔⽫끸튋䯎뱧뎭즩隣䀆ﻊ㌇ꊳ?评ꃂ崢퉎目ﺌ씩鎋Ȍ눬뭃䧮댇歷롋툲ف㢴ႜ䶸汤巔猒諛⅖涖㱆?莽腪炆찐䘊钭˲ㇳ惠ྖ謍漬욫?罓ᆾ㠗ﳼ붦獈궤笇ꬆ퍊ಬ킔똟ﯯ羭䮈靫娇⤗訸䤦㫂レ".toCharArray()[104] ^ 0x1893);
/*    */     String str;
/*    */     int i = (str = da$gx.U("᧤旡瓋了꤃Ꭶ켁??蔺죍柠栚ඊ楱愍ӥ藙嚛봠嶹㠟킢⸪ᓤ억穪ზ๠嵲㕙밎㱴?邃㕎﯃?뷶뽆≀쵄犜笅붂⩂㗍⊧夕蝶幷二떚όᯰ䥿貏פּ?疚嶛詍̂ే쿁ﰿᆓ᱔蔎鼻ᖝꮧ?ꠝ蛭?ꈄ㻘낔仔⽫끸튋䯎뱧뎭즩隣䀆ﻊ㌇ꊳ?评ꃂ崢퉎目ﺌ씩鎋Ȍ눬뭃䧮댇歷롋툲ف㢴ႜ䶸汤巔猒諛⅖涖㱆?莽腪炆찐䘊钭˲ㇳ惠ྖ謍漬욫?罓ᆾ㠗ﳼ붦獈궤笇ꬆ퍊ಬ킔똟ﯯ羭䮈靫娇⤗訸䤦㫂レ".toCharArray(), (short)21813, true, false)).length();
/*    */     byte b2 = 32;
/*    */     byte b = -1;
/*    */     while (true);
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4757;
/*    */     if (p[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])q.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "焎븒묑시䈳ꡭ尷ߥ릎䪋埧ᣎ磴胸⧺ŗ燸鄼씥ᆕ".toCharArray()[19] = (char)("焎븒묑시䈳ꡭ尷ߥ릎䪋埧ᣎ磴胸⧺ŗ燸鄼씥ᆕ".toCharArray()[19] ^ 0x1BE3);
/*    */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("焎븒묑시䈳ꡭ尷ߥ릎䪋埧ᣎ磴胸⧺ŗ燸鄼씥ᆕ".toCharArray(), (short)24403, false, false));
/*    */           "ڼ瀩榆䯏".toCharArray()[1] = (char)("ڼ瀩榆䯏".toCharArray()[1] ^ 0x109B);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("ڼ瀩榆䯏".toCharArray(), (short)4362, false, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           q.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "Ď?跢↦ᐦ?쬣끈弍쒝䛐閥㐅햏㇜⠨ৠ".toCharArray()[0] = (char)("Ď?跢↦ᐦ?쬣끈弍쒝䛐閥㐅햏㇜⠨ৠ".toCharArray()[0] ^ 0x7BF4);
/*    */         throw new RuntimeException(dP$dt.X("Ď?跢↦ᐦ?쬣끈弍쒝䛐閥㐅햏㇜⠨ৠ".toCharArray(), (short)13284, true, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "❢䃋룫밉⨽槛앦滨쓫Բ".toCharArray()[0] = (char)("❢䃋룫밉⨽槛앦滨쓫Բ".toCharArray()[0] ^ 0x2FC);
/*    */       byte[] arrayOfByte2 = o[i].getBytes(dP$dt.X("❢䃋룫밉⨽槛앦滨쓫Բ".toCharArray(), (short)18176, true, false));
/*    */       p[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return p[i];
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
/*    */     //   66: ldc_w '텱騦쀬ᇎ曠ꞎ?㝌︋䴿荬ꛒ奴⹶啷鰒릷旇'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #13
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #17801
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #23736
/*    */     //   87: iconst_1
/*    */     //   88: iconst_4
/*    */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '쁅綞'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_1
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #24820
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #6458
/*    */     //   115: iconst_1
/*    */     //   116: iconst_4
/*    */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '빣ꓨ⭶缼'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_2
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #29397
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #821
/*    */     //   147: iconst_0
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\js.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */