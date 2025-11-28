/*    */ package me.konsolas.aac;public class bq extends bS implements Serializable, Cloneable { private static final long serialVersionUID = 1L; private transient Object[] b; private int c; private static final long d = nc.a(-205847445814243694L, 3983263884257275736L, MethodHandles.lookup().lookupClass()).a(74979790909870L);
/*    */   
/*    */   public Iterator iterator() {
/*  4 */     return b();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SafeVarargs
/*    */   public static bq a(Object[] paramArrayOfObject) {
/* 11 */     return new bq(paramArrayOfObject);
/*    */   } public static bq a(Object paramObject) { return a(new Object[] { paramObject }); } private void readObject(ObjectInputStream paramObjectInputStream) { paramObjectInputStream.defaultReadObject(); this.b = new Object[this.c]; byte b = 0; try { while (b < this.c) { this.b[b] = paramObjectInputStream.readObject(); b++; }  } catch (IOException iOException) { throw a(null); }  }
/*    */   public Object[] toArray(Object[] paramArrayOfObject) { if (paramArrayOfObject == null) { paramArrayOfObject = new Object[this.c]; } else if (paramArrayOfObject.length < this.c) { paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), this.c); }  try { System.arraycopy(this.b, 0, paramArrayOfObject, 0, this.c); if (paramArrayOfObject.length > this.c)
/*    */         paramArrayOfObject[this.c] = null;  }
/*    */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */      return paramArrayOfObject; }
/*    */   public Object clone() { return b(); }
/* 18 */   public bq b() { bq bq1; try { bq1 = (bq)super.clone();
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */        }
/*    */     
/* 68 */     catch (CloneNotSupportedException cloneNotSupportedException)
/*    */     { throw new InternalError(); }
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
/* 81 */     bq1.b = (Object[])this.b.clone(); return bq1; }
/*    */   public bq(int paramInt) { this.b = new Object[paramInt]; }
/*    */   @SafeVarargs public static bq b(Object[] paramArrayOfObject) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bq.d : J
/*    */     //   3: ldc2_w 122038696919525
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: aload_0
/*    */     //   9: arraylength
/*    */     //   10: iconst_2
/*    */     //   11: if_icmpne -> 101
/*    */     //   14: aload_0
/*    */     //   15: iconst_0
/*    */     //   16: aaload
/*    */     //   17: aload_0
/*    */     //   18: iconst_1
/*    */     //   19: aaload
/*    */     //   20: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   23: ifeq -> 125
/*    */     //   26: goto -> 39
/*    */     //   29: ldc2_w -4147529565568903343
/*    */     //   32: lload_1
/*    */     //   33: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   38: athrow
/*    */     //   39: new java/lang/IllegalArgumentException
/*    */     //   42: dup
/*    */     //   43: new java/lang/StringBuilder
/*    */     //   46: dup
/*    */     //   47: invokespecial <init> : ()V
/*    */     //   50: ldc '᪯䲉禆頉᪍땥齤蘟ӡ鋢鍃滞笎ꘛ低Ƿ惈'
/*    */     //   52: invokevirtual toCharArray : ()[C
/*    */     //   55: dup
/*    */     //   56: dup
/*    */     //   57: bipush #13
/*    */     //   59: dup_x1
/*    */     //   60: caload
/*    */     //   61: sipush #31429
/*    */     //   64: ixor
/*    */     //   65: i2c
/*    */     //   66: castore
/*    */     //   67: sipush #15435
/*    */     //   70: iconst_1
/*    */     //   71: iconst_1
/*    */     //   72: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   78: aload_0
/*    */     //   79: iconst_1
/*    */     //   80: aaload
/*    */     //   81: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   84: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   87: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   90: athrow
/*    */     //   91: ldc2_w -4147529565568903343
/*    */     //   94: lload_1
/*    */     //   95: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   100: athrow
/*    */     //   101: aload_0
/*    */     //   102: arraylength
/*    */     //   103: iconst_2
/*    */     //   104: if_icmple -> 125
/*    */     //   107: aload_0
/*    */     //   108: invokestatic a : ([Ljava/lang/Object;)Lme/konsolas/aac/bM;
/*    */     //   111: pop
/*    */     //   112: goto -> 125
/*    */     //   115: ldc2_w -4147529565568903343
/*    */     //   118: lload_1
/*    */     //   119: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   124: athrow
/*    */     //   125: aload_0
/*    */     //   126: invokestatic a : ([Ljava/lang/Object;)Lme/konsolas/aac/bq;
/*    */     //   129: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 8
/*    */     //   #79	-> 14
/*    */     //   #43	-> 39
/*    */     //   #55	-> 101
/*    */     //   #41	-> 107
/*    */     //   #82	-> 125
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	26	29	java/lang/IllegalArgumentException
/*    */     //   14	91	91	java/lang/IllegalArgumentException
/* 83 */     //   101	112	115	java/lang/IllegalArgumentException } public bq() { this.b = mK.d; } public void clear() { Arrays.fill(this.b, 0, this.c, (Object)null); this.c = 0; } public int size() { return this.c; } public static bq a() { return new bq(); } public boolean contains(Object paramObject) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (a(paramObject) != -1); } public Spliterator spliterator() { return a(); } public boolean remove(Object paramObject) { int i = a(paramObject); try { if (i == -1) return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int j = this.c - i - 1; byte b = 0; try { while (b < j) { this.b[i + b] = this.b[i + b + 1]; b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */     
/* 85 */     this.c--; this.b[this.c] = null; return true; }
/*    */   private void writeObject(ObjectOutputStream paramObjectOutputStream) { paramObjectOutputStream.defaultWriteObject(); byte b = 0; try { while (b < this.c) { paramObjectOutputStream.writeObject(this.b[b]); b++; }  }
/*    */     catch (IOException iOException) { throw a(null); }
/*    */      }
/*    */   public bq(Set paramSet) { this(paramSet.size()); boolean bool = false; for (Object object : paramSet)
/*    */       this.b[bool] = object;  this.c = bool; }
/*    */   public bq(Object[] paramArrayOfObject) { this.b = paramArrayOfObject; this.c = paramArrayOfObject.length; }
/*    */   public bq(Object[] paramArrayOfObject, int paramInt) { this.b = paramArrayOfObject; this.c = paramInt; if (paramInt > paramArrayOfObject.length) { "늟䛖怕?璠嬘똖騏酽⸪굠᤿彑ᜀࠢ玌乢뢳昴".toCharArray()[10] = (char)("늟䛖怕?璠嬘똖騏酽⸪굠᤿彑ᜀࠢ玌乢뢳昴".toCharArray()[10] ^ 0x6682); "?ꪠ㗻퟽ﻰ홁䋞滳⒑ᓡ쮴?驛끗犻?ㆅ촞ꋯ⁆薱ϊⳙ୩⠴㭕⒜ตꥯ镶ꥀ둅儷覺╓젗ᇎ倨".toCharArray()[11] = (char)("?ꪠ㗻퟽ﻰ홁䋞滳⒑ᓡ쮴?驛끗犻?ㆅ촞ꋯ⁆薱ϊⳙ୩⠴㭕⒜ตꥯ镶ꥀ둅儷覺╓젗ᇎ倨".toCharArray()[11] ^ 0x118B); "䬑曧".toCharArray()[0] = (char)("䬑曧".toCharArray()[0] ^ 0x2294); throw new IllegalArgumentException(da$gx.U("늟䛖怕?璠嬘똖騏酽⸪굠᤿彑ᜀࠢ玌乢뢳昴".toCharArray(), (short)15611, true, false) + paramInt + da$gx.U("?ꪠ㗻퟽ﻰ홁䋞滳⒑ᓡ쮴?驛끗犻?ㆅ촞ꋯ⁆薱ϊⳙ୩⠴㭕⒜ตꥯ镶ꥀ둅儷覺╓젗ᇎ倨".toCharArray(), (short)3813, true, true) + paramArrayOfObject.length + da$gx.U("䬑曧".toCharArray(), (short)20052, true, false)); }
/* 93 */      } public bq(jM paramjM) { this(paramjM.size()); addAll(paramjM); } public Object[] toArray() { return Arrays.copyOf(this.b, this.c, Object[].class); } public ae a() { return new k8(this); } public bq(hy paramhy) { this(paramhy.size()); byte b = 0; for (ea ea = paramhy.b(); ea.hasNext(); ) { Object object = ea.next(); this.b[b] = object; b++; }  this.c = b; } public boolean isEmpty() { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (this.c == 0); } public bq(Collection<? extends E> paramCollection) { this(paramCollection.size()); addAll(paramCollection); } public ea b() { return new hD(this); } private int a(Object paramObject) { for (int i = this.c; i-- != 0;) { if (Objects.equals(this.b[i], paramObject)) return i;  }  return -1; }
/* 94 */   public boolean add(Object paramObject) { int i = a(paramObject); try { if (i != -1)
/* 95 */         return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (this.c == this.b.length) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  Object[] arrayOfObject = new Object[(this.c == 0) ? 2 : (this.c * 2)]; int j = this.c; try { for (; j-- != 0; arrayOfObject[j] = this.b[j]); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  this.b = arrayOfObject; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  this.b[this.c++] = paramObject; return true; } public static bq c() { return a(); }
/*    */ 
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */