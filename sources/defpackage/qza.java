package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qza extends u56 implements wt8 {
    public static final qza a;
    public static final gl7 b = new gl7(21);
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private w18 string_;
    private final z61 unknownFields;

    static {
        qza qzaVar = new qza();
        a = qzaVar;
        qzaVar.string_ = t18.b;
    }

    public qza(g72 g72Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.string_ = t18.b;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            m98 m98VarF = g72Var.f();
                            if (!z2) {
                                this.string_ = new t18();
                                z2 = true;
                            }
                            this.string_.h0(m98VarF);
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
                if (z2) {
                    this.string_ = this.string_.l();
                }
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                throw th;
            }
        }
        if (z2) {
            this.string_ = this.string_.l();
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        rya ryaVar = new rya(3);
        ryaVar.d = t18.b;
        ryaVar.p(this);
        return ryaVar;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        for (int i = 0; i < this.string_.size(); i++) {
            z61 z61VarG0 = this.string_.g0(i);
            p90Var.s0(1, 2);
            p90Var.q0(z61VarG0.size());
            p90Var.m0(z61VarG0);
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int size = 0;
        while (true) {
            int size2 = this.string_.size();
            w18 w18Var = this.string_;
            if (i2 >= size2) {
                int size3 = this.unknownFields.size() + w18Var.size() + size;
                this.memoizedSerializedSize = size3;
                return size3;
            }
            z61 z61VarG0 = w18Var.g0(i2);
            size += z61VarG0.size() + p90.s(z61VarG0.size());
            i2++;
        }
    }

    @Override // defpackage.ut8
    public final l56 g() {
        rya ryaVar = new rya(3);
        ryaVar.d = t18.b;
        return ryaVar;
    }

    public final String m(int i) {
        return (String) this.string_.get(i);
    }

    public qza() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public qza(rya ryaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ryaVar.a;
    }
}
