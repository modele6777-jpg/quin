package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class el7 extends m93 {
    public final wxa r;
    public final kza s;
    public final ll7 t;
    public final u99 u;
    public final bu3 v;
    public final String w;

    /* JADX WARN: Code duplicated, block: B:29:0x00d2  */
    public el7(wxa wxaVar, kza kzaVar, ll7 ll7Var, u99 u99Var, bu3 bu3Var) {
        String string;
        String strM;
        u99Var.getClass();
        this.r = wxaVar;
        this.s = kzaVar;
        this.t = ll7Var;
        this.u = u99Var;
        this.v = bu3Var;
        if (ll7Var.x()) {
            strM = u99Var.getString(ll7Var.s().o()).concat(u99Var.getString(ll7Var.s().n()));
        } else {
            o85 o85Var = sl7.a;
            rk7 rk7VarB = sl7.b(kzaVar, u99Var, bu3Var, true);
            if (rk7VarB == null) {
                ho7.m(wxaVar, "No field signature for property: ");
                throw null;
            }
            String str = rk7VarB.G0;
            String str2 = rk7VarB.H0;
            StringBuilder sb = new StringBuilder(oj7.a(str));
            bm3 bm3VarK = wxaVar.k();
            bm3VarK.getClass();
            if (pa7.t(wxaVar.getVisibility(), sz3.d) && (bm3VarK instanceof d04)) {
                nya nyaVar = ((d04) bm3VarK).e;
                s56 s56Var = rl7.g;
                s56Var.getClass();
                Integer num = (Integer) vpf.F(nyaVar, s56Var);
                string = "$".concat(w99.a.h(num != null ? u99Var.getString(num.intValue()) : "main", "_"));
            } else if (pa7.t(wxaVar.getVisibility(), sz3.a) && (bm3VarK instanceof kw9)) {
                f04 f04Var = ((q04) wxaVar).U0;
                if (f04Var instanceof yk7) {
                    yk7 yk7Var = (yk7) f04Var;
                    if (yk7Var.b != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        String str3 = yk7Var.a.a;
                        if (str3 == null) {
                            gk7.a(10);
                            throw null;
                        }
                        sb2.append(t99.e(v4e.g0('/', str3, str3)).b());
                        string = sb2.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            strM = ib8.m(sb, string, "()", str2);
        }
        this.w = strM;
    }

    @Override // defpackage.m93
    public final String r() {
        return this.w;
    }
}
