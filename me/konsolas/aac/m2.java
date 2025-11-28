/*    */ package me.konsolas.aac;
/*  2 */ class m2 implements i0 { public void add(Object paramObject) { throw new UnsupportedOperationException(); }
/*    */   public int b(int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/m2.d : J
/*    */     //   3: ldc2_w 132918573474923
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '쉨䙫㽚䂱㩍সᣒҕ붺籾ꅾü脎嘜踅퀳꾤腘辏됡櫿腆葟쉇矒⛭剘﩮⒏'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #12
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #15083
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #28252
/*    */     //   43: iconst_1
/*    */     //   44: iconst_0
/*    */     //   45: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 6713339971513874282
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: getfield a : Lme/konsolas/aac/bQ;
/*    */     //   76: getfield f : I
/*    */     //   79: aload_0
/*    */     //   80: getfield b : I
/*    */     //   83: isub
/*    */     //   84: istore #4
/*    */     //   86: iload_1
/*    */     //   87: iload #4
/*    */     //   89: if_icmpge -> 115
/*    */     //   92: aload_0
/*    */     //   93: dup
/*    */     //   94: getfield b : I
/*    */     //   97: iload_1
/*    */     //   98: iadd
/*    */     //   99: putfield b : I
/*    */     //   102: goto -> 129
/*    */     //   105: ldc2_w 6713339971513874282
/*    */     //   108: lload_2
/*    */     //   109: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   114: athrow
/*    */     //   115: iload #4
/*    */     //   117: istore_1
/*    */     //   118: aload_0
/*    */     //   119: aload_0
/*    */     //   120: getfield a : Lme/konsolas/aac/bQ;
/*    */     //   123: getfield f : I
/*    */     //   126: putfield b : I
/*    */     //   129: iload_1
/*    */     //   130: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #20	-> 72
/*    */     //   #25	-> 86
/*    */     //   #12	-> 92
/*    */     //   #26	-> 115
/*    */     //   #16	-> 118
/*    */     //   #21	-> 129
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*  3 */     //   86	105	105	java/util/NoSuchElementException } public boolean hasPrevious() { try {  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return (this.b > this.a.c); } public Object previous() {
/*    */     
/*  5 */     try { if (!hasPrevious()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return this.a.e[--this.b + this.a.c];
/*  6 */   } int b = this.c; final int c; final bQ a; private static final long d = nc.a(-4892254698983315317L, 2528764932500070502L, MethodHandles.lookup().lookupClass()).a(249210551508179L);
/*    */   public void remove() {
/*  8 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/m2.d : J
/*    */     //   3: ldc2_w 33685775012286
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '䨗⹞㰦寛ᘣ⪄ઈⲃ⚿䍘뙓釱Ͷд璔䠴ઐᆟ⩓䒒ܑᥗᴼ〘磆抰'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #28
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #3852
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #5758
/*    */     //   43: iconst_1
/*    */     //   44: iconst_1
/*    */     //   45: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 2954349682681152191
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: getfield a : Lme/konsolas/aac/bQ;
/*    */     //   76: getfield f : I
/*    */     //   79: aload_0
/*    */     //   80: getfield b : I
/*    */     //   83: isub
/*    */     //   84: istore #4
/*    */     //   86: iload_1
/*    */     //   87: iload #4
/*    */     //   89: if_icmpge -> 115
/*    */     //   92: aload_0
/*    */     //   93: dup
/*    */     //   94: getfield b : I
/*    */     //   97: iload_1
/*    */     //   98: isub
/*    */     //   99: putfield b : I
/*    */     //   102: goto -> 123
/*    */     //   105: ldc2_w 2954349682681152191
/*    */     //   108: lload_2
/*    */     //   109: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   114: athrow
/*    */     //   115: iload #4
/*    */     //   117: istore_1
/*    */     //   118: aload_0
/*    */     //   119: iconst_0
/*    */     //   120: putfield b : I
/*    */     //   123: iload_1
/*    */     //   124: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 8
/*    */     //   #14	-> 72
/*    */     //   #15	-> 86
/*    */     //   #11	-> 92
/*    */     //   #24	-> 115
/*    */     //   #13	-> 118
/*    */     //   #18	-> 123
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   86	105	105	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   public int nextIndex()
/*    */   {
/* 17 */     return this.b; } public Object next() {
/*    */     
/* 19 */     try { if (!hasNext()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return this.a.e[this.b++ + this.a.c];
/*    */   }
/*    */   
/* 22 */   public void set(Object paramObject) { throw new UnsupportedOperationException(); }
/* 23 */   public int previousIndex() { return this.b - 1; }
/*    */   public boolean hasNext() { 
/*    */     try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/* 27 */     { throw a(null); }  return (this.b < this.a.f); } public void forEachRemaining(Consumer<Object> paramConsumer) { try {
/* 28 */       while (this.b < this.a.f)
/*    */         paramConsumer.accept(this.a.e[this.b++ + this.a.c]); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     }  }
/*    */ 
/*    */   
/*    */   m2(bQ parambQ, int paramInt) {}
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\m2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */