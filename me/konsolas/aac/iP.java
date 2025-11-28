/*     */ package me.konsolas.aac;public class ip extends iC implements Serializable, Cloneable, kZ { private static final long serialVersionUID = 0L; private static final boolean l = false; protected transient int[] t; protected transient Object[] q; protected transient int v; protected transient boolean k; protected transient int o; protected transient int u; protected final transient int w; protected int r; protected final float x; protected transient kl p; protected transient kQ s; protected transient jM m; private static final long y = nc.a(5404254975666880342L, 3186584994998879546L, MethodHandles.lookup().lookupClass()).a(89649820756105L); private int b() { try {  }
/*   2 */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.k ? (this.r - 1) : this.r; }
/*   3 */   public Object b(int paramInt, Object paramObject) { int i = a(paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     try { if (i < 0)
/*     */       
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 261 */         a(-i - 1, paramInt, paramObject); return this.a; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  Object object = this.q[i]; this.q[i] = paramObject; return object; }
/*     */   public ip(c5 paramc5) { this(paramc5, 0.75F); }
/*     */   public Object d(int paramInt, Object paramObject) { int i = a(paramInt); try { if (i >= 0) return this.q[i];  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  a(-i - 1, paramInt, paramObject); return this.a; }
/*     */   public kQ a() { try { if (this.s == null) this.s = new a5(this, null);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.s; } public boolean containsValue(Object paramObject) { Object[] arrayOfObject = this.q; int[] arrayOfInt = this.t; try { if (this.k) try { if (Objects.equals(arrayOfObject[this.o], paramObject)) return true;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  for (int i = this.o; i-- != 0;) { if (arrayOfInt[i] != 0 && Objects.equals(arrayOfObject[i], paramObject)) return true;  }  return false; } public Object c(int paramInt, Object paramObject) { int i = a(paramInt); try { if (i < 0) return this.a;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  Object object = this.q[i]; this.q[i] = paramObject; return object; } public ip(int[] paramArrayOfint, Object[] paramArrayOfObject, float paramFloat) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/ip.y : J
/*     */     //   3: ldc2_w 27854488133370
/*     */     //   6: lxor
/*     */     //   7: lstore #4
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: arraylength
/*     */     //   12: fload_3
/*     */     //   13: invokespecial <init> : (IF)V
/*     */     //   16: aload_1
/*     */     //   17: arraylength
/*     */     //   18: aload_2
/*     */     //   19: arraylength
/*     */     //   20: if_icmpeq -> 133
/*     */     //   23: new java/lang/IllegalArgumentException
/*     */     //   26: dup
/*     */     //   27: new java/lang/StringBuilder
/*     */     //   30: dup
/*     */     //   31: invokespecial <init> : ()V
/*     */     //   34: ldc '䞰놩?㮱㵈ᛸ滻퇦䣉캁蒂暢醢썸ᢗǡ獼Î轘?Ꮀ縢鄍柢応릨朱봫䀹삿㐅Љ챔젗᪥ޕ軃ಮ뛝笫蘽᮸㸳㕭?䨔뱯渙쬋妅뿁慩쫲ꑽ킫⨝稉'
/*     */     //   36: invokevirtual toCharArray : ()[C
/*     */     //   39: dup
/*     */     //   40: dup
/*     */     //   41: bipush #37
/*     */     //   43: dup_x1
/*     */     //   44: caload
/*     */     //   45: sipush #7383
/*     */     //   48: ixor
/*     */     //   49: i2c
/*     */     //   50: castore
/*     */     //   51: sipush #9989
/*     */     //   54: iconst_1
/*     */     //   55: iconst_4
/*     */     //   56: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   62: aload_1
/*     */     //   63: arraylength
/*     */     //   64: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   67: ldc '賔잻?㝯㡚箐'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: iconst_0
/*     */     //   75: dup_x1
/*     */     //   76: caload
/*     */     //   77: sipush #29402
/*     */     //   80: ixor
/*     */     //   81: i2c
/*     */     //   82: castore
/*     */     //   83: sipush #7724
/*     */     //   86: iconst_0
/*     */     //   87: iconst_3
/*     */     //   88: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   94: aload_2
/*     */     //   95: arraylength
/*     */     //   96: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   99: ldc '投紖'
/*     */     //   101: invokevirtual toCharArray : ()[C
/*     */     //   104: dup
/*     */     //   105: dup
/*     */     //   106: iconst_0
/*     */     //   107: dup_x1
/*     */     //   108: caload
/*     */     //   109: sipush #18499
/*     */     //   112: ixor
/*     */     //   113: i2c
/*     */     //   114: castore
/*     */     //   115: sipush #9875
/*     */     //   118: iconst_1
/*     */     //   119: iconst_3
/*     */     //   120: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   126: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   132: athrow
/*     */     //   133: iconst_0
/*     */     //   134: istore #6
/*     */     //   136: iload #6
/*     */     //   138: aload_1
/*     */     //   139: arraylength
/*     */     //   140: if_icmpge -> 173
/*     */     //   143: aload_0
/*     */     //   144: aload_1
/*     */     //   145: iload #6
/*     */     //   147: iaload
/*     */     //   148: aload_2
/*     */     //   149: iload #6
/*     */     //   151: aaload
/*     */     //   152: invokevirtual b : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   155: pop
/*     */     //   156: iinc #6, 1
/*     */     //   159: goto -> 136
/*     */     //   162: ldc2_w -2036249340047993982
/*     */     //   165: lload #4
/*     */     //   167: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   172: athrow
/*     */     //   173: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 9
/*     */     //   #84	-> 16
/*     */     //   #150	-> 133
/*     */     //   #237	-> 173
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   136	162	162	java/lang/IllegalArgumentException } public kl a() { try { if (this.p == null) this.p = new b8(this, null);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.p; } private void writeObject(ObjectOutputStream paramObjectOutputStream) { int[] arrayOfInt = this.t; Object[] arrayOfObject = this.q; dL dL = new dL(this, null); paramObjectOutputStream.defaultWriteObject(); for (int i = this.r; i-- != 0; ) { int j = dL.a(); paramObjectOutputStream.writeInt(arrayOfInt[j]); paramObjectOutputStream.writeObject(arrayOfObject[j]); }  } public hy a() { return a(); } public int hashCode() { // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_1
/*     */     //   2: aload_0
/*     */     //   3: invokespecial b : ()I
/*     */     //   6: istore_2
/*     */     //   7: iconst_0
/*     */     //   8: istore_3
/*     */     //   9: iconst_0
/*     */     //   10: istore #4
/*     */     //   12: iload_2
/*     */     //   13: iinc #2, -1
/*     */     //   16: ifeq -> 112
/*     */     //   19: aload_0
/*     */     //   20: getfield t : [I
/*     */     //   23: iload_3
/*     */     //   24: iaload
/*     */     //   25: ifne -> 45
/*     */     //   28: goto -> 35
/*     */     //   31: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   34: athrow
/*     */     //   35: iinc #3, 1
/*     */     //   38: goto -> 19
/*     */     //   41: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   44: athrow
/*     */     //   45: aload_0
/*     */     //   46: getfield t : [I
/*     */     //   49: iload_3
/*     */     //   50: iaload
/*     */     //   51: istore #4
/*     */     //   53: aload_0
/*     */     //   54: aload_0
/*     */     //   55: getfield q : [Ljava/lang/Object;
/*     */     //   58: iload_3
/*     */     //   59: aaload
/*     */     //   60: if_acmpeq -> 101
/*     */     //   63: iload #4
/*     */     //   65: aload_0
/*     */     //   66: getfield q : [Ljava/lang/Object;
/*     */     //   69: iload_3
/*     */     //   70: aaload
/*     */     //   71: ifnonnull -> 89
/*     */     //   74: goto -> 81
/*     */     //   77: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   80: athrow
/*     */     //   81: iconst_0
/*     */     //   82: goto -> 98
/*     */     //   85: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   88: athrow
/*     */     //   89: aload_0
/*     */     //   90: getfield q : [Ljava/lang/Object;
/*     */     //   93: iload_3
/*     */     //   94: aaload
/*     */     //   95: invokevirtual hashCode : ()I
/*     */     //   98: ixor
/*     */     //   99: istore #4
/*     */     //   101: iload_1
/*     */     //   102: iload #4
/*     */     //   104: iadd
/*     */     //   105: istore_1
/*     */     //   106: iinc #3, 1
/*     */     //   109: goto -> 12
/*     */     //   112: aload_0
/*     */     //   113: getfield k : Z
/*     */     //   116: ifeq -> 161
/*     */     //   119: iload_1
/*     */     //   120: aload_0
/*     */     //   121: getfield q : [Ljava/lang/Object;
/*     */     //   124: aload_0
/*     */     //   125: getfield o : I
/*     */     //   128: aaload
/*     */     //   129: ifnonnull -> 147
/*     */     //   132: goto -> 139
/*     */     //   135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   138: athrow
/*     */     //   139: iconst_0
/*     */     //   140: goto -> 159
/*     */     //   143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   146: athrow
/*     */     //   147: aload_0
/*     */     //   148: getfield q : [Ljava/lang/Object;
/*     */     //   151: aload_0
/*     */     //   152: getfield o : I
/*     */     //   155: aaload
/*     */     //   156: invokevirtual hashCode : ()I
/*     */     //   159: iadd
/*     */     //   160: istore_1
/*     */     //   161: iload_1
/*     */     //   162: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 0
/*     */     //   #155	-> 2
/*     */     //   #273	-> 19
/*     */     //   #205	-> 45
/*     */     //   #192	-> 53
/*     */     //   #208	-> 63
/*     */     //   #176	-> 101
/*     */     //   #7	-> 106
/*     */     //   #47	-> 112
/*     */     //   #22	-> 161
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	28	31	java/lang/IllegalArgumentException
/*     */     //   19	41	41	java/lang/IllegalArgumentException
/*     */     //   53	74	77	java/lang/IllegalArgumentException
/*     */     //   63	85	85	java/lang/IllegalArgumentException
/*     */     //   112	132	135	java/lang/IllegalArgumentException
/* 264 */     //   119	143	143	java/lang/IllegalArgumentException } public Object a(int paramInt, BiFunction<Integer, Object, Object> paramBiFunction) { Objects.requireNonNull(paramBiFunction); int i = a(paramInt); try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  Object object1 = paramBiFunction.apply(Integer.valueOf(paramInt), (i >= 0) ? this.q[i] : null); try { if (object1 == null) { try { if (i >= 0) try { if (paramInt == 0) { j(); } else { c(i); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.a; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  Object object2 = object1; try { if (i < 0) { a(-i - 1, paramInt, object2); return object2; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  this.q[i] = object2; return object2; } public Object a(int paramInt) { int i, j; try { if (paramInt == 0) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.k ? this.q[this.o] : this.a; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int[] arrayOfInt = this.t; try { if ((i = arrayOfInt[j = i3.c(paramInt) & this.v]) == 0) return this.a;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (paramInt == i) return this.q[j];  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  while (true) { if ((i = arrayOfInt[j = j + 1 & this.v]) == 0) return this.a;  if (paramInt == i) return this.q[j];  }  } public Object a(int paramInt, IntFunction<Object> paramIntFunction) { Objects.requireNonNull(paramIntFunction); int i = a(paramInt); try { if (i >= 0) return this.q[i];  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  Object object = paramIntFunction.apply(paramInt); a(-i - 1, paramInt, object); return object; } public Set keySet() { return a(); } public ip(Map paramMap, float paramFloat) { this(paramMap.size(), paramFloat); putAll(paramMap); } public Object a(int paramInt, Object paramObject) { int i, j; try { if (paramInt == 0) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.k ? this.q[this.o] : paramObject; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int[] arrayOfInt = this.t; try { if ((i = arrayOfInt[j = i3.c(paramInt) & this.v]) == 0)
/*     */         return paramObject;  }
/*     */     catch (IllegalArgumentException illegalArgumentException)
/*     */     { throw a(null); }
/*     */      try {
/*     */       if (paramInt == i)
/*     */         return this.q[j]; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     }  while (true)
/*     */     { if ((i = arrayOfInt[j = j + 1 & this.v]) == 0)
/* 275 */         return paramObject;  if (paramInt == i) return this.q[j];  }  }
/*     */   public ip(int paramInt, float paramFloat) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/ip.y : J
/*     */     //   3: ldc2_w 110027461815001
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: aload_0
/*     */     //   9: invokespecial <init> : ()V
/*     */     //   12: fload_2
/*     */     //   13: fconst_0
/*     */     //   14: fcmpg
/*     */     //   15: ifle -> 24
/*     */     //   18: fload_2
/*     */     //   19: fconst_1
/*     */     //   20: fcmpl
/*     */     //   21: iflt -> 66
/*     */     //   24: new java/lang/IllegalArgumentException
/*     */     //   27: dup
/*     */     //   28: ldc '昶쥵퇔읽齝Ꙡ샦綽?묖쒵魯ꅎ?䠢េ酖㨷₴ꂄ镃׼됑㐒탧࠺ꝁ岲퍦䢨?헟䥘⊘沒ᗗ蝍ῠ橚ᐆ뾃䣶䕰੭卩哲'
/*     */     //   30: invokevirtual toCharArray : ()[C
/*     */     //   33: dup
/*     */     //   34: dup
/*     */     //   35: iconst_5
/*     */     //   36: dup_x1
/*     */     //   37: caload
/*     */     //   38: sipush #11011
/*     */     //   41: ixor
/*     */     //   42: i2c
/*     */     //   43: castore
/*     */     //   44: sipush #28554
/*     */     //   47: iconst_1
/*     */     //   48: iconst_5
/*     */     //   49: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   52: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   55: athrow
/*     */     //   56: ldc2_w -2909686793005111391
/*     */     //   59: lload_3
/*     */     //   60: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   65: athrow
/*     */     //   66: iload_1
/*     */     //   67: ifge -> 113
/*     */     //   70: new java/lang/IllegalArgumentException
/*     */     //   73: dup
/*     */     //   74: ldc '녶᣸ꈡ✣㡠䢭纍죇䕤莼?꛻?๔Ầ晢쵁탒焆Ї隅ㄠ듟⮖˂땕ን䋦ᐮᙵ䢉瞢ꨆ勥娺Ⓐ⒰骭训㤒៌饫嚧呫䳒埔?䌚'
/*     */     //   76: invokevirtual toCharArray : ()[C
/*     */     //   79: dup
/*     */     //   80: dup
/*     */     //   81: bipush #31
/*     */     //   83: dup_x1
/*     */     //   84: caload
/*     */     //   85: sipush #4161
/*     */     //   88: ixor
/*     */     //   89: i2c
/*     */     //   90: castore
/*     */     //   91: sipush #10840
/*     */     //   94: iconst_0
/*     */     //   95: iconst_1
/*     */     //   96: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   99: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   102: athrow
/*     */     //   103: ldc2_w -2909686793005111391
/*     */     //   106: lload_3
/*     */     //   107: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   112: athrow
/*     */     //   113: aload_0
/*     */     //   114: fload_2
/*     */     //   115: putfield x : F
/*     */     //   118: aload_0
/*     */     //   119: aload_0
/*     */     //   120: iload_1
/*     */     //   121: fload_2
/*     */     //   122: invokestatic a : (IF)I
/*     */     //   125: dup_x1
/*     */     //   126: putfield o : I
/*     */     //   129: putfield w : I
/*     */     //   132: aload_0
/*     */     //   133: aload_0
/*     */     //   134: getfield o : I
/*     */     //   137: iconst_1
/*     */     //   138: isub
/*     */     //   139: putfield v : I
/*     */     //   142: aload_0
/*     */     //   143: aload_0
/*     */     //   144: getfield o : I
/*     */     //   147: fload_2
/*     */     //   148: invokestatic b : (IF)I
/*     */     //   151: putfield u : I
/*     */     //   154: aload_0
/*     */     //   155: aload_0
/*     */     //   156: getfield o : I
/*     */     //   159: iconst_1
/*     */     //   160: iadd
/*     */     //   161: newarray int
/*     */     //   163: putfield t : [I
/*     */     //   166: aload_0
/*     */     //   167: aload_0
/*     */     //   168: getfield o : I
/*     */     //   171: iconst_1
/*     */     //   172: iadd
/*     */     //   173: anewarray java/lang/Object
/*     */     //   176: putfield q : [Ljava/lang/Object;
/*     */     //   179: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #133	-> 8
/*     */     //   #118	-> 12
/*     */     //   #38	-> 66
/*     */     //   #39	-> 113
/*     */     //   #214	-> 118
/*     */     //   #251	-> 132
/*     */     //   #31	-> 142
/*     */     //   #96	-> 154
/*     */     //   #32	-> 166
/*     */     //   #154	-> 179
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   18	56	56	java/lang/IllegalArgumentException
/*     */     //   66	103	103	java/lang/IllegalArgumentException }
/*     */   private void a() {}
/*     */   protected void c(int paramInt) { int[] arrayOfInt1 = this.t; Object[] arrayOfObject1 = this.q; int i = paramInt - 1; int[] arrayOfInt2 = new int[paramInt + 1]; Object[] arrayOfObject2 = new Object[paramInt + 1]; int j = this.o; int k = b(); while (true) { try { if (k-- != 0) { while (true) { try { if (arrayOfInt1[--j] == 0) continue;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }  int m; if (arrayOfInt2[m = i3.c(arrayOfInt1[j]) & i] != 0) while (true) { try { if (arrayOfInt2[m = m + 1 & i] != 0) continue;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }   }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }  arrayOfObject2[paramInt] = arrayOfObject1[this.o]; this.o = paramInt; this.v = i; this.u = i3.b(this.o, this.x); this.t = arrayOfInt2; this.q = arrayOfObject2; }
/* 279 */   public int size() { return this.r; } public jM a() { try { if (this.m == null) this.m = new bu(this);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.m; } public ip() { this(16, 0.75F); } public Object a(int paramInt, Object paramObject, BiFunction<Object, Object, Object> paramBiFunction) { Objects.requireNonNull(paramBiFunction); int i = a(paramInt); try { if (i >= 0) try { if (this.q[i] != null) { Object object = paramBiFunction.apply(this.q[i], paramObject); try { if (object == null) { try { if (paramInt == 0) { j(); } else { c(i); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.a; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  this.q[i] = object; return object; }  try { if (paramObject == null) return this.a;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (paramObject == null) return this.a;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } public ip(int paramInt) { this(paramInt, 0.75F); } public Object b(int paramInt) { int i, j; try { if (paramInt == 0) { try { if (this.k) return j();  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.a; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int[] arrayOfInt = this.t; try { if ((i = arrayOfInt[j = i3.c(paramInt) & this.v]) == 0) return this.a;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (paramInt == i) return c(j);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  while (true) { if ((i = arrayOfInt[j = j + 1 & this.v]) == 0) return this.a;  if (paramInt == i) return c(j);  }  } public ip(Map paramMap) { this(paramMap, 0.75F); } private void a(int paramInt1, int paramInt2, Object paramObject) { try { if (paramInt1 == this.o) this.k = true;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { this.t[paramInt1] = paramInt2; this.q[paramInt1] = paramObject; if (this.r++ >= this.u) c(i3.a(this.r + 1, this.x));  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } public Collection values() { return a(); } private int a(int paramInt) { int i, j; try { if (paramInt == 0) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.k ? this.o : -(this.o + 1); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int[] arrayOfInt = this.t; try { if ((i = arrayOfInt[j = i3.c(paramInt) & this.v]) == 0) return -(j + 1);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (paramInt == i) return j;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  while (true) { if ((i = arrayOfInt[j = j + 1 & this.v]) == 0) return -(j + 1);  if (paramInt == i) return j;  }  } private void readObject(ObjectInputStream paramObjectInputStream) { paramObjectInputStream.defaultReadObject(); this.o = i3.a(this.r, this.x); this.u = i3.b(this.o, this.x); this.v = this.o - 1; int[] arrayOfInt = this.t = new int[this.o + 1]; Object[] arrayOfObject = this.q = new Object[this.o + 1]; for (int i = this.r; i-- != 0; object = paramObjectInputStream.readObject()) { Object object; int j = paramObjectInputStream.readInt(); }  } private void a(int paramInt) { int i = i3.a(paramInt, this.x); try { if (i > this.o) c(i);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } public Object a(int paramInt, c6 paramc6) { Objects.requireNonNull(paramc6); int i = a(paramInt); try { if (i >= 0) return this.q[i];  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (!paramc6.g(paramInt)) return this.a;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  Object object = paramc6.a(paramInt); a(-i - 1, paramInt, object); return object; } private void a(long paramLong) { int i = (int)Math.min(1073741824L, Math.max(2L, i3.d((long)Math.ceil(((float)paramLong / this.x))))); try { if (i > this.o) c(i);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }
/*     */   private Object c(int paramInt) { Object object = this.q[paramInt]; try { this.q[paramInt] = null; this.r--; d(paramInt); if (this.o > this.w) try { if (this.r < this.u / 4) try { if (this.o > 16) c(this.o / 2);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return object; }
/* 281 */   public Object b(int paramInt, BiFunction<Integer, Object, Object> paramBiFunction) { Objects.requireNonNull(paramBiFunction); int i = a(paramInt); try { if (i < 0) return this.a;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  Object object = paramBiFunction.apply(Integer.valueOf(paramInt), this.q[i]); try { if (object == null) { try { if (paramInt == 0) { j(); } else { c(i); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.a; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */     
/*     */     this.q[i] = object;
/*     */     return object; }
/*     */ 
/*     */   
/*     */   public boolean a(int paramInt, Object paramObject) {
/*     */     int i, j;
/*     */     try {
/*     */       if (paramInt == 0) {
/*     */         try {
/*     */           if (this.k)
/*     */             try {
/*     */               if (Objects.equals(paramObject, this.q[this.o])) {
/*     */                 j();
/*     */                 return true;
/*     */               } 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             }  
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         return false;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int[] arrayOfInt = this.t;
/*     */     try {
/*     */       if ((i = arrayOfInt[j = i3.c(paramInt) & this.v]) == 0)
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramInt == i)
/*     */         try {
/*     */           if (Objects.equals(paramObject, this.q[j])) {
/*     */             c(j);
/*     */             return true;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     do {
/*     */       if ((i = arrayOfInt[j = j + 1 & this.v]) == 0)
/*     */         return false; 
/*     */     } while (paramInt != i || !Objects.equals(paramObject, this.q[j]));
/*     */     c(j);
/*     */     return true;
/*     */   }
/*     */   
/*     */   public ip(c5 paramc5, float paramFloat) {
/*     */     this(paramc5.size(), paramFloat);
/*     */     putAll(paramc5);
/*     */   }
/*     */   
/*     */   private Object j() {
/*     */     this.k = false;
/*     */     Object object = this.q[this.o];
/*     */     try {
/*     */       this.q[this.o] = null;
/*     */       this.r--;
/*     */       if (this.o > this.w)
/*     */         try {
/*     */           if (this.r < this.u / 4)
/*     */             try {
/*     */               if (this.o > 16)
/*     */                 c(this.o / 2); 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             }  
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return object;
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     try {
/*     */       if (this.r == 0)
/*     */         return; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     this.r = 0;
/*     */     this.k = false;
/*     */     Arrays.fill(this.t, 0);
/*     */     Arrays.fill(this.q, (Object)null);
/*     */   }
/*     */   
/*     */   protected final void d(int paramInt) {
/*     */     int[] arrayOfInt = this.t;
/*     */     for (;; arrayOfInt[i] = j, this.q[i] = this.q[paramInt]) {
/*     */       int j, i;
/*     */       paramInt = (i = paramInt) + 1 & this.v;
/*     */       for (;; paramInt = paramInt + 1 & this.v) {
/*     */         try {
/*     */           if ((j = arrayOfInt[paramInt]) == 0) {
/*     */             arrayOfInt[i] = 0;
/*     */             this.q[i] = null;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         int k = i3.c(j) & this.v;
/*     */         try {
/*     */           if (i <= paramInt) {
/*     */             try {
/*     */               if (i < k) {
/*     */                 try {
/*     */                   if (k > paramInt)
/*     */                     break; 
/*     */                 } catch (IllegalArgumentException illegalArgumentException) {
/*     */                   throw a(null);
/*     */                 } 
/*     */               } else {
/*     */                 break;
/*     */               } 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             } 
/*     */           } else {
/*     */             try {
/*     */               if (i >= k)
/*     */                 try {
/*     */                   if (k > paramInt)
/*     */                     break; 
/*     */                 } catch (IllegalArgumentException illegalArgumentException) {
/*     */                   throw a(null);
/*     */                 }  
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             } 
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a() {
/*     */     return h(this.r);
/*     */   }
/*     */   
/*     */   public Object clone() {
/*     */     return a();
/*     */   }
/*     */   
/*     */   public ip a() {
/*     */     ip ip1;
/*     */     try {
/*     */       ip1 = (ip)super.clone();
/*     */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/*     */       throw new InternalError();
/*     */     } 
/*     */     ip1.s = null;
/*     */     ip1.m = null;
/*     */     ip1.p = null;
/*     */     ip1.k = this.k;
/*     */     ip1.t = (int[])this.t.clone();
/*     */     ip1.q = (Object[])this.q.clone();
/*     */     return ip1;
/*     */   }
/*     */   
/*     */   public boolean h(int paramInt) {
/*     */     int i = i3.b((int)Math.ceil((paramInt / this.x)));
/*     */     try {
/*     */       if (i < this.o)
/*     */         try {
/*     */           if (this.r <= i3.b(i, this.x)) {
/*     */             try {
/*     */               c(i);
/*     */             } catch (OutOfMemoryError outOfMemoryError) {
/*     */               return false;
/*     */             } 
/*     */             return true;
/*     */           } 
/*     */           return true;
/*     */         } catch (OutOfMemoryError outOfMemoryError) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (OutOfMemoryError outOfMemoryError) {
/*     */       throw a(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public ip(int[] paramArrayOfint, Object[] paramArrayOfObject) {
/*     */     this(paramArrayOfint, paramArrayOfObject, 0.75F);
/*     */   }
/*     */   
/*     */   public boolean g(int paramInt) {
/*     */     int i, j;
/*     */     try {
/*     */       if (paramInt == 0)
/*     */         return this.k; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int[] arrayOfInt = this.t;
/*     */     try {
/*     */       if ((i = arrayOfInt[j = i3.c(paramInt) & this.v]) == 0)
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramInt == i)
/*     */         return true; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     while (true) {
/*     */       if ((i = arrayOfInt[j = j + 1 & this.v]) == 0)
/*     */         return false; 
/*     */       if (paramInt == i)
/*     */         return true; 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (this.r == 0);
/*     */   }
/*     */   
/*     */   public void putAll(Map paramMap) {
/*     */     try {
/*     */       if (this.x <= 0.5D) {
/*     */         a(paramMap.size());
/*     */       } else {
/*     */         a((size() + paramMap.size()));
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     super.putAll(paramMap);
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, Object paramObject1, Object paramObject2) {
/*     */     int i = a(paramInt);
/*     */     try {
/*     */       if (i >= 0)
/*     */         try {
/*     */           if (Objects.equals(paramObject1, this.q[i])) {
/*     */             this.q[i] = paramObject2;
/*     */             return true;
/*     */           } 
/*     */           return false;
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   private static Throwable a(Throwable paramThrowable) {
/*     */     return paramThrowable;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */