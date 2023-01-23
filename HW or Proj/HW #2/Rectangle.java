/******************************************************************
 *                           Rectangle                            *
 *_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ *

 * width: double                                                 *
 
 * height: double                                                * 
 -----------------------------------------------------------------
 * Rectangle()                                                   * 
 
 * Rectangle(newWidth: double, newHeight: double)                * 

 * getArea(): double                                             *
  
 * getPerimeter(): double                                        *
 *****************************************************************/


class Rectangle
{
    double width, height = 1;

    Rectangle()
    {

    }
    Rectangle(double newWidth, double newHeight)
    {
        width = newWidth;
        height = newHeight;
    }

    double getArea()
    {
        return width * height;
    }

    double getPerimeter()
    {
        return 2 * (width + height);
    }

}