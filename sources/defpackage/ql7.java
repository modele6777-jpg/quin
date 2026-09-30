package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ql7 extends u56 implements wt8 {
    public static final ql7 a;
    public static final gl7 b = new gl7(3);
    private int localNameMemoizedSerializedSize;
    private List<Integer> localName_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<pl7> record_;
    private final z61 unknownFields;

    static {
        ql7 ql7Var = new ql7();
        a = ql7Var;
        List list = Collections.EMPTY_LIST;
        ql7Var.record_ = list;
        ql7Var.localName_ = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public ql7(g72 g72Var, o85 o85Var) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        List list = Collections.EMPTY_LIST;
        this.record_ = list;
        this.localName_ = list;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i & 1) != 1) {
                                this.record_ = new ArrayList();
                                i |= 1;
                            }
                            this.record_.add((pl7) g72Var.g(pl7.b, o85Var));
                        } else if (iN == 40) {
                            if ((i & 2) != 2) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            this.localName_.add(Integer.valueOf(g72Var.k()));
                        } else if (iN == 42) {
                            int iE = g72Var.e(g72Var.k());
                            if ((i & 2) != 2 && g72Var.c() > 0) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            while (g72Var.c() > 0) {
                                this.localName_.add(Integer.valueOf(g72Var.k()));
                            }
                            g72Var.d(iE);
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
                if ((i & 1) == 1) {
                    this.record_ = Collections.unmodifiableList(this.record_);
                }
                if ((i & 2) == 2) {
                    this.localName_ = Collections.unmodifiableList(this.localName_);
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
        if ((i & 1) == 1) {
            this.record_ = Collections.unmodifiableList(this.record_);
        }
        if ((i & 2) == 2) {
            this.localName_ = Collections.unmodifiableList(this.localName_);
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
        ml7 ml7Var = new ml7();
        List list = Collections.EMPTY_LIST;
        ml7Var.c = list;
        ml7Var.d = list;
        ml7Var.k(this);
        return ml7Var;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        for (int i = 0; i < this.record_.size(); i++) {
            p90Var.j0(1, this.record_.get(i));
        }
        if (this.localName_.size() > 0) {
            p90Var.q0(42);
            p90Var.q0(this.localNameMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.localName_.size(); i2++) {
            p90Var.i0(this.localName_.get(i2).intValue());
        }
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        List<Integer> list;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iQ = 0;
        for (int i3 = 0; i3 < this.record_.size(); i3++) {
            iQ += p90.q(1, this.record_.get(i3));
        }
        int iP = 0;
        while (true) {
            int size = this.localName_.size();
            list = this.localName_;
            if (i2 >= size) {
                break;
            }
            iP += p90.p(list.get(i2).intValue());
            i2++;
        }
        int iP2 = iQ + iP;
        if (!list.isEmpty()) {
            iP2 = iP2 + 1 + p90.p(iP);
        }
        this.localNameMemoizedSerializedSize = iP;
        int size2 = this.unknownFields.size() + iP2;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        ml7 ml7Var = new ml7();
        List list = Collections.EMPTY_LIST;
        ml7Var.c = list;
        ml7Var.d = list;
        return ml7Var;
    }

    public final List o() {
        return this.localName_;
    }

    public final List p() {
        return this.record_;
    }

    public ql7() {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public ql7(ml7 ml7Var) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ml7Var.a;
    }
}
