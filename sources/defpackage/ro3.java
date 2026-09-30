package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ro3 implements xga, fq8, bq4 {
    public final ece a;
    public final eye b;
    public final fye c;
    public final hbc d;
    public final SparseArray e;
    public f98 f;
    public zga g;
    public jce v;
    public boolean w;

    public ro3(ece eceVar) {
        eceVar.getClass();
        this.a = eceVar;
        String str = pqf.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = new f98((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        eye eyeVar = new eye();
        this.b = eyeVar;
        this.c = new fye();
        hbc hbcVar = new hbc();
        hbcVar.a = eyeVar;
        ey6 ey6Var = jy6.b;
        hbcVar.b = yob.e;
        hbcVar.c = dpb.g;
        this.d = hbcVar;
        this.e = new SparseArray();
    }

    @Override // defpackage.xga
    public final void A(int i, boolean z) {
        M(H(), -1, new qd3(2));
    }

    @Override // defpackage.xga
    public final void B(nga ngaVar) {
        M(H(), 12, new qd3(1));
    }

    @Override // defpackage.xga
    public final void C(vga vgaVar) {
        M(H(), 13, new oo3(17));
    }

    @Override // defpackage.xga
    public final void D(op8 op8Var, int i) {
        M(H(), 1, new oo3(19));
    }

    @Override // defpackage.xga
    public final void E(int i, int i2) {
        M(L(), 24, new qd3(16));
    }

    @Override // defpackage.fq8
    public final void F(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var, int i2) {
        M(K(i, zp8Var), 1000, new qd3(17));
    }

    @Override // defpackage.xga
    public final void G(boolean z) {
        M(H(), 7, new qd3(4));
    }

    public final pl H() {
        return I((zp8) this.d.d);
    }

    public final pl I(zp8 zp8Var) {
        this.g.getClass();
        gye gyeVar = zp8Var == null ? null : (gye) ((dpb) this.d.c).get(zp8Var);
        if (zp8Var != null && gyeVar != null) {
            return J(gyeVar, gyeVar.g(zp8Var.a, this.b).c, zp8Var);
        }
        int i = ((y45) this.g).i();
        gye gyeVarM = ((y45) this.g).m();
        if (i >= gyeVarM.o()) {
            gyeVarM = gye.a;
        }
        return J(gyeVarM, i, null);
    }

    public final pl J(gye gyeVar, int i, zp8 zp8Var) {
        zp8 zp8Var2 = gyeVar.p() ? null : zp8Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = gyeVar.equals(((y45) this.g).m()) && i == ((y45) this.g).i();
        long jR = 0;
        if (zp8Var2 == null || !zp8Var2.c()) {
            if (z) {
                y45 y45Var = (y45) this.g;
                y45Var.Z();
                jR = y45Var.f(y45Var.n0);
            } else if (!gyeVar.p()) {
                jR = pqf.R(gyeVar.m(i, this.c, 0L).j);
            }
        } else if (z && ((y45) this.g).g() == zp8Var2.b && ((y45) this.g).h() == zp8Var2.c) {
            jR = ((y45) this.g).k();
        }
        long j = jR;
        zp8 zp8Var3 = (zp8) this.d.d;
        gye gyeVarM = ((y45) this.g).m();
        int i2 = ((y45) this.g).i();
        long jK = ((y45) this.g).k();
        y45 y45Var2 = (y45) this.g;
        y45Var2.Z();
        return new pl(jElapsedRealtime, gyeVar, i, zp8Var2, j, gyeVarM, i2, zp8Var3, jK, pqf.R(y45Var2.n0.r));
    }

    public final pl K(int i, zp8 zp8Var) {
        this.g.getClass();
        if (zp8Var != null) {
            return ((gye) ((dpb) this.d.c).get(zp8Var)) != null ? I(zp8Var) : J(gye.a, i, zp8Var);
        }
        gye gyeVarM = ((y45) this.g).m();
        if (i >= gyeVarM.o()) {
            gyeVarM = gye.a;
        }
        return J(gyeVarM, i, null);
    }

    public final pl L() {
        return I((zp8) this.d.f);
    }

    public final void M(pl plVar, int i, c98 c98Var) {
        this.e.put(i, plVar);
        this.f.e(i, c98Var);
    }

    public final void N(y45 y45Var, Looper looper) {
        pa7.J(this.g == null || ((jy6) this.d.b).isEmpty());
        y45Var.getClass();
        this.g = y45Var;
        this.v = this.a.a(looper, null);
        f98 f98Var = this.f;
        bo1 bo1Var = new bo1(8, this, y45Var);
        ece eceVar = this.a;
        pa7.J(eceVar != null);
        this.f = new f98(f98Var.d, looper, looper.getThread(), eceVar, bo1Var, f98Var.i);
    }

    @Override // defpackage.xga
    public final void a(uuf uufVar) {
        pl plVarL = L();
        M(plVarL, 25, new qo3(plVarL, uufVar));
    }

    @Override // defpackage.xga
    public final void b(int i) {
        M(H(), 6, new qd3(6));
    }

    @Override // defpackage.fq8
    public final void d(int i, zp8 zp8Var, qp8 qp8Var) {
        pl plVarK = K(i, zp8Var);
        M(plVarK, ErrorCodes.PROTOCOL_EXCEPTION, new bo1(7, plVarK, qp8Var));
    }

    @Override // defpackage.xga
    public final void e(q1f q1fVar) {
        M(H(), 19, new oo3(15));
    }

    @Override // defpackage.xga
    public final void f(boolean z) {
        M(H(), 3, new oo3(9));
    }

    @Override // defpackage.xga
    public final void g(su8 su8Var) {
        M(H(), 28, new qd3(3));
    }

    @Override // defpackage.xga
    public final void h(int i, boolean z) {
        M(H(), 5, new qd3(8));
    }

    @Override // defpackage.xga
    public final void i(float f) {
        M(L(), 22, new oo3(13));
    }

    @Override // defpackage.fq8
    public final void j(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var) {
        M(K(i, zp8Var), ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, new qd3(26));
    }

    @Override // defpackage.xga
    public final void k(int i) {
        M(L(), 21, new oo3(2));
    }

    @Override // defpackage.xga
    public final void l(int i) {
        M(H(), 4, new qd3(13));
    }

    @Override // defpackage.fq8
    public final void m(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var) {
        M(K(i, zp8Var), ErrorCodes.SERVER_RETRY_IN, new qd3(28));
    }

    @Override // defpackage.xga
    public final void n(boolean z) {
        M(H(), 9, new oo3(14));
    }

    @Override // defpackage.fq8
    public final void o(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var, IOException iOException, boolean z) {
        pl plVarK = K(i, zp8Var);
        M(plVarK, ErrorCodes.MALFORMED_URL_EXCEPTION, new qd3(plVarK, v98Var, qp8Var, iOException, z));
    }

    @Override // defpackage.xga
    public final void p(u03 u03Var) {
        M(H(), 27, new qd3(18));
    }

    @Override // defpackage.xga
    public final void q(lga lgaVar) {
        zp8 zp8Var;
        pl plVarH = (!(lgaVar instanceof g45) || (zp8Var = ((g45) lgaVar).mediaPeriodId) == null) ? H() : I(zp8Var);
        M(plVarH, 10, new jv2(plVarH, lgaVar, 22));
    }

    @Override // defpackage.xga
    public final void r(f2f f2fVar) {
        M(H(), 2, new qd3(12));
    }

    @Override // defpackage.xga
    public final void s(lga lgaVar) {
        zp8 zp8Var;
        M((!(lgaVar instanceof g45) || (zp8Var = ((g45) lgaVar).mediaPeriodId) == null) ? H() : I(zp8Var), 10, new qd3(7));
    }

    @Override // defpackage.xga
    public final void t(int i, yga ygaVar, yga ygaVar2) {
        if (i == 1) {
            this.w = false;
        }
        zga zgaVar = this.g;
        zgaVar.getClass();
        hbc hbcVar = this.d;
        hbcVar.d = hbc.S(zgaVar, (jy6) hbcVar.b, (zp8) hbcVar.e, (eye) hbcVar.a);
        pl plVarH = H();
        M(plVarH, 11, new no3(plVarH, i, ygaVar, ygaVar2));
    }

    @Override // defpackage.xga
    public final void u(int i) {
        zga zgaVar = this.g;
        zgaVar.getClass();
        hbc hbcVar = this.d;
        hbcVar.d = hbc.S(zgaVar, (jy6) hbcVar.b, (zp8) hbcVar.e, (eye) hbcVar.a);
        hbcVar.O0(((y45) zgaVar).m());
        M(H(), 0, new oo3(18));
    }

    @Override // defpackage.xga
    public final void v(rp8 rp8Var) {
        M(H(), 14, new qd3(29));
    }

    @Override // defpackage.xga
    public final void w(int i) {
        M(H(), 8, new oo3(12));
    }

    @Override // defpackage.xga
    public final void y(boolean z) {
        M(L(), 23, new oo3(7));
    }

    @Override // defpackage.xga
    public final void z(List list) {
        M(H(), 27, new qd3(10));
    }

    @Override // defpackage.xga
    public final void x() {
    }

    @Override // defpackage.xga
    public final void c(wga wgaVar) {
    }
}
