package defpackage;

import io.sentry.android.replay.capture.v;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gs6 implements Closeable {
    public static final Logger d;
    public final yhb a;
    public final fs6 b;
    public final gr6 c;

    static {
        Logger logger = Logger.getLogger(wr6.class.getName());
        logger.getClass();
        d = logger;
    }

    public gs6(yhb yhbVar) {
        this.a = yhbVar;
        fs6 fs6Var = new fs6(yhbVar);
        this.b = fs6Var;
        this.c = new gr6(fs6Var);
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:196:0x02ea A[Catch: all -> 0x02f0, TRY_LEAVE, TryCatch #0 {, blocks: (B:194:0x02e4, B:196:0x02ea), top: B:226:0x02e4 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:226:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c  */
    public final boolean b(boolean z, n5 n5Var) throws Exception {
        ds6 ds6Var;
        ks6 ks6VarL;
        a71 a71VarX;
        ds6 ds6Var2;
        try {
            this.a.h0(9L);
            int iN = ieg.n(this.a);
            if (iN > 16384) {
                yg5.m(tec.e(iN, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int iU = this.a.u() & 255;
            byte bU = this.a.u();
            int i = bU & 255;
            int iE = this.a.E();
            int i2 = Integer.MAX_VALUE & iE;
            int i3 = 1;
            if (iU != 8) {
                Logger logger = d;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(wr6.b(true, i2, iN, iU, i));
                }
            }
            if (z && iU != 4) {
                v.b(wr6.a(iU), "Expected a SETTINGS frame but was ");
                return false;
            }
            ay4 ay4Var = null;
            switch (iU) {
                case 0:
                    h(n5Var, iN, i, i2);
                    return true;
                case 1:
                    u(n5Var, iN, i, i2);
                    return true;
                case 2:
                    if (iN != 5) {
                        yg5.m(tec.f(iN, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i2 == 0) {
                        yg5.m("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    yhb yhbVar = this.a;
                    yhbVar.E();
                    yhbVar.u();
                    return true;
                case 3:
                    if (iN != 4) {
                        yg5.m(tec.f(iN, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i2 == 0) {
                        yg5.m("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int iE2 = this.a.E();
                    ay4.a.getClass();
                    for (ay4 ay4Var2 : ay4.values()) {
                        if (ay4Var2.a() == iE2) {
                            ay4Var = ay4Var2;
                            if (ay4Var != null) {
                                yg5.m(tec.e(iE2, "TYPE_RST_STREAM unexpected error code: "));
                                return false;
                            }
                            ds6Var = (ds6) n5Var.b;
                            if (i2 == 0 && (iE & 1) == 0) {
                                jle.b(ds6Var.w, ds6Var.c + '[' + i2 + "] onReset", new zr6(ds6Var, i2, ay4Var, i3));
                                return true;
                            }
                            ks6VarL = ds6Var.l(i2);
                            if (ks6VarL != null) {
                                synchronized (ks6VarL) {
                                    if (ks6VarL.g() == null) {
                                        ks6VarL.z = ay4Var;
                                        ks6VarL.notifyAll();
                                    }
                                    break;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    if (ay4Var != null) {
                        yg5.m(tec.e(iE2, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    ds6Var = (ds6) n5Var.b;
                    if (i2 == 0) {
                    }
                    ks6VarL = ds6Var.l(i2);
                    if (ks6VarL != null) {
                        synchronized (ks6VarL) {
                            if (ks6VarL.g() == null) {
                                ks6VarL.z = ay4Var;
                                ks6VarL.notifyAll();
                                break;
                            }
                            return true;
                        }
                    }
                    return true;
                case 4:
                    yhb yhbVar2 = this.a;
                    if (i2 != 0) {
                        yg5.m("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((bU & 1) != 0) {
                        if (iN != 0) {
                            yg5.m("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iN % 6 != 0) {
                        yg5.m(tec.e(iN, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    r3d r3dVar = new r3d();
                    x67 x67VarX = mh3.X(mh3.c0(0, iN), 6);
                    int i4 = x67VarX.a;
                    int i5 = x67VarX.b;
                    int i6 = x67VarX.c;
                    if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                        while (true) {
                            short sR = yhbVar2.R();
                            byte[] bArr = ieg.a;
                            int i7 = sR & 65535;
                            int iE3 = yhbVar2.E();
                            if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 == 5 && (iE3 < 16384 || iE3 > 16777215)) {
                                        yg5.m(tec.e(iE3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return false;
                                    }
                                } else if (iE3 < 0) {
                                    yg5.m("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (iE3 != 0 && iE3 != 1) {
                                yg5.m("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            r3dVar.b(i7, iE3);
                            if (i4 != i5) {
                                i4 += i6;
                            }
                        }
                    }
                    ds6 ds6Var3 = (ds6) n5Var.b;
                    jle.b(ds6Var3.v, ks0.l(new StringBuilder(), ds6Var3.c, " applyAndAckSettings"), new jf6(9, n5Var, r3dVar));
                    return true;
                case 5:
                    x(n5Var, iN, i, i2);
                    return true;
                case 6:
                    if (iN != 8) {
                        yg5.m(tec.e(iN, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i2 != 0) {
                        yg5.m("TYPE_PING streamId != 0");
                        return false;
                    }
                    final int iE4 = this.a.E();
                    final int iE5 = this.a.E();
                    i = (bU & 1) != 0 ? 1 : 0;
                    ds6 ds6Var4 = (ds6) n5Var.b;
                    if (i == 0) {
                        jle jleVar = ds6Var4.v;
                        String strL = ks0.l(new StringBuilder(), ((ds6) n5Var.b).c, " ping");
                        final ds6 ds6Var5 = (ds6) n5Var.b;
                        jle.b(jleVar, strL, new x16() { // from class: cs6
                            @Override // defpackage.x16
                            public final Object invoke() {
                                ds6 ds6Var6 = ds6Var5;
                                try {
                                    ds6Var6.L0.E(iE4, iE5, true);
                                } catch (IOException e) {
                                    ay4 ay4Var3 = ay4.PROTOCOL_ERROR;
                                    ds6Var6.b(ay4Var3, ay4Var3, e);
                                }
                                return wef.a;
                            }
                        });
                        return true;
                    }
                    synchronized (ds6Var4) {
                        try {
                            if (iE4 == 1) {
                                ds6Var4.z++;
                            } else if (iE4 == 2) {
                                ds6Var4.Y++;
                            } else if (iE4 == 3) {
                                ds6Var4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iN < 8) {
                        yg5.m(tec.e(iN, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i2 != 0) {
                        yg5.m("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int iE6 = this.a.E();
                    int iE7 = this.a.E();
                    int i8 = iN - 8;
                    ay4.a.getClass();
                    for (ay4 ay4Var3 : ay4.values()) {
                        if (ay4Var3.a() == iE7) {
                            ay4Var = ay4Var3;
                            if (ay4Var != null) {
                                yg5.m(tec.e(iE7, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                            a71VarX = a71.c;
                            if (i8 > 0) {
                                a71VarX = this.a.x(i8);
                            }
                            a71VarX.getClass();
                            a71VarX.e();
                            ds6Var2 = (ds6) n5Var.b;
                            synchronized (ds6Var2) {
                                Object[] array = ds6Var2.b.values().toArray(new ks6[0]);
                                ds6Var2.f = true;
                            }
                            for (ks6 ks6Var : (ks6[]) array) {
                                if (ks6Var.a <= iE6 && ks6Var.h()) {
                                    ay4 ay4Var4 = ay4.REFUSED_STREAM;
                                    synchronized (ks6Var) {
                                        if (ks6Var.g() == null) {
                                            ks6Var.z = ay4Var4;
                                            ks6Var.notifyAll();
                                        }
                                        break;
                                    }
                                    ((ds6) n5Var.b).l(ks6Var.a);
                                }
                            }
                            return true;
                        }
                    }
                    if (ay4Var != null) {
                        yg5.m(tec.e(iE7, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    a71VarX = a71.c;
                    if (i8 > 0) {
                        a71VarX = this.a.x(i8);
                    }
                    a71VarX.getClass();
                    a71VarX.e();
                    ds6Var2 = (ds6) n5Var.b;
                    synchronized (ds6Var2) {
                        Object[] array2 = ds6Var2.b.values().toArray(new ks6[0]);
                        ds6Var2.f = true;
                        while (i < r13) {
                            if (ks6Var.a <= iE6) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iN != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iN);
                        }
                        long jE = ((long) this.a.E()) & 2147483647L;
                        if (jE == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = d;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(wr6.c(i2, iN, jE, true));
                        }
                        ds6 ds6Var6 = (ds6) n5Var.b;
                        if (i2 == 0) {
                            synchronized (ds6Var6) {
                                ds6Var6.J0 += jE;
                                ds6Var6.notifyAll();
                            }
                            return true;
                        }
                        ks6 ks6VarH = ds6Var6.h(i2);
                        if (ks6VarH != null) {
                            synchronized (ks6VarH) {
                                ks6VarH.e += jE;
                                if (jE > 0) {
                                    ks6VarH.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        d.fine(wr6.b(true, i2, iN, 8, i));
                        throw e;
                    }
                default:
                    this.a.k0(iN);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final void h(n5 n5Var, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            yg5.m("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = true;
        if ((i2 & 1) == 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            yg5.m("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bU = this.a.u();
            byte[] bArr = ieg.a;
            i4 = bU & 255;
        } else {
            i4 = 0;
        }
        int iD = ok8.D(i, i2, i4);
        yhb yhbVar = this.a;
        ds6 ds6Var = (ds6) n5Var.b;
        if (i3 != 0 && (i3 & 1) == 0) {
            f41 f41Var = new f41();
            long j = iD;
            yhbVar.h0(j);
            yhbVar.c0(f41Var, j);
            jle.b(ds6Var.w, ds6Var.c + '[' + i3 + "] onData", new yr6(ds6Var, i3, f41Var, iD, z3));
        } else {
            ks6 ks6VarH = ds6Var.h(i3);
            if (ks6VarH == null) {
                ((ds6) n5Var.b).G(i3, ay4.PROTOCOL_ERROR);
                long j2 = iD;
                ((ds6) n5Var.b).x(j2);
                yhbVar.k0(j2);
            } else {
                TimeZone timeZone = keg.a;
                is6 is6Var = ks6VarH.v;
                long j3 = iD;
                is6Var.getClass();
                long j4 = j3;
                while (true) {
                    ks6 ks6Var = is6Var.f;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = keg.a;
                        ks6Var.b.x(j3);
                        is6Var.f.b.E0.getClass();
                        break;
                    }
                    synchronized (ks6Var) {
                        z = is6Var.b;
                        z2 = is6Var.d.b + j4 > is6Var.a;
                    }
                    if (z2) {
                        yhbVar.k0(j4);
                        is6Var.f.f(ay4.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z) {
                        yhbVar.k0(j4);
                        break;
                    }
                    long jC0 = yhbVar.c0(is6Var.c, j4);
                    if (jC0 == -1) {
                        throw new EOFException();
                    }
                    j4 -= jC0;
                    ks6 ks6Var2 = is6Var.f;
                    synchronized (ks6Var2) {
                        try {
                            if (is6Var.e) {
                                is6Var.c.b();
                            } else {
                                f41 f41Var2 = is6Var.d;
                                boolean z4 = f41Var2.b == 0;
                                f41Var2.h1(is6Var.c);
                                if (z4) {
                                    ks6Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    ks6VarH.j(si6.b, true);
                }
            }
        }
        this.a.k0(i4);
    }

    public final List l(int i, int i2, int i3, int i4) throws IOException {
        fs6 fs6Var = this.b;
        fs6Var.d = i;
        fs6Var.e = i2;
        fs6Var.b = i3;
        fs6Var.c = i4;
        gr6 gr6Var = this.c;
        yhb yhbVar = gr6Var.d;
        while (!yhbVar.b()) {
            byte bU = yhbVar.u();
            byte[] bArr = ieg.a;
            int i5 = bU & 255;
            if (i5 == 128) {
                yg5.m("index == 0");
                return null;
            }
            if ((bU & 128) == 128) {
                int iF = gr6Var.f(i5, 127);
                int i6 = iF - 1;
                if (i6 >= 0) {
                    oi6[] oi6VarArr = ir6.a;
                    if (i6 <= oi6VarArr.length - 1) {
                        gr6Var.a(oi6VarArr[i6]);
                    }
                }
                int length = gr6Var.f + 1 + (i6 - ir6.a.length);
                if (length >= 0) {
                    oi6[] oi6VarArr2 = gr6Var.e;
                    if (length < oi6VarArr2.length) {
                        oi6 oi6Var = oi6VarArr2[length];
                        oi6Var.getClass();
                        gr6Var.a(oi6Var);
                    }
                }
                yg5.m(tec.e(iF, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                oi6[] oi6VarArr3 = ir6.a;
                a71 a71VarE = gr6Var.e();
                ir6.a(a71VarE);
                gr6Var.d(new oi6(a71VarE, gr6Var.e()));
            } else if ((bU & 64) == 64) {
                gr6Var.d(new oi6(gr6Var.c(gr6Var.f(i5, 63) - 1), gr6Var.e()));
            } else if ((bU & 32) == 32) {
                int iF2 = gr6Var.f(i5, 31);
                gr6Var.a = iF2;
                if (iF2 < 0 || iF2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + gr6Var.a);
                }
                int i7 = gr6Var.h;
                if (iF2 < i7) {
                    if (iF2 == 0) {
                        oi6[] oi6VarArr4 = gr6Var.e;
                        qd0.h0(0, oi6VarArr4.length, null, oi6VarArr4);
                        gr6Var.f = gr6Var.e.length - 1;
                        gr6Var.g = 0;
                        gr6Var.h = 0;
                    } else {
                        gr6Var.b(i7 - iF2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                oi6[] oi6VarArr5 = ir6.a;
                a71 a71VarE2 = gr6Var.e();
                ir6.a(a71VarE2);
                gr6Var.a(new oi6(a71VarE2, gr6Var.e()));
            } else {
                gr6Var.a(new oi6(gr6Var.c(gr6Var.f(i5, 15) - 1), gr6Var.e()));
            }
        }
        ArrayList arrayList = gr6Var.b;
        List listJ1 = s72.j1(arrayList);
        arrayList.clear();
        gr6Var.c = 0L;
        return listJ1;
    }

    public final void u(n5 n5Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            yg5.m("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte bU = this.a.u();
            byte[] bArr = ieg.a;
            i4 = bU & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            yhb yhbVar = this.a;
            yhbVar.E();
            yhbVar.u();
            byte[] bArr2 = ieg.a;
            i -= 5;
        }
        List listL = l(ok8.D(i, i2, i4), i4, i2, i3);
        ds6 ds6Var = (ds6) n5Var.b;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            jle.b(ds6Var.w, ds6Var.c + '[' + i3 + "] onHeaders", new zr6(ds6Var, i3, listL, z2));
            return;
        }
        synchronized (ds6Var) {
            ks6 ks6VarH = ds6Var.h(i3);
            if (ks6VarH != null) {
                ks6VarH.j(keg.h(listL), z2);
                return;
            }
            if (ds6Var.f) {
                return;
            }
            if (i3 <= ds6Var.d) {
                return;
            }
            if (i3 % 2 == ds6Var.e % 2) {
                return;
            }
            ks6 ks6Var = new ks6(i3, ds6Var, false, z2, keg.h(listL));
            ds6Var.d = i3;
            ds6Var.b.put(Integer.valueOf(i3), ks6Var);
            jle.b(ds6Var.g.d(), ds6Var.c + '[' + i3 + "] onStream", new jf6(8, ds6Var, ks6Var));
        }
    }

    public final void x(n5 n5Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            yg5.m("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte bU = this.a.u();
            byte[] bArr = ieg.a;
            i4 = bU & 255;
        } else {
            i4 = 0;
        }
        int iE = this.a.E() & Integer.MAX_VALUE;
        List listL = l(ok8.D(i - 4, i2, i4), i4, i2, i3);
        ds6 ds6Var = (ds6) n5Var.b;
        synchronized (ds6Var) {
            if (ds6Var.N0.contains(Integer.valueOf(iE))) {
                ds6Var.G(iE, ay4.PROTOCOL_ERROR);
                return;
            }
            ds6Var.N0.add(Integer.valueOf(iE));
            jle.b(ds6Var.w, ds6Var.c + '[' + iE + "] onRequest", new zr6(ds6Var, iE, listL, i5));
        }
    }
}
