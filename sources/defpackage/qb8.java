package defpackage;

import ai.askquin.datastore.model.LocalStorage;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qb8 extends gbe implements l26 {
    final /* synthetic */ Map<String, String> $datesToSkin;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb8(Map map, xn2 xn2Var) {
        super(2, xn2Var);
        this.$datesToSkin = map;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        qb8 qb8Var = new qb8(this.$datesToSkin, xn2Var);
        qb8Var.L$0 = obj;
        return qb8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        LocalStorage localStorage = (LocalStorage) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        LinkedHashMap linkedHashMapY = bm8.Y(localStorage.getDailyFortuneSkinPerDate());
        boolean z = false;
        for (Map.Entry<String, String> entry : this.$datesToSkin.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!linkedHashMapY.containsKey(key)) {
                linkedHashMapY.put(key, value);
                z = true;
            }
        }
        return z ? LocalStorage.copy$default(localStorage, null, null, null, null, false, 0, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, linkedHashMapY, false, 3145727, null) : localStorage;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qb8) k((xn2) obj2, (LocalStorage) obj)).r(wef.a);
    }
}
