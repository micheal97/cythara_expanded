package com.github.cytharaexpanded;

import android.util.Log;

import com.github.cytharaexpanded.scales.BFlatTuning;
import com.github.cytharaexpanded.scales.ATuning;
import com.github.cytharaexpanded.scales.BTuning;
import com.github.cytharaexpanded.scales.CFlatTuning;
import com.github.cytharaexpanded.scales.CSharpTuning;
import com.github.cytharaexpanded.scales.DFlatTuning;
import com.github.cytharaexpanded.scales.CTuning;
import com.github.cytharaexpanded.scales.EFlatTuning;
import com.github.cytharaexpanded.scales.DTuning;
import com.github.cytharaexpanded.scales.ETuning;
import com.github.cytharaexpanded.scales.FSharpTuning;
import com.github.cytharaexpanded.scales.GFlatTuning;
import com.github.cytharaexpanded.scales.FTuning;
import com.github.cytharaexpanded.scales.AFlatTuning;
import com.github.cytharaexpanded.scales.GTuning;
import com.github.cytharaexpanded.tuning.ChromaticTuning;


class ScaleMapper {
    private static final int NONE=0;
    private static final int C_FLAT_POSITION = 1;
    private static final int C_POSITION = 2;
    private static final int C_SHARP_POSITION = 3;
    private static final int D_FLAT_POSITION = 4;
    private static final int D_POSITION = 5;
    private static final int E_FLAT_POSITION = 6;
    private static final int E_POSITION = 7;
    private static final int F_POSITION = 8;
    private static final int F_SHARP_POSITION = 9;
    private static final int G_POSITION = 10;
    private static final int G_FLAT_POSITION = 11;
    private static final int A_FLAT_POSITION = 12;
    private static final int A_POSITION = 13;
    private static final int B_FLAT_POSITION = 14;
    private static final int B_POSITION = 15;
    static Tuning getScaleFromPosition(int position) {
        switch (position) {
            case NONE:
                return new ChromaticTuning();
            case C_FLAT_POSITION:
                return new CFlatTuning();
            case C_POSITION:
                return new CTuning();
            case C_SHARP_POSITION:
                return new CSharpTuning();
            case D_FLAT_POSITION:
                return new DFlatTuning();
            case D_POSITION:
                return new DTuning();
            case E_FLAT_POSITION:
                return new EFlatTuning();
            case E_POSITION:
                return new ETuning();
            case F_POSITION:
                return new FTuning();
            case F_SHARP_POSITION:
                return new FSharpTuning();
            case G_FLAT_POSITION:
                return new GFlatTuning();
            case G_POSITION:
                return new GTuning();
            case A_FLAT_POSITION:
                return new AFlatTuning();
            case A_POSITION:
                return new ATuning();
            case B_FLAT_POSITION:
                return new BFlatTuning();
            case B_POSITION:
                return new BTuning();
            default:
                Log.w("com.github.cythara", "Unknown position for tuning dropdown list");
                return new ChromaticTuning();
        }
    }
}
