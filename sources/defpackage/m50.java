package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m50 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ ted c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ m50(aw2 aw2Var, x16 x16Var, ted tedVar) {
        this.a = 4;
        this.c = tedVar;
        this.d = x16Var;
        this.b = aw2Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.d;
        aw2 aw2Var = this.b;
        ted tedVar = this.c;
        switch (i) {
            case 0:
                ynb.V(aw2Var, null, null, new r50(null, x16Var, tedVar), 3);
                break;
            case 1:
                ynb.V(aw2Var, null, null, new s50(null, x16Var, tedVar), 3);
                break;
            case 2:
                ynb.V(aw2Var, null, null, new v11(tedVar, null), 3).E(new p9(6, x16Var));
                break;
            case 3:
                if (((Boolean) tedVar.d.d.d(ued.a)).booleanValue()) {
                    ynb.V(aw2Var, null, null, new qz8(tedVar, null), 3).E(new jz8(tedVar, x16Var, 0));
                }
                break;
            case 4:
                int iOrdinal = tedVar.c().ordinal();
                if (iOrdinal == 1) {
                    x16Var.invoke();
                } else if (iOrdinal == 2) {
                    ynb.V(aw2Var, null, null, new uz8(tedVar, null), 3);
                } else {
                    ynb.V(aw2Var, null, null, new vz8(tedVar, null), 3);
                }
                break;
            case 5:
                ynb.V(aw2Var, null, null, new ifb(null, x16Var, tedVar), 3);
                break;
            case 6:
                ynb.V(aw2Var, null, null, new src(null, x16Var, tedVar), 3);
                break;
            case 7:
                ynb.V(aw2Var, null, null, new trc(null, x16Var, tedVar), 3);
                break;
            case 8:
                t4c.r(aw2Var, tedVar, x16Var, 2);
                break;
            case 9:
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new ksf(25), 2);
                h5g h5gVar = h5g.a;
                r4g r4gVar = r4g.TodayFortune;
                w4g w4gVar = w4g.LegacyPopup;
                h5g.g(r4gVar, w4gVar, null);
                h5g.g(r4g.QuickDecision, w4gVar, null);
                ynb.V(aw2Var, null, null, new s5g(null, x16Var, tedVar), 3);
                break;
            default:
                t4c.r(aw2Var, tedVar, x16Var, 1);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ m50(aw2 aw2Var, ted tedVar, x16 x16Var, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = tedVar;
        this.d = x16Var;
    }

    public /* synthetic */ m50(ted tedVar, aw2 aw2Var, x16 x16Var, int i) {
        this.a = i;
        this.c = tedVar;
        this.b = aw2Var;
        this.d = x16Var;
    }
}
