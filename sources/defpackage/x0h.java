package defpackage;

import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class x0h extends d1h {
    protected final byte[] zza;

    public x0h(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // defpackage.d1h
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // defpackage.d1h
    public byte c(int i) {
        return this.zza[i];
    }

    @Override // defpackage.d1h
    public int d() {
        return this.zza.length;
    }

    @Override // defpackage.d1h
    public void e(byte[] bArr, int i) {
        System.arraycopy(this.zza, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d1h) && d() == ((d1h) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof x0h)) {
                return obj.equals(this);
            }
            x0h x0hVar = (x0h) obj;
            int iJ = j();
            int iJ2 = x0hVar.j();
            if (iJ == 0 || iJ2 == 0 || iJ == iJ2) {
                int iD = d();
                if (iD > x0hVar.d()) {
                    throw new IllegalArgumentException("Length too large: " + iD + d());
                }
                if (iD > x0hVar.d()) {
                    qc0.j(ks0.k("Ran off end of other: 0, ", iD, ", ", x0hVar.d()));
                    return false;
                }
                byte[] bArr = this.zza;
                byte[] bArr2 = x0hVar.zza;
                int iN = n() + iD;
                int iN2 = n();
                int iN3 = x0hVar.n();
                while (iN2 < iN) {
                    if (bArr[iN2] == bArr2[iN3]) {
                        iN2++;
                        iN3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.d1h
    public final x0h g(int i, int i2) {
        int i3 = d1h.i(i, i2, d());
        return i3 == 0 ? d1h.a : new r0h(this.zza, n() + i, i3);
    }

    public int n() {
        return 0;
    }

    public final ByteArrayInputStream o() {
        return new ByteArrayInputStream(this.zza, n(), d());
    }
}
