/*    */ package me.konsolas.aac;class kr implements G { kP c;
/*    */   BlockData a;
/*    */   int b;
/*    */   private static final long d = nc.a(-4233058930916343720L, -5151615228163497472L, MethodHandles.lookup().lookupClass()).a(124884238454015L);
/*    */   
/*  6 */   kr(kr paramkr) { this.c = paramkr.c;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     this.a = paramkr.a.clone(); this.b = paramkr.b; }
/*    */   public String toString() { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/kr.d : J
/*    */     //   3: ldc2_w 3870201297455
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w -2470970484224957755
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   17: astore_3
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: aload_0
/*    */     //   26: getfield c : Lme/konsolas/aac/kP;
/*    */     //   29: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   32: ldc '풆甯'
/*    */     //   34: invokevirtual toCharArray : ()[C
/*    */     //   37: dup
/*    */     //   38: dup
/*    */     //   39: iconst_0
/*    */     //   40: dup_x1
/*    */     //   41: caload
/*    */     //   42: sipush #27917
/*    */     //   45: ixor
/*    */     //   46: i2c
/*    */     //   47: castore
/*    */     //   48: sipush #3686
/*    */     //   51: iconst_0
/*    */     //   52: iconst_1
/*    */     //   53: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   59: aload_0
/*    */     //   60: getfield a : Lorg/bukkit/block/data/BlockData;
/*    */     //   63: invokeinterface getAsString : ()Ljava/lang/String;
/*    */     //   68: aload_3
/*    */     //   69: ifnull -> 152
/*    */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   75: aload_0
/*    */     //   76: getfield b : I
/*    */     //   79: ifeq -> 155
/*    */     //   82: goto -> 95
/*    */     //   85: ldc2_w -2456307469830823081
/*    */     //   88: lload_1
/*    */     //   89: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   94: athrow
/*    */     //   95: new java/lang/StringBuilder
/*    */     //   98: dup
/*    */     //   99: invokespecial <init> : ()V
/*    */     //   102: ldc '▆祿'
/*    */     //   104: invokevirtual toCharArray : ()[C
/*    */     //   107: dup
/*    */     //   108: dup
/*    */     //   109: iconst_0
/*    */     //   110: dup_x1
/*    */     //   111: caload
/*    */     //   112: sipush #27124
/*    */     //   115: ixor
/*    */     //   116: i2c
/*    */     //   117: castore
/*    */     //   118: sipush #6644
/*    */     //   121: iconst_1
/*    */     //   122: iconst_1
/*    */     //   123: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   129: aload_0
/*    */     //   130: getfield b : I
/*    */     //   133: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   136: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   139: goto -> 152
/*    */     //   142: ldc2_w -2456307469830823081
/*    */     //   145: lload_1
/*    */     //   146: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   151: athrow
/*    */     //   152: goto -> 157
/*    */     //   155: ldc ''
/*    */     //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   160: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   163: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 18
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	82	85	aacinternal/v
/*    */     //   72	139	142	aacinternal/v } public int hashCode() { null = this.c.hashCode(); null = 31 * null + this.a.hashCode();
/* 15 */     return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 24 */       31 * null + this.b; }
/*    */   public G a() { return new kr(this); }
/*    */   kr(kP paramkP, Block paramBlock, long paramLong) { a(l, paramkP, paramBlock); }
/*    */   public boolean equals(Object paramObject) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/kr.d : J
/*    */     //   3: ldc2_w 58529964585513
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: ldc2_w -7659655596763927869
/*    */     //   11: lload_2
/*    */     //   12: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   17: astore #4
/*    */     //   19: aload_0
/*    */     //   20: aload #4
/*    */     //   22: ifnull -> 55
/*    */     //   25: aload_1
/*    */     //   26: if_acmpne -> 54
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w -7642811014121116847
/*    */     //   35: lload_2
/*    */     //   36: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   41: athrow
/*    */     //   42: iconst_1
/*    */     //   43: ireturn
/*    */     //   44: ldc2_w -7642811014121116847
/*    */     //   47: lload_2
/*    */     //   48: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   53: athrow
/*    */     //   54: aload_1
/*    */     //   55: ifnull -> 100
/*    */     //   58: aload_0
/*    */     //   59: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   62: aload #4
/*    */     //   64: ifnull -> 113
/*    */     //   67: goto -> 80
/*    */     //   70: ldc2_w -7642811014121116847
/*    */     //   73: lload_2
/*    */     //   74: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   79: athrow
/*    */     //   80: aload_1
/*    */     //   81: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   84: if_acmpeq -> 112
/*    */     //   87: goto -> 100
/*    */     //   90: ldc2_w -7642811014121116847
/*    */     //   93: lload_2
/*    */     //   94: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   99: athrow
/*    */     //   100: iconst_0
/*    */     //   101: ireturn
/*    */     //   102: ldc2_w -7642811014121116847
/*    */     //   105: lload_2
/*    */     //   106: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   111: athrow
/*    */     //   112: aload_1
/*    */     //   113: checkcast me/konsolas/aac/kr
/*    */     //   116: astore #5
/*    */     //   118: aload_0
/*    */     //   119: aload #4
/*    */     //   121: ifnull -> 161
/*    */     //   124: getfield b : I
/*    */     //   127: aload #5
/*    */     //   129: getfield b : I
/*    */     //   132: if_icmpeq -> 160
/*    */     //   135: goto -> 148
/*    */     //   138: ldc2_w -7642811014121116847
/*    */     //   141: lload_2
/*    */     //   142: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   147: athrow
/*    */     //   148: iconst_0
/*    */     //   149: ireturn
/*    */     //   150: ldc2_w -7642811014121116847
/*    */     //   153: lload_2
/*    */     //   154: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   159: athrow
/*    */     //   160: aload_0
/*    */     //   161: aload #4
/*    */     //   163: ifnull -> 203
/*    */     //   166: getfield c : Lme/konsolas/aac/kP;
/*    */     //   169: aload #5
/*    */     //   171: getfield c : Lme/konsolas/aac/kP;
/*    */     //   174: if_acmpeq -> 202
/*    */     //   177: goto -> 190
/*    */     //   180: ldc2_w -7642811014121116847
/*    */     //   183: lload_2
/*    */     //   184: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   189: athrow
/*    */     //   190: iconst_0
/*    */     //   191: ireturn
/*    */     //   192: ldc2_w -7642811014121116847
/*    */     //   195: lload_2
/*    */     //   196: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   201: athrow
/*    */     //   202: aload_0
/*    */     //   203: getfield a : Lorg/bukkit/block/data/BlockData;
/*    */     //   206: aload #5
/*    */     //   208: getfield a : Lorg/bukkit/block/data/BlockData;
/*    */     //   211: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   214: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 19
/*    */     //   #21	-> 54
/*    */     //   #16	-> 112
/*    */     //   #10	-> 118
/*    */     //   #14	-> 160
/*    */     //   #20	-> 202
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	29	32	aacinternal/v
/*    */     //   25	44	44	aacinternal/v
/*    */     //   55	67	70	aacinternal/v
/*    */     //   58	87	90	aacinternal/v
/*    */     //   80	102	102	aacinternal/v
/*    */     //   118	135	138	aacinternal/v
/*    */     //   124	150	150	aacinternal/v
/*    */     //   161	177	180	aacinternal/v
/* 27 */     //   166	192	192	aacinternal/v } private static int a(int paramInt1, int paramInt2, int paramInt3) { long l = paramInt1 * 3129871L ^ paramInt3 * 116129781L ^ paramInt2; l = l * l * 42317861L + l * 11L;
/* 28 */     return (int)(l >> 16L & 0xFFFL); }
/*    */ 
/*    */   
/*    */   public void a(long paramLong, kP paramkP, Block paramBlock) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 62930177165326
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: pop2
/*    */     //   9: ldc2_w -8209660778005024415
/*    */     //   12: lload_1
/*    */     //   13: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   18: aload_0
/*    */     //   19: aload_3
/*    */     //   20: putfield c : Lme/konsolas/aac/kP;
/*    */     //   23: astore #7
/*    */     //   25: aload_0
/*    */     //   26: aload #4
/*    */     //   28: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
/*    */     //   33: aload #7
/*    */     //   35: ifnull -> 86
/*    */     //   38: putfield a : Lorg/bukkit/block/data/BlockData;
/*    */     //   41: aload_0
/*    */     //   42: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   45: lload #5
/*    */     //   47: getstatic me/konsolas/aac/kP.V1_14 : Lme/konsolas/aac/kP;
/*    */     //   50: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   53: ifeq -> 128
/*    */     //   56: goto -> 69
/*    */     //   59: ldc2_w -8192816050558062349
/*    */     //   62: lload_1
/*    */     //   63: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   68: athrow
/*    */     //   69: aload_0
/*    */     //   70: getfield a : Lorg/bukkit/block/data/BlockData;
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w -8192816050558062349
/*    */     //   79: lload_1
/*    */     //   80: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   85: athrow
/*    */     //   86: invokeinterface getMaterial : ()Lorg/bukkit/Material;
/*    */     //   91: getstatic org/bukkit/Material.BAMBOO : Lorg/bukkit/Material;
/*    */     //   94: if_acmpne -> 128
/*    */     //   97: aload #4
/*    */     //   99: invokeinterface getX : ()I
/*    */     //   104: iconst_0
/*    */     //   105: aload #4
/*    */     //   107: invokeinterface getZ : ()I
/*    */     //   112: invokestatic a : (III)I
/*    */     //   115: goto -> 129
/*    */     //   118: ldc2_w -8192816050558062349
/*    */     //   121: lload_1
/*    */     //   122: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   127: athrow
/*    */     //   128: iconst_0
/*    */     //   129: putfield b : I
/*    */     //   132: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 18
/*    */     //   #22	-> 25
/*    */     //   #8	-> 41
/*    */     //   #5	-> 86
/*    */     //   #3	-> 97
/*    */     //   #23	-> 132
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   25	56	59	aacinternal/v
/*    */     //   38	73	76	aacinternal/v
/*    */     //   86	118	118	aacinternal/v
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */