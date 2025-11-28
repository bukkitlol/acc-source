/*  1 */ package me.konsolas.aac;class j1 implements ae { private final Object d; private final Comparator c; public Spliterator trySplit() { return a(); }
/*    */   private boolean b; private static final int a = 17493; private static final long e = nc.a(-2412195335918058796L, 2390848548655683834L, MethodHandles.lookup().lookupClass()).a(223675329941900L); public long a(long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/j1.e : J
/*    */     //   3: ldc2_w 2673524507273
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: lload_1
/*    */     //   9: lconst_0
/*    */     //   10: lcmp
/*    */     //   11: ifge -> 74
/*    */     //   14: new java/lang/IllegalArgumentException
/*    */     //   17: dup
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: ldc '峩큛뜜ꮟ൫?靈ꋚ?坶㗘李해᱖펖?邛ꍊ┏⫸탾獇㊈V뷩݂'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #24
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #22491
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #6176
/*    */     //   45: iconst_0
/*    */     //   46: iconst_1
/*    */     //   47: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5073853187967517470
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: lload_1
/*    */     //   75: lconst_0
/*    */     //   76: lcmp
/*    */     //   77: ifeq -> 100
/*    */     //   80: aload_0
/*    */     //   81: getfield b : Z
/*    */     //   84: ifeq -> 112
/*    */     //   87: goto -> 100
/*    */     //   90: ldc2_w 5073853187967517470
/*    */     //   93: lload_3
/*    */     //   94: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   99: athrow
/*    */     //   100: lconst_0
/*    */     //   101: lreturn
/*    */     //   102: ldc2_w 5073853187967517470
/*    */     //   105: lload_3
/*    */     //   106: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   111: athrow
/*    */     //   112: aload_0
/*    */     //   113: iconst_1
/*    */     //   114: putfield b : Z
/*    */     //   117: lconst_1
/*    */     //   118: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #3	-> 8
/*    */     //   #21	-> 74
/*    */     //   #9	-> 112
/*    */     //   #10	-> 117
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IllegalArgumentException
/*    */     //   74	87	90	java/lang/IllegalArgumentException
/*    */     //   80	102	102	java/lang/IllegalArgumentException } public boolean tryAdvance(Consumer<Object> paramConsumer) {
/*    */     
/*  4 */     try { Objects.requireNonNull(paramConsumer);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 25 */       if (this.b) return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  this.b = true; paramConsumer.accept(this.d); return true; } public j1(Object paramObject, Comparator paramComparator) { this.b = false; this.d = paramObject; this.c = paramComparator; }
/* 26 */   public int characteristics() { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return 0x4455 | ((this.d != null) ? 256 : 0); }
/*    */ 
/*    */   
/*    */   public ae a() {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public Comparator getComparator() {
/*    */     return this.c;
/*    */   }
/*    */   
/*    */   public j1(Object paramObject) {
/*    */     this(paramObject, null);
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Consumer<Object> paramConsumer) {
/*    */     try {
/*    */       Objects.requireNonNull(paramConsumer);
/*    */       if (!this.b) {
/*    */         this.b = true;
/*    */         paramConsumer.accept(this.d);
/*    */       } 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public long estimateSize() {
/*    */     try {
/*    */     
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.b ? 0L : 1L;
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\j1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */