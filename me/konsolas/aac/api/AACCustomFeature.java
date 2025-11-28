/*    */ package me.konsolas.aac.api;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AACCustomFeature
/*    */ {
/*    */   private final String info;
/*    */   private final double score;
/* 13 */   private final Map<String, String> tooltip = new LinkedHashMap<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AACCustomFeature(String paramString1, String paramString2, double paramDouble, Map<String, String> paramMap) {
/* 24 */     this.info = paramString2;
/* 25 */     this.score = paramDouble;
/* 26 */     this.tooltip.put("id", paramString1);
/* 27 */     this.tooltip.putAll(paramMap);
/*    */   }
/*    */   
/*    */   public String getInfo() {
/* 31 */     return this.info;
/*    */   }
/*    */   
/*    */   public Map<String, String> getTooltip() {
/* 35 */     return Collections.unmodifiableMap(this.tooltip);
/*    */   }
/*    */   
/*    */   public double getScore() {
/* 39 */     return this.score;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\api\AACCustomFeature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */