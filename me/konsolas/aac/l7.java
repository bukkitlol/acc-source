/*    */ package me.konsolas.aac;public abstract class l7 extends lC implements i0 { public boolean hasPrevious() { 
/*    */     try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/*  4 */     { throw a(null); }  return (this.c > this.b); }
/*    */   
/*    */   private static final long g = nc.a(1424527805825241940L, -3872074805020821974L, MethodHandles.lookup().lookupClass()).a(204911473401315L);
/*    */   public void set(Object paramObject) {
/*    */     
/*  9 */     try { if (this.a == -1) throw new IllegalStateException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */     
/*    */     a(this.a, paramObject);
/*    */   } public int a(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/l7.g : J
/*    */     //   3: ldc2_w 83267516283477
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 71
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '䋁휉ﯫ쀬쏎㘨勜컸淤䟼놴ޘ﭅閭簝ћ龜ᶠކ뺀醶帆ᦾ?Ⳛ엘ꒆ捡Н'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: iconst_1
/*    */     //   31: dup_x1
/*    */     //   32: caload
/*    */     //   33: sipush #693
/*    */     //   36: ixor
/*    */     //   37: i2c
/*    */     //   38: castore
/*    */     //   39: sipush #8531
/*    */     //   42: iconst_0
/*    */     //   43: iconst_3
/*    */     //   44: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   50: iload_1
/*    */     //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   54: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   57: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   60: athrow
/*    */     //   61: ldc2_w 2957402459241062540
/*    */     //   64: lload_2
/*    */     //   65: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   70: athrow
/*    */     //   71: aload_0
/*    */     //   72: getfield c : I
/*    */     //   75: aload_0
/*    */     //   76: getfield b : I
/*    */     //   79: isub
/*    */     //   80: istore #4
/*    */     //   82: iload_1
/*    */     //   83: iload #4
/*    */     //   85: if_icmpge -> 111
/*    */     //   88: aload_0
/*    */     //   89: dup
/*    */     //   90: getfield c : I
/*    */     //   93: iload_1
/*    */     //   94: isub
/*    */     //   95: putfield c : I
/*    */     //   98: goto -> 122
/*    */     //   101: ldc2_w 2957402459241062540
/*    */     //   104: lload_2
/*    */     //   105: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   110: athrow
/*    */     //   111: iload #4
/*    */     //   113: istore_1
/*    */     //   114: aload_0
/*    */     //   115: aload_0
/*    */     //   116: getfield b : I
/*    */     //   119: putfield c : I
/*    */     //   122: aload_0
/*    */     //   123: aload_0
/*    */     //   124: getfield c : I
/*    */     //   127: putfield a : I
/*    */     //   130: iload_1
/*    */     //   131: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 8
/*    */     //   #11	-> 71
/*    */     //   #8	-> 82
/*    */     //   #2	-> 88
/*    */     //   #10	-> 111
/*    */     //   #12	-> 114
/*    */     //   #6	-> 122
/*    */     //   #20	-> 130
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	61	61	java/util/NoSuchElementException
/*    */     //   82	101	101	java/util/NoSuchElementException
/* 14 */   } protected l7(int paramInt1, int paramInt2) { super(paramInt1, paramInt2); } public Object previous() { 
/* 15 */     try { if (!hasPrevious()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return a(this.a = --this.c); }
/*    */   
/* 17 */   public int nextIndex() { return this.c; }
/* 18 */   public int previousIndex() { return this.c - 1; } public void add(Object paramObject) {
/* 19 */     b(this.c++, paramObject);
/*    */     this.a = -1;
/*    */   }
/*    */   
/*    */   protected abstract void b(int paramInt, Object paramObject);
/*    */   
/*    */   protected abstract void a(int paramInt, Object paramObject);
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */