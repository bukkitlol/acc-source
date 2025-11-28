/*   */ package aacinternal;
/*   */ final class a_ extends ao {
/*   */   protected double b(int paramInt, double paramDouble) {
/* 4 */     return 1.0D;
/*   */   }
/*   */   
/*   */   final double b;
/*   */   final double c;
/*   */   
/*   */   a_(double paramDouble1, double paramDouble2) {}
/*   */   
/*   */   protected double a(int paramInt, long paramLong, double paramDouble) {
/*   */     // Byte code:
/*   */     //   0: ldc2_w 6301100121167614034
/*   */     //   3: lload_2
/*   */     //   4: <illegal opcode> w : (JJ)Ljava/lang/String;
/*   */     //   9: astore #6
/*   */     //   11: iload_1
/*   */     //   12: iconst_2
/*   */     //   13: irem
/*   */     //   14: aload #6
/*   */     //   16: ifnull -> 109
/*   */     //   19: ifne -> 95
/*   */     //   22: goto -> 35
/*   */     //   25: ldc2_w 6250472081350851038
/*   */     //   28: lload_2
/*   */     //   29: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   34: athrow
/*   */     //   35: iload_1
/*   */     //   36: i2d
/*   */     //   37: ldc2_w 2.0
/*   */     //   40: ddiv
/*   */     //   41: dstore #9
/*   */     //   43: dload #9
/*   */     //   45: aload_0
/*   */     //   46: getfield b : D
/*   */     //   49: dload #9
/*   */     //   51: dsub
/*   */     //   52: dmul
/*   */     //   53: dload #4
/*   */     //   55: dmul
/*   */     //   56: aload_0
/*   */     //   57: getfield c : D
/*   */     //   60: ldc2_w 2.0
/*   */     //   63: dload #9
/*   */     //   65: dmul
/*   */     //   66: dadd
/*   */     //   67: dconst_1
/*   */     //   68: dsub
/*   */     //   69: aload_0
/*   */     //   70: getfield c : D
/*   */     //   73: ldc2_w 2.0
/*   */     //   76: dload #9
/*   */     //   78: dmul
/*   */     //   79: dadd
/*   */     //   80: dmul
/*   */     //   81: ddiv
/*   */     //   82: dstore #7
/*   */     //   84: lload_2
/*   */     //   85: lconst_0
/*   */     //   86: lcmp
/*   */     //   87: ifle -> 170
/*   */     //   90: aload #6
/*   */     //   92: ifnonnull -> 170
/*   */     //   95: iload_1
/*   */     //   96: goto -> 109
/*   */     //   99: ldc2_w 6250472081350851038
/*   */     //   102: lload_2
/*   */     //   103: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   108: athrow
/*   */     //   109: i2d
/*   */     //   110: dconst_1
/*   */     //   111: dsub
/*   */     //   112: ldc2_w 2.0
/*   */     //   115: ddiv
/*   */     //   116: dstore #9
/*   */     //   118: aload_0
/*   */     //   119: getfield c : D
/*   */     //   122: dload #9
/*   */     //   124: dadd
/*   */     //   125: aload_0
/*   */     //   126: getfield c : D
/*   */     //   129: aload_0
/*   */     //   130: getfield b : D
/*   */     //   133: dadd
/*   */     //   134: dload #9
/*   */     //   136: dadd
/*   */     //   137: dmul
/*   */     //   138: dload #4
/*   */     //   140: dmul
/*   */     //   141: dneg
/*   */     //   142: aload_0
/*   */     //   143: getfield c : D
/*   */     //   146: ldc2_w 2.0
/*   */     //   149: dload #9
/*   */     //   151: dmul
/*   */     //   152: dadd
/*   */     //   153: aload_0
/*   */     //   154: getfield c : D
/*   */     //   157: ldc2_w 2.0
/*   */     //   160: dload #9
/*   */     //   162: dmul
/*   */     //   163: dadd
/*   */     //   164: dconst_1
/*   */     //   165: dadd
/*   */     //   166: dmul
/*   */     //   167: ddiv
/*   */     //   168: dstore #7
/*   */     //   170: dload #7
/*   */     //   172: lload_2
/*   */     //   173: lconst_0
/*   */     //   174: lcmp
/*   */     //   175: ifle -> 223
/*   */     //   178: ldc2_w 6277457438328230845
/*   */     //   181: lload_2
/*   */     //   182: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   187: ifnull -> 236
/*   */     //   190: ldc 'ࠇ먞뫰깗귲쏠㣇'
/*   */     //   192: invokevirtual toCharArray : ()[C
/*   */     //   195: dup
/*   */     //   196: dup
/*   */     //   197: iconst_0
/*   */     //   198: dup_x1
/*   */     //   199: caload
/*   */     //   200: sipush #17554
/*   */     //   203: ixor
/*   */     //   204: i2c
/*   */     //   205: castore
/*   */     //   206: sipush #8282
/*   */     //   209: iconst_5
/*   */     //   210: iconst_4
/*   */     //   211: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*   */     //   214: ldc2_w 6334057889592580786
/*   */     //   217: lload_2
/*   */     //   218: <illegal opcode> w : (Ljava/lang/String;JJ)V
/*   */     //   223: goto -> 236
/*   */     //   226: ldc2_w 6250472081350851038
/*   */     //   229: lload_2
/*   */     //   230: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   235: athrow
/*   */     //   236: dreturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #8	-> 11
/*   */     //   #3	-> 35
/*   */     //   #6	-> 43
/*   */     //   #5	-> 95
/*   */     //   #1	-> 118
/*   */     //   #2	-> 170
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   11	22	25	aacinternal/v
/*   */     //   84	96	99	aacinternal/v
/*   */     //   170	223	226	aacinternal/v
/*   */   }
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */