/*  1 */ package me.konsolas.aac;public abstract class bf extends bD { protected int a; private static final long e = nc.a(-8162772348292249960L, -5435943685270503808L, MethodHandles.lookup().lookupClass()).a(267234232523841L); public int characteristics() { return 16720; }
/*    */   
/*  3 */   public fK a() { int i = a();
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
/* 22 */     int j = b();
/*    */ 
/*    */ 
/*    */     
/* 26 */     try { if (j != this.a) try { if (j != i)
/*    */           { a(j, i); int k = this.a; fK fK = a(k, j); 
/* 28 */             try { if (fK != null) this.a = j;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return fK; }  return null; } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }   } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }  return null; }
/*    */   protected bf(int paramInt) { this.a = paramInt; }
/*    */   private void a(int paramInt1, int paramInt2) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bf.e : J
/*    */     //   3: ldc2_w 37370119553544
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: iload_1
/*    */     //   9: aload_0
/*    */     //   10: getfield a : I
/*    */     //   13: if_icmplt -> 34
/*    */     //   16: iload_1
/*    */     //   17: iload_2
/*    */     //   18: if_icmple -> 160
/*    */     //   21: goto -> 34
/*    */     //   24: ldc2_w -6662010195701404918
/*    */     //   27: lload_3
/*    */     //   28: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   33: athrow
/*    */     //   34: new java/lang/IndexOutOfBoundsException
/*    */     //   37: dup
/*    */     //   38: new java/lang/StringBuilder
/*    */     //   41: dup
/*    */     //   42: invokespecial <init> : ()V
/*    */     //   45: ldc '覻ڴ셁䜍䔙莔ㅝ蛠㏛窦੼'
/*    */     //   47: invokevirtual toCharArray : ()[C
/*    */     //   50: dup
/*    */     //   51: dup
/*    */     //   52: iconst_5
/*    */     //   53: dup_x1
/*    */     //   54: caload
/*    */     //   55: sipush #30083
/*    */     //   58: ixor
/*    */     //   59: i2c
/*    */     //   60: castore
/*    */     //   61: sipush #29673
/*    */     //   64: iconst_2
/*    */     //   65: iconst_0
/*    */     //   66: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   72: iload_1
/*    */     //   73: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   76: ldc '著௞↥트袟䭑䴲谼㳠Ხ붵챏퍢霉邍荴閑꿢굴倯嵐Ʒ醙攥ⱈ褐ꈔ쭘嬻扝᷑洭튀琤㵻侙'
/*    */     //   78: invokevirtual toCharArray : ()[C
/*    */     //   81: dup
/*    */     //   82: dup
/*    */     //   83: bipush #19
/*    */     //   85: dup_x1
/*    */     //   86: caload
/*    */     //   87: sipush #12113
/*    */     //   90: ixor
/*    */     //   91: i2c
/*    */     //   92: castore
/*    */     //   93: sipush #22643
/*    */     //   96: iconst_4
/*    */     //   97: iconst_4
/*    */     //   98: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   104: aload_0
/*    */     //   105: getfield a : I
/*    */     //   108: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   111: ldc '嘪冴ڂ눕繊稟줊皂껁龀왉璉負䁪'
/*    */     //   113: invokevirtual toCharArray : ()[C
/*    */     //   116: dup
/*    */     //   117: dup
/*    */     //   118: bipush #10
/*    */     //   120: dup_x1
/*    */     //   121: caload
/*    */     //   122: sipush #27508
/*    */     //   125: ixor
/*    */     //   126: i2c
/*    */     //   127: castore
/*    */     //   128: sipush #4010
/*    */     //   131: iconst_4
/*    */     //   132: iconst_2
/*    */     //   133: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   139: iload_2
/*    */     //   140: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   143: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   146: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   149: athrow
/*    */     //   150: ldc2_w -6662010195701404918
/*    */     //   153: lload_3
/*    */     //   154: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   159: athrow
/*    */     //   160: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 8
/*    */     //   #2	-> 34
/*    */     //   #20	-> 160
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	21	24	java/lang/IndexOutOfBoundsException
/* 30 */     //   16	150	150	java/lang/IndexOutOfBoundsException } public Spliterator trySplit() { return a(); } public boolean tryAdvance(Object paramObject) { return tryAdvance((IntConsumer)paramObject); }
/*    */   protected int b() { return this.a + (a() - this.a) / 2; }
/*    */   public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); }
/*    */   public Spliterator.OfPrimitive trySplit() { return a(); } public long a(long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bf.e : J
/*    */     //   3: ldc2_w 81979983816449
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: lload_1
/*    */     //   9: lconst_0
/*    */     //   10: lcmp
/*    */     //   11: ifge -> 74
/*    */     //   14: new java/lang/IllegalArgumentException
/*    */     //   17: dup
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: ldc 'ꂊ퐚ڬ괰䕡蜗䨓覫̊㆗率䏋Ԥ驃졵୲駞鉾ᕺ℅핮㗹銐䂪괂ㄣࢾ呾'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #20
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #9182
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #24185
/*    */     //   45: iconst_5
/*    */     //   46: iconst_4
/*    */     //   47: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5080801955174682115
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: invokevirtual a : ()I
/*    */     //   78: istore #5
/*    */     //   80: aload_0
/*    */     //   81: getfield a : I
/*    */     //   84: iload #5
/*    */     //   86: if_icmplt -> 101
/*    */     //   89: lconst_0
/*    */     //   90: lreturn
/*    */     //   91: ldc2_w 5080801955174682115
/*    */     //   94: lload_3
/*    */     //   95: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   100: athrow
/*    */     //   101: iload #5
/*    */     //   103: aload_0
/*    */     //   104: getfield a : I
/*    */     //   107: isub
/*    */     //   108: istore #6
/*    */     //   110: lload_1
/*    */     //   111: iload #6
/*    */     //   113: i2l
/*    */     //   114: lcmp
/*    */     //   115: ifge -> 144
/*    */     //   118: aload_0
/*    */     //   119: aload_0
/*    */     //   120: getfield a : I
/*    */     //   123: i2l
/*    */     //   124: lload_1
/*    */     //   125: ladd
/*    */     //   126: invokestatic a : (J)I
/*    */     //   129: putfield a : I
/*    */     //   132: lload_1
/*    */     //   133: lreturn
/*    */     //   134: ldc2_w 5080801955174682115
/*    */     //   137: lload_3
/*    */     //   138: <illegal opcode> w : (Ljava/lang/IndexOutOfBoundsException;JJ)Ljava/lang/IndexOutOfBoundsException;
/*    */     //   143: athrow
/*    */     //   144: iload #6
/*    */     //   146: i2l
/*    */     //   147: lstore_1
/*    */     //   148: aload_0
/*    */     //   149: iload #5
/*    */     //   151: putfield a : I
/*    */     //   154: lload_1
/*    */     //   155: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 8
/*    */     //   #23	-> 74
/*    */     //   #16	-> 80
/*    */     //   #18	-> 101
/*    */     //   #37	-> 110
/*    */     //   #9	-> 118
/*    */     //   #24	-> 132
/*    */     //   #31	-> 144
/*    */     //   #32	-> 148
/*    */     //   #39	-> 154
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IndexOutOfBoundsException
/*    */     //   80	91	91	java/lang/IndexOutOfBoundsException
/* 33 */     //   110	134	134	java/lang/IndexOutOfBoundsException } public Spliterator.OfInt trySplit() { return a(); } public boolean tryAdvance(IntConsumer paramIntConsumer) { 
/* 34 */     try { if (this.a >= a()) return false;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/* 35 */      paramIntConsumer.accept(a(this.a++)); return true; } public long estimateSize() { return a() - this.a; } public void forEachRemaining(IntConsumer paramIntConsumer) {
/* 36 */     int i = a(); try { while (this.a < i)
/*    */       { paramIntConsumer.accept(a(this.a));
/* 38 */         this.a++; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw a(null); }
/*    */   
/*    */   }
/*    */   
/*    */   protected abstract int a(int paramInt);
/*    */   
/*    */   protected abstract int a();
/*    */   
/*    */   protected abstract fK a(int paramInt1, int paramInt2);
/*    */   
/*    */   private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
/*    */     return paramIndexOutOfBoundsException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */