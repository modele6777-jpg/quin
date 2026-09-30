package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iv0 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ iv0(a26 a26Var, e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = e89Var;
        this.d = e89Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        e89 e89Var2 = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                zse zseVar = (zse) obj;
                e89Var2.setValue(zseVar);
                boolean zT = pa7.t((String) e89Var.getValue(), zseVar.a.b);
                k00 k00Var = zseVar.a;
                e89Var.setValue(k00Var.b);
                if (!zT) {
                    a26Var.d(k00Var.b);
                }
                break;
            default:
                vz9 vz9Var = ua0.a;
                va0 va0Var = (va0) vz9Var.getValue();
                Uri uri = va0Var != null ? va0Var.a : null;
                vz9Var.setValue(null);
                if (uri != null) {
                    String string = uri.toString();
                    string.getClass();
                    e89Var2.setValue(Boolean.valueOf(v4e.F(string, "/app/index", false)));
                    e89Var.setValue(Boolean.FALSE);
                    hf8.Q.getClass();
                    ef8.a("AppLinkEffect").e("AppLink uri: " + uri);
                    String string2 = uri.toString();
                    string2.getClass();
                    a26Var.d(string2);
                }
                break;
        }
        return wefVar;
    }
}
