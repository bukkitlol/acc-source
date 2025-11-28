/*    */ package me.konsolas.aac;class br implements de {
/*    */   private final int a;
/*    */   private final int c;
/*    */   
/*    */   public boolean hasNext() {
/*    */     
/*    */     try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/*  9 */     { throw a(null); }  return (this.b < this.c);
/*    */   } int b; private static final long d = nc.a(-8937147961803419110L, -1247640905913614264L, MethodHandles.lookup().lookupClass()).a(6596191992714L);
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) {
/* 12 */     Objects.requireNonNull(paramIntConsumer);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 22 */       for (; this.b < this.c; this.b++)
/*    */         paramIntConsumer.accept(this.b); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     }  } public int previousIndex() { return this.b - this.a - 1; }
/* 27 */   public br(int paramInt1, int paramInt2) { this.a = this.b = paramInt1; this.c = paramInt2; } public int a(int paramInt) {
/*    */     
/*    */     try { if (this.b - paramInt >= this.a)
/* 30 */       { this.b -= paramInt; return paramInt; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/* 31 */      paramInt = this.b - this.a; this.b = this.a; return paramInt;
/*    */   }
/*    */   
/*    */   public int a() {
/*    */     try {
/*    */       if (!hasPrevious())
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return --this.b;
/*    */   }
/*    */   
/*    */   public boolean hasPrevious() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (this.b > this.a);
/*    */   }
/*    */   
/*    */   public int b(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/br.d : J
/*    */     //   3: ldc2_w 103206129397146
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 71
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '枀ꭖ⊣햀犟吔轡搚츷唍×軁宔囊ಶ섄鳌쭹տ囪쀎᷏䅙뜋㘏츜曓鶟䨁'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: iconst_0
/*    */     //   31: dup_x1
/*    */     //   32: caload
/*    */     //   33: sipush #23274
/*    */     //   36: ixor
/*    */     //   37: i2c
/*    */     //   38: castore
/*    */     //   39: sipush #1204
/*    */     //   42: iconst_0
/*    */     //   43: iconst_0
/*    */     //   44: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   50: iload_1
/*    */     //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   54: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   57: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   60: athrow
/*    */     //   61: ldc2_w 6690174569358302318
/*    */     //   64: lload_2
/*    */     //   65: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   70: athrow
/*    */     //   71: aload_0
/*    */     //   72: getfield b : I
/*    */     //   75: iload_1
/*    */     //   76: iadd
/*    */     //   77: aload_0
/*    */     //   78: getfield c : I
/*    */     //   81: if_icmpgt -> 106
/*    */     //   84: aload_0
/*    */     //   85: dup
/*    */     //   86: getfield b : I
/*    */     //   89: iload_1
/*    */     //   90: iadd
/*    */     //   91: putfield b : I
/*    */     //   94: iload_1
/*    */     //   95: ireturn
/*    */     //   96: ldc2_w 6690174569358302318
/*    */     //   99: lload_2
/*    */     //   100: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   105: athrow
/*    */     //   106: aload_0
/*    */     //   107: getfield c : I
/*    */     //   110: aload_0
/*    */     //   111: getfield b : I
/*    */     //   114: isub
/*    */     //   115: istore_1
/*    */     //   116: aload_0
/*    */     //   117: aload_0
/*    */     //   118: getfield c : I
/*    */     //   121: putfield b : I
/*    */     //   124: iload_1
/*    */     //   125: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 8
/*    */     //   #5	-> 71
/*    */     //   #23	-> 84
/*    */     //   #15	-> 94
/*    */     //   #3	-> 106
/*    */     //   #28	-> 116
/*    */     //   #13	-> 124
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	61	61	java/util/NoSuchElementException
/*    */     //   71	96	96	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   public int nextIndex() {
/*    */     return this.b - this.a;
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Object paramObject) {
/*    */     forEachRemaining((IntConsumer)paramObject);
/*    */   }
/*    */   
/*    */   public int nextInt() {
/*    */     try {
/*    */       if (!hasNext())
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.b++;
/*    */   }
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\br.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */