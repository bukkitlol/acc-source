/*    */ package me.konsolas.aac;public interface eq extends PrimitiveIterator { default void a(IntConsumer paramIntConsumer) { 
/*  2 */     try { Objects.requireNonNull(paramIntConsumer);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*  8 */       Objects.requireNonNull(paramIntConsumer); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  a((paramIntConsumer instanceof i5) ? (i5)paramIntConsumer : paramIntConsumer::accept); }
/*    */   public static final long a = nc.a(-731509960921461622L, 2129896154261523646L, MethodHandles.lookup().lookupClass()).a(44647216890589L); default void forEachRemaining(Object paramObject) { a((i5)paramObject); } @Deprecated default void forEachRemaining(Consumer paramConsumer) { 
/* 10 */     try { Objects.requireNonNull(paramConsumer); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  a((paramConsumer instanceof i5) ? (i5)paramConsumer : paramConsumer::accept); } @Deprecated
/* 11 */   default Byte a() { return Byte.valueOf(a()); } @Deprecated
/* 12 */   default Object next() { return a(); } default void a(i5 parami5) {
/* 13 */     Objects.requireNonNull(parami5);
/*    */     
/*    */     try { while (hasNext())
/* 16 */         parami5.a(a());  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */   
/*    */   }
/*    */   
/*    */   default int a(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/eq.a : J
/*    */     //   3: ldc2_w 98470348276963
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '펵懇뵡礯狅켪鵨測ѷ䚽碓댪뺍퓙땴킓卣ᛱ䃹惌Ƥ䭓帤㧇蓦䳮'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #18
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #3519
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #18662
/*    */     //   43: iconst_1
/*    */     //   44: iconst_1
/*    */     //   45: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w -4550319619270010138
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   71: athrow
/*    */     //   72: iload_1
/*    */     //   73: istore #4
/*    */     //   75: iload #4
/*    */     //   77: iinc #4, -1
/*    */     //   80: ifeq -> 125
/*    */     //   83: aload_0
/*    */     //   84: invokeinterface hasNext : ()Z
/*    */     //   89: ifeq -> 125
/*    */     //   92: goto -> 105
/*    */     //   95: ldc2_w -4550319619270010138
/*    */     //   98: lload_2
/*    */     //   99: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   104: athrow
/*    */     //   105: aload_0
/*    */     //   106: invokeinterface a : ()B
/*    */     //   111: pop
/*    */     //   112: goto -> 75
/*    */     //   115: ldc2_w -4550319619270010138
/*    */     //   118: lload_2
/*    */     //   119: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   124: athrow
/*    */     //   125: iload_1
/*    */     //   126: iload #4
/*    */     //   128: isub
/*    */     //   129: iconst_1
/*    */     //   130: isub
/*    */     //   131: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 8
/*    */     //   #7	-> 72
/*    */     //   #4	-> 75
/*    */     //   #6	-> 125
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/lang/IllegalArgumentException
/*    */     //   75	92	95	java/lang/IllegalArgumentException
/*    */     //   83	115	115	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   byte a();
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\eq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */