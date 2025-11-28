/*    */ package me.konsolas.aac;class fp implements cA {
/*    */   public void remove() {
/*  3 */     int i = aQ.a(this.a) - this.b--;
/*    */     System.arraycopy(aQ.a(this.a), this.b + 1, aQ.a(this.a), this.b, i);
/*    */   }
/*    */   public int nextInt() { 
/*  7 */     try { if (!hasNext()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */      return aQ.a(this.a)[this.b++]; } public boolean hasNext() { 
/*    */     try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/* 11 */     { throw a(null); }  return (this.b < aQ.b(this.a)); }
/*    */   
/*    */   public int b(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fp.c : J
/*    */     //   3: ldc2_w 107928280216441
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '뷩仂㉿䫱ᶳ䙛珠?澃ꐂ旖癦३뎹ؽ滰셗䂛♱盒ꥈ耨꼇멞䅃쐚ᝂ'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #10
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #2722
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #19909
/*    */     //   43: iconst_0
/*    */     //   44: iconst_3
/*    */     //   45: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 6716371214916822196
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: getfield a : Lme/konsolas/aac/aQ;
/*    */     //   76: invokestatic b : (Lme/konsolas/aac/aQ;)I
/*    */     //   79: aload_0
/*    */     //   80: getfield b : I
/*    */     //   83: isub
/*    */     //   84: istore #4
/*    */     //   86: iload_1
/*    */     //   87: iload #4
/*    */     //   89: if_icmpge -> 114
/*    */     //   92: aload_0
/*    */     //   93: dup
/*    */     //   94: getfield b : I
/*    */     //   97: iload_1
/*    */     //   98: iadd
/*    */     //   99: putfield b : I
/*    */     //   102: iload_1
/*    */     //   103: ireturn
/*    */     //   104: ldc2_w 6716371214916822196
/*    */     //   107: lload_2
/*    */     //   108: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   113: athrow
/*    */     //   114: iload #4
/*    */     //   116: istore_1
/*    */     //   117: aload_0
/*    */     //   118: aload_0
/*    */     //   119: getfield a : Lme/konsolas/aac/aQ;
/*    */     //   122: invokestatic b : (Lme/konsolas/aac/aQ;)I
/*    */     //   125: putfield b : I
/*    */     //   128: iload_1
/*    */     //   129: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 8
/*    */     //   #9	-> 72
/*    */     //   #6	-> 86
/*    */     //   #12	-> 92
/*    */     //   #8	-> 102
/*    */     //   #14	-> 114
/*    */     //   #5	-> 117
/*    */     //   #2	-> 128
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   86	104	104	java/util/NoSuchElementException
/*    */   }
/* 16 */   int b = 0;
/*    */   final aQ a;
/*    */   private static final long c = nc.a(-4050692257577654829L, -3937174330187902634L, MethodHandles.lookup().lookupClass()).a(38858263563437L);
/*    */   
/*    */   fp(aQ paramaQ) {}
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */