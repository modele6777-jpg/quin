package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eh3 implements p5e {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4d b;
    public final /* synthetic */ long c;

    public /* synthetic */ eh3(x4d x4dVar, long j, int i) {
        this.a = i;
        this.b = x4dVar;
        this.c = j;
    }

    @Override // defpackage.p5e
    public final void a(rxb rxbVar) {
        int i = this.a;
        long j = this.c;
        x4d x4dVar = this.b;
        rxbVar.getClass();
        switch (i) {
            case 0:
                rxbVar.j(x4dVar);
                rxbVar.b(y72.j);
                z5e z5eVar = rxbVar.b;
                z5eVar.getClass();
                if (z5eVar.N0.c.a(8)) {
                    fxd fxdVar = sxb.a;
                    vz vzVar = rxbVar.z;
                    vz vzVar2 = rxbVar.X;
                    try {
                        rxbVar.z = fxdVar;
                        rxbVar.X = fxdVar;
                        rxbVar.b(j);
                        return;
                    } finally {
                        rxbVar.z = vzVar;
                        rxbVar.X = vzVar2;
                    }
                }
                return;
            default:
                rxbVar.j(x4dVar);
                rxbVar.b(j);
                z5e z5eVar2 = rxbVar.b;
                z5eVar2.getClass();
                if (z5eVar2.N0.c.a(1)) {
                    x6f x6fVarT = b21.T(200, 0, new q03(0.4f, 0.1f, 0.3f, 1.0f), 2);
                    rxbVar.a(x6fVarT, x6fVarT, new p25(rxbVar, 1));
                    return;
                }
                return;
        }
    }
}
