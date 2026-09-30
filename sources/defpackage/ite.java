package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ite implements gga {
    public final View a;
    public final ta0 b;
    public final vp c;
    public boolean d;
    public a26 e;
    public a26 f;
    public zse g;
    public rx6 h;
    public final ArrayList i;
    public final lw7 j;
    public Rect k;
    public final b13 l;
    public final p89 m;
    public m45 n;

    public ite(View view, AndroidComposeView androidComposeView, vp vpVar) {
        ta0 ta0Var = new ta0(view);
        this.a = view;
        this.b = ta0Var;
        this.c = vpVar;
        this.e = new ule(14);
        this.f = new ule(15);
        this.g = new zse(4, eue.b, "");
        this.h = rx6.g;
        this.i = new ArrayList();
        this.j = eb3.N(z18.c, new h2e(8, this));
        this.l = new b13(androidComposeView, ta0Var);
        this.m = new p89(0, new hte[16]);
    }

    @Override // defpackage.gga
    public final void a() {
        i(hte.a);
    }

    @Override // defpackage.gga
    public final void b() {
        i(hte.c);
    }

    @Override // defpackage.gga
    public final void c() {
        this.d = false;
        this.e = new ule(12);
        this.f = new ule(13);
        this.k = null;
        i(hte.b);
    }

    @Override // defpackage.gga
    public final void d(zse zseVar, sl9 sl9Var, ste steVar, ymb ymbVar, hkb hkbVar, hkb hkbVar2) {
        b13 b13Var = this.l;
        synchronized (b13Var.c) {
            try {
                b13Var.j = zseVar;
                b13Var.l = sl9Var;
                b13Var.k = steVar;
                b13Var.m = ymbVar;
                b13Var.n = hkbVar;
                b13Var.o = hkbVar2;
                if (b13Var.e || b13Var.d) {
                    b13Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gga
    public final void e(zse zseVar, zse zseVar2) {
        boolean z = (eue.c(this.g.b, zseVar2.b) && pa7.t(this.g.c, zseVar2.c)) ? false : true;
        this.g = zseVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            dkb dkbVar = (dkb) ((WeakReference) this.i.get(i)).get();
            if (dkbVar != null) {
                dkbVar.d = zseVar2;
            }
        }
        b13 b13Var = this.l;
        synchronized (b13Var.c) {
            b13Var.j = null;
            b13Var.l = null;
            b13Var.k = null;
            b13Var.m = z03.b;
            b13Var.n = null;
            b13Var.o = null;
        }
        if (pa7.t(zseVar, zseVar2)) {
            if (z) {
                ta0 ta0Var = this.b;
                int iG = eue.g(zseVar2.b);
                int iF = eue.f(zseVar2.b);
                eue eueVar = this.g.c;
                int iG2 = eueVar != null ? eue.g(eueVar.a) : -1;
                eue eueVar2 = this.g.c;
                ((InputMethodManager) ((lw7) ta0Var.d).getValue()).updateSelection((View) ta0Var.c, iG, iF, iG2, eueVar2 != null ? eue.f(eueVar2.a) : -1);
                return;
            }
            return;
        }
        if (zseVar != null && (!pa7.t(zseVar.a.b, zseVar2.a.b) || (eue.c(zseVar.b, zseVar2.b) && !pa7.t(zseVar.c, zseVar2.c)))) {
            ta0 ta0Var2 = this.b;
            ((InputMethodManager) ((lw7) ta0Var2.d).getValue()).restartInput((View) ta0Var2.c);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dkb dkbVar2 = (dkb) ((WeakReference) this.i.get(i2)).get();
            if (dkbVar2 != null) {
                zse zseVar3 = this.g;
                ta0 ta0Var3 = this.b;
                if (dkbVar2.h) {
                    dkbVar2.d = zseVar3;
                    if (dkbVar2.f) {
                        ((InputMethodManager) ((lw7) ta0Var3.d).getValue()).updateExtractedText((View) ta0Var3.c, dkbVar2.e, m93.O(zseVar3));
                    }
                    eue eueVar3 = zseVar3.c;
                    long j = zseVar3.b;
                    int iG3 = eueVar3 != null ? eue.g(eueVar3.a) : -1;
                    eue eueVar4 = zseVar3.c;
                    ((InputMethodManager) ((lw7) ta0Var3.d).getValue()).updateSelection((View) ta0Var3.c, eue.g(j), eue.f(j), iG3, eueVar4 != null ? eue.f(eueVar4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.gga
    public final void f() {
        i(hte.d);
    }

    @Override // defpackage.gga
    public final void g(hkb hkbVar) {
        Rect rect;
        this.k = new Rect(ym8.L(hkbVar.a), ym8.L(hkbVar.b), ym8.L(hkbVar.c), ym8.L(hkbVar.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.gga
    public final void h(zse zseVar, rx6 rx6Var, bv9 bv9Var, ou2 ou2Var) {
        this.d = true;
        this.g = zseVar;
        this.h = rx6Var;
        this.e = bv9Var;
        this.f = ou2Var;
        i(hte.a);
    }

    public final void i(hte hteVar) {
        this.m.b(hteVar);
        if (this.n == null) {
            m45 m45Var = new m45(27, this);
            this.c.execute(m45Var);
            this.n = m45Var;
        }
    }
}
