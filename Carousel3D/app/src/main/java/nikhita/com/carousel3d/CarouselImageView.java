package nikhita.com.carousel3d;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by meghana on 4/26/2016.
 */
public class CarouselImageView extends ImageView
        implements Comparable<carouselimageview> {

    private int index;
    private float currentAngle;
    private float x;
    private float y;
    private float z;
    private boolean drawn;

    public CarouselImageView(Context context) {
        this(context, null, 0);
    }

    public CarouselImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CarouselImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public int compareTo(CarouselImageView another) {
        return (int)(another.z – this.z);
    }

    …
}