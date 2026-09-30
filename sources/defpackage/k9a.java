package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k9a extends a5 implements sy6 {
    public final /* synthetic */ int a;
    public final w8a b;

    public /* synthetic */ k9a(w8a w8aVar, int i) {
        this.a = i;
        this.b = w8aVar;
    }

    @Override // defpackage.d1
    public final int c() {
        int i = this.a;
        w8a w8aVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return w8aVar.b;
    }

    @Override // defpackage.d1, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        w8a w8aVar = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = w8aVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && w8aVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return w8aVar.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        w8a w8aVar = this.b;
        switch (i) {
            case 0:
                p4f p4fVar = w8aVar.a;
                q4f[] q4fVarArr = new q4f[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    q4fVarArr[i2] = new s4f(0);
                }
                return new m9a(p4fVar, q4fVarArr);
            default:
                p4f p4fVar2 = w8aVar.a;
                q4f[] q4fVarArr2 = new q4f[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    q4fVarArr2[i3] = new s4f(1);
                }
                return new m9a(p4fVar2, q4fVarArr2);
        }
    }
}
