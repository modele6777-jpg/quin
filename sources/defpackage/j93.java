package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j93 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new j93(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str;
        if (this.label == 0) {
            jzb.q(obj);
            l93 l93Var = l93.a;
            if (new File(cn1.z().getNoBackupFilesDir(), "analytics-app-install").createNewFile()) {
                return wef.a;
            }
            str = "Check failed.";
        } else {
            str = "call to 'resume' before 'invoke' with coroutine";
        }
        qc0.p(str);
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        j93 j93Var = (j93) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        j93Var.r(wefVar);
        return wefVar;
    }
}
