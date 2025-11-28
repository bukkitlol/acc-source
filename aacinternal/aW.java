/*    */ package aacinternal;public abstract class aw implements c { public aa a(long paramLong) {
/*  2 */     long l = paramLong ^ 0x6E4D34E0A7EEL; return a(l);
/*    */   }
/*    */ 
/*    */   
/*    */   private static aN[] b;
/*    */   
/*    */   private static final long k;
/*    */   private static final String r;
/*    */   
/*    */   public int hashCode() {
/* 12 */     long l1 = k ^ 0x7477033C16A1L, l2 = l1 ^ 0x56A416160FCBL; return 31 * (31 + az.a(a(l2))) + az.a(a());
/*    */   } public String toString() {
/* 14 */     long l1 = k ^ 0x554726AEF3A0L, l2 = l1 ^ 0x77943384EACAL; return String.format(r, new Object[] { getClass().getSimpleName(), Double.valueOf(a(l2)), Long.valueOf(a()) });
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/aw.k : J
/*    */     //   3: ldc2_w 138158901565033
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 104954864471811
/*    */     //   13: lxor
/*    */     //   14: lstore #4
/*    */     //   16: dup2
/*    */     //   17: ldc2_w 8122385054901
/*    */     //   20: lxor
/*    */     //   21: lstore #6
/*    */     //   23: dup2
/*    */     //   24: ldc2_w 76022962891078
/*    */     //   27: lxor
/*    */     //   28: dup2
/*    */     //   29: bipush #48
/*    */     //   31: lushr
/*    */     //   32: l2i
/*    */     //   33: istore #8
/*    */     //   35: dup2
/*    */     //   36: bipush #16
/*    */     //   38: lshl
/*    */     //   39: bipush #32
/*    */     //   41: lushr
/*    */     //   42: l2i
/*    */     //   43: istore #9
/*    */     //   45: dup2
/*    */     //   46: bipush #48
/*    */     //   48: lshl
/*    */     //   49: bipush #48
/*    */     //   51: lushr
/*    */     //   52: l2i
/*    */     //   53: istore #10
/*    */     //   55: pop2
/*    */     //   56: dup2
/*    */     //   57: ldc2_w 104954864471811
/*    */     //   60: lxor
/*    */     //   61: lstore #11
/*    */     //   63: pop2
/*    */     //   64: ldc2_w -9206433115015626620
/*    */     //   67: lload_2
/*    */     //   68: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   73: astore #13
/*    */     //   75: aload_1
/*    */     //   76: aload #13
/*    */     //   78: ifnull -> 111
/*    */     //   81: aload_0
/*    */     //   82: if_acmpne -> 110
/*    */     //   85: goto -> 98
/*    */     //   88: ldc2_w -9195226568884055836
/*    */     //   91: lload_2
/*    */     //   92: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   97: athrow
/*    */     //   98: iconst_1
/*    */     //   99: ireturn
/*    */     //   100: ldc2_w -9195226568884055836
/*    */     //   103: lload_2
/*    */     //   104: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   109: athrow
/*    */     //   110: aload_1
/*    */     //   111: aload #13
/*    */     //   113: ifnull -> 133
/*    */     //   116: ifnull -> 161
/*    */     //   119: goto -> 132
/*    */     //   122: ldc2_w -9195226568884055836
/*    */     //   125: lload_2
/*    */     //   126: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   131: athrow
/*    */     //   132: aload_1
/*    */     //   133: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   136: aload #13
/*    */     //   138: ifnull -> 174
/*    */     //   141: aload_0
/*    */     //   142: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   145: if_acmpeq -> 173
/*    */     //   148: goto -> 161
/*    */     //   151: ldc2_w -9195226568884055836
/*    */     //   154: lload_2
/*    */     //   155: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   160: athrow
/*    */     //   161: iconst_0
/*    */     //   162: ireturn
/*    */     //   163: ldc2_w -9195226568884055836
/*    */     //   166: lload_2
/*    */     //   167: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   172: athrow
/*    */     //   173: aload_1
/*    */     //   174: checkcast aacinternal/c
/*    */     //   177: astore #14
/*    */     //   179: aload #14
/*    */     //   181: lload #11
/*    */     //   183: invokeinterface a : (J)D
/*    */     //   188: lload #6
/*    */     //   190: dup2_x2
/*    */     //   191: pop2
/*    */     //   192: aload_0
/*    */     //   193: lload #4
/*    */     //   195: invokevirtual a : (J)D
/*    */     //   198: invokestatic b : (JDD)Z
/*    */     //   201: aload #13
/*    */     //   203: ifnull -> 261
/*    */     //   206: ifeq -> 286
/*    */     //   209: goto -> 222
/*    */     //   212: ldc2_w -9195226568884055836
/*    */     //   215: lload_2
/*    */     //   216: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   221: athrow
/*    */     //   222: aload #14
/*    */     //   224: invokeinterface a : ()J
/*    */     //   229: l2f
/*    */     //   230: aload_0
/*    */     //   231: invokevirtual a : ()J
/*    */     //   234: l2f
/*    */     //   235: iload #8
/*    */     //   237: i2c
/*    */     //   238: swap
/*    */     //   239: iload #9
/*    */     //   241: swap
/*    */     //   242: iload #10
/*    */     //   244: i2c
/*    */     //   245: invokestatic a : (FCIFC)Z
/*    */     //   248: goto -> 261
/*    */     //   251: ldc2_w -9195226568884055836
/*    */     //   254: lload_2
/*    */     //   255: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   260: athrow
/*    */     //   261: aload #13
/*    */     //   263: ifnull -> 283
/*    */     //   266: ifeq -> 286
/*    */     //   269: goto -> 282
/*    */     //   272: ldc2_w -9195226568884055836
/*    */     //   275: lload_2
/*    */     //   276: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   281: athrow
/*    */     //   282: iconst_1
/*    */     //   283: goto -> 287
/*    */     //   286: iconst_0
/*    */     //   287: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 75
/*    */     //   #7	-> 98
/*    */     //   #16	-> 110
/*    */     //   #10	-> 161
/*    */     //   #15	-> 173
/*    */     //   #4	-> 179
/*    */     //   #11	-> 224
/*    */     //   #6	-> 287
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   75	85	88	aacinternal/v
/*    */     //   81	100	100	aacinternal/v
/*    */     //   111	119	122	aacinternal/v
/*    */     //   133	148	151	aacinternal/v
/*    */     //   141	163	163	aacinternal/v
/*    */     //   179	209	212	aacinternal/v
/*    */     //   206	248	251	aacinternal/v
/*    */     //   261	269	272	aacinternal/v
/*    */   }
/*    */   
/*    */   public abstract c a(long paramLong);
/*    */   
/*    */   public abstract void a(long paramLong);
/*    */   
/*    */   public abstract double a(long paramLong);
/*    */   
/*    */   public abstract void a(double paramDouble, long paramLong);
/*    */   
/*    */   public static void b(aN[] paramArrayOfaN) {
/*    */     b = paramArrayOfaN;
/*    */   }
/*    */   
/*    */   public static aN[] b() {
/*    */     return b;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -3083064871446017104
/*    */     //   3: ldc2_w 2381244866685463206
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 216207569981348
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic aacinternal/aw.k : J
/*    */     //   26: getstatic aacinternal/aw.k : J
/*    */     //   29: ldc2_w 105929502238847
/*    */     //   32: lxor
/*    */     //   33: lstore_3
/*    */     //   34: ldc2_w -4743926291659227502
/*    */     //   37: lload_3
/*    */     //   38: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   43: ifnonnull -> 59
/*    */     //   46: iconst_4
/*    */     //   47: anewarray me/konsolas/aac/aN
/*    */     //   50: ldc2_w -4637532218195180533
/*    */     //   53: lload_3
/*    */     //   54: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   59: ldc 'ད⩨?퉔圢굢禅僅耓᷍⺃厭厉?尸픬좪琞'
/*    */     //   61: invokevirtual toCharArray : ()[C
/*    */     //   64: dup
/*    */     //   65: dup
/*    */     //   66: bipush #16
/*    */     //   68: dup_x1
/*    */     //   69: caload
/*    */     //   70: sipush #20800
/*    */     //   73: ixor
/*    */     //   74: i2c
/*    */     //   75: castore
/*    */     //   76: sipush #25771
/*    */     //   79: iconst_1
/*    */     //   80: iconst_0
/*    */     //   81: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   84: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*    */     //   87: dup
/*    */     //   88: astore_0
/*    */     //   89: iconst_2
/*    */     //   90: ldc '䡜樭掬ᨢ'
/*    */     //   92: invokevirtual toCharArray : ()[C
/*    */     //   95: dup
/*    */     //   96: dup
/*    */     //   97: iconst_1
/*    */     //   98: dup_x1
/*    */     //   99: caload
/*    */     //   100: sipush #25469
/*    */     //   103: ixor
/*    */     //   104: i2c
/*    */     //   105: castore
/*    */     //   106: sipush #8861
/*    */     //   109: iconst_1
/*    */     //   110: iconst_1
/*    */     //   111: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   114: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*    */     //   117: bipush #8
/*    */     //   119: newarray byte
/*    */     //   121: dup
/*    */     //   122: iconst_0
/*    */     //   123: lload_3
/*    */     //   124: bipush #56
/*    */     //   126: lushr
/*    */     //   127: l2i
/*    */     //   128: i2b
/*    */     //   129: bastore
/*    */     //   130: iconst_1
/*    */     //   131: istore_1
/*    */     //   132: iload_1
/*    */     //   133: bipush #8
/*    */     //   135: if_icmpge -> 158
/*    */     //   138: dup
/*    */     //   139: iload_1
/*    */     //   140: lload_3
/*    */     //   141: iload_1
/*    */     //   142: bipush #8
/*    */     //   144: imul
/*    */     //   145: lshl
/*    */     //   146: bipush #56
/*    */     //   148: lushr
/*    */     //   149: l2i
/*    */     //   150: i2b
/*    */     //   151: bastore
/*    */     //   152: iinc #1, 1
/*    */     //   155: goto -> 132
/*    */     //   158: new javax/crypto/spec/DESKeySpec
/*    */     //   161: dup_x1
/*    */     //   162: swap
/*    */     //   163: invokespecial <init> : ([B)V
/*    */     //   166: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*    */     //   169: new javax/crypto/spec/IvParameterSpec
/*    */     //   172: dup
/*    */     //   173: bipush #8
/*    */     //   175: newarray byte
/*    */     //   177: invokespecial <init> : ([B)V
/*    */     //   180: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*    */     //   183: ldc '쐺㕷嘻䜕??튨顗쑮嚉須뙠⮒阩脟衄뀌궑复䎖矘ฏ䳢'
/*    */     //   185: invokevirtual toCharArray : ()[C
/*    */     //   188: dup
/*    */     //   189: dup
/*    */     //   190: bipush #13
/*    */     //   192: dup_x1
/*    */     //   193: caload
/*    */     //   194: sipush #22795
/*    */     //   197: ixor
/*    */     //   198: i2c
/*    */     //   199: castore
/*    */     //   200: sipush #12933
/*    */     //   203: iconst_1
/*    */     //   204: iconst_0
/*    */     //   205: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   208: iconst_m1
/*    */     //   209: goto -> 218
/*    */     //   212: putstatic aacinternal/aw.r : Ljava/lang/String;
/*    */     //   215: goto -> 265
/*    */     //   218: swap
/*    */     //   219: ldc 'ߴ홺䃉㨳띚ᜊ꒻굿꨾槪'
/*    */     //   221: invokevirtual toCharArray : ()[C
/*    */     //   224: dup
/*    */     //   225: dup
/*    */     //   226: bipush #8
/*    */     //   228: dup_x1
/*    */     //   229: caload
/*    */     //   230: sipush #8139
/*    */     //   233: ixor
/*    */     //   234: i2c
/*    */     //   235: castore
/*    */     //   236: sipush #7569
/*    */     //   239: iconst_0
/*    */     //   240: iconst_1
/*    */     //   241: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   244: invokevirtual getBytes : (Ljava/lang/String;)[B
/*    */     //   247: aload_0
/*    */     //   248: swap
/*    */     //   249: invokevirtual doFinal : ([B)[B
/*    */     //   252: astore_2
/*    */     //   253: aload_2
/*    */     //   254: invokestatic a : ([B)Ljava/lang/String;
/*    */     //   257: invokevirtual intern : ()Ljava/lang/String;
/*    */     //   260: swap
/*    */     //   261: pop
/*    */     //   262: goto -> 212
/*    */     //   265: return
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c1 = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c1 = (char)(c1 | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c1;
/*    */       } else if (b2 < i - 2) {
/*    */         char c1 = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c1 = (char)(c1 | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c1 = (char)(c1 | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c1;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */