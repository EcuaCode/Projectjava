public class MyPicture {

    /*
     * Fields or instance variables
     */
    public Picture picture; // basis that provides the extension of class Picture
    private String filename; // the name of the image file
    private int width;       // the image width
    private int length;      // the image length
    private String description; // the image description

    /* 
     * Constructor. 
     * Takes as a parameter the name of the file to load and a description of the picture.
     * The width and height of an image are available in the Picture class.
     */
    public MyPicture(String filename, String description) {
	// WRITE YOUR CODE HERE
    this.picture= new Picture(filename);
    this.width=picture.getWidth();
    this.length=picture.getHeight();
    this.filename =filename;
    this.description = description;
    }

    /*
     * Returns the string representation for a MyPicture object.
     * The string's format should match the following EXACTLY:
     *       <imagename>.<extension> <width> x <length> <description>
     * Replace <xxx> with the respective data about this image
     */
    public String toString() {
	// WRITE YOUR CODE HERE
    	/*String justname=new String();
    	for(int i=filename.length()-1;i>=0;i--) {
    		//char ch=filename.charAt(i);
    		if (filename.charAt(i)=='/') {
    			justname=filename.substring(i+1);
    			break;	
    		}  
    		*/
    	if(filename==null) {
    		return null;
    	}
    	
    	
    	String str= this.filename +" "+ this.width+" "+"x"+" "+ this.length+" "+ this.description;
    	return str;
    	
    	
    			}

    /*
     * Returns true of the parameter MyPicture object is equal 
     * to the current instance, false otherwise. MyPicture objects 
     * are considered equal if and only if their filenames are the 
     * same AND their descriptions are the same.
     */
    public boolean equals(MyPicture p) {
	// WRITE YOUR CODE HERE
    	if(p.filename==null||p.description==null) {
    		return false;
    	}
    	
    	if(filename.equals(p.filename)&& description.equals(p.description)) {
    		return true;
    	}else 
    		return false;
    }

    /* 
     * Returns a new Picture object representing the 'negative'
     * image of this MyPicture object. The negative of a pixel
     * is defined by taking each pixel's red, blue, and green value and
     * subtracting that value from 255.
     */
    public Picture negative () {
	// WRITE YOUR CODE HERE
    	if(this.picture==null) {
    		return null;
    	}
    	for(int i=0;i<this.width;i++) {//loop that should go over the width (example 1wx1,1x2 until loop is done)
    		for (int j=0;j<this.length;j++) {//loop that helps 
    			Pixel image=new  Pixel (this.picture,i,j);
    			 int red=image.getRed();
      		   int blue=image.getBlue();
      		   int green=image.getGreen();
      		  image.setRed(255-red);
			   image.setBlue(255-blue);
			   image.setGreen(255-green);
    		}
    		
    	}
    	return this.picture;
    }

    /*
     * Returns the redness score of this image. 
     * The redness score is defined by the total number of pixels that have
     * a red value that is greater than both the blue and green
     * pixels divided by the total number of pixels
     */
    public double redness() {
	// WRITE YOUR CODE HERE
    	if(this.picture==null) {
    		return 0.0;
    	}
    	double howmanyredpix=0;
    	for(int i=0;i<this.width;i++) {
    		for (int j=0;j<this.length;j++) {
    		   Pixel image=new Pixel(this.picture,i,j);
    		   double red=image.getRed();
      		   double blue=image.getBlue();
      		   double green=image.getGreen();
      		   if (red>blue&&red>green) {
      			   howmanyredpix++;
      			   
      		   }
    		   
    		}
    	}
    	double totalpixs=width*length;
    	return howmanyredpix/totalpixs;
    }

    /* 
     * Convert flipHorizontal from Part 1 to an instance method
     */
    public void flipHorizontal () {
	// WRITE YOUR CODE HERE
    	if (this.picture==null) {
    		return;
    	}
    	for(int rows=0;rows<this.picture.getHeight();rows++) {
    		for (int cols=0;cols<this.picture.getWidth()/2;cols++) {
    			int red=this.picture.getPixel(cols, rows).getRed();
    			int blue=this.picture.getPixel(cols, rows).getBlue();
    			int green=this.picture.getPixel(cols, rows).getGreen();
    			
    			this.picture.getPixel(picture.getWidth()-1-cols,rows).setRed(red);
    			this.picture.getPixel(picture.getWidth()-1-cols,rows).setBlue(blue);
    			this.picture.getPixel(picture.getWidth()-1-cols,rows).setGreen(green);
    }
    	}
    }

    /* 
     * Convert flipVertical from Part 1 to an instance method
     */
    public void flipVertical () {
	// WRITE YOUR CODE HERE
    	//if(picture==null) {
    		//return;
    	//}
    	for(int i=0;i<this.picture.getHeight()/2;i++) {
    		for (int j=0;j<this.picture.getWidth();j++) {
    			int red=this.picture.getPixel(j,i).getRed();
    			int blue=this.picture.getPixel( j,i).getBlue();
    			int green=this.picture.getPixel(j, i).getGreen();
    			
    			this.picture.getPixel(j,picture.getHeight()-1-i).setRed(red);
    			this.picture.getPixel(j,picture.getHeight()-1-i).setBlue(blue);
    			this.picture.getPixel(j,picture.getHeight()-1-i).setGreen(green);
    		}
    		}	
    }
   
}
