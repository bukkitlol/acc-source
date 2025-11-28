/*    */ package me.konsolas.aac;public abstract class hi extends hY implements de { public int a() {
/*    */     
/*  3 */     try { if (!hasPrevious()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return c(this.a = --this.c);
/*    */   }
/*    */   private static final long g = nc.a(-3872792838281595474L, 8491145942435225178L, MethodHandles.lookup().lookupClass()).a(151075327862353L);
/*    */   public void d(int paramInt) {
/*  7 */     b(this.c++, paramInt);
/*    */     this.a = -1;
/*    */   } public int a(int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hi.g : J
/*    */     //   3: ldc2_w 21710698819965
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '䔇좀蛦԰祁膎딊៾ѱ橛쥾ᖬഘ佤턞怳衧줕ﾖ㐻ᆛ뵞曛ꡛꎖ㷑鬙ꩼ⮃'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #25
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #6030
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #20324
/*    */     //   43: iconst_1
/*    */     //   44: iconst_0
/*    */     //   45: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 2897708663945133381
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: getfield c : I
/*    */     //   76: aload_0
/*    */     //   77: getfield b : I
/*    */     //   80: isub
/*    */     //   81: istore #4
/*    */     //   83: iload_1
/*    */     //   84: iload #4
/*    */     //   86: if_icmpge -> 112
/*    */     //   89: aload_0
/*    */     //   90: dup
/*    */     //   91: getfield c : I
/*    */     //   94: iload_1
/*    */     //   95: isub
/*    */     //   96: putfield c : I
/*    */     //   99: goto -> 123
/*    */     //   102: ldc2_w 2897708663945133381
/*    */     //   105: lload_2
/*    */     //   106: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   111: athrow
/*    */     //   112: iload #4
/*    */     //   114: istore_1
/*    */     //   115: aload_0
/*    */     //   116: aload_0
/*    */     //   117: getfield b : I
/*    */     //   120: putfield c : I
/*    */     //   123: aload_0
/*    */     //   124: aload_0
/*    */     //   125: getfield c : I
/*    */     //   128: putfield a : I
/*    */     //   131: iload_1
/*    */     //   132: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 8
/*    */     //   #2	-> 72
/*    */     //   #18	-> 83
/*    */     //   #13	-> 89
/*    */     //   #5	-> 112
/*    */     //   #4	-> 115
/*    */     //   #1	-> 123
/*    */     //   #14	-> 131
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*  9 */     //   83	102	102	java/util/NoSuchElementException } public int previousIndex() { return this.c - 1; } public void c(int paramInt) { 
/* 10 */     try { if (this.a == -1) throw new IllegalStateException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 17 */     a(this.a, paramInt); } protected hi(int paramInt1, int paramInt2) { super(paramInt1, paramInt2); }
/*    */   public boolean hasPrevious() { try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/* 20 */     { throw a(null); }  return (this.c > this.b); }
/*    */ 
/*    */   
/*    */   public int nextIndex() {
/*    */     return this.c;
/*    */   }
/*    */   
/*    */   protected abstract void b(int paramInt1, int paramInt2);
/*    */   
/*    */   protected abstract void a(int paramInt1, int paramInt2);
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */