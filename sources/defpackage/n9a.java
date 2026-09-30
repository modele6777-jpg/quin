package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n9a extends d1 implements zx6 {
    public final /* synthetic */ int a;
    public final r2 b;

    public /* synthetic */ n9a(r2 r2Var, int i) {
        this.a = i;
        this.b = r2Var;
    }

    @Override // defpackage.d1
    public final int c() {
        int i = this.a;
        r2 r2Var = this.b;
        switch (i) {
            case 0:
                return ((v8a) r2Var).b;
            default:
                return ((r9a) r2Var).c.d();
        }
    }

    @Override // defpackage.d1, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        r2 r2Var = this.b;
        switch (i) {
            case 0:
                return ((v8a) r2Var).containsValue(obj);
            default:
                return ((r9a) r2Var).containsValue(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        r2 r2Var = this.b;
        switch (i) {
            case 0:
                o4f o4fVar = ((v8a) r2Var).a;
                o4fVar.getClass();
                q4f[] q4fVarArr = new q4f[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    q4fVarArr[i2] = new r4f(2);
                }
                return new l9a(o4fVar, q4fVarArr);
            default:
                return new w9a((r9a) r2Var, 2);
        }
    }
}
