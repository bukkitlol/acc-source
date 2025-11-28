/*   1 */ package me.konsolas.aac;public class a4 extends aw implements Serializable, Cloneable, kZ { private static final long serialVersionUID = 0L; private static final boolean l = false; protected transient int[] k; protected transient int m; protected transient boolean o; protected transient int s; protected transient int p; protected final transient int n; protected int q; protected final float r; private static final long u = nc.a(-6756065899383582170L, 4810786280397414938L, MethodHandles.lookup().lookupClass()).a(57665306959707L); public a4(int paramInt) { this(paramInt, 0.75F); }
/*     */   protected final void b(int paramInt) { int[] arrayOfInt = this.k; while (true) { int j, i; paramInt = (i = paramInt) + 1 & this.m; while (true) { try { if ((j = arrayOfInt[paramInt]) == 0) { arrayOfInt[i] = 0; return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int k = i3.c(j) & this.m; try { if (i <= paramInt) { try { if (i < k) { try { if (k > paramInt) break;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { break; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { try { if (i >= k) try { if (k > paramInt) break;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  paramInt = paramInt + 1 & this.m; }  arrayOfInt[i] = j; }  }
/*     */   public boolean f(int paramInt) { int i = i3.b((int)Math.ceil((paramInt / this.r))); try { if (i < this.s)
/*   4 */         try { if (this.q <= i3.b(i, this.r)) { try { a(i); } catch (OutOfMemoryError outOfMemoryError) { return false; }  return true; }  return true; } catch (OutOfMemoryError outOfMemoryError) { throw a(null); }   } catch (OutOfMemoryError outOfMemoryError) { throw a(null); }  return true; } protected void a(int paramInt) { int[] arrayOfInt1 = this.k;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  26 */     int i = paramInt - 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     int[] arrayOfInt2 = new int[paramInt + 1];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int j = this.s;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int k = a();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     while (true) {
/*     */       
/*     */       try { if (k-- != 0) {
/*     */           int m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           while (true) {
/*     */             try {
/*     */               if (arrayOfInt1[--j] == 0) {
/*     */                 continue;
/*     */               }
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             if (arrayOfInt2[m = i3.c(arrayOfInt1[j]) & i] != 0)
/*     */               while (true) {
/*     */                 
/* 175 */                 try { if (arrayOfInt2[m = m + 1 & i] != 0) continue;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */                  break;
/*     */               }   break;
/*     */           }  arrayOfInt2[m] = arrayOfInt1[j]; continue;
/*     */         }  }
/*     */       catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */        this.s = paramInt; this.m = i; this.p = i3.b(this.s, this.r); this.k = arrayOfInt2; return;
/*     */     }  }
/*     */   private void c(int paramInt) { int i = i3.a(paramInt, this.r); try { if (i > this.s)
/*     */         a(i);  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */      }
/*     */   public Iterator iterator() { return b(); } public static a4 a(IntStream paramIntStream, int paramInt) { try { if (paramInt <= 16)
/* 188 */         return a(paramIntStream);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return paramIntStream.<a4>collect(new je(paramInt, paramInt -> { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (IntFunction)((paramInt <= 16) ? new a4() : new a4(paramInt)); }), a4::a, a4::a); } public int hashCode() { int i = 0; int j = a(); byte b = 0; while (true) { try { if (j-- != 0) { try { for (; this.k[b] == 0; b++); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  i += this.k[b]; b++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }  return i; } public static a4 a(int paramInt) { a4 a41 = new a4(1, 0.75F); a41.a(paramInt); return a41; }
/*     */   public Spliterator spliterator() { return b(); }
/*     */   public a4(int[] paramArrayOfint, int paramInt1, int paramInt2) { this(paramArrayOfint, paramInt1, paramInt2, 0.75F); }
/*     */   public void clear() { try { if (this.q == 0) return;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  this.q = 0; this.o = false; Arrays.fill(this.k, 0); }
/*     */   public a4(n paramn) { this(paramn, 0.75F); }
/*     */   public boolean isEmpty() { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (this.q == 0); }
/* 194 */   private void readObject(ObjectInputStream paramObjectInputStream) { paramObjectInputStream.defaultReadObject(); this.s = i3.a(this.q, this.r); this.p = i3.b(this.s, this.r); this.m = this.s - 1; int[] arrayOfInt = this.k = new int[this.s + 1]; for (int i = this.q; i-- != 0; ) { int j = paramObjectInputStream.readInt(); if (j == 0) { int k = this.s; this.o = true; }
/*     */       else
/*     */       { int k;
/*     */         if (arrayOfInt[k = i3.c(j) & this.m] != 0)
/*     */           while (true) {
/*     */             try {
/*     */               if (arrayOfInt[k = k + 1 & this.m] != 0)
/*     */                 continue; 
/*     */             } catch (IOException iOException) {
/*     */               throw a(null);
/*     */             } 
/*     */             break;
/*     */           }   }
/*     */        }
/*     */      }
/*     */ 
/*     */   
/*     */   public int size() {
/*     */     return this.q;
/*     */   }
/*     */   
/*     */   public fK b() {
/*     */     return new gt(this);
/*     */   }
/*     */   
/*     */   public static a4 b() {
/*     */     return new a4();
/*     */   }
/*     */   
/*     */   public a4(n paramn, float paramFloat) {
/*     */     this(paramn.size(), paramFloat);
/*     */     a(paramn);
/*     */   }
/*     */   
/*     */   public a4 a() {
/*     */     a4 a41;
/*     */     try {
/*     */       a41 = (a4)super.clone();
/*     */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/*     */       throw new InternalError();
/*     */     } 
/*     */     a41.k = (int[])this.k.clone();
/*     */     a41.o = this.o;
/*     */     return a41;
/*     */   }
/*     */   
/*     */   public boolean a(n paramn) {
/*     */     try {
/*     */       if (this.r <= 0.5D) {
/*     */         c(paramn.size());
/*     */       } else {
/*     */         a((size() + paramn.size()));
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return super.a(paramn);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*     */     return f(this.q);
/*     */   }
/*     */   
/*     */   public cA b() {
/*     */     return new z(this, null);
/*     */   }
/*     */   
/*     */   public void a(IntConsumer paramIntConsumer) {
/*     */     try {
/*     */       if (this.o)
/*     */         paramIntConsumer.accept(this.k[this.s]); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int[] arrayOfInt = this.k;
/*     */     int i = this.s;
/*     */     while (true) {
/*     */       try {
/*     */         while (i-- != 0) {
/*     */           if (arrayOfInt[i] != 0)
/*     */             paramIntConsumer.accept(arrayOfInt[i]); 
/*     */         } 
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a() {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return this.o ? (this.q - 1) : this.q;
/*     */   }
/*     */   
/*     */   public boolean d(int paramInt) {
/*     */     int i, j;
/*     */     try {
/*     */       if (paramInt == 0) {
/*     */         try {
/*     */           if (this.o)
/*     */             return a(); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         return false;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int[] arrayOfInt = this.k;
/*     */     try {
/*     */       if ((i = arrayOfInt[j = i3.c(paramInt) & this.m]) == 0)
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramInt == i)
/*     */         return e(j); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     while (true) {
/*     */       if ((i = arrayOfInt[j = j + 1 & this.m]) == 0)
/*     */         return false; 
/*     */       if (paramInt == i)
/*     */         return e(j); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public a4(Iterator paramIterator) {
/*     */     this(mW.a(paramIterator));
/*     */   }
/*     */   
/*     */   public a4(cA paramcA, float paramFloat) {
/*     */     this(16, paramFloat);
/*     */     try {
/*     */       for (; paramcA.hasNext(); a(paramcA.nextInt()));
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt) {
/*     */     int i, j;
/*     */     try {
/*     */       if (paramInt == 0)
/*     */         return this.o; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int[] arrayOfInt = this.k;
/*     */     try {
/*     */       if ((i = arrayOfInt[j = i3.c(paramInt) & this.m]) == 0)
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
/*     */       if ((i = arrayOfInt[j = j + 1 & this.m]) == 0)
/*     */         return false; 
/*     */       if (paramInt == i)
/*     */         return true; 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static a4 a(int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/a4.u : J
/*     */     //   3: ldc2_w 109793790660921
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: new me/konsolas/aac/a4
/*     */     //   11: dup
/*     */     //   12: iconst_2
/*     */     //   13: ldc 0.75
/*     */     //   15: invokespecial <init> : (IF)V
/*     */     //   18: astore #4
/*     */     //   20: aload #4
/*     */     //   22: iload_0
/*     */     //   23: invokevirtual a : (I)Z
/*     */     //   26: pop
/*     */     //   27: aload #4
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual a : (I)Z
/*     */     //   33: ifne -> 96
/*     */     //   36: new java/lang/IllegalArgumentException
/*     */     //   39: dup
/*     */     //   40: new java/lang/StringBuilder
/*     */     //   43: dup
/*     */     //   44: invokespecial <init> : ()V
/*     */     //   47: ldc '⍺牀煮衵랾㵪囐╽黼ൺ幎滦곕猰ෆ烏'
/*     */     //   49: invokevirtual toCharArray : ()[C
/*     */     //   52: dup
/*     */     //   53: dup
/*     */     //   54: bipush #13
/*     */     //   56: dup_x1
/*     */     //   57: caload
/*     */     //   58: sipush #17479
/*     */     //   61: ixor
/*     */     //   62: i2c
/*     */     //   63: castore
/*     */     //   64: sipush #15247
/*     */     //   67: iconst_0
/*     */     //   68: iconst_2
/*     */     //   69: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   75: iload_1
/*     */     //   76: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   79: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   82: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   85: athrow
/*     */     //   86: ldc2_w -5202108870210239344
/*     */     //   89: lload_2
/*     */     //   90: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   95: athrow
/*     */     //   96: aload #4
/*     */     //   98: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 8
/*     */     //   #113	-> 20
/*     */     //   #20	-> 27
/*     */     //   #160	-> 36
/*     */     //   #15	-> 96
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	86	86	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public static a4 a(int paramInt1, int paramInt2, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/a4.u : J
/*     */     //   3: ldc2_w 88862598135437
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: new me/konsolas/aac/a4
/*     */     //   11: dup
/*     */     //   12: iconst_3
/*     */     //   13: ldc 0.75
/*     */     //   15: invokespecial <init> : (IF)V
/*     */     //   18: astore #5
/*     */     //   20: aload #5
/*     */     //   22: iload_0
/*     */     //   23: invokevirtual a : (I)Z
/*     */     //   26: pop
/*     */     //   27: aload #5
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual a : (I)Z
/*     */     //   33: ifne -> 96
/*     */     //   36: new java/lang/IllegalArgumentException
/*     */     //   39: dup
/*     */     //   40: new java/lang/StringBuilder
/*     */     //   43: dup
/*     */     //   44: invokespecial <init> : ()V
/*     */     //   47: ldc 'ꏒꠐ⚢褮杒覝⹐㐚㉂㔏‾놺깟ꉼ럒皶酖擩'
/*     */     //   49: invokevirtual toCharArray : ()[C
/*     */     //   52: dup
/*     */     //   53: dup
/*     */     //   54: bipush #11
/*     */     //   56: dup_x1
/*     */     //   57: caload
/*     */     //   58: sipush #1082
/*     */     //   61: ixor
/*     */     //   62: i2c
/*     */     //   63: castore
/*     */     //   64: sipush #10950
/*     */     //   67: iconst_2
/*     */     //   68: iconst_0
/*     */     //   69: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   75: iload_1
/*     */     //   76: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   79: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   82: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   85: athrow
/*     */     //   86: ldc2_w -2847868698813158620
/*     */     //   89: lload_3
/*     */     //   90: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   95: athrow
/*     */     //   96: aload #5
/*     */     //   98: iload_2
/*     */     //   99: invokevirtual a : (I)Z
/*     */     //   102: ifne -> 164
/*     */     //   105: new java/lang/IllegalArgumentException
/*     */     //   108: dup
/*     */     //   109: new java/lang/StringBuilder
/*     */     //   112: dup
/*     */     //   113: invokespecial <init> : ()V
/*     */     //   116: ldc 'ἀ᫥㇎理囬习ဒ֜ᙺ튥ቘꋸվ㐆擠윌⒵᠇'
/*     */     //   118: invokevirtual toCharArray : ()[C
/*     */     //   121: dup
/*     */     //   122: dup
/*     */     //   123: iconst_3
/*     */     //   124: dup_x1
/*     */     //   125: caload
/*     */     //   126: sipush #19819
/*     */     //   129: ixor
/*     */     //   130: i2c
/*     */     //   131: castore
/*     */     //   132: sipush #8288
/*     */     //   135: iconst_2
/*     */     //   136: iconst_0
/*     */     //   137: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   143: iload_2
/*     */     //   144: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   147: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   150: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   153: athrow
/*     */     //   154: ldc2_w -2847868698813158620
/*     */     //   157: lload_3
/*     */     //   158: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   163: athrow
/*     */     //   164: aload #5
/*     */     //   166: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #126	-> 8
/*     */     //   #82	-> 20
/*     */     //   #71	-> 27
/*     */     //   #70	-> 36
/*     */     //   #23	-> 96
/*     */     //   #14	-> 105
/*     */     //   #13	-> 164
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	86	86	java/lang/IllegalArgumentException
/*     */     //   96	154	154	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public a4(int[] paramArrayOfint) {
/*     */     this(paramArrayOfint, 0.75F);
/*     */   }
/*     */   
/*     */   private boolean e(int paramInt) {
/*     */     try {
/*     */       this.q--;
/*     */       b(paramInt);
/*     */       if (this.s > this.n)
/*     */         try {
/*     */           if (this.q < this.p / 4)
/*     */             try {
/*     */               if (this.s > 16)
/*     */                 a(this.s / 2); 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             }  
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public static a4 a(IntStream paramIntStream) {
/*     */     return paramIntStream.<a4>collect(a4::new, a4::a, a4::a);
/*     */   }
/*     */   
/*     */   public static a4 a(int[] paramArrayOfint) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/a4.u : J
/*     */     //   3: ldc2_w 40614595215874
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: new me/konsolas/aac/a4
/*     */     //   11: dup
/*     */     //   12: aload_0
/*     */     //   13: arraylength
/*     */     //   14: ldc 0.75
/*     */     //   16: invokespecial <init> : (IF)V
/*     */     //   19: astore_3
/*     */     //   20: aload_0
/*     */     //   21: astore #4
/*     */     //   23: aload #4
/*     */     //   25: arraylength
/*     */     //   26: istore #5
/*     */     //   28: iconst_0
/*     */     //   29: istore #6
/*     */     //   31: iload #6
/*     */     //   33: iload #5
/*     */     //   35: if_icmpge -> 120
/*     */     //   38: aload #4
/*     */     //   40: iload #6
/*     */     //   42: iaload
/*     */     //   43: istore #7
/*     */     //   45: aload_3
/*     */     //   46: iload #7
/*     */     //   48: invokevirtual a : (I)Z
/*     */     //   51: ifne -> 114
/*     */     //   54: new java/lang/IllegalArgumentException
/*     */     //   57: dup
/*     */     //   58: new java/lang/StringBuilder
/*     */     //   61: dup
/*     */     //   62: invokespecial <init> : ()V
/*     */     //   65: ldc '?菪찰쀟킒Ⲯ?钕᪞댡瀚톮赍䠓鎡얪꺉䂦'
/*     */     //   67: invokevirtual toCharArray : ()[C
/*     */     //   70: dup
/*     */     //   71: dup
/*     */     //   72: iconst_0
/*     */     //   73: dup_x1
/*     */     //   74: caload
/*     */     //   75: sipush #7539
/*     */     //   78: ixor
/*     */     //   79: i2c
/*     */     //   80: castore
/*     */     //   81: sipush #18385
/*     */     //   84: iconst_0
/*     */     //   85: iconst_0
/*     */     //   86: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   92: iload #7
/*     */     //   94: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   97: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   100: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   103: athrow
/*     */     //   104: ldc2_w -1948613191343499349
/*     */     //   107: lload_1
/*     */     //   108: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   113: athrow
/*     */     //   114: iinc #6, 1
/*     */     //   117: goto -> 31
/*     */     //   120: aload_3
/*     */     //   121: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #143	-> 8
/*     */     //   #8	-> 20
/*     */     //   #86	-> 45
/*     */     //   #59	-> 54
/*     */     //   #147	-> 114
/*     */     //   #72	-> 120
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   45	104	104	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public Object clone() {
/*     */     return a();
/*     */   }
/*     */   
/*     */   private boolean a() {
/*     */     try {
/*     */       this.o = false;
/*     */       this.k[this.s] = 0;
/*     */       this.q--;
/*     */       if (this.s > this.n)
/*     */         try {
/*     */           if (this.q < this.p / 4)
/*     */             try {
/*     */               if (this.s > 16)
/*     */                 a(this.s / 2); 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw a(null);
/*     */             }  
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public a4() {
/*     */     this(16, 0.75F);
/*     */   }
/*     */   
/*     */   public boolean addAll(Collection paramCollection) {
/*     */     try {
/*     */       if (this.r <= 0.5D) {
/*     */         c(paramCollection.size());
/*     */       } else {
/*     */         a((size() + paramCollection.size()));
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return super.addAll(paramCollection);
/*     */   }
/*     */   
/*     */   private void a() {}
/*     */   
/*     */   public a4(int[] paramArrayOfint, float paramFloat) {
/*     */     this(paramArrayOfint, 0, paramArrayOfint.length, paramFloat);
/*     */   }
/*     */   
/*     */   private void a(long paramLong) {
/*     */     int i = (int)Math.min(1073741824L, Math.max(2L, i3.d((long)Math.ceil(((float)paramLong / this.r)))));
/*     */     try {
/*     */       if (i > this.s)
/*     */         a(i); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void writeObject(ObjectOutputStream paramObjectOutputStream) {
/*     */     cA cA = b();
/*     */     paramObjectOutputStream.defaultWriteObject();
/*     */     int i = this.q;
/*     */     try {
/*     */       for (; i-- != 0; paramObjectOutputStream.writeInt(cA.nextInt()));
/*     */     } catch (IOException iOException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public a4(int[] paramArrayOfint, int paramInt1, int paramInt2, float paramFloat) {
/*     */     this((paramInt2 < 0) ? 0 : paramInt2, paramFloat);
/*     */     fG.a(paramArrayOfint, paramInt1, paramInt2);
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < paramInt2) {
/*     */         a(paramArrayOfint[paramInt1 + b]);
/*     */         b++;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: ifne -> 32
/*     */     //   4: aload_0
/*     */     //   5: getfield o : Z
/*     */     //   8: ifeq -> 24
/*     */     //   11: goto -> 18
/*     */     //   14: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   17: athrow
/*     */     //   18: iconst_0
/*     */     //   19: ireturn
/*     */     //   20: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   23: athrow
/*     */     //   24: aload_0
/*     */     //   25: iconst_1
/*     */     //   26: putfield o : Z
/*     */     //   29: goto -> 105
/*     */     //   32: aload_0
/*     */     //   33: getfield k : [I
/*     */     //   36: astore #4
/*     */     //   38: aload #4
/*     */     //   40: iload_1
/*     */     //   41: invokestatic c : (I)I
/*     */     //   44: aload_0
/*     */     //   45: getfield m : I
/*     */     //   48: iand
/*     */     //   49: dup
/*     */     //   50: istore_2
/*     */     //   51: iaload
/*     */     //   52: dup
/*     */     //   53: istore_3
/*     */     //   54: ifeq -> 100
/*     */     //   57: iload_3
/*     */     //   58: iload_1
/*     */     //   59: if_icmpne -> 75
/*     */     //   62: goto -> 69
/*     */     //   65: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   68: athrow
/*     */     //   69: iconst_0
/*     */     //   70: ireturn
/*     */     //   71: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   74: athrow
/*     */     //   75: aload #4
/*     */     //   77: iload_2
/*     */     //   78: iconst_1
/*     */     //   79: iadd
/*     */     //   80: aload_0
/*     */     //   81: getfield m : I
/*     */     //   84: iand
/*     */     //   85: dup
/*     */     //   86: istore_2
/*     */     //   87: iaload
/*     */     //   88: dup
/*     */     //   89: istore_3
/*     */     //   90: ifeq -> 100
/*     */     //   93: iload_3
/*     */     //   94: iload_1
/*     */     //   95: if_icmpne -> 75
/*     */     //   98: iconst_0
/*     */     //   99: ireturn
/*     */     //   100: aload #4
/*     */     //   102: iload_2
/*     */     //   103: iload_1
/*     */     //   104: iastore
/*     */     //   105: aload_0
/*     */     //   106: dup
/*     */     //   107: getfield q : I
/*     */     //   110: dup_x1
/*     */     //   111: iconst_1
/*     */     //   112: iadd
/*     */     //   113: putfield q : I
/*     */     //   116: aload_0
/*     */     //   117: getfield p : I
/*     */     //   120: if_icmplt -> 147
/*     */     //   123: aload_0
/*     */     //   124: aload_0
/*     */     //   125: getfield q : I
/*     */     //   128: iconst_1
/*     */     //   129: iadd
/*     */     //   130: aload_0
/*     */     //   131: getfield r : F
/*     */     //   134: invokestatic a : (IF)I
/*     */     //   137: invokevirtual a : (I)V
/*     */     //   140: goto -> 147
/*     */     //   143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*     */     //   146: athrow
/*     */     //   147: iconst_1
/*     */     //   148: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #169	-> 0
/*     */     //   #40	-> 4
/*     */     //   #31	-> 24
/*     */     //   #58	-> 32
/*     */     //   #190	-> 38
/*     */     //   #115	-> 57
/*     */     //   #51	-> 75
/*     */     //   #144	-> 93
/*     */     //   #191	-> 100
/*     */     //   #96	-> 105
/*     */     //   #111	-> 147
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	11	14	java/lang/IllegalArgumentException
/*     */     //   4	20	20	java/lang/IllegalArgumentException
/*     */     //   54	62	65	java/lang/IllegalArgumentException
/*     */     //   57	71	71	java/lang/IllegalArgumentException
/*     */     //   105	140	143	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public a4(cA paramcA) {
/*     */     this(paramcA, 0.75F);
/*     */   }
/*     */   
/*     */   public a4(Collection paramCollection, float paramFloat) {
/*     */     this(paramCollection.size(), paramFloat);
/*     */     addAll(paramCollection);
/*     */   }
/*     */   
/*     */   public a4(int paramInt, float paramFloat) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/a4.u : J
/*     */     //   3: ldc2_w 98357952196129
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
/*     */     //   21: iflt -> 67
/*     */     //   24: new java/lang/IllegalArgumentException
/*     */     //   27: dup
/*     */     //   28: ldc 'ॹ誸Ế靍蘽?鋾栉몮?믺⾄ēᩰ䤢쇋윸읦딨ꧺ缁抂ꦪᶍ?僅⦾졬㏒辱ᨁ薆䩥፶峘蜦錄쬈攗犆虱辞슺坵ﻌ骓뀂倣㗲'
/*     */     //   30: invokevirtual toCharArray : ()[C
/*     */     //   33: dup
/*     */     //   34: dup
/*     */     //   35: bipush #51
/*     */     //   37: dup_x1
/*     */     //   38: caload
/*     */     //   39: sipush #12502
/*     */     //   42: ixor
/*     */     //   43: i2c
/*     */     //   44: castore
/*     */     //   45: sipush #31245
/*     */     //   48: iconst_0
/*     */     //   49: iconst_1
/*     */     //   50: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   53: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   56: athrow
/*     */     //   57: ldc2_w -8586571029145650296
/*     */     //   60: lload_3
/*     */     //   61: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   66: athrow
/*     */     //   67: iload_1
/*     */     //   68: ifge -> 114
/*     */     //   71: new java/lang/IllegalArgumentException
/*     */     //   74: dup
/*     */     //   75: ldc '຤踩ቯ玥㊢皯츾얳쮭ꔦ橏鯼阶ঋ๷索힭矛׀퀒?땠崫㶻遝ઝ꽥گ뉊㽯ﮣཌᓏ凑䑷쓻鎢?欔桡⑻㻉湚'
/*     */     //   77: invokevirtual toCharArray : ()[C
/*     */     //   80: dup
/*     */     //   81: dup
/*     */     //   82: bipush #13
/*     */     //   84: dup_x1
/*     */     //   85: caload
/*     */     //   86: sipush #22199
/*     */     //   89: ixor
/*     */     //   90: i2c
/*     */     //   91: castore
/*     */     //   92: sipush #9626
/*     */     //   95: iconst_0
/*     */     //   96: iconst_4
/*     */     //   97: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   100: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   103: athrow
/*     */     //   104: ldc2_w -8586571029145650296
/*     */     //   107: lload_3
/*     */     //   108: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   113: athrow
/*     */     //   114: aload_0
/*     */     //   115: fload_2
/*     */     //   116: putfield r : F
/*     */     //   119: aload_0
/*     */     //   120: aload_0
/*     */     //   121: iload_1
/*     */     //   122: fload_2
/*     */     //   123: invokestatic a : (IF)I
/*     */     //   126: dup_x1
/*     */     //   127: putfield s : I
/*     */     //   130: putfield n : I
/*     */     //   133: aload_0
/*     */     //   134: aload_0
/*     */     //   135: getfield s : I
/*     */     //   138: iconst_1
/*     */     //   139: isub
/*     */     //   140: putfield m : I
/*     */     //   143: aload_0
/*     */     //   144: aload_0
/*     */     //   145: getfield s : I
/*     */     //   148: fload_2
/*     */     //   149: invokestatic b : (IF)I
/*     */     //   152: putfield p : I
/*     */     //   155: aload_0
/*     */     //   156: aload_0
/*     */     //   157: getfield s : I
/*     */     //   160: iconst_1
/*     */     //   161: iadd
/*     */     //   162: newarray int
/*     */     //   164: putfield k : [I
/*     */     //   167: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #183	-> 8
/*     */     //   #55	-> 12
/*     */     //   #66	-> 67
/*     */     //   #136	-> 114
/*     */     //   #56	-> 119
/*     */     //   #104	-> 133
/*     */     //   #47	-> 143
/*     */     //   #50	-> 155
/*     */     //   #176	-> 167
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   18	57	57	java/lang/IllegalArgumentException
/*     */     //   67	104	104	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public a4(Collection paramCollection) {
/*     */     this(paramCollection, 0.75F);
/*     */   }
/*     */   
/*     */   public a4(Iterator paramIterator, float paramFloat) {
/*     */     this(mW.a(paramIterator), paramFloat);
/*     */   }
/*     */   
/*     */   private static Throwable a(Throwable paramThrowable) {
/*     */     return paramThrowable;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\a4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */