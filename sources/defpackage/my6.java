package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class my6 implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object keys;
    private final Object values;

    public my6(ny6 ny6Var) {
        int i = ((dpb) ny6Var).f;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        gff it = ny6Var.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.keys = objArr;
        this.values = objArr2;
    }

    public final Object readResolve() {
        Object obj = this.keys;
        if (obj instanceof ry6) {
            ry6 ry6Var = (ry6) obj;
            ay6 ay6Var = (ay6) this.values;
            os osVar = new os(ry6Var.size());
            gff it = ry6Var.iterator();
            gff it2 = ay6Var.iterator();
            while (it.hasNext()) {
                osVar.q(it.next(), it2.next());
            }
            return osVar.e(true);
        }
        Object[] objArr = (Object[]) obj;
        Object[] objArr2 = (Object[]) this.values;
        os osVar2 = new os(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            osVar2.q(objArr[i], objArr2[i]);
        }
        return osVar2.e(true);
    }
}
