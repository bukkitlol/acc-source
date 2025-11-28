/*    */ package me.konsolas.aac;
/*    */ public interface gj extends PrimitiveIterator { public static final long a = nc.a(3885437053699658994L, 1476019229155640436L, MethodHandles.lookup().lookupClass()).a(243626851748792L);
/*  3 */   default void forEachRemaining(Object paramObject) { a((kM)paramObject); }
/*    */   default int a(int paramInt) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/gj.a : J
/*    */     //   3: ldc2_w 49666732906211
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 71
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '?땟罩➆㲱ἦ?᫳鋾ꀋ龨⇟菇匎엫汥??抌內邵愹┟ꥂ㚈䆩攆'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: iconst_0
/*    */     //   31: dup_x1
/*    */     //   32: caload
/*    */     //   33: sipush #16673
/*    */     //   36: ixor
/*    */     //   37: i2c
/*    */     //   38: castore
/*    */     //   39: sipush #11301
/*    */     //   42: iconst_1
/*    */     //   43: iconst_0
/*    */     //   44: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   50: iload_1
/*    */     //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   54: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   57: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   60: athrow
/*    */     //   61: ldc2_w -5956641089303820554
/*    */     //   64: lload_2
/*    */     //   65: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   70: athrow
/*    */     //   71: iload_1
/*    */     //   72: istore #4
/*    */     //   74: iload #4
/*    */     //   76: iinc #4, -1
/*    */     //   79: ifeq -> 124
/*    */     //   82: aload_0
/*    */     //   83: invokeinterface hasNext : ()Z
/*    */     //   88: ifeq -> 124
/*    */     //   91: goto -> 104
/*    */     //   94: ldc2_w -5956641089303820554
/*    */     //   97: lload_2
/*    */     //   98: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   103: athrow
/*    */     //   104: aload_0
/*    */     //   105: invokeinterface a : ()C
/*    */     //   110: pop
/*    */     //   111: goto -> 74
/*    */     //   114: ldc2_w -5956641089303820554
/*    */     //   117: lload_2
/*    */     //   118: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   123: athrow
/*    */     //   124: iload_1
/*    */     //   125: iload #4
/*    */     //   127: isub
/*    */     //   128: iconst_1
/*    */     //   129: isub
/*    */     //   130: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 8
/*    */     //   #8	-> 71
/*    */     //   #12	-> 74
/*    */     //   #1	-> 124
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	61	61	java/lang/IllegalArgumentException
/*    */     //   74	91	94	java/lang/IllegalArgumentException
/*  4 */     //   82	114	114	java/lang/IllegalArgumentException } @Deprecated default Character a() { return Character.valueOf(a()); }
/*    */    @Deprecated
/*    */   default Object next() {
/*  7 */     return a();
/*    */   }
/*    */   
/* 10 */   default void a(kM paramkM) { Objects.requireNonNull(paramkM); try { while (hasNext())
/* 11 */         paramkM.a(a());  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */      }
/*    */   default void a(IntConsumer paramIntConsumer) { 
/* 14 */     try { Objects.requireNonNull(paramIntConsumer); Objects.requireNonNull(paramIntConsumer); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/* 15 */      a((paramIntConsumer instanceof kM) ? (kM)paramIntConsumer : paramIntConsumer::accept); } @Deprecated default void forEachRemaining(Consumer paramConsumer) { try { Objects.requireNonNull(paramConsumer); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  a((paramConsumer instanceof kM) ? (kM)paramConsumer : paramConsumer::accept); }
/*    */ 
/*    */   
/*    */   char a();
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */