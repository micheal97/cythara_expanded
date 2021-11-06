package com.github.cytharaexpanded.tuning;

import com.github.cytharaexpanded.Note;
import com.github.cytharaexpanded.NoteName;
import com.github.cytharaexpanded.Tuning;

import static com.github.cytharaexpanded.NoteName.*;

public class OudStdTurkishTuning implements Tuning {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    public enum Pitch implements Note {

        C2_SHARP(C, 2, "#"),
        F2_SHARP(F, 2, "#"),
        B2(B, 2),
        E3(E, 3),
        A3(A, 3),
        D4(D, 4);

        private final String sign;
        private final int octave;
        private NoteName name;

        Pitch(NoteName name, int octave, String sign) {
            this.name = name;
            this.octave = octave;
            this.sign = sign;
        }

        Pitch(NoteName name, int octave) {
            this.name = name;
            this.octave = octave;
            this.sign = "";
        }

        public NoteName getName() {
            return name;
        }

        @Override
        public int getOctave() {
            return octave;
        }

        @Override
        public String getSign() {
            return sign;
        }
    }
}
