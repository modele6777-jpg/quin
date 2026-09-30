package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hwf {
    public static final pzd a = new pzd(2);

    public static final a62 a(ewf ewfVar) {
        a62 a62Var;
        ewfVar.getClass();
        synchronized (a) {
            a62Var = (a62) ewfVar.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (a62Var == null) {
                pv2 pv2Var = nu4.a;
                try {
                    js3 js3Var = ga4.a;
                    pv2Var = mk8.a.f;
                } catch (IllegalStateException | wg9 unused) {
                }
                a62 a62Var2 = new a62(pv2Var.p0(iqf.d()));
                ewfVar.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", a62Var2);
                a62Var = a62Var2;
            }
        }
        return a62Var;
    }
}
