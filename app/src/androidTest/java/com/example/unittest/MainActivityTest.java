package com.example.unittest;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static org.junit.Assert.*;



public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =new ActivityTestRule<>(MainActivity.class);
    public MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity= activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("TAG","onCreate()");
    }

    @Test
    public void bclick() {
        Log.d("TAG","Button was clicked");
    }
    @Test
    public void testClickButton(){
//        mainActivity.findViewById(R.id.button2);
        Espresso.onView(withId(R.id.editText)).perform(typeText("233"));
        Espresso.onView(withId(R.id.btn)).perform(click());
        /*Espresso.onView(withId(R.id.editText)).perform(typeText("test123"));
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.editText)).perform(typeText("test456"));
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.editText)).perform(typeText("test3"));
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.editText)).perform(typeText("test0"));
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.editText)).perform(typeText("test789546"));
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.editText)).perform(typeText("test233"));
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.editText)).perform(typeText("test45646876769796546"));
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.editText)).perform(typeText("test11111111111111111111111111111111"));
        Espresso.onView(withId(R.id.btn)).perform(click());
*/
    }
}