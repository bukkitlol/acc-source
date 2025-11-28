/*   */ package me.konsolas.aac;
/* 2 */ class nt extends nu { public Comparator getComparator() { return this.i; } private final Comparator i; nt(ea paramea, long paramLong, int paramInt, Comparator paramComparator) {
/* 3 */     super(paramea, paramLong, paramInt | 0x14);
/* 4 */     this.i = paramComparator; } nt(ea paramea, int paramInt, Comparator paramComparator) {
/* 5 */     super(paramea, paramInt | 0x14);
/*   */ 
/*   */     
/* 8 */     this.i = paramComparator;
/*   */   }
/*   */   
/*   */   protected ae a(Object[] paramArrayOfObject, int paramInt) {
/*   */     return dK.a(paramArrayOfObject, 0, paramInt, this.c, this.i);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\nt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */