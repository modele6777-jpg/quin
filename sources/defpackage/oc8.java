package defpackage;

import ai.askquin.datastore.model.LocalStorage;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oc8 extends gbe implements l26 {
    final /* synthetic */ String $date;
    final /* synthetic */ String $skinTypeName;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc8(String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$date = str;
        this.$skinTypeName = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        oc8 oc8Var = new oc8(this.$date, this.$skinTypeName, xn2Var);
        oc8Var.L$0 = obj;
        return oc8Var;
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
        linkedHashMapY.put(this.$date, this.$skinTypeName);
        return LocalStorage.copy$default(localStorage, null, null, null, null, false, 0, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, linkedHashMapY, false, 3145727, null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oc8) k((xn2) obj2, (LocalStorage) obj)).r(wef.a);
    }
}
