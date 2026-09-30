package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t60 extends SegmentFinder {
    public final /* synthetic */ vea a;

    public t60(vea veaVar) {
        this.a = veaVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.l(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.h(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.j(i);
    }
}
