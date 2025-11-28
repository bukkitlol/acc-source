/*    */ package me.konsolas.aac;
/*    */ class j2 implements j9 {
/*    */   private static final String[] b;
/*    */   
/*    */   public long a(File paramFile) {
/*  6 */     return paramFile.length();
/*    */   } private static final String[] c; private static final Map d = new HashMap<>(13); public void b(long paramLong, File paramFile) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -863556004487153897
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)Z
/*    */     //   9: istore #4
/*    */     //   11: aload_3
/*    */     //   12: invokevirtual delete : ()Z
/*    */     //   15: lload_1
/*    */     //   16: lconst_0
/*    */     //   17: lcmp
/*    */     //   18: iflt -> 59
/*    */     //   21: iload #4
/*    */     //   23: ifeq -> 59
/*    */     //   26: ifne -> 110
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w -745537961916103264
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   41: athrow
/*    */     //   42: aload_3
/*    */     //   43: invokevirtual exists : ()Z
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w -745537961916103264
/*    */     //   52: lload_1
/*    */     //   53: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   58: athrow
/*    */     //   59: ifeq -> 110
/*    */     //   62: new java/io/IOException
/*    */     //   65: dup
/*    */     //   66: new java/lang/StringBuilder
/*    */     //   69: dup
/*    */     //   70: invokespecial <init> : ()V
/*    */     //   73: sipush #8956
/*    */     //   76: ldc2_w 8539730155829756748
/*    */     //   79: lload_1
/*    */     //   80: lxor
/*    */     //   81: <illegal opcode> z : (IJ)Ljava/lang/String;
/*    */     //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   89: aload_3
/*    */     //   90: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   93: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   96: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   99: athrow
/*    */     //   100: ldc2_w -745537961916103264
/*    */     //   103: lload_1
/*    */     //   104: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   109: athrow
/*    */     //   110: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 11
/*    */     //   #1	-> 62
/*    */     //   #2	-> 110
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   11	29	32	java/io/IOException
/*    */     //   26	46	49	java/io/IOException
/*    */     //   59	100	100	java/io/IOException
/*    */   } public void a(long paramLong, File paramFile) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: pop2
/*    */     //   9: ldc2_w -3742104872319643902
/*    */     //   12: lload_1
/*    */     //   13: <illegal opcode> w : (JJ)Z
/*    */     //   18: aload_3
/*    */     //   19: invokevirtual listFiles : ()[Ljava/io/File;
/*    */     //   22: astore #7
/*    */     //   24: istore #6
/*    */     //   26: aload #7
/*    */     //   28: iload #6
/*    */     //   30: ifeq -> 99
/*    */     //   33: ifnonnull -> 97
/*    */     //   36: goto -> 49
/*    */     //   39: ldc2_w -3624827886106690123
/*    */     //   42: lload_1
/*    */     //   43: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   48: athrow
/*    */     //   49: new java/io/IOException
/*    */     //   52: dup
/*    */     //   53: new java/lang/StringBuilder
/*    */     //   56: dup
/*    */     //   57: invokespecial <init> : ()V
/*    */     //   60: sipush #18567
/*    */     //   63: ldc2_w 8920546923237462310
/*    */     //   66: lload_1
/*    */     //   67: lxor
/*    */     //   68: <illegal opcode> z : (IJ)Ljava/lang/String;
/*    */     //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   76: aload_3
/*    */     //   77: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   80: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   83: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   86: athrow
/*    */     //   87: ldc2_w -3624827886106690123
/*    */     //   90: lload_1
/*    */     //   91: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   96: athrow
/*    */     //   97: aload #7
/*    */     //   99: astore #8
/*    */     //   101: aload #8
/*    */     //   103: arraylength
/*    */     //   104: istore #9
/*    */     //   106: iconst_0
/*    */     //   107: istore #10
/*    */     //   109: iload #10
/*    */     //   111: iload #9
/*    */     //   113: if_icmpge -> 266
/*    */     //   116: aload #8
/*    */     //   118: iload #10
/*    */     //   120: aaload
/*    */     //   121: astore #11
/*    */     //   123: aload #11
/*    */     //   125: invokevirtual isDirectory : ()Z
/*    */     //   128: lload_1
/*    */     //   129: lconst_0
/*    */     //   130: lcmp
/*    */     //   131: ifle -> 181
/*    */     //   134: iload #6
/*    */     //   136: ifeq -> 181
/*    */     //   139: ifeq -> 176
/*    */     //   142: goto -> 155
/*    */     //   145: ldc2_w -3624827886106690123
/*    */     //   148: lload_1
/*    */     //   149: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   154: athrow
/*    */     //   155: aload_0
/*    */     //   156: lload #4
/*    */     //   158: aload #11
/*    */     //   160: invokevirtual a : (JLjava/io/File;)V
/*    */     //   163: goto -> 176
/*    */     //   166: ldc2_w -3624827886106690123
/*    */     //   169: lload_1
/*    */     //   170: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   175: athrow
/*    */     //   176: aload #11
/*    */     //   178: invokevirtual delete : ()Z
/*    */     //   181: lload_1
/*    */     //   182: lconst_0
/*    */     //   183: lcmp
/*    */     //   184: ifle -> 244
/*    */     //   187: ifne -> 239
/*    */     //   190: new java/io/IOException
/*    */     //   193: dup
/*    */     //   194: new java/lang/StringBuilder
/*    */     //   197: dup
/*    */     //   198: invokespecial <init> : ()V
/*    */     //   201: sipush #17831
/*    */     //   204: ldc2_w 3837993376502144007
/*    */     //   207: lload_1
/*    */     //   208: lxor
/*    */     //   209: <illegal opcode> z : (IJ)Ljava/lang/String;
/*    */     //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   217: aload #11
/*    */     //   219: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   222: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   225: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   228: athrow
/*    */     //   229: ldc2_w -3624827886106690123
/*    */     //   232: lload_1
/*    */     //   233: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   238: athrow
/*    */     //   239: iinc #10, 1
/*    */     //   242: iload #6
/*    */     //   244: ifne -> 109
/*    */     //   247: iconst_3
/*    */     //   248: lload_1
/*    */     //   249: lconst_0
/*    */     //   250: lcmp
/*    */     //   251: iflt -> 128
/*    */     //   254: anewarray me/konsolas/aac/aN
/*    */     //   257: ldc2_w -3637267392821783472
/*    */     //   260: lload_1
/*    */     //   261: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   266: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 18
/*    */     //   #3	-> 26
/*    */     //   #20	-> 49
/*    */     //   #4	-> 97
/*    */     //   #29	-> 123
/*    */     //   #12	-> 155
/*    */     //   #7	-> 176
/*    */     //   #13	-> 190
/*    */     //   #15	-> 239
/*    */     //   #27	-> 266
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	36	39	java/io/IOException
/*    */     //   33	87	87	java/io/IOException
/*    */     //   123	142	145	java/io/IOException
/*    */     //   139	163	166	java/io/IOException
/*    */     //   181	229	229	java/io/IOException
/*    */   }
/*    */   public void a(File paramFile1, long paramLong, File paramFile2) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 9490183017601
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: pop2
/*    */     //   9: ldc2_w 2348044741637050558
/*    */     //   12: lload_2
/*    */     //   13: <illegal opcode> w : (JJ)Z
/*    */     //   18: aload_0
/*    */     //   19: lload #5
/*    */     //   21: aload #4
/*    */     //   23: invokevirtual b : (JLjava/io/File;)V
/*    */     //   26: istore #7
/*    */     //   28: aload_1
/*    */     //   29: aload #4
/*    */     //   31: invokevirtual renameTo : (Ljava/io/File;)Z
/*    */     //   34: ifne -> 106
/*    */     //   37: new java/io/IOException
/*    */     //   40: dup
/*    */     //   41: new java/lang/StringBuilder
/*    */     //   44: dup
/*    */     //   45: invokespecial <init> : ()V
/*    */     //   48: sipush #8644
/*    */     //   51: ldc2_w 5057310089646134514
/*    */     //   54: lload_2
/*    */     //   55: lxor
/*    */     //   56: <illegal opcode> z : (IJ)Ljava/lang/String;
/*    */     //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   64: aload_1
/*    */     //   65: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   68: sipush #10650
/*    */     //   71: ldc2_w 3819586280042618029
/*    */     //   74: lload_2
/*    */     //   75: lxor
/*    */     //   76: <illegal opcode> z : (IJ)Ljava/lang/String;
/*    */     //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   84: aload #4
/*    */     //   86: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   89: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   92: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   95: athrow
/*    */     //   96: ldc2_w 2388695118511132961
/*    */     //   99: lload_2
/*    */     //   100: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   105: athrow
/*    */     //   106: ldc2_w 2390389545729811855
/*    */     //   109: lload_2
/*    */     //   110: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   115: ifnull -> 160
/*    */     //   118: iload #7
/*    */     //   120: ifeq -> 150
/*    */     //   123: goto -> 136
/*    */     //   126: ldc2_w 2388695118511132961
/*    */     //   129: lload_2
/*    */     //   130: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   135: athrow
/*    */     //   136: iconst_0
/*    */     //   137: goto -> 151
/*    */     //   140: ldc2_w 2388695118511132961
/*    */     //   143: lload_2
/*    */     //   144: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   149: athrow
/*    */     //   150: iconst_1
/*    */     //   151: ldc2_w 2389325921868503768
/*    */     //   154: lload_2
/*    */     //   155: <illegal opcode> w : (ZJJ)V
/*    */     //   160: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 18
/*    */     //   #25	-> 28
/*    */     //   #22	-> 37
/*    */     //   #9	-> 106
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   28	96	96	java/io/IOException
/*    */     //   106	123	126	java/io/IOException
/*    */     //   118	140	140	java/io/IOException
/*    */   }
/*    */   public hp a(File paramFile, int paramInt, long paramLong) {
/* 16 */     long l = paramInt << 32L | paramLong << 32L >>> 32L; int i = (int)((l ^ 0x5BFDF2AE510DL) >>> 48L), j = (int)((l ^ 0x5BFDF2AE510DL) << 16L >>> 32L), k = (int)((l ^ 0x5BFDF2AE510DL) << 48L >>> 48L); l ^ 0x5BFDF2AE510DL; return ds.a((short)i, paramFile, j, (char)k);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public gp a(long paramLong, File paramFile)
/*    */   {
/* 23 */     long l = paramLong ^ 0x1D8CC86E20D7L; try { return ds.b(paramFile, l); }
/*    */     catch (FileNotFoundException fileNotFoundException) {}
/*    */     paramFile.getParentFile().mkdirs();
/* 26 */     return ds.b(paramFile, l); } public gp b(long paramLong, File paramFile) { long l = paramLong ^ 0x5E9FDB13EEC0L; try { return ds.a(paramFile, l); }
/*    */     catch (FileNotFoundException fileNotFoundException) {} paramFile.getParentFile().mkdirs();
/* 28 */     return ds.a(paramFile, l); } public boolean a(File paramFile) { return paramFile.exists(); }
/*    */ 
/*    */   
/*    */   static {
/*    */     long l = nc.a(3568407947425491120L, 426546337590620418L, MethodHandles.lookup().lookupClass()).a(78090067131611L) ^ 0x62E101F4A46L;
/*    */     "劙ꒃ⟂ď䝡﹀㤕졈ᥫ頾㴖⟁洤Ǵ푝㡔㔔혼폀㭔".toCharArray()[0] = (char)("劙ꒃ⟂ď䝡﹀㤕졈ᥫ頾㴖⟁洤Ǵ푝㡔㔔혼폀㭔".toCharArray()[0] ^ 0x64E3);
/*    */     "㱜ᭀ县⌨".toCharArray()[0] = (char)("㱜ᭀ县⌨".toCharArray()[0] ^ 0x3860);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(hY$g6.H("劙ꒃ⟂ď䝡﹀㤕졈ᥫ頾㴖⟁洤Ǵ푝㡔㔔혼폀㭔".toCharArray(), (short)32394, (byte)5, (byte)2))).init(2, SecretKeyFactory.getInstance(hY$g6.H("㱜ᭀ县⌨".toCharArray(), (short)1339, (byte)3, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[5];
/*    */     boolean bool = false;
/*    */     "쟷?ἻЖ뉶슈瓁蒪活䵊?뽰ॶﳃᶍ횄皇?첽蘎⪃ꏶꟄ攨폚밴푒뎴䵬⊉⯗咽쵛엘恥ė䳴傧掫鎻ງ㉀伟븽⏟?Ṿவ묦뢠ꦔﱼ⎪럱క篰䜄葂忇⭄ꙮ頳?ㄶ횝췠䞫饮檬ꥎ톖赮襫혒鋄᷒Ꮾㅶ?﬑묵쀿땆锑诼僀跊㈆셩跧ᱪ㲹졜瘔撈࡭脊싊佖".toCharArray()[55] = (char)("쟷?ἻЖ뉶슈瓁蒪活䵊?뽰ॶﳃᶍ횄皇?첽蘎⪃ꏶꟄ攨폚밴푒뎴䵬⊉⯗咽쵛엘恥ė䳴傧掫鎻ງ㉀伟븽⏟?Ṿவ묦뢠ꦔﱼ⎪럱క篰䜄葂忇⭄ꙮ頳?ㄶ횝췠䞫饮檬ꥎ톖赮襫혒鋄᷒Ꮾㅶ?﬑묵쀿땆锑诼僀跊㈆셩跧ᱪ㲹졜瘔撈࡭脊싊佖".toCharArray()[55] ^ 0x6D67);
/*    */     String str;
/*    */     int i = (str = hY$g6.H("쟷?ἻЖ뉶슈瓁蒪活䵊?뽰ॶﳃᶍ횄皇?첽蘎⪃ꏶꟄ攨폚밴푒뎴䵬⊉⯗咽쵛엘恥ė䳴傧掫鎻ງ㉀伟븽⏟?Ṿவ묦뢠ꦔﱼ⎪럱క篰䜄葂忇⭄ꙮ頳?ㄶ횝췠䞫饮檬ꥎ톖赮襫혒鋄᷒Ꮾㅶ?﬑묵쀿땆锑诼僀跊㈆셩跧ᱪ㲹졜瘔撈࡭脊싊佖".toCharArray(), (short)8368, (byte)2, (byte)2)).length();
/*    */     byte b2 = 56;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static IOException a(IOException paramIOException) {
/*    */     return paramIOException;
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
/*    */   
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5572;
/*    */     if (c[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])d.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "ꂰ㨯훶?㾂≭弦ఘ땨䉢怞쎝꜄ﾐ캌פֿ蓡뢡궑䜃ឍ".toCharArray()[3] = (char)("ꂰ㨯훶?㾂≭弦ఘ땨䉢怞쎝꜄ﾐ캌פֿ蓡뢡궑䜃ឍ".toCharArray()[3] ^ 0x2443);
/*    */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("ꂰ㨯훶?㾂≭弦ఘ땨䉢怞쎝꜄ﾐ캌פֿ蓡뢡궑䜃ឍ".toCharArray(), (short)2031, false, true));
/*    */           "?藙늕㴆".toCharArray()[1] = (char)("?藙늕㴆".toCharArray()[1] ^ 0x111D);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("?藙늕㴆".toCharArray(), (short)29591, false, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           d.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "ឮ躴䷲勺?궠䦿٫闪㳇䎴쫗쬷閵襓莋⎳".toCharArray()[0] = (char)("ឮ躴䷲勺?궠䦿٫闪㳇䎴쫗쬷閵襓莋⎳".toCharArray()[0] ^ 0x6D5B);
/*    */         throw new RuntimeException(dP$dt.X("ឮ躴䷲勺?궠䦿٫闪㳇䎴쫗쬷閵襓莋⎳".toCharArray(), (short)11097, false, true), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "︱䮗鮓蒯?㺑Ԕ풤綕".toCharArray()[4] = (char)("︱䮗鮓蒯?㺑Ԕ풤綕".toCharArray()[4] ^ 0x6043);
/*    */       byte[] arrayOfByte2 = b[i].getBytes(dP$dt.X("︱䮗鮓蒯?㺑Ԕ풤綕".toCharArray(), (short)6602, false, false));
/*    */       c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return c[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '嚠阕䣴攅㍢鯨넌蒌请홏ᤤ쾺ই쁛?⿓夼'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #11
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #30136
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #22913
/*    */     //   87: iconst_1
/*    */     //   88: iconst_3
/*    */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '㨟?꜂烙'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_2
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #11248
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #28344
/*    */     //   115: iconst_0
/*    */     //   116: iconst_4
/*    */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w 'Ͻ揃兄'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_2
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #19766
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #25612
/*    */     //   147: iconst_0
/*    */     //   148: iconst_4
/*    */     //   149: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: aload #4
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   170: athrow
/*    */     //   171: aload_3
/*    */     //   172: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\j2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */