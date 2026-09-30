package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nu1 b;

    public /* synthetic */ au1(nu1 nu1Var, int i) {
        this.a = i;
        this.b = nu1Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        nu1 nu1Var = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                kv2.y(l1fVar, "btn", "playcard_zoom_close", "pathway", "card_zoom");
                l1fVar.a(urg.r(nu1Var.b), "deck_id");
                l1fVar.a(nu1Var.a.getCardKey(), "card_id");
                break;
            default:
                kv2.y(l1fVar, "action", "flip_card", "pathway", "card_zoom");
                l1fVar.a(urg.r(nu1Var.b), "deck_id");
                l1fVar.a(nu1Var.a.getCardKey(), "card_id");
                break;
        }
        return wefVar;
    }
}
