package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v9a extends a5 implements zx6 {
    public final /* synthetic */ int a;
    public final r9a b;

    public /* synthetic */ v9a(r9a r9aVar, int i) {
        this.a = i;
        this.b = r9aVar;
    }

    @Override // defpackage.d1
    public final int c() {
        int i = this.a;
        r9a r9aVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return r9aVar.c.d();
    }

    @Override // defpackage.d1, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        r9a r9aVar = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = r9aVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null) {
                        if (r9aVar.c.containsKey(entry.getKey())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return r9aVar.c.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        r9a r9aVar = this.b;
        switch (i) {
            case 0:
                return new w9a(r9aVar, 0);
            default:
                return new w9a(r9aVar, 1);
        }
    }
}
