package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sya extends u56 implements wt8 {
    public static final sya a;
    public static final gl7 b = new gl7(11);
    private List<wya> effect_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final z61 unknownFields;

    static {
        sya syaVar = new sya();
        a = syaVar;
        syaVar.effect_ = Collections.EMPTY_LIST;
    }

    public sya(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.effect_ = Collections.EMPTY_LIST;
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
                            if (!z2) {
                                this.effect_ = new ArrayList();
                                z2 = true;
                            }
                            this.effect_.add((wya) g72Var.g(wya.b, o85Var));
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
                    this.effect_ = Collections.unmodifiableList(this.effect_);
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
            this.effect_ = Collections.unmodifiableList(this.effect_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
    }

    public static rya n(sya syaVar) {
        rya ryaVar = new rya(0);
        ryaVar.d = Collections.EMPTY_LIST;
        ryaVar.n(syaVar);
        return ryaVar;
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
        for (int i = 0; i < this.effect_.size(); i++) {
            if (!this.effect_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.ut8
    public final l56 c() {
        return n(this);
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        for (int i = 0; i < this.effect_.size(); i++) {
            p90Var.j0(1, this.effect_.get(i));
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iQ = 0;
        for (int i2 = 0; i2 < this.effect_.size(); i2++) {
            iQ += p90.q(1, this.effect_.get(i2));
        }
        int size = this.unknownFields.size() + iQ;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        rya ryaVar = new rya(0);
        ryaVar.d = Collections.EMPTY_LIST;
        return ryaVar;
    }

    public final List m() {
        return this.effect_;
    }

    public sya() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public sya(rya ryaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ryaVar.a;
    }
}
