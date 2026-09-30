package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r9h extends nrg {
    public final /* synthetic */ int e;
    public final /* synthetic */ lah f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9h(lah lahVar, i5h i5hVar, int i) {
        super(i5hVar);
        this.e = i;
        this.f = lahVar;
    }

    @Override // defpackage.nrg
    public final void a() {
        int i = this.e;
        lah lahVar = this.f;
        switch (i) {
            case 0:
                lahVar.A0();
                if (lahVar.R0()) {
                    w0h w0hVar = ((w3h) lahVar.b).f;
                    w3h.h(w0hVar);
                    w0hVar.Z.a("Inactivity, disconnecting from the service");
                    lahVar.I0();
                    break;
                }
                break;
            default:
                w0h w0hVar2 = ((w3h) lahVar.b).f;
                w3h.h(w0hVar2);
                w0hVar2.x.a("Tasks have been queued for a long time");
                break;
        }
    }
}
