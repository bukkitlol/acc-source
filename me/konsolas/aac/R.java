/*    */ package me.konsolas.aac;class r implements de { private final int[] c;
/*    */   public int nextIndex() {
/*  3 */     return this.b;
/*    */   }
/*    */   private final int d; private final int a; private int b;
/*    */   private static final long e = nc.a(70556594885788668L, -4382979030409977870L, MethodHandles.lookup().lookupClass()).a(124045667520824L);
/*    */   
/*    */   public boolean hasNext() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (this.b < this.a);
/*    */   }
/*    */   
/*    */   public r(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 18 */     this.c = paramArrayOfint;
/*    */     this.d = paramInt1;
/*    */     this.a = paramInt2;
/*    */   } public int b(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/r.e : J
/*    */     //   3: ldc2_w 73358605901097
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '陘꘤?㙡ﲏꞞ茊ﴺꀫ᷇⢘궊㪩ꔖ뀶⣹㢄兠뽉棪㢯嫖第㮕蘯㥡ࣀ'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #17
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #18016
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #4507
/*    */     //   43: iconst_0
/*    */     //   44: iconst_5
/*    */     //   45: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 6771901583936204784
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: iload_1
/*    */     //   73: aload_0
/*    */     //   74: getfield a : I
/*    */     //   77: aload_0
/*    */     //   78: getfield b : I
/*    */     //   81: isub
/*    */     //   82: if_icmpgt -> 107
/*    */     //   85: aload_0
/*    */     //   86: dup
/*    */     //   87: getfield b : I
/*    */     //   90: iload_1
/*    */     //   91: iadd
/*    */     //   92: putfield b : I
/*    */     //   95: iload_1
/*    */     //   96: ireturn
/*    */     //   97: ldc2_w 6771901583936204784
/*    */     //   100: lload_2
/*    */     //   101: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   106: athrow
/*    */     //   107: aload_0
/*    */     //   108: getfield a : I
/*    */     //   111: aload_0
/*    */     //   112: getfield b : I
/*    */     //   115: isub
/*    */     //   116: istore_1
/*    */     //   117: aload_0
/*    */     //   118: aload_0
/*    */     //   119: getfield a : I
/*    */     //   122: putfield b : I
/*    */     //   125: iload_1
/*    */     //   126: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 8
/*    */     //   #9	-> 72
/*    */     //   #1	-> 85
/*    */     //   #17	-> 95
/*    */     //   #24	-> 107
/*    */     //   #19	-> 117
/*    */     //   #11	-> 125
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   72	97	97	java/util/NoSuchElementException
/*    */   }
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) { Objects.requireNonNull(paramIntConsumer);
/*    */     
/*    */     try { for (; this.b < this.a; this.b++)
/* 27 */         paramIntConsumer.accept(this.c[this.d + this.b]);  }
/*    */     catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */      } public int a() { try { if (!hasPrevious())
/*    */         throw new NoSuchElementException();  }
/*    */     catch (NoSuchElementException noSuchElementException)
/*    */     { throw a(null); }
/* 33 */      return this.c[this.d + --this.b]; }
/*    */ 
/*    */   
/*    */   public int previousIndex() {
/*    */     return this.b - 1;
/*    */   }
/*    */   
/*    */   public boolean hasPrevious() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (this.b > 0);
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Object paramObject) {
/*    */     forEachRemaining((IntConsumer)paramObject);
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/r.e : J
/*    */     //   3: ldc2_w 40650545899772
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '∺䜄䠝㬮४㮋邛?罄瞬蘴푙ߧ挢㺁흘搨ᱎ姵㰮嚒摐௵ꐇ䳕鷡朕惡?᛹'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #26
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #20610
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #25567
/*    */     //   43: iconst_4
/*    */     //   44: iconst_5
/*    */     //   45: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 2895751734096845349
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: iload_1
/*    */     //   73: aload_0
/*    */     //   74: getfield b : I
/*    */     //   77: if_icmpgt -> 102
/*    */     //   80: aload_0
/*    */     //   81: dup
/*    */     //   82: getfield b : I
/*    */     //   85: iload_1
/*    */     //   86: isub
/*    */     //   87: putfield b : I
/*    */     //   90: iload_1
/*    */     //   91: ireturn
/*    */     //   92: ldc2_w 2895751734096845349
/*    */     //   95: lload_2
/*    */     //   96: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   101: athrow
/*    */     //   102: aload_0
/*    */     //   103: getfield b : I
/*    */     //   106: istore_1
/*    */     //   107: aload_0
/*    */     //   108: iconst_0
/*    */     //   109: putfield b : I
/*    */     //   112: iload_1
/*    */     //   113: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 8
/*    */     //   #30	-> 72
/*    */     //   #25	-> 80
/*    */     //   #21	-> 90
/*    */     //   #16	-> 102
/*    */     //   #15	-> 107
/*    */     //   #20	-> 112
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   72	92	92	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   public int nextInt() {
/*    */     try {
/*    */       if (!hasNext())
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.c[this.d + this.b++];
/*    */   }
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */