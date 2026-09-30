package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc7 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ulb b;

    public /* synthetic */ rc7(ulb ulbVar, int i) {
        this.a = i;
        this.b = ulbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        ulb ulbVar = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                l1fVar.a(ulbVar.b, "fail_reason");
                break;
            default:
                l1fVar.a(ulbVar.b, "result");
                l1fVar.a("account", "pathway");
                Iterable iterable = ulbVar.c;
                if (iterable == null) {
                    iterable = pu4.a;
                }
                l1fVar.a(s72.D0(iterable, ",", null, null, null, 62), "tarot_id");
                break;
        }
        return wefVar;
    }
}
