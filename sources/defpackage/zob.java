package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zob extends jy6 {
    final /* synthetic */ apb this$0;

    public zob(apb apbVar) {
        this.this$0 = apbVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pa7.C(i, this.this$0.f);
        int i2 = i * 2;
        Object obj = this.this$0.e[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.this$0.e[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.this$0.f;
    }

    @Override // defpackage.jy6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }
}
