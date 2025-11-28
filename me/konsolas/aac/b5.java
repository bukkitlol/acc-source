/*     */ package me.konsolas.aac;
/*     */ public class b5 extends b9 implements hT, RandomAccess, Cloneable, Serializable {
/*     */   private static final long serialVersionUID = 0L;
/*     */   static final b5 e;
/*     */   private final Object[] d;
/*     */   private static final Collector c;
/*     */   
/*     */   public int size() {
/*   9 */     return this.d.length;
/*     */   } public b5 b() {
/*  11 */     return this;
/*     */   }
/*     */   
/*     */   public ae a() {
/*  15 */     return new mv(this);
/*     */   }
/*  17 */   private static final long f = nc.a(1606729297266970832L, 9064642507936410488L, MethodHandles.lookup().lookupClass()).a(4321245344578L); static { e = new b5(mK.d); c = Collector.of(b2::new, b2::add, b2::a, b5::a, new Collector.Characteristics[0]); } public Spliterator spliterator() { return a(); } public void forEach(Consumer<Object> paramConsumer) { byte b = 0; try { for (; b < this.d.length; 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  50 */         b++)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  84 */         paramConsumer.accept(this.d[b]); }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  }
/*     */   public b5(jM paramjM) { this(paramjM.isEmpty() ? a() : fq.a(paramjM.b())); }
/*     */   public boolean equals(Object paramObject) { try { if (paramObject == this)
/*     */         return true;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  try { if (paramObject == null)
/*     */         return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  try { if (!(paramObject instanceof List))
/*     */         return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  try { if (paramObject instanceof b5)
/*     */         return a((b5)paramObject);  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  try { if (paramObject instanceof bQ)
/*     */         return ((bQ)paramObject).equals(this);  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }
/*     */      return super.equals(paramObject); }
/*     */   public b5(ea paramea) { this(paramea.hasNext() ? fq.a(paramea) : a()); } public Object[] toArray(Object[] paramArrayOfObject) { if (paramArrayOfObject == null) { paramArrayOfObject = new Object[size()]; }
/*     */     else if (paramArrayOfObject.length < size()) { paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), size()); }
/*  95 */      try { System.arraycopy(this.d, 0, paramArrayOfObject, 0, size()); if (paramArrayOfObject.length > size())
/*     */         paramArrayOfObject[size()] = null;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  return paramArrayOfObject; } public i0 a(int paramInt) { d(paramInt); return new mO(this, paramInt); }
/*     */   public static Collector a() { return c; }
/*     */   public boolean a(b5 paramb5) { try { if (paramb5 == this)
/*     */         return true;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  try { if (this.d == paramb5.d)
/*     */         return true;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  int i = size(); try { if (i != paramb5.size())
/* 101 */         return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  Object[] arrayOfObject1 = this.d; Object[] arrayOfObject2 = paramb5.d; return Arrays.equals(arrayOfObject1, arrayOfObject2); } public int a(b5 paramb5) { int i = size(), j = paramb5.size(); Object[] arrayOfObject1 = this.d, arrayOfObject2 = paramb5.d; byte b = 0; while (true) { try { if (b < i && b < j) { int k; Object object1 = arrayOfObject1[b]; Object object2 = arrayOfObject2[b]; try { if ((k = ((Comparable<Object>)object1).compareTo(object2)) != 0) return k;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  b++; continue; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  break; }  try { try {  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  return (b < j) ? -1 : ((b < i) ? 1 : 0); } public Object get(int paramInt) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b5.f : J
/*     */     //   3: ldc2_w 91766322745424
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: iload_1
/*     */     //   9: aload_0
/*     */     //   10: getfield d : [Ljava/lang/Object;
/*     */     //   13: arraylength
/*     */     //   14: if_icmplt -> 139
/*     */     //   17: new java/lang/IndexOutOfBoundsException
/*     */     //   20: dup
/*     */     //   21: new java/lang/StringBuilder
/*     */     //   24: dup
/*     */     //   25: invokespecial <init> : ()V
/*     */     //   28: ldc '衞デ⚷酩踶዗؍'
/*     */     //   30: invokevirtual toCharArray : ()[C
/*     */     //   33: dup
/*     */     //   34: dup
/*     */     //   35: iconst_4
/*     */     //   36: dup_x1
/*     */     //   37: caload
/*     */     //   38: sipush #10974
/*     */     //   41: ixor
/*     */     //   42: i2c
/*     */     //   43: castore
/*     */     //   44: sipush #1435
/*     */     //   47: iconst_1
/*     */     //   48: iconst_1
/*     */     //   49: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   55: iload_1
/*     */     //   56: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   59: ldc '۳倲ท㨆蒖ᑿ⾔Ⲅ䳼귙ᘈ뤛뻂띞蘅佇붷히ԋ儏ސ쳕춣쒎㚭?ꈜ釐瑛퇢蹾㰏윝ꗮ脁银ᾢ?䍹'
/*     */     //   61: invokevirtual toCharArray : ()[C
/*     */     //   64: dup
/*     */     //   65: dup
/*     */     //   66: bipush #26
/*     */     //   68: dup_x1
/*     */     //   69: caload
/*     */     //   70: sipush #30618
/*     */     //   73: ixor
/*     */     //   74: i2c
/*     */     //   75: castore
/*     */     //   76: sipush #8372
/*     */     //   79: iconst_0
/*     */     //   80: iconst_1
/*     */     //   81: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   87: aload_0
/*     */     //   88: getfield d : [Ljava/lang/Object;
/*     */     //   91: arraylength
/*     */     //   92: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   95: ldc '况甎'
/*     */     //   97: invokevirtual toCharArray : ()[C
/*     */     //   100: dup
/*     */     //   101: dup
/*     */     //   102: iconst_0
/*     */     //   103: dup_x1
/*     */     //   104: caload
/*     */     //   105: sipush #17676
/*     */     //   108: ixor
/*     */     //   109: i2c
/*     */     //   110: castore
/*     */     //   111: sipush #12352
/*     */     //   114: iconst_1
/*     */     //   115: iconst_0
/*     */     //   116: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   122: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   125: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   128: athrow
/*     */     //   129: ldc2_w 1308987769411389553
/*     */     //   132: lload_2
/*     */     //   133: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   138: athrow
/*     */     //   139: aload_0
/*     */     //   140: getfield d : [Ljava/lang/Object;
/*     */     //   143: iload_1
/*     */     //   144: aaload
/*     */     //   145: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 8
/*     */     //   #2	-> 139
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	129	129	java/lang/IndexOutOfBoundsException }
/* 102 */   private static b5 a(b2 paramb2) { try { if (paramb2.isEmpty()) return a();  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }
/*     */     
/*     */     Object[] arrayOfObject = paramb2.a();
/*     */     if (paramb2.size() != arrayOfObject.length)
/*     */       arrayOfObject = Arrays.copyOf(arrayOfObject, paramb2.size()); 
/*     */     return new b5(arrayOfObject); }
/*     */ 
/*     */   
/*     */   public b5(hT paramhT) {
/*     */     this(paramhT.isEmpty() ? a() : new Object[paramhT.size()]);
/*     */     paramhT.c(0, this.d, 0, paramhT.size());
/*     */   }
/*     */   
/*     */   @SafeVarargs
/*     */   public static b5 a(Object[] paramArrayOfObject) {
/*     */     try {
/*     */     
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw c(null);
/*     */     } 
/*     */     return (paramArrayOfObject.length == 0) ? a() : new b5(paramArrayOfObject);
/*     */   }
/*     */   
/*     */   public ListIterator listIterator(int paramInt) {
/*     */     return a(paramInt);
/*     */   }
/*     */   
/*     */   public static Collector a(int paramInt) {
/*     */     try {
/*     */       if (paramInt <= 10)
/*     */         return a(); 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw c(null);
/*     */     } 
/*     */     return Collector.of(new ga(paramInt, paramInt -> {
/*     */             try {
/*     */             
/*     */             } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */               throw c(null);
/*     */             } 
/*     */             return (IntFunction)((paramInt <= 10) ? new b2() : new b2(paramInt));
/*     */           }), b2::add, b2::a, b5::a, new Collector.Characteristics[0]);
/*     */   }
/*     */   
/*     */   public int compareTo(Object paramObject) {
/*     */     return a((List)paramObject);
/*     */   }
/*     */   
/*     */   public Object[] toArray() {
/*     */     try {
/*     */       if (this.d.getClass().equals(Object[].class))
/*     */         return (Object[])this.d.clone(); 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw c(null);
/*     */     } 
/*     */     return Arrays.copyOf(this.d, this.d.length, Object[].class);
/*     */   }
/*     */   
/*     */   public Object clone() {
/*     */     return b();
/*     */   }
/*     */   
/*     */   public static b5 a() {
/*     */     return e;
/*     */   }
/*     */   
/*     */   public int indexOf(Object paramObject) {
/*     */     byte b = 0;
/*     */     int i = this.d.length;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < i) {
/*     */           try {
/*     */             if (Objects.equals(paramObject, this.d[b]))
/*     */               return b; 
/*     */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */             throw c(null);
/*     */           } 
/*     */           b++;
/*     */           continue;
/*     */         } 
/*     */       } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */         throw c(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     return -1;
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) {
/*     */     mK.b(paramArrayOfObject, paramInt2, paramInt3);
/*     */     System.arraycopy(this.d, paramInt1, paramArrayOfObject, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public b5(Collection paramCollection) {
/*     */     this(paramCollection.isEmpty() ? a() : fq.a(paramCollection.iterator()));
/*     */   }
/*     */   
/*     */   public int a(List paramList) {
/*     */     try {
/*     */       if (paramList instanceof b5)
/*     */         return a((b5)paramList); 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw c(null);
/*     */     } 
/*     */     if (paramList instanceof bQ) {
/*     */       bQ bQ = (bQ)paramList;
/*     */       return -bQ.a(this);
/*     */     } 
/*     */     return super.a(paramList);
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     try {
/*     */     
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw c(null);
/*     */     } 
/*     */     return (this.d.length == 0);
/*     */   }
/*     */   
/*     */   private static final Object[] a() {
/*     */     return mK.d;
/*     */   }
/*     */   
/*     */   public hT a(int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b5.f : J
/*     */     //   3: ldc2_w 106650417503667
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: iload_1
/*     */     //   9: ifne -> 45
/*     */     //   12: iload_2
/*     */     //   13: aload_0
/*     */     //   14: invokevirtual size : ()I
/*     */     //   17: if_icmpne -> 45
/*     */     //   20: goto -> 33
/*     */     //   23: ldc2_w -2321246095049947758
/*     */     //   26: lload_3
/*     */     //   27: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   32: athrow
/*     */     //   33: aload_0
/*     */     //   34: areturn
/*     */     //   35: ldc2_w -2321246095049947758
/*     */     //   38: lload_3
/*     */     //   39: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   44: athrow
/*     */     //   45: aload_0
/*     */     //   46: iload_1
/*     */     //   47: invokevirtual d : (I)V
/*     */     //   50: aload_0
/*     */     //   51: iload_2
/*     */     //   52: invokevirtual d : (I)V
/*     */     //   55: iload_1
/*     */     //   56: iload_2
/*     */     //   57: if_icmpne -> 74
/*     */     //   60: getstatic me/konsolas/aac/b5.e : Lme/konsolas/aac/b5;
/*     */     //   63: areturn
/*     */     //   64: ldc2_w -2321246095049947758
/*     */     //   67: lload_3
/*     */     //   68: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   73: athrow
/*     */     //   74: iload_1
/*     */     //   75: iload_2
/*     */     //   76: if_icmple -> 201
/*     */     //   79: new java/lang/IllegalArgumentException
/*     */     //   82: dup
/*     */     //   83: new java/lang/StringBuilder
/*     */     //   86: dup
/*     */     //   87: invokespecial <init> : ()V
/*     */     //   90: ldc_w '涖ꌼ糵﷍婧跘䳯暲ﵭ퀆鐃崸俲'
/*     */     //   93: invokevirtual toCharArray : ()[C
/*     */     //   96: dup
/*     */     //   97: dup
/*     */     //   98: bipush #6
/*     */     //   100: dup_x1
/*     */     //   101: caload
/*     */     //   102: sipush #20259
/*     */     //   105: ixor
/*     */     //   106: i2c
/*     */     //   107: castore
/*     */     //   108: sipush #8155
/*     */     //   111: iconst_0
/*     */     //   112: iconst_0
/*     */     //   113: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   119: iload_1
/*     */     //   120: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   123: ldc_w 'ꢽ䤗㐑ﴫꏈ컟﷞栮弄頓寐ᔽٹ쌤⣁촉᥅荺ᑈꀤᯈ՟⭠传鐊⥗숇䒀'
/*     */     //   126: invokevirtual toCharArray : ()[C
/*     */     //   129: dup
/*     */     //   130: dup
/*     */     //   131: bipush #9
/*     */     //   133: dup_x1
/*     */     //   134: caload
/*     */     //   135: sipush #1455
/*     */     //   138: ixor
/*     */     //   139: i2c
/*     */     //   140: castore
/*     */     //   141: sipush #16582
/*     */     //   144: iconst_0
/*     */     //   145: iconst_1
/*     */     //   146: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   152: iload_2
/*     */     //   153: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   156: ldc_w '㮾䅼'
/*     */     //   159: invokevirtual toCharArray : ()[C
/*     */     //   162: dup
/*     */     //   163: dup
/*     */     //   164: iconst_0
/*     */     //   165: dup_x1
/*     */     //   166: caload
/*     */     //   167: sipush #5735
/*     */     //   170: ixor
/*     */     //   171: i2c
/*     */     //   172: castore
/*     */     //   173: sipush #21039
/*     */     //   176: iconst_1
/*     */     //   177: iconst_0
/*     */     //   178: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   184: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   187: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   190: athrow
/*     */     //   191: ldc2_w -2321246095049947758
/*     */     //   194: lload_3
/*     */     //   195: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   200: athrow
/*     */     //   201: new me/konsolas/aac/bQ
/*     */     //   204: dup
/*     */     //   205: aload_0
/*     */     //   206: iload_1
/*     */     //   207: iload_2
/*     */     //   208: invokespecial <init> : (Lme/konsolas/aac/b5;II)V
/*     */     //   211: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 8
/*     */     //   #22	-> 45
/*     */     //   #62	-> 50
/*     */     //   #85	-> 55
/*     */     //   #96	-> 74
/*     */     //   #18	-> 201
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	20	23	java/lang/IndexOutOfBoundsException
/*     */     //   12	35	35	java/lang/IndexOutOfBoundsException
/*     */     //   45	64	64	java/lang/IndexOutOfBoundsException
/*     */     //   74	191	191	java/lang/IndexOutOfBoundsException
/*     */   }
/*     */   
/*     */   public List subList(int paramInt1, int paramInt2) {
/*     */     return a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public b5(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
/*     */     this((paramInt2 == 0) ? a() : new Object[paramInt2]);
/*     */     System.arraycopy(paramArrayOfObject, paramInt1, this.d, 0, paramInt2);
/*     */   }
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/*     */     for (int i = this.d.length; i-- != 0;) {
/*     */       if (Objects.equals(paramObject, this.d[i]))
/*     */         return i; 
/*     */     } 
/*     */     return -1;
/*     */   }
/*     */   
/*     */   public b5(Object[] paramArrayOfObject) {
/*     */     this.d = paramArrayOfObject;
/*     */   }
/*     */   
/*     */   private static IndexOutOfBoundsException c(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
/*     */     return paramIndexOutOfBoundsException;
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\b5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */