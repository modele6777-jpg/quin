package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pgh extends rgh {
    public final /* synthetic */ rgh c;
    public final /* synthetic */ rgh d;

    public pgh(rgh rghVar, rgh rghVar2) {
        this.c = rghVar;
        this.d = rghVar2;
    }

    @Override // defpackage.rgh
    public final void a() {
        rgh rghVar = this.d;
        try {
            this.c.a();
        } finally {
            rghVar.a();
        }
    }
}
