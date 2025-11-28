/* 1 */ package me.konsolas.aac;public interface ae extends Spliterator { default Spliterator trySplit() { return a(); }
/*   */ 
/*   */   
/*   */   public static final long j = nc.a(8720568623360074826L, -7377809126804292316L, MethodHandles.lookup().lookupClass()).a(240705811039132L);
/*   */   
/*   */   default long a(long paramLong) {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/ae.j : J
/*   */     //   3: ldc2_w 59877286611004
/*   */     //   6: lxor
/*   */     //   7: lstore_3
/*   */     //   8: lload_1
/*   */     //   9: lconst_0
/*   */     //   10: lcmp
/*   */     //   11: ifge -> 73
/*   */     //   14: new java/lang/IllegalArgumentException
/*   */     //   17: dup
/*   */     //   18: new java/lang/StringBuilder
/*   */     //   21: dup
/*   */     //   22: invokespecial <init> : ()V
/*   */     //   25: ldc '䉞㽨䠷镤퍔⮉姶ᬟ잛傰䠼ꋈꮩ茜饪宜伡朵Ȟ衝깶?嘸燋䧺潼偷?慠灰'
/*   */     //   27: invokevirtual toCharArray : ()[C
/*   */     //   30: dup
/*   */     //   31: dup
/*   */     //   32: iconst_1
/*   */     //   33: dup_x1
/*   */     //   34: caload
/*   */     //   35: sipush #11316
/*   */     //   38: ixor
/*   */     //   39: i2c
/*   */     //   40: castore
/*   */     //   41: sipush #31647
/*   */     //   44: iconst_0
/*   */     //   45: iconst_2
/*   */     //   46: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*   */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   52: lload_1
/*   */     //   53: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*   */     //   56: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   59: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   62: athrow
/*   */     //   63: ldc2_w 5125321673689531856
/*   */     //   66: lload_3
/*   */     //   67: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*   */     //   72: athrow
/*   */     //   73: lload_1
/*   */     //   74: lstore #5
/*   */     //   76: lload #5
/*   */     //   78: dup2
/*   */     //   79: lconst_1
/*   */     //   80: lsub
/*   */     //   81: lstore #5
/*   */     //   83: lconst_0
/*   */     //   84: lcmp
/*   */     //   85: ifeq -> 128
/*   */     //   88: aload_0
/*   */     //   89: <illegal opcode> accept : ()Ljava/util/function/Consumer;
/*   */     //   94: invokeinterface tryAdvance : (Ljava/util/function/Consumer;)Z
/*   */     //   99: ifeq -> 128
/*   */     //   102: goto -> 115
/*   */     //   105: ldc2_w 5125321673689531856
/*   */     //   108: lload_3
/*   */     //   109: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*   */     //   114: athrow
/*   */     //   115: goto -> 76
/*   */     //   118: ldc2_w 5125321673689531856
/*   */     //   121: lload_3
/*   */     //   122: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*   */     //   127: athrow
/*   */     //   128: lload_1
/*   */     //   129: lload #5
/*   */     //   131: lsub
/*   */     //   132: lconst_1
/*   */     //   133: lsub
/*   */     //   134: lreturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #4	-> 8
/*   */     //   #3	-> 73
/*   */     //   #6	-> 76
/*   */     //   #2	-> 128
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   8	63	63	java/lang/IllegalArgumentException
/*   */     //   83	102	105	java/lang/IllegalArgumentException
/*   */     //   88	118	118	java/lang/IllegalArgumentException
/*   */   }
/*   */   
/*   */   ae a();
/*   */   
/*   */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*   */     return paramIllegalArgumentException;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */