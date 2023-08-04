package io.agora.chat.uikit.chat.interfaces;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public interface EaseChatPrimaryMenuListener{
        /**
         * when send button clicked
         * @param content
         */
        void onSendBtnClicked(String content);

        /**
         * when typing on the edit-text layout.
         */
        void onTyping(CharSequence s, int start, int before, int count);

        /**
         * after typing Text changed
         */
        void onAfterTypingChanged(Editable editable);

        /**
         * edit text OnKeyListener
         */
        boolean editTextOnKeyListener(View v, int keyCode, KeyEvent event);

        /**
         * when speak button is touched
         * @return
         */
        boolean onPressToSpeakBtnTouch(View v, MotionEvent event);

        /**
         * toggle on/off voice button
         */
        void onToggleVoiceBtnClicked();

        /**
         * toggle on/off text button
         */
        void onToggleTextBtnClicked();

        /**
         * toggle on/off extend menu
         * @param extend
         */
        void onToggleExtendClicked(boolean extend);

        /**
         * toggle on/off emoji icon
         * @param extend
         */
        void onToggleEmojiconClicked(boolean extend);

        /**
         * on text input is clicked
         */
        void onEditTextClicked();

        /**
         * if edit text has focus
         */
        void onEditTextHasFocus(boolean hasFocus);

}