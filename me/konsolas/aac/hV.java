/*    */ package me.konsolas.aac;public class hv {
/*    */   private static lq e(kP paramkP, lq paramlq) {
/*  3 */     double d = 0.0625D;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 51 */     return paramlq.a(paramlq.e() + d);
/*    */   }
/*    */   
/*    */   private static final Material a;
/*    */   private static final long b;
/*    */   private static final String[] c;
/*    */   private static final String[] d;
/*    */   private static final Map e;
/*    */   
/*    */   private static lq b(kP paramkP, long paramLong, lq paramlq) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hv.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 28829143100521
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -1584914778555636732
/*    */     //   18: lload_1
/*    */     //   19: <illegal opcode> w : (JJ)I
/*    */     //   24: istore #6
/*    */     //   26: aload_0
/*    */     //   27: lload #4
/*    */     //   29: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   32: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   35: ifeq -> 54
/*    */     //   38: ldc2_w 0.9375
/*    */     //   41: lload_1
/*    */     //   42: lconst_0
/*    */     //   43: lcmp
/*    */     //   44: ifle -> 55
/*    */     //   47: dstore #7
/*    */     //   49: iload #6
/*    */     //   51: ifeq -> 57
/*    */     //   54: dconst_1
/*    */     //   55: dstore #7
/*    */     //   57: aload_3
/*    */     //   58: aload_3
/*    */     //   59: invokevirtual e : ()D
/*    */     //   62: dload #7
/*    */     //   64: dadd
/*    */     //   65: invokevirtual a : (D)Lme/konsolas/aac/lq;
/*    */     //   68: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 26
/*    */     //   #14	-> 38
/*    */     //   #17	-> 54
/*    */     //   #47	-> 57
/*    */   }
/*    */   
/*    */   private static lq d(kP paramkP, int paramInt, lq paramlq, char paramChar, short paramShort) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic me/konsolas/aac/hv.b : J
/*    */     //   27: lxor
/*    */     //   28: lstore #5
/*    */     //   30: lload #5
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 70207316727286
/*    */     //   36: lxor
/*    */     //   37: lstore #7
/*    */     //   39: dup2
/*    */     //   40: ldc2_w 140247236630733
/*    */     //   43: lxor
/*    */     //   44: lstore #9
/*    */     //   46: pop2
/*    */     //   47: ldc2_w 1428306471542532070
/*    */     //   50: lload #5
/*    */     //   52: <illegal opcode> w : (JJ)I
/*    */     //   57: istore #11
/*    */     //   59: aload_0
/*    */     //   60: lload #7
/*    */     //   62: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   65: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   68: ifeq -> 85
/*    */     //   71: ldc2_w 0.1875
/*    */     //   74: dstore #12
/*    */     //   76: iload #11
/*    */     //   78: iload_1
/*    */     //   79: iflt -> 99
/*    */     //   82: ifne -> 90
/*    */     //   85: ldc2_w 0.125
/*    */     //   88: dstore #12
/*    */     //   90: aload_2
/*    */     //   91: invokevirtual c : ()D
/*    */     //   94: lload #9
/*    */     //   96: invokestatic a : (DJ)Z
/*    */     //   99: iload #11
/*    */     //   101: iload #4
/*    */     //   103: ifge -> 160
/*    */     //   106: ifeq -> 158
/*    */     //   109: ifeq -> 149
/*    */     //   112: goto -> 126
/*    */     //   115: ldc2_w 1396394401812213834
/*    */     //   118: lload #5
/*    */     //   120: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   125: athrow
/*    */     //   126: aload_2
/*    */     //   127: aload_2
/*    */     //   128: invokevirtual b : ()D
/*    */     //   131: dload #12
/*    */     //   133: dsub
/*    */     //   134: invokevirtual e : (D)Lme/konsolas/aac/lq;
/*    */     //   137: areturn
/*    */     //   138: ldc2_w 1396394401812213834
/*    */     //   141: lload #5
/*    */     //   143: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   148: athrow
/*    */     //   149: aload_2
/*    */     //   150: invokevirtual d : ()D
/*    */     //   153: lload #9
/*    */     //   155: invokestatic a : (DJ)Z
/*    */     //   158: iload #11
/*    */     //   160: iload_3
/*    */     //   161: ifle -> 222
/*    */     //   164: ifeq -> 216
/*    */     //   167: ifeq -> 207
/*    */     //   170: goto -> 184
/*    */     //   173: ldc2_w 1396394401812213834
/*    */     //   176: lload #5
/*    */     //   178: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   183: athrow
/*    */     //   184: aload_2
/*    */     //   185: aload_2
/*    */     //   186: invokevirtual f : ()D
/*    */     //   189: dload #12
/*    */     //   191: dsub
/*    */     //   192: invokevirtual f : (D)Lme/konsolas/aac/lq;
/*    */     //   195: areturn
/*    */     //   196: ldc2_w 1396394401812213834
/*    */     //   199: lload #5
/*    */     //   201: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   206: athrow
/*    */     //   207: aload_2
/*    */     //   208: invokevirtual b : ()D
/*    */     //   211: lload #9
/*    */     //   213: invokestatic a : (DJ)Z
/*    */     //   216: iload_3
/*    */     //   217: ifle -> 293
/*    */     //   220: iload #11
/*    */     //   222: ifeq -> 293
/*    */     //   225: ifeq -> 265
/*    */     //   228: goto -> 242
/*    */     //   231: ldc2_w 1396394401812213834
/*    */     //   234: lload #5
/*    */     //   236: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   241: athrow
/*    */     //   242: aload_2
/*    */     //   243: aload_2
/*    */     //   244: invokevirtual c : ()D
/*    */     //   247: dload #12
/*    */     //   249: dadd
/*    */     //   250: invokevirtual d : (D)Lme/konsolas/aac/lq;
/*    */     //   253: areturn
/*    */     //   254: ldc2_w 1396394401812213834
/*    */     //   257: lload #5
/*    */     //   259: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   264: athrow
/*    */     //   265: aload_2
/*    */     //   266: iload #11
/*    */     //   268: ifeq -> 321
/*    */     //   271: invokevirtual f : ()D
/*    */     //   274: lload #9
/*    */     //   276: invokestatic a : (DJ)Z
/*    */     //   279: goto -> 293
/*    */     //   282: ldc2_w 1396394401812213834
/*    */     //   285: lload #5
/*    */     //   287: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   292: athrow
/*    */     //   293: ifeq -> 322
/*    */     //   296: aload_2
/*    */     //   297: aload_2
/*    */     //   298: invokevirtual d : ()D
/*    */     //   301: dload #12
/*    */     //   303: dadd
/*    */     //   304: invokevirtual c : (D)Lme/konsolas/aac/lq;
/*    */     //   307: goto -> 321
/*    */     //   310: ldc2_w 1396394401812213834
/*    */     //   313: lload #5
/*    */     //   315: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   320: athrow
/*    */     //   321: areturn
/*    */     //   322: new java/lang/IllegalArgumentException
/*    */     //   325: dup
/*    */     //   326: new java/lang/StringBuilder
/*    */     //   329: dup
/*    */     //   330: invokespecial <init> : ()V
/*    */     //   333: sipush #10997
/*    */     //   336: ldc2_w 1804238554091272005
/*    */     //   339: lload #5
/*    */     //   341: lxor
/*    */     //   342: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   347: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   350: aload_2
/*    */     //   351: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   354: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   357: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   360: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 59
/*    */     //   #24	-> 71
/*    */     //   #30	-> 85
/*    */     //   #39	-> 90
/*    */     //   #50	-> 126
/*    */     //   #43	-> 149
/*    */     //   #63	-> 184
/*    */     //   #25	-> 207
/*    */     //   #37	-> 242
/*    */     //   #19	-> 265
/*    */     //   #2	-> 296
/*    */     //   #59	-> 322
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   90	112	115	java/lang/IllegalArgumentException
/*    */     //   109	138	138	java/lang/IllegalArgumentException
/*    */     //   158	170	173	java/lang/IllegalArgumentException
/*    */     //   167	196	196	java/lang/IllegalArgumentException
/*    */     //   216	228	231	java/lang/IllegalArgumentException
/*    */     //   225	254	254	java/lang/IllegalArgumentException
/*    */     //   265	279	282	java/lang/IllegalArgumentException
/*    */     //   293	307	310	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static lq f(kP paramkP, lq paramlq, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hv.b : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 119559820732942
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w 7810990950269657699
/*    */     //   18: lload_2
/*    */     //   19: <illegal opcode> w : (JJ)I
/*    */     //   24: istore #6
/*    */     //   26: aload_0
/*    */     //   27: lload #4
/*    */     //   29: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   32: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   35: ifeq -> 59
/*    */     //   38: ldc2_w 0.09375
/*    */     //   41: dstore #7
/*    */     //   43: ldc2_w 0.0625
/*    */     //   46: dstore #9
/*    */     //   48: lload_2
/*    */     //   49: lconst_0
/*    */     //   50: lcmp
/*    */     //   51: iflt -> 64
/*    */     //   54: iload #6
/*    */     //   56: ifeq -> 67
/*    */     //   59: ldc2_w 0.015625
/*    */     //   62: dstore #7
/*    */     //   64: dconst_0
/*    */     //   65: dstore #9
/*    */     //   67: new me/konsolas/aac/lq
/*    */     //   70: dup
/*    */     //   71: aload_1
/*    */     //   72: invokevirtual c : ()D
/*    */     //   75: invokestatic floor : (D)D
/*    */     //   78: dload #9
/*    */     //   80: dadd
/*    */     //   81: aload_1
/*    */     //   82: invokevirtual e : ()D
/*    */     //   85: aload_1
/*    */     //   86: invokevirtual d : ()D
/*    */     //   89: invokestatic floor : (D)D
/*    */     //   92: dload #9
/*    */     //   94: dadd
/*    */     //   95: aload_1
/*    */     //   96: invokevirtual b : ()D
/*    */     //   99: invokestatic ceil : (D)D
/*    */     //   102: dload #9
/*    */     //   104: dsub
/*    */     //   105: aload_1
/*    */     //   106: invokevirtual e : ()D
/*    */     //   109: dload #7
/*    */     //   111: dadd
/*    */     //   112: aload_1
/*    */     //   113: invokevirtual f : ()D
/*    */     //   116: invokestatic ceil : (D)D
/*    */     //   119: dload #9
/*    */     //   121: dsub
/*    */     //   122: invokespecial <init> : (DDDDDD)V
/*    */     //   125: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 26
/*    */     //   #52	-> 38
/*    */     //   #62	-> 43
/*    */     //   #36	-> 59
/*    */     //   #9	-> 64
/*    */     //   #31	-> 67
/*    */     //   #32	-> 72
/*    */     //   #13	-> 82
/*    */     //   #34	-> 86
/*    */     //   #5	-> 96
/*    */     //   #61	-> 106
/*    */     //   #66	-> 113
/*    */     //   #58	-> 125
/*    */   }
/*    */   
/*    */   public static lq a(kP paramkP, lq paramlq, Material paramMaterial, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hv.b : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: lload_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 7327644853893
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 73430779029501
/*    */     //   18: lxor
/*    */     //   19: lstore #7
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 76210705173454
/*    */     //   25: lxor
/*    */     //   26: lstore #9
/*    */     //   28: dup2
/*    */     //   29: ldc2_w 56991237213609
/*    */     //   32: lxor
/*    */     //   33: lstore #11
/*    */     //   35: dup2
/*    */     //   36: ldc2_w 106317972468305
/*    */     //   39: lxor
/*    */     //   40: dup2
/*    */     //   41: bipush #32
/*    */     //   43: lushr
/*    */     //   44: l2i
/*    */     //   45: istore #13
/*    */     //   47: dup2
/*    */     //   48: bipush #32
/*    */     //   50: lshl
/*    */     //   51: bipush #48
/*    */     //   53: lushr
/*    */     //   54: l2i
/*    */     //   55: istore #14
/*    */     //   57: dup2
/*    */     //   58: bipush #48
/*    */     //   60: lshl
/*    */     //   61: bipush #48
/*    */     //   63: lushr
/*    */     //   64: l2i
/*    */     //   65: istore #15
/*    */     //   67: pop2
/*    */     //   68: pop2
/*    */     //   69: ldc2_w -6850717247878271256
/*    */     //   72: lload_3
/*    */     //   73: <illegal opcode> w : (JJ)I
/*    */     //   78: istore #16
/*    */     //   80: aload_2
/*    */     //   81: getstatic org/bukkit/Material.LADDER : Lorg/bukkit/Material;
/*    */     //   84: iload #16
/*    */     //   86: ifne -> 145
/*    */     //   89: if_acmpne -> 125
/*    */     //   92: goto -> 105
/*    */     //   95: ldc2_w -6911965227452218567
/*    */     //   98: lload_3
/*    */     //   99: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   104: athrow
/*    */     //   105: aload_0
/*    */     //   106: iload #13
/*    */     //   108: aload_1
/*    */     //   109: iload #14
/*    */     //   111: i2c
/*    */     //   112: iload #15
/*    */     //   114: i2s
/*    */     //   115: invokestatic d : (Lme/konsolas/aac/kP;ILme/konsolas/aac/lq;CS)Lme/konsolas/aac/lq;
/*    */     //   118: astore #17
/*    */     //   120: iload #16
/*    */     //   122: ifeq -> 454
/*    */     //   125: aload_2
/*    */     //   126: getstatic me/konsolas/aac/ei.LILY_PAD : Lme/konsolas/aac/ei;
/*    */     //   129: invokevirtual a : ()Lorg/bukkit/Material;
/*    */     //   132: goto -> 145
/*    */     //   135: ldc2_w -6911965227452218567
/*    */     //   138: lload_3
/*    */     //   139: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   144: athrow
/*    */     //   145: iload #16
/*    */     //   147: ifne -> 200
/*    */     //   150: if_acmpne -> 180
/*    */     //   153: goto -> 166
/*    */     //   156: ldc2_w -6911965227452218567
/*    */     //   159: lload_3
/*    */     //   160: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   165: athrow
/*    */     //   166: aload_0
/*    */     //   167: aload_1
/*    */     //   168: lload #11
/*    */     //   170: invokestatic f : (Lme/konsolas/aac/kP;Lme/konsolas/aac/lq;J)Lme/konsolas/aac/lq;
/*    */     //   173: astore #17
/*    */     //   175: iload #16
/*    */     //   177: ifeq -> 454
/*    */     //   180: aload_2
/*    */     //   181: getstatic me/konsolas/aac/ei.FARMLAND : Lme/konsolas/aac/ei;
/*    */     //   184: invokevirtual a : ()Lorg/bukkit/Material;
/*    */     //   187: goto -> 200
/*    */     //   190: ldc2_w -6911965227452218567
/*    */     //   193: lload_3
/*    */     //   194: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   199: athrow
/*    */     //   200: if_acmpne -> 223
/*    */     //   203: aload_0
/*    */     //   204: lload #9
/*    */     //   206: aload_1
/*    */     //   207: invokestatic b : (Lme/konsolas/aac/kP;JLme/konsolas/aac/lq;)Lme/konsolas/aac/lq;
/*    */     //   210: astore #17
/*    */     //   212: iload #16
/*    */     //   214: lload_3
/*    */     //   215: lconst_0
/*    */     //   216: lcmp
/*    */     //   217: ifle -> 232
/*    */     //   220: ifeq -> 454
/*    */     //   223: getstatic me/konsolas/aac/ei.CARPET : Ljava/util/Set;
/*    */     //   226: aload_2
/*    */     //   227: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   232: lload_3
/*    */     //   233: lconst_0
/*    */     //   234: lcmp
/*    */     //   235: iflt -> 314
/*    */     //   238: iload #16
/*    */     //   240: ifne -> 314
/*    */     //   243: goto -> 256
/*    */     //   246: ldc2_w -6911965227452218567
/*    */     //   249: lload_3
/*    */     //   250: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   255: athrow
/*    */     //   256: ifeq -> 290
/*    */     //   259: goto -> 272
/*    */     //   262: ldc2_w -6911965227452218567
/*    */     //   265: lload_3
/*    */     //   266: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   271: athrow
/*    */     //   272: aload_0
/*    */     //   273: aload_1
/*    */     //   274: invokestatic e : (Lme/konsolas/aac/kP;Lme/konsolas/aac/lq;)Lme/konsolas/aac/lq;
/*    */     //   277: astore #17
/*    */     //   279: iload #16
/*    */     //   281: lload_3
/*    */     //   282: lconst_0
/*    */     //   283: lcmp
/*    */     //   284: iflt -> 301
/*    */     //   287: ifeq -> 454
/*    */     //   290: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   293: lload #5
/*    */     //   295: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   298: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   301: goto -> 314
/*    */     //   304: ldc2_w -6911965227452218567
/*    */     //   307: lload_3
/*    */     //   308: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   313: athrow
/*    */     //   314: ifeq -> 375
/*    */     //   317: aload_2
/*    */     //   318: getstatic me/konsolas/aac/hv.a : Lorg/bukkit/Material;
/*    */     //   321: iload #16
/*    */     //   323: lload_3
/*    */     //   324: lconst_0
/*    */     //   325: lcmp
/*    */     //   326: ifle -> 394
/*    */     //   329: ifne -> 392
/*    */     //   332: goto -> 345
/*    */     //   335: ldc2_w -6911965227452218567
/*    */     //   338: lload_3
/*    */     //   339: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   344: athrow
/*    */     //   345: if_acmpne -> 375
/*    */     //   348: goto -> 361
/*    */     //   351: ldc2_w -6911965227452218567
/*    */     //   354: lload_3
/*    */     //   355: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   360: athrow
/*    */     //   361: aload_0
/*    */     //   362: lload #7
/*    */     //   364: aload_1
/*    */     //   365: invokestatic c : (Lme/konsolas/aac/kP;JLme/konsolas/aac/lq;)Lme/konsolas/aac/lq;
/*    */     //   368: astore #17
/*    */     //   370: iload #16
/*    */     //   372: ifeq -> 454
/*    */     //   375: aload_2
/*    */     //   376: getstatic org/bukkit/Material.CHEST : Lorg/bukkit/Material;
/*    */     //   379: goto -> 392
/*    */     //   382: ldc2_w -6911965227452218567
/*    */     //   385: lload_3
/*    */     //   386: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   391: athrow
/*    */     //   392: iload #16
/*    */     //   394: ifne -> 430
/*    */     //   397: if_acmpeq -> 433
/*    */     //   400: goto -> 413
/*    */     //   403: ldc2_w -6911965227452218567
/*    */     //   406: lload_3
/*    */     //   407: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   412: athrow
/*    */     //   413: aload_2
/*    */     //   414: getstatic org/bukkit/Material.TRAPPED_CHEST : Lorg/bukkit/Material;
/*    */     //   417: goto -> 430
/*    */     //   420: ldc2_w -6911965227452218567
/*    */     //   423: lload_3
/*    */     //   424: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   429: athrow
/*    */     //   430: if_acmpne -> 451
/*    */     //   433: aload_0
/*    */     //   434: aload_1
/*    */     //   435: invokestatic a : (Lme/konsolas/aac/kP;Lme/konsolas/aac/lq;)Lme/konsolas/aac/lq;
/*    */     //   438: lload_3
/*    */     //   439: lconst_0
/*    */     //   440: lcmp
/*    */     //   441: iflt -> 452
/*    */     //   444: astore #17
/*    */     //   446: iload #16
/*    */     //   448: ifeq -> 454
/*    */     //   451: aload_1
/*    */     //   452: astore #17
/*    */     //   454: aload #17
/*    */     //   456: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 80
/*    */     //   #7	-> 105
/*    */     //   #10	-> 125
/*    */     //   #64	-> 166
/*    */     //   #33	-> 180
/*    */     //   #60	-> 203
/*    */     //   #27	-> 223
/*    */     //   #49	-> 272
/*    */     //   #18	-> 290
/*    */     //   #44	-> 361
/*    */     //   #65	-> 375
/*    */     //   #42	-> 433
/*    */     //   #40	-> 451
/*    */     //   #8	-> 454
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   80	92	95	java/lang/IllegalArgumentException
/*    */     //   120	132	135	java/lang/IllegalArgumentException
/*    */     //   145	153	156	java/lang/IllegalArgumentException
/*    */     //   175	187	190	java/lang/IllegalArgumentException
/*    */     //   212	243	246	java/lang/IllegalArgumentException
/*    */     //   223	259	262	java/lang/IllegalArgumentException
/*    */     //   279	301	304	java/lang/IllegalArgumentException
/*    */     //   314	332	335	java/lang/IllegalArgumentException
/*    */     //   317	348	351	java/lang/IllegalArgumentException
/*    */     //   370	379	382	java/lang/IllegalArgumentException
/*    */     //   392	400	403	java/lang/IllegalArgumentException
/*    */     //   397	417	420	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public static List a(kP paramkP, ln paramln, long paramLong, List paramList) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hv.b : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 121392909597476
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: ldc2_w 6551448075182740718
/*    */     //   18: lload_2
/*    */     //   19: <illegal opcode> w : (JJ)I
/*    */     //   24: new java/util/ArrayList
/*    */     //   27: dup
/*    */     //   28: aload #4
/*    */     //   30: invokeinterface size : ()I
/*    */     //   35: invokespecial <init> : (I)V
/*    */     //   38: astore #8
/*    */     //   40: aload #4
/*    */     //   42: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   47: astore #9
/*    */     //   49: istore #7
/*    */     //   51: aload #9
/*    */     //   53: invokeinterface hasNext : ()Z
/*    */     //   58: ifeq -> 162
/*    */     //   61: aload #9
/*    */     //   63: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   68: checkcast me/konsolas/aac/lq
/*    */     //   71: astore #10
/*    */     //   73: aload_1
/*    */     //   74: aload #10
/*    */     //   76: invokevirtual c : ()D
/*    */     //   79: invokestatic floor : (D)I
/*    */     //   82: aload #10
/*    */     //   84: invokevirtual e : ()D
/*    */     //   87: invokestatic floor : (D)I
/*    */     //   90: aload #10
/*    */     //   92: invokevirtual d : ()D
/*    */     //   95: invokestatic floor : (D)I
/*    */     //   98: invokeinterface a : (III)Lorg/bukkit/Material;
/*    */     //   103: astore #11
/*    */     //   105: aload_0
/*    */     //   106: aload #10
/*    */     //   108: aload #11
/*    */     //   110: lload #5
/*    */     //   112: invokestatic a : (Lme/konsolas/aac/kP;Lme/konsolas/aac/lq;Lorg/bukkit/Material;J)Lme/konsolas/aac/lq;
/*    */     //   115: astore #12
/*    */     //   117: lload_2
/*    */     //   118: lconst_0
/*    */     //   119: lcmp
/*    */     //   120: ifle -> 138
/*    */     //   123: aload #8
/*    */     //   125: iload #7
/*    */     //   127: ifne -> 164
/*    */     //   130: aload #12
/*    */     //   132: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   137: pop
/*    */     //   138: iload #7
/*    */     //   140: ifeq -> 51
/*    */     //   143: lload_2
/*    */     //   144: lconst_0
/*    */     //   145: lcmp
/*    */     //   146: iflt -> 117
/*    */     //   149: goto -> 162
/*    */     //   152: ldc2_w 6491362283760269631
/*    */     //   155: lload_2
/*    */     //   156: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   161: athrow
/*    */     //   162: aload #8
/*    */     //   164: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #46	-> 24
/*    */     //   #26	-> 40
/*    */     //   #1	-> 73
/*    */     //   #29	-> 76
/*    */     //   #12	-> 84
/*    */     //   #16	-> 92
/*    */     //   #55	-> 98
/*    */     //   #21	-> 105
/*    */     //   #11	-> 117
/*    */     //   #57	-> 138
/*    */     //   #38	-> 162
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   117	143	152	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static lq a(kP paramkP, lq paramlq) {
/*    */     return paramlq;
/*    */   }
/*    */   
/*    */   private static lq c(kP paramkP, long paramLong, lq paramlq) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hv.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 32575475679322
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: aload_0
/*    */     //   16: lload #4
/*    */     //   18: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   21: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   24: ifeq -> 39
/*    */     //   27: aload_3
/*    */     //   28: areturn
/*    */     //   29: ldc2_w -8733360155869518362
/*    */     //   32: lload_1
/*    */     //   33: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   38: athrow
/*    */     //   39: aload_3
/*    */     //   40: aload_3
/*    */     //   41: invokevirtual e : ()D
/*    */     //   44: dconst_1
/*    */     //   45: dadd
/*    */     //   46: invokevirtual a : (D)Lme/konsolas/aac/lq;
/*    */     //   49: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #53	-> 15
/*    */     //   #28	-> 27
/*    */     //   #41	-> 39
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	29	29	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static boolean a(double paramDouble, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hv.b : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w -8485490450660344311
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore #4
/*    */     //   17: dload_0
/*    */     //   18: dload_0
/*    */     //   19: d2i
/*    */     //   20: i2d
/*    */     //   21: dcmpl
/*    */     //   22: iload #4
/*    */     //   24: ifeq -> 44
/*    */     //   27: ifeq -> 47
/*    */     //   30: goto -> 43
/*    */     //   33: ldc2_w -8462304377940940379
/*    */     //   36: lload_2
/*    */     //   37: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   42: athrow
/*    */     //   43: iconst_1
/*    */     //   44: goto -> 48
/*    */     //   47: iconst_0
/*    */     //   48: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 17
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	30	33	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -160950692824241186
/*    */     //   3: ldc2_w -5548839829820064088
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 106865724066711
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic me/konsolas/aac/hv.b : J
/*    */     //   26: getstatic me/konsolas/aac/hv.b : J
/*    */     //   29: ldc2_w 102457679872325
/*    */     //   32: lxor
/*    */     //   33: lstore #9
/*    */     //   35: lload #9
/*    */     //   37: dup2
/*    */     //   38: ldc2_w 25371995162475
/*    */     //   41: lxor
/*    */     //   42: lstore #11
/*    */     //   44: pop2
/*    */     //   45: new java/util/HashMap
/*    */     //   48: dup
/*    */     //   49: bipush #13
/*    */     //   51: invokespecial <init> : (I)V
/*    */     //   54: putstatic me/konsolas/aac/hv.e : Ljava/util/Map;
/*    */     //   57: ldc_w '펻孂鑠姂Ḳﻩዟ檑柪猓᜼＂⃒⾖൪왂໅盩'
/*    */     //   60: invokevirtual toCharArray : ()[C
/*    */     //   63: dup
/*    */     //   64: dup
/*    */     //   65: bipush #18
/*    */     //   67: dup_x1
/*    */     //   68: caload
/*    */     //   69: sipush #9203
/*    */     //   72: ixor
/*    */     //   73: i2c
/*    */     //   74: castore
/*    */     //   75: sipush #26635
/*    */     //   78: iconst_0
/*    */     //   79: iconst_0
/*    */     //   80: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   83: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*    */     //   86: dup
/*    */     //   87: astore_0
/*    */     //   88: iconst_2
/*    */     //   89: ldc_w '뻹㰚踻㩭'
/*    */     //   92: invokevirtual toCharArray : ()[C
/*    */     //   95: dup
/*    */     //   96: dup
/*    */     //   97: iconst_2
/*    */     //   98: dup_x1
/*    */     //   99: caload
/*    */     //   100: sipush #12846
/*    */     //   103: ixor
/*    */     //   104: i2c
/*    */     //   105: castore
/*    */     //   106: sipush #12131
/*    */     //   109: iconst_0
/*    */     //   110: iconst_3
/*    */     //   111: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
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
/*    */     //   185: iconst_2
/*    */     //   186: anewarray java/lang/String
/*    */     //   189: astore #7
/*    */     //   191: iconst_0
/*    */     //   192: istore #5
/*    */     //   194: ldc_w '꯴․菓ћ堚᪔菅덤髈阅뿟轕ﯰᕊꩲ縖釿⢞냟ਦ竧蒗鉴ቾڣ篈礅卑漼⩫츊֎낵䫑⽯睋৵儝ꃕ刡錁탥兤竩鹃⮧勜賜㲈᧰僙腀﫸凮뿍姘輞㽓양屡竦쾭몹㇩今평ࣆ'
/*    */     //   197: invokevirtual toCharArray : ()[C
/*    */     //   200: dup
/*    */     //   201: dup
/*    */     //   202: bipush #41
/*    */     //   204: dup_x1
/*    */     //   205: caload
/*    */     //   206: sipush #10332
/*    */     //   209: ixor
/*    */     //   210: i2c
/*    */     //   211: castore
/*    */     //   212: sipush #732
/*    */     //   215: iconst_0
/*    */     //   216: iconst_4
/*    */     //   217: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   220: dup
/*    */     //   221: astore #4
/*    */     //   223: invokevirtual length : ()I
/*    */     //   226: istore #6
/*    */     //   228: bipush #48
/*    */     //   230: istore_3
/*    */     //   231: iconst_m1
/*    */     //   232: istore_2
/*    */     //   233: iinc #2, 1
/*    */     //   236: aload #4
/*    */     //   238: iload_2
/*    */     //   239: dup
/*    */     //   240: iload_3
/*    */     //   241: iadd
/*    */     //   242: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   245: iconst_m1
/*    */     //   246: goto -> 294
/*    */     //   249: aload #7
/*    */     //   251: swap
/*    */     //   252: iload #5
/*    */     //   254: iinc #5, 1
/*    */     //   257: swap
/*    */     //   258: aastore
/*    */     //   259: iload_2
/*    */     //   260: iload_3
/*    */     //   261: iadd
/*    */     //   262: dup
/*    */     //   263: istore_2
/*    */     //   264: iload #6
/*    */     //   266: if_icmpge -> 279
/*    */     //   269: aload #4
/*    */     //   271: iload_2
/*    */     //   272: invokevirtual charAt : (I)C
/*    */     //   275: istore_3
/*    */     //   276: goto -> 233
/*    */     //   279: aload #7
/*    */     //   281: putstatic me/konsolas/aac/hv.c : [Ljava/lang/String;
/*    */     //   284: iconst_2
/*    */     //   285: anewarray java/lang/String
/*    */     //   288: putstatic me/konsolas/aac/hv.d : [Ljava/lang/String;
/*    */     //   291: goto -> 344
/*    */     //   294: swap
/*    */     //   295: ldc_w '驪龆౰ᷣⲪ썟僛衙᠗鷈š'
/*    */     //   298: invokevirtual toCharArray : ()[C
/*    */     //   301: dup
/*    */     //   302: dup
/*    */     //   303: bipush #8
/*    */     //   305: dup_x1
/*    */     //   306: caload
/*    */     //   307: sipush #32339
/*    */     //   310: ixor
/*    */     //   311: i2c
/*    */     //   312: castore
/*    */     //   313: sipush #28195
/*    */     //   316: iconst_1
/*    */     //   317: iconst_0
/*    */     //   318: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   321: invokevirtual getBytes : (Ljava/lang/String;)[B
/*    */     //   324: aload_0
/*    */     //   325: swap
/*    */     //   326: invokevirtual doFinal : ([B)[B
/*    */     //   329: astore #8
/*    */     //   331: aload #8
/*    */     //   333: invokestatic a : ([B)Ljava/lang/String;
/*    */     //   336: invokevirtual intern : ()Ljava/lang/String;
/*    */     //   339: swap
/*    */     //   340: pop
/*    */     //   341: goto -> 249
/*    */     //   344: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   347: lload #11
/*    */     //   349: getstatic me/konsolas/aac/kP.V1_17 : Lme/konsolas/aac/kP;
/*    */     //   352: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   355: ifeq -> 375
/*    */     //   358: getstatic org/bukkit/Material.DIRT_PATH : Lorg/bukkit/Material;
/*    */     //   361: goto -> 421
/*    */     //   364: ldc2_w -4468180482358336809
/*    */     //   367: lload #9
/*    */     //   369: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   374: athrow
/*    */     //   375: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   378: lload #11
/*    */     //   380: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   383: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   386: ifeq -> 420
/*    */     //   389: sipush #1104
/*    */     //   392: ldc2_w 4560147227293207420
/*    */     //   395: lload #9
/*    */     //   397: lxor
/*    */     //   398: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   403: invokestatic getMaterial : (Ljava/lang/String;)Lorg/bukkit/Material;
/*    */     //   406: goto -> 421
/*    */     //   409: ldc2_w -4468180482358336809
/*    */     //   412: lload #9
/*    */     //   414: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   419: athrow
/*    */     //   420: aconst_null
/*    */     //   421: putstatic me/konsolas/aac/hv.a : Lorg/bukkit/Material;
/*    */     //   424: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 344
/*    */     //   #22	-> 375
/*    */     //   #4	-> 420
/*    */     //   #54	-> 424
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   344	364	364	java/lang/IllegalArgumentException
/*    */     //   375	409	409	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xF4A;
/*    */     if (d[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])e.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "Ⱔǒႉ샔碻㎗洳닯嵟꒥粷이絠豸⩽꨽궃ᒬₚ".toCharArray()[11] = (char)("Ⱔǒႉ샔碻㎗洳닯嵟꒥粷이絠豸⩽꨽궃ᒬₚ".toCharArray()[11] ^ 0x6D8F);
/*    */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("Ⱔǒႉ샔碻㎗洳닯嵟꒥粷이絠豸⩽꨽궃ᒬₚ".toCharArray(), (short)17247, true, true));
/*    */           "༿䊨?䪧".toCharArray()[0] = (char)("༿䊨?䪧".toCharArray()[0] ^ 0x233);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("༿䊨?䪧".toCharArray(), (short)11107, false, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           e.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "帻힩玹智鏘ʏ眽嫎乧⳻ଯ䋦꩹哕ᦳ㣁諮ᑫ".toCharArray()[6] = (char)("帻힩玹智鏘ʏ眽嫎乧⳻ଯ䋦꩹哕ᦳ㣁諮ᑫ".toCharArray()[6] ^ 0x5D51);
/*    */         throw new RuntimeException(dP$dt.X("帻힩玹智鏘ʏ眽嫎乧⳻ଯ䋦꩹哕ᦳ㣁諮ᑫ".toCharArray(), (short)31880, true, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "卝襘軠舦⹌耠錐吲Ṩ".toCharArray()[3] = (char)("卝襘軠舦⹌耠錐吲Ṩ".toCharArray()[3] ^ 0x4EB0);
/*    */       byte[] arrayOfByte2 = c[i].getBytes(dP$dt.X("卝襘軠舦⹌耠錐吲Ṩ".toCharArray(), (short)21432, true, false));
/*    */       d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return d[i];
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
/*    */     //   66: ldc_w '讚셤ⵁ?ⴂ堍燵晗끀夞䡆忶염뵐䛠簾ǽ'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #8
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #24273
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #20438
/*    */     //   87: iconst_1
/*    */     //   88: iconst_1
/*    */     //   89: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '☎㉼㓻'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_1
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #31671
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #24227
/*    */     //   115: iconst_0
/*    */     //   116: iconst_1
/*    */     //   117: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '㥅뽫磌磨'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_1
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #2448
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #30189
/*    */     //   147: iconst_1
/*    */     //   148: iconst_0
/*    */     //   149: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */