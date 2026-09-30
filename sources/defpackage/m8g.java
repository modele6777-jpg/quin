package defpackage;

import ai.askquin.R;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m8g {
    public static final WeakHashMap w = new WeakHashMap();
    public final fx a;
    public final fx b;
    public final fx c;
    public final fx d;
    public final fx e;
    public final fx f;
    public final fx g;
    public final fx h;
    public final fx i;
    public final trf j;
    public final vz9 k;
    public final tef l;
    public final trf m;
    public final trf n;
    public final trf o;
    public final trf p;
    public final trf q;
    public final trf r;
    public final trf s;
    public final boolean t;
    public int u;
    public final b57 v;

    public m8g(View view) {
        fx fxVar = new fx(4, "captionBar");
        this.a = fxVar;
        fx fxVar2 = new fx(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, "displayCutout");
        this.b = fxVar2;
        fx fxVar3 = new fx(8, "ime");
        this.c = fxVar3;
        fx fxVar4 = new fx(32, "mandatorySystemGestures");
        this.d = fxVar4;
        fx fxVar5 = new fx(2, "navigationBars");
        this.e = fxVar5;
        fx fxVar6 = new fx(1, "statusBars");
        this.f = fxVar6;
        fx fxVar7 = new fx(519, "systemBars");
        this.g = fxVar7;
        fx fxVar8 = new fx(16, "systemGestures");
        this.h = fxVar8;
        fx fxVar9 = new fx(64, "tappableElement");
        this.i = fxVar9;
        trf trfVar = new trf(new g57(0, 0, 0, 0), "waterfall");
        this.j = trfVar;
        this.k = q1c.f(null);
        tef tefVar = new tef(new tef(fxVar7, fxVar3), fxVar2);
        this.l = tefVar;
        new tef(tefVar, new tef(new tef(new tef(fxVar9, fxVar4), fxVar8), trfVar));
        this.m = q7c.s(4, "captionBarIgnoringVisibility");
        this.n = q7c.s(2, "navigationBarsIgnoringVisibility");
        this.o = q7c.s(1, "statusBarsIgnoringVisibility");
        this.p = q7c.s(519, "systemBarsIgnoringVisibility");
        this.q = q7c.s(64, "tappableElementIgnoringVisibility");
        this.r = new trf(new g57(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new trf(new g57(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new b57(this);
        WeakHashMap weakHashMap = nvf.a;
        h8g h8gVarA = gvf.a(view);
        if (h8gVarA != null) {
            e8g e8gVar = h8gVarA.a;
            fxVar.f(e8gVar.u(4));
            fxVar2.f(e8gVar.u(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            fxVar3.f(e8gVar.u(8));
            fxVar4.f(e8gVar.u(32));
            fxVar5.f(e8gVar.u(2));
            fxVar6.f(e8gVar.u(1));
            fxVar7.f(e8gVar.u(519));
            fxVar8.f(e8gVar.u(16));
            fxVar9.f(e8gVar.u(64));
        }
    }

    public static void b(m8g m8gVar, h8g h8gVar) {
        boolean z = false;
        m8gVar.a.g(h8gVar, 0);
        m8gVar.c.g(h8gVar, 0);
        m8gVar.b.g(h8gVar, 0);
        m8gVar.e.g(h8gVar, 0);
        m8gVar.f.g(h8gVar, 0);
        m8gVar.g.g(h8gVar, 0);
        m8gVar.h.g(h8gVar, 0);
        m8gVar.i.g(h8gVar, 0);
        m8gVar.d.g(h8gVar, 0);
        m8gVar.m.f(d8c.t(h8gVar.a.j(4)));
        m8gVar.n.f(d8c.t(h8gVar.a.j(2)));
        m8gVar.o.f(d8c.t(h8gVar.a.j(1)));
        m8gVar.p.f(d8c.t(h8gVar.a.j(519)));
        m8gVar.q.f(d8c.t(h8gVar.a.j(64)));
        ha4 ha4VarH = h8gVar.a.h();
        m8gVar.j.f(d8c.t(ha4VarH != null ? ha4VarH.a() : x47.e));
        zt ztVar = null;
        if (ha4VarH != null) {
            Path pathL = Build.VERSION.SDK_INT >= 31 ? xq.l(ha4VarH.a) : null;
            if (pathL != null) {
                ztVar = new zt(pathL);
            }
        }
        m8gVar.k.setValue(ztVar);
        synchronized (qrd.c) {
            x79 x79Var = qrd.j.h;
            if (x79Var != null && x79Var.d()) {
                z = true;
            }
        }
        if (z) {
            qrd.c();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            b57 b57Var = this.v;
            b57Var.d = false;
            b57Var.e = false;
            b57Var.f = null;
            WeakHashMap weakHashMap = nvf.a;
            fvf.c(view, b57Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(b57Var);
            n7g.a(view, b57Var);
        }
        this.u++;
    }
}
