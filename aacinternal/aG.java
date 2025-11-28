/*    */ package aacinternal;
/*    */ 
/*    */ enum ag {
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   protected double a(double[] paramArrayOfdouble, short paramShort1, int[] paramArrayOfint, double paramDouble, int paramInt1, short paramShort2, int paramInt2, af paramaf) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload #6
/*    */     //   7: i2l
/*    */     //   8: bipush #32
/*    */     //   10: lshl
/*    */     //   11: bipush #16
/*    */     //   13: lushr
/*    */     //   14: lor
/*    */     //   15: iload #7
/*    */     //   17: i2l
/*    */     //   18: bipush #48
/*    */     //   20: lshl
/*    */     //   21: bipush #48
/*    */     //   23: lushr
/*    */     //   24: lor
/*    */     //   25: lstore #10
/*    */     //   27: lload #10
/*    */     //   29: dup2
/*    */     //   30: ldc2_w 44647730720226
/*    */     //   33: lxor
/*    */     //   34: dup2
/*    */     //   35: bipush #32
/*    */     //   37: lushr
/*    */     //   38: l2i
/*    */     //   39: istore #12
/*    */     //   41: dup2
/*    */     //   42: bipush #32
/*    */     //   44: lshl
/*    */     //   45: bipush #40
/*    */     //   47: lushr
/*    */     //   48: l2i
/*    */     //   49: istore #13
/*    */     //   51: dup2
/*    */     //   52: bipush #56
/*    */     //   54: lshl
/*    */     //   55: bipush #56
/*    */     //   57: lushr
/*    */     //   58: l2i
/*    */     //   59: istore #14
/*    */     //   61: pop2
/*    */     //   62: dup2
/*    */     //   63: ldc2_w 0
/*    */     //   66: lxor
/*    */     //   67: dup2
/*    */     //   68: bipush #48
/*    */     //   70: lushr
/*    */     //   71: l2i
/*    */     //   72: istore #15
/*    */     //   74: dup2
/*    */     //   75: bipush #16
/*    */     //   77: lshl
/*    */     //   78: bipush #32
/*    */     //   80: lushr
/*    */     //   81: l2i
/*    */     //   82: istore #16
/*    */     //   84: dup2
/*    */     //   85: bipush #48
/*    */     //   87: lshl
/*    */     //   88: bipush #48
/*    */     //   90: lushr
/*    */     //   91: l2i
/*    */     //   92: istore #17
/*    */     //   94: pop2
/*    */     //   95: dup2
/*    */     //   96: ldc2_w 121276043428016
/*    */     //   99: lxor
/*    */     //   100: lstore #18
/*    */     //   102: pop2
/*    */     //   103: aload_0
/*    */     //   104: aload_1
/*    */     //   105: iload #15
/*    */     //   107: i2s
/*    */     //   108: aload_3
/*    */     //   109: dload #4
/*    */     //   111: ldc2_w 0.5
/*    */     //   114: dsub
/*    */     //   115: iload #12
/*    */     //   117: dup_x2
/*    */     //   118: pop
/*    */     //   119: iload #13
/*    */     //   121: dup_x2
/*    */     //   122: pop
/*    */     //   123: iload #14
/*    */     //   125: i2b
/*    */     //   126: invokestatic D : (IIDB)D
/*    */     //   129: iload #16
/*    */     //   131: iload #17
/*    */     //   133: i2s
/*    */     //   134: iload #8
/*    */     //   136: aload #9
/*    */     //   138: invokespecial a : ([DS[IDISILaacinternal/af;)D
/*    */     //   141: dstore #21
/*    */     //   143: ldc2_w -4539854513005379149
/*    */     //   146: lload #10
/*    */     //   148: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   153: aload_0
/*    */     //   154: aload_1
/*    */     //   155: iload #15
/*    */     //   157: i2s
/*    */     //   158: aload_3
/*    */     //   159: dload #4
/*    */     //   161: ldc2_w 0.5
/*    */     //   164: dadd
/*    */     //   165: lload #18
/*    */     //   167: dup2_x2
/*    */     //   168: pop2
/*    */     //   169: invokestatic t : (JD)D
/*    */     //   172: iload #16
/*    */     //   174: iload #17
/*    */     //   176: i2s
/*    */     //   177: iload #8
/*    */     //   179: aload #9
/*    */     //   181: invokespecial a : ([DS[IDISILaacinternal/af;)D
/*    */     //   184: dstore #23
/*    */     //   186: astore #20
/*    */     //   188: dload #21
/*    */     //   190: dload #23
/*    */     //   192: dadd
/*    */     //   193: ldc2_w 2.0
/*    */     //   196: ddiv
/*    */     //   197: ldc2_w -4600972863568116603
/*    */     //   200: lload #10
/*    */     //   202: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   207: ifnull -> 238
/*    */     //   210: iconst_2
/*    */     //   211: anewarray me/konsolas/aac/aN
/*    */     //   214: ldc2_w -4541869354876340092
/*    */     //   217: lload #10
/*    */     //   219: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   224: goto -> 238
/*    */     //   227: ldc2_w -4486481735779837430
/*    */     //   230: lload #10
/*    */     //   232: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   237: athrow
/*    */     //   238: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #4	-> 103
/*    */     //   #2	-> 123
/*    */     //   #9	-> 153
/*    */     //   #8	-> 169
/*    */     //   #6	-> 188
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   188	224	227	aacinternal/v
/*    */   }
/*    */   
/*    */   protected double a(double paramDouble, long paramLong, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -8817724927611501331
/*    */     //   3: lload_3
/*    */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   9: dconst_0
/*    */     //   10: dstore #7
/*    */     //   12: dconst_1
/*    */     //   13: dstore #9
/*    */     //   15: astore #6
/*    */     //   17: dload_1
/*    */     //   18: dconst_1
/*    */     //   19: invokestatic compare : (DD)I
/*    */     //   22: aload #6
/*    */     //   24: lload_3
/*    */     //   25: lconst_0
/*    */     //   26: lcmp
/*    */     //   27: iflt -> 72
/*    */     //   30: ifnull -> 70
/*    */     //   33: ifne -> 65
/*    */     //   36: goto -> 49
/*    */     //   39: ldc2_w -8871309394616197292
/*    */     //   42: lload_3
/*    */     //   43: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   48: athrow
/*    */     //   49: iload #5
/*    */     //   51: i2d
/*    */     //   52: goto -> 114
/*    */     //   55: ldc2_w -8871309394616197292
/*    */     //   58: lload_3
/*    */     //   59: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   64: athrow
/*    */     //   65: dload_1
/*    */     //   66: dconst_0
/*    */     //   67: invokestatic compare : (DD)I
/*    */     //   70: aload #6
/*    */     //   72: ifnull -> 107
/*    */     //   75: ifne -> 105
/*    */     //   78: goto -> 91
/*    */     //   81: ldc2_w -8871309394616197292
/*    */     //   84: lload_3
/*    */     //   85: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   90: athrow
/*    */     //   91: dconst_0
/*    */     //   92: goto -> 114
/*    */     //   95: ldc2_w -8871309394616197292
/*    */     //   98: lload_3
/*    */     //   99: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   104: athrow
/*    */     //   105: iload #5
/*    */     //   107: i2d
/*    */     //   108: dload_1
/*    */     //   109: dmul
/*    */     //   110: ldc2_w 0.5
/*    */     //   113: dadd
/*    */     //   114: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 9
/*    */     //   #7	-> 12
/*    */     //   #1	-> 17
/*    */     //   #3	-> 67
/*    */     //   #10	-> 114
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	36	39	aacinternal/v
/*    */     //   33	55	55	aacinternal/v
/*    */     //   70	78	81	aacinternal/v
/*    */     //   75	95	95	aacinternal/v
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */