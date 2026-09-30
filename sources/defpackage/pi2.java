package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pi2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ pi2(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.b(z ? 0.3f : 1.0f);
                return wefVar;
            case 1:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.b(z ? 1.0f : 0.0f);
                return wefVar;
            case 2:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("next", "btn");
                l1fVar.a(z ? "cut_the_deck_page" : "shufflePage", "pathway");
                return wefVar;
            case 3:
                h81 h81Var = (h81) obj;
                h81Var.getClass();
                b68 b68VarD = gec.D(z ? t72.I(new y72(abg.d(4074687203L)), new y72(abg.d(4075343833L)), new y72(abg.d(4076527837L))) : t72.I(new y72(abg.d(4062125363L)), new y72(abg.d(4062124583L)), new y72(abg.d(4062124057L))));
                Float fValueOf = Float.valueOf(0.0f);
                long j = y72.j;
                return h81Var.a(new so5(12, b68VarD, gec.O(new iy9[]{new iy9(fValueOf, new y72(j)), new iy9(Float.valueOf(0.42f), new y72(j)), new iy9(Float.valueOf(1.0f), new y72(abg.d(z ? 3872438761L : 3860797747L)))}, 0.0f, 0.0f, 14)));
            case 4:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a(Boolean.valueOf(z), "is_legacy");
                l1fVar2.a("server_is_new_user", "source");
                return wefVar;
            case 5:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a(Boolean.valueOf(z), "paid");
                return wefVar;
            case 6:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                l1fVar4.a("toggle", "btn");
                l1fVar4.a(z ? "collapse" : "expand", "state");
                l1fVar4.a("reading_detail", "pathway");
                return wefVar;
            case 7:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                wn7[] wn7VarArr = exc.a;
                gxc gxcVar = cxc.K;
                wn7 wn7Var = exc.a[23];
                Boolean boolValueOf = Boolean.valueOf(z);
                gxcVar.getClass();
                hxcVar.c(gxcVar, boolValueOf);
                exc.m(hxcVar, 3);
                return wefVar;
            default:
                l1f l1fVar5 = (l1f) obj;
                l1fVar5.getClass();
                l1fVar5.a(z ? "start_question" : "confirm_spread", "btn");
                l1fVar5.a(z ? "homepage_photoReading_confirmDrawnCardsPage" : "homepage_photoReading_spreadInfoPage", "pathway");
                return wefVar;
        }
    }
}
