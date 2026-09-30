package defpackage;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ytg extends qtg {
    final /* synthetic */ ztg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytg(ztg ztgVar) {
        super(1);
        this.zza = ztgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(this.zza.zza.c.v.get(i), this.zza.zza.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.d.size();
    }
}
