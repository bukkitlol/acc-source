/*   */ package me.konsolas.aac;@FunctionalInterface public interface g9 extends Comparator { public static final long b = nc.a(4104231927199065906L, -8909033940263838170L, MethodHandles.lookup().lookupClass()).a(4111257941213L); default Comparator thenComparing(Comparator<?> paramComparator) { 
/* 2 */     try { if (paramComparator instanceof g9) return a((g9)paramComparator);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*   */     
/* 4 */     return super.thenComparing(paramComparator); } default Comparator reversed() { return a(); }
/* 5 */   default g9 a() { return dT.a(this); }
/* 6 */   default g9 a(g9 paramg9) { return (paramByte1, paramByte2) -> { int i = a(paramByte1, paramByte2); try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (i == 0) ? paramg9.a(paramByte1, paramByte2) : i;
/* 7 */       }; } @Deprecated default int a(Byte paramByte1, Byte paramByte2) { return a(paramByte1.byteValue(), paramByte2.byteValue()); } @Deprecated
/* 8 */   default int compare(Object paramObject1, Object paramObject2) { return a((Byte)paramObject1, (Byte)paramObject2); }
/*   */ 
/*   */   
/*   */   int a(byte paramByte1, byte paramByte2);
/*   */   
/*   */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*   */     return paramIllegalArgumentException;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */