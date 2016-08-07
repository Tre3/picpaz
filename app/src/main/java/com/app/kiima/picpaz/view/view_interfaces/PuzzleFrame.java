package com.app.kiima.picpaz.view.view_interfaces;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import java.util.List;

/**
 * Created by Tre3 on 2016/08/07.
 */

public abstract class PuzzleFrame extends FrameLayout {

    public PuzzleFrame(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setPieces(List<PuzzlePieceInterface> pieces) {

    }
}
