/* 1 */ package me.konsolas.aac;public abstract class m8 { public static final double b = 0.5D; private final String a; private static boolean c; private static v b(v paramv) { return paramv; } public String a() { return this.a; }
/*   */   static { // Byte code:
/*   */     //   0: ldc2_w 1970811067610490340
/*   */     //   3: ldc2_w 1851584791280961096
/*   */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*   */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*   */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*   */     //   15: ldc2_w 108471755816964
/*   */     //   18: invokeinterface a : (J)J
/*   */     //   23: ldc2_w 47870914807962
/*   */     //   26: lxor
/*   */     //   27: lstore_0
/*   */     //   28: ldc2_w 1430792364470111568
/*   */     //   31: lload_0
/*   */     //   32: <illegal opcode> w : (JJ)Z
/*   */     //   37: ifne -> 50
/*   */     //   40: iconst_1
/*   */     //   41: ldc2_w 1411394935742450669
/*   */     //   44: lload_0
/*   */     //   45: <illegal opcode> w : (ZJJ)V
/* 2 */     //   50: return } public static boolean a() { boolean bool = b(); try { if (!bool) return true;  } catch (v v) { throw b(null); }  return false; } public static boolean b() { return c; } public static void b(boolean paramBoolean) { c = paramBoolean; } public abstract Optional a(long paramLong, List paramList, lY paramlY, ef paramef, String paramString); public m8(String paramString) { this.a = paramString; }
/*   */    }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\m8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */