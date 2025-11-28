/*    */ package me.konsolas.aac;public final class fq { public static final e1 a;
/*  2 */   public static i0 a(i0 parami0) { return new bl(parami0); } public static i0 a(ListIterator paramListIterator) { 
/*  3 */     try { if (paramListIterator instanceof i0) return (i0)paramListIterator;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */ 
/*    */ 
/*    */     
/*  7 */     return new cX(paramListIterator); }
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
/*    */   public static hT a(Iterator paramIterator, int paramInt) {
/*    */     b2 b2 = new b2();
/* 31 */     b(paramIterator, b2, paramInt);
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
/* 47 */     b2.a();
/*    */     return b2;
/*    */   } public static m4 a(m4 paramm4) {
/*    */     return new da(paramm4);
/*    */   }
/*    */   public static int a(Iterator paramIterator, Predicate paramPredicate) { Objects.requireNonNull(paramPredicate);
/* 53 */     byte b = 0; while (true) { try { if (paramIterator.hasNext()) { try { if (paramPredicate.test(paramIterator.next()))
/* 54 */               return b;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return -1; }  } public static i0 a(Object[] paramArrayOfObject) { return new cR(paramArrayOfObject, 0, paramArrayOfObject.length); } public static long a(Iterator paramIterator, Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fq.b : J
/*    */     //   3: ldc2_w 35418935106835
/*    */     //   6: lxor
/*    */     //   7: lstore #6
/*    */     //   9: lload #4
/*    */     //   11: lconst_0
/*    */     //   12: lcmp
/*    */     //   13: ifge -> 105
/*    */     //   16: new java/lang/IllegalArgumentException
/*    */     //   19: dup
/*    */     //   20: new java/lang/StringBuilder
/*    */     //   23: dup
/*    */     //   24: invokespecial <init> : ()V
/*    */     //   27: ldc 'ñ㬸栢틶뛠?굣掦쁒⭰ퟲ뻯楪២嵔疨욅ퟹ競ස衳厚㨵譔Ḟ䤢䰜ﶽ橍秸ز'
/*    */     //   29: invokevirtual toCharArray : ()[C
/*    */     //   32: dup
/*    */     //   33: dup
/*    */     //   34: bipush #12
/*    */     //   36: dup_x1
/*    */     //   37: caload
/*    */     //   38: sipush #11412
/*    */     //   41: ixor
/*    */     //   42: i2c
/*    */     //   43: castore
/*    */     //   44: sipush #16301
/*    */     //   47: iconst_0
/*    */     //   48: iconst_1
/*    */     //   49: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   55: lload #4
/*    */     //   57: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   60: ldc '榺層쨯䉽砺ই㛍ꢊ衼㫛'
/*    */     //   62: invokevirtual toCharArray : ()[C
/*    */     //   65: dup
/*    */     //   66: dup
/*    */     //   67: iconst_1
/*    */     //   68: dup_x1
/*    */     //   69: caload
/*    */     //   70: sipush #26513
/*    */     //   73: ixor
/*    */     //   74: i2c
/*    */     //   75: castore
/*    */     //   76: sipush #20685
/*    */     //   79: iconst_1
/*    */     //   80: iconst_0
/*    */     //   81: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   87: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   90: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   93: athrow
/*    */     //   94: ldc2_w -4609719906348359826
/*    */     //   97: lload #6
/*    */     //   99: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   104: athrow
/*    */     //   105: lload_2
/*    */     //   106: lconst_0
/*    */     //   107: lcmp
/*    */     //   108: iflt -> 137
/*    */     //   111: lload_2
/*    */     //   112: lload #4
/*    */     //   114: ladd
/*    */     //   115: aload_1
/*    */     //   116: invokestatic a : ([[Ljava/lang/Object;)J
/*    */     //   119: lcmp
/*    */     //   120: ifle -> 156
/*    */     //   123: goto -> 137
/*    */     //   126: ldc2_w -4609719906348359826
/*    */     //   129: lload #6
/*    */     //   131: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   136: athrow
/*    */     //   137: new java/lang/IllegalArgumentException
/*    */     //   140: dup
/*    */     //   141: invokespecial <init> : ()V
/*    */     //   144: athrow
/*    */     //   145: ldc2_w -4609719906348359826
/*    */     //   148: lload #6
/*    */     //   150: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   155: athrow
/*    */     //   156: lload #4
/*    */     //   158: lstore #8
/*    */     //   160: lload #8
/*    */     //   162: dup2
/*    */     //   163: lconst_1
/*    */     //   164: lsub
/*    */     //   165: lstore #8
/*    */     //   167: lconst_0
/*    */     //   168: lcmp
/*    */     //   169: ifeq -> 213
/*    */     //   172: aload_0
/*    */     //   173: invokeinterface hasNext : ()Z
/*    */     //   178: ifeq -> 213
/*    */     //   181: goto -> 195
/*    */     //   184: ldc2_w -4609719906348359826
/*    */     //   187: lload #6
/*    */     //   189: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   194: athrow
/*    */     //   195: aload_1
/*    */     //   196: lload_2
/*    */     //   197: dup2
/*    */     //   198: lconst_1
/*    */     //   199: ladd
/*    */     //   200: lstore_2
/*    */     //   201: aload_0
/*    */     //   202: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   207: invokestatic a : ([[Ljava/lang/Object;JLjava/lang/Object;)V
/*    */     //   210: goto -> 160
/*    */     //   213: lload #4
/*    */     //   215: lload #8
/*    */     //   217: lsub
/*    */     //   218: lconst_1
/*    */     //   219: lsub
/*    */     //   220: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 9
/*    */     //   #71	-> 105
/*    */     //   #19	-> 156
/*    */     //   #37	-> 160
/*    */     //   #10	-> 213
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	94	94	java/lang/IllegalArgumentException
/*    */     //   105	123	126	java/lang/IllegalArgumentException
/*    */     //   111	145	145	java/lang/IllegalArgumentException
/*    */     //   167	181	184	java/lang/IllegalArgumentException } public static ea a() { return a; } public static Object[][] a(Iterator paramIterator) { return a(paramIterator, Long.MAX_VALUE); } public static hT a(Iterator paramIterator) { return a(paramIterator, 2147483647); }
/*    */   public static int a(Iterator paramIterator, Object[] paramArrayOfObject, int paramInt1, int paramInt2) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fq.b : J
/*    */     //   3: ldc2_w 55358411883738
/*    */     //   6: lxor
/*    */     //   7: lstore #4
/*    */     //   9: iload_3
/*    */     //   10: ifge -> 101
/*    */     //   13: new java/lang/IllegalArgumentException
/*    */     //   16: dup
/*    */     //   17: new java/lang/StringBuilder
/*    */     //   20: dup
/*    */     //   21: invokespecial <init> : ()V
/*    */     //   24: ldc '㇝樤竣Ƨ뾤䝚Ԭ䣦礄㌽쇾嶛혆ꠏ䥲鯌튐굓畏刂흲㐟⺸ể】ᐴ쨂ﱘ⷏'
/*    */     //   26: invokevirtual toCharArray : ()[C
/*    */     //   29: dup
/*    */     //   30: dup
/*    */     //   31: bipush #13
/*    */     //   33: dup_x1
/*    */     //   34: caload
/*    */     //   35: sipush #4551
/*    */     //   38: ixor
/*    */     //   39: i2c
/*    */     //   40: castore
/*    */     //   41: sipush #12214
/*    */     //   44: iconst_0
/*    */     //   45: iconst_0
/*    */     //   46: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   52: iload_3
/*    */     //   53: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   56: ldc '씊鸖쿜돓펎뭪痵셏蹐燼'
/*    */     //   58: invokevirtual toCharArray : ()[C
/*    */     //   61: dup
/*    */     //   62: dup
/*    */     //   63: iconst_5
/*    */     //   64: dup_x1
/*    */     //   65: caload
/*    */     //   66: sipush #14633
/*    */     //   69: ixor
/*    */     //   70: i2c
/*    */     //   71: castore
/*    */     //   72: sipush #30689
/*    */     //   75: iconst_0
/*    */     //   76: iconst_1
/*    */     //   77: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   83: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   86: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   89: athrow
/*    */     //   90: ldc2_w -7363404887293606233
/*    */     //   93: lload #4
/*    */     //   95: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   100: athrow
/*    */     //   101: iload_2
/*    */     //   102: iflt -> 127
/*    */     //   105: iload_2
/*    */     //   106: iload_3
/*    */     //   107: iadd
/*    */     //   108: aload_1
/*    */     //   109: arraylength
/*    */     //   110: if_icmple -> 146
/*    */     //   113: goto -> 127
/*    */     //   116: ldc2_w -7363404887293606233
/*    */     //   119: lload #4
/*    */     //   121: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   126: athrow
/*    */     //   127: new java/lang/IllegalArgumentException
/*    */     //   130: dup
/*    */     //   131: invokespecial <init> : ()V
/*    */     //   134: athrow
/*    */     //   135: ldc2_w -7363404887293606233
/*    */     //   138: lload #4
/*    */     //   140: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   145: athrow
/*    */     //   146: iload_3
/*    */     //   147: istore #6
/*    */     //   149: iload #6
/*    */     //   151: iinc #6, -1
/*    */     //   154: ifeq -> 206
/*    */     //   157: aload_0
/*    */     //   158: invokeinterface hasNext : ()Z
/*    */     //   163: ifeq -> 206
/*    */     //   166: goto -> 180
/*    */     //   169: ldc2_w -7363404887293606233
/*    */     //   172: lload #4
/*    */     //   174: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   179: athrow
/*    */     //   180: aload_1
/*    */     //   181: iload_2
/*    */     //   182: iinc #2, 1
/*    */     //   185: aload_0
/*    */     //   186: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   191: aastore
/*    */     //   192: goto -> 149
/*    */     //   195: ldc2_w -7363404887293606233
/*    */     //   198: lload #4
/*    */     //   200: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   205: athrow
/*    */     //   206: iload_3
/*    */     //   207: iload #6
/*    */     //   209: isub
/*    */     //   210: iconst_1
/*    */     //   211: isub
/*    */     //   212: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 9
/*    */     //   #34	-> 101
/*    */     //   #44	-> 146
/*    */     //   #63	-> 149
/*    */     //   #29	-> 206
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	90	90	java/lang/IllegalArgumentException
/*    */     //   101	113	116	java/lang/IllegalArgumentException
/*    */     //   105	135	135	java/lang/IllegalArgumentException
/*    */     //   149	166	169	java/lang/IllegalArgumentException
/*    */     //   157	195	195	java/lang/IllegalArgumentException }
/* 56 */   public static boolean a(Iterator paramIterator, Predicate paramPredicate) { Objects.requireNonNull(paramPredicate); while (true) { if (!paramIterator.hasNext()) return true;  if (!paramPredicate.test(paramIterator.next()))
/*    */         return false;  }  }
/*    */   public static ea a(ea[] paramArrayOfea, int paramInt1, int paramInt2) { return new g3(paramArrayOfea, paramInt1, paramInt2); }
/*    */   public static long a(Iterator paramIterator, Object[][] paramArrayOfObject) { return a(paramIterator, paramArrayOfObject, 0L, k.a(paramArrayOfObject)); }
/*    */   public static i0 a(Object paramObject) { return new hP(paramObject); }
/*    */   public static Object[][] a(Iterator paramIterator, long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fq.b : J
/*    */     //   3: ldc2_w 49908920135330
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: lload_1
/*    */     //   9: lconst_0
/*    */     //   10: lcmp
/*    */     //   11: ifge -> 100
/*    */     //   14: new java/lang/IllegalArgumentException
/*    */     //   17: dup
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: ldc '䵮荃븈볷嘡踩䖊蔬쉦峣ꏓ鲉Ⴞﶴ䊧揋ﺬ纵귱놺劰큥?샙Კ颖퀶簰홸㘨'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: iconst_3
/*    */     //   33: dup_x1
/*    */     //   34: caload
/*    */     //   35: sipush #9403
/*    */     //   38: ixor
/*    */     //   39: i2c
/*    */     //   40: castore
/*    */     //   41: sipush #26742
/*    */     //   44: iconst_2
/*    */     //   45: iconst_3
/*    */     //   46: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   52: lload_1
/*    */     //   53: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   56: ldc '⸦嬛෠ꩮ츑牡曚?繽앣អ邏ⅅ慎'
/*    */     //   58: invokevirtual toCharArray : ()[C
/*    */     //   61: dup
/*    */     //   62: dup
/*    */     //   63: iconst_5
/*    */     //   64: dup_x1
/*    */     //   65: caload
/*    */     //   66: sipush #15492
/*    */     //   69: ixor
/*    */     //   70: i2c
/*    */     //   71: castore
/*    */     //   72: sipush #28379
/*    */     //   75: iconst_4
/*    */     //   76: iconst_5
/*    */     //   77: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   83: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   86: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   89: athrow
/*    */     //   90: ldc2_w -884973295828456225
/*    */     //   93: lload_3
/*    */     //   94: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   99: athrow
/*    */     //   100: ldc2_w 16
/*    */     //   103: invokestatic a : (J)[[Ljava/lang/Object;
/*    */     //   106: astore #5
/*    */     //   108: lconst_0
/*    */     //   109: lstore #6
/*    */     //   111: lload_1
/*    */     //   112: dup2
/*    */     //   113: lconst_1
/*    */     //   114: lsub
/*    */     //   115: lstore_1
/*    */     //   116: lconst_0
/*    */     //   117: lcmp
/*    */     //   118: ifeq -> 199
/*    */     //   121: aload_0
/*    */     //   122: invokeinterface hasNext : ()Z
/*    */     //   127: ifeq -> 199
/*    */     //   130: goto -> 143
/*    */     //   133: ldc2_w -884973295828456225
/*    */     //   136: lload_3
/*    */     //   137: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   142: athrow
/*    */     //   143: lload #6
/*    */     //   145: aload #5
/*    */     //   147: invokestatic a : ([[Ljava/lang/Object;)J
/*    */     //   150: lcmp
/*    */     //   151: ifne -> 178
/*    */     //   154: goto -> 167
/*    */     //   157: ldc2_w -884973295828456225
/*    */     //   160: lload_3
/*    */     //   161: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   166: athrow
/*    */     //   167: aload #5
/*    */     //   169: lload #6
/*    */     //   171: lconst_1
/*    */     //   172: ladd
/*    */     //   173: invokestatic c : ([[Ljava/lang/Object;J)[[Ljava/lang/Object;
/*    */     //   176: astore #5
/*    */     //   178: aload #5
/*    */     //   180: lload #6
/*    */     //   182: dup2
/*    */     //   183: lconst_1
/*    */     //   184: ladd
/*    */     //   185: lstore #6
/*    */     //   187: aload_0
/*    */     //   188: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   193: invokestatic a : ([[Ljava/lang/Object;JLjava/lang/Object;)V
/*    */     //   196: goto -> 111
/*    */     //   199: aload #5
/*    */     //   201: lload #6
/*    */     //   203: invokestatic b : ([[Ljava/lang/Object;J)[[Ljava/lang/Object;
/*    */     //   206: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 8
/*    */     //   #6	-> 100
/*    */     //   #55	-> 108
/*    */     //   #64	-> 111
/*    */     //   #42	-> 143
/*    */     //   #25	-> 178
/*    */     //   #39	-> 199
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	90	90	java/lang/IllegalArgumentException
/*    */     //   116	130	133	java/lang/IllegalArgumentException
/*    */     //   121	154	157	java/lang/IllegalArgumentException }
/* 62 */   private static final long b = nc.a(-4940696526920155368L, 3297310070320933622L, MethodHandles.lookup().lookupClass()).a(150934918896402L); static { a = new e1(); } public static Object[] a(Iterator paramIterator) { return a(paramIterator, 2147483647); }
/*    */   public static boolean b(Iterator paramIterator, Predicate paramPredicate) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (a(paramIterator, paramPredicate) != -1); }
/*    */   public static ea a(Iterator paramIterator) { try { if (paramIterator instanceof ea) return (ea)paramIterator;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return new B(paramIterator); }
/*    */   public static i0 a(Object[] paramArrayOfObject, int paramInt1, int paramInt2) { mK.b(paramArrayOfObject, paramInt1, paramInt2); return new cR(paramArrayOfObject, paramInt1, paramInt2); } public static int b(Iterator paramIterator, jM paramjM, int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fq.b : J
/*    */     //   3: ldc2_w 126021228355204
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: iload_2
/*    */     //   9: ifge -> 99
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '蟨㬒钯楘ܼ⁋佱╞똵婢풤䰸튪窱玩॒遭橩쉖鵛Ⅎ讉෺⥢뀇聀㴆컰৉䌘ᰁ'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #25
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #21322
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #20316
/*    */     //   43: iconst_0
/*    */     //   44: iconst_1
/*    */     //   45: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_2
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: ldc '䈉⪼㟇৪墐馢쿴玵鲎懟䟉嬽'
/*    */     //   57: invokevirtual toCharArray : ()[C
/*    */     //   60: dup
/*    */     //   61: dup
/*    */     //   62: iconst_2
/*    */     //   63: dup_x1
/*    */     //   64: caload
/*    */     //   65: sipush #21541
/*    */     //   68: ixor
/*    */     //   69: i2c
/*    */     //   70: castore
/*    */     //   71: sipush #30582
/*    */     //   74: iconst_0
/*    */     //   75: iconst_5
/*    */     //   76: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   82: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   85: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   88: athrow
/*    */     //   89: ldc2_w -8966193517742760711
/*    */     //   92: lload_3
/*    */     //   93: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   98: athrow
/*    */     //   99: iload_2
/*    */     //   100: istore #5
/*    */     //   102: iload #5
/*    */     //   104: iinc #5, -1
/*    */     //   107: ifeq -> 158
/*    */     //   110: aload_0
/*    */     //   111: invokeinterface hasNext : ()Z
/*    */     //   116: ifeq -> 158
/*    */     //   119: goto -> 132
/*    */     //   122: ldc2_w -8966193517742760711
/*    */     //   125: lload_3
/*    */     //   126: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   131: athrow
/*    */     //   132: aload_1
/*    */     //   133: aload_0
/*    */     //   134: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   139: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   144: pop
/*    */     //   145: goto -> 102
/*    */     //   148: ldc2_w -8966193517742760711
/*    */     //   151: lload_3
/*    */     //   152: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   157: athrow
/*    */     //   158: iload_2
/*    */     //   159: iload #5
/*    */     //   161: isub
/*    */     //   162: iconst_1
/*    */     //   163: isub
/*    */     //   164: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #51	-> 8
/*    */     //   #46	-> 99
/*    */     //   #12	-> 102
/*    */     //   #21	-> 158
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	89	89	java/lang/IllegalArgumentException
/*    */     //   102	119	122	java/lang/IllegalArgumentException
/*    */     //   110	148	148	java/lang/IllegalArgumentException } public static int a(Iterator paramIterator, jM paramjM) { return b(paramIterator, paramjM, 2147483647); } public static Object[] a(Iterator paramIterator, int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fq.b : J
/*    */     //   3: ldc2_w 37042514212054
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 99
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '蔥⒁ꮼ?爋卂쎥౤㔄溭황㩵䬵떂팮ꨮꉪᅝ筸岎Ꮇﺼ觵⭸駬ﴪ䍙秵䑒嫴蒼ೊ'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #18
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #1273
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #14472
/*    */     //   43: iconst_1
/*    */     //   44: iconst_4
/*    */     //   45: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: ldc '衏?蘭砊㈘?恊圛Ⰺ겿袤覍࣓'
/*    */     //   57: invokevirtual toCharArray : ()[C
/*    */     //   60: dup
/*    */     //   61: dup
/*    */     //   62: iconst_2
/*    */     //   63: dup_x1
/*    */     //   64: caload
/*    */     //   65: sipush #29470
/*    */     //   68: ixor
/*    */     //   69: i2c
/*    */     //   70: castore
/*    */     //   71: sipush #16145
/*    */     //   74: iconst_0
/*    */     //   75: iconst_3
/*    */     //   76: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   82: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   85: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   88: athrow
/*    */     //   89: ldc2_w -1602158122525116757
/*    */     //   92: lload_2
/*    */     //   93: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   98: athrow
/*    */     //   99: bipush #16
/*    */     //   101: anewarray java/lang/Object
/*    */     //   104: astore #4
/*    */     //   106: iconst_0
/*    */     //   107: istore #5
/*    */     //   109: iload_1
/*    */     //   110: iinc #1, -1
/*    */     //   113: ifeq -> 187
/*    */     //   116: aload_0
/*    */     //   117: invokeinterface hasNext : ()Z
/*    */     //   122: ifeq -> 187
/*    */     //   125: goto -> 138
/*    */     //   128: ldc2_w -1602158122525116757
/*    */     //   131: lload_2
/*    */     //   132: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   137: athrow
/*    */     //   138: iload #5
/*    */     //   140: aload #4
/*    */     //   142: arraylength
/*    */     //   143: if_icmpne -> 170
/*    */     //   146: goto -> 159
/*    */     //   149: ldc2_w -1602158122525116757
/*    */     //   152: lload_2
/*    */     //   153: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   158: athrow
/*    */     //   159: aload #4
/*    */     //   161: iload #5
/*    */     //   163: iconst_1
/*    */     //   164: iadd
/*    */     //   165: invokestatic c : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*    */     //   168: astore #4
/*    */     //   170: aload #4
/*    */     //   172: iload #5
/*    */     //   174: iinc #5, 1
/*    */     //   177: aload_0
/*    */     //   178: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   183: aastore
/*    */     //   184: goto -> 109
/*    */     //   187: aload #4
/*    */     //   189: iload #5
/*    */     //   191: invokestatic b : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*    */     //   194: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #57	-> 8
/*    */     //   #1	-> 99
/*    */     //   #70	-> 106
/*    */     //   #50	-> 109
/*    */     //   #17	-> 138
/*    */     //   #58	-> 170
/*    */     //   #66	-> 187
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	89	89	java/lang/IllegalArgumentException
/*    */     //   109	125	128	java/lang/IllegalArgumentException
/*    */     //   116	146	149	java/lang/IllegalArgumentException } public static int a(Iterator paramIterator, jM paramjM, int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fq.b : J
/*    */     //   3: ldc2_w 30340510913776
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: iload_2
/*    */     //   9: ifge -> 98
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '䟎ﶆċ풊ợ륂孈乹䷀ῴ漽哰璐雙웄팇妶ዙ￢?ᷓ㿘Ḿ′謗↹碌ේ'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: iconst_1
/*    */     //   31: dup_x1
/*    */     //   32: caload
/*    */     //   33: sipush #23282
/*    */     //   36: ixor
/*    */     //   37: i2c
/*    */     //   38: castore
/*    */     //   39: sipush #5333
/*    */     //   42: iconst_0
/*    */     //   43: iconst_0
/*    */     //   44: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   50: iload_2
/*    */     //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   54: ldc 'ෘ瀳互숂僳轛꘢ꇂᥴ퐨롦惄ൺ'
/*    */     //   56: invokevirtual toCharArray : ()[C
/*    */     //   59: dup
/*    */     //   60: dup
/*    */     //   61: iconst_5
/*    */     //   62: dup_x1
/*    */     //   63: caload
/*    */     //   64: sipush #16659
/*    */     //   67: ixor
/*    */     //   68: i2c
/*    */     //   69: castore
/*    */     //   70: sipush #7055
/*    */     //   73: iconst_0
/*    */     //   74: iconst_1
/*    */     //   75: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   81: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   84: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   87: athrow
/*    */     //   88: ldc2_w 5324881510801905293
/*    */     //   91: lload_3
/*    */     //   92: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   97: athrow
/*    */     //   98: iload_2
/*    */     //   99: istore #5
/*    */     //   101: iload #5
/*    */     //   103: iinc #5, -1
/*    */     //   106: ifeq -> 157
/*    */     //   109: aload_0
/*    */     //   110: invokeinterface hasNext : ()Z
/*    */     //   115: ifeq -> 157
/*    */     //   118: goto -> 131
/*    */     //   121: ldc2_w 5324881510801905293
/*    */     //   124: lload_3
/*    */     //   125: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   130: athrow
/*    */     //   131: aload_1
/*    */     //   132: aload_0
/*    */     //   133: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   138: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   143: pop
/*    */     //   144: goto -> 101
/*    */     //   147: ldc2_w 5324881510801905293
/*    */     //   150: lload_3
/*    */     //   151: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   156: athrow
/*    */     //   157: iload_2
/*    */     //   158: iload #5
/*    */     //   160: isub
/*    */     //   161: iconst_1
/*    */     //   162: isub
/*    */     //   163: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #61	-> 8
/*    */     //   #60	-> 98
/*    */     //   #8	-> 101
/*    */     //   #68	-> 157
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	88	88	java/lang/IllegalArgumentException
/*    */     //   101	118	121	java/lang/IllegalArgumentException
/* 65 */     //   109	147	147	java/lang/IllegalArgumentException } public static long a(Iterator<E> paramIterator, jM paramjM) { long l = 0L;
/*    */ 
/*    */ 
/*    */     
/* 69 */     for (; paramIterator.hasNext(); l++)
/*    */       paramjM.add(paramIterator.next()); 
/*    */     return l; } public static ea a(ea paramea) { return new ev(paramea); }
/* 72 */   public static int a(Iterator paramIterator, Object[] paramArrayOfObject) { return a(paramIterator, paramArrayOfObject, 0, paramArrayOfObject.length); } @SafeVarargs
/* 73 */   public static ea a(ea[] paramArrayOfea) { return a(paramArrayOfea, 0, paramArrayOfea.length); }
/*    */ 
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */