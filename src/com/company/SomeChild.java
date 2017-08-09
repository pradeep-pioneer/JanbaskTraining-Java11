package com.company;

/**
 * Created by prade on 8/9/2017.
 */
@MyAnnotation(
        value="123",
        name="Jakob",
        age=37,
        newNames={"Jenkov", "Peterson"}
)
public class SomeChild extends SomeBase {

    @SuppressWarnings("deprecation")
    @Override
    public void oldMethod(String methodName) {
        super.oldMethod(methodName);
        System.out.println("This is something additional from child class");
    }

    @DoNothingAnnotation(placeHolderName = "This is a future method!")
    public void doNothing(){

    }
}
