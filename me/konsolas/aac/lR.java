/*   */ package me.konsolas.aac;
/* 2 */ class lr implements ad { final Comparator a; public int compare(Object paramObject1, Object paramObject2) { return a((Short)paramObject1, (Short)paramObject2); } lr(Comparator paramComparator) {} public int a(Short paramShort1, Short paramShort2) {
/* 3 */     return this.a.compare(paramShort1, paramShort2); } public int a(short paramShort1, short paramShort2) {
/* 4 */     return this.a.compare(Short.valueOf(paramShort1), Short.valueOf(paramShort2));
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */