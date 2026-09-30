package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class b9a extends x8a {
    public final z8a e;
    public Object f;
    public boolean g;
    public int v;

    public b9a(z8a z8aVar, q4f[] q4fVarArr) {
        super(z8aVar.c, q4fVarArr);
        this.e = z8aVar;
        this.v = z8aVar.e;
    }

    public final void f(int i, p4f p4fVar, Object obj, int i2) {
        q4f[] q4fVarArr = (q4f[]) this.d;
        int i3 = i2 * 5;
        if (i3 <= 30) {
            int i4 = 1 << rrb.i(i, i3);
            if (p4fVar.h(i4)) {
                q4fVarArr[i2].b(p4fVar.d, Integer.bitCount(p4fVar.a) * 2, p4fVar.f(i4));
                this.b = i2;
                return;
            } else {
                int iT = p4fVar.t(i4);
                p4f p4fVarS = p4fVar.s(iT);
                q4fVarArr[i2].b(p4fVar.d, Integer.bitCount(p4fVar.a) * 2, iT);
                f(i, p4fVarS, obj, i2 + 1);
                return;
            }
        }
        q4f q4fVar = q4fVarArr[i2];
        Object[] objArr = p4fVar.d;
        q4fVar.b(objArr, objArr.length, 0);
        while (true) {
            q4f q4fVar2 = q4fVarArr[i2];
            if (pa7.t(q4fVar2.b[q4fVar2.d], obj)) {
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
        if (!this.g) {
            r3.l();
            return;
        }
        boolean z = this.c;
        z8a z8aVar = this.e;
        if (!z) {
            z7f.q(z8aVar).remove(this.f);
        } else {
            if (!z) {
                s8f.c();
                return;
            }
            q4f q4fVar = ((q4f[]) this.d)[this.b];
            Object obj = q4fVar.b[q4fVar.d];
            z7f.q(z8aVar).remove(this.f);
            f(obj != null ? obj.hashCode() : 0, z8aVar.c, obj, 0);
        }
        this.f = null;
        this.g = false;
        this.v = z8aVar.e;
    }
}
