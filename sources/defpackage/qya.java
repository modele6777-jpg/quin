package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qya extends q56 {
    public static final qya a;
    public static final gl7 b = new gl7(10);
    private List<kya> annotation_;
    private int bitField0_;
    private List<oya> compilerPluginData_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final z61 unknownFields;
    private List<d0b> valueParameter_;
    private List<Integer> versionRequirement_;

    static {
        qya qyaVar = new qya();
        a = qyaVar;
        qyaVar.flags_ = 6;
        List list = Collections.EMPTY_LIST;
        qyaVar.valueParameter_ = list;
        qyaVar.versionRequirement_ = list;
        qyaVar.compilerPluginData_ = list;
        qyaVar.annotation_ = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public qya(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.flags_ = 6;
        List list = Collections.EMPTY_LIST;
        this.valueParameter_ = list;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
        this.annotation_ = list;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = g72Var.k();
                        } else if (iN == 18) {
                            if ((i & 2) != 2) {
                                this.valueParameter_ = new ArrayList();
                                i |= 2;
                            }
                            this.valueParameter_.add((d0b) g72Var.g(d0b.b, o85Var));
                        } else if (iN == 26) {
                            if ((i & 16) != 16) {
                                this.annotation_ = new ArrayList();
                                i |= 16;
                            }
                            this.annotation_.add((kya) g72Var.g(kya.b, o85Var));
                        } else if (iN == 248) {
                            if ((i & 4) != 4) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 4;
                            }
                            this.versionRequirement_.add(Integer.valueOf(g72Var.k()));
                        } else if (iN == 250) {
                            int iE = g72Var.e(g72Var.k());
                            if ((i & 4) != 4 && g72Var.c() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 4;
                            }
                            while (g72Var.c() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(g72Var.k()));
                            }
                            g72Var.d(iE);
                        } else if (iN == 258) {
                            if ((i & 8) != 8) {
                                this.compilerPluginData_ = new ArrayList();
                                i |= 8;
                            }
                            this.compilerPluginData_.add((oya) g72Var.g(oya.b, o85Var));
                        } else if (!r(g72Var, p90VarK, o85Var, iN)) {
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
                if ((i & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if ((i & 16) == 16) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & 4) == 4) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & 8) == 8) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
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
        if ((i & 2) == 2) {
            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
        }
        if ((i & 16) == 16) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
        }
        if ((i & 4) == 4) {
            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
        }
        if ((i & 8) == 8) {
            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
        q();
    }

    public final List F() {
        return this.annotation_;
    }

    public final List G() {
        return this.compilerPluginData_;
    }

    public final int H() {
        return this.flags_;
    }

    public final List I() {
        return this.valueParameter_;
    }

    public final List J() {
        return this.versionRequirement_;
    }

    public final boolean K() {
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
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            if (!this.valueParameter_.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.compilerPluginData_.size(); i2++) {
            if (!this.compilerPluginData_.get(i2).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            if (!this.annotation_.get(i3).b()) {
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
        pya pyaVarL = pya.l();
        pyaVarL.m(this);
        return pyaVarL;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        if ((this.bitField0_ & 1) == 1) {
            p90Var.h0(1, this.flags_);
        }
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            p90Var.j0(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            p90Var.j0(3, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            p90Var.h0(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            p90Var.j0(32, this.compilerPluginData_.get(i4));
        }
        fz3Var.y(19000, p90Var);
        p90Var.m0(this.unknownFields);
    }

    @Override // defpackage.ut8
    public final int e() {
        List<Integer> list;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iO = (this.bitField0_ & 1) == 1 ? p90.o(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            iO += p90.q(2, this.valueParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iO += p90.q(3, this.annotation_.get(i3));
        }
        int i4 = 0;
        int iP = 0;
        while (true) {
            int size = this.versionRequirement_.size();
            list = this.versionRequirement_;
            if (i4 >= size) {
                break;
            }
            iP += p90.p(list.get(i4).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iO + iP;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            size2 += p90.q(32, this.compilerPluginData_.get(i5));
        }
        int size3 = this.unknownFields.size() + l() + size2;
        this.memoizedSerializedSize = size3;
        return size3;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return pya.l();
    }

    public qya() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public qya(pya pyaVar) {
        super(pyaVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = pyaVar.a;
    }
}
