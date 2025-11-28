/*    */ package me.konsolas.aac;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.util.Iterator;
/*    */ import java.util.Set;
/*    */ import java.util.Spliterator;
/*    */ 
/*    */ public interface hy extends jM, Set {
/*    */   default Iterator iterator() {
/*  9 */     return b();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final long w = nc.a(2829251975791372690L, -861586591749949340L, MethodHandles.lookup().lookupClass()).a(123588012384491L);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static hy a(Object paramObject1, Object paramObject2) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hy.w : J
/*    */     //   3: ldc2_w 91998737405833
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: new me/konsolas/aac/bq
/*    */     //   11: dup
/*    */     //   12: iconst_2
/*    */     //   13: invokespecial <init> : (I)V
/*    */     //   16: astore #4
/*    */     //   18: aload #4
/*    */     //   20: aload_0
/*    */     //   21: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   24: pop
/*    */     //   25: aload #4
/*    */     //   27: aload_1
/*    */     //   28: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   31: ifne -> 94
/*    */     //   34: new java/lang/IllegalArgumentException
/*    */     //   37: dup
/*    */     //   38: new java/lang/StringBuilder
/*    */     //   41: dup
/*    */     //   42: invokespecial <init> : ()V
/*    */     //   45: ldc '㹻㓝햩⁖셝攄煥뤲鯞䂾紤⚾휼歑売韖祋'
/*    */     //   47: invokevirtual toCharArray : ()[C
/*    */     //   50: dup
/*    */     //   51: dup
/*    */     //   52: bipush #8
/*    */     //   54: dup_x1
/*    */     //   55: caload
/*    */     //   56: sipush #2663
/*    */     //   59: ixor
/*    */     //   60: i2c
/*    */     //   61: castore
/*    */     //   62: sipush #22837
/*    */     //   65: iconst_1
/*    */     //   66: iconst_5
/*    */     //   67: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   73: aload_1
/*    */     //   74: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   77: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   80: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   83: athrow
/*    */     //   84: ldc2_w 4655969137937397004
/*    */     //   87: lload_2
/*    */     //   88: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   93: athrow
/*    */     //   94: aload #4
/*    */     //   96: invokestatic b : (Lme/konsolas/aac/hy;)Lme/konsolas/aac/hy;
/*    */     //   99: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #3	-> 8
/*    */     //   #1	-> 18
/*    */     //   #32	-> 25
/*    */     //   #30	-> 34
/*    */     //   #19	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	84	84	java/lang/IllegalArgumentException
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default ae a() {
/* 31 */     return dK.a(b(), jC.a(this), 65);
/*    */   }
/*    */   
/*    */   static hy a(Object paramObject1, Object paramObject2, Object paramObject3) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hy.w : J
/*    */     //   3: ldc2_w 57388035466176
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: new me/konsolas/aac/bq
/*    */     //   11: dup
/*    */     //   12: iconst_3
/*    */     //   13: invokespecial <init> : (I)V
/*    */     //   16: astore #5
/*    */     //   18: aload #5
/*    */     //   20: aload_0
/*    */     //   21: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   24: pop
/*    */     //   25: aload #5
/*    */     //   27: aload_1
/*    */     //   28: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   31: ifne -> 94
/*    */     //   34: new java/lang/IllegalArgumentException
/*    */     //   37: dup
/*    */     //   38: new java/lang/StringBuilder
/*    */     //   41: dup
/*    */     //   42: invokespecial <init> : ()V
/*    */     //   45: ldc '?ᾦ뷜傚쿅褠勉➌֬İꈔ鹤멖䥇鹐㔅徶␙'
/*    */     //   47: invokevirtual toCharArray : ()[C
/*    */     //   50: dup
/*    */     //   51: dup
/*    */     //   52: bipush #17
/*    */     //   54: dup_x1
/*    */     //   55: caload
/*    */     //   56: sipush #5974
/*    */     //   59: ixor
/*    */     //   60: i2c
/*    */     //   61: castore
/*    */     //   62: sipush #19752
/*    */     //   65: iconst_1
/*    */     //   66: iconst_1
/*    */     //   67: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   73: aload_1
/*    */     //   74: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   77: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   80: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   83: athrow
/*    */     //   84: ldc2_w -5416646320937549499
/*    */     //   87: lload_3
/*    */     //   88: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   93: athrow
/*    */     //   94: aload #5
/*    */     //   96: aload_2
/*    */     //   97: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   100: ifne -> 163
/*    */     //   103: new java/lang/IllegalArgumentException
/*    */     //   106: dup
/*    */     //   107: new java/lang/StringBuilder
/*    */     //   110: dup
/*    */     //   111: invokespecial <init> : ()V
/*    */     //   114: ldc '鵡吝왟ᒹ琊鑑ꝿ䈎犥옍㦒듦帣뤡췬鞒⍑柸'
/*    */     //   116: invokevirtual toCharArray : ()[C
/*    */     //   119: dup
/*    */     //   120: dup
/*    */     //   121: bipush #7
/*    */     //   123: dup_x1
/*    */     //   124: caload
/*    */     //   125: sipush #18108
/*    */     //   128: ixor
/*    */     //   129: i2c
/*    */     //   130: castore
/*    */     //   131: sipush #2117
/*    */     //   134: iconst_1
/*    */     //   135: iconst_1
/*    */     //   136: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   142: aload_2
/*    */     //   143: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   146: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   149: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   152: athrow
/*    */     //   153: ldc2_w -5416646320937549499
/*    */     //   156: lload_3
/*    */     //   157: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   162: athrow
/*    */     //   163: aload #5
/*    */     //   165: invokestatic b : (Lme/konsolas/aac/hy;)Lme/konsolas/aac/hy;
/*    */     //   168: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 8
/*    */     //   #29	-> 18
/*    */     //   #18	-> 25
/*    */     //   #11	-> 34
/*    */     //   #26	-> 94
/*    */     //   #8	-> 103
/*    */     //   #10	-> 163
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	84	84	java/lang/IllegalArgumentException
/*    */     //   94	153	153	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   static hy c() {
/*    */     return e9.a;
/*    */   }
/*    */   
/*    */   static hy a(Object paramObject) {
/*    */     return e9.a(paramObject);
/*    */   }
/*    */   
/*    */   @SafeVarargs
/*    */   static hy a(Object[] paramArrayOfObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hy.w : J
/*    */     //   3: ldc2_w 66540158673593
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: aload_0
/*    */     //   9: arraylength
/*    */     //   10: tableswitch default -> 84, 0 -> 40, 1 -> 54, 2 -> 61, 3 -> 71
/*    */     //   40: invokestatic c : ()Lme/konsolas/aac/hy;
/*    */     //   43: areturn
/*    */     //   44: ldc2_w 3867814087411220540
/*    */     //   47: lload_1
/*    */     //   48: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   53: athrow
/*    */     //   54: aload_0
/*    */     //   55: iconst_0
/*    */     //   56: aaload
/*    */     //   57: invokestatic a : (Ljava/lang/Object;)Lme/konsolas/aac/hy;
/*    */     //   60: areturn
/*    */     //   61: aload_0
/*    */     //   62: iconst_0
/*    */     //   63: aaload
/*    */     //   64: aload_0
/*    */     //   65: iconst_1
/*    */     //   66: aaload
/*    */     //   67: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Lme/konsolas/aac/hy;
/*    */     //   70: areturn
/*    */     //   71: aload_0
/*    */     //   72: iconst_0
/*    */     //   73: aaload
/*    */     //   74: aload_0
/*    */     //   75: iconst_1
/*    */     //   76: aaload
/*    */     //   77: aload_0
/*    */     //   78: iconst_2
/*    */     //   79: aaload
/*    */     //   80: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lme/konsolas/aac/hy;
/*    */     //   83: areturn
/*    */     //   84: aload_0
/*    */     //   85: arraylength
/*    */     //   86: iconst_4
/*    */     //   87: if_icmpgt -> 112
/*    */     //   90: new me/konsolas/aac/bq
/*    */     //   93: dup
/*    */     //   94: aload_0
/*    */     //   95: arraylength
/*    */     //   96: invokespecial <init> : (I)V
/*    */     //   99: goto -> 122
/*    */     //   102: ldc2_w 3867814087411220540
/*    */     //   105: lload_1
/*    */     //   106: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   111: athrow
/*    */     //   112: new me/konsolas/aac/bM
/*    */     //   115: dup
/*    */     //   116: aload_0
/*    */     //   117: arraylength
/*    */     //   118: fconst_1
/*    */     //   119: invokespecial <init> : (IF)V
/*    */     //   122: astore_3
/*    */     //   123: aload_0
/*    */     //   124: astore #4
/*    */     //   126: aload #4
/*    */     //   128: arraylength
/*    */     //   129: istore #5
/*    */     //   131: iconst_0
/*    */     //   132: istore #6
/*    */     //   134: iload #6
/*    */     //   136: iload #5
/*    */     //   138: if_icmpge -> 226
/*    */     //   141: aload #4
/*    */     //   143: iload #6
/*    */     //   145: aaload
/*    */     //   146: astore #7
/*    */     //   148: aload_3
/*    */     //   149: aload #7
/*    */     //   151: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   156: ifne -> 220
/*    */     //   159: new java/lang/IllegalArgumentException
/*    */     //   162: dup
/*    */     //   163: new java/lang/StringBuilder
/*    */     //   166: dup
/*    */     //   167: invokespecial <init> : ()V
/*    */     //   170: ldc '㕬杂왧煌䡐週㊔祌퀯⯢ㄯ詏㒫셔醂娊Á抉'
/*    */     //   172: invokevirtual toCharArray : ()[C
/*    */     //   175: dup
/*    */     //   176: dup
/*    */     //   177: bipush #12
/*    */     //   179: dup_x1
/*    */     //   180: caload
/*    */     //   181: sipush #233
/*    */     //   184: ixor
/*    */     //   185: i2c
/*    */     //   186: castore
/*    */     //   187: sipush #13907
/*    */     //   190: iconst_0
/*    */     //   191: iconst_1
/*    */     //   192: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   198: aload #7
/*    */     //   200: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   203: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   206: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   209: athrow
/*    */     //   210: ldc2_w 3867814087411220540
/*    */     //   213: lload_1
/*    */     //   214: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   219: athrow
/*    */     //   220: iinc #6, 1
/*    */     //   223: goto -> 134
/*    */     //   226: aload_3
/*    */     //   227: invokestatic b : (Lme/konsolas/aac/hy;)Lme/konsolas/aac/hy;
/*    */     //   230: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 8
/*    */     //   #24	-> 40
/*    */     //   #15	-> 54
/*    */     //   #14	-> 61
/*    */     //   #23	-> 71
/*    */     //   #20	-> 84
/*    */     //   #25	-> 90
/*    */     //   #5	-> 112
/*    */     //   #7	-> 123
/*    */     //   #27	-> 148
/*    */     //   #13	-> 159
/*    */     //   #2	-> 220
/*    */     //   #4	-> 226
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	44	44	java/lang/IllegalArgumentException
/*    */     //   84	102	102	java/lang/IllegalArgumentException
/*    */     //   148	210	210	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   default Spliterator spliterator() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   ea b();
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */