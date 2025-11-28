/*    */ package me.konsolas.aac;public class at extends au implements f8, RandomAccess, Cloneable, Serializable { private static final long serialVersionUID = 0L; static final at c;
/*    */   private final int[] d;
/*    */   
/*    */   public de a(int paramInt) {
/*  5 */     d(paramInt);
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
/* 33 */     return new gR(this, paramInt);
/*    */   }
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
/*    */   public int a(at paramat) {
/*    */     try {
/*    */       if (this.d == paramat.d) {
/*    */         return 0;
/*    */       }
/*    */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*    */       throw a(null);
/*    */     } 
/* 63 */     int i = size(), j = paramat.size(); int[] arrayOfInt1 = this.d, arrayOfInt2 = paramat.d; byte b = 0; while (true) { try { if (b < i && b < j) { int n, k = arrayOfInt1[b]; int m = arrayOfInt2[b]; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  break; }  try { try {  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/*    */      return (b < j) ? -1 : ((b < i) ? 1 : 0);
/*    */   }
/*    */   public boolean isEmpty() { try {  }
/*    */     catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/*    */      return (this.d.length == 0); }
/*    */   public at(f8 paramf8) { this(paramf8.isEmpty() ? fG.a : new int[paramf8.size()]); paramf8.c(0, this.d, 0, paramf8.size()); }
/*    */   public int c(int paramInt) { byte b = 0; int i = this.d.length; while (true) { try { if (b < i) { try { if (paramInt == this.d[b])
/*    */               return b;  }
/*    */           catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/*    */            b++; continue; }
/*    */          }
/*    */       catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/*    */        break; }
/*    */      return -1; }
/*    */   public int[] b(int[] paramArrayOfint) { try { if (paramArrayOfint == null || paramArrayOfint.length < size())
/*    */         paramArrayOfint = new int[this.d.length];  }
/*    */     catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/*    */      System.arraycopy(this.d, 0, paramArrayOfint, 0, paramArrayOfint.length); return paramArrayOfint; }
/*    */   public at b() { return this; }
/*    */   public at(int[] paramArrayOfint, int paramInt1, int paramInt2) { this((paramInt2 == 0) ? fG.a : new int[paramInt2]); System.arraycopy(paramArrayOfint, paramInt1, this.d, 0, paramInt2); }
/* 84 */   public int compareTo(Object paramObject) { return a((List)paramObject); } public at(cA paramcA) { this(paramcA.hasNext() ? mW.a(paramcA) : fG.a); } public at(int[] paramArrayOfint) { this.d = paramArrayOfint; }
/*    */   public void c(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3) { fG.a(paramArrayOfint, paramInt2, paramInt3); System.arraycopy(this.d, paramInt1, paramArrayOfint, paramInt2, paramInt3); }
/*    */   private static final long e = nc.a(-5449861800687952348L, 3440608142144103146L, MethodHandles.lookup().lookupClass()).a(204086978107526L);
/* 87 */   static { c = new at(fG.a); } public static at a(IntStream paramIntStream) { return a(Z.a(paramIntStream)); } public Object clone() { return b(); } public static at a(int[] paramArrayOfint) { try {  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return (paramArrayOfint.length == 0) ? a() : new at(paramArrayOfint); } public boolean equals(Object paramObject) { try { if (paramObject == this) return true;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  try { if (paramObject == null) return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  try { if (!(paramObject instanceof List)) return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  try { if (paramObject instanceof at) return a((at)paramObject);  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  try { if (paramObject instanceof aW)
/*    */         return ((aW)paramObject).equals(this);  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return super.equals(paramObject); } public boolean a(at paramat) { try { if (paramat == this)
/*    */         return true;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/* 90 */      try { if (this.d == paramat.d) return true;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  int i = size(); try { if (i != paramat.size()) return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  int[] arrayOfInt1 = this.d; int[] arrayOfInt2 = paramat.d; return Arrays.equals(arrayOfInt1, arrayOfInt2); } public Spliterator spliterator() { return b(); } public fK b() { return new bk(this); } public static at a(IntStream paramIntStream, int paramInt) { return a(Z.a(paramIntStream, paramInt)); } public f8 b(int paramInt1, int paramInt2) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/at.e : J
/*    */     //   3: ldc2_w 95175732225696
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: iload_1
/*    */     //   9: ifne -> 45
/*    */     //   12: iload_2
/*    */     //   13: aload_0
/*    */     //   14: invokevirtual size : ()I
/*    */     //   17: if_icmpne -> 45
/*    */     //   20: goto -> 33
/*    */     //   23: ldc2_w -1946579368181360614
/*    */     //   26: lload_3
/*    */     //   27: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   32: athrow
/*    */     //   33: aload_0
/*    */     //   34: areturn
/*    */     //   35: ldc2_w -1946579368181360614
/*    */     //   38: lload_3
/*    */     //   39: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   44: athrow
/*    */     //   45: aload_0
/*    */     //   46: iload_1
/*    */     //   47: invokevirtual d : (I)V
/*    */     //   50: aload_0
/*    */     //   51: iload_2
/*    */     //   52: invokevirtual d : (I)V
/*    */     //   55: iload_1
/*    */     //   56: iload_2
/*    */     //   57: if_icmpne -> 74
/*    */     //   60: getstatic me/konsolas/aac/at.c : Lme/konsolas/aac/at;
/*    */     //   63: areturn
/*    */     //   64: ldc2_w -1946579368181360614
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   73: athrow
/*    */     //   74: iload_1
/*    */     //   75: iload_2
/*    */     //   76: if_icmple -> 196
/*    */     //   79: new java/lang/IllegalArgumentException
/*    */     //   82: dup
/*    */     //   83: new java/lang/StringBuilder
/*    */     //   86: dup
/*    */     //   87: invokespecial <init> : ()V
/*    */     //   90: ldc '췇ᶄ㙜쇙功￡牔㇗瀻翘ڹ栃앁Ⳬ'
/*    */     //   92: invokevirtual toCharArray : ()[C
/*    */     //   95: dup
/*    */     //   96: dup
/*    */     //   97: iconst_1
/*    */     //   98: dup_x1
/*    */     //   99: caload
/*    */     //   100: sipush #3586
/*    */     //   103: ixor
/*    */     //   104: i2c
/*    */     //   105: castore
/*    */     //   106: sipush #21711
/*    */     //   109: iconst_0
/*    */     //   110: iconst_1
/*    */     //   111: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   117: iload_1
/*    */     //   118: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   121: ldc '㻛䌤ى乥짪⒚ㆷ㊨헯㳵ꍎꑛ甔迥ᑃቐל屆媍ద쉭ㅐ裿圾Ձ߆'
/*    */     //   123: invokevirtual toCharArray : ()[C
/*    */     //   126: dup
/*    */     //   127: dup
/*    */     //   128: iconst_0
/*    */     //   129: dup_x1
/*    */     //   130: caload
/*    */     //   131: sipush #21659
/*    */     //   134: ixor
/*    */     //   135: i2c
/*    */     //   136: castore
/*    */     //   137: sipush #7136
/*    */     //   140: iconst_0
/*    */     //   141: iconst_1
/*    */     //   142: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   148: iload_2
/*    */     //   149: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   152: ldc '࣡'
/*    */     //   154: invokevirtual toCharArray : ()[C
/*    */     //   157: dup
/*    */     //   158: dup
/*    */     //   159: iconst_0
/*    */     //   160: dup_x1
/*    */     //   161: caload
/*    */     //   162: sipush #16898
/*    */     //   165: ixor
/*    */     //   166: i2c
/*    */     //   167: castore
/*    */     //   168: sipush #12323
/*    */     //   171: iconst_1
/*    */     //   172: iconst_1
/*    */     //   173: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   179: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   182: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   185: athrow
/*    */     //   186: ldc2_w -1946579368181360614
/*    */     //   189: lload_3
/*    */     //   190: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   195: athrow
/*    */     //   196: new me/konsolas/aac/aW
/*    */     //   199: dup
/*    */     //   200: aload_0
/*    */     //   201: iload_1
/*    */     //   202: iload_2
/*    */     //   203: invokespecial <init> : (Lme/konsolas/aac/at;II)V
/*    */     //   206: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #65	-> 8
/*    */     //   #30	-> 45
/*    */     //   #68	-> 50
/*    */     //   #40	-> 55
/*    */     //   #69	-> 74
/*    */     //   #58	-> 196
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	20	23	java/lang/IndexOutOfBoundsException
/*    */     //   12	35	35	java/lang/IndexOutOfBoundsException
/*    */     //   45	64	64	java/lang/IndexOutOfBoundsException
/*    */     //   74	186	186	java/lang/IndexOutOfBoundsException } public List subList(int paramInt1, int paramInt2) { return b(paramInt1, paramInt2); } public at(n paramn) { this(paramn.isEmpty() ? fG.a : mW.a(paramn.b())); } public int size() { return this.d.length; } public int a(int paramInt) { for (int i = this.d.length; i-- != 0;) { if (paramInt == this.d[i]) return i;  }  return -1; } public int b(int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/at.e : J
/*    */     //   3: ldc2_w 20947346730891
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: aload_0
/*    */     //   10: getfield d : [I
/*    */     //   13: arraylength
/*    */     //   14: if_icmplt -> 138
/*    */     //   17: new java/lang/IndexOutOfBoundsException
/*    */     //   20: dup
/*    */     //   21: new java/lang/StringBuilder
/*    */     //   24: dup
/*    */     //   25: invokespecial <init> : ()V
/*    */     //   28: ldc 'ࢃ䑭娅利䀽糧봠䳋'
/*    */     //   30: invokevirtual toCharArray : ()[C
/*    */     //   33: dup
/*    */     //   34: dup
/*    */     //   35: iconst_1
/*    */     //   36: dup_x1
/*    */     //   37: caload
/*    */     //   38: sipush #4264
/*    */     //   41: ixor
/*    */     //   42: i2c
/*    */     //   43: castore
/*    */     //   44: sipush #18001
/*    */     //   47: iconst_1
/*    */     //   48: iconst_1
/*    */     //   49: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   55: iload_1
/*    */     //   56: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   59: ldc 'ⰻ㷊䮉ꉍ⢉༆㲝ꭶᶯ醓츗ᆘㅩ辍壔알魒깘籖販₴梴骋芒は뀕?斳冘趋茣첕?㵞㝔勅毲'
/*    */     //   61: invokevirtual toCharArray : ()[C
/*    */     //   64: dup
/*    */     //   65: dup
/*    */     //   66: iconst_0
/*    */     //   67: dup_x1
/*    */     //   68: caload
/*    */     //   69: sipush #15558
/*    */     //   72: ixor
/*    */     //   73: i2c
/*    */     //   74: castore
/*    */     //   75: sipush #19154
/*    */     //   78: iconst_1
/*    */     //   79: iconst_3
/*    */     //   80: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   86: aload_0
/*    */     //   87: getfield d : [I
/*    */     //   90: arraylength
/*    */     //   91: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   94: ldc '뮽র'
/*    */     //   96: invokevirtual toCharArray : ()[C
/*    */     //   99: dup
/*    */     //   100: dup
/*    */     //   101: iconst_0
/*    */     //   102: dup_x1
/*    */     //   103: caload
/*    */     //   104: sipush #10680
/*    */     //   107: ixor
/*    */     //   108: i2c
/*    */     //   109: castore
/*    */     //   110: sipush #6066
/*    */     //   113: iconst_0
/*    */     //   114: iconst_4
/*    */     //   115: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   121: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   124: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   127: athrow
/*    */     //   128: ldc2_w 3303137311040917809
/*    */     //   131: lload_2
/*    */     //   132: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   137: athrow
/*    */     //   138: aload_0
/*    */     //   139: getfield d : [I
/*    */     //   142: iload_1
/*    */     //   143: iaload
/*    */     //   144: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #78	-> 8
/*    */     //   #81	-> 138
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	128	128	java/lang/IndexOutOfBoundsException } private static at a(Z paramZ) { try { if (paramZ.isEmpty()) return a();  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  int[] arrayOfInt = paramZ.b(); if (paramZ.size() != arrayOfInt.length) arrayOfInt = Arrays.copyOf(arrayOfInt, paramZ.size());  return new at(arrayOfInt); } public static at a() { return c; } public int[] a() { return (int[])this.d.clone(); } public ListIterator listIterator(int paramInt) { return a(paramInt); } public void a(IntConsumer paramIntConsumer) { byte b = 0; try { while (b < this.d.length) { paramIntConsumer.accept(this.d[b]); b++; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  } public int a(List paramList) { try { if (paramList instanceof at) return a((at)paramList);  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  if (paramList instanceof aW) { aW aW = (aW)paramList; return -aW.a(this); }  return super.a(paramList); }
/* 91 */   public at(Collection paramCollection) { this(paramCollection.isEmpty() ? fG.a : mW.a(mW.a(paramCollection.iterator()))); }
/*    */ 
/*    */   
/*    */   private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
/*    */     return paramIndexOutOfBoundsException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */