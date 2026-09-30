package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ox implements sx {
    public final lx a;
    public final lx b;

    public ox(lx lxVar, lx lxVar2) {
        this.a = lxVar;
        this.b = lxVar2;
    }

    @Override // defpackage.sx
    public final du0 c0() {
        return new zud(this.a.c0(), this.b.c0());
    }

    @Override // defpackage.sx
    public final List i0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.sx
    public final boolean j0() {
        return this.a.j0() && this.b.j0();
    }
}
