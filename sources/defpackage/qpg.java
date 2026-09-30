package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qpg implements vqg, oqg {
    public final String a;
    public final HashMap b = new HashMap();

    public qpg(String str) {
        this.a = str;
    }

    @Override // defpackage.vqg
    public final Boolean a() {
        return Boolean.TRUE;
    }

    public abstract vqg b(kxa kxaVar, List list);

    @Override // defpackage.vqg
    public final Iterator c() {
        return new iqg(this.b.keySet().iterator());
    }

    @Override // defpackage.vqg
    public final String d() {
        return this.a;
    }

    @Override // defpackage.oqg
    public final vqg e(String str) {
        HashMap map = this.b;
        return map.containsKey(str) ? (vqg) map.get(str) : vqg.v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpg)) {
            return false;
        }
        qpg qpgVar = (qpg) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(qpgVar.a);
        }
        return false;
    }

    @Override // defpackage.vqg
    public final vqg g(String str, kxa kxaVar, ArrayList arrayList) {
        return "toString".equals(str) ? new erg(this.a) : oqg.f(this, new erg(str), kxaVar, arrayList);
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.oqg
    public final void i(String str, vqg vqgVar) {
        HashMap map = this.b;
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
        return this.b.containsKey(str);
    }

    @Override // defpackage.vqg
    public vqg m() {
        return this;
    }
}
