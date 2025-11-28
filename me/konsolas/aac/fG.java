/*    */ package me.konsolas.aac;public interface fg extends Spliterator.OfPrimitive { @Deprecated
/*    */   default boolean tryAdvance(Consumer paramConsumer) { 
/*  3 */     try { Objects.requireNonNull(paramConsumer); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return tryAdvance((paramConsumer instanceof j4) ? (T_CONS)paramConsumer : (T_CONS)paramConsumer::accept); } public static final long a = nc.a(5035512903270611246L, -1857098068319689062L, MethodHandles.lookup().lookupClass()).a(7397747629478L); @Deprecated default void forEachRemaining(Consumer paramConsumer) { 
/*  4 */     try { Objects.requireNonNull(paramConsumer); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forEachRemaining((paramConsumer instanceof j4) ? (T_CONS)paramConsumer : (T_CONS)paramConsumer::accept); }
/*  5 */   default Spliterator.OfPrimitive trySplit() { return a(); }
/*  6 */   default Comparator getComparator() { return a(); } default ad a() {
/*  7 */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   default Spliterator trySplit() {
/* 11 */     return a();
/*    */   }
/*    */   
/*    */   default long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fg.a : J
/*    */     //   3: ldc2_w 47041984933972
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: lload_1
/*    */     //   9: lconst_0
/*    */     //   10: lcmp
/*    */     //   11: ifge -> 73
/*    */     //   14: new java/lang/IllegalArgumentException
/*    */     //   17: dup
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: ldc '鳎ᒧ嚕藹葧ց瑲쁢젛ฺ二踺큞繚붴ꬰ閄羶믮靽݄譿ꐰ겂?᥅㉂繮≽'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #8
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: bipush #26
/*    */     //   38: ixor
/*    */     //   39: i2c
/*    */     //   40: castore
/*    */     //   41: sipush #9332
/*    */     //   44: iconst_1
/*    */     //   45: iconst_5
/*    */     //   46: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   52: lload_1
/*    */     //   53: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   56: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   59: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   62: athrow
/*    */     //   63: ldc2_w -7078952369840233116
/*    */     //   66: lload_3
/*    */     //   67: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   72: athrow
/*    */     //   73: lload_1
/*    */     //   74: lstore #5
/*    */     //   76: lload #5
/*    */     //   78: dup2
/*    */     //   79: lconst_1
/*    */     //   80: lsub
/*    */     //   81: lstore #5
/*    */     //   83: lconst_0
/*    */     //   84: lcmp
/*    */     //   85: ifeq -> 128
/*    */     //   88: aload_0
/*    */     //   89: <illegal opcode> a : ()Lme/konsolas/aac/j4;
/*    */     //   94: invokeinterface tryAdvance : (Ljava/lang/Object;)Z
/*    */     //   99: ifeq -> 128
/*    */     //   102: goto -> 115
/*    */     //   105: ldc2_w -7078952369840233116
/*    */     //   108: lload_3
/*    */     //   109: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   114: athrow
/*    */     //   115: goto -> 76
/*    */     //   118: ldc2_w -7078952369840233116
/*    */     //   121: lload_3
/*    */     //   122: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   127: athrow
/*    */     //   128: lload_1
/*    */     //   129: lload #5
/*    */     //   131: lsub
/*    */     //   132: lconst_1
/*    */     //   133: lsub
/*    */     //   134: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 8
/*    */     //   #10	-> 73
/*    */     //   #1	-> 76
/*    */     //   #8	-> 128
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	63	63	java/lang/IllegalArgumentException
/*    */     //   83	102	105	java/lang/IllegalArgumentException
/*    */     //   88	118	118	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   fg a();
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */