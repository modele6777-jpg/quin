package defpackage;

import ai.askquin.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import tech.chatmind.api.events.model.PopupAction;
import tech.chatmind.api.events.model.PopupActionType;
import tech.chatmind.api.events.model.PopupTracking;
import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class db6 {
    public static final rc0 a = new rc0(0);
    public static final rc0 b = new rc0(1);
    public static final dd2 c = new dd2(new kd2(9), false, 626549703);
    public static final dd2 d = new dd2(new yd2(19), false, -236847979);
    public static final dd2 e = new dd2(new xd2(29), false, 1193291084);
    public static final dd2 f = new dd2(new ie2(2), false, -697370414);
    public static final kaf g = new kaf(false, 8);
    public static final za5 h;
    public static final za5 i;
    public static final za5[] j;
    public static int k = 5;

    static {
        za5 za5Var = new za5("CLIENT_TELEMETRY", 1L);
        h = za5Var;
        za5 za5Var2 = new za5("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        i = za5Var2;
        j = new za5[]{za5Var, za5Var2};
    }

    public static boolean A(d0a d0aVar, bi5 bi5Var, int i2, d82 d82Var) {
        long jB = d0aVar.B();
        long j2 = jB >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        int i3 = (int) ((jB >> 12) & 15);
        int i4 = (int) ((jB >> 8) & 15);
        int i5 = (int) ((jB >> 4) & 15);
        int i6 = (int) ((jB >> 1) & 7);
        boolean z2 = (jB & 1) == 1;
        if (i5 <= 7) {
            if (i5 != bi5Var.g - 1) {
                return false;
            }
        } else if (i5 > 10 || bi5Var.g != 2) {
            return false;
        }
        if (!(i6 == 0 || i6 == bi5Var.i) || z2) {
            return false;
        }
        try {
            long jH = d0aVar.H();
            if (!z) {
                jH *= (long) bi5Var.b;
            }
            long j3 = bi5Var.j;
            if (j3 != 0 && jH > j3) {
                return false;
            }
            d82Var.b = jH;
            int iF0 = F0(i3, d0aVar);
            long j4 = bi5Var.j;
            boolean z3 = j4 == 0 || jH + ((long) iF0) >= j4;
            if (iF0 == -1) {
                return false;
            }
            if ((!z3 && iF0 < bi5Var.a) || iF0 > bi5Var.b) {
                return false;
            }
            int i7 = bi5Var.e;
            if (i4 != 0) {
                if (i4 <= 11) {
                    if (i4 != bi5Var.f) {
                        return false;
                    }
                } else if (i4 != 12) {
                    if (i4 > 14) {
                        return false;
                    }
                    int iG = d0aVar.G();
                    if (i4 == 14) {
                        iG *= 10;
                    }
                    if (iG != i7) {
                        return false;
                    }
                } else if (d0aVar.z() * 1000 != i7) {
                    return false;
                }
            }
            int iZ = d0aVar.z();
            int i8 = d0aVar.b;
            byte[] bArr = d0aVar.a;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = d0aVar.b; i11 < i9; i11++) {
                i10 = pqf.j[i10 ^ (bArr[i11] & 255)];
            }
            String str = pqf.a;
            if (iZ != i10) {
                return false;
            }
            if (d0aVar.a() != 0) {
                int iJ = d0aVar.j();
                if ((iJ & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    return false;
                }
                int i12 = (iJ & 126) >> 1;
                if ((i12 >= 2 && i12 <= 7) || (i12 >= 13 && i12 <= 31)) {
                    xo1.D("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i12);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final nz9 A0(Object... objArr) {
        return new nz9(2, new ArrayList(new yc0(objArr, false)));
    }

    public static byte[] B(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static Collection B0(x22 x22Var, w4c w4cVar) {
        k7f k7fVarG = x22Var.G(w4cVar);
        if (k7fVarG instanceof h77) {
            return ((h77) k7fVarG).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(w4cVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
        return null;
    }

    public static jgf C(x22 x22Var, w4c w4cVar, w4c w4cVar2) {
        w4cVar.getClass();
        w4cVar2.getClass();
        if (!(w4cVar instanceof tjd)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(x22Var);
            sb.append(", ");
            qc0.o(tec.j(job.a, x22Var.getClass(), sb));
            return null;
        }
        if (w4cVar2 instanceof tjd) {
            return rxg.E((tjd) w4cVar, (tjd) w4cVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(x22Var);
        sb2.append(", ");
        qc0.o(tec.j(job.a, x22Var.getClass(), sb2));
        return null;
    }

    public static i8f C0(ep1 ep1Var) {
        if (ep1Var instanceof ve9) {
            return ((ve9) ep1Var).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(ep1Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, ep1Var.getClass(), sb));
        return null;
    }

    public static void D(String str, String str2) {
        if (L0(3)) {
            Log.d(str, str2);
        }
    }

    public static byte[] D0(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                qc0.p(tec.e(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    public static String E(mf1 mf1Var, Integer num) {
        if (num == null) {
            return null;
        }
        try {
            if (num.intValue() == 1) {
                ig1.a("0");
                yg1 yg1VarB = mf1.b(mf1Var, "0");
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                key.getClass();
                Integer num2 = (Integer) ((nc1) yg1VarB).c(key);
                if (num2 != null && num2.intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0) {
                ig1.a("1");
                yg1 yg1VarB2 = mf1.b(mf1Var, "1");
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
                key2.getClass();
                Integer num3 = (Integer) ((nc1) yg1VarB2).c(key2);
                if (num3 != null && num3.intValue() == 0) {
                    return "0";
                }
            }
            return null;
        } catch (ag4 unused) {
            if (!b21.F(6, "CXCP")) {
                return null;
            }
            b1.d("CXCP", "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
            return null;
        }
    }

    public static byte[] E0(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static void F(String str, String str2) {
        if (L0(6)) {
            b1.d(str, str2);
        }
    }

    public static int F0(int i2, d0a d0aVar) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return d0aVar.z() + 1;
            case 7:
                return d0aVar.G() + 1;
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static void G(String str, String str2, Throwable th) {
        if (L0(6)) {
            b1.e(str, str2, th);
        }
    }

    public static long G0(InputStream inputStream, int i2) throws IOException {
        byte[] bArrD0 = D0(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrD0[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0035, B:25:0x0060, B:29:0x0077, B:31:0x007f, B:20:0x0051, B:24:0x005c), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r1.a(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0093 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H(defpackage.xj5 r7, defpackage.yv1 r8, boolean r9, defpackage.xn2 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.fk5
            if (r0 == 0) goto L13
            r0 = r10
            fk5 r0 = (defpackage.fk5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            fk5 r0 = new fk5
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L55
            if (r1 == r3) goto L43
            if (r1 != r2) goto L3d
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            k41 r7 = (defpackage.k41) r7
            java.lang.Object r8 = r0.L$1
            yv1 r8 = (defpackage.yv1) r8
            java.lang.Object r1 = r0.L$0
            xj5 r1 = (defpackage.xj5) r1
            defpackage.jzb.q(r10)     // Catch: java.lang.Throwable -> L3b
        L38:
            r10 = r7
            r7 = r1
            goto L60
        L3b:
            r7 = move-exception
            goto L9e
        L3d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r4
        L43:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            k41 r7 = (defpackage.k41) r7
            java.lang.Object r8 = r0.L$1
            yv1 r8 = (defpackage.yv1) r8
            java.lang.Object r1 = r0.L$0
            xj5 r1 = (defpackage.xj5) r1
            defpackage.jzb.q(r10)     // Catch: java.lang.Throwable -> L3b
            goto L77
        L55:
            defpackage.jzb.q(r10)
            boolean r10 = r7 instanceof defpackage.twe
            if (r10 != 0) goto Lb9
            k41 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L3b
        L60:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L3b
            r0.L$3 = r4     // Catch: java.lang.Throwable -> L3b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.label = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L3b
            if (r1 != r5) goto L73
            goto L95
        L73:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L3b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L96
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L3b
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L3b
            r0.L$3 = r4     // Catch: java.lang.Throwable -> L3b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.label = r2     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r1.a(r10, r0)     // Catch: java.lang.Throwable -> L3b
            if (r10 != r5) goto L38
        L95:
            return r5
        L96:
            if (r9 == 0) goto L9b
            r8.h(r4)
        L9b:
            wef r7 = defpackage.wef.a
            return r7
        L9e:
            throw r7     // Catch: java.lang.Throwable -> L9f
        L9f:
            r10 = move-exception
            if (r9 == 0) goto Lb8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto La9
            r4 = r7
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
        La9:
            if (r4 != 0) goto Lb5
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r4.<init>(r9)
            r4.initCause(r7)
        Lb5:
            r8.h(r4)
        Lb8:
            throw r10
        Lb9:
            twe r7 = (defpackage.twe) r7
            java.lang.Throwable r7 = r7.a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db6.H(xj5, yv1, boolean, xn2):java.lang.Object");
    }

    public static final a82 H0(int i2, o74 o74Var) {
        ntf ntfVar;
        fx3 fx3Var;
        a82 a82Var;
        er7 er7Var;
        dr7 dr7Var;
        a82 a82Var2 = new a82(15);
        u99 u99Var = (u99) o74Var.b;
        otf otfVar = (otf) o74Var.d;
        u99Var.getClass();
        otfVar.getClass();
        h0b h0bVar = (h0b) s72.y0(i2, otfVar.a);
        ntf ntfVar2 = ntf.d;
        if (h0bVar == null) {
            a82Var = null;
        } else {
            Integer numValueOf = h0bVar.B() ? Integer.valueOf(h0bVar.u()) : null;
            Integer numValueOf2 = h0bVar.C() ? Integer.valueOf(h0bVar.v()) : null;
            if (numValueOf2 != null) {
                ntfVar = new ntf(numValueOf2.intValue() & 255, (numValueOf2.intValue() >> 8) & 255, (numValueOf2.intValue() >> 16) & 255);
            } else {
                ntfVar = numValueOf != null ? new ntf(numValueOf.intValue() & 7, 15 & (numValueOf.intValue() >> 3), (numValueOf.intValue() >> 7) & 127) : ntfVar2;
            }
            f0b f0bVarS = h0bVar.s();
            f0bVarS.getClass();
            int iOrdinal = f0bVarS.ordinal();
            if (iOrdinal == 0) {
                fx3Var = fx3.a;
            } else if (iOrdinal == 1) {
                fx3Var = fx3.b;
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                fx3Var = fx3.c;
            }
            fx3 fx3Var2 = fx3Var;
            Integer numValueOf3 = h0bVar.x() ? Integer.valueOf(h0bVar.r()) : null;
            String string = h0bVar.A() ? u99Var.getString(h0bVar.t()) : null;
            g0b g0bVarW = h0bVar.w();
            g0bVarW.getClass();
            a82Var = new a82(ntfVar, g0bVarW, fx3Var2, numValueOf3, string, 23);
        }
        if (a82Var == null && !o74Var.a) {
            throw new e17("No VersionRequirement with the given id in the table", null);
        }
        g0b g0bVar = a82Var != null ? (g0b) a82Var.d : null;
        int i3 = g0bVar == null ? -1 : xdb.a[g0bVar.ordinal()];
        if (i3 == -1) {
            er7Var = er7.d;
        } else if (i3 == 1) {
            er7Var = er7.a;
        } else if (i3 == 2) {
            er7Var = er7.b;
        } else {
            if (i3 != 3) {
                ap.c();
                return null;
            }
            er7Var = er7.c;
        }
        fx3 fx3Var3 = a82Var != null ? (fx3) a82Var.b : null;
        int i4 = fx3Var3 == null ? -1 : xdb.b[fx3Var3.ordinal()];
        if (i4 == -1) {
            dr7Var = dr7.c;
        } else if (i4 == 1) {
            dr7Var = dr7.a;
        } else if (i4 != 2) {
            if (i4 != 3) {
                ap.c();
                return null;
            }
            dr7Var = dr7.c;
        } else {
            dr7Var = dr7.b;
        }
        a82Var2.c = er7Var;
        a82Var2.d = dr7Var;
        a82Var2.b = a82Var != null ? (Integer) a82Var.e : null;
        a82Var2.e = a82Var != null ? (String) a82Var.f : null;
        if (a82Var != null) {
            ntfVar2 = (ntf) a82Var.c;
        }
        a82Var2.f = new cr7(ntfVar2.a, ntfVar2.b, ntfVar2.c);
        return a82Var2;
    }

    public static final int I(rz7 rz7Var, Object obj, int i2) {
        int iE;
        return (obj == null || rz7Var.a() == 0 || (i2 < rz7Var.a() && obj.equals(rz7Var.b(i2))) || (iE = rz7Var.e(obj)) == -1) ? i2 : iE;
    }

    public static final void I0(pl1 pl1Var, xn2 xn2Var, boolean z) {
        Object objU = pl1Var.u();
        Throwable thD = pl1Var.d(objU);
        Object dzbVar = thD != null ? new dzb(thD) : pl1Var.f(objU);
        if (!z) {
            xn2Var.g(dzbVar);
            return;
        }
        xn2Var.getClass();
        z94 z94Var = (z94) xn2Var;
        zn2 zn2Var = z94Var.e;
        Object obj = z94Var.g;
        pv2 context = zn2Var.getContext();
        Object objC = dwe.c(context, obj);
        hbf hbfVarS = objC != dwe.a ? y7h.S(zn2Var, context, objC) : null;
        try {
            zn2Var.g(dzbVar);
        } finally {
            if (hbfVarS == null || hbfVarS.m0()) {
                dwe.a(context, objC);
            }
        }
    }

    public static d7f J(xt7 xt7Var, int i2) {
        xt7Var.getClass();
        if (xt7Var instanceof tt7) {
            return (d7f) ((tt7) xt7Var).Z().get(i2);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return null;
    }

    public static final long J0(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static List K(xt7 xt7Var) {
        xt7Var.getClass();
        if (xt7Var instanceof tt7) {
            return ((tt7) xt7Var).Z();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return null;
    }

    public static tt7 K0(q8f q8fVar, xt7 xt7Var) {
        q8fVar.getClass();
        xt7Var.getClass();
        if (xt7Var instanceof jgf) {
            return q8fVar.f((tt7) xt7Var, dsf.INVARIANT);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return null;
    }

    public static final int L(int i2) {
        return oi5.b(oi5.c.e(i2).booleanValue(), (j0b) oi5.d.e(i2), (fza) oi5.e.e(i2));
    }

    public static boolean L0(int i2) {
        return k <= i2;
    }

    public static final long M0(long j2, float f2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final String N(UserPopupEvent userPopupEvent) {
        userPopupEvent.getClass();
        return userPopupEvent.getId() + "|" + userPopupEvent.getStartAt().toInstant();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static w22 N0(x22 x22Var, w4c w4cVar) {
        if (w4cVar instanceof tjd) {
            tt7 tt7Var = (tt7) w4cVar;
            return new w22(x22Var, new q8f(l7f.b.g(tt7Var.c0(), tt7Var.Z())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(w4cVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
        return null;
    }

    public static int O() {
        hs3 hs3Var = xqa.s;
        return ((Number) z5c.I(nu4.a, new e70(hs3Var.a, hs3Var.b, null))).intValue();
    }

    public static Collection O0(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof j7f) {
            Collection collectionE = ((j7f) k7fVar).e();
            collectionE.getClass();
            return collectionE;
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return null;
    }

    public static final long P0(long j2) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j2 >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    public static e8f Q(k7f k7fVar, int i2) {
        if (k7fVar instanceof j7f) {
            Object obj = ((j7f) k7fVar).getParameters().get(i2);
            obj.getClass();
            return (e8f) obj;
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x02a4  */
    public static hq7 Q0(nya nyaVar, u99 u99Var, boolean z, int i2) {
        boolean z2 = false;
        boolean z3 = (i2 & 2) != 0 ? false : z;
        nyaVar.getClass();
        u99Var.getClass();
        hq7 hq7Var = new hq7();
        b0b b0bVarC0 = nyaVar.C0();
        b0bVarC0.getClass();
        bu3 bu3Var = new bu3(b0bVarC0);
        otf otfVar = otf.b;
        i0b i0bVarE0 = nyaVar.E0();
        i0bVarE0.getClass();
        o74 o74Var = new o74(u99Var, bu3Var, p8c.n(i0bVarE0), z3, pu4.a, 16);
        List listB0 = nyaVar.B0();
        listB0.getClass();
        o74 o74VarE = o74Var.e(listB0);
        u99 u99Var2 = (u99) o74VarE.b;
        List list = (List) o74VarE.h;
        bu3 bu3Var2 = (bu3) o74VarE.c;
        hq7Var.a = nyaVar.p0();
        hq7Var.b = n16.D(u99Var2, nyaVar.q0());
        List<a0b> listB1 = nyaVar.B0();
        listB1.getClass();
        for (a0b a0bVar : listB1) {
            a0bVar.getClass();
            hq7Var.c.add(W0(a0bVar, o74VarE));
        }
        Iterator it = feg.V(nyaVar, bu3Var2).iterator();
        while (it.hasNext()) {
            hq7Var.d.add(V0((vza) it.next(), o74VarE));
        }
        List listL0 = nyaVar.l0();
        listL0.getClass();
        Iterator it2 = listL0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            qya qyaVar = (qya) it2.next();
            qyaVar.getClass();
            lq7 lq7Var = new lq7(qyaVar.H());
            List<d0b> listI = qyaVar.I();
            listI.getClass();
            for (d0b d0bVar : listI) {
                d0bVar.getClass();
                lq7Var.b.add(X0(d0bVar, o74VarE));
            }
            List<Integer> listJ = qyaVar.J();
            listJ.getClass();
            for (Integer num : listJ) {
                num.getClass();
                lq7Var.c.add(H0(num.intValue(), o74VarE));
            }
            List<oya> listG = qyaVar.G();
            listG.getClass();
            for (oya oyaVar : listG) {
                lq7Var.d.put(u99Var2.getString(oyaVar.o()), oyaVar.n().o());
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((tk7) ((wu8) it3.next())).getClass();
                hk7 hk7VarB = cn1.B(lq7Var);
                List<kya> listF = qyaVar.F();
                listF.getClass();
                for (kya kyaVar : listF) {
                    kyaVar.getClass();
                    lq7Var.e.add(n16.S(kyaVar, u99Var2));
                }
                o85 o85Var = sl7.a;
                sk7 sk7VarA = sl7.a(qyaVar, u99Var2, bu3Var2);
                hk7VarB.a = sk7VarA != null ? new vk7(sk7VarA.G0, sk7VarA.H0) : null;
            }
            hq7Var.h.add(lq7Var);
        }
        List listR0 = nyaVar.r0();
        listR0.getClass();
        List listW0 = nyaVar.w0();
        listW0.getClass();
        List listA0 = nyaVar.A0();
        listA0.getClass();
        g1(hq7Var, listR0, listW0, listA0, o74VarE);
        if (nyaVar.F0()) {
            u99Var2.getString(nyaVar.j0());
        }
        List<Integer> listV0 = nyaVar.v0();
        listV0.getClass();
        for (Integer num2 : listV0) {
            num2.getClass();
            hq7Var.i.add(u99Var2.getString(num2.intValue()));
        }
        for (yya yyaVar : nyaVar.o0()) {
            if (!yyaVar.B()) {
                throw new e17("No name for EnumEntry", null);
            }
            hq7Var.j.add(u99Var2.getString(yyaVar.A()));
            w84 w84Var = new w84(u99Var2.getString(yyaVar.A()), 16);
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((tk7) ((wu8) it4.next())).getClass();
                for (kya kyaVar2 : yyaVar.z()) {
                    ArrayList arrayList = (ArrayList) w84Var.c;
                    kyaVar2.getClass();
                    arrayList.add(n16.S(kyaVar2, u99Var2));
                }
            }
            hq7Var.k.add(w84Var);
        }
        List<Integer> listX0 = nyaVar.x0();
        listX0.getClass();
        for (Integer num3 : listX0) {
            num3.getClass();
            hq7Var.l.add(n16.D(u99Var2, num3.intValue()));
        }
        if (nyaVar.I0()) {
            hq7Var.m = u99Var2.getString(nyaVar.s0());
        }
        vza vzaVarL = feg.L(nyaVar, bu3Var2);
        if (vzaVarL == null) {
            if (nyaVar.I0()) {
                List listW1 = nyaVar.w0();
                listW1.getClass();
                Iterator it5 = listW1.iterator();
                Object obj = null;
                while (true) {
                    if (!it5.hasNext()) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Object next = it5.next();
                    kza kzaVar = (kza) next;
                    kzaVar.getClass();
                    if (feg.Q(kzaVar, bu3Var2) == null && u99Var2.getString(kzaVar.t0()).equals(u99Var2.getString(nyaVar.s0()))) {
                        if (!z2) {
                            z2 = true;
                            obj = next;
                        }
                    }
                    obj = null;
                    break;
                }
                kza kzaVar2 = (kza) obj;
                if (kzaVar2 != null) {
                    vzaVarL = feg.S(kzaVar2, bu3Var2);
                } else {
                    vzaVarL = null;
                }
            } else {
                vzaVarL = null;
            }
        }
        hq7Var.n = vzaVarL != null ? V0(vzaVarL, o74VarE) : null;
        Iterator it6 = feg.A(nyaVar, bu3Var2).iterator();
        while (it6.hasNext()) {
            hq7Var.p.add(V0((vza) it6.next(), o74VarE));
        }
        List<Integer> listD0 = nyaVar.D0();
        listD0.getClass();
        for (Integer num4 : listD0) {
            num4.getClass();
            hq7Var.q.add(H0(num4.intValue(), o74VarE));
        }
        List<oya> listK0 = nyaVar.k0();
        listK0.getClass();
        for (oya oyaVar2 : listK0) {
            hq7Var.r.put(u99Var2.getString(oyaVar2.o()), oyaVar2.n().o());
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            ((tk7) ((wu8) it7.next())).getClass();
            fk7 fk7VarA = cn1.A(hq7Var);
            List<kya> listI0 = nyaVar.i0();
            listI0.getClass();
            for (kya kyaVar3 : listI0) {
                kyaVar3.getClass();
                hq7Var.o.add(n16.S(kyaVar3, u99Var2));
            }
            s56 s56Var = rl7.i;
            s56Var.getClass();
            Integer num5 = (Integer) vpf.F(nyaVar, s56Var);
            if (num5 != null) {
                u99Var2.getString(num5.intValue());
            }
            for (kza kzaVar3 : (List) nyaVar.m(rl7.h)) {
                ArrayList arrayList2 = fk7VarA.a;
                kzaVar3.getClass();
                arrayList2.add(U0(kzaVar3, o74VarE));
            }
            s56 s56Var2 = rl7.g;
            s56Var2.getClass();
            Integer num6 = (Integer) vpf.F(nyaVar, s56Var2);
            fk7VarA.b = num6 != null ? u99Var2.getString(num6.intValue()) : "main";
            s56 s56Var3 = rl7.j;
            s56Var3.getClass();
        }
        return hq7Var;
    }

    public static List R(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof j7f) {
            List parameters = ((j7f) k7fVar).getParameters();
            parameters.getClass();
            return parameters;
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return null;
    }

    public static final fz3 R0(bza bzaVar, o74 o74Var) {
        fz3 fz3Var = new fz3(15);
        vza vzaVarA = null;
        if (bzaVar.C()) {
            aza azaVarV = bzaVar.v();
            if (azaVarV == null) {
                qc0.j("Required value was null.");
                return null;
            }
            int iOrdinal = azaVarV.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                ap.c();
                return null;
            }
        }
        bu3 bu3Var = (bu3) o74Var.c;
        bu3Var.getClass();
        if (bzaVar.E()) {
            vzaVarA = bzaVar.x();
        } else if (bzaVar.F()) {
            vzaVarA = bu3Var.a(bzaVar.z());
        }
        if (vzaVarA != null) {
            V0(vzaVarA, o74Var);
        }
        List<bza> listU = bzaVar.u();
        listU.getClass();
        ArrayList arrayList = (ArrayList) fz3Var.b;
        for (bza bzaVar2 : listU) {
            bzaVar2.getClass();
            arrayList.add(R0(bzaVar2, o74Var));
        }
        List<bza> listA = bzaVar.A();
        listA.getClass();
        ArrayList arrayList2 = (ArrayList) fz3Var.c;
        for (bza bzaVar3 : listA) {
            bzaVar3.getClass();
            arrayList2.add(R0(bzaVar3, o74Var));
        }
        return fz3Var;
    }

    public static tt7 S(e8f e8fVar) {
        e8fVar.getClass();
        if (e8fVar instanceof c8f) {
            return o7c.q((c8f) e8fVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8fVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, e8fVar.getClass(), sb));
        return null;
    }

    public static final sq7 S0(dza dzaVar, o74 o74Var) {
        ArrayList arrayList;
        oq7 oq7Var;
        sq7 sq7Var = new sq7(dzaVar.f0(), ((u99) o74Var.b).getString(dzaVar.g0()));
        List listM0 = dzaVar.m0();
        listM0.getClass();
        o74 o74VarE = o74Var.e(listM0);
        u99 u99Var = (u99) o74VarE.b;
        bu3 bu3Var = (bu3) o74VarE.c;
        List<a0b> listM1 = dzaVar.m0();
        listM1.getClass();
        for (a0b a0bVar : listM1) {
            a0bVar.getClass();
            sq7Var.c.add(W0(a0bVar, o74VarE));
        }
        vza vzaVarP = feg.P(dzaVar, bu3Var);
        sq7Var.d = vzaVarP != null ? V0(vzaVarP, o74VarE) : null;
        List listA0 = dzaVar.a0();
        listA0.getClass();
        Iterator it = listA0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = sq7Var.g;
            if (!zHasNext) {
                break;
            }
            d0b d0bVar = (d0b) it.next();
            d0bVar.getClass();
            arrayList.add(X0(d0bVar, o74VarE));
        }
        if (dzaVar.a0().isEmpty()) {
            List listC0 = dzaVar.c0();
            listC0.getClass();
            if (!listC0.isEmpty()) {
                Iterator it2 = feg.B(dzaVar, bu3Var).iterator();
                while (it2.hasNext()) {
                    wq7 wq7VarV0 = V0((vza) it2.next(), o74VarE);
                    ar7 ar7Var = new ar7(0, "_");
                    ar7Var.c = wq7VarV0;
                    arrayList.add(ar7Var);
                }
            }
        }
        List<d0b> listO0 = dzaVar.o0();
        listO0.getClass();
        for (d0b d0bVar2 : listO0) {
            d0bVar2.getClass();
            sq7Var.f.add(X0(d0bVar2, o74VarE));
        }
        sq7Var.h = V0(feg.R(dzaVar, bu3Var), o74VarE);
        if (dzaVar.q0()) {
            sya syaVarD0 = dzaVar.d0();
            syaVarD0.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            for (wya wyaVar : syaVarD0.m()) {
                if (wyaVar.z()) {
                    uya uyaVarU = wyaVar.u();
                    if (uyaVarU == null) {
                        qc0.j("Required value was null.");
                        return null;
                    }
                    int iOrdinal = uyaVarU.ordinal();
                    if (iOrdinal == 0) {
                        oq7Var = oq7.a;
                    } else if (iOrdinal == 1) {
                        oq7Var = oq7.b;
                    } else if (iOrdinal == 2) {
                        oq7Var = oq7.c;
                    } else {
                        if (iOrdinal != 3) {
                            ap.c();
                            return null;
                        }
                        oq7Var = oq7.d;
                    }
                    if (wyaVar.A()) {
                        vya vyaVarV = wyaVar.v();
                        if (vyaVarV == null) {
                            qc0.j("Required value was null.");
                            return null;
                        }
                        int iOrdinal2 = vyaVarV.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                            ap.c();
                            return null;
                        }
                    }
                    nq7 nq7Var = new nq7(oq7Var);
                    List<bza> listT = wyaVar.t();
                    listT.getClass();
                    for (bza bzaVar : listT) {
                        bzaVar.getClass();
                        nq7Var.a.add(R0(bzaVar, o74VarE));
                    }
                    if (wyaVar.w()) {
                        bza bzaVarR = wyaVar.r();
                        bzaVarR.getClass();
                        R0(bzaVarR, o74VarE);
                    }
                    arrayList2.add(nq7Var);
                }
            }
        }
        List<Integer> listP0 = dzaVar.p0();
        listP0.getClass();
        for (Integer num : listP0) {
            num.getClass();
            sq7Var.i.add(H0(num.intValue(), o74VarE));
        }
        List<oya> listY = dzaVar.Y();
        listY.getClass();
        for (oya oyaVar : listY) {
            sq7Var.j.put(u99Var.getString(oyaVar.o()), oyaVar.n().o());
        }
        Iterator it3 = ((List) o74VarE.h).iterator();
        while (it3.hasNext()) {
            ((tk7) ((wu8) it3.next())).getClass();
            lk7 lk7VarC = cn1.C(sq7Var);
            List<kya> listX = dzaVar.X();
            listX.getClass();
            for (kya kyaVar : listX) {
                kyaVar.getClass();
                sq7Var.k.add(n16.S(kyaVar, u99Var));
            }
            List<kya> listE0 = dzaVar.e0();
            listE0.getClass();
            for (kya kyaVar2 : listE0) {
                kyaVar2.getClass();
                sq7Var.e.add(n16.S(kyaVar2, u99Var));
            }
            o85 o85Var = sl7.a;
            sk7 sk7VarC = sl7.c(dzaVar, u99Var, bu3Var);
            lk7VarC.a = sk7VarC != null ? new vk7(sk7VarC.G0, sk7VarC.H0) : null;
            s56 s56Var = rl7.c;
            s56Var.getClass();
            Integer num2 = (Integer) vpf.F(dzaVar, s56Var);
            if (num2 != null) {
                u99Var.getString(num2.intValue());
            }
        }
        return sq7Var;
    }

    public static jgf T(x22 x22Var, d7f d7fVar) {
        d7fVar.getClass();
        if (x22Var.n(d7fVar)) {
            return null;
        }
        if (d7fVar instanceof i8f) {
            return ((i8f) d7fVar).b().k0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(d7fVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, d7fVar.getClass(), sb));
        return null;
    }

    public static tq7 T0(hza hzaVar, u99 u99Var, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        hzaVar.getClass();
        u99Var.getClass();
        tq7 tq7Var = new tq7();
        b0b b0bVarH = hzaVar.H();
        b0bVarH.getClass();
        bu3 bu3Var = new bu3(b0bVarH);
        otf otfVar = otf.b;
        i0b i0bVarI = hzaVar.I();
        i0bVarI.getClass();
        o74 o74Var = new o74(u99Var, bu3Var, p8c.n(i0bVarI), z2, pu4.a, 16);
        List listE = hzaVar.E();
        listE.getClass();
        List listF = hzaVar.F();
        listF.getClass();
        List listG = hzaVar.G();
        listG.getClass();
        g1(tq7Var, listE, listF, listG, o74Var);
        Iterator it = ((List) o74Var.h).iterator();
        while (it.hasNext()) {
            ((tk7) ((wu8) it.next())).getClass();
            qq7 qq7Var = xk7.b;
            qq7Var.getClass();
            xk7 xk7Var = (xk7) y7h.N(tq7Var.d, qq7Var);
            for (kza kzaVar : (List) hzaVar.m(rl7.l)) {
                ArrayList arrayList = xk7Var.a;
                kzaVar.getClass();
                arrayList.add(U0(kzaVar, o74Var));
            }
            s56 s56Var = rl7.k;
            s56Var.getClass();
            Integer num = (Integer) vpf.F(hzaVar, s56Var);
            if (num != null) {
                ((u99) o74Var.b).getString(num.intValue());
            }
        }
        return tq7Var;
    }

    public static c8f U(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof j7f) {
            y22 y22VarM = ((j7f) k7fVar).m();
            if (y22VarM instanceof c8f) {
                return (c8f) y22VarM;
            }
            return null;
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return null;
    }

    public static final uq7 U0(kza kzaVar, o74 o74Var) {
        ArrayList arrayList;
        kzaVar.getClass();
        uq7 uq7Var = new uq7(((u99) o74Var.b).getString(kzaVar.t0()), kzaVar.p0(), kzaVar.H0() ? kzaVar.s0() : L(kzaVar.p0()), kzaVar.P0() ? kzaVar.B0() : L(kzaVar.p0()));
        List listD0 = kzaVar.D0();
        listD0.getClass();
        o74 o74VarE = o74Var.e(listD0);
        u99 u99Var = (u99) o74VarE.b;
        bu3 bu3Var = (bu3) o74VarE.c;
        List<a0b> listD1 = kzaVar.D0();
        listD1.getClass();
        for (a0b a0bVar : listD1) {
            a0bVar.getClass();
            uq7Var.e.add(W0(a0bVar, o74VarE));
        }
        vza vzaVarQ = feg.Q(kzaVar, bu3Var);
        uq7Var.f = vzaVarQ != null ? V0(vzaVarQ, o74VarE) : null;
        List listK0 = kzaVar.k0();
        listK0.getClass();
        Iterator it = listK0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = uq7Var.h;
            if (!zHasNext) {
                break;
            }
            d0b d0bVar = (d0b) it.next();
            d0bVar.getClass();
            arrayList.add(X0(d0bVar, o74VarE));
        }
        if (kzaVar.k0().isEmpty()) {
            List listM0 = kzaVar.m0();
            listM0.getClass();
            if (!listM0.isEmpty()) {
                Iterator it2 = feg.C(kzaVar, bu3Var).iterator();
                while (it2.hasNext()) {
                    wq7 wq7VarV0 = V0((vza) it2.next(), o74VarE);
                    ar7 ar7Var = new ar7(0, "_");
                    ar7Var.c = wq7VarV0;
                    arrayList.add(ar7Var);
                }
            }
        }
        if (kzaVar.Q0()) {
            d0b d0bVarC0 = kzaVar.C0();
            d0bVarC0.getClass();
            uq7Var.i = X0(d0bVarC0, o74VarE);
        }
        uq7Var.j = V0(feg.S(kzaVar, bu3Var), o74VarE);
        List<Integer> listE0 = kzaVar.E0();
        listE0.getClass();
        for (Integer num : listE0) {
            num.getClass();
            uq7Var.k.add(H0(num.intValue(), o74VarE));
        }
        List<oya> listI0 = kzaVar.i0();
        listI0.getClass();
        for (oya oyaVar : listI0) {
            uq7Var.l.put(u99Var.getString(oyaVar.o()), oyaVar.n().o());
        }
        Iterator it3 = ((List) o74VarE.h).iterator();
        while (it3.hasNext()) {
            ((tk7) ((wu8) it3.next())).getClass();
            bl7 bl7VarD = cn1.D(uq7Var);
            List<kya> listG0 = kzaVar.g0();
            listG0.getClass();
            for (kya kyaVar : listG0) {
                kyaVar.getClass();
                uq7Var.m.add(n16.S(kyaVar, u99Var));
            }
            List<kya> listQ0 = kzaVar.q0();
            listQ0.getClass();
            ArrayList arrayList2 = uq7Var.c.b;
            for (kya kyaVar2 : listQ0) {
                kyaVar2.getClass();
                arrayList2.add(n16.S(kyaVar2, u99Var));
            }
            vq7 vq7Var = uq7Var.d;
            if (vq7Var != null) {
                List<kya> listZ0 = kzaVar.z0();
                listZ0.getClass();
                ArrayList arrayList3 = vq7Var.b;
                for (kya kyaVar3 : listZ0) {
                    kyaVar3.getClass();
                    arrayList3.add(n16.S(kyaVar3, u99Var));
                }
            }
            List<kya> listO0 = kzaVar.o0();
            listO0.getClass();
            for (kya kyaVar4 : listO0) {
                kyaVar4.getClass();
                uq7Var.g.add(n16.S(kyaVar4, u99Var));
            }
            List<kya> listH0 = kzaVar.h0();
            listH0.getClass();
            for (kya kyaVar5 : listH0) {
                kyaVar5.getClass();
                uq7Var.n.add(n16.S(kyaVar5, u99Var));
            }
            List<kya> listN0 = kzaVar.n0();
            listN0.getClass();
            for (kya kyaVar6 : listN0) {
                kyaVar6.getClass();
                uq7Var.o.add(n16.S(kyaVar6, u99Var));
            }
            o85 o85Var = sl7.a;
            rk7 rk7VarB = sl7.b(kzaVar, u99Var, bu3Var, true);
            s56 s56Var = rl7.d;
            s56Var.getClass();
            ll7 ll7Var = (ll7) vpf.F(kzaVar, s56Var);
            jl7 jl7VarS = (ll7Var == null || !ll7Var.x()) ? null : ll7Var.s();
            jl7 jl7VarT = (ll7Var == null || !ll7Var.z()) ? null : ll7Var.t();
            Object objM = kzaVar.m(rl7.e);
            objM.getClass();
            bl7VarD.a = ((Number) objM).intValue();
            bl7VarD.b = rk7VarB != null ? new ik7(rk7VarB.G0, rk7VarB.H0) : null;
            bl7VarD.c = jl7VarS != null ? new vk7(u99Var.getString(jl7VarS.o()), u99Var.getString(jl7VarS.n())) : null;
            bl7VarD.d = jl7VarT != null ? new vk7(u99Var.getString(jl7VarT.o()), u99Var.getString(jl7VarT.n())) : null;
            jl7 jl7VarU = (ll7Var == null || !ll7Var.A()) ? null : ll7Var.u();
            bl7VarD.e = jl7VarU != null ? new vk7(u99Var.getString(jl7VarU.o()), u99Var.getString(jl7VarU.n())) : null;
            jl7 jl7VarQ = (ll7Var == null || !ll7Var.v()) ? null : ll7Var.q();
            bl7VarD.f = jl7VarQ != null ? new vk7(u99Var.getString(jl7VarQ.o()), u99Var.getString(jl7VarQ.n())) : null;
        }
        return uq7Var;
    }

    public static x8f V(d7f d7fVar) {
        d7fVar.getClass();
        if (d7fVar instanceof i8f) {
            dsf dsfVarA = ((i8f) d7fVar).a();
            dsfVarA.getClass();
            return m7c.b(dsfVarA);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(d7fVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, d7fVar.getClass(), sb));
        return null;
    }

    public static final wq7 V0(vza vzaVar, o74 o74Var) {
        bzd kq7Var;
        br7 br7Var;
        bu3 bu3Var = (bu3) o74Var.c;
        u99 u99Var = (u99) o74Var.b;
        wq7 wq7Var = new wq7((vzaVar.X() ? 1 : 0) + (vzaVar.T() << 1));
        rq7 rq7Var = null;
        if (vzaVar.f0()) {
            kq7Var = new iq7(n16.D(u99Var, vzaVar.S()));
        } else if (vzaVar.n0()) {
            kq7Var = new jq7(n16.D(u99Var, vzaVar.a0()));
        } else if (vzaVar.o0()) {
            kq7Var = new kq7(vzaVar.b0());
        } else {
            if (!vzaVar.p0()) {
                throw new e17("No classifier (class, type alias or type parameter) recorded for Type", null);
            }
            Integer numA = o74Var.a(vzaVar.c0());
            if (numA == null) {
                throw new e17("No type parameter id for ".concat(u99Var.getString(vzaVar.c0())), null);
            }
            kq7Var = new kq7(numA.intValue());
        }
        wq7Var.b = kq7Var;
        for (tza tzaVar : vzaVar.R()) {
            sza szaVarO = tzaVar.o();
            if (szaVarO == null) {
                qc0.j("Required value was null.");
                return null;
            }
            int iOrdinal = szaVarO.ordinal();
            if (iOrdinal == 0) {
                br7Var = br7.b;
            } else if (iOrdinal == 1) {
                br7Var = br7.c;
            } else if (iOrdinal == 2) {
                br7Var = br7.a;
            } else {
                if (iOrdinal != 3) {
                    ap.c();
                    return null;
                }
                br7Var = null;
            }
            ArrayList arrayList = wq7Var.c;
            if (br7Var != null) {
                vza vzaVarX = feg.X(tzaVar, bu3Var);
                if (vzaVarX == null) {
                    throw new e17("No type argument for non-STAR projection in Type", null);
                }
                arrayList.add(new zq7(br7Var, V0(vzaVarX, o74Var)));
            } else {
                arrayList.add(zq7.c);
            }
        }
        vza vzaVarP = feg.p(vzaVar, bu3Var);
        wq7Var.d = vzaVarP != null ? V0(vzaVarP, o74Var) : null;
        vza vzaVarM = feg.M(vzaVar, bu3Var);
        wq7Var.e = vzaVarM != null ? V0(vzaVarM, o74Var) : null;
        vza vzaVarG = feg.G(vzaVar, bu3Var);
        if (vzaVarG != null) {
            wq7 wq7VarV0 = V0(vzaVarG, o74Var);
            String string = vzaVar.h0() ? u99Var.getString(vzaVar.U()) : null;
            rq7 rq7Var2 = new rq7();
            rq7Var2.a = wq7VarV0;
            rq7Var2.b = string;
            rq7Var = rq7Var2;
        }
        wq7Var.f = rq7Var;
        Iterator it = ((List) o74Var.h).iterator();
        while (it.hasNext()) {
            ((tk7) ((wu8) it.next())).getClass();
            qq7 qq7Var = yl7.c;
            qq7Var.getClass();
            yl7 yl7Var = (yl7) y7h.N(wq7Var.g, qq7Var);
            Object objM = vzaVar.m(rl7.f);
            objM.getClass();
            yl7Var.a = ((Boolean) objM).booleanValue();
            for (kya kyaVar : vzaVar.P()) {
                ArrayList arrayList2 = yl7Var.b;
                kyaVar.getClass();
                arrayList2.add(n16.S(kyaVar, u99Var));
            }
        }
        return wq7Var;
    }

    public static x8f W(e8f e8fVar) {
        if (e8fVar instanceof c8f) {
            dsf dsfVarX = ((c8f) e8fVar).x();
            dsfVarX.getClass();
            return m7c.b(dsfVarX);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8fVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, e8fVar.getClass(), sb));
        return null;
    }

    public static final yq7 W0(a0b a0bVar, o74 o74Var) {
        br7 br7Var;
        u99 u99Var = (u99) o74Var.b;
        zza zzaVarM = a0bVar.M();
        if (zzaVarM == null) {
            qc0.j("Required value was null.");
            return null;
        }
        int iOrdinal = zzaVarM.ordinal();
        if (iOrdinal == 0) {
            br7Var = br7.b;
        } else if (iOrdinal == 1) {
            br7Var = br7.c;
        } else {
            if (iOrdinal != 2) {
                ap.c();
                return null;
            }
            br7Var = br7.a;
        }
        boolean zJ = a0bVar.J();
        yq7 yq7Var = new yq7(zJ ? 1 : 0, u99Var.getString(a0bVar.I()), a0bVar.H(), br7Var);
        Iterator it = feg.a0(a0bVar, (bu3) o74Var.c).iterator();
        while (it.hasNext()) {
            yq7Var.e.add(V0((vza) it.next(), o74Var));
        }
        Iterator it2 = ((List) o74Var.h).iterator();
        while (it2.hasNext()) {
            ((tk7) ((wu8) it2.next())).getClass();
            qq7 qq7Var = zl7.b;
            qq7Var.getClass();
            zl7 zl7Var = (zl7) y7h.N(yq7Var.f, qq7Var);
            for (kya kyaVar : a0bVar.G()) {
                ArrayList arrayList = zl7Var.a;
                kyaVar.getClass();
                arrayList.add(n16.S(kyaVar, u99Var));
            }
        }
        return yq7Var;
    }

    public static boolean X(tt7 tt7Var, dx5 dx5Var) {
        return tt7Var.getAnnotations().E(dx5Var);
    }

    public static final ar7 X0(d0b d0bVar, o74 o74Var) {
        int iH = d0bVar.H();
        int I = d0bVar.I();
        u99 u99Var = (u99) o74Var.b;
        ar7 ar7Var = new ar7(iH, u99Var.getString(I));
        bu3 bu3Var = (bu3) o74Var.c;
        ar7Var.c = V0(feg.Y(d0bVar, bu3Var), o74Var);
        vza vzaVarB0 = feg.b0(d0bVar, bu3Var);
        ar7Var.d = vzaVarB0 != null ? V0(vzaVarB0, o74Var) : null;
        if (d0bVar.N()) {
            hya hyaVarG = d0bVar.G();
            hyaVarG.getClass();
            n16.T(hyaVarG, u99Var);
        }
        Iterator it = ((List) o74Var.h).iterator();
        while (it.hasNext()) {
            ((tk7) ((wu8) it.next())).getClass();
            List<kya> listF = d0bVar.F();
            listF.getClass();
            for (kya kyaVar : listF) {
                kyaVar.getClass();
                ar7Var.e.add(n16.S(kyaVar, u99Var));
            }
        }
        return ar7Var;
    }

    public static boolean Y(e8f e8fVar, k7f k7fVar) {
        if (!(e8fVar instanceof c8f)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(e8fVar);
            sb.append(", ");
            qc0.o(tec.j(job.a, e8fVar.getClass(), sb));
            return false;
        }
        c8f c8fVar = (c8f) e8fVar;
        if (k7fVar == null ? true : k7fVar instanceof j7f) {
            return o7c.t(c8fVar, (j7f) k7fVar, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(c8fVar);
        sb2.append(", ");
        qc0.o(tec.j(job.a, c8fVar.getClass(), sb2));
        return false;
    }

    public static final long Y0(long j2) {
        return (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static final boolean Z(UserPopupEvent userPopupEvent) {
        if (!userPopupEvent.getPopup().getCanClose()) {
            return false;
        }
        PopupTracking tracking = userPopupEvent.getPopup().getTracking();
        if (rfc.m(tracking != null ? tracking.getView() : null, "popup_view", bm8.G(new iy9("popup", "weekend_free_credit"))) == null) {
            return false;
        }
        PopupTracking tracking2 = userPopupEvent.getPopup().getTracking();
        return rfc.r(tracking2 != null ? tracking2.getClose() : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r15 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Z0(defpackage.mbe r12, defpackage.qne r13, defpackage.hia r14, defpackage.pt0 r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db6.Z0(mbe, qne, hia, pt0):java.lang.Object");
    }

    public static final void a(fd4 fd4Var, boolean z, x16 x16Var, l46 l46Var, int i2) {
        fd4Var.getClass();
        x16Var.getClass();
        l46Var.h0(577486982);
        int i3 = i2 | (l46Var.i(fd4Var) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            gd4 gd4Var = fd4Var.a;
            String str = gd4Var.g;
            if (str == null) {
                str = "";
            }
            String str2 = gd4Var.d;
            float f2 = zF ? 24.0f : 20.0f;
            xn5 xn5Var = (xn5) l46Var.k(zg2.i);
            Boolean bool = (Boolean) l46Var.k(h57.a);
            boolean zBooleanValue = bool.booleanValue();
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = q1c.f(bool);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = q1c.f(bool);
                l46Var.p0(objR2);
            }
            e89 e89Var2 = (e89) objR2;
            boolean zH = l46Var.h(zBooleanValue) | l46Var.i(xn5Var);
            Object objR3 = l46Var.R();
            if (zH || objR3 == obj) {
                objR3 = new lg(zBooleanValue, xn5Var, e89Var, e89Var2, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, wef.a);
            j09 j09VarB0 = ynb.b0(f2, 0.0f, mh3.d0(b.c, mh3.T(l46Var), false, 14), 2);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            o5c.f(l46Var, b.d(g09Var, 24.0f));
            jx0 jx0Var = ndb.E0;
            e92 e92Var = e92.a;
            jgb.e(str2, ((Boolean) e89Var.getValue()).booleanValue(), e92Var.b(g09Var, jx0Var), l46Var, 0);
            o5c.f(l46Var, b.d(g09Var, 12.0f));
            jgb.d(384, af1.b0(1492536578, new o8(str, 3), l46Var), l46Var, null, ((Boolean) e89Var2.getValue()).booleanValue());
            m93.b(e92Var, ((Boolean) e89Var2.getValue()).booleanValue() && z, e92Var.b(g09Var, ndb.Z), null, null, null, af1.b0(178478036, new n(i4, x16Var), l46Var), l46Var, 1572870, 28);
            tec.u(g09Var, 24.0f, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kg(fd4Var, z, x16Var, i2, 0);
        }
    }

    public static boolean a0(w4c w4cVar, w4c w4cVar2) {
        w4cVar.getClass();
        w4cVar2.getClass();
        if (!(w4cVar instanceof tjd)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(w4cVar);
            sb.append(", ");
            qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
            return false;
        }
        if (w4cVar2 instanceof tjd) {
            return ((tjd) w4cVar).Z() == ((tjd) w4cVar2).Z();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(w4cVar2);
        sb2.append(", ");
        qc0.o(tec.j(job.a, w4cVar2.getClass(), sb2));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
    
        if (r15 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a1(defpackage.mbe r11, defpackage.qne r12, defpackage.hia r13, int r14, defpackage.pt0 r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db6.a1(mbe, qne, hia, int, pt0):java.lang.Object");
    }

    public static final void b(int i2, l46 l46Var, j09 j09Var, boolean z) {
        j09 j09Var2;
        l46Var.h0(1275950027);
        int i3 = (l46Var.h(z) ? 4 : 2) | i2 | 48;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            String strQ = afc.q(z ? R.string.daily_fortune_draw_tomorrow_title : R.string.daily_fortune_draw_today_title, l46Var);
            j09Var2 = g09.a;
            j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.b0(24.0f, 0.0f, b.c(j09Var2, 1.0f), 2), "daily_fortune_draw_title");
            mue mueVar = pue.a;
            vd0.e(strQ, j09VarA, mue.a(pue.p(l46Var), ((e8b) l46Var.k(l8b.a)).r, 0L, ar5.e, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 3, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), pue.p(l46Var).a.b, w6c.k(0.5d)), l46Var, 1572864, 440);
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new e33(i2, i4, j09Var2, z);
        }
    }

    public static do7 b0(yn7 yn7Var) {
        yn7Var.getClass();
        return new do7(yn7Var, io7.a);
    }

    public static final void b1(String str, n26 n26Var, a26 a26Var) {
        n26Var.m(p05.a, m1f.a, new xa6(0, a26Var, str));
    }

    public static final void c(String str, boolean z, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        str.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-872498857);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            i33 i33Var = (i33) z5c.G(job.a.b(i33.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            boolean zI = l46Var.i(i33Var) | ((i3 & 14) == 4);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new f33(i33Var, str, null);
                l46Var.p0(objR);
            }
            d(z, (a26) objR, a26Var, x16Var, l46Var, ((i3 >> 3) & 14) | (i3 & 896) | (i3 & 7168));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(str, z, a26Var, x16Var, i2);
        }
    }

    public static boolean c0(k7f k7fVar) {
        if (k7fVar instanceof j7f) {
            return xr7.I((j7f) k7fVar, syd.a);
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return false;
    }

    public static ve9 c1(fp1 fp1Var) {
        if (fp1Var instanceof ue9) {
            return ((ue9) fp1Var).c;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fp1Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, fp1Var.getClass(), sb));
        return null;
    }

    public static final void d(boolean z, a26 a26Var, a26 a26Var2, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        l46 l46Var2;
        a26Var.getClass();
        a26Var2.getClass();
        x16Var.getClass();
        l46Var.h0(1811389639);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var.h(z) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | (l46Var.g(a26Var) ? 32 : 16) | (l46Var.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            xdc.a(b.c, af1.b0(-1768625269, new m(17, x16Var), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(-576130602, new sg(a26Var, a26Var2, z, 3), l46Var), l46Var, 805306422, 508);
            l46Var2 = l46Var;
            vd0.r(6, l46Var2, true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(z, a26Var, a26Var2, x16Var, i2);
        }
    }

    public static boolean d0(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof j7f) {
            return ((j7f) k7fVar).m() instanceof u09;
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return false;
    }

    public static j7f d1(w4c w4cVar) {
        w4cVar.getClass();
        if (w4cVar instanceof tjd) {
            return ((tjd) w4cVar).c0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(w4cVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
        return null;
    }

    public static final void e(u06 u06Var, String str, boolean z, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        x16 x16Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1427476329);
        int i4 = i2 & 6;
        v7c v7cVar = v7c.a;
        if (i4 == 0) {
            i3 = (l46Var2.g(v7cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.e(u06Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            x16Var2 = x16Var;
            i3 |= l46Var2.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            x16Var2 = x16Var;
        }
        int i5 = i3;
        int i6 = 0;
        if (l46Var2.W(i5 & 1, (i5 & 9363) != 9362)) {
            g09 g09Var = g09.a;
            j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.b0(0.0f, 4.0f, androidx.compose.foundation.b.c(oa7.E(pa7.p(b.f(80.0f, 0.0f, v7cVar.a(g09Var, 1.0f, true), 2), z ? 1.0f : 0.38f), a7c.b(12.0f)), z, null, new i5c(0), x16Var2, 10), 1), "friend_coupon_share_" + u06Var.b());
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i6)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarL = b.l(g09Var, 56.0f);
            y6c y6cVar = a7c.a;
            j09 j09VarE = oa7.E(j09VarL, y6cVar);
            pr4 pr4Var = l8b.a;
            long j2 = ((e8b) l46Var2.k(pr4Var)).c;
            long j3 = ((e8b) l46Var2.k(pr4Var)).a;
            if (!we6.e(l46Var2)) {
                j2 = j3;
            }
            j09 j09VarO = tm7.o(j09VarE, j2, g21.f);
            q11 q11VarB = x57.b(((e8b) l46Var2.k(pr4Var)).A, 0.5f);
            j09 j09VarX = x(j09VarO, q11VarB.a, q11VarB.b, y6cVar);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarX);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            f(u06Var, l46Var2, (i5 >> 3) & 14);
            l46Var2.r(true);
            mue mueVar = pue.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 2, 0, null, pue.g(l46Var2), l46Var, (i5 >> 6) & 14, 24576, 113658);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60((Object) u06Var, str, z, (Object) x16Var, i2, 6);
        }
    }

    public static boolean e0(k7f k7fVar) {
        if (k7fVar instanceof j7f) {
            y22 y22VarM = ((j7f) k7fVar).m();
            u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
            return (u09Var == null || u09Var.i() != e09.b || u09Var.E() == l22.ENUM_CLASS || u09Var.E() == l22.ENUM_ENTRY || u09Var.E() == l22.ANNOTATION_CLASS) ? false : true;
        }
        qc0.o(tec.j(job.a, k7fVar.getClass(), ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ")));
        return false;
    }

    public static tjd e1(dj5 dj5Var) {
        if (dj5Var instanceof bj5) {
            return ((bj5) dj5Var).c;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dj5Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, dj5Var.getClass(), sb));
        return null;
    }

    public static final void f(u06 u06Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(1153655329);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.e(u06Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            int iOrdinal = u06Var.ordinal();
            g09 g09Var = g09.a;
            if (iOrdinal == 0) {
                l46Var.f0(217742777);
                j09 j09VarL = b.l(g09Var, 22.0f);
                gx6 gx6VarB = nk8.h;
                if (gx6VarB == null) {
                    fx6 fx6Var = new fx6("Outlined.ContentCopy", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i5 = msf.a;
                    dtd dtdVar = new dtd(y72.b);
                    s71 s71Var = new s71(1);
                    s71Var.p(16.0f, 1.0f);
                    s71Var.n(4.0f, 1.0f);
                    s71Var.j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    s71Var.t(14.0f);
                    s71Var.m(2.0f);
                    s71Var.n(4.0f, 3.0f);
                    s71Var.m(12.0f);
                    s71Var.n(16.0f, 1.0f);
                    s71Var.h();
                    s71Var.p(19.0f, 5.0f);
                    s71Var.n(8.0f, 5.0f);
                    s71Var.j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    s71Var.t(14.0f);
                    s71Var.j(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    s71Var.m(11.0f);
                    s71Var.j(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    s71Var.n(21.0f, 7.0f);
                    s71Var.j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    s71Var.h();
                    s71Var.p(19.0f, 21.0f);
                    s71Var.n(8.0f, 21.0f);
                    s71Var.n(8.0f, 7.0f);
                    s71Var.m(11.0f);
                    s71Var.t(14.0f);
                    s71Var.h();
                    fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                    gx6VarB = fx6Var.b();
                    nk8.h = gx6VarB;
                }
                gu6.a(gx6VarB, null, j09VarL, ((e8b) l46Var.k(l8b.a)).s, l46Var, 432, 0);
                l46Var.r(false);
            } else if (iOrdinal == 1) {
                l46Var.f0(561219873);
                g(od4.A(R.drawable.ic_wechat, 0, l46Var), l46Var, 8);
                l46Var.r(false);
            } else if (iOrdinal == 2) {
                l46Var.f0(561224457);
                g(od4.A(R.drawable.ic_wechat_moments, 0, l46Var), l46Var, 8);
                l46Var.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw tec.d(561211987, l46Var, false);
                }
                l46Var.f0(218233724);
                gu6.a(z7f.F(), null, b.l(g09Var, 22.0f), ((e8b) l46Var.k(l8b.a)).s, l46Var, 432, 0);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new st5(u06Var, i2, i4);
        }
    }

    public static boolean f0(k7f k7fVar) {
        if (k7fVar instanceof j7f) {
            return ((j7f) k7fVar).t();
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return false;
    }

    public static void f1(String str, String str2) {
        if (L0(2)) {
            Log.v(str, str2);
        }
    }

    public static final void g(fy9 fy9Var, l46 l46Var, int i2) {
        fy9 fy9Var2;
        l46 l46Var2;
        l46Var.h0(1937349032);
        int i3 = (l46Var.i(fy9Var) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            fy9Var2 = fy9Var;
            l46Var2 = l46Var;
            feg.j(fy9Var2, null, b.l(g09.a, 24.0f), null, null, 0.0f, null, l46Var2, 440 | (i3 & 14), 120);
        } else {
            fy9Var2 = fy9Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new j16(fy9Var2, i2);
        }
    }

    public static boolean g0(xt7 xt7Var) {
        xt7Var.getClass();
        if (xt7Var instanceof tt7) {
            return i7h.x((tt7) xt7Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return false;
    }

    public static final void g1(mq7 mq7Var, List list, List list2, List list3, o74 o74Var) {
        ArrayList arrayListB = mq7Var.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListB.add(S0((dza) it.next(), o74Var));
        }
        ArrayList arrayListA = mq7Var.a();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA.add(U0((kza) it2.next(), o74Var));
        }
        ArrayList arrayListC = mq7Var.c();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            xza xzaVar = (xza) it3.next();
            xq7 xq7Var = new xq7(xzaVar.O(), ((u99) o74Var.b).getString(xzaVar.P()));
            List listQ = xzaVar.Q();
            listQ.getClass();
            o74 o74VarE = o74Var.e(listQ);
            u99 u99Var = (u99) o74VarE.b;
            bu3 bu3Var = (bu3) o74VarE.c;
            List<a0b> listQ2 = xzaVar.Q();
            listQ2.getClass();
            for (a0b a0bVar : listQ2) {
                a0bVar.getClass();
                xq7Var.b.add(W0(a0bVar, o74VarE));
            }
            V0(feg.Z(xzaVar, bu3Var), o74VarE);
            V0(feg.E(xzaVar, bu3Var), o74VarE);
            List<kya> listK = xzaVar.K();
            listK.getClass();
            for (kya kyaVar : listK) {
                kyaVar.getClass();
                xq7Var.c.add(n16.S(kyaVar, u99Var));
            }
            List<Integer> listT = xzaVar.T();
            listT.getClass();
            for (Integer num : listT) {
                num.getClass();
                xq7Var.d.add(H0(num.intValue(), o74VarE));
            }
            List<oya> listL = xzaVar.L();
            listL.getClass();
            for (oya oyaVar : listL) {
                xq7Var.e.put(u99Var.getString(oyaVar.o()), oyaVar.n().o());
            }
            Iterator it4 = ((List) o74VarE.h).iterator();
            while (it4.hasNext()) {
                ((wu8) it4.next()).getClass();
            }
            arrayListC.add(xq7Var);
        }
    }

    public static final void h(int i2, x16 x16Var, a26 a26Var, l46 l46Var, j09 j09Var, List list, boolean z) {
        j09 j09Var2;
        list.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-1205433848);
        int i3 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | 24576;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            ted tedVarF = zz8.f(6, 2, null, l46Var);
            y6c y6cVarD = a7c.d(24.0f, 24.0f, 0.0f, 12);
            pr4 pr4Var = l8b.a;
            g09 g09Var = g09.a;
            zz8.a(x16Var, g09Var, tedVarF, 0.0f, z, y6cVarD, ((e8b) l46Var.k(pr4Var)).a, 0L, ((e8b) l46Var.k(pr4Var)).o, null, null, new a09(z, z), af1.b0(377106406, new ck(list, z, a26Var, x16Var), l46Var), l46Var, ((i3 >> 9) & 126) | ((i3 << 9) & 57344), 3072, 3464);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i16(list, z, a26Var, x16Var, j09Var2, i2, 0);
        }
    }

    public static final boolean h0(PopupAction popupAction) {
        String url;
        popupAction.getClass();
        return popupAction.getType() == PopupActionType.CONTINUE && (url = popupAction.getUrl()) != null && qka.e(url) && rfc.s(popupAction.getTracking()) != null;
    }

    public static void h1(String str, String str2) {
        if (L0(5)) {
            b1.l(str, str2);
        }
    }

    public static final void i(int i2, x16 x16Var, a26 a26Var, l46 l46Var, j09 j09Var, List list, boolean z) {
        j09 j09Var2;
        g09 g09Var;
        float f2;
        float f3;
        float f4;
        l46 l46Var2;
        b16 b16Var;
        boolean z2;
        b16 b16Var2;
        char c2;
        String str;
        l46 l46Var3 = l46Var;
        list.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var3.h0(1301396723);
        int i3 = i2 | (l46Var3.g(list) ? 4 : 2) | (l46Var3.h(z) ? 32 : 16) | (l46Var3.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var3.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | 24576;
        int i4 = 0;
        if (l46Var3.W(i3 & 1, (i3 & 9363) != 9362)) {
            String strQ = afc.q(R.string.friend_coupon_share_sheet_title, l46Var3);
            String strQ2 = afc.q(R.string.friend_coupon_share_copy, l46Var3);
            b16 b16Var3 = new b16(strQ, strQ2, afc.q(R.string.friend_coupon_share_wechat, l46Var3), afc.q(R.string.friend_coupon_share_moments, l46Var3), afc.q(R.string.friend_coupon_share_system, l46Var3), afc.q(R.string.friend_coupon_share_cancel, l46Var3));
            boolean zEquals = list.equals(t72.I(u06.CopyLink, u06.System));
            g09 g09Var2 = g09.a;
            j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.b0(0.0f, 24.0f, mh3.N(b.c(g09Var2, 1.0f)), 1), "friend_coupon_share_sheet");
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i4)), ndb.Z, l46Var3, 54);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarA);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z3 = l46Var3.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var3, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var3, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var3, numValueOf);
            dec.k(l46Var3);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var3, j09VarJ);
            mue mueVar = pue.a;
            b16 b16Var4 = b16Var3;
            int i5 = 256;
            nte.b(strQ, ynb.b0(16.0f, 0.0f, g09Var2, 2), ((e8b) l46Var3.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var3), l46Var, 48, 0, 130040);
            l46 l46Var4 = l46Var;
            i8c i8cVar = sf2.a;
            if (zEquals) {
                l46Var4.f0(-105802411);
                List listH = t72.H(gbd.e);
                int i6 = i3 & 896;
                boolean z4 = i6 == 256;
                Object objR = l46Var4.R();
                if (z4 || objR == i8cVar) {
                    objR = new zh1(a26Var, 16);
                    l46Var4.p0(objR);
                }
                x16 x16Var2 = (x16) objR;
                boolean z5 = i6 == 256;
                Object objR2 = l46Var4.R();
                if (z5 || objR2 == i8cVar) {
                    objR2 = new hy0(a26Var, 9);
                    l46Var4.p0(objR2);
                }
                d8c.l(strQ2, listH, z, x16Var2, (a26) objR2, null, l46Var4, ((i3 << 3) & 896) | 48);
                l46Var4.r(false);
                l46Var2 = l46Var4;
                b16Var = b16Var4;
                g09Var = g09Var2;
                z2 = true;
                f2 = 1.0f;
                f3 = 0.0f;
                f4 = 16.0f;
            } else {
                l46Var4.f0(-105490427);
                g09Var = g09Var2;
                f2 = 1.0f;
                f3 = 0.0f;
                f4 = 16.0f;
                j09 j09VarB0 = ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                int i7 = 6;
                t7c t7cVarA = s7c.a(xc0.f, ndb.y, l46Var4, 6);
                int iHashCode2 = Long.hashCode(l46Var4.T);
                u8a u8aVarM2 = l46Var4.m();
                j09 j09VarJ2 = m93.J(l46Var4, j09VarB0);
                l46Var4.j0();
                if (l46Var4.S) {
                    l46Var4.l(ov7Var);
                } else {
                    l46Var4.s0();
                }
                dec.l(he2Var, l46Var4, t7cVarA);
                dec.l(he2Var2, l46Var4, u8aVarM2);
                ib8.s(iHashCode2, l46Var4, he2Var3, l46Var4);
                Iterator itS = kv2.s(l46Var4, j09VarJ2, he2Var4, 1180044616, list);
                while (itS.hasNext()) {
                    u06 u06Var = (u06) itS.next();
                    u06Var.getClass();
                    int iOrdinal = u06Var.ordinal();
                    if (iOrdinal == 0) {
                        b16Var2 = b16Var4;
                        c2 = 3;
                        str = b16Var2.b;
                    } else if (iOrdinal == 1) {
                        b16Var2 = b16Var4;
                        c2 = 3;
                        str = b16Var2.c;
                    } else if (iOrdinal != 2) {
                        c2 = 3;
                        if (iOrdinal != 3) {
                            ap.c();
                            return;
                        } else {
                            b16Var2 = b16Var4;
                            str = b16Var2.e;
                        }
                    } else {
                        b16Var2 = b16Var4;
                        c2 = 3;
                        str = b16Var2.d;
                    }
                    boolean zE = l46Var4.e(u06Var.ordinal()) | ((i3 & 896) == i5);
                    Object objR3 = l46Var4.R();
                    if (zE || objR3 == i8cVar) {
                        objR3 = new jt3(25, a26Var, u06Var);
                        l46Var4.p0(objR3);
                    }
                    l46 l46Var5 = l46Var4;
                    e(u06Var, str, z, (x16) objR3, l46Var5, i7 | ((i3 << 6) & 7168));
                    b16Var4 = b16Var2;
                    l46Var4 = l46Var5;
                    i7 = i7;
                    i5 = 256;
                }
                l46Var2 = l46Var4;
                b16Var = b16Var4;
                z2 = true;
                tec.s(l46Var2, false, true, false);
            }
            int i8 = ((i3 >> 9) & 14) | 805306416 | ((i3 << 3) & 896);
            boolean z6 = z2;
            cgg.m(x16Var, androidx.compose.ui.platform.b.a(b.f(48.0f, f3, b.c(ynb.b0(f4, f3, g09Var, 2), f2), 2), "friend_coupon_share_cancel"), z, null, null, null, af1.b0(-1707496672, new g20(13, b16Var), l46Var2), l46Var, i8, 504);
            l46Var3 = l46Var;
            l46Var3.r(z6);
            j09Var2 = g09Var;
        } else {
            l46Var3.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i16(list, z, a26Var, x16Var, j09Var2, i2, 1);
        }
    }

    public static boolean i0(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof j7f) {
            y22 y22VarM = ((j7f) k7fVar).m();
            u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
            return (u09Var != null ? u09Var.n0() : null) instanceof m37;
        }
        qc0.o(tec.j(job.a, k7fVar.getClass(), ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ")));
        return false;
    }

    public static void i1(String str, String str2, Exception exc) {
        if (L0(5)) {
            b1.n(str, str2, exc);
        }
    }

    public static final long j(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static boolean j0(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof j7f) {
            return k7fVar instanceof h77;
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return false;
    }

    public static xt7 j1(x22 x22Var, xt7 xt7Var) {
        if (xt7Var instanceof w4c) {
            return x22Var.g((w4c) xt7Var);
        }
        if (xt7Var instanceof dj5) {
            dj5 dj5Var = (dj5) xt7Var;
            return x22Var.D0(x22Var.g((w4c) x22Var.j(dj5Var)), x22Var.g((w4c) x22Var.h(dj5Var)));
        }
        qc0.p("sealed");
        return null;
    }

    public static final void k(final x16 x16Var, final long j2, final a09 a09Var, final jx jxVar, final dd2 dd2Var, l46 l46Var, final int i2) {
        int i3;
        long j3;
        a09 a09Var2;
        Object obj;
        cv7 cv7Var;
        int i4;
        int i5;
        Object obj2;
        l46Var.h0(766784632);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j2;
            i3 |= l46Var.f(j3) ? 32 : 16;
        } else {
            j3 = j2;
        }
        if ((i2 & 384) == 0) {
            a09Var2 = a09Var;
            i3 |= l46Var.g(a09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            a09Var2 = a09Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? l46Var.g(jxVar) : l46Var.i(jxVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(dd2Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            View view = (View) l46Var.k(uq.f);
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            cv7 cv7Var2 = (cv7) l46Var.k(zg2.n);
            j46 j46VarL = an1.L(l46Var);
            e89 e89VarI = q1c.i(dd2Var, l46Var);
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            Object obj3 = sf2.a;
            if (objR == obj3) {
                Object fk8Var = new fk8(10);
                l46Var.p0(fk8Var);
                obj = fk8Var;
            } else {
                obj = objR;
            }
            UUID uuid = (UUID) vfh.I(objArr, (x16) obj, l46Var, 48);
            Object objR2 = l46Var.R();
            Object obj4 = objR2;
            if (objR2 == obj3) {
                Object objE = af1.E(l46Var);
                l46Var.p0(objE);
                obj4 = objE;
            }
            aw2 aw2Var = (aw2) obj4;
            boolean zG = l46Var.g(view) | l46Var.g(sw3Var);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj3) {
                cv7Var = cv7Var2;
                i4 = 1;
                i5 = 0;
                fz8 fz8Var = new fz8(x16Var, a09Var2, j3, view, cv7Var, sw3Var, uuid, jxVar, aw2Var);
                dd2 dd2Var2 = new dd2(new ee3(e89VarI, i4), true, -1051373467);
                az8 az8Var = fz8Var.w;
                az8Var.setParentCompositionContext(j46VarL);
                az8Var.x.setValue(dd2Var2);
                az8Var.y = true;
                az8Var.d();
                l46Var.p0(fz8Var);
                obj2 = fz8Var;
            } else {
                cv7Var = cv7Var2;
                i4 = 1;
                i5 = 0;
                obj2 = objR3;
            }
            final fz8 fz8Var2 = (fz8) obj2;
            boolean zI = l46Var.i(fz8Var2);
            Object objR4 = l46Var.R();
            Object obj5 = objR4;
            if (zI || objR4 == obj3) {
                Object za6Var = new za6(28, fz8Var2);
                l46Var.p0(za6Var);
                obj5 = za6Var;
            }
            af1.g(fz8Var2, (a26) obj5, l46Var);
            int i6 = i3;
            int i7 = (l46Var.i(fz8Var2) ? 1 : 0) | ((i6 & 14) == 4 ? i4 : i5) | ((i6 & 896) == 256 ? i4 : i5) | ((i6 & 112) == 32 ? i4 : i5) | (l46Var.e(cv7Var.ordinal()) ? 1 : 0);
            Object objR5 = l46Var.R();
            Object obj6 = objR5;
            if (i7 != 0 || objR5 == obj3) {
                final cv7 cv7Var3 = cv7Var;
                Object obj7 = new x16() { // from class: b09
                    @Override // defpackage.x16
                    public final Object invoke() {
                        fz8Var2.f(x16Var, a09Var, j2, cv7Var3);
                        return wef.a;
                    }
                };
                l46Var.p0(obj7);
                obj6 = obj7;
            }
            af1.u((x16) obj6, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: c09
                @Override // defpackage.l26
                public final Object z(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    db6.k(x16Var, j2, a09Var, jxVar, dd2Var, (l46) obj8, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static boolean k0(k7f k7fVar) {
        if (k7fVar instanceof j7f) {
            return k7fVar instanceof ca7;
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return false;
    }

    public static tjd k1(w4c w4cVar, boolean z) {
        w4cVar.getClass();
        if (w4cVar instanceof tjd) {
            return ((tjd) w4cVar).l0(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(w4cVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
        return null;
    }

    public static final void l(use useVar, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1152758106);
        int i3 = (l46Var.g(useVar) ? 4 : 2) | i2 | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var.b0();
            if ((i2 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            l46Var2 = l46Var;
            rs0.f(null, false, af1.b0(-1601893251, new j41(x16Var, useVar, x16Var2, 13), l46Var), l46Var2, 384, 3);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gf9(useVar, x16Var, x16Var2, i2);
        }
    }

    public static boolean l0(xt7 xt7Var) {
        xt7Var.getClass();
        return (xt7Var instanceof tjd) && ((tjd) xt7Var).i0();
    }

    public static void l1(OutputStream outputStream, long j2, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static boolean m(k7f k7fVar, k7f k7fVar2) {
        k7fVar.getClass();
        k7fVar2.getClass();
        if (!(k7fVar instanceof j7f)) {
            StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
            qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
            return false;
        }
        if (k7fVar2 instanceof j7f) {
            return k7fVar.equals(k7fVar2);
        }
        StringBuilder sbO2 = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar2, ", ");
        qc0.o(tec.j(job.a, k7fVar2.getClass(), sbO2));
        return false;
    }

    public static boolean m0(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof j7f) {
            return xr7.I((j7f) k7fVar, syd.b);
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return false;
    }

    public static void m1(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        l1(byteArrayOutputStream, i2, 2);
    }

    public static int n(xt7 xt7Var) {
        xt7Var.getClass();
        if (xt7Var instanceof tt7) {
            return ((tt7) xt7Var).Z().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return 0;
    }

    public static boolean n0(xt7 xt7Var) {
        xt7Var.getClass();
        if (xt7Var instanceof tt7) {
            return w8f.e((tt7) xt7Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return false;
    }

    public static c7f o(w4c w4cVar) {
        w4cVar.getClass();
        if (w4cVar instanceof tjd) {
            return (c7f) w4cVar;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(w4cVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean o0(vjd vjdVar) {
        if (vjdVar instanceof tt7) {
            return xr7.G((tt7) vjdVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(vjdVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, vjdVar.getClass(), sb));
        return false;
    }

    public static fp1 p(x22 x22Var, vjd vjdVar) {
        if (vjdVar instanceof tjd) {
            if (vjdVar instanceof xjd) {
                return x22Var.W(((xjd) vjdVar).b);
            }
            if (vjdVar instanceof ue9) {
                return (ue9) vjdVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(vjdVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, vjdVar.getClass(), sb));
        return null;
    }

    public static boolean p0(fp1 fp1Var) {
        if (fp1Var instanceof ue9) {
            return ((ue9) fp1Var).g;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fp1Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, fp1Var.getClass(), sb));
        return false;
    }

    public static kv3 q(w4c w4cVar) {
        w4cVar.getClass();
        if (w4cVar instanceof tjd) {
            if (w4cVar instanceof kv3) {
                return (kv3) w4cVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(w4cVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
        return null;
    }

    public static boolean q0(xt7 xt7Var) {
        xt7Var.getClass();
        if (xt7Var instanceof tt7) {
            return xt7Var instanceof mdb;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return false;
    }

    public static bj5 r(xt7 xt7Var) {
        xt7Var.getClass();
        if (xt7Var instanceof tt7) {
            jgf jgfVarK0 = ((tt7) xt7Var).k0();
            if (jgfVarK0 instanceof bj5) {
                return (bj5) jgfVarK0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return null;
    }

    public static boolean r0(d7f d7fVar) {
        d7fVar.getClass();
        if (d7fVar instanceof i8f) {
            return ((i8f) d7fVar).c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(d7fVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, d7fVar.getClass(), sb));
        return false;
    }

    public static tjd s(xt7 xt7Var) {
        xt7Var.getClass();
        if (xt7Var instanceof tt7) {
            jgf jgfVarK0 = ((tt7) xt7Var).k0();
            if (jgfVarK0 instanceof tjd) {
                return (tjd) jgfVarK0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return null;
    }

    public static void s0(w4c w4cVar) {
        w4cVar.getClass();
        if (w4cVar instanceof tjd) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(w4cVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
    }

    public static dzd t(xt7 xt7Var) {
        if (xt7Var instanceof tt7) {
            return new dzd((tt7) xt7Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return null;
    }

    public static void t0(w4c w4cVar) {
        if (w4cVar instanceof tjd) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(w4cVar);
        sb.append(", ");
        qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a A[LOOP:0: B:19:0x004b->B:23:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object u(defpackage.mbe r6, defpackage.pt0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ivc
            if (r0 == 0) goto L13
            r0 = r7
            ivc r0 = (defpackage.ivc) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ivc r0 = new ivc
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r6 = r0.L$0
            mbe r6 = (defpackage.mbe) r6
            defpackage.jzb.q(r7)
            goto L42
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L30:
            defpackage.jzb.q(r7)
        L33:
            r0.L$0 = r6
            r0.label = r2
            iia r7 = defpackage.iia.b
            java.lang.Object r7 = r6.a(r7, r0)
            bw2 r1 = defpackage.bw2.a
            if (r7 != r1) goto L42
            return r1
        L42:
            hia r7 = (defpackage.hia) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L4b:
            if (r4 >= r3) goto L5d
            java.lang.Object r5 = r1.get(r4)
            oia r5 = (defpackage.oia) r5
            boolean r5 = defpackage.xo1.k(r5)
            if (r5 != 0) goto L5a
            goto L33
        L5a:
            int r4 = r4 + 1
            goto L4b
        L5d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db6.u(mbe, pt0):java.lang.Object");
    }

    public static tjd u0(dj5 dj5Var) {
        if (dj5Var instanceof bj5) {
            return ((bj5) dj5Var).b;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dj5Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, dj5Var.getClass(), sb));
        return null;
    }

    public static final Object v(tia tiaVar, v39 v39Var, qne qneVar, xn2 xn2Var) {
        obe obeVar = (obe) tiaVar;
        obeVar.getClass();
        Object objS = k99.s(tiaVar, new jvc(new w42(vd0.s0(obeVar).Q0), v39Var, qneVar, null), xn2Var);
        return objS == bw2.a ? objS : wef.a;
    }

    public static jgf v0(fp1 fp1Var) {
        if (fp1Var instanceof ue9) {
            return ((ue9) fp1Var).d;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fp1Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, fp1Var.getClass(), sb));
        return null;
    }

    public static final j09 w(j09 j09Var, float f2, long j2, x4d x4dVar) {
        return x(j09Var, f2, new dtd(j2), x4dVar);
    }

    public static jgf w0(xt7 xt7Var) {
        if (xt7Var instanceof jgf) {
            return o7c.v((jgf) xt7Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(xt7Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
        return null;
    }

    public static final j09 x(j09 j09Var, float f2, b41 b41Var, x4d x4dVar) {
        return j09Var.D(new p11(f2, b41Var, x4dVar));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:20:0x004b, B:31:0x0084, B:33:0x008c, B:35:0x0098, B:37:0x00a4, B:28:0x006b), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:20:0x004b, B:31:0x0084, B:33:0x008c, B:35:0x0098, B:37:0x00a4, B:28:0x006b), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:20:0x004b, B:31:0x0084, B:33:0x008c, B:35:0x0098, B:37:0x00a4, B:28:0x006b), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0107 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0033, B:54:0x00ef, B:56:0x00f7, B:58:0x00fb, B:60:0x0107, B:62:0x0113, B:50:0x00c8), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0113 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0033, B:54:0x00ef, B:56:0x00f7, B:58:0x00fb, B:60:0x0107, B:62:0x0113, B:50:0x00c8), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object x0(mbe mbeVar, v39 v39Var, w42 w42Var, hia hiaVar, pt0 pt0Var) {
        kvc kvcVar;
        wuc wucVar;
        mbe mbeVar2;
        imb imbVar;
        List list;
        int size;
        oia oiaVar;
        List list2;
        int size2;
        oia oiaVar2;
        wuc wucVar2 = gec.c;
        if (pt0Var instanceof kvc) {
            kvcVar = (kvc) pt0Var;
            int i2 = kvcVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kvcVar.label = i2 - Integer.MIN_VALUE;
            } else {
                kvcVar = new kvc(pt0Var);
            }
        } else {
            kvcVar = new kvc(pt0Var);
        }
        Object objK = kvcVar.result;
        int i3 = kvcVar.label;
        int i4 = 0;
        try {
            try {
                if (i3 == 0) {
                    jzb.q(objK);
                    oia oiaVar3 = (oia) hiaVar.a.get(0);
                    int i5 = hiaVar.e & 1;
                    bw2 bw2Var = bw2.a;
                    if (i5 == 0) {
                        int i6 = w42Var.b;
                        if (i6 != 1) {
                            wucVar = i6 != 2 ? gec.f : gec.e;
                        } else {
                            wucVar = wucVar2;
                        }
                        if (v39Var.c(oiaVar3.c, wucVar, i6)) {
                            imb imbVar2 = new imb();
                            imbVar2.element = !wucVar.equals(wucVar2);
                            long j2 = oiaVar3.a;
                            bv9 bv9Var = new bv9(v39Var, wucVar, imbVar2, 9);
                            kvcVar.L$0 = mbeVar;
                            kvcVar.L$1 = v39Var;
                            kvcVar.L$2 = imbVar2;
                            kvcVar.label = 2;
                            objK = rk4.k(mbeVar, j2, bv9Var, kvcVar);
                            if (objK != bw2Var) {
                                mbeVar2 = mbeVar;
                                imbVar = imbVar2;
                                if (((Boolean) objK).booleanValue()) {
                                    list2 = mbeVar2.e.I0.a;
                                    size2 = list2.size();
                                    while (i4 < size2) {
                                        oiaVar2 = (oia) list2.get(i4);
                                        if (xo1.m(oiaVar2)) {
                                            oiaVar2.a();
                                        }
                                        i4++;
                                    }
                                }
                                v39Var.b();
                            }
                            return bw2Var;
                        }
                    } else if (v39Var.e(oiaVar3.c)) {
                        oiaVar3.a();
                        long j3 = oiaVar3.a;
                        ckb ckbVar = new ckb(16, v39Var);
                        kvcVar.L$0 = mbeVar;
                        kvcVar.L$1 = v39Var;
                        kvcVar.label = 1;
                        objK = rk4.k(mbeVar, j3, ckbVar, kvcVar);
                        if (objK == bw2Var) {
                            return bw2Var;
                        }
                        if (((Boolean) objK).booleanValue()) {
                            list = mbeVar.e.I0.a;
                            size = list.size();
                            while (i4 < size) {
                                oiaVar = (oia) list.get(i4);
                                if (xo1.m(oiaVar)) {
                                    oiaVar.a();
                                }
                                i4++;
                            }
                        }
                        v39Var.b();
                    }
                } else if (i3 == 1) {
                    v39Var = (v39) kvcVar.L$1;
                    mbeVar = (mbe) kvcVar.L$0;
                    jzb.q(objK);
                    if (((Boolean) objK).booleanValue()) {
                        list = mbeVar.e.I0.a;
                        size = list.size();
                        while (i4 < size) {
                            oiaVar = (oia) list.get(i4);
                            if (xo1.m(oiaVar)) {
                                oiaVar.a();
                            }
                            i4++;
                        }
                    }
                    v39Var.b();
                } else {
                    if (i3 != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    imbVar = (imb) kvcVar.L$2;
                    v39Var = (v39) kvcVar.L$1;
                    mbeVar2 = (mbe) kvcVar.L$0;
                    jzb.q(objK);
                    if (((Boolean) objK).booleanValue() && imbVar.element) {
                        list2 = mbeVar2.e.I0.a;
                        size2 = list2.size();
                        while (i4 < size2) {
                            oiaVar2 = (oia) list2.get(i4);
                            if (xo1.m(oiaVar2)) {
                                oiaVar2.a();
                            }
                            i4++;
                        }
                    }
                    v39Var.b();
                }
                return wef.a;
            } catch (Throwable th) {
                v39Var.b();
                throw th;
            }
        } catch (Throwable th2) {
            v39Var.b();
            throw th2;
        }
    }

    public static tjd y(w4c w4cVar) {
        List listZ;
        ArrayList arrayList;
        yz3 yz3Var = null;
        if (!(w4cVar instanceof tjd)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(w4cVar);
            sb.append(", ");
            qc0.o(tec.j(job.a, w4cVar.getClass(), sb));
            return null;
        }
        tjd tjdVar = (tjd) w4cVar;
        yt7 yt7Var = yt7.q;
        if (tjdVar.Z().size() == tjdVar.c0().getParameters().size() && ((listZ = tjdVar.Z()) == null || !listZ.isEmpty())) {
            Iterator it = listZ.iterator();
            while (it.hasNext()) {
                dsf dsfVarA = ((i8f) it.next()).a();
                dsf dsfVar = dsf.INVARIANT;
                if (dsfVarA != dsfVar) {
                    List parameters = tjdVar.c0().getParameters();
                    parameters.getClass();
                    ArrayList<iy9> arrayListR1 = s72.r1(listZ, parameters);
                    arrayList = new ArrayList(t72.u(arrayListR1, 10));
                    for (iy9 iy9Var : arrayListR1) {
                        i8f dzdVar = (i8f) iy9Var.a();
                        c8f c8fVar = (c8f) iy9Var.b();
                        if (dzdVar.a() != dsfVar) {
                            jgf jgfVarK0 = (dzdVar.c() || dzdVar.a() != dsf.IN_VARIANCE) ? null : dzdVar.b().k0();
                            c8fVar.getClass();
                            dzdVar = new dzd(new ue9(to1.a, new ve9(dzdVar, yz3Var, c8fVar, 6), jgfVarK0, (e7f) null, false, 56));
                        }
                        arrayList.add(dzdVar);
                    }
                    q8f q8fVar = new q8f(l7f.b.g(tjdVar.c0(), arrayList));
                    int size = listZ.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        i8f i8fVar = (i8f) listZ.get(i2);
                        i8f i8fVar2 = (i8f) arrayList.get(i2);
                        if (i8fVar.a() != dsfVar) {
                            List upperBounds = ((c8f) tjdVar.c0().getParameters().get(i2)).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(yt7Var.v0(q8fVar.f((tt7) it2.next(), dsfVar).k0()));
                            }
                            if (!i8fVar.c() && i8fVar.a() == dsf.OUT_VARIANCE) {
                                arrayList2.add(yt7Var.v0(i8fVar.b().k0()));
                            }
                            tt7 tt7VarB = i8fVar2.b();
                            tt7VarB.getClass();
                            ve9 ve9Var = ((ue9) tt7VarB).c;
                            ve9Var.getClass();
                            ve9Var.b = new yz3(2, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return rxg.T(tjdVar.a0(), tjdVar.c0(), arrayList, tjdVar.i0());
        }
        return null;
    }

    public static final void y0(Context context) {
        context.getClass();
        try {
            Intent intentAddFlags = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").addFlags(268435456);
            intentAddFlags.getClass();
            context.startActivity(intentAddFlags);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static to1 z(fp1 fp1Var) {
        if (fp1Var instanceof ue9) {
            return ((ue9) fp1Var).b;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fp1Var);
        sb.append(", ");
        qc0.o(tec.j(job.a, fp1Var.getClass(), sb));
        return null;
    }

    public static int z0(k7f k7fVar) {
        if (k7fVar instanceof j7f) {
            return ((j7f) k7fVar).getParameters().size();
        }
        StringBuilder sbO = ks0.o("ClassicTypeSystemContext couldn't handle: ", k7fVar, ", ");
        qc0.o(tec.j(job.a, k7fVar.getClass(), sbO));
        return 0;
    }

    public String M() {
        return null;
    }

    public String P() {
        return null;
    }
}
