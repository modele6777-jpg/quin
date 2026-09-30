package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q7f {
    public final LinkedHashMap a;

    public q7f(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final q7f a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            wf7 wf7Var = (wf7) entry.getValue();
            linkedHashMap2.put(key, new wf7(wf7Var.a, wf7Var.b, wf7Var.c, true, true));
        }
        return new q7f(linkedHashMap2);
    }
}
