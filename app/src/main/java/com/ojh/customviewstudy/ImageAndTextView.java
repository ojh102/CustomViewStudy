package com.ojh.customviewstudy;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by JaeHwan Oh on 2016-06-24.
 */
public class ImageAndTextView extends LinearLayout {

    ImageView imageView;
    TextView textView;

    public ImageAndTextView(Context context) {
        super(context);
        initView();
    }

    public ImageAndTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
        getAttr(attrs);
    }

    public ImageAndTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
        getAttr(attrs, defStyleAttr);
    }

    private void initView() {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_image_and_text, this, false);
        addView(view);

        imageView = (ImageView)findViewById(R.id.imageView);
        textView = (TextView)findViewById(R.id.textView);

    }

    private void getAttr(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ImageAndTextView);
        setTypedArray(typedArray);

    }

    private void getAttr(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ImageAndTextView, defStyleAttr, 0);
        setTypedArray(typedArray);
    }

    private void setTypedArray(TypedArray typedArray) {
        int imageResID = typedArray.getResourceId(R.styleable.ImageAndTextView_image, R.mipmap.ic_launcher);
        setImage(imageResID);

        String text = typedArray.getString(R.styleable.ImageAndTextView_text);
        setText(text);

        int textColorResId = typedArray.getResourceId(R.styleable.ImageAndTextView_textColor, Color.GREEN);
        setTextColor(textColorResId);

        typedArray.recycle();
    }

    void setImage(int imageResID) {
        imageView.setImageResource(imageResID);
    }

    void setText(String text) {
        textView.setText(text);
    }

    void setTextColor(int textColorResID) {
        textView.setTextColor(textColorResID);
    }
}
