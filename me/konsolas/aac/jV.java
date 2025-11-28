/*    */ package me.konsolas.aac;final class jv implements cA, ho { private final fK c; private int b; private boolean a; private static final long d = nc.a(7027370535846329262L, -4783517712033134412L, MethodHandles.lookup().lookupClass()).a(194382320280287L);
/*    */   public boolean hasNext() {
/*    */     try {
/*    */       if (this.a)
/*    */         return true; 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     boolean bool = this.c.a(this);
/*    */     try {
/*    */       if (!bool)
/*    */         return false; 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.a = true;
/*    */     return true;
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Object paramObject) {
/*    */     forEachRemaining((IntConsumer)paramObject);
/*    */   }
/*    */   
/* 24 */   jv(fK paramfK) { this.b = 0;
/*    */ 
/*    */ 
/*    */     
/* 28 */     this.a = false; this.c = paramfK; } public int nextInt() { try { if (this.a) { this.a = false; return this.b; }
/*    */        }
/*    */     catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */      boolean bool = this.c.a(this); 
/* 32 */     try { if (!bool) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return this.b; }
/*    */   public int b(int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/jv.d : J
/*    */     //   3: ldc2_w 106007787501131
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '㑠詗鮠↺鰌΢狙닸滉郈?钒?ᯬ駈戻벿患?ャ嚡窐䟓곌⫰惑岌⟲✻ट'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #14
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #292
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #9508
/*    */     //   43: iconst_0
/*    */     //   44: iconst_0
/*    */     //   45: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 6677122400008601404
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: iconst_0
/*    */     //   73: istore #4
/*    */     //   75: aload_0
/*    */     //   76: getfield a : Z
/*    */     //   79: ifeq -> 117
/*    */     //   82: aload_0
/*    */     //   83: iconst_0
/*    */     //   84: putfield a : Z
/*    */     //   87: aload_0
/*    */     //   88: getfield c : Lme/konsolas/aac/fK;
/*    */     //   91: lconst_1
/*    */     //   92: invokeinterface a : (J)J
/*    */     //   97: pop2
/*    */     //   98: iinc #4, 1
/*    */     //   101: iinc #1, -1
/*    */     //   104: goto -> 117
/*    */     //   107: ldc2_w 6677122400008601404
/*    */     //   110: lload_2
/*    */     //   111: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   116: athrow
/*    */     //   117: iload_1
/*    */     //   118: ifle -> 140
/*    */     //   121: iload #4
/*    */     //   123: aload_0
/*    */     //   124: getfield c : Lme/konsolas/aac/fK;
/*    */     //   127: iload_1
/*    */     //   128: i2l
/*    */     //   129: invokeinterface a : (J)J
/*    */     //   134: invokestatic a : (J)I
/*    */     //   137: iadd
/*    */     //   138: istore #4
/*    */     //   140: iload #4
/*    */     //   142: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 8
/*    */     //   #16	-> 72
/*    */     //   #17	-> 75
/*    */     //   #13	-> 82
/*    */     //   #2	-> 87
/*    */     //   #29	-> 98
/*    */     //   #31	-> 101
/*    */     //   #27	-> 117
/*    */     //   #22	-> 121
/*    */     //   #11	-> 140
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/* 33 */     //   75	104	107	java/util/NoSuchElementException } public void accept(int paramInt) { this.b = paramInt; } public void forEachRemaining(IntConsumer paramIntConsumer) { try {
/* 34 */       if (this.a) {
/*    */         this.a = false;
/*    */         paramIntConsumer.accept(this.b);
/*    */       } 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.c.forEachRemaining(paramIntConsumer); }
/*    */ 
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */