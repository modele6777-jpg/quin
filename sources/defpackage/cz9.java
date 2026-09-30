package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cz9 extends n16 {
    public final /* synthetic */ int J;
    public final String K;
    public final cu2 L;
    public final boolean M;

    public cz9(String str, cu2 cu2Var, boolean z, int i) {
        this.J = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.K = str;
                this.L = cu2Var;
                this.M = z;
                break;
            case 2:
                Objects.requireNonNull(str, "name == null");
                this.K = str;
                this.L = cu2Var;
                this.M = z;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.K = str;
                this.L = cu2Var;
                this.M = z;
                break;
        }
    }

    @Override // defpackage.n16
    public final void t(htb htbVar, Object obj) {
        String str;
        String str2;
        String str3;
        int i = this.J;
        boolean z = this.M;
        String str4 = this.K;
        cu2 cu2Var = this.L;
        switch (i) {
            case 0:
                if (obj != null && (str = (String) cu2Var.v(obj)) != null) {
                    htbVar.a(str4, str, z);
                }
                break;
            case 1:
                if (obj != null && (str2 = (String) cu2Var.v(obj)) != null) {
                    htbVar.b(str4, str2, z);
                }
                break;
            default:
                if (obj != null && (str3 = (String) cu2Var.v(obj)) != null) {
                    htbVar.d(str4, str3, z);
                }
                break;
        }
    }
}
