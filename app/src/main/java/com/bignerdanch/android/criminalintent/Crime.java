package com.bignerdanch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Семен on 16.11.2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    private Date mDate;
    private boolean mSolved;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime() {

        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
