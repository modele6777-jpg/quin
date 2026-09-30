package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kx5 implements ComponentCallbacks, View.OnCreateContextMenuListener, x48, pwf, lh6, kdc {
    public static final Object i1 = new Object();
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public zx5 I0;
    public mx5 J0;
    public kx5 L0;
    public int M0;
    public int N0;
    public String O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean T0;
    public ViewGroup U0;
    public boolean V0;
    public boolean X;
    public ix5 X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public String a1;
    public Bundle b;
    public g48 b1;
    public SparseArray c;
    public a58 c1;
    public Bundle d;
    public final v69 d1;
    public ldc e1;
    public Bundle f;
    public lqb f1;
    public kx5 g;
    public final ArrayList g1;
    public final gx5 h1;
    public int w;
    public boolean y;
    public boolean z;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String v = null;
    public Boolean x = null;
    public zx5 K0 = new zx5();
    public final boolean S0 = true;
    public boolean W0 = true;

    public kx5() {
        new wwg(11, this);
        this.b1 = g48.e;
        this.d1 = new v69();
        new AtomicInteger();
        this.g1 = new ArrayList();
        this.h1 = new gx5(this);
        l();
    }

    public void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.K0.O();
        this.G0 = true;
        g();
    }

    public final Context B() {
        mx5 mx5Var = this.J0;
        Context context = mx5Var == null ? null : mx5Var.H0;
        if (context != null) {
            return context;
        }
        yg5.k(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void C(int i, int i2, int i3, int i4) {
        if (this.X0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        d().b = i;
        d().c = i2;
        d().d = i3;
        d().e = i4;
    }

    public abstract qk2 a();

    @Override // defpackage.lh6
    public final jwf c() {
        Application application = null;
        if (this.I0 == null) {
            qc0.p("Can't access ViewModels from detached fragment");
            return null;
        }
        ldc ldcVar = this.e1;
        if (ldcVar != null) {
            return ldcVar;
        }
        for (Context applicationContext = B().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
        }
        if (application == null && zx5.I(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + B().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ldc ldcVar2 = new ldc(application, this, this.f);
        this.e1 = ldcVar2;
        return ldcVar2;
    }

    public final ix5 d() {
        ix5 ix5Var = this.X0;
        if (ix5Var != null) {
            return ix5Var;
        }
        ix5 ix5Var2 = new ix5();
        Object obj = i1;
        ix5Var2.f = obj;
        ix5Var2.g = obj;
        ix5Var2.h = obj;
        ix5Var2.i = null;
        this.X0 = ix5Var2;
        return ix5Var2;
    }

    @Override // defpackage.lh6
    public final m69 e() {
        Application application;
        Context applicationContext = B().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && zx5.I(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + B().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        m69 m69Var = new m69(0);
        LinkedHashMap linkedHashMap = m69Var.a;
        if (application != null) {
            linkedHashMap.put(iwf.d, application);
        }
        linkedHashMap.put(cdc.a, this);
        linkedHashMap.put(cdc.b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(cdc.c, bundle);
        }
        return m69Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final zx5 f() {
        if (this.J0 != null) {
            return this.K0;
        }
        yg5.k(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    @Override // defpackage.pwf
    public final owf g() {
        if (this.I0 == null) {
            qc0.p("Can't access ViewModels from detached fragment");
            return null;
        }
        if (i() == 1) {
            qc0.p("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.I0.O.d;
        owf owfVar = (owf) map.get(this.e);
        if (owfVar != null) {
            return owfVar;
        }
        owf owfVar2 = new owf();
        map.put(this.e, owfVar2);
        return owfVar2;
    }

    @Override // defpackage.kdc
    public final vea h() {
        return (vea) this.f1.c;
    }

    public final int i() {
        g48 g48Var = this.b1;
        return (g48Var == g48.b || this.L0 == null) ? g48Var.ordinal() : Math.min(g48Var.ordinal(), this.L0.i());
    }

    public final zx5 j() {
        zx5 zx5Var = this.I0;
        if (zx5Var != null) {
            return zx5Var;
        }
        yg5.k(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    @Override // defpackage.x48
    public final h48 k() {
        return this.c1;
    }

    public final void l() {
        this.c1 = new a58(this, true);
        this.f1 = new lqb(new jdc(this, new hla(15, this)));
        this.e1 = null;
        ArrayList arrayList = this.g1;
        gx5 gx5Var = this.h1;
        if (arrayList.contains(gx5Var)) {
            return;
        }
        if (this.a >= 0) {
            gx5Var.a();
        } else {
            arrayList.add(gx5Var);
        }
    }

    public final void m() {
        l();
        this.a1 = this.e;
        this.e = UUID.randomUUID().toString();
        this.y = false;
        this.z = false;
        this.Y = false;
        this.Z = false;
        this.F0 = false;
        this.H0 = 0;
        this.I0 = null;
        this.K0 = new zx5();
        this.J0 = null;
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = null;
        this.P0 = false;
        this.Q0 = false;
    }

    public final boolean n() {
        return this.J0 != null && this.y;
    }

    public final boolean o() {
        if (this.P0) {
            return true;
        }
        zx5 zx5Var = this.I0;
        if (zx5Var != null) {
            kx5 kx5Var = this.L0;
            zx5Var.getClass();
            if (kx5Var == null ? false : kx5Var.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.T0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mx5 mx5Var = this.J0;
        nx5 nx5Var = mx5Var == null ? null : (nx5) mx5Var.G0;
        if (nx5Var != null) {
            nx5Var.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            yg5.k(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.T0 = true;
    }

    public final boolean p() {
        return this.H0 > 0;
    }

    public abstract void q();

    public void r(int i, int i2, Intent intent) {
        if (zx5.I(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void s(Context context) {
        this.T0 = true;
        mx5 mx5Var = this.J0;
        if ((mx5Var == null ? null : mx5Var.G0) != null) {
            this.T0 = true;
        }
    }

    public abstract void t(Bundle bundle);

    public final String toString() {
        StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.M0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.M0));
        }
        if (this.O0 != null) {
            sb.append(" tag=");
            sb.append(this.O0);
        }
        sb.append(")");
        return sb.toString();
    }

    public abstract void u();

    public abstract void v();

    public LayoutInflater w(Bundle bundle) {
        mx5 mx5Var = this.J0;
        if (mx5Var == null) {
            qc0.p("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        nx5 nx5Var = mx5Var.K0;
        LayoutInflater layoutInflaterCloneInContext = nx5Var.getLayoutInflater().cloneInContext(nx5Var);
        layoutInflaterCloneInContext.setFactory2(this.K0.f);
        return layoutInflaterCloneInContext;
    }

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();
}
