package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gue extends hu0 implements Handler.Callback {
    public final i8c I0;
    public final tm3 J0;
    public v03 K0;
    public final a8e L0;
    public boolean M0;
    public int N0;
    public y7e O0;
    public b8e P0;
    public cv1 Q0;
    public cv1 R0;
    public int S0;
    public final Handler T0;
    public final t45 U0;
    public final fz3 V0;
    public boolean W0;
    public boolean X0;
    public rr5 Y0;
    public long Z0;
    public long a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gue(t45 t45Var, Looper looper) {
        super(3);
        fnb fnbVar = a8e.U;
        this.U0 = t45Var;
        this.T0 = looper == null ? null : new Handler(looper, this);
        this.L0 = fnbVar;
        this.I0 = new i8c(23);
        this.J0 = new tm3(1);
        this.V0 = new fz3(7, false);
        this.a1 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
    }

    @Override // defpackage.hu0
    public final int D(rr5 rr5Var) {
        boolean zEquals = Objects.equals(rr5Var.p, "application/x-media3-cues");
        String str = rr5Var.p;
        if (!zEquals) {
            fnb fnbVar = (fnb) this.L0;
            fnbVar.getClass();
            if (!((qfc) fnbVar.a).c(rr5Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return qv8.j(str) ? hu0.f(1, 0, 0, 0) : hu0.f(0, 0, 0, 0);
            }
        }
        return hu0.f(rr5Var.T == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void H() {
        boolean z = Objects.equals(this.Y0.p, "application/cea-608") || Objects.equals(this.Y0.p, "application/x-mp4-cea-608") || Objects.equals(this.Y0.p, "application/cea-708");
        String str = this.Y0.p;
        if (z) {
            return;
        }
        qc0.p(rfc.l("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void I() {
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        K(this.Z0);
        u03 u03Var = new u03(yobVar);
        Handler handler = this.T0;
        if (handler != null) {
            handler.obtainMessage(1, u03Var).sendToTarget();
        } else {
            M(u03Var);
        }
    }

    public final long J() {
        if (this.S0 == -1) {
            return Long.MAX_VALUE;
        }
        this.Q0.getClass();
        if (this.S0 >= this.Q0.l()) {
            return Long.MAX_VALUE;
        }
        return this.Q0.f(this.S0);
    }

    public final long K(long j) {
        pa7.J(j != -9223372036854775807L);
        return j - this.y;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    public final void L() {
        y7e ew3Var;
        byte b = 1;
        this.M0 = true;
        rr5 rr5Var = this.Y0;
        rr5Var.getClass();
        qfc qfcVar = (qfc) ((fnb) this.L0).a;
        String str = rr5Var.p;
        int i = rr5Var.P;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    ew3Var = new wu1(str, i);
                    break;
                case 2:
                    ew3Var = new av1(i, rr5Var.s);
                    break;
                default:
                    if (qfcVar.c(rr5Var)) {
                        qc0.j(ub3.i("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    f8e f8eVarV = qfcVar.V(rr5Var);
                    f8eVarV.getClass().getSimpleName().concat("Decoder");
                    ew3Var = new ew3(f8eVarV);
                    break;
                    break;
            }
        } else if (qfcVar.c(rr5Var)) {
            qc0.j(ub3.i("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            f8e f8eVarV2 = qfcVar.V(rr5Var);
            f8eVarV2.getClass().getSimpleName().concat("Decoder");
            ew3Var = new ew3(f8eVarV2);
        }
        this.O0 = ew3Var;
        ew3Var.b(this.z);
    }

    public final void M(u03 u03Var) {
        yob yobVar = u03Var.a;
        t45 t45Var = this.U0;
        t45Var.a.m.e(27, new r45(2, yobVar));
        y45 y45Var = t45Var.a;
        y45Var.d0 = u03Var;
        y45Var.m.e(27, new jv2(29, u03Var));
    }

    public final void N() {
        this.P0 = null;
        this.S0 = -1;
        cv1 cv1Var = this.Q0;
        if (cv1Var != null) {
            cv1Var.g();
            this.Q0 = null;
        }
        cv1 cv1Var2 = this.R0;
        if (cv1Var2 != null) {
            cv1Var2.g();
            this.R0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            M((u03) message.obj);
            return true;
        }
        r3.l();
        return false;
    }

    @Override // defpackage.hu0
    public final String k() {
        return "TextRenderer";
    }

    @Override // defpackage.hu0
    public final boolean m() {
        return this.X0;
    }

    @Override // defpackage.hu0
    public final boolean o() {
        rr5 rr5Var = this.Y0;
        if (rr5Var != null) {
            if (Objects.equals(rr5Var.p, "application/x-media3-cues")) {
                v03 v03Var = this.K0;
                v03Var.getClass();
                if (v03Var.a(this.Z0) == Long.MIN_VALUE) {
                    try {
                        occ occVar = this.w;
                        occVar.getClass();
                        occVar.d();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.X0) {
                    return false;
                }
                if (this.W0) {
                    cv1 cv1Var = this.Q0;
                    long j = this.Z0;
                    if (cv1Var == null || cv1Var.l() <= 0 || cv1Var.f(cv1Var.l() - 1) <= j) {
                        cv1 cv1Var2 = this.R0;
                        long j2 = this.Z0;
                        if ((cv1Var2 == null || cv1Var2.l() <= 0 || cv1Var2.f(cv1Var2.l() - 1) <= j2) && this.P0 != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.hu0
    public final void p() {
        this.Y0 = null;
        this.a1 = -9223372036854775807L;
        I();
        this.Z0 = -9223372036854775807L;
        if (this.O0 != null) {
            N();
            y7e y7eVar = this.O0;
            y7eVar.getClass();
            y7eVar.a();
            this.O0 = null;
            this.N0 = 0;
        }
    }

    @Override // defpackage.hu0
    public final void r(long j, boolean z, boolean z2) {
        this.Z0 = j;
        v03 v03Var = this.K0;
        if (v03Var != null) {
            v03Var.clear();
        }
        I();
        this.W0 = false;
        this.X0 = false;
        this.a1 = -9223372036854775807L;
        rr5 rr5Var = this.Y0;
        if (rr5Var == null || Objects.equals(rr5Var.p, "application/x-media3-cues")) {
            return;
        }
        if (this.N0 == 0) {
            N();
            y7e y7eVar = this.O0;
            y7eVar.getClass();
            y7eVar.flush();
            y7eVar.b(this.z);
            return;
        }
        N();
        y7e y7eVar2 = this.O0;
        y7eVar2.getClass();
        y7eVar2.a();
        this.O0 = null;
        this.N0 = 0;
        L();
    }

    @Override // defpackage.hu0
    public final void w(rr5[] rr5VarArr, long j, long j2, zp8 zp8Var) {
        rr5 rr5Var = rr5VarArr[0];
        this.Y0 = rr5Var;
        if (Objects.equals(rr5Var.p, "application/x-media3-cues")) {
            this.K0 = this.Y0.Q == 1 ? new ts8() : new s71(3);
            return;
        }
        H();
        if (this.O0 != null) {
            this.N0 = 1;
        } else {
            L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02bc A[Catch: z7e -> 0x027d, TryCatch #1 {z7e -> 0x027d, blocks: (B:116:0x0263, B:118:0x0267, B:120:0x026b, B:123:0x027a, B:126:0x0280, B:128:0x0284, B:130:0x0293, B:132:0x029a, B:137:0x02a5, B:139:0x02ab, B:151:0x02cf, B:153:0x02d6, B:155:0x02dc, B:161:0x02fc, B:156:0x02e2, B:159:0x02e9, B:146:0x02bc, B:148:0x02c8), top: B:169:0x0263 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02c8 A[Catch: z7e -> 0x027d, TryCatch #1 {z7e -> 0x027d, blocks: (B:116:0x0263, B:118:0x0267, B:120:0x026b, B:123:0x027a, B:126:0x0280, B:128:0x0284, B:130:0x0293, B:132:0x029a, B:137:0x02a5, B:139:0x02ab, B:151:0x02cf, B:153:0x02d6, B:155:0x02dc, B:161:0x02fc, B:156:0x02e2, B:159:0x02e9, B:146:0x02bc, B:148:0x02c8), top: B:169:0x0263 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[LOOP:0: B:42:0x00db->B:44:0x00e1, LOOP_END] */
    @Override // defpackage.hu0
    public final void z(long j, long j2) {
        boolean z;
        long j3;
        long j4;
        boolean z2;
        long jF;
        tm3 tm3Var;
        int iY;
        ArrayList parcelableArrayList;
        t51 t51Var;
        dy6 dy6VarM;
        int i = 1;
        if (this.Y) {
            long j5 = this.a1;
            if (j5 != -9223372036854775807L && j >= j5) {
                N();
                this.X0 = true;
            }
        }
        if (this.X0) {
            return;
        }
        rr5 rr5Var = this.Y0;
        rr5Var.getClass();
        boolean zEquals = Objects.equals(rr5Var.p, "application/x-media3-cues");
        Handler handler = this.T0;
        boolean zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        fz3 fz3Var = this.V0;
        if (zEquals) {
            this.K0.getClass();
            if (!this.W0 && ((iY = y(fz3Var, (tm3Var = this.J0), 5)) != -3 || tm3Var.d(4))) {
                if (iY != -4 || tm3Var.d(4)) {
                    if (iY == -4 || iY == -3) {
                        long j6 = this.G0;
                        long j7 = j - this.y;
                        if (j6 != -9223372036854775807L && j7 >= j6 - 1000000) {
                            if (y(fz3Var, tm3Var, 0) == -4) {
                                if (tm3Var.d(4)) {
                                    this.W0 = true;
                                } else {
                                    tm3Var.i();
                                    ByteBuffer byteBuffer = tm3Var.e;
                                    byteBuffer.getClass();
                                    long j8 = tm3Var.g;
                                    byte[] bArrArray = byteBuffer.array();
                                    int iArrayOffset = byteBuffer.arrayOffset();
                                    int iLimit = byteBuffer.limit();
                                    this.I0.getClass();
                                    Parcel parcelObtain = Parcel.obtain();
                                    parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                                    parcelObtain.setDataPosition(0);
                                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                                    parcelObtain.recycle();
                                    parcelableArrayList = bundle.getParcelableArrayList("c");
                                    parcelableArrayList.getClass();
                                    t51Var = new t51(i);
                                    dy6VarM = jy6.m();
                                    for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                                        bundle2.getClass();
                                        dy6VarM.b(t51Var.apply(bundle2));
                                    }
                                    w03 w03Var = new w03(j8, bundle.getLong("d"), dy6VarM.g());
                                    tm3Var.e();
                                    zB = this.K0.b(w03Var, j);
                                }
                            }
                        }
                    } else if (y(fz3Var, tm3Var, 0) == -4) {
                        if (tm3Var.d(4)) {
                            this.W0 = true;
                        } else {
                            tm3Var.i();
                            ByteBuffer byteBuffer2 = tm3Var.e;
                            byteBuffer2.getClass();
                            long j9 = tm3Var.g;
                            byte[] bArrArray2 = byteBuffer2.array();
                            int iArrayOffset2 = byteBuffer2.arrayOffset();
                            int iLimit2 = byteBuffer2.limit();
                            this.I0.getClass();
                            Parcel parcelObtain2 = Parcel.obtain();
                            parcelObtain2.unmarshall(bArrArray2, iArrayOffset2, iLimit2);
                            parcelObtain2.setDataPosition(0);
                            Bundle bundle3 = parcelObtain2.readBundle(Bundle.class.getClassLoader());
                            parcelObtain2.recycle();
                            parcelableArrayList = bundle3.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            t51Var = new t51(i);
                            dy6VarM = jy6.m();
                            while (i2 < parcelableArrayList.size()) {
                                Bundle bundle4 = (Bundle) parcelableArrayList.get(i2);
                                bundle4.getClass();
                                dy6VarM.b(t51Var.apply(bundle4));
                            }
                            w03 w03Var2 = new w03(j9, bundle3.getLong("d"), dy6VarM.g());
                            tm3Var.e();
                            zB = this.K0.b(w03Var2, j);
                        }
                    }
                } else if (j >= tm3Var.g - 1000000) {
                    if (y(fz3Var, tm3Var, 0) == -4) {
                        if (tm3Var.d(4)) {
                            this.W0 = true;
                        } else {
                            tm3Var.i();
                            ByteBuffer byteBuffer3 = tm3Var.e;
                            byteBuffer3.getClass();
                            long j10 = tm3Var.g;
                            byte[] bArrArray3 = byteBuffer3.array();
                            int iArrayOffset3 = byteBuffer3.arrayOffset();
                            int iLimit3 = byteBuffer3.limit();
                            this.I0.getClass();
                            Parcel parcelObtain3 = Parcel.obtain();
                            parcelObtain3.unmarshall(bArrArray3, iArrayOffset3, iLimit3);
                            parcelObtain3.setDataPosition(0);
                            Bundle bundle5 = parcelObtain3.readBundle(Bundle.class.getClassLoader());
                            parcelObtain3.recycle();
                            parcelableArrayList = bundle5.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            t51Var = new t51(i);
                            dy6VarM = jy6.m();
                            while (i2 < parcelableArrayList.size()) {
                                Bundle bundle6 = (Bundle) parcelableArrayList.get(i2);
                                bundle6.getClass();
                                dy6VarM.b(t51Var.apply(bundle6));
                            }
                            w03 w03Var3 = new w03(j10, bundle5.getLong("d"), dy6VarM.g());
                            tm3Var.e();
                            zB = this.K0.b(w03Var3, j);
                        }
                    }
                }
            }
            long jA = this.K0.a(this.Z0);
            if (jA == Long.MIN_VALUE && this.W0 && !zB) {
                this.X0 = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j) {
                zB = true;
            }
            if (zB) {
                jy6 jy6VarC = this.K0.c(j);
                long jD = this.K0.d(j);
                K(jD);
                u03 u03Var = new u03(jy6VarC);
                if (handler != null) {
                    handler.obtainMessage(1, u03Var).sendToTarget();
                } else {
                    M(u03Var);
                }
                this.K0.e(jD);
            }
            this.Z0 = j;
            return;
        }
        H();
        this.Z0 = j;
        if (this.R0 == null) {
            y7e y7eVar = this.O0;
            y7eVar.getClass();
            y7eVar.c(j);
            try {
                y7e y7eVar2 = this.O0;
                y7eVar2.getClass();
                this.R0 = (cv1) y7eVar2.d();
            } catch (z7e e) {
                xo1.y("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y0, e);
                I();
                N();
                y7e y7eVar3 = this.O0;
                y7eVar3.getClass();
                y7eVar3.a();
                this.O0 = null;
                this.N0 = 0;
                L();
                return;
            }
        }
        if (this.v != 2) {
            return;
        }
        if (this.Q0 != null) {
            long J = J();
            z = false;
            while (J <= j) {
                this.S0++;
                J = J();
                z = true;
            }
        } else {
            z = false;
        }
        cv1 cv1Var = this.R0;
        boolean z3 = z;
        if (cv1Var != null) {
            if (cv1Var.d(4)) {
                if (!z) {
                    z3 = z;
                    if (J() == Long.MAX_VALUE) {
                        if (this.N0 == 2) {
                            N();
                            y7e y7eVar4 = this.O0;
                            y7eVar4.getClass();
                            y7eVar4.a();
                            this.O0 = null;
                            this.N0 = 0;
                            L();
                        } else {
                            N();
                            this.X0 = true;
                        }
                    }
                }
            } else if (cv1Var.c <= j) {
                cv1 cv1Var2 = this.Q0;
                if (cv1Var2 != null) {
                    z3 = z;
                    z3 = z;
                    cv1Var2.g();
                }
                z3 = z;
                z3 = z;
                this.S0 = cv1Var.c(j);
                this.Q0 = cv1Var;
                this.R0 = null;
                z3 = true;
            }
        }
        if (z3) {
            z3 = z;
            z3 = z;
            this.Q0.getClass();
            int iC = this.Q0.c(j);
            if (iC == 0 || this.Q0.l() == 0) {
                jF = this.Q0.c;
            } else {
                cv1 cv1Var3 = this.Q0;
                jF = iC == -1 ? cv1Var3.f(cv1Var3.l() - 1) : cv1Var3.f(iC - 1);
            }
            K(jF);
            u03 u03Var2 = new u03(this.Q0.j(j));
            if (handler != null) {
                handler.obtainMessage(1, u03Var2).sendToTarget();
            } else {
                M(u03Var2);
            }
        }
        z3 = z;
        z3 = z;
        if (this.N0 == 2) {
            return;
        }
        while (!this.W0) {
            try {
                b8e b8eVar = this.P0;
                if (b8eVar == null) {
                    y7e y7eVar5 = this.O0;
                    y7eVar5.getClass();
                    b8eVar = (b8e) y7eVar5.e();
                    if (b8eVar == null) {
                        return;
                    } else {
                        this.P0 = b8eVar;
                    }
                }
                if (this.N0 == 1) {
                    b8eVar.b = 4;
                    y7e y7eVar6 = this.O0;
                    y7eVar6.getClass();
                    y7eVar6.f(b8eVar);
                    this.P0 = null;
                    this.N0 = 2;
                    return;
                }
                int iY2 = y(fz3Var, b8eVar, 5);
                if (iY2 == -3 && !b8eVar.d(4)) {
                    return;
                }
                int i3 = -4;
                if (iY2 != -4) {
                    if (iY2 != i3 || iY2 == -3) {
                        j3 = this.G0;
                        j4 = j - this.y;
                        if (j3 == -9223372036854775807L) {
                            return;
                        }
                        if (j4 < j3 - 1000000) {
                            return;
                        }
                    }
                } else if (b8eVar.d(4)) {
                    i3 = -4;
                    if (iY2 != i3) {
                        j3 = this.G0;
                        j4 = j - this.y;
                        if (j3 == -9223372036854775807L) {
                            return;
                        }
                        if (j4 < j3 - 1000000) {
                            return;
                        }
                    } else {
                        j3 = this.G0;
                        j4 = j - this.y;
                        if (j3 == -9223372036854775807L) {
                            return;
                        }
                        if (j4 < j3 - 1000000) {
                            return;
                        }
                    }
                } else if (j < b8eVar.g - 1000000) {
                    return;
                }
                int iY3 = y(fz3Var, b8eVar, 0);
                if (iY3 == -4) {
                    if (b8eVar.d(4)) {
                        this.W0 = true;
                        this.M0 = false;
                        z2 = false;
                    } else {
                        rr5 rr5Var2 = (rr5) fz3Var.c;
                        if (rr5Var2 == null) {
                            return;
                        }
                        b8eVar.x = rr5Var2.u;
                        b8eVar.i();
                        z2 = this.M0 & (!b8eVar.d(1));
                        this.M0 = z2;
                    }
                    if (!z2) {
                        y7e y7eVar7 = this.O0;
                        y7eVar7.getClass();
                        y7eVar7.f(b8eVar);
                        this.P0 = null;
                    }
                } else if (iY3 == -3) {
                    return;
                }
            } catch (z7e e2) {
                xo1.y("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.Y0, e2);
                I();
                N();
                y7e y7eVar8 = this.O0;
                y7eVar8.getClass();
                y7eVar8.a();
                this.O0 = null;
                this.N0 = 0;
                L();
                return;
            }
        }
    }
}
