package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ptg extends qtg {
    public final transient int e;
    public final transient int f;
    final /* synthetic */ qtg zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptg(qtg qtgVar, int i, int i2) {
        super(1);
        this.zzc = qtgVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.olg
    public final int c() {
        return this.zzc.e() + this.e + this.f;
    }

    @Override // defpackage.olg
    public final int e() {
        return this.zzc.e() + this.e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        v2c.B(i, this.f);
        return this.zzc.get(i + this.e);
    }

    @Override // defpackage.olg
    public final Object[] j() {
        return this.zzc.j();
    }

    @Override // defpackage.qtg, java.util.List
    /* JADX INFO: renamed from: n */
    public final qtg subList(int i, int i2) {
        v2c.C(i, i2, this.f);
        qtg qtgVar = this.zzc;
        int i3 = this.e;
        return qtgVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
