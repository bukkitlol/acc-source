/* 1 */ package aacinternal;public interface ad { default double a(char paramChar, double[] paramArrayOfdouble1, short paramShort, double[] paramArrayOfdouble2, int paramInt) throws v { long l1 = (paramChar << 48L | paramShort << 48L >>> 16L | paramInt << 32L >>> 32L) ^ e, l2 = l1 ^ 0x363C5CF0F14BL; return a(paramArrayOfdouble1, paramArrayOfdouble2, 0, paramArrayOfdouble1.length, l2); }
/*   */ 
/*   */   
/*   */   public static final long e = nc.a(-4775368258752373910L, 7370100385276305960L, MethodHandles.lookup().lookupClass()).a(120641731932069L);
/*   */   
/*   */   double a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2, long paramLong) throws v; }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */