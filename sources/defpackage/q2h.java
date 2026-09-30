package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q2h implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2h b;
    public final /* synthetic */ String c;

    public /* synthetic */ q2h(y2h y2hVar, String str, int i) {
        this.a = i;
        this.b = y2hVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.c;
        y2h y2hVar = this.b;
        switch (i) {
            case 0:
                return new l6h(new q2h(y2hVar, str, 1));
            case 1:
                krg krgVar = y2hVar.c.c;
                ich.S(krgVar);
                k1h k1hVarE1 = krgVar.E1(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((w3h) y2hVar.b).d.G0();
                map.put("gmp_version", 161000L);
                if (k1hVarE1 != null) {
                    String strO = k1hVarE1.O();
                    if (strO != null) {
                        map.put("app_version", strO);
                    }
                    map.put("app_version_int", Long.valueOf(k1hVarE1.Q()));
                    map.put("dynamite_version", Long.valueOf(k1hVarE1.b()));
                }
                return map;
            default:
                lqb lqbVar = new lqb(y2hVar, str, false, 28);
                bah bahVar = new bah("internal.remoteConfig", 0);
                bahVar.b.put("getValue", new l6h(bahVar, lqbVar));
                return bahVar;
        }
    }
}
