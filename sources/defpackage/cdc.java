package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cdc {
    public static final eu4 a;
    public static final yx4 b;
    public static final jy4 c;

    static {
        int i = 25;
        a = new eu4(i);
        b = new yx4(i);
        c = new jy4(i);
    }

    public static final ycc a(gy2 gy2Var) {
        ycc yccVar;
        gy2Var.getClass();
        kdc kdcVar = (kdc) gy2Var.a(a);
        Bundle bundle = null;
        if (kdcVar == null) {
            qc0.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        pwf pwfVar = (pwf) gy2Var.a(b);
        if (pwfVar == null) {
            qc0.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) gy2Var.a(c);
        String str = (String) gy2Var.a(lwf.a);
        if (str == null) {
            qc0.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        idc idcVarX = kdcVar.h().x("androidx.lifecycle.internal.SavedStateHandlesProvider");
        ddc ddcVar = idcVarX instanceof ddc ? (ddc) idcVarX : null;
        if (ddcVar == null) {
            qc0.p("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = c(pwfVar).b;
        ycc yccVar2 = (ycc) linkedHashMap.get(str);
        if (yccVar2 != null) {
            return yccVar2;
        }
        ddcVar.b();
        Bundle bundle3 = ddcVar.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                ddcVar.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            yccVar = new ycc();
        } else {
            ClassLoader classLoader = ycc.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            fl8 fl8Var = new fl8(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                fl8Var.put(str2, bundle2.get(str2));
            }
            yccVar = new ycc(fl8Var.j());
        }
        linkedHashMap.put(str, yccVar);
        return yccVar;
    }

    public static final void b(kdc kdcVar) {
        g48 g48Var = ((a58) kdcVar.k()).i;
        if (g48Var != g48.b && g48Var != g48.c) {
            cva.o("Failed to enable `SavedStateHandle` for `", kdcVar, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", g48Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (kdcVar.h().x("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            ddc ddcVar = new ddc(kdcVar.h(), (pwf) kdcVar);
            kdcVar.h().A("androidx.lifecycle.internal.SavedStateHandlesProvider", ddcVar);
            kdcVar.k().a(new gkb(3, ddcVar));
        }
    }

    public static final edc c(pwf pwfVar) {
        bdc bdcVar = new bdc();
        gy2 gy2VarI = hcc.i(pwfVar);
        gy2VarI.getClass();
        owf owfVarG = pwfVar.g();
        owfVarG.getClass();
        return (edc) new kxa(owfVarG, bdcVar, gy2VarI).f(job.a.b(edc.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
