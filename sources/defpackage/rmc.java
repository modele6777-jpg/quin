package defpackage;

import ai.askquin.R;
import java.util.List;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rmc {
    public static final List a = t72.I(ArcanaGroup.Wands, ArcanaGroup.Cups, ArcanaGroup.Swords, ArcanaGroup.Pentacles, ArcanaGroup.Major);

    public static final int a(mic micVar) {
        micVar.getClass();
        int iOrdinal = micVar.ordinal();
        if (iOrdinal == 0) {
            return R.string.seasonal_season_summer_solstice;
        }
        if (iOrdinal == 1) {
            return R.string.seasonal_season_autumn_equinox;
        }
        ap.c();
        return 0;
    }

    public static final int b(ArcanaGroup arcanaGroup) {
        arcanaGroup.getClass();
        int i = qmc.a[arcanaGroup.ordinal()];
        if (i == 1) {
            return R.string.seasonal_suit_cups;
        }
        if (i == 2) {
            return R.string.seasonal_suit_swords;
        }
        if (i == 3) {
            return R.string.seasonal_suit_wands;
        }
        if (i == 4) {
            return R.string.seasonal_suit_pentacles;
        }
        if (i == 5) {
            return R.string.seasonal_suit_major;
        }
        ap.c();
        return 0;
    }

    public static final yic c(mic micVar) {
        micVar.getClass();
        return new yic(micVar.b(), micVar.c());
    }
}
