package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m17 extends o8f {
    public final c8f[] b;
    public final i8f[] c;
    public final boolean d;

    public m17(c8f[] c8fVarArr, i8f[] i8fVarArr, boolean z) {
        c8fVarArr.getClass();
        i8fVarArr.getClass();
        this.b = c8fVarArr;
        this.c = i8fVarArr;
        this.d = z;
    }

    @Override // defpackage.o8f
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.o8f
    public final i8f d(tt7 tt7Var) {
        y22 y22VarM = tt7Var.c0().m();
        c8f c8fVar = y22VarM instanceof c8f ? (c8f) y22VarM : null;
        if (c8fVar != null) {
            int index = c8fVar.getIndex();
            c8f[] c8fVarArr = this.b;
            if (index < c8fVarArr.length && pa7.t(c8fVarArr[index].h(), c8fVar.h())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // defpackage.o8f
    public final boolean e() {
        return this.c.length == 0;
    }
}
