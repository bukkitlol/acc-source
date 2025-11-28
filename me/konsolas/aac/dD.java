/*    */ package me.konsolas.aac;
/*    */ abstract class dd {
/*  3 */   int b = -1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void remove() {
/*    */     
/* 11 */     try { if (this.b == -1) throw new IllegalStateException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 33 */       if (this.b == this.e.o) {
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
/*    */ 
/*    */ 
/*    */         
/* 65 */         this.e.k = false;
/*    */         this.e.q[this.e.o] = null;
/*    */       } 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     try {
/*    */       if (this.a >= 0) {
/*    */         a(this.b);
/*    */       } else {
/*    */         this.e.b(this.d.b(-this.a - 1));
/*    */         this.b = -1;
/*    */         return;
/*    */       } 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.e.r--;
/*    */     this.b = -1;
/*    */   }
/*    */   
/*    */   dd(ip paramip, bu parambu) {
/*    */     this(paramip);
/*    */   }
/*    */   
/*    */   private void a(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield e : Lme/konsolas/aac/ip;
/*    */     //   4: getfield t : [I
/*    */     //   7: astore #5
/*    */     //   9: iload_1
/*    */     //   10: dup
/*    */     //   11: istore_2
/*    */     //   12: iconst_1
/*    */     //   13: iadd
/*    */     //   14: aload_0
/*    */     //   15: getfield e : Lme/konsolas/aac/ip;
/*    */     //   18: getfield v : I
/*    */     //   21: iand
/*    */     //   22: istore_1
/*    */     //   23: aload #5
/*    */     //   25: iload_1
/*    */     //   26: iaload
/*    */     //   27: dup
/*    */     //   28: istore #4
/*    */     //   30: ifne -> 53
/*    */     //   33: aload #5
/*    */     //   35: iload_2
/*    */     //   36: iconst_0
/*    */     //   37: iastore
/*    */     //   38: aload_0
/*    */     //   39: getfield e : Lme/konsolas/aac/ip;
/*    */     //   42: getfield q : [Ljava/lang/Object;
/*    */     //   45: iload_2
/*    */     //   46: aconst_null
/*    */     //   47: aastore
/*    */     //   48: return
/*    */     //   49: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   52: athrow
/*    */     //   53: iload #4
/*    */     //   55: invokestatic c : (I)I
/*    */     //   58: aload_0
/*    */     //   59: getfield e : Lme/konsolas/aac/ip;
/*    */     //   62: getfield v : I
/*    */     //   65: iand
/*    */     //   66: istore_3
/*    */     //   67: iload_2
/*    */     //   68: iload_1
/*    */     //   69: if_icmpgt -> 103
/*    */     //   72: iload_2
/*    */     //   73: iload_3
/*    */     //   74: if_icmpge -> 142
/*    */     //   77: goto -> 84
/*    */     //   80: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   83: athrow
/*    */     //   84: iload_3
/*    */     //   85: iload_1
/*    */     //   86: if_icmple -> 127
/*    */     //   89: goto -> 96
/*    */     //   92: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   95: athrow
/*    */     //   96: goto -> 142
/*    */     //   99: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   102: athrow
/*    */     //   103: iload_2
/*    */     //   104: iload_3
/*    */     //   105: if_icmplt -> 127
/*    */     //   108: iload_3
/*    */     //   109: iload_1
/*    */     //   110: if_icmple -> 127
/*    */     //   113: goto -> 120
/*    */     //   116: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   119: athrow
/*    */     //   120: goto -> 142
/*    */     //   123: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   126: athrow
/*    */     //   127: iload_1
/*    */     //   128: iconst_1
/*    */     //   129: iadd
/*    */     //   130: aload_0
/*    */     //   131: getfield e : Lme/konsolas/aac/ip;
/*    */     //   134: getfield v : I
/*    */     //   137: iand
/*    */     //   138: istore_1
/*    */     //   139: goto -> 23
/*    */     //   142: iload_1
/*    */     //   143: iload_2
/*    */     //   144: if_icmpge -> 192
/*    */     //   147: aload_0
/*    */     //   148: getfield d : Lme/konsolas/aac/Z;
/*    */     //   151: ifnonnull -> 180
/*    */     //   154: goto -> 161
/*    */     //   157: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   160: athrow
/*    */     //   161: aload_0
/*    */     //   162: new me/konsolas/aac/Z
/*    */     //   165: dup
/*    */     //   166: iconst_2
/*    */     //   167: invokespecial <init> : (I)V
/*    */     //   170: putfield d : Lme/konsolas/aac/Z;
/*    */     //   173: goto -> 180
/*    */     //   176: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   179: athrow
/*    */     //   180: aload_0
/*    */     //   181: getfield d : Lme/konsolas/aac/Z;
/*    */     //   184: aload #5
/*    */     //   186: iload_1
/*    */     //   187: iaload
/*    */     //   188: invokevirtual a : (I)Z
/*    */     //   191: pop
/*    */     //   192: aload #5
/*    */     //   194: iload_2
/*    */     //   195: iload #4
/*    */     //   197: iastore
/*    */     //   198: aload_0
/*    */     //   199: getfield e : Lme/konsolas/aac/ip;
/*    */     //   202: getfield q : [Ljava/lang/Object;
/*    */     //   205: iload_2
/*    */     //   206: aload_0
/*    */     //   207: getfield e : Lme/konsolas/aac/ip;
/*    */     //   210: getfield q : [Ljava/lang/Object;
/*    */     //   213: iload_1
/*    */     //   214: aaload
/*    */     //   215: aastore
/*    */     //   216: goto -> 9
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 0
/*    */     //   #10	-> 9
/*    */     //   #53	-> 23
/*    */     //   #32	-> 33
/*    */     //   #45	-> 38
/*    */     //   #40	-> 48
/*    */     //   #44	-> 53
/*    */     //   #30	-> 67
/*    */     //   #31	-> 127
/*    */     //   #61	-> 142
/*    */     //   #49	-> 147
/*    */     //   #36	-> 180
/*    */     //   #63	-> 192
/*    */     //   #59	-> 198
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   30	49	49	java/util/NoSuchElementException
/*    */     //   67	77	80	java/util/NoSuchElementException
/*    */     //   72	89	92	java/util/NoSuchElementException
/*    */     //   84	99	99	java/util/NoSuchElementException
/*    */     //   103	113	116	java/util/NoSuchElementException
/*    */     //   108	123	123	java/util/NoSuchElementException
/*    */     //   142	154	157	java/util/NoSuchElementException
/*    */     //   147	173	176	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   public int b(int paramInt) {
/*    */     int i = paramInt;
/*    */     while (true) {
/*    */       try {
/*    */         if (i-- != 0)
/*    */           try {
/*    */             if (hasNext()) {
/*    */               a();
/*    */               continue;
/*    */             } 
/*    */           } catch (NoSuchElementException noSuchElementException) {
/*    */             throw a(null);
/*    */           }  
/*    */       } catch (NoSuchElementException noSuchElementException) {
/*    */         throw a(null);
/*    */       } 
/*    */       break;
/*    */     } 
/*    */     return paramInt - i - 1;
/*    */   }
/*    */   
/*    */   public int a() {
/*    */     try {
/*    */       if (!hasNext())
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     try {
/*    */       this.f--;
/*    */       if (this.c) {
/*    */         this.c = false;
/*    */         return this.b = this.e.o;
/*    */       } 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     int[] arrayOfInt = this.e.t;
/*    */     while (true) {
/*    */       if (--this.a < 0) {
/*    */         this.b = Integer.MIN_VALUE;
/*    */         int i = this.d.b(-this.a - 1);
/*    */         int j = i3.c(i) & this.e.v;
/*    */         for (; i != arrayOfInt[j]; j = j + 1 & this.e.v);
/*    */         return j;
/*    */       } 
/*    */       if (arrayOfInt[this.a] != 0)
/*    */         return this.b = this.a; 
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (this.f != 0);
/*    */   }
/*    */   
/*    */   int a = this.e.o;
/*    */   
/*    */   public void forEachRemaining(Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield c : Z
/*    */     //   4: ifeq -> 46
/*    */     //   7: aload_0
/*    */     //   8: iconst_0
/*    */     //   9: putfield c : Z
/*    */     //   12: aload_0
/*    */     //   13: aload_1
/*    */     //   14: aload_0
/*    */     //   15: aload_0
/*    */     //   16: getfield e : Lme/konsolas/aac/ip;
/*    */     //   19: getfield o : I
/*    */     //   22: dup_x1
/*    */     //   23: putfield b : I
/*    */     //   26: invokevirtual a : (Ljava/lang/Object;I)V
/*    */     //   29: aload_0
/*    */     //   30: dup
/*    */     //   31: getfield f : I
/*    */     //   34: iconst_1
/*    */     //   35: isub
/*    */     //   36: putfield f : I
/*    */     //   39: goto -> 46
/*    */     //   42: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   45: athrow
/*    */     //   46: aload_0
/*    */     //   47: getfield e : Lme/konsolas/aac/ip;
/*    */     //   50: getfield t : [I
/*    */     //   53: astore_2
/*    */     //   54: aload_0
/*    */     //   55: getfield f : I
/*    */     //   58: ifeq -> 198
/*    */     //   61: aload_0
/*    */     //   62: dup
/*    */     //   63: getfield a : I
/*    */     //   66: iconst_1
/*    */     //   67: isub
/*    */     //   68: dup_x1
/*    */     //   69: putfield a : I
/*    */     //   72: ifge -> 162
/*    */     //   75: goto -> 82
/*    */     //   78: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   81: athrow
/*    */     //   82: aload_0
/*    */     //   83: ldc -2147483648
/*    */     //   85: putfield b : I
/*    */     //   88: aload_0
/*    */     //   89: getfield d : Lme/konsolas/aac/Z;
/*    */     //   92: aload_0
/*    */     //   93: getfield a : I
/*    */     //   96: ineg
/*    */     //   97: iconst_1
/*    */     //   98: isub
/*    */     //   99: invokevirtual b : (I)I
/*    */     //   102: istore_3
/*    */     //   103: iload_3
/*    */     //   104: invokestatic c : (I)I
/*    */     //   107: aload_0
/*    */     //   108: getfield e : Lme/konsolas/aac/ip;
/*    */     //   111: getfield v : I
/*    */     //   114: iand
/*    */     //   115: istore #4
/*    */     //   117: iload_3
/*    */     //   118: aload_2
/*    */     //   119: iload #4
/*    */     //   121: iaload
/*    */     //   122: if_icmpeq -> 142
/*    */     //   125: iload #4
/*    */     //   127: iconst_1
/*    */     //   128: iadd
/*    */     //   129: aload_0
/*    */     //   130: getfield e : Lme/konsolas/aac/ip;
/*    */     //   133: getfield v : I
/*    */     //   136: iand
/*    */     //   137: istore #4
/*    */     //   139: goto -> 117
/*    */     //   142: aload_0
/*    */     //   143: aload_1
/*    */     //   144: iload #4
/*    */     //   146: invokevirtual a : (Ljava/lang/Object;I)V
/*    */     //   149: aload_0
/*    */     //   150: dup
/*    */     //   151: getfield f : I
/*    */     //   154: iconst_1
/*    */     //   155: isub
/*    */     //   156: putfield f : I
/*    */     //   159: goto -> 54
/*    */     //   162: aload_2
/*    */     //   163: aload_0
/*    */     //   164: getfield a : I
/*    */     //   167: iaload
/*    */     //   168: ifeq -> 54
/*    */     //   171: aload_0
/*    */     //   172: aload_1
/*    */     //   173: aload_0
/*    */     //   174: aload_0
/*    */     //   175: getfield a : I
/*    */     //   178: dup_x1
/*    */     //   179: putfield b : I
/*    */     //   182: invokevirtual a : (Ljava/lang/Object;I)V
/*    */     //   185: aload_0
/*    */     //   186: dup
/*    */     //   187: getfield f : I
/*    */     //   190: iconst_1
/*    */     //   191: isub
/*    */     //   192: putfield f : I
/*    */     //   195: goto -> 54
/*    */     //   198: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #57	-> 0
/*    */     //   #42	-> 7
/*    */     //   #62	-> 12
/*    */     //   #35	-> 29
/*    */     //   #14	-> 46
/*    */     //   #6	-> 54
/*    */     //   #43	-> 61
/*    */     //   #5	-> 82
/*    */     //   #51	-> 88
/*    */     //   #24	-> 103
/*    */     //   #37	-> 117
/*    */     //   #25	-> 142
/*    */     //   #29	-> 149
/*    */     //   #38	-> 159
/*    */     //   #56	-> 171
/*    */     //   #13	-> 185
/*    */     //   #39	-> 198
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	39	42	java/util/NoSuchElementException
/*    */     //   54	75	78	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   boolean c = this.e.k;
/*    */   int f = this.e.r;
/*    */   Z d;
/*    */   final ip e;
/*    */   
/*    */   private dd(ip paramip) {}
/*    */   
/*    */   abstract void a(Object paramObject, int paramInt);
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */