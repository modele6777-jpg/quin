package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gkb implements u48 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gkb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kdc kdcVar = (kdc) obj;
                if (f48Var != f48.ON_CREATE) {
                    qc0.i("Next event must be ON_CREATE");
                    return;
                }
                x48Var.k().b(this);
                Bundle bundleO = kdcVar.h().o("androidx.savedstate.Restarter");
                if (bundleO == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleO.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    qc0.p("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, gkb.class.getClassLoader()).asSubclass(hdc.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(kdcVar instanceof pwf)) {
                                    ho7.w(kdcVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                owf owfVarG = ((pwf) kdcVar).g();
                                vea veaVarH = kdcVar.h();
                                LinkedHashMap linkedHashMap = owfVarG.a;
                                LinkedHashMap linkedHashMap2 = owfVarG.a;
                                Iterator it = s72.o1(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    ewf ewfVar = (ewf) linkedHashMap2.get(it.next());
                                    if (ewfVar != null) {
                                        bm8.s(ewfVar, veaVarH, kdcVar.k());
                                    }
                                }
                                if (!s72.o1(linkedHashMap2.keySet()).isEmpty()) {
                                    veaVarH.B();
                                }
                            } catch (Exception e) {
                                cva.q(ub3.i("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        cva.q(ib8.j("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                vb2 vb2Var = (vb2) obj;
                if (vb2Var.e == null) {
                    rb2 rb2Var = (rb2) vb2Var.getLastNonConfigurationInstance();
                    if (rb2Var != null) {
                        vb2Var.e = rb2Var.a;
                    }
                    if (vb2Var.e == null) {
                        vb2Var.e = new owf();
                    }
                }
                vb2Var.a.b(this);
                return;
            case 2:
                new HashMap();
                h56[] h56VarArr = (h56[]) obj;
                if (h56VarArr.length > 0) {
                    h56 h56Var = h56VarArr[0];
                    throw null;
                }
                if (h56VarArr.length <= 0) {
                    return;
                }
                h56 h56Var2 = h56VarArr[0];
                throw null;
            default:
                if (f48Var != f48.ON_CREATE) {
                    ho7.w(f48Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    x48Var.k().b(this);
                    ((ddc) obj).b();
                    return;
                }
        }
    }
}
