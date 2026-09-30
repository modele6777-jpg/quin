package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yg9 extends cw3 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg9(tjd tjdVar, int i) {
        super(tjdVar);
        this.c = i;
    }

    @Override // defpackage.bw3, defpackage.tt7
    public final boolean i0() {
        switch (this.c) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.bw3
    public final bw3 s0(tjd tjdVar) {
        switch (this.c) {
            case 0:
                return new yg9(tjdVar, 0);
            default:
                return new yg9(tjdVar, 1);
        }
    }
}
