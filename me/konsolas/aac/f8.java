/*  1 */ package me.konsolas.aac;public interface f8 extends List, Comparable, n { public static final long k = nc.a(-8148700418416971250L, 6977541762341017948L, MethodHandles.lookup().lookupClass()).a(142949265351678L); @Deprecated default Integer b(int paramInt) { return Integer.valueOf(b(paramInt)); } @Deprecated
/*    */   default void a(Comparator paramComparator) {
/*  3 */     b(iO.a(paramComparator));
/*    */   }
/*    */   
/*    */   @Deprecated
/*  7 */   default Integer a(int paramInt, Integer paramInteger) { return Integer.valueOf(a(paramInt, paramInteger.intValue())); }
/*  8 */   @Deprecated default Object remove(int paramInt) { return a(paramInt); } static f8 a(int paramInt1, int paramInt2, int paramInt3) { return at.a(new int[] { paramInt1, paramInt2, paramInt3 }); } static f8 a(int paramInt) { return jg.a(paramInt); } @Deprecated default boolean a(Integer paramInteger) { return a(paramInteger.intValue()); } @Deprecated default boolean remove(Object paramObject) { return super.remove(paramObject); } @Deprecated default Object set(int paramInt, Object paramObject) { return a(paramInt, (Integer)paramObject); } default Spliterator spliterator() { return b(); } default ListIterator listIterator() { return b(); } @Deprecated default void sort(Comparator paramComparator) { a(iO.a(paramComparator)); } static f8 a() { return at.a(); } default cA b() { return a(); } static f8 a(int[] paramArrayOfint) { try { switch (paramArrayOfint.length)
/*    */       
/*    */       { 
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
/*    */         case 0:
/* 53 */           return a();case 1: return a(paramArrayOfint[0]); }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  return at.a(paramArrayOfint); }
/*    */   @Deprecated default int indexOf(Object paramObject) { return c(((Integer)paramObject).intValue()); }
/*    */   default void b(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/f8.k : J
/*    */     //   3: ldc2_w 8982345825383
/*    */     //   6: lxor
/*    */     //   7: lstore #5
/*    */     //   9: iload_1
/*    */     //   10: ifge -> 100
/*    */     //   13: new java/lang/IndexOutOfBoundsException
/*    */     //   16: dup
/*    */     //   17: new java/lang/StringBuilder
/*    */     //   20: dup
/*    */     //   21: invokespecial <init> : ()V
/*    */     //   24: ldc '䷆釼龟䣫Ⅎꌸ穦'
/*    */     //   26: invokevirtual toCharArray : ()[C
/*    */     //   29: dup
/*    */     //   30: dup
/*    */     //   31: iconst_3
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #21257
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #17543
/*    */     //   43: iconst_2
/*    */     //   44: iconst_2
/*    */     //   45: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: ldc '㞏巅᭦㞖梘ﳭ૫繋廪Ι?䋧壾䔎'
/*    */     //   57: invokevirtual toCharArray : ()[C
/*    */     //   60: dup
/*    */     //   61: dup
/*    */     //   62: iconst_3
/*    */     //   63: dup_x1
/*    */     //   64: caload
/*    */     //   65: sipush #16193
/*    */     //   68: ixor
/*    */     //   69: i2c
/*    */     //   70: castore
/*    */     //   71: sipush #27567
/*    */     //   74: iconst_3
/*    */     //   75: iconst_1
/*    */     //   76: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   82: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   85: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   88: athrow
/*    */     //   89: ldc2_w 6911378676073185349
/*    */     //   92: lload #5
/*    */     //   94: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   99: athrow
/*    */     //   100: iload_1
/*    */     //   101: aload_0
/*    */     //   102: invokeinterface size : ()I
/*    */     //   107: if_icmple -> 234
/*    */     //   110: new java/lang/IndexOutOfBoundsException
/*    */     //   113: dup
/*    */     //   114: new java/lang/StringBuilder
/*    */     //   117: dup
/*    */     //   118: invokespecial <init> : ()V
/*    */     //   121: ldc '攴ꈵ铑賴㤷⹲'
/*    */     //   123: invokevirtual toCharArray : ()[C
/*    */     //   126: dup
/*    */     //   127: dup
/*    */     //   128: iconst_4
/*    */     //   129: dup_x1
/*    */     //   130: caload
/*    */     //   131: sipush #23901
/*    */     //   134: ixor
/*    */     //   135: i2c
/*    */     //   136: castore
/*    */     //   137: sipush #16531
/*    */     //   140: iconst_3
/*    */     //   141: iconst_4
/*    */     //   142: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   148: iload_1
/*    */     //   149: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   152: ldc '뛆ય먒?쬹旹쓃㬰秒蘍缢⨆荁灿i铜ꡇ⓲㎜ǈꗢ堬햀嫊ꐝ㣕궓ၠ'
/*    */     //   154: invokevirtual toCharArray : ()[C
/*    */     //   157: dup
/*    */     //   158: dup
/*    */     //   159: bipush #16
/*    */     //   161: dup_x1
/*    */     //   162: caload
/*    */     //   163: sipush #15043
/*    */     //   166: ixor
/*    */     //   167: i2c
/*    */     //   168: castore
/*    */     //   169: sipush #18379
/*    */     //   172: iconst_1
/*    */     //   173: iconst_1
/*    */     //   174: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   180: aload_0
/*    */     //   181: invokeinterface size : ()I
/*    */     //   186: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   189: ldc '牟㞭'
/*    */     //   191: invokevirtual toCharArray : ()[C
/*    */     //   194: dup
/*    */     //   195: dup
/*    */     //   196: iconst_0
/*    */     //   197: dup_x1
/*    */     //   198: caload
/*    */     //   199: sipush #16623
/*    */     //   202: ixor
/*    */     //   203: i2c
/*    */     //   204: castore
/*    */     //   205: sipush #8553
/*    */     //   208: iconst_3
/*    */     //   209: iconst_3
/*    */     //   210: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   216: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   219: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   222: athrow
/*    */     //   223: ldc2_w 6911378676073185349
/*    */     //   226: lload #5
/*    */     //   228: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   233: athrow
/*    */     //   234: aload_2
/*    */     //   235: iload_3
/*    */     //   236: iload #4
/*    */     //   238: invokestatic a : ([III)V
/*    */     //   241: iload_1
/*    */     //   242: iload #4
/*    */     //   244: iadd
/*    */     //   245: aload_0
/*    */     //   246: invokeinterface size : ()I
/*    */     //   251: if_icmple -> 380
/*    */     //   254: new java/lang/IndexOutOfBoundsException
/*    */     //   257: dup
/*    */     //   258: new java/lang/StringBuilder
/*    */     //   261: dup
/*    */     //   262: invokespecial <init> : ()V
/*    */     //   265: ldc '⚛嶲䨃伓ꤶ萛蒝훹༅ધǿ'
/*    */     //   267: invokevirtual toCharArray : ()[C
/*    */     //   270: dup
/*    */     //   271: dup
/*    */     //   272: iconst_1
/*    */     //   273: dup_x1
/*    */     //   274: caload
/*    */     //   275: sipush #15002
/*    */     //   278: ixor
/*    */     //   279: i2c
/*    */     //   280: castore
/*    */     //   281: sipush #6922
/*    */     //   284: iconst_2
/*    */     //   285: iconst_3
/*    */     //   286: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   292: iload_1
/*    */     //   293: iload #4
/*    */     //   295: iadd
/*    */     //   296: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   299: ldc '⿗鉳叹ꚦ쟲迠畋엫謙ꗂ鏻?⾐䅇畧῜ಞ꣬빐㥥⽓०銟⊭檪䥏ᥠ'
/*    */     //   301: invokevirtual toCharArray : ()[C
/*    */     //   304: dup
/*    */     //   305: dup
/*    */     //   306: iconst_5
/*    */     //   307: dup_x1
/*    */     //   308: caload
/*    */     //   309: sipush #3504
/*    */     //   312: ixor
/*    */     //   313: i2c
/*    */     //   314: castore
/*    */     //   315: sipush #30560
/*    */     //   318: iconst_5
/*    */     //   319: iconst_1
/*    */     //   320: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   326: aload_0
/*    */     //   327: invokeinterface size : ()I
/*    */     //   332: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   335: ldc '垕⏤'
/*    */     //   337: invokevirtual toCharArray : ()[C
/*    */     //   340: dup
/*    */     //   341: dup
/*    */     //   342: iconst_0
/*    */     //   343: dup_x1
/*    */     //   344: caload
/*    */     //   345: sipush #25398
/*    */     //   348: ixor
/*    */     //   349: i2c
/*    */     //   350: castore
/*    */     //   351: sipush #23862
/*    */     //   354: iconst_0
/*    */     //   355: iconst_3
/*    */     //   356: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   362: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   365: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   368: athrow
/*    */     //   369: ldc2_w 6911378676073185349
/*    */     //   372: lload #5
/*    */     //   374: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   379: athrow
/*    */     //   380: aload_0
/*    */     //   381: iload_1
/*    */     //   382: invokeinterface a : (I)Lme/konsolas/aac/de;
/*    */     //   387: astore #7
/*    */     //   389: iconst_0
/*    */     //   390: istore #8
/*    */     //   392: iload #8
/*    */     //   394: iload #4
/*    */     //   396: if_icmpge -> 437
/*    */     //   399: aload #7
/*    */     //   401: invokeinterface nextInt : ()I
/*    */     //   406: pop
/*    */     //   407: aload #7
/*    */     //   409: aload_2
/*    */     //   410: iload_3
/*    */     //   411: iload #8
/*    */     //   413: iinc #8, 1
/*    */     //   416: iadd
/*    */     //   417: iaload
/*    */     //   418: invokeinterface c : (I)V
/*    */     //   423: goto -> 392
/*    */     //   426: ldc2_w 6911378676073185349
/*    */     //   429: lload #5
/*    */     //   431: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   436: athrow
/*    */     //   437: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 9
/*    */     //   #74	-> 100
/*    */     //   #65	-> 234
/*    */     //   #9	-> 241
/*    */     //   #41	-> 380
/*    */     //   #25	-> 389
/*    */     //   #63	-> 392
/*    */     //   #5	-> 399
/*    */     //   #58	-> 407
/*    */     //   #13	-> 437
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	89	89	java/lang/IndexOutOfBoundsException
/*    */     //   100	223	223	java/lang/IndexOutOfBoundsException
/*    */     //   234	369	369	java/lang/IndexOutOfBoundsException
/*    */     //   392	426	426	java/lang/IndexOutOfBoundsException }
/* 56 */   default void a(kx paramkx) { try { if (paramkx == null) { b(paramkx); } else { int[] arrayOfInt = a(); fG.a(arrayOfInt, paramkx); a(arrayOfInt); }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  } default boolean a(f8 paramf8) { return a(size(), paramf8); } default void a(int[] paramArrayOfint) { b(0, paramArrayOfint); } @Deprecated default Integer a(int paramInt) { return Integer.valueOf(d(paramInt)); } default boolean a(int paramInt, f8 paramf8) { return a(paramInt, paramf8); } default List subList(int paramInt1, int paramInt2) { return b(paramInt1, paramInt2); } @Deprecated default boolean add(Object paramObject) { return a((Integer)paramObject); } @Deprecated default void a(int paramInt, Integer paramInteger) { a(paramInt, paramInteger.intValue()); } default fK b() { try { if (this instanceof java.util.RandomAccess) return new bH(this, 0);  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  return hl.a(a(), jC.a(this), 16720); } @Deprecated default Object get(int paramInt) { return b(paramInt); }
/* 57 */   default void b(kx paramkx) { int[] arrayOfInt = a();
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/*    */       if (paramkx == null) {
/*    */         fG.b(arrayOfInt);
/*    */       } else {
/*    */         fG.b(arrayOfInt, paramkx);
/*    */       } 
/*    */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*    */       throw c(null);
/*    */     } 
/*    */ 
/*    */     
/* 72 */     a(arrayOfInt); } @Deprecated default void add(int paramInt, Object paramObject) { a(paramInt, (Integer)paramObject); } @Deprecated default int lastIndexOf(Object paramObject) { return a(((Integer)paramObject).intValue()); } @Deprecated default void replaceAll(UnaryOperator paramUnaryOperator) { try { Objects.requireNonNull(paramUnaryOperator); Objects.requireNonNull(paramUnaryOperator); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  a((paramUnaryOperator instanceof IntUnaryOperator) ? (IntUnaryOperator)paramUnaryOperator : paramUnaryOperator::apply); } default ListIterator listIterator(int paramInt) { return a(paramInt); } default void a(lu paramlu) { a(paramlu); } default void a(IntUnaryOperator paramIntUnaryOperator) { de de = b(); try { while (de.hasNext()) de.c(paramIntUnaryOperator.applyAsInt(de.nextInt()));  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  } default void b(int paramInt, int[] paramArrayOfint) { b(paramInt, paramArrayOfint, 0, paramArrayOfint.length); } @Deprecated default boolean contains(Object paramObject) { return super.contains(paramObject); } default Iterator iterator() { return a(); }
/* 73 */   static f8 a(int paramInt1, int paramInt2) { return at.a(new int[] { paramInt1, paramInt2 }); }
/*    */ 
/*    */   
/*    */   de a();
/*    */   
/*    */   de b();
/*    */   
/*    */   de a(int paramInt);
/*    */   
/*    */   f8 b(int paramInt1, int paramInt2);
/*    */   
/*    */   void a(int paramInt);
/*    */   
/*    */   void c(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3);
/*    */   
/*    */   void b(int paramInt1, int paramInt2);
/*    */   
/*    */   void a(int paramInt, int[] paramArrayOfint);
/*    */   
/*    */   void a(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3);
/*    */   
/*    */   boolean a(int paramInt);
/*    */   
/*    */   void a(int paramInt1, int paramInt2);
/*    */   
/*    */   boolean a(int paramInt, n paramn);
/*    */   
/*    */   int a(int paramInt1, int paramInt2);
/*    */   
/*    */   int b(int paramInt);
/*    */   
/*    */   int c(int paramInt);
/*    */   
/*    */   int a(int paramInt);
/*    */   
/*    */   int d(int paramInt);
/*    */   
/*    */   private static IndexOutOfBoundsException c(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
/*    */     return paramIndexOutOfBoundsException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */