package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class v61 extends t61 {
    private static final long serialVersionUID = 1;
    protected final byte[] bytes;

    public v61(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }

    @Override // defpackage.y61
    public byte a(int i) {
        return this.bytes[i];
    }

    @Override // defpackage.y61
    public byte d(int i) {
        return this.bytes[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y61) || size() != ((y61) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof v61)) {
            return obj.equals(this);
        }
        v61 v61Var = (v61) obj;
        int iE = e();
        int iE2 = v61Var.e();
        if (iE != 0 && iE2 != 0 && iE != iE2) {
            return false;
        }
        int size = size();
        if (size > v61Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > v61Var.size()) {
            StringBuilder sbN = ub3.n(size, "Ran off end of other: 0, ", ", ");
            sbN.append(v61Var.size());
            throw new IllegalArgumentException(sbN.toString());
        }
        byte[] bArr = this.bytes;
        byte[] bArr2 = v61Var.bytes;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = v61Var.g();
        while (iG2 < iG) {
            if (bArr[iG2] != bArr2[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    @Override // defpackage.y61
    public int size() {
        return this.bytes.length;
    }
}
