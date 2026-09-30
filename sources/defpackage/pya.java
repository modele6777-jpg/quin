package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pya extends p56 {
    public int d;
    public int e;
    public List f;
    public List g;
    public List v;
    public List w;

    public static pya l() {
        pya pyaVar = new pya();
        pyaVar.e = 6;
        List list = Collections.EMPTY_LIST;
        pyaVar.f = list;
        pyaVar.g = list;
        pyaVar.v = list;
        pyaVar.w = list;
        return pyaVar;
    }

    public final Object clone() {
        pya pyaVarL = l();
        pyaVarL.m(k());
        return pyaVarL;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        qya qyaVarK = k();
        if (qyaVarK.b()) {
            return qyaVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        qya qyaVar = null;
        try {
            try {
                qya.b.getClass();
                m(new qya(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (qyaVar != null) {
                    m(qyaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            qya qyaVar2 = (qya) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                qyaVar = qyaVar2;
                if (qyaVar != null) {
                    m(qyaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        m((qya) u56Var);
        return this;
    }

    public final qya k() {
        qya qyaVar = new qya(this);
        int i = (this.d & 1) != 1 ? 0 : 1;
        qyaVar.flags_ = this.e;
        if ((this.d & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            this.d &= -3;
        }
        qyaVar.valueParameter_ = this.f;
        if ((this.d & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            this.d &= -5;
        }
        qyaVar.versionRequirement_ = this.g;
        if ((this.d & 8) == 8) {
            this.v = Collections.unmodifiableList(this.v);
            this.d &= -9;
        }
        qyaVar.compilerPluginData_ = this.v;
        if ((this.d & 16) == 16) {
            this.w = Collections.unmodifiableList(this.w);
            this.d &= -17;
        }
        qyaVar.annotation_ = this.w;
        qyaVar.bitField0_ = i;
        return qyaVar;
    }

    public final void m(qya qyaVar) {
        if (qyaVar == qya.a) {
            return;
        }
        if (qyaVar.K()) {
            int iH = qyaVar.H();
            this.d |= 1;
            this.e = iH;
        }
        if (!qyaVar.valueParameter_.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = qyaVar.valueParameter_;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(qyaVar.valueParameter_);
            }
        }
        if (!qyaVar.versionRequirement_.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = qyaVar.versionRequirement_;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(qyaVar.versionRequirement_);
            }
        }
        if (!qyaVar.compilerPluginData_.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = qyaVar.compilerPluginData_;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.v = new ArrayList(this.v);
                    this.d |= 8;
                }
                this.v.addAll(qyaVar.compilerPluginData_);
            }
        }
        if (!qyaVar.annotation_.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = qyaVar.annotation_;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.w = new ArrayList(this.w);
                    this.d |= 16;
                }
                this.w.addAll(qyaVar.annotation_);
            }
        }
        j(qyaVar);
        this.a = this.a.c(qyaVar.unknownFields);
    }
}
