/*    */ package me.konsolas.aac;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.sql.Connection;
/*    */ import java.sql.SQLException;
/*    */ import java.util.function.Supplier;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ class kc implements AutoCloseable {
/*    */   public g8 a() {
/* 12 */     return this.b;
/*    */   }
/*    */   
/*    */   private final Supplier c;
/*    */   
/*    */   private final g8 b;
/*    */   private Connection a;
/*    */   private static final long d = nc.a(-5616344692560075906L, 3149539710499780868L, MethodHandles.lookup().lookupClass()).a(260457291023396L);
/*    */   private static final String e;
/*    */   
/*    */   kc(Supplier paramSupplier, long paramLong, g8 paramg8) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/kc.d : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: aload_0
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: aload_0
/*    */     //   11: aload_1
/*    */     //   12: putfield c : Ljava/util/function/Supplier;
/*    */     //   15: aload_0
/*    */     //   16: aload #4
/*    */     //   18: putfield b : Lme/konsolas/aac/g8;
/*    */     //   21: aload_0
/*    */     //   22: aload_1
/*    */     //   23: ldc2_w -8318019097970936650
/*    */     //   26: lload_2
/*    */     //   27: <illegal opcode> b : (Ljava/util/function/Supplier;JJ)Ljava/lang/Object;
/*    */     //   32: checkcast java/sql/Connection
/*    */     //   35: putfield a : Ljava/sql/Connection;
/*    */     //   38: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 6
/*    */     //   #7	-> 10
/*    */     //   #5	-> 15
/*    */     //   #3	-> 21
/*    */     //   #6	-> 38
/*    */   }
/*    */   
/*    */   public Connection a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/kc.d : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w -3367957479792538963
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore_3
/*    */     //   16: aload_0
/*    */     //   17: iload_3
/*    */     //   18: ifeq -> 111
/*    */     //   21: getfield a : Ljava/sql/Connection;
/*    */     //   24: ifnull -> 88
/*    */     //   27: goto -> 40
/*    */     //   30: ldc2_w -3372587519572736916
/*    */     //   33: lload_1
/*    */     //   34: <illegal opcode> w : (Ljava/sql/SQLException;JJ)Ljava/sql/SQLException;
/*    */     //   39: athrow
/*    */     //   40: aload_0
/*    */     //   41: iload_3
/*    */     //   42: ifeq -> 111
/*    */     //   45: goto -> 58
/*    */     //   48: ldc2_w -3372587519572736916
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Ljava/sql/SQLException;JJ)Ljava/sql/SQLException;
/*    */     //   57: athrow
/*    */     //   58: getfield a : Ljava/sql/Connection;
/*    */     //   61: bipush #30
/*    */     //   63: ldc2_w -3350272116160358492
/*    */     //   66: lload_1
/*    */     //   67: <illegal opcode> b : (Ljava/sql/Connection;IJJ)Z
/*    */     //   72: ifne -> 130
/*    */     //   75: goto -> 88
/*    */     //   78: ldc2_w -3372587519572736916
/*    */     //   81: lload_1
/*    */     //   82: <illegal opcode> w : (Ljava/sql/SQLException;JJ)Ljava/sql/SQLException;
/*    */     //   87: athrow
/*    */     //   88: invokestatic getLogger : ()Ljava/util/logging/Logger;
/*    */     //   91: getstatic me/konsolas/aac/kc.e : Ljava/lang/String;
/*    */     //   94: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   97: aload_0
/*    */     //   98: goto -> 111
/*    */     //   101: ldc2_w -3372587519572736916
/*    */     //   104: lload_1
/*    */     //   105: <illegal opcode> w : (Ljava/sql/SQLException;JJ)Ljava/sql/SQLException;
/*    */     //   110: athrow
/*    */     //   111: aload_0
/*    */     //   112: getfield c : Ljava/util/function/Supplier;
/*    */     //   115: ldc2_w -3387414981955442469
/*    */     //   118: lload_1
/*    */     //   119: <illegal opcode> b : (Ljava/util/function/Supplier;JJ)Ljava/lang/Object;
/*    */     //   124: checkcast java/sql/Connection
/*    */     //   127: putfield a : Ljava/sql/Connection;
/*    */     //   130: new me/konsolas/aac/dH
/*    */     //   133: dup
/*    */     //   134: aload_0
/*    */     //   135: getfield a : Ljava/sql/Connection;
/*    */     //   138: invokespecial <init> : (Ljava/sql/Connection;)V
/*    */     //   141: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 16
/*    */     //   #4	-> 88
/*    */     //   #1	-> 97
/*    */     //   #10	-> 130
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   16	27	30	java/sql/SQLException
/*    */     //   21	45	48	java/sql/SQLException
/*    */     //   40	75	78	java/sql/SQLException
/*    */     //   58	98	101	java/sql/SQLException
/*    */   }
/*    */   
/*    */   public void close() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/kc.d : J
/*    */     //   3: ldc2_w 116852508372133
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: aload_0
/*    */     //   9: getfield a : Ljava/sql/Connection;
/*    */     //   12: ldc2_w 4514676274729349000
/*    */     //   15: lload_1
/*    */     //   16: <illegal opcode> b : (Ljava/sql/Connection;JJ)V
/*    */     //   21: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 8
/*    */     //   #11	-> 21
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = d ^ 0x6A5D32BB91E1L;
/*    */     "芟⧛疌鹋ᛰ㒣㊌ɕ莥兑뎂苬뛞张暩厲観犿㘼".toCharArray()[15] = (char)("芟⧛疌鹋ᛰ㒣㊌ɕ莥兑뎂苬뛞张暩厲観犿㘼".toCharArray()[15] ^ 0x647);
/*    */     "쿗믔蛕⍼".toCharArray()[2] = (char)("쿗믔蛕⍼".toCharArray()[2] ^ 0x7F17);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b = 1; b < 8; b++)
/*    */       (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("芟⧛疌鹋ᛰ㒣㊌ɕ莥兑뎂苬뛞张暩厲観犿㘼".toCharArray(), (short)2066, true, (byte)5))).init(2, SecretKeyFactory.getInstance(a0$cc.G("쿗믔蛕⍼".toCharArray(), (short)27431, false, (byte)1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     "ஜ尫쉄鵖෡뵯㠧ٳ츒䞐ㅟ풼귪ꩲ擸㚗ᡞ碉䦿㝿ᡟ쏴花㺤Ь攌暖졅禌㯚䢖ꛕ儗齜մ".toCharArray()[18] = (char)("ஜ尫쉄鵖෡뵯㠧ٳ츒䞐ㅟ풼귪ꩲ擸㚗ᡞ碉䦿㝿ᡟ쏴花㺤Ь攌暖졅禌㯚䢖ꛕ儗齜մ".toCharArray()[18] ^ 0x6FF7);
/*    */   }
/*    */   
/*    */   private static SQLException a(SQLException paramSQLException) {
/*    */     return paramSQLException;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */