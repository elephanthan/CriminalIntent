package com.example.sanghunhan.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by sanghunhan on 2018. 3. 25..
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
