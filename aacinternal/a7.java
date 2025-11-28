/*   */ package aacinternal;
/*   */ 
/*   */ public enum a7 {
/*   */   public static final a7 MINIMAL;
/*   */   public static final a7 MAXIMAL;
/*   */   public static final a7 REMOVED;
/*   */   public static final a7 FIXED;
/*   */   public static final a7 FAILED;
/*   */   private static String[] b;
/*   */   
/*   */   private static String a(byte[] paramArrayOfbyte) {
/*   */     byte b1 = 0;
/*   */     int i;
/*   */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*   */     for (byte b2 = 0; b2 < i; b2++) {
/*   */       int j;
/*   */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*   */         arrayOfChar[b1++] = (char)j;
/*   */       } else if (j < 224) {
/*   */         char c = (char)((char)(j & 0x1F) << 6);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } else if (b2 < i - 2) {
/*   */         char c = (char)((char)(j & 0xF) << 12);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F) << 6);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } 
/*   */     } 
/*   */     return new String(arrayOfChar, 0, b1);
/*   */   }
/*   */   
/*   */   public static String[] b() {
/*   */     return b;
/*   */   }
/*   */   
/*   */   public static void b(String[] paramArrayOfString) {
/*   */     b = paramArrayOfString;
/*   */   }
/*   */   
/*   */   static {
/*   */     // Byte code:
/*   */     //   0: ldc2_w 6364475259623418148
/*   */     //   3: ldc2_w -5269215997040505988
/*   */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*   */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*   */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*   */     //   15: ldc2_w 97867928811459
/*   */     //   18: invokeinterface a : (J)J
/*   */     //   23: ldc2_w 61987352005148
/*   */     //   26: lxor
/*   */     //   27: lstore #10
/*   */     //   29: ldc2_w 264384933158768204
/*   */     //   32: lload #10
/*   */     //   34: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*   */     //   39: ifnonnull -> 56
/*   */     //   42: iconst_1
/*   */     //   43: anewarray java/lang/String
/*   */     //   46: ldc2_w 153779435963665380
/*   */     //   49: lload #10
/*   */     //   51: <illegal opcode> w : ([Ljava/lang/String;JJ)V
/*   */     //   56: ldc '苏⛐㈤鋇閦뻟綌䛐誉Ꮹ⚦뾐杽떫Ỵ䭧'
/*   */     //   58: invokevirtual toCharArray : ()[C
/*   */     //   61: dup
/*   */     //   62: dup
/*   */     //   63: bipush #19
/*   */     //   65: dup_x1
/*   */     //   66: caload
/*   */     //   67: sipush #30790
/*   */     //   70: ixor
/*   */     //   71: i2c
/*   */     //   72: castore
/*   */     //   73: sipush #2137
/*   */     //   76: iconst_1
/*   */     //   77: iconst_1
/*   */     //   78: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   81: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*   */     //   84: dup
/*   */     //   85: astore_1
/*   */     //   86: iconst_2
/*   */     //   87: ldc '퇛ﵱ탠ĺ'
/*   */     //   89: invokevirtual toCharArray : ()[C
/*   */     //   92: dup
/*   */     //   93: dup
/*   */     //   94: iconst_0
/*   */     //   95: dup_x1
/*   */     //   96: caload
/*   */     //   97: sipush #429
/*   */     //   100: ixor
/*   */     //   101: i2c
/*   */     //   102: castore
/*   */     //   103: sipush #24646
/*   */     //   106: iconst_1
/*   */     //   107: iconst_1
/*   */     //   108: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   111: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*   */     //   114: bipush #8
/*   */     //   116: newarray byte
/*   */     //   118: dup
/*   */     //   119: iconst_0
/*   */     //   120: lload #10
/*   */     //   122: bipush #56
/*   */     //   124: lushr
/*   */     //   125: l2i
/*   */     //   126: i2b
/*   */     //   127: bastore
/*   */     //   128: iconst_1
/*   */     //   129: istore_2
/*   */     //   130: iload_2
/*   */     //   131: bipush #8
/*   */     //   133: if_icmpge -> 157
/*   */     //   136: dup
/*   */     //   137: iload_2
/*   */     //   138: lload #10
/*   */     //   140: iload_2
/*   */     //   141: bipush #8
/*   */     //   143: imul
/*   */     //   144: lshl
/*   */     //   145: bipush #56
/*   */     //   147: lushr
/*   */     //   148: l2i
/*   */     //   149: i2b
/*   */     //   150: bastore
/*   */     //   151: iinc #2, 1
/*   */     //   154: goto -> 130
/*   */     //   157: new javax/crypto/spec/DESKeySpec
/*   */     //   160: dup_x1
/*   */     //   161: swap
/*   */     //   162: invokespecial <init> : ([B)V
/*   */     //   165: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*   */     //   168: new javax/crypto/spec/IvParameterSpec
/*   */     //   171: dup
/*   */     //   172: bipush #8
/*   */     //   174: newarray byte
/*   */     //   176: invokespecial <init> : ([B)V
/*   */     //   179: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*   */     //   182: iconst_5
/*   */     //   183: anewarray java/lang/String
/*   */     //   186: astore #8
/*   */     //   188: iconst_0
/*   */     //   189: istore #6
/*   */     //   191: ldc 'Ꝝ⋽晢挄㱸ꅥ셬⫥좗༏掆䲴㗍姭拼佟쟦痆?ꁬ呪킘够樆擅'
/*   */     //   193: invokevirtual toCharArray : ()[C
/*   */     //   196: dup
/*   */     //   197: dup
/*   */     //   198: bipush #11
/*   */     //   200: dup_x1
/*   */     //   201: caload
/*   */     //   202: sipush #26320
/*   */     //   205: ixor
/*   */     //   206: i2c
/*   */     //   207: castore
/*   */     //   208: sipush #14685
/*   */     //   211: iconst_1
/*   */     //   212: iconst_0
/*   */     //   213: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   216: dup
/*   */     //   217: astore #5
/*   */     //   219: invokevirtual length : ()I
/*   */     //   222: istore #7
/*   */     //   224: bipush #8
/*   */     //   226: istore #4
/*   */     //   228: iconst_m1
/*   */     //   229: istore_3
/*   */     //   230: iinc #3, 1
/*   */     //   233: aload #5
/*   */     //   235: iload_3
/*   */     //   236: dup
/*   */     //   237: iload #4
/*   */     //   239: iadd
/*   */     //   240: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   243: iconst_m1
/*   */     //   244: goto -> 373
/*   */     //   247: aload #8
/*   */     //   249: swap
/*   */     //   250: iload #6
/*   */     //   252: iinc #6, 1
/*   */     //   255: swap
/*   */     //   256: aastore
/*   */     //   257: iload_3
/*   */     //   258: iload #4
/*   */     //   260: iadd
/*   */     //   261: dup
/*   */     //   262: istore_3
/*   */     //   263: iload #7
/*   */     //   265: if_icmpge -> 279
/*   */     //   268: aload #5
/*   */     //   270: iload_3
/*   */     //   271: invokevirtual charAt : (I)C
/*   */     //   274: istore #4
/*   */     //   276: goto -> 230
/*   */     //   279: ldc '䉎ୋמּ殂嵺軐鷼圐ꓒ䟹⌡䯮?꣌䱰篷䳩篓'
/*   */     //   281: invokevirtual toCharArray : ()[C
/*   */     //   284: dup
/*   */     //   285: dup
/*   */     //   286: bipush #6
/*   */     //   288: dup_x1
/*   */     //   289: caload
/*   */     //   290: sipush #23736
/*   */     //   293: ixor
/*   */     //   294: i2c
/*   */     //   295: castore
/*   */     //   296: sipush #25864
/*   */     //   299: iconst_1
/*   */     //   300: iconst_1
/*   */     //   301: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   304: dup
/*   */     //   305: astore #5
/*   */     //   307: invokevirtual length : ()I
/*   */     //   310: istore #7
/*   */     //   312: bipush #8
/*   */     //   314: istore #4
/*   */     //   316: iconst_m1
/*   */     //   317: istore_3
/*   */     //   318: iinc #3, 1
/*   */     //   321: aload #5
/*   */     //   323: iload_3
/*   */     //   324: dup
/*   */     //   325: iload #4
/*   */     //   327: iadd
/*   */     //   328: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   331: iconst_0
/*   */     //   332: goto -> 373
/*   */     //   335: aload #8
/*   */     //   337: swap
/*   */     //   338: iload #6
/*   */     //   340: iinc #6, 1
/*   */     //   343: swap
/*   */     //   344: aastore
/*   */     //   345: iload_3
/*   */     //   346: iload #4
/*   */     //   348: iadd
/*   */     //   349: dup
/*   */     //   350: istore_3
/*   */     //   351: iload #7
/*   */     //   353: if_icmpge -> 367
/*   */     //   356: aload #5
/*   */     //   358: iload_3
/*   */     //   359: invokevirtual charAt : (I)C
/*   */     //   362: istore #4
/*   */     //   364: goto -> 318
/*   */     //   367: aload #8
/*   */     //   369: astore_0
/*   */     //   370: goto -> 436
/*   */     //   373: swap
/*   */     //   374: ldc '?젽놹㺋겇坏য়徸'
/*   */     //   376: invokevirtual toCharArray : ()[C
/*   */     //   379: dup
/*   */     //   380: dup
/*   */     //   381: iconst_1
/*   */     //   382: dup_x1
/*   */     //   383: caload
/*   */     //   384: sipush #28185
/*   */     //   387: ixor
/*   */     //   388: i2c
/*   */     //   389: castore
/*   */     //   390: sipush #12719
/*   */     //   393: iconst_0
/*   */     //   394: iconst_0
/*   */     //   395: invokestatic w : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   398: invokevirtual getBytes : (Ljava/lang/String;)[B
/*   */     //   401: aload_1
/*   */     //   402: swap
/*   */     //   403: invokevirtual doFinal : ([B)[B
/*   */     //   406: astore #9
/*   */     //   408: aload #9
/*   */     //   410: invokestatic a : ([B)Ljava/lang/String;
/*   */     //   413: invokevirtual intern : ()Ljava/lang/String;
/*   */     //   416: swap
/*   */     //   417: tableswitch default -> 247, 0 -> 335
/*   */     //   436: new aacinternal/a7
/*   */     //   439: dup
/*   */     //   440: aload_0
/*   */     //   441: iconst_4
/*   */     //   442: aaload
/*   */     //   443: iconst_0
/*   */     //   444: invokespecial <init> : (Ljava/lang/String;I)V
/*   */     //   447: putstatic aacinternal/a7.MINIMAL : Laacinternal/a7;
/*   */     //   450: new aacinternal/a7
/*   */     //   453: dup
/*   */     //   454: aload_0
/*   */     //   455: iconst_2
/*   */     //   456: aaload
/*   */     //   457: iconst_1
/*   */     //   458: invokespecial <init> : (Ljava/lang/String;I)V
/*   */     //   461: putstatic aacinternal/a7.MAXIMAL : Laacinternal/a7;
/*   */     //   464: new aacinternal/a7
/*   */     //   467: dup
/*   */     //   468: aload_0
/*   */     //   469: iconst_1
/*   */     //   470: aaload
/*   */     //   471: iconst_2
/*   */     //   472: invokespecial <init> : (Ljava/lang/String;I)V
/*   */     //   475: putstatic aacinternal/a7.REMOVED : Laacinternal/a7;
/*   */     //   478: new aacinternal/a7
/*   */     //   481: dup
/*   */     //   482: aload_0
/*   */     //   483: iconst_0
/*   */     //   484: aaload
/*   */     //   485: iconst_3
/*   */     //   486: invokespecial <init> : (Ljava/lang/String;I)V
/*   */     //   489: putstatic aacinternal/a7.FIXED : Laacinternal/a7;
/*   */     //   492: new aacinternal/a7
/*   */     //   495: dup
/*   */     //   496: aload_0
/*   */     //   497: iconst_3
/*   */     //   498: aaload
/*   */     //   499: iconst_4
/*   */     //   500: invokespecial <init> : (Ljava/lang/String;I)V
/*   */     //   503: putstatic aacinternal/a7.FAILED : Laacinternal/a7;
/*   */     //   506: iconst_5
/*   */     //   507: anewarray aacinternal/a7
/*   */     //   510: dup
/*   */     //   511: iconst_0
/*   */     //   512: getstatic aacinternal/a7.MINIMAL : Laacinternal/a7;
/*   */     //   515: aastore
/*   */     //   516: dup
/*   */     //   517: iconst_1
/*   */     //   518: getstatic aacinternal/a7.MAXIMAL : Laacinternal/a7;
/*   */     //   521: aastore
/*   */     //   522: dup
/*   */     //   523: iconst_2
/*   */     //   524: getstatic aacinternal/a7.REMOVED : Laacinternal/a7;
/*   */     //   527: aastore
/*   */     //   528: dup
/*   */     //   529: iconst_3
/*   */     //   530: getstatic aacinternal/a7.FIXED : Laacinternal/a7;
/*   */     //   533: aastore
/*   */     //   534: dup
/*   */     //   535: iconst_4
/*   */     //   536: getstatic aacinternal/a7.FAILED : Laacinternal/a7;
/*   */     //   539: aastore
/*   */     //   540: putstatic aacinternal/a7.a : [Laacinternal/a7;
/*   */     //   543: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #6	-> 436
/*   */     //   #7	-> 450
/*   */     //   #8	-> 464
/*   */     //   #9	-> 478
/*   */     //   #4	-> 492
/*   */     //   #3	-> 506
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */