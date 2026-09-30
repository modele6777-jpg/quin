package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a1e implements Map.Entry, bn7 {
    public final Object a;
    public Object b;
    public final /* synthetic */ b1e c;

    public a1e(b1e b1eVar) {
        this.c = b1eVar;
        Map.Entry entry = b1eVar.d;
        entry.getClass();
        this.a = entry.getKey();
        Map.Entry entry2 = b1eVar.d;
        entry2.getClass();
        this.b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        b1e b1eVar = this.c;
        lsd lsdVar = b1eVar.a;
        if (lsdVar.e().d != b1eVar.c) {
            qc0.e();
            return null;
        }
        Object obj2 = this.b;
        lsdVar.put(this.a, obj);
        this.b = obj;
        return obj2;
    }
}
