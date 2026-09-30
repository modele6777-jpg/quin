package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j9a extends a5 implements zx6 {
    public final /* synthetic */ int a;
    public final v8a b;

    public /* synthetic */ j9a(v8a v8aVar, int i) {
        this.a = i;
        this.b = v8aVar;
    }

    @Override // defpackage.d1
    public final int c() {
        int i = this.a;
        v8a v8aVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return v8aVar.b;
    }

    @Override // defpackage.d1, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        v8a v8aVar = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = v8aVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && v8aVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return v8aVar.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        v8a v8aVar = this.b;
        switch (i) {
            case 0:
                o4f o4fVar = v8aVar.a;
                o4fVar.getClass();
                q4f[] q4fVarArr = new q4f[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    q4fVarArr[i2] = new r4f(0);
                }
                return new l9a(o4fVar, q4fVarArr);
            default:
                o4f o4fVar2 = v8aVar.a;
                o4fVar2.getClass();
                q4f[] q4fVarArr2 = new q4f[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    q4fVarArr2[i3] = new r4f(1);
                }
                return new l9a(o4fVar2, q4fVarArr2);
        }
    }
}
