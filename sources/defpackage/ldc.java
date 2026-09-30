package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ldc implements jwf {
    public final Application a;
    public final iwf b;
    public final Bundle c;
    public final h48 d;
    public final vea e;

    public ldc(Application application, kdc kdcVar, Bundle bundle) {
        iwf iwfVar;
        this.e = kdcVar.h();
        this.d = kdcVar.k();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            iwfVar = iwf.c;
            if (iwfVar == null) {
                iwfVar = new iwf(application);
                iwf.c = iwfVar;
            }
        } else {
            iwfVar = new iwf(null);
        }
        this.b = iwfVar;
    }

    @Override // defpackage.jwf
    public final ewf a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        qc0.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.jwf
    public final ewf b(Class cls, m69 m69Var) {
        LinkedHashMap linkedHashMap = m69Var.a;
        String str = (String) linkedHashMap.get(lwf.a);
        if (str == null) {
            qc0.p("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(cdc.a) == null || linkedHashMap.get(cdc.b) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            qc0.p("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(iwf.d);
        boolean zIsAssignableFrom = cx.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? mdc.a(mdc.b, cls) : mdc.a(mdc.a, cls);
        if (constructorA == null) {
            return this.b.b(cls, m69Var);
        }
        return (!zIsAssignableFrom || application == null) ? mdc.b(cls, constructorA, cdc.a(m69Var)) : mdc.b(cls, constructorA, application, cdc.a(m69Var));
    }

    @Override // defpackage.jwf
    public final ewf c(em7 em7Var, m69 m69Var) {
        em7Var.getClass();
        return b(af1.R(em7Var), m69Var);
    }

    public final ewf d(String str, Class cls) {
        ycc yccVar;
        h48 h48Var = this.d;
        if (h48Var == null) {
            s8f.i("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = cx.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? mdc.a(mdc.b, cls) : mdc.a(mdc.a, cls);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            kwf kwfVar = kwf.a;
            if (kwfVar == null) {
                kwfVar = new kwf();
                kwf.a = kwfVar;
            }
            return kwfVar.a(cls);
        }
        vea veaVar = this.e;
        veaVar.getClass();
        Bundle bundleO = veaVar.o(str);
        if (bundleO == null) {
            bundleO = this.c;
        }
        if (bundleO == null) {
            yccVar = new ycc();
        } else {
            ClassLoader classLoader = ycc.class.getClassLoader();
            classLoader.getClass();
            bundleO.setClassLoader(classLoader);
            fl8 fl8Var = new fl8(bundleO.size());
            for (String str2 : bundleO.keySet()) {
                str2.getClass();
                fl8Var.put(str2, bundleO.get(str2));
            }
            yccVar = new ycc(fl8Var.j());
        }
        zcc zccVar = new zcc(str, yccVar);
        zccVar.b(veaVar, h48Var);
        g48 g48Var = ((a58) h48Var).i;
        if (g48Var == g48.b || g48Var.compareTo(g48.d) >= 0) {
            veaVar.B();
        } else {
            h48Var.a(new rr3(1, h48Var, veaVar));
        }
        ewf ewfVarB = (!zIsAssignableFrom || application == null) ? mdc.b(cls, constructorA, yccVar) : mdc.b(cls, constructorA, application, yccVar);
        ewfVarB.a("androidx.lifecycle.savedstate.vm.tag", zccVar);
        return ewfVarB;
    }

    public ldc() {
        this.b = new iwf(null);
    }
}
