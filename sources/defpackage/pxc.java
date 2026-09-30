package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pxc extends rtc {
    public final /* synthetic */ AtomicReferenceArray g;

    public pxc(long j, pxc pxcVar, int i) {
        super(j, pxcVar, i);
        this.g = new AtomicReferenceArray(oxc.f);
    }

    @Override // defpackage.rtc
    public final int g() {
        return oxc.f;
    }

    @Override // defpackage.rtc
    public final void h(int i, pv2 pv2Var) {
        this.g.set(i, oxc.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
