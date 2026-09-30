package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class da9 implements x48, pwf, lh6, kdc {
    public final bs a;
    public ua9 b;
    public final Bundle c;
    public g48 d;
    public final na9 e;
    public final String f;
    public final Bundle g;
    public final fa9 v = new fa9(this);
    public final ace w = new ace(new zv6(18, this));

    public da9(bs bsVar, ua9 ua9Var, Bundle bundle, g48 g48Var, na9 na9Var, String str, Bundle bundle2) {
        this.a = bsVar;
        this.b = ua9Var;
        this.c = bundle;
        this.d = g48Var;
        this.e = na9Var;
        this.f = str;
        this.g = bundle2;
    }

    public final ycc a() {
        return (ycc) this.w.getValue();
    }

    @Override // defpackage.lh6
    public final jwf c() {
        return this.v.l;
    }

    public final void d(g48 g48Var) {
        fa9 fa9Var = this.v;
        fa9Var.getClass();
        fa9Var.k = g48Var;
        fa9Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    @Override // defpackage.lh6
    public final m69 e() {
        Application application;
        fa9 fa9Var = this.v;
        fa9Var.getClass();
        m69 m69Var = new m69(0);
        da9 da9Var = fa9Var.a;
        LinkedHashMap linkedHashMap = m69Var.a;
        linkedHashMap.put(cdc.a, da9Var);
        linkedHashMap.put(cdc.b, da9Var);
        Bundle bundleA = fa9Var.a();
        if (bundleA != null) {
            linkedHashMap.put(cdc.c, bundleA);
        }
        bs bsVar = this.a;
        if (bsVar == null) {
            application = null;
        } else {
            Context context = bsVar.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(iwf.d, application2);
        }
        return m69Var;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof da9)) {
            da9 da9Var = (da9) obj;
            Bundle bundle = da9Var.c;
            if (!this.f.equals(da9Var.f) || !pa7.t(this.b, da9Var.b) || this.v.j != da9Var.v.j || h() != da9Var.h()) {
                return false;
            }
            Bundle bundle2 = this.c;
            if (pa7.t(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    if (!pa7.t(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pwf
    public final owf g() {
        fa9 fa9Var = this.v;
        if (!fa9Var.i) {
            qc0.p("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (fa9Var.j.i == g48.a) {
            qc0.p("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        na9 na9Var = fa9Var.e;
        if (na9Var == null) {
            qc0.p("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = fa9Var.f;
        LinkedHashMap linkedHashMap = na9Var.b;
        owf owfVar = (owf) linkedHashMap.get(str);
        if (owfVar != null) {
            return owfVar;
        }
        owf owfVar2 = new owf();
        linkedHashMap.put(str, owfVar2);
        return owfVar2;
    }

    @Override // defpackage.kdc
    public final vea h() {
        return (vea) this.v.h.c;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.b.hashCode() + (this.f.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return h().hashCode() + ((this.v.j.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // defpackage.x48
    public final h48 k() {
        return this.v.j;
    }

    public final String toString() {
        return this.v.toString();
    }
}
