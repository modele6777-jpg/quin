package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kya extends u56 implements wt8 {
    public static final kya a;
    public static final gl7 b = new gl7(5);
    private List<iya> argument_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final z61 unknownFields;

    static {
        kya kyaVar = new kya();
        a = kyaVar;
        kyaVar.id_ = 0;
        kyaVar.argument_ = Collections.EMPTY_LIST;
    }

    public kya(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.id_ = 0;
        this.argument_ = Collections.EMPTY_LIST;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = g72Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = g72Var.k();
                            } else if (iN == 18) {
                                if ((c & 2) != 2) {
                                    this.argument_ = new ArrayList();
                                    c = 2;
                                }
                                this.argument_.add((iya) g72Var.g(iya.b, o85Var));
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
                if ((c & 2) == 2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
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
        if ((c & 2) == 2) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
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
        if (!r()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            if (!this.argument_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        jya jyaVar = new jya(0);
        jyaVar.d = Collections.EMPTY_LIST;
        jyaVar.l(this);
        return jyaVar;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.id_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            p90Var.j0(2, this.argument_.get(i));
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.id_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iO += p90.q(2, this.argument_.get(i2));
        }
        int size = this.unknownFields.size() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        jya jyaVar = new jya(0);
        jyaVar.d = Collections.EMPTY_LIST;
        return jyaVar;
    }

    public final int o() {
        return this.argument_.size();
    }

    public final List p() {
        return this.argument_;
    }

    public final int q() {
        return this.id_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) == 1;
    }

    public kya() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public kya(jya jyaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = jyaVar.a;
    }
}
