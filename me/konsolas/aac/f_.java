/*    */ package me.konsolas.aac;public class f_ { Socket h; String b;
/*    */   public cZ a(long paramLong) {
/*  3 */     paramLong = i ^ paramLong; long l = paramLong ^ 0x22E8E54895D6L; return new cZ(l, this);
/*  4 */   } bX e; gi c; eX f = eX.a; public f_(boolean paramBoolean) {
/*  5 */     this.g = paramBoolean;
/*    */   } public f_ a(eX parameX) {
/*  7 */     this.f = parameX;
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
/* 21 */     return this;
/*    */   }
/*    */   
/*    */   public f_ a(ky paramky) {
/*    */     this.d = paramky;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public f_ a(int paramInt) {
/*    */     this.a = paramInt;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public f_ a(Socket paramSocket, String paramString, bX parambX, gi paramgi) {
/*    */     this.h = paramSocket;
/*    */     this.b = paramString;
/*    */     this.e = parambX;
/*    */     this.c = paramgi;
/*    */     return this;
/*    */   }
/*    */   
/*    */   ky d = ky.a;
/*    */   boolean g;
/*    */   int a;
/*    */   private static final long i = nc.a(-8032841997200587024L, 7953918099232457694L, MethodHandles.lookup().lookupClass()).a(151566796393100L);
/*    */   
/*    */   public f_ a(long paramLong, Socket paramSocket) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/f_.i : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 43625180364804
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 126027968258266
/*    */     //   18: lxor
/*    */     //   19: lstore #6
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 33962627986853
/*    */     //   25: lxor
/*    */     //   26: dup2
/*    */     //   27: bipush #48
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #8
/*    */     //   33: dup2
/*    */     //   34: bipush #16
/*    */     //   36: lshl
/*    */     //   37: bipush #48
/*    */     //   39: lushr
/*    */     //   40: l2i
/*    */     //   41: istore #9
/*    */     //   43: dup2
/*    */     //   44: bipush #32
/*    */     //   46: lshl
/*    */     //   47: bipush #32
/*    */     //   49: lushr
/*    */     //   50: l2i
/*    */     //   51: istore #10
/*    */     //   53: pop2
/*    */     //   54: dup2
/*    */     //   55: ldc2_w 49669948899258
/*    */     //   58: lxor
/*    */     //   59: lstore #11
/*    */     //   61: pop2
/*    */     //   62: ldc2_w 8693466019179240611
/*    */     //   65: lload_1
/*    */     //   66: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   71: aload_3
/*    */     //   72: invokevirtual getRemoteSocketAddress : ()Ljava/net/SocketAddress;
/*    */     //   75: astore #14
/*    */     //   77: astore #13
/*    */     //   79: aload #14
/*    */     //   81: aload #13
/*    */     //   83: ifnull -> 128
/*    */     //   86: instanceof java/net/InetSocketAddress
/*    */     //   89: ifeq -> 126
/*    */     //   92: goto -> 105
/*    */     //   95: ldc2_w 8670670154513883119
/*    */     //   98: lload_1
/*    */     //   99: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   104: athrow
/*    */     //   105: aload #14
/*    */     //   107: checkcast java/net/InetSocketAddress
/*    */     //   110: invokevirtual getHostName : ()Ljava/lang/String;
/*    */     //   113: goto -> 131
/*    */     //   116: ldc2_w 8670670154513883119
/*    */     //   119: lload_1
/*    */     //   120: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   125: athrow
/*    */     //   126: aload #14
/*    */     //   128: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   131: astore #15
/*    */     //   133: aload_0
/*    */     //   134: aload_3
/*    */     //   135: aload #15
/*    */     //   137: lload #11
/*    */     //   139: aload_3
/*    */     //   140: invokestatic a : (JLjava/net/Socket;)Lme/konsolas/aac/hp;
/*    */     //   143: iload #8
/*    */     //   145: i2s
/*    */     //   146: swap
/*    */     //   147: iload #9
/*    */     //   149: i2c
/*    */     //   150: iload #10
/*    */     //   152: invokestatic a : (SLme/konsolas/aac/hp;CI)Lme/konsolas/aac/bX;
/*    */     //   155: lload #4
/*    */     //   157: aload_3
/*    */     //   158: invokestatic a : (JLjava/net/Socket;)Lme/konsolas/aac/gp;
/*    */     //   161: lload #6
/*    */     //   163: invokestatic a : (Lme/konsolas/aac/gp;J)Lme/konsolas/aac/gi;
/*    */     //   166: invokevirtual a : (Ljava/net/Socket;Ljava/lang/String;Lme/konsolas/aac/bX;Lme/konsolas/aac/gi;)Lme/konsolas/aac/f_;
/*    */     //   169: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 71
/*    */     //   #22	-> 79
/*    */     //   #13	-> 105
/*    */     //   #24	-> 126
/*    */     //   #17	-> 133
/*    */     //   #8	-> 140
/*    */     //   #6	-> 166
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   79	92	95	java/io/IOException
/*    */     //   86	116	116	java/io/IOException
/*    */   }
/*    */   
/*    */   private static IOException a(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */