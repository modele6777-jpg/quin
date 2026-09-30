package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ol3 extends ewf {
    public final whb E0;
    public TarotSkinIdentify F0;
    public boolean G0;
    public final whb H0;
    public Boolean X;
    public final s0e Y;
    public lyd Z;
    public final xof b;
    public final cmd c;
    public final gpf d;
    public final gd8 e;
    public final rw8 f;
    public final s0e g;
    public final whb v;
    public final s0e w;
    public final s0e x;
    public final s0e y;
    public final boolean z;

    public ol3(xof xofVar, cmd cmdVar, gpf gpfVar, gd8 gd8Var, rw8 rw8Var) {
        this.b = xofVar;
        this.c = cmdVar;
        this.d = gpfVar;
        this.e = gd8Var;
        this.f = rw8Var;
        s0e s0eVarA = t0e.a(Boolean.FALSE);
        this.g = s0eVarA;
        this.v = if9.n(s0eVarA);
        s0e s0eVarA2 = t0e.a(null);
        this.w = s0eVarA2;
        s0e s0eVarA3 = t0e.a(null);
        this.x = s0eVarA3;
        s0e s0eVarA4 = t0e.a(null);
        this.y = s0eVarA4;
        zw8 zw8Var = zw8.a;
        boolean zA = zw8.a();
        this.z = zA;
        s0e s0eVarA5 = t0e.a(Boolean.valueOf(zA));
        this.Y = s0eVarA5;
        whb whbVar = rw8Var.d;
        this.E0 = whbVar;
        int i = 1;
        this.G0 = ((sw8) whbVar.a.getValue()).a == gmd.c;
        ynb.V(hwf.a(this), null, null, new cl3(this, null), 3);
        ynb.V(hwf.a(this), null, null, new dl3(this, null), 3);
        ynb.V(hwf.a(this), null, null, new il3(this, null), 3);
        tm5 tm5Var = new tm5(new wj5[]{s0eVarA2, s0eVarA3, s0eVarA4, s0eVarA5}, new ll3(5, null), i);
        this.H0 = if9.F(new tm5(new wj5[]{xofVar.b, ((ys3) cmdVar).v, tm5Var, k8b.a, whbVar}, new nl3(this, null), 2), hwf.a(this), new xzd(5000L, Long.MAX_VALUE), new al3());
    }

    public final void f() {
        hw8 hw8Var = (hw8) this.y.getValue();
        if (hw8Var != null && i7h.F(hw8Var, (Map) ((ys3) this.c).v.a.getValue(), (sw8) this.E0.a.getValue()).a()) {
            this.F0 = null;
            this.x.m(null);
            Boolean bool = Boolean.TRUE;
            s0e s0eVar = this.Y;
            s0eVar.getClass();
            s0eVar.n(null, bool);
        }
    }

    public final void g(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        this.G0 = false;
        s0e s0eVar = this.w;
        s0eVar.getClass();
        s0eVar.n(null, tarotSkinIdentify);
        this.x.m(null);
        Boolean bool = Boolean.FALSE;
        s0e s0eVar2 = this.Y;
        s0eVar2.getClass();
        s0eVar2.n(null, bool);
    }
}
