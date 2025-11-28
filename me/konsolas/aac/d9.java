/*  1 */ package me.konsolas.aac;class d9 extends d2 { final kW d; private final bX e; @Nullable private final String c; public bX a() { return this.e; }
/*    */    @Nullable
/*    */   private final String b; private static final long f = nc.a(-6690308125164870616L, -4657247302578682062L, MethodHandles.lookup().lookupClass()).a(232236945668280L); private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
/*    */     return paramNumberFormatException;
/*    */   } public long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -2628712177558234298
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   9: astore_3
/*    */     //   10: aload_0
/*    */     //   11: getfield b : Ljava/lang/String;
/*    */     //   14: aload_3
/*    */     //   15: ifnonnull -> 51
/*    */     //   18: ifnull -> 57
/*    */     //   21: goto -> 34
/*    */     //   24: ldc2_w -2671031854624346748
/*    */     //   27: lload_1
/*    */     //   28: <illegal opcode> w : (Ljava/lang/NumberFormatException;JJ)Ljava/lang/NumberFormatException;
/*    */     //   33: athrow
/*    */     //   34: aload_0
/*    */     //   35: getfield b : Ljava/lang/String;
/*    */     //   38: goto -> 51
/*    */     //   41: ldc2_w -2671031854624346748
/*    */     //   44: lload_1
/*    */     //   45: <illegal opcode> w : (Ljava/lang/NumberFormatException;JJ)Ljava/lang/NumberFormatException;
/*    */     //   50: athrow
/*    */     //   51: invokestatic parseLong : (Ljava/lang/String;)J
/*    */     //   54: goto -> 60
/*    */     //   57: ldc2_w -1
/*    */     //   60: lreturn
/*    */     //   61: astore #4
/*    */     //   63: ldc2_w -1
/*    */     //   66: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 10
/*    */     //   #11	-> 61
/*    */     //   #12	-> 63
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   10	21	24	java/lang/NumberFormatException
/*    */     //   10	60	61	java/lang/NumberFormatException
/*    */     //   18	38	41	java/lang/NumberFormatException
/*    */   } public mm a(char paramChar1, char paramChar2, int paramInt) {
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
/*    */     //   23: lstore #4
/*    */     //   25: lload #4
/*    */     //   27: dup2
/*    */     //   28: ldc2_w 121311082011444
/*    */     //   31: lxor
/*    */     //   32: lstore #6
/*    */     //   34: pop2
/*    */     //   35: ldc2_w -4768786494206067437
/*    */     //   38: lload #4
/*    */     //   40: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   45: astore #8
/*    */     //   47: aload_0
/*    */     //   48: getfield c : Ljava/lang/String;
/*    */     //   51: aload #8
/*    */     //   53: ifnonnull -> 91
/*    */     //   56: ifnull -> 99
/*    */     //   59: goto -> 73
/*    */     //   62: ldc2_w -4847074489632846895
/*    */     //   65: lload #4
/*    */     //   67: <illegal opcode> w : (Ljava/lang/NumberFormatException;JJ)Ljava/lang/NumberFormatException;
/*    */     //   72: athrow
/*    */     //   73: aload_0
/*    */     //   74: getfield c : Ljava/lang/String;
/*    */     //   77: goto -> 91
/*    */     //   80: ldc2_w -4847074489632846895
/*    */     //   83: lload #4
/*    */     //   85: <illegal opcode> w : (Ljava/lang/NumberFormatException;JJ)Ljava/lang/NumberFormatException;
/*    */     //   90: athrow
/*    */     //   91: lload #6
/*    */     //   93: invokestatic b : (Ljava/lang/String;J)Lme/konsolas/aac/mm;
/*    */     //   96: goto -> 100
/*    */     //   99: aconst_null
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 47
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   47	59	62	java/lang/NumberFormatException
/*    */     //   56	77	80	java/lang/NumberFormatException
/*    */   } d9(long paramLong, kW paramkW, String paramString1, String paramString2) {
/* 10 */     this.d = paramkW;
/*    */     this.c = paramString1;
/*    */     this.b = paramString2;
/*    */     hp hp = paramkW.a(1);
/*    */     gJ gJ = new gJ(this, hp, l, paramkW, (byte)i);
/*    */     this.e = ds.a((short)j, gJ, (char)k, m);
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\d9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */