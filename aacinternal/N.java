/*   */ package aacinternal;
/*   */ 
/*   */ enum n {
/*   */   public int a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: lload_3
/*   */     //   1: dup2
/*   */     //   2: ldc2_w 31315774430076
/*   */     //   5: lxor
/*   */     //   6: lstore #6
/*   */     //   8: pop2
/*   */     //   9: aload_1
/*   */     //   10: iload_2
/*   */     //   11: iload #5
/*   */     //   13: iload_2
/*   */     //   14: isub
/*   */     //   15: lload #6
/*   */     //   17: dup2_x1
/*   */     //   18: pop2
/*   */     //   19: invokestatic a : ([DIJI)Z
/*   */     //   22: pop
/*   */     //   23: iload #5
/*   */     //   25: iconst_1
/*   */     //   26: isub
/*   */     //   27: istore #9
/*   */     //   29: ldc2_w 3660240073199418199
/*   */     //   32: lload_3
/*   */     //   33: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*   */     //   38: iload_2
/*   */     //   39: iload #9
/*   */     //   41: iload_2
/*   */     //   42: isub
/*   */     //   43: iconst_2
/*   */     //   44: idiv
/*   */     //   45: iadd
/*   */     //   46: istore #10
/*   */     //   48: aload_1
/*   */     //   49: iload_2
/*   */     //   50: daload
/*   */     //   51: dstore #11
/*   */     //   53: aload_1
/*   */     //   54: iload #10
/*   */     //   56: daload
/*   */     //   57: dstore #13
/*   */     //   59: aload_1
/*   */     //   60: iload #9
/*   */     //   62: daload
/*   */     //   63: dstore #15
/*   */     //   65: astore #8
/*   */     //   67: dload #11
/*   */     //   69: dload #13
/*   */     //   71: dcmpg
/*   */     //   72: aload #8
/*   */     //   74: ifnonnull -> 189
/*   */     //   77: ifge -> 184
/*   */     //   80: goto -> 93
/*   */     //   83: ldc2_w 3698756062013102842
/*   */     //   86: lload_3
/*   */     //   87: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   92: athrow
/*   */     //   93: dload #13
/*   */     //   95: dload #15
/*   */     //   97: dcmpg
/*   */     //   98: aload #8
/*   */     //   100: lload_3
/*   */     //   101: lconst_0
/*   */     //   102: lcmp
/*   */     //   103: ifle -> 158
/*   */     //   106: ifnonnull -> 156
/*   */     //   109: goto -> 122
/*   */     //   112: ldc2_w 3698756062013102842
/*   */     //   115: lload_3
/*   */     //   116: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   121: athrow
/*   */     //   122: ifge -> 151
/*   */     //   125: goto -> 138
/*   */     //   128: ldc2_w 3698756062013102842
/*   */     //   131: lload_3
/*   */     //   132: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   137: athrow
/*   */     //   138: iload #10
/*   */     //   140: ireturn
/*   */     //   141: ldc2_w 3698756062013102842
/*   */     //   144: lload_3
/*   */     //   145: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   150: athrow
/*   */     //   151: dload #11
/*   */     //   153: dload #15
/*   */     //   155: dcmpg
/*   */     //   156: aload #8
/*   */     //   158: ifnonnull -> 179
/*   */     //   161: ifge -> 182
/*   */     //   164: goto -> 177
/*   */     //   167: ldc2_w 3698756062013102842
/*   */     //   170: lload_3
/*   */     //   171: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   176: athrow
/*   */     //   177: iload #9
/*   */     //   179: goto -> 183
/*   */     //   182: iload_2
/*   */     //   183: ireturn
/*   */     //   184: dload #11
/*   */     //   186: dload #15
/*   */     //   188: dcmpg
/*   */     //   189: aload #8
/*   */     //   191: lload_3
/*   */     //   192: lconst_0
/*   */     //   193: lcmp
/*   */     //   194: ifle -> 235
/*   */     //   197: ifnonnull -> 233
/*   */     //   200: ifge -> 228
/*   */     //   203: goto -> 216
/*   */     //   206: ldc2_w 3698756062013102842
/*   */     //   209: lload_3
/*   */     //   210: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   215: athrow
/*   */     //   216: iload_2
/*   */     //   217: ireturn
/*   */     //   218: ldc2_w 3698756062013102842
/*   */     //   221: lload_3
/*   */     //   222: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   227: athrow
/*   */     //   228: dload #13
/*   */     //   230: dload #15
/*   */     //   232: dcmpg
/*   */     //   233: aload #8
/*   */     //   235: ifnonnull -> 256
/*   */     //   238: ifge -> 259
/*   */     //   241: goto -> 254
/*   */     //   244: ldc2_w 3698756062013102842
/*   */     //   247: lload_3
/*   */     //   248: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   253: athrow
/*   */     //   254: iload #9
/*   */     //   256: goto -> 261
/*   */     //   259: iload #10
/*   */     //   261: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #7	-> 9
/*   */     //   #5	-> 23
/*   */     //   #6	-> 38
/*   */     //   #13	-> 48
/*   */     //   #14	-> 53
/*   */     //   #2	-> 59
/*   */     //   #4	-> 67
/*   */     //   #11	-> 93
/*   */     //   #3	-> 138
/*   */     //   #12	-> 151
/*   */     //   #10	-> 184
/*   */     //   #8	-> 216
/*   */     //   #9	-> 228
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   67	80	83	aacinternal/v
/*   */     //   77	109	112	aacinternal/v
/*   */     //   93	125	128	aacinternal/v
/*   */     //   122	141	141	aacinternal/v
/*   */     //   156	164	167	aacinternal/v
/*   */     //   189	203	206	aacinternal/v
/*   */     //   200	218	218	aacinternal/v
/*   */     //   233	241	244	aacinternal/v
/*   */   }
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */