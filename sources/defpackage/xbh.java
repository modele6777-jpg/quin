package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xbh implements sg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xbh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sg0
    public final m88 apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jch jchVar = (jch) obj2;
                int iA = ((o9h) obj).a();
                if ((iA == 29501 || iA == 29537 || iA == 29538 || iA == 29539 || iA == 29540 || iA == 29541 || iA == 29542 || iA == 29543 || iA == 29544) && !jchVar.g.b()) {
                    jchVar.b();
                }
                return ux6.b;
            case 1:
                gdh gdhVar = (gdh) obj2;
                y3h y3hVar = new y3h(gdhVar, (idh) obj);
                i39 i39VarA = gdhVar.a.a();
                s5f s5fVar = new s5f(y3hVar);
                i39VarA.execute(s5fVar);
                return s5fVar;
            default:
                return pa7.a0((m88) ((pdh) obj2).e.get());
        }
    }
}
