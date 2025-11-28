/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class lh
/*    */   implements hp
/*    */ {
/*    */   boolean b;
/*    */   final bX c;
/*    */   final iA e;
/*    */   final gi d;
/*    */   
/*    */   public li a() {
/* 23 */     return this.c.a();
/*    */   }
/*    */   
/*    */   final j8 a;
/*    */   private static final long f = nc.a(-5394827868113290128L, -7605699901082058932L, MethodHandles.lookup().lookupClass()).a(141112032598857L);
/*    */   
/*    */   lh(j8 paramj8, bX parambX, iA paramiA, gi paramgi) {}
/*    */   
/*    */   public long a(long paramLong1, fw paramfw, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 116924143015702
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #32
/*    */     //   16: lushr
/*    */     //   17: lstore #8
/*    */     //   19: dup2
/*    */     //   20: bipush #32
/*    */     //   22: lshl
/*    */     //   23: bipush #32
/*    */     //   25: lushr
/*    */     //   26: l2i
/*    */     //   27: istore #10
/*    */     //   29: pop2
/*    */     //   30: dup2
/*    */     //   31: ldc2_w 71861394192850
/*    */     //   34: lxor
/*    */     //   35: dup2
/*    */     //   36: bipush #16
/*    */     //   38: lushr
/*    */     //   39: lstore #11
/*    */     //   41: dup2
/*    */     //   42: bipush #48
/*    */     //   44: lshl
/*    */     //   45: bipush #48
/*    */     //   47: lushr
/*    */     //   48: l2i
/*    */     //   49: istore #13
/*    */     //   51: pop2
/*    */     //   52: dup2
/*    */     //   53: ldc2_w 120693019981800
/*    */     //   56: lxor
/*    */     //   57: lstore #14
/*    */     //   59: pop2
/*    */     //   60: ldc2_w -8556557519856982490
/*    */     //   63: lload_1
/*    */     //   64: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   69: astore #16
/*    */     //   71: aload_0
/*    */     //   72: getfield c : Lme/konsolas/aac/bX;
/*    */     //   75: lload #6
/*    */     //   77: aload_3
/*    */     //   78: lload #4
/*    */     //   80: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*    */     //   85: lstore #17
/*    */     //   87: goto -> 151
/*    */     //   90: astore #19
/*    */     //   92: aload_0
/*    */     //   93: aload #16
/*    */     //   95: ifnonnull -> 136
/*    */     //   98: getfield b : Z
/*    */     //   101: ifne -> 148
/*    */     //   104: goto -> 117
/*    */     //   107: ldc2_w -8537498445772564155
/*    */     //   110: lload_1
/*    */     //   111: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   116: athrow
/*    */     //   117: aload_0
/*    */     //   118: iconst_1
/*    */     //   119: putfield b : Z
/*    */     //   122: aload_0
/*    */     //   123: goto -> 136
/*    */     //   126: ldc2_w -8537498445772564155
/*    */     //   129: lload_1
/*    */     //   130: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   135: athrow
/*    */     //   136: getfield e : Lme/konsolas/aac/iA;
/*    */     //   139: lload #8
/*    */     //   141: iload #10
/*    */     //   143: invokeinterface a : (JI)V
/*    */     //   148: aload #19
/*    */     //   150: athrow
/*    */     //   151: lload #17
/*    */     //   153: aload #16
/*    */     //   155: ifnonnull -> 289
/*    */     //   158: ldc2_w -1
/*    */     //   161: lcmp
/*    */     //   162: ifne -> 247
/*    */     //   165: goto -> 178
/*    */     //   168: ldc2_w -8537498445772564155
/*    */     //   171: lload_1
/*    */     //   172: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   177: athrow
/*    */     //   178: aload_0
/*    */     //   179: aload #16
/*    */     //   181: ifnonnull -> 235
/*    */     //   184: goto -> 197
/*    */     //   187: ldc2_w -8537498445772564155
/*    */     //   190: lload_1
/*    */     //   191: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   196: athrow
/*    */     //   197: getfield b : Z
/*    */     //   200: ifne -> 243
/*    */     //   203: goto -> 216
/*    */     //   206: ldc2_w -8537498445772564155
/*    */     //   209: lload_1
/*    */     //   210: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   215: athrow
/*    */     //   216: aload_0
/*    */     //   217: iconst_1
/*    */     //   218: putfield b : Z
/*    */     //   221: aload_0
/*    */     //   222: goto -> 235
/*    */     //   225: ldc2_w -8537498445772564155
/*    */     //   228: lload_1
/*    */     //   229: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   234: athrow
/*    */     //   235: getfield d : Lme/konsolas/aac/gi;
/*    */     //   238: invokeinterface close : ()V
/*    */     //   243: ldc2_w -1
/*    */     //   246: lreturn
/*    */     //   247: aload_3
/*    */     //   248: aload_0
/*    */     //   249: getfield d : Lme/konsolas/aac/gi;
/*    */     //   252: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   257: aload_3
/*    */     //   258: invokevirtual f : ()J
/*    */     //   261: lload #17
/*    */     //   263: lsub
/*    */     //   264: lload #11
/*    */     //   266: iload #13
/*    */     //   268: i2s
/*    */     //   269: lload #17
/*    */     //   271: invokevirtual a : (Lme/konsolas/aac/fw;JJSJ)Lme/konsolas/aac/fw;
/*    */     //   274: pop
/*    */     //   275: aload_0
/*    */     //   276: getfield d : Lme/konsolas/aac/gi;
/*    */     //   279: lload #14
/*    */     //   281: invokeinterface b : (J)Lme/konsolas/aac/gi;
/*    */     //   286: pop
/*    */     //   287: lload #17
/*    */     //   289: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #4	-> 71
/*    */     //   #2	-> 87
/*    */     //   #13	-> 90
/*    */     //   #5	-> 92
/*    */     //   #18	-> 117
/*    */     //   #22	-> 122
/*    */     //   #7	-> 148
/*    */     //   #20	-> 151
/*    */     //   #8	-> 178
/*    */     //   #1	-> 216
/*    */     //   #6	-> 221
/*    */     //   #16	-> 243
/*    */     //   #11	-> 247
/*    */     //   #19	-> 275
/*    */     //   #21	-> 287
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   71	87	90	java/io/IOException
/*    */     //   92	104	107	java/io/IOException
/*    */     //   98	123	126	java/io/IOException
/*    */     //   151	165	168	java/io/IOException
/*    */     //   158	184	187	java/io/IOException
/*    */     //   178	203	206	java/io/IOException
/*    */     //   197	222	225	java/io/IOException
/*    */   }
/*    */   
/*    */   public void close() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/lh.f : J
/*    */     //   3: ldc2_w 94337797459104
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: lload_1
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 53019072035933
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #32
/*    */     //   17: lushr
/*    */     //   18: lstore_3
/*    */     //   19: dup2
/*    */     //   20: bipush #32
/*    */     //   22: lshl
/*    */     //   23: bipush #32
/*    */     //   25: lushr
/*    */     //   26: l2i
/*    */     //   27: istore #5
/*    */     //   29: pop2
/*    */     //   30: dup2
/*    */     //   31: ldc2_w 68357012687724
/*    */     //   34: lxor
/*    */     //   35: lstore #6
/*    */     //   37: pop2
/*    */     //   38: ldc2_w 7064558105145429357
/*    */     //   41: lload_1
/*    */     //   42: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   47: astore #8
/*    */     //   49: aload_0
/*    */     //   50: aload #8
/*    */     //   52: ifnonnull -> 150
/*    */     //   55: getfield b : Z
/*    */     //   58: ifne -> 149
/*    */     //   61: goto -> 74
/*    */     //   64: ldc2_w 7120169065161699854
/*    */     //   67: lload_1
/*    */     //   68: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: aload #8
/*    */     //   77: ifnonnull -> 150
/*    */     //   80: goto -> 93
/*    */     //   83: ldc2_w 7120169065161699854
/*    */     //   86: lload_1
/*    */     //   87: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   92: athrow
/*    */     //   93: lload #6
/*    */     //   95: bipush #100
/*    */     //   97: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
/*    */     //   100: invokestatic b : (Lme/konsolas/aac/hp;JILjava/util/concurrent/TimeUnit;)Z
/*    */     //   103: ifne -> 149
/*    */     //   106: goto -> 119
/*    */     //   109: ldc2_w 7120169065161699854
/*    */     //   112: lload_1
/*    */     //   113: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   118: athrow
/*    */     //   119: aload_0
/*    */     //   120: iconst_1
/*    */     //   121: putfield b : Z
/*    */     //   124: aload_0
/*    */     //   125: getfield e : Lme/konsolas/aac/iA;
/*    */     //   128: lload_3
/*    */     //   129: iload #5
/*    */     //   131: invokeinterface a : (JI)V
/*    */     //   136: goto -> 149
/*    */     //   139: ldc2_w 7120169065161699854
/*    */     //   142: lload_1
/*    */     //   143: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   148: athrow
/*    */     //   149: aload_0
/*    */     //   150: getfield c : Lme/konsolas/aac/bX;
/*    */     //   153: invokeinterface close : ()V
/*    */     //   158: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 49
/*    */     //   #17	-> 100
/*    */     //   #14	-> 119
/*    */     //   #12	-> 124
/*    */     //   #15	-> 149
/*    */     //   #9	-> 158
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   49	61	64	java/io/IOException
/*    */     //   55	80	83	java/io/IOException
/*    */     //   74	106	109	java/io/IOException
/*    */     //   93	136	139	java/io/IOException
/*    */   }
/*    */   
/*    */   private static IOException a(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */