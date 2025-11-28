package me.konsolas.aac;

public final class j6 {
  private static String[] b;
  
  private static final long a;
  
  public static char a(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/j6.a : J
    //   3: ldc2_w 106949816333214
    //   6: lxor
    //   7: lstore_2
    //   8: lload_0
    //   9: lconst_0
    //   10: lcmp
    //   11: iflt -> 35
    //   14: ldc2_w 65535
    //   17: lload_0
    //   18: lcmp
    //   19: ifge -> 94
    //   22: goto -> 35
    //   25: ldc2_w -6853235903451308982
    //   28: lload_2
    //   29: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   34: athrow
    //   35: new java/lang/IllegalArgumentException
    //   38: dup
    //   39: new java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: lload_0
    //   47: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   50: ldc '药㯼걍妃偹뛣゗뭝큰Ố?ﾑ龫ܚ?쬧쬱丮ࢁ놔Ꟁ䈨톞뽷쯜Ó⽄龶Ṿ⩸贐꽁膵ᑿ㡣'
    //   52: invokevirtual toCharArray : ()[C
    //   55: dup
    //   56: dup
    //   57: iconst_4
    //   58: dup_x1
    //   59: caload
    //   60: sipush #5124
    //   63: ixor
    //   64: i2c
    //   65: castore
    //   66: sipush #5795
    //   69: iconst_0
    //   70: iconst_0
    //   71: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual toString : ()Ljava/lang/String;
    //   80: invokespecial <init> : (Ljava/lang/String;)V
    //   83: athrow
    //   84: ldc2_w -6853235903451308982
    //   87: lload_2
    //   88: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   93: athrow
    //   94: lload_0
    //   95: l2i
    //   96: i2c
    //   97: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 8
    //   #16	-> 94
    // Exception table:
    //   from	to	target	type
    //   8	22	25	java/lang/IllegalArgumentException
    //   14	84	84	java/lang/IllegalArgumentException
  }
  
  public static short a(int paramInt) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/j6.a : J
    //   3: ldc2_w 131312735795268
    //   6: lxor
    //   7: lstore_1
    //   8: iload_0
    //   9: sipush #-32768
    //   12: if_icmplt -> 35
    //   15: sipush #32767
    //   18: iload_0
    //   19: if_icmpge -> 95
    //   22: goto -> 35
    //   25: ldc2_w -6107307250263271536
    //   28: lload_1
    //   29: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   34: athrow
    //   35: new java/lang/IllegalArgumentException
    //   38: dup
    //   39: new java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: iload_0
    //   47: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   50: ldc '憃壥镘ꨕ毡?蕡緥印㥭옴오굘葜槺黗沰䗢鑺桯ע뗓࣪蠙ꏔ↰ଢ଼㞥衸鐏嗞痉頁וּত蹩ᩋꮗ嘇⫋希杛'
    //   52: invokevirtual toCharArray : ()[C
    //   55: dup
    //   56: dup
    //   57: bipush #38
    //   59: dup_x1
    //   60: caload
    //   61: sipush #28983
    //   64: ixor
    //   65: i2c
    //   66: castore
    //   67: sipush #32299
    //   70: iconst_1
    //   71: iconst_3
    //   72: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokevirtual toString : ()Ljava/lang/String;
    //   81: invokespecial <init> : (Ljava/lang/String;)V
    //   84: athrow
    //   85: ldc2_w -6107307250263271536
    //   88: lload_1
    //   89: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   94: athrow
    //   95: iload_0
    //   96: i2s
    //   97: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #2	-> 8
    //   #9	-> 95
    // Exception table:
    //   from	to	target	type
    //   8	22	25	java/lang/IllegalArgumentException
    //   15	85	85	java/lang/IllegalArgumentException
  }
  
  public static char a(int paramInt) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/j6.a : J
    //   3: ldc2_w 88618971072265
    //   6: lxor
    //   7: lstore_1
    //   8: iload_0
    //   9: iflt -> 31
    //   12: ldc 65535
    //   14: iload_0
    //   15: if_icmpge -> 91
    //   18: goto -> 31
    //   21: ldc2_w -7749749801837532963
    //   24: lload_1
    //   25: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   30: athrow
    //   31: new java/lang/IllegalArgumentException
    //   34: dup
    //   35: new java/lang/StringBuilder
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: iload_0
    //   43: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   46: ldc 'ᅴ뜇䊻➂?࿃ȉ彏툑㱸꛳ꟃ⍾⛛㱭䶗ﰋ糠ﴞ窪词찞媣萦֎惍'
    //   48: invokevirtual toCharArray : ()[C
    //   51: dup
    //   52: dup
    //   53: bipush #28
    //   55: dup_x1
    //   56: caload
    //   57: sipush #17153
    //   60: ixor
    //   61: i2c
    //   62: castore
    //   63: sipush #3963
    //   66: iconst_1
    //   67: iconst_0
    //   68: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual toString : ()Ljava/lang/String;
    //   77: invokespecial <init> : (Ljava/lang/String;)V
    //   80: athrow
    //   81: ldc2_w -7749749801837532963
    //   84: lload_1
    //   85: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   90: athrow
    //   91: iload_0
    //   92: i2c
    //   93: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #5	-> 8
    //   #3	-> 91
    // Exception table:
    //   from	to	target	type
    //   8	18	21	java/lang/IllegalArgumentException
    //   12	81	81	java/lang/IllegalArgumentException
  }
  
  public static byte a(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/j6.a : J
    //   3: ldc2_w 26355658686221
    //   6: lxor
    //   7: lstore_2
    //   8: lload_0
    //   9: ldc2_w -128
    //   12: lcmp
    //   13: iflt -> 37
    //   16: ldc2_w 127
    //   19: lload_0
    //   20: lcmp
    //   21: ifge -> 97
    //   24: goto -> 37
    //   27: ldc2_w 7815747547698761945
    //   30: lload_2
    //   31: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: new java/lang/IllegalArgumentException
    //   40: dup
    //   41: new java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: lload_0
    //   49: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   52: ldc '貝뜁荦鲥脇ܦ?ᡚ굊꧐䃝瘻➯渒渠㟂ﲤ⌔몸ॸ껋?䖽蘈숕ៜﭹ圱宐震世맶蠈횪⚆㑵ऱ둚ਾܫ'
    //   54: invokevirtual toCharArray : ()[C
    //   57: dup
    //   58: dup
    //   59: bipush #29
    //   61: dup_x1
    //   62: caload
    //   63: sipush #27018
    //   66: ixor
    //   67: i2c
    //   68: castore
    //   69: sipush #18622
    //   72: iconst_0
    //   73: iconst_1
    //   74: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: invokespecial <init> : (Ljava/lang/String;)V
    //   86: athrow
    //   87: ldc2_w 7815747547698761945
    //   90: lload_2
    //   91: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   96: athrow
    //   97: lload_0
    //   98: l2i
    //   99: i2b
    //   100: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #6	-> 8
    //   #4	-> 97
    // Exception table:
    //   from	to	target	type
    //   8	24	27	java/lang/IllegalArgumentException
    //   16	87	87	java/lang/IllegalArgumentException
  }
  
  public static short a(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/j6.a : J
    //   3: ldc2_w 90657335055607
    //   6: lxor
    //   7: lstore_2
    //   8: lload_0
    //   9: ldc2_w -32768
    //   12: lcmp
    //   13: iflt -> 37
    //   16: ldc2_w 32767
    //   19: lload_0
    //   20: lcmp
    //   21: ifge -> 97
    //   24: goto -> 37
    //   27: ldc2_w -8679182537033254109
    //   30: lload_2
    //   31: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: new java/lang/IllegalArgumentException
    //   40: dup
    //   41: new java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: lload_0
    //   49: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   52: ldc '㟢׎㎷詀?ӟ沗ᘚ⿻陛?홀縹뚑欧꼏룅충礓啛䦨鸥ں邜开프⳩伀补㎑횉킦ꎺ푢즻㠚ⱊ繰枖粔'
    //   54: invokevirtual toCharArray : ()[C
    //   57: dup
    //   58: dup
    //   59: bipush #30
    //   61: dup_x1
    //   62: caload
    //   63: sipush #26180
    //   66: ixor
    //   67: i2c
    //   68: castore
    //   69: sipush #18569
    //   72: iconst_4
    //   73: iconst_2
    //   74: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: invokespecial <init> : (Ljava/lang/String;)V
    //   86: athrow
    //   87: ldc2_w -8679182537033254109
    //   90: lload_2
    //   91: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   96: athrow
    //   97: lload_0
    //   98: l2i
    //   99: i2s
    //   100: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #8	-> 8
    //   #18	-> 97
    // Exception table:
    //   from	to	target	type
    //   8	24	27	java/lang/IllegalArgumentException
    //   16	87	87	java/lang/IllegalArgumentException
  }
  
  public static byte a(int paramInt) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/j6.a : J
    //   3: ldc2_w 125663963126642
    //   6: lxor
    //   7: lstore_1
    //   8: iload_0
    //   9: bipush #-128
    //   11: if_icmplt -> 33
    //   14: bipush #127
    //   16: iload_0
    //   17: if_icmpge -> 93
    //   20: goto -> 33
    //   23: ldc2_w 578845928685401254
    //   26: lload_1
    //   27: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   32: athrow
    //   33: new java/lang/IllegalArgumentException
    //   36: dup
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: iload_0
    //   45: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   48: ldc '믃⼎Ỽ䥵ꥻꕍ먱᠛楖仅⟁⪊⁹벜丵霫됢ী鑅ᗌ⨉ᙐ犰䰤⿩퓯✯䬲ꟛᷖ甸☹ᜂ෎ࢺࡉ䤄㾏'
    //   50: invokevirtual toCharArray : ()[C
    //   53: dup
    //   54: dup
    //   55: bipush #21
    //   57: dup_x1
    //   58: caload
    //   59: sipush #24305
    //   62: ixor
    //   63: i2c
    //   64: castore
    //   65: sipush #26612
    //   68: iconst_0
    //   69: iconst_1
    //   70: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual toString : ()Ljava/lang/String;
    //   79: invokespecial <init> : (Ljava/lang/String;)V
    //   82: athrow
    //   83: ldc2_w 578845928685401254
    //   86: lload_1
    //   87: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   92: athrow
    //   93: iload_0
    //   94: i2b
    //   95: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 8
    //   #10	-> 93
    // Exception table:
    //   from	to	target	type
    //   8	20	23	java/lang/IllegalArgumentException
    //   14	83	83	java/lang/IllegalArgumentException
  }
  
  public static float a(double paramDouble) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/j6.a : J
    //   3: ldc2_w 1463740124385
    //   6: lxor
    //   7: lstore_2
    //   8: dload_0
    //   9: invokestatic isNaN : (D)Z
    //   12: ifeq -> 28
    //   15: ldc NaN
    //   17: freturn
    //   18: ldc2_w -2334260640988880075
    //   21: lload_2
    //   22: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   27: athrow
    //   28: dload_0
    //   29: invokestatic isInfinite : (D)Z
    //   32: ifeq -> 72
    //   35: dload_0
    //   36: dconst_0
    //   37: dcmpg
    //   38: ifge -> 69
    //   41: goto -> 54
    //   44: ldc2_w -2334260640988880075
    //   47: lload_2
    //   48: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   53: athrow
    //   54: ldc -Infinity
    //   56: goto -> 71
    //   59: ldc2_w -2334260640988880075
    //   62: lload_2
    //   63: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   68: athrow
    //   69: ldc Infinity
    //   71: freturn
    //   72: dload_0
    //   73: ldc2_w -3.4028234663852886E38
    //   76: dcmpg
    //   77: iflt -> 101
    //   80: ldc2_w 3.4028234663852886E38
    //   83: dload_0
    //   84: dcmpg
    //   85: ifge -> 161
    //   88: goto -> 101
    //   91: ldc2_w -2334260640988880075
    //   94: lload_2
    //   95: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   100: athrow
    //   101: new java/lang/IllegalArgumentException
    //   104: dup
    //   105: new java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: dload_0
    //   113: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   116: ldc '࿣ೀ㑾ﱾᜏ耇옍ꓻビ㛮䕳넔祗黥鴓䯷ョ棅茜軛闆롰槤ᖵ㱳隢䞏ꪠ㺨竨워顇皕垘ʽą龴ᨱ鵻Ĺ⧯ሐ੤'
    //   118: invokevirtual toCharArray : ()[C
    //   121: dup
    //   122: dup
    //   123: bipush #26
    //   125: dup_x1
    //   126: caload
    //   127: sipush #4543
    //   130: ixor
    //   131: i2c
    //   132: castore
    //   133: sipush #496
    //   136: iconst_1
    //   137: iconst_0
    //   138: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: invokevirtual toString : ()Ljava/lang/String;
    //   147: invokespecial <init> : (Ljava/lang/String;)V
    //   150: athrow
    //   151: ldc2_w -2334260640988880075
    //   154: lload_2
    //   155: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   160: athrow
    //   161: dload_0
    //   162: d2f
    //   163: fstore #4
    //   165: fload #4
    //   167: f2d
    //   168: dload_0
    //   169: dcmpl
    //   170: ifeq -> 233
    //   173: new java/lang/IllegalArgumentException
    //   176: dup
    //   177: new java/lang/StringBuilder
    //   180: dup
    //   181: invokespecial <init> : ()V
    //   184: dload_0
    //   185: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   188: ldc 'ꋻᴺ藰뿻⦎镆⹺劋鎃⃧洉걟ఋ࡜쁶む畀㵠㤧묣䜨뺅螴ⰨֶḲ성쾈๡麉⒇Ｚૡ⃈鎉∄໧'
    //   190: invokevirtual toCharArray : ()[C
    //   193: dup
    //   194: dup
    //   195: bipush #33
    //   197: dup_x1
    //   198: caload
    //   199: sipush #10959
    //   202: ixor
    //   203: i2c
    //   204: castore
    //   205: sipush #7753
    //   208: iconst_0
    //   209: iconst_2
    //   210: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual toString : ()Ljava/lang/String;
    //   219: invokespecial <init> : (Ljava/lang/String;)V
    //   222: athrow
    //   223: ldc2_w -2334260640988880075
    //   226: lload_2
    //   227: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   232: athrow
    //   233: fload #4
    //   235: freturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 8
    //   #15	-> 28
    //   #17	-> 72
    //   #13	-> 161
    //   #7	-> 165
    //   #19	-> 233
    // Exception table:
    //   from	to	target	type
    //   8	18	18	java/lang/IllegalArgumentException
    //   28	41	44	java/lang/IllegalArgumentException
    //   35	59	59	java/lang/IllegalArgumentException
    //   72	88	91	java/lang/IllegalArgumentException
    //   80	151	151	java/lang/IllegalArgumentException
    //   165	223	223	java/lang/IllegalArgumentException
  }
  
  public static int a(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/j6.a : J
    //   3: ldc2_w 114705769795285
    //   6: lxor
    //   7: lstore_2
    //   8: lload_0
    //   9: ldc2_w -2147483648
    //   12: lcmp
    //   13: iflt -> 37
    //   16: ldc2_w 2147483647
    //   19: lload_0
    //   20: lcmp
    //   21: ifge -> 97
    //   24: goto -> 37
    //   27: ldc2_w -7084334462280736511
    //   30: lload_2
    //   31: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: new java/lang/IllegalArgumentException
    //   40: dup
    //   41: new java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: lload_0
    //   49: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   52: ldc 'ஹ⡨磌铕◦솈蓵뤰㦼췩ҀᏟ쀗쁶⣤쀪ಧɴḪ맻㉭쥾攘哬퍔羔찗?躱龽눸Ӝ뿴퀗臝㐍㤵聚魵느᱔'
    //   54: invokevirtual toCharArray : ()[C
    //   57: dup
    //   58: dup
    //   59: bipush #24
    //   61: dup_x1
    //   62: caload
    //   63: sipush #13361
    //   66: ixor
    //   67: i2c
    //   68: castore
    //   69: sipush #13522
    //   72: iconst_0
    //   73: iconst_5
    //   74: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: invokespecial <init> : (Ljava/lang/String;)V
    //   86: athrow
    //   87: ldc2_w -7084334462280736511
    //   90: lload_2
    //   91: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   96: athrow
    //   97: lload_0
    //   98: l2i
    //   99: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 8
    //   #21	-> 97
    // Exception table:
    //   from	to	target	type
    //   8	24	27	java/lang/IllegalArgumentException
    //   16	87	87	java/lang/IllegalArgumentException
  }
  
  public static void b(String[] paramArrayOfString) {
    b = paramArrayOfString;
  }
  
  public static String[] b() {
    return b;
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -5367300373452032
    //   3: ldc2_w -9022279042186237666
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
    //   15: ldc2_w 19815571176614
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/konsolas/aac/j6.a : J
    //   26: getstatic me/konsolas/aac/j6.a : J
    //   29: ldc2_w 54878789497284
    //   32: lxor
    //   33: lstore_0
    //   34: ldc2_w -2137341682272051954
    //   37: lload_0
    //   38: <illegal opcode> w : (JJ)[Ljava/lang/String;
    //   43: ifnonnull -> 59
    //   46: iconst_1
    //   47: anewarray java/lang/String
    //   50: ldc2_w -2071084596984346598
    //   53: lload_0
    //   54: <illegal opcode> w : ([Ljava/lang/String;JJ)V
    //   59: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\j6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */