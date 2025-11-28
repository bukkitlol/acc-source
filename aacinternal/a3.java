/*    */ package aacinternal;
/*    */ public class a3 implements Serializable, aI { private static final long serialVersionUID = 20160406L; private final double f; private final double b; private final long c; private final double e; private final double d;
/*  3 */   public double c(long paramLong) { return aL.a(this.b); } private final double a; private static final long g = nc.a(902130000677146540L, -8391050951960571534L, MethodHandles.lookup().lookupClass()).a(258745089140558L); private static final String[] h; private static final String[] i; private static final Map j = new HashMap<>(13); public String toString() {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/a3.g : J
/*    */     //   3: ldc2_w 60759468395236
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: lload_1
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 128632613044532
/*    */     //   13: lxor
/*    */     //   14: lstore_3
/*    */     //   15: dup2
/*    */     //   16: ldc2_w 81800130053690
/*    */     //   19: lxor
/*    */     //   20: dup2
/*    */     //   21: bipush #32
/*    */     //   23: lushr
/*    */     //   24: l2i
/*    */     //   25: istore #5
/*    */     //   27: dup2
/*    */     //   28: bipush #32
/*    */     //   30: lshl
/*    */     //   31: bipush #48
/*    */     //   33: lushr
/*    */     //   34: l2i
/*    */     //   35: istore #6
/*    */     //   37: dup2
/*    */     //   38: bipush #48
/*    */     //   40: lshl
/*    */     //   41: bipush #48
/*    */     //   43: lushr
/*    */     //   44: l2i
/*    */     //   45: istore #7
/*    */     //   47: pop2
/*    */     //   48: dup2
/*    */     //   49: ldc2_w 37422992191588
/*    */     //   52: lxor
/*    */     //   53: dup2
/*    */     //   54: bipush #32
/*    */     //   56: lushr
/*    */     //   57: l2i
/*    */     //   58: istore #8
/*    */     //   60: dup2
/*    */     //   61: bipush #32
/*    */     //   63: lshl
/*    */     //   64: bipush #48
/*    */     //   66: lushr
/*    */     //   67: l2i
/*    */     //   68: istore #9
/*    */     //   70: dup2
/*    */     //   71: bipush #48
/*    */     //   73: lshl
/*    */     //   74: bipush #48
/*    */     //   76: lushr
/*    */     //   77: l2i
/*    */     //   78: istore #10
/*    */     //   80: pop2
/*    */     //   81: dup2
/*    */     //   82: ldc2_w 127674055768335
/*    */     //   85: lxor
/*    */     //   86: lstore #11
/*    */     //   88: dup2
/*    */     //   89: ldc2_w 108845830799487
/*    */     //   92: lxor
/*    */     //   93: lstore #13
/*    */     //   95: dup2
/*    */     //   96: ldc2_w 113696003838223
/*    */     //   99: lxor
/*    */     //   100: lstore #15
/*    */     //   102: pop2
/*    */     //   103: new java/lang/StringBuilder
/*    */     //   106: dup
/*    */     //   107: sipush #200
/*    */     //   110: invokespecial <init> : (I)V
/*    */     //   113: astore #17
/*    */     //   115: ldc '㌋疺'
/*    */     //   117: invokevirtual toCharArray : ()[C
/*    */     //   120: dup
/*    */     //   121: dup
/*    */     //   122: iconst_0
/*    */     //   123: dup_x1
/*    */     //   124: caload
/*    */     //   125: sipush #13383
/*    */     //   128: ixor
/*    */     //   129: i2c
/*    */     //   130: castore
/*    */     //   131: sipush #7995
/*    */     //   134: iconst_5
/*    */     //   135: iconst_1
/*    */     //   136: invokestatic L : (Ljava/lang/Object;SBZ)Ljava/lang/String;
/*    */     //   139: astore #18
/*    */     //   141: aload #17
/*    */     //   143: sipush #1439
/*    */     //   146: ldc2_w 15438185670123597
/*    */     //   149: lload_1
/*    */     //   150: lxor
/*    */     //   151: <illegal opcode> n : (IJ)Ljava/lang/String;
/*    */     //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   159: aload #18
/*    */     //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   164: sipush #20947
/*    */     //   167: ldc2_w 356809037396833287
/*    */     //   170: lload_1
/*    */     //   171: lxor
/*    */     //   172: <illegal opcode> n : (IJ)Ljava/lang/String;
/*    */     //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   180: aload_0
/*    */     //   181: invokevirtual a : ()J
/*    */     //   184: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   187: aload #18
/*    */     //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   192: sipush #15248
/*    */     //   195: ldc2_w 4935349406835777089
/*    */     //   198: lload_1
/*    */     //   199: lxor
/*    */     //   200: <illegal opcode> n : (IJ)Ljava/lang/String;
/*    */     //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   208: aload_0
/*    */     //   209: lload #15
/*    */     //   211: invokevirtual a : (J)D
/*    */     //   214: invokevirtual append : (D)Ljava/lang/StringBuilder;
/*    */     //   217: aload #18
/*    */     //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   222: sipush #10164
/*    */     //   225: ldc2_w 1411630706356650599
/*    */     //   228: lload_1
/*    */     //   229: lxor
/*    */     //   230: <illegal opcode> n : (IJ)Ljava/lang/String;
/*    */     //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   238: aload_0
/*    */     //   239: iload #5
/*    */     //   241: iload #6
/*    */     //   243: i2s
/*    */     //   244: iload #7
/*    */     //   246: i2s
/*    */     //   247: invokevirtual d : (ISS)D
/*    */     //   250: invokevirtual append : (D)Ljava/lang/StringBuilder;
/*    */     //   253: aload #18
/*    */     //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   258: sipush #30903
/*    */     //   261: ldc2_w 6139013999317212514
/*    */     //   264: lload_1
/*    */     //   265: lxor
/*    */     //   266: <illegal opcode> n : (IJ)Ljava/lang/String;
/*    */     //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   274: aload_0
/*    */     //   275: lload_3
/*    */     //   276: invokevirtual b : (J)D
/*    */     //   279: invokevirtual append : (D)Ljava/lang/StringBuilder;
/*    */     //   282: aload #18
/*    */     //   284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   287: sipush #11797
/*    */     //   290: ldc2_w 3970562028720425923
/*    */     //   293: lload_1
/*    */     //   294: lxor
/*    */     //   295: <illegal opcode> n : (IJ)Ljava/lang/String;
/*    */     //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   303: aload_0
/*    */     //   304: lload #11
/*    */     //   306: invokevirtual c : (J)D
/*    */     //   309: invokevirtual append : (D)Ljava/lang/StringBuilder;
/*    */     //   312: aload #18
/*    */     //   314: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   317: sipush #17865
/*    */     //   320: ldc2_w 469067612686639134
/*    */     //   323: lload_1
/*    */     //   324: lxor
/*    */     //   325: <illegal opcode> n : (IJ)Ljava/lang/String;
/*    */     //   330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   333: aload_0
/*    */     //   334: iload #8
/*    */     //   336: iload #9
/*    */     //   338: i2s
/*    */     //   339: iload #10
/*    */     //   341: i2s
/*    */     //   342: invokevirtual f : (ISS)D
/*    */     //   345: invokevirtual append : (D)Ljava/lang/StringBuilder;
/*    */     //   348: aload #18
/*    */     //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   353: sipush #7181
/*    */     //   356: ldc2_w 8742204517776505309
/*    */     //   359: lload_1
/*    */     //   360: lxor
/*    */     //   361: <illegal opcode> n : (IJ)Ljava/lang/String;
/*    */     //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   369: aload_0
/*    */     //   370: lload #13
/*    */     //   372: invokevirtual e : (J)D
/*    */     //   375: invokevirtual append : (D)Ljava/lang/StringBuilder;
/*    */     //   378: aload #18
/*    */     //   380: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   383: pop
/*    */     //   384: aload #17
/*    */     //   386: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   389: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 103
/*    */     //   #36	-> 115
/*    */     //   #42	-> 141
/*    */     //   #4	-> 177
/*    */     //   #45	-> 205
/*    */     //   #29	-> 235
/*    */     //   #17	-> 271
/*    */     //   #38	-> 300
/*    */     //   #8	-> 330
/*    */     //   #12	-> 366
/*    */     //   #10	-> 384
/*    */   } public double b(long paramLong) {
/*  6 */     return this.f;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double d(int paramInt, short paramShort1, short paramShort2) {
/* 14 */     return this.e;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public double a(long paramLong) {
/* 20 */     return this.d;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public a3(double paramDouble1, double paramDouble2, long paramLong, double paramDouble3, double paramDouble4, double paramDouble5) {
/* 33 */     this.f = paramDouble1; this.b = paramDouble2; this.c = paramLong;
/*    */     this.e = paramDouble3;
/* 35 */     this.d = paramDouble4; this.a = paramDouble5;
/*    */   } public long a() { return this.c; } public double e(long paramLong) { return this.a; }
/*    */   public int hashCode() { long l1 = g ^ 0x65212D36A21L, l2 = l1 ^ 0x45ED2561A1F1L; int i = (int)((l1 ^ 0x7B752BE566FFL) >>> 32L), j = (int)((l1 ^ 0x7B752BE566FFL) << 32L >>> 48L), k = (int)((l1 ^ 0x7B752BE566FFL) << 48L >>> 48L); l1 ^ 0x7B752BE566FFL; int m = (int)((l1 ^ 0x1319807350A1L) >>> 32L), n = (int)((l1 ^ 0x1319807350A1L) << 32L >>> 48L), i1 = (int)((l1 ^ 0x1319807350A1L) << 48L >>> 48L); l1 ^ 0x1319807350A1L; long l3 = l1 ^ 0x53EE1D4020BAL, l4 = l1 ^ 0x567751BF71CAL; int i2 = 31 + az.a(d(i, (short)j, (short)k)); i2 = i2 * 31 + az.a(b(l2));
/*    */     i2 = i2 * 31 + az.a(a(l4));
/*    */     i2 = i2 * 31 + az.a(a());
/*    */     i2 = i2 * 31 + az.a(e(l3));
/*    */     i2 = i2 * 31 + az.a(f(m, (short)n, (short)i1));
/*    */     return i2; }
/*    */   public boolean equals(Object paramObject) { // Byte code:
/*    */     //   0: getstatic aacinternal/a3.g : J
/*    */     //   3: ldc2_w 45555898327237
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 133365383510830
/*    */     //   13: lxor
/*    */     //   14: lstore #4
/*    */     //   16: dup2
/*    */     //   17: ldc2_w 137244617763422
/*    */     //   20: lxor
/*    */     //   21: lstore #6
/*    */     //   23: dup2
/*    */     //   24: ldc2_w 117450051021589
/*    */     //   27: lxor
/*    */     //   28: lstore #8
/*    */     //   30: dup2
/*    */     //   31: ldc2_w 92676637928475
/*    */     //   34: lxor
/*    */     //   35: dup2
/*    */     //   36: bipush #32
/*    */     //   38: lushr
/*    */     //   39: l2i
/*    */     //   40: istore #10
/*    */     //   42: dup2
/*    */     //   43: bipush #32
/*    */     //   45: lshl
/*    */     //   46: bipush #48
/*    */     //   48: lushr
/*    */     //   49: l2i
/*    */     //   50: istore #11
/*    */     //   52: dup2
/*    */     //   53: bipush #48
/*    */     //   55: lshl
/*    */     //   56: bipush #48
/*    */     //   58: lushr
/*    */     //   59: l2i
/*    */     //   60: istore #12
/*    */     //   62: pop2
/*    */     //   63: dup2
/*    */     //   64: ldc2_w 117450051021589
/*    */     //   67: lxor
/*    */     //   68: lstore #13
/*    */     //   70: dup2
/*    */     //   71: ldc2_w 92676637928475
/*    */     //   74: lxor
/*    */     //   75: dup2
/*    */     //   76: bipush #32
/*    */     //   78: lushr
/*    */     //   79: l2i
/*    */     //   80: istore #15
/*    */     //   82: dup2
/*    */     //   83: bipush #32
/*    */     //   85: lshl
/*    */     //   86: bipush #48
/*    */     //   88: lushr
/*    */     //   89: l2i
/*    */     //   90: istore #16
/*    */     //   92: dup2
/*    */     //   93: bipush #48
/*    */     //   95: lshl
/*    */     //   96: bipush #48
/*    */     //   98: lushr
/*    */     //   99: l2i
/*    */     //   100: istore #17
/*    */     //   102: pop2
/*    */     //   103: dup2
/*    */     //   104: ldc2_w 66131180329541
/*    */     //   107: lxor
/*    */     //   108: dup2
/*    */     //   109: bipush #32
/*    */     //   111: lushr
/*    */     //   112: l2i
/*    */     //   113: istore #18
/*    */     //   115: dup2
/*    */     //   116: bipush #32
/*    */     //   118: lshl
/*    */     //   119: bipush #48
/*    */     //   121: lushr
/*    */     //   122: l2i
/*    */     //   123: istore #19
/*    */     //   125: dup2
/*    */     //   126: bipush #48
/*    */     //   128: lshl
/*    */     //   129: bipush #48
/*    */     //   131: lushr
/*    */     //   132: l2i
/*    */     //   133: istore #20
/*    */     //   135: pop2
/*    */     //   136: dup2
/*    */     //   137: ldc2_w 46883548886212
/*    */     //   140: lxor
/*    */     //   141: lstore #21
/*    */     //   143: dup2
/*    */     //   144: ldc2_w 115331533398327
/*    */     //   147: lxor
/*    */     //   148: dup2
/*    */     //   149: bipush #48
/*    */     //   151: lushr
/*    */     //   152: l2i
/*    */     //   153: istore #23
/*    */     //   155: dup2
/*    */     //   156: bipush #16
/*    */     //   158: lshl
/*    */     //   159: bipush #32
/*    */     //   161: lushr
/*    */     //   162: l2i
/*    */     //   163: istore #24
/*    */     //   165: dup2
/*    */     //   166: bipush #48
/*    */     //   168: lshl
/*    */     //   169: bipush #48
/*    */     //   171: lushr
/*    */     //   172: l2i
/*    */     //   173: istore #25
/*    */     //   175: pop2
/*    */     //   176: dup2
/*    */     //   177: ldc2_w 137244617763422
/*    */     //   180: lxor
/*    */     //   181: lstore #26
/*    */     //   183: dup2
/*    */     //   184: ldc2_w 66131180329541
/*    */     //   187: lxor
/*    */     //   188: dup2
/*    */     //   189: bipush #32
/*    */     //   191: lushr
/*    */     //   192: l2i
/*    */     //   193: istore #28
/*    */     //   195: dup2
/*    */     //   196: bipush #32
/*    */     //   198: lshl
/*    */     //   199: bipush #48
/*    */     //   201: lushr
/*    */     //   202: l2i
/*    */     //   203: istore #29
/*    */     //   205: dup2
/*    */     //   206: bipush #48
/*    */     //   208: lshl
/*    */     //   209: bipush #48
/*    */     //   211: lushr
/*    */     //   212: l2i
/*    */     //   213: istore #30
/*    */     //   215: pop2
/*    */     //   216: dup2
/*    */     //   217: ldc2_w 133365383510830
/*    */     //   220: lxor
/*    */     //   221: lstore #31
/*    */     //   223: pop2
/*    */     //   224: ldc2_w 5209820467916900597
/*    */     //   227: lload_2
/*    */     //   228: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   233: astore #33
/*    */     //   235: aload_1
/*    */     //   236: aload #33
/*    */     //   238: ifnull -> 271
/*    */     //   241: aload_0
/*    */     //   242: if_acmpne -> 270
/*    */     //   245: goto -> 258
/*    */     //   248: ldc2_w 5224542259650852538
/*    */     //   251: lload_2
/*    */     //   252: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   257: athrow
/*    */     //   258: iconst_1
/*    */     //   259: ireturn
/*    */     //   260: ldc2_w 5224542259650852538
/*    */     //   263: lload_2
/*    */     //   264: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   269: athrow
/*    */     //   270: aload_1
/*    */     //   271: aload #33
/*    */     //   273: ifnull -> 308
/*    */     //   276: instanceof aacinternal/a3
/*    */     //   279: ifne -> 307
/*    */     //   282: goto -> 295
/*    */     //   285: ldc2_w 5224542259650852538
/*    */     //   288: lload_2
/*    */     //   289: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   294: athrow
/*    */     //   295: iconst_0
/*    */     //   296: ireturn
/*    */     //   297: ldc2_w 5224542259650852538
/*    */     //   300: lload_2
/*    */     //   301: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   306: athrow
/*    */     //   307: aload_1
/*    */     //   308: checkcast aacinternal/aI
/*    */     //   311: astore #34
/*    */     //   313: aload #34
/*    */     //   315: iload #15
/*    */     //   317: iload #16
/*    */     //   319: i2s
/*    */     //   320: iload #17
/*    */     //   322: i2s
/*    */     //   323: invokeinterface d : (ISS)D
/*    */     //   328: lload #21
/*    */     //   330: dup2_x2
/*    */     //   331: pop2
/*    */     //   332: aload_0
/*    */     //   333: iload #10
/*    */     //   335: iload #11
/*    */     //   337: i2s
/*    */     //   338: iload #12
/*    */     //   340: i2s
/*    */     //   341: invokevirtual d : (ISS)D
/*    */     //   344: invokestatic b : (JDD)Z
/*    */     //   347: aload #33
/*    */     //   349: ifnull -> 403
/*    */     //   352: ifeq -> 668
/*    */     //   355: goto -> 368
/*    */     //   358: ldc2_w 5224542259650852538
/*    */     //   361: lload_2
/*    */     //   362: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   367: athrow
/*    */     //   368: aload #34
/*    */     //   370: lload #13
/*    */     //   372: invokeinterface b : (J)D
/*    */     //   377: lload #21
/*    */     //   379: dup2_x2
/*    */     //   380: pop2
/*    */     //   381: aload_0
/*    */     //   382: lload #8
/*    */     //   384: invokevirtual b : (J)D
/*    */     //   387: invokestatic b : (JDD)Z
/*    */     //   390: goto -> 403
/*    */     //   393: ldc2_w 5224542259650852538
/*    */     //   396: lload_2
/*    */     //   397: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   402: athrow
/*    */     //   403: aload #33
/*    */     //   405: ifnull -> 459
/*    */     //   408: ifeq -> 668
/*    */     //   411: goto -> 424
/*    */     //   414: ldc2_w 5224542259650852538
/*    */     //   417: lload_2
/*    */     //   418: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   423: athrow
/*    */     //   424: aload #34
/*    */     //   426: lload #4
/*    */     //   428: invokeinterface a : (J)D
/*    */     //   433: lload #21
/*    */     //   435: dup2_x2
/*    */     //   436: pop2
/*    */     //   437: aload_0
/*    */     //   438: lload #31
/*    */     //   440: invokevirtual a : (J)D
/*    */     //   443: invokestatic b : (JDD)Z
/*    */     //   446: goto -> 459
/*    */     //   449: ldc2_w 5224542259650852538
/*    */     //   452: lload_2
/*    */     //   453: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   458: athrow
/*    */     //   459: aload #33
/*    */     //   461: ifnull -> 519
/*    */     //   464: ifeq -> 668
/*    */     //   467: goto -> 480
/*    */     //   470: ldc2_w 5224542259650852538
/*    */     //   473: lload_2
/*    */     //   474: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   479: athrow
/*    */     //   480: aload #34
/*    */     //   482: invokeinterface a : ()J
/*    */     //   487: l2f
/*    */     //   488: aload_0
/*    */     //   489: invokevirtual a : ()J
/*    */     //   492: l2f
/*    */     //   493: iload #23
/*    */     //   495: i2c
/*    */     //   496: swap
/*    */     //   497: iload #24
/*    */     //   499: swap
/*    */     //   500: iload #25
/*    */     //   502: i2c
/*    */     //   503: invokestatic a : (FCIFC)Z
/*    */     //   506: goto -> 519
/*    */     //   509: ldc2_w 5224542259650852538
/*    */     //   512: lload_2
/*    */     //   513: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   518: athrow
/*    */     //   519: aload #33
/*    */     //   521: ifnull -> 575
/*    */     //   524: ifeq -> 668
/*    */     //   527: goto -> 540
/*    */     //   530: ldc2_w 5224542259650852538
/*    */     //   533: lload_2
/*    */     //   534: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   539: athrow
/*    */     //   540: aload #34
/*    */     //   542: lload #6
/*    */     //   544: invokeinterface e : (J)D
/*    */     //   549: lload #21
/*    */     //   551: dup2_x2
/*    */     //   552: pop2
/*    */     //   553: aload_0
/*    */     //   554: lload #26
/*    */     //   556: invokevirtual e : (J)D
/*    */     //   559: invokestatic b : (JDD)Z
/*    */     //   562: goto -> 575
/*    */     //   565: ldc2_w 5224542259650852538
/*    */     //   568: lload_2
/*    */     //   569: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   574: athrow
/*    */     //   575: aload #33
/*    */     //   577: ifnull -> 643
/*    */     //   580: ifeq -> 668
/*    */     //   583: goto -> 596
/*    */     //   586: ldc2_w 5224542259650852538
/*    */     //   589: lload_2
/*    */     //   590: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   595: athrow
/*    */     //   596: aload #34
/*    */     //   598: iload #28
/*    */     //   600: iload #29
/*    */     //   602: i2s
/*    */     //   603: iload #30
/*    */     //   605: i2s
/*    */     //   606: invokeinterface f : (ISS)D
/*    */     //   611: lload #21
/*    */     //   613: dup2_x2
/*    */     //   614: pop2
/*    */     //   615: aload_0
/*    */     //   616: iload #18
/*    */     //   618: iload #19
/*    */     //   620: i2s
/*    */     //   621: iload #20
/*    */     //   623: i2s
/*    */     //   624: invokevirtual f : (ISS)D
/*    */     //   627: invokestatic b : (JDD)Z
/*    */     //   630: goto -> 643
/*    */     //   633: ldc2_w 5224542259650852538
/*    */     //   636: lload_2
/*    */     //   637: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   642: athrow
/*    */     //   643: aload #33
/*    */     //   645: ifnull -> 665
/*    */     //   648: ifeq -> 668
/*    */     //   651: goto -> 664
/*    */     //   654: ldc2_w 5224542259650852538
/*    */     //   657: lload_2
/*    */     //   658: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   663: athrow
/*    */     //   664: iconst_1
/*    */     //   665: goto -> 669
/*    */     //   668: iconst_0
/*    */     //   669: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 235
/*    */     //   #19	-> 258
/*    */     //   #43	-> 270
/*    */     //   #13	-> 295
/*    */     //   #9	-> 307
/*    */     //   #37	-> 313
/*    */     //   #22	-> 370
/*    */     //   #41	-> 426
/*    */     //   #40	-> 482
/*    */     //   #11	-> 542
/*    */     //   #34	-> 598
/*    */     //   #2	-> 669
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   235	245	248	aacinternal/v
/*    */     //   241	260	260	aacinternal/v
/*    */     //   271	282	285	aacinternal/v
/*    */     //   276	297	297	aacinternal/v
/*    */     //   313	355	358	aacinternal/v
/*    */     //   352	390	393	aacinternal/v
/*    */     //   403	411	414	aacinternal/v
/*    */     //   408	446	449	aacinternal/v
/*    */     //   459	467	470	aacinternal/v
/*    */     //   464	506	509	aacinternal/v
/*    */     //   519	527	530	aacinternal/v
/*    */     //   524	562	565	aacinternal/v
/*    */     //   575	583	586	aacinternal/v
/*    */     //   580	630	633	aacinternal/v
/*    */     //   643	651	654	aacinternal/v }
/* 44 */   public double f(int paramInt, short paramShort1, short paramShort2) { return this.b; }
/*    */ 
/*    */   
/*    */   static {
/*    */     long l = g ^ 0x4FC6A5DC4C1CL;
/*    */     "ꢙ糂碲?쑣ꍻ普ꋪ睺ꆦߪӓ뚰ꢡ곁퓨嗖隙晉".toCharArray()[19] = (char)("ꢙ糂碲?쑣ꍻ普ꋪ睺ꆦߪӓ뚰ꢡ곁퓨嗖隙晉".toCharArray()[19] ^ 0x1219);
/*    */     "菩ꚕ㴏".toCharArray()[0] = (char)("菩ꚕ㴏".toCharArray()[0] ^ 0x1257);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(aB$aG.q("ꢙ糂碲?쑣ꍻ普ꋪ睺ꆦߪӓ뚰ꢡ곁퓨嗖隙晉".toCharArray(), (short)16656, (byte)2, (byte)3))).init(2, SecretKeyFactory.getInstance(aB$aG.q("菩ꚕ㴏".toCharArray(), (short)8179, (byte)4, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[8];
/*    */     boolean bool = false;
/*    */     "୛賅磁ᑫ悪갂쁔䇸滉夋콰ઊ伥덊ᅖ꣞̘⭯㰧Ｌ酐ຑ?萵⾣ጮ졨ඳ셡ㄮ줇䂕뎏埰醝춛ཽڻ銣왤቗脀吸쏀ᢿ⮁쎹욁օ느蟅穫刺髈丕Ⓛ腇⦼૔↋僅諴띻⥡棡乕㈼辒똒哈숕ᾑ辖᷑嬻飻ⅈ命㫥ㄋ熜ॏ맙닯迨ᵱ䪛㬔嚰⚳썽楥嶈썇㉾ȳ鰡?歂㺈▯㋱抂腹䀕坰?⧙汨늦熥칒⽓炢ງ恖쥧ឺ翪Ȍ씃Ѷ䶖噸❓霰り堈䧅蕒칃ầ▄케꠺෣磻󴴭걸ལ".toCharArray()[75] = (char)("୛賅磁ᑫ悪갂쁔䇸滉夋콰ઊ伥덊ᅖ꣞̘⭯㰧Ｌ酐ຑ?萵⾣ጮ졨ඳ셡ㄮ줇䂕뎏埰醝춛ཽڻ銣왤቗脀吸쏀ᢿ⮁쎹욁օ느蟅穫刺髈丕Ⓛ腇⦼૔↋僅諴띻⥡棡乕㈼辒똒哈숕ᾑ辖᷑嬻飻ⅈ命㫥ㄋ熜ॏ맙닯迨ᵱ䪛㬔嚰⚳썽楥嶈썇㉾ȳ鰡?歂㺈▯㋱抂腹䀕坰?⧙汨늦熥칒⽓炢ງ恖쥧ឺ翪Ȍ씃Ѷ䶖噸❓霰り堈䧅蕒칃ầ▄케꠺෣磻󴴭걸ལ".toCharArray()[75] ^ 0x7A78);
/*    */     String str;
/*    */     int i = (str = aB$aG.q("୛賅磁ᑫ悪갂쁔䇸滉夋콰ઊ伥덊ᅖ꣞̘⭯㰧Ｌ酐ຑ?萵⾣ጮ졨ඳ셡ㄮ줇䂕뎏埰醝춛ཽڻ銣왤቗脀吸쏀ᢿ⮁쎹욁օ느蟅穫刺髈丕Ⓛ腇⦼૔↋僅諴띻⥡棡乕㈼辒똒哈숕ᾑ辖᷑嬻飻ⅈ命㫥ㄋ熜ॏ맙닯迨ᵱ䪛㬔嚰⚳썽楥嶈썇㉾ȳ鰡?歂㺈▯㋱抂腹䀕坰?⧙汨늦熥칒⽓炢ງ恖쥧ឺ翪Ȍ씃Ѷ䶖噸❓霰り堈䧅蕒칃ầ▄케꠺෣磻󴴭걸ལ".toCharArray(), (short)7856, (byte)4, (byte)1)).length();
/*    */     byte b2 = 48;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6D2;
/*    */     if (i[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])j.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "?姄婼纍但볌㌄詘䅓려鵃䎆희蘑ࢽ㱸㶔鹤⥦猀".toCharArray()[12] = (char)("?姄婼纍但볌㌄詘䅓려鵃䎆희蘑ࢽ㱸㶔鹤⥦猀".toCharArray()[12] ^ 0x6FB6);
/*    */           arrayOfObject[0] = Cipher.getInstance(D$X.L("?姄婼纍但볌㌄詘䅓려鵃䎆희蘑ࢽ㱸㶔鹤⥦猀".toCharArray(), (short)638, (byte)2, true));
/*    */           "㭅᯶즳䠫".toCharArray()[0] = (char)("㭅᯶즳䠫".toCharArray()[0] ^ 0x5AD7);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(D$X.L("㭅᯶즳䠫".toCharArray(), (short)14577, (byte)3, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           j.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "⟢瞔ヹ蛐쿽랞〻胖벣뾟Ⅴ掙檨は".toCharArray()[13] = (char)("⟢瞔ヹ蛐쿽랞〻胖벣뾟Ⅴ掙檨は".toCharArray()[13] ^ 0x5907);
/*    */         throw new RuntimeException(D$X.L("⟢瞔ヹ蛐쿽랞〻胖벣뾟Ⅴ掙檨は".toCharArray(), (short)28444, (byte)0, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "뾲짔잍色?他孖᧹⑷儧".toCharArray()[1] = (char)("뾲짔잍色?他孖᧹⑷儧".toCharArray()[1] ^ 0x448E);
/*    */       byte[] arrayOfByte2 = h[i].getBytes(D$X.L("뾲짔잍色?他孖᧹⑷儧".toCharArray(), (short)25618, (byte)4, true));
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
/*    */     //   66: ldc_w 'ਇ燎랑旊ᜦ齨ꞙ↥摬蓬★듪笲'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #13
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #32633
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #17278
/*    */     //   87: iconst_2
/*    */     //   88: iconst_1
/*    */     //   89: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '夾즂닜♕'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_0
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #14860
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #5395
/*    */     //   115: iconst_1
/*    */     //   116: iconst_0
/*    */     //   117: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '뉒殄ꈆ⇕'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_0
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #29891
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #14798
/*    */     //   147: iconst_3
/*    */     //   148: iconst_3
/*    */     //   149: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
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
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */