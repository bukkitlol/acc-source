/*   */ package me.konsolas.aac;
/* 2 */ class h3 implements il { final Comparator a; public int a(Float paramFloat1, Float paramFloat2) { return this.a.compare(paramFloat1, paramFloat2); } h3(Comparator paramComparator) {} public int a(float paramFloat1, float paramFloat2) {
/* 3 */     return this.a.compare(Float.valueOf(paramFloat1), Float.valueOf(paramFloat2)); } public int compare(Object paramObject1, Object paramObject2) {
/* 4 */     return a((Float)paramObject1, (Float)paramObject2);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\h3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */