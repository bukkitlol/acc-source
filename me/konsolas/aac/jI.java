/*  1 */ package me.konsolas.aac;class ji implements de { public void remove() { throw new UnsupportedOperationException(); }
/*    */   
/*  3 */   public void d(int paramInt) { throw new UnsupportedOperationException(); } public int a() { 
/*  4 */     try { if (!hasPrevious()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return this.c.e[--this.a + this.c.d]; }
/*    */   
/*    */   public int nextIndex() {
/*  7 */     return this.a;
/*    */   }
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) {
/*    */     
/* 11 */     try { while (this.a < this.c.c)
/*    */       {
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
/* 27 */         paramIntConsumer.accept(this.c.e[this.a++ + this.c.d]); }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */   
/*    */   }
/*    */   
/*    */   public int nextInt() {
/*    */     try {
/*    */       if (!hasNext())
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.c.e[this.a++ + this.c.d];
/*    */   }
/*    */   
/*    */   public int previousIndex() {
/*    */     return this.a - 1;
/*    */   }
/*    */   
/*    */   public int b(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ji.d : J
/*    */     //   3: ldc2_w 2997823596271
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 71
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '⒓귱⃨禥唴廠⣦惺堌옿츎㵺퉭숇嵀铉㎽瑐잓?쪿䶣䔴骜䅅˜⿇ᚢ岷'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: iconst_4
/*    */     //   31: dup_x1
/*    */     //   32: caload
/*    */     //   33: sipush #20307
/*    */     //   36: ixor
/*    */     //   37: i2c
/*    */     //   38: castore
/*    */     //   39: sipush #19379
/*    */     //   42: iconst_0
/*    */     //   43: iconst_4
/*    */     //   44: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   50: iload_1
/*    */     //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   54: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   57: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   60: athrow
/*    */     //   61: ldc2_w 6730873412536877953
/*    */     //   64: lload_2
/*    */     //   65: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   70: athrow
/*    */     //   71: aload_0
/*    */     //   72: getfield c : Lme/konsolas/aac/aW;
/*    */     //   75: getfield c : I
/*    */     //   78: aload_0
/*    */     //   79: getfield a : I
/*    */     //   82: isub
/*    */     //   83: istore #4
/*    */     //   85: iload_1
/*    */     //   86: iload #4
/*    */     //   88: if_icmpge -> 114
/*    */     //   91: aload_0
/*    */     //   92: dup
/*    */     //   93: getfield a : I
/*    */     //   96: iload_1
/*    */     //   97: iadd
/*    */     //   98: putfield a : I
/*    */     //   101: goto -> 128
/*    */     //   104: ldc2_w 6730873412536877953
/*    */     //   107: lload_2
/*    */     //   108: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   113: athrow
/*    */     //   114: iload #4
/*    */     //   116: istore_1
/*    */     //   117: aload_0
/*    */     //   118: aload_0
/*    */     //   119: getfield c : Lme/konsolas/aac/aW;
/*    */     //   122: getfield c : I
/*    */     //   125: putfield a : I
/*    */     //   128: iload_1
/*    */     //   129: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 8
/*    */     //   #5	-> 71
/*    */     //   #17	-> 85
/*    */     //   #28	-> 91
/*    */     //   #19	-> 114
/*    */     //   #6	-> 117
/*    */     //   #22	-> 128
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	61	61	java/util/NoSuchElementException
/*    */     //   85	104	104	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   int a = this.b;
/*    */   final int b;
/*    */   final aW c;
/*    */   private static final long d = nc.a(-4141955741784062107L, -5088048808342020788L, MethodHandles.lookup().lookupClass()).a(278379718789423L);
/*    */   
/*    */   public void c(int paramInt) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public boolean hasPrevious() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (this.a > this.c.d);
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Object paramObject) {
/*    */     forEachRemaining((IntConsumer)paramObject);
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ji.d : J
/*    */     //   3: ldc2_w 111022434784058
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '棼ࠪﬁ놦䝥쐙䓚ჶ?诏唔忷흥槺ꋆː瞲ꊤ둍퇤퍃ⲉ⣫ꇩꭠ⥾뀅஖缍'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #11
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #10591
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #20257
/*    */     //   43: iconst_0
/*    */     //   44: iconst_1
/*    */     //   45: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 2935709190617675348
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: getfield c : Lme/konsolas/aac/aW;
/*    */     //   76: getfield c : I
/*    */     //   79: aload_0
/*    */     //   80: getfield a : I
/*    */     //   83: isub
/*    */     //   84: istore #4
/*    */     //   86: iload_1
/*    */     //   87: iload #4
/*    */     //   89: if_icmpge -> 115
/*    */     //   92: aload_0
/*    */     //   93: dup
/*    */     //   94: getfield a : I
/*    */     //   97: iload_1
/*    */     //   98: isub
/*    */     //   99: putfield a : I
/*    */     //   102: goto -> 123
/*    */     //   105: ldc2_w 2935709190617675348
/*    */     //   108: lload_2
/*    */     //   109: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   114: athrow
/*    */     //   115: iload #4
/*    */     //   117: istore_1
/*    */     //   118: aload_0
/*    */     //   119: iconst_0
/*    */     //   120: putfield a : I
/*    */     //   123: iload_1
/*    */     //   124: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 8
/*    */     //   #8	-> 72
/*    */     //   #21	-> 86
/*    */     //   #10	-> 92
/*    */     //   #29	-> 115
/*    */     //   #9	-> 118
/*    */     //   #14	-> 123
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   86	105	105	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (this.a < this.c.c);
/*    */   }
/*    */   
/*    */   ji(aW paramaW, int paramInt) {}
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */