package u.pankratova.ball;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

   public Ball(float x, float y, int radius, int speed, int direction) {
      if (direction < -180 || direction > 180) {
         throw new IllegalArgumentException ("direction should be from [-180; 180]");
      }
         this.x = x;
         this.y = y;
         this.radius = radius;
         this.xDelta = (float) (speed * Math.cos(direction));
         this.yDelta = (float) (-speed * Math.sin(direction));
   }

   public float getX() {
      return x;
   }

   public void setX(float x) {
      this.x = x;
   }

   public float getY() {
      return y;
   }

   public void setY(float y) {
      this.y = y;
   }

   public int getRadius() {
      return radius;
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }

   public float getxDelta() {
      return xDelta;
   }

   public void setxDelta(float xDelta) {
      this.xDelta = xDelta;
   }

   public float getyDelta() {
      return yDelta;
   }

   public void setyDelta(float yDelta) {
      this.yDelta = yDelta;
   }


   public void move(){
      x += xDelta;
      y += yDelta;
   }

   public void reflectHorizontal(){
      this.xDelta = - xDelta;
   }

   public void reflectVertical(){
      this.yDelta = - yDelta;
   }

    
      @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Ball ball = (Ball) o;
      return Float.compare(ball.x, x) == 0 && Float.compare(ball.y, y) == 0 && radius == ball.radius
              && Float.compare(ball.xDelta, xDelta) == 0 && Float.compare(ball.yDelta, yDelta) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash(x, y, radius, xDelta, yDelta);
   }
    
    
   @Override
   public String toString() {
      return "Ball [(" + this.x + ", " + this.y + "), speed = (" + this.xDelta + ", " + this.yDelta + ")]";
   }
}
