package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lye extends pfc implements Runnable {
    public final long f;

    public lye(long j, zn2 zn2Var) {
        super(zn2Var, zn2Var.getContext());
        this.f = j;
    }

    @Override // defpackage.rg7
    public final String T() {
        return super.T() + "(timeMillis=" + this.f + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        pv2 pv2Var = this.d;
        vfh.u(pv2Var);
        wv2 wv2Var = (wv2) pv2Var.F0(wv2.c);
        String str = wv2Var != null ? wv2Var.b : null;
        String strM = kv2.m("Timed out waiting for ", " ms", this.f);
        if (str != null) {
            StringBuilder sbP = tec.p("Coroutine \"", str, "\" ");
            if (strM.length() > 0) {
                strM = Character.toLowerCase(strM.charAt(0)) + strM.substring(1);
            }
            sbP.append(strM);
            strM = sbP.toString();
        }
        t(new kye(strM, this));
    }
}
