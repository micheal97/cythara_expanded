package com.github.cytharaexpanded.tuning;

import com.github.cytharaexpanded.Note;
import com.github.cytharaexpanded.NoteName;
import com.github.cytharaexpanded.Tuning;

import static com.github.cytharaexpanded.NoteName.*;

public class OpenGGuitarTuning implements Tuning {

    @Override
    public Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public Note findNote(String name) {
        return Pitch.valueOf(name);
    }

    private enum Pitch implements Note {

        D2(D, 2),
        G2(G, 2),
        D3(D, 3),
        G3(G, 3),
        B3(B, 3),
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
