package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yk8 extends od4 {
    public final ef c0;

    public yk8(ef efVar) {
        this.c0 = efVar;
    }

    @Override // defpackage.od4
    public final void y(Object obj, eb3 eb3Var) throws Exception {
        jf jfVar = this.c0.a;
        if (jfVar != null) {
            jfVar.y(obj, eb3Var);
        } else {
            qc0.p("Launcher has not been initialized");
        }
    }
}
