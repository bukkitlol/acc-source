/*    */ package me.konsolas.aac;
/*    */ import aacinternal.v;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ public class cr extends ck {
/*    */   public void d() {
/* 13 */     this.g = false;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 22 */     this.a = System.currentTimeMillis();
/*    */   }
/*    */   
/*    */   private boolean g;
/*    */   private long a;
/*    */   private long m;
/*    */   private long h;
/*    */   private final double[] k;
/*    */   private int i;
/*    */   private final c1 f;
/*    */   private final cB j;
/*    */   private final cV l;
/*    */   private static final long n = nc.a(8960397743483231172L, 8788695436747234474L, MethodHandles.lookup().lookupClass()).a(118914697629562L);
/*    */   private static final String[] o;
/*    */   private static final String[] p;
/*    */   private static final Map q = new HashMap<>(13);
/*    */   
/*    */   public void c(short paramShort1, short paramShort2, int paramInt) {
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
/*    */     //   23: getstatic me/konsolas/aac/cr.n : J
/*    */     //   26: lxor
/*    */     //   27: lstore #4
/*    */     //   29: lload #4
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 90364124075655
/*    */     //   35: lxor
/*    */     //   36: lstore #6
/*    */     //   38: pop2
/*    */     //   39: ldc2_w 6647848773704084914
/*    */     //   42: lload #4
/*    */     //   44: <illegal opcode> w : (JJ)[I
/*    */     //   49: astore #8
/*    */     //   51: aload_0
/*    */     //   52: aload #8
/*    */     //   54: ifnonnull -> 106
/*    */     //   57: getfield f : Lme/konsolas/aac/c1;
/*    */     //   60: ifnull -> 105
/*    */     //   63: goto -> 77
/*    */     //   66: ldc2_w 6687915715592803131
/*    */     //   69: lload #4
/*    */     //   71: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   76: athrow
/*    */     //   77: aload_0
/*    */     //   78: getfield f : Lme/konsolas/aac/c1;
/*    */     //   81: ldc2_w 6644802029000068275
/*    */     //   84: lload #4
/*    */     //   86: <illegal opcode> b : (Lme/konsolas/aac/c1;JJ)V
/*    */     //   91: goto -> 105
/*    */     //   94: ldc2_w 6687915715592803131
/*    */     //   97: lload #4
/*    */     //   99: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   104: athrow
/*    */     //   105: aload_0
/*    */     //   106: getfield l : Lme/konsolas/aac/cV;
/*    */     //   109: aload #8
/*    */     //   111: ifnonnull -> 149
/*    */     //   114: ifnull -> 161
/*    */     //   117: goto -> 131
/*    */     //   120: ldc2_w 6687915715592803131
/*    */     //   123: lload #4
/*    */     //   125: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   130: athrow
/*    */     //   131: aload_0
/*    */     //   132: getfield l : Lme/konsolas/aac/cV;
/*    */     //   135: goto -> 149
/*    */     //   138: ldc2_w 6687915715592803131
/*    */     //   141: lload #4
/*    */     //   143: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   148: athrow
/*    */     //   149: lload #6
/*    */     //   151: ldc2_w 6657092178017641535
/*    */     //   154: lload #4
/*    */     //   156: <illegal opcode> b : (Lme/konsolas/aac/cV;JJJ)V
/*    */     //   161: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 51
/*    */     //   #8	-> 105
/*    */     //   #7	-> 161
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   51	63	66	aacinternal/v
/*    */     //   57	91	94	aacinternal/v
/*    */     //   106	117	120	aacinternal/v
/*    */     //   114	135	138	aacinternal/v
/*    */   }
/*    */   
/*    */   public void b(short paramShort, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/cr.n : J
/*    */     //   26: lxor
/*    */     //   27: lstore #4
/*    */     //   29: lload #4
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 23752848747563
/*    */     //   35: lxor
/*    */     //   36: dup2
/*    */     //   37: bipush #32
/*    */     //   39: lushr
/*    */     //   40: l2i
/*    */     //   41: istore #6
/*    */     //   43: dup2
/*    */     //   44: bipush #32
/*    */     //   46: lshl
/*    */     //   47: bipush #48
/*    */     //   49: lushr
/*    */     //   50: l2i
/*    */     //   51: istore #7
/*    */     //   53: dup2
/*    */     //   54: bipush #48
/*    */     //   56: lshl
/*    */     //   57: bipush #48
/*    */     //   59: lushr
/*    */     //   60: l2i
/*    */     //   61: istore #8
/*    */     //   63: pop2
/*    */     //   64: dup2
/*    */     //   65: ldc2_w 42245350816605
/*    */     //   68: lxor
/*    */     //   69: dup2
/*    */     //   70: bipush #32
/*    */     //   72: lushr
/*    */     //   73: l2i
/*    */     //   74: istore #9
/*    */     //   76: dup2
/*    */     //   77: bipush #32
/*    */     //   79: lshl
/*    */     //   80: bipush #48
/*    */     //   82: lushr
/*    */     //   83: l2i
/*    */     //   84: istore #10
/*    */     //   86: dup2
/*    */     //   87: bipush #48
/*    */     //   89: lshl
/*    */     //   90: bipush #48
/*    */     //   92: lushr
/*    */     //   93: l2i
/*    */     //   94: istore #11
/*    */     //   96: pop2
/*    */     //   97: dup2
/*    */     //   98: ldc2_w 27578919645312
/*    */     //   101: lxor
/*    */     //   102: lstore #12
/*    */     //   104: pop2
/*    */     //   105: ldc2_w -3612753306392626129
/*    */     //   108: lload #4
/*    */     //   110: <illegal opcode> w : (JJ)[I
/*    */     //   115: astore #14
/*    */     //   117: aload_0
/*    */     //   118: aload #14
/*    */     //   120: ifnonnull -> 174
/*    */     //   123: getfield f : Lme/konsolas/aac/c1;
/*    */     //   126: ifnull -> 173
/*    */     //   129: goto -> 143
/*    */     //   132: ldc2_w -3653205627224341850
/*    */     //   135: lload #4
/*    */     //   137: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   142: athrow
/*    */     //   143: aload_0
/*    */     //   144: getfield f : Lme/konsolas/aac/c1;
/*    */     //   147: lload #12
/*    */     //   149: ldc2_w -3607259939704298349
/*    */     //   152: lload #4
/*    */     //   154: <illegal opcode> b : (Lme/konsolas/aac/c1;JJJ)V
/*    */     //   159: goto -> 173
/*    */     //   162: ldc2_w -3653205627224341850
/*    */     //   165: lload #4
/*    */     //   167: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   172: athrow
/*    */     //   173: aload_0
/*    */     //   174: aload #14
/*    */     //   176: iload_3
/*    */     //   177: iflt -> 242
/*    */     //   180: ifnonnull -> 240
/*    */     //   183: getfield j : Lme/konsolas/aac/cB;
/*    */     //   186: ifnull -> 239
/*    */     //   189: goto -> 203
/*    */     //   192: ldc2_w -3653205627224341850
/*    */     //   195: lload #4
/*    */     //   197: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   202: athrow
/*    */     //   203: aload_0
/*    */     //   204: getfield j : Lme/konsolas/aac/cB;
/*    */     //   207: iload #6
/*    */     //   209: iload #7
/*    */     //   211: i2s
/*    */     //   212: iload #8
/*    */     //   214: i2s
/*    */     //   215: ldc2_w -3645276278174485264
/*    */     //   218: lload #4
/*    */     //   220: <illegal opcode> b : (Lme/konsolas/aac/cB;ISSJJ)V
/*    */     //   225: goto -> 239
/*    */     //   228: ldc2_w -3653205627224341850
/*    */     //   231: lload #4
/*    */     //   233: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   238: athrow
/*    */     //   239: aload_0
/*    */     //   240: aload #14
/*    */     //   242: ifnonnull -> 302
/*    */     //   245: getfield l : Lme/konsolas/aac/cV;
/*    */     //   248: ifnull -> 301
/*    */     //   251: goto -> 265
/*    */     //   254: ldc2_w -3653205627224341850
/*    */     //   257: lload #4
/*    */     //   259: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   264: athrow
/*    */     //   265: aload_0
/*    */     //   266: getfield l : Lme/konsolas/aac/cV;
/*    */     //   269: iload #9
/*    */     //   271: iload #10
/*    */     //   273: i2s
/*    */     //   274: iload #11
/*    */     //   276: i2c
/*    */     //   277: ldc2_w -3606174585398205369
/*    */     //   280: lload #4
/*    */     //   282: <illegal opcode> b : (Lme/konsolas/aac/cV;ISCJJ)V
/*    */     //   287: goto -> 301
/*    */     //   290: ldc2_w -3653205627224341850
/*    */     //   293: lload #4
/*    */     //   295: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   300: athrow
/*    */     //   301: aload_0
/*    */     //   302: invokestatic currentTimeMillis : ()J
/*    */     //   305: putfield h : J
/*    */     //   308: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 117
/*    */     //   #4	-> 173
/*    */     //   #31	-> 239
/*    */     //   #14	-> 301
/*    */     //   #17	-> 308
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   117	129	132	aacinternal/v
/*    */     //   123	159	162	aacinternal/v
/*    */     //   174	189	192	aacinternal/v
/*    */     //   183	225	228	aacinternal/v
/*    */     //   240	251	254	aacinternal/v
/*    */     //   245	287	290	aacinternal/v
/*    */   }
/*    */   
/*    */   public void a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cr.n : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 131446301896639
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 84703490404909
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: dup2
/*    */     //   21: ldc2_w 126615403874366
/*    */     //   24: lxor
/*    */     //   25: lstore #7
/*    */     //   27: pop2
/*    */     //   28: ldc2_w -4969519489078326533
/*    */     //   31: lload_1
/*    */     //   32: <illegal opcode> w : (JJ)[I
/*    */     //   37: invokestatic currentTimeMillis : ()J
/*    */     //   40: lstore #10
/*    */     //   42: astore #9
/*    */     //   44: aload_0
/*    */     //   45: aload #9
/*    */     //   47: ifnonnull -> 96
/*    */     //   50: getfield j : Lme/konsolas/aac/cB;
/*    */     //   53: ifnull -> 95
/*    */     //   56: goto -> 69
/*    */     //   59: ldc2_w -4928802151702481806
/*    */     //   62: lload_1
/*    */     //   63: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   68: athrow
/*    */     //   69: aload_0
/*    */     //   70: getfield j : Lme/konsolas/aac/cB;
/*    */     //   73: ldc2_w -4960018142710913267
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> b : (Lme/konsolas/aac/cB;JJ)V
/*    */     //   82: goto -> 95
/*    */     //   85: ldc2_w -4928802151702481806
/*    */     //   88: lload_1
/*    */     //   89: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   94: athrow
/*    */     //   95: aload_0
/*    */     //   96: aload #9
/*    */     //   98: ifnonnull -> 218
/*    */     //   101: getfield g : Z
/*    */     //   104: ifne -> 217
/*    */     //   107: goto -> 120
/*    */     //   110: ldc2_w -4928802151702481806
/*    */     //   113: lload_1
/*    */     //   114: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   119: athrow
/*    */     //   120: lload #10
/*    */     //   122: aload_0
/*    */     //   123: getfield a : J
/*    */     //   126: lsub
/*    */     //   127: ldc2_w 100
/*    */     //   130: lcmp
/*    */     //   131: aload #9
/*    */     //   133: lload_1
/*    */     //   134: lconst_0
/*    */     //   135: lcmp
/*    */     //   136: ifle -> 198
/*    */     //   139: ifnonnull -> 196
/*    */     //   142: goto -> 155
/*    */     //   145: ldc2_w -4928802151702481806
/*    */     //   148: lload_1
/*    */     //   149: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   154: athrow
/*    */     //   155: iflt -> 217
/*    */     //   158: goto -> 171
/*    */     //   161: ldc2_w -4928802151702481806
/*    */     //   164: lload_1
/*    */     //   165: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   170: athrow
/*    */     //   171: invokestatic currentTimeMillis : ()J
/*    */     //   174: aload_0
/*    */     //   175: getfield h : J
/*    */     //   178: lsub
/*    */     //   179: ldc2_w 1000
/*    */     //   182: lcmp
/*    */     //   183: goto -> 196
/*    */     //   186: ldc2_w -4928802151702481806
/*    */     //   189: lload_1
/*    */     //   190: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   195: athrow
/*    */     //   196: aload #9
/*    */     //   198: ifnonnull -> 247
/*    */     //   201: ifle -> 223
/*    */     //   204: goto -> 217
/*    */     //   207: ldc2_w -4928802151702481806
/*    */     //   210: lload_1
/*    */     //   211: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   216: athrow
/*    */     //   217: aload_0
/*    */     //   218: lconst_0
/*    */     //   219: putfield m : J
/*    */     //   222: return
/*    */     //   223: aload_0
/*    */     //   224: aload #9
/*    */     //   226: ifnonnull -> 402
/*    */     //   229: getfield m : J
/*    */     //   232: lconst_0
/*    */     //   233: lcmp
/*    */     //   234: goto -> 247
/*    */     //   237: ldc2_w -4928802151702481806
/*    */     //   240: lload_1
/*    */     //   241: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   246: athrow
/*    */     //   247: ifeq -> 401
/*    */     //   250: lload #10
/*    */     //   252: aload_0
/*    */     //   253: getfield m : J
/*    */     //   256: lsub
/*    */     //   257: l2d
/*    */     //   258: ldc2_w 1000.0
/*    */     //   261: ddiv
/*    */     //   262: dstore #12
/*    */     //   264: aload_0
/*    */     //   265: getfield k : [D
/*    */     //   268: aload_0
/*    */     //   269: dup
/*    */     //   270: getfield i : I
/*    */     //   273: dup_x1
/*    */     //   274: iconst_1
/*    */     //   275: iadd
/*    */     //   276: putfield i : I
/*    */     //   279: dload #12
/*    */     //   281: dastore
/*    */     //   282: lload_1
/*    */     //   283: lconst_0
/*    */     //   284: lcmp
/*    */     //   285: iflt -> 407
/*    */     //   288: aload_0
/*    */     //   289: aload #9
/*    */     //   291: ifnonnull -> 402
/*    */     //   294: getfield i : I
/*    */     //   297: aload_0
/*    */     //   298: getfield k : [D
/*    */     //   301: arraylength
/*    */     //   302: if_icmplt -> 401
/*    */     //   305: goto -> 318
/*    */     //   308: ldc2_w -4928802151702481806
/*    */     //   311: lload_1
/*    */     //   312: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   317: athrow
/*    */     //   318: aload_0
/*    */     //   319: iconst_0
/*    */     //   320: putfield i : I
/*    */     //   323: aload_0
/*    */     //   324: getfield k : [D
/*    */     //   327: lload #5
/*    */     //   329: dup2_x1
/*    */     //   330: pop2
/*    */     //   331: invokestatic h : (J[D)D
/*    */     //   334: dstore #14
/*    */     //   336: aload_0
/*    */     //   337: getfield k : [D
/*    */     //   340: lload #7
/*    */     //   342: ldc2_w -4928570844865329401
/*    */     //   345: lload_1
/*    */     //   346: <illegal opcode> w : ([DJJJ)D
/*    */     //   351: dstore #16
/*    */     //   353: aload_0
/*    */     //   354: ldc2_w -4963875792396870323
/*    */     //   357: lload_1
/*    */     //   358: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   363: dconst_1
/*    */     //   364: dload #14
/*    */     //   366: ddiv
/*    */     //   367: d2f
/*    */     //   368: lload_3
/*    */     //   369: ldc2_w -4932194642275434535
/*    */     //   372: lload_1
/*    */     //   373: <illegal opcode> b : (Lme/konsolas/aac/ck;Lme/konsolas/aac/eA;FJJJ)V
/*    */     //   378: aload_0
/*    */     //   379: ldc2_w -4987065965957301108
/*    */     //   382: lload_1
/*    */     //   383: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   388: dload #16
/*    */     //   390: d2f
/*    */     //   391: lload_3
/*    */     //   392: ldc2_w -4932194642275434535
/*    */     //   395: lload_1
/*    */     //   396: <illegal opcode> b : (Lme/konsolas/aac/ck;Lme/konsolas/aac/eA;FJJJ)V
/*    */     //   401: aload_0
/*    */     //   402: lload #10
/*    */     //   404: putfield m : J
/*    */     //   407: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 37
/*    */     //   #24	-> 44
/*    */     //   #34	-> 95
/*    */     //   #9	-> 217
/*    */     //   #5	-> 222
/*    */     //   #27	-> 223
/*    */     //   #15	-> 250
/*    */     //   #6	-> 264
/*    */     //   #11	-> 282
/*    */     //   #25	-> 318
/*    */     //   #35	-> 323
/*    */     //   #30	-> 336
/*    */     //   #20	-> 353
/*    */     //   #1	-> 378
/*    */     //   #10	-> 401
/*    */     //   #26	-> 407
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   44	56	59	aacinternal/v
/*    */     //   50	82	85	aacinternal/v
/*    */     //   96	107	110	aacinternal/v
/*    */     //   101	142	145	aacinternal/v
/*    */     //   120	158	161	aacinternal/v
/*    */     //   155	183	186	aacinternal/v
/*    */     //   196	204	207	aacinternal/v
/*    */     //   223	234	237	aacinternal/v
/*    */     //   264	305	308	aacinternal/v
/*    */   }
/*    */   
/*    */   public cr(AAC paramAAC, Player paramPlayer, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cr.n : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: lload_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 129871477890634
/*    */     //   11: lxor
/*    */     //   12: dup2
/*    */     //   13: bipush #48
/*    */     //   15: lushr
/*    */     //   16: l2i
/*    */     //   17: istore #5
/*    */     //   19: dup2
/*    */     //   20: bipush #16
/*    */     //   22: lshl
/*    */     //   23: bipush #48
/*    */     //   25: lushr
/*    */     //   26: l2i
/*    */     //   27: istore #6
/*    */     //   29: dup2
/*    */     //   30: bipush #32
/*    */     //   32: lshl
/*    */     //   33: bipush #32
/*    */     //   35: lushr
/*    */     //   36: l2i
/*    */     //   37: istore #7
/*    */     //   39: pop2
/*    */     //   40: dup2
/*    */     //   41: ldc2_w 134290917779008
/*    */     //   44: lxor
/*    */     //   45: lstore #8
/*    */     //   47: dup2
/*    */     //   48: ldc2_w 16886040894011
/*    */     //   51: lxor
/*    */     //   52: lstore #10
/*    */     //   54: dup2
/*    */     //   55: ldc2_w 102912469649773
/*    */     //   58: lxor
/*    */     //   59: lstore #12
/*    */     //   61: pop2
/*    */     //   62: aload_0
/*    */     //   63: iload #5
/*    */     //   65: i2s
/*    */     //   66: iload #6
/*    */     //   68: i2s
/*    */     //   69: aload_1
/*    */     //   70: aload_2
/*    */     //   71: iload #7
/*    */     //   73: sipush #30975
/*    */     //   76: ldc2_w 6051555561855422888
/*    */     //   79: lload_3
/*    */     //   80: lxor
/*    */     //   81: <illegal opcode> h : (IJ)Ljava/lang/String;
/*    */     //   86: invokespecial <init> : (SSLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;ILjava/lang/String;)V
/*    */     //   89: aload_0
/*    */     //   90: iconst_0
/*    */     //   91: putfield g : Z
/*    */     //   94: ldc2_w -7094017050722620289
/*    */     //   97: lload_3
/*    */     //   98: <illegal opcode> w : (JJ)[I
/*    */     //   103: aload_0
/*    */     //   104: iconst_0
/*    */     //   105: putfield i : I
/*    */     //   108: astore #14
/*    */     //   110: aload_0
/*    */     //   111: aload_0
/*    */     //   112: ldc2_w -7189838424629811791
/*    */     //   115: lload_3
/*    */     //   116: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   121: sipush #21863
/*    */     //   124: ldc2_w 436792117922577459
/*    */     //   127: lload_3
/*    */     //   128: lxor
/*    */     //   129: <illegal opcode> h : (IJ)Ljava/lang/String;
/*    */     //   134: ldc2_w -7191303458122780325
/*    */     //   137: lload_3
/*    */     //   138: <illegal opcode> b : (Lorg/bukkit/configuration/ConfigurationSection;Ljava/lang/String;JJ)Z
/*    */     //   143: ifeq -> 170
/*    */     //   146: new me/konsolas/aac/c1
/*    */     //   149: dup
/*    */     //   150: lload #10
/*    */     //   152: aload_1
/*    */     //   153: aload_2
/*    */     //   154: invokespecial <init> : (JLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;)V
/*    */     //   157: goto -> 171
/*    */     //   160: ldc2_w -7125497495117786378
/*    */     //   163: lload_3
/*    */     //   164: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   169: athrow
/*    */     //   170: aconst_null
/*    */     //   171: putfield f : Lme/konsolas/aac/c1;
/*    */     //   174: aload_0
/*    */     //   175: aload_0
/*    */     //   176: ldc2_w -7189838424629811791
/*    */     //   179: lload_3
/*    */     //   180: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   185: sipush #22426
/*    */     //   188: ldc2_w 4420268944752328394
/*    */     //   191: lload_3
/*    */     //   192: lxor
/*    */     //   193: <illegal opcode> h : (IJ)Ljava/lang/String;
/*    */     //   198: ldc2_w -7191303458122780325
/*    */     //   201: lload_3
/*    */     //   202: <illegal opcode> b : (Lorg/bukkit/configuration/ConfigurationSection;Ljava/lang/String;JJ)Z
/*    */     //   207: ifeq -> 234
/*    */     //   210: new me/konsolas/aac/cB
/*    */     //   213: dup
/*    */     //   214: aload_1
/*    */     //   215: lload #8
/*    */     //   217: aload_2
/*    */     //   218: invokespecial <init> : (Lme/konsolas/aac/AAC;JLorg/bukkit/entity/Player;)V
/*    */     //   221: goto -> 235
/*    */     //   224: ldc2_w -7125497495117786378
/*    */     //   227: lload_3
/*    */     //   228: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   233: athrow
/*    */     //   234: aconst_null
/*    */     //   235: putfield j : Lme/konsolas/aac/cB;
/*    */     //   238: aload_0
/*    */     //   239: aload_0
/*    */     //   240: ldc2_w -7189838424629811791
/*    */     //   243: lload_3
/*    */     //   244: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   249: sipush #16547
/*    */     //   252: ldc2_w 8633784183855917558
/*    */     //   255: lload_3
/*    */     //   256: lxor
/*    */     //   257: <illegal opcode> h : (IJ)Ljava/lang/String;
/*    */     //   262: ldc2_w -7191303458122780325
/*    */     //   265: lload_3
/*    */     //   266: <illegal opcode> b : (Lorg/bukkit/configuration/ConfigurationSection;Ljava/lang/String;JJ)Z
/*    */     //   271: ifeq -> 298
/*    */     //   274: new me/konsolas/aac/cV
/*    */     //   277: dup
/*    */     //   278: aload_1
/*    */     //   279: lload #12
/*    */     //   281: aload_2
/*    */     //   282: invokespecial <init> : (Lme/konsolas/aac/AAC;JLorg/bukkit/entity/Player;)V
/*    */     //   285: goto -> 299
/*    */     //   288: ldc2_w -7125497495117786378
/*    */     //   291: lload_3
/*    */     //   292: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   297: athrow
/*    */     //   298: aconst_null
/*    */     //   299: putfield l : Lme/konsolas/aac/cV;
/*    */     //   302: aload_0
/*    */     //   303: aload_0
/*    */     //   304: ldc2_w -7189838424629811791
/*    */     //   307: lload_3
/*    */     //   308: <illegal opcode> b : (Lme/konsolas/aac/ck;JJ)Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   313: sipush #21792
/*    */     //   316: ldc2_w 5078676644990205046
/*    */     //   319: lload_3
/*    */     //   320: lxor
/*    */     //   321: <illegal opcode> h : (IJ)Ljava/lang/String;
/*    */     //   326: ldc2_w -7083864328988689221
/*    */     //   329: lload_3
/*    */     //   330: <illegal opcode> b : (Lorg/bukkit/configuration/ConfigurationSection;Ljava/lang/String;JJ)I
/*    */     //   335: newarray double
/*    */     //   337: putfield k : [D
/*    */     //   340: lload_3
/*    */     //   341: lconst_0
/*    */     //   342: lcmp
/*    */     //   343: ifle -> 364
/*    */     //   346: aload #14
/*    */     //   348: ifnull -> 377
/*    */     //   351: iconst_2
/*    */     //   352: anewarray me/konsolas/aac/aN
/*    */     //   355: ldc2_w -7072413182199053300
/*    */     //   358: lload_3
/*    */     //   359: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   364: goto -> 377
/*    */     //   367: ldc2_w -7125497495117786378
/*    */     //   370: lload_3
/*    */     //   371: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   376: athrow
/*    */     //   377: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 62
/*    */     //   #3	-> 89
/*    */     //   #19	-> 103
/*    */     //   #23	-> 110
/*    */     //   #2	-> 174
/*    */     //   #16	-> 238
/*    */     //   #36	-> 302
/*    */     //   #37	-> 340
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   110	160	160	aacinternal/v
/*    */     //   171	224	224	aacinternal/v
/*    */     //   235	288	288	aacinternal/v
/*    */     //   299	364	367	aacinternal/v
/*    */   }
/*    */   
/*    */   public void a(BlockPosition paramBlockPosition, EnumWrappers.PlayerDigType paramPlayerDigType, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cr.n : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: aload_0
/*    */     //   7: aload_2
/*    */     //   8: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.START_DESTROY_BLOCK : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
/*    */     //   11: if_acmpne -> 28
/*    */     //   14: iconst_1
/*    */     //   15: goto -> 29
/*    */     //   18: ldc2_w -1022546874427572700
/*    */     //   21: lload_3
/*    */     //   22: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   27: athrow
/*    */     //   28: iconst_0
/*    */     //   29: putfield g : Z
/*    */     //   32: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 6
/*    */     //   #12	-> 32
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   6	18	18	aacinternal/v
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = n ^ 0x44EC226B32EDL;
/*    */     "⁉초僇꼑?枉⍔⫷偺빽뮖⧸닝웍躯ᦲᰘ䞼儨".toCharArray()[10] = (char)("⁉초僇꼑?枉⍔⫷偺빽뮖⧸닝웍躯ᦲᰘ䞼儨".toCharArray()[10] ^ 0x6CF1);
/*    */     "ࣘ쫠᫭".toCharArray()[0] = (char)("ࣘ쫠᫭".toCharArray()[0] ^ 0xCDB);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(dP$dt.X("⁉초僇꼑?枉⍔⫷偺빽뮖⧸닝웍躯ᦲᰘ䞼儨".toCharArray(), (short)23886, false, false))).init(2, SecretKeyFactory.getInstance(dP$dt.X("ࣘ쫠᫭".toCharArray(), (short)29606, true, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[5];
/*    */     boolean bool = false;
/*    */     "ꥹ홳硼醎뻹℆䎁賯쉺ꜛ㣌㮫ᛝ钒곍탹홼蛀猉葁銌鲇砾쮧隞濱窸䁭䖲簝㟄﬎뿆䫋貟↜惀ᗓ邪姥콱撀᩾ㅈ蠼軙찋䄐鵊迪ᳬ杞촢岒훧㥰齛欄ꡎ䂥跃䞬䋰逹䔒挨ݡ摔?弑ꌫꍲ薨냭嗌䈽?툀鷼?᧸䅉짫쑾痐⸷".toCharArray()[33] = (char)("ꥹ홳硼醎뻹℆䎁賯쉺ꜛ㣌㮫ᛝ钒곍탹홼蛀猉葁銌鲇砾쮧隞濱窸䁭䖲簝㟄﬎뿆䫋貟↜惀ᗓ邪姥콱撀᩾ㅈ蠼軙찋䄐鵊迪ᳬ杞촢岒훧㥰齛欄ꡎ䂥跃䞬䋰逹䔒挨ݡ摔?弑ꌫꍲ薨냭嗌䈽?툀鷼?᧸䅉짫쑾痐⸷".toCharArray()[33] ^ 0x669A);
/*    */     String str;
/*    */     int i = (str = dP$dt.X("ꥹ홳硼醎뻹℆䎁賯쉺ꜛ㣌㮫ᛝ钒곍탹홼蛀猉葁銌鲇砾쮧隞濱窸䁭䖲簝㟄﬎뿆䫋貟↜惀ᗓ邪姥콱撀᩾ㅈ蠼軙찋䄐鵊迪ᳬ杞촢岒훧㥰齛欄ꡎ䂥跃䞬䋰逹䔒挨ݡ摔?弑ꌫꍲ薨냭嗌䈽?툀鷼?᧸䅉짫쑾痐⸷".toCharArray(), (short)15414, true, false)).length();
/*    */     byte b2 = 40;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x75DB;
/*    */     if (p[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])q.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "迅숵肹謔竐尨ꌞ쐝쎏节닦ꄄꤻ۩唇?㶒㮇".toCharArray()[0] = (char)("迅숵肹謔竐尨ꌞ쐝쎏节닦ꄄꤻ۩唇?㶒㮇".toCharArray()[0] ^ 0x140E);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("迅숵肹謔竐尨ꌞ쐝쎏节닦ꄄꤻ۩唇?㶒㮇".toCharArray(), (short)32180, true, 2));
/*    */           "䲄?囀䘋".toCharArray()[0] = (char)("䲄?囀䘋".toCharArray()[0] ^ 0x4C7D);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("䲄?囀䘋".toCharArray(), (short)24164, false, 5));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           q.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "㞲”鋬奘ꦣ碜隰潌ᩫ칛폾⦒㚳捺ꋓᄻ".toCharArray()[3] = (char)("㞲”鋬奘ꦣ碜隰潌ᩫ칛폾⦒㚳捺ꋓᄻ".toCharArray()[3] ^ 0x17E8);
/*    */         throw new RuntimeException(fW$gy.A("㞲”鋬奘ꦣ碜隰潌ᩫ칛폾⦒㚳捺ꋓᄻ".toCharArray(), (short)32412, false, 1), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "䢲ꐇ듹糳痧忝\027섙Ⓞᬠ".toCharArray()[3] = (char)("䢲ꐇ듹糳痧忝\027섙Ⓞᬠ".toCharArray()[3] ^ 0x4AB1);
/*    */       byte[] arrayOfByte2 = o[i].getBytes(fW$gy.A("䢲ꐇ듹糳痧忝\027섙Ⓞᬠ".toCharArray(), (short)7066, false, 0));
/*    */       p[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return p[i];
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
/*    */     //   50: goto -> 170
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '㱁娵叢ရ䩻ꗓ欥뇋鈻掾聠묗使?ꯈ᩷'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #15
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #22724
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #6104
/*    */     //   87: iconst_3
/*    */     //   88: iconst_4
/*    */     //   89: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '沉뭊퀰䚒'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_1
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #2502
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: bipush #67
/*    */     //   114: iconst_3
/*    */     //   115: iconst_3
/*    */     //   116: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w '욕ꛮ䋄຀'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_1
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #21142
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #454
/*    */     //   146: iconst_3
/*    */     //   147: iconst_3
/*    */     //   148: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   154: aload_2
/*    */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   164: aload #4
/*    */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   169: athrow
/*    */     //   170: aload_3
/*    */     //   171: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */