package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fya extends l56 implements wt8 {
    public int X;
    public int b;
    public gya c;
    public long d;
    public float e;
    public double f;
    public int g;
    public int v;
    public int w;
    public kya x;
    public List y;
    public int z;

    public static fya k() {
        fya fyaVar = new fya();
        fyaVar.c = gya.BYTE;
        fyaVar.x = kya.a;
        fyaVar.y = Collections.EMPTY_LIST;
        return fyaVar;
    }

    public final Object clone() {
        fya fyaVarK = k();
        fyaVarK.l(j());
        return fyaVarK;
    }

    @Override // defpackage.l56
    public final ut8 f() {
        hya hyaVarJ = j();
        if (hyaVarJ.b()) {
            return hyaVarJ;
        }
        throw new qef();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.l56
    public final l56 h(g72 g72Var, o85 o85Var) throws Throwable {
        hya hyaVar = null;
        try {
            try {
                hya.b.getClass();
                l(new hya(g72Var, o85Var));
                return this;
            } catch (Throwable th) {
                th = th;
                if (hyaVar != null) {
                    l(hyaVar);
                }
                throw th;
            }
        } catch (ab7 e) {
            hya hyaVar2 = (hya) e.a();
            try {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                hyaVar = hyaVar2;
                if (hyaVar != null) {
                    l(hyaVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l56
    public final /* bridge */ /* synthetic */ l56 i(u56 u56Var) {
        l((hya) u56Var);
        return this;
    }

    public final hya j() {
        hya hyaVar = new hya(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        hyaVar.type_ = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        hyaVar.intValue_ = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        hyaVar.floatValue_ = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        hyaVar.doubleValue_ = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        hyaVar.stringValue_ = this.g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        hyaVar.classId_ = this.v;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        hyaVar.enumValueId_ = this.w;
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        hyaVar.annotation_ = this.x;
        if ((this.b & 256) == 256) {
            this.y = Collections.unmodifiableList(this.y);
            this.b &= -257;
        }
        hyaVar.arrayElement_ = this.y;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        hyaVar.arrayDimensionCount_ = this.z;
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 1024) {
            i2 |= 512;
        }
        hyaVar.flags_ = this.X;
        hyaVar.bitField0_ = i2;
        return hyaVar;
    }

    public final void l(hya hyaVar) {
        kya kyaVar;
        if (hyaVar == hya.a) {
            return;
        }
        if (hyaVar.T()) {
            gya gyaVarJ = hyaVar.J();
            gyaVarJ.getClass();
            this.b |= 1;
            this.c = gyaVarJ;
        }
        if (hyaVar.R()) {
            long jH = hyaVar.H();
            this.b |= 2;
            this.d = jH;
        }
        if (hyaVar.Q()) {
            float fG = hyaVar.G();
            this.b |= 4;
            this.e = fG;
        }
        if (hyaVar.N()) {
            double D = hyaVar.D();
            this.b |= 8;
            this.f = D;
        }
        if (hyaVar.S()) {
            int I = hyaVar.I();
            this.b |= 16;
            this.g = I;
        }
        if (hyaVar.M()) {
            int iC = hyaVar.C();
            this.b |= 32;
            this.v = iC;
        }
        if (hyaVar.O()) {
            int iE = hyaVar.E();
            this.b |= 64;
            this.w = iE;
        }
        if (hyaVar.K()) {
            kya kyaVarX = hyaVar.x();
            if ((this.b & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 128 || (kyaVar = this.x) == kya.a) {
                this.x = kyaVarX;
            } else {
                jya jyaVar = new jya(0);
                jyaVar.d = Collections.EMPTY_LIST;
                jyaVar.l(kyaVar);
                jyaVar.l(kyaVarX);
                this.x = jyaVar.j();
            }
            this.b |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (!hyaVar.arrayElement_.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = hyaVar.arrayElement_;
                this.b &= -257;
            } else {
                if ((this.b & 256) != 256) {
                    this.y = new ArrayList(this.y);
                    this.b |= 256;
                }
                this.y.addAll(hyaVar.arrayElement_);
            }
        }
        if (hyaVar.L()) {
            int iZ = hyaVar.z();
            this.b |= 512;
            this.z = iZ;
        }
        if (hyaVar.P()) {
            int iF = hyaVar.F();
            this.b |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            this.X = iF;
        }
        this.a = this.a.c(hyaVar.unknownFields);
    }
}
