/*    */ package me.konsolas.aac;
/*    */ public class b4 extends bt implements RandomAccess, Serializable, Cloneable { private static final long serialVersionUID = -7046029254386353129L;
/*  3 */   public void a(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) { throw new UnsupportedOperationException(); } private final Object c; private static final long d = nc.a(6543787256868117686L, 6844808745435830016L, MethodHandles.lookup().lookupClass()).a(120030527715712L); public Spliterator spliterator() {
/*  4 */     return a(); }
/*  5 */   public boolean addAll(int paramInt, Collection paramCollection) { throw new UnsupportedOperationException(); }
/*  6 */   public void a(int paramInt, Object[] paramArrayOfObject) { throw new UnsupportedOperationException(); }
/*  7 */   public Iterator iterator() { return a(); }
/*  8 */   public void replaceAll(UnaryOperator paramUnaryOperator) { throw new UnsupportedOperationException(); }
/*  9 */   public boolean removeIf(Predicate paramPredicate) { throw new UnsupportedOperationException(); }
/* 10 */   public boolean remove(Object paramObject) { throw new UnsupportedOperationException(); }
/* 11 */   public void c(int paramInt1, int paramInt2) { throw new UnsupportedOperationException(); } public int indexOf(Object paramObject) { try {  }
/* 12 */     catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }  return Objects.equals(paramObject, this.c) ? 0 : -1; } public void c(int paramInt) {
/* 13 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/* 16 */   protected b4(Object paramObject) { this.c = paramObject; } public hT a(int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/b4.d : J
/*    */     //   3: ldc2_w 60857209216762
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: aload_0
/*    */     //   9: iload_1
/*    */     //   10: invokevirtual d : (I)V
/*    */     //   13: aload_0
/*    */     //   14: iload_2
/*    */     //   15: invokevirtual d : (I)V
/*    */     //   18: iload_1
/*    */     //   19: iload_2
/*    */     //   20: if_icmple -> 140
/*    */     //   23: new java/lang/IndexOutOfBoundsException
/*    */     //   26: dup
/*    */     //   27: new java/lang/StringBuilder
/*    */     //   30: dup
/*    */     //   31: invokespecial <init> : ()V
/*    */     //   34: ldc '੃竊쭌涉讶漃쑵ꝏ蕯埂ૺ캏泣'
/*    */     //   36: invokevirtual toCharArray : ()[C
/*    */     //   39: dup
/*    */     //   40: dup
/*    */     //   41: iconst_5
/*    */     //   42: dup_x1
/*    */     //   43: caload
/*    */     //   44: sipush #17978
/*    */     //   47: ixor
/*    */     //   48: i2c
/*    */     //   49: castore
/*    */     //   50: sipush #6289
/*    */     //   53: iconst_1
/*    */     //   54: iconst_2
/*    */     //   55: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   61: iload_1
/*    */     //   62: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   65: ldc 'ꅍ㍟ꣵ궭좝?ᘕ뙛岐尩ᙜꀢ䈰ꇢ➳亏㪬᭮끟捰汹㟲辷ꋱ䱨樂'
/*    */     //   67: invokevirtual toCharArray : ()[C
/*    */     //   70: dup
/*    */     //   71: dup
/*    */     //   72: iconst_0
/*    */     //   73: dup_x1
/*    */     //   74: caload
/*    */     //   75: sipush #14221
/*    */     //   78: ixor
/*    */     //   79: i2c
/*    */     //   80: castore
/*    */     //   81: sipush #19317
/*    */     //   84: iconst_1
/*    */     //   85: iconst_4
/*    */     //   86: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   92: iload_2
/*    */     //   93: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   96: ldc '潔∯'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_0
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #8436
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #17638
/*    */     //   115: iconst_0
/*    */     //   116: iconst_4
/*    */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   126: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   129: athrow
/*    */     //   130: ldc2_w -2402415048904723107
/*    */     //   133: lload_3
/*    */     //   134: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   139: athrow
/*    */     //   140: iload_1
/*    */     //   141: ifne -> 162
/*    */     //   144: iload_2
/*    */     //   145: iconst_1
/*    */     //   146: if_icmpeq -> 176
/*    */     //   149: goto -> 162
/*    */     //   152: ldc2_w -2402415048904723107
/*    */     //   155: lload_3
/*    */     //   156: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   161: athrow
/*    */     //   162: getstatic me/konsolas/aac/cN.a : Lme/konsolas/aac/bx;
/*    */     //   165: areturn
/*    */     //   166: ldc2_w -2402415048904723107
/*    */     //   169: lload_3
/*    */     //   170: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   175: athrow
/*    */     //   176: aload_0
/*    */     //   177: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 8
/*    */     //   #17	-> 13
/*    */     //   #2	-> 18
/*    */     //   #40	-> 140
/*    */     //   #15	-> 176
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	130	130	java/lang/IndexOutOfBoundsException
/*    */     //   140	149	152	java/lang/IndexOutOfBoundsException
/*    */     //   144	166	166	java/lang/IndexOutOfBoundsException
/*    */   } public Object remove(int paramInt) {
/* 19 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   public void sort(Comparator paramComparator) {}
/* 22 */   public ListIterator listIterator(int paramInt) { return a(paramInt); }
/* 23 */   public void clear() { throw new UnsupportedOperationException(); } public Object clone() {
/* 24 */     return this;
/*    */   } public void c(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/b4.d : J
/*    */     //   3: ldc2_w 30458164675732
/*    */     //   6: lxor
/*    */     //   7: lstore #5
/*    */     //   9: iload_3
/*    */     //   10: ifge -> 100
/*    */     //   13: new java/lang/ArrayIndexOutOfBoundsException
/*    */     //   16: dup
/*    */     //   17: new java/lang/StringBuilder
/*    */     //   20: dup
/*    */     //   21: invokespecial <init> : ()V
/*    */     //   24: ldc '⹄溊映úꓹ翺참놄ዾ'
/*    */     //   26: invokevirtual toCharArray : ()[C
/*    */     //   29: dup
/*    */     //   30: dup
/*    */     //   31: iconst_2
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #7833
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #20534
/*    */     //   43: iconst_1
/*    */     //   44: iconst_4
/*    */     //   45: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_3
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: ldc '軕效걒喥㻍覠龏࢖昙뙜뇗侃ඌ'
/*    */     //   57: invokevirtual toCharArray : ()[C
/*    */     //   60: dup
/*    */     //   61: dup
/*    */     //   62: iconst_3
/*    */     //   63: dup_x1
/*    */     //   64: caload
/*    */     //   65: sipush #19227
/*    */     //   68: ixor
/*    */     //   69: i2c
/*    */     //   70: castore
/*    */     //   71: sipush #6770
/*    */     //   74: iconst_0
/*    */     //   75: iconst_3
/*    */     //   76: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   82: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   85: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   88: athrow
/*    */     //   89: ldc2_w -8879193187034632397
/*    */     //   92: lload #5
/*    */     //   94: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   99: athrow
/*    */     //   100: iload_3
/*    */     //   101: iload #4
/*    */     //   103: iadd
/*    */     //   104: aload_2
/*    */     //   105: arraylength
/*    */     //   106: if_icmple -> 232
/*    */     //   109: new java/lang/ArrayIndexOutOfBoundsException
/*    */     //   112: dup
/*    */     //   113: new java/lang/StringBuilder
/*    */     //   116: dup
/*    */     //   117: invokespecial <init> : ()V
/*    */     //   120: ldc '틠?젨㏸噮꣰Ⴣ瘫彾嘮ŗ'
/*    */     //   122: invokevirtual toCharArray : ()[C
/*    */     //   125: dup
/*    */     //   126: dup
/*    */     //   127: iconst_3
/*    */     //   128: dup_x1
/*    */     //   129: caload
/*    */     //   130: sipush #30232
/*    */     //   133: ixor
/*    */     //   134: i2c
/*    */     //   135: castore
/*    */     //   136: sipush #2703
/*    */     //   139: iconst_1
/*    */     //   140: iconst_1
/*    */     //   141: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   147: iload_3
/*    */     //   148: iload #4
/*    */     //   150: iadd
/*    */     //   151: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   154: ldc '륈?㻃䡾ሳ쥂켵忻貒䲩洤脀ዐꄉ?뗘ॱﾦ仢憇ᕳ䗿ᆕ뼆᜻珟슕ꌿ햆Ͼ'
/*    */     //   156: invokevirtual toCharArray : ()[C
/*    */     //   159: dup
/*    */     //   160: dup
/*    */     //   161: bipush #23
/*    */     //   163: dup_x1
/*    */     //   164: caload
/*    */     //   165: sipush #11183
/*    */     //   168: ixor
/*    */     //   169: i2c
/*    */     //   170: castore
/*    */     //   171: sipush #4309
/*    */     //   174: iconst_1
/*    */     //   175: iconst_1
/*    */     //   176: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   182: aload_2
/*    */     //   183: arraylength
/*    */     //   184: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   187: ldc '쑠瞑'
/*    */     //   189: invokevirtual toCharArray : ()[C
/*    */     //   192: dup
/*    */     //   193: dup
/*    */     //   194: iconst_0
/*    */     //   195: dup_x1
/*    */     //   196: caload
/*    */     //   197: sipush #23772
/*    */     //   200: ixor
/*    */     //   201: i2c
/*    */     //   202: castore
/*    */     //   203: sipush #23447
/*    */     //   206: iconst_1
/*    */     //   207: iconst_1
/*    */     //   208: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   214: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   217: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   220: athrow
/*    */     //   221: ldc2_w -8879193187034632397
/*    */     //   224: lload #5
/*    */     //   226: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   231: athrow
/*    */     //   232: iload_1
/*    */     //   233: iload #4
/*    */     //   235: iadd
/*    */     //   236: aload_0
/*    */     //   237: invokevirtual size : ()I
/*    */     //   240: if_icmple -> 368
/*    */     //   243: new java/lang/IndexOutOfBoundsException
/*    */     //   246: dup
/*    */     //   247: new java/lang/StringBuilder
/*    */     //   250: dup
/*    */     //   251: invokespecial <init> : ()V
/*    */     //   254: ldc '憸?궅늑튼✔넌ﰂᖦ∬'
/*    */     //   256: invokevirtual toCharArray : ()[C
/*    */     //   259: dup
/*    */     //   260: dup
/*    */     //   261: iconst_2
/*    */     //   262: dup_x1
/*    */     //   263: caload
/*    */     //   264: sipush #27542
/*    */     //   267: ixor
/*    */     //   268: i2c
/*    */     //   269: castore
/*    */     //   270: sipush #32709
/*    */     //   273: iconst_0
/*    */     //   274: iconst_1
/*    */     //   275: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   281: iload_1
/*    */     //   282: iload #4
/*    */     //   284: iadd
/*    */     //   285: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   288: ldc 'ᖪ✈?瓥돘ඣ坽齓籋댩?텽Ͻ?汯?嬏䳓᳂擌迻㇉䣻鋿䡦'
/*    */     //   290: invokevirtual toCharArray : ()[C
/*    */     //   293: dup
/*    */     //   294: dup
/*    */     //   295: bipush #18
/*    */     //   297: dup_x1
/*    */     //   298: caload
/*    */     //   299: sipush #6828
/*    */     //   302: ixor
/*    */     //   303: i2c
/*    */     //   304: castore
/*    */     //   305: sipush #1411
/*    */     //   308: iconst_0
/*    */     //   309: iconst_0
/*    */     //   310: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   316: aload_0
/*    */     //   317: invokevirtual size : ()I
/*    */     //   320: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   323: ldc '쓃㮀'
/*    */     //   325: invokevirtual toCharArray : ()[C
/*    */     //   328: dup
/*    */     //   329: dup
/*    */     //   330: iconst_0
/*    */     //   331: dup_x1
/*    */     //   332: caload
/*    */     //   333: sipush #32195
/*    */     //   336: ixor
/*    */     //   337: i2c
/*    */     //   338: castore
/*    */     //   339: sipush #22256
/*    */     //   342: iconst_0
/*    */     //   343: iconst_3
/*    */     //   344: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   347: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   350: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   353: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   356: athrow
/*    */     //   357: ldc2_w -8879193187034632397
/*    */     //   360: lload #5
/*    */     //   362: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   367: athrow
/*    */     //   368: iload #4
/*    */     //   370: ifgt -> 385
/*    */     //   373: return
/*    */     //   374: ldc2_w -8879193187034632397
/*    */     //   377: lload #5
/*    */     //   379: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   384: athrow
/*    */     //   385: aload_2
/*    */     //   386: iload_3
/*    */     //   387: aload_0
/*    */     //   388: getfield c : Ljava/lang/Object;
/*    */     //   391: aastore
/*    */     //   392: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 9
/*    */     //   #1	-> 100
/*    */     //   #27	-> 232
/*    */     //   #25	-> 368
/*    */     //   #14	-> 385
/*    */     //   #41	-> 392
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	89	89	java/lang/IndexOutOfBoundsException
/*    */     //   100	221	221	java/lang/IndexOutOfBoundsException
/*    */     //   232	357	357	java/lang/IndexOutOfBoundsException
/*    */     //   368	374	374	java/lang/IndexOutOfBoundsException
/*    */   }
/*    */   public void b(Comparator paramComparator) {}
/* 29 */   public boolean retainAll(Collection paramCollection) { throw new UnsupportedOperationException(); } public i0 a(int paramInt) { try {
/* 30 */       if (paramInt <= 1) try { if (paramInt >= 0) {
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
/* 43 */             i0 i0 = b();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 50 */             try { if (paramInt == 1) i0.next();  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw c(null); }
/*    */             
/*    */             return i0;
/*    */           } 
/*    */           throw new IndexOutOfBoundsException(); }
/*    */         catch (IndexOutOfBoundsException indexOutOfBoundsException)
/*    */         { throw c(null); }
/*    */          
/*    */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IndexOutOfBoundsException(); }
/*    */ 
/*    */   
/*    */   public ListIterator listIterator() {
/*    */     return b();
/*    */   }
/*    */   
/*    */   public void forEach(Consumer<Object> paramConsumer) {
/*    */     paramConsumer.accept(this.c);
/*    */   }
/*    */   
/*    */   public List subList(int paramInt1, int paramInt2) {
/*    */     return a(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public void b(int paramInt1, Object[] paramArrayOfObject, int paramInt2, int paramInt3) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public int size() {
/*    */     return 1;
/*    */   }
/*    */   
/*    */   public boolean contains(Object paramObject) {
/*    */     return Objects.equals(paramObject, this.c);
/*    */   }
/*    */   
/*    */   public void b(int paramInt, Object[] paramArrayOfObject) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public boolean removeAll(Collection paramCollection) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public i0 b() {
/*    */     return fq.a(this.c);
/*    */   }
/*    */   
/*    */   public Object[] toArray() {
/*    */     return new Object[] { this.c };
/*    */   }
/*    */   
/*    */   public i0 a() {
/*    */     return b();
/*    */   }
/*    */   
/*    */   public Object get(int paramInt) {
/*    */     try {
/*    */       if (paramInt == 0)
/*    */         return this.c; 
/*    */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IndexOutOfBoundsException();
/*    */   }
/*    */   
/*    */   public ea b() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public ae a() {
/*    */     return dK.a(this.c);
/*    */   }
/*    */   
/*    */   public void a(Object[] paramArrayOfObject) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public boolean addAll(Collection paramCollection) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   private static IndexOutOfBoundsException c(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
/*    */     return paramIndexOutOfBoundsException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\b4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */