/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ final class md
/*    */   extends Thread {
/*    */   md(long paramLong) {
/* 12 */     super(b);
/*    */     
/* 14 */     setDaemon(true);
/*    */   }
/*    */   
/*    */   private static final long a = nc.a(-3163124304704589508L, 1294257235433984302L, MethodHandles.lookup().lookupClass()).a(114352664663504L);
/*    */   private static final String b;
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
/*    */   static {
/*    */     long l = a ^ 0x13445BD20051L;
/*    */     "⃜欘댽阥溫᩶䉱۟㋼醈茙ὕ?혴톅犥ꒊ䁆ؖ".toCharArray()[0] = (char)("⃜欘댽阥溫᩶䉱۟㋼醈茙ὕ?혴톅犥ꒊ䁆ؖ".toCharArray()[0] ^ 0x19E2);
/*    */     "⿛떕櫶".toCharArray()[1] = (char)("⿛떕櫶".toCharArray()[1] ^ 0x2B4D);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(fW$gy.A("⃜欘댽阥溫᩶䉱۟㋼醈茙ὕ?혴톅犥ꒊ䁆ؖ".toCharArray(), (short)6575, false, 4))).init(2, SecretKeyFactory.getInstance(fW$gy.A("⿛떕櫶".toCharArray(), (short)32508, true, 2)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "蒋ᔅ瓈蓘믍湨뺃䈏督骞⨙曭䒤ำ".toCharArray()[15] = (char)("蒋ᔅ瓈蓘믍湨뺃䈏督骞⨙曭䒤ำ".toCharArray()[15] ^ 0x312C);
/*    */   }
/*    */   
/*    */   public void run() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/md.a : J
/*    */     //   3: ldc2_w 6269920701639
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: lload_1
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 18817331835429
/*    */     //   13: lxor
/*    */     //   14: lstore_3
/*    */     //   15: dup2
/*    */     //   16: ldc2_w 63555751939046
/*    */     //   19: lxor
/*    */     //   20: lstore #5
/*    */     //   22: pop2
/*    */     //   23: ldc2_w -8360761479791387200
/*    */     //   26: lload_1
/*    */     //   27: <illegal opcode> w : (JJ)I
/*    */     //   32: istore #7
/*    */     //   34: ldc me/konsolas/aac/lH
/*    */     //   36: dup
/*    */     //   37: astore #9
/*    */     //   39: monitorenter
/*    */     //   40: lload #5
/*    */     //   42: invokestatic a : (J)Lme/konsolas/aac/lH;
/*    */     //   45: astore #8
/*    */     //   47: aload #8
/*    */     //   49: ifnonnull -> 65
/*    */     //   52: aload #9
/*    */     //   54: monitorexit
/*    */     //   55: iload #7
/*    */     //   57: ifne -> 84
/*    */     //   60: iload #7
/*    */     //   62: ifeq -> 34
/*    */     //   65: aload #8
/*    */     //   67: getstatic me/konsolas/aac/lH.e : Lme/konsolas/aac/lH;
/*    */     //   70: if_acmpne -> 81
/*    */     //   73: aconst_null
/*    */     //   74: putstatic me/konsolas/aac/lH.e : Lme/konsolas/aac/lH;
/*    */     //   77: aload #9
/*    */     //   79: monitorexit
/*    */     //   80: return
/*    */     //   81: aload #9
/*    */     //   83: monitorexit
/*    */     //   84: goto -> 95
/*    */     //   87: astore #10
/*    */     //   89: aload #9
/*    */     //   91: monitorexit
/*    */     //   92: aload #10
/*    */     //   94: athrow
/*    */     //   95: aload #8
/*    */     //   97: lload_3
/*    */     //   98: invokevirtual c : (J)V
/*    */     //   101: goto -> 34
/*    */     //   104: astore #8
/*    */     //   106: goto -> 34
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 34
/*    */     //   #3	-> 40
/*    */     //   #4	-> 47
/*    */     //   #5	-> 65
/*    */     //   #11	-> 73
/*    */     //   #9	-> 77
/*    */     //   #2	-> 81
/*    */     //   #1	-> 95
/*    */     //   #6	-> 101
/*    */     //   #7	-> 104
/*    */     //   #10	-> 106
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   34	55	104	java/lang/InterruptedException
/*    */     //   40	55	87	finally
/*    */     //   65	80	87	finally
/*    */     //   65	80	104	java/lang/InterruptedException
/*    */     //   81	84	87	finally
/*    */     //   81	101	104	java/lang/InterruptedException
/*    */     //   87	92	87	finally
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\md.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */