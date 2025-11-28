/*    */ package me.konsolas.aac;
/*    */ import aacinternal.v;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import javax.annotation.Nullable;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ public final class a3 {
/*    */   a3(s params, H paramH) {
/* 12 */     this.b = params;
/*    */     this.a = paramH;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final s b;
/*    */   @Nullable
/*    */   public final H a;
/*    */   private static final long c = nc.a(6194109883331344676L, -8601332728361879012L, MethodHandles.lookup().lookupClass()).a(229882879576263L);
/*    */   private static final String d;
/*    */   
/*    */   public static boolean a(H paramH, long paramLong, s params) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/a3.c : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 120902208843715
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 56307185645562
/*    */     //   18: lxor
/*    */     //   19: dup2
/*    */     //   20: bipush #32
/*    */     //   22: lushr
/*    */     //   23: l2i
/*    */     //   24: istore #6
/*    */     //   26: dup2
/*    */     //   27: bipush #32
/*    */     //   29: lshl
/*    */     //   30: bipush #48
/*    */     //   32: lushr
/*    */     //   33: l2i
/*    */     //   34: istore #7
/*    */     //   36: dup2
/*    */     //   37: bipush #48
/*    */     //   39: lshl
/*    */     //   40: bipush #48
/*    */     //   42: lushr
/*    */     //   43: l2i
/*    */     //   44: istore #8
/*    */     //   46: pop2
/*    */     //   47: dup2
/*    */     //   48: ldc2_w 31680784757221
/*    */     //   51: lxor
/*    */     //   52: dup2
/*    */     //   53: bipush #56
/*    */     //   55: lushr
/*    */     //   56: l2i
/*    */     //   57: istore #9
/*    */     //   59: dup2
/*    */     //   60: bipush #8
/*    */     //   62: lshl
/*    */     //   63: bipush #32
/*    */     //   65: lushr
/*    */     //   66: l2i
/*    */     //   67: istore #10
/*    */     //   69: dup2
/*    */     //   70: bipush #40
/*    */     //   72: lshl
/*    */     //   73: bipush #40
/*    */     //   75: lushr
/*    */     //   76: l2i
/*    */     //   77: istore #11
/*    */     //   79: pop2
/*    */     //   80: pop2
/*    */     //   81: ldc2_w 3296121870651654873
/*    */     //   84: lload_1
/*    */     //   85: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   90: astore #12
/*    */     //   92: aload_0
/*    */     //   93: invokevirtual a : ()I
/*    */     //   96: aload #12
/*    */     //   98: ifnonnull -> 476
/*    */     //   101: lookupswitch default -> 462, 200 -> 226, 203 -> 226, 204 -> 226, 300 -> 226, 301 -> 226, 302 -> 244, 307 -> 244, 308 -> 226, 404 -> 226, 405 -> 226, 410 -> 226, 414 -> 226, 501 -> 226
/*    */     //   216: ldc2_w 3252975363531855388
/*    */     //   219: lload_1
/*    */     //   220: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   225: athrow
/*    */     //   226: aload #12
/*    */     //   228: ifnull -> 477
/*    */     //   231: goto -> 244
/*    */     //   234: ldc2_w 3252975363531855388
/*    */     //   237: lload_1
/*    */     //   238: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   243: athrow
/*    */     //   244: aload_0
/*    */     //   245: aload #12
/*    */     //   247: ifnonnull -> 478
/*    */     //   250: goto -> 263
/*    */     //   253: ldc2_w 3252975363531855388
/*    */     //   256: lload_1
/*    */     //   257: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   262: athrow
/*    */     //   263: lload #4
/*    */     //   265: getstatic me/konsolas/aac/a3.d : Ljava/lang/String;
/*    */     //   268: invokevirtual a : (JLjava/lang/String;)Ljava/lang/String;
/*    */     //   271: ifnonnull -> 477
/*    */     //   274: goto -> 287
/*    */     //   277: ldc2_w 3252975363531855388
/*    */     //   280: lload_1
/*    */     //   281: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   286: athrow
/*    */     //   287: aload_0
/*    */     //   288: iload #9
/*    */     //   290: i2b
/*    */     //   291: iload #10
/*    */     //   293: iload #11
/*    */     //   295: invokevirtual a : (BII)Lme/konsolas/aac/b0;
/*    */     //   298: invokevirtual d : ()I
/*    */     //   301: aload #12
/*    */     //   303: ifnonnull -> 491
/*    */     //   306: goto -> 319
/*    */     //   309: ldc2_w 3252975363531855388
/*    */     //   312: lload_1
/*    */     //   313: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   318: athrow
/*    */     //   319: iconst_m1
/*    */     //   320: if_icmpne -> 477
/*    */     //   323: goto -> 336
/*    */     //   326: ldc2_w 3252975363531855388
/*    */     //   329: lload_1
/*    */     //   330: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   335: athrow
/*    */     //   336: aload_0
/*    */     //   337: iload #9
/*    */     //   339: i2b
/*    */     //   340: iload #10
/*    */     //   342: iload #11
/*    */     //   344: invokevirtual a : (BII)Lme/konsolas/aac/b0;
/*    */     //   347: invokevirtual e : ()Z
/*    */     //   350: aload #12
/*    */     //   352: lload_1
/*    */     //   353: lconst_0
/*    */     //   354: lcmp
/*    */     //   355: iflt -> 493
/*    */     //   358: ifnonnull -> 491
/*    */     //   361: goto -> 374
/*    */     //   364: ldc2_w 3252975363531855388
/*    */     //   367: lload_1
/*    */     //   368: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   373: athrow
/*    */     //   374: ifne -> 477
/*    */     //   377: goto -> 390
/*    */     //   380: ldc2_w 3252975363531855388
/*    */     //   383: lload_1
/*    */     //   384: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   389: athrow
/*    */     //   390: aload_0
/*    */     //   391: iload #9
/*    */     //   393: i2b
/*    */     //   394: iload #10
/*    */     //   396: iload #11
/*    */     //   398: invokevirtual a : (BII)Lme/konsolas/aac/b0;
/*    */     //   401: invokevirtual g : ()Z
/*    */     //   404: aload #12
/*    */     //   406: ifnonnull -> 476
/*    */     //   409: goto -> 422
/*    */     //   412: ldc2_w 3252975363531855388
/*    */     //   415: lload_1
/*    */     //   416: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   421: athrow
/*    */     //   422: lload_1
/*    */     //   423: lconst_0
/*    */     //   424: lcmp
/*    */     //   425: iflt -> 463
/*    */     //   428: ifeq -> 462
/*    */     //   431: goto -> 444
/*    */     //   434: ldc2_w 3252975363531855388
/*    */     //   437: lload_1
/*    */     //   438: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   443: athrow
/*    */     //   444: aload #12
/*    */     //   446: ifnull -> 477
/*    */     //   449: goto -> 462
/*    */     //   452: ldc2_w 3252975363531855388
/*    */     //   455: lload_1
/*    */     //   456: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   461: athrow
/*    */     //   462: iconst_0
/*    */     //   463: goto -> 476
/*    */     //   466: ldc2_w 3252975363531855388
/*    */     //   469: lload_1
/*    */     //   470: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   475: athrow
/*    */     //   476: ireturn
/*    */     //   477: aload_0
/*    */     //   478: iload #9
/*    */     //   480: i2b
/*    */     //   481: iload #10
/*    */     //   483: iload #11
/*    */     //   485: invokevirtual a : (BII)Lme/konsolas/aac/b0;
/*    */     //   488: invokevirtual a : ()Z
/*    */     //   491: aload #12
/*    */     //   493: lload_1
/*    */     //   494: lconst_0
/*    */     //   495: lcmp
/*    */     //   496: iflt -> 547
/*    */     //   499: ifnonnull -> 545
/*    */     //   502: ifne -> 570
/*    */     //   505: goto -> 518
/*    */     //   508: ldc2_w 3252975363531855388
/*    */     //   511: lload_1
/*    */     //   512: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   517: athrow
/*    */     //   518: aload_3
/*    */     //   519: iload #6
/*    */     //   521: iload #7
/*    */     //   523: i2c
/*    */     //   524: iload #8
/*    */     //   526: invokevirtual a : (ICI)Lme/konsolas/aac/b0;
/*    */     //   529: invokevirtual a : ()Z
/*    */     //   532: goto -> 545
/*    */     //   535: ldc2_w 3252975363531855388
/*    */     //   538: lload_1
/*    */     //   539: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   544: athrow
/*    */     //   545: aload #12
/*    */     //   547: ifnonnull -> 567
/*    */     //   550: ifne -> 570
/*    */     //   553: goto -> 566
/*    */     //   556: ldc2_w 3252975363531855388
/*    */     //   559: lload_1
/*    */     //   560: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   565: athrow
/*    */     //   566: iconst_1
/*    */     //   567: goto -> 571
/*    */     //   570: iconst_0
/*    */     //   571: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 92
/*    */     //   #7	-> 226
/*    */     //   #2	-> 244
/*    */     //   #13	-> 288
/*    */     //   #6	-> 337
/*    */     //   #10	-> 391
/*    */     //   #1	-> 444
/*    */     //   #3	-> 462
/*    */     //   #9	-> 477
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   92	216	216	aacinternal/v
/*    */     //   101	231	234	aacinternal/v
/*    */     //   226	250	253	aacinternal/v
/*    */     //   244	274	277	aacinternal/v
/*    */     //   263	306	309	aacinternal/v
/*    */     //   287	323	326	aacinternal/v
/*    */     //   319	361	364	aacinternal/v
/*    */     //   336	377	380	aacinternal/v
/*    */     //   374	409	412	aacinternal/v
/*    */     //   390	431	434	aacinternal/v
/*    */     //   422	449	452	aacinternal/v
/*    */     //   444	463	466	aacinternal/v
/*    */     //   491	505	508	aacinternal/v
/*    */     //   502	532	535	aacinternal/v
/*    */     //   545	553	556	aacinternal/v
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = c ^ 0x71C95634420AL;
/*    */     "왏Ჵﱁ⇢ᔐ悔鐔ৢ쮦頕ۨ呞쁎ꦔ觐?啚綌".toCharArray()[4] = (char)("왏Ჵﱁ⇢ᔐ悔鐔ৢ쮦頕ۨ呞쁎ꦔ觐?啚綌".toCharArray()[4] ^ 0x4573);
/*    */     "෾嗿蹱㋾".toCharArray()[2] = (char)("෾嗿蹱㋾".toCharArray()[2] ^ 0x7639);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(dP$dt.X("왏Ჵﱁ⇢ᔐ悔鐔ৢ쮦頕ۨ呞쁎ꦔ觐?啚綌".toCharArray(), (short)21653, false, true))).init(2, SecretKeyFactory.getInstance(dP$dt.X("෾嗿蹱㋾".toCharArray(), (short)11447, true, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "ꢾ⡾Ꚏ썟方ꀎ텛❥".toCharArray()[3] = (char)("ꢾ⡾Ꚏ썟方ꀎ텛❥".toCharArray()[3] ^ 0xA6);
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
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\a3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */