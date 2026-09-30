package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0b extends p56 {
    public int d;
    public int e;
    public int f;
    public vza g;
    public int v;
    public vza w;
    public int x;
    public List y;
    public hya z;

    public static c0b l() {
        c0b c0bVar = new c0b();
        vza vzaVar = vza.a;
        c0bVar.g = vzaVar;
        c0bVar.w = vzaVar;
        c0bVar.y = Collections.EMPTY_LIST;
        c0bVar.z = hya.a;
        return c0bVar;
    }

    public final Object clone() {
        c0b c0bVarL = l();
        c0bVarL.m(k());
        return c0bVarL;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        d0b d0bVarK = k();
        if (d0bVarK.b()) {
            return d0bVarK;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        d0b d0bVar = null;
        try {
            try {
                d0b.b.getClass();
                m(new d0b(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (d0bVar != null) {
                    m(d0bVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            d0b d0bVar2 = (d0b) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                d0bVar = d0bVar2;
                if (d0bVar != null) {
                    m(d0bVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        m((d0b) u56Var);
        return this;
    }

    public final d0b k() {
        d0b d0bVar = new d0b(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        d0bVar.flags_ = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        d0bVar.name_ = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        d0bVar.type_ = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        d0bVar.typeId_ = this.v;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        d0bVar.varargElementType_ = this.w;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        d0bVar.varargElementTypeId_ = this.x;
        if ((this.d & 64) == 64) {
            this.y = Collections.unmodifiableList(this.y);
            this.d &= -65;
        }
        d0bVar.annotation_ = this.y;
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i2 |= 64;
        }
        d0bVar.annotationParameterDefaultValue_ = this.z;
        d0bVar.bitField0_ = i2;
        return d0bVar;
    }

    public final void m(d0b d0bVar) {
        hya hyaVar;
        vza vzaVar;
        vza vzaVar2;
        if (d0bVar == d0b.a) {
            return;
        }
        if (d0bVar.O()) {
            int iH = d0bVar.H();
            this.d |= 1;
            this.e = iH;
        }
        if (d0bVar.P()) {
            int I = d0bVar.I();
            this.d |= 2;
            this.f = I;
        }
        if (d0bVar.Q()) {
            vza vzaVarJ = d0bVar.J();
            if ((this.d & 4) != 4 || (vzaVar2 = this.g) == vza.a) {
                this.g = vzaVarJ;
            } else {
                uza uzaVarR0 = vza.r0(vzaVar2);
                uzaVarR0.m(vzaVarJ);
                this.g = uzaVarR0.k();
            }
            this.d |= 4;
        }
        if (d0bVar.R()) {
            int iK = d0bVar.K();
            this.d |= 8;
            this.v = iK;
        }
        if (d0bVar.S()) {
            vza vzaVarL = d0bVar.L();
            if ((this.d & 16) != 16 || (vzaVar = this.w) == vza.a) {
                this.w = vzaVarL;
            } else {
                uza uzaVarR1 = vza.r0(vzaVar);
                uzaVarR1.m(vzaVarL);
                this.w = uzaVarR1.k();
            }
            this.d |= 16;
        }
        if (d0bVar.T()) {
            int iM = d0bVar.M();
            this.d |= 32;
            this.x = iM;
        }
        if (!d0bVar.annotation_.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = d0bVar.annotation_;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.y = new ArrayList(this.y);
                    this.d |= 64;
                }
                this.y.addAll(d0bVar.annotation_);
            }
        }
        if (d0bVar.N()) {
            hya hyaVarG = d0bVar.G();
            if ((this.d & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128 || (hyaVar = this.z) == hya.a) {
                this.z = hyaVarG;
            } else {
                fya fyaVarK = fya.k();
                fyaVarK.l(hyaVar);
                fyaVarK.l(hyaVarG);
                this.z = fyaVarK.j();
            }
            this.d |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        j(d0bVar);
        this.a = this.a.c(d0bVar.unknownFields);
    }
}
