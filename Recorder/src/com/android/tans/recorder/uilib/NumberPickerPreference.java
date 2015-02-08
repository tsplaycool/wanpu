package com.android.tans.recorder.uilib;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;

import com.android.tans.recorder.R;

public class NumberPickerPreference extends DialogPreference {
	
	    public NumberPickerPreference(Context context, AttributeSet attrs) {
	        super(context, attrs);
	     
	        setDialogLayoutResource(R.xml.dialog);
	        setPositiveButtonText(android.R.string.ok);
	        setNegativeButtonText(android.R.string.cancel);

	       
	        setDialogIcon(null);
	        
	    }
	    
	}