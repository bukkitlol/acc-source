/*   */ package me.konsolas.aac;public class c1 extends ck { private int a; private int h; private int f;
/*   */   
/*   */   public c1(long paramLong, AAC paramAAC, Player paramPlayer) {
/* 4 */     super((short)i, (short)j, paramAAC, paramPlayer, k, j);
/*   */   } private int g; private static final long i = nc.a(6130801179068278314L, 4346815178363181890L, MethodHandles.lookup().lookupClass()).a(210376788285639L); private static final String j; public void b(long paramLong) {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/c1.i : J
/*   */     //   3: lload_1
/*   */     //   4: lxor
/*   */     //   5: lstore_1
/*   */     //   6: lload_1
/*   */     //   7: dup2
/*   */     //   8: ldc2_w 34450125845894
/*   */     //   11: lxor
/*   */     //   12: lstore_3
/*   */     //   13: pop2
/*   */     //   14: ldc2_w 7003608156676411586
/*   */     //   17: lload_1
/*   */     //   18: <illegal opcode> w : (JJ)[I
/*   */     //   23: aload_0
/*   */     //   24: getfield h : I
/*   */     //   27: aload_0
/*   */     //   28: getfield a : I
/*   */     //   31: isub
/*   */     //   32: istore #6
/*   */     //   34: astore #5
/*   */     //   36: iload #6
/*   */     //   38: aload_0
/*   */     //   39: getfield f : I
/*   */     //   42: aload #5
/*   */     //   44: ifnonnull -> 116
/*   */     //   47: if_icmpne -> 168
/*   */     //   50: goto -> 63
/*   */     //   53: ldc2_w 6993084068727864747
/*   */     //   56: lload_1
/*   */     //   57: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   62: athrow
/*   */     //   63: aload_0
/*   */     //   64: dup
/*   */     //   65: getfield g : I
/*   */     //   68: iconst_1
/*   */     //   69: iadd
/*   */     //   70: putfield g : I
/*   */     //   73: aload_0
/*   */     //   74: lload_1
/*   */     //   75: lconst_0
/*   */     //   76: lcmp
/*   */     //   77: iflt -> 201
/*   */     //   80: aload #5
/*   */     //   82: ifnonnull -> 201
/*   */     //   85: goto -> 98
/*   */     //   88: ldc2_w 6993084068727864747
/*   */     //   91: lload_1
/*   */     //   92: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   97: athrow
/*   */     //   98: getfield g : I
/*   */     //   101: bipush #16
/*   */     //   103: goto -> 116
/*   */     //   106: ldc2_w 6993084068727864747
/*   */     //   109: lload_1
/*   */     //   110: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   115: athrow
/*   */     //   116: if_icmplt -> 186
/*   */     //   119: aload_0
/*   */     //   120: ldc2_w 7008933226979387128
/*   */     //   123: lload_1
/*   */     //   124: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*   */     //   129: aload_0
/*   */     //   130: getfield g : I
/*   */     //   133: i2f
/*   */     //   134: lload_3
/*   */     //   135: ldc2_w 7040317827830818272
/*   */     //   138: lload_1
/*   */     //   139: <illegal opcode> b : (Lme/konsolas/aac/ck;Lme/konsolas/aac/eA;FJJJ)V
/*   */     //   144: lload_1
/*   */     //   145: lconst_0
/*   */     //   146: lcmp
/*   */     //   147: iflt -> 200
/*   */     //   150: aload #5
/*   */     //   152: ifnull -> 186
/*   */     //   155: goto -> 168
/*   */     //   158: ldc2_w 6993084068727864747
/*   */     //   161: lload_1
/*   */     //   162: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   167: athrow
/*   */     //   168: aload_0
/*   */     //   169: iconst_0
/*   */     //   170: putfield g : I
/*   */     //   173: goto -> 186
/*   */     //   176: ldc2_w 6993084068727864747
/*   */     //   179: lload_1
/*   */     //   180: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   185: athrow
/*   */     //   186: aload_0
/*   */     //   187: iload #6
/*   */     //   189: putfield f : I
/*   */     //   192: aload_0
/*   */     //   193: aload_0
/*   */     //   194: getfield h : I
/*   */     //   197: putfield a : I
/*   */     //   200: aload_0
/*   */     //   201: iconst_0
/*   */     //   202: putfield h : I
/*   */     //   205: lload_1
/*   */     //   206: lconst_0
/*   */     //   207: lcmp
/*   */     //   208: ifle -> 235
/*   */     //   211: ldc2_w 7014714580795467258
/*   */     //   214: lload_1
/*   */     //   215: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   220: ifnull -> 248
/*   */     //   223: iconst_1
/*   */     //   224: newarray int
/*   */     //   226: ldc2_w 7026491015096347989
/*   */     //   229: lload_1
/*   */     //   230: <illegal opcode> w : ([IJJ)V
/*   */     //   235: goto -> 248
/*   */     //   238: ldc2_w 6993084068727864747
/*   */     //   241: lload_1
/*   */     //   242: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   247: athrow
/*   */     //   248: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #7	-> 23
/*   */     //   #1	-> 36
/*   */     //   #3	-> 63
/*   */     //   #11	-> 73
/*   */     //   #6	-> 168
/*   */     //   #13	-> 186
/*   */     //   #2	-> 192
/*   */     //   #10	-> 200
/*   */     //   #5	-> 205
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   36	50	53	aacinternal/v
/*   */     //   47	85	88	aacinternal/v
/*   */     //   63	103	106	aacinternal/v
/*   */     //   116	155	158	aacinternal/v
/*   */     //   119	173	176	aacinternal/v
/*   */     //   201	235	238	aacinternal/v
/*   */   } public void a() {
/* 8 */     this.h++;
/*   */   }
/*   */   
/*   */   static {
/*   */     long l = i ^ 0x17C88E6C3D2FL;
/*   */     "㣞妁㾨덴콍캖蝯开䓦?諦㉳휻ﰼ睛졻ㅭ୨".toCharArray()[9] = (char)("㣞妁㾨덴콍캖蝯开䓦?諦㉳휻ﰼ睛졻ㅭ୨".toCharArray()[9] ^ 0x1394);
/*   */     "ﻯ質畬".toCharArray()[0] = (char)("ﻯ質畬".toCharArray()[0] ^ 0x1D56);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b = 1; b < 8; b++)
/*   */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(da$gx.U("㣞妁㾨덴콍캖蝯开䓦?諦㉳휻ﰼ睛졻ㅭ୨".toCharArray(), (short)31521, true, true))).init(2, SecretKeyFactory.getInstance(da$gx.U("ﻯ質畬".toCharArray(), (short)8637, false, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     "淝捞않牥䷖孛₏뽵獿꾍ᏸ䖍븓沣".toCharArray()[7] = (char)("淝捞않牥䷖孛₏뽵獿꾍ᏸ䖍븓沣".toCharArray()[7] ^ 0x5EA4);
/*   */   }
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   }
/*   */   
/*   */   private static String b(byte[] paramArrayOfbyte) {
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
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\c1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */