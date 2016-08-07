package com.app.kiima.picpaz.view;

import android.content.Context;
import android.util.AttributeSet;

import com.app.kiima.picpaz.view.view_interfaces.PuzzleFrame;
import com.app.kiima.picpaz.view.view_interfaces.PuzzlePieceInterface;

import java.util.List;


/**
 * Created by Tre3 on 2016/08/07.
 */

public class SimplePuzzleFrame extends PuzzleFrame {

    public SimplePuzzleFrame(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setPieces(List<PuzzlePieceInterface> pieces) {
        super.setPieces(pieces);
    }
}
