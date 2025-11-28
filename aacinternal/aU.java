/*    */ package aacinternal;
/*    */ abstract class au implements aV {
/*    */   public void a(int paramInt, long paramLong) {
/*  4 */     long l = paramLong ^ 0x6A765C7D0854L; a(l, new int[] { paramInt });
/*    */   } public int a(int paramInt, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 53636308088801
/*    */     //   5: lxor
/*    */     //   6: dup2
/*    */     //   7: bipush #48
/*    */     //   9: lushr
/*    */     //   10: l2i
/*    */     //   11: istore #4
/*    */     //   13: dup2
/*    */     //   14: bipush #16
/*    */     //   16: lshl
/*    */     //   17: bipush #32
/*    */     //   19: lushr
/*    */     //   20: l2i
/*    */     //   21: istore #5
/*    */     //   23: dup2
/*    */     //   24: bipush #48
/*    */     //   26: lshl
/*    */     //   27: bipush #48
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #6
/*    */     //   33: pop2
/*    */     //   34: dup2
/*    */     //   35: ldc2_w 45896224236481
/*    */     //   38: lxor
/*    */     //   39: dup2
/*    */     //   40: bipush #48
/*    */     //   42: lushr
/*    */     //   43: l2i
/*    */     //   44: istore #7
/*    */     //   46: dup2
/*    */     //   47: bipush #16
/*    */     //   49: lshl
/*    */     //   50: bipush #32
/*    */     //   52: lushr
/*    */     //   53: l2i
/*    */     //   54: istore #8
/*    */     //   56: dup2
/*    */     //   57: bipush #48
/*    */     //   59: lshl
/*    */     //   60: bipush #48
/*    */     //   62: lushr
/*    */     //   63: l2i
/*    */     //   64: istore #9
/*    */     //   66: pop2
/*    */     //   67: pop2
/*    */     //   68: ldc2_w 4337049402986185581
/*    */     //   71: lload_2
/*    */     //   72: <illegal opcode> w : (JJ)I
/*    */     //   77: istore #10
/*    */     //   79: iload_1
/*    */     //   80: iload #10
/*    */     //   82: ifeq -> 152
/*    */     //   85: ifgt -> 148
/*    */     //   88: goto -> 101
/*    */     //   91: ldc2_w 4465435967058410034
/*    */     //   94: lload_2
/*    */     //   95: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   100: athrow
/*    */     //   101: new aacinternal/v
/*    */     //   104: dup
/*    */     //   105: getstatic aacinternal/P.NUMBER_TOO_SMALL_BOUND_EXCLUDED : Laacinternal/P;
/*    */     //   108: iconst_2
/*    */     //   109: anewarray java/lang/Object
/*    */     //   112: dup
/*    */     //   113: iconst_0
/*    */     //   114: iload_1
/*    */     //   115: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   118: aastore
/*    */     //   119: dup
/*    */     //   120: iconst_1
/*    */     //   121: iconst_0
/*    */     //   122: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   125: aastore
/*    */     //   126: iload #4
/*    */     //   128: i2s
/*    */     //   129: iload #5
/*    */     //   131: iload #6
/*    */     //   133: i2s
/*    */     //   134: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   137: athrow
/*    */     //   138: ldc2_w 4465435967058410034
/*    */     //   141: lload_2
/*    */     //   142: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   147: athrow
/*    */     //   148: iload_1
/*    */     //   149: iload_1
/*    */     //   150: ineg
/*    */     //   151: iand
/*    */     //   152: lload_2
/*    */     //   153: lconst_0
/*    */     //   154: lcmp
/*    */     //   155: ifle -> 227
/*    */     //   158: iload_1
/*    */     //   159: iload #10
/*    */     //   161: ifeq -> 226
/*    */     //   164: if_icmpne -> 213
/*    */     //   167: goto -> 180
/*    */     //   170: ldc2_w 4465435967058410034
/*    */     //   173: lload_2
/*    */     //   174: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   179: athrow
/*    */     //   180: iload_1
/*    */     //   181: i2l
/*    */     //   182: aload_0
/*    */     //   183: iload #7
/*    */     //   185: i2s
/*    */     //   186: iload #8
/*    */     //   188: iload #9
/*    */     //   190: i2s
/*    */     //   191: invokevirtual a : (SIS)I
/*    */     //   194: iconst_1
/*    */     //   195: iushr
/*    */     //   196: i2l
/*    */     //   197: lmul
/*    */     //   198: bipush #31
/*    */     //   200: lshr
/*    */     //   201: l2i
/*    */     //   202: ireturn
/*    */     //   203: ldc2_w 4465435967058410034
/*    */     //   206: lload_2
/*    */     //   207: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   212: athrow
/*    */     //   213: aload_0
/*    */     //   214: iload #7
/*    */     //   216: i2s
/*    */     //   217: iload #8
/*    */     //   219: iload #9
/*    */     //   221: i2s
/*    */     //   222: invokevirtual a : (SIS)I
/*    */     //   225: iconst_1
/*    */     //   226: iushr
/*    */     //   227: istore #11
/*    */     //   229: iload #11
/*    */     //   231: iload_1
/*    */     //   232: irem
/*    */     //   233: istore #12
/*    */     //   235: iload #11
/*    */     //   237: iload #12
/*    */     //   239: isub
/*    */     //   240: iload_1
/*    */     //   241: iconst_1
/*    */     //   242: isub
/*    */     //   243: iadd
/*    */     //   244: iflt -> 213
/*    */     //   247: iload #12
/*    */     //   249: iload #10
/*    */     //   251: lload_2
/*    */     //   252: lconst_0
/*    */     //   253: lcmp
/*    */     //   254: ifle -> 243
/*    */     //   257: ifeq -> 244
/*    */     //   260: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #3	-> 79
/*    */     //   #5	-> 101
/*    */     //   #1	-> 115
/*    */     //   #17	-> 148
/*    */     //   #20	-> 180
/*    */     //   #15	-> 213
/*    */     //   #33	-> 229
/*    */     //   #22	-> 235
/*    */     //   #6	-> 247
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   79	88	91	java/lang/IllegalArgumentException
/*    */     //   85	138	138	java/lang/IllegalArgumentException
/*    */     //   152	167	170	java/lang/IllegalArgumentException
/*    */     //   164	203	203	java/lang/IllegalArgumentException
/*    */   }
/*    */   public long a(long paramLong1, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 32478343801263
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 126870901319341
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #48
/*    */     //   16: lushr
/*    */     //   17: l2i
/*    */     //   18: istore #7
/*    */     //   20: dup2
/*    */     //   21: bipush #16
/*    */     //   23: lshl
/*    */     //   24: bipush #32
/*    */     //   26: lushr
/*    */     //   27: l2i
/*    */     //   28: istore #8
/*    */     //   30: dup2
/*    */     //   31: bipush #48
/*    */     //   33: lshl
/*    */     //   34: bipush #48
/*    */     //   36: lushr
/*    */     //   37: l2i
/*    */     //   38: istore #9
/*    */     //   40: pop2
/*    */     //   41: pop2
/*    */     //   42: ldc2_w 7915737142306391497
/*    */     //   45: lload_3
/*    */     //   46: <illegal opcode> w : (JJ)I
/*    */     //   51: istore #10
/*    */     //   53: lload_1
/*    */     //   54: iload #10
/*    */     //   56: ifne -> 132
/*    */     //   59: lconst_0
/*    */     //   60: lcmp
/*    */     //   61: ifgt -> 124
/*    */     //   64: goto -> 77
/*    */     //   67: ldc2_w 7832931767602555774
/*    */     //   70: lload_3
/*    */     //   71: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   76: athrow
/*    */     //   77: new aacinternal/v
/*    */     //   80: dup
/*    */     //   81: getstatic aacinternal/P.NUMBER_TOO_SMALL_BOUND_EXCLUDED : Laacinternal/P;
/*    */     //   84: iconst_2
/*    */     //   85: anewarray java/lang/Object
/*    */     //   88: dup
/*    */     //   89: iconst_0
/*    */     //   90: lload_1
/*    */     //   91: invokestatic valueOf : (J)Ljava/lang/Long;
/*    */     //   94: aastore
/*    */     //   95: dup
/*    */     //   96: iconst_1
/*    */     //   97: iconst_0
/*    */     //   98: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   101: aastore
/*    */     //   102: iload #7
/*    */     //   104: i2s
/*    */     //   105: iload #8
/*    */     //   107: iload #9
/*    */     //   109: i2s
/*    */     //   110: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   113: athrow
/*    */     //   114: ldc2_w 7832931767602555774
/*    */     //   117: lload_3
/*    */     //   118: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   123: athrow
/*    */     //   124: aload_0
/*    */     //   125: lload #5
/*    */     //   127: invokevirtual a : (J)J
/*    */     //   130: iconst_1
/*    */     //   131: lushr
/*    */     //   132: lstore #11
/*    */     //   134: lload #11
/*    */     //   136: lload_1
/*    */     //   137: lrem
/*    */     //   138: lstore #13
/*    */     //   140: lload #11
/*    */     //   142: lload #13
/*    */     //   144: lsub
/*    */     //   145: lload_1
/*    */     //   146: lconst_1
/*    */     //   147: lsub
/*    */     //   148: ladd
/*    */     //   149: lconst_0
/*    */     //   150: lcmp
/*    */     //   151: iflt -> 124
/*    */     //   154: lload #13
/*    */     //   156: lload_3
/*    */     //   157: lconst_0
/*    */     //   158: lcmp
/*    */     //   159: iflt -> 145
/*    */     //   162: iload #10
/*    */     //   164: ifne -> 149
/*    */     //   167: lload_3
/*    */     //   168: lconst_0
/*    */     //   169: lcmp
/*    */     //   170: iflt -> 162
/*    */     //   173: ldc2_w 7870609807136598425
/*    */     //   176: lload_3
/*    */     //   177: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   182: ifnull -> 212
/*    */     //   185: iinc #10, 1
/*    */     //   188: iload #10
/*    */     //   190: ldc2_w 7870937815693875960
/*    */     //   193: lload_3
/*    */     //   194: <illegal opcode> w : (IJJ)V
/*    */     //   199: goto -> 212
/*    */     //   202: ldc2_w 7832931767602555774
/*    */     //   205: lload_3
/*    */     //   206: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   211: athrow
/*    */     //   212: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 53
/*    */     //   #29	-> 77
/*    */     //   #32	-> 91
/*    */     //   #8	-> 124
/*    */     //   #25	-> 134
/*    */     //   #27	-> 140
/*    */     //   #11	-> 154
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   53	64	67	java/lang/IllegalArgumentException
/*    */     //   59	114	114	java/lang/IllegalArgumentException
/*    */     //   167	199	202	java/lang/IllegalArgumentException
/*    */   }
/*    */   public String toString() {
/* 12 */     return getClass().getName();
/*    */   }
/*    */ 
/*    */   
/* 16 */   private double a = Double.NaN;
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(long paramLong1, long paramLong2) {
/* 21 */     long l = paramLong2 ^ 0x5B9A14AFE2FAL; a(l, new int[] { (int)(paramLong1 >>> 32L), (int)(paramLong1 & 0xFFFFFFFFL) });
/*    */   }
/*    */   protected void a() {
/* 24 */     this.a = Double.NaN;
/*    */   }
/*    */   
/*    */   public double a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 51298168494248
/*    */     //   5: lxor
/*    */     //   6: lstore_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 137943689954638
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 11743568933900
/*    */     //   18: lxor
/*    */     //   19: dup2
/*    */     //   20: bipush #32
/*    */     //   22: lushr
/*    */     //   23: l2i
/*    */     //   24: istore #7
/*    */     //   26: dup2
/*    */     //   27: bipush #32
/*    */     //   29: lshl
/*    */     //   30: bipush #48
/*    */     //   32: lushr
/*    */     //   33: l2i
/*    */     //   34: istore #8
/*    */     //   36: dup2
/*    */     //   37: bipush #48
/*    */     //   39: lshl
/*    */     //   40: bipush #48
/*    */     //   42: lushr
/*    */     //   43: l2i
/*    */     //   44: istore #9
/*    */     //   46: pop2
/*    */     //   47: dup2
/*    */     //   48: ldc2_w 85822044268039
/*    */     //   51: lxor
/*    */     //   52: lstore #10
/*    */     //   54: pop2
/*    */     //   55: ldc2_w 1010845873456410970
/*    */     //   58: lload_1
/*    */     //   59: <illegal opcode> w : (JJ)I
/*    */     //   64: istore #12
/*    */     //   66: aload_0
/*    */     //   67: getfield a : D
/*    */     //   70: iload #12
/*    */     //   72: ifeq -> 190
/*    */     //   75: invokestatic isNaN : (D)Z
/*    */     //   78: ifeq -> 173
/*    */     //   81: goto -> 94
/*    */     //   84: ldc2_w 1139164248480598021
/*    */     //   87: lload_1
/*    */     //   88: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   93: athrow
/*    */     //   94: aload_0
/*    */     //   95: lload_3
/*    */     //   96: invokevirtual b : (J)D
/*    */     //   99: dstore #15
/*    */     //   101: aload_0
/*    */     //   102: lload_3
/*    */     //   103: invokevirtual b : (J)D
/*    */     //   106: dstore #17
/*    */     //   108: ldc2_w 6.283185307179586
/*    */     //   111: dload #15
/*    */     //   113: dmul
/*    */     //   114: dstore #19
/*    */     //   116: ldc2_w -2.0
/*    */     //   119: dload #17
/*    */     //   121: iload #7
/*    */     //   123: iload #8
/*    */     //   125: iload #9
/*    */     //   127: invokestatic h : (DIII)D
/*    */     //   130: dmul
/*    */     //   131: invokestatic a : (D)D
/*    */     //   134: dstore #21
/*    */     //   136: dload #21
/*    */     //   138: lload #5
/*    */     //   140: dload #19
/*    */     //   142: invokestatic g : (JD)D
/*    */     //   145: dmul
/*    */     //   146: dstore #13
/*    */     //   148: aload_0
/*    */     //   149: lload_1
/*    */     //   150: lconst_0
/*    */     //   151: lcmp
/*    */     //   152: ifle -> 174
/*    */     //   155: dload #21
/*    */     //   157: lload #10
/*    */     //   159: dload #19
/*    */     //   161: invokestatic x : (JD)D
/*    */     //   164: dmul
/*    */     //   165: putfield a : D
/*    */     //   168: iload #12
/*    */     //   170: ifne -> 199
/*    */     //   173: aload_0
/*    */     //   174: getfield a : D
/*    */     //   177: goto -> 190
/*    */     //   180: ldc2_w 1139164248480598021
/*    */     //   183: lload_1
/*    */     //   184: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   189: athrow
/*    */     //   190: dstore #13
/*    */     //   192: aload_0
/*    */     //   193: ldc2_w NaN
/*    */     //   196: putfield a : D
/*    */     //   199: dload #13
/*    */     //   201: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 66
/*    */     //   #34	-> 94
/*    */     //   #7	-> 101
/*    */     //   #26	-> 108
/*    */     //   #35	-> 116
/*    */     //   #10	-> 136
/*    */     //   #19	-> 148
/*    */     //   #28	-> 168
/*    */     //   #14	-> 173
/*    */     //   #18	-> 192
/*    */     //   #23	-> 199
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   66	81	84	java/lang/IllegalArgumentException
/*    */     //   148	177	180	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */