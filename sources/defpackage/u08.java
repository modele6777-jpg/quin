package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u08 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u08(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj).getClass();
                return obj2;
            default:
                ua9 ua9Var = (ua9) obj;
                ua9Var.getClass();
                Map mapD = ua9Var.d();
                LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(mapD.size()));
                for (Map.Entry entry : mapD.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((ca9) entry.getValue()).a);
                }
                return m7c.f(obj2, linkedHashMap);
        }
    }
}
