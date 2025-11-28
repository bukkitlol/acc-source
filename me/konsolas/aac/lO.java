/*   */ package me.konsolas.aac;
/*   */ 
/*   */ import aacinternal.v;
/*   */ 
/*   */ public final class lo {
/*   */   private static final mJ a;
/*   */   
/*   */   public static mJ a() {
/* 9 */     return a;
/*   */   }
/*   */   
/*   */   static {
/*   */     // Byte code:
/*   */     //   0: ldc2_w -3324665538973309748
/*   */     //   3: ldc2_w -284338094371231826
/*   */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*   */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*   */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*   */     //   15: ldc2_w 7169449574026
/*   */     //   18: invokeinterface a : (J)J
/*   */     //   23: ldc2_w 47185812619078
/*   */     //   26: lxor
/*   */     //   27: lstore_0
/*   */     //   28: lload_0
/*   */     //   29: dup2
/*   */     //   30: ldc2_w 28575488243963
/*   */     //   33: lxor
/*   */     //   34: lstore_2
/*   */     //   35: dup2
/*   */     //   36: ldc2_w 9579159652549
/*   */     //   39: lxor
/*   */     //   40: lstore #4
/*   */     //   42: dup2
/*   */     //   43: ldc2_w 30564212350951
/*   */     //   46: lxor
/*   */     //   47: dup2
/*   */     //   48: bipush #48
/*   */     //   50: lushr
/*   */     //   51: l2i
/*   */     //   52: istore #6
/*   */     //   54: dup2
/*   */     //   55: bipush #16
/*   */     //   57: lshl
/*   */     //   58: bipush #32
/*   */     //   60: lushr
/*   */     //   61: l2i
/*   */     //   62: istore #7
/*   */     //   64: dup2
/*   */     //   65: bipush #48
/*   */     //   67: lshl
/*   */     //   68: bipush #48
/*   */     //   70: lushr
/*   */     //   71: l2i
/*   */     //   72: istore #8
/*   */     //   74: pop2
/*   */     //   75: dup2
/*   */     //   76: ldc2_w 1652919875532
/*   */     //   79: lxor
/*   */     //   80: lstore #9
/*   */     //   82: dup2
/*   */     //   83: ldc2_w 107271508534618
/*   */     //   86: lxor
/*   */     //   87: lstore #11
/*   */     //   89: dup2
/*   */     //   90: ldc2_w 14571803871671
/*   */     //   93: lxor
/*   */     //   94: lstore #13
/*   */     //   96: pop2
/*   */     //   97: invokestatic a : ()Lme/konsolas/aac/kP;
/*   */     //   100: astore #15
/*   */     //   102: getstatic me/konsolas/aac/lB.a : [I
/*   */     //   105: aload #15
/*   */     //   107: invokevirtual ordinal : ()I
/*   */     //   110: iaload
/*   */     //   111: tableswitch default -> 292, 1 -> 164, 2 -> 189, 3 -> 189, 4 -> 212, 5 -> 212, 6 -> 228, 7 -> 245, 8 -> 245, 9 -> 262, 10 -> 279
/*   */     //   164: new me/konsolas/aac/fy
/*   */     //   167: dup
/*   */     //   168: lload #13
/*   */     //   170: invokespecial <init> : (J)V
/*   */     //   173: putstatic me/konsolas/aac/lo.a : Lme/konsolas/aac/mJ;
/*   */     //   176: goto -> 300
/*   */     //   179: ldc2_w 5180943462618721886
/*   */     //   182: lload_0
/*   */     //   183: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   188: athrow
/*   */     //   189: new me/konsolas/aac/kT
/*   */     //   192: dup
/*   */     //   193: aload #15
/*   */     //   195: iload #6
/*   */     //   197: i2c
/*   */     //   198: iload #7
/*   */     //   200: iload #8
/*   */     //   202: i2s
/*   */     //   203: invokespecial <init> : (Lme/konsolas/aac/kP;CIS)V
/*   */     //   206: putstatic me/konsolas/aac/lo.a : Lme/konsolas/aac/mJ;
/*   */     //   209: goto -> 300
/*   */     //   212: new me/konsolas/aac/cs
/*   */     //   215: dup
/*   */     //   216: lload_2
/*   */     //   217: aload #15
/*   */     //   219: invokespecial <init> : (JLme/konsolas/aac/kP;)V
/*   */     //   222: putstatic me/konsolas/aac/lo.a : Lme/konsolas/aac/mJ;
/*   */     //   225: goto -> 300
/*   */     //   228: new me/konsolas/aac/bh
/*   */     //   231: dup
/*   */     //   232: lload #9
/*   */     //   234: aload #15
/*   */     //   236: invokespecial <init> : (JLme/konsolas/aac/kP;)V
/*   */     //   239: putstatic me/konsolas/aac/lo.a : Lme/konsolas/aac/mJ;
/*   */     //   242: goto -> 300
/*   */     //   245: new me/konsolas/aac/E
/*   */     //   248: dup
/*   */     //   249: aload #15
/*   */     //   251: lload #11
/*   */     //   253: invokespecial <init> : (Lme/konsolas/aac/kP;J)V
/*   */     //   256: putstatic me/konsolas/aac/lo.a : Lme/konsolas/aac/mJ;
/*   */     //   259: goto -> 300
/*   */     //   262: new me/konsolas/aac/dA
/*   */     //   265: dup
/*   */     //   266: aload #15
/*   */     //   268: lload #4
/*   */     //   270: invokespecial <init> : (Lme/konsolas/aac/kP;J)V
/*   */     //   273: putstatic me/konsolas/aac/lo.a : Lme/konsolas/aac/mJ;
/*   */     //   276: goto -> 300
/*   */     //   279: new me/konsolas/aac/l1
/*   */     //   282: dup
/*   */     //   283: invokespecial <init> : ()V
/*   */     //   286: putstatic me/konsolas/aac/lo.a : Lme/konsolas/aac/mJ;
/*   */     //   289: goto -> 300
/*   */     //   292: new java/lang/AssertionError
/*   */     //   295: dup
/*   */     //   296: invokespecial <init> : ()V
/*   */     //   299: athrow
/*   */     //   300: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #6	-> 97
/*   */     //   #20	-> 102
/*   */     //   #3	-> 164
/*   */     //   #7	-> 176
/*   */     //   #18	-> 189
/*   */     //   #11	-> 209
/*   */     //   #1	-> 212
/*   */     //   #15	-> 225
/*   */     //   #10	-> 228
/*   */     //   #14	-> 242
/*   */     //   #13	-> 245
/*   */     //   #2	-> 259
/*   */     //   #4	-> 262
/*   */     //   #5	-> 276
/*   */     //   #8	-> 279
/*   */     //   #17	-> 289
/*   */     //   #12	-> 292
/*   */     //   #16	-> 300
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   102	179	179	aacinternal/v
/*   */   }
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */