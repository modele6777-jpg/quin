package defpackage;

import ai.askquin.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fy5 {
    public final w84 a;
    public final szc b;
    public final kx5 c;
    public boolean d = false;
    public int e = -1;

    public fy5(w84 w84Var, szc szcVar, ClassLoader classLoader, tx5 tx5Var, Bundle bundle) {
        this.a = w84Var;
        this.b = szcVar;
        ey5 ey5Var = (ey5) bundle.getParcelable("state");
        kx5 kx5VarA = tx5Var.a(ey5Var.a);
        kx5VarA.e = ey5Var.b;
        kx5VarA.Y = ey5Var.c;
        kx5VarA.E0 = ey5Var.d;
        kx5VarA.F0 = true;
        kx5VarA.M0 = ey5Var.e;
        kx5VarA.N0 = ey5Var.f;
        kx5VarA.O0 = ey5Var.g;
        kx5VarA.R0 = ey5Var.v;
        kx5VarA.z = ey5Var.w;
        kx5VarA.Q0 = ey5Var.x;
        kx5VarA.P0 = ey5Var.y;
        kx5VarA.b1 = g48.values()[ey5Var.z];
        kx5VarA.v = ey5Var.X;
        kx5VarA.w = ey5Var.Y;
        kx5VarA.W0 = ey5Var.Z;
        this.c = kx5VarA;
        kx5VarA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        zx5 zx5Var = kx5VarA.I0;
        if (zx5Var != null && (zx5Var.H || zx5Var.I)) {
            qc0.p("Fragment already added and state has been saved");
            throw null;
        }
        kx5VarA.f = bundle2;
        if (zx5.I(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + kx5VarA);
        }
    }

    public final void a() {
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + kx5Var);
        }
        Bundle bundle = kx5Var.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        kx5Var.K0.O();
        kx5Var.a = 3;
        kx5Var.T0 = false;
        kx5Var.q();
        if (!kx5Var.T0) {
            l81.g(kx5Var, " did not call through to super.onActivityCreated()");
            return;
        }
        if (zx5.I(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + kx5Var);
        }
        kx5Var.b = null;
        zx5 zx5Var = kx5Var.K0;
        zx5Var.H = false;
        zx5Var.I = false;
        zx5Var.O.g = false;
        zx5Var.u(4);
        this.a.I0(kx5Var, false);
    }

    public final void b() {
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto ATTACHED: " + kx5Var);
        }
        kx5 kx5Var2 = kx5Var.g;
        fy5 fy5Var = null;
        szc szcVar = this.b;
        if (kx5Var2 != null) {
            fy5 fy5Var2 = (fy5) ((HashMap) szcVar.c).get(kx5Var2.e);
            if (fy5Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(kx5Var);
                kx5 kx5Var3 = kx5Var.g;
                sb.append(" declared target fragment ");
                sb.append(kx5Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            kx5Var.v = kx5Var.g.e;
            kx5Var.g = null;
            fy5Var = fy5Var2;
        } else {
            String str = kx5Var.v;
            if (str != null && (fy5Var = (fy5) ((HashMap) szcVar.c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(kx5Var);
                sb2.append(" declared target fragment ");
                qc0.p(ks0.l(sb2, kx5Var.v, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (fy5Var != null) {
            fy5Var.j();
        }
        zx5 zx5Var = kx5Var.I0;
        kx5Var.J0 = zx5Var.w;
        kx5Var.L0 = zx5Var.y;
        w84 w84Var = this.a;
        w84Var.O0(kx5Var, false);
        ArrayList arrayList = kx5Var.g1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((gx5) it.next()).a();
        }
        arrayList.clear();
        kx5Var.K0.b(kx5Var.J0, kx5Var.a(), kx5Var);
        kx5Var.a = 0;
        kx5Var.T0 = false;
        kx5Var.s(kx5Var.J0.H0);
        if (!kx5Var.T0) {
            l81.g(kx5Var, " did not call through to super.onAttach()");
            return;
        }
        Iterator it2 = kx5Var.I0.p.iterator();
        while (it2.hasNext()) {
            ((cy5) it2.next()).a();
        }
        zx5 zx5Var2 = kx5Var.K0;
        zx5Var2.H = false;
        zx5Var2.I = false;
        zx5Var2.O.g = false;
        zx5Var2.u(0);
        w84Var.J0(kx5Var, false);
    }

    public final int c() {
        bt3 bt3Var;
        kx5 kx5Var = this.c;
        if (kx5Var.I0 == null) {
            return kx5Var.a;
        }
        int iMin = this.e;
        int iOrdinal = kx5Var.b1.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (kx5Var.Y) {
            boolean z = kx5Var.Z;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
            } else {
                iMin = i < 4 ? Math.min(iMin, kx5Var.a) : Math.min(iMin, 1);
            }
        }
        if (kx5Var.E0 && kx5Var.U0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!kx5Var.y) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = kx5Var.U0;
        if (viewGroup != null) {
            kx5Var.j().G().getClass();
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof bt3) {
                bt3Var = (bt3) tag;
            } else {
                bt3Var = new bt3(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, bt3Var);
            }
            Iterator it = bt3Var.b.iterator();
            if (it.hasNext()) {
                throw null;
            }
            Iterator it2 = bt3Var.c.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        if (kx5Var.z) {
            iMin = kx5Var.p() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (kx5Var.V0 && kx5Var.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (kx5Var.X) {
            iMin = Math.max(iMin, 3);
        }
        if (zx5.I(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + kx5Var);
        }
        return iMin;
    }

    public final void d() {
        Bundle bundle;
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto CREATED: " + kx5Var);
        }
        Bundle bundle2 = kx5Var.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (kx5Var.Z0) {
            kx5Var.a = 1;
            Bundle bundle4 = kx5Var.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            kx5Var.K0.T(bundle);
            zx5 zx5Var = kx5Var.K0;
            zx5Var.H = false;
            zx5Var.I = false;
            zx5Var.O.g = false;
            zx5Var.u(1);
            return;
        }
        w84 w84Var = this.a;
        w84Var.P0(kx5Var, false);
        kx5Var.K0.O();
        kx5Var.a = 1;
        kx5Var.T0 = false;
        kx5Var.c1.a(new hx5());
        kx5Var.t(bundle3);
        kx5Var.Z0 = true;
        if (!kx5Var.T0) {
            l81.g(kx5Var, " did not call through to super.onCreate()");
        } else {
            kx5Var.c1.e(f48.ON_CREATE);
            w84Var.K0(kx5Var, bundle3, false);
        }
    }

    public final void e() {
        String resourceName;
        kx5 kx5Var = this.c;
        if (kx5Var.Y) {
            return;
        }
        if (zx5.I(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + kx5Var);
        }
        Bundle bundle = kx5Var.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterW = kx5Var.w(bundle2);
        ViewGroup viewGroup2 = kx5Var.U0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = kx5Var.N0;
            if (i != 0) {
                if (i == -1) {
                    r3.m(kx5Var, " for a container view with no id", "Cannot create fragment ");
                    return;
                }
                viewGroup = (ViewGroup) kx5Var.I0.x.H(i);
                if (viewGroup == null) {
                    if (!kx5Var.F0 && !kx5Var.E0) {
                        try {
                            resourceName = kx5Var.B().getResources().getResourceName(kx5Var.N0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(kx5Var.N0) + " (" + resourceName + ") for fragment " + kx5Var);
                    }
                } else if (!(viewGroup instanceof ox5)) {
                    hy5 hy5Var = iy5.a;
                    iy5.b(new wcg(kx5Var, viewGroup));
                    iy5.a(kx5Var).getClass();
                }
            }
        }
        kx5Var.U0 = viewGroup;
        kx5Var.A(layoutInflaterW, viewGroup, bundle2);
        kx5Var.a = 2;
    }

    public final void f() {
        boolean z;
        kx5 kx5VarF;
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom CREATED: " + kx5Var);
        }
        boolean z2 = kx5Var.z && !kx5Var.p();
        szc szcVar = this.b;
        if (z2) {
            szcVar.S(kx5Var.e, null);
        }
        if (!z2) {
            by5 by5Var = (by5) szcVar.e;
            if (!((by5Var.b.containsKey(kx5Var.e) && by5Var.e) ? by5Var.f : true)) {
                String str = kx5Var.v;
                if (str != null && (kx5VarF = szcVar.F(str)) != null && kx5VarF.R0) {
                    kx5Var.g = kx5VarF;
                }
                kx5Var.a = 0;
                return;
            }
        }
        mx5 mx5Var = kx5Var.J0;
        if (mx5Var != null) {
            z = ((by5) szcVar.e).f;
        } else {
            Context context = mx5Var.H0;
            z = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((by5) szcVar.e).f(kx5Var, false);
        }
        kx5Var.K0.l();
        kx5Var.c1.e(f48.ON_DESTROY);
        kx5Var.a = 0;
        kx5Var.T0 = false;
        kx5Var.Z0 = false;
        kx5Var.T0 = true;
        if (!kx5Var.T0) {
            l81.g(kx5Var, " did not call through to super.onDestroy()");
            return;
        }
        this.a.L0(kx5Var, false);
        for (fy5 fy5Var : szcVar.H()) {
            if (fy5Var != null) {
                kx5 kx5Var2 = fy5Var.c;
                if (kx5Var.e.equals(kx5Var2.v)) {
                    kx5Var2.g = kx5Var;
                    kx5Var2.v = null;
                }
            }
        }
        String str2 = kx5Var.v;
        if (str2 != null) {
            kx5Var.g = szcVar.F(str2);
        }
        szcVar.R(this);
    }

    public final void g() {
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + kx5Var);
        }
        kx5Var.K0.u(1);
        kx5Var.a = 1;
        kx5Var.T0 = false;
        kx5Var.u();
        if (!kx5Var.T0) {
            l81.g(kx5Var, " did not call through to super.onDestroyView()");
            return;
        }
        owf owfVarG = kx5Var.g();
        owfVarG.getClass();
        ey2 ey2Var = ey2.b;
        ey2Var.getClass();
        kxa kxaVar = new kxa(owfVarG, ba8.d, ey2Var);
        em7 em7VarB = job.a.b(ba8.class);
        String strG = em7VarB.g();
        if (strG == null) {
            qc0.j("Local and anonymous classes can not be ViewModels");
            return;
        }
        fud fudVar = ((ba8) kxaVar.f(em7VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG))).b;
        int iD = fudVar.d();
        for (int i = 0; i < iD; i++) {
            ((z98) fudVar.e(i)).l();
        }
        kx5Var.G0 = false;
        this.a.U0(kx5Var, false);
        kx5Var.U0 = null;
        kx5Var.d1.k(null);
        kx5Var.Z = false;
    }

    public final void h() {
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + kx5Var);
        }
        kx5Var.a = -1;
        kx5Var.T0 = false;
        kx5Var.v();
        if (!kx5Var.T0) {
            l81.g(kx5Var, " did not call through to super.onDetach()");
            return;
        }
        zx5 zx5Var = kx5Var.K0;
        if (!zx5Var.J) {
            zx5Var.l();
            kx5Var.K0 = new zx5();
        }
        this.a.M0(kx5Var, false);
        kx5Var.a = -1;
        kx5Var.J0 = null;
        kx5Var.L0 = null;
        kx5Var.I0 = null;
        if (!kx5Var.z || kx5Var.p()) {
            by5 by5Var = (by5) this.b.e;
            if (!((by5Var.b.containsKey(kx5Var.e) && by5Var.e) ? by5Var.f : true)) {
                return;
            }
        }
        if (zx5.I(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + kx5Var);
        }
        kx5Var.m();
    }

    public final void i() {
        kx5 kx5Var = this.c;
        if (kx5Var.Y && kx5Var.Z && !kx5Var.G0) {
            if (zx5.I(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + kx5Var);
            }
            Bundle bundle = kx5Var.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            kx5Var.A(kx5Var.w(bundle2), null, bundle2);
        }
    }

    public final void j() {
        szc szcVar = this.b;
        boolean z = this.d;
        kx5 kx5Var = this.c;
        if (z) {
            if (zx5.I(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + kx5Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iC = c();
                int i = kx5Var.a;
                if (iC == i) {
                    if (!z2 && i == -1 && kx5Var.z && !kx5Var.p()) {
                        if (zx5.I(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + kx5Var);
                        }
                        ((by5) szcVar.e).f(kx5Var, true);
                        szcVar.R(this);
                        if (zx5.I(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + kx5Var);
                        }
                        kx5Var.m();
                    }
                    if (kx5Var.Y0) {
                        zx5 zx5Var = kx5Var.I0;
                        if (zx5Var != null && kx5Var.y && zx5.J(kx5Var)) {
                            zx5Var.G = true;
                        }
                        kx5Var.Y0 = false;
                        kx5Var.K0.o();
                    }
                    return;
                }
                if (iC <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            kx5Var.a = 1;
                            break;
                        case 2:
                            kx5Var.Z = false;
                            kx5Var.a = 2;
                            break;
                        case 3:
                            if (zx5.I(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + kx5Var);
                            }
                            kx5Var.a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            kx5Var.a = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            kx5Var.a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            kx5Var.a = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void k() {
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom RESUMED: " + kx5Var);
        }
        kx5Var.K0.u(5);
        kx5Var.c1.e(f48.ON_PAUSE);
        kx5Var.a = 6;
        kx5Var.T0 = true;
        this.a.N0(kx5Var, false);
    }

    public final void l(ClassLoader classLoader) {
        kx5 kx5Var = this.c;
        Bundle bundle = kx5Var.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (kx5Var.b.getBundle("savedInstanceState") == null) {
            kx5Var.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            kx5Var.c = kx5Var.b.getSparseParcelableArray("viewState");
            kx5Var.d = kx5Var.b.getBundle("viewRegistryState");
            ey5 ey5Var = (ey5) kx5Var.b.getParcelable("state");
            if (ey5Var != null) {
                kx5Var.v = ey5Var.X;
                kx5Var.w = ey5Var.Y;
                kx5Var.W0 = ey5Var.Z;
            }
            if (kx5Var.W0) {
                return;
            }
            kx5Var.V0 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + kx5Var, e);
        }
    }

    public final void m() {
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto RESUMED: " + kx5Var);
        }
        ix5 ix5Var = kx5Var.X0;
        View view = ix5Var == null ? null : ix5Var.i;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        kx5Var.d().i = null;
        kx5Var.K0.O();
        kx5Var.K0.z(true);
        kx5Var.a = 7;
        kx5Var.T0 = false;
        kx5Var.T0 = true;
        if (!kx5Var.T0) {
            l81.g(kx5Var, " did not call through to super.onResume()");
            return;
        }
        kx5Var.c1.e(f48.ON_RESUME);
        zx5 zx5Var = kx5Var.K0;
        zx5Var.H = false;
        zx5Var.I = false;
        zx5Var.O.g = false;
        zx5Var.u(7);
        this.a.Q0(kx5Var, false);
        this.b.S(kx5Var.e, null);
        kx5Var.b = null;
        kx5Var.c = null;
        kx5Var.d = null;
    }

    public final void n() {
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto STARTED: " + kx5Var);
        }
        kx5Var.K0.O();
        kx5Var.K0.z(true);
        kx5Var.a = 5;
        kx5Var.T0 = false;
        kx5Var.y();
        if (!kx5Var.T0) {
            l81.g(kx5Var, " did not call through to super.onStart()");
            return;
        }
        kx5Var.c1.e(f48.ON_START);
        zx5 zx5Var = kx5Var.K0;
        zx5Var.H = false;
        zx5Var.I = false;
        zx5Var.O.g = false;
        zx5Var.u(5);
        this.a.S0(kx5Var, false);
    }

    public final void o() {
        boolean zI = zx5.I(3);
        kx5 kx5Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom STARTED: " + kx5Var);
        }
        zx5 zx5Var = kx5Var.K0;
        zx5Var.I = true;
        zx5Var.O.g = true;
        zx5Var.u(4);
        kx5Var.c1.e(f48.ON_STOP);
        kx5Var.a = 4;
        kx5Var.T0 = false;
        kx5Var.z();
        if (kx5Var.T0) {
            this.a.T0(kx5Var, false);
        } else {
            l81.g(kx5Var, " did not call through to super.onStop()");
        }
    }

    public fy5(w84 w84Var, szc szcVar, kx5 kx5Var) {
        this.a = w84Var;
        this.b = szcVar;
        this.c = kx5Var;
    }

    public fy5(w84 w84Var, szc szcVar, kx5 kx5Var, Bundle bundle) {
        this.a = w84Var;
        this.b = szcVar;
        this.c = kx5Var;
        kx5Var.c = null;
        kx5Var.d = null;
        kx5Var.H0 = 0;
        kx5Var.Z = false;
        kx5Var.y = false;
        kx5 kx5Var2 = kx5Var.g;
        kx5Var.v = kx5Var2 != null ? kx5Var2.e : null;
        kx5Var.g = null;
        kx5Var.b = bundle;
        kx5Var.f = bundle.getBundle("arguments");
    }
}
