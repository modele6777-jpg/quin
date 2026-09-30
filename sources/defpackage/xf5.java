package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xf5 extends k8a {
    public static final ct d = ct.d();
    public final yb0 c;

    public xf5(yb0 yb0Var) {
        this.c = yb0Var;
    }

    @Override // defpackage.k8a
    public final boolean a() {
        ct ctVar = d;
        yb0 yb0Var = this.c;
        if (yb0Var == null) {
            ctVar.f("ApplicationInfo is null");
        } else if (!yb0Var.w()) {
            ctVar.f("GoogleAppId is null");
        } else if (!yb0Var.u()) {
            ctVar.f("AppInstanceId is null");
        } else if (!yb0Var.v()) {
            ctVar.f("ApplicationProcessState is null");
        } else {
            if (!yb0Var.t()) {
                return true;
            }
            if (!yb0Var.r().s()) {
                ctVar.f("AndroidAppInfo.packageName is null");
            } else {
                if (yb0Var.r().t()) {
                    return true;
                }
                ctVar.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        ctVar.f("ApplicationInfo is invalid");
        return false;
    }
}
