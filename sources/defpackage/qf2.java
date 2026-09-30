package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qf2 {
    public final View a;
    public boolean b;
    public lg2 c;
    public x48 d;
    public kdc e;
    public pwf f;
    public final jx6 g;
    public final ayb h;
    public final Configuration i;
    public final e89 j;
    public final to k;
    public final pw l;
    public final k47 m;
    public final c52 n;
    public final tp5 o;
    public final e89 p;
    public final eh6 q;
    public final sw r;
    public final vv7 s;
    public final b28 t;
    public final yl1 u;
    public int v;
    public final p w;
    public iv x;
    public final pf2 y;

    public qf2(qf2 qf2Var, View view, lg2 lg2Var, x48 x48Var, kdc kdcVar, pwf pwfVar) {
        jx6 jx6Var;
        Configuration configuration;
        e89 e89VarF;
        to toVar;
        pw pwVar;
        k47 k47Var;
        c52 rpVar;
        tp5 gecVar;
        e89 vz9Var;
        sw swVar;
        boolean zT = pa7.t(qf2Var != null ? qf2Var.a.getContext() : null, view.getContext());
        this.a = view;
        this.c = lg2Var;
        this.d = x48Var;
        this.e = kdcVar;
        this.f = pwfVar;
        if (zT) {
            qf2Var.getClass();
            jx6Var = qf2Var.g;
        } else {
            jx6Var = new jx6();
        }
        this.g = jx6Var;
        this.h = qf2Var != null ? qf2Var.h : new ayb();
        if (zT) {
            qf2Var.getClass();
            configuration = qf2Var.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (zT) {
            qf2Var.getClass();
            e89VarF = qf2Var.j;
        } else {
            e89VarF = q1c.f(new Configuration(configuration));
        }
        this.j = e89VarF;
        if (zT) {
            qf2Var.getClass();
            toVar = qf2Var.k;
        } else {
            toVar = new to(view.getContext());
        }
        this.k = toVar;
        if (zT) {
            qf2Var.getClass();
            pwVar = qf2Var.l;
        } else {
            pwVar = new pw(view.getContext());
        }
        this.l = pwVar;
        if (zT) {
            qf2Var.getClass();
            k47Var = qf2Var.m;
        } else {
            k47Var = new k47(6, view.getContext());
        }
        this.m = k47Var;
        if (zT) {
            qf2Var.getClass();
            rpVar = qf2Var.n;
        } else {
            rpVar = new rp(k47Var);
        }
        this.n = rpVar;
        if (zT) {
            qf2Var.getClass();
            gecVar = qf2Var.o;
        } else {
            view.getContext();
            gecVar = new gec(10);
        }
        this.o = gecVar;
        if (zT) {
            qf2Var.getClass();
            vz9Var = qf2Var.p;
        } else {
            vz9Var = new vz9(lmg.a0(view.getContext()), hj6.X0);
        }
        this.p = vz9Var;
        this.q = view == (qf2Var != null ? qf2Var.a : null) ? qf2Var.q : new afa(view);
        if (zT) {
            qf2Var.getClass();
            swVar = qf2Var.r;
        } else {
            swVar = new sw(ViewConfiguration.get(view.getContext()));
        }
        this.r = swVar;
        this.s = qf2Var != null ? qf2Var.s : new vv7();
        this.t = new b28();
        this.u = qf2Var != null ? qf2Var.u : new yl1();
        this.w = new p(27, this);
        this.y = new pf2(this);
    }

    public final void a(AndroidComposeView androidComposeView, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(123858079);
        int i2 = (l46Var.i(androidComposeView) ? 4 : 2) | i | (l46Var.i(dd2Var) ? 32 : 16) | (l46Var.i(this) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof zm7) && !(tag instanceof jn7))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof zm7) || (tag2 instanceof jn7))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(l46Var.z());
                l46Var.q = true;
                l46Var.C = true;
                l46Var.c.d();
                l46Var.H.d();
                opd opdVar = l46Var.I;
                lpd lpdVar = opdVar.a;
                opdVar.e = lpdVar.x;
                opdVar.f = lpdVar.y;
            }
            boolean zG = l46Var.g(androidComposeView.getView());
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = new ywf(androidComposeView.getView());
                l46Var.p0(objR);
            }
            ywf ywfVar = (ywf) objR;
            e1b e1bVarA = cb8.a.a(d());
            b1b b1bVar = hb8.a;
            g();
            kdc kdcVar = this.e;
            kdcVar.getClass();
            e1b e1bVarA2 = b1bVar.a(kdcVar);
            e1b e1bVarA3 = uq.d.a(this.g);
            e1b e1bVarA4 = uq.e.a(this.h);
            pr4 pr4Var = zg2.v;
            boolean zI = l46Var.i(this);
            Object objR2 = l46Var.R();
            int i3 = 3;
            if (zI || objR2 == i8cVar) {
                objR2 = new ot1(i3, this);
                l46Var.p0(objR2);
            }
            e1b e1bVarC = pr4Var.c((a26) objR2);
            e1b e1bVarA5 = uq.b.a(androidComposeView.getContext());
            e1b e1bVarA6 = i57.a.a(set);
            e1b e1bVarA7 = uq.a.a(androidComposeView.getConfiguration());
            pr4 pr4Var2 = wcc.a;
            boolean zI2 = l46Var.i(androidComposeView);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == i8cVar) {
                objR3 = new sp(androidComposeView, 3);
                l46Var.p0(objR3);
            }
            e1b e1bVarC2 = pr4Var2.c((a26) objR3);
            e1b e1bVarA8 = uq.f.a(androidComposeView.getView());
            pr4 pr4Var3 = zg2.x;
            boolean zI3 = l46Var.i(androidComposeView);
            Object objR4 = l46Var.R();
            if (zI3 || objR4 == i8cVar) {
                objR4 = new sp(androidComposeView, 4);
                l46Var.p0(objR4);
            }
            mh3.b(new e1b[]{e1bVarA, e1bVarA2, e1bVarA3, e1bVarA4, e1bVarC, e1bVarA5, e1bVarA6, e1bVarA7, e1bVarC2, e1bVarA8, pr4Var3.c((a26) objR4), zg2.t.a(androidComposeView.getViewConfiguration()), uq6.a.a(ywfVar)}, af1.b0(1317454175, new of2(androidComposeView, this, dd2Var), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new of2(this, androidComposeView, dd2Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            b1.d("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            pf2 pf2Var = this.y;
            context.unregisterComponentCallbacks(pf2Var);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(pf2Var);
        }
    }

    public final lg2 c() {
        g();
        lg2 lg2Var = this.c;
        lg2Var.getClass();
        return lg2Var;
    }

    public final x48 d() {
        g();
        x48 x48Var = this.d;
        x48Var.getClass();
        return x48Var;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            pf2 pf2Var = this.y;
            context.registerComponentCallbacks(pf2Var);
            f(view.getResources().getConfiguration());
            this.t.a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(pf2Var);
        }
    }

    public final void f(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                hx6 hx6Var = (hx6) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (hx6Var == null || Configuration.needNewResources(iUpdateFrom, hx6Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            ayb aybVar = this.h;
            synchronized (aybVar) {
                aybVar.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.p.setValue(lmg.a0(this.a.getContext()));
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        lg2 lg2Var = this.c;
        View view = this.a;
        if (lg2Var == null) {
            lg2 lg2VarA = g9g.a(view);
            if (lg2VarA == null) {
                Object parent = view.getParent();
                while (lg2VarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    lg2VarA = g9g.a(view2);
                    parent = jcc.g(view2);
                }
            }
            if (lg2VarA == null) {
                lg2VarA = g9g.b(view);
            }
            this.c = lg2VarA;
        }
        if (this.d == null) {
            x48 x48VarJ = scc.j(view);
            if (x48VarJ == null) {
                qc0.p("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = x48VarJ;
        }
        if (this.e == null) {
            kdc kdcVarI = fdc.i(view);
            if (kdcVarI == null) {
                qc0.p("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = kdcVarI;
        }
        if (this.f == null) {
            this.f = gdc.d(view);
        }
    }
}
