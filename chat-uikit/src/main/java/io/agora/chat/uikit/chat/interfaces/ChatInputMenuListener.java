package io.agora.chat.uikit.chat.interfaces;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public interface ChatInputMenuListener {
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
     * when send message button pressed
     *
     * @param content
     *            message content
     */
    void onSendMessage(String content);

    /**
     * when big icon pressed
     * @param emojicon
     */
    void onExpressionClicked(Object emojicon);

    /**
     * when speak button is touched
     * @param v
     * @param event
     * @return
     */
    boolean onPressToSpeakBtnTouch(View v, MotionEvent event);

    /**
     * when click the item of extend menu
     * @param itemId
     * @param view
     */
    void onChatExtendMenuItemClick(int itemId, View view);
}
