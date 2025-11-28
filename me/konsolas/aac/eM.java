/*    */ package me.konsolas.aac;
/*  2 */ class em implements fK { private static final int b = 1024; private static final int d = 33554432; private final cA c; final int g; public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); } private final boolean e; private long h; private int a; private fK f; private static final long k = nc.a(7717816685157880748L, -7625881878519972372L, MethodHandles.lookup().lookupClass()).a(226506587458193L); public boolean tryAdvance(Object paramObject) {
/*  3 */     return tryAdvance((IntConsumer)paramObject);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) {
/*    */     
/* 14 */     try { if (this.f != null)
/*    */       { this.f.forEachRemaining(paramIntConsumer);
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
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 40 */         this.f = null; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */     
/*    */     this.c.forEachRemaining(paramIntConsumer);
/*    */     this.h = 0L;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/em.k : J
/*    */     //   3: ldc2_w 119404633706257
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
/*    */     //   25: ldc '뙭珩꺺ꆹှ䂅쁇?鈈ќ✧䱡锤鸩䳫ౝΏ嗰舢?ྑ켶ᘠ⇃᤾퇿?묡ீ'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #10
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #23375
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #24994
/*    */     //   45: iconst_1
/*    */     //   46: iconst_3
/*    */     //   47: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5065130072424277320
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: getfield c : Lme/konsolas/aac/cA;
/*    */     //   78: instanceof me/konsolas/aac/d4
/*    */     //   81: ifeq -> 113
/*    */     //   84: aload_0
/*    */     //   85: getfield c : Lme/konsolas/aac/cA;
/*    */     //   88: checkcast me/konsolas/aac/d4
/*    */     //   91: lload_1
/*    */     //   92: invokeinterface b : (J)J
/*    */     //   97: lstore #5
/*    */     //   99: aload_0
/*    */     //   100: dup
/*    */     //   101: getfield h : J
/*    */     //   104: lload #5
/*    */     //   106: lsub
/*    */     //   107: putfield h : J
/*    */     //   110: lload #5
/*    */     //   112: lreturn
/*    */     //   113: lconst_0
/*    */     //   114: lstore #5
/*    */     //   116: lload #5
/*    */     //   118: lload_1
/*    */     //   119: lcmp
/*    */     //   120: ifge -> 192
/*    */     //   123: aload_0
/*    */     //   124: getfield c : Lme/konsolas/aac/cA;
/*    */     //   127: invokeinterface hasNext : ()Z
/*    */     //   132: ifeq -> 192
/*    */     //   135: goto -> 148
/*    */     //   138: ldc2_w 5065130072424277320
/*    */     //   141: lload_3
/*    */     //   142: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   147: athrow
/*    */     //   148: aload_0
/*    */     //   149: getfield c : Lme/konsolas/aac/cA;
/*    */     //   152: lload_1
/*    */     //   153: ldc2_w 2147483647
/*    */     //   156: invokestatic min : (JJ)J
/*    */     //   159: invokestatic a : (J)I
/*    */     //   162: invokeinterface b : (I)I
/*    */     //   167: istore #7
/*    */     //   169: aload_0
/*    */     //   170: dup
/*    */     //   171: getfield h : J
/*    */     //   174: iload #7
/*    */     //   176: i2l
/*    */     //   177: lsub
/*    */     //   178: putfield h : J
/*    */     //   181: lload #5
/*    */     //   183: iload #7
/*    */     //   185: i2l
/*    */     //   186: ladd
/*    */     //   187: lstore #5
/*    */     //   189: goto -> 116
/*    */     //   192: lload #5
/*    */     //   194: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 8
/*    */     //   #12	-> 74
/*    */     //   #21	-> 84
/*    */     //   #28	-> 99
/*    */     //   #29	-> 110
/*    */     //   #27	-> 113
/*    */     //   #47	-> 116
/*    */     //   #67	-> 148
/*    */     //   #65	-> 169
/*    */     //   #57	-> 181
/*    */     //   #56	-> 189
/*    */     //   #13	-> 192
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IllegalArgumentException
/*    */     //   116	135	138	java/lang/IllegalArgumentException
/*    */   }
/*    */ 
/*    */   
/*    */   em(cA paramcA, long paramLong, int paramInt) {
/*    */     this.h = Long.MAX_VALUE;
/* 55 */     this.a = 1024;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 62 */     this.f = null;
/*    */     this.c = paramcA;
/*    */     this.e = true;
/*    */     this.h = paramLong;
/*    */     if ((paramInt & 0x1000) != 0) {
/*    */       this.g = 0x100 | paramInt;
/*    */     } else {
/* 69 */       this.g = 0x4140 | paramInt;
/*    */     } 
/*    */   } protected fK a(int[] paramArrayOfint, int paramInt) { return hl.a(paramArrayOfint, 0, paramInt, this.g); } public Spliterator.OfInt trySplit() { return a(); }
/*    */   em(cA paramcA, int paramInt) { this.h = Long.MAX_VALUE; this.a = 1024; this.f = null; this.c = paramcA;
/* 73 */     this.g = 0x100 | paramInt;
/*    */     this.e = false; }
/*    */ 
/*    */   
/*    */   public Spliterator.OfPrimitive trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public long estimateSize() {
/*    */     try {
/*    */       if (this.f != null)
/*    */         return this.f.estimateSize(); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     try {
/*    */       if (!this.c.hasNext())
/*    */         return 0L; 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     try {
/*    */       if (this.e)
/*    */         try {
/*    */           if (this.h >= 0L);
/*    */         } catch (IllegalArgumentException illegalArgumentException) {
/*    */           throw a(null);
/*    */         }  
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return Long.MAX_VALUE;
/*    */   }
/*    */   
/*    */   public fK a() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield c : Lme/konsolas/aac/cA;
/*    */     //   4: invokeinterface hasNext : ()Z
/*    */     //   9: ifne -> 18
/*    */     //   12: aconst_null
/*    */     //   13: areturn
/*    */     //   14: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   17: athrow
/*    */     //   18: aload_0
/*    */     //   19: getfield e : Z
/*    */     //   22: ifeq -> 61
/*    */     //   25: aload_0
/*    */     //   26: getfield h : J
/*    */     //   29: lconst_0
/*    */     //   30: lcmp
/*    */     //   31: ifle -> 61
/*    */     //   34: goto -> 41
/*    */     //   37: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   40: athrow
/*    */     //   41: aload_0
/*    */     //   42: getfield a : I
/*    */     //   45: i2l
/*    */     //   46: aload_0
/*    */     //   47: getfield h : J
/*    */     //   50: invokestatic min : (JJ)J
/*    */     //   53: l2i
/*    */     //   54: goto -> 65
/*    */     //   57: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   60: athrow
/*    */     //   61: aload_0
/*    */     //   62: getfield a : I
/*    */     //   65: istore_1
/*    */     //   66: iload_1
/*    */     //   67: newarray int
/*    */     //   69: astore_2
/*    */     //   70: iconst_0
/*    */     //   71: istore_3
/*    */     //   72: iload_3
/*    */     //   73: iload_1
/*    */     //   74: if_icmpge -> 128
/*    */     //   77: aload_0
/*    */     //   78: getfield c : Lme/konsolas/aac/cA;
/*    */     //   81: invokeinterface hasNext : ()Z
/*    */     //   86: ifeq -> 128
/*    */     //   89: goto -> 96
/*    */     //   92: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   95: athrow
/*    */     //   96: aload_2
/*    */     //   97: iload_3
/*    */     //   98: iinc #3, 1
/*    */     //   101: aload_0
/*    */     //   102: getfield c : Lme/konsolas/aac/cA;
/*    */     //   105: invokeinterface nextInt : ()I
/*    */     //   110: iastore
/*    */     //   111: aload_0
/*    */     //   112: dup
/*    */     //   113: getfield h : J
/*    */     //   116: lconst_1
/*    */     //   117: lsub
/*    */     //   118: putfield h : J
/*    */     //   121: goto -> 72
/*    */     //   124: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   127: athrow
/*    */     //   128: iload_1
/*    */     //   129: aload_0
/*    */     //   130: getfield a : I
/*    */     //   133: if_icmpge -> 223
/*    */     //   136: aload_0
/*    */     //   137: getfield c : Lme/konsolas/aac/cA;
/*    */     //   140: invokeinterface hasNext : ()Z
/*    */     //   145: ifeq -> 223
/*    */     //   148: goto -> 155
/*    */     //   151: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   154: athrow
/*    */     //   155: aload_2
/*    */     //   156: aload_0
/*    */     //   157: getfield a : I
/*    */     //   160: invokestatic copyOf : ([II)[I
/*    */     //   163: astore_2
/*    */     //   164: aload_0
/*    */     //   165: getfield c : Lme/konsolas/aac/cA;
/*    */     //   168: invokeinterface hasNext : ()Z
/*    */     //   173: ifeq -> 223
/*    */     //   176: iload_3
/*    */     //   177: aload_0
/*    */     //   178: getfield a : I
/*    */     //   181: if_icmpge -> 223
/*    */     //   184: goto -> 191
/*    */     //   187: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   190: athrow
/*    */     //   191: aload_2
/*    */     //   192: iload_3
/*    */     //   193: iinc #3, 1
/*    */     //   196: aload_0
/*    */     //   197: getfield c : Lme/konsolas/aac/cA;
/*    */     //   200: invokeinterface nextInt : ()I
/*    */     //   205: iastore
/*    */     //   206: aload_0
/*    */     //   207: dup
/*    */     //   208: getfield h : J
/*    */     //   211: lconst_1
/*    */     //   212: lsub
/*    */     //   213: putfield h : J
/*    */     //   216: goto -> 164
/*    */     //   219: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   222: athrow
/*    */     //   223: aload_0
/*    */     //   224: ldc 33554432
/*    */     //   226: aload_0
/*    */     //   227: getfield a : I
/*    */     //   230: sipush #1024
/*    */     //   233: iadd
/*    */     //   234: invokestatic min : (II)I
/*    */     //   237: putfield a : I
/*    */     //   240: aload_0
/*    */     //   241: aload_2
/*    */     //   242: iload_3
/*    */     //   243: invokevirtual a : ([II)Lme/konsolas/aac/fK;
/*    */     //   246: astore #4
/*    */     //   248: aload_0
/*    */     //   249: getfield c : Lme/konsolas/aac/cA;
/*    */     //   252: invokeinterface hasNext : ()Z
/*    */     //   257: ifne -> 278
/*    */     //   260: aload_0
/*    */     //   261: aload #4
/*    */     //   263: putfield f : Lme/konsolas/aac/fK;
/*    */     //   266: aload #4
/*    */     //   268: invokeinterface a : ()Lme/konsolas/aac/fK;
/*    */     //   273: areturn
/*    */     //   274: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   277: athrow
/*    */     //   278: aload #4
/*    */     //   280: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #52	-> 0
/*    */     //   #64	-> 18
/*    */     //   #53	-> 66
/*    */     //   #11	-> 70
/*    */     //   #61	-> 72
/*    */     //   #9	-> 96
/*    */     //   #63	-> 111
/*    */     //   #7	-> 128
/*    */     //   #25	-> 155
/*    */     //   #19	-> 164
/*    */     //   #8	-> 191
/*    */     //   #32	-> 206
/*    */     //   #50	-> 223
/*    */     //   #39	-> 240
/*    */     //   #51	-> 248
/*    */     //   #43	-> 260
/*    */     //   #15	-> 266
/*    */     //   #36	-> 278
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	14	14	java/lang/IllegalArgumentException
/*    */     //   18	34	37	java/lang/IllegalArgumentException
/*    */     //   25	57	57	java/lang/IllegalArgumentException
/*    */     //   72	89	92	java/lang/IllegalArgumentException
/*    */     //   77	124	124	java/lang/IllegalArgumentException
/*    */     //   128	148	151	java/lang/IllegalArgumentException
/*    */     //   164	184	187	java/lang/IllegalArgumentException
/*    */     //   176	219	219	java/lang/IllegalArgumentException
/*    */     //   248	274	274	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public int characteristics() {
/*    */     return this.g;
/*    */   }
/*    */   
/*    */   public boolean tryAdvance(IntConsumer paramIntConsumer) {
/*    */     if (this.f != null) {
/*    */       boolean bool = this.f.tryAdvance(paramIntConsumer);
/*    */       try {
/*    */         if (!bool)
/*    */           this.f = null; 
/*    */       } catch (IllegalArgumentException illegalArgumentException) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (!this.c.hasNext())
/*    */         return false; 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.h--;
/*    */     paramIntConsumer.accept(this.c.nextInt());
/*    */     return true;
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\em.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */