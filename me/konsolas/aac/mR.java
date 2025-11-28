/*    */ package me.konsolas.aac;
/*    */ public final class mr { public mr a(long paramLong, J paramJ) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mr.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: iconst_0
/*    */     //   7: istore #5
/*    */     //   9: ldc2_w 1117613496608821056
/*    */     //   12: lload_1
/*    */     //   13: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   18: aload_3
/*    */     //   19: invokevirtual a : ()I
/*    */     //   22: istore #6
/*    */     //   24: astore #4
/*    */     //   26: iload #5
/*    */     //   28: iload #6
/*    */     //   30: if_icmpge -> 88
/*    */     //   33: lload_1
/*    */     //   34: lconst_0
/*    */     //   35: lcmp
/*    */     //   36: iflt -> 64
/*    */     //   39: aload_0
/*    */     //   40: aload_3
/*    */     //   41: iload #5
/*    */     //   43: invokevirtual a : (I)Ljava/lang/String;
/*    */     //   46: aload_3
/*    */     //   47: iload #5
/*    */     //   49: invokevirtual b : (I)Ljava/lang/String;
/*    */     //   52: invokevirtual c : (Ljava/lang/String;Ljava/lang/String;)Lme/konsolas/aac/mr;
/*    */     //   55: aload #4
/*    */     //   57: ifnonnull -> 89
/*    */     //   60: pop
/*    */     //   61: iinc #5, 1
/*    */     //   64: aload #4
/*    */     //   66: ifnull -> 26
/*    */     //   69: lload_1
/*    */     //   70: lconst_0
/*    */     //   71: lcmp
/*    */     //   72: iflt -> 33
/*    */     //   75: goto -> 88
/*    */     //   78: ldc2_w 1032412730740994739
/*    */     //   81: lload_1
/*    */     //   82: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   87: athrow
/*    */     //   88: aload_0
/*    */     //   89: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 6
/*    */     //   #35	-> 33
/*    */     //   #32	-> 61
/*    */     //   #14	-> 88
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   33	69	78	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*  6 */   mr c(String paramString1, String paramString2) { this.a.add(paramString1);
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
/* 49 */     this.a.add(paramString2.trim()); return this; }
/*    */   mr a(String paramString, long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mr.b : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w 5835417619812536377
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   15: aload_1
/*    */     //   16: ldc '⧝㻤'
/*    */     //   18: invokevirtual toCharArray : ()[C
/*    */     //   21: dup
/*    */     //   22: dup
/*    */     //   23: iconst_0
/*    */     //   24: dup_x1
/*    */     //   25: caload
/*    */     //   26: sipush #31420
/*    */     //   29: ixor
/*    */     //   30: i2c
/*    */     //   31: castore
/*    */     //   32: sipush #31755
/*    */     //   35: iconst_1
/*    */     //   36: iconst_1
/*    */     //   37: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   40: iconst_1
/*    */     //   41: invokevirtual indexOf : (Ljava/lang/String;I)I
/*    */     //   44: istore #5
/*    */     //   46: astore #4
/*    */     //   48: iload #5
/*    */     //   50: aload #4
/*    */     //   52: ifnonnull -> 130
/*    */     //   55: iconst_m1
/*    */     //   56: if_icmpeq -> 102
/*    */     //   59: goto -> 72
/*    */     //   62: ldc2_w 5848701527503285706
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: aload_1
/*    */     //   74: iconst_0
/*    */     //   75: iload #5
/*    */     //   77: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   80: aload_1
/*    */     //   81: iload #5
/*    */     //   83: iconst_1
/*    */     //   84: iadd
/*    */     //   85: invokevirtual substring : (I)Ljava/lang/String;
/*    */     //   88: invokevirtual c : (Ljava/lang/String;Ljava/lang/String;)Lme/konsolas/aac/mr;
/*    */     //   91: areturn
/*    */     //   92: ldc2_w 5848701527503285706
/*    */     //   95: lload_2
/*    */     //   96: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   101: athrow
/*    */     //   102: aload_1
/*    */     //   103: ldc 'ꉔ痖'
/*    */     //   105: invokevirtual toCharArray : ()[C
/*    */     //   108: dup
/*    */     //   109: dup
/*    */     //   110: iconst_0
/*    */     //   111: dup_x1
/*    */     //   112: caload
/*    */     //   113: sipush #10234
/*    */     //   116: ixor
/*    */     //   117: i2c
/*    */     //   118: castore
/*    */     //   119: sipush #26272
/*    */     //   122: iconst_1
/*    */     //   123: iconst_1
/*    */     //   124: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   127: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   130: ifeq -> 155
/*    */     //   133: aload_0
/*    */     //   134: ldc ''
/*    */     //   136: aload_1
/*    */     //   137: iconst_1
/*    */     //   138: invokevirtual substring : (I)Ljava/lang/String;
/*    */     //   141: invokevirtual c : (Ljava/lang/String;Ljava/lang/String;)Lme/konsolas/aac/mr;
/*    */     //   144: areturn
/*    */     //   145: ldc2_w 5848701527503285706
/*    */     //   148: lload_2
/*    */     //   149: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   154: athrow
/*    */     //   155: aload_0
/*    */     //   156: ldc ''
/*    */     //   158: aload_1
/*    */     //   159: invokevirtual c : (Ljava/lang/String;Ljava/lang/String;)Lme/konsolas/aac/mr;
/*    */     //   162: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 15
/*    */     //   #20	-> 48
/*    */     //   #15	-> 72
/*    */     //   #23	-> 102
/*    */     //   #4	-> 133
/*    */     //   #28	-> 155
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   48	59	62	java/lang/IllegalArgumentException
/*    */     //   55	92	92	java/lang/IllegalArgumentException
/*    */     //   130	145	145	java/lang/IllegalArgumentException } public mr b(long paramLong, String paramString) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mr.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 32129242847915
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: aload_3
/*    */     //   16: ldc '亢'
/*    */     //   18: invokevirtual toCharArray : ()[C
/*    */     //   21: dup
/*    */     //   22: dup
/*    */     //   23: iconst_0
/*    */     //   24: dup_x1
/*    */     //   25: caload
/*    */     //   26: sipush #21418
/*    */     //   29: ixor
/*    */     //   30: i2c
/*    */     //   31: castore
/*    */     //   32: sipush #23516
/*    */     //   35: iconst_0
/*    */     //   36: iconst_0
/*    */     //   37: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   40: invokevirtual indexOf : (Ljava/lang/String;)I
/*    */     //   43: istore #6
/*    */     //   45: iload #6
/*    */     //   47: iconst_m1
/*    */     //   48: if_icmpne -> 99
/*    */     //   51: new java/lang/IllegalArgumentException
/*    */     //   54: dup
/*    */     //   55: new java/lang/StringBuilder
/*    */     //   58: dup
/*    */     //   59: invokespecial <init> : ()V
/*    */     //   62: sipush #12805
/*    */     //   65: ldc2_w 5865840574584761249
/*    */     //   68: lload_1
/*    */     //   69: lxor
/*    */     //   70: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   78: aload_3
/*    */     //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   82: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   85: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   88: athrow
/*    */     //   89: ldc2_w 5427950800235345843
/*    */     //   92: lload_1
/*    */     //   93: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   98: athrow
/*    */     //   99: aload_0
/*    */     //   100: aload_3
/*    */     //   101: iconst_0
/*    */     //   102: iload #6
/*    */     //   104: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   107: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   110: aload_3
/*    */     //   111: iload #6
/*    */     //   113: iconst_1
/*    */     //   114: iadd
/*    */     //   115: invokevirtual substring : (I)Ljava/lang/String;
/*    */     //   118: lload #4
/*    */     //   120: invokevirtual d : (Ljava/lang/String;Ljava/lang/String;J)Lme/konsolas/aac/mr;
/*    */     //   123: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 15
/*    */     //   #29	-> 45
/*    */     //   #34	-> 51
/*    */     //   #33	-> 99
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   45	89	89	java/lang/IllegalArgumentException } public mr a(String paramString, Date paramDate, long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mr.b : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: lload_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 27436371956045
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: ldc2_w 4712071255989764518
/*    */     //   18: lload_3
/*    */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   24: astore #7
/*    */     //   26: aload #7
/*    */     //   28: ifnonnull -> 124
/*    */     //   31: aload_2
/*    */     //   32: ifnonnull -> 112
/*    */     //   35: goto -> 48
/*    */     //   38: ldc2_w 4662898736580279381
/*    */     //   41: lload_3
/*    */     //   42: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   47: athrow
/*    */     //   48: new java/lang/NullPointerException
/*    */     //   51: dup
/*    */     //   52: new java/lang/StringBuilder
/*    */     //   55: dup
/*    */     //   56: invokespecial <init> : ()V
/*    */     //   59: sipush #15491
/*    */     //   62: ldc2_w 5357637200420843203
/*    */     //   65: lload_3
/*    */     //   66: lxor
/*    */     //   67: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   75: aload_1
/*    */     //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   79: sipush #29589
/*    */     //   82: ldc2_w 1262972885017321940
/*    */     //   85: lload_3
/*    */     //   86: lxor
/*    */     //   87: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   98: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   101: athrow
/*    */     //   102: ldc2_w 4662898736580279381
/*    */     //   105: lload_3
/*    */     //   106: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   111: athrow
/*    */     //   112: aload_0
/*    */     //   113: aload_1
/*    */     //   114: aload_2
/*    */     //   115: invokestatic a : (Ljava/util/Date;)Ljava/lang/String;
/*    */     //   118: lload #5
/*    */     //   120: invokevirtual d : (Ljava/lang/String;Ljava/lang/String;J)Lme/konsolas/aac/mr;
/*    */     //   123: pop
/*    */     //   124: aload_0
/*    */     //   125: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 26
/*    */     //   #41	-> 112
/*    */     //   #26	-> 124
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	35	38	java/lang/IllegalArgumentException
/*    */     //   31	102	102	java/lang/IllegalArgumentException } public mr b(String paramString, long paramLong, Date paramDate) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mr.b : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 29058792899277
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -5762462612567117627
/*    */     //   18: lload_2
/*    */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   24: astore #7
/*    */     //   26: aload #7
/*    */     //   28: ifnonnull -> 126
/*    */     //   31: aload #4
/*    */     //   33: ifnonnull -> 113
/*    */     //   36: goto -> 49
/*    */     //   39: ldc2_w -5632089237448635082
/*    */     //   42: lload_2
/*    */     //   43: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   48: athrow
/*    */     //   49: new java/lang/NullPointerException
/*    */     //   52: dup
/*    */     //   53: new java/lang/StringBuilder
/*    */     //   56: dup
/*    */     //   57: invokespecial <init> : ()V
/*    */     //   60: sipush #23895
/*    */     //   63: ldc2_w 4354134081731706482
/*    */     //   66: lload_2
/*    */     //   67: lxor
/*    */     //   68: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   76: aload_1
/*    */     //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   80: sipush #21552
/*    */     //   83: ldc2_w 3514937689128384272
/*    */     //   86: lload_2
/*    */     //   87: lxor
/*    */     //   88: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   96: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   99: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   102: athrow
/*    */     //   103: ldc2_w -5632089237448635082
/*    */     //   106: lload_2
/*    */     //   107: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   112: athrow
/*    */     //   113: aload_0
/*    */     //   114: lload #5
/*    */     //   116: aload_1
/*    */     //   117: aload #4
/*    */     //   119: invokestatic a : (Ljava/util/Date;)Ljava/lang/String;
/*    */     //   122: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;)Lme/konsolas/aac/mr;
/*    */     //   125: pop
/*    */     //   126: aload_0
/*    */     //   127: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 26
/*    */     //   #52	-> 113
/*    */     //   #24	-> 126
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	36	39	java/lang/IllegalArgumentException
/* 50 */     //   31	103	103	java/lang/IllegalArgumentException } public mr d(String paramString1, String paramString2, long paramLong) { paramLong = b ^ paramLong; long l = paramLong ^ 0x347ABFEE1F55L; int i = (int)((paramLong ^ 0x4DF0B4BA7F43L) >>> 32L), j = (int)((paramLong ^ 0x4DF0B4BA7F43L) << 32L >>> 56L), k = (int)((paramLong ^ 0x4DF0B4BA7F43L) << 40L >>> 40L); paramLong ^ 0x4DF0B4BA7F43L; J.a(paramString1, i, (byte)j, k);
/*    */     J.a(paramString2, paramString1, l);
/*    */     return c(paramString1, paramString2); }
/*    */ 
/*    */   
/*    */   public J a() {
/*    */     return new J(this);
/*    */   }
/*    */   
/*    */   @IgnoreJRERequirement
/*    */   public mr b(String paramString, long paramLong, Instant paramInstant) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mr.b : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 89074257973400
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: aload #4
/*    */     //   17: ifnonnull -> 84
/*    */     //   20: new java/lang/NullPointerException
/*    */     //   23: dup
/*    */     //   24: new java/lang/StringBuilder
/*    */     //   27: dup
/*    */     //   28: invokespecial <init> : ()V
/*    */     //   31: sipush #15491
/*    */     //   34: ldc2_w 5357693933664735975
/*    */     //   37: lload_2
/*    */     //   38: lxor
/*    */     //   39: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   47: aload_1
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: sipush #29589
/*    */     //   54: ldc2_w 1262846001974271472
/*    */     //   57: lload_2
/*    */     //   58: lxor
/*    */     //   59: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   67: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   70: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   73: athrow
/*    */     //   74: ldc2_w -247261297754341263
/*    */     //   77: lload_2
/*    */     //   78: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   83: athrow
/*    */     //   84: aload_0
/*    */     //   85: aload_1
/*    */     //   86: new java/util/Date
/*    */     //   89: dup
/*    */     //   90: aload #4
/*    */     //   92: invokevirtual toEpochMilli : ()J
/*    */     //   95: invokespecial <init> : (J)V
/*    */     //   98: lload #5
/*    */     //   100: dup2_x1
/*    */     //   101: pop2
/*    */     //   102: invokevirtual b : (Ljava/lang/String;JLjava/util/Date;)Lme/konsolas/aac/mr;
/*    */     //   105: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 15
/*    */     //   #37	-> 84
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	74	74	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public mr b(long paramLong, String paramString1, String paramString2) {
/*    */     paramLong = b ^ paramLong;
/*    */     long l1 = paramLong ^ 0xBFCE433FDB6L, l2 = paramLong ^ 0x59F4E458C1B2L;
/*    */     int i = (int)((paramLong ^ 0x7276EF679DA0L) >>> 32L), j = (int)((paramLong ^ 0x7276EF679DA0L) << 32L >>> 56L), k = (int)((paramLong ^ 0x7276EF679DA0L) << 40L >>> 40L);
/*    */     paramLong ^ 0x7276EF679DA0L;
/*    */     J.a(paramString1, i, (byte)j, k);
/*    */     J.a(paramString2, paramString1, l1);
/*    */     c(l2, paramString1);
/*    */     c(paramString1, paramString2);
/*    */     return this;
/*    */   }
/*    */   
/*    */   @IgnoreJRERequirement
/*    */   public mr a(String paramString, char paramChar1, int paramInt, char paramChar2, Instant paramInstant) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic me/konsolas/aac/mr.b : J
/*    */     //   27: lxor
/*    */     //   28: lstore #6
/*    */     //   30: lload #6
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 119581276848160
/*    */     //   36: lxor
/*    */     //   37: lstore #8
/*    */     //   39: pop2
/*    */     //   40: aload #5
/*    */     //   42: ifnonnull -> 112
/*    */     //   45: new java/lang/NullPointerException
/*    */     //   48: dup
/*    */     //   49: new java/lang/StringBuilder
/*    */     //   52: dup
/*    */     //   53: invokespecial <init> : ()V
/*    */     //   56: sipush #15491
/*    */     //   59: ldc2_w 5357694631552414524
/*    */     //   62: lload #6
/*    */     //   64: lxor
/*    */     //   65: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   73: aload_1
/*    */     //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   77: sipush #29589
/*    */     //   80: ldc2_w 1262845600405797931
/*    */     //   83: lload #6
/*    */     //   85: lxor
/*    */     //   86: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   97: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   100: athrow
/*    */     //   101: ldc2_w 2110655464811159978
/*    */     //   104: lload #6
/*    */     //   106: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   111: athrow
/*    */     //   112: aload_0
/*    */     //   113: aload_1
/*    */     //   114: new java/util/Date
/*    */     //   117: dup
/*    */     //   118: aload #5
/*    */     //   120: invokevirtual toEpochMilli : ()J
/*    */     //   123: invokespecial <init> : (J)V
/*    */     //   126: lload #8
/*    */     //   128: invokevirtual a : (Ljava/lang/String;Ljava/util/Date;J)Lme/konsolas/aac/mr;
/*    */     //   131: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 40
/*    */     //   #22	-> 112
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   40	101	101	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public mr a(long paramLong, String paramString1, String paramString2) {
/*    */     paramLong = b ^ paramLong;
/*    */     int i = (int)((paramLong ^ 0x7599E4AB880CL) >>> 32L), j = (int)((paramLong ^ 0x7599E4AB880CL) << 32L >>> 56L), k = (int)((paramLong ^ 0x7599E4AB880CL) << 40L >>> 40L);
/*    */     paramLong ^ 0x7599E4AB880CL;
/*    */     J.a(paramString1, i, (byte)j, k);
/*    */     return c(paramString1, paramString2);
/*    */   }
/*    */   
/*    */   final List a = new ArrayList(20);
/*    */   private static final long b = nc.a(3582331751395588990L, 3007064590303481880L, MethodHandles.lookup().lookupClass()).a(221849080724271L);
/*    */   private static final String[] c;
/*    */   private static final String[] d;
/*    */   private static final Map e = new HashMap<>(13);
/*    */   
/*    */   @Nullable
/*    */   public String a(long paramLong, String paramString) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mr.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w -6077681759847011483
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   15: aload_0
/*    */     //   16: getfield a : Ljava/util/List;
/*    */     //   19: invokeinterface size : ()I
/*    */     //   24: iconst_2
/*    */     //   25: isub
/*    */     //   26: istore #5
/*    */     //   28: astore #4
/*    */     //   30: iload #5
/*    */     //   32: iflt -> 118
/*    */     //   35: aload_3
/*    */     //   36: aload #4
/*    */     //   38: lload_1
/*    */     //   39: lconst_0
/*    */     //   40: lcmp
/*    */     //   41: ifle -> 58
/*    */     //   44: ifnonnull -> 109
/*    */     //   47: aload_0
/*    */     //   48: getfield a : Ljava/util/List;
/*    */     //   51: iload #5
/*    */     //   53: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   58: checkcast java/lang/String
/*    */     //   61: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   64: ifeq -> 110
/*    */     //   67: goto -> 80
/*    */     //   70: ldc2_w -6163476502775605610
/*    */     //   73: lload_1
/*    */     //   74: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   79: athrow
/*    */     //   80: aload_0
/*    */     //   81: getfield a : Ljava/util/List;
/*    */     //   84: iload #5
/*    */     //   86: iconst_1
/*    */     //   87: iadd
/*    */     //   88: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   93: checkcast java/lang/String
/*    */     //   96: goto -> 109
/*    */     //   99: ldc2_w -6163476502775605610
/*    */     //   102: lload_1
/*    */     //   103: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   108: athrow
/*    */     //   109: areturn
/*    */     //   110: iinc #5, -2
/*    */     //   113: aload #4
/*    */     //   115: ifnull -> 30
/*    */     //   118: lload_1
/*    */     //   119: lconst_0
/*    */     //   120: lcmp
/*    */     //   121: ifle -> 35
/*    */     //   124: aconst_null
/*    */     //   125: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 15
/*    */     //   #47	-> 35
/*    */     //   #17	-> 80
/*    */     //   #12	-> 110
/*    */     //   #38	-> 118
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   35	67	70	java/lang/IllegalArgumentException
/*    */     //   47	96	99	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public mr c(long paramLong, String paramString) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mr.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w 3708957636342330298
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   15: iconst_0
/*    */     //   16: istore #5
/*    */     //   18: astore #4
/*    */     //   20: iload #5
/*    */     //   22: aload_0
/*    */     //   23: getfield a : Ljava/util/List;
/*    */     //   26: invokeinterface size : ()I
/*    */     //   31: if_icmpge -> 127
/*    */     //   34: lload_1
/*    */     //   35: lconst_0
/*    */     //   36: lcmp
/*    */     //   37: iflt -> 116
/*    */     //   40: aload_3
/*    */     //   41: aload #4
/*    */     //   43: ifnonnull -> 115
/*    */     //   46: aload_0
/*    */     //   47: getfield a : Ljava/util/List;
/*    */     //   50: iload #5
/*    */     //   52: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   57: checkcast java/lang/String
/*    */     //   60: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   63: ifeq -> 119
/*    */     //   66: goto -> 79
/*    */     //   69: ldc2_w 3650606429041937993
/*    */     //   72: lload_1
/*    */     //   73: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   78: athrow
/*    */     //   79: aload_0
/*    */     //   80: getfield a : Ljava/util/List;
/*    */     //   83: iload #5
/*    */     //   85: invokeinterface remove : (I)Ljava/lang/Object;
/*    */     //   90: pop
/*    */     //   91: aload_0
/*    */     //   92: getfield a : Ljava/util/List;
/*    */     //   95: iload #5
/*    */     //   97: invokeinterface remove : (I)Ljava/lang/Object;
/*    */     //   102: goto -> 115
/*    */     //   105: ldc2_w 3650606429041937993
/*    */     //   108: lload_1
/*    */     //   109: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   114: athrow
/*    */     //   115: pop
/*    */     //   116: iinc #5, -2
/*    */     //   119: iinc #5, 2
/*    */     //   122: aload #4
/*    */     //   124: ifnull -> 20
/*    */     //   127: aload_0
/*    */     //   128: lload_1
/*    */     //   129: lconst_0
/*    */     //   130: lcmp
/*    */     //   131: iflt -> 115
/*    */     //   134: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #51	-> 15
/*    */     //   #10	-> 34
/*    */     //   #3	-> 79
/*    */     //   #27	-> 91
/*    */     //   #43	-> 116
/*    */     //   #31	-> 119
/*    */     //   #25	-> 127
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   34	66	69	java/lang/IllegalArgumentException
/*    */     //   46	102	105	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = b ^ 0x2B5DA514ECD8L;
/*    */     "濘䡥迄භ뱃棛꿑?拖婝⸞灶죀훞뉡퀒ᎀ".toCharArray()[19] = (char)("濘䡥迄භ뱃棛꿑?拖婝⸞灶죀훞뉡퀒ᎀ".toCharArray()[19] ^ 0x2865);
/*    */     "墰힒蘭玺".toCharArray()[2] = (char)("墰힒蘭玺".toCharArray()[2] ^ 0x6425);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("濘䡥迄භ뱃棛꿑?拖婝⸞灶죀훞뉡퀒ᎀ".toCharArray(), (short)11310, true, (byte)5))).init(2, SecretKeyFactory.getInstance(a0$cc.G("墰힒蘭玺".toCharArray(), (short)16820, true, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[5];
/*    */     boolean bool = false;
/*    */     "䅶鐿䵚밞蠡힦ⷴ廇ꎿ?ᅺ✼샹뾒泯龖箒㻚꾔㱺ൡ壬㡆ﺯﻩ笾歬ﰽᡮ嘰收㓖䦚뵈ﮆꇖ㡬ណᩇ컚篍칻ꫥ듏煄铤걋緖ᩮ▘ᣅ幓峵笴뮺㌞邶ﬄﷻ苗㋌䡰㖕ચ΁큯胼쨉唺̒瑦粗습昃ꅁ壂䁸̛僷ቺ낤쳑靫ⱐᔱᔗ㔫⪟䳹".toCharArray()[1] = (char)("䅶鐿䵚밞蠡힦ⷴ廇ꎿ?ᅺ✼샹뾒泯龖箒㻚꾔㱺ൡ壬㡆ﺯﻩ笾歬ﰽᡮ嘰收㓖䦚뵈ﮆꇖ㡬ណᩇ컚篍칻ꫥ듏煄铤걋緖ᩮ▘ᣅ幓峵笴뮺㌞邶ﬄﷻ苗㋌䡰㖕ચ΁큯胼쨉唺̒瑦粗습昃ꅁ壂䁸̛僷ቺ낤쳑靫ⱐᔱᔗ㔫⪟䳹".toCharArray()[1] ^ 0x3C38);
/*    */     String str;
/*    */     int i = (str = a0$cc.G("䅶鐿䵚밞蠡힦ⷴ廇ꎿ?ᅺ✼샹뾒泯龖箒㻚꾔㱺ൡ壬㡆ﺯﻩ笾歬ﰽᡮ嘰收㓖䦚뵈ﮆꇖ㡬ណᩇ컚篍칻ꫥ듏煄铤걋緖ᩮ▘ᣅ幓峵笴뮺㌞邶ﬄﷻ苗㋌䡰㖕ચ΁큯胼쨉唺̒瑦粗습昃ꅁ壂䁸̛僷ቺ낤쳑靫ⱐᔱᔗ㔫⪟䳹".toCharArray(), (short)6565, true, (byte)5)).length();
/*    */     byte b2 = 40;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   }
/*    */   
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x53C2;
/*    */     if (d[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])e.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "⾾챥㲖黼㟝ꥨ픤㬒萃轧檑ᄍꀔ卍䪜湧䴱羕羙㝯".toCharArray()[18] = (char)("⾾챥㲖黼㟝ꥨ픤㬒萃轧檑ᄍꀔ卍䪜湧䴱羕羙㝯".toCharArray()[18] ^ 0x74B1);
/*    */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("⾾챥㲖黼㟝ꥨ픤㬒萃轧檑ᄍꀔ卍䪜湧䴱羕羙㝯".toCharArray(), (short)31614, false, true));
/*    */           "뜣뒓ꐪ䒧".toCharArray()[0] = (char)("뜣뒓ꐪ䒧".toCharArray()[0] ^ 0x4BB0);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("뜣뒓ꐪ䒧".toCharArray(), (short)16645, false, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           e.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "풡猽词ﾣ?偐邜慂発ࡨ긒妧徝뉯✲葩䐫쫕ᯤ".toCharArray()[1] = (char)("풡猽词ﾣ?偐邜慂発ࡨ긒妧徝뉯✲葩䐫쫕ᯤ".toCharArray()[1] ^ 0x1011);
/*    */         throw new RuntimeException(dP$dt.X("풡猽词ﾣ?偐邜慂発ࡨ긒妧徝뉯✲葩䐫쫕ᯤ".toCharArray(), (short)29833, true, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "?ꢒ濖䓌皐⍟洳巣闲够".toCharArray()[0] = (char)("?ꢒ濖䓌皐⍟洳巣闲够".toCharArray()[0] ^ 0x67EF);
/*    */       byte[] arrayOfByte2 = c[i].getBytes(dP$dt.X("?ꢒ濖䓌皐⍟洳巣闲够".toCharArray(), (short)29994, false, false));
/*    */       d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return d[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '➦ﵺก뾻鼪︯靊ꂱᐼฌ駖ꆶ䎁者⷇ᒌ諭뛻ᥤ'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #11
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #10354
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #10856
/*    */     //   87: iconst_1
/*    */     //   88: iconst_3
/*    */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w 'ꮲᶧ髇勳'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_2
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #6604
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #31206
/*    */     //   115: iconst_0
/*    */     //   116: iconst_2
/*    */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '餝ᨘᾴὲ'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_0
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #6665
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #1919
/*    */     //   147: iconst_0
/*    */     //   148: iconst_2
/*    */     //   149: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: aload #4
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   170: athrow
/*    */     //   171: aload_3
/*    */     //   172: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */