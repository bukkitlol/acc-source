/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.util.Spliterator;
/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ class nu implements ae {
/*    */   public void forEachRemaining(Consumer<? super T> paramConsumer) {
/*    */     try {
/* 10 */       if (this.d != null) {
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
/* 69 */         this.d.forEachRemaining(paramConsumer);
/*    */         this.d = null;
/*    */       } 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.a.forEachRemaining(paramConsumer);
/*    */     this.h = 0L;
/*    */   }
/*    */   
/*    */   private static final int b = 1024;
/*    */   private static final int g = 33554432;
/*    */   private final ea a;
/*    */   final int c;
/*    */   private final boolean f;
/*    */   private long h;
/*    */   private int e;
/*    */   private ae d;
/*    */   private static final long k = nc.a(3639902617713431162L, 3909842211529379202L, MethodHandles.lookup().lookupClass()).a(163336569308408L);
/*    */   
/*    */   protected ae a(Object[] paramArrayOfObject, int paramInt) {
/*    */     return dK.a(paramArrayOfObject, 0, paramInt, this.c);
/*    */   }
/*    */   
/*    */   public ae a() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield a : Lme/konsolas/aac/ea;
/*    */     //   4: invokeinterface hasNext : ()Z
/*    */     //   9: ifne -> 18
/*    */     //   12: aconst_null
/*    */     //   13: areturn
/*    */     //   14: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   17: athrow
/*    */     //   18: aload_0
/*    */     //   19: getfield f : Z
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
/*    */     //   42: getfield e : I
/*    */     //   45: i2l
/*    */     //   46: aload_0
/*    */     //   47: getfield h : J
/*    */     //   50: invokestatic min : (JJ)J
/*    */     //   53: l2i
/*    */     //   54: goto -> 65
/*    */     //   57: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   60: athrow
/*    */     //   61: aload_0
/*    */     //   62: getfield e : I
/*    */     //   65: istore_1
/*    */     //   66: iload_1
/*    */     //   67: anewarray java/lang/Object
/*    */     //   70: astore_2
/*    */     //   71: iconst_0
/*    */     //   72: istore_3
/*    */     //   73: iload_3
/*    */     //   74: iload_1
/*    */     //   75: if_icmpge -> 129
/*    */     //   78: aload_0
/*    */     //   79: getfield a : Lme/konsolas/aac/ea;
/*    */     //   82: invokeinterface hasNext : ()Z
/*    */     //   87: ifeq -> 129
/*    */     //   90: goto -> 97
/*    */     //   93: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   96: athrow
/*    */     //   97: aload_2
/*    */     //   98: iload_3
/*    */     //   99: iinc #3, 1
/*    */     //   102: aload_0
/*    */     //   103: getfield a : Lme/konsolas/aac/ea;
/*    */     //   106: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   111: aastore
/*    */     //   112: aload_0
/*    */     //   113: dup
/*    */     //   114: getfield h : J
/*    */     //   117: lconst_1
/*    */     //   118: lsub
/*    */     //   119: putfield h : J
/*    */     //   122: goto -> 73
/*    */     //   125: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   128: athrow
/*    */     //   129: iload_1
/*    */     //   130: aload_0
/*    */     //   131: getfield e : I
/*    */     //   134: if_icmpge -> 224
/*    */     //   137: aload_0
/*    */     //   138: getfield a : Lme/konsolas/aac/ea;
/*    */     //   141: invokeinterface hasNext : ()Z
/*    */     //   146: ifeq -> 224
/*    */     //   149: goto -> 156
/*    */     //   152: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   155: athrow
/*    */     //   156: aload_2
/*    */     //   157: aload_0
/*    */     //   158: getfield e : I
/*    */     //   161: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*    */     //   164: astore_2
/*    */     //   165: aload_0
/*    */     //   166: getfield a : Lme/konsolas/aac/ea;
/*    */     //   169: invokeinterface hasNext : ()Z
/*    */     //   174: ifeq -> 224
/*    */     //   177: iload_3
/*    */     //   178: aload_0
/*    */     //   179: getfield e : I
/*    */     //   182: if_icmpge -> 224
/*    */     //   185: goto -> 192
/*    */     //   188: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   191: athrow
/*    */     //   192: aload_2
/*    */     //   193: iload_3
/*    */     //   194: iinc #3, 1
/*    */     //   197: aload_0
/*    */     //   198: getfield a : Lme/konsolas/aac/ea;
/*    */     //   201: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   206: aastore
/*    */     //   207: aload_0
/*    */     //   208: dup
/*    */     //   209: getfield h : J
/*    */     //   212: lconst_1
/*    */     //   213: lsub
/*    */     //   214: putfield h : J
/*    */     //   217: goto -> 165
/*    */     //   220: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   223: athrow
/*    */     //   224: aload_0
/*    */     //   225: ldc 33554432
/*    */     //   227: aload_0
/*    */     //   228: getfield e : I
/*    */     //   231: sipush #1024
/*    */     //   234: iadd
/*    */     //   235: invokestatic min : (II)I
/*    */     //   238: putfield e : I
/*    */     //   241: aload_0
/*    */     //   242: aload_2
/*    */     //   243: iload_3
/*    */     //   244: invokevirtual a : ([Ljava/lang/Object;I)Lme/konsolas/aac/ae;
/*    */     //   247: astore #4
/*    */     //   249: aload_0
/*    */     //   250: getfield a : Lme/konsolas/aac/ea;
/*    */     //   253: invokeinterface hasNext : ()Z
/*    */     //   258: ifne -> 279
/*    */     //   261: aload_0
/*    */     //   262: aload #4
/*    */     //   264: putfield d : Lme/konsolas/aac/ae;
/*    */     //   267: aload #4
/*    */     //   269: invokeinterface a : ()Lme/konsolas/aac/ae;
/*    */     //   274: areturn
/*    */     //   275: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   278: athrow
/*    */     //   279: aload #4
/*    */     //   281: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 0
/*    */     //   #1	-> 18
/*    */     //   #7	-> 66
/*    */     //   #2	-> 71
/*    */     //   #12	-> 73
/*    */     //   #32	-> 97
/*    */     //   #3	-> 112
/*    */     //   #41	-> 129
/*    */     //   #48	-> 156
/*    */     //   #49	-> 165
/*    */     //   #36	-> 192
/*    */     //   #40	-> 207
/*    */     //   #33	-> 224
/*    */     //   #17	-> 241
/*    */     //   #27	-> 249
/*    */     //   #34	-> 261
/*    */     //   #8	-> 267
/*    */     //   #50	-> 279
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	14	14	java/lang/IllegalArgumentException
/*    */     //   18	34	37	java/lang/IllegalArgumentException
/*    */     //   25	57	57	java/lang/IllegalArgumentException
/*    */     //   73	90	93	java/lang/IllegalArgumentException
/*    */     //   78	125	125	java/lang/IllegalArgumentException
/*    */     //   129	149	152	java/lang/IllegalArgumentException
/*    */     //   165	185	188	java/lang/IllegalArgumentException
/*    */     //   177	220	220	java/lang/IllegalArgumentException
/*    */     //   249	275	275	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   nu(ea paramea, int paramInt) {
/*    */     this.h = Long.MAX_VALUE;
/*    */     this.e = 1024;
/*    */     this.d = null;
/*    */     this.a = paramea;
/*    */     this.c = 0x0 | paramInt;
/*    */     this.f = false;
/*    */   }
/*    */   
/*    */   nu(ea paramea, long paramLong, int paramInt) {
/*    */     this.h = Long.MAX_VALUE;
/*    */     this.e = 1024;
/*    */     this.d = null;
/*    */     this.a = paramea;
/*    */     this.f = true;
/*    */     this.h = paramLong;
/*    */     if ((paramInt & 0x1000) != 0) {
/*    */       this.c = 0x0 | paramInt;
/*    */     } else {
/*    */       this.c = 0x4040 | paramInt;
/*    */     } 
/*    */   }
/*    */   
/*    */   public int characteristics() {
/*    */     return this.c;
/*    */   }
/*    */   
/*    */   public long estimateSize() {
/*    */     try {
/*    */       if (this.d != null)
/*    */         return this.d.estimateSize(); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     try {
/*    */       if (!this.a.hasNext())
/*    */         return 0L; 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     try {
/*    */       if (this.f)
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
/*    */   public long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/nu.k : J
/*    */     //   3: ldc2_w 40638594845031
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
/*    */     //   25: ldc 'ἧᒫ㴌䰚屿ね懻奚㒬堒н⁍꣺㇘똝狿荄좙빺㢔៚ꆵ⤵롽税囄栢䵜'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #23
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #14749
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #11111
/*    */     //   45: iconst_1
/*    */     //   46: iconst_1
/*    */     //   47: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5107934371544525333
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: getfield a : Lme/konsolas/aac/ea;
/*    */     //   78: instanceof me/konsolas/aac/ih
/*    */     //   81: ifeq -> 113
/*    */     //   84: aload_0
/*    */     //   85: getfield a : Lme/konsolas/aac/ea;
/*    */     //   88: checkcast me/konsolas/aac/ih
/*    */     //   91: lload_1
/*    */     //   92: invokeinterface d : (J)J
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
/*    */     //   124: getfield a : Lme/konsolas/aac/ea;
/*    */     //   127: invokeinterface hasNext : ()Z
/*    */     //   132: ifeq -> 192
/*    */     //   135: goto -> 148
/*    */     //   138: ldc2_w 5107934371544525333
/*    */     //   141: lload_3
/*    */     //   142: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   147: athrow
/*    */     //   148: aload_0
/*    */     //   149: getfield a : Lme/konsolas/aac/ea;
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
/*    */     //   #62	-> 8
/*    */     //   #9	-> 74
/*    */     //   #28	-> 84
/*    */     //   #35	-> 99
/*    */     //   #57	-> 110
/*    */     //   #25	-> 113
/*    */     //   #47	-> 116
/*    */     //   #42	-> 148
/*    */     //   #23	-> 169
/*    */     //   #19	-> 181
/*    */     //   #15	-> 189
/*    */     //   #63	-> 192
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IllegalArgumentException
/*    */     //   116	135	138	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public boolean tryAdvance(Consumer<? super T> paramConsumer) {
/*    */     if (this.d != null) {
/*    */       boolean bool = this.d.tryAdvance(paramConsumer);
/*    */       try {
/*    */         if (!bool)
/*    */           this.d = null; 
/*    */       } catch (IllegalArgumentException illegalArgumentException) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (!this.a.hasNext())
/*    */         return false; 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.h--;
/*    */     paramConsumer.accept((T)this.a.next());
/*    */     return true;
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\nu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */