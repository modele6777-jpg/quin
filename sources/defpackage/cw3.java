package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cw3 extends bw3 {
    public final tjd b;

    public cw3(tjd tjdVar) {
        this.b = tjdVar;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: o0 */
    public final tjd l0(boolean z) {
        return z == i0() ? this : this.b.l0(z).n0(a0());
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        return e7fVar != a0() ? new wjd(this, e7fVar) : this;
    }

    @Override // defpackage.bw3
    public final tjd q0() {
        return this.b;
    }
}
