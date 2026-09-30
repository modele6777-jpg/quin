package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xsg extends mtg {
    public final transient int c;
    public final transient int d;
    final /* synthetic */ mtg zzc;

    public xsg(mtg mtgVar, int i, int i2) {
        this.zzc = mtgVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.usg
    public final int c() {
        return this.zzc.d() + this.c + this.d;
    }

    @Override // defpackage.usg
    public final int d() {
        return this.zzc.d() + this.c;
    }

    @Override // defpackage.usg
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        q1c.k(i, this.d);
        return this.zzc.get(i + this.c);
    }

    @Override // defpackage.usg
    public final Object[] i() {
        return this.zzc.i();
    }

    @Override // defpackage.mtg, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final mtg subList(int i, int i2) {
        q1c.m(i, i2, this.d);
        mtg mtgVar = this.zzc;
        int i3 = this.c;
        return mtgVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
