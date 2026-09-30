package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dog extends uog {
    public final transient int e;
    public final transient int f;
    final /* synthetic */ uog zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dog(uog uogVar, int i, int i2) {
        super(0);
        this.zzc = uogVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.olg
    public final Object[] d() {
        return this.zzc.d();
    }

    @Override // defpackage.olg
    public final int e() {
        return this.zzc.e() + this.e;
    }

    @Override // defpackage.olg
    public final int g() {
        return this.zzc.e() + this.e + this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tgc.n(i, this.f);
        return this.zzc.get(i + this.e);
    }

    @Override // defpackage.uog, java.util.List
    /* JADX INFO: renamed from: n */
    public final uog subList(int i, int i2) {
        tgc.o(i, i2, this.f);
        uog uogVar = this.zzc;
        int i3 = this.e;
        return uogVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
