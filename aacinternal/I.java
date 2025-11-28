/*   */ package aacinternal;
/*   */ public class i implements p {
/*   */   public i(long paramLong, int paramInt) {
/* 4 */     if (paramInt <= 0)
/*   */     {
/*   */ 
/*   */       
/* 8 */       throw new v(P.NUMBER_TOO_SMALL_BOUND_EXCLUDED, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0) }, (short)j, k, (short)m); } 
/*   */     this.a = paramInt;
/*   */   }
/*   */   
/*   */   private final int a;
/*   */   private static final long b = nc.a(-1940730406358386802L, -8220119673066589604L, MethodHandles.lookup().lookupClass()).a(94483744841852L);
/*   */   
/*   */   public int a() {
/*   */     return this.a;
/*   */   }
/*   */   
/*   */   public static i a(int paramInt, char paramChar1, char paramChar2) {
/*   */     long l1 = (paramInt << 32L | paramChar1 << 48L >>> 32L | paramChar2 << 48L >>> 48L) ^ b, l2 = l1 ^ 0x58F7AACBA93EL;
/*   */     return new i(l2, 2147483647);
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */