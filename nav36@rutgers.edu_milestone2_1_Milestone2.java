
/* Submit this file for Project Part 1 */
public class Milestone2 {
	

    public static void main (String[] args) {

	// Instantiate a Picture object from file mypic.jpg
	Picture p= new Picture("C:\\Users\\EcuaB\\OneDrive\\Desktop\\finalm.png");

	// The object referenced by p will be manipulated by your methods.

	// Example on how to call the countRedPixels method
	int redPixels = countRedPixels(p);
	System.out.println("The number of red pixels is: " + redPixels);
	flipDiagonal(p);
	 p.write("C:\\Users\\EcuaB\\OneDrive\\Desktop\\fliphor.png");
	 
    }
    
    /*
     * 1) Returns the number of red pixels in picture v
     */
    public static int countRedPixels(Picture v) {
	// WRITE YOUR CODE HERE
    	int y=v.getHeight();//gets height in pixel of picture v
    	System.out.println(y);//test
    	int howmanyred=0;//var for how many red pixels
    	int x=v.getWidth();// width in pixels of picture v
    	System.out.println(x);// test
    	for(int i=0;i<y;i++) {//loop that should go over the width (example 1wx1,1x2 until loop is done)
    		for (int j=0;j<x;j++) {//loop that helps 
    			Pixel image=new  Pixel (v,j,i);
    			int red=image.getRed();
    			int blue=image.getBlue();
    			int green=image.getGreen();
    			if (red==255&&blue==0&&green==0)
    				howmanyred++;
 
    		}
    	}
    	return howmanyred;
    	
    }
	
    /*
     * 2) Change all the red pixels in an image to blue pixels and vice versa 
     *    Only pure red and pure blue
     */
    public static void switchRedBlue(Picture v) {
	// WRITE YOUR CODE HERE
    	for(int i=0;i<v.getHeight();i++) {
    		for (int j=0;j<v.getWidth();j++) {
    		   Pixel image=new Pixel(v,i,j);
    		   int red=image.getRed();
    		   int blue=image.getBlue();
    		   int green=image.getGreen();
    		   if (red==255&&blue==0&&green==0) {
    			   image.setRed(0);
    			   image.setBlue(255);
    			   image.setGreen(0);
    		   }else if(red==0&&blue==255&&green==0) {
    			   image.setRed(255);
    			   image.setBlue(0);
    			   image.setGreen(0);
    			   
    		   }
    				   
    		}
    	}
    		
    		
    	
    }

    /*
     * 3. Take the left half of an image and reflect it over an imaginary 
     *    vertical line going across the middle of the image.
     *    IF pixels exist ON the midline, leave them there without reflecting
     */
    public static void flipHorizontal(Picture v) {
	// WRITE YOUR CODE HERE
    	for(int rows=0;rows<v.getHeight();rows++) {
    		for (int cols=0;cols<v.getWidth()/2;cols++) {
    			int red=v.getPixel(cols, rows).getRed();
    			int blue=v.getPixel(cols, rows).getBlue();
    			int green=v.getPixel(cols, rows).getGreen();
    			
    			v.getPixel(v.getWidth()-1-cols,rows).setRed(red);
    			v.getPixel(v.getWidth()-1-cols,rows).setBlue(blue);
    			v.getPixel(v.getWidth()-1-cols,rows).setGreen(green);
			}
		}
    			 
    			
    		
    
    		
    	
    }
	 
    /*
     * 4. Take the top half of an image and reflect it over an imaginary horizontal 
     *    line going through the image 
     *    IF pixels exist ON the midline, leave them there without reflecting
     */
    public static void flipVertical(Picture v) {
	// WRITE YOUR CODE HERE
    	for(int i=0;i<v.getHeight()/2;i++) {
    		for (int j=0;j<v.getWidth();j++) {
    			int red=v.getPixel(j,i).getRed();
    			int blue=v.getPixel( j,i).getBlue();
    			int green=v.getPixel(j, i).getGreen();
    			
    			v.getPixel(j,v.getHeight()-1-i).setRed(red);
    			v.getPixel(j,v.getHeight()-1-i).setBlue(blue);
    			v.getPixel(j,v.getHeight()-1-i).setGreen(green);
    }
    	}
    }

    /*
     * 5. Take the upper half of an image and reflect it over an imaginary diagonal 
     *    line going from the upper left corner of the image to the lower right corner. 
     *    Upper right to lower left diagonal line
     *    You may assume SQUARE images (height == width)
     *    IF pixels exist ON the midline, leave them there without reflecting
     */
    public static void flipDiagonal(Picture v) {
	// WRITE YOUR CODE HERE
    	int x=v.getHeight();
    	int y=v.getWidth(); 
    	int red;
    	int blue;
    	int green;
    	
    	for(int i=0;i<x;i++){
    		for(int j=0;j<y-1-i;j++) {
    			red=v.getPixel(j,i).getRed();
    			blue=v.getPixel( j,i).getBlue();
    			green=v.getPixel(j, i).getGreen();
    			
    			
    			v.getPixel(y-1-j,x-1-i).setRed(red);///
    			v.getPixel(y-1-j,x-1-i).setBlue(blue);
    			v.getPixel(y-1-j,x-1-i).setGreen(green);
    			
    			
        		
    		}
}
    	
    		
    		
    		}
    	}

