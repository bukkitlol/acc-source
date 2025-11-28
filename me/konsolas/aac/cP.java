/*    */ package me.konsolas.aac;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ public class cp extends ck {
/*  5 */   private final float[] g = new float[20];
/*    */   
/*    */   private float j;
/*    */   
/*    */   private float h;
/*    */   
/*    */   private static final int i = 20;
/*    */   private final float[] k;
/*    */   private int a;
/* 14 */   private float f = 0.0F; private static final long l = nc.a(-1956094911415541203L, -7184951338078056440L, MethodHandles.lookup().lookupClass()).a(141650173362071L);
/*    */   private static final String m;
/*    */   
/*    */   public cp(long paramLong, AAC paramAAC, Player paramPlayer) {
/* 18 */     super((short)i, (short)j, paramAAC, paramPlayer, k, m);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     this.a = 0;
/*    */     this.f = 0.0F;
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cp.l : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: lload_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 73172015629131
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -3006308399428681467
/*    */     //   18: lload_3
/*    */     //   19: <illegal opcode> w : (JJ)Z
/*    */     //   24: istore #7
/*    */     //   26: fload_2
/*    */     //   27: f2d
/*    */     //   28: dconst_0
/*    */     //   29: dcmpl
/*    */     //   30: iload #7
/*    */     //   32: ifne -> 86
/*    */     //   35: ifle -> 731
/*    */     //   38: goto -> 51
/*    */     //   41: ldc2_w -2929418800514996734
/*    */     //   44: lload_3
/*    */     //   45: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   50: athrow
/*    */     //   51: fload_1
/*    */     //   52: iload #7
/*    */     //   54: ifne -> 117
/*    */     //   57: goto -> 70
/*    */     //   60: ldc2_w -2929418800514996734
/*    */     //   63: lload_3
/*    */     //   64: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   69: athrow
/*    */     //   70: f2d
/*    */     //   71: dconst_0
/*    */     //   72: dcmpl
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w -2929418800514996734
/*    */     //   79: lload_3
/*    */     //   80: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   85: athrow
/*    */     //   86: ifle -> 731
/*    */     //   89: fload_2
/*    */     //   90: aload_0
/*    */     //   91: getfield h : F
/*    */     //   94: fsub
/*    */     //   95: ldc2_w -2936113931814594189
/*    */     //   98: lload_3
/*    */     //   99: <illegal opcode> w : (FJJ)F
/*    */     //   104: goto -> 117
/*    */     //   107: ldc2_w -2929418800514996734
/*    */     //   110: lload_3
/*    */     //   111: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   116: athrow
/*    */     //   117: fstore #8
/*    */     //   119: fload_1
/*    */     //   120: aload_0
/*    */     //   121: getfield j : F
/*    */     //   124: fsub
/*    */     //   125: ldc2_w -2936113931814594189
/*    */     //   128: lload_3
/*    */     //   129: <illegal opcode> w : (FJJ)F
/*    */     //   134: fstore #9
/*    */     //   136: aload_0
/*    */     //   137: fload_2
/*    */     //   138: putfield h : F
/*    */     //   141: aload_0
/*    */     //   142: fload_1
/*    */     //   143: putfield j : F
/*    */     //   146: fload #8
/*    */     //   148: fload_2
/*    */     //   149: fsub
/*    */     //   150: ldc2_w -2936113931814594189
/*    */     //   153: lload_3
/*    */     //   154: <illegal opcode> w : (FJJ)F
/*    */     //   159: fstore #10
/*    */     //   161: fload #9
/*    */     //   163: fload_1
/*    */     //   164: fsub
/*    */     //   165: ldc2_w -2936113931814594189
/*    */     //   168: lload_3
/*    */     //   169: <illegal opcode> w : (FJJ)F
/*    */     //   174: fstore #11
/*    */     //   176: aload_0
/*    */     //   177: getfield g : [F
/*    */     //   180: aload_0
/*    */     //   181: getfield a : I
/*    */     //   184: fload #10
/*    */     //   186: fastore
/*    */     //   187: aload_0
/*    */     //   188: getfield k : [F
/*    */     //   191: aload_0
/*    */     //   192: getfield a : I
/*    */     //   195: fload #11
/*    */     //   197: fastore
/*    */     //   198: aload_0
/*    */     //   199: dup
/*    */     //   200: getfield a : I
/*    */     //   203: iconst_1
/*    */     //   204: iadd
/*    */     //   205: dup_x1
/*    */     //   206: putfield a : I
/*    */     //   209: iload #7
/*    */     //   211: lload_3
/*    */     //   212: lconst_0
/*    */     //   213: lcmp
/*    */     //   214: ifle -> 222
/*    */     //   217: ifne -> 257
/*    */     //   220: bipush #20
/*    */     //   222: if_icmpne -> 731
/*    */     //   225: goto -> 238
/*    */     //   228: ldc2_w -2929418800514996734
/*    */     //   231: lload_3
/*    */     //   232: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   237: athrow
/*    */     //   238: aload_0
/*    */     //   239: iconst_0
/*    */     //   240: putfield a : I
/*    */     //   243: iconst_0
/*    */     //   244: goto -> 257
/*    */     //   247: ldc2_w -2929418800514996734
/*    */     //   250: lload_3
/*    */     //   251: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   256: athrow
/*    */     //   257: istore #12
/*    */     //   259: iload #12
/*    */     //   261: bipush #20
/*    */     //   263: if_icmpge -> 348
/*    */     //   266: aload_0
/*    */     //   267: getfield k : [F
/*    */     //   270: iload #12
/*    */     //   272: faload
/*    */     //   273: iload #7
/*    */     //   275: ifne -> 355
/*    */     //   278: fconst_0
/*    */     //   279: fcmpl
/*    */     //   280: iload #7
/*    */     //   282: ifne -> 336
/*    */     //   285: goto -> 298
/*    */     //   288: ldc2_w -2929418800514996734
/*    */     //   291: lload_3
/*    */     //   292: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   297: athrow
/*    */     //   298: ifeq -> 339
/*    */     //   301: goto -> 314
/*    */     //   304: ldc2_w -2929418800514996734
/*    */     //   307: lload_3
/*    */     //   308: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   313: athrow
/*    */     //   314: aload_0
/*    */     //   315: getfield g : [F
/*    */     //   318: iload #12
/*    */     //   320: faload
/*    */     //   321: fconst_0
/*    */     //   322: fcmpl
/*    */     //   323: goto -> 336
/*    */     //   326: ldc2_w -2929418800514996734
/*    */     //   329: lload_3
/*    */     //   330: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   335: athrow
/*    */     //   336: ifne -> 340
/*    */     //   339: return
/*    */     //   340: iinc #12, 1
/*    */     //   343: iload #7
/*    */     //   345: ifeq -> 259
/*    */     //   348: lload_3
/*    */     //   349: lconst_0
/*    */     //   350: lcmp
/*    */     //   351: iflt -> 266
/*    */     //   354: fconst_0
/*    */     //   355: fstore #12
/*    */     //   357: fconst_0
/*    */     //   358: fstore #13
/*    */     //   360: fconst_0
/*    */     //   361: fstore #14
/*    */     //   363: fconst_0
/*    */     //   364: fstore #15
/*    */     //   366: iconst_0
/*    */     //   367: istore #16
/*    */     //   369: iload #16
/*    */     //   371: bipush #20
/*    */     //   373: if_icmpge -> 478
/*    */     //   376: fload #12
/*    */     //   378: aload_0
/*    */     //   379: getfield g : [F
/*    */     //   382: iload #16
/*    */     //   384: faload
/*    */     //   385: fadd
/*    */     //   386: fstore #12
/*    */     //   388: fload #13
/*    */     //   390: aload_0
/*    */     //   391: getfield g : [F
/*    */     //   394: iload #16
/*    */     //   396: faload
/*    */     //   397: aload_0
/*    */     //   398: getfield g : [F
/*    */     //   401: iload #16
/*    */     //   403: faload
/*    */     //   404: fmul
/*    */     //   405: fadd
/*    */     //   406: fstore #13
/*    */     //   408: fload #14
/*    */     //   410: aload_0
/*    */     //   411: getfield k : [F
/*    */     //   414: iload #16
/*    */     //   416: faload
/*    */     //   417: fadd
/*    */     //   418: fstore #14
/*    */     //   420: fload #15
/*    */     //   422: aload_0
/*    */     //   423: getfield k : [F
/*    */     //   426: iload #16
/*    */     //   428: faload
/*    */     //   429: aload_0
/*    */     //   430: getfield k : [F
/*    */     //   433: iload #16
/*    */     //   435: faload
/*    */     //   436: fmul
/*    */     //   437: fadd
/*    */     //   438: fstore #15
/*    */     //   440: iinc #16, 1
/*    */     //   443: iload #7
/*    */     //   445: lload_3
/*    */     //   446: lconst_0
/*    */     //   447: lcmp
/*    */     //   448: ifle -> 456
/*    */     //   451: ifne -> 731
/*    */     //   454: iload #7
/*    */     //   456: ifeq -> 369
/*    */     //   459: lload_3
/*    */     //   460: lconst_0
/*    */     //   461: lcmp
/*    */     //   462: ifle -> 443
/*    */     //   465: goto -> 478
/*    */     //   468: ldc2_w -2929418800514996734
/*    */     //   471: lload_3
/*    */     //   472: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   477: athrow
/*    */     //   478: fload #13
/*    */     //   480: ldc 20.0
/*    */     //   482: fdiv
/*    */     //   483: f2d
/*    */     //   484: fload #12
/*    */     //   486: ldc 20.0
/*    */     //   488: fdiv
/*    */     //   489: f2d
/*    */     //   490: ldc2_w 2.0
/*    */     //   493: invokestatic pow : (DD)D
/*    */     //   496: dsub
/*    */     //   497: d2f
/*    */     //   498: fstore #16
/*    */     //   500: fload #15
/*    */     //   502: ldc 20.0
/*    */     //   504: fdiv
/*    */     //   505: f2d
/*    */     //   506: fload #14
/*    */     //   508: ldc 20.0
/*    */     //   510: fdiv
/*    */     //   511: f2d
/*    */     //   512: ldc2_w 2.0
/*    */     //   515: invokestatic pow : (DD)D
/*    */     //   518: dsub
/*    */     //   519: d2f
/*    */     //   520: fstore #17
/*    */     //   522: fload #16
/*    */     //   524: ldc 50.0
/*    */     //   526: fcmpl
/*    */     //   527: iload #7
/*    */     //   529: lload_3
/*    */     //   530: lconst_0
/*    */     //   531: lcmp
/*    */     //   532: iflt -> 580
/*    */     //   535: ifne -> 572
/*    */     //   538: ifle -> 731
/*    */     //   541: goto -> 554
/*    */     //   544: ldc2_w -2929418800514996734
/*    */     //   547: lload_3
/*    */     //   548: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   553: athrow
/*    */     //   554: fload #17
/*    */     //   556: ldc 3.0
/*    */     //   558: fcmpl
/*    */     //   559: goto -> 572
/*    */     //   562: ldc2_w -2929418800514996734
/*    */     //   565: lload_3
/*    */     //   566: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   571: athrow
/*    */     //   572: lload_3
/*    */     //   573: lconst_0
/*    */     //   574: lcmp
/*    */     //   575: ifle -> 644
/*    */     //   578: iload #7
/*    */     //   580: ifne -> 644
/*    */     //   583: ifle -> 731
/*    */     //   586: goto -> 599
/*    */     //   589: ldc2_w -2929418800514996734
/*    */     //   592: lload_3
/*    */     //   593: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   598: athrow
/*    */     //   599: aload_0
/*    */     //   600: dup
/*    */     //   601: getfield f : F
/*    */     //   604: fconst_1
/*    */     //   605: fadd
/*    */     //   606: iload #7
/*    */     //   608: ifne -> 728
/*    */     //   611: goto -> 624
/*    */     //   614: ldc2_w -2929418800514996734
/*    */     //   617: lload_3
/*    */     //   618: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   623: athrow
/*    */     //   624: dup_x1
/*    */     //   625: putfield f : F
/*    */     //   628: ldc 3.0
/*    */     //   630: fcmpl
/*    */     //   631: goto -> 644
/*    */     //   634: ldc2_w -2929418800514996734
/*    */     //   637: lload_3
/*    */     //   638: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   643: athrow
/*    */     //   644: lload_3
/*    */     //   645: lconst_0
/*    */     //   646: lcmp
/*    */     //   647: iflt -> 681
/*    */     //   650: ifle -> 697
/*    */     //   653: aload_0
/*    */     //   654: ldc2_w -2932694310875459652
/*    */     //   657: lload_3
/*    */     //   658: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   663: fload #16
/*    */     //   665: fload #17
/*    */     //   667: fadd
/*    */     //   668: lload #5
/*    */     //   670: ldc2_w -2920190618199649491
/*    */     //   673: lload_3
/*    */     //   674: <illegal opcode> b : (Lme/konsolas/aac/ck;Lme/konsolas/aac/eA;FJJJ)V
/*    */     //   679: iload #7
/*    */     //   681: ifeq -> 731
/*    */     //   684: goto -> 697
/*    */     //   687: ldc2_w -2929418800514996734
/*    */     //   690: lload_3
/*    */     //   691: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   696: athrow
/*    */     //   697: aload_0
/*    */     //   698: aload_0
/*    */     //   699: getfield f : F
/*    */     //   702: ldc 0.1
/*    */     //   704: fsub
/*    */     //   705: fconst_0
/*    */     //   706: ldc2_w -3020344580856754871
/*    */     //   709: lload_3
/*    */     //   710: <illegal opcode> w : (FFJJ)F
/*    */     //   715: goto -> 728
/*    */     //   718: ldc2_w -2929418800514996734
/*    */     //   721: lload_3
/*    */     //   722: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   727: athrow
/*    */     //   728: putfield f : F
/*    */     //   731: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 26
/*    */     //   #4	-> 89
/*    */     //   #8	-> 119
/*    */     //   #21	-> 136
/*    */     //   #26	-> 141
/*    */     //   #6	-> 146
/*    */     //   #28	-> 161
/*    */     //   #17	-> 176
/*    */     //   #20	-> 187
/*    */     //   #23	-> 198
/*    */     //   #1	-> 238
/*    */     //   #11	-> 243
/*    */     //   #32	-> 266
/*    */     //   #16	-> 340
/*    */     //   #33	-> 348
/*    */     //   #22	-> 360
/*    */     //   #29	-> 366
/*    */     //   #2	-> 376
/*    */     //   #13	-> 408
/*    */     //   #12	-> 440
/*    */     //   #27	-> 478
/*    */     //   #31	-> 500
/*    */     //   #25	-> 522
/*    */     //   #9	-> 599
/*    */     //   #10	-> 653
/*    */     //   #7	-> 697
/*    */     //   #3	-> 731
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	38	41	aacinternal/v
/*    */     //   35	57	60	aacinternal/v
/*    */     //   51	73	76	aacinternal/v
/*    */     //   86	104	107	aacinternal/v
/*    */     //   176	225	228	aacinternal/v
/*    */     //   220	244	247	aacinternal/v
/*    */     //   266	285	288	aacinternal/v
/*    */     //   278	301	304	aacinternal/v
/*    */     //   298	323	326	aacinternal/v
/*    */     //   440	459	468	aacinternal/v
/*    */     //   522	541	544	aacinternal/v
/*    */     //   538	559	562	aacinternal/v
/*    */     //   572	586	589	aacinternal/v
/*    */     //   583	611	614	aacinternal/v
/*    */     //   599	631	634	aacinternal/v
/*    */     //   644	684	687	aacinternal/v
/*    */     //   653	715	718	aacinternal/v
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = l ^ 0x6D6D9660942EL;
/*    */     "㢝栱뺤劬㲞䫪옓빓垜쁢ꄴ뭌劅〃㊜陮ញ".toCharArray()[3] = (char)("㢝栱뺤劬㲞䫪옓빓垜쁢ꄴ뭌劅〃㊜陮ញ".toCharArray()[3] ^ 0x3334);
/*    */     "겠ꃾ㊒⡹".toCharArray()[1] = (char)("겠ꃾ㊒⡹".toCharArray()[1] ^ 0x5907);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("㢝栱뺤劬㲞䫪옓빓垜쁢ꄴ뭌劅〃㊜陮ញ".toCharArray(), (short)31518, true, (byte)5))).init(2, SecretKeyFactory.getInstance(a0$cc.G("겠ꃾ㊒⡹".toCharArray(), (short)1477, false, (byte)2)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "ꏽ嚽壂렫顔ꭾ튿ᣑ燖".toCharArray()[4] = (char)("ꏽ嚽壂렫顔ꭾ튿ᣑ燖".toCharArray()[4] ^ 0x4637);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   private static String b(byte[] paramArrayOfbyte) {
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
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */