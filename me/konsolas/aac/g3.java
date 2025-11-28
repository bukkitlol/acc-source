/*  1 */ package me.konsolas.aac;class g3 implements ea { public void forEachRemaining(Consumer<? super E> paramConsumer) { try { while (this.d > 0)
/*  2 */       { this.b[this.c = this.e].forEachRemaining(paramConsumer);
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
/* 16 */         a(); }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */      }
/*    */ 
/*    */ 
/*    */   
/*    */   final ea[] b;
/*    */   int e;
/*    */   int d;
/*    */   
/*    */   private void a() {
/*    */     while (true) {
/*    */       try {
/*    */         if (this.d != 0) {
/*    */           
/* 30 */           try { if (this.b[this.e].hasNext()) break;  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */ 
/*    */           
/* 33 */           this.d--;
/*    */           this.e++;
/*    */           continue;
/*    */         } 
/*    */       } catch (NoSuchElementException noSuchElementException) {
/*    */         throw a(null);
/*    */       } 
/*    */       break;
/*    */     } 
/*    */   }
/*    */   
/*    */   public Object next() {
/*    */     try {
/*    */       if (!hasNext())
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     E e = this.b[this.c = this.e].next();
/*    */     a();
/*    */     return e;
/*    */   }
/*    */   
/*    */   public int b(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/g3.a : J
/*    */     //   3: ldc2_w 115858589077736
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '嶪꫑畫鶨訣ʺ㾻?惃Ж芄䷑ာ잡㵕ꮱ莻∢匋㗟ợ迊繓鹅샺ᄼ蛍녳ҧሳ'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #18
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #13503
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #1919
/*    */     //   43: iconst_1
/*    */     //   44: iconst_0
/*    */     //   45: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 6704484863000209197
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: iconst_m1
/*    */     //   74: putfield c : I
/*    */     //   77: iconst_0
/*    */     //   78: istore #4
/*    */     //   80: iload #4
/*    */     //   82: iload_1
/*    */     //   83: if_icmpge -> 182
/*    */     //   86: aload_0
/*    */     //   87: getfield d : I
/*    */     //   90: ifeq -> 182
/*    */     //   93: goto -> 106
/*    */     //   96: ldc2_w 6704484863000209197
/*    */     //   99: lload_2
/*    */     //   100: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   105: athrow
/*    */     //   106: iload #4
/*    */     //   108: aload_0
/*    */     //   109: getfield b : [Lme/konsolas/aac/ea;
/*    */     //   112: aload_0
/*    */     //   113: getfield e : I
/*    */     //   116: aaload
/*    */     //   117: iload_1
/*    */     //   118: iload #4
/*    */     //   120: isub
/*    */     //   121: invokeinterface b : (I)I
/*    */     //   126: iadd
/*    */     //   127: istore #4
/*    */     //   129: aload_0
/*    */     //   130: getfield b : [Lme/konsolas/aac/ea;
/*    */     //   133: aload_0
/*    */     //   134: getfield e : I
/*    */     //   137: aaload
/*    */     //   138: invokeinterface hasNext : ()Z
/*    */     //   143: ifeq -> 159
/*    */     //   146: goto -> 182
/*    */     //   149: ldc2_w 6704484863000209197
/*    */     //   152: lload_2
/*    */     //   153: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   158: athrow
/*    */     //   159: aload_0
/*    */     //   160: dup
/*    */     //   161: getfield d : I
/*    */     //   164: iconst_1
/*    */     //   165: isub
/*    */     //   166: putfield d : I
/*    */     //   169: aload_0
/*    */     //   170: dup
/*    */     //   171: getfield e : I
/*    */     //   174: iconst_1
/*    */     //   175: iadd
/*    */     //   176: putfield e : I
/*    */     //   179: goto -> 80
/*    */     //   182: iload #4
/*    */     //   184: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 8
/*    */     //   #8	-> 72
/*    */     //   #22	-> 77
/*    */     //   #7	-> 80
/*    */     //   #31	-> 106
/*    */     //   #11	-> 129
/*    */     //   #18	-> 159
/*    */     //   #19	-> 169
/*    */     //   #5	-> 182
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   80	93	96	java/util/NoSuchElementException
/*    */     //   129	149	149	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   public g3(ea[] paramArrayOfea, int paramInt1, int paramInt2) {
/*    */     this.b = paramArrayOfea;
/*    */     this.e = paramInt1;
/*    */     this.d = paramInt2;
/*    */     a();
/*    */   }
/*    */   
/*    */   int c = -1;
/*    */   private static final long a = nc.a(-4834756449500707130L, -1250300027186032122L, MethodHandles.lookup().lookupClass()).a(199836343333833L);
/*    */   
/*    */   public boolean hasNext() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (this.d > 0);
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     try {
/*    */       if (this.c == -1)
/*    */         throw new IllegalStateException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.b[this.c].remove();
/*    */   }
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */