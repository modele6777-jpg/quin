package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kx4 extends gia {
    public final ryc l;
    public final ace m;

    public kx4(String str, int i) {
        super(str, null, i);
        this.l = ryc.c;
        this.m = new ace(new m53(i, str, this));
    }

    @Override // defpackage.gia
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nyc)) {
            return false;
        }
        nyc nycVar = (nyc) obj;
        return nycVar.g() == ryc.c && this.a.equals(nycVar.a()) && pa7.t(hkg.Y(this), hkg.Y(nycVar));
    }

    @Override // defpackage.gia, defpackage.nyc
    public final iec g() {
        return this.l;
    }

    @Override // defpackage.gia
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        l2 l2Var = new l2(this);
        int iHashCode2 = 1;
        while (l2Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) l2Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.gia, defpackage.nyc
    public final nyc i(int i) {
        return ((nyc[]) this.m.getValue())[i];
    }

    @Override // defpackage.gia
    public final String toString() {
        return s72.D0(new sd0(3, this), ", ", this.a.concat("("), ")", null, 56);
    }
}
