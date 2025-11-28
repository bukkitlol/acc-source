/* 1 */ package me.konsolas.aac;class g7 implements m7 { public int compare(Object paramObject1, Object paramObject2) { return a((Double)paramObject1, (Double)paramObject2); } final Comparator a; public int a(Double paramDouble1, Double paramDouble2) {
/* 2 */     return this.a.compare(paramDouble1, paramDouble2); } public int a(double paramDouble1, double paramDouble2) {
/* 3 */     return this.a.compare(Double.valueOf(paramDouble1), Double.valueOf(paramDouble2));
/*   */   }
/*   */   
/*   */   g7(Comparator paramComparator) {} }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */