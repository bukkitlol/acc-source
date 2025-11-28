/*    */ package me.konsolas.aac;final class mv implements ae { int a; int c; static final boolean b; final b5 d;
/*    */   public long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mv.e : J
/*    */     //   3: ldc2_w 138344411013162
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
/*    */     //   25: ldc '諲煯뗸眗犂ᖌ䧽꘵旊热䰉덤鯚춰왩⸫??謑麀픰䒕깸瞇率染擙殕鮎ዻ'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #26
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #32699
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #8526
/*    */     //   45: iconst_0
/*    */     //   46: iconst_0
/*    */     //   47: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5084567137315477421
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: getfield a : I
/*    */     //   78: aload_0
/*    */     //   79: getfield c : I
/*    */     //   82: if_icmplt -> 97
/*    */     //   85: lconst_0
/*    */     //   86: lreturn
/*    */     //   87: ldc2_w 5084567137315477421
/*    */     //   90: lload_3
/*    */     //   91: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   96: athrow
/*    */     //   97: aload_0
/*    */     //   98: getfield c : I
/*    */     //   101: aload_0
/*    */     //   102: getfield a : I
/*    */     //   105: isub
/*    */     //   106: istore #5
/*    */     //   108: lload_1
/*    */     //   109: iload #5
/*    */     //   111: i2l
/*    */     //   112: lcmp
/*    */     //   113: ifge -> 142
/*    */     //   116: aload_0
/*    */     //   117: aload_0
/*    */     //   118: getfield a : I
/*    */     //   121: i2l
/*    */     //   122: lload_1
/*    */     //   123: ladd
/*    */     //   124: invokestatic a : (J)I
/*    */     //   127: putfield a : I
/*    */     //   130: lload_1
/*    */     //   131: lreturn
/*    */     //   132: ldc2_w 5084567137315477421
/*    */     //   135: lload_3
/*    */     //   136: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   141: athrow
/*    */     //   142: iload #5
/*    */     //   144: i2l
/*    */     //   145: lstore_1
/*    */     //   146: aload_0
/*    */     //   147: aload_0
/*    */     //   148: getfield c : I
/*    */     //   151: putfield a : I
/*    */     //   154: lload_1
/*    */     //   155: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #3	-> 8
/*    */     //   #20	-> 74
/*    */     //   #12	-> 97
/*    */     //   #8	-> 108
/*    */     //   #29	-> 116
/*    */     //   #11	-> 130
/*    */     //   #4	-> 142
/*    */     //   #28	-> 146
/*    */     //   #9	-> 154
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IllegalArgumentException
/*    */     //   74	87	87	java/lang/IllegalArgumentException
/*    */     //   108	132	132	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*  6 */   public int characteristics() { return 17488; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private mv(b5 paramb5, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mv.e : J
/*    */     //   3: ldc2_w 101372207839117
/*    */     //   6: lxor
/*    */     //   7: lstore #4
/*    */     //   9: aload_0
/*    */     //   10: aload_1
/*    */     //   11: putfield d : Lme/konsolas/aac/b5;
/*    */     //   14: aload_0
/*    */     //   15: invokespecial <init> : ()V
/*    */     //   18: getstatic me/konsolas/aac/mv.b : Z
/*    */     //   21: ifne -> 121
/*    */     //   24: iload_2
/*    */     //   25: iload_3
/*    */     //   26: if_icmple -> 121
/*    */     //   29: new java/lang/AssertionError
/*    */     //   32: dup
/*    */     //   33: new java/lang/StringBuilder
/*    */     //   36: dup
/*    */     //   37: invokespecial <init> : ()V
/*    */     //   40: ldc 'Ꮃ嚱孥ᮬ'
/*    */     //   42: invokevirtual toCharArray : ()[C
/*    */     //   45: dup
/*    */     //   46: dup
/*    */     //   47: iconst_2
/*    */     //   48: dup_x1
/*    */     //   49: caload
/*    */     //   50: sipush #4697
/*    */     //   53: ixor
/*    */     //   54: i2c
/*    */     //   55: castore
/*    */     //   56: sipush #6942
/*    */     //   59: iconst_0
/*    */     //   60: iconst_1
/*    */     //   61: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   67: iload_2
/*    */     //   68: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   71: ldc '哚氖ϐ엒끒嚷锆Ἱ쉃蕀掗⧙᝻'
/*    */     //   73: invokevirtual toCharArray : ()[C
/*    */     //   76: dup
/*    */     //   77: dup
/*    */     //   78: bipush #11
/*    */     //   80: dup_x1
/*    */     //   81: caload
/*    */     //   82: sipush #4924
/*    */     //   85: ixor
/*    */     //   86: i2c
/*    */     //   87: castore
/*    */     //   88: sipush #1465
/*    */     //   91: iconst_1
/*    */     //   92: iconst_0
/*    */     //   93: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   99: iload_3
/*    */     //   100: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   103: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   106: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   109: athrow
/*    */     //   110: ldc2_w -3371187042181857270
/*    */     //   113: lload #4
/*    */     //   115: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   120: athrow
/*    */     //   121: aload_0
/*    */     //   122: iload_2
/*    */     //   123: putfield a : I
/*    */     //   126: aload_0
/*    */     //   127: iload_3
/*    */     //   128: putfield c : I
/*    */     //   131: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 9
/*    */     //   #16	-> 18
/*    */     //   #10	-> 121
/*    */     //   #33	-> 126
/*    */     //   #1	-> 131
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   24	110	110	java/lang/IllegalArgumentException
/*    */   }
/*    */ 
/*    */   
/*    */   public void forEachRemaining(Consumer<Object> paramConsumer) {
/*    */     
/* 18 */     try { for (; this.a < this.c; 
/*    */ 
/*    */ 
/*    */         
/* 22 */         this.a++)
/*    */       {
/*    */ 
/*    */ 
/*    */         
/* 27 */         paramConsumer.accept(b5.a(this.d)[this.a]); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); } 
/*    */   }
/*    */   public ae a() { int i = this.c - this.a >> 1; try { if (i <= 1) return null;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int j = this.a + i; int k = j; int m = this.a; this.a = j; return new mv(this.d, m, k); }
/* 30 */   public long estimateSize() { return (this.c - this.a); } public Spliterator trySplit() { return a(); } public mv(b5 paramb5) { this(paramb5, 0, (b5.a(paramb5)).length); } public boolean tryAdvance(Consumer<Object> paramConsumer) { 
/* 31 */     try { if (this.a >= this.c) return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/* 32 */      paramConsumer.accept(b5.a(this.d)[this.a++]);
/*    */     return true; }
/* 34 */    private static final long e = nc.a(-4074908720895078024L, 4067927487853941362L, MethodHandles.lookup().lookupClass()).a(165305986905791L); static { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  b = !b5.class.desiredAssertionStatus(); }
/*    */ 
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */