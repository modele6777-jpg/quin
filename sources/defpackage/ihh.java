package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ihh extends ckg {
    public final mxb b;
    public final mxb c;
    public final int[] d;
    public final int e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public ihh(mxb mxbVar, mxb mxbVar2) {
        this.b = mxbVar;
        this.c = mxbVar2;
        int iM = mxbVar2.m();
        if (!(iM <= 28)) {
            qc0.j("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iM];
        this.d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iM) {
            ngh nghVarD = d(i);
            long j2 = nghVarD.e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (nghVarD.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = nghVarD.c ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.e = i2;
    }

    @Override // defpackage.ckg
    public final void a(fhh fhhVar, ahh ahhVar) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            ngh nghVarD = d(i2 & 31);
            if (nghVarD.c) {
                fhhVar.b(nghVarD, new hhh(this, nghVarD, i2), ahhVar);
            } else {
                mxb mxbVar = this.b;
                int iM = mxbVar.m();
                if (i2 >= iM) {
                    mxbVar = this.c;
                    i2 -= iM;
                }
                fhhVar.a(nghVarD, nghVarD.b.cast(mxbVar.q(i2)), ahhVar);
            }
        }
    }

    @Override // defpackage.ckg
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ckg
    public final Set c() {
        return new ed0(5, this);
    }

    public final ngh d(int i) {
        mxb mxbVar = this.b;
        int iM = mxbVar.m();
        return i >= iM ? this.c.o(i - iM) : mxbVar.o(i);
    }
}
