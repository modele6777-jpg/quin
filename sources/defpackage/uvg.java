package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uvg implements x5h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uvg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.x5h
    public final void a(String str, String str2, Bundle bundle, long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gsg gsgVar = (gsg) obj;
                if (((HashSet) gsgVar.a).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    ry6 ry6Var = etg.a;
                    String strU = rfc.u(str2, ok8.y, ok8.t);
                    if (strU != null) {
                        str2 = strU;
                    }
                    bundle2.putString("events", str2);
                    ((kl) gsgVar.b).onMessageTriggered(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !etg.a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((kl) ((vrb) obj).b).onMessageTriggered(3, bundle3);
                    break;
                }
                break;
        }
    }
}
