package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yza extends p56 {
    public int d;
    public int e;
    public int f;
    public boolean g;
    public zza v;
    public List w;
    public List x;
    public List y;

    public static yza l() {
        yza yzaVar = new yza();
        yzaVar.v = zza.INV;
        List list = Collections.EMPTY_LIST;
        yzaVar.w = list;
        yzaVar.x = list;
        yzaVar.y = list;
        return yzaVar;
    }

    public final Object clone() {
        yza yzaVarL = l();
        yzaVarL.m(k());
        return yzaVarL;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        a0b a0bVarK = k();
        if (a0bVarK.b()) {
            return a0bVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        a0b a0bVar = null;
        try {
            try {
                a0b.b.getClass();
                m(new a0b(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (a0bVar != null) {
                    m(a0bVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            a0b a0bVar2 = (a0b) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                a0bVar = a0bVar2;
                if (a0bVar != null) {
                    m(a0bVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        m((a0b) u56Var);
        return this;
    }

    public final a0b k() {
        a0b a0bVar = new a0b(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        a0bVar.id_ = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        a0bVar.name_ = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        a0bVar.reified_ = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        a0bVar.variance_ = this.v;
        if ((this.d & 16) == 16) {
            this.w = Collections.unmodifiableList(this.w);
            this.d &= -17;
        }
        a0bVar.upperBound_ = this.w;
        if ((this.d & 32) == 32) {
            this.x = Collections.unmodifiableList(this.x);
            this.d &= -33;
        }
        a0bVar.upperBoundId_ = this.x;
        if ((this.d & 64) == 64) {
            this.y = Collections.unmodifiableList(this.y);
            this.d &= -65;
        }
        a0bVar.annotation_ = this.y;
        a0bVar.bitField0_ = i2;
        return a0bVar;
    }

    public final void m(a0b a0bVar) {
        if (a0bVar == a0b.a) {
            return;
        }
        if (a0bVar.N()) {
            int iH = a0bVar.H();
            this.d |= 1;
            this.e = iH;
        }
        if (a0bVar.O()) {
            int I = a0bVar.I();
            this.d |= 2;
            this.f = I;
        }
        if (a0bVar.P()) {
            boolean zJ = a0bVar.J();
            this.d |= 4;
            this.g = zJ;
        }
        if (a0bVar.Q()) {
            zza zzaVarM = a0bVar.M();
            zzaVarM.getClass();
            this.d |= 8;
            this.v = zzaVarM;
        }
        if (!a0bVar.upperBound_.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = a0bVar.upperBound_;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.w = new ArrayList(this.w);
                    this.d |= 16;
                }
                this.w.addAll(a0bVar.upperBound_);
            }
        }
        if (!a0bVar.upperBoundId_.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = a0bVar.upperBoundId_;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.x = new ArrayList(this.x);
                    this.d |= 32;
                }
                this.x.addAll(a0bVar.upperBoundId_);
            }
        }
        if (!a0bVar.annotation_.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = a0bVar.annotation_;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.y = new ArrayList(this.y);
                    this.d |= 64;
                }
                this.y.addAll(a0bVar.annotation_);
            }
        }
        j(a0bVar);
        this.a = this.a.c(a0bVar.unknownFields);
    }
}
