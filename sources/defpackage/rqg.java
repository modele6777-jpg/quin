package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class rqg implements vqg, oqg {
    public final HashMap a = new HashMap();

    @Override // defpackage.vqg
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // defpackage.vqg
    public final Iterator c() {
        return new iqg(this.a.keySet().iterator());
    }

    @Override // defpackage.vqg
    public final String d() {
        return "[object Object]";
    }

    @Override // defpackage.oqg
    public final vqg e(String str) {
        HashMap map = this.a;
        return map.containsKey(str) ? (vqg) map.get(str) : vqg.v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rqg) {
            return this.a.equals(((rqg) obj).a);
        }
        return false;
    }

    @Override // defpackage.vqg
    public vqg g(String str, kxa kxaVar, ArrayList arrayList) {
        return "toString".equals(str) ? new erg(toString()) : oqg.f(this, new erg(str), kxaVar, arrayList);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.oqg
    public final void i(String str, vqg vqgVar) {
        HashMap map = this.a;
        if (vqgVar == null) {
            map.remove(str);
        } else {
            map.put(str, vqgVar);
        }
    }

    @Override // defpackage.vqg
    public final Double j() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.oqg
    public final boolean k(String str) {
        return this.a.containsKey(str);
    }

    @Override // defpackage.vqg
    public final vqg m() {
        rqg rqgVar = new rqg();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof oqg;
            HashMap map = rqgVar.a;
            if (z) {
                map.put((String) entry.getKey(), (vqg) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((vqg) entry.getValue()).m());
            }
        }
        return rqgVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
