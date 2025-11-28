/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import com.google.gson.JsonObject;
/*     */ import java.lang.invoke.CallSite;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MethodType;
/*     */ import java.lang.invoke.MutableCallSite;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Timer;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.SecretKeyFactory;
/*     */ import javax.crypto.spec.DESKeySpec;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MetricsLite
/*     */ {
/*     */   public static final int B_STATS_VERSION = 1;
/*     */   private static final String URL;
/*     */   private boolean enabled;
/*     */   private static boolean logFailedRequests;
/*     */   private static boolean logSentData;
/*     */   private static boolean logResponseStatusText;
/*     */   private static String serverUUID;
/*     */   public static String userID;
/*     */   public static String nonceID;
/*     */   private final Plugin plugin;
/*     */   
/*     */   static {
/*     */     long l;
/*     */     byte b1;
/*  55 */     for (URL = "https://bStats.org/submitData/bukkit", a = nc.a(-5902024372321062212L, -223340232118854862L, MethodHandles.lookup().lookupClass()).a(112489854575440L), d = new HashMap<>(13), l = a ^ 0x7B1CA1390FCL, (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[59]; boolean bool = false; String str; int i = (str = "ýn,xjv#ëÃ\035@XQ|Yo)ð¡\006à×î\017ygX¬\037%2\001tz²å!ÇÀÃPµ\032=\\ÝÅ,ðÐófß'*àå¯`íìÚáf$ \022;·TÒ Hó²Cº×\024põ9Ä }Ã\022\005\030\"KÒÐò\020g{!\024\"Km`è´×9Søï@{ðBD$r§ ÀP3ZT³ïØgÈXùÝéëÓ8j\f@\\VVËCí\013ÃQ}åi¼¯Rï*{\034$ÍL,[`Úè\007³%\030ôÿmkïÓy\033\013\030Ê\"}\036,Þ-r\025\020ø\002\036\035Mª\027åæ\fí\037ÖÉ¼(weE(\002Qá&\024¤ò|gëZ\005i$Ö²*»\002Øçø27ÍÝëH (qëqø\\\035N{_\025Lp[4Zi\023ô}G¨\031ør¦ã\002¸>\005+õ\033\030æ àØ(Åtþ%AO÷&xÕSèZ¢ö9 ,\034\036Ú^g\032ÿ\fÞöÞTâA\0351ü8Ó5µÑ«`\021H ±«{Õ²\021P\b¡^éÓ¤UhhÌ¨\f\017S¾å¬\002Y¾@vÜKÚÜwÿ¤(£\026ÞGlFbÿ&&¨<\016eeÂ¥\030Í`B+i8\033õ:«Ã\tTÑLP÷¢©)EÅ÷y&R\002Üæ6 ¡vp=ü¥®+m[[\034\007Æ\030ÅñahpuÕP\006~c\035Un\\ ý6kPSD[@\rÒ¨Såi8\001aÎBwÌ\030¥Ói0Lî=(÷m#$\024ð>µ(ÁëÀiê\024Ü!¡«\023és\024¾Éó\001ÙYÙM{P\004´g þ³¾½í¾ò¥EHCÁ ù\0362\027¥f~âÖuQã\034¤ÃXvÃüW\020\023V ¸\024\001f\003(O@\0210£Yp01âÃ-Ï²~\016?Þ\037[çL:S7\022õß7èS¨âûSö¡\t4ÇZ¶æo&«\027\032r,^\026Ð\b#Þ¢85â3\003è Ñ\023,°ìjÃL~[ù6\f\001â«»¦V\033\000½P¥t\002^ ÆK¤ãàW\037+ù\000F\032S\002B\001\nM9¢zw¤NMF~þ(cÐK®Ø:ã&n\bHÃÌÑ×=\006âÉ]\013gø\017d+©Yô)Â\fõù\031tT\020§@êîd/&QËJôê¸Ä Ò`,\\ÎèÆ\0072Q\004pf\032'\0376 -\016Sì\026Ý\002 5$Ý\\\027<>RÑ«£¿Ú\032\r\r_Ñ$i×P8sZ¯0\007Ó¯Bì\022ýº@^çÓ°­­¥ó\031-è> {üè\004BÞ¢\006Æ©\013Ö\023#C\024i2>UµÙ/® \031(=»M«ïò®xéàFôÈ@wsä\017\f%\0260Ó\006Gùy ¹\020äÍ|áóÓ¦¾\016iá²þÝ\020,.·\be\034ßG@pÒ\030Jò\0309Å¤ì&ö¸\003 »ä{´¦:D\005°4¡\020¨Ç\024@ÿÕ8±´Ñ~\007\032\020êñAÇÊÿ±{@¥³\n\tf>Ð ³%\n&\032ÙB×Äòm\024gnÈE\002]²üÉ\034ûxõÑî.Y kÒijÙyÐ\021V=\034m9Gí®÷\033c\001¼U1f±²¡¤»\005Ä\030ÖÂÛNe¦\003½m\036\036t¾;·ì\035kµ» þK¤î`\004gRo\017\\êÕÓÌ\\ø·Çy*/È\"\033tÈ\020¢\022^\006+mp³Åä\\^ßwHb±N±§HO\026÷\022\034?\037{¾Ë\004>ý¶@ZKS@\0327ñªÂO]]bUÓ^hh~»wkt^·î¤¦\t/EV¥.=Jþ³YÉQ¶îc±(Ú\003µ-\020\"_«¡~\rÄL½¦ë½0\b'òe\026Ö\017rjzf\031\rââl§ RTÐËO·õZ¥QsjYÔ%vÆád»øùH0á½ ×qSZ\035Ç]>a\022Ë3i\0334aP\035\016ÌIOð ÿêD$nh\020 )\024í;øîÇO\004\020ô¾Mvx(ñ>Aä¾|5ðp°æ\025\021§¥¶\021)\rì\017ë¼\037ÕÈ¢ÑðNb.× s{P\rSh\022ÐY\025²Sý»®t¥5ÿMiS¨nDÎ\n\000u\020\r0\031Ý6\037HJFð\\nô\003 Ôûn<[v\035Òÿ\"=\032&±«Ø$¬Wô»øÖ¹íÔÀµ(Ñ\020çåßÁ>Àç\023\004«~þÍj&ŸA)¤Z q` (¯ãÿ\032eØ¶TYÑ\034w¤¤¥%ýWÑ-³ñ¸\"Hmá<G¥UA¸>´\021â ú_× x7â\005÷bÝaã9-£\022úA\030áñ\\2Y'³k\001ÆljÙ'\tµDé\037\\6KÑ-\025\013Ö\t9Ä\034hÒa\023¸ÿÌr\026L9wc«\fKýâ\003Z\030UU=Êøõ\032;ýÀ¿åü±ÿAE¯HëÒ\032ãqt9MC\035òÛjyÓüZm×ðJ*ô\036\031ó\027\"\037ÅBSO\\~²tö?\002sÐ>íõ\031óWLµÁz4¦K©ÂÄ.ä:ãñ¬î+£G¿[\f¿:,G¯¬_\026ù.\033-½\034ROa\036ÎZ%Bu\033åºU\006\035\004¿À\036b¸,«.ü ç ¹æY\013ø­M)\020$ù66süRÓ¶Ø·\030fP~u\024+\002jfÎJýòhfÝòÜ¨§¸H\025øÁ%ùZÛ\r»S±bÖ=]¾ü5È÷ýß\020\016¼_>\"\023Ç\024m\033\027¨8(\000Î<!j{Ãßø>\"õ©\f¨Y¡sC¥\003\023\004È\034»îÎ¬EïÉU \003pZK [\\Î\005:UÆß\003Óµ.5È\024\003v\000á Ä{ÃP\030w7\\\024\033\005?w/9\020¥|Ö´âêqur\nª¬\r\020)Òð\030º\037WÄ\003\tÏv­^²0ø¨Ëk}é²\027Ãýy0X0]kiRTo\016]\017F*jNôMµ\021£DÇs>xÝKæó\023 ³V¶B:¥ª(íleîôÇ\026\034ï6®\fep75w´Ókøb(\001ú#r\020\n\034[øT®?}Ò*Ì±\021Óû\nýRÖCçðLêì\005\003\025ì\030mòdíD`7Ç\nÔÙÎ>üÒÝñ:VÙ.+D §Ý| ÀP°6CüQ¾w¦Ö«8\027nvizª±é©+&ú=(«påÀ°zPC\030\016ñ)%*ì{Åc\037D\007í\023f\017¹n\007\"kÄµùf\032÷í(¶\000»yäÊïéN4\0066Ö\r\013¾\033ùvñÅ×\013\020¨ònÈ\"øÖ;Lbæ").length(); byte b2 = 72; byte b = -1;
/*     */     while (true);
/*     */   }
/*     */ 
/*     */   
/*     */   private final int pluginId;
/*     */   
/*     */   private static final long a;
/*     */   
/*     */   private static final String[] b;
/*     */   private static final String[] c;
/*     */   private static final Map d;
/*     */   
/*     */   public MetricsLite(Plugin paramPlugin, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/MetricsLite.a : J
/*     */     //   3: ldc2_w 87931880727511
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: ldc2_w -1501524065684635502
/*     */     //   11: lload_3
/*     */     //   12: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   17: aload_0
/*     */     //   18: invokespecial <init> : ()V
/*     */     //   21: astore #5
/*     */     //   23: aload #5
/*     */     //   25: ifnull -> 86
/*     */     //   28: aload_1
/*     */     //   29: ifnonnull -> 76
/*     */     //   32: goto -> 45
/*     */     //   35: ldc2_w -1502153636555910182
/*     */     //   38: lload_3
/*     */     //   39: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   44: athrow
/*     */     //   45: new java/lang/IllegalArgumentException
/*     */     //   48: dup
/*     */     //   49: sipush #14240
/*     */     //   52: ldc2_w 8478148676416162351
/*     */     //   55: lload_3
/*     */     //   56: lxor
/*     */     //   57: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   62: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   65: athrow
/*     */     //   66: ldc2_w -1502153636555910182
/*     */     //   69: lload_3
/*     */     //   70: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   75: athrow
/*     */     //   76: aload_0
/*     */     //   77: aload_1
/*     */     //   78: putfield plugin : Lorg/bukkit/plugin/Plugin;
/*     */     //   81: aload_0
/*     */     //   82: iload_2
/*     */     //   83: putfield pluginId : I
/*     */     //   86: new java/io/File
/*     */     //   89: dup
/*     */     //   90: aload_1
/*     */     //   91: invokeinterface getDataFolder : ()Ljava/io/File;
/*     */     //   96: invokevirtual getParentFile : ()Ljava/io/File;
/*     */     //   99: sipush #18599
/*     */     //   102: ldc2_w 442387637134275844
/*     */     //   105: lload_3
/*     */     //   106: lxor
/*     */     //   107: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   112: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
/*     */     //   115: astore #6
/*     */     //   117: new java/io/File
/*     */     //   120: dup
/*     */     //   121: aload #6
/*     */     //   123: sipush #16853
/*     */     //   126: ldc2_w 3980657437420371035
/*     */     //   129: lload_3
/*     */     //   130: lxor
/*     */     //   131: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   136: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
/*     */     //   139: astore #7
/*     */     //   141: aload #7
/*     */     //   143: invokestatic loadConfiguration : (Ljava/io/File;)Lorg/bukkit/configuration/file/YamlConfiguration;
/*     */     //   146: astore #8
/*     */     //   148: aload #8
/*     */     //   150: sipush #3523
/*     */     //   153: ldc2_w 2844845387060965454
/*     */     //   156: lload_3
/*     */     //   157: lxor
/*     */     //   158: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   163: invokevirtual isSet : (Ljava/lang/String;)Z
/*     */     //   166: aload #5
/*     */     //   168: ifnull -> 461
/*     */     //   171: ifne -> 347
/*     */     //   174: goto -> 187
/*     */     //   177: ldc2_w -1502153636555910182
/*     */     //   180: lload_3
/*     */     //   181: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   186: athrow
/*     */     //   187: aload #8
/*     */     //   189: sipush #25828
/*     */     //   192: ldc2_w 4154646685966834004
/*     */     //   195: lload_3
/*     */     //   196: lxor
/*     */     //   197: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   202: iconst_1
/*     */     //   203: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   206: invokevirtual addDefault : (Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   209: aload #8
/*     */     //   211: sipush #23365
/*     */     //   214: ldc2_w 1218818895365547734
/*     */     //   217: lload_3
/*     */     //   218: lxor
/*     */     //   219: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   224: invokestatic randomUUID : ()Ljava/util/UUID;
/*     */     //   227: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   230: invokevirtual addDefault : (Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   233: aload #8
/*     */     //   235: sipush #24708
/*     */     //   238: ldc2_w 5667153196510223665
/*     */     //   241: lload_3
/*     */     //   242: lxor
/*     */     //   243: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   248: iconst_0
/*     */     //   249: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   252: invokevirtual addDefault : (Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   255: aload #8
/*     */     //   257: sipush #27665
/*     */     //   260: ldc2_w 9188605727732765076
/*     */     //   263: lload_3
/*     */     //   264: lxor
/*     */     //   265: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   270: iconst_0
/*     */     //   271: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   274: invokevirtual addDefault : (Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   277: aload #8
/*     */     //   279: sipush #18948
/*     */     //   282: ldc2_w 564632134603356077
/*     */     //   285: lload_3
/*     */     //   286: lxor
/*     */     //   287: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   292: iconst_0
/*     */     //   293: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   296: invokevirtual addDefault : (Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   299: aload #8
/*     */     //   301: invokevirtual options : ()Lorg/bukkit/configuration/file/YamlConfigurationOptions;
/*     */     //   304: sipush #4087
/*     */     //   307: ldc2_w 1876975834194965083
/*     */     //   310: lload_3
/*     */     //   311: lxor
/*     */     //   312: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   317: invokevirtual header : (Ljava/lang/String;)Lorg/bukkit/configuration/file/YamlConfigurationOptions;
/*     */     //   320: iconst_1
/*     */     //   321: invokevirtual copyDefaults : (Z)Lorg/bukkit/configuration/file/YamlConfigurationOptions;
/*     */     //   324: pop
/*     */     //   325: aload #8
/*     */     //   327: aload #7
/*     */     //   329: invokevirtual save : (Ljava/io/File;)V
/*     */     //   332: goto -> 347
/*     */     //   335: ldc2_w -1502153636555910182
/*     */     //   338: lload_3
/*     */     //   339: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   344: athrow
/*     */     //   345: astore #9
/*     */     //   347: aload #8
/*     */     //   349: sipush #23365
/*     */     //   352: ldc2_w 1218818895365547734
/*     */     //   355: lload_3
/*     */     //   356: lxor
/*     */     //   357: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   362: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   365: putstatic me/konsolas/aac/MetricsLite.serverUUID : Ljava/lang/String;
/*     */     //   368: aload #8
/*     */     //   370: sipush #10740
/*     */     //   373: ldc2_w 5388089708219585627
/*     */     //   376: lload_3
/*     */     //   377: lxor
/*     */     //   378: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   383: iconst_0
/*     */     //   384: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
/*     */     //   387: putstatic me/konsolas/aac/MetricsLite.logFailedRequests : Z
/*     */     //   390: aload_0
/*     */     //   391: aload #8
/*     */     //   393: sipush #32502
/*     */     //   396: ldc2_w 5399759802481541998
/*     */     //   399: lload_3
/*     */     //   400: lxor
/*     */     //   401: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   406: iconst_1
/*     */     //   407: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
/*     */     //   410: putfield enabled : Z
/*     */     //   413: aload #8
/*     */     //   415: sipush #7111
/*     */     //   418: ldc2_w 5813707584034956875
/*     */     //   421: lload_3
/*     */     //   422: lxor
/*     */     //   423: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   428: iconst_0
/*     */     //   429: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
/*     */     //   432: putstatic me/konsolas/aac/MetricsLite.logSentData : Z
/*     */     //   435: aload #8
/*     */     //   437: sipush #26242
/*     */     //   440: ldc2_w 287583446956251961
/*     */     //   443: lload_3
/*     */     //   444: lxor
/*     */     //   445: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   450: iconst_0
/*     */     //   451: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
/*     */     //   454: putstatic me/konsolas/aac/MetricsLite.logResponseStatusText : Z
/*     */     //   457: aload_0
/*     */     //   458: getfield enabled : Z
/*     */     //   461: aload #5
/*     */     //   463: ifnull -> 483
/*     */     //   466: ifeq -> 609
/*     */     //   469: goto -> 482
/*     */     //   472: ldc2_w -1502153636555910182
/*     */     //   475: lload_3
/*     */     //   476: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   481: athrow
/*     */     //   482: iconst_0
/*     */     //   483: istore #9
/*     */     //   485: invokestatic getServicesManager : ()Lorg/bukkit/plugin/ServicesManager;
/*     */     //   488: invokeinterface getKnownServices : ()Ljava/util/Collection;
/*     */     //   493: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   498: astore #10
/*     */     //   500: aload #10
/*     */     //   502: invokeinterface hasNext : ()Z
/*     */     //   507: aload #5
/*     */     //   509: ifnull -> 589
/*     */     //   512: ifeq -> 572
/*     */     //   515: goto -> 528
/*     */     //   518: ldc2_w -1502153636555910182
/*     */     //   521: lload_3
/*     */     //   522: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   527: athrow
/*     */     //   528: aload #10
/*     */     //   530: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   535: checkcast java/lang/Class
/*     */     //   538: astore #11
/*     */     //   540: aload #11
/*     */     //   542: sipush #32291
/*     */     //   545: ldc2_w 7170465441165116292
/*     */     //   548: lload_3
/*     */     //   549: lxor
/*     */     //   550: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   555: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
/*     */     //   558: pop
/*     */     //   559: iconst_1
/*     */     //   560: istore #9
/*     */     //   562: goto -> 572
/*     */     //   565: astore #12
/*     */     //   567: aload #5
/*     */     //   569: ifnonnull -> 500
/*     */     //   572: invokestatic getServicesManager : ()Lorg/bukkit/plugin/ServicesManager;
/*     */     //   575: ldc me/konsolas/aac/MetricsLite
/*     */     //   577: aload_0
/*     */     //   578: aload_1
/*     */     //   579: getstatic org/bukkit/plugin/ServicePriority.Normal : Lorg/bukkit/plugin/ServicePriority;
/*     */     //   582: invokeinterface register : (Ljava/lang/Class;Ljava/lang/Object;Lorg/bukkit/plugin/Plugin;Lorg/bukkit/plugin/ServicePriority;)V
/*     */     //   587: iload #9
/*     */     //   589: ifne -> 609
/*     */     //   592: aload_0
/*     */     //   593: invokespecial startSubmitting : ()V
/*     */     //   596: goto -> 609
/*     */     //   599: ldc2_w -1502153636555910182
/*     */     //   602: lload_3
/*     */     //   603: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   608: athrow
/*     */     //   609: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #1	-> 17
/*     */     //   #147	-> 23
/*     */     //   #122	-> 45
/*     */     //   #138	-> 76
/*     */     //   #44	-> 81
/*     */     //   #64	-> 86
/*     */     //   #125	-> 117
/*     */     //   #106	-> 141
/*     */     //   #2	-> 148
/*     */     //   #124	-> 187
/*     */     //   #131	-> 209
/*     */     //   #137	-> 233
/*     */     //   #68	-> 255
/*     */     //   #61	-> 277
/*     */     //   #3	-> 299
/*     */     //   #85	-> 321
/*     */     //   #109	-> 325
/*     */     //   #73	-> 332
/*     */     //   #10	-> 347
/*     */     //   #21	-> 368
/*     */     //   #30	-> 390
/*     */     //   #90	-> 413
/*     */     //   #145	-> 435
/*     */     //   #129	-> 457
/*     */     //   #102	-> 482
/*     */     //   #81	-> 485
/*     */     //   #144	-> 540
/*     */     //   #69	-> 559
/*     */     //   #128	-> 562
/*     */     //   #134	-> 565
/*     */     //   #48	-> 567
/*     */     //   #95	-> 572
/*     */     //   #108	-> 587
/*     */     //   #114	-> 592
/*     */     //   #63	-> 609
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   23	32	35	java/io/IOException
/*     */     //   28	66	66	java/io/IOException
/*     */     //   148	174	177	java/io/IOException
/*     */     //   171	335	335	java/lang/NoSuchFieldException
/*     */     //   325	332	345	java/io/IOException
/*     */     //   461	469	472	java/io/IOException
/*     */     //   500	515	518	java/io/IOException
/*     */     //   540	562	565	java/lang/NoSuchFieldException
/*     */     //   589	596	599	java/io/IOException
/*     */   }
/*     */   
/*     */   private static void sendData(Plugin paramPlugin, JsonObject paramJsonObject) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/MetricsLite.a : J
/*     */     //   3: ldc2_w 124358571413537
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: ldc2_w 6404045217922577252
/*     */     //   11: lload_2
/*     */     //   12: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   17: astore #4
/*     */     //   19: aload_1
/*     */     //   20: ifnonnull -> 54
/*     */     //   23: new java/lang/IllegalArgumentException
/*     */     //   26: dup
/*     */     //   27: sipush #16059
/*     */     //   30: ldc2_w 7933175544742408394
/*     */     //   33: lload_2
/*     */     //   34: lxor
/*     */     //   35: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   40: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   43: athrow
/*     */     //   44: ldc2_w 6400030525632585772
/*     */     //   47: lload_2
/*     */     //   48: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   53: athrow
/*     */     //   54: invokestatic isPrimaryThread : ()Z
/*     */     //   57: aload #4
/*     */     //   59: ifnull -> 112
/*     */     //   62: ifeq -> 109
/*     */     //   65: goto -> 78
/*     */     //   68: ldc2_w 6400030525632585772
/*     */     //   71: lload_2
/*     */     //   72: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   77: athrow
/*     */     //   78: new java/lang/IllegalAccessException
/*     */     //   81: dup
/*     */     //   82: sipush #6102
/*     */     //   85: ldc2_w 8135285817752345009
/*     */     //   88: lload_2
/*     */     //   89: lxor
/*     */     //   90: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   95: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   98: athrow
/*     */     //   99: ldc2_w 6400030525632585772
/*     */     //   102: lload_2
/*     */     //   103: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   108: athrow
/*     */     //   109: getstatic me/konsolas/aac/MetricsLite.logSentData : Z
/*     */     //   112: ifeq -> 167
/*     */     //   115: aload_0
/*     */     //   116: invokeinterface getLogger : ()Ljava/util/logging/Logger;
/*     */     //   121: new java/lang/StringBuilder
/*     */     //   124: dup
/*     */     //   125: invokespecial <init> : ()V
/*     */     //   128: sipush #18154
/*     */     //   131: ldc2_w 738477025867073674
/*     */     //   134: lload_2
/*     */     //   135: lxor
/*     */     //   136: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   144: aload_1
/*     */     //   145: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   148: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   151: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   154: goto -> 167
/*     */     //   157: ldc2_w 6400030525632585772
/*     */     //   160: lload_2
/*     */     //   161: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   166: athrow
/*     */     //   167: new java/net/URL
/*     */     //   170: dup
/*     */     //   171: sipush #23925
/*     */     //   174: ldc2_w 8117988730649940745
/*     */     //   177: lload_2
/*     */     //   178: lxor
/*     */     //   179: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   184: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   187: invokevirtual openConnection : ()Ljava/net/URLConnection;
/*     */     //   190: checkcast javax/net/ssl/HttpsURLConnection
/*     */     //   193: astore #5
/*     */     //   195: aload_1
/*     */     //   196: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   199: invokestatic compress : (Ljava/lang/String;)[B
/*     */     //   202: astore #6
/*     */     //   204: aload #5
/*     */     //   206: sipush #1792
/*     */     //   209: ldc2_w 7447659049955346802
/*     */     //   212: lload_2
/*     */     //   213: lxor
/*     */     //   214: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   219: invokevirtual setRequestMethod : (Ljava/lang/String;)V
/*     */     //   222: aload #5
/*     */     //   224: sipush #28936
/*     */     //   227: ldc2_w 7888228838587580261
/*     */     //   230: lload_2
/*     */     //   231: lxor
/*     */     //   232: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   237: sipush #8884
/*     */     //   240: ldc2_w 7216840711369714919
/*     */     //   243: lload_2
/*     */     //   244: lxor
/*     */     //   245: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   250: invokevirtual addRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   253: aload #5
/*     */     //   255: sipush #14724
/*     */     //   258: ldc2_w 6929443772463052786
/*     */     //   261: lload_2
/*     */     //   262: lxor
/*     */     //   263: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   268: sipush #23648
/*     */     //   271: ldc2_w 5306162371759313429
/*     */     //   274: lload_2
/*     */     //   275: lxor
/*     */     //   276: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   281: invokevirtual addRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   284: aload #5
/*     */     //   286: sipush #26691
/*     */     //   289: ldc2_w 3981966776995849779
/*     */     //   292: lload_2
/*     */     //   293: lxor
/*     */     //   294: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   299: sipush #3988
/*     */     //   302: ldc2_w 4470097516619645438
/*     */     //   305: lload_2
/*     */     //   306: lxor
/*     */     //   307: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   312: invokevirtual addRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   315: aload #5
/*     */     //   317: sipush #8076
/*     */     //   320: ldc2_w 4518568352140972510
/*     */     //   323: lload_2
/*     */     //   324: lxor
/*     */     //   325: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   330: aload #6
/*     */     //   332: arraylength
/*     */     //   333: invokestatic valueOf : (I)Ljava/lang/String;
/*     */     //   336: invokevirtual addRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   339: aload #5
/*     */     //   341: sipush #8939
/*     */     //   344: ldc2_w 184778793733024940
/*     */     //   347: lload_2
/*     */     //   348: lxor
/*     */     //   349: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   354: sipush #19582
/*     */     //   357: ldc2_w 4129384006370755134
/*     */     //   360: lload_2
/*     */     //   361: lxor
/*     */     //   362: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   367: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   370: aload #5
/*     */     //   372: sipush #4902
/*     */     //   375: ldc2_w 2732999197209877863
/*     */     //   378: lload_2
/*     */     //   379: lxor
/*     */     //   380: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   385: sipush #5347
/*     */     //   388: ldc2_w 4578568424526011018
/*     */     //   391: lload_2
/*     */     //   392: lxor
/*     */     //   393: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   398: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   401: aload #5
/*     */     //   403: iconst_1
/*     */     //   404: invokevirtual setDoOutput : (Z)V
/*     */     //   407: new java/io/DataOutputStream
/*     */     //   410: dup
/*     */     //   411: aload #5
/*     */     //   413: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
/*     */     //   416: invokespecial <init> : (Ljava/io/OutputStream;)V
/*     */     //   419: astore #7
/*     */     //   421: aload #7
/*     */     //   423: aload #6
/*     */     //   425: invokevirtual write : ([B)V
/*     */     //   428: aload #7
/*     */     //   430: invokevirtual close : ()V
/*     */     //   433: goto -> 458
/*     */     //   436: astore #8
/*     */     //   438: aload #7
/*     */     //   440: invokevirtual close : ()V
/*     */     //   443: goto -> 455
/*     */     //   446: astore #9
/*     */     //   448: aload #8
/*     */     //   450: aload #9
/*     */     //   452: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
/*     */     //   455: aload #8
/*     */     //   457: athrow
/*     */     //   458: new java/lang/StringBuilder
/*     */     //   461: dup
/*     */     //   462: invokespecial <init> : ()V
/*     */     //   465: astore #7
/*     */     //   467: new java/io/BufferedReader
/*     */     //   470: dup
/*     */     //   471: new java/io/InputStreamReader
/*     */     //   474: dup
/*     */     //   475: aload #5
/*     */     //   477: invokevirtual getInputStream : ()Ljava/io/InputStream;
/*     */     //   480: invokespecial <init> : (Ljava/io/InputStream;)V
/*     */     //   483: invokespecial <init> : (Ljava/io/Reader;)V
/*     */     //   486: astore #8
/*     */     //   488: aload #8
/*     */     //   490: invokevirtual readLine : ()Ljava/lang/String;
/*     */     //   493: dup
/*     */     //   494: astore #9
/*     */     //   496: ifnull -> 530
/*     */     //   499: aload #7
/*     */     //   501: aload #9
/*     */     //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   506: pop
/*     */     //   507: aload #4
/*     */     //   509: ifnull -> 535
/*     */     //   512: aload #4
/*     */     //   514: ifnonnull -> 488
/*     */     //   517: goto -> 530
/*     */     //   520: ldc2_w 6400030525632585772
/*     */     //   523: lload_2
/*     */     //   524: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   529: athrow
/*     */     //   530: aload #8
/*     */     //   532: invokevirtual close : ()V
/*     */     //   535: goto -> 560
/*     */     //   538: astore #9
/*     */     //   540: aload #8
/*     */     //   542: invokevirtual close : ()V
/*     */     //   545: goto -> 557
/*     */     //   548: astore #10
/*     */     //   550: aload #9
/*     */     //   552: aload #10
/*     */     //   554: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
/*     */     //   557: aload #9
/*     */     //   559: athrow
/*     */     //   560: getstatic me/konsolas/aac/MetricsLite.logResponseStatusText : Z
/*     */     //   563: ifeq -> 619
/*     */     //   566: aload_0
/*     */     //   567: invokeinterface getLogger : ()Ljava/util/logging/Logger;
/*     */     //   572: new java/lang/StringBuilder
/*     */     //   575: dup
/*     */     //   576: invokespecial <init> : ()V
/*     */     //   579: sipush #23475
/*     */     //   582: ldc2_w 6072896330575156676
/*     */     //   585: lload_2
/*     */     //   586: lxor
/*     */     //   587: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   595: aload #7
/*     */     //   597: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   600: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   603: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   606: goto -> 619
/*     */     //   609: ldc2_w 6400030525632585772
/*     */     //   612: lload_2
/*     */     //   613: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   618: athrow
/*     */     //   619: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #13	-> 19
/*     */     //   #42	-> 23
/*     */     //   #119	-> 54
/*     */     //   #101	-> 78
/*     */     //   #22	-> 109
/*     */     //   #17	-> 115
/*     */     //   #141	-> 167
/*     */     //   #75	-> 195
/*     */     //   #146	-> 204
/*     */     //   #80	-> 222
/*     */     //   #18	-> 253
/*     */     //   #8	-> 284
/*     */     //   #12	-> 315
/*     */     //   #92	-> 339
/*     */     //   #88	-> 370
/*     */     //   #31	-> 401
/*     */     //   #5	-> 407
/*     */     //   #47	-> 421
/*     */     //   #54	-> 428
/*     */     //   #6	-> 436
/*     */     //   #91	-> 458
/*     */     //   #62	-> 467
/*     */     //   #36	-> 488
/*     */     //   #46	-> 499
/*     */     //   #123	-> 530
/*     */     //   #57	-> 538
/*     */     //   #136	-> 560
/*     */     //   #107	-> 566
/*     */     //   #58	-> 619
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   19	44	44	java/lang/Throwable
/*     */     //   54	65	68	java/lang/Throwable
/*     */     //   62	99	99	java/lang/Throwable
/*     */     //   112	154	157	java/lang/Throwable
/*     */     //   421	428	436	java/lang/Throwable
/*     */     //   438	443	446	java/lang/Throwable
/*     */     //   488	530	538	java/lang/Throwable
/*     */     //   499	517	520	java/lang/Throwable
/*     */     //   540	545	548	java/lang/Throwable
/*     */     //   560	606	609	java/lang/Throwable
/*     */   }
/*     */   
/*     */   private void submitData() {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/MetricsLite.a : J
/*     */     //   3: ldc2_w 130059541337217
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: aload_0
/*     */     //   9: invokespecial getServerData : ()Lcom/google/gson/JsonObject;
/*     */     //   12: astore #4
/*     */     //   14: ldc2_w -2558121134471252028
/*     */     //   17: lload_1
/*     */     //   18: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   23: new com/google/gson/JsonArray
/*     */     //   26: dup
/*     */     //   27: invokespecial <init> : ()V
/*     */     //   30: astore #5
/*     */     //   32: astore_3
/*     */     //   33: invokestatic getServicesManager : ()Lorg/bukkit/plugin/ServicesManager;
/*     */     //   36: invokeinterface getKnownServices : ()Ljava/util/Collection;
/*     */     //   41: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   46: astore #6
/*     */     //   48: aload #6
/*     */     //   50: invokeinterface hasNext : ()Z
/*     */     //   55: ifeq -> 430
/*     */     //   58: aload #6
/*     */     //   60: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   65: checkcast java/lang/Class
/*     */     //   68: astore #7
/*     */     //   70: aload #7
/*     */     //   72: sipush #19515
/*     */     //   75: ldc2_w 5845441716780992197
/*     */     //   78: lload_1
/*     */     //   79: lxor
/*     */     //   80: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   85: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
/*     */     //   88: pop
/*     */     //   89: aload_3
/*     */     //   90: ifnull -> 468
/*     */     //   93: invokestatic getServicesManager : ()Lorg/bukkit/plugin/ServicesManager;
/*     */     //   96: aload #7
/*     */     //   98: invokeinterface getRegistrations : (Ljava/lang/Class;)Ljava/util/Collection;
/*     */     //   103: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   108: astore #8
/*     */     //   110: aload #8
/*     */     //   112: invokeinterface hasNext : ()Z
/*     */     //   117: ifeq -> 421
/*     */     //   120: aload #8
/*     */     //   122: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   127: checkcast org/bukkit/plugin/RegisteredServiceProvider
/*     */     //   130: astore #9
/*     */     //   132: aload #9
/*     */     //   134: invokevirtual getService : ()Ljava/lang/Class;
/*     */     //   137: sipush #24592
/*     */     //   140: ldc2_w 7947411352212220639
/*     */     //   143: lload_1
/*     */     //   144: lxor
/*     */     //   145: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   150: iconst_0
/*     */     //   151: anewarray java/lang/Class
/*     */     //   154: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   157: aload #9
/*     */     //   159: invokevirtual getProvider : ()Ljava/lang/Object;
/*     */     //   162: iconst_0
/*     */     //   163: anewarray java/lang/Object
/*     */     //   166: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   169: astore #10
/*     */     //   171: aload_3
/*     */     //   172: ifnull -> 223
/*     */     //   175: aload #10
/*     */     //   177: instanceof com/google/gson/JsonObject
/*     */     //   180: aload_3
/*     */     //   181: ifnull -> 55
/*     */     //   184: goto -> 197
/*     */     //   187: ldc2_w -2562127585932270452
/*     */     //   190: lload_1
/*     */     //   191: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   196: athrow
/*     */     //   197: ifeq -> 227
/*     */     //   200: aload #5
/*     */     //   202: aload #10
/*     */     //   204: checkcast com/google/gson/JsonObject
/*     */     //   207: invokevirtual add : (Lcom/google/gson/JsonElement;)V
/*     */     //   210: goto -> 223
/*     */     //   213: ldc2_w -2562127585932270452
/*     */     //   216: lload_1
/*     */     //   217: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   222: athrow
/*     */     //   223: aload_3
/*     */     //   224: ifnonnull -> 412
/*     */     //   227: sipush #1805
/*     */     //   230: ldc2_w 241023373141200360
/*     */     //   233: lload_1
/*     */     //   234: lxor
/*     */     //   235: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   240: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   243: astore #11
/*     */     //   245: aload #10
/*     */     //   247: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   250: aload_3
/*     */     //   251: ifnull -> 290
/*     */     //   254: aload #11
/*     */     //   256: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
/*     */     //   259: ifeq -> 358
/*     */     //   262: goto -> 275
/*     */     //   265: ldc2_w -2562127585932270452
/*     */     //   268: lload_1
/*     */     //   269: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   274: athrow
/*     */     //   275: aload #11
/*     */     //   277: goto -> 290
/*     */     //   280: ldc2_w -2562127585932270452
/*     */     //   283: lload_1
/*     */     //   284: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   289: athrow
/*     */     //   290: sipush #19038
/*     */     //   293: ldc2_w 5558729201753784451
/*     */     //   296: lload_1
/*     */     //   297: lxor
/*     */     //   298: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   303: iconst_0
/*     */     //   304: anewarray java/lang/Class
/*     */     //   307: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   310: astore #12
/*     */     //   312: aload #12
/*     */     //   314: iconst_1
/*     */     //   315: invokevirtual setAccessible : (Z)V
/*     */     //   318: aload #12
/*     */     //   320: aload #10
/*     */     //   322: iconst_0
/*     */     //   323: anewarray java/lang/Object
/*     */     //   326: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   329: checkcast java/lang/String
/*     */     //   332: astore #13
/*     */     //   334: new com/google/gson/JsonParser
/*     */     //   337: dup
/*     */     //   338: invokespecial <init> : ()V
/*     */     //   341: aload #13
/*     */     //   343: invokevirtual parse : (Ljava/lang/String;)Lcom/google/gson/JsonElement;
/*     */     //   346: invokevirtual getAsJsonObject : ()Lcom/google/gson/JsonObject;
/*     */     //   349: astore #14
/*     */     //   351: aload #5
/*     */     //   353: aload #14
/*     */     //   355: invokevirtual add : (Lcom/google/gson/JsonElement;)V
/*     */     //   358: goto -> 412
/*     */     //   361: astore #11
/*     */     //   363: getstatic me/konsolas/aac/MetricsLite.logFailedRequests : Z
/*     */     //   366: ifeq -> 412
/*     */     //   369: aload_0
/*     */     //   370: getfield plugin : Lorg/bukkit/plugin/Plugin;
/*     */     //   373: invokeinterface getLogger : ()Ljava/util/logging/Logger;
/*     */     //   378: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
/*     */     //   381: sipush #8204
/*     */     //   384: ldc2_w 1274512893331335928
/*     */     //   387: lload_1
/*     */     //   388: lxor
/*     */     //   389: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   394: aload #11
/*     */     //   396: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   399: goto -> 412
/*     */     //   402: ldc2_w -2562127585932270452
/*     */     //   405: lload_1
/*     */     //   406: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   411: athrow
/*     */     //   412: goto -> 417
/*     */     //   415: astore #10
/*     */     //   417: aload_3
/*     */     //   418: ifnonnull -> 110
/*     */     //   421: goto -> 426
/*     */     //   424: astore #8
/*     */     //   426: aload_3
/*     */     //   427: ifnonnull -> 48
/*     */     //   430: aload #4
/*     */     //   432: sipush #21826
/*     */     //   435: ldc2_w 8794734716340215689
/*     */     //   438: lload_1
/*     */     //   439: lxor
/*     */     //   440: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   445: aload #5
/*     */     //   447: invokevirtual add : (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
/*     */     //   450: new java/lang/Thread
/*     */     //   453: dup
/*     */     //   454: aload_0
/*     */     //   455: aload #4
/*     */     //   457: <illegal opcode> run : (Lme/konsolas/aac/MetricsLite;Lcom/google/gson/JsonObject;)Ljava/lang/Runnable;
/*     */     //   462: invokespecial <init> : (Ljava/lang/Runnable;)V
/*     */     //   465: invokevirtual start : ()V
/*     */     //   468: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #20	-> 8
/*     */     //   #15	-> 23
/*     */     //   #74	-> 33
/*     */     //   #133	-> 70
/*     */     //   #130	-> 89
/*     */     //   #99	-> 132
/*     */     //   #100	-> 171
/*     */     //   #19	-> 200
/*     */     //   #25	-> 227
/*     */     //   #23	-> 245
/*     */     //   #111	-> 275
/*     */     //   #53	-> 312
/*     */     //   #149	-> 318
/*     */     //   #11	-> 334
/*     */     //   #40	-> 351
/*     */     //   #56	-> 358
/*     */     //   #97	-> 361
/*     */     //   #115	-> 363
/*     */     //   #94	-> 369
/*     */     //   #77	-> 412
/*     */     //   #120	-> 415
/*     */     //   #113	-> 417
/*     */     //   #148	-> 421
/*     */     //   #116	-> 426
/*     */     //   #78	-> 430
/*     */     //   #142	-> 450
/*     */     //   #135	-> 465
/*     */     //   #67	-> 468
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   70	421	424	java/lang/NoSuchFieldException
/*     */     //   132	412	415	java/lang/NullPointerException
/*     */     //   132	412	415	java/lang/NoSuchMethodException
/*     */     //   132	412	415	java/lang/IllegalAccessException
/*     */     //   132	412	415	java/lang/reflect/InvocationTargetException
/*     */     //   171	184	187	java/lang/ClassNotFoundException
/*     */     //   197	210	213	java/lang/ClassNotFoundException
/*     */     //   227	358	361	java/lang/ClassNotFoundException
/*     */     //   245	262	265	java/lang/ClassNotFoundException
/*     */     //   254	277	280	java/lang/ClassNotFoundException
/*     */     //   363	399	402	java/lang/ClassNotFoundException
/*     */   }
/*     */   
/*     */   public JsonObject getPluginData() {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/MetricsLite.a : J
/*     */     //   3: ldc2_w 60686011877694
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: new com/google/gson/JsonObject
/*     */     //   11: dup
/*     */     //   12: invokespecial <init> : ()V
/*     */     //   15: astore_3
/*     */     //   16: aload_0
/*     */     //   17: getfield plugin : Lorg/bukkit/plugin/Plugin;
/*     */     //   20: invokeinterface getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
/*     */     //   25: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   28: astore #4
/*     */     //   30: aload_0
/*     */     //   31: getfield plugin : Lorg/bukkit/plugin/Plugin;
/*     */     //   34: invokeinterface getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
/*     */     //   39: invokevirtual getVersion : ()Ljava/lang/String;
/*     */     //   42: astore #5
/*     */     //   44: aload_3
/*     */     //   45: sipush #27150
/*     */     //   48: ldc2_w 4837542843764129097
/*     */     //   51: lload_1
/*     */     //   52: lxor
/*     */     //   53: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   58: aload #4
/*     */     //   60: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   63: aload_3
/*     */     //   64: sipush #21881
/*     */     //   67: ldc2_w 926096099923624488
/*     */     //   70: lload_1
/*     */     //   71: lxor
/*     */     //   72: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   77: aload_0
/*     */     //   78: getfield pluginId : I
/*     */     //   81: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   84: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/Number;)V
/*     */     //   87: aload_3
/*     */     //   88: sipush #9699
/*     */     //   91: ldc2_w 7915224863718634138
/*     */     //   94: lload_1
/*     */     //   95: lxor
/*     */     //   96: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   101: aload #5
/*     */     //   103: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   106: aload_3
/*     */     //   107: sipush #17974
/*     */     //   110: ldc2_w 1701199202785464663
/*     */     //   113: lload_1
/*     */     //   114: lxor
/*     */     //   115: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   120: new com/google/gson/JsonArray
/*     */     //   123: dup
/*     */     //   124: invokespecial <init> : ()V
/*     */     //   127: invokevirtual add : (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
/*     */     //   130: aload_3
/*     */     //   131: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #24	-> 8
/*     */     //   #71	-> 16
/*     */     //   #39	-> 30
/*     */     //   #96	-> 44
/*     */     //   #110	-> 63
/*     */     //   #82	-> 87
/*     */     //   #118	-> 106
/*     */     //   #98	-> 130
/*     */   }
/*     */   
/*     */   private static byte[] compress(String paramString) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/MetricsLite.a : J
/*     */     //   3: ldc2_w 116834178745319
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: aload_0
/*     */     //   9: ifnonnull -> 24
/*     */     //   12: aconst_null
/*     */     //   13: areturn
/*     */     //   14: ldc2_w -3812470247982812182
/*     */     //   17: lload_1
/*     */     //   18: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   23: athrow
/*     */     //   24: new java/io/ByteArrayOutputStream
/*     */     //   27: dup
/*     */     //   28: invokespecial <init> : ()V
/*     */     //   31: astore_3
/*     */     //   32: new java/util/zip/GZIPOutputStream
/*     */     //   35: dup
/*     */     //   36: aload_3
/*     */     //   37: invokespecial <init> : (Ljava/io/OutputStream;)V
/*     */     //   40: astore #4
/*     */     //   42: aload #4
/*     */     //   44: aload_0
/*     */     //   45: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   48: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
/*     */     //   51: invokevirtual write : ([B)V
/*     */     //   54: aload #4
/*     */     //   56: invokevirtual close : ()V
/*     */     //   59: goto -> 84
/*     */     //   62: astore #5
/*     */     //   64: aload #4
/*     */     //   66: invokevirtual close : ()V
/*     */     //   69: goto -> 81
/*     */     //   72: astore #6
/*     */     //   74: aload #5
/*     */     //   76: aload #6
/*     */     //   78: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
/*     */     //   81: aload #5
/*     */     //   83: athrow
/*     */     //   84: aload_3
/*     */     //   85: invokevirtual toByteArray : ()[B
/*     */     //   88: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #34	-> 8
/*     */     //   #26	-> 12
/*     */     //   #132	-> 24
/*     */     //   #105	-> 32
/*     */     //   #84	-> 42
/*     */     //   #49	-> 54
/*     */     //   #66	-> 62
/*     */     //   #38	-> 84
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	14	14	java/lang/Throwable
/*     */     //   42	54	62	java/lang/Throwable
/*     */     //   64	69	72	java/lang/Throwable
/*     */   }
/*     */   
/*     */   private JsonObject getServerData() {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/MetricsLite.a : J
/*     */     //   3: ldc2_w 34008543814856
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: ldc2_w 7797651554101970829
/*     */     //   11: lload_1
/*     */     //   12: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   17: astore_3
/*     */     //   18: sipush #17748
/*     */     //   21: ldc2_w 6755468167029833714
/*     */     //   24: lload_1
/*     */     //   25: lxor
/*     */     //   26: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   31: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */     //   34: sipush #1348
/*     */     //   37: ldc2_w 5857806327532224457
/*     */     //   40: lload_1
/*     */     //   41: lxor
/*     */     //   42: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   47: iconst_0
/*     */     //   48: anewarray java/lang/Class
/*     */     //   51: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*     */     //   54: astore #5
/*     */     //   56: aload #5
/*     */     //   58: invokevirtual getReturnType : ()Ljava/lang/Class;
/*     */     //   61: aload_3
/*     */     //   62: ifnull -> 131
/*     */     //   65: ldc java/util/Collection
/*     */     //   67: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   70: ifeq -> 119
/*     */     //   73: goto -> 86
/*     */     //   76: ldc2_w 7798007145519748293
/*     */     //   79: lload_1
/*     */     //   80: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   85: athrow
/*     */     //   86: aload #5
/*     */     //   88: invokestatic getServer : ()Lorg/bukkit/Server;
/*     */     //   91: iconst_0
/*     */     //   92: anewarray java/lang/Object
/*     */     //   95: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   98: checkcast java/util/Collection
/*     */     //   101: invokeinterface size : ()I
/*     */     //   106: goto -> 135
/*     */     //   109: ldc2_w 7798007145519748293
/*     */     //   112: lload_1
/*     */     //   113: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   118: athrow
/*     */     //   119: aload #5
/*     */     //   121: invokestatic getServer : ()Lorg/bukkit/Server;
/*     */     //   124: iconst_0
/*     */     //   125: anewarray java/lang/Object
/*     */     //   128: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   131: checkcast [Lorg/bukkit/entity/Player;
/*     */     //   134: arraylength
/*     */     //   135: istore #4
/*     */     //   137: goto -> 152
/*     */     //   140: astore #5
/*     */     //   142: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
/*     */     //   145: invokeinterface size : ()I
/*     */     //   150: istore #4
/*     */     //   152: invokestatic getOnlineMode : ()Z
/*     */     //   155: aload_3
/*     */     //   156: ifnull -> 176
/*     */     //   159: ifeq -> 179
/*     */     //   162: goto -> 175
/*     */     //   165: ldc2_w 7798007145519748293
/*     */     //   168: lload_1
/*     */     //   169: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*     */     //   174: athrow
/*     */     //   175: iconst_1
/*     */     //   176: goto -> 180
/*     */     //   179: iconst_0
/*     */     //   180: istore #5
/*     */     //   182: sipush #13818
/*     */     //   185: invokestatic getVersion : ()Ljava/lang/String;
/*     */     //   188: astore #6
/*     */     //   190: ldc2_w 9010448963935817595
/*     */     //   193: lload_1
/*     */     //   194: lxor
/*     */     //   195: invokestatic getName : ()Ljava/lang/String;
/*     */     //   198: astore #7
/*     */     //   200: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   205: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   208: astore #8
/*     */     //   210: sipush #17790
/*     */     //   213: ldc2_w 5146894436687331274
/*     */     //   216: lload_1
/*     */     //   217: lxor
/*     */     //   218: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   223: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   226: astore #9
/*     */     //   228: sipush #3705
/*     */     //   231: ldc2_w 1691532244406105331
/*     */     //   234: lload_1
/*     */     //   235: lxor
/*     */     //   236: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   241: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   244: astore #10
/*     */     //   246: sipush #13904
/*     */     //   249: ldc2_w 1628480259733900527
/*     */     //   252: lload_1
/*     */     //   253: lxor
/*     */     //   254: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   259: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   262: astore #11
/*     */     //   264: invokestatic getRuntime : ()Ljava/lang/Runtime;
/*     */     //   267: invokevirtual availableProcessors : ()I
/*     */     //   270: istore #12
/*     */     //   272: new com/google/gson/JsonObject
/*     */     //   275: dup
/*     */     //   276: invokespecial <init> : ()V
/*     */     //   279: astore #13
/*     */     //   281: aload #13
/*     */     //   283: sipush #27598
/*     */     //   286: ldc2_w 3064908750471270755
/*     */     //   289: lload_1
/*     */     //   290: lxor
/*     */     //   291: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   296: getstatic me/konsolas/aac/MetricsLite.serverUUID : Ljava/lang/String;
/*     */     //   299: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   302: aload #13
/*     */     //   304: sipush #13660
/*     */     //   307: ldc2_w 1848764615918538722
/*     */     //   310: lload_1
/*     */     //   311: lxor
/*     */     //   312: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   317: iload #4
/*     */     //   319: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   322: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/Number;)V
/*     */     //   325: aload #13
/*     */     //   327: sipush #12184
/*     */     //   330: ldc2_w 5795007675681887504
/*     */     //   333: lload_1
/*     */     //   334: lxor
/*     */     //   335: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   340: iload #5
/*     */     //   342: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   345: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/Number;)V
/*     */     //   348: aload #13
/*     */     //   350: sipush #26830
/*     */     //   353: ldc2_w 1334739022008357464
/*     */     //   356: lload_1
/*     */     //   357: lxor
/*     */     //   358: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   363: aload #6
/*     */     //   365: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   368: aload #13
/*     */     //   370: sipush #16968
/*     */     //   373: ldc2_w 6583426901775890685
/*     */     //   376: lload_1
/*     */     //   377: lxor
/*     */     //   378: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   383: aload #7
/*     */     //   385: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   388: aload #13
/*     */     //   390: sipush #23263
/*     */     //   393: ldc2_w 6407004194370789460
/*     */     //   396: lload_1
/*     */     //   397: lxor
/*     */     //   398: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   403: aload #8
/*     */     //   405: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   408: aload #13
/*     */     //   410: sipush #24311
/*     */     //   413: ldc2_w 4352087362734236750
/*     */     //   416: lload_1
/*     */     //   417: lxor
/*     */     //   418: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   423: aload #9
/*     */     //   425: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   428: aload #13
/*     */     //   430: sipush #21956
/*     */     //   433: ldc2_w 5339221406231998326
/*     */     //   436: lload_1
/*     */     //   437: lxor
/*     */     //   438: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   443: aload #10
/*     */     //   445: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   448: aload #13
/*     */     //   450: sipush #5439
/*     */     //   453: ldc2_w 600593044851716026
/*     */     //   456: lload_1
/*     */     //   457: lxor
/*     */     //   458: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   463: aload #11
/*     */     //   465: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   468: aload #13
/*     */     //   470: sipush #15428
/*     */     //   473: ldc2_w 1072561292056151791
/*     */     //   476: lload_1
/*     */     //   477: lxor
/*     */     //   478: <illegal opcode> n : (IJ)Ljava/lang/String;
/*     */     //   483: iload #12
/*     */     //   485: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   488: invokevirtual addProperty : (Ljava/lang/String;Ljava/lang/Number;)V
/*     */     //   491: aload #13
/*     */     //   493: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 18
/*     */     //   #52	-> 56
/*     */     //   #29	-> 86
/*     */     //   #143	-> 119
/*     */     //   #41	-> 137
/*     */     //   #14	-> 140
/*     */     //   #70	-> 142
/*     */     //   #37	-> 152
/*     */     //   #65	-> 185
/*     */     //   #72	-> 195
/*     */     //   #7	-> 200
/*     */     //   #32	-> 218
/*     */     //   #89	-> 236
/*     */     //   #86	-> 254
/*     */     //   #43	-> 264
/*     */     //   #28	-> 272
/*     */     //   #112	-> 281
/*     */     //   #16	-> 302
/*     */     //   #103	-> 325
/*     */     //   #35	-> 348
/*     */     //   #50	-> 368
/*     */     //   #126	-> 388
/*     */     //   #27	-> 408
/*     */     //   #60	-> 428
/*     */     //   #33	-> 448
/*     */     //   #9	-> 468
/*     */     //   #117	-> 491
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   18	137	140	java/lang/Exception
/*     */     //   56	73	76	java/lang/Exception
/*     */     //   65	109	109	java/lang/Exception
/*     */     //   152	162	165	java/lang/Exception
/*     */   }
/*     */   
/*     */   public boolean isEnabled() {
/*  93 */     return this.enabled;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void startSubmitting() {
/* 139 */     Timer timer = new Timer(true);
/*     */     timer.scheduleAtFixedRate(new lW(this, timer), 300000L, 1800000L);
/*     */   }
/*     */   
/*     */   private static Throwable a(Throwable paramThrowable) {
/*     */     return paramThrowable;
/*     */   }
/*     */   
/*     */   private static String a(byte[] paramArrayOfbyte) {
/*     */     byte b1 = 0;
/*     */     int i;
/*     */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*     */     for (byte b2 = 0; b2 < i; b2++) {
/*     */       int j;
/*     */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*     */         arrayOfChar[b1++] = (char)j;
/*     */       } else if (j < 224) {
/*     */         char c = (char)((char)(j & 0x1F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } else if (b2 < i - 2) {
/*     */         char c = (char)((char)(j & 0xF) << 12);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } 
/*     */     } 
/*     */     return new String(arrayOfChar, 0, b1);
/*     */   }
/*     */   
/*     */   private static String a(int paramInt, long paramLong) {
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x179C;
/*     */     if (c[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])d.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           d.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         throw new RuntimeException("me/konsolas/aac/MetricsLite", exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
/*     */       c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return c[i];
/*     */   }
/*     */   
/*     */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*     */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*     */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*     */     String str = a(i, l);
/*     */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*     */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*     */     return str;
/*     */   }
/*     */   
/*     */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*     */     // Byte code:
/*     */     //   0: new java/lang/invoke/MutableCallSite
/*     */     //   3: dup
/*     */     //   4: aload_2
/*     */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*     */     //   8: astore_3
/*     */     //   9: aload_3
/*     */     //   10: ldc_w
/*     */     //   13: ldc_w [Ljava/lang/Object;
/*     */     //   16: aload_2
/*     */     //   17: invokevirtual parameterCount : ()I
/*     */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*     */     //   23: iconst_0
/*     */     //   24: iconst_3
/*     */     //   25: anewarray java/lang/Object
/*     */     //   28: dup
/*     */     //   29: iconst_0
/*     */     //   30: aload_0
/*     */     //   31: aastore
/*     */     //   32: dup
/*     */     //   33: iconst_1
/*     */     //   34: aload_3
/*     */     //   35: aastore
/*     */     //   36: dup
/*     */     //   37: iconst_2
/*     */     //   38: aload_1
/*     */     //   39: aastore
/*     */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*     */     //   43: aload_2
/*     */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*     */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*     */     //   50: goto -> 104
/*     */     //   53: astore #4
/*     */     //   55: new java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: new java/lang/StringBuilder
/*     */     //   62: dup
/*     */     //   63: invokespecial <init> : ()V
/*     */     //   66: ldc_w 'me/konsolas/aac/MetricsLite'
/*     */     //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   72: ldc_w ' : '
/*     */     //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   78: aload_1
/*     */     //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   82: ldc_w ' : '
/*     */     //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   88: aload_2
/*     */     //   89: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   95: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   98: aload #4
/*     */     //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   103: athrow
/*     */     //   104: aload_3
/*     */     //   105: areturn
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	50	53	java/lang/Exception
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\MetricsLite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */