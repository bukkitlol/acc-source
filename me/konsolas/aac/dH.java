/*  1 */ package me.konsolas.aac;enum dh { public static final dh OFF; public static final dh NORMAL; private static dh[] a() { return new dh[] { OFF, NORMAL, REDUCED }; } public static final dh REDUCED; private static final dh[] a; private static final long b; static { byte b1;
/*    */     long l;
/*  3 */     for (b = nc.a(5943097030601586356L, -717962983880857114L, MethodHandles.lookup().lookupClass()).a(142658876524231L), l = b ^ 0x57FA26CA4831L, "狡식污痀㺖曚礄湕࡭仚뫠㨁ቢ䟽༖蛮輲⬡ዑ".toCharArray()[1] = (char)("狡식污痀㺖曚礄湕࡭仚뫠㨁ቢ䟽༖蛮輲⬡ዑ".toCharArray()[1] ^ 0x509C), "魓폙胝ຫ".toCharArray()[2] = (char)("魓폙胝ຫ".toCharArray()[2] ^ 0x3ECA), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(hY$g6.H("狡식污痀㺖曚礄湕࡭仚뫠㨁ቢ䟽༖蛮輲⬡ዑ".toCharArray(), (short)24062, (byte)3, (byte)0))).init(2, SecretKeyFactory.getInstance(hY$g6.H("魓폙胝ຫ".toCharArray(), (short)19177, (byte)2, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[3]; boolean bool = false; "뚅쪲ຬ嵵⇨桬昘ऋ즥悕⯺쁗㿻䟸덍?ꑏ㲜?谥ռ摡䋎ꀯ凊夆".toCharArray()[0] = (char)("뚅쪲ຬ嵵⇨桬昘ऋ즥悕⯺쁗㿻䟸덍?ꑏ㲜?谥ռ摡䋎ꀯ凊夆".toCharArray()[0] ^ 0x5D21); String str; int i = (str = hY$g6.H("뚅쪲ຬ嵵⇨桬昘ऋ즥悕⯺쁗㿻䟸덍?ꑏ㲜?谥ռ摡䋎ꀯ凊夆".toCharArray(), (short)7251, (byte)1, (byte)0)).length(); byte b2 = 8; byte b = -1;
/*    */     while (true); }
/*    */ 
/*    */   
/*    */   boolean a(long paramLong, e6 parame6) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/dh.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w -1836319373677914511
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore #4
/*    */     //   17: getstatic me/konsolas/aac/mL.a : [I
/*    */     //   20: aload_0
/*    */     //   21: invokevirtual ordinal : ()I
/*    */     //   24: iaload
/*    */     //   25: iload #4
/*    */     //   27: ifeq -> 67
/*    */     //   30: tableswitch default -> 158, 1 -> 66, 2 -> 68, 3 -> 135
/*    */     //   56: ldc2_w -1868177399880787751
/*    */     //   59: lload_1
/*    */     //   60: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   65: athrow
/*    */     //   66: iconst_0
/*    */     //   67: ireturn
/*    */     //   68: aload_3
/*    */     //   69: getstatic me/konsolas/aac/e6.SUSPICIOUS : Lme/konsolas/aac/e6;
/*    */     //   72: lload_1
/*    */     //   73: lconst_0
/*    */     //   74: lcmp
/*    */     //   75: ifle -> 116
/*    */     //   78: iload #4
/*    */     //   80: ifeq -> 116
/*    */     //   83: if_acmpeq -> 119
/*    */     //   86: goto -> 99
/*    */     //   89: ldc2_w -1868177399880787751
/*    */     //   92: lload_1
/*    */     //   93: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   98: athrow
/*    */     //   99: aload_3
/*    */     //   100: getstatic me/konsolas/aac/e6.HIGH : Lme/konsolas/aac/e6;
/*    */     //   103: goto -> 116
/*    */     //   106: ldc2_w -1868177399880787751
/*    */     //   109: lload_1
/*    */     //   110: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   115: athrow
/*    */     //   116: if_acmpne -> 133
/*    */     //   119: iconst_1
/*    */     //   120: goto -> 134
/*    */     //   123: ldc2_w -1868177399880787751
/*    */     //   126: lload_1
/*    */     //   127: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   132: athrow
/*    */     //   133: iconst_0
/*    */     //   134: ireturn
/*    */     //   135: aload_3
/*    */     //   136: getstatic me/konsolas/aac/e6.HIGH : Lme/konsolas/aac/e6;
/*    */     //   139: if_acmpne -> 156
/*    */     //   142: iconst_1
/*    */     //   143: goto -> 157
/*    */     //   146: ldc2_w -1868177399880787751
/*    */     //   149: lload_1
/*    */     //   150: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   155: athrow
/*    */     //   156: iconst_0
/*    */     //   157: ireturn
/*    */     //   158: new java/lang/AssertionError
/*    */     //   161: dup
/*    */     //   162: invokespecial <init> : ()V
/*    */     //   165: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 17
/*    */     //   #8	-> 66
/*    */     //   #2	-> 68
/*    */     //   #9	-> 135
/*    */     //   #6	-> 158
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	56	56	aacinternal/v
/*    */     //   68	86	89	aacinternal/v
/*    */     //   83	103	106	aacinternal/v
/*    */     //   116	123	123	aacinternal/v
/*    */     //   135	146	146	aacinternal/v
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
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */