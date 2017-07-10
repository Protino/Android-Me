package com.example.android.android_me;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.android.android_me.ui.AndroidMeActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

/**
 * @author root
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AndroidMeActivityTest {

    @Rule
    public ActivityTestRule<AndroidMeActivity> activityTestRule = new ActivityTestRule<>
            (AndroidMeActivity.class);

    @Test
    public void checkHeadDisplay() {
        onView(withContentDescription("Head")).check(matches(withContentDescription("Head")));
        onView(withContentDescription("Body")).check(matches(withContentDescription("Body")));
        onView(withContentDescription("Leg")).check(matches(withContentDescription("Leg")));
    }
}
