/*    */ package me.konsolas.aac;
/*    */ public class he extends hO { private final List a;
/*  3 */   public boolean a() { return false; } private static final long c = nc.a(-5511868544638813976L, 4418822617759964986L, MethodHandles.lookup().lookupClass()).a(155603556796041L); private static final String d; public Collection a() {
/*  4 */     return Collections.unmodifiableList(this.a);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public he(long paramLong, List paramList) {
/* 11 */     this.a = paramList;
/*    */     if (paramList.size() < 2)
/*    */       throw new IllegalArgumentException(d + paramList.size()); 
/*    */   }
/*    */   
/*    */   public Collection a(int paramInt1, char paramChar, int paramInt2, int paramInt3, short paramShort, int paramInt4) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload #5
/*    */     //   7: i2l
/*    */     //   8: bipush #48
/*    */     //   10: lshl
/*    */     //   11: bipush #16
/*    */     //   13: lushr
/*    */     //   14: lor
/*    */     //   15: iload #6
/*    */     //   17: i2l
/*    */     //   18: bipush #32
/*    */     //   20: lshl
/*    */     //   21: bipush #32
/*    */     //   23: lushr
/*    */     //   24: lor
/*    */     //   25: lstore #7
/*    */     //   27: ldc2_w 6740874132757701372
/*    */     //   30: lload #7
/*    */     //   32: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   37: new java/util/ArrayList
/*    */     //   40: dup
/*    */     //   41: aload_0
/*    */     //   42: getfield a : Ljava/util/List;
/*    */     //   45: invokeinterface size : ()I
/*    */     //   50: invokespecial <init> : (I)V
/*    */     //   53: astore #10
/*    */     //   55: astore #9
/*    */     //   57: aload_0
/*    */     //   58: getfield a : Ljava/util/List;
/*    */     //   61: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   66: astore #11
/*    */     //   68: aload #11
/*    */     //   70: invokeinterface hasNext : ()Z
/*    */     //   75: ifeq -> 143
/*    */     //   78: aload #11
/*    */     //   80: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   85: checkcast me/konsolas/aac/lq
/*    */     //   88: astore #12
/*    */     //   90: iload_2
/*    */     //   91: iflt -> 119
/*    */     //   94: aload #10
/*    */     //   96: aload #9
/*    */     //   98: ifnull -> 145
/*    */     //   101: aload #12
/*    */     //   103: iload_1
/*    */     //   104: i2d
/*    */     //   105: iload_3
/*    */     //   106: i2d
/*    */     //   107: iload #4
/*    */     //   109: i2d
/*    */     //   110: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*    */     //   113: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   118: pop
/*    */     //   119: aload #9
/*    */     //   121: ifnonnull -> 68
/*    */     //   124: iload #6
/*    */     //   126: ifgt -> 90
/*    */     //   129: goto -> 143
/*    */     //   132: ldc2_w 6657723570094877093
/*    */     //   135: lload #7
/*    */     //   137: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   142: athrow
/*    */     //   143: aload #10
/*    */     //   145: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 37
/*    */     //   #1	-> 57
/*    */     //   #6	-> 90
/*    */     //   #2	-> 119
/*    */     //   #10	-> 143
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   90	124	132	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = c ^ 0x1670E4CDBF9BL;
/*    */     "궜렂궠䩃⤈랅ꛜ핵㞔俺廓싛?스ꗉ뷉䪪戊".toCharArray()[2] = (char)("궜렂궠䩃⤈랅ꛜ핵㞔俺廓싛?스ꗉ뷉䪪戊".toCharArray()[2] ^ 0x24EF);
/*    */     "⦱鼉慚࢛".toCharArray()[2] = (char)("⦱鼉慚࢛".toCharArray()[2] ^ 0x5C6A);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("궜렂궠䩃⤈랅ꛜ핵㞔俺廓싛?스ꗉ뷉䪪戊".toCharArray(), (short)16791, false, (byte)1))).init(2, SecretKeyFactory.getInstance(a0$cc.G("⦱鼉慚࢛".toCharArray(), (short)25160, true, (byte)0)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "ᦕ㢰䊃蜪ꪵ橼졹魇੥錷?彑哑⎇ㆪ?꼅ֱ㜁鑾亟".toCharArray()[18] = (char)("ᦕ㢰䊃蜪ꪵ橼졹魇੥錷?彑哑⎇ㆪ?꼅ֱ㜁鑾亟".toCharArray()[18] ^ 0x5517);
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\he.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */