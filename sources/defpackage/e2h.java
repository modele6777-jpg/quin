package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e2h extends r2h {
    public final x0h a;

    public e2h(x0h x0hVar) {
        this.a = x0hVar;
    }

    @Override // defpackage.r2h
    public final int a() {
        return r2h.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r2h r2hVar = (r2h) obj;
        int iA = r2hVar.a();
        int iD = r2h.d((byte) 64);
        if (iD != iA) {
            return iD - r2hVar.a();
        }
        x0h x0hVar = ((e2h) r2hVar).a;
        x0h x0hVar2 = this.a;
        byte[] bArr = x0hVar2.zza;
        int length = bArr.length;
        byte[] bArr2 = x0hVar.zza;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return g0h.a.compare(x0hVar2.m(), x0hVar.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e2h.class == obj.getClass()) {
            return this.a.equals(((e2h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(r2h.d((byte) 64)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        izg izgVar;
        int i;
        boolean z;
        mzg mzgVar = pzg.d;
        pzg mzgVar2 = mzgVar.c;
        if (mzgVar2 == null) {
            izg izgVar2 = mzgVar.a;
            char[] cArr = izgVar2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    izgVar = izgVar2;
                    break;
                }
                char c = cArr[i2];
                if (c >= 'a' && c <= 'z') {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i4 = 0; i4 < cArr.length; i4++) {
                            char c3 = cArr[i4];
                            if (c3 >= 97 && c3 <= 122) {
                                c3 ^= 32;
                            }
                            cArr2[i4] = (char) c3;
                        }
                        izgVar = new izg(izgVar2.a.concat(".upperCase()"), cArr2);
                        byte[] bArr = izgVar.g;
                        if (!izgVar2.h || izgVar.h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    qc0.p(q3c.s("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                bArrCopyOf[i5] = b;
                            }
                        }
                        izgVar = new izg(izgVar.a.concat(".ignoreCase()"), izgVar.b, bArrCopyOf, true);
                        break;
                    }
                    qc0.p("Cannot call upperCase() on a mixed-case alphabet");
                    return null;
                }
                i2++;
            }
            mzgVar2 = izgVar == izgVar2 ? mzgVar : new mzg(izgVar);
            mzgVar.c = mzgVar2;
        }
        byte[] bArrM = this.a.m();
        return ib8.j("h'", mzgVar2.c(bArrM, bArrM.length), "'");
    }
}
