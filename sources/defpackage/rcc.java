package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rcc implements qcc {
    public static final vea e = new vea(7, new tbc(1), new a4c(4));
    public final Map a;
    public final w79 b;
    public ucc c;
    public final ckb d;

    public rcc(Map map) {
        this.a = map;
        long[] jArr = jec.a;
        this.b = new w79();
        this.d = new ckb(8, this);
    }

    @Override // defpackage.qcc
    public final void b(Object obj, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(533563200);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(this) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            l46Var.i0(obj);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                ckb ckbVar = this.d;
                if (!((Boolean) ckbVar.d(obj)).booleanValue()) {
                    cva.u(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.a.get(obj);
                pr4 pr4Var = wcc.a;
                xcc xccVar = new xcc(new vcc(map, ckbVar));
                l46Var.p0(xccVar);
                objR = xccVar;
            }
            xcc xccVar2 = (xcc) objR;
            mh3.b(new e1b[]{wcc.a.a(xccVar2), hb8.a.a(xccVar2)}, dd2Var, l46Var, (i2 & 112) | 8);
            boolean zI = l46Var.i(this) | l46Var.i(obj) | l46Var.i(xccVar2);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                objR2 = new bv9(this, obj, xccVar2, 5);
                l46Var.p0(objR2);
            }
            af1.g(wef.a, (a26) objR2, l46Var);
            if (l46Var.y && l46Var.G.i == l46Var.z) {
                l46Var.z = -1;
                l46Var.y = false;
            }
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, this, obj, dd2Var, 11);
        }
    }

    @Override // defpackage.qcc
    public final void f(Object obj) {
        if (this.b.k(obj) == null) {
            this.a.remove(obj);
        }
    }
}
