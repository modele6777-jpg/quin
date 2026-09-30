package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0b extends u56 implements wt8 {
    public static final i0b a;
    public static final gl7 b = new gl7(29);
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<h0b> requirement_;
    private final z61 unknownFields;

    static {
        i0b i0bVar = new i0b();
        a = i0bVar;
        i0bVar.requirement_ = Collections.EMPTY_LIST;
    }

    public i0b(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.requirement_ = Collections.EMPTY_LIST;
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
                                this.requirement_ = new ArrayList();
                                z2 = true;
                            }
                            this.requirement_.add((h0b) g72Var.g(h0b.b, o85Var));
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
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
            this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
        rya ryaVar = new rya(2);
        ryaVar.d = Collections.EMPTY_LIST;
        ryaVar.q(this);
        return ryaVar;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        for (int i = 0; i < this.requirement_.size(); i++) {
            p90Var.j0(1, this.requirement_.get(i));
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
        for (int i2 = 0; i2 < this.requirement_.size(); i2++) {
            iQ += p90.q(1, this.requirement_.get(i2));
        }
        int size = this.unknownFields.size() + iQ;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        rya ryaVar = new rya(2);
        ryaVar.d = Collections.EMPTY_LIST;
        return ryaVar;
    }

    public final int m() {
        return this.requirement_.size();
    }

    public final List n() {
        return this.requirement_;
    }

    public i0b() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public i0b(rya ryaVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ryaVar.a;
    }
}
