package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class a9a extends x8a {
    public final y8a e;
    public Object f;
    public boolean g;
    public int v;

    public a9a(y8a y8aVar, q4f[] q4fVarArr) {
        super(y8aVar.c, q4fVarArr);
        this.e = y8aVar;
        this.v = y8aVar.e;
    }

    public final void f(int i, o4f o4fVar, Object obj, int i2, int i3, boolean z) {
        int i4;
        q4f[] q4fVarArr = (q4f[]) this.d;
        int i5 = i2 * 5;
        if (i5 <= 30) {
            int iF = 1 << jrb.f(i, i5);
            if (!o4fVar.i(iF)) {
                int iT = o4fVar.t(iF);
                o4f o4fVarS = o4fVar.s(iT);
                q4f q4fVar = q4fVarArr[i2];
                Object[] objArr = o4fVar.d;
                int iBitCount = Integer.bitCount(o4fVar.a) * 2;
                q4fVar.getClass();
                objArr.getClass();
                q4fVar.b = objArr;
                q4fVar.c = iBitCount;
                q4fVar.d = iT;
                f(i, o4fVarS, obj, i2 + 1, i3, z);
                return;
            }
            int iF2 = o4fVar.f(iF);
            if (iF == (z ? 1 << jrb.f(i3, i5) : 0) && i2 < (i4 = this.b)) {
                q4f q4fVar2 = q4fVarArr[i4];
                Object[] objArr2 = o4fVar.d;
                Object[] objArr3 = {objArr2[iF2], objArr2[iF2 + 1]};
                q4fVar2.getClass();
                q4fVar2.b = objArr3;
                q4fVar2.c = 2;
                q4fVar2.d = 0;
                return;
            }
            q4f q4fVar3 = q4fVarArr[i2];
            Object[] objArr4 = o4fVar.d;
            int iBitCount2 = Integer.bitCount(o4fVar.a) * 2;
            q4fVar3.getClass();
            objArr4.getClass();
            q4fVar3.b = objArr4;
            q4fVar3.c = iBitCount2;
            q4fVar3.d = iF2;
            this.b = i2;
            return;
        }
        q4f q4fVar4 = q4fVarArr[i2];
        Object[] objArr5 = o4fVar.d;
        int length = objArr5.length;
        q4fVar4.getClass();
        q4fVar4.b = objArr5;
        q4fVar4.c = length;
        q4fVar4.d = 0;
        while (true) {
            q4f q4fVar5 = q4fVarArr[i2];
            if (pa7.t(q4fVar5.b[q4fVar5.d], obj)) {
                this.b = i2;
                return;
            } else {
                q4fVarArr[i2].d += 2;
            }
        }
    }

    @Override // defpackage.x8a, java.util.Iterator
    public final Object next() {
        if (this.e.e != this.v) {
            qc0.e();
            return null;
        }
        if (!this.c) {
            s8f.c();
            return null;
        }
        q4f q4fVar = ((q4f[]) this.d)[this.b];
        this.f = q4fVar.b[q4fVar.d];
        this.g = true;
        return super.next();
    }

    @Override // defpackage.x8a, java.util.Iterator
    public final void remove() {
        a9a a9aVar;
        if (!this.g) {
            r3.l();
            return;
        }
        boolean z = this.c;
        y8a y8aVar = this.e;
        if (!z) {
            a9aVar = this;
            z7f.q(y8aVar).remove(a9aVar.f);
        } else {
            if (!z) {
                s8f.c();
                return;
            }
            q4f q4fVar = ((q4f[]) this.d)[this.b];
            Object obj = q4fVar.b[q4fVar.d];
            z7f.q(y8aVar).remove(this.f);
            int iHashCode = obj != null ? obj.hashCode() : 0;
            o4f o4fVar = y8aVar.c;
            Object obj2 = this.f;
            a9aVar = this;
            a9aVar.f(iHashCode, o4fVar, obj, 0, obj2 != null ? obj2.hashCode() : 0, true);
        }
        a9aVar.f = null;
        a9aVar.g = false;
        a9aVar.v = y8aVar.e;
    }
}
