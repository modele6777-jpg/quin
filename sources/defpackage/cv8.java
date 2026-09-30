package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.adjust.sdk.sig.r3;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cv8 extends hu0 implements Handler.Callback {
    public final af8 I0;
    public final t45 J0;
    public final Handler K0;
    public final zu8 L0;
    public fbc M0;
    public boolean N0;
    public boolean O0;
    public long P0;
    public su8 Q0;
    public long R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv8(t45 t45Var, Looper looper) {
        super(5);
        af8 af8Var = af8.H0;
        this.J0 = t45Var;
        this.K0 = looper == null ? null : new Handler(looper, this);
        this.I0 = af8Var;
        this.L0 = new zu8(1);
        this.R0 = -9223372036854775807L;
    }

    @Override // defpackage.hu0
    public final int D(rr5 rr5Var) {
        if (this.I0.G(rr5Var)) {
            return hu0.f(rr5Var.T == 0 ? 4 : 2, 0, 0, 0);
        }
        return hu0.f(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void H(su8 su8Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            qu8[] qu8VarArr = su8Var.a;
            if (i >= qu8VarArr.length) {
                return;
            }
            rr5 rr5VarA = qu8VarArr[i].a();
            if (rr5VarA != null) {
                af8 af8Var = this.I0;
                if (af8Var.G(rr5VarA)) {
                    fbc fbcVarS = af8Var.s(rr5VarA);
                    byte[] bArrC = qu8VarArr[i].c();
                    bArrC.getClass();
                    zu8 zu8Var = this.L0;
                    zu8Var.e();
                    zu8Var.h(bArrC.length);
                    ByteBuffer byteBuffer = zu8Var.e;
                    String str = pqf.a;
                    byteBuffer.put(bArrC);
                    zu8Var.i();
                    su8 su8VarE = fbcVarS.e(zu8Var);
                    if (su8VarE != null) {
                        H(su8VarE, arrayList);
                    }
                } else {
                    arrayList.add(qu8VarArr[i]);
                }
            } else {
                arrayList.add(qu8VarArr[i]);
            }
            i++;
        }
    }

    public final long I(long j) {
        pa7.J(j != -9223372036854775807L);
        pa7.J(this.R0 != -9223372036854775807L);
        return j - this.R0;
    }

    public final void J(su8 su8Var) {
        t45 t45Var = this.J0;
        y45 y45Var = t45Var.a;
        rp8 rp8Var = y45Var.m0;
        f98 f98Var = y45Var.m;
        r23 r23VarA = rp8Var.a();
        int i = 0;
        int i2 = 0;
        while (true) {
            qu8[] qu8VarArr = su8Var.a;
            if (i2 >= qu8VarArr.length) {
                break;
            }
            qu8VarArr[i2].b(r23VarA);
            i2++;
        }
        y45Var.m0 = new rp8(r23VarA);
        rp8 rp8VarA = y45Var.a();
        if (!rp8VarA.equals(y45Var.R)) {
            y45Var.R = rp8VarA;
            f98Var.c(14, new r45(i, t45Var));
        }
        f98Var.c(28, new r45(1, su8Var));
        f98Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            J((su8) message.obj);
            return true;
        }
        r3.l();
        return false;
    }

    @Override // defpackage.hu0
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // defpackage.hu0
    public final boolean m() {
        return this.O0;
    }

    @Override // defpackage.hu0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hu0
    public final void p() {
        this.Q0 = null;
        this.M0 = null;
        this.R0 = -9223372036854775807L;
    }

    @Override // defpackage.hu0
    public final void r(long j, boolean z, boolean z2) {
        this.Q0 = null;
        this.N0 = false;
        this.O0 = false;
    }

    @Override // defpackage.hu0
    public final void w(rr5[] rr5VarArr, long j, long j2, zp8 zp8Var) {
        this.M0 = this.I0.s(rr5VarArr[0]);
        su8 su8Var = this.Q0;
        if (su8Var != null) {
            long j3 = su8Var.b;
            long j4 = (this.R0 + j3) - j2;
            if (j3 != j4) {
                su8Var = new su8(j4, su8Var.a);
            }
            this.Q0 = su8Var;
        }
        this.R0 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    @Override // defpackage.hu0
    public final void z(long j, long j2) {
        int iY;
        su8 su8VarE;
        ArrayList arrayList;
        boolean z = true;
        while (z) {
            if (!this.N0 && this.Q0 == null) {
                zu8 zu8Var = this.L0;
                zu8Var.e();
                fz3 fz3Var = this.c;
                fz3Var.l();
                int iY2 = y(fz3Var, zu8Var, 5);
                if (iY2 != -3 || zu8Var.d(4)) {
                    if (iY2 != -4 || zu8Var.d(4)) {
                        if (iY2 == -4 || iY2 == -3) {
                            long j3 = this.G0;
                            long j4 = j - this.y;
                            if (j3 != -9223372036854775807L && j4 >= j3 - 1000000) {
                                iY = y(fz3Var, zu8Var, 0);
                                if (iY == -4) {
                                    if (zu8Var.d(4)) {
                                        this.N0 = true;
                                    } else if (zu8Var.g >= this.z) {
                                        zu8Var.x = this.P0;
                                        zu8Var.i();
                                        fbc fbcVar = this.M0;
                                        String str = pqf.a;
                                        su8VarE = fbcVar.e(zu8Var);
                                        if (su8VarE != null) {
                                            arrayList = new ArrayList(su8VarE.a.length);
                                            H(su8VarE, arrayList);
                                            if (!arrayList.isEmpty()) {
                                                this.Q0 = new su8(I(zu8Var.g), (qu8[]) arrayList.toArray(new qu8[0]));
                                            }
                                        }
                                    }
                                } else if (iY == -5) {
                                    rr5 rr5Var = (rr5) fz3Var.c;
                                    rr5Var.getClass();
                                    this.P0 = rr5Var.u;
                                }
                            }
                        } else {
                            iY = y(fz3Var, zu8Var, 0);
                            if (iY == -4) {
                                if (zu8Var.d(4)) {
                                    this.N0 = true;
                                } else if (zu8Var.g >= this.z) {
                                    zu8Var.x = this.P0;
                                    zu8Var.i();
                                    fbc fbcVar2 = this.M0;
                                    String str2 = pqf.a;
                                    su8VarE = fbcVar2.e(zu8Var);
                                    if (su8VarE != null) {
                                        arrayList = new ArrayList(su8VarE.a.length);
                                        H(su8VarE, arrayList);
                                        if (!arrayList.isEmpty()) {
                                            this.Q0 = new su8(I(zu8Var.g), (qu8[]) arrayList.toArray(new qu8[0]));
                                        }
                                    }
                                }
                            } else if (iY == -5) {
                                rr5 rr5Var2 = (rr5) fz3Var.c;
                                rr5Var2.getClass();
                                this.P0 = rr5Var2.u;
                            }
                        }
                    } else if (j >= zu8Var.g - 1000000) {
                        iY = y(fz3Var, zu8Var, 0);
                        if (iY == -4) {
                            if (zu8Var.d(4)) {
                                this.N0 = true;
                            } else if (zu8Var.g >= this.z) {
                                zu8Var.x = this.P0;
                                zu8Var.i();
                                fbc fbcVar3 = this.M0;
                                String str3 = pqf.a;
                                su8VarE = fbcVar3.e(zu8Var);
                                if (su8VarE != null) {
                                    arrayList = new ArrayList(su8VarE.a.length);
                                    H(su8VarE, arrayList);
                                    if (!arrayList.isEmpty()) {
                                        this.Q0 = new su8(I(zu8Var.g), (qu8[]) arrayList.toArray(new qu8[0]));
                                    }
                                }
                            }
                        } else if (iY == -5) {
                            rr5 rr5Var3 = (rr5) fz3Var.c;
                            rr5Var3.getClass();
                            this.P0 = rr5Var3.u;
                        }
                    }
                }
            }
            su8 su8Var = this.Q0;
            if (su8Var == null || su8Var.b > I(j)) {
                z = false;
            } else {
                su8 su8Var2 = this.Q0;
                Handler handler = this.K0;
                if (handler != null) {
                    handler.obtainMessage(1, su8Var2).sendToTarget();
                } else {
                    J(su8Var2);
                }
                this.Q0 = null;
                z = true;
            }
            if (this.N0 && this.Q0 == null) {
                this.O0 = true;
            }
        }
    }
}
