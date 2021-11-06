package com.github.cytharaexpanded.tuning;

import com.github.cytharaexpanded.Note;
import com.github.cytharaexpanded.NoteName;
import com.github.cytharaexpanded.Tuning;

import static com.github.cytharaexpanded.NoteName.*;

public class DropCGuitarTuning implements Tuning {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        C2(C, 2),
        G2(G, 2),
        C3(C, 3),
        F3(F, 3),
        A3(A, 3),
        D4(D, 4);

        private final String sign;
        private final int octave;
        private NoteName name;

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
