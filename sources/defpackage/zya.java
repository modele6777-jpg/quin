package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zya extends l56 implements wt8 {
    public int b;
    public int c;
    public int d;
    public aza e;
    public vza f;
    public int g;
    public List v;
    public List w;

    public static zya k() {
        zya zyaVar = new zya();
        zyaVar.e = aza.TRUE;
        zyaVar.f = vza.a;
        List list = Collections.EMPTY_LIST;
        zyaVar.v = list;
        zyaVar.w = list;
        return zyaVar;
    }

    public final Object clone() {
        zya zyaVarK = k();
        zyaVarK.l(j());
        return zyaVarK;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        bza bzaVarJ = j();
        if (bzaVarJ.b()) {
            return bzaVarJ;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        bza bzaVar = null;
        try {
            try {
                bza.b.getClass();
                l(new bza(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (bzaVar != null) {
                    l(bzaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            bza bzaVar2 = (bza) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                bzaVar = bzaVar2;
                if (bzaVar != null) {
                    l(bzaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        l((bza) u56Var);
        return this;
    }

    public final bza j() {
        bza bzaVar = new bza(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        bzaVar.flags_ = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        bzaVar.valueParameterReference_ = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        bzaVar.constantValue_ = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        bzaVar.isInstanceType_ = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        bzaVar.isInstanceTypeId_ = this.g;
        if ((this.b & 32) == 32) {
            this.v = Collections.unmodifiableList(this.v);
            this.b &= -33;
        }
        bzaVar.andArgument_ = this.v;
        if ((this.b & 64) == 64) {
            this.w = Collections.unmodifiableList(this.w);
            this.b &= -65;
        }
        bzaVar.orArgument_ = this.w;
        bzaVar.bitField0_ = i2;
        return bzaVar;
    }

    public final void l(bza bzaVar) {
        vza vzaVar;
        if (bzaVar == bza.a) {
            return;
        }
        if (bzaVar.D()) {
            int iW = bzaVar.w();
            this.b |= 1;
            this.c = iW;
        }
        if (bzaVar.G()) {
            int iB = bzaVar.B();
            this.b |= 2;
            this.d = iB;
        }
        if (bzaVar.C()) {
            aza azaVarV = bzaVar.v();
            azaVarV.getClass();
            this.b |= 4;
            this.e = azaVarV;
        }
        if (bzaVar.E()) {
            vza vzaVarX = bzaVar.x();
            if ((this.b & 8) != 8 || (vzaVar = this.f) == vza.a) {
                this.f = vzaVarX;
            } else {
                uza uzaVarR0 = vza.r0(vzaVar);
                uzaVarR0.m(vzaVarX);
                this.f = uzaVarR0.k();
            }
            this.b |= 8;
        }
        if (bzaVar.F()) {
            int iZ = bzaVar.z();
            this.b |= 16;
            this.g = iZ;
        }
        if (!bzaVar.andArgument_.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = bzaVar.andArgument_;
                this.b &= -33;
            } else {
                if ((this.b & 32) != 32) {
                    this.v = new ArrayList(this.v);
                    this.b |= 32;
                }
                this.v.addAll(bzaVar.andArgument_);
            }
        }
        if (!bzaVar.orArgument_.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = bzaVar.orArgument_;
                this.b &= -65;
            } else {
                if ((this.b & 64) != 64) {
                    this.w = new ArrayList(this.w);
                    this.b |= 64;
                }
                this.w.addAll(bzaVar.orArgument_);
            }
        }
        this.a = this.a.c(bzaVar.unknownFields);
    }
}
