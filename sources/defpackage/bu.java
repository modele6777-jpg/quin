package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bu {
    public final PathMeasure a;

    public bu(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, zt ztVar) {
        this.a.getSegment(f, f2, ztVar.a, true);
    }
}
