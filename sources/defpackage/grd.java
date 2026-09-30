package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class grd implements br4 {
    public final int a;

    public grd(int i) {
        this.a = i;
    }

    @Override // defpackage.vz
    public final rsf a(y6f y6fVar) {
        return new ff8(this.a, 13);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof grd) && ((grd) obj).a == this.a;
    }

    @Override // defpackage.ze5
    public final ssf f() {
        return new ff8(this.a, 13);
    }

    public final int hashCode() {
        return this.a;
    }
}
