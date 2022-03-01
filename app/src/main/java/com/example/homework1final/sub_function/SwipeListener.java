package com.example.homework1final.sub_function;

import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.homework1final.MainActivity;
import com.example.homework1final.RandomPersonActivity;
import com.example.homework1final.api.Api_Functional;

public class SwipeListener implements View.OnTouchListener {
    // Initialize data
    private final GestureDetector gestureDetector;
    // End initializing

    // Constructor
    // Didn't really know about code below, but it's work.
    public SwipeListener(
        View view,
        TextView textView
    ) {
        int threshold = 100;
        int velocity_threshold = 100;

        GestureDetector.SimpleOnGestureListener listener = new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                // Get x and y difference
                float xDiff = e2.getX() - e1.getX();
                float yDiff = e2.getY() - e1.getY();

                try {
                    if (Math.abs(xDiff) > Math.abs(yDiff)) {
                        if (
                            Math.abs(xDiff) > threshold
                            && Math.abs(velocityX) > velocity_threshold
                        ) {
                            if (xDiff > 0) {
                                onSwipeRight();
                            } else {
                                onSwipeLeft();
                                // TODO: Need an override function or something lines of code in here!
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            }

            public void onSwipeRight() {
                textView.setText("Swipe Right");
            }

            public void onSwipeLeft() {
                textView.setText("Swipe Left");
            }
        };
        // Initialize gesture detector,
        // Deprecated but it's work.
        gestureDetector = new GestureDetector(listener);
        view.setOnTouchListener(this);
    }
    // End constructor

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return gestureDetector.onTouchEvent(motionEvent);
    }
}
