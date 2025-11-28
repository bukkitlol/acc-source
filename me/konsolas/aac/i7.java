/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.io.ObjectOutputStream;
/*     */ import java.io.Serializable;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
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
/*     */ public class i7
/*     */   extends iC
/*     */   implements Serializable, Cloneable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private transient int[] f;
/*     */   private transient Object[] i;
/*     */   private int e;
/*     */   private transient kl d;
/*     */   private transient kQ g;
/*     */   private transient jM h;
/*     */   private static final long j = nc.a(-2981278195424440818L, 681554783843871260L, MethodHandles.lookup().lookupClass()).a(22434621230299L);
/*     */   
/*     */   public i7(int[] paramArrayOfint, Object[] paramArrayOfObject) {
/* 115 */     this.f = paramArrayOfint; this.i = paramArrayOfObject; this.e = paramArrayOfint.length; if (paramArrayOfint.length != paramArrayOfObject.length) {
/*     */       "莒晗ﹱ?袙楉响掇迫羧い폽嚄줛干䲇ﱎǾ묅岩輎墙뎢覘஛謘ﹲᛊᰀ懲옳푗φ碗厭釺摥湅".toCharArray()[30] = (char)("莒晗ﹱ?袙楉响掇迫羧い폽嚄줛干䲇ﱎǾ묅岩輎墙뎢覘஛謘ﹲᛊᰀ懲옳푗φ碗厭釺摥湅".toCharArray()[30] ^ 0x44E5); "ꓕ䖒⴮".toCharArray()[0] = (char)("ꓕ䖒⴮".toCharArray()[0] ^ 0x150E); "䅅綴".toCharArray()[0] = (char)("䅅綴".toCharArray()[0] ^ 0x3598); throw new IllegalArgumentException(hY$g6.H("莒晗ﹱ?袙楉响掇迫羧い폽嚄줛干䲇ﱎǾ묅岩輎墙뎢覘஛謘ﹲᛊᰀ懲옳푗φ碗厭釺摥湅".toCharArray(), (short)12658, (byte)1, (byte)1) + paramArrayOfint.length + hY$g6.H("ꓕ䖒⴮".toCharArray(), (short)22464, (byte)0, (byte)1) + paramArrayOfObject.length + hY$g6.H("䅅綴".toCharArray(), (short)8451, (byte)3, (byte)1));
/*     */     }  } public i7(c5 paramc5) { this(paramc5.size()); boolean bool = false;
/* 118 */     for (ea ea = paramc5.a().b(); ea.hasNext(); this.f[bool] = eB.a()) eB eB = ea.next(); 
/*     */     this.e = bool; }
/*     */ 
/*     */   
/*     */   public i7() {
/*     */     this.f = fG.a;
/*     */     this.i = mK.d;
/*     */   }
/*     */   
/*     */   public kl a() {
/*     */     try {
/*     */       if (this.d == null)
/*     */         this.d = new bv(this, null); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return this.d;
/*     */   }
/*     */   
/*     */   public hy a() {
/*     */     return a();
/*     */   }
/*     */   
/*     */   public jM a() {
/*     */     try {
/*     */       if (this.h == null)
/*     */         this.h = new al(this, null); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return this.h;
/*     */   }
/*     */   
/*     */   private void writeObject(ObjectOutputStream paramObjectOutputStream) {
/*     */     paramObjectOutputStream.defaultWriteObject();
/*     */     byte b = 0;
/*     */     int i = this.e;
/*     */     try {
/*     */       while (b < i) {
/*     */         paramObjectOutputStream.writeInt(this.f[b]);
/*     */         paramObjectOutputStream.writeObject(this.i[b]);
/*     */         b++;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public i7 a() {
/*     */     i7 i71;
/*     */     try {
/*     */       i71 = (i7)super.clone();
/*     */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/*     */       throw new InternalError();
/*     */     } 
/*     */     i71.f = (int[])this.f.clone();
/*     */     i71.i = (Object[])this.i.clone();
/*     */     i71.d = null;
/*     */     i71.g = null;
/*     */     i71.h = null;
/*     */     return i71;
/*     */   }
/*     */   
/*     */   private void readObject(ObjectInputStream paramObjectInputStream) {
/*     */     paramObjectInputStream.defaultReadObject();
/*     */     this.f = new int[this.e];
/*     */     this.i = new Object[this.e];
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < this.e) {
/*     */         this.f[b] = paramObjectInputStream.readInt();
/*     */         this.i[b] = paramObjectInputStream.readObject();
/*     */         b++;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object a(int paramInt) {
/*     */     int[] arrayOfInt = this.f;
/*     */     for (int i = this.e; i-- != 0;) {
/*     */       if (arrayOfInt[i] == paramInt)
/*     */         return this.i[i]; 
/*     */     } 
/*     */     return this.a;
/*     */   }
/*     */   
/*     */   public Set keySet() {
/*     */     return a();
/*     */   }
/*     */   
/*     */   public i7(int[] paramArrayOfint, Object[] paramArrayOfObject, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/i7.j : J
/*     */     //   3: ldc2_w 128972063563029
/*     */     //   6: lxor
/*     */     //   7: lstore #4
/*     */     //   9: aload_0
/*     */     //   10: invokespecial <init> : ()V
/*     */     //   13: aload_0
/*     */     //   14: aload_1
/*     */     //   15: putfield f : [I
/*     */     //   18: aload_0
/*     */     //   19: aload_2
/*     */     //   20: putfield i : [Ljava/lang/Object;
/*     */     //   23: aload_0
/*     */     //   24: iload_3
/*     */     //   25: putfield e : I
/*     */     //   28: aload_1
/*     */     //   29: arraylength
/*     */     //   30: aload_2
/*     */     //   31: arraylength
/*     */     //   32: if_icmpeq -> 145
/*     */     //   35: new java/lang/IllegalArgumentException
/*     */     //   38: dup
/*     */     //   39: new java/lang/StringBuilder
/*     */     //   42: dup
/*     */     //   43: invokespecial <init> : ()V
/*     */     //   46: ldc 'ꢺℒ쥤孪矫᣶閻焐쥁⧕飼폹Ϊモ즠㸯鰹橞榾肼숕懓뉨惙뱎黜攳㼕뒢釷圜㸡깏䮳'
/*     */     //   48: invokevirtual toCharArray : ()[C
/*     */     //   51: dup
/*     */     //   52: dup
/*     */     //   53: bipush #15
/*     */     //   55: dup_x1
/*     */     //   56: caload
/*     */     //   57: sipush #17289
/*     */     //   60: ixor
/*     */     //   61: i2c
/*     */     //   62: castore
/*     */     //   63: sipush #5755
/*     */     //   66: iconst_5
/*     */     //   67: iconst_3
/*     */     //   68: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   74: aload_1
/*     */     //   75: arraylength
/*     */     //   76: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   79: ldc 'ꡪ䪞♰'
/*     */     //   81: invokevirtual toCharArray : ()[C
/*     */     //   84: dup
/*     */     //   85: dup
/*     */     //   86: iconst_0
/*     */     //   87: dup_x1
/*     */     //   88: caload
/*     */     //   89: sipush #6509
/*     */     //   92: ixor
/*     */     //   93: i2c
/*     */     //   94: castore
/*     */     //   95: sipush #8770
/*     */     //   98: iconst_2
/*     */     //   99: iconst_5
/*     */     //   100: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   106: aload_2
/*     */     //   107: arraylength
/*     */     //   108: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   111: ldc '⹴猷'
/*     */     //   113: invokevirtual toCharArray : ()[C
/*     */     //   116: dup
/*     */     //   117: dup
/*     */     //   118: iconst_0
/*     */     //   119: dup_x1
/*     */     //   120: caload
/*     */     //   121: sipush #3938
/*     */     //   124: ixor
/*     */     //   125: i2c
/*     */     //   126: castore
/*     */     //   127: sipush #31942
/*     */     //   130: iconst_1
/*     */     //   131: iconst_3
/*     */     //   132: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   138: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   141: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   144: athrow
/*     */     //   145: iload_3
/*     */     //   146: aload_1
/*     */     //   147: arraylength
/*     */     //   148: if_icmple -> 272
/*     */     //   151: new java/lang/IllegalArgumentException
/*     */     //   154: dup
/*     */     //   155: new java/lang/StringBuilder
/*     */     //   158: dup
/*     */     //   159: invokespecial <init> : ()V
/*     */     //   162: ldc '霋꼡␿잉೬⬨棄뵝콲≍㴦꜃ఎ젋୪'
/*     */     //   164: invokevirtual toCharArray : ()[C
/*     */     //   167: dup
/*     */     //   168: dup
/*     */     //   169: bipush #12
/*     */     //   171: dup_x1
/*     */     //   172: caload
/*     */     //   173: sipush #9457
/*     */     //   176: ixor
/*     */     //   177: i2c
/*     */     //   178: castore
/*     */     //   179: sipush #9241
/*     */     //   182: iconst_5
/*     */     //   183: iconst_3
/*     */     //   184: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   190: iload_3
/*     */     //   191: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   194: ldc '㉐〘΢ﬁ㕤棹㼈륦淫䪚?퇓뫇꘮픨考腸ꟑ檶䏈㛌归ፕ툼࿻䁋⇽濼떜뱚糏ࡳ䌲ຟ濳?퍛臲磹뉺擨楷ﯝ綮߫剑萆⌠䞀'
/*     */     //   196: invokevirtual toCharArray : ()[C
/*     */     //   199: dup
/*     */     //   200: dup
/*     */     //   201: bipush #32
/*     */     //   203: dup_x1
/*     */     //   204: caload
/*     */     //   205: sipush #2870
/*     */     //   208: ixor
/*     */     //   209: i2c
/*     */     //   210: castore
/*     */     //   211: sipush #7299
/*     */     //   214: iconst_1
/*     */     //   215: iconst_3
/*     */     //   216: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   222: aload_1
/*     */     //   223: arraylength
/*     */     //   224: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   227: ldc '욡痴'
/*     */     //   229: invokevirtual toCharArray : ()[C
/*     */     //   232: dup
/*     */     //   233: dup
/*     */     //   234: iconst_0
/*     */     //   235: dup_x1
/*     */     //   236: caload
/*     */     //   237: sipush #10078
/*     */     //   240: ixor
/*     */     //   241: i2c
/*     */     //   242: castore
/*     */     //   243: sipush #23373
/*     */     //   246: iconst_4
/*     */     //   247: iconst_1
/*     */     //   248: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   254: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   257: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   260: athrow
/*     */     //   261: ldc2_w -6531441575829246643
/*     */     //   264: lload #4
/*     */     //   266: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   271: athrow
/*     */     //   272: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #61	-> 9
/*     */     //   #23	-> 13
/*     */     //   #13	-> 18
/*     */     //   #102	-> 23
/*     */     //   #90	-> 28
/*     */     //   #3	-> 145
/*     */     //   #15	-> 272
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   145	261	261	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   private int a(int paramInt) {
/*     */     int[] arrayOfInt = this.f;
/*     */     for (int i = this.e; i-- != 0;) {
/*     */       if (arrayOfInt[i] == paramInt)
/*     */         return i; 
/*     */     } 
/*     */     return -1;
/*     */   }
/*     */   
/*     */   public i7(int paramInt) {
/*     */     this.f = new int[paramInt];
/*     */     this.i = new Object[paramInt];
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     int i = this.e;
/*     */     try {
/*     */       while (i-- != 0)
/*     */         this.i[i] = null; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     this.e = 0;
/*     */   }
/*     */   
/*     */   public Collection values() {
/*     */     return a();
/*     */   }
/*     */   
/*     */   public int size() {
/*     */     return this.e;
/*     */   }
/*     */   
/*     */   public Object clone() {
/*     */     return a();
/*     */   }
/*     */   
/*     */   public boolean containsValue(Object paramObject) {
/*     */     for (int i = this.e; i-- != 0;) {
/*     */       if (Objects.equals(this.i[i], paramObject))
/*     */         return true; 
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (this.e == 0);
/*     */   }
/*     */   
/*     */   public Object b(int paramInt) {
/*     */     int i = a(paramInt);
/*     */     try {
/*     */       if (i == -1)
/*     */         return this.a; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     Object object = this.i[i];
/*     */     int j = this.e - i - 1;
/*     */     System.arraycopy(this.f, i + 1, this.f, i, j);
/*     */     System.arraycopy(this.i, i + 1, this.i, i, j);
/*     */     this.e--;
/*     */     this.i[this.e] = null;
/*     */     return object;
/*     */   }
/*     */   
/*     */   public boolean g(int paramInt) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (a(paramInt) != -1);
/*     */   }
/*     */   
/*     */   public Object b(int paramInt, Object paramObject) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload_1
/*     */     //   2: invokespecial a : (I)I
/*     */     //   5: istore_3
/*     */     //   6: iload_3
/*     */     //   7: iconst_m1
/*     */     //   8: if_icmpeq -> 29
/*     */     //   11: aload_0
/*     */     //   12: getfield i : [Ljava/lang/Object;
/*     */     //   15: iload_3
/*     */     //   16: aaload
/*     */     //   17: astore #4
/*     */     //   19: aload_0
/*     */     //   20: getfield i : [Ljava/lang/Object;
/*     */     //   23: iload_3
/*     */     //   24: aload_2
/*     */     //   25: aastore
/*     */     //   26: aload #4
/*     */     //   28: areturn
/*     */     //   29: aload_0
/*     */     //   30: getfield e : I
/*     */     //   33: aload_0
/*     */     //   34: getfield f : [I
/*     */     //   37: arraylength
/*     */     //   38: if_icmpne -> 156
/*     */     //   41: aload_0
/*     */     //   42: getfield e : I
/*     */     //   45: ifne -> 63
/*     */     //   48: goto -> 55
/*     */     //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: iconst_2
/*     */     //   56: goto -> 69
/*     */     //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   62: athrow
/*     */     //   63: aload_0
/*     */     //   64: getfield e : I
/*     */     //   67: iconst_2
/*     */     //   68: imul
/*     */     //   69: newarray int
/*     */     //   71: astore #4
/*     */     //   73: aload_0
/*     */     //   74: getfield e : I
/*     */     //   77: ifne -> 88
/*     */     //   80: iconst_2
/*     */     //   81: goto -> 94
/*     */     //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   87: athrow
/*     */     //   88: aload_0
/*     */     //   89: getfield e : I
/*     */     //   92: iconst_2
/*     */     //   93: imul
/*     */     //   94: anewarray java/lang/Object
/*     */     //   97: astore #5
/*     */     //   99: aload_0
/*     */     //   100: getfield e : I
/*     */     //   103: istore #6
/*     */     //   105: iload #6
/*     */     //   107: iinc #6, -1
/*     */     //   110: ifeq -> 144
/*     */     //   113: aload #4
/*     */     //   115: iload #6
/*     */     //   117: aload_0
/*     */     //   118: getfield f : [I
/*     */     //   121: iload #6
/*     */     //   123: iaload
/*     */     //   124: iastore
/*     */     //   125: aload #5
/*     */     //   127: iload #6
/*     */     //   129: aload_0
/*     */     //   130: getfield i : [Ljava/lang/Object;
/*     */     //   133: iload #6
/*     */     //   135: aaload
/*     */     //   136: aastore
/*     */     //   137: goto -> 105
/*     */     //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   143: athrow
/*     */     //   144: aload_0
/*     */     //   145: aload #4
/*     */     //   147: putfield f : [I
/*     */     //   150: aload_0
/*     */     //   151: aload #5
/*     */     //   153: putfield i : [Ljava/lang/Object;
/*     */     //   156: aload_0
/*     */     //   157: getfield f : [I
/*     */     //   160: aload_0
/*     */     //   161: getfield e : I
/*     */     //   164: iload_1
/*     */     //   165: iastore
/*     */     //   166: aload_0
/*     */     //   167: getfield i : [Ljava/lang/Object;
/*     */     //   170: aload_0
/*     */     //   171: getfield e : I
/*     */     //   174: aload_2
/*     */     //   175: aastore
/*     */     //   176: aload_0
/*     */     //   177: dup
/*     */     //   178: getfield e : I
/*     */     //   181: iconst_1
/*     */     //   182: iadd
/*     */     //   183: putfield e : I
/*     */     //   186: aload_0
/*     */     //   187: getfield a : Ljava/lang/Object;
/*     */     //   190: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 0
/*     */     //   #87	-> 6
/*     */     //   #110	-> 11
/*     */     //   #9	-> 19
/*     */     //   #114	-> 26
/*     */     //   #62	-> 29
/*     */     //   #20	-> 41
/*     */     //   #12	-> 73
/*     */     //   #30	-> 99
/*     */     //   #66	-> 113
/*     */     //   #25	-> 125
/*     */     //   #119	-> 144
/*     */     //   #63	-> 150
/*     */     //   #18	-> 156
/*     */     //   #1	-> 166
/*     */     //   #49	-> 176
/*     */     //   #50	-> 186
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   29	48	51	java/lang/IllegalArgumentException
/*     */     //   41	59	59	java/lang/IllegalArgumentException
/*     */     //   73	84	84	java/lang/IllegalArgumentException
/*     */     //   105	140	140	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public kQ a() {
/*     */     try {
/*     */       if (this.g == null)
/*     */         this.g = new a9(this, null); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return this.g;
/*     */   }
/*     */   
/*     */   public i7(Map paramMap) {
/*     */     this(paramMap.size());
/*     */     boolean bool = false;
/*     */     for (Map.Entry entry : paramMap.entrySet()) {
/*     */       this.f[bool] = ((Integer)entry.getKey()).intValue();
/*     */       this.i[bool] = entry.getValue();
/*     */     } 
/*     */     this.e = bool;
/*     */   }
/*     */   
/*     */   private static Exception a(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */