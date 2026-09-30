package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum dmd {
    CardDraw(R.string.skin_predraw_subtitle, R.string.skin_predraw_continue),
    History(R.string.skin_history_subtitle, R.string.skin_history_continue);

    private final int continueRes;
    private final int subtitleRes;

    dmd(int i, int i2) {
        this.subtitleRes = i;
        this.continueRes = i2;
    }

    public final int a() {
        return this.continueRes;
    }

    public final int b() {
        return this.subtitleRes;
    }
}
