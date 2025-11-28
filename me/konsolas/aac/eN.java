/*  1 */ package me.konsolas.aac;public interface en extends PrimitiveIterator { default void a(j4 paramj4) { Objects.requireNonNull(paramj4);
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
/* 12 */     try { while (hasNext())
/*    */         paramj4.a(a());  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }
/*    */   public static final long a = nc.a(2127715436577077182L, -1908228900438988358L, MethodHandles.lookup().lookupClass()).a(176220329359863L); default int a(int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/en.a : J
/*    */     //   3: ldc2_w 9960113039149
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '鬷鲣퇙?弊↘⻉ɇ魃㧼䝿娓䢘ダꣳ㓞ꀚ穜䡭쾕蕔̊⡃?ϧ踠栞'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #27
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #1488
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #8694
/*    */     //   43: iconst_1
/*    */     //   44: iconst_1
/*    */     //   45: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w -3727212436562589710
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
/*    */     //   95: ldc2_w -3727212436562589710
/*    */     //   98: lload_2
/*    */     //   99: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   104: athrow
/*    */     //   105: aload_0
/*    */     //   106: invokeinterface a : ()S
/*    */     //   111: pop
/*    */     //   112: goto -> 75
/*    */     //   115: ldc2_w -3727212436562589710
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
/*    */     //   #3	-> 8
/*    */     //   #8	-> 72
/*    */     //   #13	-> 75
/*    */     //   #15	-> 125
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/lang/IllegalArgumentException
/*    */     //   75	92	95	java/lang/IllegalArgumentException
/* 14 */     //   83	115	115	java/lang/IllegalArgumentException } @Deprecated default Object next() { return a(); }
/*    */ 
/*    */   
/*    */   default void forEachRemaining(Object paramObject) {
/*    */     a((j4)paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default void forEachRemaining(Consumer paramConsumer) {
/*    */     try {
/*    */       Objects.requireNonNull(paramConsumer);
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     a((paramConsumer instanceof j4) ? (j4)paramConsumer : paramConsumer::accept);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Short a() {
/*    */     return Short.valueOf(a());
/*    */   }
/*    */   
/*    */   default void a(IntConsumer paramIntConsumer) {
/*    */     try {
/*    */       Objects.requireNonNull(paramIntConsumer);
/*    */       Objects.requireNonNull(paramIntConsumer);
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     a((paramIntConsumer instanceof j4) ? (j4)paramIntConsumer : paramIntConsumer::accept);
/*    */   }
/*    */   
/*    */   short a();
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\en.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */