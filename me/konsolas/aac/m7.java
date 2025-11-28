/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface m7 extends Comparator { @Deprecated default int a(Double paramDouble1, Double paramDouble2) { return a(paramDouble1.doubleValue(), paramDouble2.doubleValue()); } public static final long b = nc.a(5588491621957630846L, 8526309209333316702L, MethodHandles.lookup().lookupClass()).a(114748771098656L); @Deprecated
/*    */   default int compare(Object paramObject1, Object paramObject2) {
/*  3 */     return a((Double)paramObject1, (Double)paramObject2); } default Comparator thenComparing(Comparator<?> paramComparator) { 
/*  4 */     try { if (paramComparator instanceof m7) return a((m7)paramComparator);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */     
/*  6 */     return super.thenComparing(paramComparator); } default m7 a() { return dI.a(this); }
/*  7 */   default m7 a(m7 paramm7) { return (paramDouble1, paramDouble2) -> { int i = a(paramDouble1, paramDouble2); try {  }
/*  8 */         catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */          return (i == 0) ? paramm7.a(paramDouble1, paramDouble2) : i;
/* 10 */       }; } default Comparator reversed() { return a(); }
/*    */ 
/*    */   
/*    */   int a(double paramDouble1, double paramDouble2);
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\m7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */