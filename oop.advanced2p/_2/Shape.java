package javabasics._2.oop.advanced2p._2;

 abstract class Shape {
    private Double height, width;

     public Shape(Double height, Double width) {
         this.height = height;
         this.width = width;
     }

     public Double getHeight() {
         return height;
     }

     public void setHeight(Double height) {
         this.height = height;
     }

     public Double getWidth() {
         return width;
     }

     public void setWidth(Double width) {
         this.width = width;
     }

 }
