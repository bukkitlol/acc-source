/*    */ package me.konsolas.aac;
/*    */ import java.util.NoSuchElementException;
/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ final class h implements ea, Consumer {
/*    */   private final ae a;
/*    */   
/*    */   public void accept(Object paramObject) {
/*  9 */     this.b = paramObject;
/*    */   }
/*    */   
/*    */   public boolean hasNext()
/*    */   {
/*    */     
/* 15 */     try { if (this.c) return true;  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */      boolean bool = this.a.tryAdvance(this); 
/* 17 */     try { if (!bool) return false;  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
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
/* 31 */     this.c = true; return true; } public void forEachRemaining(Consumer<Object> paramConsumer) { try { if (this.c) { this.c = false; paramConsumer.accept(this.b); }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/* 32 */      this.a.forEachRemaining((Consumer)paramConsumer); }
/*    */ 
/*    */   
/*    */   public Object next() {
/*    */     try {
/*    */       if (this.c) {
/*    */         this.c = false;
/*    */         return this.b;
/*    */       } 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     boolean bool = this.a.tryAdvance(this);
/*    */     try {
/*    */       if (!bool)
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   private Object b = null;
/*    */   private boolean c;
/*    */   private static final long d = nc.a(-8161607995525626010L, 760098765608557246L, MethodHandles.lookup().lookupClass()).a(277157477837464L);
/*    */   
/*    */   h(ae paramae) {
/*    */     this.c = false;
/*    */     this.a = paramae;
/*    */   }
/*    */   
/*    */   public int b(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/h.d : J
/*    */     //   3: ldc2_w 38970762498555
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: iload_1
/*    */     //   9: ifge -> 72
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: ldc '諿鷄픞礮얚謇魡岧㑡잠뛈⡦딩ꜹ羽垜螖榝锁觚ᛔﱜ랷眵⹔ሒ䫌扯ᖛጚ⾈'
/*    */     //   25: invokevirtual toCharArray : ()[C
/*    */     //   28: dup
/*    */     //   29: dup
/*    */     //   30: bipush #20
/*    */     //   32: dup_x1
/*    */     //   33: caload
/*    */     //   34: sipush #17240
/*    */     //   37: ixor
/*    */     //   38: i2c
/*    */     //   39: castore
/*    */     //   40: sipush #13005
/*    */     //   43: iconst_0
/*    */     //   44: iconst_1
/*    */     //   45: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: iload_1
/*    */     //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   55: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   58: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   61: athrow
/*    */     //   62: ldc2_w 6690611095578681439
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   71: athrow
/*    */     //   72: iconst_0
/*    */     //   73: istore #4
/*    */     //   75: aload_0
/*    */     //   76: getfield c : Z
/*    */     //   79: ifeq -> 117
/*    */     //   82: aload_0
/*    */     //   83: iconst_0
/*    */     //   84: putfield c : Z
/*    */     //   87: aload_0
/*    */     //   88: getfield a : Lme/konsolas/aac/ae;
/*    */     //   91: lconst_1
/*    */     //   92: invokeinterface a : (J)J
/*    */     //   97: pop2
/*    */     //   98: iinc #4, 1
/*    */     //   101: iinc #1, -1
/*    */     //   104: goto -> 117
/*    */     //   107: ldc2_w 6690611095578681439
/*    */     //   110: lload_2
/*    */     //   111: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*    */     //   116: athrow
/*    */     //   117: iload_1
/*    */     //   118: ifle -> 140
/*    */     //   121: iload #4
/*    */     //   123: aload_0
/*    */     //   124: getfield a : Lme/konsolas/aac/ae;
/*    */     //   127: iload_1
/*    */     //   128: i2l
/*    */     //   129: invokeinterface a : (J)J
/*    */     //   134: invokestatic a : (J)I
/*    */     //   137: iadd
/*    */     //   138: istore #4
/*    */     //   140: iload #4
/*    */     //   142: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 8
/*    */     //   #21	-> 72
/*    */     //   #33	-> 75
/*    */     //   #24	-> 82
/*    */     //   #13	-> 87
/*    */     //   #23	-> 98
/*    */     //   #6	-> 101
/*    */     //   #27	-> 117
/*    */     //   #14	-> 121
/*    */     //   #16	-> 140
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	62	62	java/util/NoSuchElementException
/*    */     //   75	104	107	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */