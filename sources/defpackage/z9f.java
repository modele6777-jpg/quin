package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z9f extends i77 {
    public final /* synthetic */ int b = 0;

    public z9f(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.bl2
    public final tt7 a(w09 w09Var) {
        tjd tjdVarS;
        tjd tjdVarS2;
        tjd tjdVarS3;
        tjd tjdVarS4;
        int i = this.b;
        qy4 qy4Var = qy4.M0;
        w09Var.getClass();
        switch (i) {
            case 0:
                u09 u09VarP = od4.p(w09Var, syd.S);
                return (u09VarP == null || (tjdVarS = u09VarP.S()) == null) ? sy4.c(qy4Var, "UByte") : tjdVarS;
            case 1:
                u09 u09VarP2 = od4.p(w09Var, syd.U);
                return (u09VarP2 == null || (tjdVarS2 = u09VarP2.S()) == null) ? sy4.c(qy4Var, "UInt") : tjdVarS2;
            case 2:
                u09 u09VarP3 = od4.p(w09Var, syd.V);
                return (u09VarP3 == null || (tjdVarS3 = u09VarP3.S()) == null) ? sy4.c(qy4Var, "ULong") : tjdVarS3;
            default:
                u09 u09VarP4 = od4.p(w09Var, syd.T);
                return (u09VarP4 == null || (tjdVarS4 = u09VarP4.S()) == null) ? sy4.c(qy4Var, "UShort") : tjdVarS4;
        }
    }

    @Override // defpackage.bl2
    public final String toString() {
        int i = this.b;
        Object obj = this.a;
        switch (i) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public z9f(short s) {
        super(Short.valueOf(s));
    }

    public z9f(int i) {
        super(Integer.valueOf(i));
    }

    public z9f(long j) {
        super(Long.valueOf(j));
    }
}
