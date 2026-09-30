package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0b extends u56 implements wt8 {
    public static final b0b a;
    public static final gl7 b = new gl7(26);
    private int bitField0_;
    private int firstNullable_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<vza> type_;
    private final z61 unknownFields;

    static {
        b0b b0bVar = new b0b();
        a = b0bVar;
        b0bVar.type_ = Collections.EMPTY_LIST;
        b0bVar.firstNullable_ = -1;
    }

    public b0b(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.type_ = Collections.EMPTY_LIST;
        this.firstNullable_ = -1;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iN = g72Var.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z2) {
                                    this.type_ = new ArrayList();
                                    z2 = true;
                                }
                                this.type_.add((vza) g72Var.g(vza.b, o85Var));
                            } else if (iN == 16) {
                                this.bitField0_ |= 1;
                                this.firstNullable_ = g72Var.k();
                            } else if (!g72Var.q(iN, p90VarK)) {
                            }
                        }
                        z = true;
                    } catch (ab7 e) {
                        e.b(this);
                        throw e;
                    }
                } catch (IOException e2) {
                    ab7 ab7Var = new ab7(e2.getMessage());
                    ab7Var.b(this);
                    throw ab7Var;
                }
            } catch (Throwable th) {
                if (z2) {
                    this.type_ = Collections.unmodifiableList(this.type_);
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
            this.type_ = Collections.unmodifiableList(this.type_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
    }

    public static jya r(b0b b0bVar) {
        jya jyaVar = new jya(1);
        jyaVar.d = Collections.EMPTY_LIST;
        jyaVar.e = -1;
        jyaVar.m(b0bVar);
        return jyaVar;
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
        for (int i = 0; i < this.type_.size(); i++) {
            if (!this.type_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        return r(this);
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        for (int i = 0; i < this.type_.size(); i++) {
            p90Var.j0(1, this.type_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(2, this.firstNullable_);
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = 0;
        for (int i2 = 0; i2 < this.type_.size(); i2++) {
            iO += p90.q(1, this.type_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iO += p90.o(2, this.firstNullable_);
        }
        int size = this.unknownFields.size() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        jya jyaVar = new jya(1);
        jyaVar.d = Collections.EMPTY_LIST;
        jyaVar.e = -1;
        return jyaVar;
    }

    public final int o() {
        return this.firstNullable_;
    }

    public final List p() {
        return this.type_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) == 1;
    }

    public b0b() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public b0b(jya jyaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = jyaVar.a;
    }
}
