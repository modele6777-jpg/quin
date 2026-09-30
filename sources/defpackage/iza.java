package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iza extends q56 {
    public static final iza a;
    public static final gl7 b = new gl7(17);
    private int bitField0_;
    private List<nya> class__;
    private List<kya> fileAnnotation_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private hza package_;
    private oza qualifiedNames_;
    private qza strings_;
    private final z61 unknownFields;

    static {
        iza izaVar = new iza();
        a = izaVar;
        izaVar.strings_ = qza.a;
        izaVar.qualifiedNames_ = oza.a;
        izaVar.package_ = hza.a;
        List list = Collections.EMPTY_LIST;
        izaVar.class__ = list;
        izaVar.fileAnnotation_ = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public iza(g72 g72Var, o85 o85Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.strings_ = qza.a;
        this.qualifiedNames_ = oza.a;
        this.package_ = hza.a;
        List list = Collections.EMPTY_LIST;
        this.class__ = list;
        this.fileAnnotation_ = list;
        x61 x61Var = new x61();
        p90 p90VarK = p90.K(x61Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = g72Var.n();
                    if (iN != 0) {
                        gza gzaVarM = null;
                        rya ryaVar = null;
                        rya ryaVar2 = null;
                        if (iN == 10) {
                            if ((this.bitField0_ & 1) == 1) {
                                qza qzaVar = this.strings_;
                                qzaVar.getClass();
                                ryaVar = new rya(3);
                                ryaVar.d = t18.b;
                                ryaVar.p(qzaVar);
                            }
                            qza qzaVar2 = (qza) g72Var.g(qza.b, o85Var);
                            this.strings_ = qzaVar2;
                            if (ryaVar != null) {
                                ryaVar.p(qzaVar2);
                                this.strings_ = ryaVar.l();
                            }
                            this.bitField0_ |= 1;
                        } else if (iN == 18) {
                            if ((this.bitField0_ & 2) == 2) {
                                oza ozaVar = this.qualifiedNames_;
                                ozaVar.getClass();
                                ryaVar2 = new rya(1);
                                ryaVar2.d = Collections.EMPTY_LIST;
                                ryaVar2.o(ozaVar);
                            }
                            oza ozaVar2 = (oza) g72Var.g(oza.b, o85Var);
                            this.qualifiedNames_ = ozaVar2;
                            if (ryaVar2 != null) {
                                ryaVar2.o(ozaVar2);
                                this.qualifiedNames_ = ryaVar2.k();
                            }
                            this.bitField0_ |= 2;
                        } else if (iN == 26) {
                            if ((this.bitField0_ & 4) == 4) {
                                hza hzaVar = this.package_;
                                hzaVar.getClass();
                                gzaVarM = gza.m();
                                gzaVarM.o(hzaVar);
                            }
                            hza hzaVar2 = (hza) g72Var.g(hza.b, o85Var);
                            this.package_ = hzaVar2;
                            if (gzaVarM != null) {
                                gzaVarM.o(hzaVar2);
                                this.package_ = gzaVarM.k();
                            }
                            this.bitField0_ |= 4;
                        } else if (iN == 34) {
                            int i2 = (i == true ? 1 : 0) & 8;
                            i = i;
                            if (i2 != 8) {
                                this.class__ = new ArrayList();
                                i = (i == true ? 1 : 0) | 8;
                            }
                            this.class__.add((nya) g72Var.g(nya.b, o85Var));
                        } else if (iN == 42) {
                            int i3 = (i == true ? 1 : 0) & 16;
                            i = i;
                            if (i3 != 16) {
                                this.fileAnnotation_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 16;
                            }
                            this.fileAnnotation_.add((kya) g72Var.g(kya.b, o85Var));
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
                if (((i == true ? 1 : 0) & 8) == 8) {
                    this.class__ = Collections.unmodifiableList(this.class__);
                }
                if (((i == true ? 1 : 0) & 16) == 16) {
                    this.fileAnnotation_ = Collections.unmodifiableList(this.fileAnnotation_);
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
        if (((i == true ? 1 : 0) & 8) == 8) {
            this.class__ = Collections.unmodifiableList(this.class__);
        }
        if (((i == true ? 1 : 0) & 16) == 16) {
            this.fileAnnotation_ = Collections.unmodifiableList(this.fileAnnotation_);
        }
        try {
            p90VarK.b0();
        } catch (IOException unused2) {
        } finally {
            this.unknownFields = x61Var.l();
        }
        q();
    }

    public final List D() {
        return this.class__;
    }

    public final hza E() {
        return this.package_;
    }

    public final oza F() {
        return this.qualifiedNames_;
    }

    public final qza G() {
        return this.strings_;
    }

    public final boolean H() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean I() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean J() {
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
        if (I() && !this.qualifiedNames_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (H() && !this.package_.b()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.class__.size(); i++) {
            if (!this.class__.get(i).b()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.fileAnnotation_.size(); i2++) {
            if (!this.fileAnnotation_.get(i2).b()) {
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
        gza gzaVarN = gza.n();
        gzaVarN.p(this);
        return gzaVarN;
    }

    @Override // defpackage.ut8
    public final void d(p90 p90Var) throws IOException {
        e();
        fz3 fz3Var = new fz3(this);
        if ((this.bitField0_ & 1) == 1) {
            p90Var.j0(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            p90Var.j0(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            p90Var.j0(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            p90Var.j0(4, this.class__.get(i));
        }
        for (int i2 = 0; i2 < this.fileAnnotation_.size(); i2++) {
            p90Var.j0(5, this.fileAnnotation_.get(i2));
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
        int iQ = (this.bitField0_ & 1) == 1 ? p90.q(1, this.strings_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iQ += p90.q(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iQ += p90.q(3, this.package_);
        }
        for (int i2 = 0; i2 < this.class__.size(); i2++) {
            iQ += p90.q(4, this.class__.get(i2));
        }
        for (int i3 = 0; i3 < this.fileAnnotation_.size(); i3++) {
            iQ += p90.q(5, this.fileAnnotation_.get(i3));
        }
        int size = this.unknownFields.size() + l() + iQ;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.ut8
    public final l56 g() {
        return gza.n();
    }

    public iza() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z61.a;
    }

    public iza(gza gzaVar) {
        super(gzaVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = gzaVar.a;
    }
}
