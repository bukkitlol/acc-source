/*   */ package aacinternal;
/*   */ 
/*   */ enum bu {
/*   */   private static v b(v paramv) {
/*   */     return paramv;
/*   */   }
/*   */   
/*   */   protected double a(double paramDouble, long paramLong, int paramInt) {
/*   */     // Byte code:
/*   */     //   0: ldc2_w -8817724927611501331
/*   */     //   3: lload_3
/*   */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   9: dconst_1
/*   */     //   10: iload #5
/*   */     //   12: iconst_1
/*   */     //   13: iadd
/*   */     //   14: i2d
/*   */     //   15: ddiv
/*   */     //   16: dstore #7
/*   */     //   18: astore #6
/*   */     //   20: dconst_1
/*   */     //   21: iload #5
/*   */     //   23: i2d
/*   */     //   24: dmul
/*   */     //   25: iload #5
/*   */     //   27: iconst_1
/*   */     //   28: iadd
/*   */     //   29: i2d
/*   */     //   30: ddiv
/*   */     //   31: dstore #9
/*   */     //   33: dload_1
/*   */     //   34: dload #7
/*   */     //   36: invokestatic compare : (DD)I
/*   */     //   39: aload #6
/*   */     //   41: lload_3
/*   */     //   42: lconst_0
/*   */     //   43: lcmp
/*   */     //   44: ifle -> 88
/*   */     //   47: ifnull -> 86
/*   */     //   50: ifge -> 80
/*   */     //   53: goto -> 66
/*   */     //   56: ldc2_w -8843536352443522537
/*   */     //   59: lload_3
/*   */     //   60: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   65: athrow
/*   */     //   66: dconst_0
/*   */     //   67: goto -> 130
/*   */     //   70: ldc2_w -8843536352443522537
/*   */     //   73: lload_3
/*   */     //   74: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   79: athrow
/*   */     //   80: dload_1
/*   */     //   81: dload #9
/*   */     //   83: invokestatic compare : (DD)I
/*   */     //   86: aload #6
/*   */     //   88: ifnull -> 127
/*   */     //   91: iflt -> 123
/*   */     //   94: goto -> 107
/*   */     //   97: ldc2_w -8843536352443522537
/*   */     //   100: lload_3
/*   */     //   101: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   106: athrow
/*   */     //   107: iload #5
/*   */     //   109: i2d
/*   */     //   110: goto -> 130
/*   */     //   113: ldc2_w -8843536352443522537
/*   */     //   116: lload_3
/*   */     //   117: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   122: athrow
/*   */     //   123: iload #5
/*   */     //   125: iconst_1
/*   */     //   126: iadd
/*   */     //   127: i2d
/*   */     //   128: dload_1
/*   */     //   129: dmul
/*   */     //   130: dreturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #3	-> 9
/*   */     //   #1	-> 20
/*   */     //   #4	-> 33
/*   */     //   #6	-> 83
/*   */     //   #2	-> 130
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   33	53	56	aacinternal/v
/*   */     //   50	70	70	aacinternal/v
/*   */     //   86	94	97	aacinternal/v
/*   */     //   91	113	113	aacinternal/v
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */