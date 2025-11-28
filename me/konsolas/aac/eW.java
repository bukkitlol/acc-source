/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ 
/*    */ class ew implements de {
/*    */   public boolean hasNext() { 
/*    */     try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/*  9 */     { throw a(null); }  return (this.c < this.d.e); } public int a() { 
/* 10 */     try { if (!hasPrevious()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return this.d.d[this.b = --this.c]; }
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) { 
/* 12 */     try { while (this.c < this.d.e)
/* 13 */         paramIntConsumer.accept(this.d.d[this.b = this.c++]);  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  } public void d(int paramInt) { this.d.a(this.c++, paramInt);
/*    */     this.b = -1; }
/*    */   public int nextInt() { 
/* 16 */     try { if (!hasNext()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return this.d.d[this.b = this.c++]; }
/*    */   public void remove() { 
/* 18 */     try { if (this.b == -1) throw new IllegalStateException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  try { this.d.d(this.b); if (this.b < this.c)
/* 19 */         this.c--;  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  this.b = -1; } public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); }
/*    */   public int b(int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ew.e : J
/*    */     //   3: ldc2_w 118355102509421
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '涚ԣ둽싸鶴ᨊ㧪欹뻡伷ᨋ얭抁ḁ?髞ꃌ륉棺㣠Ḉꥦ齲럙?આ?䔴䬱'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #13
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #9705
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #11912
/*    */     //   43: iconst_3
/*    */     //   44: iconst_1
/*    */     //   45: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 6675646825854632793
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: getfield d : Lme/konsolas/aac/Z;
/*    */     //   76: getfield e : I
/*    */     //   79: aload_0
/*    */     //   80: getfield c : I
/*    */     //   83: isub
/*    */     //   84: istore #4
/*    */     //   86: iload_1
/*    */     //   87: iload #4
/*    */     //   89: if_icmpge -> 115
/*    */     //   92: aload_0
/*    */     //   93: dup
/*    */     //   94: getfield c : I
/*    */     //   97: iload_1
/*    */     //   98: iadd
/*    */     //   99: putfield c : I
/*    */     //   102: goto -> 129
/*    */     //   105: ldc2_w 6675646825854632793
/*    */     //   108: lload_2
/*    */     //   109: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   114: athrow
/*    */     //   115: iload #4
/*    */     //   117: istore_1
/*    */     //   118: aload_0
/*    */     //   119: aload_0
/*    */     //   120: getfield d : Lme/konsolas/aac/Z;
/*    */     //   123: getfield e : I
/*    */     //   126: putfield c : I
/*    */     //   129: aload_0
/*    */     //   130: aload_0
/*    */     //   131: getfield c : I
/*    */     //   134: iconst_1
/*    */     //   135: isub
/*    */     //   136: putfield b : I
/*    */     //   139: iload_1
/*    */     //   140: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 8
/*    */     //   #37	-> 72
/*    */     //   #31	-> 86
/*    */     //   #1	-> 92
/*    */     //   #11	-> 115
/*    */     //   #26	-> 118
/*    */     //   #30	-> 129
/*    */     //   #5	-> 139
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   86	105	105	java/util/NoSuchElementException } public boolean hasPrevious() { try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/* 22 */     { throw a(null); }  return (this.c > 0); }
/* 23 */    int c = this.a; int b = -1; final int a;
/*    */   final Z d;
/*    */   private static final long e = nc.a(6828738596395899714L, 4410035577964796514L, MethodHandles.lookup().lookupClass()).a(245238122868480L);
/*    */   
/*    */   public int previousIndex() {
/* 28 */     return this.c - 1;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int nextIndex() {
/* 34 */     return this.c;
/*    */   } public int a(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ew.e : J
/*    */     //   3: ldc2_w 15273460227256
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '∐婱뇲?㪵㟥渓ḋ?뜃屃@蔚炣壟ࠬ낓趰⿎ݽ겝恔铬䡛鰦㝨ﴚ뗭济㸅淹'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #22
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #22159
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #15324
/*    */     //   43: iconst_5
/*    */     //   44: iconst_0
/*    */     //   45: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 2986395815103952524
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: getfield d : Lme/konsolas/aac/Z;
/*    */     //   76: getfield e : I
/*    */     //   79: aload_0
/*    */     //   80: getfield c : I
/*    */     //   83: isub
/*    */     //   84: istore #4
/*    */     //   86: iload_1
/*    */     //   87: iload #4
/*    */     //   89: if_icmpge -> 115
/*    */     //   92: aload_0
/*    */     //   93: dup
/*    */     //   94: getfield c : I
/*    */     //   97: iload_1
/*    */     //   98: isub
/*    */     //   99: putfield c : I
/*    */     //   102: goto -> 123
/*    */     //   105: ldc2_w 2986395815103952524
/*    */     //   108: lload_2
/*    */     //   109: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   114: athrow
/*    */     //   115: iload #4
/*    */     //   117: istore_1
/*    */     //   118: aload_0
/*    */     //   119: iconst_0
/*    */     //   120: putfield c : I
/*    */     //   123: aload_0
/*    */     //   124: aload_0
/*    */     //   125: getfield c : I
/*    */     //   128: putfield b : I
/*    */     //   131: iload_1
/*    */     //   132: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 8
/*    */     //   #2	-> 72
/*    */     //   #35	-> 86
/*    */     //   #27	-> 92
/*    */     //   #24	-> 115
/*    */     //   #32	-> 118
/*    */     //   #8	-> 123
/*    */     //   #25	-> 131
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   86	105	105	java/util/NoSuchElementException
/*    */   } public void c(int paramInt) {
/*    */     
/* 39 */     try { if (this.b == -1) throw new IllegalStateException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */     
/*    */     this.d.a(this.b, paramInt);
/*    */   }
/*    */   
/*    */   ew(Z paramZ, int paramInt) {}
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */