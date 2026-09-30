package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cx5 extends gf6 {
    public static final Range d = new Range(30, 30);
    public final int a = 60;
    public final int b = 60;
    public final mb5 c = mb5.b;

    @Override // defpackage.gf6
    public final mb5 a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.a);
        sb.append(", maxFps=");
        return tec.n(sb, this.b, ')');
    }
}
