package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cgh extends mxb {
    public Object[] a;
    public int b;

    @Override // defpackage.mxb
    public final int m() {
        return this.b;
    }

    @Override // defpackage.mxb
    public final ngh o(int i) {
        if (i < this.b) {
            return (ngh) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.mxb
    public final Object q(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.mxb
    public final Object r(ngh nghVar) {
        int iT = t(nghVar);
        if (iT == -1) {
            return null;
        }
        return nghVar.b.cast(this.a[iT + iT + 1]);
    }

    public final void s(ngh nghVar, Object obj) {
        int iT;
        if (!nghVar.c && (iT = t(nghVar)) != -1) {
            this.a[iT + iT + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if (i + i > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + length);
            this.a = objArrCopyOf;
        }
        int i2 = this.b;
        int i3 = i2 + i2;
        objArrCopyOf[i3] = nghVar;
        objArrCopyOf[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final int t(ngh nghVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(nghVar)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(o(i));
            sb.append("': ");
            sb.append(q(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
