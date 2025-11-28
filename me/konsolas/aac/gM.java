/*    */ package me.konsolas.aac;class gm implements ae { private static final int a = 16464; final Object[] b; private final int d;
/*    */   
/*    */   public long estimateSize() {
/*  4 */     return (this.c - this.e);
/*    */   } private int c; private int e; final int f; private static final long h = nc.a(-4963867069723593032L, 4992497212721006118L, MethodHandles.lookup().lookupClass()).a(168025947256295L);
/*    */   public int characteristics() {
/*  7 */     return this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/gm.h : J
/*    */     //   3: ldc2_w 79962278129736
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
/*    */     //   25: ldc '稾蛢猪顛밮魟࿨ᬉ兠ᎊ⽣᪇ﺡ甇朼Ϳ┋㝽㢈댭ꇮﷅ웕雔晹ퟴ䩞荷㓁䒙'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #27
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #28157
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #7408
/*    */     //   45: iconst_1
/*    */     //   46: iconst_0
/*    */     //   47: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5067518788424143961
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: getfield e : I
/*    */     //   78: aload_0
/*    */     //   79: getfield c : I
/*    */     //   82: if_icmplt -> 97
/*    */     //   85: lconst_0
/*    */     //   86: lreturn
/*    */     //   87: ldc2_w 5067518788424143961
/*    */     //   90: lload_3
/*    */     //   91: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   96: athrow
/*    */     //   97: aload_0
/*    */     //   98: getfield c : I
/*    */     //   101: aload_0
/*    */     //   102: getfield e : I
/*    */     //   105: isub
/*    */     //   106: istore #5
/*    */     //   108: lload_1
/*    */     //   109: iload #5
/*    */     //   111: i2l
/*    */     //   112: lcmp
/*    */     //   113: ifge -> 142
/*    */     //   116: aload_0
/*    */     //   117: aload_0
/*    */     //   118: getfield e : I
/*    */     //   121: i2l
/*    */     //   122: lload_1
/*    */     //   123: ladd
/*    */     //   124: invokestatic a : (J)I
/*    */     //   127: putfield e : I
/*    */     //   130: lload_1
/*    */     //   131: lreturn
/*    */     //   132: ldc2_w 5067518788424143961
/*    */     //   135: lload_3
/*    */     //   136: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   141: athrow
/*    */     //   142: iload #5
/*    */     //   144: i2l
/*    */     //   145: lstore_1
/*    */     //   146: aload_0
/*    */     //   147: aload_0
/*    */     //   148: getfield c : I
/*    */     //   151: putfield e : I
/*    */     //   154: lload_1
/*    */     //   155: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 8
/*    */     //   #18	-> 74
/*    */     //   #10	-> 97
/*    */     //   #8	-> 108
/*    */     //   #33	-> 116
/*    */     //   #28	-> 130
/*    */     //   #11	-> 142
/*    */     //   #24	-> 146
/*    */     //   #32	-> 154
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IllegalArgumentException
/*    */     //   74	87	87	java/lang/IllegalArgumentException
/*    */     //   108	132	132	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/* 16 */     return a();
/*    */   }
/*    */   
/*    */   protected gm a(int paramInt1, int paramInt2) {
/* 20 */     return new gm(this.b, paramInt1, paramInt2, this.f);
/* 21 */   } public ae a() { int i = this.c - this.e >> 1;
/*    */     
/* 23 */     try { if (i <= 1) return null;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     int j = this.e + i; int k = this.d + this.e; this.e = j; return a(k, i); } public gm(Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3) { this.b = paramArrayOfObject; this.d = paramInt1;
/* 30 */     this.c = paramInt2; this.f = 0x4050 | paramInt3; } public void forEachRemaining(Consumer<Object> paramConsumer) { Objects.requireNonNull(paramConsumer); try { while (this.e < this.c)
/* 31 */       { paramConsumer.accept(this.b[this.d + this.e]); this.e++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */      } public boolean tryAdvance(Consumer<Object> paramConsumer) {
/*    */     
/* 34 */     try { if (this.e >= this.c) return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */     
/*    */     Objects.requireNonNull(paramConsumer);
/*    */     paramConsumer.accept(this.b[this.d + this.e++]);
/*    */     return true;
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */