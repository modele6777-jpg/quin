package net.xmind.donut.gp;

import android.text.TextUtils;
import defpackage.hj6;
import defpackage.j3a;
import defpackage.k47;
import defpackage.o07;
import defpackage.o2b;
import defpackage.p07;
import defpackage.pa7;
import defpackage.t72;
import defpackage.v4e;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Quin:gp_release"}, k = 2, mv = {2, 4, 0}, xi = z7c.f)
public final class StoreInAppPurchaseResultsKt {
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList a(String str, List list, boolean z) {
        p07 p07Var;
        list.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o2b o2bVar = (o2b) it.next();
            k47 k47VarA = o2bVar.a();
            JSONObject jSONObject = o2bVar.c;
            Object j3aVar = null;
            if (pa7.t(k47VarA != null ? (String) k47VarA.b : null, str)) {
                String strC = o2bVar.c();
                strC.getClass();
                if (!v4e.Q(strC)) {
                    if (t72.I(2, 1).contains(Integer.valueOf(o2bVar.b()))) {
                        Iterator it2 = o2bVar.d().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                p07Var = null;
                                break;
                            }
                            p07 p07VarT = hj6.t((String) it2.next());
                            if (p07VarT != null) {
                                p07Var = p07VarT;
                                break;
                            }
                        }
                        if (p07Var != null) {
                            String strC2 = o2bVar.c();
                            String strOptString = jSONObject.optString("orderId");
                            String str2 = TextUtils.isEmpty(strOptString) ? null : strOptString;
                            long jOptLong = jSONObject.optLong("purchaseTime");
                            k47 k47VarA2 = o2bVar.a();
                            j3aVar = new j3a(new o07(strC2, str2, jOptLong, k47VarA2 != null ? (String) k47VarA2.c : null, p07Var), str, o2bVar.b() == 2, z);
                        }
                    }
                }
            }
            if (j3aVar != null) {
                arrayList.add(j3aVar);
            }
        }
        return arrayList;
    }
}
