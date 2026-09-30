package defpackage;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gj9 extends ewf implements hf8 {
    public static final /* synthetic */ int g = 0;
    public final Application b;
    public final gpf c;
    public final o9 d;
    public final s0e e;
    public final whb f;

    public gj9(Application application, gpf gpfVar, o9 o9Var) {
        this.b = application;
        this.c = gpfVar;
        this.d = o9Var;
        s0e s0eVarA = t0e.a(new qi9(true, false, 9, 0, false, false, 20, 0, false, true));
        this.e = s0eVarA;
        this.f = if9.n(s0eVarA);
        f();
        ynb.V(hwf.a(this), null, null, new ui9(this, null), 3);
    }

    public final void f() {
        iy9 iy9VarE = y93.e();
        iy9 iy9VarH = y93.h();
        iy9 iy9VarF = iy9VarE == null ? y93.f() : iy9VarE;
        iy9 iy9VarG = iy9VarH == null ? y93.g() : iy9VarH;
        while (true) {
            s0e s0eVar = this.e;
            Object value = s0eVar.getValue();
            qi9 qi9Var = (qi9) value;
            boolean z = iy9VarE != null;
            int iIntValue = iy9VarF != null ? ((Number) iy9VarF.d()).intValue() : 9;
            int iIntValue2 = iy9VarF != null ? ((Number) iy9VarF.e()).intValue() : 0;
            boolean z2 = iy9VarH != null;
            int iIntValue3 = iy9VarG != null ? ((Number) iy9VarG.d()).intValue() : 20;
            int iIntValue4 = iy9VarG != null ? ((Number) iy9VarG.e()).intValue() : 0;
            hs3 hs3Var = xqa.W0;
            iy9 iy9Var = iy9VarE;
            if (s0eVar.l(value, qi9.a(qi9Var, false, z, iIntValue, iIntValue2, false, z2, iIntValue3, iIntValue4, false, ((Boolean) z5c.I(nu4.a, new wi9(hs3Var.a, hs3Var.b, null))).booleanValue(), 273))) {
                break;
            } else {
                iy9VarE = iy9Var;
            }
        }
        if (v4e.Q(bsa.d(xqa.j)) || iy9VarH != null) {
            return;
        }
        a62 a62VarA = hwf.a(this);
        js3 js3Var = ga4.a;
        ynb.V(a62VarA, hr3.c, null, new vi9(this, null), 2);
    }

    public final void g(Context context) {
        s0e s0eVar;
        Object value;
        context.getClass();
        do {
            s0eVar = this.e;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, qi9.a((qi9) value, uyb.k(context), false, 0, 0, false, false, 0, 0, false, false, 1022)));
    }
}
