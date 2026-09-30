package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi1 b;

    public /* synthetic */ di1(pi1 pi1Var, int i) {
        this.a = i;
        this.b = pi1Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean z;
        int i = this.a;
        wef wefVar = wef.a;
        pi1 pi1Var = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ynb.V(hwf.a(pi1Var), null, null, new oi1(pi1Var, uri, null), 3);
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                s0e s0eVar = pi1Var.v;
                if (num != null) {
                    z = num.intValue() == 1;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                s0eVar.getClass();
                s0eVar.n(null, boolValueOf);
                break;
            default:
                pi1Var.X.setValue(Boolean.FALSE);
                break;
        }
        return wefVar;
    }
}
