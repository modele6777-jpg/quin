package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class w61 extends u61 {
    private static final long serialVersionUID = 1;
    protected final byte[] bytes;

    public w61(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    @Override // defpackage.b71
    public byte a(int i) {
        return this.bytes[i];
    }

    @Override // defpackage.b71
    public void e(byte[] bArr, int i) {
        System.arraycopy(this.bytes, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b71) || size() != ((b71) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof w61)) {
            return obj.equals(this);
        }
        w61 w61Var = (w61) obj;
        int i = i();
        int i2 = w61Var.i();
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > w61Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > w61Var.size()) {
            StringBuilder sbN = ub3.n(size, "Ran off end of other: 0, ", ", ");
            sbN.append(w61Var.size());
            throw new IllegalArgumentException(sbN.toString());
        }
        byte[] bArr = this.bytes;
        byte[] bArr2 = w61Var.bytes;
        int iJ = j() + size;
        int iJ2 = j();
        int iJ3 = w61Var.j();
        while (iJ2 < iJ) {
            if (bArr[iJ2] != bArr2[iJ3]) {
                return false;
            }
            iJ2++;
            iJ3++;
        }
        return true;
    }

    @Override // defpackage.b71
    public byte g(int i) {
        return this.bytes[i];
    }

    public int j() {
        return 0;
    }

    @Override // defpackage.b71
    public int size() {
        return this.bytes.length;
    }
}
