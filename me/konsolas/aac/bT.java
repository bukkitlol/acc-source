/*   1 */ package me.konsolas.aac;public abstract class bt extends aN implements hT, cE { private static aN[] b; private static final long i; public i0 a() { return b(); }
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection paramCollection) {
/*   5 */     return addAll(size(), paramCollection);
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
/*     */   public ListIterator listIterator(int paramInt) {
/*  19 */     return a(paramInt);
/*     */   }
/*  21 */   public int hashCode() { i0 i0 = a();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     int i = 1, j = size();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     for (; j-- != 0; i = 31 * i + ((e == null) ? 0 : e.hashCode()))
/* 136 */     { E e = i0.next(); try {  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  }  return i; } public i0 b() { return a(0); } public Object set(int paramInt, Object paramObject) { throw new UnsupportedOperationException(); } public List subList(int paramInt1, int paramInt2) { return a(paramInt1, paramInt2); }
/*     */   public String toString() { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/bt.i : J
/*     */     //   3: ldc2_w 54629172456877
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: new java/lang/StringBuilder
/*     */     //   11: dup
/*     */     //   12: invokespecial <init> : ()V
/*     */     //   15: astore_3
/*     */     //   16: aload_0
/*     */     //   17: invokevirtual a : ()Lme/konsolas/aac/i0;
/*     */     //   20: astore #4
/*     */     //   22: aload_0
/*     */     //   23: invokevirtual size : ()I
/*     */     //   26: istore #5
/*     */     //   28: iconst_1
/*     */     //   29: istore #7
/*     */     //   31: aload_3
/*     */     //   32: ldc_w '캪绗'
/*     */     //   35: invokevirtual toCharArray : ()[C
/*     */     //   38: dup
/*     */     //   39: dup
/*     */     //   40: iconst_0
/*     */     //   41: dup_x1
/*     */     //   42: caload
/*     */     //   43: sipush #24345
/*     */     //   46: ixor
/*     */     //   47: i2c
/*     */     //   48: castore
/*     */     //   49: sipush #29851
/*     */     //   52: iconst_1
/*     */     //   53: iconst_3
/*     */     //   54: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   60: pop
/*     */     //   61: iload #5
/*     */     //   63: iinc #5, -1
/*     */     //   66: ifeq -> 195
/*     */     //   69: iload #7
/*     */     //   71: ifeq -> 93
/*     */     //   74: goto -> 87
/*     */     //   77: ldc2_w -1454522441451179039
/*     */     //   80: lload_1
/*     */     //   81: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   86: athrow
/*     */     //   87: iconst_0
/*     */     //   88: istore #7
/*     */     //   90: goto -> 123
/*     */     //   93: aload_3
/*     */     //   94: ldc_w '쪗ꎕ瀆'
/*     */     //   97: invokevirtual toCharArray : ()[C
/*     */     //   100: dup
/*     */     //   101: dup
/*     */     //   102: iconst_0
/*     */     //   103: dup_x1
/*     */     //   104: caload
/*     */     //   105: sipush #32195
/*     */     //   108: ixor
/*     */     //   109: i2c
/*     */     //   110: castore
/*     */     //   111: sipush #32762
/*     */     //   114: iconst_0
/*     */     //   115: iconst_0
/*     */     //   116: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   122: pop
/*     */     //   123: aload #4
/*     */     //   125: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   130: astore #6
/*     */     //   132: aload_0
/*     */     //   133: aload #6
/*     */     //   135: if_acmpne -> 182
/*     */     //   138: aload_3
/*     */     //   139: ldc_w '龝ધ㚎鹾黿脋ꔋ惝ܺ'
/*     */     //   142: invokevirtual toCharArray : ()[C
/*     */     //   145: dup
/*     */     //   146: dup
/*     */     //   147: bipush #10
/*     */     //   149: dup_x1
/*     */     //   150: caload
/*     */     //   151: sipush #6206
/*     */     //   154: ixor
/*     */     //   155: i2c
/*     */     //   156: castore
/*     */     //   157: sipush #5689
/*     */     //   160: iconst_1
/*     */     //   161: iconst_2
/*     */     //   162: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   168: pop
/*     */     //   169: goto -> 61
/*     */     //   172: ldc2_w -1454522441451179039
/*     */     //   175: lload_1
/*     */     //   176: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   181: athrow
/*     */     //   182: aload_3
/*     */     //   183: aload #6
/*     */     //   185: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   191: pop
/*     */     //   192: goto -> 61
/*     */     //   195: aload_3
/*     */     //   196: ldc_w 'ᄫ'
/*     */     //   199: invokevirtual toCharArray : ()[C
/*     */     //   202: dup
/*     */     //   203: dup
/*     */     //   204: iconst_0
/*     */     //   205: dup_x1
/*     */     //   206: caload
/*     */     //   207: sipush #6107
/*     */     //   210: ixor
/*     */     //   211: i2c
/*     */     //   212: castore
/*     */     //   213: sipush #18652
/*     */     //   216: iconst_0
/*     */     //   217: iconst_5
/*     */     //   218: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   224: pop
/*     */     //   225: aload_3
/*     */     //   226: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   229: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #34	-> 8
/*     */     //   #107	-> 16
/*     */     //   #99	-> 22
/*     */     //   #101	-> 28
/*     */     //   #40	-> 31
/*     */     //   #15	-> 61
/*     */     //   #96	-> 69
/*     */     //   #42	-> 93
/*     */     //   #71	-> 123
/*     */     //   #17	-> 132
/*     */     //   #133	-> 182
/*     */     //   #119	-> 195
/*     */     //   #33	-> 225
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   61	74	77	java/lang/IndexOutOfBoundsException
/*     */     //   132	172	172	java/lang/IndexOutOfBoundsException }
/*     */   protected void e(int paramInt) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/bt.i : J
/*     */     //   3: ldc2_w 97271740156803
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: iload_1
/*     */     //   9: ifge -> 98
/*     */     //   12: new java/lang/IndexOutOfBoundsException
/*     */     //   15: dup
/*     */     //   16: new java/lang/StringBuilder
/*     */     //   19: dup
/*     */     //   20: invokespecial <init> : ()V
/*     */     //   23: ldc '譣ှ망繿섁蛌惪ᳱ'
/*     */     //   25: invokevirtual toCharArray : ()[C
/*     */     //   28: dup
/*     */     //   29: dup
/*     */     //   30: iconst_0
/*     */     //   31: dup_x1
/*     */     //   32: caload
/*     */     //   33: sipush #19440
/*     */     //   36: ixor
/*     */     //   37: i2c
/*     */     //   38: castore
/*     */     //   39: bipush #37
/*     */     //   41: iconst_1
/*     */     //   42: iconst_1
/*     */     //   43: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   49: iload_1
/*     */     //   50: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   53: ldc '葛伮㰗Ჰ緊፼⃍뻔㋞훞띿客펆ტ'
/*     */     //   55: invokevirtual toCharArray : ()[C
/*     */     //   58: dup
/*     */     //   59: dup
/*     */     //   60: bipush #7
/*     */     //   62: dup_x1
/*     */     //   63: caload
/*     */     //   64: sipush #30862
/*     */     //   67: ixor
/*     */     //   68: i2c
/*     */     //   69: castore
/*     */     //   70: sipush #16815
/*     */     //   73: iconst_0
/*     */     //   74: iconst_0
/*     */     //   75: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   81: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   84: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   87: athrow
/*     */     //   88: ldc2_w 1008267913130939855
/*     */     //   91: lload_2
/*     */     //   92: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   97: athrow
/*     */     //   98: iload_1
/*     */     //   99: aload_0
/*     */     //   100: invokevirtual size : ()I
/*     */     //   103: if_icmplt -> 227
/*     */     //   106: new java/lang/IndexOutOfBoundsException
/*     */     //   109: dup
/*     */     //   110: new java/lang/StringBuilder
/*     */     //   113: dup
/*     */     //   114: invokespecial <init> : ()V
/*     */     //   117: ldc 'ㅫ䏟郘많澽޼'
/*     */     //   119: invokevirtual toCharArray : ()[C
/*     */     //   122: dup
/*     */     //   123: dup
/*     */     //   124: iconst_0
/*     */     //   125: dup_x1
/*     */     //   126: caload
/*     */     //   127: sipush #272
/*     */     //   130: ixor
/*     */     //   131: i2c
/*     */     //   132: castore
/*     */     //   133: sipush #1658
/*     */     //   136: iconst_1
/*     */     //   137: iconst_1
/*     */     //   138: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   144: iload_1
/*     */     //   145: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   148: ldc '尅৥耪⯡갲鷨㣨㦁팿㮎⻉찱콦ҋ蜩ꑫ欼㖑ﱩ鏓픷迮맾ᮈ섟뚢꒲䦦옠ÙᎶ촛ི씀㊥ꄽ䫙'
/*     */     //   150: invokevirtual toCharArray : ()[C
/*     */     //   153: dup
/*     */     //   154: dup
/*     */     //   155: bipush #20
/*     */     //   157: dup_x1
/*     */     //   158: caload
/*     */     //   159: sipush #6377
/*     */     //   162: ixor
/*     */     //   163: i2c
/*     */     //   164: castore
/*     */     //   165: sipush #29725
/*     */     //   168: iconst_1
/*     */     //   169: iconst_0
/*     */     //   170: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   176: aload_0
/*     */     //   177: invokevirtual size : ()I
/*     */     //   180: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   183: ldc '묚ȣ'
/*     */     //   185: invokevirtual toCharArray : ()[C
/*     */     //   188: dup
/*     */     //   189: dup
/*     */     //   190: iconst_0
/*     */     //   191: dup_x1
/*     */     //   192: caload
/*     */     //   193: sipush #22925
/*     */     //   196: ixor
/*     */     //   197: i2c
/*     */     //   198: castore
/*     */     //   199: sipush #14119
/*     */     //   202: iconst_0
/*     */     //   203: iconst_1
/*     */     //   204: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   210: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   213: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   216: athrow
/*     */     //   217: ldc2_w 1008267913130939855
/*     */     //   220: lload_2
/*     */     //   221: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   226: athrow
/*     */     //   227: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #43	-> 8
/*     */     //   #16	-> 98
/*     */     //   #86	-> 227
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	88	88	java/lang/IndexOutOfBoundsException
/*     */     //   98	217	217	java/lang/IndexOutOfBoundsException }
/*     */   public void c(int paramInt) { int i = size(); try { if (paramInt > i) { try { for (; i++ < paramInt; add((Object)null)); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  } else { try { for (; i-- != paramInt; remove(i)); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  }
/*     */   public void c(int paramInt1, int paramInt2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/bt.i : J
/*     */     //   3: ldc2_w 77607193789283
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: aload_0
/*     */     //   9: iload_2
/*     */     //   10: invokevirtual d : (I)V
/*     */     //   13: aload_0
/*     */     //   14: iload_1
/*     */     //   15: invokevirtual a : (I)Lme/konsolas/aac/i0;
/*     */     //   18: astore #5
/*     */     //   20: iload_2
/*     */     //   21: iload_1
/*     */     //   22: isub
/*     */     //   23: istore #6
/*     */     //   25: iload #6
/*     */     //   27: ifge -> 149
/*     */     //   30: new java/lang/IllegalArgumentException
/*     */     //   33: dup
/*     */     //   34: new java/lang/StringBuilder
/*     */     //   37: dup
/*     */     //   38: invokespecial <init> : ()V
/*     */     //   41: ldc '䳃䝝뭞璈碉﹬합鰻풆뚗ꊳ⬜忡'
/*     */     //   43: invokevirtual toCharArray : ()[C
/*     */     //   46: dup
/*     */     //   47: dup
/*     */     //   48: bipush #7
/*     */     //   50: dup_x1
/*     */     //   51: caload
/*     */     //   52: sipush #4480
/*     */     //   55: ixor
/*     */     //   56: i2c
/*     */     //   57: castore
/*     */     //   58: sipush #7424
/*     */     //   61: iconst_1
/*     */     //   62: iconst_5
/*     */     //   63: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   69: iload_1
/*     */     //   70: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   73: ldc '⩣㘈韽㛊ઉ렫컭훡䃺๼퉢薼힦㞐柵㠥ᵫ桶ẜ婯溫볪﷔쨧ݐ෾擄㗋'
/*     */     //   75: invokevirtual toCharArray : ()[C
/*     */     //   78: dup
/*     */     //   79: dup
/*     */     //   80: bipush #6
/*     */     //   82: dup_x1
/*     */     //   83: caload
/*     */     //   84: sipush #27113
/*     */     //   87: ixor
/*     */     //   88: i2c
/*     */     //   89: castore
/*     */     //   90: sipush #17519
/*     */     //   93: iconst_1
/*     */     //   94: iconst_0
/*     */     //   95: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   101: iload_2
/*     */     //   102: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   105: ldc '쁚ݜ'
/*     */     //   107: invokevirtual toCharArray : ()[C
/*     */     //   110: dup
/*     */     //   111: dup
/*     */     //   112: iconst_0
/*     */     //   113: dup_x1
/*     */     //   114: caload
/*     */     //   115: sipush #27921
/*     */     //   118: ixor
/*     */     //   119: i2c
/*     */     //   120: castore
/*     */     //   121: sipush #25386
/*     */     //   124: iconst_1
/*     */     //   125: iconst_0
/*     */     //   126: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   132: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   135: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   138: athrow
/*     */     //   139: ldc2_w 368741778782362927
/*     */     //   142: lload_3
/*     */     //   143: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   148: athrow
/*     */     //   149: iload #6
/*     */     //   151: iinc #6, -1
/*     */     //   154: ifeq -> 185
/*     */     //   157: aload #5
/*     */     //   159: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   164: pop
/*     */     //   165: aload #5
/*     */     //   167: invokeinterface remove : ()V
/*     */     //   172: goto -> 149
/*     */     //   175: ldc2_w 368741778782362927
/*     */     //   178: lload_3
/*     */     //   179: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   184: athrow
/*     */     //   185: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 8
/*     */     //   #151	-> 13
/*     */     //   #87	-> 20
/*     */     //   #144	-> 25
/*     */     //   #113	-> 149
/*     */     //   #98	-> 157
/*     */     //   #29	-> 165
/*     */     //   #3	-> 185
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   25	139	139	java/lang/IndexOutOfBoundsException
/*     */     //   149	175	175	java/lang/IndexOutOfBoundsException }
/*     */   public Object[] toArray(Object[] paramArrayOfObject) { int i = size(); if (paramArrayOfObject.length < i) paramArrayOfObject = Arrays.copyOf(paramArrayOfObject, i);  try { c(0, paramArrayOfObject, 0, i); if (paramArrayOfObject.length > i) paramArrayOfObject[i] = null;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return paramArrayOfObject; }
/* 142 */   public boolean equals(Object paramObject) { try { if (paramObject == this) return true;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  try { if (!(paramObject instanceof List)) return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  List list = (List)paramObject; int i = size(); try { if (i != list.size()) return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  i0 i0 = b(); ListIterator listIterator = list.listIterator(); while (i-- != 0) { if (!Objects.equals(i0.next(), listIterator.next())) return false;  }  return true; }
/*     */   public int a(List paramList) { try { if (paramList == this) return 0;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  if (paramList instanceof hT) { i0 i01 = b(), i02 = ((hT)paramList).b(); while (i01.hasNext() && i02.hasNext()) { E e1 = i01.next(); E e2 = i02.next(); int i; if ((i = ((Comparable<E>)e1).compareTo(e2)) != 0) return i;  }  try { try {  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return i02.hasNext() ? -1 : (i01.hasNext() ? 1 : 0); }  i0 i0 = b(); ListIterator listIterator = paramList.listIterator(); while (i0.hasNext() && listIterator.hasNext()) { int i; if ((i = ((Comparable)i0.next()).compareTo(listIterator.next())) != 0) return i;  }  try { try {  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return listIterator.hasNext() ? -1 : (i0.hasNext() ? 1 : 0); }
/*     */   public ListIterator listIterator() { return b(); }
/*     */   public boolean contains(Object paramObject) { try {  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return (indexOf(paramObject) >= 0); }
/*     */   public void b(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/bt.i : J
/*     */     //   3: ldc2_w 70999813517530
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
/*     */     //   26: invokevirtual size : ()I
/*     */     //   29: if_icmple -> 161
/*     */     //   32: new java/lang/IndexOutOfBoundsException
/*     */     //   35: dup
/*     */     //   36: new java/lang/StringBuilder
/*     */     //   39: dup
/*     */     //   40: invokespecial <init> : ()V
/*     */     //   43: ldc_w '?⚟깗艎钬⨆承术ᶒ埫'
/*     */     //   46: invokevirtual toCharArray : ()[C
/*     */     //   49: dup
/*     */     //   50: dup
/*     */     //   51: bipush #9
/*     */     //   53: dup_x1
/*     */     //   54: caload
/*     */     //   55: sipush #23879
/*     */     //   58: ixor
/*     */     //   59: i2c
/*     */     //   60: castore
/*     */     //   61: sipush #1379
/*     */     //   64: iconst_1
/*     */     //   65: iconst_5
/*     */     //   66: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   72: iload_1
/*     */     //   73: iload #4
/*     */     //   75: iadd
/*     */     //   76: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   79: ldc_w '?圅泔ԟ魳뙢픂큶濩昑臍?鋌嬚覇Ԥ᎐Ⳍ뽷ﲒ쏱倫䵆┼찈䆥ꄳⰐ'
/*     */     //   82: invokevirtual toCharArray : ()[C
/*     */     //   85: dup
/*     */     //   86: dup
/*     */     //   87: bipush #18
/*     */     //   89: dup_x1
/*     */     //   90: caload
/*     */     //   91: sipush #25819
/*     */     //   94: ixor
/*     */     //   95: i2c
/*     */     //   96: castore
/*     */     //   97: sipush #13714
/*     */     //   100: iconst_0
/*     */     //   101: iconst_3
/*     */     //   102: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   108: aload_0
/*     */     //   109: invokevirtual size : ()I
/*     */     //   112: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   115: ldc_w '໶厛'
/*     */     //   118: invokevirtual toCharArray : ()[C
/*     */     //   121: dup
/*     */     //   122: dup
/*     */     //   123: iconst_0
/*     */     //   124: dup_x1
/*     */     //   125: caload
/*     */     //   126: sipush #18252
/*     */     //   129: ixor
/*     */     //   130: i2c
/*     */     //   131: castore
/*     */     //   132: sipush #24062
/*     */     //   135: iconst_0
/*     */     //   136: iconst_5
/*     */     //   137: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   143: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   146: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   149: athrow
/*     */     //   150: ldc2_w 3938132574168493718
/*     */     //   153: lload #5
/*     */     //   155: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   160: athrow
/*     */     //   161: aload_0
/*     */     //   162: instanceof java/util/RandomAccess
/*     */     //   165: ifeq -> 213
/*     */     //   168: iconst_0
/*     */     //   169: istore #7
/*     */     //   171: iload #7
/*     */     //   173: iload #4
/*     */     //   175: if_icmpge -> 210
/*     */     //   178: aload_0
/*     */     //   179: iload #7
/*     */     //   181: iload_1
/*     */     //   182: iadd
/*     */     //   183: aload_2
/*     */     //   184: iload #7
/*     */     //   186: iload_3
/*     */     //   187: iadd
/*     */     //   188: aaload
/*     */     //   189: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   192: pop
/*     */     //   193: iinc #7, 1
/*     */     //   196: goto -> 171
/*     */     //   199: ldc2_w 3938132574168493718
/*     */     //   202: lload #5
/*     */     //   204: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   209: athrow
/*     */     //   210: goto -> 268
/*     */     //   213: aload_0
/*     */     //   214: iload_1
/*     */     //   215: invokevirtual a : (I)Lme/konsolas/aac/i0;
/*     */     //   218: astore #7
/*     */     //   220: iconst_0
/*     */     //   221: istore #8
/*     */     //   223: iload #8
/*     */     //   225: iload #4
/*     */     //   227: if_icmpge -> 268
/*     */     //   230: aload #7
/*     */     //   232: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   237: pop
/*     */     //   238: aload #7
/*     */     //   240: aload_2
/*     */     //   241: iload_3
/*     */     //   242: iload #8
/*     */     //   244: iinc #8, 1
/*     */     //   247: iadd
/*     */     //   248: aaload
/*     */     //   249: invokeinterface set : (Ljava/lang/Object;)V
/*     */     //   254: goto -> 223
/*     */     //   257: ldc2_w 3938132574168493718
/*     */     //   260: lload #5
/*     */     //   262: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   267: athrow
/*     */     //   268: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #61	-> 9
/*     */     //   #14	-> 14
/*     */     //   #56	-> 21
/*     */     //   #69	-> 161
/*     */     //   #114	-> 168
/*     */     //   #78	-> 178
/*     */     //   #121	-> 193
/*     */     //   #11	-> 213
/*     */     //   #77	-> 220
/*     */     //   #108	-> 223
/*     */     //   #37	-> 230
/*     */     //   #22	-> 238
/*     */     //   #90	-> 268
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	150	150	java/lang/IndexOutOfBoundsException
/*     */     //   171	199	199	java/lang/IndexOutOfBoundsException
/*     */     //   223	257	257	java/lang/IndexOutOfBoundsException }
/*     */   public Object a(int paramInt) { return get(size() - 1 - paramInt); }
/*     */   public int indexOf(Object paramObject) { i0 i0 = b(); while (i0.hasNext()) { E e = i0.next(); if (Objects.equals(paramObject, e))
/* 149 */         return i0.previousIndex();  }  return -1; } public boolean addAll(int paramInt, Collection paramCollection) { d(paramInt); Iterator iterator = paramCollection.iterator(); boolean bool = iterator.hasNext(); try { for (; iterator.hasNext(); add(paramInt++, iterator.next())); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return bool; }
/*     */   public void clear() { c(0, size()); } public int lastIndexOf(Object paramObject) { i0 i0 = a(size()); while (i0.hasPrevious()) { Object object = i0.previous(); if (Objects.equals(paramObject, object)) return i0.nextIndex();  }  return -1; } protected void d(int paramInt) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/bt.i : J
/*     */     //   3: ldc2_w 50515957104987
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: iload_1
/*     */     //   9: ifge -> 99
/*     */     //   12: new java/lang/IndexOutOfBoundsException
/*     */     //   15: dup
/*     */     //   16: new java/lang/StringBuilder
/*     */     //   19: dup
/*     */     //   20: invokespecial <init> : ()V
/*     */     //   23: ldc '쇙땳硖鯆霼觘ᤏ'
/*     */     //   25: invokevirtual toCharArray : ()[C
/*     */     //   28: dup
/*     */     //   29: dup
/*     */     //   30: iconst_4
/*     */     //   31: dup_x1
/*     */     //   32: caload
/*     */     //   33: sipush #2362
/*     */     //   36: ixor
/*     */     //   37: i2c
/*     */     //   38: castore
/*     */     //   39: sipush #29896
/*     */     //   42: iconst_4
/*     */     //   43: iconst_5
/*     */     //   44: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   50: iload_1
/*     */     //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   54: ldc '醛릌荃䲿שּׂɥ꛰ᜎ邢퀳쁪顢侄'
/*     */     //   56: invokevirtual toCharArray : ()[C
/*     */     //   59: dup
/*     */     //   60: dup
/*     */     //   61: bipush #9
/*     */     //   63: dup_x1
/*     */     //   64: caload
/*     */     //   65: sipush #10762
/*     */     //   68: ixor
/*     */     //   69: i2c
/*     */     //   70: castore
/*     */     //   71: sipush #4227
/*     */     //   74: iconst_0
/*     */     //   75: iconst_2
/*     */     //   76: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   82: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   85: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   88: athrow
/*     */     //   89: ldc2_w 515208975179915031
/*     */     //   92: lload_2
/*     */     //   93: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   98: athrow
/*     */     //   99: iload_1
/*     */     //   100: aload_0
/*     */     //   101: invokevirtual size : ()I
/*     */     //   104: if_icmple -> 228
/*     */     //   107: new java/lang/IndexOutOfBoundsException
/*     */     //   110: dup
/*     */     //   111: new java/lang/StringBuilder
/*     */     //   114: dup
/*     */     //   115: invokespecial <init> : ()V
/*     */     //   118: ldc '閭湕鳹訥㾼㳫兩Გ'
/*     */     //   120: invokevirtual toCharArray : ()[C
/*     */     //   123: dup
/*     */     //   124: dup
/*     */     //   125: iconst_2
/*     */     //   126: dup_x1
/*     */     //   127: caload
/*     */     //   128: sipush #14776
/*     */     //   131: ixor
/*     */     //   132: i2c
/*     */     //   133: castore
/*     */     //   134: sipush #3603
/*     */     //   137: iconst_0
/*     */     //   138: iconst_2
/*     */     //   139: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   145: iload_1
/*     */     //   146: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   149: ldc 'ꁲ揋㦽롽갌꒎굡⭔扜ᢖ珂鷥雘Ὢ殣⪃厛ࡢꢩ㔖쪎웞滖裸兀߈'
/*     */     //   151: invokevirtual toCharArray : ()[C
/*     */     //   154: dup
/*     */     //   155: dup
/*     */     //   156: bipush #12
/*     */     //   158: dup_x1
/*     */     //   159: caload
/*     */     //   160: sipush #8262
/*     */     //   163: ixor
/*     */     //   164: i2c
/*     */     //   165: castore
/*     */     //   166: sipush #32504
/*     */     //   169: iconst_4
/*     */     //   170: iconst_5
/*     */     //   171: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   177: aload_0
/*     */     //   178: invokevirtual size : ()I
/*     */     //   181: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   184: ldc '⌲$'
/*     */     //   186: invokevirtual toCharArray : ()[C
/*     */     //   189: dup
/*     */     //   190: dup
/*     */     //   191: iconst_0
/*     */     //   192: dup_x1
/*     */     //   193: caload
/*     */     //   194: sipush #6436
/*     */     //   197: ixor
/*     */     //   198: i2c
/*     */     //   199: castore
/*     */     //   200: sipush #7652
/*     */     //   203: iconst_4
/*     */     //   204: iconst_4
/*     */     //   205: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   211: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   214: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   217: athrow
/*     */     //   218: ldc2_w 515208975179915031
/*     */     //   221: lload_2
/*     */     //   222: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   227: athrow
/*     */     //   228: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #75	-> 8
/*     */     //   #123	-> 99
/*     */     //   #2	-> 228
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	89	89	java/lang/IndexOutOfBoundsException
/*     */     //   99	218	218	java/lang/IndexOutOfBoundsException } public hT a(int paramInt1, int paramInt2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/bt.i : J
/*     */     //   3: ldc2_w 9950629206403
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: aload_0
/*     */     //   9: iload_1
/*     */     //   10: invokevirtual d : (I)V
/*     */     //   13: aload_0
/*     */     //   14: iload_2
/*     */     //   15: invokevirtual d : (I)V
/*     */     //   18: iload_1
/*     */     //   19: iload_2
/*     */     //   20: if_icmple -> 141
/*     */     //   23: new java/lang/IndexOutOfBoundsException
/*     */     //   26: dup
/*     */     //   27: new java/lang/StringBuilder
/*     */     //   30: dup
/*     */     //   31: invokespecial <init> : ()V
/*     */     //   34: ldc '磢鬞뼍姧螄곜㗎뉧⑈팺䉋攖孑'
/*     */     //   36: invokevirtual toCharArray : ()[C
/*     */     //   39: dup
/*     */     //   40: dup
/*     */     //   41: bipush #10
/*     */     //   43: dup_x1
/*     */     //   44: caload
/*     */     //   45: sipush #26885
/*     */     //   48: ixor
/*     */     //   49: i2c
/*     */     //   50: castore
/*     */     //   51: sipush #21342
/*     */     //   54: iconst_0
/*     */     //   55: iconst_3
/*     */     //   56: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   62: iload_1
/*     */     //   63: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   66: ldc 'ꮫꙝȐ౳썗?씉῅㭼묫䮖玜昣뫾깙펍㰬긽ꃕ袈찣绩ﴘࣄ䖟拗ᛆ湌娾'
/*     */     //   68: invokevirtual toCharArray : ()[C
/*     */     //   71: dup
/*     */     //   72: dup
/*     */     //   73: iconst_0
/*     */     //   74: dup_x1
/*     */     //   75: caload
/*     */     //   76: sipush #3366
/*     */     //   79: ixor
/*     */     //   80: i2c
/*     */     //   81: castore
/*     */     //   82: sipush #5401
/*     */     //   85: iconst_1
/*     */     //   86: iconst_4
/*     */     //   87: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   93: iload_2
/*     */     //   94: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   97: ldc '㐧'
/*     */     //   99: invokevirtual toCharArray : ()[C
/*     */     //   102: dup
/*     */     //   103: dup
/*     */     //   104: iconst_0
/*     */     //   105: dup_x1
/*     */     //   106: caload
/*     */     //   107: sipush #3100
/*     */     //   110: ixor
/*     */     //   111: i2c
/*     */     //   112: castore
/*     */     //   113: sipush #6935
/*     */     //   116: iconst_1
/*     */     //   117: iconst_5
/*     */     //   118: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   124: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   127: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   130: athrow
/*     */     //   131: ldc2_w -2306327721360963633
/*     */     //   134: lload_3
/*     */     //   135: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   140: athrow
/*     */     //   141: aload_0
/*     */     //   142: instanceof java/util/RandomAccess
/*     */     //   145: ifeq -> 171
/*     */     //   148: new me/konsolas/aac/bK
/*     */     //   151: dup
/*     */     //   152: aload_0
/*     */     //   153: iload_1
/*     */     //   154: iload_2
/*     */     //   155: invokespecial <init> : (Lme/konsolas/aac/hT;II)V
/*     */     //   158: goto -> 181
/*     */     //   161: ldc2_w -2306327721360963633
/*     */     //   164: lload_3
/*     */     //   165: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   170: athrow
/*     */     //   171: new me/konsolas/aac/bW
/*     */     //   174: dup
/*     */     //   175: aload_0
/*     */     //   176: iload_1
/*     */     //   177: iload_2
/*     */     //   178: invokespecial <init> : (Lme/konsolas/aac/hT;II)V
/*     */     //   181: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 8
/*     */     //   #53	-> 13
/*     */     //   #4	-> 18
/*     */     //   #141	-> 141
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	131	131	java/lang/IndexOutOfBoundsException
/*     */     //   141	161	161	java/lang/IndexOutOfBoundsException } public i0 a(int paramInt) { d(paramInt); return new lp(this, 0, paramInt); } public Iterator iterator() { return a(); } public void forEach(Consumer<E> paramConsumer) { if (this instanceof java.util.RandomAccess) { byte b = 0; int i = size(); try { for (; b < i; b++) paramConsumer.accept(get(b));  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  }  super.forEach(paramConsumer); } public ea b() { return a(); } public Object b() { try { if (isEmpty()) throw new NoSuchElementException();  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return remove(size() - 1); } public boolean add(Object paramObject) { add(size(), paramObject); return true; } public void a(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { try { d(paramInt1); mK.b(paramArrayOfObject, paramInt2, paramInt3); if (this instanceof java.util.RandomAccess) { try { for (; paramInt3-- != 0; add(paramInt1++, paramArrayOfObject[paramInt2++])); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  } else { i0 i0 = a(paramInt1); try { for (; paramInt3-- != 0; i0.add(paramArrayOfObject[paramInt2++])); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  } public void add(int paramInt, Object paramObject) { throw new UnsupportedOperationException(); } public void c(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/bt.i : J
/*     */     //   3: ldc2_w 41670778831853
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
/*     */     //   26: invokevirtual size : ()I
/*     */     //   29: if_icmple -> 160
/*     */     //   32: new java/lang/IndexOutOfBoundsException
/*     */     //   35: dup
/*     */     //   36: new java/lang/StringBuilder
/*     */     //   39: dup
/*     */     //   40: invokespecial <init> : ()V
/*     */     //   43: ldc '耭㫝疘擻玠㰱᳌겵러뇦勤'
/*     */     //   45: invokevirtual toCharArray : ()[C
/*     */     //   48: dup
/*     */     //   49: dup
/*     */     //   50: bipush #6
/*     */     //   52: dup_x1
/*     */     //   53: caload
/*     */     //   54: sipush #2150
/*     */     //   57: ixor
/*     */     //   58: i2c
/*     */     //   59: castore
/*     */     //   60: sipush #14181
/*     */     //   63: iconst_0
/*     */     //   64: iconst_0
/*     */     //   65: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   71: iload_1
/*     */     //   72: iload #4
/*     */     //   74: iadd
/*     */     //   75: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   78: ldc_w 'ﳵ䗑뾐單睩酞⴬紧ᾢ渢펷․깅⮫逖ẞ탈盥ೄ翫軪唃쇝흊䙡㮄⢜'
/*     */     //   81: invokevirtual toCharArray : ()[C
/*     */     //   84: dup
/*     */     //   85: dup
/*     */     //   86: bipush #25
/*     */     //   88: dup_x1
/*     */     //   89: caload
/*     */     //   90: sipush #22342
/*     */     //   93: ixor
/*     */     //   94: i2c
/*     */     //   95: castore
/*     */     //   96: sipush #478
/*     */     //   99: iconst_0
/*     */     //   100: iconst_1
/*     */     //   101: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   107: aload_0
/*     */     //   108: invokevirtual size : ()I
/*     */     //   111: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   114: ldc_w '浗෨'
/*     */     //   117: invokevirtual toCharArray : ()[C
/*     */     //   120: dup
/*     */     //   121: dup
/*     */     //   122: iconst_0
/*     */     //   123: dup_x1
/*     */     //   124: caload
/*     */     //   125: sipush #10122
/*     */     //   128: ixor
/*     */     //   129: i2c
/*     */     //   130: castore
/*     */     //   131: sipush #28543
/*     */     //   134: iconst_1
/*     */     //   135: iconst_0
/*     */     //   136: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   142: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   145: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   148: athrow
/*     */     //   149: ldc2_w -8822433185345004127
/*     */     //   152: lload #5
/*     */     //   154: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   159: athrow
/*     */     //   160: aload_0
/*     */     //   161: instanceof java/util/RandomAccess
/*     */     //   164: ifeq -> 210
/*     */     //   167: iload_1
/*     */     //   168: istore #7
/*     */     //   170: iload #4
/*     */     //   172: iinc #4, -1
/*     */     //   175: ifeq -> 207
/*     */     //   178: aload_2
/*     */     //   179: iload_3
/*     */     //   180: iinc #3, 1
/*     */     //   183: aload_0
/*     */     //   184: iload #7
/*     */     //   186: iinc #7, 1
/*     */     //   189: invokevirtual get : (I)Ljava/lang/Object;
/*     */     //   192: aastore
/*     */     //   193: goto -> 170
/*     */     //   196: ldc2_w -8822433185345004127
/*     */     //   199: lload #5
/*     */     //   201: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   206: athrow
/*     */     //   207: goto -> 252
/*     */     //   210: aload_0
/*     */     //   211: iload_1
/*     */     //   212: invokevirtual a : (I)Lme/konsolas/aac/i0;
/*     */     //   215: astore #7
/*     */     //   217: iload #4
/*     */     //   219: iinc #4, -1
/*     */     //   222: ifeq -> 252
/*     */     //   225: aload_2
/*     */     //   226: iload_3
/*     */     //   227: iinc #3, 1
/*     */     //   230: aload #7
/*     */     //   232: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   237: aastore
/*     */     //   238: goto -> 217
/*     */     //   241: ldc2_w -8822433185345004127
/*     */     //   244: lload #5
/*     */     //   246: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*     */     //   251: athrow
/*     */     //   252: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #125	-> 9
/*     */     //   #137	-> 14
/*     */     //   #62	-> 21
/*     */     //   #94	-> 160
/*     */     //   #38	-> 167
/*     */     //   #65	-> 170
/*     */     //   #147	-> 207
/*     */     //   #74	-> 210
/*     */     //   #109	-> 217
/*     */     //   #111	-> 252
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	149	149	java/lang/IndexOutOfBoundsException
/*     */     //   170	196	196	java/lang/IndexOutOfBoundsException
/* 150 */     //   217	241	241	java/lang/IndexOutOfBoundsException } public void a(Object paramObject) { add(paramObject); } public void b(int paramInt, Object[] paramArrayOfObject) { a(paramInt, paramArrayOfObject, 0, paramArrayOfObject.length); } public Object a() { try { if (isEmpty()) throw new NoSuchElementException();  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return get(size() - 1); }
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/*     */     int i = size();
/*     */     Object[] arrayOfObject = new Object[i];
/*     */     c(0, arrayOfObject, 0, i);
/*     */     return arrayOfObject;
/*     */   }
/*     */   
/*     */   public int compareTo(Object paramObject) {
/*     */     return a((List)paramObject);
/*     */   }
/*     */   
/*     */   public Object remove(int paramInt) {
/*     */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public static void a(aN[] paramArrayOfaN) {
/*     */     b = paramArrayOfaN;
/*     */   }
/*     */   
/*     */   public static aN[] a() {
/*     */     return b;
/*     */   }
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: ldc2_w -4842855045072220217
/*     */     //   3: ldc2_w 7627655395603935762
/*     */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*     */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*     */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*     */     //   15: ldc2_w 146426518278824
/*     */     //   18: invokeinterface a : (J)J
/*     */     //   23: putstatic me/konsolas/aac/bt.i : J
/*     */     //   26: getstatic me/konsolas/aac/bt.i : J
/*     */     //   29: ldc2_w 64031659053541
/*     */     //   32: lxor
/*     */     //   33: lstore_0
/*     */     //   34: ldc2_w 1686126091375842012
/*     */     //   37: lload_0
/*     */     //   38: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   43: ifnonnull -> 59
/*     */     //   46: iconst_4
/*     */     //   47: anewarray me/konsolas/aac/aN
/*     */     //   50: ldc2_w 1660597468330745802
/*     */     //   53: lload_0
/*     */     //   54: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*     */     //   59: return
/*     */   }
/*     */   
/*     */   private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
/*     */     return paramIndexOutOfBoundsException;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */