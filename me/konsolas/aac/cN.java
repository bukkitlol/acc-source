package me.konsolas.aac;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

public class cn extends ProxySelector {
  private static boolean b;
  
  private static final long a;
  
  private static final String c;
  
  public List select(URI paramURI) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/cn.a : J
    //   3: ldc2_w 8995839210275
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ifnonnull -> 33
    //   12: new java/lang/IllegalArgumentException
    //   15: dup
    //   16: getstatic me/konsolas/aac/cn.c : Ljava/lang/String;
    //   19: invokespecial <init> : (Ljava/lang/String;)V
    //   22: athrow
    //   23: ldc2_w 5015622759084718054
    //   26: lload_2
    //   27: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   32: athrow
    //   33: getstatic java/net/Proxy.NO_PROXY : Ljava/net/Proxy;
    //   36: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   39: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #2	-> 8
    //   #3	-> 12
    //   #1	-> 33
    // Exception table:
    //   from	to	target	type
    //   8	23	23	java/lang/IllegalArgumentException
  }
  
  public void connectFailed(URI paramURI, SocketAddress paramSocketAddress, IOException paramIOException) {}
  
  public static void b(boolean paramBoolean) {
    b = paramBoolean;
  }
  
  public static boolean b() {
    return b;
  }
  
  public static boolean c() {
    boolean bool = b();
    try {
      if (!bool)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -6479765747687055594
    //   3: ldc2_w 5160130218451436086
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
    //   15: ldc2_w 97646805892664
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/konsolas/aac/cn.a : J
    //   26: getstatic me/konsolas/aac/cn.a : J
    //   29: ldc2_w 52025137965628
    //   32: lxor
    //   33: lstore_3
    //   34: ldc2_w -7166273258142690034
    //   37: lload_3
    //   38: <illegal opcode> w : (JJ)Z
    //   43: ifeq -> 56
    //   46: iconst_1
    //   47: ldc2_w -7160494975769980049
    //   50: lload_3
    //   51: <illegal opcode> w : (ZJJ)V
    //   56: ldc 'ࡘֻ湰艂샽૓퉀텍≱븽윃妋හ矌㉹㺏䧚'
    //   58: invokevirtual toCharArray : ()[C
    //   61: dup
    //   62: dup
    //   63: iconst_5
    //   64: dup_x1
    //   65: caload
    //   66: sipush #15811
    //   69: ixor
    //   70: i2c
    //   71: castore
    //   72: sipush #15152
    //   75: iconst_1
    //   76: iconst_3
    //   77: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
    //   80: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   83: dup
    //   84: astore_0
    //   85: iconst_2
    //   86: ldc '멂䍧꽦˥'
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup
    //   92: dup
    //   93: iconst_0
    //   94: dup_x1
    //   95: caload
    //   96: sipush #31090
    //   99: ixor
    //   100: i2c
    //   101: castore
    //   102: sipush #9010
    //   105: iconst_0
    //   106: iconst_0
    //   107: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
    //   110: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
    //   113: bipush #8
    //   115: newarray byte
    //   117: dup
    //   118: iconst_0
    //   119: lload_3
    //   120: bipush #56
    //   122: lushr
    //   123: l2i
    //   124: i2b
    //   125: bastore
    //   126: iconst_1
    //   127: istore_1
    //   128: iload_1
    //   129: bipush #8
    //   131: if_icmpge -> 154
    //   134: dup
    //   135: iload_1
    //   136: lload_3
    //   137: iload_1
    //   138: bipush #8
    //   140: imul
    //   141: lshl
    //   142: bipush #56
    //   144: lushr
    //   145: l2i
    //   146: i2b
    //   147: bastore
    //   148: iinc #1, 1
    //   151: goto -> 128
    //   154: new javax/crypto/spec/DESKeySpec
    //   157: dup_x1
    //   158: swap
    //   159: invokespecial <init> : ([B)V
    //   162: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    //   165: new javax/crypto/spec/IvParameterSpec
    //   168: dup
    //   169: bipush #8
    //   171: newarray byte
    //   173: invokespecial <init> : ([B)V
    //   176: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   179: ldc '者렵밭ꠇ岰门㗍녭䥪ుꀴᙋ굕扬鿁濫⻕えﳘ齯⊆ၠ'
    //   181: invokevirtual toCharArray : ()[C
    //   184: dup
    //   185: dup
    //   186: iconst_0
    //   187: dup_x1
    //   188: caload
    //   189: sipush #7648
    //   192: ixor
    //   193: i2c
    //   194: castore
    //   195: sipush #18793
    //   198: iconst_1
    //   199: iconst_1
    //   200: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
    //   203: iconst_m1
    //   204: goto -> 213
    //   207: putstatic me/konsolas/aac/cn.c : Ljava/lang/String;
    //   210: goto -> 259
    //   213: swap
    //   214: ldc 'ᵕ픥篤נ돣♔✅둲䤢↏'
    //   216: invokevirtual toCharArray : ()[C
    //   219: dup
    //   220: dup
    //   221: iconst_3
    //   222: dup_x1
    //   223: caload
    //   224: sipush #991
    //   227: ixor
    //   228: i2c
    //   229: castore
    //   230: sipush #24530
    //   233: iconst_1
    //   234: iconst_3
    //   235: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
    //   238: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   241: aload_0
    //   242: swap
    //   243: invokevirtual doFinal : ([B)[B
    //   246: astore_2
    //   247: aload_2
    //   248: invokestatic a : ([B)Ljava/lang/String;
    //   251: invokevirtual intern : ()Ljava/lang/String;
    //   254: swap
    //   255: pop
    //   256: goto -> 207
    //   259: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */