package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kh7 extends hkg {
    public final a80 l;
    public final hzc m;

    public kh7(a80 a80Var, wg7 wg7Var) {
        this.l = a80Var;
        this.m = wg7Var.b;
    }

    @Override // defpackage.hkg, defpackage.om3
    public final byte A() {
        u9f u9fVar;
        a80 a80Var = this.l;
        String strL = a80Var.l();
        try {
            strL.getClass();
            aaf aafVarK = z8c.k(strL);
            if (aafVarK != null) {
                int i = aafVarK.a;
                u9fVar = Integer.compareUnsigned(i, 255) > 0 ? null : new u9f((byte) i);
            }
            if (u9fVar != null) {
                return u9fVar.a;
            }
            c5e.w(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            a80.n(a80Var, ks0.g('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hkg, defpackage.om3
    public final short B() {
        maf mafVar;
        a80 a80Var = this.l;
        String strL = a80Var.l();
        try {
            strL.getClass();
            aaf aafVarK = z8c.k(strL);
            if (aafVarK != null) {
                int i = aafVarK.a;
                mafVar = Integer.compareUnsigned(i, 65535) > 0 ? null : new maf((short) i);
            }
            if (mafVar != null) {
                return mafVar.a;
            }
            c5e.w(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            a80.n(a80Var, ks0.g('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.om3, defpackage.zf2
    public final hzc a() {
        return this.m;
    }

    @Override // defpackage.zf2
    public final int j(nyc nycVar) {
        nycVar.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.hkg, defpackage.om3
    public final int p() {
        a80 a80Var = this.l;
        String strL = a80Var.l();
        try {
            strL.getClass();
            aaf aafVarK = z8c.k(strL);
            if (aafVarK != null) {
                return aafVarK.a;
            }
            c5e.w(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            a80.n(a80Var, ks0.g('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hkg, defpackage.om3
    public final long w() {
        a80 a80Var = this.l;
        String strL = a80Var.l();
        try {
            strL.getClass();
            faf fafVarL = z8c.l(strL);
            if (fafVarL != null) {
                return fafVarL.a;
            }
            c5e.w(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            a80.n(a80Var, ks0.g('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }
}
