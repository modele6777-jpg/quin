package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ys implements gga {
    public h28 a;
    public lyd b;
    public s38 c;
    public ncd d;

    @Override // defpackage.gga
    public final void a() {
        j(null);
    }

    @Override // defpackage.gga
    public final void b() {
        vsd vsdVar;
        h28 h28Var = this.a;
        if (h28Var == null || (vsdVar = (vsd) eb3.H(h28Var, zg2.q)) == null) {
            return;
        }
        ((dw3) vsdVar).b();
    }

    @Override // defpackage.gga
    public final void c() throws Throwable {
        lyd lydVar = this.b;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.b = null;
        b89 b89VarI = i();
        if (b89VarI != null) {
            ((ncd) b89VarI).h();
        }
    }

    @Override // defpackage.gga
    public final void d(zse zseVar, sl9 sl9Var, ste steVar, ymb ymbVar, hkb hkbVar, hkb hkbVar2) {
        s38 s38Var = this.c;
        if (s38Var != null) {
            l28 l28Var = s38Var.m;
            synchronized (l28Var.c) {
                try {
                    l28Var.j = zseVar;
                    l28Var.l = sl9Var;
                    l28Var.k = steVar;
                    l28Var.m = hkbVar;
                    l28Var.n = hkbVar2;
                    if (l28Var.e || l28Var.d) {
                        l28Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.gga
    public final void e(zse zseVar, zse zseVar2) {
        s38 s38Var = this.c;
        if (s38Var != null) {
            boolean z = (eue.c(s38Var.h.b, zseVar2.b) && pa7.t(s38Var.h.c, zseVar2.c)) ? false : true;
            s38Var.h = zseVar2;
            int size = s38Var.j.size();
            for (int i = 0; i < size; i++) {
                ekb ekbVar = (ekb) ((WeakReference) s38Var.j.get(i)).get();
                if (ekbVar != null) {
                    ekbVar.g = zseVar2;
                }
            }
            l28 l28Var = s38Var.m;
            synchronized (l28Var.c) {
                l28Var.j = null;
                l28Var.l = null;
                l28Var.k = null;
                l28Var.m = null;
                l28Var.n = null;
            }
            if (pa7.t(zseVar, zseVar2)) {
                if (z) {
                    k47 k47Var = s38Var.b;
                    int iG = eue.g(zseVar2.b);
                    int iF = eue.f(zseVar2.b);
                    eue eueVar = s38Var.h.c;
                    int iG2 = eueVar != null ? eue.g(eueVar.a) : -1;
                    eue eueVar2 = s38Var.h.c;
                    k47Var.C().updateSelection((View) k47Var.b, iG, iF, iG2, eueVar2 != null ? eue.f(eueVar2.a) : -1);
                    return;
                }
                return;
            }
            if (zseVar != null && (!pa7.t(zseVar.a.b, zseVar2.a.b) || (eue.c(zseVar.b, zseVar2.b) && !pa7.t(zseVar.c, zseVar2.c)))) {
                k47 k47Var2 = s38Var.b;
                k47Var2.C().restartInput((View) k47Var2.b);
                return;
            }
            int size2 = s38Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ekb ekbVar2 = (ekb) ((WeakReference) s38Var.j.get(i2)).get();
                if (ekbVar2 != null) {
                    zse zseVar3 = s38Var.h;
                    k47 k47Var3 = s38Var.b;
                    if (ekbVar2.k) {
                        ekbVar2.g = zseVar3;
                        if (ekbVar2.i) {
                            k47Var3.C().updateExtractedText((View) k47Var3.b, ekbVar2.h, if9.G(zseVar3));
                        }
                        eue eueVar3 = zseVar3.c;
                        long j = zseVar3.b;
                        int iG3 = eueVar3 != null ? eue.g(eueVar3.a) : -1;
                        eue eueVar4 = zseVar3.c;
                        k47Var3.C().updateSelection((View) k47Var3.b, eue.g(j), eue.f(j), iG3, eueVar4 != null ? eue.f(eueVar4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.gga
    public final void f() {
        vsd vsdVar;
        h28 h28Var = this.a;
        if (h28Var == null || (vsdVar = (vsd) eb3.H(h28Var, zg2.q)) == null) {
            return;
        }
        ((dw3) vsdVar).a();
    }

    @Override // defpackage.gga
    public final void g(hkb hkbVar) {
        Rect rect;
        s38 s38Var = this.c;
        if (s38Var != null) {
            s38Var.l = new Rect(ym8.L(hkbVar.a), ym8.L(hkbVar.b), ym8.L(hkbVar.c), ym8.L(hkbVar.d));
            if (!s38Var.j.isEmpty() || (rect = s38Var.l) == null) {
                return;
            }
            s38Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.gga
    public final void h(zse zseVar, rx6 rx6Var, bv9 bv9Var, ou2 ou2Var) {
        j(new kf(zseVar, this, rx6Var, bv9Var, ou2Var, 2));
    }

    public final b89 i() {
        ncd ncdVar = this.d;
        if (ncdVar != null) {
            return ncdVar;
        }
        if (!g6e.a) {
            return null;
        }
        ncd ncdVarB = ocd.b(1, 0, i41.c, 2);
        this.d = ncdVarB;
        return ncdVarB;
    }

    public final void j(kf kfVar) {
        h28 h28Var = this.a;
        if (h28Var == null) {
            return;
        }
        lyd lydVarV = null;
        xs xsVar = new xs(kfVar, this, h28Var, null);
        if (h28Var.Y) {
            lydVarV = ynb.V(h28Var.Z0(), null, dw2.d, new g28(h28Var, xsVar, null), 1);
        }
        this.b = lydVarV;
    }

    public final void k(h28 h28Var) {
        h28 h28Var2 = this.a;
        if (h28Var2 != h28Var) {
            l37.c("Expected textInputModifierNode to be " + h28Var + " but was " + h28Var2);
        }
        this.a = null;
    }
}
