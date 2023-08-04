package io.agora.chat.uikit.chat.interfaces;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;

public interface OnChatInputChangeListener {
    /**
     * EditText text change monitoring
     * @param s
     * @param start
     * @param before
     * @param count
     */
    void onTextChanged(CharSequence s, int start, int before, int count);

    /**
     * after typing Text changed
     */
    default void afterTextChanged(Editable editable){}

    /**
     * edit text OnKeyListener
     */
     boolean editTextOnKeyListener(View v, int keyCode, KeyEvent event);
}
