/*  1 */ package me.konsolas.aac;class lx implements i0 { private i0 a; public void add(Object paramObject) { this.a.add(paramObject); } final bW b; private static final long c = nc.a(-4156496986110658226L, 3045047767137979560L, MethodHandles.lookup().lookupClass()).a(96722346220210L); public boolean hasPrevious() { try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/*  3 */     { throw a(null); }  return (this.a.previousIndex() >= this.b.d); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int nextIndex() {
/* 11 */     return this.a.nextIndex() - this.b.d;
/*    */   }
/* 13 */   public int previousIndex() { return this.a.previousIndex() - this.b.d; } public boolean hasNext() { try {  }
/* 14 */     catch (NoSuchElementException noSuchElementException) { throw a(null); }  return (this.a.nextIndex() < this.b.e); } public int b(int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/lx.c : J
/*    */     //   3: ldc2_w 52719902891237
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 71
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '뾛葘漌耥䇗䡑㿐࿅鯲ꠓ륵浺ࠣ䓰㼭趱䑍閟」攧棆婮ࠒᴱ榰퓈腯馪搽缍'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: iconst_0
/*    */     //   31: dup_x1
/*    */     //   32: caload
/*    */     //   33: sipush #13755
/*    */     //   36: ixor
/*    */     //   37: i2c
/*    */     //   38: castore
/*    */     //   39: sipush #4168
/*    */     //   42: iconst_0
/*    */     //   43: iconst_1
/*    */     //   44: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   50: iload_1
/*    */     //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   54: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   57: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   60: athrow
/*    */     //   61: ldc2_w 6719093571948810934
/*    */     //   64: lload_2
/*    */     //   65: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   70: athrow
/*    */     //   71: aload_0
/*    */     //   72: getfield a : Lme/konsolas/aac/i0;
/*    */     //   75: invokeinterface nextIndex : ()I
/*    */     //   80: istore #4
/*    */     //   82: iload #4
/*    */     //   84: iload_1
/*    */     //   85: iadd
/*    */     //   86: istore #5
/*    */     //   88: iload #5
/*    */     //   90: aload_0
/*    */     //   91: getfield b : Lme/konsolas/aac/bW;
/*    */     //   94: getfield e : I
/*    */     //   97: if_icmple -> 109
/*    */     //   100: aload_0
/*    */     //   101: getfield b : Lme/konsolas/aac/bW;
/*    */     //   104: getfield e : I
/*    */     //   107: istore #5
/*    */     //   109: iload #5
/*    */     //   111: iload #4
/*    */     //   113: isub
/*    */     //   114: istore #6
/*    */     //   116: aload_0
/*    */     //   117: getfield a : Lme/konsolas/aac/i0;
/*    */     //   120: iload #6
/*    */     //   122: invokeinterface b : (I)I
/*    */     //   127: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 8
/*    */     //   #15	-> 71
/*    */     //   #2	-> 82
/*    */     //   #4	-> 88
/*    */     //   #18	-> 109
/*    */     //   #5	-> 116
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	61	61	java/util/NoSuchElementException }
/*    */   public Object next() {
/*    */     
/* 17 */     try { if (!hasNext()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return this.a.next();
/*    */   }
/*    */   
/* 20 */   public void remove() { this.a.remove(); } public Object previous() { 
/* 21 */     try { if (!hasPrevious()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return this.a.previous(); } lx(bW parambW, i0 parami0) { this.a = parami0; }
/*    */   public void set(Object paramObject) {
/* 23 */     this.a.set(paramObject);
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/lx.c : J
/*    */     //   3: ldc2_w 81030462171440
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '悯궄⠧䌩䩷뒩䍸菋Ὢ釯붞（잣贉䲒ࣲꚸ랒퀹ꏦ㓳痴鈄ઇ脗ꊬ㟩柑諔敩'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #21
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #17523
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #23373
/*    */     //   43: iconst_1
/*    */     //   44: iconst_3
/*    */     //   45: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 2948276940339079011
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: aload_0
/*    */     //   73: getfield a : Lme/konsolas/aac/i0;
/*    */     //   76: invokeinterface previousIndex : ()I
/*    */     //   81: istore #4
/*    */     //   83: iload #4
/*    */     //   85: iload_1
/*    */     //   86: isub
/*    */     //   87: istore #5
/*    */     //   89: iload #5
/*    */     //   91: aload_0
/*    */     //   92: getfield b : Lme/konsolas/aac/bW;
/*    */     //   95: getfield d : I
/*    */     //   98: iconst_1
/*    */     //   99: isub
/*    */     //   100: if_icmpge -> 114
/*    */     //   103: aload_0
/*    */     //   104: getfield b : Lme/konsolas/aac/bW;
/*    */     //   107: getfield d : I
/*    */     //   110: iconst_1
/*    */     //   111: isub
/*    */     //   112: istore #5
/*    */     //   114: iload #5
/*    */     //   116: iload #4
/*    */     //   118: isub
/*    */     //   119: istore #6
/*    */     //   121: aload_0
/*    */     //   122: getfield a : Lme/konsolas/aac/i0;
/*    */     //   125: iload #6
/*    */     //   127: invokeinterface a : (I)I
/*    */     //   132: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 8
/*    */     //   #9	-> 72
/*    */     //   #19	-> 83
/*    */     //   #10	-> 89
/*    */     //   #7	-> 114
/*    */     //   #8	-> 121
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */