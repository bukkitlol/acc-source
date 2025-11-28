/*    */ package me.konsolas.aac;
/*    */ public final class g { public static final gZ a; public static final String n;
/*    */   public static final String e;
/*    */   public static final String i;
/*    */   public static final String d;
/*    */   public static final String h;
/*    */   public static final gZ m;
/*    */   public static final gZ l;
/*    */   public static final gZ f;
/*    */   
/* 11 */   public int hashCode() { int i = 17; i = 31 * i + this.j.hashCode();
/* 12 */     i = 31 * i + this.c.hashCode();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     return i; }
/*    */   public static final gZ b; public static final gZ g; public final gZ j; public final gZ c; final int k; private static final long o; private static final String[] p; private static final String[] q; private static final Map r; public String toString() { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/g.o : J
/*    */     //   3: ldc2_w 35057400806366
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: lload_1
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 129407566159726
/*    */     //   13: lxor
/*    */     //   14: lstore_3
/*    */     //   15: pop2
/*    */     //   16: sipush #18573
/*    */     //   19: ldc2_w 2954986606393014019
/*    */     //   22: lload_1
/*    */     //   23: lxor
/*    */     //   24: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   29: iconst_2
/*    */     //   30: anewarray java/lang/Object
/*    */     //   33: dup
/*    */     //   34: iconst_0
/*    */     //   35: aload_0
/*    */     //   36: getfield j : Lme/konsolas/aac/gZ;
/*    */     //   39: lload_3
/*    */     //   40: invokevirtual c : (J)Ljava/lang/String;
/*    */     //   43: aastore
/*    */     //   44: dup
/*    */     //   45: iconst_1
/*    */     //   46: aload_0
/*    */     //   47: getfield c : Lme/konsolas/aac/gZ;
/*    */     //   50: lload_3
/*    */     //   51: invokevirtual c : (J)Ljava/lang/String;
/*    */     //   54: aastore
/*    */     //   55: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   58: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/* 19 */     //   #9	-> 16 } public g(String paramString1, int paramInt1, int paramInt2, short paramShort, String paramString2) { this(gZ.a(paramString1, l2), gZ.a(paramString2, l2)); } public g(int paramInt1, byte paramByte, gZ paramgZ, String paramString, int paramInt2) { this(paramgZ, gZ.a(paramString, l2)); } public boolean equals(Object paramObject) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/g.o : J
/*    */     //   3: ldc2_w 127485036275210
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: ldc2_w -4755416153737307641
/*    */     //   11: lload_2
/*    */     //   12: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   17: astore #4
/*    */     //   19: aload_1
/*    */     //   20: instanceof me/konsolas/aac/g
/*    */     //   23: aload #4
/*    */     //   25: ifnull -> 136
/*    */     //   28: ifeq -> 135
/*    */     //   31: goto -> 44
/*    */     //   34: ldc2_w -4688618723348234582
/*    */     //   37: lload_2
/*    */     //   38: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   43: athrow
/*    */     //   44: aload_1
/*    */     //   45: checkcast me/konsolas/aac/g
/*    */     //   48: astore #5
/*    */     //   50: aload_0
/*    */     //   51: getfield j : Lme/konsolas/aac/gZ;
/*    */     //   54: aload #5
/*    */     //   56: getfield j : Lme/konsolas/aac/gZ;
/*    */     //   59: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   62: aload #4
/*    */     //   64: ifnull -> 108
/*    */     //   67: ifeq -> 133
/*    */     //   70: goto -> 83
/*    */     //   73: ldc2_w -4688618723348234582
/*    */     //   76: lload_2
/*    */     //   77: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield c : Lme/konsolas/aac/gZ;
/*    */     //   87: aload #5
/*    */     //   89: getfield c : Lme/konsolas/aac/gZ;
/*    */     //   92: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   95: goto -> 108
/*    */     //   98: ldc2_w -4688618723348234582
/*    */     //   101: lload_2
/*    */     //   102: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   107: athrow
/*    */     //   108: aload #4
/*    */     //   110: ifnull -> 130
/*    */     //   113: ifeq -> 133
/*    */     //   116: goto -> 129
/*    */     //   119: ldc2_w -4688618723348234582
/*    */     //   122: lload_2
/*    */     //   123: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   128: athrow
/*    */     //   129: iconst_1
/*    */     //   130: goto -> 134
/*    */     //   133: iconst_0
/*    */     //   134: ireturn
/*    */     //   135: iconst_0
/*    */     //   136: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 19
/*    */     //   #20	-> 44
/*    */     //   #10	-> 50
/*    */     //   #6	-> 92
/*    */     //   #16	-> 134
/*    */     //   #7	-> 135
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	31	34	aacinternal/v
/*    */     //   50	70	73	aacinternal/v
/*    */     //   67	95	98	aacinternal/v
/*    */     //   108	116	119	aacinternal/v }
/*    */   public g(gZ paramgZ1, gZ paramgZ2) { this.j = paramgZ1; this.c = paramgZ2;
/*    */     this.k = 32 + paramgZ1.a() + paramgZ2.a(); }
/*    */   static { byte b1;
/*    */     long l1, l2;
/* 24 */     for (o = nc.a(-7463417634611339620L, -868935705119999428L, MethodHandles.lookup().lookupClass()).a(146147419244471L), l1 = o ^ 0xF158A0BF0E9L, l2 = l1 ^ 0x7020EB65DD74L, r = new HashMap<>(13), "랂涝娰琞㯐Ŵ佑㉻㬹ዽ蜴엺믋☓挡⚾佚".toCharArray()[3] = (char)("랂涝娰琞㯐Ŵ佑㉻㬹ዽ蜴엺믋☓挡⚾佚".toCharArray()[3] ^ 0x573B), "쵎Ꮆ㈔䋞".toCharArray()[2] = (char)("쵎Ꮆ㈔䋞".toCharArray()[2] ^ 0xE58), (new byte[8])[0] = (byte)(int)(l1 >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l1 << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(fW$gy.A("랂涝娰琞㯐Ŵ佑㉻㬹ዽ蜴엺믋☓挡⚾佚".toCharArray(), (short)28979, false, 0))).init(2, SecretKeyFactory.getInstance(fW$gy.A("쵎Ꮆ㈔䋞".toCharArray(), (short)4526, true, 2)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[11]; boolean bool = false; "틑訮哻݃ꨙ勉鬣륊E繾斦ᰉꕐ텨⯓밌ꡭ㐥餮臨㻂࠘㗈鱁游ﰣꄞ援踲┓ຐﷷ됮滵䆵Ꙡ띂인鶸獷❕⌾踓 穧ᆚ닓㫥擛㳇᠓깮ᾥ㸒᜜ᶵ蟉䛜ທ俬໧谵Υ詼졷㐂唍?Α?𣏕?증펛巌ᗊꪷ曤尼풸཭쓯疆༏᷋⏛닎쏡밴濮ꌊ?ᡶꚼ\027਍몔괷⯀뀵勇ᦓ婭힩墄♢⫻墫包⻨ꥩ乳໘⻺輷䏟嗑鉘䜸⿆䀢鶵䐾썫熥冒幮뺽呄깚鄷캫쁀偍繚귨Ĭ돈ዒ蕝?᫅킞狁꒺㹐倹糥㠳᡻\"완醄繬?淧㵲ى窙截".toCharArray()[8] = (char)("틑訮哻݃ꨙ勉鬣륊E繾斦ᰉꕐ텨⯓밌ꡭ㐥餮臨㻂࠘㗈鱁游ﰣꄞ援踲┓ຐﷷ됮滵䆵Ꙡ띂인鶸獷❕⌾踓 穧ᆚ닓㫥擛㳇᠓깮ᾥ㸒᜜ᶵ蟉䛜ທ俬໧谵Υ詼졷㐂唍?Α?𣏕?증펛巌ᗊꪷ曤尼풸཭쓯疆༏᷋⏛닎쏡밴濮ꌊ?ᡶꚼ\027਍몔괷⯀뀵勇ᦓ婭힩墄♢⫻墫包⻨ꥩ乳໘⻺輷䏟嗑鉘䜸⿆䀢鶵䐾썫熥冒幮뺽呄깚鄷캫쁀偍繚귨Ĭ돈ዒ蕝?᫅킞狁꒺㹐倹糥㠳᡻\"완醄繬?淧㵲ى窙截".toCharArray()[8] ^ 0x7D75); String str; int i = (str = fW$gy.A("틑訮哻݃ꨙ勉鬣륊E繾斦ᰉꕐ텨⯓밌ꡭ㐥餮臨㻂࠘㗈鱁游ﰣꄞ援踲┓ຐﷷ됮滵䆵Ꙡ띂인鶸獷❕⌾踓 穧ᆚ닓㫥擛㳇᠓깮ᾥ㸒᜜ᶵ蟉䛜ທ俬໧谵Υ詼졷㐂唍?Α?𣏕?증펛巌ᗊꪷ曤尼풸཭쓯疆༏᷋⏛닎쏡밴濮ꌊ?ᡶꚼ\027਍몔괷⯀뀵勇ᦓ婭힩墄♢⫻墫包⻨ꥩ乳໘⻺輷䏟嗑鉘䜸⿆䀢鶵䐾썫熥冒幮뺽呄깚鄷캫쁀偍繚귨Ĭ돈ዒ蕝?᫅킞狁꒺㹐倹糥㠳᡻\"완醄繬?淧㵲ى窙截".toCharArray(), (short)24282, false, 5)).length(); byte b2 = 24; byte b = -1;
/*    */     while (true); }
/*    */ 
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
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   }
/*    */   
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1DE9;
/*    */     if (q[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])r.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "旬ﴇ樬㈐鞀䕱跮땳\f硖㝢ਧ牾惬왗绲霸֥䍲".toCharArray()[15] = (char)("旬ﴇ樬㈐鞀䕱跮땳\f硖㝢ਧ牾惬왗绲霸֥䍲".toCharArray()[15] ^ 0x197E);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("旬ﴇ樬㈐鞀䕱跮땳\f硖㝢ਧ牾惬왗绲霸֥䍲".toCharArray(), (short)24139, false, 3));
/*    */           "ꬽ⼳՗硅".toCharArray()[0] = (char)("ꬽ⼳՗硅".toCharArray()[0] ^ 0x1088);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("ꬽ⼳՗硅".toCharArray(), (short)11506, false, 1));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           r.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "河䵧崘⾲埱嶀?꺈猇௦靿曫罡䪃ؙΧ".toCharArray()[9] = (char)("河䵧崘⾲埱嶀?꺈猇௦靿曫罡䪃ؙΧ".toCharArray()[9] ^ 0x3341);
/*    */         throw new RuntimeException(fW$gy.A("河䵧崘⾲埱嶀?꺈猇௦靿曫罡䪃ؙΧ".toCharArray(), (short)17910, false, 2), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "炸䨟㗀묢ꆢ哙獘㯣ⳮ".toCharArray()[2] = (char)("炸䨟㗀묢ꆢ哙獘㯣ⳮ".toCharArray()[2] ^ 0x41F1);
/*    */       byte[] arrayOfByte2 = p[i].getBytes(fW$gy.A("炸䨟㗀묢ꆢ哙獘㯣ⳮ".toCharArray(), (short)905, false, 1));
/*    */       q[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return q[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 170
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '鶹໭︫༩㵕᫒ꎝܣ劖粌摗翝Ⲯጰ桹楫冕'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: iconst_0
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #15792
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #24624
/*    */     //   86: iconst_1
/*    */     //   87: iconst_1
/*    */     //   88: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w 'ꮡբ춤缲'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_2
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #3878
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #19832
/*    */     //   114: iconst_1
/*    */     //   115: iconst_0
/*    */     //   116: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w '㼃㹝഑'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_0
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #4395
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #32616
/*    */     //   146: iconst_0
/*    */     //   147: iconst_1
/*    */     //   148: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   154: aload_2
/*    */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   164: aload #4
/*    */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   169: athrow
/*    */     //   170: aload_3
/*    */     //   171: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */