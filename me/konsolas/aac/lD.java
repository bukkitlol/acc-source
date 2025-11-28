/*    */ package me.konsolas.aac;
/*    */ import java.io.IOException;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ class ld extends lH {
/*    */   protected void c(long paramLong) {
/* 10 */     int i = (int)((paramLong ^ 0x14A99F768BF6L) >>> 48L), j = (int)((paramLong ^ 0x14A99F768BF6L) << 16L >>> 32L), k = (int)((paramLong ^ 0x14A99F768BF6L) << 48L >>> 48L); paramLong ^ 0x14A99F768BF6L; long l = (paramLong ^ 0x1E4E3E6CEB1CL) >>> 16L; int m = (int)((paramLong ^ 0x1E4E3E6CEB1CL) << 48L >>> 48L); paramLong ^ 0x1E4E3E6CEB1CL; this.l.b(l, (short)m, eb.CANCEL);
/*    */     this.l.b.d((char)i, j, (short)k);
/*    */   }
/*    */   
/*    */   final cQ l;
/*    */   private static final long m = nc.a(-3227303961856602380L, -4678846978623906352L, MethodHandles.lookup().lookupClass()).a(70802721209994L);
/*    */   private static final String v;
/*    */   
/*    */   ld(cQ paramcQ) {}
/*    */   
/*    */   protected IOException a(long paramLong, IOException paramIOException) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -302535211157151797
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   9: new java/net/SocketTimeoutException
/*    */     //   12: dup
/*    */     //   13: getstatic me/konsolas/aac/ld.v : Ljava/lang/String;
/*    */     //   16: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   19: astore #5
/*    */     //   21: astore #4
/*    */     //   23: aload_3
/*    */     //   24: aload #4
/*    */     //   26: ifnull -> 64
/*    */     //   29: ifnull -> 65
/*    */     //   32: goto -> 45
/*    */     //   35: ldc2_w -353010178962964258
/*    */     //   38: lload_1
/*    */     //   39: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   44: athrow
/*    */     //   45: aload #5
/*    */     //   47: aload_3
/*    */     //   48: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*    */     //   51: goto -> 64
/*    */     //   54: ldc2_w -353010178962964258
/*    */     //   57: lload_1
/*    */     //   58: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   63: athrow
/*    */     //   64: pop
/*    */     //   65: aload #5
/*    */     //   67: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 9
/*    */     //   #2	-> 23
/*    */     //   #1	-> 45
/*    */     //   #9	-> 65
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   23	32	35	aacinternal/v
/*    */     //   29	51	54	aacinternal/v
/*    */   }
/*    */   
/*    */   public void d(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ld.m : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 95691335670392
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 83828562342948
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: pop2
/*    */     //   21: ldc2_w -3465130781351859217
/*    */     //   24: lload_1
/*    */     //   25: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   30: astore #7
/*    */     //   32: aload_0
/*    */     //   33: aload #7
/*    */     //   35: ifnull -> 72
/*    */     //   38: lload_3
/*    */     //   39: invokevirtual b : (J)Z
/*    */     //   42: ifeq -> 79
/*    */     //   45: goto -> 58
/*    */     //   48: ldc2_w -3513485966096534278
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   57: athrow
/*    */     //   58: aload_0
/*    */     //   59: goto -> 72
/*    */     //   62: ldc2_w -3513485966096534278
/*    */     //   65: lload_1
/*    */     //   66: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   71: athrow
/*    */     //   72: lload #5
/*    */     //   74: aconst_null
/*    */     //   75: invokevirtual a : (JLjava/io/IOException;)Ljava/io/IOException;
/*    */     //   78: athrow
/*    */     //   79: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 32
/*    */     //   #7	-> 79
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   32	45	48	java/io/IOException
/*    */     //   38	59	62	java/io/IOException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = m ^ 0x41C3DF744FE8L;
/*    */     "㝂䨂➜⎳輻䫷죷㮄쐤悏殹ⷩ塪肵ఠ䋨ዉ幆駪࿀".toCharArray()[12] = (char)("㝂䨂➜⎳輻䫷죷㮄쐤悏殹ⷩ塪肵ఠ䋨ዉ幆駪࿀".toCharArray()[12] ^ 0x346B);
/*    */     "㘼倕Ỗ".toCharArray()[2] = (char)("㘼倕Ỗ".toCharArray()[2] ^ 0x2E94);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(hY$g6.H("㝂䨂➜⎳輻䫷죷㮄쐤悏殹ⷩ塪肵ఠ䋨ዉ幆駪࿀".toCharArray(), (short)7339, (byte)2, (byte)2))).init(2, SecretKeyFactory.getInstance(hY$g6.H("㘼倕Ỗ".toCharArray(), (short)32267, (byte)4, (byte)2)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "鱁蠡㺚声┊䝻跉蚔帮".toCharArray()[6] = (char)("鱁蠡㺚声┊䝻跉蚔帮".toCharArray()[6] ^ 0x323);
/*    */   }
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */   
/*    */   private static String c(byte[] paramArrayOfbyte) {
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ld.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */