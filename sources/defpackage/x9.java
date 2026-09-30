package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x9 extends ewf implements hf8 {
    public static final /* synthetic */ int X = 0;
    public final t7 b;
    public final gpf c;
    public final m7 d;
    public final o9 e;
    public final bc7 f;
    public final q9b g;
    public final x1g v;
    public final vz9 w;
    public final vz9 x;
    public final whb y;
    public final whb z;

    public x9(t7 t7Var, gpf gpfVar, m7 m7Var, o9 o9Var, bc7 bc7Var, q9b q9bVar, x1g x1gVar) {
        this.b = t7Var;
        this.c = gpfVar;
        this.d = m7Var;
        this.e = o9Var;
        this.f = bc7Var;
        this.g = q9bVar;
        this.v = x1gVar;
        if (((mo3) t7Var).b()) {
            String strA = s7.a();
            if (strA.length() != 0) {
                ynb.V(lw2.a, null, null, new j9(o9Var, strA, null), 3);
            }
        }
        this.w = q1c.f(null);
        this.x = q1c.f(Boolean.FALSE);
        whb whbVarF = if9.F(o9Var.a.b, hwf.a(this), new xzd(3000L, Long.MAX_VALUE), yof.n);
        this.y = whbVarF;
        this.z = if9.F(new wm5(jzb.p(new p(1, this)), whbVarF, new q9(this, null), 0), hwf.a(this), new xzd(3000L, Long.MAX_VALUE), new dn0(false, false));
    }

    public final void f(ngf ngfVar, String str, a26 a26Var) {
        if (pa7.t((yof) this.y.a.getValue(), yof.n) || v4e.Q(str)) {
            return;
        }
        ynb.V(hwf.a(this), null, null, new w9(ngfVar, this, str, ((mo3) this.b).a(), a26Var, null), 3);
    }
}
