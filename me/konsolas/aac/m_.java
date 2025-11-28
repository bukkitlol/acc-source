package me.konsolas.aac;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class m_ extends mf {
  private long d;
  
  final iL e;
  
  private static final long f = nc.a(-1145914979533856234L, -5995392624462498184L, MethodHandles.lookup().lookupClass()).a(259488090569345L);
  
  private static final String[] g;
  
  private static final String[] h;
  
  private static final Map j = new HashMap<>(13);
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 170
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w '쩴㡿ﱅ䢿?᧚皋㻧㯀廄懊阮?ుഃᅌ剋'
    //   69: invokevirtual toCharArray : ()[C
    //   72: dup
    //   73: dup
    //   74: iconst_5
    //   75: dup_x1
    //   76: caload
    //   77: sipush #17120
    //   80: ixor
    //   81: i2c
    //   82: castore
    //   83: sipush #15514
    //   86: iconst_0
    //   87: iconst_1
    //   88: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w '狁㑪梬城'
    //   97: invokevirtual toCharArray : ()[C
    //   100: dup
    //   101: dup
    //   102: iconst_2
    //   103: dup_x1
    //   104: caload
    //   105: sipush #11036
    //   108: ixor
    //   109: i2c
    //   110: castore
    //   111: sipush #1933
    //   114: iconst_0
    //   115: iconst_0
    //   116: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_1
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc_w '䡊趜ムῐ'
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup
    //   133: dup
    //   134: iconst_2
    //   135: dup_x1
    //   136: caload
    //   137: sipush #15231
    //   140: ixor
    //   141: i2c
    //   142: castore
    //   143: sipush #17485
    //   146: iconst_1
    //   147: iconst_0
    //   148: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: aload_2
    //   155: invokevirtual toString : ()Ljava/lang/String;
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: invokevirtual toString : ()Ljava/lang/String;
    //   164: aload #4
    //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   169: athrow
    //   170: aload_3
    //   171: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5CD0;
    if (h[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])j.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          "ꕊ嫪痘?螠虦㓵㏛桌㐿聮⧮ꠞ죾볌찵๡ᶭ佬".toCharArray()[1] = (char)("ꕊ嫪痘?螠虦㓵㏛桌㐿聮⧮ꠞ죾볌찵๡ᶭ佬".toCharArray()[1] ^ 0x687C);
          arrayOfObject[0] = Cipher.getInstance(fW$gy.A("ꕊ嫪痘?螠虦㓵㏛桌㐿聮⧮ꠞ죾볌찵๡ᶭ佬".toCharArray(), (short)18675, true, 2));
          "┇༹뾏堘".toCharArray()[1] = (char)("┇༹뾏堘".toCharArray()[1] ^ 0x6F90);
          arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("┇༹뾏堘".toCharArray(), (short)20118, true, 0));
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          j.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        "䈀乂ᖂႃꏇ냠ᓫ畮詯뛖⇧᜚基日ﲩ播牅，呔".toCharArray()[17] = (char)("䈀乂ᖂႃꏇ냠ᓫ畮詯뛖⇧᜚基日ﲩ播牅，呔".toCharArray()[17] ^ 0x6A7F);
        throw new RuntimeException(fW$gy.A("䈀乂ᖂႃꏇ냠ᓫ畮詯뛖⇧᜚基日ﲩ播牅，呔".toCharArray(), (short)3325, false, 5), exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      "ಜ秜읙瑇ゟ鈆ꪫ㈅͒".toCharArray()[7] = (char)("ಜ秜읙瑇ゟ鈆ꪫ㈅͒".toCharArray()[7] ^ 0x5A6B);
      byte[] arrayOfByte2 = g[i].getBytes(fW$gy.A("ಜ秜읙瑇ゟ鈆ꪫ㈅͒".toCharArray(), (short)27979, false, 3));
      h[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return h[i];
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    long l = f ^ 0x1767C46A163EL;
    "羻餃ᜀ₸蹳먱奝〉珒鎖\023飪ࢀ?鯡禒㗼᷎".toCharArray()[14] = (char)("羻餃ᜀ₸蹳먱奝〉珒鎖\023飪ࢀ?鯡禒㗼᷎".toCharArray()[14] ^ 0x30E5);
    "䏸䭌ࠢ㎨".toCharArray()[2] = (char)("䏸䭌ࠢ㎨".toCharArray()[2] ^ 0x51EE);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance(da$gx.U("羻餃ᜀ₸蹳먱奝〉珒鎖\023飪ࢀ?鯡禒㗼᷎".toCharArray(), (short)24593, true, true))).init(2, SecretKeyFactory.getInstance(da$gx.U("䏸䭌ࠢ㎨".toCharArray(), (short)10248, true, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    "⒛߷᣶枛❙耨鵲䃫ୢ蹗㤗㏇?齴꙽眸ꡖ䘶⎨殙᡿㕊렟ά楠㼆맫夽战튘淄奶椱掄✞樂㟽⼨৒㺩㍳庶忉꾜⦆㖦퀃鸣恽櫵䘙ṹ蕏㼏俹뭀藛∩葠珷ב琹✷雨跆ው忡گ쇼檘⤹᧹˽刞䃭彾차䐴㾦ೈ쒘甂䗪涚뾚嚏嗍摊".toCharArray()[46] = (char)("⒛߷᣶枛❙耨鵲䃫ୢ蹗㤗㏇?齴꙽眸ꡖ䘶⎨殙᡿㕊렟ά楠㼆맫夽战튘淄奶椱掄✞樂㟽⼨৒㺩㍳庶忉꾜⦆㖦퀃鸣恽櫵䘙ṹ蕏㼏俹뭀藛∩葠珷ב琹✷雨跆ው忡گ쇼檘⤹᧹˽刞䃭彾차䐴㾦ೈ쒘甂䗪涚뾚嚏嗍摊".toCharArray()[46] ^ 0x27CA);
    String str;
    int i = (str = da$gx.U("⒛߷᣶枛❙耨鵲䃫ୢ蹗㤗㏇?齴꙽眸ꡖ䘶⎨殙᡿㕊렟ά楠㼆맫夽战튘淄奶椱掄✞樂㟽⼨৒㺩㍳庶忉꾜⦆㖦퀃鸣恽櫵䘙ṹ蕏㼏俹뭀藛∩葠珷ב琹✷雨跆ው忡گ쇼檘⤹᧹˽刞䃭彾차䐴㾦ೈ쒘甂䗪涚뾚嚏嗍摊".toCharArray(), (short)26687, true, true)).length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  public void close() {
    // Byte code:
    //   0: getstatic me/konsolas/aac/m_.f : J
    //   3: ldc2_w 77931091231293
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 6482640850665
    //   13: lxor
    //   14: lstore_3
    //   15: dup2
    //   16: ldc2_w 96546413993947
    //   19: lxor
    //   20: lstore #5
    //   22: dup2
    //   23: ldc2_w 96312520035581
    //   26: lxor
    //   27: lstore #7
    //   29: pop2
    //   30: ldc2_w -6540232206830596408
    //   33: lload_1
    //   34: <illegal opcode> w : (JJ)Z
    //   39: istore #9
    //   41: aload_0
    //   42: getfield a : Z
    //   45: iload #9
    //   47: ifeq -> 91
    //   50: ifeq -> 67
    //   53: goto -> 66
    //   56: ldc2_w -6567001961513035601
    //   59: lload_1
    //   60: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   65: athrow
    //   66: return
    //   67: aload_0
    //   68: iload #9
    //   70: ifeq -> 172
    //   73: getfield d : J
    //   76: lconst_0
    //   77: lcmp
    //   78: goto -> 91
    //   81: ldc2_w -6567001961513035601
    //   84: lload_1
    //   85: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   90: athrow
    //   91: ifeq -> 171
    //   94: aload_0
    //   95: bipush #100
    //   97: iload #9
    //   99: ifeq -> 173
    //   102: goto -> 115
    //   105: ldc2_w -6567001961513035601
    //   108: lload_1
    //   109: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   114: athrow
    //   115: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   118: lload #7
    //   120: dup2_x2
    //   121: pop2
    //   122: invokestatic b : (Lme/konsolas/aac/hp;JILjava/util/concurrent/TimeUnit;)Z
    //   125: ifne -> 171
    //   128: goto -> 141
    //   131: ldc2_w -6567001961513035601
    //   134: lload_1
    //   135: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload_0
    //   142: getfield e : Lme/konsolas/aac/iL;
    //   145: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/el;
    //   148: lload #5
    //   150: invokevirtual a : (J)V
    //   153: aload_0
    //   154: lload_3
    //   155: invokevirtual a : (J)V
    //   158: goto -> 171
    //   161: ldc2_w -6567001961513035601
    //   164: lload_1
    //   165: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   170: athrow
    //   171: aload_0
    //   172: iconst_1
    //   173: putfield a : Z
    //   176: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #4	-> 41
    //   #6	-> 67
    //   #15	-> 141
    //   #2	-> 153
    //   #10	-> 171
    //   #20	-> 176
    // Exception table:
    //   from	to	target	type
    //   41	53	56	java/io/IOException
    //   67	78	81	java/io/IOException
    //   91	102	105	java/io/IOException
    //   94	128	131	java/io/IOException
    //   115	158	161	java/io/IOException
  }
  
  public long a(long paramLong1, fw paramfw, long paramLong2) {
    // Byte code:
    //   0: lload_1
    //   1: dup2
    //   2: ldc2_w 59621419606579
    //   5: lxor
    //   6: lstore #6
    //   8: dup2
    //   9: ldc2_w 110028954399489
    //   12: lxor
    //   13: lstore #8
    //   15: dup2
    //   16: ldc2_w 0
    //   19: lxor
    //   20: lstore #10
    //   22: pop2
    //   23: ldc2_w -8522862058668917232
    //   26: lload_1
    //   27: <illegal opcode> w : (JJ)Z
    //   32: istore #12
    //   34: lload #4
    //   36: lconst_0
    //   37: lcmp
    //   38: iload #12
    //   40: ifne -> 112
    //   43: ifge -> 108
    //   46: goto -> 59
    //   49: ldc2_w -8644833901099813771
    //   52: lload_1
    //   53: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   58: athrow
    //   59: new java/lang/IllegalArgumentException
    //   62: dup
    //   63: new java/lang/StringBuilder
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: sipush #31153
    //   73: ldc2_w 3863642274355817897
    //   76: lload_1
    //   77: lxor
    //   78: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: lload #4
    //   88: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokespecial <init> : (Ljava/lang/String;)V
    //   97: athrow
    //   98: ldc2_w -8644833901099813771
    //   101: lload_1
    //   102: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: getfield a : Z
    //   112: lload_1
    //   113: lconst_0
    //   114: lcmp
    //   115: iflt -> 194
    //   118: iload #12
    //   120: ifne -> 194
    //   123: ifeq -> 170
    //   126: goto -> 139
    //   129: ldc2_w -8644833901099813771
    //   132: lload_1
    //   133: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   138: athrow
    //   139: new java/lang/IllegalStateException
    //   142: dup
    //   143: sipush #20244
    //   146: ldc2_w 5206354311420615438
    //   149: lload_1
    //   150: lxor
    //   151: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: athrow
    //   160: ldc2_w -8644833901099813771
    //   163: lload_1
    //   164: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   169: athrow
    //   170: aload_0
    //   171: getfield d : J
    //   174: iload #12
    //   176: ifne -> 227
    //   179: lconst_0
    //   180: lcmp
    //   181: goto -> 194
    //   184: ldc2_w -8644833901099813771
    //   187: lload_1
    //   188: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   193: athrow
    //   194: ifne -> 211
    //   197: ldc2_w -1
    //   200: lreturn
    //   201: ldc2_w -8644833901099813771
    //   204: lload_1
    //   205: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   210: athrow
    //   211: aload_0
    //   212: lload #10
    //   214: aload_3
    //   215: aload_0
    //   216: getfield d : J
    //   219: lload #4
    //   221: invokestatic min : (JJ)J
    //   224: invokespecial a : (JLme/konsolas/aac/fw;J)J
    //   227: lstore #13
    //   229: lload #13
    //   231: ldc2_w -1
    //   234: lcmp
    //   235: lload_1
    //   236: lconst_0
    //   237: lcmp
    //   238: iflt -> 340
    //   241: iload #12
    //   243: ifne -> 340
    //   246: ifne -> 305
    //   249: goto -> 262
    //   252: ldc2_w -8644833901099813771
    //   255: lload_1
    //   256: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   261: athrow
    //   262: aload_0
    //   263: getfield e : Lme/konsolas/aac/iL;
    //   266: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/el;
    //   269: lload #8
    //   271: invokevirtual a : (J)V
    //   274: new java/net/ProtocolException
    //   277: dup
    //   278: sipush #27910
    //   281: ldc2_w 1859081253361629471
    //   284: lload_1
    //   285: lxor
    //   286: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   291: invokespecial <init> : (Ljava/lang/String;)V
    //   294: astore #15
    //   296: aload_0
    //   297: lload #6
    //   299: invokevirtual a : (J)V
    //   302: aload #15
    //   304: athrow
    //   305: aload_0
    //   306: dup
    //   307: getfield d : J
    //   310: lload #13
    //   312: lsub
    //   313: putfield d : J
    //   316: aload_0
    //   317: getfield d : J
    //   320: iload #12
    //   322: ifne -> 364
    //   325: lconst_0
    //   326: lcmp
    //   327: goto -> 340
    //   330: ldc2_w -8644833901099813771
    //   333: lload_1
    //   334: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   339: athrow
    //   340: ifne -> 362
    //   343: aload_0
    //   344: lload #6
    //   346: invokevirtual a : (J)V
    //   349: goto -> 362
    //   352: ldc2_w -8644833901099813771
    //   355: lload_1
    //   356: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   361: athrow
    //   362: lload #13
    //   364: lreturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #8	-> 34
    //   #13	-> 108
    //   #19	-> 170
    //   #18	-> 211
    //   #21	-> 229
    //   #5	-> 262
    //   #24	-> 274
    //   #12	-> 296
    //   #7	-> 302
    //   #1	-> 305
    //   #23	-> 316
    //   #22	-> 343
    //   #3	-> 362
    // Exception table:
    //   from	to	target	type
    //   34	46	49	java/io/IOException
    //   43	98	98	java/io/IOException
    //   112	126	129	java/io/IOException
    //   123	160	160	java/io/IOException
    //   170	181	184	java/io/IOException
    //   194	201	201	java/io/IOException
    //   229	249	252	java/io/IOException
    //   305	327	330	java/io/IOException
    //   340	349	352	java/io/IOException
  }
  
  m_(iL paramiL, long paramLong1, long paramLong2) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/m_.f : J
    //   3: lload #4
    //   5: lxor
    //   6: lstore #4
    //   8: lload #4
    //   10: dup2
    //   11: ldc2_w 79169371381333
    //   14: lxor
    //   15: lstore #6
    //   17: dup2
    //   18: ldc2_w 65159295655579
    //   21: lxor
    //   22: lstore #8
    //   24: pop2
    //   25: aload_0
    //   26: aload_1
    //   27: putfield e : Lme/konsolas/aac/iL;
    //   30: ldc2_w -756568926119764364
    //   33: lload #4
    //   35: <illegal opcode> w : (JJ)Z
    //   40: aload_0
    //   41: lload #8
    //   43: aload_1
    //   44: aconst_null
    //   45: invokespecial <init> : (JLme/konsolas/aac/iL;Lme/konsolas/aac/cL;)V
    //   48: aload_0
    //   49: lload_2
    //   50: putfield d : J
    //   53: istore #10
    //   55: aload_0
    //   56: iload #10
    //   58: ifeq -> 98
    //   61: getfield d : J
    //   64: lconst_0
    //   65: lcmp
    //   66: ifne -> 103
    //   69: goto -> 83
    //   72: ldc2_w -837353531802679277
    //   75: lload #4
    //   77: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: goto -> 98
    //   87: ldc2_w -837353531802679277
    //   90: lload #4
    //   92: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   97: athrow
    //   98: lload #6
    //   100: invokevirtual a : (J)V
    //   103: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 25
    //   #17	-> 48
    //   #9	-> 55
    //   #14	-> 83
    //   #16	-> 103
    // Exception table:
    //   from	to	target	type
    //   55	69	72	java/lang/IllegalArgumentException
    //   61	84	87	java/lang/IllegalArgumentException
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\m_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */