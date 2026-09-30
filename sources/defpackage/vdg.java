package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum vdg {
    ARIES(R.string.zodiac_aries, R.drawable.fullicon_aries),
    TAURUS(R.string.zodiac_taurus, R.drawable.fullicon_taurus),
    GEMINI(R.string.zodiac_gemini, R.drawable.fullicon_gemini),
    CANCER(R.string.zodiac_cancer, R.drawable.fullicon_cancer),
    LEO(R.string.zodiac_leo, R.drawable.fullicon_leo),
    VIRGO(R.string.zodiac_virgo, R.drawable.fullicon_virgo),
    LIBRA(R.string.zodiac_libra, R.drawable.fullicon_libra),
    SCORPIO(R.string.zodiac_scorpio, R.drawable.fullicon_scorpio),
    SAGITTARIUS(R.string.zodiac_sagittarius, R.drawable.fullicon_sagittarius),
    CAPRICORN(R.string.zodiac_capricorn, R.drawable.fullicon_capricorn),
    AQUARIUS(R.string.zodiac_aquarius, R.drawable.fullicon_aquarius),
    PISCES(R.string.zodiac_pisces, R.drawable.fullicon_pisces);

    private final int drawableId;
    private final int stringId;

    vdg(int i, int i2) {
        this.stringId = i;
        this.drawableId = i2;
    }

    public final int a() {
        return this.drawableId;
    }

    public final int b() {
        return this.stringId;
    }
}
