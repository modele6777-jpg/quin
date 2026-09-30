package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h93 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h93(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        l93 l93Var = l93.a;
        return new File(cn1.z().getNoBackupFilesDir(), "analytics-app-install").exists() ? "installed" : "";
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h93) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
