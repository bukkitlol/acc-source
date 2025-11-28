/*   */ package me.konsolas.aac;
/* 2 */ class ge extends gm { public ge(Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3, Comparator paramComparator) { super(paramArrayOfObject, paramInt1, paramInt2, paramInt3 | 0x14);
/* 3 */     this.g = paramComparator; } private final Comparator g; protected ge a(int paramInt1, int paramInt2) { return new ge(this.b, paramInt1, paramInt2, this.f, this.g); } protected gm a(int paramInt1, int paramInt2) {
/* 4 */     return a(paramInt1, paramInt2);
/*   */   } public Comparator getComparator() {
/* 6 */     return this.g;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */