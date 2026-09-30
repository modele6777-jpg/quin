package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tza extends u56 implements wt8 {
    public static final tza a;
    public static final gl7 b = new gl7(23);
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private sza projection_;
    private int typeId_;
    private vza type_;
    private final z61 unknownFields;

    static {
        tza tzaVar = new tza();
        a = tzaVar;
        tzaVar.projection_ = sza.INV;
        tzaVar.type_ = vza.a;
        tzaVar.typeId_ = 0;
    }

    public tza(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        sza szaVar = sza.INV;
        this.projection_ = szaVar;
        this.type_ = vza.a;
        boolean z = false;
        this.typeId_ = 0;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        uza uzaVarR0 = null;
                        sza szaVar2 = null;
                        if (iN == 8) {
                            int iK = g72Var.k();
                            if (iK == 0) {
                                szaVar2 = sza.IN;
                            } else if (iK == 1) {
                                szaVar2 = sza.OUT;
                            } else if (iK == 2) {
                                szaVar2 = szaVar;
                            } else if (iK == 3) {
                                szaVar2 = sza.STAR;
                            }
                            if (szaVar2 == null) {
                                p90VarK.q0(iN);
                                p90VarK.q0(iK);
                            } else {
                                this.bitField0_ |= 1;
                                this.projection_ = szaVar2;
                            }
                        } else if (iN == 18) {
                            if ((this.bitField0_ & 2) == 2) {
                                vza vzaVar = this.type_;
                                vzaVar.getClass();
                                uzaVarR0 = vza.r0(vzaVar);
                            }
                            vza vzaVar2 = (vza) g72Var.g(vza.b, o85Var);
                            this.type_ = vzaVar2;
                            if (uzaVarR0 != null) {
                                uzaVarR0.m(vzaVar2);
                                this.type_ = uzaVarR0.k();
                            }
                            this.bitField0_ |= 2;
                        } else if (iN == 24) {
                            this.bitField0_ |= 4;
                            this.typeId_ = g72Var.k();
                        } else if (!g72Var.q(iN, p90VarK)) {
                        }
                    }
                    z = true;
                } catch (ab7 e) {
                    e.b(this);
                    throw e;
                } catch (IOException e2) {
                    ab7 ab7Var = new ab7(e2.getMessage());
                    ab7Var.b(this);
                    throw ab7Var;
                }
            } catch (Throwable th) {
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                throw th;
            }
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
    }

    @Override // defpackage.wt8
    public final boolean b() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!s() || this.type_.b()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        rza rzaVar = new rza();
        rzaVar.c = sza.INV;
        rzaVar.d = vza.a;
        rzaVar.k(this);
        return rzaVar;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.g0(1, this.projection_.a());
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.j0(2, this.type_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.h0(3, this.typeId_);
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iN = (this.bitField0_ & 1) == 1 ? p90.n(1, this.projection_.a()) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iN += p90.q(2, this.type_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iN += p90.o(3, this.typeId_);
        }
        int size = this.unknownFields.size() + iN;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        rza rzaVar = new rza();
        rzaVar.c = sza.INV;
        rzaVar.d = vza.a;
        return rzaVar;
    }

    public final sza o() {
        return this.projection_;
    }

    public final vza p() {
        return this.type_;
    }

    public final int q() {
        return this.typeId_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) == 4;
    }

    public tza() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public tza(rza rzaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = rzaVar.a;
    }
}
