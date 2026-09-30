package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yya extends q56 {
    public static final yya a;
    public static final gl7 b = new gl7(13);
    private List<kya> annotation_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final z61 unknownFields;

    static {
        yya yyaVar = new yya();
        a = yyaVar;
        yyaVar.name_ = 0;
        yyaVar.annotation_ = Collections.EMPTY_LIST;
    }

    public yya(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.name_ = 0;
        this.annotation_ = Collections.EMPTY_LIST;
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
                                this.name_ = g72Var.k();
                            } else if (iN == 18) {
                                if ((c & 2) != 2) {
                                    this.annotation_ = new ArrayList();
                                    c = 2;
                                }
                                this.annotation_.add((kya) g72Var.g(kya.b, o85Var));
                            } else if (!r(g72Var, p90VarK, o85Var, iN)) {
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
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                try {
                    p90VarK.b0();
                } catch (IOException unused) {
                } finally {
                    this.unknownFields = x61Var.l();
                }
                q();
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
        q();
    }

    public final int A() {
        return this.name_;
    }

    public final boolean B() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // defpackage.wt8
    public final ut8 a() {
        return a;
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
        for (int i = 0; i < this.annotation_.size(); i++) {
            if (!this.annotation_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (k()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        xya xyaVar = new xya();
        xyaVar.f = Collections.EMPTY_LIST;
        xyaVar.l(this);
        return xyaVar;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.name_);
        }
        for (int i = 0; i < this.annotation_.size(); i++) {
            p90Var.j0(2, this.annotation_.get(i));
        }
        fz3Var.y(200, p90Var);
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            iO += p90.q(2, this.annotation_.get(i2));
        }
        int size = this.unknownFields.size() + l() + iO;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        xya xyaVar = new xya();
        xyaVar.f = Collections.EMPTY_LIST;
        return xyaVar;
    }

    public final List z() {
        return this.annotation_;
    }

    public yya() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public yya(xya xyaVar) {
        super(xyaVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = xyaVar.a;
    }
}
