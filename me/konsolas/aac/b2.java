/*     */ package me.konsolas.aac;public class b2 extends bt implements RandomAccess, Cloneable, Serializable { public Object[] toArray() {
/*   2 */     return Arrays.copyOf(this.d, size(), Object[].class);
/*     */   }
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
/*     */   private static final long serialVersionUID = -7046029254386353131L;
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
/*     */   public static final int e = 10;
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
/*     */   protected final boolean g;
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
/*     */   protected transient Object[] d;
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
/*     */   protected int h;
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
/*     */   private static final Collector c;
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
/*     */   public b2(int paramInt) {
/* 272 */     h(paramInt); this.g = false;
/*     */   } public int lastIndexOf(Object paramObject) { for (int i = this.h; i-- != 0;) { if (Objects.equals(paramObject, this.d[i]))
/*     */         return i;  }
/*     */      return -1; } public b2 b() { b2 b21 = null; if (getClass() == b2.class) {
/*     */       b21 = new b2(a(this.d, this.h), false); b21.h = this.h;
/*     */     }  try {
/*     */       b21 = (b2)super.clone();
/* 279 */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/*     */       throw new InternalError(cloneNotSupportedException);
/*     */     } 
/*     */     b21.d = a(this.d, this.h);
/*     */     return b21; }
/*     */ 
/*     */   
/*     */   public boolean a(int paramInt, hT paramhT) {
/*     */     d(paramInt);
/*     */     int i = paramhT.size();
/*     */     try {
/*     */       if (i == 0)
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       f(this.h + i);
/*     */       System.arraycopy(this.d, paramInt, this.d, paramInt + i, this.h - paramInt);
/*     */       paramhT.c(0, this.d, paramInt, i);
/*     */       this.h += i;
/*     */       if (!f)
/*     */         try {
/*     */           if (this.h > this.d.length)
/*     */             throw new AssertionError(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public Object[] toArray(Object[] paramArrayOfObject) {
/*     */     if (paramArrayOfObject == null) {
/*     */       paramArrayOfObject = new Object[size()];
/*     */     } else if (paramArrayOfObject.length < size()) {
/*     */       paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), size());
/*     */     } 
/*     */     try {
/*     */       System.arraycopy(this.d, 0, paramArrayOfObject, 0, size());
/*     */       if (paramArrayOfObject.length > size())
/*     */         paramArrayOfObject[size()] = null; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return paramArrayOfObject;
/*     */   }
/*     */   
/*     */   public b2(Object[] paramArrayOfObject) {
/*     */     this(paramArrayOfObject, 0, paramArrayOfObject.length);
/*     */   }
/*     */   
/*     */   public static Collector a() {
/*     */     return c;
/*     */   }
/*     */   
/*     */   public void i(int paramInt) {
/*     */     try {
/*     */       if (paramInt < this.d.length)
/*     */         try {
/*     */           if (this.h != this.d.length) {
/*     */             Object[] arrayOfObject = new Object[Math.max(paramInt, this.h)];
/*     */             try {
/*     */               System.arraycopy(this.d, 0, arrayOfObject, 0, this.h);
/*     */               this.d = arrayOfObject;
/*     */               if (!f)
/*     */                 try {
/*     */                   if (this.h > this.d.length)
/*     */                     throw new AssertionError(); 
/*     */                 } catch (IllegalArgumentException illegalArgumentException) {
/*     */                   throw a(null);
/*     */                 }  
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             } 
/*     */             return;
/*     */           } 
/*     */           return;
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object get(int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b2.j : J
/*     */     //   3: ldc2_w 84181439569101
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: iload_1
/*     */     //   9: aload_0
/*     */     //   10: getfield h : I
/*     */     //   13: if_icmplt -> 140
/*     */     //   16: new java/lang/IndexOutOfBoundsException
/*     */     //   19: dup
/*     */     //   20: new java/lang/StringBuilder
/*     */     //   23: dup
/*     */     //   24: invokespecial <init> : ()V
/*     */     //   27: ldc_w '?偑↖ꦲ΅ਸអ䫫'
/*     */     //   30: invokevirtual toCharArray : ()[C
/*     */     //   33: dup
/*     */     //   34: dup
/*     */     //   35: iconst_1
/*     */     //   36: dup_x1
/*     */     //   37: caload
/*     */     //   38: sipush #9522
/*     */     //   41: ixor
/*     */     //   42: i2c
/*     */     //   43: castore
/*     */     //   44: sipush #21829
/*     */     //   47: iconst_0
/*     */     //   48: iconst_1
/*     */     //   49: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   55: iload_1
/*     */     //   56: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   59: ldc_w '昮⬖쉷틅ٿᱠ炍䉌ꖃ叏즮튄?ಏ櫙玔觰益䏤ᶙ䳲预䄻㹓乫殝⑰瑈仔ꡆ㳵鹞ⶶꩁ⚱譙筗댌ᰲ'
/*     */     //   62: invokevirtual toCharArray : ()[C
/*     */     //   65: dup
/*     */     //   66: dup
/*     */     //   67: bipush #29
/*     */     //   69: dup_x1
/*     */     //   70: caload
/*     */     //   71: sipush #5019
/*     */     //   74: ixor
/*     */     //   75: i2c
/*     */     //   76: castore
/*     */     //   77: sipush #25515
/*     */     //   80: iconst_0
/*     */     //   81: iconst_1
/*     */     //   82: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   88: aload_0
/*     */     //   89: getfield h : I
/*     */     //   92: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w 'Ἰ禡'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_0
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #14977
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #23027
/*     */     //   115: iconst_0
/*     */     //   116: iconst_5
/*     */     //   117: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   126: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   129: athrow
/*     */     //   130: ldc2_w 7303355799142673885
/*     */     //   133: lload_2
/*     */     //   134: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   139: athrow
/*     */     //   140: aload_0
/*     */     //   141: getfield d : [Ljava/lang/Object;
/*     */     //   144: iload_1
/*     */     //   145: aaload
/*     */     //   146: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 8
/*     */     //   #201	-> 140
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	130	130	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   private static final Object[] a(Object[] paramArrayOfObject, int paramInt) {
/*     */     try {
/*     */       if (paramInt == 0)
/*     */         return mK.d; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return Arrays.copyOf(paramArrayOfObject, paramInt, Object[].class);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) {
/*     */     d(paramInt1);
/*     */     mK.b(paramArrayOfObject, paramInt2, paramInt3);
/*     */     f(this.h + paramInt3);
/*     */     System.arraycopy(this.d, paramInt1, this.d, paramInt1 + paramInt3, this.h - paramInt1);
/*     */     System.arraycopy(paramArrayOfObject, paramInt2, this.d, paramInt1, paramInt3);
/*     */     this.h += paramInt3;
/*     */   }
/*     */   
/*     */   public b2(Iterator paramIterator) {
/*     */     this();
/*     */     try {
/*     */       for (; paramIterator.hasNext(); add(paramIterator.next()));
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int size() {
/*     */     return this.h;
/*     */   }
/*     */   
/*     */   private static final long j = nc.a(-5072178752438096509L, 7195395460601884480L, MethodHandles.lookup().lookupClass()).a(179357497916965L);
/*     */   
/*     */   static {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     f = !b2.class.desiredAssertionStatus();
/*     */     c = Collector.of(b2::new, b2::add, b2::a, new Collector.Characteristics[0]);
/*     */   }
/*     */   
/*     */   public Object[] a() {
/*     */     return this.d;
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/*     */     try {
/*     */       if (paramInt > this.d.length)
/*     */         this.d = mK.a(this.d, paramInt, this.h); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramInt > this.h) {
/*     */         Arrays.fill(this.d, this.h, paramInt, (Object)null);
/*     */       } else {
/*     */         Arrays.fill(this.d, paramInt, this.h, (Object)null);
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     this.h = paramInt;
/*     */   }
/*     */   
/*     */   public int indexOf(Object paramObject) {
/*     */     byte b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < this.h) {
/*     */           try {
/*     */             if (Objects.equals(paramObject, this.d[b]))
/*     */               return b; 
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */           b++;
/*     */           continue;
/*     */         } 
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */       return -1;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2) {
/*     */     aL.b(this.h, paramInt1, paramInt2);
/*     */     System.arraycopy(this.d, paramInt2, this.d, paramInt1, this.h - paramInt2);
/*     */     this.h -= paramInt2 - paramInt1;
/*     */     int i = paramInt2 - paramInt1;
/*     */     try {
/*     */       for (; i-- != 0; this.d[this.h + i] = null);
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(List paramList) {
/*     */     try {
/*     */       if (paramList instanceof b2)
/*     */         return a((b2)paramList); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramList instanceof bw)
/*     */         return -((bw)paramList).a(this); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return super.a(paramList);
/*     */   }
/*     */   
/*     */   public i0 a(int paramInt) {
/*     */     d(paramInt);
/*     */     return new eF(this, paramInt);
/*     */   }
/*     */   
/*     */   public b2(hT paramhT) {
/*     */     if (paramhT instanceof b2) {
/*     */       this.d = a((b2)paramhT);
/*     */       this.h = this.d.length;
/*     */     } else {
/*     */       h(paramhT.size());
/*     */       paramhT.c(0, this.d, 0, this.h = paramhT.size());
/*     */     } 
/*     */     this.g = false;
/*     */   }
/*     */   
/*     */   public static Collector a(int paramInt) {
/*     */     try {
/*     */       if (paramInt <= 10)
/*     */         return a(); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return Collector.of(new ga(paramInt, paramInt -> {
/*     */             try {
/*     */             
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             } 
/*     */             return (paramInt <= 10) ? new b2() : new b2(paramInt);
/*     */           }), b2::add, b2::a, new Collector.Characteristics[0]);
/*     */   }
/*     */   
/*     */   public void add(int paramInt, Object paramObject) {
/*     */     try {
/*     */       d(paramInt);
/*     */       f(this.h + 1);
/*     */       if (paramInt != this.h)
/*     */         System.arraycopy(this.d, paramInt, this.d, paramInt + 1, this.h - paramInt); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       this.d[paramInt] = paramObject;
/*     */       this.h++;
/*     */       if (!f)
/*     */         try {
/*     */           if (this.h > this.d.length)
/*     */             throw new AssertionError(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public hT a(int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b2.j : J
/*     */     //   3: ldc2_w 129188830897953
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: iload_1
/*     */     //   9: ifne -> 45
/*     */     //   12: iload_2
/*     */     //   13: aload_0
/*     */     //   14: invokevirtual size : ()I
/*     */     //   17: if_icmpne -> 45
/*     */     //   20: goto -> 33
/*     */     //   23: ldc2_w -2398586228373809615
/*     */     //   26: lload_3
/*     */     //   27: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   32: athrow
/*     */     //   33: aload_0
/*     */     //   34: areturn
/*     */     //   35: ldc2_w -2398586228373809615
/*     */     //   38: lload_3
/*     */     //   39: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   44: athrow
/*     */     //   45: aload_0
/*     */     //   46: iload_1
/*     */     //   47: invokevirtual d : (I)V
/*     */     //   50: aload_0
/*     */     //   51: iload_2
/*     */     //   52: invokevirtual d : (I)V
/*     */     //   55: iload_1
/*     */     //   56: iload_2
/*     */     //   57: if_icmple -> 181
/*     */     //   60: new java/lang/IndexOutOfBoundsException
/*     */     //   63: dup
/*     */     //   64: new java/lang/StringBuilder
/*     */     //   67: dup
/*     */     //   68: invokespecial <init> : ()V
/*     */     //   71: ldc_w '흖曈߳坰퐲喱眩⽾樑骃颕틹鵄冂'
/*     */     //   74: invokevirtual toCharArray : ()[C
/*     */     //   77: dup
/*     */     //   78: dup
/*     */     //   79: iconst_2
/*     */     //   80: dup_x1
/*     */     //   81: caload
/*     */     //   82: sipush #19204
/*     */     //   85: ixor
/*     */     //   86: i2c
/*     */     //   87: castore
/*     */     //   88: sipush #10085
/*     */     //   91: iconst_0
/*     */     //   92: iconst_1
/*     */     //   93: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   99: iload_1
/*     */     //   100: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   103: ldc_w '尘㥘⠰㼗⛨ᩥ첥檟鲓䥡ᝯᔙᖝ㤰櫌縲ퟴ贠祥罄⏢䁳⪗⎟렬㘿魰烫Ë'
/*     */     //   106: invokevirtual toCharArray : ()[C
/*     */     //   109: dup
/*     */     //   110: dup
/*     */     //   111: bipush #25
/*     */     //   113: dup_x1
/*     */     //   114: caload
/*     */     //   115: sipush #5563
/*     */     //   118: ixor
/*     */     //   119: i2c
/*     */     //   120: castore
/*     */     //   121: sipush #11154
/*     */     //   124: iconst_0
/*     */     //   125: iconst_0
/*     */     //   126: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   132: iload_2
/*     */     //   133: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   136: ldc_w '㼃'
/*     */     //   139: invokevirtual toCharArray : ()[C
/*     */     //   142: dup
/*     */     //   143: dup
/*     */     //   144: iconst_0
/*     */     //   145: dup_x1
/*     */     //   146: caload
/*     */     //   147: sipush #30108
/*     */     //   150: ixor
/*     */     //   151: i2c
/*     */     //   152: castore
/*     */     //   153: sipush #18185
/*     */     //   156: iconst_1
/*     */     //   157: iconst_0
/*     */     //   158: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   164: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   167: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   170: athrow
/*     */     //   171: ldc2_w -2398586228373809615
/*     */     //   174: lload_3
/*     */     //   175: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   180: athrow
/*     */     //   181: new me/konsolas/aac/bw
/*     */     //   184: dup
/*     */     //   185: aload_0
/*     */     //   186: iload_1
/*     */     //   187: iload_2
/*     */     //   188: invokespecial <init> : (Lme/konsolas/aac/b2;II)V
/*     */     //   191: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #99	-> 8
/*     */     //   #267	-> 45
/*     */     //   #227	-> 50
/*     */     //   #123	-> 55
/*     */     //   #187	-> 181
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	20	23	java/lang/IllegalArgumentException
/*     */     //   12	35	35	java/lang/IllegalArgumentException
/*     */     //   45	171	171	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b2.j : J
/*     */     //   3: ldc2_w 66938127388280
/*     */     //   6: lxor
/*     */     //   7: lstore #5
/*     */     //   9: aload_0
/*     */     //   10: iload_1
/*     */     //   11: invokevirtual d : (I)V
/*     */     //   14: aload_2
/*     */     //   15: iload_3
/*     */     //   16: iload #4
/*     */     //   18: invokestatic b : ([Ljava/lang/Object;II)V
/*     */     //   21: iload_1
/*     */     //   22: iload #4
/*     */     //   24: iadd
/*     */     //   25: aload_0
/*     */     //   26: getfield h : I
/*     */     //   29: if_icmple -> 161
/*     */     //   32: new java/lang/IndexOutOfBoundsException
/*     */     //   35: dup
/*     */     //   36: new java/lang/StringBuilder
/*     */     //   39: dup
/*     */     //   40: invokespecial <init> : ()V
/*     */     //   43: ldc_w '鿴颖輞鉃쭟┞⫏銧廙諺먣吀'
/*     */     //   46: invokevirtual toCharArray : ()[C
/*     */     //   49: dup
/*     */     //   50: dup
/*     */     //   51: bipush #7
/*     */     //   53: dup_x1
/*     */     //   54: caload
/*     */     //   55: sipush #8198
/*     */     //   58: ixor
/*     */     //   59: i2c
/*     */     //   60: castore
/*     */     //   61: sipush #23437
/*     */     //   64: iconst_1
/*     */     //   65: iconst_2
/*     */     //   66: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   72: iload_1
/*     */     //   73: iload #4
/*     */     //   75: iadd
/*     */     //   76: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   79: ldc_w '䚎涂匲躰퐺䉧餂贈儮㽍꾷話菀鵙쐎䏶﬒櫌꣙ꡅﬨ㜱ဟ﫚睥쯨ꇻ끗榑'
/*     */     //   82: invokevirtual toCharArray : ()[C
/*     */     //   85: dup
/*     */     //   86: dup
/*     */     //   87: bipush #6
/*     */     //   89: dup_x1
/*     */     //   90: caload
/*     */     //   91: sipush #8453
/*     */     //   94: ixor
/*     */     //   95: i2c
/*     */     //   96: castore
/*     */     //   97: sipush #3285
/*     */     //   100: iconst_0
/*     */     //   101: iconst_5
/*     */     //   102: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   108: aload_0
/*     */     //   109: getfield h : I
/*     */     //   112: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   115: ldc_w '닢徣'
/*     */     //   118: invokevirtual toCharArray : ()[C
/*     */     //   121: dup
/*     */     //   122: dup
/*     */     //   123: iconst_0
/*     */     //   124: dup_x1
/*     */     //   125: caload
/*     */     //   126: sipush #14226
/*     */     //   129: ixor
/*     */     //   130: i2c
/*     */     //   131: castore
/*     */     //   132: sipush #13812
/*     */     //   135: iconst_0
/*     */     //   136: iconst_3
/*     */     //   137: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   143: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   146: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   149: athrow
/*     */     //   150: ldc2_w 4030663489951596392
/*     */     //   153: lload #5
/*     */     //   155: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   160: athrow
/*     */     //   161: aload_2
/*     */     //   162: iload_3
/*     */     //   163: aload_0
/*     */     //   164: getfield d : [Ljava/lang/Object;
/*     */     //   167: iload_1
/*     */     //   168: iload #4
/*     */     //   170: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   173: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #100	-> 9
/*     */     //   #195	-> 14
/*     */     //   #48	-> 21
/*     */     //   #219	-> 161
/*     */     //   #165	-> 173
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	150	150	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public b2(ea paramea) {
/*     */     this();
/*     */     try {
/*     */       for (; paramea.hasNext(); add(paramea.next()));
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static b2 a(Object[] paramArrayOfObject) {
/*     */     return a(paramArrayOfObject, paramArrayOfObject.length);
/*     */   }
/*     */   
/*     */   public static b2 a(Object[] paramArrayOfObject, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b2.j : J
/*     */     //   3: ldc2_w 80160935462013
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: iload_1
/*     */     //   9: aload_0
/*     */     //   10: arraylength
/*     */     //   11: if_icmple -> 133
/*     */     //   14: new java/lang/IllegalArgumentException
/*     */     //   17: dup
/*     */     //   18: new java/lang/StringBuilder
/*     */     //   21: dup
/*     */     //   22: invokespecial <init> : ()V
/*     */     //   25: ldc '⠘䌃₃嶻??퇧艛﬌惈펎꓈쑴啔训砾嵦㎁쐩鱨ݙ'
/*     */     //   27: invokevirtual toCharArray : ()[C
/*     */     //   30: dup
/*     */     //   31: dup
/*     */     //   32: iconst_2
/*     */     //   33: dup_x1
/*     */     //   34: caload
/*     */     //   35: sipush #3946
/*     */     //   38: ixor
/*     */     //   39: i2c
/*     */     //   40: castore
/*     */     //   41: sipush #10892
/*     */     //   44: iconst_0
/*     */     //   45: iconst_0
/*     */     //   46: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   52: iload_1
/*     */     //   53: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   56: ldc 'ꡉ䛩睙ゟﳱ଎缕㖩띲路钶勚⊹揺꿸ᨾ㥎죺퇘ɬ혶Ｐ荗틎帎ꦃ衯딬Ԓ淆?竷鋆˚'
/*     */     //   58: invokevirtual toCharArray : ()[C
/*     */     //   61: dup
/*     */     //   62: dup
/*     */     //   63: bipush #19
/*     */     //   65: dup_x1
/*     */     //   66: caload
/*     */     //   67: sipush #26817
/*     */     //   70: ixor
/*     */     //   71: i2c
/*     */     //   72: castore
/*     */     //   73: sipush #20515
/*     */     //   76: iconst_1
/*     */     //   77: iconst_1
/*     */     //   78: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   84: aload_0
/*     */     //   85: arraylength
/*     */     //   86: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   89: ldc '㰉尪'
/*     */     //   91: invokevirtual toCharArray : ()[C
/*     */     //   94: dup
/*     */     //   95: dup
/*     */     //   96: iconst_0
/*     */     //   97: dup_x1
/*     */     //   98: caload
/*     */     //   99: sipush #4423
/*     */     //   102: ixor
/*     */     //   103: i2c
/*     */     //   104: castore
/*     */     //   105: sipush #18215
/*     */     //   108: iconst_1
/*     */     //   109: iconst_0
/*     */     //   110: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   116: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   119: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   122: athrow
/*     */     //   123: ldc2_w 9073274476424607085
/*     */     //   126: lload_2
/*     */     //   127: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   132: athrow
/*     */     //   133: new me/konsolas/aac/b2
/*     */     //   136: dup
/*     */     //   137: aload_0
/*     */     //   138: iconst_1
/*     */     //   139: invokespecial <init> : ([Ljava/lang/Object;Z)V
/*     */     //   142: astore #4
/*     */     //   144: aload #4
/*     */     //   146: iload_1
/*     */     //   147: putfield h : I
/*     */     //   150: aload #4
/*     */     //   152: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #113	-> 8
/*     */     //   #160	-> 133
/*     */     //   #176	-> 144
/*     */     //   #59	-> 150
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	123	123	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   private void h(int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b2.j : J
/*     */     //   3: ldc2_w 112867753904689
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: iload_1
/*     */     //   9: ifge -> 100
/*     */     //   12: new java/lang/IllegalArgumentException
/*     */     //   15: dup
/*     */     //   16: new java/lang/StringBuilder
/*     */     //   19: dup
/*     */     //   20: invokespecial <init> : ()V
/*     */     //   23: ldc 'ፓ駱犾Ӥṵ:厫픵❴巾뾴㕝㱮ﯛ풅澓㢤'
/*     */     //   25: invokevirtual toCharArray : ()[C
/*     */     //   28: dup
/*     */     //   29: dup
/*     */     //   30: bipush #13
/*     */     //   32: dup_x1
/*     */     //   33: caload
/*     */     //   34: sipush #20562
/*     */     //   37: ixor
/*     */     //   38: i2c
/*     */     //   39: castore
/*     */     //   40: sipush #12168
/*     */     //   43: iconst_1
/*     */     //   44: iconst_4
/*     */     //   45: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   51: iload_1
/*     */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   55: ldc '쐶魬ꠣテဠ駁駀䂎⠻ჰÅ揸?樉'
/*     */     //   57: invokevirtual toCharArray : ()[C
/*     */     //   60: dup
/*     */     //   61: dup
/*     */     //   62: bipush #6
/*     */     //   64: dup_x1
/*     */     //   65: caload
/*     */     //   66: sipush #28535
/*     */     //   69: ixor
/*     */     //   70: i2c
/*     */     //   71: castore
/*     */     //   72: sipush #23638
/*     */     //   75: iconst_0
/*     */     //   76: iconst_4
/*     */     //   77: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   83: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   86: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   89: athrow
/*     */     //   90: ldc2_w -889864100981654751
/*     */     //   93: lload_2
/*     */     //   94: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   99: athrow
/*     */     //   100: iload_1
/*     */     //   101: ifne -> 124
/*     */     //   104: aload_0
/*     */     //   105: getstatic me/konsolas/aac/mK.d : [Ljava/lang/Object;
/*     */     //   108: putfield d : [Ljava/lang/Object;
/*     */     //   111: goto -> 132
/*     */     //   114: ldc2_w -889864100981654751
/*     */     //   117: lload_2
/*     */     //   118: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   123: athrow
/*     */     //   124: aload_0
/*     */     //   125: iload_1
/*     */     //   126: anewarray java/lang/Object
/*     */     //   129: putfield d : [Ljava/lang/Object;
/*     */     //   132: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #117	-> 8
/*     */     //   #254	-> 100
/*     */     //   #44	-> 124
/*     */     //   #90	-> 132
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	90	90	java/lang/IllegalArgumentException
/*     */     //   100	114	114	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public void sort(Comparator paramComparator) {
/*     */     try {
/*     */       if (paramComparator == null) {
/*     */         mK.e(this.d, 0, this.h);
/*     */       } else {
/*     */         mK.d(this.d, 0, this.h, paramComparator);
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object remove(int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b2.j : J
/*     */     //   3: ldc2_w 4693499523769
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: iload_1
/*     */     //   9: aload_0
/*     */     //   10: getfield h : I
/*     */     //   13: if_icmplt -> 140
/*     */     //   16: new java/lang/IndexOutOfBoundsException
/*     */     //   19: dup
/*     */     //   20: new java/lang/StringBuilder
/*     */     //   23: dup
/*     */     //   24: invokespecial <init> : ()V
/*     */     //   27: ldc_w 'ꌾ賈瑆꿴譅ﾪȧ'
/*     */     //   30: invokevirtual toCharArray : ()[C
/*     */     //   33: dup
/*     */     //   34: dup
/*     */     //   35: iconst_3
/*     */     //   36: dup_x1
/*     */     //   37: caload
/*     */     //   38: sipush #15392
/*     */     //   41: ixor
/*     */     //   42: i2c
/*     */     //   43: castore
/*     */     //   44: sipush #19598
/*     */     //   47: iconst_1
/*     */     //   48: iconst_0
/*     */     //   49: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   55: iload_1
/*     */     //   56: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   59: ldc_w '㷿椹淝䧅ষๆ⮞䙅l䍼䢩偖鴘⛡뚑岢ஷⴙ岈㜢㩇鹾ᔻ鈸礋棆礲ㅆ뙫씅馏췔싵譫£䍶橪洕ৄ'
/*     */     //   62: invokevirtual toCharArray : ()[C
/*     */     //   65: dup
/*     */     //   66: dup
/*     */     //   67: bipush #27
/*     */     //   69: dup_x1
/*     */     //   70: caload
/*     */     //   71: sipush #24091
/*     */     //   74: ixor
/*     */     //   75: i2c
/*     */     //   76: castore
/*     */     //   77: sipush #1667
/*     */     //   80: iconst_1
/*     */     //   81: iconst_0
/*     */     //   82: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   88: aload_0
/*     */     //   89: getfield h : I
/*     */     //   92: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w '?㲘'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_0
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #22149
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #26025
/*     */     //   115: iconst_0
/*     */     //   116: iconst_1
/*     */     //   117: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   126: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   129: athrow
/*     */     //   130: ldc2_w 805849334588523433
/*     */     //   133: lload_2
/*     */     //   134: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   139: athrow
/*     */     //   140: aload_0
/*     */     //   141: getfield d : [Ljava/lang/Object;
/*     */     //   144: iload_1
/*     */     //   145: aaload
/*     */     //   146: astore #4
/*     */     //   148: aload_0
/*     */     //   149: dup
/*     */     //   150: getfield h : I
/*     */     //   153: iconst_1
/*     */     //   154: isub
/*     */     //   155: putfield h : I
/*     */     //   158: iload_1
/*     */     //   159: aload_0
/*     */     //   160: getfield h : I
/*     */     //   163: if_icmpeq -> 200
/*     */     //   166: aload_0
/*     */     //   167: getfield d : [Ljava/lang/Object;
/*     */     //   170: iload_1
/*     */     //   171: iconst_1
/*     */     //   172: iadd
/*     */     //   173: aload_0
/*     */     //   174: getfield d : [Ljava/lang/Object;
/*     */     //   177: iload_1
/*     */     //   178: aload_0
/*     */     //   179: getfield h : I
/*     */     //   182: iload_1
/*     */     //   183: isub
/*     */     //   184: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   187: goto -> 200
/*     */     //   190: ldc2_w 805849334588523433
/*     */     //   193: lload_2
/*     */     //   194: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   199: athrow
/*     */     //   200: aload_0
/*     */     //   201: getfield d : [Ljava/lang/Object;
/*     */     //   204: aload_0
/*     */     //   205: getfield h : I
/*     */     //   208: aconst_null
/*     */     //   209: aastore
/*     */     //   210: getstatic me/konsolas/aac/b2.f : Z
/*     */     //   213: ifne -> 259
/*     */     //   216: aload_0
/*     */     //   217: getfield h : I
/*     */     //   220: aload_0
/*     */     //   221: getfield d : [Ljava/lang/Object;
/*     */     //   224: arraylength
/*     */     //   225: if_icmple -> 259
/*     */     //   228: goto -> 241
/*     */     //   231: ldc2_w 805849334588523433
/*     */     //   234: lload_2
/*     */     //   235: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   240: athrow
/*     */     //   241: new java/lang/AssertionError
/*     */     //   244: dup
/*     */     //   245: invokespecial <init> : ()V
/*     */     //   248: athrow
/*     */     //   249: ldc2_w 805849334588523433
/*     */     //   252: lload_2
/*     */     //   253: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   258: athrow
/*     */     //   259: aload #4
/*     */     //   261: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #122	-> 8
/*     */     //   #186	-> 140
/*     */     //   #6	-> 148
/*     */     //   #130	-> 158
/*     */     //   #37	-> 200
/*     */     //   #140	-> 210
/*     */     //   #84	-> 259
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	130	130	java/lang/IllegalArgumentException
/*     */     //   148	187	190	java/lang/IllegalArgumentException
/*     */     //   200	228	231	java/lang/IllegalArgumentException
/*     */     //   216	249	249	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public Object clone() {
/*     */     return b();
/*     */   }
/*     */   
/*     */   public Spliterator spliterator() {
/*     */     return a();
/*     */   }
/*     */   
/*     */   public void forEach(Consumer<Object> paramConsumer) {
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < this.h) {
/*     */         paramConsumer.accept(this.d[b]);
/*     */         b++;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a(b2 paramb2) {
/*     */     int i = size(), j = paramb2.size();
/*     */     Object[] arrayOfObject1 = this.d, arrayOfObject2 = paramb2.d;
/*     */     byte b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < i && b < j) {
/*     */           int k;
/*     */           Object object1 = arrayOfObject1[b];
/*     */           Object object2 = arrayOfObject2[b];
/*     */         } 
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     try {
/*     */       try {
/*     */       
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (b < j) ? -1 : ((b < i) ? 1 : 0);
/*     */   }
/*     */   
/*     */   public boolean add(Object paramObject) {
/*     */     try {
/*     */       f(this.h + 1);
/*     */       this.d[this.h++] = paramObject;
/*     */       if (!f)
/*     */         try {
/*     */           if (this.h > this.d.length)
/*     */             throw new AssertionError(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public b2(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
/*     */     this(paramInt2);
/*     */     System.arraycopy(paramArrayOfObject, paramInt1, this.d, 0, paramInt2);
/*     */     this.h = paramInt2;
/*     */   }
/*     */   
/*     */   public boolean removeAll(Collection paramCollection) {
/*     */     Object[] arrayOfObject = this.d;
/*     */     byte b1 = 0;
/*     */     byte b3 = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b3 < this.h) {
/*     */           try {
/*     */             if (!paramCollection.contains(arrayOfObject[b3]))
/*     */               arrayOfObject[b1++] = arrayOfObject[b3]; 
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */           b3++;
/*     */         } 
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     try {
/*     */       Arrays.fill(arrayOfObject, b1, this.h, (Object)null);
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     b3 = (this.h != b1) ? 1 : 0;
/*     */     this.h = b1;
/*     */     return b3;
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     try {
/*     */       Arrays.fill(this.d, 0, this.h, (Object)null);
/*     */       this.h = 0;
/*     */       if (!f)
/*     */         try {
/*     */           if (this.h > this.d.length)
/*     */             throw new AssertionError(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void f(int paramInt) {
/*     */     try {
/*     */       if (paramInt <= this.d.length)
/*     */         return; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     if (this.d != mK.f) {
/*     */       paramInt = (int)Math.max(Math.min(this.d.length + (this.d.length >> 1), 2147483639L), paramInt);
/*     */     } else if (paramInt < 10) {
/*     */       paramInt = 10;
/*     */     } 
/*     */     try {
/*     */       if (this.g) {
/*     */         this.d = mK.a(this.d, paramInt, this.h);
/*     */       } else {
/*     */         Object[] arrayOfObject = new Object[paramInt];
/*     */         System.arraycopy(this.d, 0, arrayOfObject, 0, this.h);
/*     */         this.d = arrayOfObject;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (!f)
/*     */         try {
/*     */           if (this.h > this.d.length)
/*     */             throw new AssertionError(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void g(int paramInt) {
/*     */     try {
/*     */       if (paramInt > this.d.length) {
/*     */         try {
/*     */           if (this.d == mK.f)
/*     */             try {
/*     */               if (paramInt <= 10)
/*     */                 return; 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             }  
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */       } else {
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (this.g) {
/*     */         this.d = mK.c(this.d, paramInt, this.h);
/*     */       } else if (paramInt > this.d.length) {
/*     */         Object[] arrayOfObject = new Object[paramInt];
/*     */         System.arraycopy(this.d, 0, arrayOfObject, 0, this.h);
/*     */         this.d = arrayOfObject;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (!f)
/*     */         try {
/*     */           if (this.h > this.d.length)
/*     */             throw new AssertionError(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public b2(Collection paramCollection) {
/*     */     if (paramCollection instanceof b2) {
/*     */       this.d = a((b2)paramCollection);
/*     */       this.h = this.d.length;
/*     */     } 
/*     */     try {
/*     */       h(paramCollection.size());
/*     */       if (paramCollection instanceof hT) {
/*     */         ((hT)paramCollection).c(0, this.d, 0, this.h = paramCollection.size());
/*     */       } else {
/*     */         this.h = fq.a(paramCollection.iterator(), this.d);
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     this.g = false;
/*     */   }
/*     */   
/*     */   public boolean remove(Object paramObject) {
/*     */     int i = indexOf(paramObject);
/*     */     try {
/*     */       if (i == -1)
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       remove(i);
/*     */       if (!f)
/*     */         try {
/*     */           if (this.h > this.d.length)
/*     */             throw new AssertionError(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   private void readObject(ObjectInputStream paramObjectInputStream) {
/*     */     paramObjectInputStream.defaultReadObject();
/*     */     this.d = new Object[this.h];
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < this.h) {
/*     */         this.d[b] = paramObjectInputStream.readObject();
/*     */         b++;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     i(0);
/*     */   }
/*     */   
/*     */   public void b(Comparator paramComparator) {
/*     */     try {
/*     */       if (paramComparator == null) {
/*     */         mK.g(this.d, 0, this.h);
/*     */       } else {
/*     */         mK.e(this.d, 0, this.h, paramComparator);
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (this.h == 0);
/*     */   }
/*     */   
/*     */   b2 a(b2 paramb2) {
/*     */     a(paramb2);
/*     */     return this;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*     */     try {
/*     */       if (paramObject == this)
/*     */         return true; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramObject == null)
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (!(paramObject instanceof List))
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramObject instanceof b2)
/*     */         return a((b2)paramObject); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramObject instanceof bw)
/*     */         return ((bw)paramObject).equals(this); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return super.equals(paramObject);
/*     */   }
/*     */   
/*     */   private void writeObject(ObjectOutputStream paramObjectOutputStream) {
/*     */     paramObjectOutputStream.defaultWriteObject();
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < this.h) {
/*     */         paramObjectOutputStream.writeObject(this.d[b]);
/*     */         b++;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected b2(Object[] paramArrayOfObject, boolean paramBoolean) {
/*     */     this.d = paramArrayOfObject;
/*     */     this.g = paramBoolean;
/*     */   }
/*     */   
/*     */   @SafeVarargs
/*     */   public static b2 b(Object[] paramArrayOfObject) {
/*     */     return a(paramArrayOfObject);
/*     */   }
/*     */   
/*     */   public static b2 a() {
/*     */     return new b2();
/*     */   }
/*     */   
/*     */   public b2() {
/*     */     this.d = mK.f;
/*     */     this.g = false;
/*     */   }
/*     */   
/*     */   private static final Object[] a(b2 paramb2) {
/*     */     return a(paramb2.d, paramb2.h);
/*     */   }
/*     */   
/*     */   public ListIterator listIterator(int paramInt) {
/*     */     return a(paramInt);
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) {
/*     */     mK.b(paramArrayOfObject, paramInt2, paramInt3);
/*     */     System.arraycopy(this.d, paramInt1, paramArrayOfObject, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean a(b2 paramb2) {
/*     */     try {
/*     */       if (paramb2 == this)
/*     */         return true; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int i = size();
/*     */     try {
/*     */       if (i != paramb2.size())
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     Object[] arrayOfObject1 = this.d;
/*     */     Object[] arrayOfObject2 = paramb2.d;
/*     */     try {
/*     */       if (arrayOfObject1 == arrayOfObject2)
/*     */         try {
/*     */           if (i == paramb2.size())
/*     */             return true; 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     while (i-- != 0) {
/*     */       if (!Objects.equals(arrayOfObject1[i], arrayOfObject2[i]))
/*     */         return false; 
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public Object set(int paramInt, Object paramObject) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/b2.j : J
/*     */     //   3: ldc2_w 133912869704748
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: iload_1
/*     */     //   9: aload_0
/*     */     //   10: getfield h : I
/*     */     //   13: if_icmplt -> 140
/*     */     //   16: new java/lang/IndexOutOfBoundsException
/*     */     //   19: dup
/*     */     //   20: new java/lang/StringBuilder
/*     */     //   23: dup
/*     */     //   24: invokespecial <init> : ()V
/*     */     //   27: ldc_w '훟魣ꌾ欉護울㌹磌'
/*     */     //   30: invokevirtual toCharArray : ()[C
/*     */     //   33: dup
/*     */     //   34: dup
/*     */     //   35: iconst_2
/*     */     //   36: dup_x1
/*     */     //   37: caload
/*     */     //   38: sipush #4013
/*     */     //   41: ixor
/*     */     //   42: i2c
/*     */     //   43: castore
/*     */     //   44: sipush #23250
/*     */     //   47: iconst_1
/*     */     //   48: iconst_2
/*     */     //   49: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   55: iload_1
/*     */     //   56: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   59: ldc_w '㸆褉趠㯺௫ଋ惡ꨫ෉?츞钎懇য㲛쭝严퓪酿疰纩ﻼϤๆ贆眖줪꼿㶕젛庺녶う䖦쒊껡⊒㜪'
/*     */     //   62: invokevirtual toCharArray : ()[C
/*     */     //   65: dup
/*     */     //   66: dup
/*     */     //   67: bipush #32
/*     */     //   69: dup_x1
/*     */     //   70: caload
/*     */     //   71: sipush #29566
/*     */     //   74: ixor
/*     */     //   75: i2c
/*     */     //   76: castore
/*     */     //   77: sipush #9028
/*     */     //   80: iconst_0
/*     */     //   81: iconst_2
/*     */     //   82: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   88: aload_0
/*     */     //   89: getfield h : I
/*     */     //   92: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w '낈㱬'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_0
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #20258
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #31845
/*     */     //   115: iconst_1
/*     */     //   116: iconst_2
/*     */     //   117: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   126: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   129: athrow
/*     */     //   130: ldc2_w -5927988093771913924
/*     */     //   133: lload_3
/*     */     //   134: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   139: athrow
/*     */     //   140: aload_0
/*     */     //   141: getfield d : [Ljava/lang/Object;
/*     */     //   144: iload_1
/*     */     //   145: aaload
/*     */     //   146: astore #5
/*     */     //   148: aload_0
/*     */     //   149: getfield d : [Ljava/lang/Object;
/*     */     //   152: iload_1
/*     */     //   153: aload_2
/*     */     //   154: aastore
/*     */     //   155: aload #5
/*     */     //   157: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #249	-> 8
/*     */     //   #243	-> 140
/*     */     //   #220	-> 148
/*     */     //   #57	-> 155
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	130	130	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public ae a() {
/*     */     return new fP(this);
/*     */   }
/*     */   
/*     */   public int compareTo(Object paramObject) {
/*     */     return a((List)paramObject);
/*     */   }
/*     */   
/*     */   public b2(jM paramjM) {
/*     */     if (paramjM instanceof b2) {
/*     */       this.d = a((b2)paramjM);
/*     */       this.h = this.d.length;
/*     */     } 
/*     */     try {
/*     */       h(paramjM.size());
/*     */       if (paramjM instanceof hT) {
/*     */         ((hT)paramjM).c(0, this.d, 0, this.h = paramjM.size());
/*     */       } else {
/*     */         this.h = fq.a(paramjM.b(), this.d);
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     this.g = false;
/*     */   }
/*     */   
/*     */   public boolean addAll(int paramInt, Collection paramCollection) {
/*     */     try {
/*     */       if (paramCollection instanceof hT)
/*     */         return a(paramInt, (hT)paramCollection); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     d(paramInt);
/*     */     int i = paramCollection.size();
/*     */     try {
/*     */       if (i == 0)
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     f(this.h + i);
/*     */     System.arraycopy(this.d, paramInt, this.d, paramInt + i, this.h - paramInt);
/*     */     Iterator iterator = paramCollection.iterator();
/*     */     this.h += i;
/*     */     try {
/*     */       for (; i-- != 0; this.d[paramInt++] = iterator.next());
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (!f)
/*     */         try {
/*     */           if (this.h > this.d.length)
/*     */             throw new AssertionError(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public List subList(int paramInt1, int paramInt2) {
/*     */     return a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   private static Exception a(Exception paramException) {
/*     */     return paramException;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\b2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */