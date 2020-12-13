package com;


import android.view.View;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.android3lesson6.MainActivity;
import com.example.android3lesson6.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void sampleTest() {
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(not(isDisplayed())));
    }

    @Test
    public void addTest() {
        onView(withId(R.id.et_operand_first)).perform(typeText("5"));
        onView(withId(R.id.et_operand_second)).perform(typeText("7"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("12")));
    }

    @Test
    public void subTest() {
        onView(withId(R.id.et_operand_first)).perform(typeText("20"));
        onView(withId(R.id.et_operand_second)).perform(typeText("7"));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("13")));
    }

    @Test
    public void divTest() {
        onView(withId(R.id.et_operand_first)).perform(typeText("15"));
        onView(withId(R.id.et_operand_second)).perform(typeText("3"));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("5")));
    }

    @Test
    public void multiplyTest() {
        onView(withId(R.id.et_operand_first)).perform(typeText("15"));
        onView(withId(R.id.et_operand_second)).perform(typeText("3"));
        onView(withId(R.id.btn_multiply)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("45")));
    }
}
