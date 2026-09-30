package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vi2 extends db6 {
    public static vi2 l;

    public static synchronized vi2 n1() {
        vi2 vi2Var;
        vi2Var = l;
        if (vi2Var == null) {
            vi2Var = new vi2();
            l = vi2Var;
        }
        return vi2Var;
    }

    @Override // defpackage.db6
    public final String M() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // defpackage.db6
    public final String P() {
        return "experiment_app_start_ttid";
    }
}
