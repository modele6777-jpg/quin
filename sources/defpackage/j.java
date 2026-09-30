package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends bw3 {
    public final tjd b;
    public final tjd c;

    public j(tjd tjdVar, tjd tjdVar2) {
        tjdVar.getClass();
        tjdVar2.getClass();
        this.b = tjdVar;
        this.c = tjdVar2;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        return new j(this.b.n0(e7fVar), this.c);
    }

    @Override // defpackage.bw3
    public final tjd q0() {
        return this.b;
    }

    @Override // defpackage.bw3
    public final bw3 s0(tjd tjdVar) {
        return new j(tjdVar, this.c);
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final j l0(boolean z) {
        return new j(this.b.l0(z), this.c.l0(z));
    }

    @Override // defpackage.bw3
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final j j0(zt7 zt7Var) {
        tjd tjdVar = this.b;
        tjdVar.getClass();
        tjd tjdVar2 = this.c;
        tjdVar2.getClass();
        return new j(tjdVar, tjdVar2);
    }
}
